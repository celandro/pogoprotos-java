// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/MarkReadNewsArticleResponse.proto

package POGOProtos.Networking.Responses;

public final class MarkReadNewsArticleResponseOuterClass {
  private MarkReadNewsArticleResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_MarkReadNewsArticleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_MarkReadNewsArticleResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAPOGOProtos/Networking/Responses/MarkRe" +
      "adNewsArticleResponse.proto\022\037POGOProtos." +
      "Networking.Responses\"\247\001\n\033MarkReadNewsArt" +
      "icleResponse\022S\n\006result\030\001 \001(\0162C.POGOProto" +
      "s.Networking.Responses.MarkReadNewsArtic" +
      "leResponse.Result\"3\n\006Result\022\t\n\005UNSET\020\000\022\013" +
      "\n\007SUCCESS\020\001\022\021\n\rNO_NEWS_FOUND\020\002B\002P\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_MarkReadNewsArticleResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_MarkReadNewsArticleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_MarkReadNewsArticleResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
