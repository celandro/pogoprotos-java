// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/CreateCombatChallengeResponse.proto

package POGOProtos.Networking.Responses;

public final class CreateCombatChallengeResponseOuterClass {
  private CreateCombatChallengeResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_CreateCombatChallengeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_CreateCombatChallengeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCPOGOProtos/Networking/Responses/Create" +
      "CombatChallengeResponse.proto\022\037POGOProto" +
      "s.Networking.Responses\032,POGOProtos/Data/" +
      "Combat/CombatChallenge.proto\"\267\002\n\035CreateC" +
      "ombatChallengeResponse\022U\n\006result\030\001 \001(\0162E" +
      ".POGOProtos.Networking.Responses.CreateC" +
      "ombatChallengeResponse.Result\022:\n\tchallen" +
      "ge\030\002 \001(\0132\'.POGOProtos.Data.Combat.Combat" +
      "Challenge\"\202\001\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCE" +
      "SS\020\001\022!\n\035ERROR_INVALID_CHALLENGE_STATE\020\002\022" +
      "$\n ERROR_PLAYER_BELOW_MINIMUM_LEVEL\020\003\022\027\n" +
      "\023ERROR_ACCESS_DENIED\020\004B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Combat.CombatChallengeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_CreateCombatChallengeResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_CreateCombatChallengeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_CreateCombatChallengeResponse_descriptor,
        new java.lang.String[] { "Result", "Challenge", });
    POGOProtos.Data.Combat.CombatChallengeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}