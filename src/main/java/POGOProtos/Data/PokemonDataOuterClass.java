// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/PokemonData.proto

package POGOProtos.Data;

public final class PokemonDataOuterClass {
  private PokemonDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_PokemonData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_PokemonData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!POGOProtos/Data/PokemonData.proto\022\017POG" +
      "OProtos.Data\032$POGOProtos/Data/PokemonDis" +
      "play.proto\032 POGOProtos/Enums/PokemonId.p" +
      "roto\032\"POGOProtos/Enums/PokemonMove.proto" +
      "\032)POGOProtos/Enums/HoloPokemonEggType.pr" +
      "oto\032&POGOProtos/Inventory/Item/ItemId.pr" +
      "oto\032/POGOProtos/Data/Combat/PokemonComba" +
      "tStats.proto\"\240\r\n\013PokemonData\022\n\n\002id\030\001 \001(\006" +
      "\022/\n\npokemon_id\030\002 \001(\0162\033.POGOProtos.Enums." +
      "PokemonId\022\n\n\002cp\030\003 \001(\005\022\017\n\007stamina\030\004 \001(\005\022\023" +
      "\n\013stamina_max\030\005 \001(\005\022-\n\006move_1\030\006 \001(\0162\035.PO" +
      "GOProtos.Enums.PokemonMove\022-\n\006move_2\030\007 \001" +
      "(\0162\035.POGOProtos.Enums.PokemonMove\022\030\n\020dep" +
      "loyed_fort_id\030\010 \001(\t\022\022\n\nowner_name\030\t \001(\t\022" +
      "\016\n\006is_egg\030\n \001(\010\022\034\n\024egg_km_walked_target\030" +
      "\013 \001(\001\022\033\n\023egg_km_walked_start\030\014 \001(\001\022\016\n\006or" +
      "igin\030\016 \001(\005\022\020\n\010height_m\030\017 \001(\002\022\021\n\tweight_k" +
      "g\030\020 \001(\002\022\031\n\021individual_attack\030\021 \001(\005\022\032\n\022in" +
      "dividual_defense\030\022 \001(\005\022\032\n\022individual_sta" +
      "mina\030\023 \001(\005\022\025\n\rcp_multiplier\030\024 \001(\002\0223\n\010pok" +
      "eball\030\025 \001(\0162!.POGOProtos.Inventory.Item." +
      "ItemId\022\030\n\020captured_cell_id\030\026 \001(\004\022\030\n\020batt" +
      "les_attacked\030\027 \001(\005\022\030\n\020battles_defended\030\030" +
      " \001(\005\022\030\n\020egg_incubator_id\030\031 \001(\t\022\030\n\020creati" +
      "on_time_ms\030\032 \001(\004\022\024\n\014num_upgrades\030\033 \001(\005\022 " +
      "\n\030additional_cp_multiplier\030\034 \001(\002\022\020\n\010favo" +
      "rite\030\035 \001(\005\022\020\n\010nickname\030\036 \001(\t\022\021\n\tfrom_for" +
      "t\030\037 \001(\005\022\033\n\023buddy_candy_awarded\030  \001(\005\022\035\n\025" +
      "buddy_total_km_walked\030! \001(\002\022\032\n\022display_p" +
      "okemon_id\030\" \001(\005\022\022\n\ndisplay_cp\030# \001(\005\0228\n\017p" +
      "okemon_display\030$ \001(\0132\037.POGOProtos.Data.P" +
      "okemonDisplay\022\016\n\006is_bad\030% \001(\010\022\030\n\020hatched" +
      "_from_egg\030& \001(\010\022\026\n\016coins_returned\030\' \001(\005\022" +
      "\034\n\024deployed_duration_ms\030( \001(\003\022&\n\036deploye" +
      "d_returned_timestamp_ms\030) \001(\003\022$\n\034cp_mult" +
      "iplier_before_trading\030* \001(\002\022#\n\033trading_o" +
      "riginal_owner_hash\030+ \001(\005\022\037\n\027original_own" +
      "er_nickname\030, \001(\t\022\026\n\016traded_time_ms\030- \001(" +
      "\003\022\020\n\010is_lucky\030. \001(\010\022-\n\006move_3\030/ \001(\0162\035.PO" +
      "GOProtos.Enums.PokemonMove\022D\n\020pvp_combat" +
      "_stats\0300 \001(\0132*.POGOProtos.Data.Combat.Po" +
      "kemonCombatStats\022D\n\020npc_combat_stats\0301 \001" +
      "(\0132*.POGOProtos.Data.Combat.PokemonComba" +
      "tStats\022#\n\033move2_is_purified_exclusive\0302 " +
      "\001(\010\022\"\n\032limited_pokemon_identifier\0303 \001(\t\022" +
      "\026\n\016pre_boosted_cp\0304 \001(\005\022,\n$pre_boosted_a" +
      "dditional_cp_multiplier\0305 \001(\002\022\037\n\027deploye" +
      "d_gym_lat_degree\0307 \001(\001\022\037\n\027deployed_gym_l" +
      "ng_degree\0308 \001(\001\0226\n\010egg_type\030: \001(\0162$.POGO" +
      "Protos.Enums.HoloPokemonEggTypeB\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PokemonDisplayOuterClass.getDescriptor(),
          POGOProtos.Enums.PokemonIdOuterClass.getDescriptor(),
          POGOProtos.Enums.PokemonMoveOuterClass.getDescriptor(),
          POGOProtos.Enums.HoloPokemonEggTypeOuterClass.getDescriptor(),
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.PokemonCombatStatsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_PokemonData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_PokemonData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_PokemonData_descriptor,
        new java.lang.String[] { "Id", "PokemonId", "Cp", "Stamina", "StaminaMax", "Move1", "Move2", "DeployedFortId", "OwnerName", "IsEgg", "EggKmWalkedTarget", "EggKmWalkedStart", "Origin", "HeightM", "WeightKg", "IndividualAttack", "IndividualDefense", "IndividualStamina", "CpMultiplier", "Pokeball", "CapturedCellId", "BattlesAttacked", "BattlesDefended", "EggIncubatorId", "CreationTimeMs", "NumUpgrades", "AdditionalCpMultiplier", "Favorite", "Nickname", "FromFort", "BuddyCandyAwarded", "BuddyTotalKmWalked", "DisplayPokemonId", "DisplayCp", "PokemonDisplay", "IsBad", "HatchedFromEgg", "CoinsReturned", "DeployedDurationMs", "DeployedReturnedTimestampMs", "CpMultiplierBeforeTrading", "TradingOriginalOwnerHash", "OriginalOwnerNickname", "TradedTimeMs", "IsLucky", "Move3", "PvpCombatStats", "NpcCombatStats", "Move2IsPurifiedExclusive", "LimitedPokemonIdentifier", "PreBoostedCp", "PreBoostedAdditionalCpMultiplier", "DeployedGymLatDegree", "DeployedGymLngDegree", "EggType", });
    POGOProtos.Data.PokemonDisplayOuterClass.getDescriptor();
    POGOProtos.Enums.PokemonIdOuterClass.getDescriptor();
    POGOProtos.Enums.PokemonMoveOuterClass.getDescriptor();
    POGOProtos.Enums.HoloPokemonEggTypeOuterClass.getDescriptor();
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
    POGOProtos.Data.Combat.PokemonCombatStatsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
