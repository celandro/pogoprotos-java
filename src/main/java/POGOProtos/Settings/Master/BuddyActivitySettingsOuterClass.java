// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BuddyActivitySettings.proto

package POGOProtos.Settings.Master;

public final class BuddyActivitySettingsOuterClass {
  private BuddyActivitySettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_BuddyActivitySettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_BuddyActivitySettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6POGOProtos/Settings/Master/BuddyActivi" +
      "tySettings.proto\022\032POGOProtos.Settings.Ma" +
      "ster\032$POGOProtos/Enums/BuddyActivity.pro" +
      "to\032,POGOProtos/Enums/BuddyActivityCatego" +
      "ry.proto\"\225\002\n\025BuddyActivitySettings\0221\n\010ac" +
      "tivity\030\001 \001(\0162\037.POGOProtos.Enums.BuddyAct" +
      "ivity\022B\n\021activity_category\030\002 \001(\0162\'.POGOP" +
      "rotos.Enums.BuddyActivityCategory\022\031\n\021max" +
      "_times_per_day\030\003 \001(\005\022\035\n\025num_points_per_a" +
      "ction\030\004 \001(\005\022%\n\035num_emotion_points_per_ac" +
      "tion\030\005 \001(\005\022$\n\034emotion_cooldown_duration_" +
      "ms\030\006 \001(\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.BuddyActivityOuterClass.getDescriptor(),
          POGOProtos.Enums.BuddyActivityCategoryOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_Master_BuddyActivitySettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_BuddyActivitySettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_BuddyActivitySettings_descriptor,
        new java.lang.String[] { "Activity", "ActivityCategory", "MaxTimesPerDay", "NumPointsPerAction", "NumEmotionPointsPerAction", "EmotionCooldownDurationMs", });
    POGOProtos.Enums.BuddyActivityOuterClass.getDescriptor();
    POGOProtos.Enums.BuddyActivityCategoryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
