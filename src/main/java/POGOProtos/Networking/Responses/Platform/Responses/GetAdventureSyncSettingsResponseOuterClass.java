// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Platform/Responses/GetAdventureSyncSettingsResponse.proto

package POGOProtos.Networking.Responses.Platform.Responses;

public final class GetAdventureSyncSettingsResponseOuterClass {
  private GetAdventureSyncSettingsResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAdventureSyncSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAdventureSyncSettingsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nYPOGOProtos/Networking/Responses/Platfo" +
      "rm/Responses/GetAdventureSyncSettingsRes" +
      "ponse.proto\0222POGOProtos.Networking.Respo" +
      "nses.Platform.Responses\032/POGOProtos/Sett" +
      "ings/AdventureSyncSettings.proto\"\300\001\n Get" +
      "AdventureSyncSettingsResponse\022K\n\027adventu" +
      "re_sync_settings\030\001 \001(\0132*.POGOProtos.Sett" +
      "ings.AdventureSyncSettings\"O\n\006Status\022\t\n\005" +
      "UNSET\020\000\022\013\n\007SUCCESS\020\001\022\021\n\rERROR_UNKNOWN\020\002\022" +
      "\032\n\026ERROR_PLAYER_NOT_FOUND\020\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Settings.AdventureSyncSettingsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAdventureSyncSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAdventureSyncSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAdventureSyncSettingsResponse_descriptor,
        new java.lang.String[] { "AdventureSyncSettings", });
    POGOProtos.Settings.AdventureSyncSettingsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
