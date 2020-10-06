package io.smallrye.asyncapi.api.model;

import java.util.List;
import java.util.Map;

/**
 * Describes a trait that MAY be applied to a Message Object. This object MAY contain any property from the Message Object,
 * except payload and traits.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#messageTraitObject">Message Trait Object</a>
 */
public interface MessageTrait extends Referencable {

    public Schema getHeaders();

    public void setHeaders(Schema headers);

    public CorrelationId getCorrelationId();

    public void setCorrelationId(CorrelationId correlationId);

    public String getSchemaFormat();

    public void setSchemaFormat(String schemaFormat);

    public String getContentType();

    public void setContentType(String contentType);

    public String getName();

    public void setName(String name);

    public String getTitle();

    public void setTitle(String title);

    public String getSummary();

    public void setSummary(String summary);

    public String getDescription();

    public void setDescription(String description);

    public List<Tag> getTags();

    public void setTags(List<Tag> tags);

    public ExternalDocs getExternalDocs();

    public void setExternalDocs(ExternalDocs externalDocs);

    public Map<String, MessageBinding> getBindings();

    public void setBindings(Map<String, MessageBinding> bindings);

    public List<Map<String, Object>> getExamples();

    public void setExamples(List<Map<String, Object>> examples);
}
