package me.gameclient.rtmpstatus;

import jakarta.xml.bind.annotation.XmlElement;

public class Video {
    private int width;
    private int height;
    private int frame_rate;
    private String codec;
    private String profile;
    private int compat;
    private Double level;

    @XmlElement(name = "width")
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @XmlElement(name = "height")
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @XmlElement(name = "frame_rate")
    public int getFrame_rate() {
        return frame_rate;
    }

    public void setFrame_rate(int frame_rate) {
        this.frame_rate = frame_rate;
    }

    @XmlElement(name = "codec")
    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    @XmlElement(name = "profile")
    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @XmlElement(name = "compat")
    public int getCompat() {
        return compat;
    }

    public void setCompat(int compat) {
        this.compat = compat;
    }

    @XmlElement(name = "level")
    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Video{");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", frame_rate=").append(frame_rate);
        sb.append(", codec=").append(codec);
        sb.append(", profile=").append(profile);
        sb.append(", compat=").append(compat);
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }


}