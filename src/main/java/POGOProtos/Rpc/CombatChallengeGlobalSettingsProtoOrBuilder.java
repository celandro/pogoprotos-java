// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CombatChallengeGlobalSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CombatChallengeGlobalSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone distance_check_override_friendship_level = 1;</code>
   * @return The enum numeric value on the wire for distanceCheckOverrideFriendshipLevel.
   */
  int getDistanceCheckOverrideFriendshipLevelValue();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone distance_check_override_friendship_level = 1;</code>
   * @return The distanceCheckOverrideFriendshipLevel.
   */
  POGOProtos.Rpc.FriendshipLevelMilestone getDistanceCheckOverrideFriendshipLevel();

  /**
   * <code>int32 get_combat_challenge_polling_interval_sec = 2;</code>
   * @return The getCombatChallengePollingIntervalSec.
   */
  int getGetCombatChallengePollingIntervalSec();

  /**
   * <code>bool enable_downstream_dispatch = 3;</code>
   * @return The enableDownstreamDispatch.
   */
  boolean getEnableDownstreamDispatch();

  /**
   * <code>bool enable_challenge_notifications = 4;</code>
   * @return The enableChallengeNotifications.
   */
  boolean getEnableChallengeNotifications();
}
