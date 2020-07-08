// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/WeatherCondition.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.WeatherCondition}
 */
public enum WeatherCondition
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NONE = 0;</code>
   */
  NONE(0),
  /**
   * <code>CLEAR = 1;</code>
   */
  CLEAR(1),
  /**
   * <code>RAINY = 2;</code>
   */
  RAINY(2),
  /**
   * <code>PARTLY_CLOUDY = 3;</code>
   */
  PARTLY_CLOUDY(3),
  /**
   * <code>OVERCAST = 4;</code>
   */
  OVERCAST(4),
  /**
   * <code>WINDY = 5;</code>
   */
  WINDY(5),
  /**
   * <code>SNOW = 6;</code>
   */
  SNOW(6),
  /**
   * <code>FOG = 7;</code>
   */
  FOG(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NONE = 0;</code>
   */
  public static final int NONE_VALUE = 0;
  /**
   * <code>CLEAR = 1;</code>
   */
  public static final int CLEAR_VALUE = 1;
  /**
   * <code>RAINY = 2;</code>
   */
  public static final int RAINY_VALUE = 2;
  /**
   * <code>PARTLY_CLOUDY = 3;</code>
   */
  public static final int PARTLY_CLOUDY_VALUE = 3;
  /**
   * <code>OVERCAST = 4;</code>
   */
  public static final int OVERCAST_VALUE = 4;
  /**
   * <code>WINDY = 5;</code>
   */
  public static final int WINDY_VALUE = 5;
  /**
   * <code>SNOW = 6;</code>
   */
  public static final int SNOW_VALUE = 6;
  /**
   * <code>FOG = 7;</code>
   */
  public static final int FOG_VALUE = 7;


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
  public static WeatherCondition valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WeatherCondition forNumber(int value) {
    switch (value) {
      case 0: return NONE;
      case 1: return CLEAR;
      case 2: return RAINY;
      case 3: return PARTLY_CLOUDY;
      case 4: return OVERCAST;
      case 5: return WINDY;
      case 6: return SNOW;
      case 7: return FOG;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WeatherCondition>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WeatherCondition> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WeatherCondition>() {
          public WeatherCondition findValueByNumber(int number) {
            return WeatherCondition.forNumber(number);
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
    return POGOProtos.Enums.WeatherConditionOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final WeatherCondition[] VALUES = values();

  public static WeatherCondition valueOf(
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

  private WeatherCondition(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.WeatherCondition)
}
