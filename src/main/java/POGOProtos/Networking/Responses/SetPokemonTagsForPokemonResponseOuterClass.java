// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/SetPokemonTagsForPokemonResponse.proto

package POGOProtos.Networking.Responses;

public final class SetPokemonTagsForPokemonResponseOuterClass {
  private SetPokemonTagsForPokemonResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_SetPokemonTagsForPokemonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_SetPokemonTagsForPokemonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFPOGOProtos/Networking/Responses/SetPok" +
      "emonTagsForPokemonResponse.proto\022\037POGOPr" +
      "otos.Networking.Responses\"\362\001\n SetPokemon" +
      "TagsForPokemonResponse\022X\n\006status\030\002 \001(\0162H" +
      ".POGOProtos.Networking.Responses.SetPoke" +
      "monTagsForPokemonResponse.Status\"t\n\006Stat" +
      "us\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\036\n\032ERROR_PLAY" +
      "ER_LEVEL_TOO_LOW\020\002\022\033\n\027ERROR_POKEMON_NOT_" +
      "FOUND\020\003\022\025\n\021ERROR_TAG_INVALID\020\004B\002P\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_SetPokemonTagsForPokemonResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_SetPokemonTagsForPokemonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_SetPokemonTagsForPokemonResponse_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
