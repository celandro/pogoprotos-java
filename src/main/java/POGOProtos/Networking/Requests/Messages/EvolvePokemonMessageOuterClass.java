// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/EvolvePokemonMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class EvolvePokemonMessageOuterClass {
  private EvolvePokemonMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_EvolvePokemonMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_EvolvePokemonMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBPOGOProtos/Networking/Requests/Message" +
      "s/EvolvePokemonMessage.proto\022\'POGOProtos" +
      ".Networking.Requests.Messages\032&POGOProto" +
      "s/Inventory/Item/ItemId.proto\032 POGOProto" +
      "s/Enums/PokemonId.proto\032\033POGOProtos/Enum" +
      "s/Form.proto\"\363\001\n\024EvolvePokemonMessage\022\022\n" +
      "\npokemon_id\030\001 \001(\006\022E\n\032evolution_item_requ" +
      "irement\030\002 \001(\0162!.POGOProtos.Inventory.Ite" +
      "m.ItemId\0226\n\021target_pokemon_id\030\003 \001(\0162\033.PO" +
      "GOProtos.Enums.PokemonId\0223\n\023target_pokem" +
      "on_form\030\004 \001(\0162\026.POGOProtos.Enums.Form\022\023\n" +
      "\013use_special\030\005 \001(\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
          POGOProtos.Enums.PokemonIdOuterClass.getDescriptor(),
          POGOProtos.Enums.FormOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Messages_EvolvePokemonMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_EvolvePokemonMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_EvolvePokemonMessage_descriptor,
        new java.lang.String[] { "PokemonId", "EvolutionItemRequirement", "TargetPokemonId", "TargetPokemonForm", "UseSpecial", });
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
    POGOProtos.Enums.PokemonIdOuterClass.getDescriptor();
    POGOProtos.Enums.FormOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}