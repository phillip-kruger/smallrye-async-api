package io.smallrye.asyncapi.binding.json;

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
public class JsonBindingTest {
    private final AsyncApiBinding binding = new JsonBinding();

    @Test
    public void testJsonBinding() {
        AsyncAPI asyncAPI = TestDataCreator.full;

        String document = binding.toString(asyncAPI);

        System.err.println("document = \n" + document);

        assertThat(document).contains("\"asyncapi\": \"2.0.0\"");
    }

}
