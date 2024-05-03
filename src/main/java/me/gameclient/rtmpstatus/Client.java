package me.gameclient.rtmpstatus;

import jakarta.xml.bind.annotation.XmlElement;

public class Client {
    private int id;
    private String address;
    private int time;
    private String flashver;
    private String swfurl;
    private int dropped;
    private int avsync;
    private int timestamp;
    private boolean publishing;
    private boolean active;

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlElement(name = "time")
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @XmlElement(name = "flashver")
    public String getFlashver() {
        return flashver;
    }

    public void setFlashver(String flashver) {
        this.flashver = flashver;
    }

    @XmlElement(name = "swfurl")
    public String getSwfurl() {
        return swfurl;
    }

    public void setSwfurl(String swfurl) {
        this.swfurl = swfurl;
    }

    @XmlElement(name = "dropped")
    public int getDropped() {
        return dropped;
    }

    public void setDropped(int dropped) {
        this.dropped = dropped;
    }

    @XmlElement(name = "avsync")
    public int getAvsync() {
        return avsync;
    }

    public void setAvsync(int avsync) {
        this.avsync = avsync;
    }

    @XmlElement(name = "timestamp")
    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
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
        sb.append("Client{");
        sb.append("id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", time=").append(time);
        sb.append(", flashver=").append(flashver);
        sb.append(", swfurl=").append(swfurl);
        sb.append(", dropped=").append(dropped);
        sb.append(", avsync=").append(avsync);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", publishing=").append(publishing);
        sb.append(", active=").append(active);
        sb.append('}');
        return sb.toString();
    }


}