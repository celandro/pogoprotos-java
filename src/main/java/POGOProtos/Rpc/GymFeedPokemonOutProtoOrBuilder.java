// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface GymFeedPokemonOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GymFeedPokemonOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GymFeedPokemonOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GymFeedPokemonOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GymFeedPokemonOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto gym_status_and_defenders = 2;</code>
   * @return Whether the gymStatusAndDefenders field is set.
   */
  boolean hasGymStatusAndDefenders();
  /**
   * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto gym_status_and_defenders = 2;</code>
   * @return The gymStatusAndDefenders.
   */
  POGOProtos.Rpc.GymStatusAndDefendersProto getGymStatusAndDefenders();
  /**
   * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto gym_status_and_defenders = 2;</code>
   */
  POGOProtos.Rpc.GymStatusAndDefendersProtoOrBuilder getGymStatusAndDefendersOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.AwardedGymBadge gym_badge = 3;</code>
   * @return Whether the gymBadge field is set.
   */
  boolean hasGymBadge();
  /**
   * <code>.POGOProtos.Rpc.AwardedGymBadge gym_badge = 3;</code>
   * @return The gymBadge.
   */
  POGOProtos.Rpc.AwardedGymBadge getGymBadge();
  /**
   * <code>.POGOProtos.Rpc.AwardedGymBadge gym_badge = 3;</code>
   */
  POGOProtos.Rpc.AwardedGymBadgeOrBuilder getGymBadgeOrBuilder();

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
   * <code>.POGOProtos.Rpc.HoloPokemonFamilyId candy_family_id = 7;</code>
   * @return The enum numeric value on the wire for candyFamilyId.
   */
  int getCandyFamilyIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonFamilyId candy_family_id = 7;</code>
   * @return The candyFamilyId.
   */
  POGOProtos.Rpc.HoloPokemonFamilyId getCandyFamilyId();

  /**
   * <code>int64 cooldown_complete = 8;</code>
   * @return The cooldownComplete.
   */
  long getCooldownComplete();
}
