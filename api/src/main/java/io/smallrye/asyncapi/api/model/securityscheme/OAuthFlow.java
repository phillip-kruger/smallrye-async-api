package io.smallrye.asyncapi.api.model.securityscheme;

import java.net.URL;
import java.util.Map;

/**
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0#oauthFlowObject">OAuth Flow Object</a>
 */
public interface OAuthFlow {

    public URL getAuthorizationUrl();

    public void setAuthorizationUrl(URL authorizationUrl);

    public URL getTokenUrl();

    public void setTokenUrl(URL tokenUrl);

    public URL getRefreshUrl();

    public void setRefreshUrl(URL refreshUrl);

    public Map<String, String> getScopes();

    public void setScopes(Map<String, String> scopes);
}
