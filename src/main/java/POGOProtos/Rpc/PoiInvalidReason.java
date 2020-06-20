// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PoiInvalidReason}
 */
public enum PoiInvalidReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLATFORM_POIINVALIDREASON_INVALID_REASON_UNSPECIFIED = 0;</code>
   */
  PLATFORM_POIINVALIDREASON_INVALID_REASON_UNSPECIFIED(0),
  /**
   * <code>PLATFORM_POIINVALIDREASON_NO_PEDESTRIAN_ACCESS = 1;</code>
   */
  PLATFORM_POIINVALIDREASON_NO_PEDESTRIAN_ACCESS(1),
  /**
   * <code>PLATFORM_POIINVALIDREASON_OBSTRUCTS_EMERGENCY_SERVICES = 2;</code>
   */
  PLATFORM_POIINVALIDREASON_OBSTRUCTS_EMERGENCY_SERVICES(2),
  /**
   * <code>PLATFORM_POIINVALIDREASON_PRIVATE_RESIDENTIAL_PROPERTY = 3;</code>
   */
  PLATFORM_POIINVALIDREASON_PRIVATE_RESIDENTIAL_PROPERTY(3),
  /**
   * <code>PLATFORM_POIINVALIDREASON_SCHOOL = 4;</code>
   */
  PLATFORM_POIINVALIDREASON_SCHOOL(4),
  /**
   * <code>PLATFORM_POIINVALIDREASON_PERMANENTLY_REMOVED = 5;</code>
   */
  PLATFORM_POIINVALIDREASON_PERMANENTLY_REMOVED(5),
  /**
   * <code>PLATFORM_POIINVALIDREASON_DUPLICATE = 6;</code>
   */
  PLATFORM_POIINVALIDREASON_DUPLICATE(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLATFORM_POIINVALIDREASON_INVALID_REASON_UNSPECIFIED = 0;</code>
   */
  public static final int PLATFORM_POIINVALIDREASON_INVALID_REASON_UNSPECIFIED_VALUE = 0;
  /**
   * <code>PLATFORM_POIINVALIDREASON_NO_PEDESTRIAN_ACCESS = 1;</code>
   */
  public static final int PLATFORM_POIINVALIDREASON_NO_PEDESTRIAN_ACCESS_VALUE = 1;
  /**
   * <code>PLATFORM_POIINVALIDREASON_OBSTRUCTS_EMERGENCY_SERVICES = 2;</code>
   */
  public static final int PLATFORM_POIINVALIDREASON_OBSTRUCTS_EMERGENCY_SERVICES_VALUE = 2;
  /**
   * <code>PLATFORM_POIINVALIDREASON_PRIVATE_RESIDENTIAL_PROPERTY = 3;</code>
   */
  public static final int PLATFORM_POIINVALIDREASON_PRIVATE_RESIDENTIAL_PROPERTY_VALUE = 3;
  /**
   * <code>PLATFORM_POIINVALIDREASON_SCHOOL = 4;</code>
   */
  public static final int PLATFORM_POIINVALIDREASON_SCHOOL_VALUE = 4;
  /**
   * <code>PLATFORM_POIINVALIDREASON_PERMANENTLY_REMOVED = 5;</code>
   */
  public static final int PLATFORM_POIINVALIDREASON_PERMANENTLY_REMOVED_VALUE = 5;
  /**
   * <code>PLATFORM_POIINVALIDREASON_DUPLICATE = 6;</code>
   */
  public static final int PLATFORM_POIINVALIDREASON_DUPLICATE_VALUE = 6;


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
  public static PoiInvalidReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PoiInvalidReason forNumber(int value) {
    switch (value) {
      case 0: return PLATFORM_POIINVALIDREASON_INVALID_REASON_UNSPECIFIED;
      case 1: return PLATFORM_POIINVALIDREASON_NO_PEDESTRIAN_ACCESS;
      case 2: return PLATFORM_POIINVALIDREASON_OBSTRUCTS_EMERGENCY_SERVICES;
      case 3: return PLATFORM_POIINVALIDREASON_PRIVATE_RESIDENTIAL_PROPERTY;
      case 4: return PLATFORM_POIINVALIDREASON_SCHOOL;
      case 5: return PLATFORM_POIINVALIDREASON_PERMANENTLY_REMOVED;
      case 6: return PLATFORM_POIINVALIDREASON_DUPLICATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PoiInvalidReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PoiInvalidReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PoiInvalidReason>() {
          public PoiInvalidReason findValueByNumber(int number) {
            return PoiInvalidReason.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(120);
  }

  private static final PoiInvalidReason[] VALUES = values();

  public static PoiInvalidReason valueOf(
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

  private PoiInvalidReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PoiInvalidReason)
}

