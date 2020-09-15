package io.smallrye.asyncapi.api.model;

import java.util.Map;

/**
 * An object representing a message broker, a server or any other kind of computer program capable of sending and/or receiving
 * data.
 * This object is used to capture details such as URIs, protocols and security configuration.
 * Variable substitution can be used so that some details, for example usernames and passwords, can be injected by code
 * generation tools.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#serverObject">Server Object</a>
 */
public interface Server {

    public String getUrl();

    public void setUrl(String url);

    public String getProtocol();

    public void setProtocol(String protocol);

    public String getProtocolVersion();

    public void setProtocolVersion(String protocolVersion);

    public String getDescription();

    public void setDescription(String description);

    public Map<String, ServerVariable> getVariables();

    public void setVariables(Map<String, ServerVariable> variables);

    public void addVariable(String key, ServerVariable variable);

    public SecurityRequirement getSecurityRequirement();

    public void setSecurityRequirement(SecurityRequirement securityRequirement);

    public Map<BindingKey, ServerBinding> getBindings();

    public void setBindings(Map<BindingKey, ServerBinding> bindings);

    public void addBinding(BindingKey bindingKey, ServerBinding binding);
}
