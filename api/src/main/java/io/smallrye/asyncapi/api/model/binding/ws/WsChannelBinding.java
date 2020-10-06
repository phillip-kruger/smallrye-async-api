package io.smallrye.asyncapi.api.model.binding.ws;

import io.smallrye.asyncapi.api.model.ChannelBinding;
import io.smallrye.asyncapi.api.model.Schema;

/**
 * When using WebSockets, the channel represents the connection.
 * Unlike other protocols that support multiple virtual channels (topics, routing keys, etc.) per connection,
 * WebSockets doesn't support virtual channels or, put it another way, there's only one channel and its
 * characteristics are strongly related to the protocol used for the handshake, i.e., HTTP.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/websockets/README.md#channel">Websocket Channel Bindings
 *      Object</a>
 */
public interface WsChannelBinding extends ChannelBinding {
    public Method getMethod();

    public void setMethod(Method method);

    public Schema getQuery();

    public void setQuery(Schema query);

    public Schema getHeaders();

    public void setHeaders(Schema headers);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);

    public enum Method {
        GET,
        POST
    }
}
