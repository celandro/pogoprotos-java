// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/DeclineCombatChallengeResponse.proto

package POGOProtos.Networking.Responses;

public final class DeclineCombatChallengeResponseOuterClass {
  private DeclineCombatChallengeResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_DeclineCombatChallengeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_DeclineCombatChallengeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDPOGOProtos/Networking/Responses/Declin" +
      "eCombatChallengeResponse.proto\022\037POGOProt" +
      "os.Networking.Responses\"\226\002\n\036DeclineComba" +
      "tChallengeResponse\022V\n\006result\030\001 \001(\0162F.POG" +
      "OProtos.Networking.Responses.DeclineComb" +
      "atChallengeResponse.Result\"\233\001\n\006Result\022\t\n" +
      "\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022!\n\035ERROR_INVALID_C" +
      "HALLENGE_STATE\020\002\022\035\n\031ERROR_CHALLENGE_NOT_" +
      "FOUND\020\003\022\032\n\026ERROR_ALREADY_TIMEDOUT\020\004\022\033\n\027E" +
      "RROR_ALREADY_CANCELLED\020\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_DeclineCombatChallengeResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_DeclineCombatChallengeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_DeclineCombatChallengeResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
