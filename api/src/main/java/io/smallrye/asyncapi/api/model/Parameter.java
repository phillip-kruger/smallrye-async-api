package io.smallrye.asyncapi.api.model;

/**
 * Describes a parameter included in a channel name.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#parameterObject">Parameter Object</a>
 */
public interface Parameter extends Referencable {

    public String getDescription();

    public void setDescription(String description);

    public Schema getSchema();

    public void setSchema(Schema schema);

    public String getLocation();

    public void setLocation(String location);
}
