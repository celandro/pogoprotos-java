// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/MegaEvolvePokemonResponse.proto

package POGOProtos.Networking.Responses;

public final class MegaEvolvePokemonResponseOuterClass {
  private MegaEvolvePokemonResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?POGOProtos/Networking/Responses/MegaEv" +
      "olvePokemonResponse.proto\022\037POGOProtos.Ne" +
      "tworking.Responses\032!POGOProtos/Data/Poke" +
      "monData.proto\"\254\003\n\031MegaEvolvePokemonRespo" +
      "nse\022Q\n\006result\030\001 \001(\0162A.POGOProtos.Network" +
      "ing.Responses.MegaEvolvePokemonResponse." +
      "Result\0225\n\017evolved_pokemon\030\002 \001(\0132\034.POGOPr" +
      "otos.Data.PokemonData\022\023\n\013exp_awarded\030\003 \001" +
      "(\005\"\357\001\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\032\n" +
      "\026FAILED_POKEMON_MISSING\020\002\022!\n\035FAILED_INSU" +
      "FFICIENT_RESOURCES\020\003\022 \n\034FAILED_POKEMON_C" +
      "ANNOT_EVOLVE\020\004\022\036\n\032FAILED_POKEMON_IS_DEPL" +
      "OYED\020\005\022#\n\037FAILED_INVALID_ITEM_REQUIREMEN" +
      "T\020\006\022\'\n#FAILED_POKEMON_ALREADY_MEGA_EVOLV" +
      "ED\020\007B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PokemonDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_descriptor,
        new java.lang.String[] { "Result", "EvolvedPokemon", "ExpAwarded", });
    POGOProtos.Data.PokemonDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
