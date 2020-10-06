package io.smallrye.asyncapi.api.model.securityscheme;

import java.net.URL;

import io.smallrye.asyncapi.api.model.SecurityScheme;

/**
 * OpenId Connect
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#securitySchemeObject">Security Scheme Object</a>
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public interface OpenIdConnect extends SecurityScheme {

    public URL getOpenIdConnectUrl();

    public void setOpenIdConnectUrl(URL url);
}
