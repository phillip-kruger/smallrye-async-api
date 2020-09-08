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
public class JsonBindingTest {
    private AsyncApiBinding binding = new JsonBinding();

    @Test
    public void testJsonBinding() {
        AsyncAPI asyncAPI = TestDataCreator.full;

        String document = binding.toString(asyncAPI);

        System.err.println("document = " + document);

        assertThat(document).isEqualTo(EXPECTED);
    }

    private static final String EXPECTED = "\n"
            + "{\n" +
            "    \"asyncapi\": \"2.0.0\",\n" +
            "    \"id\": \"io.smallrye.asyncapi.test\",\n" +
            "    \"info\": {\n" +
            "        \"contact\": {\n" +
            "            \"email\": \"phillip.kruger@redhat.com\",\n" +
            "            \"name\": \"Phillip Kruger\",\n" +
            "            \"url\": \"http://www.phillip-kruger.com\"\n" +
            "        },\n" +
            "        \"description\": \"Just a test document for JUnit\",\n" +
            "        \"license\": {\n" +
            "            \"name\": \"Apache License 2.0\",\n" +
            "            \"url\": \"http://www.apache.org/licenses/LICENSE-2.0\"\n" +
            "        },\n" +
            "        \"termsOfService\": \"http://www.someterms.com/test\",\n" +
            "        \"title\": \"JUnit Test Document\",\n" +
            "        \"version\": \"1.0.0\"\n" +
            "    }\n" +
            "}";

}
