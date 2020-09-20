// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HCHEGADJEIH
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.RaidTelemetryIds}
 */
public enum RaidTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RAID_TELEMETRY_IDS_UNDEFINED_RAID_EVENT = 0;</code>
   */
  RAID_TELEMETRY_IDS_UNDEFINED_RAID_EVENT(0),
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_ENTER = 1;</code>
   */
  RAID_TELEMETRY_IDS_APPROACH_ENTER(1),
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_CLICK_SPINNER = 2;</code>
   */
  RAID_TELEMETRY_IDS_APPROACH_CLICK_SPINNER(2),
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_JOIN = 3;</code>
   */
  RAID_TELEMETRY_IDS_APPROACH_JOIN(3),
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_TICKET_CONFIRMATION = 4;</code>
   */
  RAID_TELEMETRY_IDS_APPROACH_TICKET_CONFIRMATION(4),
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_CLICK_TUTORIAL = 5;</code>
   */
  RAID_TELEMETRY_IDS_APPROACH_CLICK_TUTORIAL(5),
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_CLICK_SHOP = 6;</code>
   */
  RAID_TELEMETRY_IDS_APPROACH_CLICK_SHOP(6),
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_CLICK_INSPECT = 7;</code>
   */
  RAID_TELEMETRY_IDS_APPROACH_CLICK_INSPECT(7),
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_ENTER = 8;</code>
   */
  RAID_TELEMETRY_IDS_LOBBY_ENTER(8),
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_CLICK_INVENTORY = 9;</code>
   */
  RAID_TELEMETRY_IDS_LOBBY_CLICK_INVENTORY(9),
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_CLICK_EXIT = 10;</code>
   */
  RAID_TELEMETRY_IDS_LOBBY_CLICK_EXIT(10),
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_TAP_AVATAR = 11;</code>
   */
  RAID_TELEMETRY_IDS_LOBBY_TAP_AVATAR(11),
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_CLICK_REJOIN_BATTLE = 12;</code>
   */
  RAID_TELEMETRY_IDS_LOBBY_CLICK_REJOIN_BATTLE(12),
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_CLICK_LOBBY_PUBLIC = 13;</code>
   */
  RAID_TELEMETRY_IDS_LOBBY_CLICK_LOBBY_PUBLIC(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RAID_TELEMETRY_IDS_UNDEFINED_RAID_EVENT = 0;</code>
   */
  public static final int RAID_TELEMETRY_IDS_UNDEFINED_RAID_EVENT_VALUE = 0;
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_ENTER = 1;</code>
   */
  public static final int RAID_TELEMETRY_IDS_APPROACH_ENTER_VALUE = 1;
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_CLICK_SPINNER = 2;</code>
   */
  public static final int RAID_TELEMETRY_IDS_APPROACH_CLICK_SPINNER_VALUE = 2;
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_JOIN = 3;</code>
   */
  public static final int RAID_TELEMETRY_IDS_APPROACH_JOIN_VALUE = 3;
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_TICKET_CONFIRMATION = 4;</code>
   */
  public static final int RAID_TELEMETRY_IDS_APPROACH_TICKET_CONFIRMATION_VALUE = 4;
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_CLICK_TUTORIAL = 5;</code>
   */
  public static final int RAID_TELEMETRY_IDS_APPROACH_CLICK_TUTORIAL_VALUE = 5;
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_CLICK_SHOP = 6;</code>
   */
  public static final int RAID_TELEMETRY_IDS_APPROACH_CLICK_SHOP_VALUE = 6;
  /**
   * <code>RAID_TELEMETRY_IDS_APPROACH_CLICK_INSPECT = 7;</code>
   */
  public static final int RAID_TELEMETRY_IDS_APPROACH_CLICK_INSPECT_VALUE = 7;
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_ENTER = 8;</code>
   */
  public static final int RAID_TELEMETRY_IDS_LOBBY_ENTER_VALUE = 8;
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_CLICK_INVENTORY = 9;</code>
   */
  public static final int RAID_TELEMETRY_IDS_LOBBY_CLICK_INVENTORY_VALUE = 9;
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_CLICK_EXIT = 10;</code>
   */
  public static final int RAID_TELEMETRY_IDS_LOBBY_CLICK_EXIT_VALUE = 10;
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_TAP_AVATAR = 11;</code>
   */
  public static final int RAID_TELEMETRY_IDS_LOBBY_TAP_AVATAR_VALUE = 11;
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_CLICK_REJOIN_BATTLE = 12;</code>
   */
  public static final int RAID_TELEMETRY_IDS_LOBBY_CLICK_REJOIN_BATTLE_VALUE = 12;
  /**
   * <code>RAID_TELEMETRY_IDS_LOBBY_CLICK_LOBBY_PUBLIC = 13;</code>
   */
  public static final int RAID_TELEMETRY_IDS_LOBBY_CLICK_LOBBY_PUBLIC_VALUE = 13;


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
  public static RaidTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RaidTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return RAID_TELEMETRY_IDS_UNDEFINED_RAID_EVENT;
      case 1: return RAID_TELEMETRY_IDS_APPROACH_ENTER;
      case 2: return RAID_TELEMETRY_IDS_APPROACH_CLICK_SPINNER;
      case 3: return RAID_TELEMETRY_IDS_APPROACH_JOIN;
      case 4: return RAID_TELEMETRY_IDS_APPROACH_TICKET_CONFIRMATION;
      case 5: return RAID_TELEMETRY_IDS_APPROACH_CLICK_TUTORIAL;
      case 6: return RAID_TELEMETRY_IDS_APPROACH_CLICK_SHOP;
      case 7: return RAID_TELEMETRY_IDS_APPROACH_CLICK_INSPECT;
      case 8: return RAID_TELEMETRY_IDS_LOBBY_ENTER;
      case 9: return RAID_TELEMETRY_IDS_LOBBY_CLICK_INVENTORY;
      case 10: return RAID_TELEMETRY_IDS_LOBBY_CLICK_EXIT;
      case 11: return RAID_TELEMETRY_IDS_LOBBY_TAP_AVATAR;
      case 12: return RAID_TELEMETRY_IDS_LOBBY_CLICK_REJOIN_BATTLE;
      case 13: return RAID_TELEMETRY_IDS_LOBBY_CLICK_LOBBY_PUBLIC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RaidTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RaidTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RaidTelemetryIds>() {
          public RaidTelemetryIds findValueByNumber(int number) {
            return RaidTelemetryIds.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(76);
  }

  private static final RaidTelemetryIds[] VALUES = values();

  public static RaidTelemetryIds valueOf(
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

  private RaidTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.RaidTelemetryIds)
}

