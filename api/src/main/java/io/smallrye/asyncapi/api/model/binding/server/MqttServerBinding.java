package io.smallrye.asyncapi.api.model.binding.server;

import io.smallrye.asyncapi.api.model.ServerBinding;

/**
 * This object contains information about the server representation in MQTT.
 *
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 *
 * @see
 *      <a href="https://github.com/asyncapi/bindings/tree/master/mqtt#server-binding-object">MQTT
 *      Server Bindings Object</a>
 *
 */
public interface MqttServerBinding extends ServerBinding {

    public String getClientId();

    public void setClientId(String clientId);

    public boolean isCleanSession();

    public void setCleanSession(boolean cleanSession);

    public LastWill getLastWill();

    public void setLastWill(LastWill lastWill);

    public Integer getKeepAlive();

    public void setKeepAlive(Integer keepAlive);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);

}
