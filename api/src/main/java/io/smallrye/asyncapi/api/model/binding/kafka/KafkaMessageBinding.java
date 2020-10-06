package io.smallrye.asyncapi.api.model.binding.kafka;

import io.smallrye.asyncapi.api.model.MessageBinding;
import io.smallrye.asyncapi.api.model.Schema;

/**
 * This object MUST NOT contain any properties. Its name is reserved for future use.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/kafka/README.md#message">Kafka Message Bindings Object</a>
 * 
 */
public interface KafkaMessageBinding extends MessageBinding {
    public Schema getKey();

    public void setKey(Schema key);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);
}
