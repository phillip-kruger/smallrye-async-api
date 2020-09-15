package io.smallrye.asyncapi.api.model;

import java.net.URL;

/**
 * External Documentation for some objects
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#externalDocumentationObject">External Documentation
 *      Object</a>
 */
public interface ExternalDocs {

    public String getDescription();

    public void setDescription(String description);

    public URL getUrl();

    public void setUrl(URL url);
}
