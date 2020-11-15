// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.OnlineStatus}
 */
public enum OnlineStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ONLINE_STATUS_NOT_ONLINE = 0;</code>
   */
  ONLINE_STATUS_NOT_ONLINE(0),
  /**
   * <code>ONLINE_STATUS_ONLINE_ELSEWHERE = 1;</code>
   */
  ONLINE_STATUS_ONLINE_ELSEWHERE(1),
  /**
   * <code>ONLINE_STATUS_ONLINE = 2;</code>
   */
  ONLINE_STATUS_ONLINE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ONLINE_STATUS_NOT_ONLINE = 0;</code>
   */
  public static final int ONLINE_STATUS_NOT_ONLINE_VALUE = 0;
  /**
   * <code>ONLINE_STATUS_ONLINE_ELSEWHERE = 1;</code>
   */
  public static final int ONLINE_STATUS_ONLINE_ELSEWHERE_VALUE = 1;
  /**
   * <code>ONLINE_STATUS_ONLINE = 2;</code>
   */
  public static final int ONLINE_STATUS_ONLINE_VALUE = 2;


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
  public static OnlineStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OnlineStatus forNumber(int value) {
    switch (value) {
      case 0: return ONLINE_STATUS_NOT_ONLINE;
      case 1: return ONLINE_STATUS_ONLINE_ELSEWHERE;
      case 2: return ONLINE_STATUS_ONLINE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OnlineStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OnlineStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OnlineStatus>() {
          public OnlineStatus findValueByNumber(int number) {
            return OnlineStatus.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(92);
  }

  private static final OnlineStatus[] VALUES = values();

  public static OnlineStatus valueOf(
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

  private OnlineStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OnlineStatus)
}

