// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetCombatChallengeResponse.proto

package POGOProtos.Networking.Responses;

public interface GetCombatChallengeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.GetCombatChallengeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.GetCombatChallengeResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.GetCombatChallengeResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.GetCombatChallengeResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
   * @return Whether the challenge field is set.
   */
  boolean hasChallenge();
  /**
   * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
   * @return The challenge.
   */
  POGOProtos.Data.Combat.CombatChallenge getChallenge();
  /**
   * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
   */
  POGOProtos.Data.Combat.CombatChallengeOrBuilder getChallengeOrBuilder();
}
