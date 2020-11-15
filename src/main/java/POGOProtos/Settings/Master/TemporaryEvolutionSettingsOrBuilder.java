// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/TemporaryEvolutionSettings.proto

package POGOProtos.Settings.Master;

public interface TemporaryEvolutionSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.TemporaryEvolutionSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.PokemonId pokemon = 1;</code>
   * @return The enum numeric value on the wire for pokemon.
   */
  int getPokemonValue();
  /**
   * <code>.POGOProtos.Enums.PokemonId pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Enums.PokemonId getPokemon();

  /**
   * <code>repeated .POGOProtos.Settings.Master.TemporaryEvolutionSettings.TemporaryEvolution temporary_evolutions = 2;</code>
   */
  java.util.List<POGOProtos.Settings.Master.TemporaryEvolutionSettings.TemporaryEvolution> 
      getTemporaryEvolutionsList();
  /**
   * <code>repeated .POGOProtos.Settings.Master.TemporaryEvolutionSettings.TemporaryEvolution temporary_evolutions = 2;</code>
   */
  POGOProtos.Settings.Master.TemporaryEvolutionSettings.TemporaryEvolution getTemporaryEvolutions(int index);
  /**
   * <code>repeated .POGOProtos.Settings.Master.TemporaryEvolutionSettings.TemporaryEvolution temporary_evolutions = 2;</code>
   */
  int getTemporaryEvolutionsCount();
  /**
   * <code>repeated .POGOProtos.Settings.Master.TemporaryEvolutionSettings.TemporaryEvolution temporary_evolutions = 2;</code>
   */
  java.util.List<? extends POGOProtos.Settings.Master.TemporaryEvolutionSettings.TemporaryEvolutionOrBuilder> 
      getTemporaryEvolutionsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Settings.Master.TemporaryEvolutionSettings.TemporaryEvolution temporary_evolutions = 2;</code>
   */
  POGOProtos.Settings.Master.TemporaryEvolutionSettings.TemporaryEvolutionOrBuilder getTemporaryEvolutionsOrBuilder(
      int index);
}
