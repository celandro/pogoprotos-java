// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Battle/Battle.proto

package POGOProtos.Data.Battle;

public final class BattleOuterClass {
  private BattleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Battle_Battle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Battle_Battle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#POGOProtos/Data/Battle/Battle.proto\022\026P" +
      "OGOProtos.Data.Battle\032.POGOProtos/Data/B" +
      "attle/BattleParticipant.proto\032&POGOProto" +
      "s/Data/Battle/BattleLog.proto\032\'POGOProto" +
      "s/Enums/WeatherCondition.proto\032/POGOProt" +
      "os/Enums/FriendshipLevelMilestone.proto\"" +
      "\215\003\n\006Battle\022\027\n\017battle_start_ms\030\001 \001(\003\022\025\n\rb" +
      "attle_end_ms\030\002 \001(\003\022\021\n\tbattle_id\030\003 \001(\t\022;\n" +
      "\010defender\030\004 \001(\0132).POGOProtos.Data.Battle" +
      ".BattleParticipant\0225\n\nbattle_log\030\005 \001(\0132!" +
      ".POGOProtos.Data.Battle.BattleLog\022;\n\010att" +
      "acker\030\006 \001(\0132).POGOProtos.Data.Battle.Bat" +
      "tleParticipant\022=\n\021weather_condition\030\007 \001(" +
      "\0162\".POGOProtos.Enums.WeatherCondition\022P\n" +
      "\034highest_friendship_milestone\030\010 \001(\0162*.PO" +
      "GOProtos.Enums.FriendshipLevelMilestoneB" +
      "\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Battle.BattleParticipantOuterClass.getDescriptor(),
          POGOProtos.Data.Battle.BattleLogOuterClass.getDescriptor(),
          POGOProtos.Enums.WeatherConditionOuterClass.getDescriptor(),
          POGOProtos.Enums.FriendshipLevelMilestoneOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Battle_Battle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Battle_Battle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Battle_Battle_descriptor,
        new java.lang.String[] { "BattleStartMs", "BattleEndMs", "BattleId", "Defender", "BattleLog", "Attacker", "WeatherCondition", "HighestFriendshipMilestone", });
    POGOProtos.Data.Battle.BattleParticipantOuterClass.getDescriptor();
    POGOProtos.Data.Battle.BattleLogOuterClass.getDescriptor();
    POGOProtos.Enums.WeatherConditionOuterClass.getDescriptor();
    POGOProtos.Enums.FriendshipLevelMilestoneOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
