// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/RequestGeofenceUpdatesMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class RequestGeofenceUpdatesMessageOuterClass {
  private RequestGeofenceUpdatesMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_RequestGeofenceUpdatesMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_RequestGeofenceUpdatesMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKPOGOProtos/Networking/Requests/Message" +
      "s/RequestGeofenceUpdatesMessage.proto\022\'P" +
      "OGOProtos.Networking.Requests.Messages\"Y" +
      "\n\035RequestGeofenceUpdatesMessage\022\030\n\020numbe" +
      "r_of_points\030\001 \001(\005\022\036\n\026minimum_point_radiu" +
      "s_m\030\002 \001(\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Messages_RequestGeofenceUpdatesMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_RequestGeofenceUpdatesMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_RequestGeofenceUpdatesMessage_descriptor,
        new java.lang.String[] { "NumberOfPoints", "MinimumPointRadiusM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
