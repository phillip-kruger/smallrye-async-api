package io.smallrye.asyncapi.api.model;

import java.util.HashMap;
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
public class Server {

    /**
     * REQUIRED. A URL to the target host. This URL supports Server Variables and MAY be relative,
     * to indicate that the host location is relative to the location where the AsyncAPI document is being served.
     * Variable substitutions will be made when a variable is named in {brackets}.
     * 
     * Because of the option to use Variable substitution, this is a String and not a URL
     */
    private String url;

    /**
     * REQUIRED. The protocol this URL supports for connection. Supported protocol include,
     * but are not limited to: amqp, amqps, http, https, jms, kafka, kafka-secure, mqtt, secure-mqtt, stomp, stomps, ws, wss.
     */
    private String protocol;

    /**
     * The version of the protocol used for connection. For instance: AMQP 0.9.1, HTTP 2.0, Kafka 1.0.0, etc.
     */
    private String protocolVersion;

    /**
     * An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * A map between a variable name and its value. The value is used for substitution in the server’s URL template.
     */
    private Map<String, ServerVariable> variables;

    /**
     * A declaration of which security mechanisms can be used with this server.
     * The list of values includes alternative security requirement objects that can be used.
     * Only one of the security requirement objects need to be satisfied to authorize a connection or operation.
     */
    private SecurityRequirement securityRequirement;

    /**
     * A free-form map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the server.
     */
    private Map<BindingKey, ServerBinding> bindings;

    public Server() {
    }

    public Server(String url, String protocol) {
        this.url = url;
        this.protocol = protocol;
    }

    public Server(String url, String protocol, String protocolVersion, String description,
            SecurityRequirement securityRequirement) {
        this.url = url;
        this.protocol = protocol;
        this.protocolVersion = protocolVersion;
        this.description = description;
        this.securityRequirement = securityRequirement;
    }

    public Server(String url, String protocol, String protocolVersion, String description,
            Map<String, ServerVariable> variables,
            SecurityRequirement securityRequirement) {
        this.url = url;
        this.protocol = protocol;
        this.protocolVersion = protocolVersion;
        this.description = description;
        this.variables = variables;
        this.securityRequirement = securityRequirement;
    }

    public Server(String url, String protocol, String protocolVersion, String description,
            Map<String, ServerVariable> variables,
            SecurityRequirement securityRequirement,
            Map<BindingKey, ServerBinding> bindings) {
        this.url = url;
        this.protocol = protocol;
        this.protocolVersion = protocolVersion;
        this.description = description;
        this.variables = variables;
        this.securityRequirement = securityRequirement;
        this.bindings = bindings;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, ServerVariable> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, ServerVariable> variables) {
        this.variables = variables;
    }

    public void addVariable(String key, ServerVariable variable) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        this.variables.put(key, variable);
    }

    public SecurityRequirement getSecurityRequirement() {
        return securityRequirement;
    }

    public void setSecurityRequirement(SecurityRequirement securityRequirement) {
        this.securityRequirement = securityRequirement;
    }

    public Map<BindingKey, ServerBinding> getBindings() {
        return bindings;
    }

    public void setBindings(Map<BindingKey, ServerBinding> bindings) {
        this.bindings = bindings;
    }

    public void addBinding(BindingKey bindingKey, ServerBinding binding) {
        if (this.bindings == null) {
            this.bindings = new HashMap<>();
        }
        this.bindings.put(bindingKey, binding);
    }

    @Override
    public String toString() {
        return "Server{" + "url=" + url + ", protocol=" + protocol + ", protocolVersion=" + protocolVersion + ", description="
                + description + ", variables=" + variables + ", securityRequirement=" + securityRequirement + ", bindings="
                + bindings + '}';
    }
}
