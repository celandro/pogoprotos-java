// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.RemoteRaidTelemetryIds}
 */
public enum RemoteRaidTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_UNDEFINED_REMOTE_RAID_EVENT = 0;</code>
   */
  REMOTE_RAID_TELEMETRY_IDS_UNDEFINED_REMOTE_RAID_EVENT(0),
  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_LOBBY_ENTER = 1;</code>
   */
  REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_LOBBY_ENTER(1),
  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_SENT = 2;</code>
   */
  REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_SENT(2),
  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_ACCEPTED = 3;</code>
   */
  REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_ACCEPTED(3),
  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_REJECTED = 4;</code>
   */
  REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_REJECTED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_UNDEFINED_REMOTE_RAID_EVENT = 0;</code>
   */
  public static final int REMOTE_RAID_TELEMETRY_IDS_UNDEFINED_REMOTE_RAID_EVENT_VALUE = 0;
  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_LOBBY_ENTER = 1;</code>
   */
  public static final int REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_LOBBY_ENTER_VALUE = 1;
  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_SENT = 2;</code>
   */
  public static final int REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_SENT_VALUE = 2;
  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_ACCEPTED = 3;</code>
   */
  public static final int REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_ACCEPTED_VALUE = 3;
  /**
   * <code>REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_REJECTED = 4;</code>
   */
  public static final int REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_REJECTED_VALUE = 4;


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
  public static RemoteRaidTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RemoteRaidTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return REMOTE_RAID_TELEMETRY_IDS_UNDEFINED_REMOTE_RAID_EVENT;
      case 1: return REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_LOBBY_ENTER;
      case 2: return REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_SENT;
      case 3: return REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_ACCEPTED;
      case 4: return REMOTE_RAID_TELEMETRY_IDS_REMOTE_RAID_INVITE_REJECTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RemoteRaidTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RemoteRaidTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RemoteRaidTelemetryIds>() {
          public RemoteRaidTelemetryIds findValueByNumber(int number) {
            return RemoteRaidTelemetryIds.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(131);
  }

  private static final RemoteRaidTelemetryIds[] VALUES = values();

  public static RemoteRaidTelemetryIds valueOf(
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

  private RemoteRaidTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.RemoteRaidTelemetryIds)
}

