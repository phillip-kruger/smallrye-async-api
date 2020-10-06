package io.smallrye.asyncapi.api.model.securityscheme;

import io.smallrye.asyncapi.api.model.SecurityScheme;

/**
 * API key.
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#securitySchemeObject">Security Scheme Object</a>
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public interface ApiKey extends SecurityScheme {

    public In getIn();

    public void setIn(In in);

    public enum In {
        user,
        password
    }
}
