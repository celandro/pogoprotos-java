// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/DownloadItemTemplatesResponse.proto

package POGOProtos.Networking.Responses;

public final class DownloadItemTemplatesResponseOuterClass {
  private DownloadItemTemplatesResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_ProjectVacation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_ProjectVacation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCPOGOProtos/Networking/Responses/Downlo" +
      "adItemTemplatesResponse.proto\022\037POGOProto" +
      "s.Networking.Responses\0320POGOProtos/Data/" +
      "Avatar/AvatarCustomization.proto\032.POGOPr" +
      "otos/Settings/Master/BadgeSettings.proto" +
      "\032/POGOProtos/Settings/Master/CameraSetti" +
      "ngs.proto\0322POGOProtos/Settings/Master/En" +
      "counterSettings.proto\0326POGOProtos/Settin" +
      "gs/Master/EquippedBadgeSettings.proto\032-P" +
      "OGOProtos/Settings/Master/FormSettings.p" +
      "roto\0322POGOProtos/Settings/Master/GymBatt" +
      "leSettings.proto\0321POGOProtos/Settings/Ma" +
      "ster/GymLevelSettings.proto\032/POGOProtos/" +
      "Settings/Master/IapItemDisplay.proto\032,PO" +
      "GOProtos/Settings/Master/IapSettings.pro" +
      "to\032-POGOProtos/Settings/Master/ItemSetti" +
      "ngs.proto\0325POGOProtos/Settings/Master/Mo" +
      "veSequenceSettings.proto\032-POGOProtos/Set" +
      "tings/Master/MoveSettings.proto\0324POGOPro" +
      "tos/Settings/Master/PlayerLevelSettings." +
      "proto\0320POGOProtos/Settings/Master/Pokemo" +
      "nSettings.proto\0327POGOProtos/Settings/Mas" +
      "ter/PokemonUpgradeSettings.proto\032.POGOPr" +
      "otos/Settings/Master/QuestSettings.proto" +
      "\0326POGOProtos/Settings/Master/TypeEffecti" +
      "veSettings.proto\032/POGOProtos/Settings/Ma" +
      "ster/GenderSettings.proto\0324POGOProtos/Se" +
      "ttings/Master/GymBadgeGmtSettings.proto\032" +
      "0POGOProtos/Settings/Master/WeatherAffin" +
      "ity.proto\032-POGOProtos/Settings/Master/We" +
      "atherBonus.proto\0324POGOProtos/Settings/Ma" +
      "ster/PokemonScaleSetting.proto\0327POGOProt" +
      "os/Settings/Master/IapItemCategoryDispla" +
      "y.proto\0323POGOProtos/Settings/Master/Onbo" +
      "ardingSettings.proto\032APOGOProtos/Setting" +
      "s/Master/FriendshipLevelMilestoneSetting" +
      "s.proto\0325POGOProtos/Settings/Master/Luck" +
      "yPokemonSettings.proto\032/POGOProtos/Setti" +
      "ngs/Master/ExRaidSettings.proto\0327POGOPro" +
      "tos/Settings/Master/BackgroundModeSettin" +
      "gs.proto\0323POGOProtos/Settings/Master/Com" +
      "batMoveSettings.proto\032/POGOProtos/Settin" +
      "gs/Master/CombatSettings.proto\0328POGOProt" +
      "os/Settings/Master/CombatStatStageSettin" +
      "gs.proto\0321POGOProtos/Settings/Master/Com" +
      "batNpcTrainer.proto\0325POGOProtos/Settings" +
      "/Master/CombatNpcPersonality.proto\0325POGO" +
      "Protos/Settings/Master/OnboardingV2Setti" +
      "ngs.proto\0325POGOProtos/Settings/Master/Co" +
      "mbatLeagueSettings.proto\032-POGOProtos/Set" +
      "tings/Master/CombatLeague.proto\0327POGOPro" +
      "tos/Settings/Master/BelugaPokemonWhiteli" +
      "st.proto\032<POGOProtos/Settings/Master/Par" +
      "tyRecommendationSettings.proto\0326POGOProt" +
      "os/Settings/Master/SmeargleMovesSettings" +
      ".proto\032;POGOProtos/Settings/Master/Pokec" +
      "oinPurchaseDisplayGmt.proto\0323POGOProtos/" +
      "Settings/Master/AdventureSyncV2Gmt.proto" +
      "\032.POGOProtos/Settings/Master/LoadingScre" +
      "en.proto\032;POGOProtos/Settings/Master/Inv" +
      "asionNpcDisplaySettings.proto\032+POGOProto" +
      "s/Settings/Master/CombatType.proto\032;POGO" +
      "Protos/Settings/Master/LimitedPurchaseSk" +
      "uSettings.proto\032=POGOProtos/Settings/Mas" +
      "ter/InvasionAvailabilitySettings.proto\032@" +
      "POGOProtos/Settings/Master/CombatCompeti" +
      "tiveSeasonSettings.proto\0326POGOProtos/Set" +
      "tings/Master/CombatRankingSettings.proto" +
      "\0327POGOProtos/Settings/Master/VsSeekerCli" +
      "entSettings.proto\0327POGOProtos/Settings/M" +
      "aster/BattleHubOrderSettings.proto\0327POGO" +
      "Protos/Settings/Master/BattleHubBadgeSet" +
      "tings.proto\0328POGOProtos/Settings/Master/" +
      "PlatypusRolloutSettings.proto\032+POGOProto" +
      "s/Data/VsSeeker/VsSeekerLoot.proto\0325POGO" +
      "Protos/Data/VsSeeker/VsSeekerPokemonRewa" +
      "rds.proto\0323POGOProtos/Settings/Master/Bu" +
      "ddyLevelSettings.proto\032>POGOProtos/Setti" +
      "ngs/Master/BuddyActivityCategorySettings" +
      ".proto\0326POGOProtos/Settings/Master/Buddy" +
      "ActivitySettings.proto\0322POGOProtos/Setti" +
      "ngs/Master/BuddySwapSettings.proto\032<POGO" +
      "Protos/Settings/Master/BuddyEncounterCam" +
      "eoSettings.proto\032:POGOProtos/Settings/Ma" +
      "ster/BuddyEmotionLevelSettings.proto\0329PO" +
      "GOProtos/Settings/Master/BuddyInteractio" +
      "nSettings.proto\0321POGOProtos/Settings/Mas" +
      "ter/MapBuddySettings.proto\0322POGOProtos/S" +
      "ettings/Master/BuddyWalkSettings.proto\0324" +
      "POGOProtos/Settings/Master/BuddyHungerSe" +
      "ttings.proto\0329POGOProtos/Settings/Master" +
      "/AvatarGroupOrderSettings.proto\0322POGOPro" +
      "tos/Settings/Master/MonodepthSettings.pr" +
      "oto\0323POGOProtos/Settings/Master/RaidClie" +
      "ntSettings.proto\032-POGOProtos/Data/Sticke" +
      "r/StickerMetadata.proto\"\337.\n\035DownloadItem" +
      "TemplatesResponse\022U\n\006result\030\001 \001(\0162E.POGO" +
      "Protos.Networking.Responses.DownloadItem" +
      "TemplatesResponse.Result\022n\n\ritem_templat" +
      "e\030\002 \003(\0132W.POGOProtos.Networking.Response" +
      "s.DownloadItemTemplatesResponse.GameMast" +
      "erClientTemplate\022\024\n\014timestamp_ms\030\003 \001(\004\022\023" +
      "\n\013page_offset\030\004 \001(\005\032\224,\n\030GameMasterClient" +
      "Template\022\023\n\013template_id\030\001 \001(\t\022<\n\007pokemon" +
      "\030\002 \001(\0132+.POGOProtos.Settings.Master.Poke" +
      "monSettings\0226\n\004item\030\003 \001(\0132(.POGOProtos.S" +
      "ettings.Master.ItemSettings\0226\n\004move\030\004 \001(" +
      "\0132(.POGOProtos.Settings.Master.MoveSetti" +
      "ngs\022G\n\rmove_sequence\030\005 \001(\01320.POGOProtos." +
      "Settings.Master.MoveSequenceSettings\022I\n\016" +
      "type_effective\030\010 \001(\01321.POGOProtos.Settin" +
      "gs.Master.TypeEffectiveSettings\0228\n\005badge" +
      "\030\n \001(\0132).POGOProtos.Settings.Master.Badg" +
      "eSettings\022:\n\006camera\030\013 \001(\0132*.POGOProtos.S" +
      "ettings.Master.CameraSettings\022E\n\014player_" +
      "level\030\014 \001(\0132/.POGOProtos.Settings.Master" +
      ".PlayerLevelSettings\022?\n\tgym_level\030\r \001(\0132" +
      ",.POGOProtos.Settings.Master.GymLevelSet" +
      "tings\022F\n\017battle_settings\030\016 \001(\0132-.POGOPro" +
      "tos.Settings.Master.GymBattleSettings\022I\n" +
      "\022encounter_settings\030\017 \001(\0132-.POGOProtos.S" +
      "ettings.Master.EncounterSettings\022D\n\020iap_" +
      "item_display\030\020 \001(\0132*.POGOProtos.Settings" +
      ".Master.IapItemDisplay\022=\n\014iap_settings\030\021" +
      " \001(\0132\'.POGOProtos.Settings.Master.IapSet" +
      "tings\022L\n\020pokemon_upgrades\030\022 \001(\01322.POGOPr" +
      "otos.Settings.Master.PokemonUpgradeSetti" +
      "ngs\022J\n\017equipped_badges\030\023 \001(\01321.POGOProto" +
      "s.Settings.Master.EquippedBadgeSettings\022" +
      "A\n\016quest_settings\030\024 \001(\0132).POGOProtos.Set" +
      "tings.Master.QuestSettings\022I\n\024avatar_cus" +
      "tomization\030\025 \001(\0132+.POGOProtos.Data.Avata" +
      "r.AvatarCustomization\022?\n\rform_settings\030\026" +
      " \001(\0132(.POGOProtos.Settings.Master.FormSe" +
      "ttings\022C\n\017gender_settings\030\027 \001(\0132*.POGOPr" +
      "otos.Settings.Master.GenderSettings\022K\n\022g" +
      "ym_badge_settings\030\030 \001(\0132/.POGOProtos.Set" +
      "tings.Master.GymBadgeGmtSettings\022G\n\022weat" +
      "her_affinities\030\031 \001(\0132+.POGOProtos.Settin" +
      "gs.Master.WeatherAffinity\022H\n\026weather_bon" +
      "us_settings\030\032 \001(\0132(.POGOProtos.Settings." +
      "Master.WeatherBonus\022O\n\026pokemon_scale_set" +
      "tings\030\033 \001(\0132/.POGOProtos.Settings.Master" +
      ".PokemonScaleSetting\022P\n\024iap_category_dis" +
      "play\030\034 \001(\01322.POGOProtos.Settings.Master." +
      "IapItemCategoryDisplay\022T\n\030beluga_pokemon" +
      "_whitelist\030\035 \001(\01322.POGOProtos.Settings.M" +
      "aster.BelugaPokemonWhitelist\022K\n\023onboardi" +
      "ng_settings\030\036 \001(\0132..POGOProtos.Settings." +
      "Master.OnboardingSettings\022c\n\035friendship_" +
      "milestone_settings\030\037 \001(\0132<.POGOProtos.Se" +
      "ttings.Master.FriendshipLevelMilestoneSe" +
      "ttings\022P\n\026lucky_pokemon_settings\030  \001(\01320" +
      ".POGOProtos.Settings.Master.LuckyPokemon" +
      "Settings\022C\n\017combat_settings\030! \001(\0132*.POGO" +
      "Protos.Settings.Master.CombatSettings\022P\n" +
      "\026combat_league_settings\030\" \001(\01320.POGOProt" +
      "os.Settings.Master.CombatLeagueSettings\022" +
      "?\n\rcombat_league\030# \001(\0132(.POGOProtos.Sett" +
      "ings.Master.CombatLeague\022D\n\020ex_raid_sett" +
      "ings\030$ \001(\0132*.POGOProtos.Settings.Master." +
      "ExRaidSettings\022C\n\013combat_move\030% \001(\0132..PO" +
      "GOProtos.Settings.Master.CombatMoveSetti" +
      "ngs\022T\n\030background_mode_settings\030& \001(\01322." +
      "POGOProtos.Settings.Master.BackgroundMod" +
      "eSettings\022W\n\032combat_stat_stage_settings\030" +
      "\' \001(\01323.POGOProtos.Settings.Master.Comba" +
      "tStatStageSettings\022H\n\022combat_npc_trainer" +
      "\030( \001(\0132,.POGOProtos.Settings.Master.Comb" +
      "atNpcTrainer\022P\n\026combat_npc_personality\030)" +
      " \001(\01320.POGOProtos.Settings.Master.Combat" +
      "NpcPersonality\022P\n\026onboarding_v2_settings" +
      "\030* \001(\01320.POGOProtos.Settings.Master.Onbo" +
      "ardingV2Settings\022^\n\035party_recommendation" +
      "_settings\030+ \001(\01327.POGOProtos.Settings.Ma" +
      "ster.PartyRecommendationSettings\022R\n\027smea" +
      "rgle_moves_settings\030, \001(\01321.POGOProtos.S" +
      "ettings.Master.SmeargleMovesSettings\022]\n\035" +
      "pokecoin_purchase_display_gmt\030- \001(\01326.PO" +
      "GOProtos.Settings.Master.PokecoinPurchas" +
      "eDisplayGmt\022M\n\025adventure_sync_v2_gmt\030. \001" +
      "(\0132..POGOProtos.Settings.Master.Adventur" +
      "eSyncV2Gmt\022J\n\027loading_screen_settings\030/ " +
      "\001(\0132).POGOProtos.Settings.Master.Loading" +
      "Screen\022]\n\035invasion_npc_display_settings\030" +
      "0 \001(\01326.POGOProtos.Settings.Master.Invas" +
      "ionNpcDisplaySettings\022g\n\"combat_competit" +
      "ive_season_settings\0301 \001(\0132;.POGOProtos.S" +
      "ettings.Master.CombatCompetitiveSeasonSe" +
      "ttings\022X\n\035combat_ranking_proto_settings\030" +
      "2 \001(\01321.POGOProtos.Settings.Master.Comba" +
      "tRankingSettings\022;\n\013combat_type\0303 \001(\0132&." +
      "POGOProtos.Settings.Master.CombatType\022L\n" +
      "\024buddy_level_settings\0304 \001(\0132..POGOProtos" +
      ".Settings.Master.BuddyLevelSettings\022c\n b" +
      "uddy_activity_category_settings\0305 \001(\01329." +
      "POGOProtos.Settings.Master.BuddyActivity" +
      "CategorySettings\022R\n\027buddy_activity_setti" +
      "ngs\0306 \001(\01321.POGOProtos.Settings.Master.B" +
      "uddyActivitySettings\022J\n\023buddy_swap_setti" +
      "ngs\0308 \001(\0132-.POGOProtos.Settings.Master.B" +
      "uddySwapSettings\022U\n\031vs_seeker_client_set" +
      "tings\030: \001(\01322.POGOProtos.Settings.Master" +
      ".VsSeekerClientSettings\022_\n\036buddy_encount" +
      "er_cameo_settings\030; \001(\01327.POGOProtos.Set" +
      "tings.Master.BuddyEncounterCameoSettings" +
      "\022]\n\035limited_purchase_sku_settings\030< \001(\0132" +
      "6.POGOProtos.Settings.Master.LimitedPurc" +
      "haseSkuSettings\022[\n\034buddy_emotion_level_s" +
      "ettings\030= \001(\01325.POGOProtos.Settings.Mast" +
      "er.BuddyEmotionLevelSettings\022i\n\'pokestop" +
      "_invasion_availability_settings\030> \001(\01328." +
      "POGOProtos.Settings.Master.InvasionAvail" +
      "abilitySettings\022X\n\032buddy_interaction_set" +
      "tings\030? \001(\01324.POGOProtos.Settings.Master" +
      ".BuddyInteractionSettings\022D\n\024vs_seeker_l" +
      "oot_proto\030@ \001(\0132&.POGOProtos.Data.VsSeek" +
      "er.VsSeekerLoot\022S\n\031vs_seeker_pokemon_rew" +
      "ards\030A \001(\01320.POGOProtos.Data.VsSeeker.Vs" +
      "SeekerPokemonRewards\022U\n\031battle_hub_order" +
      "_settings\030B \001(\01322.POGOProtos.Settings.Ma" +
      "ster.BattleHubOrderSettings\022U\n\031battle_hu" +
      "b_badge_settings\030C \001(\01322.POGOProtos.Sett" +
      "ings.Master.BattleHubBadgeSettings\022H\n\022ma" +
      "p_buddy_settings\030D \001(\0132,.POGOProtos.Sett" +
      "ings.Master.MapBuddySettings\022J\n\023buddy_wa" +
      "lk_settings\030E \001(\0132-.POGOProtos.Settings." +
      "Master.BuddyWalkSettings\022V\n\031platypus_rol" +
      "lout_settings\030F \001(\01323.POGOProtos.Setting" +
      "s.Master.PlatypusRolloutSettings\022N\n\025budd" +
      "y_hunger_settings\030H \001(\0132/.POGOProtos.Set" +
      "tings.Master.BuddyHungerSettings\022\201\001\n\020pro" +
      "ject_vacation\030I \001(\0132g.POGOProtos.Network" +
      "ing.Responses.DownloadItemTemplatesRespo" +
      "nse.GameMasterClientTemplate.ProjectVaca" +
      "tion\022Y\n\033avatar_group_order_settings\030L \001(" +
      "\01324.POGOProtos.Settings.Master.AvatarGro" +
      "upOrderSettings\022I\n\022monodepth_settings\030N " +
      "\001(\0132-.POGOProtos.Settings.Master.Monodep" +
      "thSettings\022K\n\023raid_settings_proto\030Q \001(\0132" +
      "..POGOProtos.Settings.Master.RaidClientS" +
      "ettings\022B\n\020sticker_metadata\030U \001(\0132(.POGO" +
      "Protos.Data.Sticker.StickerMetadata\032%\n\017P" +
      "rojectVacation\022\022\n\nenable2020\030\001 \001(\010\"5\n\006Re" +
      "sult\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\010\n\004PAGE\020\002\022\t" +
      "\n\005RETRY\020\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Avatar.AvatarCustomizationOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BadgeSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CameraSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.EncounterSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.EquippedBadgeSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.FormSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.GymBattleSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.GymLevelSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.IapItemDisplayOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.IapSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.ItemSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.MoveSequenceSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.MoveSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.PlayerLevelSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.PokemonSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.PokemonUpgradeSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.QuestSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.TypeEffectiveSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.GenderSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.GymBadgeGmtSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.WeatherAffinityOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.WeatherBonusOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.PokemonScaleSettingOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.IapItemCategoryDisplayOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.OnboardingSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.FriendshipLevelMilestoneSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.LuckyPokemonSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.ExRaidSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BackgroundModeSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatMoveSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatStatStageSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatNpcTrainerOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatNpcPersonalityOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.OnboardingV2SettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatLeagueSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatLeagueOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BelugaPokemonWhitelistOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.PartyRecommendationSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.SmeargleMovesSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.PokecoinPurchaseDisplayGmtOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.AdventureSyncV2GmtOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.LoadingScreenOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.InvasionNpcDisplaySettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatTypeOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.LimitedPurchaseSkuSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.InvasionAvailabilitySettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatCompetitiveSeasonSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.CombatRankingSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.VsSeekerClientSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BattleHubOrderSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BattleHubBadgeSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.PlatypusRolloutSettingsOuterClass.getDescriptor(),
          POGOProtos.Data.VsSeeker.VsSeekerLootOuterClass.getDescriptor(),
          POGOProtos.Data.VsSeeker.VsSeekerPokemonRewardsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BuddyLevelSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BuddyActivityCategorySettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BuddyActivitySettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BuddySwapSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BuddyEncounterCameoSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BuddyEmotionLevelSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BuddyInteractionSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.MapBuddySettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BuddyWalkSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.BuddyHungerSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.AvatarGroupOrderSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.MonodepthSettingsOuterClass.getDescriptor(),
          POGOProtos.Settings.Master.RaidClientSettingsOuterClass.getDescriptor(),
          POGOProtos.Data.Sticker.StickerMetadataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_descriptor,
        new java.lang.String[] { "Result", "ItemTemplate", "TimestampMs", "PageOffset", });
    internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_descriptor =
      internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_descriptor,
        new java.lang.String[] { "TemplateId", "Pokemon", "Item", "Move", "MoveSequence", "TypeEffective", "Badge", "Camera", "PlayerLevel", "GymLevel", "BattleSettings", "EncounterSettings", "IapItemDisplay", "IapSettings", "PokemonUpgrades", "EquippedBadges", "QuestSettings", "AvatarCustomization", "FormSettings", "GenderSettings", "GymBadgeSettings", "WeatherAffinities", "WeatherBonusSettings", "PokemonScaleSettings", "IapCategoryDisplay", "BelugaPokemonWhitelist", "OnboardingSettings", "FriendshipMilestoneSettings", "LuckyPokemonSettings", "CombatSettings", "CombatLeagueSettings", "CombatLeague", "ExRaidSettings", "CombatMove", "BackgroundModeSettings", "CombatStatStageSettings", "CombatNpcTrainer", "CombatNpcPersonality", "OnboardingV2Settings", "PartyRecommendationSettings", "SmeargleMovesSettings", "PokecoinPurchaseDisplayGmt", "AdventureSyncV2Gmt", "LoadingScreenSettings", "InvasionNpcDisplaySettings", "CombatCompetitiveSeasonSettings", "CombatRankingProtoSettings", "CombatType", "BuddyLevelSettings", "BuddyActivityCategorySettings", "BuddyActivitySettings", "BuddySwapSettings", "VsSeekerClientSettings", "BuddyEncounterCameoSettings", "LimitedPurchaseSkuSettings", "BuddyEmotionLevelSettings", "PokestopInvasionAvailabilitySettings", "BuddyInteractionSettings", "VsSeekerLootProto", "VsSeekerPokemonRewards", "BattleHubOrderSettings", "BattleHubBadgeSettings", "MapBuddySettings", "BuddyWalkSettings", "PlatypusRolloutSettings", "BuddyHungerSettings", "ProjectVacation", "AvatarGroupOrderSettings", "MonodepthSettings", "RaidSettingsProto", "StickerMetadata", });
    internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_ProjectVacation_descriptor =
      internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_ProjectVacation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_DownloadItemTemplatesResponse_GameMasterClientTemplate_ProjectVacation_descriptor,
        new java.lang.String[] { "Enable2020", });
    POGOProtos.Data.Avatar.AvatarCustomizationOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BadgeSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CameraSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.EncounterSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.EquippedBadgeSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.FormSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.GymBattleSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.GymLevelSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.IapItemDisplayOuterClass.getDescriptor();
    POGOProtos.Settings.Master.IapSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.ItemSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.MoveSequenceSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.MoveSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.PlayerLevelSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.PokemonSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.PokemonUpgradeSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.QuestSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.TypeEffectiveSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.GenderSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.GymBadgeGmtSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.WeatherAffinityOuterClass.getDescriptor();
    POGOProtos.Settings.Master.WeatherBonusOuterClass.getDescriptor();
    POGOProtos.Settings.Master.PokemonScaleSettingOuterClass.getDescriptor();
    POGOProtos.Settings.Master.IapItemCategoryDisplayOuterClass.getDescriptor();
    POGOProtos.Settings.Master.OnboardingSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.FriendshipLevelMilestoneSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.LuckyPokemonSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.ExRaidSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BackgroundModeSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatMoveSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatStatStageSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatNpcTrainerOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatNpcPersonalityOuterClass.getDescriptor();
    POGOProtos.Settings.Master.OnboardingV2SettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatLeagueSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatLeagueOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BelugaPokemonWhitelistOuterClass.getDescriptor();
    POGOProtos.Settings.Master.PartyRecommendationSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.SmeargleMovesSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.PokecoinPurchaseDisplayGmtOuterClass.getDescriptor();
    POGOProtos.Settings.Master.AdventureSyncV2GmtOuterClass.getDescriptor();
    POGOProtos.Settings.Master.LoadingScreenOuterClass.getDescriptor();
    POGOProtos.Settings.Master.InvasionNpcDisplaySettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatTypeOuterClass.getDescriptor();
    POGOProtos.Settings.Master.LimitedPurchaseSkuSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.InvasionAvailabilitySettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatCompetitiveSeasonSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.CombatRankingSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.VsSeekerClientSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BattleHubOrderSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BattleHubBadgeSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.PlatypusRolloutSettingsOuterClass.getDescriptor();
    POGOProtos.Data.VsSeeker.VsSeekerLootOuterClass.getDescriptor();
    POGOProtos.Data.VsSeeker.VsSeekerPokemonRewardsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BuddyLevelSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BuddyActivityCategorySettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BuddyActivitySettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BuddySwapSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BuddyEncounterCameoSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BuddyEmotionLevelSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BuddyInteractionSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.MapBuddySettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BuddyWalkSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.BuddyHungerSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.AvatarGroupOrderSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.MonodepthSettingsOuterClass.getDescriptor();
    POGOProtos.Settings.Master.RaidClientSettingsOuterClass.getDescriptor();
    POGOProtos.Data.Sticker.StickerMetadataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
