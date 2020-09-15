package io.smallrye.asyncapi.model;

import java.net.URL;

import io.smallrye.asyncapi.api.model.License;

/**
 * License information for the exposed API.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#licenseObject">License Object</a>
 * 
 */
public class LicenseImpl implements License {

    /**
     * Required. The license name used for the API.
     */
    private String name;

    /**
     * A URL to the license used for the API.
     */
    private URL url;

    public LicenseImpl() {
    }

    public LicenseImpl(String name, URL url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public URL getUrl() {
        return url;
    }

    @Override
    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "License{" + "name=" + name + ", url=" + url + '}';
    }
}
