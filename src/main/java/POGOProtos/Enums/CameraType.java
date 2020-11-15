// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/CameraType.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.CameraType}
 */
public enum CameraType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEFAULT_CAMERA = 0;</code>
   */
  DEFAULT_CAMERA(0),
  /**
   * <code>SHOULDER = 1;</code>
   */
  SHOULDER(1),
  /**
   * <code>ENEMY_POKEMON_FOCUS = 2;</code>
   */
  ENEMY_POKEMON_FOCUS(2),
  /**
   * <code>MY_POKEMON_FOCUS = 3;</code>
   */
  MY_POKEMON_FOCUS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEFAULT_CAMERA = 0;</code>
   */
  public static final int DEFAULT_CAMERA_VALUE = 0;
  /**
   * <code>SHOULDER = 1;</code>
   */
  public static final int SHOULDER_VALUE = 1;
  /**
   * <code>ENEMY_POKEMON_FOCUS = 2;</code>
   */
  public static final int ENEMY_POKEMON_FOCUS_VALUE = 2;
  /**
   * <code>MY_POKEMON_FOCUS = 3;</code>
   */
  public static final int MY_POKEMON_FOCUS_VALUE = 3;


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
  public static CameraType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CameraType forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT_CAMERA;
      case 1: return SHOULDER;
      case 2: return ENEMY_POKEMON_FOCUS;
      case 3: return MY_POKEMON_FOCUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CameraType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CameraType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CameraType>() {
          public CameraType findValueByNumber(int number) {
            return CameraType.forNumber(number);
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
    return POGOProtos.Enums.CameraTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final CameraType[] VALUES = values();

  public static CameraType valueOf(
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

  private CameraType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.CameraType)
}

