package io.smallrye.asyncapi.model;

import java.util.List;

import javax.json.bind.annotation.JsonbProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.smallrye.asyncapi.api.model.ChannelBindings;
import io.smallrye.asyncapi.api.model.ChannelItem;
import io.smallrye.asyncapi.api.model.Operation;
import io.smallrye.asyncapi.api.model.Parameter;

/**
 * Describes the operations available on a single channel.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#channelItemObject">Channel Item Object</a>
 */
public class ChannelItemImpl implements ChannelItem {

    /**
     * Allows for an external definition of this channel item.
     * The referenced structure MUST be in the format of a Channel Item Object.
     */
    @JsonProperty("$ref")
    @JsonbProperty("$ref")
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

    @Override
    public String getRef() {
        return ref;
    }

    @Override
    public void setRef(String ref) {
        this.ref = ref;
        this.bindings = null;
        this.description = null;
        this.parameters = null;
        this.publish = null;
        this.subscribe = null;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
        this.ref = null;
    }

    @Override
    public Operation getSubscribe() {
        return subscribe;
    }

    @Override
    public void setSubscribe(Operation subscribe) {
        this.subscribe = subscribe;
        this.ref = null;
    }

    @Override
    public Operation getPublish() {
        return publish;
    }

    @Override
    public void setPublish(Operation publish) {
        this.publish = publish;
        this.ref = null;
    }

    @Override
    public List<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        this.ref = null;
    }

    @Override
    public ChannelBindings getBindings() {
        return bindings;
    }

    @Override
    public void setBindings(ChannelBindings bindings) {
        this.bindings = bindings;
        this.ref = null;
    }

    @Override
    public String toString() {
        return "ChannelItem{" + "ref=" + ref + ", description=" + description + ", subscribe=" + subscribe + ", publish="
                + publish + ", parameters=" + parameters + ", bindings=" + bindings + '}';
    }
}
