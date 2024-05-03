package me.gameclient.rtmpstatus;

import jakarta.xml.bind.annotation.XmlElement;

import java.util.Arrays;

public class Stream {
    private String name;
    private int time;
    private int bw_in;
    private int bytes_in;
    private int bw_out;
    private int bytes_out;
    private int bw_audio;
    private int bw_video;
    private Client[] client;
    private Meta meta;
    private int nclients;
    private boolean publishing;
    private boolean active;

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "time")
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @XmlElement(name = "bw_in")
    public int getBw_in() {
        return bw_in;
    }

    public void setBw_in(int bw_in) {
        this.bw_in = bw_in;
    }

    @XmlElement(name = "bytes_in")
    public int getBytes_in() {
        return bytes_in;
    }

    public void setBytes_in(int bytes_in) {
        this.bytes_in = bytes_in;
    }

    @XmlElement(name = "bw_out")
    public int getBw_out() {
        return bw_out;
    }

    public void setBw_out(int bw_out) {
        this.bw_out = bw_out;
    }

    @XmlElement(name = "bytes_out")
    public int getBytes_out() {
        return bytes_out;
    }

    public void setBytes_out(int bytes_out) {
        this.bytes_out = bytes_out;
    }

    @XmlElement(name = "bw_audio")
    public int getBw_audio() {
        return bw_audio;
    }

    public void setBw_audio(int bw_audio) {
        this.bw_audio = bw_audio;
    }

    @XmlElement(name = "bw_video")
    public int getBw_video() {
        return bw_video;
    }

    public void setBw_video(int bw_video) {
        this.bw_video = bw_video;
    }

    @XmlElement(name = "client")
    public Client[] getClient() {
        return client;
    }

    public void setClient(Client[] client) {
        this.client = client;
    }

    @XmlElement(name = "meta")
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @XmlElement(name = "nclients")
    public int getNclients() {
        return nclients;
    }

    public void setNclients(int nclients) {
        this.nclients = nclients;
    }

    @XmlElement(name = "publishing")
    public boolean isPublishing() {
        return publishing;
    }

    public void setPublishing(boolean publishing) {
        this.publishing = publishing;
    }

    @XmlElement(name = "active")
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stream{");
        sb.append("name=").append(name);
        sb.append(", time=").append(time);
        sb.append(", bw_in=").append(bw_in);
        sb.append(", bytes_in=").append(bytes_in);
        sb.append(", bw_out=").append(bw_out);
        sb.append(", bytes_out=").append(bytes_out);
        sb.append(", bw_audio=").append(bw_audio);
        sb.append(", bw_video=").append(bw_video);
        sb.append(", client=").append(Arrays.toString(client));
        sb.append(", meta=").append(meta);
        sb.append(", nclients=").append(nclients);
        sb.append(", publishing=").append(publishing);
        sb.append(", active=").append(active);
        sb.append('}');
        return sb.toString();
    }


}