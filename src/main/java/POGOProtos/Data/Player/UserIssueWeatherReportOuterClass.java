// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/UserIssueWeatherReport.proto

package POGOProtos.Data.Player;

public final class UserIssueWeatherReportOuterClass {
  private UserIssueWeatherReportOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3POGOProtos/Data/Player/UserIssueWeathe" +
      "rReport.proto\022\026POGOProtos.Data.Player\"q\n" +
      "\026UserIssueWeatherReport\022\032\n\022gameplayer_we" +
      "ather\030\001 \001(\t\022\024\n\014alert_active\030\002 \001(\010\022\020\n\010sev" +
      "erity\030\003 \001(\005\022\023\n\013user_report\030\004 \001(\005B\002P\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_descriptor,
        new java.lang.String[] { "GameplayerWeather", "AlertActive", "Severity", "UserReport", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
