// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Pokemon/EvolutionBranch.proto

package POGOProtos.Settings.Master.Pokemon;

public interface EvolutionBranchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.Pokemon.EvolutionBranch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.PokemonId evolution = 1;</code>
   * @return The enum numeric value on the wire for evolution.
   */
  int getEvolutionValue();
  /**
   * <code>.POGOProtos.Enums.PokemonId evolution = 1;</code>
   * @return The evolution.
   */
  POGOProtos.Enums.PokemonId getEvolution();

  /**
   * <code>.POGOProtos.Inventory.Item.ItemId evolution_item_requirement = 2;</code>
   * @return The enum numeric value on the wire for evolutionItemRequirement.
   */
  int getEvolutionItemRequirementValue();
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId evolution_item_requirement = 2;</code>
   * @return The evolutionItemRequirement.
   */
  POGOProtos.Inventory.Item.ItemId getEvolutionItemRequirement();

  /**
   * <code>int32 candy_cost = 3;</code>
   * @return The candyCost.
   */
  int getCandyCost();

  /**
   * <code>float km_buddy_distance_requirement = 4;</code>
   * @return The kmBuddyDistanceRequirement.
   */
  float getKmBuddyDistanceRequirement();

  /**
   * <code>.POGOProtos.Enums.Form form = 5;</code>
   * @return The enum numeric value on the wire for form.
   */
  int getFormValue();
  /**
   * <code>.POGOProtos.Enums.Form form = 5;</code>
   * @return The form.
   */
  POGOProtos.Enums.Form getForm();

  /**
   * <code>.POGOProtos.Enums.Gender gender_requirement = 6;</code>
   * @return The enum numeric value on the wire for genderRequirement.
   */
  int getGenderRequirementValue();
  /**
   * <code>.POGOProtos.Enums.Gender gender_requirement = 6;</code>
   * @return The genderRequirement.
   */
  POGOProtos.Enums.Gender getGenderRequirement();

  /**
   * <code>.POGOProtos.Inventory.Item.ItemId lure_item_requirement = 8;</code>
   * @return The enum numeric value on the wire for lureItemRequirement.
   */
  int getLureItemRequirementValue();
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId lure_item_requirement = 8;</code>
   * @return The lureItemRequirement.
   */
  POGOProtos.Inventory.Item.ItemId getLureItemRequirement();

  /**
   * <code>bool must_be_buddy = 9;</code>
   * @return The mustBeBuddy.
   */
  boolean getMustBeBuddy();

  /**
   * <code>bool only_daytime = 10;</code>
   * @return The onlyDaytime.
   */
  boolean getOnlyDaytime();

  /**
   * <code>bool only_nighttime = 11;</code>
   * @return The onlyNighttime.
   */
  boolean getOnlyNighttime();

  /**
   * <code>int32 priority = 12;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <code>bool no_candy_cost_via_trade = 13;</code>
   * @return The noCandyCostViaTrade.
   */
  boolean getNoCandyCostViaTrade();

  /**
   * <code>.POGOProtos.Enums.TemporaryEvolutionId temporary_evolution = 14;</code>
   * @return The enum numeric value on the wire for temporaryEvolution.
   */
  int getTemporaryEvolutionValue();
  /**
   * <code>.POGOProtos.Enums.TemporaryEvolutionId temporary_evolution = 14;</code>
   * @return The temporaryEvolution.
   */
  POGOProtos.Enums.TemporaryEvolutionId getTemporaryEvolution();

  /**
   * <code>int32 temporary_evolution_energy_cost = 15;</code>
   * @return The temporaryEvolutionEnergyCost.
   */
  int getTemporaryEvolutionEnergyCost();

  /**
   * <code>int32 temporary_evolution_energy_cost_subsequent = 16;</code>
   * @return The temporaryEvolutionEnergyCostSubsequent.
   */
  int getTemporaryEvolutionEnergyCostSubsequent();

  /**
   * <code>repeated .POGOProtos.Data.PokemonData.PokemonEvolutionQuest.EvolutionQuestInfo quest_display = 17;</code>
   */
  java.util.List<POGOProtos.Data.PokemonData.PokemonEvolutionQuest.EvolutionQuestInfo> 
      getQuestDisplayList();
  /**
   * <code>repeated .POGOProtos.Data.PokemonData.PokemonEvolutionQuest.EvolutionQuestInfo quest_display = 17;</code>
   */
  POGOProtos.Data.PokemonData.PokemonEvolutionQuest.EvolutionQuestInfo getQuestDisplay(int index);
  /**
   * <code>repeated .POGOProtos.Data.PokemonData.PokemonEvolutionQuest.EvolutionQuestInfo quest_display = 17;</code>
   */
  int getQuestDisplayCount();
  /**
   * <code>repeated .POGOProtos.Data.PokemonData.PokemonEvolutionQuest.EvolutionQuestInfo quest_display = 17;</code>
   */
  java.util.List<? extends POGOProtos.Data.PokemonData.PokemonEvolutionQuest.EvolutionQuestInfoOrBuilder> 
      getQuestDisplayOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.PokemonData.PokemonEvolutionQuest.EvolutionQuestInfo quest_display = 17;</code>
   */
  POGOProtos.Data.PokemonData.PokemonEvolutionQuest.EvolutionQuestInfoOrBuilder getQuestDisplayOrBuilder(
      int index);
}
