// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface EvolvePokemonProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.EvolvePokemonProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed64 pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  long getPokemonId();

  /**
   * <code>.POGOProtos.Rpc.Item evolution_item_requirement = 2;</code>
   * @return The enum numeric value on the wire for evolutionItemRequirement.
   */
  int getEvolutionItemRequirementValue();
  /**
   * <code>.POGOProtos.Rpc.Item evolution_item_requirement = 2;</code>
   * @return The evolutionItemRequirement.
   */
  POGOProtos.Rpc.Item getEvolutionItemRequirement();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId target_pokemon_id = 3;</code>
   * @return The enum numeric value on the wire for targetPokemonId.
   */
  int getTargetPokemonIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId target_pokemon_id = 3;</code>
   * @return The targetPokemonId.
   */
  POGOProtos.Rpc.HoloPokemonId getTargetPokemonId();

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form target_pokemon_form = 4;</code>
   * @return The enum numeric value on the wire for targetPokemonForm.
   */
  int getTargetPokemonFormValue();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form target_pokemon_form = 4;</code>
   * @return The targetPokemonForm.
   */
  POGOProtos.Rpc.PokemonDisplayProto.Form getTargetPokemonForm();

  /**
   * <code>bool use_special = 5;</code>
   * @return The useSpecial.
   */
  boolean getUseSpecial();
}