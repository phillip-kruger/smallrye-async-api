package io.smallrye.asyncapi.api.model;

/**
 * Some object can be referenced rather that containing the info they contain a link to the info
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public interface Referencable {
    public String getRef();

    public void setRef(String ref);
}
