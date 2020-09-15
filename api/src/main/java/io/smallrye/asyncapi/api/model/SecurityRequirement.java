package io.smallrye.asyncapi.api.model;

import java.util.List;

/**
 * Lists the required security schemes to execute this operation.
 * The name used for each property MUST correspond to a security scheme declared in the Security Schemes under the Components
 * Object.
 * 
 * When a list of Security Requirement Objects is defined on a Server object, only one of the Security Requirement Objects in
 * the list needs
 * to be satisfied to authorize the connection.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#securityRequirementObject">Security Requirement Object</a>
 */
public interface SecurityRequirement {

    public List<String> getName();

    public void setName(List<String> name);

    public void addName(String name);
}
