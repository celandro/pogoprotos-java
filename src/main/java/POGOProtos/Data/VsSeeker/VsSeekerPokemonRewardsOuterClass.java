// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/VsSeeker/VsSeekerPokemonRewards.proto

package POGOProtos.Data.VsSeeker;

public final class VsSeekerPokemonRewardsOuterClass {
  private VsSeekerPokemonRewardsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_Range_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_Range_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_LimitedEditionPokemonEncounterReward_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_LimitedEditionPokemonEncounterReward_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5POGOProtos/Data/VsSeeker/VsSeekerPokem" +
      "onRewards.proto\022\030POGOProtos.Data.VsSeeke" +
      "r\0322POGOProtos/Data/VsSeeker/VsSeekerRewa" +
      "rdTrack.proto\032(POGOProtos/Data/Quests/Qu" +
      "estReward.proto\"\234\n\n\026VsSeekerPokemonRewar" +
      "ds\022Y\n\021available_pokemon\030\001 \003(\0132>.POGOProt" +
      "os.Data.VsSeeker.VsSeekerPokemonRewards." +
      "PokemonUnlock\022C\n\014reward_track\030\002 \001(\0162-.PO" +
      "GOProtos.Data.VsSeeker.VsSeekerRewardTra" +
      "ck\032\255\001\n\017OverrideIvRange\022W\n\005range\030\001 \001(\0132F." +
      "POGOProtos.Data.VsSeeker.VsSeekerPokemon" +
      "Rewards.OverrideIvRange.RangeH\000\022\016\n\004zero\030" +
      "\002 \001(\010H\000\032!\n\005Range\022\013\n\003min\030\001 \001(\003\022\013\n\003max\030\002 \001" +
      "(\003B\016\n\014OverrideType\032\261\007\n\rPokemonUnlock\022M\n\007" +
      "pokemon\030\001 \001(\0132:.POGOProtos.Data.Quests.Q" +
      "uestReward.PokemonEncounterRewardH\000\022\205\001\n\026" +
      "limited_pokemon_reward\030\002 \001(\0132c.POGOProto" +
      "s.Data.VsSeeker.VsSeekerPokemonRewards.P" +
      "okemonUnlock.LimitedEditionPokemonEncoun" +
      "terRewardH\000\022\220\001\n!guaranteed_limited_pokem" +
      "on_reward\030\003 \001(\0132c.POGOProtos.Data.VsSeek" +
      "er.VsSeekerPokemonRewards.PokemonUnlock." +
      "LimitedEditionPokemonEncounterRewardH\000\022\030" +
      "\n\020unlocked_at_rank\030\004 \001(\005\022\016\n\006weight\030\005 \001(\002" +
      "\022\\\n\022attack_iv_override\030\006 \001(\0132@.POGOProto" +
      "s.Data.VsSeeker.VsSeekerPokemonRewards.O" +
      "verrideIvRange\022]\n\023defense_iv_override\030\007 " +
      "\001(\0132@.POGOProtos.Data.VsSeeker.VsSeekerP" +
      "okemonRewards.OverrideIvRange\022]\n\023stamina" +
      "_iv_override\030\010 \001(\0132@.POGOProtos.Data.VsS" +
      "eeker.VsSeekerPokemonRewards.OverrideIvR" +
      "ange\032\341\001\n$LimitedEditionPokemonEncounterR" +
      "eward\022K\n\007pokemon\030\001 \001(\0132:.POGOProtos.Data" +
      ".Quests.QuestReward.PokemonEncounterRewa" +
      "rd\022\022\n\nidentifier\030\002 \001(\t\022\034\n\022lifetime_max_c" +
      "ount\030\003 \001(\005H\000\0221\n\'per_competitive_combat_s" +
      "eason_max_count\030\004 \001(\005H\000B\007\n\005LimitB\014\n\nRewa" +
      "rdTypeB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.VsSeeker.VsSeekerRewardTrackOuterClass.getDescriptor(),
          POGOProtos.Data.Quests.QuestRewardOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_descriptor,
        new java.lang.String[] { "AvailablePokemon", "RewardTrack", });
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_descriptor =
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_descriptor,
        new java.lang.String[] { "Range", "Zero", "OverrideType", });
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_Range_descriptor =
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_Range_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_OverrideIvRange_Range_descriptor,
        new java.lang.String[] { "Min", "Max", });
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_descriptor =
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_descriptor.getNestedTypes().get(1);
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_descriptor,
        new java.lang.String[] { "Pokemon", "LimitedPokemonReward", "GuaranteedLimitedPokemonReward", "UnlockedAtRank", "Weight", "AttackIvOverride", "DefenseIvOverride", "StaminaIvOverride", "RewardType", });
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_LimitedEditionPokemonEncounterReward_descriptor =
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_LimitedEditionPokemonEncounterReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_VsSeeker_VsSeekerPokemonRewards_PokemonUnlock_LimitedEditionPokemonEncounterReward_descriptor,
        new java.lang.String[] { "Pokemon", "Identifier", "LifetimeMaxCount", "PerCompetitiveCombatSeasonMaxCount", "Limit", });
    POGOProtos.Data.VsSeeker.VsSeekerRewardTrackOuterClass.getDescriptor();
    POGOProtos.Data.Quests.QuestRewardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}