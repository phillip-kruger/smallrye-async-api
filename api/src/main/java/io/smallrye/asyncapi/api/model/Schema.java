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
public class Schema {

    private String ref;

    /**
     * Title can be used to decorate a user interface with information about the data produced by this user interface.
     */
    private String title;

    /**
     * Description will provide explanation about the purpose of the instance described by this schema
     */
    private String description;

    /**
     * There are no restrictions placed on the value of this property.
     * When multiple occurrences of this property are applicable to a single sub-instance, implementations SHOULD remove
     * duplicates.
     * This property can be used to supply a default JSON value associated with a particular schema. It is RECOMMENDED that a
     * default value be
     * valid against the associated schema.
     */
    private Schema defaultValue; // default

    /**
     * Indicates that the value of the instance is managed exclusively by the owning authority,
     * and attempts by an application to modify the value of this property are expected to be ignored or rejected by that owning
     * authority.
     * An instance document that is marked as "readOnly for the entire document MAY be ignored if sent to the owning authority,
     * or MAY result in an error, at the authority's discretion.
     */
    private boolean readOnly;

    /**
     * Indicates that the value is never present when the instance is retrieved from the owning authority.
     * It can be present when sent to the owning authority to update or create the document (or the resource it represents),
     * but it will not be included in any updated or newly created version of the instance.
     * An instance document that is marked as "writeOnly" for the entire document MAY be returned as a blank document of some
     * sort,
     * or MAY produce an error upon retrieval, or have the retrieval request ignored, at the authority's discretion.
     */
    private boolean writeOnly;

    /**
     * The value of this property MUST be an array. There are no restrictions placed on the values within the array.
     * When multiple occurrences of this property are applicable to a single sub-instance,
     * implementations MUST provide a flat array of all values rather than an array of arrays.
     * 
     * This property can be used to provide sample JSON values associated with a particular schema, for the purpose of
     * illustrating usage.
     * It is RECOMMENDED that these values be valid against the associated schema.
     * Implementations MAY use the value(s) of "default", if present, as an additional example. If "examples" is absent,
     * "default" MAY still be used in this manner.
     */
    private Set<Object> examples; // TODO: Or Schema ?

    // Validation properties for Any Instance Type    

    /**
     * The value of this property MUST be either a string or an array.
     * If it is an array, elements of the array MUST be strings and MUST be unique.
     * String values MUST be one of the six primitive types ("null", "boolean", "object", "array", "number", or "string"), or
     * "integer" which matches any number with a zero fractional part.
     * An instance validates if and only if the instance is in any of the sets listed for this property.
     */
    private Type type;

    /**
     * The value of this property MUST be an array. This array SHOULD have
     * at least one element. Elements in the array SHOULD be unique.
     * 
     * An instance validates successfully against this property if its value is equal to one of the elements in this property's
     * array value.
     * Elements in the array might be of any value, including null.
     */
    private Set<Object> enumeration; // emum

    /**
     * The value of this property MAY be of any type, including null.
     * An instance validates successfully against this property if its value is equal to the value of the property.
     */
    private Object constant; // const

    // === Validation properties for Numeric Instances (number and integer)

    /**
     * The value of "multipleOf" MUST be a number, strictly greater than 0.
     * A numeric instance is valid only if division by this property's value results in an integer.
     */
    private Number multipleOf;

    /**
     * If the instance is a number, then this property validates only if the instance is less than or exactly equal to
     * "maximum".
     */
    private Number maximum;

    /**
     * If the instance is a number, then the instance is valid only if it has a value strictly less than (not equal to)
     * "exclusiveMaximum".
     */
    private Number exclusiveMaximum;

    /**
     * If the instance is a number, then this property validates only if the instance is greater than or exactly equal to
     * "minimum".
     */
    private Number minimum;

    /**
     * If the instance is a number, then the instance is valid only if it has a value strictly greater than (not equal to)
     * "exclusiveMinimum".
     */
    private Number exclusiveMinimum;

    // === Validation properties for Strings

    /**
     * The value of this property MUST be a non-negative integer.
     * A string instance is valid against this property if its length is less than, or equal to, the value of this property.
     * The length of a string instance is defined as the number of its characters as defined by RFC 7159.
     */
    private int maxLength;

    /**
     * The value of this property MUST be a non-negative integer.
     * A string instance is valid against this property if its length is greater than, or equal to, the value of this property.
     * The length of a string instance is defined as the number of its characters as defined by RFC 7159.
     * 
     * Omitting this property has the same behavior as a value of 0.
     */
    private int minLength;

    /**
     * The value of this property MUST be a string.
     * This string SHOULD be a valid regular expression, according to the ECMA 262 regular expression dialect.
     */
    private String pattern;

    // === Validation properties for Arrays

    /**
     * The value of "items" MUST be either a valid JSON Schema or an array of valid JSON Schemas.
     * This property determines how child instances validate for arrays, and does not directly validate the immediate instance
     * itself.
     * If "items" is a schema, validation succeeds if all elements in the array successfully validate against that schema.
     * If "items" is an array of schemas, validation succeeds if each element of the instance validates against the schema at
     * the same position, if any.
     * 
     * Omitting this property has the same behavior as an empty schema.
     */
    private Set<Schema> items;

