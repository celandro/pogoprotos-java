// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Buddy/BuddyData.proto

package POGOProtos.Data.Buddy;

public final class BuddyDataOuterClass {
  private BuddyDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Buddy_BuddyData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Buddy_BuddyData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Buddy_BuddyData_DailyActivityCountersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Buddy_BuddyData_DailyActivityCountersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Buddy_BuddyData_DailyCategoryCountersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Buddy_BuddyData_DailyCategoryCountersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Buddy_BuddyData_SouvenirsCollectedEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Buddy_BuddyData_SouvenirsCollectedEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Buddy_BuddyData_ActivityEmotionLastIncrementMsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Buddy_BuddyData_ActivityEmotionLastIncrementMsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_BuddyStatsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_BuddyStatsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%POGOProtos/Data/Buddy/BuddyData.proto\022" +
      "\025POGOProtos.Data.Buddy\032%POGOProtos/Data/" +
      "Buddy/BuddyGift.proto\032\"POGOProtos/Data/Q" +
      "uests/Quest.proto\032\036POGOProtos/Data/Souve" +
      "nir.proto\032$POGOProtos/Data/PokemonDispla" +
      "y.proto\032 POGOProtos/Enums/PokemonId.prot" +
      "o\032&POGOProtos/Inventory/Item/ItemId.prot" +
      "o\"\366\021\n\tBuddyData\022\030\n\020buddy_pokemon_id\030\001 \001(" +
      "\006\022\035\n\025current_points_earned\030\002 \001(\005\022\035\n\025high" +
      "est_points_earned\030\003 \001(\005\022\034\n\024last_reached_" +
      "full_ms\030\004 \001(\003\022\027\n\017last_groomed_ms\030\005 \001(\003\022\031" +
      "\n\021map_expiration_ms\030\007 \001(\003\022\030\n\020km_candy_pe" +
      "nding\030\014 \001(\002\022>\n\024buddy_gift_picked_up\030\017 \001(" +
      "\0132 .POGOProtos.Data.Buddy.BuddyGift\022\036\n\026c" +
      "urrent_emotion_points\030\022 \001(\005\022\\\n\027daily_act" +
      "ivity_counters\030\023 \003(\0132;.POGOProtos.Data.B" +
      "uddy.BuddyData.DailyActivityCountersEntr" +
      "y\022\\\n\027daily_category_counters\030\024 \003(\0132;.POG" +
      "OProtos.Data.Buddy.BuddyData.DailyCatego" +
      "ryCountersEntry\022F\n\013stats_today\030\025 \001(\01321.P" +
      "OGOProtos.Data.Buddy.BuddyData.BuddyStor" +
      "edStats\022F\n\013stats_total\030\026 \001(\01321.POGOProto" +
      "s.Data.Buddy.BuddyData.BuddyStoredStats\022" +
      "U\n\023souvenirs_collected\030\027 \003(\01328.POGOProto" +
      "s.Data.Buddy.BuddyData.SouvenirsCollecte" +
      "dEntry\022\035\n\025current_hunger_points\030\030 \001(\005\022!\n" +
      "\031interaction_expiration_ms\030\031 \001(\003\022$\n\034poff" +
      "in_feeding_expiration_ms\030\032 \001(\003\022,\n$last_a" +
      "ffection_or_emotion_awarded_km\030\033 \001(\002\022\035\n\025" +
      "last_set_timestamp_ms\030\034 \001(\003\022\037\n\027last_unse" +
      "t_timestamp_ms\030\035 \001(\003\022\017\n\007ditched\030\036 \001(\010\0228\n" +
      "\017pokemon_display\030\037 \001(\0132\037.POGOProtos.Data" +
      ".PokemonDisplay\022\030\n\020hatched_from_egg\030  \001(" +
      "\010\022\020\n\010nickname\030! \001(\t\022\033\n\023captured_s2_cell_" +
      "id\030\" \001(\003\0229\n\024pokedex_entry_number\030# \001(\0162\033" +
      ".POGOProtos.Enums.PokemonId\022\035\n\025creation_" +
      "timestamp_ms\030$ \001(\003\0223\n\010pokeball\030% \001(\0162!.P" +
      "OGOProtos.Inventory.Item.ItemId\022!\n\031num_d" +
      "ays_spent_with_buddy\030& \001(\005\022\037\n\027original_o" +
      "wner_nickname\030\' \001(\t\022\026\n\016traded_time_ms\030( " +
      "\001(\003\022\031\n\021attractive_poi_id\030) \001(\t\022%\n\035attrac" +
      "tive_poi_time_generated\030* \001(\003\022\"\n\032attract" +
      "ive_poi_cooldown_ms\030+ \001(\003\022\036\n\026attractive_" +
      "poi_visited\030, \001(\010\022\031\n\021berry_cooldown_ms\030-" +
      " \001(\003\022p\n\"activity_emotion_last_increment_" +
      "ms\030. \003(\0132D.POGOProtos.Data.Buddy.BuddyDa" +
      "ta.ActivityEmotionLastIncrementMsEntry\022\016" +
      "\n\006window\030/ \001(\003\022\023\n\013last_fed_ms\0300 \001(\003\022 \n\030l" +
      "ast_window_buddy_on_map\0301 \001(\005\022\036\n\026last_wi" +
      "ndow_fed_poffin\0302 \001(\005\022\033\n\023yatta_expiratio" +
      "n_ms\0303 \001(\003\022\025\n\rhunger_points\0304 \001(\002\032h\n\032Dai" +
      "lyActivityCountersEntry\022\013\n\003key\030\001 \001(\005\0229\n\005" +
      "value\030\002 \001(\0132*.POGOProtos.Data.Quests.Que" +
      "st.DailyCounter:\0028\001\032h\n\032DailyCategoryCoun" +
      "tersEntry\022\013\n\003key\030\001 \001(\005\0229\n\005value\030\002 \001(\0132*." +
      "POGOProtos.Data.Quests.Quest.DailyCounte" +
      "r:\0028\001\032T\n\027SouvenirsCollectedEntry\022\013\n\003key\030" +
      "\001 \001(\005\022(\n\005value\030\002 \001(\0132\031.POGOProtos.Data.S" +
      "ouvenir:\0028\001\032E\n#ActivityEmotionLastIncrem" +
      "entMsEntry\022\013\n\003key\030\001 \001(\005\022\r\n\005value\030\002 \001(\003:\002" +
      "8\001\032\255\001\n\020BuddyStoredStats\022\016\n\006window\030\001 \001(\003\022" +
      "V\n\013buddy_stats\030\002 \003(\0132A.POGOProtos.Data.B" +
      "uddy.BuddyData.BuddyStoredStats.BuddySta" +
      "tsEntry\0321\n\017BuddyStatsEntry\022\013\n\003key\030\001 \001(\005\022" +
      "\r\n\005value\030\002 \001(\002:\0028\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Buddy.BuddyGiftOuterClass.getDescriptor(),
          POGOProtos.Data.Quests.QuestOuterClass.getDescriptor(),
          POGOProtos.Data.SouvenirOuterClass.getDescriptor(),
          POGOProtos.Data.PokemonDisplayOuterClass.getDescriptor(),
          POGOProtos.Enums.PokemonIdOuterClass.getDescriptor(),
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Buddy_BuddyData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Buddy_BuddyData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Buddy_BuddyData_descriptor,
        new java.lang.String[] { "BuddyPokemonId", "CurrentPointsEarned", "HighestPointsEarned", "LastReachedFullMs", "LastGroomedMs", "MapExpirationMs", "KmCandyPending", "BuddyGiftPickedUp", "CurrentEmotionPoints", "DailyActivityCounters", "DailyCategoryCounters", "StatsToday", "StatsTotal", "SouvenirsCollected", "CurrentHungerPoints", "InteractionExpirationMs", "PoffinFeedingExpirationMs", "LastAffectionOrEmotionAwardedKm", "LastSetTimestampMs", "LastUnsetTimestampMs", "Ditched", "PokemonDisplay", "HatchedFromEgg", "Nickname", "CapturedS2CellId", "PokedexEntryNumber", "CreationTimestampMs", "Pokeball", "NumDaysSpentWithBuddy", "OriginalOwnerNickname", "TradedTimeMs", "AttractivePoiId", "AttractivePoiTimeGenerated", "AttractivePoiCooldownMs", "AttractivePoiVisited", "BerryCooldownMs", "ActivityEmotionLastIncrementMs", "Window", "LastFedMs", "LastWindowBuddyOnMap", "LastWindowFedPoffin", "YattaExpirationMs", "HungerPoints", });
    internal_static_POGOProtos_Data_Buddy_BuddyData_DailyActivityCountersEntry_descriptor =
      internal_static_POGOProtos_Data_Buddy_BuddyData_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_Buddy_BuddyData_DailyActivityCountersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Buddy_BuddyData_DailyActivityCountersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_POGOProtos_Data_Buddy_BuddyData_DailyCategoryCountersEntry_descriptor =
      internal_static_POGOProtos_Data_Buddy_BuddyData_descriptor.getNestedTypes().get(1);
    internal_static_POGOProtos_Data_Buddy_BuddyData_DailyCategoryCountersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Buddy_BuddyData_DailyCategoryCountersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_POGOProtos_Data_Buddy_BuddyData_SouvenirsCollectedEntry_descriptor =
      internal_static_POGOProtos_Data_Buddy_BuddyData_descriptor.getNestedTypes().get(2);
    internal_static_POGOProtos_Data_Buddy_BuddyData_SouvenirsCollectedEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Buddy_BuddyData_SouvenirsCollectedEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_POGOProtos_Data_Buddy_BuddyData_ActivityEmotionLastIncrementMsEntry_descriptor =
      internal_static_POGOProtos_Data_Buddy_BuddyData_descriptor.getNestedTypes().get(3);
    internal_static_POGOProtos_Data_Buddy_BuddyData_ActivityEmotionLastIncrementMsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Buddy_BuddyData_ActivityEmotionLastIncrementMsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_descriptor =
      internal_static_POGOProtos_Data_Buddy_BuddyData_descriptor.getNestedTypes().get(4);
    internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_descriptor,
        new java.lang.String[] { "Window", "BuddyStats", });
    internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_BuddyStatsEntry_descriptor =
      internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_BuddyStatsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Buddy_BuddyData_BuddyStoredStats_BuddyStatsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    POGOProtos.Data.Buddy.BuddyGiftOuterClass.getDescriptor();
    POGOProtos.Data.Quests.QuestOuterClass.getDescriptor();
    POGOProtos.Data.SouvenirOuterClass.getDescriptor();
    POGOProtos.Data.PokemonDisplayOuterClass.getDescriptor();
    POGOProtos.Enums.PokemonIdOuterClass.getDescriptor();
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
