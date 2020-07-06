// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/PlayerStats.proto

package POGOProtos.Data.Player;

public final class PlayerStatsOuterClass {
  private PlayerStatsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Player_PlayerStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Player_PlayerStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(POGOProtos/Data/Player/PlayerStats.pro" +
      "to\022\026POGOProtos.Data.Player\032#POGOProtos/E" +
      "nums/GymBadgeType.proto\032.POGOProtos/Data" +
      "/Combat/PlayerCombatStats.proto\"\215\013\n\013Play" +
      "erStats\022\r\n\005level\030\001 \001(\005\022\022\n\nexperience\030\002 \001" +
      "(\003\022\025\n\rprev_level_xp\030\003 \001(\003\022\025\n\rnext_level_" +
      "xp\030\004 \001(\003\022\021\n\tkm_walked\030\005 \001(\002\022\034\n\024pokemons_" +
      "encountered\030\006 \001(\005\022\036\n\026unique_pokedex_entr" +
      "ies\030\007 \001(\005\022\031\n\021pokemons_captured\030\010 \001(\005\022\022\n\n" +
      "evolutions\030\t \001(\005\022\030\n\020poke_stop_visits\030\n \001" +
      "(\005\022\030\n\020pokeballs_thrown\030\013 \001(\005\022\024\n\014eggs_hat" +
      "ched\030\014 \001(\005\022\033\n\023big_magikarp_caught\030\r \001(\005\022" +
      "\031\n\021battle_attack_won\030\016 \001(\005\022\033\n\023battle_att" +
      "ack_total\030\017 \001(\005\022\033\n\023battle_defended_won\030\020" +
      " \001(\005\022\033\n\023battle_training_won\030\021 \001(\005\022\035\n\025bat" +
      "tle_training_total\030\022 \001(\005\022\035\n\025prestige_rai" +
      "sed_total\030\023 \001(\005\022\036\n\026prestige_dropped_tota" +
      "l\030\024 \001(\005\022\030\n\020pokemon_deployed\030\025 \001(\005\022\036\n\026pok" +
      "emon_caught_by_type\030\026 \003(\005\022\034\n\024small_ratta" +
      "ta_caught\030\027 \001(\005\022\024\n\014used_km_pool\030\030 \001(\001\022\031\n" +
      "\021last_km_refill_ms\030\031 \001(\003\022\033\n\023num_raid_bat" +
      "tle_won\030\032 \001(\005\022\035\n\025num_raid_battle_total\030\033" +
      " \001(\005\022 \n\030num_legendary_battle_won\030\034 \001(\005\022\"" +
      "\n\032num_legendary_battle_total\030\035 \001(\005\022\027\n\017nu" +
      "m_berries_fed\030\036 \001(\005\022\031\n\021total_defended_ms" +
      "\030\037 \001(\003\0224\n\014event_badges\030  \003(\0162\036.POGOProto" +
      "s.Enums.GymBadgeType\022!\n\031km_walked_past_a" +
      "ctive_day\030! \001(\002\022&\n\036num_challenge_quests_" +
      "completed\030\" \001(\005\022\022\n\nnum_trades\030# \001(\005\022\035\n\025n" +
      "um_max_level_friends\030$ \001(\005\022%\n\035trade_accu" +
      "mulated_distance_km\030% \001(\003\022(\n fitness_rep" +
      "ort_last_check_bucket\030& \001(\003\022?\n\014combat_st" +
      "ats\030\' \001(\0132).POGOProtos.Data.Combat.Playe" +
      "rCombatStats\022\033\n\023num_npc_combats_won\030( \001(" +
      "\005\022\035\n\025num_npc_combats_total\030) \001(\005\022\032\n\022num_" +
      "photobomb_seen\030* \001(\005\022\034\n\024num_pokemon_puri" +
      "fied\030+ \001(\005\022\033\n\023num_grunts_defeated\030, \001(\005\022" +
      "\030\n\020num_best_buddies\030/ \001(\005\022\036\n\026num_wayfare" +
      "r_agreement\0306 \001(\005\022$\n\034wayfarer_agreement_" +
      "update_ms\0307 \001(\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.GymBadgeTypeOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.PlayerCombatStatsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Player_PlayerStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Player_PlayerStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Player_PlayerStats_descriptor,
        new java.lang.String[] { "Level", "Experience", "PrevLevelXp", "NextLevelXp", "KmWalked", "PokemonsEncountered", "UniquePokedexEntries", "PokemonsCaptured", "Evolutions", "PokeStopVisits", "PokeballsThrown", "EggsHatched", "BigMagikarpCaught", "BattleAttackWon", "BattleAttackTotal", "BattleDefendedWon", "BattleTrainingWon", "BattleTrainingTotal", "PrestigeRaisedTotal", "PrestigeDroppedTotal", "PokemonDeployed", "PokemonCaughtByType", "SmallRattataCaught", "UsedKmPool", "LastKmRefillMs", "NumRaidBattleWon", "NumRaidBattleTotal", "NumLegendaryBattleWon", "NumLegendaryBattleTotal", "NumBerriesFed", "TotalDefendedMs", "EventBadges", "KmWalkedPastActiveDay", "NumChallengeQuestsCompleted", "NumTrades", "NumMaxLevelFriends", "TradeAccumulatedDistanceKm", "FitnessReportLastCheckBucket", "CombatStats", "NumNpcCombatsWon", "NumNpcCombatsTotal", "NumPhotobombSeen", "NumPokemonPurified", "NumGruntsDefeated", "NumBestBuddies", "NumWayfarerAgreement", "WayfarerAgreementUpdateMs", });
    POGOProtos.Enums.GymBadgeTypeOuterClass.getDescriptor();
    POGOProtos.Data.Combat.PlayerCombatStatsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
