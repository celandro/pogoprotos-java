// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BuddyInteractionSettings.proto

package POGOProtos.Settings.Master;

public final class BuddyInteractionSettingsOuterClass {
  private BuddyInteractionSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9POGOProtos/Settings/Master/BuddyIntera" +
      "ctionSettings.proto\022\032POGOProtos.Settings" +
      ".Master\032&POGOProtos/Inventory/Item/ItemI" +
      "d.proto\"\232\001\n\030BuddyInteractionSettings\022>\n\023" +
      "feed_item_whitelist\030\001 \003(\0162!.POGOProtos.I" +
      "nventory.Item.ItemId\022>\n\023care_item_whitel" +
      "ist\030\002 \003(\0162!.POGOProtos.Inventory.Item.It" +
      "emIdB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_descriptor,
        new java.lang.String[] { "FeedItemWhitelist", "CareItemWhitelist", });
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
