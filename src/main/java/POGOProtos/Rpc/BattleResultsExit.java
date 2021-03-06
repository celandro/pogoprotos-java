// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.BattleResultsExit}
 */
public enum BattleResultsExit
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BATTLE_RESULTS_EXIT_LEAVE_GYM = 0;</code>
   */
  BATTLE_RESULTS_EXIT_LEAVE_GYM(0),
  /**
   * <code>BATTLE_RESULTS_EXIT_LEAVE_BATTLE = 1;</code>
   */
  BATTLE_RESULTS_EXIT_LEAVE_BATTLE(1),
  /**
   * <code>BATTLE_RESULTS_EXIT_CONTINUE_BATTLE = 2;</code>
   */
  BATTLE_RESULTS_EXIT_CONTINUE_BATTLE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BATTLE_RESULTS_EXIT_LEAVE_GYM = 0;</code>
   */
  public static final int BATTLE_RESULTS_EXIT_LEAVE_GYM_VALUE = 0;
  /**
   * <code>BATTLE_RESULTS_EXIT_LEAVE_BATTLE = 1;</code>
   */
  public static final int BATTLE_RESULTS_EXIT_LEAVE_BATTLE_VALUE = 1;
  /**
   * <code>BATTLE_RESULTS_EXIT_CONTINUE_BATTLE = 2;</code>
   */
  public static final int BATTLE_RESULTS_EXIT_CONTINUE_BATTLE_VALUE = 2;


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
  public static BattleResultsExit valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BattleResultsExit forNumber(int value) {
    switch (value) {
      case 0: return BATTLE_RESULTS_EXIT_LEAVE_GYM;
      case 1: return BATTLE_RESULTS_EXIT_LEAVE_BATTLE;
      case 2: return BATTLE_RESULTS_EXIT_CONTINUE_BATTLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BattleResultsExit>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BattleResultsExit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BattleResultsExit>() {
          public BattleResultsExit findValueByNumber(int number) {
            return BattleResultsExit.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(18);
  }

  private static final BattleResultsExit[] VALUES = values();

  public static BattleResultsExit valueOf(
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

  private BattleResultsExit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BattleResultsExit)
}

