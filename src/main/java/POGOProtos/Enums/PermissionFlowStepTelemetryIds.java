// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/TelemetryIds.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.PermissionFlowStepTelemetryIds}
 */
public enum PermissionFlowStepTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNDEFINED_PERMISSION_FLOW_STEP = 0;</code>
   */
  UNDEFINED_PERMISSION_FLOW_STEP(0),
  /**
   * <code>INITIAL_PROMPT = 1;</code>
   */
  INITIAL_PROMPT(1),
  /**
   * <code>FITNESS_PERMISSION = 2;</code>
   */
  FITNESS_PERMISSION(2),
  /**
   * <code>LOCATION_PERMISSION = 3;</code>
   */
  LOCATION_PERMISSION(3),
  /**
   * <code>ACTIVITY_PERMISSIONS = 4;</code>
   */
  ACTIVITY_PERMISSIONS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNDEFINED_PERMISSION_FLOW_STEP = 0;</code>
   */
  public static final int UNDEFINED_PERMISSION_FLOW_STEP_VALUE = 0;
  /**
   * <code>INITIAL_PROMPT = 1;</code>
   */
  public static final int INITIAL_PROMPT_VALUE = 1;
  /**
   * <code>FITNESS_PERMISSION = 2;</code>
   */
  public static final int FITNESS_PERMISSION_VALUE = 2;
  /**
   * <code>LOCATION_PERMISSION = 3;</code>
   */
  public static final int LOCATION_PERMISSION_VALUE = 3;
  /**
   * <code>ACTIVITY_PERMISSIONS = 4;</code>
   */
  public static final int ACTIVITY_PERMISSIONS_VALUE = 4;


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
  public static PermissionFlowStepTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PermissionFlowStepTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return UNDEFINED_PERMISSION_FLOW_STEP;
      case 1: return INITIAL_PROMPT;
      case 2: return FITNESS_PERMISSION;
      case 3: return LOCATION_PERMISSION;
      case 4: return ACTIVITY_PERMISSIONS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PermissionFlowStepTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PermissionFlowStepTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PermissionFlowStepTelemetryIds>() {
          public PermissionFlowStepTelemetryIds findValueByNumber(int number) {
            return PermissionFlowStepTelemetryIds.forNumber(number);
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
    return POGOProtos.Enums.TelemetryIds.getDescriptor().getEnumTypes().get(3);
  }

  private static final PermissionFlowStepTelemetryIds[] VALUES = values();

  public static PermissionFlowStepTelemetryIds valueOf(
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

  private PermissionFlowStepTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.PermissionFlowStepTelemetryIds)
}

