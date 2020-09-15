package io.smallrye.asyncapi.model;

import java.util.ArrayList;
import java.util.List;

import io.smallrye.asyncapi.api.model.ServerVariable;

/**
 * An object representing a Server Variable for server URL template substitution.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#serverVariableObject">Server Variable Object</a>
 */
public class ServerVariableImpl implements ServerVariable {

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

    public ServerVariableImpl() {
    }

    public ServerVariableImpl(List<String> enumeration, String defaultValue, String description, List<String> examples) {
        this.enumeration = enumeration;
        this.defaultValue = defaultValue;
        this.description = description;
        this.examples = examples;
    }

    @Override
    public List<String> getEnumeration() {
        return enumeration;
    }

    @Override
    public void setEnumeration(List<String> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void addEnumeration(String enumeration) {
        if (this.enumeration == null) {
            this.enumeration = new ArrayList<>();
        }
        this.enumeration.add(enumeration);
    }

    @Override
    public String getDefaultValue() {
        return defaultValue;
    }

    @Override
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
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
    public List<String> getExamples() {
        return examples;
    }

    @Override
    public void setExamples(List<String> examples) {
        this.examples = examples;
    }

    @Override
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
