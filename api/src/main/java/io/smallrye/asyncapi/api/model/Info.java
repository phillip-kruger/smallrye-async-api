package io.smallrye.asyncapi.api.model;

import java.net.URL;

/**
 * The object provides metadata about the API. The metadata can be used by the clients if needed.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#infoObject">Info Object</a>
 * 
 */
public interface Info {

    public String getTitle();

    public void setTitle(String title);

    public String getVersion();

    public void setVersion(String version);

    public String getDescription();

    public void setDescription(String description);

    public URL getTermsOfService();

    public void setTermsOfService(URL termsOfService);

    public Contact getContact();

    public void setContact(Contact contact);

    public License getLicense();

    public void setLicense(License license);
}
