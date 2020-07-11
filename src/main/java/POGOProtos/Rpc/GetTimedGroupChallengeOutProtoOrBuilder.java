// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface GetTimedGroupChallengeOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetTimedGroupChallengeOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetTimedGroupChallengeOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.GetTimedGroupChallengeOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.GetTimedGroupChallengeOutProto.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.TimedGroupChallengeDefinitionProto challenge_definition = 2;</code>
   * @return Whether the challengeDefinition field is set.
   */
  boolean hasChallengeDefinition();
  /**
   * <code>.POGOProtos.Rpc.TimedGroupChallengeDefinitionProto challenge_definition = 2;</code>
   * @return The challengeDefinition.
   */
  POGOProtos.Rpc.TimedGroupChallengeDefinitionProto getChallengeDefinition();
  /**
   * <code>.POGOProtos.Rpc.TimedGroupChallengeDefinitionProto challenge_definition = 2;</code>
   */
  POGOProtos.Rpc.TimedGroupChallengeDefinitionProtoOrBuilder getChallengeDefinitionOrBuilder();

  /**
   * <code>int32 current_score = 3;</code>
   * @return The currentScore.
   */
  int getCurrentScore();

  /**
   * <code>int32 player_score = 4;</code>
   * @return The playerScore.
   */
  int getPlayerScore();

  /**
   * <code>string active_city_hash = 5;</code>
   * @return The activeCityHash.
   */
  java.lang.String getActiveCityHash();
  /**
   * <code>string active_city_hash = 5;</code>
   * @return The bytes for activeCityHash.
   */
  com.google.protobuf.ByteString
      getActiveCityHashBytes();

  /**
   * <code>repeated string active_city_localization_key_changes = 6;</code>
   * @return A list containing the activeCityLocalizationKeyChanges.
   */
  java.util.List<java.lang.String>
      getActiveCityLocalizationKeyChangesList();
  /**
   * <code>repeated string active_city_localization_key_changes = 6;</code>
   * @return The count of activeCityLocalizationKeyChanges.
   */
  int getActiveCityLocalizationKeyChangesCount();
  /**
   * <code>repeated string active_city_localization_key_changes = 6;</code>
   * @param index The index of the element to return.
   * @return The activeCityLocalizationKeyChanges at the given index.
   */
  java.lang.String getActiveCityLocalizationKeyChanges(int index);
  /**
   * <code>repeated string active_city_localization_key_changes = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the activeCityLocalizationKeyChanges at the given index.
   */
  com.google.protobuf.ByteString
      getActiveCityLocalizationKeyChangesBytes(int index);
}
