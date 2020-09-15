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
public interface Operation {

    public String getOperationId();

    public void setOperationId(String operationId);

    public String getSummary();

    public void setSummary(String summary);

    public String getDescription();

    public void setDescription(String description);

    public List<Tag> getTags();

    public void setTags(List<Tag> tags);

    public ExternalDocs getExternalDocs();

    public void setExternalDocs(ExternalDocs externalDocs);

    public Map<String, OperationBinding> getBindings();

    public void setBindings(Map<String, OperationBinding> bindings);

    public List<OperationTraits> getTraits();

    public void setTraits(List<OperationTraits> traits);

    public Message getMessage();

    public void setMessage(Message message);

}
