// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Battle/BattleActionType.proto

package POGOProtos.Data.Battle;

/**
 * Protobuf enum {@code POGOProtos.Data.Battle.BattleActionType}
 */
public enum BattleActionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ACTION_UNSET = 0;</code>
   */
  ACTION_UNSET(0),
  /**
   * <code>ACTION_ATTACK = 1;</code>
   */
  ACTION_ATTACK(1),
  /**
   * <code>ACTION_DODGE = 2;</code>
   */
  ACTION_DODGE(2),
  /**
   * <code>ACTION_SPECIAL_ATTACK = 3;</code>
   */
  ACTION_SPECIAL_ATTACK(3),
  /**
   * <code>ACTION_SWAP_POKEMON = 4;</code>
   */
  ACTION_SWAP_POKEMON(4),
  /**
   * <code>ACTION_FAINT = 5;</code>
   */
  ACTION_FAINT(5),
  /**
   * <code>ACTION_PLAYER_JOIN = 6;</code>
   */
  ACTION_PLAYER_JOIN(6),
  /**
   * <code>ACTION_PLAYER_QUIT = 7;</code>
   */
  ACTION_PLAYER_QUIT(7),
  /**
   * <code>ACTION_VICTORY = 8;</code>
   */
  ACTION_VICTORY(8),
  /**
   * <code>ACTION_DEFEAT = 9;</code>
   */
  ACTION_DEFEAT(9),
  /**
   * <code>ACTION_TIMED_OUT = 10;</code>
   */
  ACTION_TIMED_OUT(10),
  /**
   * <code>ACTION_SPECIAL_ATTACK_2 = 11;</code>
   */
  ACTION_SPECIAL_ATTACK_2(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ACTION_UNSET = 0;</code>
   */
  public static final int ACTION_UNSET_VALUE = 0;
  /**
   * <code>ACTION_ATTACK = 1;</code>
   */
  public static final int ACTION_ATTACK_VALUE = 1;
  /**
   * <code>ACTION_DODGE = 2;</code>
   */
  public static final int ACTION_DODGE_VALUE = 2;
  /**
   * <code>ACTION_SPECIAL_ATTACK = 3;</code>
   */
  public static final int ACTION_SPECIAL_ATTACK_VALUE = 3;
  /**
   * <code>ACTION_SWAP_POKEMON = 4;</code>
   */
  public static final int ACTION_SWAP_POKEMON_VALUE = 4;
  /**
   * <code>ACTION_FAINT = 5;</code>
   */
  public static final int ACTION_FAINT_VALUE = 5;
  /**
   * <code>ACTION_PLAYER_JOIN = 6;</code>
   */
  public static final int ACTION_PLAYER_JOIN_VALUE = 6;
  /**
   * <code>ACTION_PLAYER_QUIT = 7;</code>
   */
  public static final int ACTION_PLAYER_QUIT_VALUE = 7;
  /**
   * <code>ACTION_VICTORY = 8;</code>
   */
  public static final int ACTION_VICTORY_VALUE = 8;
  /**
   * <code>ACTION_DEFEAT = 9;</code>
   */
  public static final int ACTION_DEFEAT_VALUE = 9;
  /**
   * <code>ACTION_TIMED_OUT = 10;</code>
   */
  public static final int ACTION_TIMED_OUT_VALUE = 10;
  /**
   * <code>ACTION_SPECIAL_ATTACK_2 = 11;</code>
   */
  public static final int ACTION_SPECIAL_ATTACK_2_VALUE = 11;


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
  public static BattleActionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BattleActionType forNumber(int value) {
    switch (value) {
      case 0: return ACTION_UNSET;
      case 1: return ACTION_ATTACK;
      case 2: return ACTION_DODGE;
      case 3: return ACTION_SPECIAL_ATTACK;
      case 4: return ACTION_SWAP_POKEMON;
      case 5: return ACTION_FAINT;
      case 6: return ACTION_PLAYER_JOIN;
      case 7: return ACTION_PLAYER_QUIT;
      case 8: return ACTION_VICTORY;
      case 9: return ACTION_DEFEAT;
      case 10: return ACTION_TIMED_OUT;
      case 11: return ACTION_SPECIAL_ATTACK_2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BattleActionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BattleActionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BattleActionType>() {
          public BattleActionType findValueByNumber(int number) {
            return BattleActionType.forNumber(number);
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
    return POGOProtos.Data.Battle.BattleActionTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final BattleActionType[] VALUES = values();

  public static BattleActionType valueOf(
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

  private BattleActionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Battle.BattleActionType)
}

