// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BuddyHungerSettings.proto

package POGOProtos.Settings.Master;

public final class BuddyHungerSettingsOuterClass {
  private BuddyHungerSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_BuddyHungerSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_BuddyHungerSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4POGOProtos/Settings/Master/BuddyHunger" +
      "Settings.proto\022\032POGOProtos.Settings.Mast" +
      "er\"\310\001\n\023BuddyHungerSettings\022+\n#num_hunger" +
      "_points_required_for_full\030\001 \001(\005\022\037\n\027decay" +
      "_points_per_bucket\030\002 \001(\005\022\037\n\027milliseconds" +
      "_per_bucket\030\003 \001(\003\022\034\n\024cooldown_duration_m" +
      "s\030\004 \001(\003\022$\n\034decay_duration_after_full_ms\030" +
      "\005 \001(\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_BuddyHungerSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_BuddyHungerSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_BuddyHungerSettings_descriptor,
        new java.lang.String[] { "NumHungerPointsRequiredForFull", "DecayPointsPerBucket", "MillisecondsPerBucket", "CooldownDurationMs", "DecayDurationAfterFullMs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}