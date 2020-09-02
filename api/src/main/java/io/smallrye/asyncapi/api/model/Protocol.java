package io.smallrye.asyncapi.api.model;

/**
 * Some supported protocols.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public interface Protocol {
    public static final String AMQP = "amqp";
    public static final String AMQPS = "amqps";
    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final String JMS = "jms";
    public static final String KAFKA = "kafka";
    public static final String KAFKA_SECURE = "kafka-secure";
    public static final String MQTT = "mqtt";
    public static final String SECURE_MQTT = "secure-mqtt";
    public static final String STOMP = "stomp";
    public static final String STOMPS = "stomps";
    public static final String WS = "ws";
    public static final String WSS = "wss";
}
