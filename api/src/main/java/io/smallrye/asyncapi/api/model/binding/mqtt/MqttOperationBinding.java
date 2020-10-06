package io.smallrye.asyncapi.api.model.binding.mqtt;

import io.smallrye.asyncapi.api.model.OperationBinding;

/**
 * This object contains information about the server representation in MQTT.
 *
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 *
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/mqtt/README.md#operation">MQTT Operations Bindings Object</a>
 *
 */
public interface MqttOperationBinding extends OperationBinding {

    public int getQos();

    public void setQos(int qos);

    public boolean isRetain();

    public void setRetain(boolean retain);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);

}
