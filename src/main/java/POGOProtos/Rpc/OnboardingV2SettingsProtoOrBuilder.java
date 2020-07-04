// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface OnboardingV2SettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.OnboardingV2SettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enable_onboarding_v2 = 1;</code>
   * @return The enableOnboardingV2.
   */
  boolean getEnableOnboardingV2();

  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
   * @return A list containing the pokedexId.
   */
  java.util.List<POGOProtos.Rpc.HoloPokemonId> getPokedexIdList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
   * @return The count of pokedexId.
   */
  int getPokedexIdCount();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
   * @param index The index of the element to return.
   * @return The pokedexId at the given index.
   */
  POGOProtos.Rpc.HoloPokemonId getPokedexId(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
   * @return A list containing the enum numeric values on the wire for pokedexId.
   */
  java.util.List<java.lang.Integer>
  getPokedexIdValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId pokedex_id = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of pokedexId at the given index.
   */
  int getPokedexIdValue(int index);

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId onboarding_egg_pokemon = 3;</code>
   * @return The enum numeric value on the wire for onboardingEggPokemon.
   */
  int getOnboardingEggPokemonValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId onboarding_egg_pokemon = 3;</code>
   * @return The onboardingEggPokemon.
   */
  POGOProtos.Rpc.HoloPokemonId getOnboardingEggPokemon();

  /**
   * <code>int32 egg_km_until_hatch = 4;</code>
   * @return The eggKmUntilHatch.
   */
  int getEggKmUntilHatch();
}