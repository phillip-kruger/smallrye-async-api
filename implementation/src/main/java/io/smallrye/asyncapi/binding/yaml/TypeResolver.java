package io.smallrye.asyncapi.binding.yaml;

//import org.yaml.snakeyaml.nodes.NodeId;
//import org.yaml.snakeyaml.nodes.Tag;
//import org.yaml.snakeyaml.resolver.Resolver;

/**
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class TypeResolver {//extends Resolver {

    public TypeResolver() {
        //        super();
        //        addImplicitResolver(Tag.BOOL, BOOL, "yYnNtTfFoO");
        //        addImplicitResolver(Tag.INT, INT, "-+0123456789");
        //        addImplicitResolver(Tag.FLOAT, FLOAT, "-+0123456789.");
        //        addImplicitResolver(Tag.MERGE, MERGE, "<");
        //        addImplicitResolver(Tag.NULL, NULL, "~nN\\0");
        //        addImplicitResolver(Tag.NULL, EMPTY, null);
        //        addImplicitResolver(Tag.YAML, YAML, "!&*");

    }

    //    @Override
    //    public Tag resolve(NodeId kind, String value, boolean implicit) {
    //
    //        //kind = scalar
    //        //value = http://localhost:8080
    //        //implicit = false
    //
    //        //        System.err.println(">>>>>> kind = " + kind);
    //        //        System.err.println(">>>>>> value = " + value);
    //        //        System.err.println(">>>>>> implicit = " + implicit);
    //
    //        return super.resolve(kind, value, implicit);
    //    }
}
