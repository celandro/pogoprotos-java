// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.HoloPokemonEggType}
 */
public enum HoloPokemonEggType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HOLO_POKEMON_EGG_TYPE_EGG_TYPE_UNSET = 0;</code>
   */
  HOLO_POKEMON_EGG_TYPE_EGG_TYPE_UNSET(0),
  /**
   * <code>HOLO_POKEMON_EGG_TYPE_EGG_TYPE_SHADOW = 1;</code>
   */
  HOLO_POKEMON_EGG_TYPE_EGG_TYPE_SHADOW(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HOLO_POKEMON_EGG_TYPE_EGG_TYPE_UNSET = 0;</code>
   */
  public static final int HOLO_POKEMON_EGG_TYPE_EGG_TYPE_UNSET_VALUE = 0;
  /**
   * <code>HOLO_POKEMON_EGG_TYPE_EGG_TYPE_SHADOW = 1;</code>
   */
  public static final int HOLO_POKEMON_EGG_TYPE_EGG_TYPE_SHADOW_VALUE = 1;


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
  public static HoloPokemonEggType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HoloPokemonEggType forNumber(int value) {
    switch (value) {
      case 0: return HOLO_POKEMON_EGG_TYPE_EGG_TYPE_UNSET;
      case 1: return HOLO_POKEMON_EGG_TYPE_EGG_TYPE_SHADOW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HoloPokemonEggType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HoloPokemonEggType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HoloPokemonEggType>() {
          public HoloPokemonEggType findValueByNumber(int number) {
            return HoloPokemonEggType.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(61);
  }

  private static final HoloPokemonEggType[] VALUES = values();

  public static HoloPokemonEggType valueOf(
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

  private HoloPokemonEggType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HoloPokemonEggType)
}

