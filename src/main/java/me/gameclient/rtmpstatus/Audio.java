package me.gameclient.rtmpstatus;

import jakarta.xml.bind.annotation.XmlElement;

public class Audio {
    private String codec;
    private String profile;
    private int channels;
    private int sample_rate;

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

    @XmlElement(name = "channels")
    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    @XmlElement(name = "sample_rate")
    public int getSample_rate() {
        return sample_rate;
    }

    public void setSample_rate(int sample_rate) {
        this.sample_rate = sample_rate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Audio{");
        sb.append("codec=").append(codec);
        sb.append(", profile=").append(profile);
        sb.append(", channels=").append(channels);
        sb.append(", sample_rate=").append(sample_rate);
        sb.append('}');
        return sb.toString();
    }
}