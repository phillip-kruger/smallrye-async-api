package io.smallrye.asyncapi.api.model;

import java.util.Map;

/**
 * Holds a set of reusable objects for different aspects of the AsyncAPI specification.
 * All objects defined within the components object will have no effect on the API unless
 * they are explicitly referenced from properties outside the components object.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#componentsObject">Components Object</a>
 */
public interface Components {

    // Schema or reference 
    public Map<String, Schema> getSchemas();

    public void setSchemas(Map<String, Schema> schemas);

    // Message or reference
    public Map<String, Message> getMessages();

    public void setMessages(Map<String, Message> messages);

    // SecurityScheme or reference
    public Map<String, SecurityScheme> getSecuritySchemes();

    public void setSecuritySchemes(Map<String, SecurityScheme> securitySchemes);

    // Parameter or reference
    public Map<String, Parameter> getParameters();

    public void setParameters(Map<String, Parameter> parameters);

    // CorrelationId or reference
    public Map<String, CorrelationId> getCorrelationIds();

    public void setCorrelationIds(Map<String, CorrelationId> correlationIds);

    public Map<String, OperationTraits> getOperationTraits();

    public void setOperationTraits(Map<String, OperationTraits> operationTraits);

    public Map<String, MessageTrait> getMessageTraits();

    public void setMessageTraits(Map<String, MessageTrait> messageTraits);

    public Map<String, ServerBinding> getServerBindings();

    public void setServerBindings(Map<String, ServerBinding> serverBindings);

    public Map<String, ChannelBinding> getChannelBindings();

    public void setChannelBindings(Map<String, ChannelBinding> channelBindings);

    public Map<String, OperationBinding> getOperationBindings();

    public void setOperationBindings(Map<String, OperationBinding> operationBindings);

    public Map<String, MessageBinding> getMessageBindings();

    public void setMessageBindings(Map<String, MessageBinding> messageBindings);
}
