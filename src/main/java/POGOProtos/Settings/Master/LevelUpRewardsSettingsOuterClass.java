// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/LevelUpRewardsSettings.proto

package POGOProtos.Settings.Master;

public final class LevelUpRewardsSettingsOuterClass {
  private LevelUpRewardsSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_LevelUpRewardsSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_LevelUpRewardsSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Settings/Master/LevelUpRewa" +
      "rdsSettings.proto\022\032POGOProtos.Settings.M" +
      "aster\032&POGOProtos/Inventory/Item/ItemId." +
      "proto\"\306\001\n\026LevelUpRewardsSettings\022\r\n\005leve" +
      "l\030\001 \001(\005\0220\n\005items\030\002 \003(\0162!.POGOProtos.Inve" +
      "ntory.Item.ItemId\022\023\n\013items_count\030\003 \003(\005\0229" +
      "\n\016items_unlocked\030\004 \003(\0162!.POGOProtos.Inve" +
      "ntory.Item.ItemId\022\033\n\023avatar_template_ids" +
      "\030\005 \003(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_Master_LevelUpRewardsSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_LevelUpRewardsSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_LevelUpRewardsSettings_descriptor,
        new java.lang.String[] { "Level", "Items", "ItemsCount", "ItemsUnlocked", "AvatarTemplateIds", });
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
