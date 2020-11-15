// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/CombatSettings.proto

package POGOProtos.Settings.Master;

public final class CombatSettingsOuterClass {
  private CombatSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_CombatSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_CombatSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_CombatSettings_CombatOffensiveInputChallengeSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_CombatSettings_CombatOffensiveInputChallengeSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_CombatSettings_CombatDefensiveInputChallengeSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_CombatSettings_CombatDefensiveInputChallengeSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/POGOProtos/Settings/Master/CombatSetti" +
      "ngs.proto\022\032POGOProtos.Settings.Master\"\310\r" +
      "\n\016CombatSettings\022\036\n\026round_duration_secon" +
      "ds\030\001 \001(\002\022\035\n\025turn_duration_seconds\030\002 \001(\002\022" +
      "!\n\031minigame_duration_seconds\030\003 \001(\002\022)\n!sa" +
      "me_type_attack_bonus_multiplier\030\004 \001(\002\022$\n" +
      "\034fast_attack_bonus_multiplier\030\005 \001(\002\022&\n\036c" +
      "harge_attack_bonus_multiplier\030\006 \001(\002\022 \n\030d" +
      "efense_bonus_multiplier\030\007 \001(\002\022&\n\036minigam" +
      "e_bonus_base_multiplier\030\010 \001(\002\022*\n\"minigam" +
      "e_bonus_variable_multiplier\030\t \001(\002\022\022\n\nmax" +
      "_energy\030\n \001(\005\022$\n\034defender_minigame_multi" +
      "plier\030\013 \001(\002\022\'\n\037change_pokemon_duration_s" +
      "econds\030\014 \001(\002\022.\n&minigame_submit_score_du" +
      "ration_seconds\030\r \001(\002\0221\n)quick_swap_comba" +
      "t_start_available_seconds\030\016 \001(\002\022,\n$quick" +
      "_swap_cooldown_duration_seconds\030\017 \001(\002\022|\n" +
      "\"offensive_input_challenge_settings\030\020 \001(" +
      "\0132P.POGOProtos.Settings.Master.CombatSet" +
      "tings.CombatOffensiveInputChallengeSetti" +
      "ngs\022|\n\"defensive_input_challenge_setting" +
      "s\030\021 \001(\0132P.POGOProtos.Settings.Master.Com" +
      "batSettings.CombatDefensiveInputChalleng" +
      "eSettings\022\031\n\021charge_score_base\030\022 \001(\002\022\031\n\021" +
      "charge_score_nice\030\023 \001(\002\022\032\n\022charge_score_" +
      "great\030\024 \001(\002\022\036\n\026charge_score_excellent\030\025 " +
      "\001(\002\022%\n\035swap_animation_duration_turns\030\026 \001" +
      "(\005\022-\n%super_effective_flyout_duration_tu" +
      "rns\030\027 \001(\005\0220\n(not_very_effective_flyout_d" +
      "uration_turns\030\030 \001(\005\022%\n\035blocked_flyout_du" +
      "ration_turns\030\031 \001(\005\022.\n&normal_effective_f" +
      "lyout_duration_turns\030\032 \001(\005\022&\n\036faint_anim" +
      "ation_duration_turns\030\033 \001(\005\022\034\n\024npc_swap_d" +
      "elay_turns\030\034 \001(\005\022&\n\036npc_charged_attack_d" +
      "elay_turns\030\035 \001(\005\022.\n&shadow_pokemon_attac" +
      "k_bonus_multiplier\030\036 \001(\002\022/\n\'shadow_pokem" +
      "on_defense_bonus_multiplier\030\037 \001(\002\0224\n,pur" +
      "ified_pokemon_attack_multiplier_vs_shado" +
      "w\030  \001(\002\032\317\001\n%CombatOffensiveInputChalleng" +
      "eSettings\022\025\n\rscore_per_tap\030\001 \001(\002\022\036\n\026scor" +
      "e_decay_per_second\030\002 \001(\002\022\021\n\tmax_score\030\003 " +
      "\001(\002\022.\n&high_score_additional_decay_per_s" +
      "econd\030\004 \001(\002\022,\n$max_time_additional_decay" +
      "_per_second\030\005 \001(\002\032M\n%CombatDefensiveInpu" +
      "tChallengeSettings\022$\n\034full_rotations_for" +
      "_max_score\030\001 \001(\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_CombatSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_CombatSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_CombatSettings_descriptor,
        new java.lang.String[] { "RoundDurationSeconds", "TurnDurationSeconds", "MinigameDurationSeconds", "SameTypeAttackBonusMultiplier", "FastAttackBonusMultiplier", "ChargeAttackBonusMultiplier", "DefenseBonusMultiplier", "MinigameBonusBaseMultiplier", "MinigameBonusVariableMultiplier", "MaxEnergy", "DefenderMinigameMultiplier", "ChangePokemonDurationSeconds", "MinigameSubmitScoreDurationSeconds", "QuickSwapCombatStartAvailableSeconds", "QuickSwapCooldownDurationSeconds", "OffensiveInputChallengeSettings", "DefensiveInputChallengeSettings", "ChargeScoreBase", "ChargeScoreNice", "ChargeScoreGreat", "ChargeScoreExcellent", "SwapAnimationDurationTurns", "SuperEffectiveFlyoutDurationTurns", "NotVeryEffectiveFlyoutDurationTurns", "BlockedFlyoutDurationTurns", "NormalEffectiveFlyoutDurationTurns", "FaintAnimationDurationTurns", "NpcSwapDelayTurns", "NpcChargedAttackDelayTurns", "ShadowPokemonAttackBonusMultiplier", "ShadowPokemonDefenseBonusMultiplier", "PurifiedPokemonAttackMultiplierVsShadow", });
    internal_static_POGOProtos_Settings_Master_CombatSettings_CombatOffensiveInputChallengeSettings_descriptor =
      internal_static_POGOProtos_Settings_Master_CombatSettings_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Settings_Master_CombatSettings_CombatOffensiveInputChallengeSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_CombatSettings_CombatOffensiveInputChallengeSettings_descriptor,
        new java.lang.String[] { "ScorePerTap", "ScoreDecayPerSecond", "MaxScore", "HighScoreAdditionalDecayPerSecond", "MaxTimeAdditionalDecayPerSecond", });
    internal_static_POGOProtos_Settings_Master_CombatSettings_CombatDefensiveInputChallengeSettings_descriptor =
      internal_static_POGOProtos_Settings_Master_CombatSettings_descriptor.getNestedTypes().get(1);
    internal_static_POGOProtos_Settings_Master_CombatSettings_CombatDefensiveInputChallengeSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_CombatSettings_CombatDefensiveInputChallengeSettings_descriptor,
        new java.lang.String[] { "FullRotationsForMaxScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
