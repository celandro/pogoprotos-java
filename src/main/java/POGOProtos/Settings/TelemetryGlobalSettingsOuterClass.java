// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/TelemetryGlobalSettings.proto

package POGOProtos.Settings;

public final class TelemetryGlobalSettingsOuterClass {
  private TelemetryGlobalSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_TelemetryGlobalSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_TelemetryGlobalSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1POGOProtos/Settings/TelemetryGlobalSet" +
      "tings.proto\022\023POGOProtos.Settings\"\212\002\n\027Tel" +
      "emetryGlobalSettings\022\017\n\007enabled\030\001 \001(\010\022!\n" +
      "\031session_sampling_fraction\030\002 \001(\001\022\032\n\022max_" +
      "buffer_size_kb\030\003 \001(\005\022\022\n\nbatch_size\030\004 \001(\005" +
      "\022\032\n\022update_interval_ms\030\005 \001(\003\022%\n\035frame_ra" +
      "te_sample_interval_ms\030\006 \001(\003\022#\n\033frame_rat" +
      "e_sample_period_ms\030\007 \001(\003\022#\n\033enable_omni_" +
      "wrapper_sending\030\010 \001(\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_TelemetryGlobalSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_TelemetryGlobalSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_TelemetryGlobalSettings_descriptor,
        new java.lang.String[] { "Enabled", "SessionSamplingFraction", "MaxBufferSizeKb", "BatchSize", "UpdateIntervalMs", "FrameRateSampleIntervalMs", "FrameRateSamplePeriodMs", "EnableOmniWrapperSending", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}