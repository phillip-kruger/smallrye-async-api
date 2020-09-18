package io.smallrye.asyncapi.api.model;

/**
 * Primitives have an optional modifier property: format.
 * The AsyncAPI specification uses several known formats to more finely define the data type being used.
 * However, the format property is an open string-valued property, and can have any value to support documentation needs.
 * Formats such as "email", "uuid", etc., can be used even though they are not defined by this specification.
 * Types that are not accompanied by a format property follow their definition from the JSON Schema.
 * Tools that do not recognize a specific format MAY default back to the type alone, as if the format was not specified.
 * 
 * TODO: Allow any other kind
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#dataTypeFormat">Data Type Format</a>
 */
public enum Format {

    INTEGER, // integer 	int32 	signed 32 bits
    LONG, // integer 	int64 	signed 64 bits
    FLOAT, // number 	float 	
    DOUBLE, // number 	double 	
    STRING, // string 		
    BYTE, // string 	byte 	base64 encoded characters
    BINARY, // string 	binary 	any sequence of octets
    BOOLEAN, // boolean 		
    DATE, // string 	date 	As defined by full-date - RFC3339
    DATE_TIME, // string 	date-time 	As defined by date-time - RFC3339
    PASSWORD // string 	password 	Used to hint UIs the input needs to be obscured.
}
