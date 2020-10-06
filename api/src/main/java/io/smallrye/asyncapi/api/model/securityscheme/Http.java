package io.smallrye.asyncapi.api.model.securityscheme;

import io.smallrye.asyncapi.api.model.SecurityScheme;

/**
 * Http Security
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#securitySchemeObject">Security Scheme Object</a>
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public interface Http extends SecurityScheme {

    public String getScheme();

    public void setScheme(String scheme);

    public String getBearerFormat();

    public void setBearerFormat(String bearerFormat);
}
