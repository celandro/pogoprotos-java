// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GymStartSessionResponse.proto

package POGOProtos.Networking.Responses;

public final class GymStartSessionResponseOuterClass {
  private GymStartSessionResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=POGOProtos/Networking/Responses/GymSta" +
      "rtSessionResponse.proto\022\037POGOProtos.Netw" +
      "orking.Responses\032#POGOProtos/Data/Battle" +
      "/Battle.proto\"\311\004\n\027GymStartSessionRespons" +
      "e\022O\n\006result\030\001 \001(\0162?.POGOProtos.Networkin" +
      "g.Responses.GymStartSessionResponse.Resu" +
      "lt\022.\n\006battle\030\002 \001(\0132\036.POGOProtos.Data.Bat" +
      "tle.Battle\"\254\003\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCC" +
      "ESS\020\001\022\027\n\023ERROR_GYM_NOT_FOUND\020\002\022\025\n\021ERROR_" +
      "GYM_NEUTRAL\020\003\022\030\n\024ERROR_GYM_WRONG_TEAM\020\004\022" +
      "\023\n\017ERROR_GYM_EMPTY\020\005\022\032\n\026ERROR_INVALID_DE" +
      "FENDER\020\006\022)\n%ERROR_TRAINING_INVALID_ATTAC" +
      "KER_COUNT\020\007\022\035\n\031ERROR_ALL_POKEMON_FAINTED" +
      "\020\010\022\032\n\026ERROR_TOO_MANY_BATTLES\020\t\022\032\n\026ERROR_" +
      "TOO_MANY_PLAYERS\020\n\022\034\n\030ERROR_GYM_BATTLE_L" +
      "OCKOUT\020\013\022$\n ERROR_PLAYER_BELOW_MINIMUM_L" +
      "EVEL\020\014\022\026\n\022ERROR_NOT_IN_RANGE\020\r\022\032\n\026ERROR_" +
      "POI_INACCESSIBLE\020\016\022\025\n\021ERROR_RAID_ACTIVE\020" +
      "\017B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Battle.BattleOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_descriptor,
        new java.lang.String[] { "Result", "Battle", });
    POGOProtos.Data.Battle.BattleOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
