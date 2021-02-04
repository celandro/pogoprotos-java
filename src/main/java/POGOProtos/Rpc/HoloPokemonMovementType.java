// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.HoloPokemonMovementType}
 */
public enum HoloPokemonMovementType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MOVEMENT_STATIC = 0;</code>
   */
  MOVEMENT_STATIC(0),
  /**
   * <code>MOVEMENT_JUMP = 1;</code>
   */
  MOVEMENT_JUMP(1),
  /**
   * <code>MOVEMENT_VERTICAL = 2;</code>
   */
  MOVEMENT_VERTICAL(2),
  /**
   * <code>MOVEMENT_PSYCHIC = 3;</code>
   */
  MOVEMENT_PSYCHIC(3),
  /**
   * <code>MOVEMENT_ELECTRIC = 4;</code>
   */
  MOVEMENT_ELECTRIC(4),
  /**
   * <code>MOVEMENT_FLYING = 5;</code>
   */
  MOVEMENT_FLYING(5),
  /**
   * <code>MOVEMENT_HOVERING = 6;</code>
   */
  MOVEMENT_HOVERING(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MOVEMENT_STATIC = 0;</code>
   */
  public static final int MOVEMENT_STATIC_VALUE = 0;
  /**
   * <code>MOVEMENT_JUMP = 1;</code>
   */
  public static final int MOVEMENT_JUMP_VALUE = 1;
  /**
   * <code>MOVEMENT_VERTICAL = 2;</code>
   */
  public static final int MOVEMENT_VERTICAL_VALUE = 2;
  /**
   * <code>MOVEMENT_PSYCHIC = 3;</code>
   */
  public static final int MOVEMENT_PSYCHIC_VALUE = 3;
  /**
   * <code>MOVEMENT_ELECTRIC = 4;</code>
   */
  public static final int MOVEMENT_ELECTRIC_VALUE = 4;
  /**
   * <code>MOVEMENT_FLYING = 5;</code>
   */
  public static final int MOVEMENT_FLYING_VALUE = 5;
  /**
   * <code>MOVEMENT_HOVERING = 6;</code>
   */
  public static final int MOVEMENT_HOVERING_VALUE = 6;


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
  public static HoloPokemonMovementType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HoloPokemonMovementType forNumber(int value) {
    switch (value) {
      case 0: return MOVEMENT_STATIC;
      case 1: return MOVEMENT_JUMP;
      case 2: return MOVEMENT_VERTICAL;
      case 3: return MOVEMENT_PSYCHIC;
      case 4: return MOVEMENT_ELECTRIC;
      case 5: return MOVEMENT_FLYING;
      case 6: return MOVEMENT_HOVERING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HoloPokemonMovementType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HoloPokemonMovementType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HoloPokemonMovementType>() {
          public HoloPokemonMovementType findValueByNumber(int number) {
            return HoloPokemonMovementType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(63);
  }

  private static final HoloPokemonMovementType[] VALUES = values();

  public static HoloPokemonMovementType valueOf(
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

  private HoloPokemonMovementType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HoloPokemonMovementType)
}

