// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Combat/CombatChallenge.proto

package POGOProtos.Data.Combat;

public final class CombatChallengeOuterClass {
  private CombatChallengeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Combat_CombatChallenge_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Combat_CombatChallenge_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,POGOProtos/Data/Combat/CombatChallenge" +
      ".proto\022\026POGOProtos.Data.Combat\032!POGOProt" +
      "os/Enums/CombatType.proto\032,POGOProtos/Da" +
      "ta/Combat/ChallengePlayer.proto\"\214\004\n\017Comb" +
      "atChallenge\022\024\n\014challenge_id\030\001 \001(\t\022*\n\004typ" +
      "e\030\002 \001(\0162\034.POGOProtos.Enums.CombatType\022!\n" +
      "\031combat_league_template_id\030\003 \001(\t\022;\n\nchal" +
      "lenger\030\005 \001(\0132\'.POGOProtos.Data.Combat.Ch" +
      "allengePlayer\0229\n\010opponent\030\006 \001(\0132\'.POGOPr" +
      "otos.Data.Combat.ChallengePlayer\022K\n\005stat" +
      "e\030\007 \001(\0162<.POGOProtos.Data.Combat.CombatC" +
      "hallenge.CombatChallengeState\022\034\n\024created" +
      "_timestamp_ms\030\010 \001(\003\022\037\n\027expiration_timest" +
      "amp_ms\030\023 \001(\003\022\021\n\tcombat_id\030\n \001(\t\"}\n\024Comba" +
      "tChallengeState\022\t\n\005UNSET\020\000\022\013\n\007CREATED\020\001\022" +
      "\n\n\006OPENED\020\002\022\r\n\tCANCELLED\020\003\022\014\n\010ACCEPTED\020\004" +
      "\022\014\n\010DECLINED\020\005\022\t\n\005READY\020\006\022\013\n\007TIMEOUT\020\007B\002" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.CombatTypeOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.ChallengePlayerOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Combat_CombatChallenge_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Combat_CombatChallenge_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Combat_CombatChallenge_descriptor,
        new java.lang.String[] { "ChallengeId", "Type", "CombatLeagueTemplateId", "Challenger", "Opponent", "State", "CreatedTimestampMs", "ExpirationTimestampMs", "CombatId", });
    POGOProtos.Enums.CombatTypeOuterClass.getDescriptor();
    POGOProtos.Data.Combat.ChallengePlayerOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
