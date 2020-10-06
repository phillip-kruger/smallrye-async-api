package io.smallrye.asyncapi.api.model.binding.http;

import io.smallrye.asyncapi.api.model.OperationBinding;
import io.smallrye.asyncapi.api.model.Schema;

/**
 * HTTP Operation Bindings Object
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 * 
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/http/README.md#operation">HTTP Operation Bindings Object</a>
 * 
 */
public interface HttpOperationBinding extends OperationBinding {

    public Type getType();

    public void setType(Type type);

    public Method getMethod();

    public void getMethod(Method method);

    public Schema getQuery();

    public void getQuery(Schema schema);

    public String getBindingVersion();

    public void setBindingVersion(String bindingVersion);

    public enum Type {
        request,
        response
    }

    public enum Method {
        GET,
        POST,
        PUT,
        PATCH,
        DELETE,
        HEAD,
        OPTIONS,
        CONNECT,
        TRACE
    }
}
