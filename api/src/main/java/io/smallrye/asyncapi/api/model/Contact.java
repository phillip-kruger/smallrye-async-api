package io.smallrye.asyncapi.api.model;

import java.net.URL;

/**
 * Contact information for the exposed API.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#contactObject">Contact Object</a>
 * 
 */
public interface Contact {

    public String getName();

    public void setName(String name);

    public URL getUrl();

    public void setUrl(URL url);

    public String getEmail();

    public void setEmail(String email);
}
