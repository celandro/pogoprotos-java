// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/PlatformWarningType.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.PlatformWarningType}
 */
public enum PlatformWarningType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLATFORM_WARNING_UNSET = 0;</code>
   */
  PLATFORM_WARNING_UNSET(0),
  /**
   * <code>PLATFORM_WARNING_STRIKE1 = 1;</code>
   */
  PLATFORM_WARNING_STRIKE1(1),
  /**
   * <code>PLATFORM_WARNING_STRIKE2 = 2;</code>
   */
  PLATFORM_WARNING_STRIKE2(2),
  /**
   * <code>PLATFORM_WARNING_STRIKE3 = 3;</code>
   */
  PLATFORM_WARNING_STRIKE3(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLATFORM_WARNING_UNSET = 0;</code>
   */
  public static final int PLATFORM_WARNING_UNSET_VALUE = 0;
  /**
   * <code>PLATFORM_WARNING_STRIKE1 = 1;</code>
   */
  public static final int PLATFORM_WARNING_STRIKE1_VALUE = 1;
  /**
   * <code>PLATFORM_WARNING_STRIKE2 = 2;</code>
   */
  public static final int PLATFORM_WARNING_STRIKE2_VALUE = 2;
  /**
   * <code>PLATFORM_WARNING_STRIKE3 = 3;</code>
   */
  public static final int PLATFORM_WARNING_STRIKE3_VALUE = 3;


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
  public static PlatformWarningType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlatformWarningType forNumber(int value) {
    switch (value) {
      case 0: return PLATFORM_WARNING_UNSET;
      case 1: return PLATFORM_WARNING_STRIKE1;
      case 2: return PLATFORM_WARNING_STRIKE2;
      case 3: return PLATFORM_WARNING_STRIKE3;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlatformWarningType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlatformWarningType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlatformWarningType>() {
          public PlatformWarningType findValueByNumber(int number) {
            return PlatformWarningType.forNumber(number);
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
    return POGOProtos.Enums.PlatformWarningTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final PlatformWarningType[] VALUES = values();

  public static PlatformWarningType valueOf(
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

  private PlatformWarningType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.PlatformWarningType)
}

