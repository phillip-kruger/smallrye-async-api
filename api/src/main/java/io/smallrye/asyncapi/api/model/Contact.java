package io.smallrye.asyncapi.api.model;

import java.net.URL;

/**
 * Contact information for the exposed API.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://www.asyncapi.com/docs/specifications/2.0.0/#contactObject">Contact Object</a>
 * 
 */
public class Contact {

    /**
     * The identifying name of the contact person/organization.
     */
    private String name;

    /**
     * The URL pointing to the contact information. MUST be in the format of a URL.
     */
    private URL url;

    /**
     * The email address of the contact person/organization.
     */
    private String email;

    public Contact() {
    }

    public Contact(String name, URL url, String email) {
        this.name = name;
        this.url = url;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", url=" + url + ", email=" + email + '}';
    }
}
