package io.smallrye.asyncapi.model;

import java.util.List;
import java.util.Map;

import io.smallrye.asyncapi.api.model.AsyncAPI;
import io.smallrye.asyncapi.api.model.ChannelItem;
import io.smallrye.asyncapi.api.model.Components;
import io.smallrye.asyncapi.api.model.ExternalDocs;
import io.smallrye.asyncapi.api.model.Info;
import io.smallrye.asyncapi.api.model.Server;
import io.smallrye.asyncapi.api.model.Tag;

/**
 * Main Object that models an AsyncAPI Document.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#A2SObject">AsyncAPI Object</a>
 */
public class AsyncAPIImpl implements AsyncAPI {

    /**
     * The version string signifies the version of the AsyncAPI Specification that the document complies to.
     * The format for this string must be major.minor.patch. The patch may be suffixed by a hyphen and extra alphanumeric
     * characters.
     */
    private String asyncapi;

    /**
     * This field represents a unique universal identifier of the application the AsyncAPI document is defining.
     * It must conform to the URI format, according to RFC3986.
     * It is RECOMMENDED to use a URN to globally and uniquely identify the application during long periods of time,
     * even after it becomes unavailable or ceases to exist.
     */
    private String id;

    /**
     * A string representing the default content type to use when encoding/decoding a message’s payload.
     * The value MUST be a specific media type (e.g. application/json). This value MUST be used by schema parsers when the
     * contentType property is omitted.
     * In case a message can’t be encoded/decoded using this value, schema parsers MUST use their default content type.
     */
    private String defaultContentType;

    /**
     * The object provides metadata about the API. The metadata can be used by the clients if needed.
     */
    private Info info;

    /**
     * Map of Server Objects.
     */
    private Map<String, Server> servers;

    /**
     * Holds the relative paths to the individual channel and their operations. Channel paths are relative to servers.
     * Channels are also known as “topics”, “routing keys”, “event types” or “paths”.
     */
    private Map<String, ChannelItem> channels;

    /**
     * Holds a set of reusable objects for different aspects of the AsyncAPI specification.
     * All objects defined within the components object will have no effect on the API unless they are explicitly
     * referenced from properties outside the components object.
     */
    private Components components;

    /**
     * A list of tags used by the specification with additional metadata. Each tag name in the list MUST be unique.
     */
    private List<Tag> tags;

    /**
     * Allows referencing an external resource for extended documentation.
     */
    private ExternalDocs externalDocs;

    @Override
    public String getAsyncapi() {
        return asyncapi;
    }

    @Override
    public void setAsyncapi(String asyncapi) {
        this.asyncapi = asyncapi;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getDefaultContentType() {
        return this.defaultContentType;
    }

    @Override
    public void setDefaultContentType(String defaultContentType) {
        this.defaultContentType = defaultContentType;
    }

    @Override
    public Info getInfo() {
        return info;
    }

    @Override
    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public Map<String, Server> getServers() {
        return servers;
    }

    @Override
    public void setServers(Map<String, Server> servers) {
        this.servers = servers;
    }

    @Override
    public Map<String, ChannelItem> getChannels() {
        return channels;
    }

    @Override
    public void setChannels(Map<String, ChannelItem> channels) {
        this.channels = channels;
    }

    @Override
    public Components getComponents() {
        return components;
    }

    @Override
    public void setComponents(Components components) {
        this.components = components;
    }

    @Override
    public List<Tag> getTags() {
        return tags;
    }

    @Override
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public ExternalDocs getExternalDocs() {
        return externalDocs;
    }

    @Override
    public void setExternalDocs(ExternalDocs externalDocs) {
        this.externalDocs = externalDocs;
    }

    @Override
    public String toString() {
        return "AsyncAPI{" + "asyncapi=" + asyncapi + ", id=" + id + ", info=" + info + ", servers=" + servers + ", channels="
                + channels + ", components=" + components + ", tags=" + tags + ", externalDocs=" + externalDocs + '}';
    }

}
