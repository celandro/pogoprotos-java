// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GymFeedPokemonResponse.proto

package POGOProtos.Networking.Responses;

public interface GymFeedPokemonResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.GymFeedPokemonResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.GymFeedPokemonResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.GymFeedPokemonResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.GymFeedPokemonResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.Gym.GymStatusAndDefenders gym_status_and_defenders = 2;</code>
   * @return Whether the gymStatusAndDefenders field is set.
   */
  boolean hasGymStatusAndDefenders();
  /**
   * <code>.POGOProtos.Data.Gym.GymStatusAndDefenders gym_status_and_defenders = 2;</code>
   * @return The gymStatusAndDefenders.
   */
  POGOProtos.Data.Gym.GymStatusAndDefenders getGymStatusAndDefenders();
  /**
   * <code>.POGOProtos.Data.Gym.GymStatusAndDefenders gym_status_and_defenders = 2;</code>
   */
  POGOProtos.Data.Gym.GymStatusAndDefendersOrBuilder getGymStatusAndDefendersOrBuilder();

  /**
   * <code>.POGOProtos.Data.Badge.AwardedGymBadge awarded_gym_badge = 3;</code>
   * @return Whether the awardedGymBadge field is set.
   */
  boolean hasAwardedGymBadge();
  /**
   * <code>.POGOProtos.Data.Badge.AwardedGymBadge awarded_gym_badge = 3;</code>
   * @return The awardedGymBadge.
   */
  POGOProtos.Data.Badge.AwardedGymBadge getAwardedGymBadge();
  /**
   * <code>.POGOProtos.Data.Badge.AwardedGymBadge awarded_gym_badge = 3;</code>
   */
  POGOProtos.Data.Badge.AwardedGymBadgeOrBuilder getAwardedGymBadgeOrBuilder();

  /**
   * <code>int32 stardust_awarded = 4;</code>
   * @return The stardustAwarded.
   */
  int getStardustAwarded();

  /**
   * <code>int32 xp_awarded = 5;</code>
   * @return The xpAwarded.
   */
  int getXpAwarded();

  /**
   * <code>int32 num_candy_awarded = 6;</code>
   * @return The numCandyAwarded.
   */
  int getNumCandyAwarded();

  /**
   * <code>.POGOProtos.Enums.PokemonFamilyId family_candy_id = 7;</code>
   * @return The enum numeric value on the wire for familyCandyId.
   */
  int getFamilyCandyIdValue();
  /**
   * <code>.POGOProtos.Enums.PokemonFamilyId family_candy_id = 7;</code>
   * @return The familyCandyId.
   */
  POGOProtos.Enums.PokemonFamilyId getFamilyCandyId();

  /**
   * <code>int64 cooldown_complete = 8;</code>
   * @return The cooldownComplete.
   */
  long getCooldownComplete();
}
