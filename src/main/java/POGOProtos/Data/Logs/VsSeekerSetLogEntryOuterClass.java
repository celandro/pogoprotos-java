// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/VsSeekerSetLogEntry.proto

package POGOProtos.Data.Logs;

public final class VsSeekerSetLogEntryOuterClass {
  private VsSeekerSetLogEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Logs_VsSeekerSetLogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Logs_VsSeekerSetLogEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.POGOProtos/Data/Logs/VsSeekerSetLogEnt" +
      "ry.proto\022\024POGOProtos.Data.Logs\032\037POGOProt" +
      "os/Inventory/Loot.proto\"\257\002\n\023VsSeekerSetL" +
      "ogEntry\022@\n\006result\030\001 \001(\01620.POGOProtos.Dat" +
      "a.Logs.VsSeekerSetLogEntry.Result\022+\n\007rew" +
      "ards\030\002 \001(\0132\032.POGOProtos.Inventory.Loot\022\020" +
      "\n\010new_rank\030\003 \001(\005\022\022\n\nnew_rating\030\004 \001(\002\022\025\n\r" +
      "previous_rank\030\005 \001(\005\022\027\n\017previous_rating\030\006" +
      " \001(\002\022\026\n\016number_of_wins\030\007 \001(\005\022\031\n\021number_o" +
      "f_battles\030\010 \001(\005\" \n\006Result\022\t\n\005UNSET\020\000\022\013\n\007" +
      "SUCCESS\020\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.LootOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Logs_VsSeekerSetLogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Logs_VsSeekerSetLogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Logs_VsSeekerSetLogEntry_descriptor,
        new java.lang.String[] { "Result", "Rewards", "NewRank", "NewRating", "PreviousRank", "PreviousRating", "NumberOfWins", "NumberOfBattles", });
    POGOProtos.Inventory.LootOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}