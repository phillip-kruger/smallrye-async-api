package io.smallrye.asyncapi.binding.json;

import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

import io.smallrye.asyncapi.api.model.ServerBinding;

/**
 * Allow the Server Binding interface to serialize correctly
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class ServerBindingSerializer implements JsonbSerializer<ServerBinding> {

    @Override
    public void serialize(ServerBinding serverBinding, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize(serverBinding.getClass().getName(), serverBinding, generator);
        generator.writeEnd();
    }
}
