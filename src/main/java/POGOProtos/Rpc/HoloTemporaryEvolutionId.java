// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.HoloTemporaryEvolutionId}
 */
public enum HoloTemporaryEvolutionId
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_UNSET = 0;</code>
   */
  HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_UNSET(0),
  /**
   * <code>HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA = 1;</code>
   */
  HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA(1),
  /**
   * <code>HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_X = 2;</code>
   */
  HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_X(2),
  /**
   * <code>HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_Y = 3;</code>
   */
  HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_Y(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_UNSET = 0;</code>
   */
  public static final int HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_UNSET_VALUE = 0;
  /**
   * <code>HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA = 1;</code>
   */
  public static final int HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_VALUE = 1;
  /**
   * <code>HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_X = 2;</code>
   */
  public static final int HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_X_VALUE = 2;
  /**
   * <code>HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_Y = 3;</code>
   */
  public static final int HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_Y_VALUE = 3;


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
  public static HoloTemporaryEvolutionId valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HoloTemporaryEvolutionId forNumber(int value) {
    switch (value) {
      case 0: return HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_UNSET;
      case 1: return HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA;
      case 2: return HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_X;
      case 3: return HOLO_TEMPORARY_EVOLUTION_ID_TEMP_EVOLUTION_MEGA_Y;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HoloTemporaryEvolutionId>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HoloTemporaryEvolutionId> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HoloTemporaryEvolutionId>() {
          public HoloTemporaryEvolutionId findValueByNumber(int number) {
            return HoloTemporaryEvolutionId.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(62);
  }

  private static final HoloTemporaryEvolutionId[] VALUES = values();

  public static HoloTemporaryEvolutionId valueOf(
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

  private HoloTemporaryEvolutionId(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HoloTemporaryEvolutionId)
}

