// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/GymBadgeGmtSettings.proto

package POGOProtos.Settings.Master;

public final class GymBadgeGmtSettingsOuterClass {
  private GymBadgeGmtSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_GymBadgeGmtSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_GymBadgeGmtSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4POGOProtos/Settings/Master/GymBadgeGmt" +
      "Settings.proto\022\032POGOProtos.Settings.Mast" +
      "er\"\371\001\n\023GymBadgeGmtSettings\022\016\n\006target\030\001 \003" +
      "(\005\022,\n$battle_winning_score_per_defender_" +
      "cp\030\002 \001(\002\022&\n\036gym_defending_score_per_minu" +
      "te\030\003 \001(\002\022\033\n\023berry_feeding_score\030\004 \001(\005\022\034\n" +
      "\024pokemon_deploy_score\030\005 \001(\005\022!\n\031raid_batt" +
      "le_winning_score\030\006 \001(\005\022\036\n\026lose_all_battl" +
      "es_score\030\007 \001(\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_GymBadgeGmtSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_GymBadgeGmtSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_GymBadgeGmtSettings_descriptor,
        new java.lang.String[] { "Target", "BattleWinningScorePerDefenderCp", "GymDefendingScorePerMinute", "BerryFeedingScore", "PokemonDeployScore", "RaidBattleWinningScore", "LoseAllBattlesScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
