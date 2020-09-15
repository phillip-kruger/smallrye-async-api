package io.smallrye.asyncapi.api.model;

import java.util.List;
import java.util.Map;

/**
 * Main Object that models an AsyncAPI Document.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#A2SObject">AsyncAPI Object</a>
 */
public interface AsyncAPI {

    public String getAsyncapi();

    public void setAsyncapi(String asyncapi);

    public String getId();

    public void setId(String id);

    public Info getInfo();

    public void setInfo(Info info);

    public Map<String, Server> getServers();

    public void setServers(Map<String, Server> servers);

    public Map<String, ChannelItem> getChannels();

    public void setChannels(Map<String, ChannelItem> channels);

    public Components getComponents();

    public void setComponents(Components components);

    public List<Tag> getTags();

    public void setTags(List<Tag> tags);

    public ExternalDocs getExternalDocs();

    public void setExternalDocs(ExternalDocs externalDocs);
}
