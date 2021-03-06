// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetBuddyWalkedOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetBuddyWalkedOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_candy_id = 2;</code>
   * @return The enum numeric value on the wire for familyCandyId.
   */
  int getFamilyCandyIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_candy_id = 2;</code>
   * @return The familyCandyId.
   */
  POGOProtos.Rpc.HoloPokemonFamilyId getFamilyCandyId();

  /**
   * <code>int32 candy_earned_count = 3;</code>
   * @return The candyEarnedCount.
   */
  int getCandyEarnedCount();

  /**
   * <code>double km_remaining = 4;</code>
   * @return The kmRemaining.
   */
  double getKmRemaining();

  /**
   * <code>double last_km_awarded = 5;</code>
   * @return The lastKmAwarded.
   */
  double getLastKmAwarded();

  /**
   * <code>int32 mega_energy_earned_count = 6;</code>
   * @return The megaEnergyEarnedCount.
   */
  int getMegaEnergyEarnedCount();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId mega_pokemon_id = 7;</code>
   * @return The enum numeric value on the wire for megaPokemonId.
   */
  int getMegaPokemonIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId mega_pokemon_id = 7;</code>
   * @return The megaPokemonId.
   */
  POGOProtos.Rpc.HoloPokemonId getMegaPokemonId();

  /**
   * <code>int32 xl_candy = 8;</code>
   * @return The xlCandy.
   */
  int getXlCandy();
}
