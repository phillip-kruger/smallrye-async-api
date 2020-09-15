package io.smallrye.asyncapi.model.binding.server;

import io.smallrye.asyncapi.api.model.binding.server.LastWill;
import io.smallrye.asyncapi.api.model.binding.server.MqttServerBinding;

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
public class MqttServerBindingImpl implements MqttServerBinding {

    /**
     * The client identifier.
     */
    private String clientId;

    /**
     * Whether to create a persistent connection or not. When false, the
     * connection will be persistent.
     */
    private boolean cleanSession;

    /**
     * Last Will and Testament configuration.
     */
    private LastWill lastWill;

    /**
     * Interval in seconds of the longest period of time the broker and the
     * client can endure without sending a message.
     */
    private Integer keepAlive;

    /**
     * The version of this binding. If omitted, "latest" MUST be assumed.
     */
    private String bindingVersion;

    public MqttServerBindingImpl() {
    }

    public MqttServerBindingImpl(String clientId, boolean cleanSession, LastWill lastWill, Integer keepAlive,
            String bindingVersion) {
        this.clientId = clientId;
        this.cleanSession = cleanSession;
        this.lastWill = lastWill;
        this.keepAlive = keepAlive;
        this.bindingVersion = bindingVersion;
    }

    @Override
    public String getClientId() {
        return clientId;
    }

    @Override
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean isCleanSession() {
        return cleanSession;
    }

    @Override
    public void setCleanSession(boolean cleanSession) {
        this.cleanSession = cleanSession;
    }

    @Override
    public LastWill getLastWill() {
        return lastWill;
    }

    @Override
    public void setLastWill(LastWill lastWill) {
        this.lastWill = lastWill;
    }

    @Override
    public Integer getKeepAlive() {
        return keepAlive;
    }

    @Override
    public void setKeepAlive(Integer keepAlive) {
        this.keepAlive = keepAlive;
    }

    @Override
    public String getBindingVersion() {
        return bindingVersion;
    }

    @Override
    public void setBindingVersion(String bindingVersion) {
        this.bindingVersion = bindingVersion;
    }

    @Override
    public String toString() {
        return "MqttServerBinding{" + "clientId=" + clientId + ", cleanSession=" + cleanSession + ", lastWill=" + lastWill
                + ", keepAlive=" + keepAlive + ", bindingVersion=" + bindingVersion + '}';
    }
}
