package io.smallrye.asyncapi.api.model;

import java.net.URL;

/**
 * License information for the exposed API.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#licenseObject">License Object</a>
 * 
 */
public class License {

    /**
     * Required. The license name used for the API.
     */
    private String name;

    /**
     * A URL to the license used for the API.
     */
    private URL url;

    public License() {
    }

    public License(String name, URL url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "License{" + "name=" + name + ", url=" + url + '}';
    }
}
