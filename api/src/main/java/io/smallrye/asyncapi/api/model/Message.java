package io.smallrye.asyncapi.api.model;

import java.util.List;

/**
 * Describes a message received on a given channel and operation.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#messageObject">Message Object</a>
 */
public interface Message extends MessageTrait {

    public Object getPayload();

    public void setPayload(Object payload);

    public List<MessageTrait> getTraits();

    public void setTraits(List<MessageTrait> traits);
}
