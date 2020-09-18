package io.smallrye.asyncapi.model;

import java.util.List;
import java.util.Map;

import io.smallrye.asyncapi.api.model.ExternalDocs;
import io.smallrye.asyncapi.api.model.OperationBinding;
import io.smallrye.asyncapi.api.model.OperationTraits;
import io.smallrye.asyncapi.api.model.Tag;

/**
 * Describes a trait that MAY be applied to an Operation Object.
 * This object MAY contain any property from the Operation Object, except message and traits.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#operationTraitObject">Operation Trait Object</a>
 */
public class OperationTraitsImpl implements OperationTraits {

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

    @Override
    public String getOperationId() {
        return operationId;
    }

    @Override
    public void setOperationId(String operationId) {
        this.operationId = operationId;
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
    public Map<String, OperationBinding> getBindings() {
        return bindings;
    }

    @Override
    public void setBindings(Map<String, OperationBinding> bindings) {
        this.bindings = bindings;
    }

    @Override
    public String toString() {
        return "OperationTraits{" + "operationId=" + operationId + ", summary=" + summary + ", description=" + description
                + ", tags="
                + tags + ", externalDocs=" + externalDocs + ", bindings=" + bindings + "}";
    }
}
