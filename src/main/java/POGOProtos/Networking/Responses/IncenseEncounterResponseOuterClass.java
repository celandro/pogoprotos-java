// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/IncenseEncounterResponse.proto

package POGOProtos.Networking.Responses;

public final class IncenseEncounterResponseOuterClass {
  private IncenseEncounterResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_IncenseEncounterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_IncenseEncounterResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>POGOProtos/Networking/Responses/Incens" +
      "eEncounterResponse.proto\022\037POGOProtos.Net" +
      "working.Responses\0320POGOProtos/Data/Captu" +
      "re/CaptureProbability.proto\032!POGOProtos/" +
      "Data/PokemonData.proto\032&POGOProtos/Inven" +
      "tory/Item/ItemId.proto\"\320\003\n\030IncenseEncoun" +
      "terResponse\022P\n\006result\030\001 \001(\0162@.POGOProtos" +
      ".Networking.Responses.IncenseEncounterRe" +
      "sponse.Result\0222\n\014pokemon_data\030\002 \001(\0132\034.PO" +
      "GOProtos.Data.PokemonData\022H\n\023capture_pro" +
      "bability\030\003 \001(\0132+.POGOProtos.Data.Capture" +
      ".CaptureProbability\0226\n\013active_item\030\004 \001(\016" +
      "2!.POGOProtos.Inventory.Item.ItemId\022\"\n\032a" +
      "rplus_attempts_until_flee\030\005 \001(\005\"\207\001\n\006Resu" +
      "lt\022\035\n\031INCENSE_ENCOUNTER_UNKNOWN\020\000\022\035\n\031INC" +
      "ENSE_ENCOUNTER_SUCCESS\020\001\022#\n\037INCENSE_ENCO" +
      "UNTER_NOT_AVAILABLE\020\002\022\032\n\026POKEMON_INVENTO" +
      "RY_FULL\020\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Capture.CaptureProbabilityOuterClass.getDescriptor(),
          POGOProtos.Data.PokemonDataOuterClass.getDescriptor(),
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_IncenseEncounterResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_IncenseEncounterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_IncenseEncounterResponse_descriptor,
        new java.lang.String[] { "Result", "PokemonData", "CaptureProbability", "ActiveItem", "ArplusAttemptsUntilFlee", });
    POGOProtos.Data.Capture.CaptureProbabilityOuterClass.getDescriptor();
    POGOProtos.Data.PokemonDataOuterClass.getDescriptor();
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