    /**
     * The value of "additionalItems" MUST be a valid JSON Schema. This property determines how child instances validate for
     * arrays, and
     * does not directly validate the immediate instance itself.
     * If "items" is an array of schemas, validation succeeds if every instance element at a position greater than the size of
     * "items" validates against "additionalItems".
     * Otherwise, "additionalItems" MUST be ignored, as the "items" schema (possibly the default value of an empty schema) is
     * applied to all elements.
     * 
     * Omitting this property has the same behavior as an empty schema.
     */
    private Schema additionalItems;

    /**
     * The value of this property MUST be a non-negative integer.
     * An array instance is valid against "maxItems" if its size is less
     * than, or equal to, the value of this property.
     */
    private int maxItems;

    /**
     * The value of this property MUST be a non-negative integer.
     * An array instance is valid against "minItems" if its size is greater
     * than, or equal to, the value of this property.
     * 
     * Omitting this property has the same behavior as a value of 0.
     */
    private int minItems;

    /**
     * The value of this property MUST be a boolean.
     * If this property has boolean value false, the instance validates successfully. If it has boolean value true, the instance
     * validates
     * successfully if all of its elements are unique.
     * 
     * Omitting this property has the same behavior as a value of false.
     */
    private boolean uniqueItems;

    /**
     * The value of this property MUST be a valid JSON Schema.
     * An array instance is valid against "contains" if at least one of its
     * elements is valid against the given schema.
     */
    private Schema contains;

    // === Validation properties for Objects

    /**
     * The value of this property MUST be a non-negative integer.
     * An object instance is valid against "maxProperties" if its number of properties is less than, or equal to, the value of
     * this property.
     */
    private int maxProperties;

    /**
     * The value of this property MUST be a non-negative integer.
     * An object instance is valid against "minProperties" if its number of properties is greater than, or equal to, the value
     * of this property.
     * 
     * Omitting this property has the same behavior as a value of 0.
     */
    private int minProperties;

    /**
     * An object instance is valid against this property if every item in the
     * array is the name of a property in the instance. (i.e. required properties of the object)
     */
    private Set<String> required;

    /**
     * The value of "properties" MUST be an object. Each value of this object MUST be a valid JSON Schema.
     * This property determines how child instances validate for objects, and does not directly validate the immediate instance
     * itself.
     * Validation succeeds if, for each name that appears in both the instance and as a name within this property's value, the
     * child
     * instance for that name successfully validates against the corresponding schema.
     * 
     * Omitting this property has the same behavior as an empty object.
     */
    private Map<String, Schema> properties;

    /**
     * The value of "patternProperties" MUST be an object. Each property name of this object SHOULD be a valid regular
     * expression, according
     * to the ECMA 262 regular expression dialect. Each property value of this object MUST be a valid JSON Schema.
     * This property determines how child instances validate for objects, and does not directly validate the immediate instance
     * itself.
     * Validation of the primitive instance type against this property always succeeds.
     * Validation succeeds if, for each instance name that matches any regular expressions that appear as a property name in
     * this property's
     * value, the child instance for that name successfully validates against each schema that corresponds to a matching regular
     * expression.
     * 
     * Omitting this property has the same behavior as an empty object.
     */
    private Map<String, String> patternProperties;

    /**
     * The value of "additionalProperties" MUST be a valid JSON Schema.
     * This property determines how child instances validate for objects, and does not directly validate the immediate instance
     * itself.
     * Validation with "additionalProperties" applies only to the child values of instance names that do not match any names in
     * "properties",
     * and do not match any regular expression in "patternProperties".
     * 
     * For all such properties, validation succeeds if the child instance validates against the "additionalProperties" schema.
     * 
     * Omitting this property has the same behavior as an empty schema.
     */
    private Schema additionalProperties;

    // dependencies TODO: Add this ?

    /**
     * The value of "propertyNames" MUST be a valid JSON Schema.
     * If the instance is an object, this property validates if every
     * property name in the instance validates against the provided schema.
     * Note the property name that the schema is testing will always be a string.
     * 
     * Omitting this property has the same behavior as an empty schema.
     */
    private Schema propertyNames;

    // === Properties for Applying Subschemas Conditionally

    // TODO: if / then / else ?

    // === Properties for Applying Subschemas With Boolean Logic

    /**
     * This property's value MUST be a non-empty array. Each item of the array MUST be a valid JSON Schema.
     * An instance validates successfully against this property if it validates successfully against all schemas defined by this
     * property's value.
     */
    private Set<Schema> allOf;

    /**
     * This property's value MUST be a non-empty array. Each item of the array MUST be a valid JSON Schema.
     * An instance validates successfully against this property if it validates successfully against at least one schema defined
     * by this property's value.
     */
    private Set<Schema> anyOf;

    /**
     * This property's value MUST be a non-empty array. Each item of the array MUST be a valid JSON Schema.
     * An instance validates successfully against this property if it validates successfully against exactly one schema defined
     * by this property's value.
     */
    private Set<Schema> oneOf;

    /**
     * This property's value MUST be a valid JSON Schema.
     * An instance is valid against this property if it fails to validate successfully against the schema defined by this
     * property.
     */
    private Schema not;

    /**
     * 
     * see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#dataTypeFormat">Data Type Formats</a>
     * 
     */
    private Format format;
}
