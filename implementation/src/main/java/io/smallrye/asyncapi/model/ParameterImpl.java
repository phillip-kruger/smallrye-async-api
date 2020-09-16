package io.smallrye.asyncapi.model;

import io.smallrye.asyncapi.api.model.Parameter;
import io.smallrye.asyncapi.api.model.Schema;

/**
 * Describes a parameter included in a channel name.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#parameterObject">Parameter Object</a>
 */
public class ParameterImpl implements Parameter {

    /**
     * A verbose explanation of the parameter. CommonMark syntax can be used for rich text representation.
     */
    public String description;

    /**
     * Definition of the parameter.
     */
    public Schema schema;

    /**
     * A runtime expression that specifies the location of the parameter value.
     * Even when a definition for the target field exists, it MUST NOT be used
     * to validate this parameter but, instead, the schema property MUST be used.
     */
    public String location;

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Schema getSchema() {
        return this.schema;
    }

    @Override
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Parameter{" + "description=" + description + ", schema=" + schema + ", location=" + location + '}';
    }
}
