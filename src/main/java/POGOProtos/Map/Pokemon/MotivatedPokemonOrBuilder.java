// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Pokemon/MotivatedPokemon.proto

package POGOProtos.Map.Pokemon;

public interface MotivatedPokemonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Map.Pokemon.MotivatedPokemon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.PokemonData pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Data.PokemonData getPokemon();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon = 1;</code>
   */
  POGOProtos.Data.PokemonDataOrBuilder getPokemonOrBuilder();

  /**
   * <code>int64 deploy_ms = 2;</code>
   * @return The deployMs.
   */
  long getDeployMs();

  /**
   * <code>int32 cp_when_deployed = 3;</code>
   * @return The cpWhenDeployed.
   */
  int getCpWhenDeployed();

  /**
   * <code>double motivation_now = 4;</code>
   * @return The motivationNow.
   */
  double getMotivationNow();

  /**
   * <code>int32 cp_now = 5;</code>
   * @return The cpNow.
   */
  int getCpNow();

  /**
   * <code>float berry_value = 6;</code>
   * @return The berryValue.
   */
  float getBerryValue();

  /**
   * <code>int64 feed_cooldown_duration_millis = 7;</code>
   * @return The feedCooldownDurationMillis.
   */
  long getFeedCooldownDurationMillis();

  /**
   * <code>repeated .POGOProtos.Map.Pokemon.MotivatedPokemon.FoodValue food_value = 8;</code>
   */
  java.util.List<POGOProtos.Map.Pokemon.MotivatedPokemon.FoodValue> 
      getFoodValueList();
  /**
   * <code>repeated .POGOProtos.Map.Pokemon.MotivatedPokemon.FoodValue food_value = 8;</code>
   */
  POGOProtos.Map.Pokemon.MotivatedPokemon.FoodValue getFoodValue(int index);
  /**
   * <code>repeated .POGOProtos.Map.Pokemon.MotivatedPokemon.FoodValue food_value = 8;</code>
   */
  int getFoodValueCount();
  /**
   * <code>repeated .POGOProtos.Map.Pokemon.MotivatedPokemon.FoodValue food_value = 8;</code>
   */
  java.util.List<? extends POGOProtos.Map.Pokemon.MotivatedPokemon.FoodValueOrBuilder> 
      getFoodValueOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Map.Pokemon.MotivatedPokemon.FoodValue food_value = 8;</code>
   */
  POGOProtos.Map.Pokemon.MotivatedPokemon.FoodValueOrBuilder getFoodValueOrBuilder(
      int index);
}
