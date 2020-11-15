// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/VfxLevel.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.VfxLevel}
 */
public enum VfxLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NONE_VFX_LEVEL = 0;</code>
   */
  NONE_VFX_LEVEL(0),
  /**
   * <code>START = 1;</code>
   */
  START(1),
  /**
   * <code>NICE = 2;</code>
   */
  NICE(2),
  /**
   * <code>GREAT = 3;</code>
   */
  GREAT(3),
  /**
   * <code>EXCELLENT = 4;</code>
   */
  EXCELLENT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NONE_VFX_LEVEL = 0;</code>
   */
  public static final int NONE_VFX_LEVEL_VALUE = 0;
  /**
   * <code>START = 1;</code>
   */
  public static final int START_VALUE = 1;
  /**
   * <code>NICE = 2;</code>
   */
  public static final int NICE_VALUE = 2;
  /**
   * <code>GREAT = 3;</code>
   */
  public static final int GREAT_VALUE = 3;
  /**
   * <code>EXCELLENT = 4;</code>
   */
  public static final int EXCELLENT_VALUE = 4;


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
  public static VfxLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VfxLevel forNumber(int value) {
    switch (value) {
      case 0: return NONE_VFX_LEVEL;
      case 1: return START;
      case 2: return NICE;
      case 3: return GREAT;
      case 4: return EXCELLENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VfxLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VfxLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VfxLevel>() {
          public VfxLevel findValueByNumber(int number) {
            return VfxLevel.forNumber(number);
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
    return POGOProtos.Enums.VfxLevelOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final VfxLevel[] VALUES = values();

  public static VfxLevel valueOf(
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

  private VfxLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.VfxLevel)
}

