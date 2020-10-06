package io.smallrye.asyncapi.api.model.binding.ampq;

import io.smallrye.asyncapi.api.model.ChannelBinding;

/**
 * This object MUST NOT contain any properties. Its name is reserved for future use.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/amqp/README.md#channel">AMQP Channel Bindings Object</a>
 * 
 */
public interface AmqpChannelBinding extends ChannelBinding {

    public Is getIs();

    public void setIs(Is is);

    public Exchange getExchange();

    public void setExchange(Exchange exchange);

    public Queue getQueue();

    public void setQueue(Queue queue);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);

    public enum Is {
        queue,
        routingKey
    }

    public class Queue {
        // The name of the queue. It MUST NOT exceed 255 characters long.
        private String name;

        // Whether the queue should survive broker restarts or not.
        private boolean durable;

        // Whether the queue should be used only by one connection or not.
        private boolean exclusive;

        // Whether the queue should be deleted when the last consumer unsubscribes.
        private boolean autoDelete;

        // The virtual host of the queue. Defaults to /.
        private String vhost;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isDurable() {
            return durable;
        }

        public void setDurable(boolean durable) {
            this.durable = durable;
        }

        public boolean isExclusive() {
            return exclusive;
        }

        public void setExclusive(boolean exclusive) {
            this.exclusive = exclusive;
        }

        public boolean isAutoDelete() {
            return autoDelete;
        }

        public void setAutoDelete(boolean autoDelete) {
            this.autoDelete = autoDelete;
        }

        public String getVhost() {
            return vhost;
        }

        public void setVhost(String vhost) {
            this.vhost = vhost;
        }
    }

    public class Exchange {
        // The name of the exchange. It MUST NOT exceed 255 characters long.
        private String name;

        // The type of the exchange.
        private Type type;

        // Whether the exchange should survive broker restarts or not.
        private boolean durable;

        // Whether the exchange should be deleted when the last queue is unbound from it.
        private boolean autoDelete;

        // The virtual host of the exchange. Defaults to /.
        private String vhost;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public boolean isDurable() {
            return durable;
        }

        public void setDurable(boolean durable) {
            this.durable = durable;
        }

        public boolean isAutoDelete() {
            return autoDelete;
        }

        public void setAutoDelete(boolean autoDelete) {
            this.autoDelete = autoDelete;
        }

        public String getVhost() {
            return vhost;
        }

        public void setVhost(String vhost) {
            this.vhost = vhost;
        }

        public enum Type {
            TOPIC,
            DIRECT,
            FANOUT,
            DEFAULT,
            HEADERS;

            @Override
            public String toString() {
                return super.toString().toLowerCase();
            }
        }
    }
}
