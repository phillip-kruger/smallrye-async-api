package io.smallrye.asyncapi.api.model;

import java.util.List;

/**
 * Describes the operations available on a single channel.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#channelItemObject">Channel Item Object</a>
 */
public class ChannelItem {

    /**
     * Allows for an external definition of this channel item.
     * The referenced structure MUST be in the format of a Channel Item Object.
     */
    private String ref;

    /**
     * An optional description of this channel item. CommonMark syntax can be used for rich text representation.
     */
    private String description;

    /**
     * A definition of the SUBSCRIBE operation.
     */
    private Operation subscribe;

    /**
     * A definition of the PUBLISH operation.
     */
    private Operation publish;

    /**
     * A map of the parameters included in the channel name. It SHOULD be present only when using channels with expressions.
     */
    private List<Parameter> parameters;

    /**
     * A free-form map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the channel.
     */
    private ChannelBindings bindings;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Operation getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Operation subscribe) {
        this.subscribe = subscribe;
    }

    public Operation getPublish() {
        return publish;
    }

    public void setPublish(Operation publish) {
        this.publish = publish;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public ChannelBindings getBindings() {
        return bindings;
    }

    public void setBindings(ChannelBindings bindings) {
        this.bindings = bindings;
    }

    @Override
    public String toString() {
        return "ChannelItem{" + "ref=" + ref + ", description=" + description + ", subscribe=" + subscribe + ", publish="
                + publish + ", parameters=" + parameters + ", bindings=" + bindings + '}';
    }
}
