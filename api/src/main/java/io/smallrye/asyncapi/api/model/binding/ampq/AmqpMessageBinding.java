package io.smallrye.asyncapi.api.model.binding.ampq;

import io.smallrye.asyncapi.api.model.MessageBinding;

/**
 * This object contains information about the message representation in AMQP.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/amqp/README.md#message">AMQP Message Bindings Object</a>
 * 
 */
public interface AmqpMessageBinding extends MessageBinding {

    public String getContentEncoding();

    public void setContentEncoding(String contentEncoding);

    public String getMessageType();

    public void setMessageType(String messageType);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);
}
