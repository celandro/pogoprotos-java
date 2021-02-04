// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.CalendarAddResult}
 */
public enum CalendarAddResult
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CALENDAR_ADD_RESULT_UNKNOWN = 0;</code>
   */
  CALENDAR_ADD_RESULT_UNKNOWN(0),
  /**
   * <code>CALENDAR_ADD_RESULT_PERMISSION_DENIED = -2;</code>
   */
  CALENDAR_ADD_RESULT_PERMISSION_DENIED(-2),
  /**
   * <code>CALENDAR_ADD_RESULT_NOT_ADDED = -1;</code>
   */
  CALENDAR_ADD_RESULT_NOT_ADDED(-1),
  /**
   * <code>CALENDAR_ADD_RESULT_ADDED = 1;</code>
   */
  CALENDAR_ADD_RESULT_ADDED(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CALENDAR_ADD_RESULT_UNKNOWN = 0;</code>
   */
  public static final int CALENDAR_ADD_RESULT_UNKNOWN_VALUE = 0;
  /**
   * <code>CALENDAR_ADD_RESULT_PERMISSION_DENIED = -2;</code>
   */
  public static final int CALENDAR_ADD_RESULT_PERMISSION_DENIED_VALUE = -2;
  /**
   * <code>CALENDAR_ADD_RESULT_NOT_ADDED = -1;</code>
   */
  public static final int CALENDAR_ADD_RESULT_NOT_ADDED_VALUE = -1;
  /**
   * <code>CALENDAR_ADD_RESULT_ADDED = 1;</code>
   */
  public static final int CALENDAR_ADD_RESULT_ADDED_VALUE = 1;


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
  public static CalendarAddResult valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CalendarAddResult forNumber(int value) {
    switch (value) {
      case 0: return CALENDAR_ADD_RESULT_UNKNOWN;
      case -2: return CALENDAR_ADD_RESULT_PERMISSION_DENIED;
      case -1: return CALENDAR_ADD_RESULT_NOT_ADDED;
      case 1: return CALENDAR_ADD_RESULT_ADDED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CalendarAddResult>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CalendarAddResult> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CalendarAddResult>() {
          public CalendarAddResult findValueByNumber(int number) {
            return CalendarAddResult.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(24);
  }

  private static final CalendarAddResult[] VALUES = values();

  public static CalendarAddResult valueOf(
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

  private CalendarAddResult(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CalendarAddResult)
}
