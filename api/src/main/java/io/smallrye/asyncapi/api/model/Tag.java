package io.smallrye.asyncapi.api.model;

/**
 * Allows adding meta data to a single tag.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#tagObject">Tag Object</a>
 */
public interface Tag {

    public String getName();

    public void setName(String name);

    public String getDescription();

    public void setDescription(String description);

    public ExternalDocs getExternalDocs();

    public void setExternalDocs(ExternalDocs externalDocs);
}
