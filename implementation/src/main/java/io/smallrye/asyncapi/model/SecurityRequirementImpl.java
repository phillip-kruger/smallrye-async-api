package io.smallrye.asyncapi.model;

import java.util.ArrayList;
import java.util.List;

import io.smallrye.asyncapi.api.model.SecurityRequirement;

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
public class SecurityRequirementImpl implements SecurityRequirement {

    /**
     * Each name MUST correspond to a security scheme which is declared in the Security Schemes under the Components Object.
     * If the security scheme is of type "oauth2" or "openIdConnect", then the value is a list of scope names required for the
     * execution.
     * For other security scheme types, the array MUST be empty.
     */
    private List<String> name = new ArrayList<>();

    public SecurityRequirementImpl() {
    }

    public SecurityRequirementImpl(String... name) {
        for (String n : name) {
            this.name.add(n);
        }
    }

    @Override
    public List<String> getName() {
        return name;
    }

    @Override
    public void setName(List<String> name) {
        this.name = name;
    }

    @Override
    public void addName(String name) {
        this.name.add(name);
    }

    @Override
    public String toString() {
        return "SecurityRequirement{" + "name=" + name + '}';
    }

}
