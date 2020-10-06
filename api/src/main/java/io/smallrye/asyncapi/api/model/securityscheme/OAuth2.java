package io.smallrye.asyncapi.api.model.securityscheme;

import io.smallrye.asyncapi.api.model.SecurityScheme;

/**
 * OAuth2
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#securitySchemeObject">Security Scheme Object</a>
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public interface OAuth2 extends SecurityScheme {

    public OAuthFlow getFlows();

    public void setFlows(OAuthFlow flows);
}
