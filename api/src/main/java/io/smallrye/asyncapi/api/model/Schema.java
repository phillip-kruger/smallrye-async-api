package io.smallrye.asyncapi.api.model;

import java.util.Map;
import java.util.Set;

/**
 * The Schema Object allows the definition of input and output data types.
 * These types can be objects, but also primitives and arrays.
 * This object is a superset of the JSON Schema Specification Draft 07.
 * 
 * Further information about the properties can be found in JSON Schema Core and JSON Schema Validation.
 * Unless stated otherwise, the property definitions follow the JSON Schema specification as referenced here.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#schemaObject">Schema Object</a>
 */
public interface Schema extends Referencable {

    public String getTitle();

    public void setTitle(String title);

    public String getDescription();

    public void setDescription(String description);

    public Schema getDefaultValue();

    public void setDefaultValue(Schema defaultValue);

    public boolean isReadOnly();

    public void setReadOnly(boolean readOnly);

    public boolean isWriteOnly();

    public void setWriteOnly(boolean writeOnly);

    public Set<Object> getExamples();

    public void setExamples(Set<Object> examples);

    public SchemaType getType();

    public void setType(SchemaType type);

    public Set<Object> getEnumeration();

    public void setEnumeration(Set<Object> enumeration);

    public Object getConstant();

    public void setConstant(Object constant);

    public Number getMultipleOf();

    public void setMultipleOf(Number multipleOf);

    public Number getMaximum();

    public void setMaximum(Number maximum);

    public Number getExclusiveMaximum();

    public void setExclusiveMaximum(Number exclusiveMaximum);

    public Number getMinimum();

    public void setMinimum(Number minimum);

    public Number getExclusiveMinimum();

    public void setExclusiveMinimum(Number exclusiveMinimum);

    public int getMaxLength();

    public void setMaxLength(int maxLength);

    public int getMinLength();

    public void setMinLength(int minLength);

    public String getPattern();

    public void setPattern(String pattern);

    public Set<Schema> getItems();

    public void setItems(Set<Schema> items);

    public Schema getAdditionalItems();

    public void setAdditionalItems(Schema additionalItems);

    public int getMaxItems();

    public void setMaxItems(int maxItems);

    public int getMinItems();

    public void setMinItems(int minItems);

    public boolean isUniqueItems();

    public void setUniqueItems(boolean uniqueItems);

    public Schema getContains();

    public void setContains(Schema contains);

    public int getMaxProperties();

    public void setMaxProperties(int maxProperties);

    public int getMinProperties();

    public void setMinProperties(int minProperties);

    public Set<String> getRequired();

    public void setRequired(Set<String> required);

    public Map<String, Schema> getProperties();

    public void setProperties(Map<String, Schema> properties);

    public Map<String, String> getPatternProperties();

    public void setPatternProperties(Map<String, String> patternProperties);

    public Schema getAdditionalProperties();

    public void setAdditionalProperties(Schema additionalProperties);

    public Schema getPropertyNames();

    public void setPropertyNames(Schema propertyNames);

    public Set<Schema> getAllOf();

    public void setAllOf(Set<Schema> allOf);

    public Set<Schema> getAnyOf();

    public void setAnyOf(Set<Schema> anyOf);

    public Set<Schema> getOneOf();

    public void setOneOf(Set<Schema> oneOf);

    public Schema getNot();

    public void setNot(Schema not);

    public Format getFormat();

    public void setFormat(Format format);
}
