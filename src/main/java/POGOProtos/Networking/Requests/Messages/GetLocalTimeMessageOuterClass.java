// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetLocalTimeMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class GetLocalTimeMessageOuterClass {
  private GetLocalTimeMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_GetLocalTimeMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_GetLocalTimeMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAPOGOProtos/Networking/Requests/Message" +
      "s/GetLocalTimeMessage.proto\022\'POGOProtos." +
      "Networking.Requests.Messages\"+\n\023GetLocal" +
      "TimeMessage\022\024\n\014timestamp_ms\030\001 \003(\003B\002P\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Messages_GetLocalTimeMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_GetLocalTimeMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_GetLocalTimeMessage_descriptor,
        new java.lang.String[] { "TimestampMs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
