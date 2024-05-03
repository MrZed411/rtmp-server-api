package me.gameclient.rtmpstatus;

import jakarta.xml.bind.annotation.XmlElement;

import java.util.Date;

public class Rtmp {
    private String nginx_version;
    private String nginx_rtmp_version;
    private Date built;
    private int pid;
    private int uptime;
    private int naccepted;
    private int bw_in;
    private int bytes_in;
    private int bw_out;
    private int bytes_out;
    private Server server;

    @XmlElement(name="nginx_version")
    public String getNginx_version() {
        return nginx_version;
    }

    public void setNginx_version(String nginx_version) {
        this.nginx_version = nginx_version;
    }

    @XmlElement(name="nginx_rtmp_version")
    public String getNginx_rtmp_version() {
        return nginx_rtmp_version;
    }

    public void setNginx_rtmp_version(String nginx_rtmp_version) {
        this.nginx_rtmp_version = nginx_rtmp_version;
    }

    @XmlElement(name="built")
    public Date getBuilt() {
        return built;
    }

    public void setBuilt(Date built) {
        this.built = built;
    }

    @XmlElement(name="pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @XmlElement(name="uptime")
    public int getUptime() {
        return uptime;
    }

    public void setUptime(int uptime) {
        this.uptime = uptime;
    }

    @XmlElement(name="naccepted")
    public int getNaccepted() {
        return naccepted;
    }

    public void setNaccepted(int naccepted) {
        this.naccepted = naccepted;
    }

    @XmlElement(name="bw_in")
    public int getBw_in() {
        return bw_in;
    }

    public void setBw_in(int bw_in) {
        this.bw_in = bw_in;
    }

    @XmlElement(name="bytes_in")
    public int getBytes_in() {
        return bytes_in;
    }

    public void setBytes_in(int bytes_in) {
        this.bytes_in = bytes_in;
    }

    @XmlElement(name="bw_out")
    public int getBw_out() {
        return bw_out;
    }


    public void setBw_out(int bw_out) {
        this.bw_out = bw_out;
    }

    @XmlElement(name="bytes_out")
    public int getBytes_out() {
        return bytes_out;
    }

    public void setBytes_out(int bytes_out) {
        this.bytes_out = bytes_out;
    }

    @XmlElement(name="server")
    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rtmp{");
        sb.append("nginx_version=").append(nginx_version);
        sb.append(", nginx_rtmp_version=").append(nginx_rtmp_version);
        sb.append(", built=").append(built);
        sb.append(", pid=").append(pid);
        sb.append(", uptime=").append(uptime);
        sb.append(", naccepted=").append(naccepted);
        sb.append(", bw_in=").append(bw_in);
        sb.append(", bytes_in=").append(bytes_in);
        sb.append(", bw_out=").append(bw_out);
        sb.append(", bytes_out=").append(bytes_out);
        sb.append(", server=").append(server);
        sb.append('}');
        return sb.toString();
    }


}