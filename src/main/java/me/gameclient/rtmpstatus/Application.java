package me.gameclient.rtmpstatus;

import jakarta.xml.bind.annotation.XmlElement;

public class Application {
    private String name;
    private Live live;
    private int nclients;

    @XmlElement(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="live")
    public Live getLive() {
        return live;
    }

    public void setLive(Live live) {
        this.live = live;
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
        sb.append("Application{");
        sb.append("name=").append(name);
        sb.append(", live=").append(live);
        sb.append(", nclients=").append(nclients);
        sb.append('}');
        return sb.toString();
    }
}