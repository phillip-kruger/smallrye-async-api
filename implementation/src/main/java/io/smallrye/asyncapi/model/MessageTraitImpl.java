package io.smallrye.asyncapi.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.smallrye.asyncapi.api.model.CorrelationId;
import io.smallrye.asyncapi.api.model.ExternalDocs;
import io.smallrye.asyncapi.api.model.MessageBinding;
import io.smallrye.asyncapi.api.model.MessageTrait;
import io.smallrye.asyncapi.api.model.Schema;
import io.smallrye.asyncapi.api.model.Tag;

/**
 * Describes a message received on a given channel and operation.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#messageObject">Message Object</a>
 */
public class MessageTraitImpl implements MessageTrait {

    /**
     * Allows for an external definition of this channel item.
     * The referenced structure MUST be in the format of a Message Trait Object.
     */
    @JsonProperty("$ref")
    private String ref;

    /**
     * Schema definition of the application headers. Schema MUST be of type “object”. It MUST NOT define the protocol headers.
     * Schema Object | Reference Object
     */
    private Schema headers;

    /**
     * Definition of the message payload. It can be of any type but defaults to Schema object.
     */
    private Schema payload;

    /**
     * Definition of the correlation ID used for message tracing or matching.
     * Correlation ID Object | Reference Object
     */
    private CorrelationId correlationId;

    /**
     * A string containing the name of the schema format used to define the message payload.
     * If omitted, implementations should parse the payload as a Schema object.
     * Check out the supported schema formats table for more information.
     * Custom values are allowed but their implementation is OPTIONAL.
     * A custom value MUST NOT refer to one of the schema formats listed in the table.
     */
    private String schemaFormat;

    /**
     * The content type to use when encoding/decoding a message’s payload.
     * The value MUST be a specific media type (e.g. application/json).
     * When omitted, the value MUST be the one specified on the defaultContentType field.
     */
    private String contentType;

    /**
     * A machine-friendly name for the message.
     */
    private String name;

    /**
     * A human-friendly title for the message.
     */
    private String title;

    /**
     * A short summary of what the message is about.
     */
    private String summary;

    /**
     * A verbose explanation of the message. CommonMark syntax can be used for rich text representation.
     */
    private String description;

    /**
     * A list of tags for API documentation control. Tags can be used for logical grouping of messages.
     */
    private List<Tag> tags;

    /**
     * Additional external documentation for this message.
     */
    private ExternalDocs externalDocs;

    /**
     * A free-form map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the message.
     */
    private Map<String, MessageBinding> bindings;

    /**
     * An array with examples of valid message objects.
     */
    private List<Map<String, Object>> examples;

    /**
     * A list of traits to apply to the message object.
     * Traits MUST be merged into the message object using the JSON Merge Patch algorithm in the same order they are defined
     * here.
     * The resulting object MUST be a valid Message Object.
     */
    private List<MessageTrait> traits;

    @Override
    public String getRef() {
        return this.ref;
    }

    @Override
    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public Schema getHeaders() {
        return headers;
    }

    @Override
    public void setHeaders(Schema headers) {
        this.headers = headers;
    }

    @Override
    public CorrelationId getCorrelationId() {
        return correlationId;
    }

    @Override
    public void setCorrelationId(CorrelationId correlationId) {
        this.correlationId = correlationId;
    }

    @Override
    public String getSchemaFormat() {
        return schemaFormat;
    }

    @Override
    public void setSchemaFormat(String schemaFormat) {
        this.schemaFormat = schemaFormat;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getSummary() {
        return summary;
    }

    @Override
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
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
    public Map<String, MessageBinding> getBindings() {
        return bindings;
    }

    @Override
    public void setBindings(Map<String, MessageBinding> bindings) {
        this.bindings = bindings;
    }

    @Override
    public List<Map<String, Object>> getExamples() {
        return examples;
    }

    @Override
    public void setExamples(List<Map<String, Object>> examples) {
        this.examples = examples;
    }

    @Override
    public String toString() {
        return "MessageTrait{" + "headers=" + headers + ", payload=" + payload + ", correlationId=" + correlationId
                + ", schemaFormat=" + schemaFormat + ", contentType=" + contentType + ", name=" + name + ", title=" + title
                + ", summary=" + summary + ", description=" + description + ", tags=" + tags + ", externalDocs=" + externalDocs
                + ", bindings=" + bindings + ", examples=" + examples + ", traits=" + traits + '}';
    }
}
