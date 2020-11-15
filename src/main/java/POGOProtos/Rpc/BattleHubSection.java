// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.BattleHubSection}
 */
public enum BattleHubSection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SECTION_UNSET = 0;</code>
   */
  SECTION_UNSET(0),
  /**
   * <code>SECTION_VS_SEEKER = 1;</code>
   */
  SECTION_VS_SEEKER(1),
  /**
   * <code>SECTION_CURR_SEASON = 2;</code>
   */
  SECTION_CURR_SEASON(2),
  /**
   * <code>SECTION_LAST_SEASON = 3;</code>
   */
  SECTION_LAST_SEASON(3),
  /**
   * <code>SECTION_NEARBY = 4;</code>
   */
  SECTION_NEARBY(4),
  /**
   * <code>SECTION_TEAM_LEADERS = 5;</code>
   */
  SECTION_TEAM_LEADERS(5),
  /**
   * <code>SECTION_QR_CODE = 6;</code>
   */
  SECTION_QR_CODE(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SECTION_UNSET = 0;</code>
   */
  public static final int SECTION_UNSET_VALUE = 0;
  /**
   * <code>SECTION_VS_SEEKER = 1;</code>
   */
  public static final int SECTION_VS_SEEKER_VALUE = 1;
  /**
   * <code>SECTION_CURR_SEASON = 2;</code>
   */
  public static final int SECTION_CURR_SEASON_VALUE = 2;
  /**
   * <code>SECTION_LAST_SEASON = 3;</code>
   */
  public static final int SECTION_LAST_SEASON_VALUE = 3;
  /**
   * <code>SECTION_NEARBY = 4;</code>
   */
  public static final int SECTION_NEARBY_VALUE = 4;
  /**
   * <code>SECTION_TEAM_LEADERS = 5;</code>
   */
  public static final int SECTION_TEAM_LEADERS_VALUE = 5;
  /**
   * <code>SECTION_QR_CODE = 6;</code>
   */
  public static final int SECTION_QR_CODE_VALUE = 6;


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
  public static BattleHubSection valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BattleHubSection forNumber(int value) {
    switch (value) {
      case 0: return SECTION_UNSET;
      case 1: return SECTION_VS_SEEKER;
      case 2: return SECTION_CURR_SEASON;
      case 3: return SECTION_LAST_SEASON;
      case 4: return SECTION_NEARBY;
      case 5: return SECTION_TEAM_LEADERS;
      case 6: return SECTION_QR_CODE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BattleHubSection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BattleHubSection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BattleHubSection>() {
          public BattleHubSection findValueByNumber(int number) {
            return BattleHubSection.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(14);
  }

  private static final BattleHubSection[] VALUES = values();

  public static BattleHubSection valueOf(
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

  private BattleHubSection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BattleHubSection)
}

