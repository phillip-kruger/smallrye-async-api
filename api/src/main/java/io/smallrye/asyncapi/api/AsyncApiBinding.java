package io.smallrye.asyncapi.api;

import io.smallrye.asyncapi.api.model.AsyncAPI;

/**
 * Bind objects to and from a document
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public interface AsyncApiBinding {

    public String toString(AsyncAPI asyncAPI);

    public AsyncAPI fromString(String document);
}
