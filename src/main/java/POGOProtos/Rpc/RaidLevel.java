// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.RaidLevel}
 */
public enum RaidLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_UNSET = 0;</code>
   */
  RAID_LEVEL_RAID_LEVEL_UNSET(0),
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_1 = 1;</code>
   */
  RAID_LEVEL_RAID_LEVEL_1(1),
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_2 = 2;</code>
   */
  RAID_LEVEL_RAID_LEVEL_2(2),
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_3 = 3;</code>
   */
  RAID_LEVEL_RAID_LEVEL_3(3),
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_4 = 4;</code>
   */
  RAID_LEVEL_RAID_LEVEL_4(4),
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_5 = 5;</code>
   */
  RAID_LEVEL_RAID_LEVEL_5(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RAID_LEVEL_RAID_LEVEL_UNSET = 0;</code>
   */
  public static final int RAID_LEVEL_RAID_LEVEL_UNSET_VALUE = 0;
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_1 = 1;</code>
   */
  public static final int RAID_LEVEL_RAID_LEVEL_1_VALUE = 1;
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_2 = 2;</code>
   */
  public static final int RAID_LEVEL_RAID_LEVEL_2_VALUE = 2;
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_3 = 3;</code>
   */
  public static final int RAID_LEVEL_RAID_LEVEL_3_VALUE = 3;
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_4 = 4;</code>
   */
  public static final int RAID_LEVEL_RAID_LEVEL_4_VALUE = 4;
  /**
   * <code>RAID_LEVEL_RAID_LEVEL_5 = 5;</code>
   */
  public static final int RAID_LEVEL_RAID_LEVEL_5_VALUE = 5;


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
  public static RaidLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RaidLevel forNumber(int value) {
    switch (value) {
      case 0: return RAID_LEVEL_RAID_LEVEL_UNSET;
      case 1: return RAID_LEVEL_RAID_LEVEL_1;
      case 2: return RAID_LEVEL_RAID_LEVEL_2;
      case 3: return RAID_LEVEL_RAID_LEVEL_3;
      case 4: return RAID_LEVEL_RAID_LEVEL_4;
      case 5: return RAID_LEVEL_RAID_LEVEL_5;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RaidLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RaidLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RaidLevel>() {
          public RaidLevel findValueByNumber(int number) {
            return RaidLevel.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(92);
  }

  private static final RaidLevel[] VALUES = values();

  public static RaidLevel valueOf(
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

  private RaidLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.RaidLevel)
}

