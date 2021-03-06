// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.DeviceServiceTelemetryIds}
 */
public enum DeviceServiceTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_UNDEFINED_DEVICE_SERVICE = 0;</code>
   */
  DEVICE_SERVICE_TELEMETRY_IDS_UNDEFINED_DEVICE_SERVICE(0),
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_FITNESS = 1;</code>
   */
  DEVICE_SERVICE_TELEMETRY_IDS_FITNESS(1),
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_SMART_WATCH = 2;</code>
   */
  DEVICE_SERVICE_TELEMETRY_IDS_SMART_WATCH(2),
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_SFIDA = 3;</code>
   */
  DEVICE_SERVICE_TELEMETRY_IDS_SFIDA(3),
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_AWARENESS = 4;</code>
   */
  DEVICE_SERVICE_TELEMETRY_IDS_AWARENESS(4),
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_ADVENTURE_SYNC = 5;</code>
   */
  DEVICE_SERVICE_TELEMETRY_IDS_ADVENTURE_SYNC(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_UNDEFINED_DEVICE_SERVICE = 0;</code>
   */
  public static final int DEVICE_SERVICE_TELEMETRY_IDS_UNDEFINED_DEVICE_SERVICE_VALUE = 0;
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_FITNESS = 1;</code>
   */
  public static final int DEVICE_SERVICE_TELEMETRY_IDS_FITNESS_VALUE = 1;
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_SMART_WATCH = 2;</code>
   */
  public static final int DEVICE_SERVICE_TELEMETRY_IDS_SMART_WATCH_VALUE = 2;
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_SFIDA = 3;</code>
   */
  public static final int DEVICE_SERVICE_TELEMETRY_IDS_SFIDA_VALUE = 3;
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_AWARENESS = 4;</code>
   */
  public static final int DEVICE_SERVICE_TELEMETRY_IDS_AWARENESS_VALUE = 4;
  /**
   * <code>DEVICE_SERVICE_TELEMETRY_IDS_ADVENTURE_SYNC = 5;</code>
   */
  public static final int DEVICE_SERVICE_TELEMETRY_IDS_ADVENTURE_SYNC_VALUE = 5;


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
  public static DeviceServiceTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DeviceServiceTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return DEVICE_SERVICE_TELEMETRY_IDS_UNDEFINED_DEVICE_SERVICE;
      case 1: return DEVICE_SERVICE_TELEMETRY_IDS_FITNESS;
      case 2: return DEVICE_SERVICE_TELEMETRY_IDS_SMART_WATCH;
      case 3: return DEVICE_SERVICE_TELEMETRY_IDS_SFIDA;
      case 4: return DEVICE_SERVICE_TELEMETRY_IDS_AWARENESS;
      case 5: return DEVICE_SERVICE_TELEMETRY_IDS_ADVENTURE_SYNC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeviceServiceTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeviceServiceTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeviceServiceTelemetryIds>() {
          public DeviceServiceTelemetryIds findValueByNumber(int number) {
            return DeviceServiceTelemetryIds.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(38);
  }

  private static final DeviceServiceTelemetryIds[] VALUES = values();

  public static DeviceServiceTelemetryIds valueOf(
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

  private DeviceServiceTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DeviceServiceTelemetryIds)
}

