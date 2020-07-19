// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.FortType}
 */
public enum FortType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FORT_TYPE_GYM = 0;</code>
   */
  FORT_TYPE_GYM(0),
  /**
   * <code>FORT_TYPE_CHECKPOINT = 1;</code>
   */
  FORT_TYPE_CHECKPOINT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FORT_TYPE_GYM = 0;</code>
   */
  public static final int FORT_TYPE_GYM_VALUE = 0;
  /**
   * <code>FORT_TYPE_CHECKPOINT = 1;</code>
   */
  public static final int FORT_TYPE_CHECKPOINT_VALUE = 1;


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
  public static FortType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FortType forNumber(int value) {
    switch (value) {
      case 0: return FORT_TYPE_GYM;
      case 1: return FORT_TYPE_CHECKPOINT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FortType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FortType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FortType>() {
          public FortType findValueByNumber(int number) {
            return FortType.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(74);
  }

  private static final FortType[] VALUES = values();

  public static FortType valueOf(
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

  private FortType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FortType)
}

