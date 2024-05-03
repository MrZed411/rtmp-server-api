package me.gameclient.rtmpstatus;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;


@RestController
public class BitrateController {

    @GetMapping("source")
    public int getSourceBitrate(@RequestParam String sourceIdString) {
        System.out.println("Getting bitrate of " + sourceIdString);
        int sourceBitrate = -1;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://192.168.50.60:8080/stat", String.class);
        if (result == null) return sourceBitrate;
        StringReader stringReader = new StringReader(result);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Rtmp.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            JAXBElement<Rtmp> root = jaxbUnmarshaller.unmarshal(new StreamSource(stringReader), Rtmp.class);
            Rtmp rtmpObject = root.getValue();
            for (Stream test : rtmpObject.getServer().getApplication().getLive().getStream()) {
                if (test.getName().equals(sourceIdString))
                    sourceBitrate = test.getBw_in();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return sourceBitrate;
    }
    
}
