// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Gym/GymMembership.proto

package POGOProtos.Data.Gym;

public interface GymMembershipOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Gym.GymMembership)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
   * @return Whether the pokemonData field is set.
   */
  boolean hasPokemonData();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
   * @return The pokemonData.
   */
  POGOProtos.Data.PokemonData getPokemonData();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
   */
  POGOProtos.Data.PokemonDataOrBuilder getPokemonDataOrBuilder();

  /**
   * <code>.POGOProtos.Data.Player.PlayerPublicProfile trainer_public_profile = 2;</code>
   * @return Whether the trainerPublicProfile field is set.
   */
  boolean hasTrainerPublicProfile();
  /**
   * <code>.POGOProtos.Data.Player.PlayerPublicProfile trainer_public_profile = 2;</code>
   * @return The trainerPublicProfile.
   */
  POGOProtos.Data.Player.PlayerPublicProfile getTrainerPublicProfile();
  /**
   * <code>.POGOProtos.Data.Player.PlayerPublicProfile trainer_public_profile = 2;</code>
   */
  POGOProtos.Data.Player.PlayerPublicProfileOrBuilder getTrainerPublicProfileOrBuilder();

  /**
   * <code>.POGOProtos.Data.PokemonData training_pokemon = 3;</code>
   * @return Whether the trainingPokemon field is set.
   */
  boolean hasTrainingPokemon();
  /**
   * <code>.POGOProtos.Data.PokemonData training_pokemon = 3;</code>
   * @return The trainingPokemon.
   */
  POGOProtos.Data.PokemonData getTrainingPokemon();
  /**
   * <code>.POGOProtos.Data.PokemonData training_pokemon = 3;</code>
   */
  POGOProtos.Data.PokemonDataOrBuilder getTrainingPokemonOrBuilder();
}
