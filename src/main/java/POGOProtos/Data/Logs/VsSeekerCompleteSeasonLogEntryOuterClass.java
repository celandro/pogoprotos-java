// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/VsSeekerCompleteSeasonLogEntry.proto

package POGOProtos.Data.Logs;

public final class VsSeekerCompleteSeasonLogEntryOuterClass {
  private VsSeekerCompleteSeasonLogEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Logs_VsSeekerCompleteSeasonLogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Logs_VsSeekerCompleteSeasonLogEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9POGOProtos/Data/Logs/VsSeekerCompleteS" +
      "easonLogEntry.proto\022\024POGOProtos.Data.Log" +
      "s\032\037POGOProtos/Inventory/Loot.proto\"\332\001\n\036V" +
      "sSeekerCompleteSeasonLogEntry\022K\n\006result\030" +
      "\001 \001(\0162;.POGOProtos.Data.Logs.VsSeekerCom" +
      "pleteSeasonLogEntry.Result\022+\n\007rewards\030\002 " +
      "\001(\0132\032.POGOProtos.Inventory.Loot\022\014\n\004rank\030" +
      "\003 \001(\005\022\016\n\006rating\030\004 \001(\002\" \n\006Result\022\t\n\005UNSET" +
      "\020\000\022\013\n\007SUCCESS\020\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.LootOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Logs_VsSeekerCompleteSeasonLogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Logs_VsSeekerCompleteSeasonLogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Logs_VsSeekerCompleteSeasonLogEntry_descriptor,
        new java.lang.String[] { "Result", "Rewards", "Rank", "Rating", });
    POGOProtos.Inventory.LootOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}