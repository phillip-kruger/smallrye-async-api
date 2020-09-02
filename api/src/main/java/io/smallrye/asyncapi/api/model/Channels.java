package io.smallrye.asyncapi.api.model;

import java.net.URI;
import java.util.Map;

/**
 * Holds the relative paths to the individual channel and their operations. Channel paths are relative to servers.
 * Channels are also known as “topics”, “routing keys”, “event types” or “paths”.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 *         see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#channelsObject">Channels Object</a>
 */
public class Channels {

    /**
     * A relative path to an individual channel.
     * Query parameters and fragments SHALL NOT be used, instead use bindings to define them.
     */
    private Map<URI, ChannelItem> channelItems;

    public Map<URI, ChannelItem> getChannelItems() {
        return channelItems;
    }

    public void setChannelItems(Map<URI, ChannelItem> channelItems) {
        this.channelItems = channelItems;
    }

    @Override
    public String toString() {
        return "Channels{" + "channelItems=" + channelItems + '}';
    }
}
