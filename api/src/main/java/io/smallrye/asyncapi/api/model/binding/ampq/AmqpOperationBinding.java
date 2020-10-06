package io.smallrye.asyncapi.api.model.binding.ampq;

import java.util.List;

import io.smallrye.asyncapi.api.model.OperationBinding;

/**
 * AMQP Operation Bindings Object
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/amqp/README.md#operation">AMQP Operation Bindings Object</a>
 * 
 */
public interface AmqpOperationBinding extends OperationBinding {

    public int getExpiration();

    public void setExpiration(int expiration);

    public String getUserId();

    public void setUserId(String userId);

    public List<String> getCc();

    public void setCc(List<String> cc);

    public int getPriority();

    public void setPriority(int priority);

    public DeliveryMode getDeliveryMode();

    public void setDeliveryMode(DeliveryMode deliveryMode);

    public boolean isMandatory();

    public void setMandatory(boolean mandatory);

    public List<String> getBcc();

    public void setBcc(List<String> bcc);

    public String getReplyTo();

    public void setReplyTo(String replyTo);

    public boolean isTimestamp();

    public void setTimestamp(boolean timestamp);

    public boolean isAck();

    public void setAck(boolean ack);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);

    public enum DeliveryMode {
        TRANSIENT,
        PERSISTENT
    }
}
