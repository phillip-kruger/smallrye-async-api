package io.smallrye.asyncapi.testdata;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.smallrye.asyncapi.api.model.AsyncAPI;
import io.smallrye.asyncapi.api.model.BindingKey;
import io.smallrye.asyncapi.api.model.ChannelBinding;
import io.smallrye.asyncapi.api.model.ChannelItem;
import io.smallrye.asyncapi.api.model.Components;
import io.smallrye.asyncapi.api.model.Contact;
import io.smallrye.asyncapi.api.model.ExternalDocs;
import io.smallrye.asyncapi.api.model.Info;
import io.smallrye.asyncapi.api.model.License;
import io.smallrye.asyncapi.api.model.Operation;
import io.smallrye.asyncapi.api.model.Parameter;
import io.smallrye.asyncapi.api.model.Protocol;
import io.smallrye.asyncapi.api.model.SecurityRequirement;
import io.smallrye.asyncapi.api.model.Server;
import io.smallrye.asyncapi.api.model.ServerVariable;
import io.smallrye.asyncapi.api.model.Tag;
import io.smallrye.asyncapi.api.model.binding.server.LastWill;
import io.smallrye.asyncapi.api.model.binding.server.MqttServerBinding;
import io.smallrye.asyncapi.model.AsyncAPIImpl;
import io.smallrye.asyncapi.model.ChannelItemImpl;
import io.smallrye.asyncapi.model.ContactImpl;
import io.smallrye.asyncapi.model.ExternalDocsImpl;
import io.smallrye.asyncapi.model.InfoImpl;
import io.smallrye.asyncapi.model.LicenseImpl;
import io.smallrye.asyncapi.model.SecurityRequirementImpl;
import io.smallrye.asyncapi.model.ServerImpl;
import io.smallrye.asyncapi.model.ServerVariableImpl;
import io.smallrye.asyncapi.model.TagImpl;
import io.smallrye.asyncapi.model.binding.server.LastWillImpl;
import io.smallrye.asyncapi.model.binding.server.MqttServerBindingImpl;

/**
 * Creating some test data
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class TestDataCreator {

    private TestDataCreator() {
    }

    public static AsyncAPI full = createAsyncAPI();

    private static AsyncAPI createAsyncAPI() {
        try {
            // AsyncAPI
            AsyncAPI asyncAPI = new AsyncAPIImpl();
            asyncAPI.setAsyncapi("2.0.0");
            asyncAPI.setId("io.smallrye.asyncapi.test");
            asyncAPI.setDefaultContentType("application/json");
            asyncAPI.setInfo(createInfo());
            asyncAPI.setTags(createRootTags());
            asyncAPI.setExternalDocs(new ExternalDocsImpl("documentation", new URL("http://www.documentation.com/")));
            asyncAPI.setServers(createServers());
            asyncAPI.setComponents(createComponents());
            asyncAPI.setChannels(createChannels());
            return asyncAPI;
        } catch (MalformedURLException | URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static Map<String, ChannelItem> createChannels() throws URISyntaxException {
        Map<String, ChannelItem> channels = new HashMap<>();

        channels.put("user/signedup", createRefChannelItem());
        channels.put("user/payment", createChannelItem());
        return channels;
    }

    private static ChannelItem createRefChannelItem() {
        ChannelItem channelItem = new ChannelItemImpl();
        channelItem.setRef("#/components/messages/userSignedUp");
        return channelItem;
    }

    private static ChannelItem createChannelItem() {
        ChannelItem channelItem = new ChannelItemImpl();

        channelItem.setBindings(createChannelBindings());
        channelItem.setDescription("Making a payment");
        channelItem.setParameters(createParameters());
        channelItem.setPublish(createPublishOperation());
        channelItem.setSubscribe(createSubscribeOperation());
        return channelItem;
    }

    private static Map<String, ChannelBinding> createChannelBindings() {
        // ChannelBindings channelBindings = new ChannelBindings();     
        return null;
    }

    private static List<Parameter> createParameters() {
        return null;
    }

    private static Operation createPublishOperation() {
        //Operation operation = new Operation();
        return null;
    }

    private static Operation createSubscribeOperation() {
        //Operation operation = new Operation();
        return null;
    }

    private static Components createComponents() {
        //Components components = new Components();
        //return components;
        return null;
    }

    private static Map<String, Server> createServers() {
        Server localhost = new ServerImpl("http://localhost:8080", Protocol.HTTP);

        ServerVariable port = new ServerVariableImpl();
        port.addEnumeration("8080");
        port.addEnumeration("8081");
        port.addExample("8080");
        port.addExample("8081");
        port.setDefaultValue("8080");
        port.setDescription("The port");
        ServerVariable path = new ServerVariableImpl();
        Map<String, ServerVariable> serverVariables = new HashMap<>();
        serverVariables.put("port", port);
        serverVariables.put("path", path);
        SecurityRequirement securityRequirement = new SecurityRequirementImpl("oauth");

        LastWill lastWill = new LastWillImpl("/last-wills", 2, false);

        MqttServerBinding mqttBinding = new MqttServerBindingImpl("guest", true, lastWill, 60, "0.1.0");
        Server test = new ServerImpl("http://www.test.com:{port}/{path}", Protocol.MQTT, "MQTT 3.1.1",
                "The test server", serverVariables, securityRequirement);
        test.addBinding(BindingKey.mqtt, mqttBinding);

        Map<String, Server> servers = new HashMap<>();
        servers.put("localhost", localhost);
        servers.put("test", test);

        return servers;
    }

    private static List<Tag> createRootTags() throws MalformedURLException {
        ExternalDocs tagExternalDocs = new ExternalDocsImpl("tag documentation", new URL("http://www.documentation.com/tag"));
        return Collections.singletonList(new TagImpl("Test AsyncApi", "Some description here", tagExternalDocs));
    }

    private static Info createInfo() throws MalformedURLException {
        return new InfoImpl("JUnit Test Document",
                "1.0.0",
                "Just a test document for JUnit",
                new URL("http://www.someterms.com/test"),
                createContact(),
                createLicense());
    }

    private static Contact createContact() throws MalformedURLException {
        return new ContactImpl("Phillip Kruger", new URL("http://www.phillip-kruger.com"),
                "phillip.kruger@redhat.com");
    }

    private static License createLicense() throws MalformedURLException {
        return new LicenseImpl("Apache License 2.0", new URL("http://www.apache.org/licenses/LICENSE-2.0"));
    }
}
