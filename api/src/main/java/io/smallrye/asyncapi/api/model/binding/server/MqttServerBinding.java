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
public class MqttServerBinding implements ServerBinding {

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

    public MqttServerBinding() {
    }

    public MqttServerBinding(String clientId, boolean cleanSession, LastWill lastWill, Integer keepAlive,
            String bindingVersion) {
        this.clientId = clientId;
        this.cleanSession = cleanSession;
        this.lastWill = lastWill;
        this.keepAlive = keepAlive;
        this.bindingVersion = bindingVersion;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public boolean isCleanSession() {
        return cleanSession;
    }

    public void setCleanSession(boolean cleanSession) {
        this.cleanSession = cleanSession;
    }

    public LastWill getLastWill() {
        return lastWill;
    }

    public void setLastWill(LastWill lastWill) {
        this.lastWill = lastWill;
    }

    public Integer getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Integer keepAlive) {
        this.keepAlive = keepAlive;
    }

    public String getBindingVersion() {
        return bindingVersion;
    }

    public void setBindingVersion(String bindingVersion) {
        this.bindingVersion = bindingVersion;
    }

    @Override
    public String toString() {
        return "MqttServerBinding{" + "clientId=" + clientId + ", cleanSession=" + cleanSession + ", lastWill=" + lastWill
                + ", keepAlive=" + keepAlive + ", bindingVersion=" + bindingVersion + '}';
    }

    public static class LastWill {

        /**
         * The topic where the Last Will and Testament message will be sent.
         */
        private String topic;

        /**
         * Defines how hard the broker/client will try to ensure that the Last
         * Will and Testament message is received. Its value MUST be either 0, 1
         * or 2.
         */
        private Integer qos;

        /**
         * Whether the broker should retain the Last Will and Testament message
         * or not.
         */
        private boolean retain;

        public LastWill() {
        }

        public LastWill(String topic, Integer qos, boolean retain) {
            this.topic = topic;
            this.qos = qos;
            this.retain = retain;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public Integer getQos() {
            return qos;
        }

        public void setQos(Integer qos) {
            this.qos = qos;
        }

        public boolean isRetain() {
            return retain;
        }

        public void setRetain(boolean retain) {
            this.retain = retain;
        }

        @Override
        public String toString() {
            return "LastWill{" + "topic=" + topic + ", qos=" + qos + ", retain=" + retain + '}';
        }
    }
}
