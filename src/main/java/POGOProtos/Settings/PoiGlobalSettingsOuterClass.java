// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/PoiGlobalSettings.proto

package POGOProtos.Settings;

public final class PoiGlobalSettingsOuterClass {
  private PoiGlobalSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_PoiGlobalSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_PoiGlobalSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+POGOProtos/Settings/PoiGlobalSettings." +
      "proto\022\023POGOProtos.Settings\"O\n\021PoiGlobalS" +
      "ettings\022\022\n\nis_enabled\030\001 \001(\010\022&\n\036player_su" +
      "bmission_type_enabled\030\002 \003(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_PoiGlobalSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_PoiGlobalSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_PoiGlobalSettings_descriptor,
        new java.lang.String[] { "IsEnabled", "PlayerSubmissionTypeEnabled", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}