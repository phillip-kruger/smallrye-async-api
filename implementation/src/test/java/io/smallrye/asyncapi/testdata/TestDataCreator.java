package io.smallrye.asyncapi.testdata;

import java.net.MalformedURLException;
import java.net.URL;

import io.smallrye.asyncapi.api.model.AsyncAPI;
import io.smallrye.asyncapi.api.model.Contact;
import io.smallrye.asyncapi.api.model.Info;
import io.smallrye.asyncapi.api.model.License;

/**
 * Creating some test data
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class TestDataCreator {

    private TestDataCreator() {
    }

    public static AsyncAPI full;

    static {

        try {
            Contact contact = new Contact();
            contact.setName("Phillip Kruger");
            contact.setEmail("phillip.kruger@redhat.com");
            contact.setUrl(new URL("http://www.phillip-kruger.com"));

            License license = new License();
            license.setName("Apache License 2.0");
            license.setUrl(new URL("http://www.apache.org/licenses/LICENSE-2.0"));

            Info info = new Info();
            info.setTitle("JUnit Test Document");
            info.setVersion("1.0.0");
            info.setDescription("Just a test document for JUnit");
            info.setTermsOfService(new URL("http://www.someterms.com/test"));
            info.setContact(contact);
            info.setLicense(license);

            full = new AsyncAPI();
            full.setAsyncapi("2.0.0");
            full.setId("io.smallrye.asyncapi.test");
            full.setInfo(info);

        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
