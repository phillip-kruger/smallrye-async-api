package io.smallrye.asyncapi.api.model;

import java.util.List;
import java.util.Map;

/**
 * Describes a publish or a subscribe operation.
 * This provides a place to document how and why messages are sent and received.
 * 
 * For example, an operation might describe a chat application use case where a user sends a text message to a group.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#operationObject">Operation Object</a>
 */
public class Operation {

    /**
     * Unique string used to identify the operation.
     * The id MUST be unique among all operations described in the API. The operationId value is case-sensitive.
     * Tools and libraries MAY use the operationId to uniquely identify an operation, therefore, it is RECOMMENDED to follow
     * common programming naming conventions.
     */
    private String operationId;

    /**
     * A short summary of what the operation is about.
     */
    private String summary;

    /**
     * A verbose explanation of the operation. CommonMark syntax can be used for rich text representation.
     */
    private String description;

    /**
     * A list of tags for API documentation control. Tags can be used for logical grouping of operations.
     */
    private List<Tag> tags;

    /**
     * Additional external documentation for this operation.
     */
    private ExternalDocs externalDocs;

    /**
     * A free-form map where the keys describe the name of the protocol and the values describe protocol-specific definitions
     * for the operation.
     */
    private Map<String, OperationBinding> bindings;

    /**
     * A list of traits to apply to the operation object.
     * Traits MUST be merged into the operation object using the JSON Merge Patch algorithm in the same order they are defined
     * here.
     */
    private List<OperationTraits> traits;

    /**
     * A definition of the message that will be published or received on this channel.
     * oneOf is allowed here to specify multiple messages, however, a message MUST be valid only against one of the referenced
     * message objects.
     */
    private Message message;

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ExternalDocs getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocs externalDocs) {
        this.externalDocs = externalDocs;
    }

    public Map<String, OperationBinding> getBindings() {
        return bindings;
    }

    public void setBindings(Map<String, OperationBinding> bindings) {
        this.bindings = bindings;
    }

    public List<OperationTraits> getTraits() {
        return traits;
    }

    public void setTraits(List<OperationTraits> traits) {
        this.traits = traits;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Operation{" + "operationId=" + operationId + ", summary=" + summary + ", description=" + description + ", tags="
                + tags + ", externalDocs=" + externalDocs + ", bindings=" + bindings + ", traits=" + traits + ", message="
                + message + '}';
    }
}
