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
public class ExternalDocs {

    /**
     * A short description of the target documentation.
     */
    private String description;

    /**
     * Required. The URL for the target documentation.
     */
    private URL url;

    public ExternalDocs() {
    }

    public ExternalDocs(URL url) {
        this.url = url;
    }

    public ExternalDocs(String description, URL url) {
        this.description = description;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ExternalDocs{" + "description=" + description + ", url=" + url + '}';
    }
}
