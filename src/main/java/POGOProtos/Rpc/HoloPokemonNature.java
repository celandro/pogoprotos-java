// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.HoloPokemonNature}
 */
public enum HoloPokemonNature
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HOLO_POKEMON_NATURE_NATURE_UNKNOWN = 0;</code>
   */
  HOLO_POKEMON_NATURE_NATURE_UNKNOWN(0),
  /**
   * <code>HOLO_POKEMON_NATURE_V0001_POKEMON_NATURE_STOIC = 1;</code>
   */
  HOLO_POKEMON_NATURE_V0001_POKEMON_NATURE_STOIC(1),
  /**
   * <code>HOLO_POKEMON_NATURE_V0002_POKEMON_NATURE_ASSASSIN = 2;</code>
   */
  HOLO_POKEMON_NATURE_V0002_POKEMON_NATURE_ASSASSIN(2),
  /**
   * <code>HOLO_POKEMON_NATURE_V0003_POKEMON_NATURE_GUARDIAN = 3;</code>
   */
  HOLO_POKEMON_NATURE_V0003_POKEMON_NATURE_GUARDIAN(3),
  /**
   * <code>HOLO_POKEMON_NATURE_V0004_POKEMON_NATURE_RAIDER = 4;</code>
   */
  HOLO_POKEMON_NATURE_V0004_POKEMON_NATURE_RAIDER(4),
  /**
   * <code>HOLO_POKEMON_NATURE_V0005_POKEMON_NATURE_PROTECTOR = 5;</code>
   */
  HOLO_POKEMON_NATURE_V0005_POKEMON_NATURE_PROTECTOR(5),
  /**
   * <code>HOLO_POKEMON_NATURE_V0006_POKEMON_NATURE_SENTRY = 6;</code>
   */
  HOLO_POKEMON_NATURE_V0006_POKEMON_NATURE_SENTRY(6),
  /**
   * <code>HOLO_POKEMON_NATURE_V0007_POKEMON_NATURE_CHAMPION = 7;</code>
   */
  HOLO_POKEMON_NATURE_V0007_POKEMON_NATURE_CHAMPION(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HOLO_POKEMON_NATURE_NATURE_UNKNOWN = 0;</code>
   */
  public static final int HOLO_POKEMON_NATURE_NATURE_UNKNOWN_VALUE = 0;
  /**
   * <code>HOLO_POKEMON_NATURE_V0001_POKEMON_NATURE_STOIC = 1;</code>
   */
  public static final int HOLO_POKEMON_NATURE_V0001_POKEMON_NATURE_STOIC_VALUE = 1;
  /**
   * <code>HOLO_POKEMON_NATURE_V0002_POKEMON_NATURE_ASSASSIN = 2;</code>
   */
  public static final int HOLO_POKEMON_NATURE_V0002_POKEMON_NATURE_ASSASSIN_VALUE = 2;
  /**
   * <code>HOLO_POKEMON_NATURE_V0003_POKEMON_NATURE_GUARDIAN = 3;</code>
   */
  public static final int HOLO_POKEMON_NATURE_V0003_POKEMON_NATURE_GUARDIAN_VALUE = 3;
  /**
   * <code>HOLO_POKEMON_NATURE_V0004_POKEMON_NATURE_RAIDER = 4;</code>
   */
  public static final int HOLO_POKEMON_NATURE_V0004_POKEMON_NATURE_RAIDER_VALUE = 4;
  /**
   * <code>HOLO_POKEMON_NATURE_V0005_POKEMON_NATURE_PROTECTOR = 5;</code>
   */
  public static final int HOLO_POKEMON_NATURE_V0005_POKEMON_NATURE_PROTECTOR_VALUE = 5;
  /**
   * <code>HOLO_POKEMON_NATURE_V0006_POKEMON_NATURE_SENTRY = 6;</code>
   */
  public static final int HOLO_POKEMON_NATURE_V0006_POKEMON_NATURE_SENTRY_VALUE = 6;
  /**
   * <code>HOLO_POKEMON_NATURE_V0007_POKEMON_NATURE_CHAMPION = 7;</code>
   */
  public static final int HOLO_POKEMON_NATURE_V0007_POKEMON_NATURE_CHAMPION_VALUE = 7;


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
  public static HoloPokemonNature valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HoloPokemonNature forNumber(int value) {
    switch (value) {
      case 0: return HOLO_POKEMON_NATURE_NATURE_UNKNOWN;
      case 1: return HOLO_POKEMON_NATURE_V0001_POKEMON_NATURE_STOIC;
      case 2: return HOLO_POKEMON_NATURE_V0002_POKEMON_NATURE_ASSASSIN;
      case 3: return HOLO_POKEMON_NATURE_V0003_POKEMON_NATURE_GUARDIAN;
      case 4: return HOLO_POKEMON_NATURE_V0004_POKEMON_NATURE_RAIDER;
      case 5: return HOLO_POKEMON_NATURE_V0005_POKEMON_NATURE_PROTECTOR;
      case 6: return HOLO_POKEMON_NATURE_V0006_POKEMON_NATURE_SENTRY;
      case 7: return HOLO_POKEMON_NATURE_V0007_POKEMON_NATURE_CHAMPION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HoloPokemonNature>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HoloPokemonNature> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HoloPokemonNature>() {
          public HoloPokemonNature findValueByNumber(int number) {
            return HoloPokemonNature.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(60);
  }

  private static final HoloPokemonNature[] VALUES = values();

  public static HoloPokemonNature valueOf(
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

  private HoloPokemonNature(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HoloPokemonNature)
}

