package io.smallrye.asyncapi.api.model.binding.kafka;

import io.smallrye.asyncapi.api.model.OperationBinding;
import io.smallrye.asyncapi.api.model.Schema;

/**
 * This object allows you to describe Kafka-specific information on AsyncAPI.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/kafka/README.md#operation">Kafka Operation Bindings Object</a>
 * 
 */
public interface KafkaOperationBinding extends OperationBinding {

    public Schema getGroupId();

    public void setGroupId(Schema groupId);

    public Schema getClientId();

    public void setClientId(Schema clientId);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);

}
