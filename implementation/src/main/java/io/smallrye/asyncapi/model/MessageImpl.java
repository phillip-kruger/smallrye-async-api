package io.smallrye.asyncapi.model;

import java.util.List;

import io.smallrye.asyncapi.api.model.Message;
import io.smallrye.asyncapi.api.model.MessageTrait;

/**
 * Describes a message received on a given channel and operation.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#messageObject">Message Object</a>
 */
public class MessageImpl extends MessageTraitImpl implements Message {

    /**
     * Definition of the message payload. It can be of any type but defaults to Schema object.
     */
    private Object payload;

    /**
     * A list of traits to apply to the message object.
     * Traits MUST be merged into the message object using the JSON Merge Patch algorithm in the same order they are defined
     * here.
     * The resulting object MUST be a valid Message Object.
     */
    private List<MessageTrait> traits;

    @Override
    public Object getPayload() {
        return payload;
    }

    @Override
    public void setPayload(Object payload) {
        this.payload = payload;
    }

    @Override
    public List<MessageTrait> getTraits() {
        return traits;
    }

    @Override
    public void setTraits(List<MessageTrait> traits) {
        this.traits = traits;
    }

    @Override
    public String toString() {
        return "Message{" + "payload=" + payload + ", traits=" + traits + '}';
    }
}
