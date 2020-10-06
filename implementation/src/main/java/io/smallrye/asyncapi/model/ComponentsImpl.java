package io.smallrye.asyncapi.model;

import java.util.Map;

import io.smallrye.asyncapi.api.model.ChannelBinding;
import io.smallrye.asyncapi.api.model.Components;
import io.smallrye.asyncapi.api.model.CorrelationId;
import io.smallrye.asyncapi.api.model.Message;
import io.smallrye.asyncapi.api.model.MessageBinding;
import io.smallrye.asyncapi.api.model.MessageTrait;
import io.smallrye.asyncapi.api.model.OperationBinding;
import io.smallrye.asyncapi.api.model.OperationTraits;
import io.smallrye.asyncapi.api.model.Parameter;
import io.smallrye.asyncapi.api.model.Schema;
import io.smallrye.asyncapi.api.model.SecurityScheme;
import io.smallrye.asyncapi.api.model.ServerBinding;

/**
 * Holds a set of reusable objects for different aspects of the AsyncAPI specification.
 * All objects defined within the components object will have no effect on the API unless
 * they are explicitly referenced from properties outside the components object.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#componentsObject">Components Object</a>
 */
public class ComponentsImpl implements Components {

    private Map<String, Schema> schemas;
    private Map<String, Message> messages;
    private Map<String, SecurityScheme> securitySchemes;
    private Map<String, Parameter> parameters;
    private Map<String, CorrelationId> correlationIds;
    private Map<String, OperationTraits> operationTraits;
    private Map<String, MessageTrait> messageTraits;
    private Map<String, ServerBinding> serverBindings;
    private Map<String, ChannelBinding> channelBindings;
    private Map<String, OperationBinding> operationBindings;
    private Map<String, MessageBinding> messageBindings;

    @Override
    public Map<String, Schema> getSchemas() {
        return schemas;
    }

    @Override
    public void setSchemas(Map<String, Schema> schemas) {
        this.schemas = schemas;
    }

    @Override
    public Map<String, Message> getMessages() {
        return messages;
    }

    @Override
    public void setMessages(Map<String, Message> messages) {
        this.messages = messages;
    }

    @Override
    public Map<String, SecurityScheme> getSecuritySchemes() {
        return securitySchemes;
    }

    @Override
    public void setSecuritySchemes(Map<String, SecurityScheme> securitySchemes) {
        this.securitySchemes = securitySchemes;
    }

    @Override
    public Map<String, Parameter> getParameters() {
        return parameters;
    }

    @Override
    public void setParameters(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public Map<String, CorrelationId> getCorrelationIds() {
        return correlationIds;
    }

    @Override
    public void setCorrelationIds(Map<String, CorrelationId> correlationIds) {
        this.correlationIds = correlationIds;
    }

    @Override
    public Map<String, OperationTraits> getOperationTraits() {
        return operationTraits;
    }

    @Override
    public void setOperationTraits(Map<String, OperationTraits> operationTraits) {
        this.operationTraits = operationTraits;
    }

    @Override
    public Map<String, MessageTrait> getMessageTraits() {
        return messageTraits;
    }

    @Override
    public void setMessageTraits(Map<String, MessageTrait> messageTraits) {
        this.messageTraits = messageTraits;
    }

    @Override
    public Map<String, ServerBinding> getServerBindings() {
        return serverBindings;
    }

    @Override
    public void setServerBindings(Map<String, ServerBinding> serverBindings) {
        this.serverBindings = serverBindings;
    }

    @Override
    public Map<String, ChannelBinding> getChannelBindings() {
        return channelBindings;
    }

    @Override
    public void setChannelBindings(Map<String, ChannelBinding> channelBindings) {
        this.channelBindings = channelBindings;
    }

    @Override
    public Map<String, OperationBinding> getOperationBindings() {
        return operationBindings;
    }

    @Override
    public void setOperationBindings(Map<String, OperationBinding> operationBindings) {
        this.operationBindings = operationBindings;
    }

    @Override
    public Map<String, MessageBinding> getMessageBindings() {
        return messageBindings;
    }

    @Override
    public void setMessageBindings(Map<String, MessageBinding> messageBindings) {
        this.messageBindings = messageBindings;
    }

    @Override
    public String toString() {
        return "Components{" + "schemas=" + schemas + ", messages=" + messages + ", securitySchemes=" + securitySchemes
                + ", parameters=" + parameters + ", correlationIds=" + correlationIds + ", operationTraits=" + operationTraits
                + ", messageTraits=" + messageTraits + ", serverBindings=" + serverBindings + ", channelBindings="
                + channelBindings + ", operationBindings=" + operationBindings + ", messageBindings=" + messageBindings + "}";
    }
}
