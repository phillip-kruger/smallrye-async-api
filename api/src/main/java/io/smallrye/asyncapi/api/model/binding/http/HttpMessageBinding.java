package io.smallrye.asyncapi.api.model.binding.http;

import io.smallrye.asyncapi.api.model.MessageBinding;
import io.smallrye.asyncapi.api.model.Schema;

/**
 * This object contains information about the message representation in HTTP.
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/http/README.md#message">HTTP Message Bindings Object</a>
 * 
 */
public interface HttpMessageBinding extends MessageBinding {

    public Schema getHeaders();

    public void setHeaders(Schema headers);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);
}
