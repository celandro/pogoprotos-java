// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/SetBuddyPokemonResponse.proto

package POGOProtos.Networking.Responses;

public final class SetBuddyPokemonResponseOuterClass {
  private SetBuddyPokemonResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_SetBuddyPokemonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_SetBuddyPokemonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=POGOProtos/Networking/Responses/SetBud" +
      "dyPokemonResponse.proto\022\037POGOProtos.Netw" +
      "orking.Responses\032\"POGOProtos/Data/BuddyP" +
      "okemon.proto\032-POGOProtos/Data/Buddy/Budd" +
      "yObservedData.proto\"\255\003\n\027SetBuddyPokemonR" +
      "esponse\022O\n\006result\030\001 \001(\0162?.POGOProtos.Net" +
      "working.Responses.SetBuddyPokemonRespons" +
      "e.Result\0224\n\rupdated_buddy\030\002 \001(\0132\035.POGOPr" +
      "otos.Data.BuddyPokemon\022?\n\robserved_data\030" +
      "\003 \001(\0132(.POGOProtos.Data.Buddy.BuddyObser" +
      "vedData\022\024\n\014km_remaining\030\004 \001(\001\"\263\001\n\006Result" +
      "\022\t\n\005UNEST\020\000\022\013\n\007SUCCESS\020\001\022\032\n\026ERROR_POKEMO" +
      "N_DEPLOYED\020\002\022\033\n\027ERROR_POKEMON_NOT_OWNED\020" +
      "\003\022\030\n\024ERROR_POKEMON_IS_EGG\020\004\022\031\n\025ERROR_INV" +
      "ALID_POKEMON\020\005\022#\n\037ERROR_BUDDY_SWAP_LIMIT" +
      "_EXCEEDED\020\006B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.BuddyPokemonOuterClass.getDescriptor(),
          POGOProtos.Data.Buddy.BuddyObservedDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_SetBuddyPokemonResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_SetBuddyPokemonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_SetBuddyPokemonResponse_descriptor,
        new java.lang.String[] { "Result", "UpdatedBuddy", "ObservedData", "KmRemaining", });
    POGOProtos.Data.BuddyPokemonOuterClass.getDescriptor();
    POGOProtos.Data.Buddy.BuddyObservedDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
