// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/PokemonData.proto

package POGOProtos.Data;

public interface PokemonDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.PokemonData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.POGOProtos.Enums.PokemonId pokemon_id = 2;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  int getPokemonIdValue();
  /**
   * <code>.POGOProtos.Enums.PokemonId pokemon_id = 2;</code>
   * @return The pokemonId.
   */
  POGOProtos.Enums.PokemonId getPokemonId();

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
   * <code>int32 stamina_max = 5;</code>
   * @return The staminaMax.
   */
  int getStaminaMax();

  /**
   * <code>.POGOProtos.Enums.PokemonMove move_1 = 6;</code>
   * @return The enum numeric value on the wire for move1.
   */
  int getMove1Value();
  /**
   * <code>.POGOProtos.Enums.PokemonMove move_1 = 6;</code>
   * @return The move1.
   */
  POGOProtos.Enums.PokemonMove getMove1();

  /**
   * <code>.POGOProtos.Enums.PokemonMove move_2 = 7;</code>
   * @return The enum numeric value on the wire for move2.
   */
  int getMove2Value();
  /**
   * <code>.POGOProtos.Enums.PokemonMove move_2 = 7;</code>
   * @return The move2.
   */
  POGOProtos.Enums.PokemonMove getMove2();

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
   * <code>int32 origin = 14;</code>
   * @return The origin.
   */
  int getOrigin();

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
   * <code>.POGOProtos.Inventory.Item.ItemId pokeball = 21;</code>
   * @return The enum numeric value on the wire for pokeball.
   */
  int getPokeballValue();
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId pokeball = 21;</code>
   * @return The pokeball.
   */
  POGOProtos.Inventory.Item.ItemId getPokeball();

  /**
   * <code>uint64 captured_cell_id = 22;</code>
   * @return The capturedCellId.
   */
  long getCapturedCellId();

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
   * <code>uint64 creation_time_ms = 26;</code>
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
   * <code>int32 favorite = 29;</code>
   * @return The favorite.
   */
  int getFavorite();

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
   * <code>int32 from_fort = 31;</code>
   * @return The fromFort.
   */
  int getFromFort();

  /**
   * <code>int32 buddy_candy_awarded = 32;</code>
   * @return The buddyCandyAwarded.
   */
  int getBuddyCandyAwarded();

  /**
   * <code>float buddy_total_km_walked = 33;</code>
   * @return The buddyTotalKmWalked.
   */
  float getBuddyTotalKmWalked();

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
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 36;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  boolean hasPokemonDisplay();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 36;</code>
   * @return The pokemonDisplay.
   */
  POGOProtos.Data.PokemonDisplay getPokemonDisplay();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 36;</code>
   */
  POGOProtos.Data.PokemonDisplayOrBuilder getPokemonDisplayOrBuilder();

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
   * <code>.POGOProtos.Enums.PokemonMove move_3 = 47;</code>
   * @return The enum numeric value on the wire for move3.
   */
  int getMove3Value();
  /**
   * <code>.POGOProtos.Enums.PokemonMove move_3 = 47;</code>
   * @return The move3.
   */
  POGOProtos.Enums.PokemonMove getMove3();

  /**
   * <code>.POGOProtos.Data.Combat.PokemonCombatStats pvp_combat_stats = 48;</code>
   * @return Whether the pvpCombatStats field is set.
   */
  boolean hasPvpCombatStats();
  /**
   * <code>.POGOProtos.Data.Combat.PokemonCombatStats pvp_combat_stats = 48;</code>
   * @return The pvpCombatStats.
   */
  POGOProtos.Data.Combat.PokemonCombatStats getPvpCombatStats();
  /**
   * <code>.POGOProtos.Data.Combat.PokemonCombatStats pvp_combat_stats = 48;</code>
   */
  POGOProtos.Data.Combat.PokemonCombatStatsOrBuilder getPvpCombatStatsOrBuilder();

  /**
   * <code>.POGOProtos.Data.Combat.PokemonCombatStats npc_combat_stats = 49;</code>
   * @return Whether the npcCombatStats field is set.
   */
  boolean hasNpcCombatStats();
  /**
   * <code>.POGOProtos.Data.Combat.PokemonCombatStats npc_combat_stats = 49;</code>
   * @return The npcCombatStats.
   */
  POGOProtos.Data.Combat.PokemonCombatStats getNpcCombatStats();
  /**
   * <code>.POGOProtos.Data.Combat.PokemonCombatStats npc_combat_stats = 49;</code>
   */
  POGOProtos.Data.Combat.PokemonCombatStatsOrBuilder getNpcCombatStatsOrBuilder();

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
   * <code>.POGOProtos.Enums.HoloPokemonEggType egg_type = 58;</code>
   * @return The enum numeric value on the wire for eggType.
   */
  int getEggTypeValue();
  /**
   * <code>.POGOProtos.Enums.HoloPokemonEggType egg_type = 58;</code>
   * @return The eggType.
   */
  POGOProtos.Enums.HoloPokemonEggType getEggType();
}
