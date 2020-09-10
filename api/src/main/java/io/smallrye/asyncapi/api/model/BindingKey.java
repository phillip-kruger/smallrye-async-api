package io.smallrye.asyncapi.api.model;

/**
 * Used in Server and Channel binding as keys in a map.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#serverBindingsObject">Server Bindings Object</a>
 */
public enum BindingKey {
    http,
    ws,
    kafka,
    amqp,
    amqp1,
    mqtt,
    mqtt5,
    nats,
    jms,
    sns,
    sqs,
    stomp,
    redis
}