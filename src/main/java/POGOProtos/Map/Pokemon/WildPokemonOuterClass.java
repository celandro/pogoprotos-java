// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Pokemon/WildPokemon.proto

package POGOProtos.Map.Pokemon;

public final class WildPokemonOuterClass {
  private WildPokemonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Map_Pokemon_WildPokemon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Map_Pokemon_WildPokemon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(POGOProtos/Map/Pokemon/WildPokemon.pro" +
      "to\022\026POGOProtos.Map.Pokemon\032!POGOProtos/D" +
      "ata/PokemonData.proto\"\325\001\n\013WildPokemon\022\024\n" +
      "\014encounter_id\030\001 \001(\006\022\"\n\032last_modified_tim" +
      "estamp_ms\030\002 \001(\003\022\020\n\010latitude\030\003 \001(\001\022\021\n\tlon" +
      "gitude\030\004 \001(\001\022\026\n\016spawn_point_id\030\005 \001(\t\0222\n\014" +
      "pokemon_data\030\007 \001(\0132\034.POGOProtos.Data.Pok" +
      "emonData\022\033\n\023time_till_hidden_ms\030\013 \001(\005B\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PokemonDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Map_Pokemon_WildPokemon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Map_Pokemon_WildPokemon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Map_Pokemon_WildPokemon_descriptor,
        new java.lang.String[] { "EncounterId", "LastModifiedTimestampMs", "Latitude", "Longitude", "SpawnPointId", "PokemonData", "TimeTillHiddenMs", });
    POGOProtos.Data.PokemonDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}