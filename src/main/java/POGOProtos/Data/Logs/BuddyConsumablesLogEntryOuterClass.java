// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/BuddyConsumablesLogEntry.proto

package POGOProtos.Data.Logs;

public final class BuddyConsumablesLogEntryOuterClass {
  private BuddyConsumablesLogEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Logs_BuddyConsumablesLogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Logs_BuddyConsumablesLogEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3POGOProtos/Data/Logs/BuddyConsumablesL" +
      "ogEntry.proto\022\024POGOProtos.Data.Logs\032\037POG" +
      "OProtos/Inventory/Loot.proto\"G\n\030BuddyCon" +
      "sumablesLogEntry\022+\n\007rewards\030\001 \001(\0132\032.POGO" +
      "Protos.Inventory.LootB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.LootOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Logs_BuddyConsumablesLogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Logs_BuddyConsumablesLogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Logs_BuddyConsumablesLogEntry_descriptor,
        new java.lang.String[] { "Rewards", });
    POGOProtos.Inventory.LootOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
