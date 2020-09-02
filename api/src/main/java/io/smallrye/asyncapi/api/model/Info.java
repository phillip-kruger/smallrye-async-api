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
public class Info {

    /**
     * Required. The title of the application.
     */
    private String title;

    /**
     * Required. Provides the version of the application API (not to be confused with the specification version).
     */
    private String version;

    /**
     * A short description of the application. CommonMark syntax can be used for rich text representation.
     */
    private String description;

    /**
     * A URL to the Terms of Service for the API.
     */
    private URL termsOfService;

    /**
     * The contact information for the exposed API.
     */
    private Contact contact;

    /**
     * The license information for the exposed API.
     */
    private License license;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getTermsOfService() {
        return termsOfService;
    }

    public void setTermsOfService(URL termsOfService) {
        this.termsOfService = termsOfService;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Info{" + "title=" + title + ", version=" + version + ", description=" + description + ", termsOfService="
                + termsOfService + ", contact=" + contact + ", license=" + license + '}';
    }
}
