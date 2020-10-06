package io.smallrye.asyncapi.api.model.binding.mqtt;

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

    public class LastWill {
        private String topic;
        private Integer qos;
        private String message;
        private boolean retain;

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

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public boolean isRetain() {
            return retain;
        }

        public void setRetain(boolean retain) {
            this.retain = retain;
        }
    }

}
