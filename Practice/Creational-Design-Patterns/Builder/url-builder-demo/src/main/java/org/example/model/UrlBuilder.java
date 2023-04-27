package org.example.model;

/**
 * Author: Abbos Fayziboev
 * Date: 31/03/23
 * Email: abbosFayziboev@gmail.com
 */
public class UrlBuilder {
    private URL url;

    public UrlBuilder(){
        url = new URL();
    }
    public URL build(){
        URL response = url;
        url = new URL();
        return response;
    }

    public UrlBuilder protocol(String protocol){
        url.setProtocol(protocol);
        return this;
    }

    public UrlBuilder host(String host){
        url.setHostname(host);
        return this;
    }

    public UrlBuilder port(String port){
        url.setPort(port);
        return this;
    }

    public UrlBuilder path(String path){
        url.setPath(path);
        return this;
    }

    public UrlBuilder params(String params){
        url.setParams(params);
        return this;
    }
}
