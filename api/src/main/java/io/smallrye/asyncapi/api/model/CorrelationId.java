package io.smallrye.asyncapi.api.model;

/**
 * Correlation Id
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0#correlationIdObject">Correlation Id Object</a>
 */
public interface CorrelationId {

    public String getDescription();

    public void setDescription(String description);
}
