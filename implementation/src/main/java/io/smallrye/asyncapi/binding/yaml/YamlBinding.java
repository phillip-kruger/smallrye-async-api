package io.smallrye.asyncapi.binding.yaml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import io.smallrye.asyncapi.api.AsyncApiBinding;
import io.smallrye.asyncapi.api.model.AsyncAPI;

/**
 * Bind AsyncAPI to and from Yaml.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class YamlBinding implements AsyncApiBinding {

    ObjectMapper om = new ObjectMapper(new YAMLFactory());

    @Override
    public String toString(AsyncAPI asyncAPI) {
        try {
            return om.writeValueAsString(asyncAPI);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public AsyncAPI fromString(String document) {
        try {
            return om.readValue(document, AsyncAPI.class);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }
}
