package io.smallrye.asyncapi.binding;

import org.yaml.snakeyaml.Yaml;

import io.smallrye.asyncapi.api.AsyncApiBinding;
import io.smallrye.asyncapi.api.model.AsyncAPI;

/**
 * Bind AsyncAPI to and from Yaml.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class YamlBinding implements AsyncApiBinding {

    @Override
    public String toString(AsyncAPI asyncAPI) {
        Yaml yaml = new Yaml();
        return yaml.dump(asyncAPI);
    }

    @Override
    public AsyncAPI fromString(String document) {
        Yaml yaml = new Yaml();
        return yaml.loadAs(document, AsyncAPI.class);
    }

}
