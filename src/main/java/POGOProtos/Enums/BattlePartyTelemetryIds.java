// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/TelemetryIds.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.BattlePartyTelemetryIds}
 */
public enum BattlePartyTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNDEFINED_BATTLE_PARTY_EVENT = 0;</code>
   */
  UNDEFINED_BATTLE_PARTY_EVENT(0),
  /**
   * <code>ADD = 1;</code>
   */
  ADD(1),
  /**
   * <code>REMOVE = 2;</code>
   */
  REMOVE(2),
  /**
   * <code>GYM_BATTLE = 3;</code>
   */
  GYM_BATTLE(3),
  /**
   * <code>RAID_BATTLE = 4;</code>
   */
  RAID_BATTLE(4),
  /**
   * <code>BATTLE_POKEMON_CHANGED = 5;</code>
   */
  BATTLE_POKEMON_CHANGED(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNDEFINED_BATTLE_PARTY_EVENT = 0;</code>
   */
  public static final int UNDEFINED_BATTLE_PARTY_EVENT_VALUE = 0;
  /**
   * <code>ADD = 1;</code>
   */
  public static final int ADD_VALUE = 1;
  /**
   * <code>REMOVE = 2;</code>
   */
  public static final int REMOVE_VALUE = 2;
  /**
   * <code>GYM_BATTLE = 3;</code>
   */
  public static final int GYM_BATTLE_VALUE = 3;
  /**
   * <code>RAID_BATTLE = 4;</code>
   */
  public static final int RAID_BATTLE_VALUE = 4;
  /**
   * <code>BATTLE_POKEMON_CHANGED = 5;</code>
   */
  public static final int BATTLE_POKEMON_CHANGED_VALUE = 5;


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
  public static BattlePartyTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BattlePartyTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return UNDEFINED_BATTLE_PARTY_EVENT;
      case 1: return ADD;
      case 2: return REMOVE;
      case 3: return GYM_BATTLE;
      case 4: return RAID_BATTLE;
      case 5: return BATTLE_POKEMON_CHANGED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BattlePartyTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BattlePartyTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BattlePartyTelemetryIds>() {
          public BattlePartyTelemetryIds findValueByNumber(int number) {
            return BattlePartyTelemetryIds.forNumber(number);
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
    return POGOProtos.Enums.TelemetryIds.getDescriptor().getEnumTypes().get(7);
  }

  private static final BattlePartyTelemetryIds[] VALUES = values();

  public static BattlePartyTelemetryIds valueOf(
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

  private BattlePartyTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.BattlePartyTelemetryIds)
}

