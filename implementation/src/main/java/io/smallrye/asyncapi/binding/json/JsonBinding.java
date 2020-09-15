package io.smallrye.asyncapi.binding.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.smallrye.asyncapi.api.AsyncApiBinding;
import io.smallrye.asyncapi.api.model.AsyncAPI;

/**
 * Bind AsyncAPI to and from Json.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class JsonBinding implements AsyncApiBinding {

    private final ObjectMapper mapper;

    public JsonBinding() {
        this.mapper = new ObjectMapper();
        this.mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Override
    public String toString(AsyncAPI asyncAPI) {
        try {
            return mapper.writeValueAsString(asyncAPI);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public AsyncAPI fromString(String document) {
        try {
            return mapper.readValue(document, AsyncAPI.class);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }
}
