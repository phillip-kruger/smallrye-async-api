package io.smallrye.asyncapi.api.model;

import java.util.List;

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

    public ChannelBindings getBindings();

    public void setBindings(ChannelBindings bindings);
}
