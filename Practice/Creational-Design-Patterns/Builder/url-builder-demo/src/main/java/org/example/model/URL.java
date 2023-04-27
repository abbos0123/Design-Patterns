package org.example.model;

/**
 * Author: Abbos Fayziboev
 * Date: 31/03/23
 * Email: abbosFayziboev@gmail.com
 */
public class URL {
    private String protocol;
    private String hostname;
    private String port;
    private String path;
    private String params;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getUrl() {
        StringBuilder sb = new StringBuilder();

        if (protocol != null) sb.append(protocol);
        if (hostname != null) sb.append(hostname);
        if (port != null) sb.append(port);
        if (path != null) sb.append(path);
        if (params != null) sb.append(params);

        return sb.toString();
    }
}
