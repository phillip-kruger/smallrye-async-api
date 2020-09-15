package io.smallrye.asyncapi.api.model.binding.server;

/**
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public interface LastWill {

    public String getTopic();

    public void setTopic(String topic);

    public Integer getQos();

    public void setQos(Integer qos);

    public boolean isRetain();

    public void setRetain(boolean retain);
}
