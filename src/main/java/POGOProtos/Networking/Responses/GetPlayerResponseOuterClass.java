// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetPlayerResponse.proto

package POGOProtos.Networking.Responses;

public final class GetPlayerResponseOuterClass {
  private GetPlayerResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetPlayerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetPlayerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Networking/Responses/GetPla" +
      "yerResponse.proto\022\037POGOProtos.Networking" +
      ".Responses\032 POGOProtos/Data/PlayerData.p" +
      "roto\"\234\002\n\021GetPlayerResponse\022\017\n\007success\030\001 " +
      "\001(\010\0220\n\013player_data\030\002 \001(\0132\033.POGOProtos.Da" +
      "ta.PlayerData\022\016\n\006banned\030\003 \001(\010\022\014\n\004warn\030\004 " +
      "\001(\010\022\023\n\013was_created\030\005 \001(\010\022!\n\031warn_message" +
      "_acknowledged\030\006 \001(\010\022\025\n\rwas_suspended\030\007 \001" +
      "(\010\022&\n\036suspended_message_acknowledged\030\010 \001" +
      "(\010\022\026\n\016warn_expire_ms\030\t \001(\003\022\027\n\017user_permi" +
      "ssion\030\n \003(\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PlayerDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_GetPlayerResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GetPlayerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetPlayerResponse_descriptor,
        new java.lang.String[] { "Success", "PlayerData", "Banned", "Warn", "WasCreated", "WarnMessageAcknowledged", "WasSuspended", "SuspendedMessageAcknowledged", "WarnExpireMs", "UserPermission", });
    POGOProtos.Data.PlayerDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}