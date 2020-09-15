package io.smallrye.asyncapi.model;

import java.net.URL;

import io.smallrye.asyncapi.api.model.Contact;
import io.smallrye.asyncapi.api.model.Info;
import io.smallrye.asyncapi.api.model.License;

/**
 * The object provides metadata about the API. The metadata can be used by the clients if needed.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#infoObject">Info Object</a>
 * 
 */
public class InfoImpl implements Info {

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

    public InfoImpl() {
    }

    public InfoImpl(String title) {
        this.title = title;
    }

    public InfoImpl(String title, String version, String description, URL termsOfService) {
        this.title = title;
        this.version = version;
        this.description = description;
        this.termsOfService = termsOfService;
    }

    public InfoImpl(String title, String version, String description, URL termsOfService, Contact contact, License license) {
        this.title = title;
        this.version = version;
        this.description = description;
        this.termsOfService = termsOfService;
        this.contact = contact;
        this.license = license;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public URL getTermsOfService() {
        return termsOfService;
    }

    @Override
    public void setTermsOfService(URL termsOfService) {
        this.termsOfService = termsOfService;
    }

    @Override
    public Contact getContact() {
        return contact;
    }

    @Override
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public License getLicense() {
        return license;
    }

    @Override
    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Info{" + "title=" + title + ", version=" + version + ", description=" + description + ", termsOfService="
                + termsOfService + ", contact=" + contact + ", license=" + license + '}';
    }
}
