package io.smallrye.asyncapi.binding;

import io.smallrye.asyncapi.api.AsyncApiBinding;
import io.smallrye.asyncapi.api.model.AsyncAPI;

/**
 * Bind AsyncAPI to and from Json.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class JsonBinding implements AsyncApiBinding {

    @Override
    public String toString(AsyncAPI asyncAPI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsyncAPI fromString(String document) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
