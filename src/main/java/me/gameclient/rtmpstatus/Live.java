package me.gameclient.rtmpstatus;

import jakarta.xml.bind.annotation.XmlElement;

import java.util.Arrays;

public class Live {
    private Stream[] stream;
    private int nclients;

    @XmlElement(name="stream")
    public Stream[] getStream() {
        return stream;
    }

    public void setStream(Stream[] stream) {
        this.stream = stream;
    }

    @XmlElement(name="nclients")
    public int getNclients() {
        return nclients;
    }

    public void setNclients(int nclients) {
        this.nclients = nclients;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Live{");
        sb.append("stream=").append(Arrays.toString(stream));
        sb.append(", nclients=").append(nclients);
        sb.append('}');
        return sb.toString();
    }
}