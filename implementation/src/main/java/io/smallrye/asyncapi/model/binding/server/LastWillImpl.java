package io.smallrye.asyncapi.model.binding.server;

import io.smallrye.asyncapi.api.model.binding.server.LastWill;

/**
 *
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class LastWillImpl implements LastWill {

    /**
     * The topic where the Last Will and Testament message will be sent.
     */
    private String topic;

    /**
     * Defines how hard the broker/client will try to ensure that the Last Will
     * and Testament message is received. Its value MUST be either 0, 1 or 2.
     */
    private Integer qos;

    /**
     * Whether the broker should retain the Last Will and Testament message or
     * not.
     */
    private boolean retain;

    public LastWillImpl() {
    }

    public LastWillImpl(String topic, Integer qos, boolean retain) {
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
