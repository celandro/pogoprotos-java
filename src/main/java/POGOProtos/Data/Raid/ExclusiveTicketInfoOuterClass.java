// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Raid/ExclusiveTicketInfo.proto

package POGOProtos.Data.Raid;

public final class ExclusiveTicketInfoOuterClass {
  private ExclusiveTicketInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Raid_ExclusiveTicketInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Raid_ExclusiveTicketInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.POGOProtos/Data/Raid/ExclusiveTicketIn" +
      "fo.proto\022\024POGOProtos.Data.Raid\032!POGOProt" +
      "os/Data/PokemonData.proto\032;POGOProtos/Da" +
      "ta/Raid/SharedExclusiveTicketTrainerInfo" +
      ".proto\"\242\003\n\023ExclusiveTicketInfo\022\021\n\traid_s" +
      "eed\030\001 \001(\003\022\017\n\007fort_id\030\002 \001(\t\022\025\n\rstart_time" +
      "_ms\030\004 \001(\003\022\023\n\013end_time_ms\030\005 \001(\003\022\021\n\timage_" +
      "url\030\006 \001(\t\022\020\n\010latitude\030\007 \001(\001\022\021\n\tlongitude" +
      "\030\010 \001(\001\022\020\n\010gym_name\030\t \001(\t\022\025\n\rspawn_time_m" +
      "s\030\n \001(\003\022\024\n\014is_cancelled\030\013 \001(\010\0222\n\014raid_po" +
      "kemon\030\014 \001(\0132\034.POGOProtos.Data.PokemonDat" +
      "a\022G\n\007inviter\030\r \001(\01326.POGOProtos.Data.Rai" +
      "d.SharedExclusiveTicketTrainerInfo\022G\n\007in" +
      "vitee\030\016 \001(\01326.POGOProtos.Data.Raid.Share" +
      "dExclusiveTicketTrainerInfoB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PokemonDataOuterClass.getDescriptor(),
          POGOProtos.Data.Raid.SharedExclusiveTicketTrainerInfoOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Raid_ExclusiveTicketInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Raid_ExclusiveTicketInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Raid_ExclusiveTicketInfo_descriptor,
        new java.lang.String[] { "RaidSeed", "FortId", "StartTimeMs", "EndTimeMs", "ImageUrl", "Latitude", "Longitude", "GymName", "SpawnTimeMs", "IsCancelled", "RaidPokemon", "Inviter", "Invitee", });
    POGOProtos.Data.PokemonDataOuterClass.getDescriptor();
    POGOProtos.Data.Raid.SharedExclusiveTicketTrainerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
