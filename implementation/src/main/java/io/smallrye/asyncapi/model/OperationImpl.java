package io.smallrye.asyncapi.model;

import java.util.List;

import io.smallrye.asyncapi.api.model.Message;
import io.smallrye.asyncapi.api.model.Operation;
import io.smallrye.asyncapi.api.model.OperationTraits;

/**
 * Describes a publish or a subscribe operation.
 * This provides a place to document how and why messages are sent and received.
 * 
 * For example, an operation might describe a chat application use case where a user sends a text message to a group.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#operationObject">Operation Object</a>
 */
public class OperationImpl extends OperationTraitsImpl implements Operation {

    /**
     * A list of traits to apply to the operation object.
     * Traits MUST be merged into the operation object using the JSON Merge Patch algorithm in the same order they are defined
     * here.
     */
    private List<OperationTraits> traits; // Or Reference ?? Maybe Object ?

    /**
     * A definition of the message that will be published or received on this channel.
     * oneOf is allowed here to specify multiple messages, however, a message MUST be valid only against one of the referenced
     * message objects.
     */
    private Message message;

    @Override
    public List<OperationTraits> getTraits() {
        return traits;
    }

    @Override
    public void setTraits(List<OperationTraits> traits) {
        this.traits = traits;
    }

    @Override
    public Message getMessage() {
        return message;
    }

    @Override
    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Operation{" + "traits=" + traits + ", message="
                + message + "}";
    }
}
