// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/TelemetryIds.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.PushNotificationTelemetryIds}
 */
public enum PushNotificationTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNDEFINED_PUSH_NOTIFICATION_EVENT = 0;</code>
   */
  UNDEFINED_PUSH_NOTIFICATION_EVENT(0),
  /**
   * <code>OPEN_APP = 1;</code>
   */
  OPEN_APP(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNDEFINED_PUSH_NOTIFICATION_EVENT = 0;</code>
   */
  public static final int UNDEFINED_PUSH_NOTIFICATION_EVENT_VALUE = 0;
  /**
   * <code>OPEN_APP = 1;</code>
   */
  public static final int OPEN_APP_VALUE = 1;


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
  public static PushNotificationTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PushNotificationTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return UNDEFINED_PUSH_NOTIFICATION_EVENT;
      case 1: return OPEN_APP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PushNotificationTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PushNotificationTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PushNotificationTelemetryIds>() {
          public PushNotificationTelemetryIds findValueByNumber(int number) {
            return PushNotificationTelemetryIds.forNumber(number);
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
    return POGOProtos.Enums.TelemetryIds.getDescriptor().getEnumTypes().get(15);
  }

  private static final PushNotificationTelemetryIds[] VALUES = values();

  public static PushNotificationTelemetryIds valueOf(
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

  private PushNotificationTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.PushNotificationTelemetryIds)
}
