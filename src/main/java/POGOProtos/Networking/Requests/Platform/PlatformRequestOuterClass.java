// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Platform/PlatformRequest.proto

package POGOProtos.Networking.Requests.Platform;

public final class PlatformRequestOuterClass {
  private PlatformRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Platform_PlatformRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Platform_PlatformRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=POGOProtos/Networking/Requests/Platfor" +
      "m/PlatformRequest.proto\022\'POGOProtos.Netw" +
      "orking.Requests.Platform\032APOGOProtos/Net" +
      "working/Requests/Platform/PlatformReques" +
      "tType.proto\"\207\001\n\017PlatformRequest\022[\n\025platf" +
      "orm_request_type\030\001 \001(\0162<.POGOProtos.Netw" +
      "orking.Requests.Platform.PlatformRequest" +
      "Type\022\027\n\017request_message\030\002 \001(\014B\002P\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Networking.Requests.Platform.PlatformRequestTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Platform_PlatformRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Platform_PlatformRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Platform_PlatformRequest_descriptor,
        new java.lang.String[] { "PlatformRequestType", "RequestMessage", });
    POGOProtos.Networking.Requests.Platform.PlatformRequestTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
