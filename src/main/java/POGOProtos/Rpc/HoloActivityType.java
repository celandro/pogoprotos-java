// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.HoloActivityType}
 */
public enum HoloActivityType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_UNKNOWN = 0;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_UNKNOWN(0),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_POKEMON = 1;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_POKEMON(1),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_LEGEND_POKEMON = 2;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_LEGEND_POKEMON(2),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FLEE_POKEMON = 3;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_FLEE_POKEMON(3),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_FORT = 4;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_FORT(4),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_EVOLVE_POKEMON = 5;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_EVOLVE_POKEMON(5),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG = 6;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG(6),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_WALK_KM = 7;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_WALK_KM(7),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_POKEDEX_ENTRY_NEW = 8;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_POKEDEX_ENTRY_NEW(8),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_THROW = 9;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_THROW(9),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_NICE_THROW = 10;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_NICE_THROW(10),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_GREAT_THROW = 11;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_GREAT_THROW(11),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_EXCELLENT_THROW = 12;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_EXCELLENT_THROW(12),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_CURVEBALL = 13;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_CURVEBALL(13),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_OF_DAY = 14;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_OF_DAY(14),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_MILESTONE = 15;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_MILESTONE(15),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_TRAIN_POKEMON = 16;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_TRAIN_POKEMON(16),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT = 17;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT(17),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RELEASE_POKEMON = 18;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_RELEASE_POKEMON(18),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SMALL_BONUS = 19;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SMALL_BONUS(19),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_MEDIUM_BONUS = 20;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_MEDIUM_BONUS(20),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_LARGE_BONUS = 21;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_LARGE_BONUS(21),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_DEFENDER = 22;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_DEFENDER(22),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_LEADER = 23;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_LEADER(23),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_STREAK_BONUS = 24;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_STREAK_BONUS(24),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_FIRST_OF_THE_DAY = 25;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_FIRST_OF_THE_DAY(25),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_STREAK_BONUS = 26;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_STREAK_BONUS(26),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_RAID_POKEMON = 27;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_RAID_POKEMON(27),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FEED_BERRY = 28;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_FEED_BERRY(28),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_GYM = 29;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_GYM(29),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_NEW_POKESTOP = 30;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_NEW_POKESTOP(30),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_GYM_BATTLE_LOSS = 31;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_GYM_BATTLE_LOSS(31),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_AR_PLUS_BONUS = 32;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_AR_PLUS_BONUS(32),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_QUEST_POKEMON_ENCOUNTER = 33;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_QUEST_POKEMON_ENCOUNTER(33),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_0 = 35;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_0(35),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_1 = 36;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_1(36),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_2 = 37;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_2(37),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_3 = 38;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_3(38),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_4 = 39;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_4(39),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEND_GIFT = 40;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_SEND_GIFT(40),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SHARE_EX_RAID_PASS = 41;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_SHARE_EX_RAID_PASS(41),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_1_ADDITIONAL_XP = 42;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_1_ADDITIONAL_XP(42),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_2_ADDITIONAL_XP = 43;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_2_ADDITIONAL_XP(43),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_3_ADDITIONAL_XP = 44;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_3_ADDITIONAL_XP(44),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_4_ADDITIONAL_XP = 45;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_4_ADDITIONAL_XP(45),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_5_ADDITIONAL_XP = 46;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_5_ADDITIONAL_XP(46),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SHADOW = 47;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SHADOW(47),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_GIFT = 48;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_GIFT(48),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_DEFEAT_RAID_POKEMON = 49;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_DEFEAT_RAID_POKEMON(49),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_1_ADDITIONAL_XP = 50;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_1_ADDITIONAL_XP(50),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_2_ADDITIONAL_XP = 51;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_2_ADDITIONAL_XP(51),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_3_ADDITIONAL_XP = 52;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_3_ADDITIONAL_XP(52),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_4_ADDITIONAL_XP = 53;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_4_ADDITIONAL_XP(53),
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_5_ADDITIONAL_XP = 54;</code>
   */
  HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_5_ADDITIONAL_XP(54),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_UNKNOWN = 0;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_UNKNOWN_VALUE = 0;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_POKEMON = 1;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_POKEMON_VALUE = 1;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_LEGEND_POKEMON = 2;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_LEGEND_POKEMON_VALUE = 2;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FLEE_POKEMON = 3;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_FLEE_POKEMON_VALUE = 3;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_FORT = 4;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_FORT_VALUE = 4;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_EVOLVE_POKEMON = 5;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_EVOLVE_POKEMON_VALUE = 5;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG = 6;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_VALUE = 6;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_WALK_KM = 7;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_WALK_KM_VALUE = 7;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_POKEDEX_ENTRY_NEW = 8;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_POKEDEX_ENTRY_NEW_VALUE = 8;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_THROW = 9;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_THROW_VALUE = 9;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_NICE_THROW = 10;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_NICE_THROW_VALUE = 10;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_GREAT_THROW = 11;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_GREAT_THROW_VALUE = 11;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_EXCELLENT_THROW = 12;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_EXCELLENT_THROW_VALUE = 12;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_CURVEBALL = 13;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_CURVEBALL_VALUE = 13;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_OF_DAY = 14;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_OF_DAY_VALUE = 14;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_MILESTONE = 15;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_MILESTONE_VALUE = 15;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_TRAIN_POKEMON = 16;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_TRAIN_POKEMON_VALUE = 16;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT = 17;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_VALUE = 17;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RELEASE_POKEMON = 18;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_RELEASE_POKEMON_VALUE = 18;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SMALL_BONUS = 19;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SMALL_BONUS_VALUE = 19;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_MEDIUM_BONUS = 20;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_MEDIUM_BONUS_VALUE = 20;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_LARGE_BONUS = 21;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_LARGE_BONUS_VALUE = 21;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_DEFENDER = 22;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_DEFENDER_VALUE = 22;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_LEADER = 23;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_LEADER_VALUE = 23;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_STREAK_BONUS = 24;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_STREAK_BONUS_VALUE = 24;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_FIRST_OF_THE_DAY = 25;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_FIRST_OF_THE_DAY_VALUE = 25;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_STREAK_BONUS = 26;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_STREAK_BONUS_VALUE = 26;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_RAID_POKEMON = 27;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_RAID_POKEMON_VALUE = 27;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FEED_BERRY = 28;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_FEED_BERRY_VALUE = 28;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_GYM = 29;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_GYM_VALUE = 29;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_NEW_POKESTOP = 30;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_NEW_POKESTOP_VALUE = 30;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_GYM_BATTLE_LOSS = 31;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_GYM_BATTLE_LOSS_VALUE = 31;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_AR_PLUS_BONUS = 32;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_AR_PLUS_BONUS_VALUE = 32;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_QUEST_POKEMON_ENCOUNTER = 33;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_QUEST_POKEMON_ENCOUNTER_VALUE = 33;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_0 = 35;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_0_VALUE = 35;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_1 = 36;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_1_VALUE = 36;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_2 = 37;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_2_VALUE = 37;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_3 = 38;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_3_VALUE = 38;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_4 = 39;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_4_VALUE = 39;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SEND_GIFT = 40;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_SEND_GIFT_VALUE = 40;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_SHARE_EX_RAID_PASS = 41;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_SHARE_EX_RAID_PASS_VALUE = 41;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_1_ADDITIONAL_XP = 42;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_1_ADDITIONAL_XP_VALUE = 42;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_2_ADDITIONAL_XP = 43;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_2_ADDITIONAL_XP_VALUE = 43;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_3_ADDITIONAL_XP = 44;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_3_ADDITIONAL_XP_VALUE = 44;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_4_ADDITIONAL_XP = 45;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_4_ADDITIONAL_XP_VALUE = 45;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_5_ADDITIONAL_XP = 46;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_5_ADDITIONAL_XP_VALUE = 46;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SHADOW = 47;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SHADOW_VALUE = 47;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_GIFT = 48;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_GIFT_VALUE = 48;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_DEFEAT_RAID_POKEMON = 49;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_DEFEAT_RAID_POKEMON_VALUE = 49;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_1_ADDITIONAL_XP = 50;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_1_ADDITIONAL_XP_VALUE = 50;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_2_ADDITIONAL_XP = 51;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_2_ADDITIONAL_XP_VALUE = 51;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_3_ADDITIONAL_XP = 52;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_3_ADDITIONAL_XP_VALUE = 52;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_4_ADDITIONAL_XP = 53;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_4_ADDITIONAL_XP_VALUE = 53;
  /**
   * <code>HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_5_ADDITIONAL_XP = 54;</code>
   */
  public static final int HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_5_ADDITIONAL_XP_VALUE = 54;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static HoloActivityType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HoloActivityType forNumber(int value) {
    switch (value) {
      case 0: return HOLO_ACTIVITY_TYPE_ACTIVITY_UNKNOWN;
      case 1: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_POKEMON;
      case 2: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_LEGEND_POKEMON;
      case 3: return HOLO_ACTIVITY_TYPE_ACTIVITY_FLEE_POKEMON;
      case 4: return HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_FORT;
      case 5: return HOLO_ACTIVITY_TYPE_ACTIVITY_EVOLVE_POKEMON;
      case 6: return HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG;
      case 7: return HOLO_ACTIVITY_TYPE_ACTIVITY_WALK_KM;
      case 8: return HOLO_ACTIVITY_TYPE_ACTIVITY_POKEDEX_ENTRY_NEW;
      case 9: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_THROW;
      case 10: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_NICE_THROW;
      case 11: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_GREAT_THROW;
      case 12: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_EXCELLENT_THROW;
      case 13: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_CURVEBALL;
      case 14: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_OF_DAY;
      case 15: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_MILESTONE;
      case 16: return HOLO_ACTIVITY_TYPE_ACTIVITY_TRAIN_POKEMON;
      case 17: return HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT;
      case 18: return HOLO_ACTIVITY_TYPE_ACTIVITY_RELEASE_POKEMON;
      case 19: return HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SMALL_BONUS;
      case 20: return HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_MEDIUM_BONUS;
      case 21: return HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_LARGE_BONUS;
      case 22: return HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_DEFENDER;
      case 23: return HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_GYM_LEADER;
      case 24: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_FIRST_CATCH_STREAK_BONUS;
      case 25: return HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_FIRST_OF_THE_DAY;
      case 26: return HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_FORT_STREAK_BONUS;
      case 27: return HOLO_ACTIVITY_TYPE_ACTIVITY_DEFEAT_RAID_POKEMON;
      case 28: return HOLO_ACTIVITY_TYPE_ACTIVITY_FEED_BERRY;
      case 29: return HOLO_ACTIVITY_TYPE_ACTIVITY_SEARCH_GYM;
      case 30: return HOLO_ACTIVITY_TYPE_ACTIVITY_NEW_POKESTOP;
      case 31: return HOLO_ACTIVITY_TYPE_ACTIVITY_GYM_BATTLE_LOSS;
      case 32: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_AR_PLUS_BONUS;
      case 33: return HOLO_ACTIVITY_TYPE_ACTIVITY_CATCH_QUEST_POKEMON_ENCOUNTER;
      case 35: return HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_0;
      case 36: return HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_1;
      case 37: return HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_2;
      case 38: return HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_3;
      case 39: return HOLO_ACTIVITY_TYPE_ACTIVITY_FRIENDSHIP_LEVEL_UP_4;
      case 40: return HOLO_ACTIVITY_TYPE_ACTIVITY_SEND_GIFT;
      case 41: return HOLO_ACTIVITY_TYPE_ACTIVITY_SHARE_EX_RAID_PASS;
      case 42: return HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_1_ADDITIONAL_XP;
      case 43: return HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_2_ADDITIONAL_XP;
      case 44: return HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_3_ADDITIONAL_XP;
      case 45: return HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_4_ADDITIONAL_XP;
      case 46: return HOLO_ACTIVITY_TYPE_ACTIVITY_RAID_LEVEL_5_ADDITIONAL_XP;
      case 47: return HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_SHADOW;
      case 48: return HOLO_ACTIVITY_TYPE_ACTIVITY_HATCH_EGG_GIFT;
      case 49: return HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_DEFEAT_RAID_POKEMON;
      case 50: return HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_1_ADDITIONAL_XP;
      case 51: return HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_2_ADDITIONAL_XP;
      case 52: return HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_3_ADDITIONAL_XP;
      case 53: return HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_4_ADDITIONAL_XP;
      case 54: return HOLO_ACTIVITY_TYPE_ACTIVITY_REMOTE_RAID_LEVEL_5_ADDITIONAL_XP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HoloActivityType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HoloActivityType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HoloActivityType>() {
          public HoloActivityType findValueByNumber(int number) {
            return HoloActivityType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(53);
  }

  private static final HoloActivityType[] VALUES = values();

  public static HoloActivityType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private HoloActivityType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HoloActivityType)
}

