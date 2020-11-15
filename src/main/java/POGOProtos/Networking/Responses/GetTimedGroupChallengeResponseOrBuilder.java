// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetTimedGroupChallengeResponse.proto

package POGOProtos.Networking.Responses;

public interface GetTimedGroupChallengeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.GetTimedGroupChallengeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.GetTimedGroupChallengeResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Networking.Responses.GetTimedGroupChallengeResponse.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Networking.Responses.GetTimedGroupChallengeResponse.Status getStatus();

  /**
   * <code>.POGOProtos.Networking.Responses.GetTimedGroupChallengeResponse.TimedGroupChallengeDefinition challenge_definition = 2;</code>
   * @return Whether the challengeDefinition field is set.
   */
  boolean hasChallengeDefinition();
  /**
   * <code>.POGOProtos.Networking.Responses.GetTimedGroupChallengeResponse.TimedGroupChallengeDefinition challenge_definition = 2;</code>
   * @return The challengeDefinition.
   */
  POGOProtos.Networking.Responses.GetTimedGroupChallengeResponse.TimedGroupChallengeDefinition getChallengeDefinition();
  /**
   * <code>.POGOProtos.Networking.Responses.GetTimedGroupChallengeResponse.TimedGroupChallengeDefinition challenge_definition = 2;</code>
   */
  POGOProtos.Networking.Responses.GetTimedGroupChallengeResponse.TimedGroupChallengeDefinitionOrBuilder getChallengeDefinitionOrBuilder();

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
