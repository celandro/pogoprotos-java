// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PokemonInventoryTelemetryIds}
 */
public enum PokemonInventoryTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POKEMON_INVENTORY_TELEMETRY_IDS_UNDEFINED_POKEMON_INVENTORY_EVENT = 0;</code>
   */
  POKEMON_INVENTORY_TELEMETRY_IDS_UNDEFINED_POKEMON_INVENTORY_EVENT(0),
  /**
   * <code>POKEMON_INVENTORY_TELEMETRY_IDS_OPEN = 1;</code>
   */
  POKEMON_INVENTORY_TELEMETRY_IDS_OPEN(1),
  /**
   * <code>POKEMON_INVENTORY_TELEMETRY_IDS_SORTING_CHANGE = 2;</code>
   */
  POKEMON_INVENTORY_TELEMETRY_IDS_SORTING_CHANGE(2),
  /**
   * <code>POKEMON_INVENTORY_TELEMETRY_IDS_FILTER = 3;</code>
   */
  POKEMON_INVENTORY_TELEMETRY_IDS_FILTER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POKEMON_INVENTORY_TELEMETRY_IDS_UNDEFINED_POKEMON_INVENTORY_EVENT = 0;</code>
   */
  public static final int POKEMON_INVENTORY_TELEMETRY_IDS_UNDEFINED_POKEMON_INVENTORY_EVENT_VALUE = 0;
  /**
   * <code>POKEMON_INVENTORY_TELEMETRY_IDS_OPEN = 1;</code>
   */
  public static final int POKEMON_INVENTORY_TELEMETRY_IDS_OPEN_VALUE = 1;
  /**
   * <code>POKEMON_INVENTORY_TELEMETRY_IDS_SORTING_CHANGE = 2;</code>
   */
  public static final int POKEMON_INVENTORY_TELEMETRY_IDS_SORTING_CHANGE_VALUE = 2;
  /**
   * <code>POKEMON_INVENTORY_TELEMETRY_IDS_FILTER = 3;</code>
   */
  public static final int POKEMON_INVENTORY_TELEMETRY_IDS_FILTER_VALUE = 3;


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
  public static PokemonInventoryTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PokemonInventoryTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return POKEMON_INVENTORY_TELEMETRY_IDS_UNDEFINED_POKEMON_INVENTORY_EVENT;
      case 1: return POKEMON_INVENTORY_TELEMETRY_IDS_OPEN;
      case 2: return POKEMON_INVENTORY_TELEMETRY_IDS_SORTING_CHANGE;
      case 3: return POKEMON_INVENTORY_TELEMETRY_IDS_FILTER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PokemonInventoryTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PokemonInventoryTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PokemonInventoryTelemetryIds>() {
          public PokemonInventoryTelemetryIds findValueByNumber(int number) {
            return PokemonInventoryTelemetryIds.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(113);
  }

  private static final PokemonInventoryTelemetryIds[] VALUES = values();

  public static PokemonInventoryTelemetryIds valueOf(
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

  private PokemonInventoryTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PokemonInventoryTelemetryIds)
}

