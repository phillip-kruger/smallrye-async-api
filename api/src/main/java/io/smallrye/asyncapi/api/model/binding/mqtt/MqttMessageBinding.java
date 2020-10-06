package io.smallrye.asyncapi.api.model.binding.mqtt;

import io.smallrye.asyncapi.api.model.MessageBinding;

/**
 * This object contains information about the server representation in MQTT.
 *
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 *
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/mqtt/README.md#message">MQTT Message Bindings Object</a>
 *
 */
public interface MqttMessageBinding extends MessageBinding {

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);

}
