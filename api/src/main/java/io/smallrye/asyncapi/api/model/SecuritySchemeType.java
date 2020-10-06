package io.smallrye.asyncapi.api.model;

/**
 * Security Scheme Types
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#securitySchemeObject">Security Scheme Object</a>
 */
public enum SecuritySchemeType {
    userPassword,
    apiKey,
    X509,
    symmetricEncryption,
    asymmetricEncryption,
    httpApiKey,
    http,
    oauth2,
    openIdConnect
}
