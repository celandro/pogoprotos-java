// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PokemonProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PokemonProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>int32 pokemon_id = 2;</code>
   * @return The pokemonId.
   */
  int getPokemonId();

  /**
   * <code>int32 cp = 3;</code>
   * @return The cp.
   */
  int getCp();

  /**
   * <code>int32 stamina = 4;</code>
   * @return The stamina.
   */
  int getStamina();

  /**
   * <code>int32 max_stamina = 5;</code>
   * @return The maxStamina.
   */
  int getMaxStamina();

  /**
   * <code>int32 move1 = 6;</code>
   * @return The move1.
   */
  int getMove1();

  /**
   * <code>int32 move2 = 7;</code>
   * @return The move2.
   */
  int getMove2();

  /**
   * <code>string deployed_fort_id = 8;</code>
   * @return The deployedFortId.
   */
  java.lang.String getDeployedFortId();
  /**
   * <code>string deployed_fort_id = 8;</code>
   * @return The bytes for deployedFortId.
   */
  com.google.protobuf.ByteString
      getDeployedFortIdBytes();

  /**
   * <code>string owner_name = 9;</code>
   * @return The ownerName.
   */
  java.lang.String getOwnerName();
  /**
   * <code>string owner_name = 9;</code>
   * @return The bytes for ownerName.
   */
  com.google.protobuf.ByteString
      getOwnerNameBytes();

  /**
   * <code>bool is_egg = 10;</code>
   * @return The isEgg.
   */
  boolean getIsEgg();

  /**
   * <code>double egg_km_walked_target = 11;</code>
   * @return The eggKmWalkedTarget.
   */
  double getEggKmWalkedTarget();

  /**
   * <code>double egg_km_walked_start = 12;</code>
   * @return The eggKmWalkedStart.
   */
  double getEggKmWalkedStart();

  /**
   * <code>.POGOProtos.Rpc.PokemonCreateContext origin = 14;</code>
   * @return The enum numeric value on the wire for origin.
   */
  int getOriginValue();
  /**
   * <code>.POGOProtos.Rpc.PokemonCreateContext origin = 14;</code>
   * @return The origin.
   */
  POGOProtos.Rpc.PokemonCreateContext getOrigin();

  /**
   * <code>float height_m = 15;</code>
   * @return The heightM.
   */
  float getHeightM();

  /**
   * <code>float weight_kg = 16;</code>
   * @return The weightKg.
   */
  float getWeightKg();

  /**
   * <code>int32 individual_attack = 17;</code>
   * @return The individualAttack.
   */
  int getIndividualAttack();

  /**
   * <code>int32 individual_defense = 18;</code>
   * @return The individualDefense.
   */
  int getIndividualDefense();

  /**
   * <code>int32 individual_stamina = 19;</code>
   * @return The individualStamina.
   */
  int getIndividualStamina();

  /**
   * <code>float cp_multiplier = 20;</code>
   * @return The cpMultiplier.
   */
  float getCpMultiplier();

  /**
   * <code>.POGOProtos.Rpc.Item pokeball = 21;</code>
   * @return The enum numeric value on the wire for pokeball.
   */
  int getPokeballValue();
  /**
   * <code>.POGOProtos.Rpc.Item pokeball = 21;</code>
   * @return The pokeball.
   */
  POGOProtos.Rpc.Item getPokeball();

  /**
   * <code>int64 captured_s2_cell_id = 22;</code>
   * @return The capturedS2CellId.
   */
  long getCapturedS2CellId();

  /**
   * <code>int32 battles_attacked = 23;</code>
   * @return The battlesAttacked.
   */
  int getBattlesAttacked();

  /**
   * <code>int32 battles_defended = 24;</code>
   * @return The battlesDefended.
   */
  int getBattlesDefended();

  /**
   * <code>string egg_incubator_id = 25;</code>
   * @return The eggIncubatorId.
   */
  java.lang.String getEggIncubatorId();
  /**
   * <code>string egg_incubator_id = 25;</code>
   * @return The bytes for eggIncubatorId.
   */
  com.google.protobuf.ByteString
      getEggIncubatorIdBytes();

  /**
   * <code>int64 creation_time_ms = 26;</code>
   * @return The creationTimeMs.
   */
  long getCreationTimeMs();

  /**
   * <code>int32 num_upgrades = 27;</code>
   * @return The numUpgrades.
   */
  int getNumUpgrades();

  /**
   * <code>float additional_cp_multiplier = 28;</code>
   * @return The additionalCpMultiplier.
   */
  float getAdditionalCpMultiplier();

  /**
   * <code>bool favorite = 29;</code>
   * @return The favorite.
   */
  boolean getFavorite();

  /**
   * <code>string nickname = 30;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 30;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>bool from_fort = 31;</code>
   * @return The fromFort.
   */
  boolean getFromFort();

  /**
   * <code>int32 buddy_candy_awarded = 32;</code>
   * @return The buddyCandyAwarded.
   */
  int getBuddyCandyAwarded();

  /**
   * <code>float buddy_km_walked = 33;</code>
   * @return The buddyKmWalked.
   */
  float getBuddyKmWalked();

  /**
   * <code>int32 display_pokemon_id = 34;</code>
   * @return The displayPokemonId.
   */
  int getDisplayPokemonId();

  /**
   * <code>int32 display_cp = 35;</code>
   * @return The displayCp.
   */
  int getDisplayCp();

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 36;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  boolean hasPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 36;</code>
   * @return The pokemonDisplay.
   */
  POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 36;</code>
   */
  POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder();

  /**
   * <code>bool is_bad = 37;</code>
   * @return The isBad.
   */
  boolean getIsBad();

  /**
   * <code>bool hatched_from_egg = 38;</code>
   * @return The hatchedFromEgg.
   */
  boolean getHatchedFromEgg();

  /**
   * <code>int32 coins_returned = 39;</code>
   * @return The coinsReturned.
   */
  int getCoinsReturned();

  /**
   * <code>int64 deployed_duration_ms = 40;</code>
   * @return The deployedDurationMs.
   */
  long getDeployedDurationMs();

  /**
   * <code>int64 deployed_returned_timestamp_ms = 41;</code>
   * @return The deployedReturnedTimestampMs.
   */
  long getDeployedReturnedTimestampMs();

  /**
   * <code>float cp_multiplier_before_trading = 42;</code>
   * @return The cpMultiplierBeforeTrading.
   */
  float getCpMultiplierBeforeTrading();

  /**
   * <code>int32 trading_original_owner_hash = 43;</code>
   * @return The tradingOriginalOwnerHash.
   */
  int getTradingOriginalOwnerHash();

  /**
   * <code>string original_owner_nickname = 44;</code>
   * @return The originalOwnerNickname.
   */
  java.lang.String getOriginalOwnerNickname();
  /**
   * <code>string original_owner_nickname = 44;</code>
   * @return The bytes for originalOwnerNickname.
   */
  com.google.protobuf.ByteString
      getOriginalOwnerNicknameBytes();

  /**
   * <code>int64 traded_time_ms = 45;</code>
   * @return The tradedTimeMs.
   */
  long getTradedTimeMs();

  /**
   * <code>bool is_lucky = 46;</code>
   * @return The isLucky.
   */
  boolean getIsLucky();

  /**
   * <code>int32 move3 = 47;</code>
   * @return The move3.
   */
  int getMove3();

  /**
   * <code>.POGOProtos.Rpc.PokemonCombatStatsProto pvp_combat_stats = 48;</code>
   * @return Whether the pvpCombatStats field is set.
   */
  boolean hasPvpCombatStats();
  /**
   * <code>.POGOProtos.Rpc.PokemonCombatStatsProto pvp_combat_stats = 48;</code>
   * @return The pvpCombatStats.
   */
  POGOProtos.Rpc.PokemonCombatStatsProto getPvpCombatStats();
  /**
   * <code>.POGOProtos.Rpc.PokemonCombatStatsProto pvp_combat_stats = 48;</code>
   */
  POGOProtos.Rpc.PokemonCombatStatsProtoOrBuilder getPvpCombatStatsOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PokemonCombatStatsProto npc_combat_stats = 49;</code>
   * @return Whether the npcCombatStats field is set.
   */
  boolean hasNpcCombatStats();
  /**
   * <code>.POGOProtos.Rpc.PokemonCombatStatsProto npc_combat_stats = 49;</code>
   * @return The npcCombatStats.
   */
  POGOProtos.Rpc.PokemonCombatStatsProto getNpcCombatStats();
  /**
   * <code>.POGOProtos.Rpc.PokemonCombatStatsProto npc_combat_stats = 49;</code>
   */
  POGOProtos.Rpc.PokemonCombatStatsProtoOrBuilder getNpcCombatStatsOrBuilder();

  /**
   * <code>bool move2_is_purified_exclusive = 50;</code>
   * @return The move2IsPurifiedExclusive.
   */
  boolean getMove2IsPurifiedExclusive();

  /**
   * <code>string limited_pokemon_identifier = 51;</code>
   * @return The limitedPokemonIdentifier.
   */
  java.lang.String getLimitedPokemonIdentifier();
  /**
   * <code>string limited_pokemon_identifier = 51;</code>
   * @return The bytes for limitedPokemonIdentifier.
   */
  com.google.protobuf.ByteString
      getLimitedPokemonIdentifierBytes();

  /**
   * <code>int32 pre_boosted_cp = 52;</code>
   * @return The preBoostedCp.
   */
  int getPreBoostedCp();

  /**
   * <code>float pre_boosted_additional_cp_multiplier = 53;</code>
   * @return The preBoostedAdditionalCpMultiplier.
   */
  float getPreBoostedAdditionalCpMultiplier();

  /**
   * <code>double deployed_gym_lat_degree = 55;</code>
   * @return The deployedGymLatDegree.
   */
  double getDeployedGymLatDegree();

  /**
   * <code>double deployed_gym_lng_degree = 56;</code>
   * @return The deployedGymLngDegree.
   */
  double getDeployedGymLngDegree();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonEggType egg_type = 58;</code>
   * @return The enum numeric value on the wire for eggType.
   */
  int getEggTypeValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonEggType egg_type = 58;</code>
   * @return The eggType.
   */
  POGOProtos.Rpc.HoloPokemonEggType getEggType();

  /**
   * <code>repeated .POGOProtos.Rpc.ClientQuestProto quest_buddy_evolution_requirement = 62;</code>
   */
  java.util.List<POGOProtos.Rpc.ClientQuestProto> 
      getQuestBuddyEvolutionRequirementList();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientQuestProto quest_buddy_evolution_requirement = 62;</code>
   */
  POGOProtos.Rpc.ClientQuestProto getQuestBuddyEvolutionRequirement(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ClientQuestProto quest_buddy_evolution_requirement = 62;</code>
   */
  int getQuestBuddyEvolutionRequirementCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientQuestProto quest_buddy_evolution_requirement = 62;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ClientQuestProtoOrBuilder> 
      getQuestBuddyEvolutionRequirementOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientQuestProto quest_buddy_evolution_requirement = 62;</code>
   */
  POGOProtos.Rpc.ClientQuestProtoOrBuilder getQuestBuddyEvolutionRequirementOrBuilder(
      int index);
}
