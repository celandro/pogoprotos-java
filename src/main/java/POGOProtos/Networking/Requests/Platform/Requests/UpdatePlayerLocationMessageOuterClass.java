// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Platform/Requests/UpdatePlayerLocationMessage.proto

package POGOProtos.Networking.Requests.Platform.Requests;

public final class UpdatePlayerLocationMessageOuterClass {
  private UpdatePlayerLocationMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Platform_Requests_UpdatePlayerLocationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Platform_Requests_UpdatePlayerLocationMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nRPOGOProtos/Networking/Requests/Platfor" +
      "m/Requests/UpdatePlayerLocationMessage.p" +
      "roto\0220POGOProtos.Networking.Requests.Pla" +
      "tform.Requests\"\252\002\n\033UpdatePlayerLocationM" +
      "essage\022\033\n\023geofence_identifier\030\001 \001(\t\022h\n\006r" +
      "eason\030\002 \001(\0162X.POGOProtos.Networking.Requ" +
      "ests.Platform.Requests.UpdatePlayerLocat" +
      "ionMessage.PingReason\"\203\001\n\nPingReason\022\t\n\005" +
      "UNSET\020\000\022\022\n\016ENTRANCE_EVENT\020\001\022\016\n\nEXIT_EVEN" +
      "T\020\002\022\017\n\013DWELL_EVENT\020\003\022\017\n\013VISIT_EVENT\020\004\022\022\n" +
      "\016FITNESS_WAKEUP\020\005\022\020\n\014OTHER_WAKEUP\020\006B\002P\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Platform_Requests_UpdatePlayerLocationMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Platform_Requests_UpdatePlayerLocationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Platform_Requests_UpdatePlayerLocationMessage_descriptor,
        new java.lang.String[] { "GeofenceIdentifier", "Reason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
