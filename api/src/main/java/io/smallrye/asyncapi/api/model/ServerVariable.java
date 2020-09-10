package io.smallrye.asyncapi.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 * An object representing a Server Variable for server URL template substitution.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#serverVariableObject">Server Variable Object</a>
 */
public class ServerVariable {

    /**
     * An enumeration of string values to be used if the substitution options are from a limited set.
     */
    private List<String> enumeration;

    /**
     * The default value to use for substitution, and to send, if an alternate value is not supplied.
     */
    private String defaultValue;

    /**
     * An optional description for the server variable. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * An array of examples of the server variable.
     */
    private List<String> examples;

    public ServerVariable() {
    }

    public ServerVariable(List<String> enumeration, String defaultValue, String description, List<String> examples) {
        this.enumeration = enumeration;
        this.defaultValue = defaultValue;
        this.description = description;
        this.examples = examples;
    }

    public List<String> getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(List<String> enumeration) {
        this.enumeration = enumeration;
    }

    public void addEnumeration(String enumeration) {
        if (this.enumeration == null) {
            this.enumeration = new ArrayList<>();
        }
        this.enumeration.add(enumeration);
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getExamples() {
        return examples;
    }

    public void setExamples(List<String> examples) {
        this.examples = examples;
    }

    public void addExample(String example) {
        if (this.examples == null) {
            this.examples = new ArrayList<>();
        }
        this.examples.add(example);
    }

    @Override
    public String toString() {
        return "ServerVariable{" + "enumeration=" + enumeration + ", defaultValue=" + defaultValue + ", description="
                + description + ", examples=" + examples + '}';
    }
}
