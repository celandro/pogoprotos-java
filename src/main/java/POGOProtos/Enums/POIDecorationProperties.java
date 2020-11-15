// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/POIDecorationProperties.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.POIDecorationProperties}
 */
public enum POIDecorationProperties
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COLOR = 0;</code>
   */
  COLOR(0),
  /**
   * <code>POSITION = 1;</code>
   */
  POSITION(1),
  /**
   * <code>SIZE = 2;</code>
   */
  SIZE(2),
  /**
   * <code>TEXT = 3;</code>
   */
  TEXT(3),
  /**
   * <code>ACTIVE = 4;</code>
   */
  ACTIVE(4),
  /**
   * <code>ICON = 5;</code>
   */
  ICON(5),
  /**
   * <code>SET_RAID_DATA = 6;</code>
   */
  SET_RAID_DATA(6),
  /**
   * <code>NEARBY_CARROT_VISIBLE = 7;</code>
   */
  NEARBY_CARROT_VISIBLE(7),
  /**
   * <code>SET_LOWEST_MOTIVATION = 8;</code>
   */
  SET_LOWEST_MOTIVATION(8),
  /**
   * <code>SET_NPC_CLICKED_ACTION = 9;</code>
   */
  SET_NPC_CLICKED_ACTION(9),
  /**
   * <code>BEGIN_EXIT = 10;</code>
   */
  BEGIN_EXIT(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COLOR = 0;</code>
   */
  public static final int COLOR_VALUE = 0;
  /**
   * <code>POSITION = 1;</code>
   */
  public static final int POSITION_VALUE = 1;
  /**
   * <code>SIZE = 2;</code>
   */
  public static final int SIZE_VALUE = 2;
  /**
   * <code>TEXT = 3;</code>
   */
  public static final int TEXT_VALUE = 3;
  /**
   * <code>ACTIVE = 4;</code>
   */
  public static final int ACTIVE_VALUE = 4;
  /**
   * <code>ICON = 5;</code>
   */
  public static final int ICON_VALUE = 5;
  /**
   * <code>SET_RAID_DATA = 6;</code>
   */
  public static final int SET_RAID_DATA_VALUE = 6;
  /**
   * <code>NEARBY_CARROT_VISIBLE = 7;</code>
   */
  public static final int NEARBY_CARROT_VISIBLE_VALUE = 7;
  /**
   * <code>SET_LOWEST_MOTIVATION = 8;</code>
   */
  public static final int SET_LOWEST_MOTIVATION_VALUE = 8;
  /**
   * <code>SET_NPC_CLICKED_ACTION = 9;</code>
   */
  public static final int SET_NPC_CLICKED_ACTION_VALUE = 9;
  /**
   * <code>BEGIN_EXIT = 10;</code>
   */
  public static final int BEGIN_EXIT_VALUE = 10;


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
  public static POIDecorationProperties valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static POIDecorationProperties forNumber(int value) {
    switch (value) {
      case 0: return COLOR;
      case 1: return POSITION;
      case 2: return SIZE;
      case 3: return TEXT;
      case 4: return ACTIVE;
      case 5: return ICON;
      case 6: return SET_RAID_DATA;
      case 7: return NEARBY_CARROT_VISIBLE;
      case 8: return SET_LOWEST_MOTIVATION;
      case 9: return SET_NPC_CLICKED_ACTION;
      case 10: return BEGIN_EXIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<POIDecorationProperties>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      POIDecorationProperties> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<POIDecorationProperties>() {
          public POIDecorationProperties findValueByNumber(int number) {
            return POIDecorationProperties.forNumber(number);
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
    return POGOProtos.Enums.POIDecorationPropertiesOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final POIDecorationProperties[] VALUES = values();

  public static POIDecorationProperties valueOf(
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

  private POIDecorationProperties(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.POIDecorationProperties)
}

