// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GroupChallengeCriteriaProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GroupChallengeCriteriaProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.QuestType challenge_type = 1;</code>
   * @return The enum numeric value on the wire for challengeType.
   */
  int getChallengeTypeValue();
  /**
   * <code>.POGOProtos.Rpc.QuestType challenge_type = 1;</code>
   * @return The challengeType.
   */
  POGOProtos.Rpc.QuestType getChallengeType();

  /**
   * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
   * @return Whether the challengeGoal field is set.
   */
  boolean hasChallengeGoal();
  /**
   * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
   * @return The challengeGoal.
   */
  POGOProtos.Rpc.QuestGoalProto getChallengeGoal();
  /**
   * <code>.POGOProtos.Rpc.QuestGoalProto challenge_goal = 2;</code>
   */
  POGOProtos.Rpc.QuestGoalProtoOrBuilder getChallengeGoalOrBuilder();
}