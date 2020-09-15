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
public interface License {

    public String getName();

    public void setName(String name);

    public URL getUrl();

    public void setUrl(URL url);
}
