// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/EvolvePokemonResponse.proto

package POGOProtos.Networking.Responses;

public final class EvolvePokemonResponseOuterClass {
  private EvolvePokemonResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_EvolvePokemonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_EvolvePokemonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;POGOProtos/Networking/Responses/Evolve" +
      "PokemonResponse.proto\022\037POGOProtos.Networ" +
      "king.Responses\032!POGOProtos/Data/PokemonD" +
      "ata.proto\"\236\003\n\025EvolvePokemonResponse\022M\n\006r" +
      "esult\030\001 \001(\0162=.POGOProtos.Networking.Resp" +
      "onses.EvolvePokemonResponse.Result\022:\n\024ev" +
      "olved_pokemon_data\030\002 \001(\0132\034.POGOProtos.Da" +
      "ta.PokemonData\022\032\n\022experience_awarded\030\003 \001" +
      "(\005\022\025\n\rcandy_awarded\030\004 \001(\005\"\306\001\n\006Result\022\t\n\005" +
      "UNSET\020\000\022\013\n\007SUCCESS\020\001\022\032\n\026FAILED_POKEMON_M" +
      "ISSING\020\002\022!\n\035FAILED_INSUFFICIENT_RESOURCE" +
      "S\020\003\022 \n\034FAILED_POKEMON_CANNOT_EVOLVE\020\004\022\036\n" +
      "\032FAILED_POKEMON_IS_DEPLOYED\020\005\022#\n\037FAILED_" +
      "INVALID_ITEM_REQUIREMENT\020\006B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PokemonDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_EvolvePokemonResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_EvolvePokemonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_EvolvePokemonResponse_descriptor,
        new java.lang.String[] { "Result", "EvolvedPokemonData", "ExperienceAwarded", "CandyAwarded", });
    POGOProtos.Data.PokemonDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
