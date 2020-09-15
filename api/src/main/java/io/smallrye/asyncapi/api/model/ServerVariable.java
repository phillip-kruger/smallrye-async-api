package io.smallrye.asyncapi.api.model;

import java.util.List;

/**
 * An object representing a Server Variable for server URL template substitution.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#serverVariableObject">Server Variable Object</a>
 */
public interface ServerVariable {

    public List<String> getEnumeration();

    public void setEnumeration(List<String> enumeration);

    public void addEnumeration(String enumeration);

    public String getDefaultValue();

    public void setDefaultValue(String defaultValue);

    public String getDescription();

    public void setDescription(String description);

    public List<String> getExamples();

    public void setExamples(List<String> examples);

    public void addExample(String example);
}
