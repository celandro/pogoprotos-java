// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/VsSeekerWinRewardsLogEntry.proto

package POGOProtos.Data.Logs;

public final class VsSeekerWinRewardsLogEntryOuterClass {
  private VsSeekerWinRewardsLogEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Logs_VsSeekerWinRewardsLogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Logs_VsSeekerWinRewardsLogEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5POGOProtos/Data/Logs/VsSeekerWinReward" +
      "sLogEntry.proto\022\024POGOProtos.Data.Logs\032\037P" +
      "OGOProtos/Inventory/Loot.proto\"\326\001\n\032VsSee" +
      "kerWinRewardsLogEntry\022G\n\006result\030\001 \001(\01627." +
      "POGOProtos.Data.Logs.VsSeekerWinRewardsL" +
      "ogEntry.Result\022+\n\007rewards\030\002 \001(\0132\032.POGOPr" +
      "otos.Inventory.Loot\022\014\n\004rank\030\003 \001(\005\022\022\n\nwin" +
      "_number\030\004 \001(\005\" \n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SU" +
      "CCESS\020\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.LootOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Logs_VsSeekerWinRewardsLogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Logs_VsSeekerWinRewardsLogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Logs_VsSeekerWinRewardsLogEntry_descriptor,
        new java.lang.String[] { "Result", "Rewards", "Rank", "WinNumber", });
    POGOProtos.Inventory.LootOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
