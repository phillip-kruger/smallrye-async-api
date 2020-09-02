package io.smallrye.asyncapi.api.model;

/**
 * Allows adding meta data to a single tag.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#tagObject">Tag Object</a>
 */
public class Tag {

    /**
     * Required. The name of the tag.
     */
    private String name;

    /**
     * A short description for the tag. CommonMark syntax can be used for rich text representation.
     */
    private String description;

    /**
     * Additional external documentation for this tag.
     */
    private ExternalDocs externalDocs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalDocs getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocs externalDocs) {
        this.externalDocs = externalDocs;
    }

    @Override
    public String toString() {
        return "Tag{" + "name=" + name + ", description=" + description + ", externalDocs=" + externalDocs + '}';
    }
}
