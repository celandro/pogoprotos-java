// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PokemonEncounterAttributesProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PokemonEncounterAttributesProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float base_capture_rate = 1;</code>
   * @return The baseCaptureRate.
   */
  float getBaseCaptureRate();

  /**
   * <code>float base_flee_rate = 2;</code>
   * @return The baseFleeRate.
   */
  float getBaseFleeRate();

  /**
   * <code>float collision_radius_m = 3;</code>
   * @return The collisionRadiusM.
   */
  float getCollisionRadiusM();

  /**
   * <code>float collision_height_m = 4;</code>
   * @return The collisionHeightM.
   */
  float getCollisionHeightM();

  /**
   * <code>float collision_head_radius_m = 5;</code>
   * @return The collisionHeadRadiusM.
   */
  float getCollisionHeadRadiusM();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMovementType movement_type = 6;</code>
   * @return The enum numeric value on the wire for movementType.
   */
  int getMovementTypeValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMovementType movement_type = 6;</code>
   * @return The movementType.
   */
  POGOProtos.Rpc.HoloPokemonMovementType getMovementType();

  /**
   * <code>float movement_timer_s = 7;</code>
   * @return The movementTimerS.
   */
  float getMovementTimerS();

  /**
   * <code>float jump_time_s = 8;</code>
   * @return The jumpTimeS.
   */
  float getJumpTimeS();

  /**
   * <code>float attack_timer_s = 9;</code>
   * @return The attackTimerS.
   */
  float getAttackTimerS();

  /**
   * <code>int32 bonus_candy_capture_reward = 10;</code>
   * @return The bonusCandyCaptureReward.
   */
  int getBonusCandyCaptureReward();

  /**
   * <code>int32 bonus_stardust_capture_reward = 11;</code>
   * @return The bonusStardustCaptureReward.
   */
  int getBonusStardustCaptureReward();

  /**
   * <code>float attack_probability = 12;</code>
   * @return The attackProbability.
   */
  float getAttackProbability();

  /**
   * <code>float dodge_probability = 13;</code>
   * @return The dodgeProbability.
   */
  float getDodgeProbability();

  /**
   * <code>float dodge_duration_s = 14;</code>
   * @return The dodgeDurationS.
   */
  float getDodgeDurationS();

  /**
   * <code>float dodge_distance = 15;</code>
   * @return The dodgeDistance.
   */
  float getDodgeDistance();

  /**
   * <code>float camera_distance = 16;</code>
   * @return The cameraDistance.
   */
  float getCameraDistance();

  /**
   * <code>float min_pokemon_action_frequency_s = 17;</code>
   * @return The minPokemonActionFrequencyS.
   */
  float getMinPokemonActionFrequencyS();

  /**
   * <code>float max_pokemon_action_frequency_s = 18;</code>
   * @return The maxPokemonActionFrequencyS.
   */
  float getMaxPokemonActionFrequencyS();
}
