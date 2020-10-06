package io.smallrye.asyncapi.api.model;

/**
 * Json Schema types
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.1.1">Json Schema Type</a>
 */
public enum SchemaType {

    NULL,
    BOOLEAN,
    OBJECT,
    ARRAY,
    NUMBER,
    STRING,
    INTEGER;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
