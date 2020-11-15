// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/PoiImageType.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.PoiImageType}
 */
public enum PoiImageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POI_IMAGE_TYPE_UNSET = 0;</code>
   */
  POI_IMAGE_TYPE_UNSET(0),
  /**
   * <code>MAIN = 1;</code>
   */
  MAIN(1),
  /**
   * <code>SURROUNDING = 2;</code>
   */
  SURROUNDING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POI_IMAGE_TYPE_UNSET = 0;</code>
   */
  public static final int POI_IMAGE_TYPE_UNSET_VALUE = 0;
  /**
   * <code>MAIN = 1;</code>
   */
  public static final int MAIN_VALUE = 1;
  /**
   * <code>SURROUNDING = 2;</code>
   */
  public static final int SURROUNDING_VALUE = 2;


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
  public static PoiImageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PoiImageType forNumber(int value) {
    switch (value) {
      case 0: return POI_IMAGE_TYPE_UNSET;
      case 1: return MAIN;
      case 2: return SURROUNDING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PoiImageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PoiImageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PoiImageType>() {
          public PoiImageType findValueByNumber(int number) {
            return PoiImageType.forNumber(number);
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
    return POGOProtos.Enums.PoiImageTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final PoiImageType[] VALUES = values();

  public static PoiImageType valueOf(
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

  private PoiImageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.PoiImageType)
}

