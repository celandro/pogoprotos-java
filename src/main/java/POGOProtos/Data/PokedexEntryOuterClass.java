// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/PokedexEntry.proto

package POGOProtos.Data;

public final class PokedexEntryOuterClass {
  private PokedexEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_PokedexEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_PokedexEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"POGOProtos/Data/PokedexEntry.proto\022\017PO" +
      "GOProtos.Data\032\036POGOProtos/Enums/Costume." +
      "proto\032\033POGOProtos/Enums/Form.proto\032\035POGO" +
      "Protos/Enums/Gender.proto\032 POGOProtos/En" +
      "ums/PokemonId.proto\"\322\004\n\014PokedexEntry\022/\n\n" +
      "pokemon_id\030\001 \001(\0162\033.POGOProtos.Enums.Poke" +
      "monId\022\031\n\021times_encountered\030\002 \001(\005\022\026\n\016time" +
      "s_captured\030\003 \001(\005\022\036\n\026evolution_stone_piec" +
      "es\030\004 \001(\005\022\030\n\020evolution_stones\030\005 \001(\005\0224\n\021ca" +
      "ptured_costumes\030\006 \003(\0162\031.POGOProtos.Enums" +
      ".Costume\022.\n\016captured_forms\030\007 \003(\0162\026.POGOP" +
      "rotos.Enums.Form\0222\n\020captured_genders\030\010 \003" +
      "(\0162\030.POGOProtos.Enums.Gender\022\026\n\016captured" +
      "_shiny\030\t \001(\010\0227\n\024encountered_costumes\030\n \003" +
      "(\0162\031.POGOProtos.Enums.Costume\0221\n\021encount" +
      "ered_forms\030\013 \003(\0162\026.POGOProtos.Enums.Form" +
      "\0225\n\023encountered_genders\030\014 \003(\0162\030.POGOProt" +
      "os.Enums.Gender\022\031\n\021encountered_shiny\030\r \001" +
      "(\010\022\034\n\024times_lucky_received\030\016 \001(\005\022\026\n\016time" +
      "s_purified\030\017 \001(\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.CostumeOuterClass.getDescriptor(),
          POGOProtos.Enums.FormOuterClass.getDescriptor(),
          POGOProtos.Enums.GenderOuterClass.getDescriptor(),
          POGOProtos.Enums.PokemonIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_PokedexEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_PokedexEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_PokedexEntry_descriptor,
        new java.lang.String[] { "PokemonId", "TimesEncountered", "TimesCaptured", "EvolutionStonePieces", "EvolutionStones", "CapturedCostumes", "CapturedForms", "CapturedGenders", "CapturedShiny", "EncounteredCostumes", "EncounteredForms", "EncounteredGenders", "EncounteredShiny", "TimesLuckyReceived", "TimesPurified", });
    POGOProtos.Enums.CostumeOuterClass.getDescriptor();
    POGOProtos.Enums.FormOuterClass.getDescriptor();
    POGOProtos.Enums.GenderOuterClass.getDescriptor();
    POGOProtos.Enums.PokemonIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
