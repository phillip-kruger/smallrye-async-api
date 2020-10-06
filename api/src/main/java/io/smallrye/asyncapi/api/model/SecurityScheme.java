package io.smallrye.asyncapi.api.model;

/**
 * Defines a security scheme that can be used by the operations. Supported schemes are:
 * 
 * - User/Password.
 * - API key (either as user or as password).
 * - X.509 certificate.
 * - End-to-end encryption (either symmetric or asymmetric).
 * - HTTP authentication.
 * - HTTP API key.
 * - OAuth2’s common flows (Implicit, Resource Owner Protected Credentials, Client Credentials and Authorization Code) as
 * defined in RFC6749.
 * - OpenID Connect Discovery.
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#securitySchemeObject">Security Scheme Object</a>
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public interface SecurityScheme extends Referencable {

    public SecuritySchemeType getType();

    public void setType(SecuritySchemeType type);

    public String getDescription();

    public void setDescription(String description);
}
