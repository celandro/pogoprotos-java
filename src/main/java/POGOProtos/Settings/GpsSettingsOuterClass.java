// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/GpsSettings.proto

package POGOProtos.Settings;

public final class GpsSettingsOuterClass {
  private GpsSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_GpsSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_GpsSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%POGOProtos/Settings/GpsSettings.proto\022" +
      "\023POGOProtos.Settings\"\333\002\n\013GpsSettings\022/\n\'" +
      "driving_warning_speed_meters_per_second\030" +
      "\001 \001(\002\022(\n driving_warning_cooldown_minute" +
      "s\030\002 \001(\002\022-\n%driving_speed_sample_interval" +
      "_seconds\030\003 \001(\002\022\"\n\032driving_speed_sample_c" +
      "ount\030\004 \001(\005\022.\n&idle_threshold_speed_meter" +
      "s_per_second\030\005 \001(\002\022\'\n\037idle_threshold_dur" +
      "ation_seconds\030\006 \001(\005\022$\n\034idle_sample_inter" +
      "val_seconds\030\007 \001(\002\022\037\n\027idle_speed_sample_c" +
      "ount\030\010 \001(\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_GpsSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_GpsSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_GpsSettings_descriptor,
        new java.lang.String[] { "DrivingWarningSpeedMetersPerSecond", "DrivingWarningCooldownMinutes", "DrivingSpeedSampleIntervalSeconds", "DrivingSpeedSampleCount", "IdleThresholdSpeedMetersPerSecond", "IdleThresholdDurationSeconds", "IdleSampleIntervalSeconds", "IdleSpeedSampleCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}