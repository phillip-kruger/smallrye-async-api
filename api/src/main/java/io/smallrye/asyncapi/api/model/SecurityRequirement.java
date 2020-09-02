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
public class SecurityRequirement {

    /**
     * Each name MUST correspond to a security scheme which is declared in the Security Schemes under the Components Object.
     * If the security scheme is of type "oauth2" or "openIdConnect", then the value is a list of scope names required for the
     * execution.
     * For other security scheme types, the array MUST be empty.
     */
    private List<String> name;
}
