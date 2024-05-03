package me.gameclient.rtmpstatus;

import jakarta.xml.bind.annotation.XmlElement;

public class Meta {
    private Video video;
    private Audio audio;

    @XmlElement(name = "video")
    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @XmlElement(name = "audio")
    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meta{");
        sb.append("video=").append(video);
        sb.append(", audio=").append(audio);
        sb.append('}');
        return sb.toString();
    }


}