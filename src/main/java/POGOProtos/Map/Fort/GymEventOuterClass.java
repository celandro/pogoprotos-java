// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Fort/GymEvent.proto

package POGOProtos.Map.Fort;

public final class GymEventOuterClass {
  private GymEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Map_Fort_GymEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Map_Fort_GymEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"POGOProtos/Map/Fort/GymEvent.proto\022\023PO" +
      "GOProtos.Map.Fort\"\271\002\n\010GymEvent\022\017\n\007traine" +
      "r\030\001 \001(\t\022\024\n\014timestamp_ms\030\002 \001(\003\0222\n\005event\030\003" +
      " \001(\0162#.POGOProtos.Map.Fort.GymEvent.Even" +
      "t\022\022\n\npokedex_id\030\004 \001(\005\022\022\n\npokemon_id\030\005 \001(" +
      "\006\"\251\001\n\005Event\022\013\n\007UNKNOWN\020\000\022\017\n\013POKEMON_FED\020" +
      "\001\022\024\n\020POKEMON_DEPLOYED\020\002\022\024\n\020POKEMON_RETUR" +
      "NED\020\003\022\016\n\nBATTLE_WON\020\004\022\017\n\013BATTLE_LOSS\020\005\022\020" +
      "\n\014RAID_STARTED\020\006\022\016\n\nRAID_ENDED\020\007\022\023\n\017GYM_" +
      "NEUTRALIZED\020\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Map_Fort_GymEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Map_Fort_GymEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Map_Fort_GymEvent_descriptor,
        new java.lang.String[] { "Trainer", "TimestampMs", "Event", "PokedexId", "PokemonId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}