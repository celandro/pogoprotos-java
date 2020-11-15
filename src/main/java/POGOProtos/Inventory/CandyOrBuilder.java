// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/Candy.proto

package POGOProtos.Inventory;

public interface CandyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Inventory.Candy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.PokemonFamilyId family_id = 1;</code>
   * @return The enum numeric value on the wire for familyId.
   */
  int getFamilyIdValue();
  /**
   * <code>.POGOProtos.Enums.PokemonFamilyId family_id = 1;</code>
   * @return The familyId.
   */
  POGOProtos.Enums.PokemonFamilyId getFamilyId();

  /**
   * <code>int32 candy = 2;</code>
   * @return The candy.
   */
  int getCandy();

  /**
   * <code>repeated .POGOProtos.Inventory.Candy.TemporaryEvolutionResource mega_evolution_resources = 3;</code>
   */
  java.util.List<POGOProtos.Inventory.Candy.TemporaryEvolutionResource> 
      getMegaEvolutionResourcesList();
  /**
   * <code>repeated .POGOProtos.Inventory.Candy.TemporaryEvolutionResource mega_evolution_resources = 3;</code>
   */
  POGOProtos.Inventory.Candy.TemporaryEvolutionResource getMegaEvolutionResources(int index);
  /**
   * <code>repeated .POGOProtos.Inventory.Candy.TemporaryEvolutionResource mega_evolution_resources = 3;</code>
   */
  int getMegaEvolutionResourcesCount();
  /**
   * <code>repeated .POGOProtos.Inventory.Candy.TemporaryEvolutionResource mega_evolution_resources = 3;</code>
   */
  java.util.List<? extends POGOProtos.Inventory.Candy.TemporaryEvolutionResourceOrBuilder> 
      getMegaEvolutionResourcesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Inventory.Candy.TemporaryEvolutionResource mega_evolution_resources = 3;</code>
   */
  POGOProtos.Inventory.Candy.TemporaryEvolutionResourceOrBuilder getMegaEvolutionResourcesOrBuilder(
      int index);

  /**
   * <code>int32 xl_candy = 4;</code>
   * @return The xlCandy.
   */
  int getXlCandy();
}
