// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/PlayerSummary.proto

package POGOProtos.Data.Player;

public final class PlayerSummaryOuterClass {
  private PlayerSummaryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Player_PlayerSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Player_PlayerSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*POGOProtos/Data/Player/PlayerSummary.p" +
      "roto\022\026POGOProtos.Data.Player\"\216\001\n\rPlayerS" +
      "ummary\022\021\n\tplayer_id\030\001 \001(\t\022\020\n\010codename\030\002 " +
      "\001(\t\022\023\n\013public_data\030\003 \001(\014\022\014\n\004team\030\004 \001(\t\022\022" +
      "\n\nfb_user_id\030\005 \001(\t\022\r\n\005level\030\006 \001(\005\022\022\n\nexp" +
      "erience\030\007 \001(\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Player_PlayerSummary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Player_PlayerSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Player_PlayerSummary_descriptor,
        new java.lang.String[] { "PlayerId", "Codename", "PublicData", "Team", "FbUserId", "Level", "Experience", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
