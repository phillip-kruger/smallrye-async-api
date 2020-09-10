package io.smallrye.asyncapi.binding.json;

import java.lang.reflect.Type;

import javax.json.bind.JsonbException;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.stream.JsonParser;

import io.smallrye.asyncapi.api.model.ServerBinding;

/**
 * Allow the Server Binding interface to de-serialize correctly
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class ServerBindingDeserializer implements JsonbDeserializer<ServerBinding> {

    @Override
    public ServerBinding deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
        parser.next();
        String className = parser.getString();
        parser.next();
        try {
            return ctx.deserialize(Class.forName(className).asSubclass(ServerBinding.class), parser);
        } catch (ClassNotFoundException e) {
            throw new JsonbException("Cannot deserialize " + className + " [" + e.getMessage() + "]");
        }
    }
}
