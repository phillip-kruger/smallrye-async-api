package io.smallrye.asyncapi.model;

import java.net.URL;

import io.smallrye.asyncapi.api.model.ExternalDocs;

/**
 * External Documentation for some objects
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#externalDocumentationObject">External Documentation
 *      Object</a>
 */
public class ExternalDocsImpl implements ExternalDocs {

    /**
     * A short description of the target documentation.
     */
    private String description;

    /**
     * Required. The URL for the target documentation.
     */
    private URL url;

    public ExternalDocsImpl() {
    }

    public ExternalDocsImpl(URL url) {
        this.url = url;
    }

    public ExternalDocsImpl(String description, URL url) {
        this.description = description;
        this.url = url;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
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
        return "ExternalDocs{" + "description=" + description + ", url=" + url + '}';
    }
}
