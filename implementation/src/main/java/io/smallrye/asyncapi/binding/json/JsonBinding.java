package io.smallrye.asyncapi.binding.json;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import io.smallrye.asyncapi.api.AsyncApiBinding;
import io.smallrye.asyncapi.api.model.AsyncAPI;

/**
 * Bind AsyncAPI to and from Json.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class JsonBinding implements AsyncApiBinding {

    private static JsonbConfig jsonbConfig = new JsonbConfig()
            .withFormatting(true)
            .withSerializers(new ServerBindingSerializer())
            .withDeserializers(new ServerBindingDeserializer());

    private static final Jsonb JSONB = JsonbBuilder.create(jsonbConfig);

    @Override
    public String toString(AsyncAPI asyncAPI) {
        return JSONB.toJson(asyncAPI);
    }

    @Override
    public AsyncAPI fromString(String document) {
        return JSONB.fromJson(document, AsyncAPI.class);
    }

}
