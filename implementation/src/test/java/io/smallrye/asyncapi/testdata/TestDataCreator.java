package io.smallrye.asyncapi.testdata;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import io.smallrye.asyncapi.api.model.AsyncAPI;
import io.smallrye.asyncapi.api.model.BindingKey;
import io.smallrye.asyncapi.api.model.Contact;
import io.smallrye.asyncapi.api.model.ExternalDocs;
import io.smallrye.asyncapi.api.model.Info;
import io.smallrye.asyncapi.api.model.License;
import io.smallrye.asyncapi.api.model.Protocol;
import io.smallrye.asyncapi.api.model.SecurityRequirement;
import io.smallrye.asyncapi.api.model.Server;
import io.smallrye.asyncapi.api.model.ServerVariable;
import io.smallrye.asyncapi.api.model.Tag;
import io.smallrye.asyncapi.api.model.binding.server.MqttServerBinding;

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
            Contact contact = new Contact("Phillip Kruger", new URL("http://www.phillip-kruger.com"),
                    "phillip.kruger@redhat.com");
            License license = new License("Apache License 2.0", new URL("http://www.apache.org/licenses/LICENSE-2.0"));
            Info info = new Info("JUnit Test Document",
                    "1.0.0",
                    "Just a test document for JUnit",
                    new URL("http://www.someterms.com/test"),
                    contact,
                    license);

            // Tag
            ExternalDocs tagExternalDocs = new ExternalDocs("tag documentation", new URL("http://www.documentation.com/tag"));
            Tag tag = new Tag("Test AsyncApi", "Some description here", tagExternalDocs);

            // Servers
            Server localhost = new Server("http://localhost:8080", Protocol.HTTP);

            ServerVariable port = new ServerVariable();
            port.addEnumeration("8080");
            port.addEnumeration("8081");
            port.addExample("8080");
            port.addExample("8081");
            port.setDefaultValue("8080");
            port.setDescription("The port");
            ServerVariable path = new ServerVariable();
            Map<String, ServerVariable> serverVariables = new HashMap<>();
            serverVariables.put("port", port);
            serverVariables.put("path", path);
            SecurityRequirement securityRequirement = new SecurityRequirement("oauth");

            MqttServerBinding mqttBinding = new MqttServerBinding("guest", true,
                    new MqttServerBinding.LastWill("/last-wills", 2, false), 60, "0.1.0");
            Server test = new Server("http://www.test.com:{port}/{path}", Protocol.MQTT, "MQTT 3.1.1",
                    "The test server", serverVariables, securityRequirement);
            test.addBinding(BindingKey.mqtt, mqttBinding);

            Map<String, Server> servers = new HashMap<>();
            servers.put("localhost", localhost);
            servers.put("test", test);

            // Components
            //Components components = new Components();

            // Channels
            //Map<URI, ChannelItem> channels = new HashMap<>();

            // AsyncAPI
            full = new AsyncAPI();
            full.setAsyncapi("2.0.0");
            full.setId("io.smallrye.asyncapi.test");
            full.setInfo(info);
            full.setTags(Collections.singletonList(tag));
            full.setExternalDocs(new ExternalDocs("documentation", new URL("http://www.documentation.com/")));
            full.setServers(servers);
            //full.setComponents(components);
            //full.setChannels(channels);

        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
