package io.smallrye.asyncapi.binding;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import io.smallrye.asyncapi.api.AsyncApiBinding;
import io.smallrye.asyncapi.api.model.AsyncAPI;
import io.smallrye.asyncapi.testdata.TestDataCreator;

/**
 * Test the JsonBinding
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class YamlBindingTest {
    private AsyncApiBinding binding = new YamlBinding();

    @Test
    public void testYamlBinding() {
        AsyncAPI asyncAPI = TestDataCreator.full;

        String document = binding.toString(asyncAPI);

        System.err.println("document = " + document);

        assertThat(document).isEqualTo(EXPECTED);
    }

    private static final String EXPECTED = "!!io.smallrye.asyncapi.api.model.AsyncAPI\n" +
            "asyncapi: 1.0.0\n" +
            "channels: null\n" +
            "components: null\n" +
            "externalDocs: null\n" +
            "id: io.smallrye.asyncapi.test\n" +
            "info:\n" +
            "  contact:\n" +
            "    email: phillip.kruger@redhat.com\n" +
            "    name: Phillip Kruger\n" +
            "    url: {}\n" +
            "  description: Just a test document for JUnit\n" +
            "  license:\n" +
            "    name: Apache License 2.0\n" +
            "    url: {}\n" +
            "  termsOfService: {}\n" +
            "  title: JUnit Test Document\n" +
            "  version: 1.0.0\n" +
            "servers: null\n" +
            "tags: null\n";

}
