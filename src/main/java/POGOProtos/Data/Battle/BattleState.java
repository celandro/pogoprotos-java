// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Battle/BattleState.proto

package POGOProtos.Data.Battle;

/**
 * Protobuf enum {@code POGOProtos.Data.Battle.BattleState}
 */
public enum BattleState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STATE_UNSET = 0;</code>
   */
  STATE_UNSET(0),
  /**
   * <code>ACTIVE = 1;</code>
   */
  ACTIVE(1),
  /**
   * <code>VICTORY = 2;</code>
   */
  VICTORY(2),
  /**
   * <code>DEFEATED = 3;</code>
   */
  DEFEATED(3),
  /**
   * <code>TIMED_OUT = 4;</code>
   */
  TIMED_OUT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STATE_UNSET = 0;</code>
   */
  public static final int STATE_UNSET_VALUE = 0;
  /**
   * <code>ACTIVE = 1;</code>
   */
  public static final int ACTIVE_VALUE = 1;
  /**
   * <code>VICTORY = 2;</code>
   */
  public static final int VICTORY_VALUE = 2;
  /**
   * <code>DEFEATED = 3;</code>
   */
  public static final int DEFEATED_VALUE = 3;
  /**
   * <code>TIMED_OUT = 4;</code>
   */
  public static final int TIMED_OUT_VALUE = 4;


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
  public static BattleState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BattleState forNumber(int value) {
    switch (value) {
      case 0: return STATE_UNSET;
      case 1: return ACTIVE;
      case 2: return VICTORY;
      case 3: return DEFEATED;
      case 4: return TIMED_OUT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BattleState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BattleState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BattleState>() {
          public BattleState findValueByNumber(int number) {
            return BattleState.forNumber(number);
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
    return POGOProtos.Data.Battle.BattleStateOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final BattleState[] VALUES = values();

  public static BattleState valueOf(
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

  private BattleState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Battle.BattleState)
}

