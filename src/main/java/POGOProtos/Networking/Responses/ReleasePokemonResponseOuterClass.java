// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/ReleasePokemonResponse.proto

package POGOProtos.Networking.Responses;

public final class ReleasePokemonResponseOuterClass {
  private ReleasePokemonResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_ReleasePokemonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_ReleasePokemonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<POGOProtos/Networking/Responses/Releas" +
      "ePokemonResponse.proto\022\037POGOProtos.Netwo" +
      "rking.Responses\"\223\002\n\026ReleasePokemonRespon" +
      "se\022N\n\006result\030\001 \001(\0162>.POGOProtos.Networki" +
      "ng.Responses.ReleasePokemonResponse.Resu" +
      "lt\022\025\n\rcandy_awarded\030\002 \001(\005\022\030\n\020xl_candy_aw" +
      "arded\030\003 \001(\005\"x\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCC" +
      "ESS\020\001\022\024\n\020POKEMON_DEPLOYED\020\002\022\n\n\006FAILED\020\003\022" +
      "\030\n\024ERROR_POKEMON_IS_EGG\020\004\022\032\n\026ERROR_POKEM" +
      "ON_IS_BUDDY\020\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_ReleasePokemonResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_ReleasePokemonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_ReleasePokemonResponse_descriptor,
        new java.lang.String[] { "Result", "CandyAwarded", "XlCandyAwarded", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}