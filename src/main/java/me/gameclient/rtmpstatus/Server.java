package me.gameclient.rtmpstatus;

import jakarta.xml.bind.annotation.XmlElement;

public class Server {
    private Application application;

    @XmlElement(name="application")
    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Server{");
        sb.append("application=").append(application);
        sb.append('}');
        return sb.toString();
    }


}