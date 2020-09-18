package io.smallrye.asyncapi.api.model;

import java.util.List;
import java.util.Map;

/**
 * Describes a trait that MAY be applied to an Operation Object.
 * This object MAY contain any property from the Operation Object, except message and traits.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#operationTraitObject">Operation Trait Object</a>
 */
public interface OperationTraits {

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

}
