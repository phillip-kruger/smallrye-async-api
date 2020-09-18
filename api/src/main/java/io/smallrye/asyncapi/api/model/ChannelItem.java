package io.smallrye.asyncapi.api.model;

import java.util.List;
import java.util.Map;

/**
 * Describes the operations available on a single channel.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#channelItemObject">Channel Item Object</a>
 */
public interface ChannelItem {

    public String getRef();

    public void setRef(String ref);

    public String getDescription();

    public void setDescription(String description);

    public Operation getSubscribe();

    public void setSubscribe(Operation subscribe);

    public Operation getPublish();

    public void setPublish(Operation publish);

    public List<Parameter> getParameters();

    public void setParameters(List<Parameter> parameters);

    public Map<String, ChannelBinding> getBindings();

    public void setBindings(Map<String, ChannelBinding> bindings);
}
