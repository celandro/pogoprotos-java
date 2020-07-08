// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Friends/FriendshipLevelData.proto

package POGOProtos.Data.Friends;

public interface FriendshipLevelDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Friends.FriendshipLevelData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 bucket = 1;</code>
   * @return The bucket.
   */
  long getBucket();

  /**
   * <code>int32 points_earned_today = 2;</code>
   * @return The pointsEarnedToday.
   */
  int getPointsEarnedToday();

  /**
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone awarded_friendship_milestone = 3;</code>
   * @return The enum numeric value on the wire for awardedFriendshipMilestone.
   */
  int getAwardedFriendshipMilestoneValue();
  /**
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone awarded_friendship_milestone = 3;</code>
   * @return The awardedFriendshipMilestone.
   */
  POGOProtos.Enums.FriendshipLevelMilestone getAwardedFriendshipMilestone();

  /**
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone current_friendship_milestone = 4;</code>
   * @return The enum numeric value on the wire for currentFriendshipMilestone.
   */
  int getCurrentFriendshipMilestoneValue();
  /**
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone current_friendship_milestone = 4;</code>
   * @return The currentFriendshipMilestone.
   */
  POGOProtos.Enums.FriendshipLevelMilestone getCurrentFriendshipMilestone();

  /**
   * <code>double next_friendship_milestone_progress_percentage = 5;</code>
   * @return The nextFriendshipMilestoneProgressPercentage.
   */
  double getNextFriendshipMilestoneProgressPercentage();

  /**
   * <code>int32 points_toward_next_milestone = 6;</code>
   * @return The pointsTowardNextMilestone.
   */
  int getPointsTowardNextMilestone();
}