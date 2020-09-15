package io.smallrye.asyncapi.model;

import io.smallrye.asyncapi.api.model.ExternalDocs;
import io.smallrye.asyncapi.api.model.Tag;

/**
 * Allows adding meta data to a single tag.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#tagObject">Tag Object</a>
 */
public class TagImpl implements Tag {

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

    public TagImpl() {
    }

    public TagImpl(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public TagImpl(String name, String description, ExternalDocs externalDocs) {
        this.name = name;
        this.description = description;
        this.externalDocs = externalDocs;
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
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public ExternalDocs getExternalDocs() {
        return externalDocs;
    }

    @Override
    public void setExternalDocs(ExternalDocs externalDocs) {
        this.externalDocs = externalDocs;
    }

    @Override
    public String toString() {
        return "Tag{" + "name=" + name + ", description=" + description + ", externalDocs=" + externalDocs + '}';
    }
}
