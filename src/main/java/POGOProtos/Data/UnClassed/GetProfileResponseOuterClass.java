// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/UnClassed/GetProfileResponse.proto

package POGOProtos.Data.UnClassed;

public final class GetProfileResponseOuterClass {
  private GetProfileResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_PlayerProfileDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_PlayerProfileDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_ProfileDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_ProfileDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2POGOProtos/Data/UnClassed/GetProfileRe" +
      "sponse.proto\022\031POGOProtos.Data.UnClassed\"" +
      "\210\005\n\022GetProfileResponse\022D\n\006result\030\001 \001(\01624" +
      ".POGOProtos.Data.UnClassed.GetProfileRes" +
      "ponse.Result\022U\n\017profile_details\030\002 \001(\0132<." +
      "POGOProtos.Data.UnClassed.GetProfileResp" +
      "onse.ProfileDetails\022b\n\026player_profile_de" +
      "tails\030\003 \003(\0132B.POGOProtos.Data.UnClassed." +
      "GetProfileResponse.PlayerProfileDetails\032" +
      "\315\001\n\024PlayerProfileDetails\022\017\n\007app_key\030\001 \001(" +
      "\t\022\020\n\010codename\030\002 \001(\t\022\017\n\007faction\030\003 \001(\t\022\r\n\005" +
      "level\030\004 \001(\005\022\022\n\nexperience\030\005 \001(\003\022\036\n\026signe" +
      "d_up_timestamp_ms\030\006 \001(\003\022 \n\030last_played_t" +
      "imestamp_ms\030\007 \001(\003\022\034\n\024player_total_walk_k" +
      "m\030\010 \001(\001\032V\n\016ProfileDetails\022\034\n\024profile_nam" +
      "e_app_key\030\001 \001(\t\022\020\n\010nickname\030\002 \001(\t\022\024\n\014pro" +
      "file_name\030\003 \001(\t\"I\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007" +
      "SUCCESS\020\001\022\021\n\rERROR_UNKNOWN\020\002\022\024\n\020ERROR_NO" +
      "T_FRIEND\020\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_descriptor,
        new java.lang.String[] { "Result", "ProfileDetails", "PlayerProfileDetails", });
    internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_PlayerProfileDetails_descriptor =
      internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_PlayerProfileDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_PlayerProfileDetails_descriptor,
        new java.lang.String[] { "AppKey", "Codename", "Faction", "Level", "Experience", "SignedUpTimestampMs", "LastPlayedTimestampMs", "PlayerTotalWalkKm", });
    internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_ProfileDetails_descriptor =
      internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_descriptor.getNestedTypes().get(1);
    internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_ProfileDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_UnClassed_GetProfileResponse_ProfileDetails_descriptor,
        new java.lang.String[] { "ProfileNameAppKey", "Nickname", "ProfileName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
