// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/CombatChallengeGlobalSettings.proto

package POGOProtos.Settings;

public final class CombatChallengeGlobalSettingsOuterClass {
  private CombatChallengeGlobalSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Settings/CombatChallengeGlo" +
      "balSettings.proto\022\023POGOProtos.Settings\032/" +
      "POGOProtos/Enums/FriendshipLevelMileston" +
      "e.proto\"\374\001\n\035CombatChallengeGlobalSetting" +
      "s\022\\\n(distance_check_override_friendship_" +
      "level\030\001 \001(\0162*.POGOProtos.Enums.Friendshi" +
      "pLevelMilestone\0221\n)get_combat_challenge_" +
      "polling_interval_sec\030\002 \001(\005\022\"\n\032enable_dow" +
      "nstream_dispatch\030\003 \001(\010\022&\n\036enable_challen" +
      "ge_notifications\030\004 \001(\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.FriendshipLevelMilestoneOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_CombatChallengeGlobalSettings_descriptor,
        new java.lang.String[] { "DistanceCheckOverrideFriendshipLevel", "GetCombatChallengePollingIntervalSec", "EnableDownstreamDispatch", "EnableChallengeNotifications", });
    POGOProtos.Enums.FriendshipLevelMilestoneOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}