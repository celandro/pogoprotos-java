// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetCombatChallengeResponse.proto

package POGOProtos.Networking.Responses;

public final class GetCombatChallengeResponseOuterClass {
  private GetCombatChallengeResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetCombatChallengeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetCombatChallengeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@POGOProtos/Networking/Responses/GetCom" +
      "batChallengeResponse.proto\022\037POGOProtos.N" +
      "etworking.Responses\032,POGOProtos/Data/Com" +
      "bat/CombatChallenge.proto\"\355\001\n\032GetCombatC" +
      "hallengeResponse\022R\n\006result\030\001 \001(\0162B.POGOP" +
      "rotos.Networking.Responses.GetCombatChal" +
      "lengeResponse.Result\022:\n\tchallenge\030\002 \001(\0132" +
      "\'.POGOProtos.Data.Combat.CombatChallenge" +
      "\"?\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\035\n\031ER" +
      "ROR_CHALLENGE_NOT_FOUND\020\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Combat.CombatChallengeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_GetCombatChallengeResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GetCombatChallengeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetCombatChallengeResponse_descriptor,
        new java.lang.String[] { "Result", "Challenge", });
    POGOProtos.Data.Combat.CombatChallengeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
