// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BuddyLevelSettings.proto

package POGOProtos.Settings.Master;

public final class BuddyLevelSettingsOuterClass {
  private BuddyLevelSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_BuddyLevelSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_BuddyLevelSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3POGOProtos/Settings/Master/BuddyLevelS" +
      "ettings.proto\022\032POGOProtos.Settings.Maste" +
      "r\032!POGOProtos/Enums/BuddyLevel.proto\"\205\003\n" +
      "\022BuddyLevelSettings\022+\n\005level\030\001 \001(\0162\034.POG" +
      "OProtos.Enums.BuddyLevel\022*\n\"min_non_cumu" +
      "lative_points_required\030\002 \001(\005\022R\n\017unlocked" +
      "_traits\030\003 \003(\01629.POGOProtos.Settings.Mast" +
      "er.BuddyLevelSettings.BuddyTrait\"\301\001\n\nBud" +
      "dyTrait\022\t\n\005UNSET\020\000\022\016\n\nMAP_DEPLOY\020\001\022\023\n\017EN" +
      "COUNTER_CAMEO\020\002\022\025\n\021EMOTION_INDICATOR\020\003\022\027" +
      "\n\023PICK_UP_CONSUMABLES\020\004\022\025\n\021PICK_UP_SOUVE" +
      "NIRS\020\005\022\030\n\024FIND_ATTRACTIVE_POIS\020\006\022\024\n\020BEST" +
      "_BUDDY_ASSET\020\007\022\014\n\010CP_BOOST\020\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.BuddyLevelOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_Master_BuddyLevelSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_BuddyLevelSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_BuddyLevelSettings_descriptor,
        new java.lang.String[] { "Level", "MinNonCumulativePointsRequired", "UnlockedTraits", });
    POGOProtos.Enums.BuddyLevelOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
