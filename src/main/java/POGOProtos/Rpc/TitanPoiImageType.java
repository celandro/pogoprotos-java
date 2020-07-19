// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.TitanPoiImageType}
 */
public enum TitanPoiImageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TITAN_POI_IMAGE_TYPE_UNSET = 0;</code>
   */
  TITAN_POI_IMAGE_TYPE_UNSET(0),
  /**
   * <code>TITAN_POI_IMAGE_TYPE_MAIN = 1;</code>
   */
  TITAN_POI_IMAGE_TYPE_MAIN(1),
  /**
   * <code>TITAN_POI_IMAGE_TYPE_SURROUNDING = 2;</code>
   */
  TITAN_POI_IMAGE_TYPE_SURROUNDING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TITAN_POI_IMAGE_TYPE_UNSET = 0;</code>
   */
  public static final int TITAN_POI_IMAGE_TYPE_UNSET_VALUE = 0;
  /**
   * <code>TITAN_POI_IMAGE_TYPE_MAIN = 1;</code>
   */
  public static final int TITAN_POI_IMAGE_TYPE_MAIN_VALUE = 1;
  /**
   * <code>TITAN_POI_IMAGE_TYPE_SURROUNDING = 2;</code>
   */
  public static final int TITAN_POI_IMAGE_TYPE_SURROUNDING_VALUE = 2;


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
  public static TitanPoiImageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TitanPoiImageType forNumber(int value) {
    switch (value) {
      case 0: return TITAN_POI_IMAGE_TYPE_UNSET;
      case 1: return TITAN_POI_IMAGE_TYPE_MAIN;
      case 2: return TITAN_POI_IMAGE_TYPE_SURROUNDING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TitanPoiImageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TitanPoiImageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TitanPoiImageType>() {
          public TitanPoiImageType findValueByNumber(int number) {
            return TitanPoiImageType.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(46);
  }

  private static final TitanPoiImageType[] VALUES = values();

  public static TitanPoiImageType valueOf(
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

  private TitanPoiImageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.TitanPoiImageType)
}

