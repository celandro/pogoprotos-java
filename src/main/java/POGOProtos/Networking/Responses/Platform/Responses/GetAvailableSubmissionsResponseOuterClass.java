// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Platform/Responses/GetAvailableSubmissionsResponse.proto

package POGOProtos.Networking.Responses.Platform.Responses;

public final class GetAvailableSubmissionsResponseOuterClass {
  private GetAvailableSubmissionsResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAvailableSubmissionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAvailableSubmissionsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nXPOGOProtos/Networking/Responses/Platfo" +
      "rm/Responses/GetAvailableSubmissionsResp" +
      "onse.proto\0222POGOProtos.Networking.Respon" +
      "ses.Platform.Responses\032APOGOProtos/Data/" +
      "Titan/AvailableSubmissionsPerSubmissionT" +
      "ype.proto\"\253\003\n\037GetAvailableSubmissionsRes" +
      "ponse\022\030\n\020submissions_left\030\001 \001(\005\022\030\n\020min_p" +
      "layer_level\030\002 \001(\005\022\027\n\017has_valid_email\030\003 \001" +
      "(\010\022\032\n\022is_feature_enabled\030\004 \001(\010\022,\n$time_w" +
      "indow_for_submissions_limit_ms\030\005 \001(\003\022\"\n\032" +
      "max_poi_distance_in_meters\030\006 \001(\005\022\026\n\016blac" +
      "klisted_os\030\007 \003(\t\022b\n\034availability_result_" +
      "per_type\030\010 \003(\0132<.POGOProtos.Data.Titan.A" +
      "vailableSubmissionsPerSubmissionType\022\035\n\025" +
      "blacklisted_device_id\030\t \003(\t\0222\n*max_poi_l" +
      "ocation_edit_move_distance_meters\030\n \001(\005B" +
      "\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Titan.AvailableSubmissionsPerSubmissionTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAvailableSubmissionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAvailableSubmissionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetAvailableSubmissionsResponse_descriptor,
        new java.lang.String[] { "SubmissionsLeft", "MinPlayerLevel", "HasValidEmail", "IsFeatureEnabled", "TimeWindowForSubmissionsLimitMs", "MaxPoiDistanceInMeters", "BlacklistedOs", "AvailabilityResultPerType", "BlacklistedDeviceId", "MaxPoiLocationEditMoveDistanceMeters", });
    POGOProtos.Data.Titan.AvailableSubmissionsPerSubmissionTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
