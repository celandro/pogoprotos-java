// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/SubmitCombatChallengePokemonsMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface SubmitCombatChallengePokemonsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.SubmitCombatChallengePokemonsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string challenge_id = 1;</code>
   * @return The challengeId.
   */
  java.lang.String getChallengeId();
  /**
   * <code>string challenge_id = 1;</code>
   * @return The bytes for challengeId.
   */
  com.google.protobuf.ByteString
      getChallengeIdBytes();

  /**
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @return A list containing the attackingPokemonId.
   */
  java.util.List<java.lang.Long> getAttackingPokemonIdList();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @return The count of attackingPokemonId.
   */
  int getAttackingPokemonIdCount();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @param index The index of the element to return.
   * @return The attackingPokemonId at the given index.
   */
  long getAttackingPokemonId(int index);
}
