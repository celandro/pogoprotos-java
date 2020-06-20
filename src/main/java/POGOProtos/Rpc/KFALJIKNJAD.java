// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.KFALJIKNJAD}
 */
public enum KFALJIKNJAD
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>KFALJIKNJAD_NONE = 0;</code>
   */
  KFALJIKNJAD_NONE(0),
  /**
   * <code>KFALJIKNJAD_IDLE_01 = 1;</code>
   */
  KFALJIKNJAD_IDLE_01(1),
  /**
   * <code>KFALJIKNJAD_IDLE_02 = 2;</code>
   */
  KFALJIKNJAD_IDLE_02(2),
  /**
   * <code>KFALJIKNJAD_LAND = 3;</code>
   */
  KFALJIKNJAD_LAND(3),
  /**
   * <code>KFALJIKNJAD_ATTACK_01 = 4;</code>
   */
  KFALJIKNJAD_ATTACK_01(4),
  /**
   * <code>KFALJIKNJAD_ATTACK_02 = 5;</code>
   */
  KFALJIKNJAD_ATTACK_02(5),
  /**
   * <code>KFALJIKNJAD_DAMAGED = 6;</code>
   */
  KFALJIKNJAD_DAMAGED(6),
  /**
   * <code>KFALJIKNJAD_STUNNED = 7;</code>
   */
  KFALJIKNJAD_STUNNED(7),
  /**
   * <code>KFALJIKNJAD_LOOP = 8;</code>
   */
  KFALJIKNJAD_LOOP(8),
  /**
   * <code>KFALJIKNJAD_SLEEP_01 = 9;</code>
   */
  KFALJIKNJAD_SLEEP_01(9),
  /**
   * <code>KFALJIKNJAD_SLEEP_02 = 10;</code>
   */
  KFALJIKNJAD_SLEEP_02(10),
  /**
   * <code>KFALJIKNJAD_SLEEP_WAIT = 11;</code>
   */
  KFALJIKNJAD_SLEEP_WAIT(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>KFALJIKNJAD_NONE = 0;</code>
   */
  public static final int KFALJIKNJAD_NONE_VALUE = 0;
  /**
   * <code>KFALJIKNJAD_IDLE_01 = 1;</code>
   */
  public static final int KFALJIKNJAD_IDLE_01_VALUE = 1;
  /**
   * <code>KFALJIKNJAD_IDLE_02 = 2;</code>
   */
  public static final int KFALJIKNJAD_IDLE_02_VALUE = 2;
  /**
   * <code>KFALJIKNJAD_LAND = 3;</code>
   */
  public static final int KFALJIKNJAD_LAND_VALUE = 3;
  /**
   * <code>KFALJIKNJAD_ATTACK_01 = 4;</code>
   */
  public static final int KFALJIKNJAD_ATTACK_01_VALUE = 4;
  /**
   * <code>KFALJIKNJAD_ATTACK_02 = 5;</code>
   */
  public static final int KFALJIKNJAD_ATTACK_02_VALUE = 5;
  /**
   * <code>KFALJIKNJAD_DAMAGED = 6;</code>
   */
  public static final int KFALJIKNJAD_DAMAGED_VALUE = 6;
  /**
   * <code>KFALJIKNJAD_STUNNED = 7;</code>
   */
  public static final int KFALJIKNJAD_STUNNED_VALUE = 7;
  /**
   * <code>KFALJIKNJAD_LOOP = 8;</code>
   */
  public static final int KFALJIKNJAD_LOOP_VALUE = 8;
  /**
   * <code>KFALJIKNJAD_SLEEP_01 = 9;</code>
   */
  public static final int KFALJIKNJAD_SLEEP_01_VALUE = 9;
  /**
   * <code>KFALJIKNJAD_SLEEP_02 = 10;</code>
   */
  public static final int KFALJIKNJAD_SLEEP_02_VALUE = 10;
  /**
   * <code>KFALJIKNJAD_SLEEP_WAIT = 11;</code>
   */
  public static final int KFALJIKNJAD_SLEEP_WAIT_VALUE = 11;


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
  public static KFALJIKNJAD valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static KFALJIKNJAD forNumber(int value) {
    switch (value) {
      case 0: return KFALJIKNJAD_NONE;
      case 1: return KFALJIKNJAD_IDLE_01;
      case 2: return KFALJIKNJAD_IDLE_02;
      case 3: return KFALJIKNJAD_LAND;
      case 4: return KFALJIKNJAD_ATTACK_01;
      case 5: return KFALJIKNJAD_ATTACK_02;
      case 6: return KFALJIKNJAD_DAMAGED;
      case 7: return KFALJIKNJAD_STUNNED;
      case 8: return KFALJIKNJAD_LOOP;
      case 9: return KFALJIKNJAD_SLEEP_01;
      case 10: return KFALJIKNJAD_SLEEP_02;
      case 11: return KFALJIKNJAD_SLEEP_WAIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<KFALJIKNJAD>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      KFALJIKNJAD> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<KFALJIKNJAD>() {
          public KFALJIKNJAD findValueByNumber(int number) {
            return KFALJIKNJAD.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(73);
  }

  private static final KFALJIKNJAD[] VALUES = values();

  public static KFALJIKNJAD valueOf(
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

  private KFALJIKNJAD(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.KFALJIKNJAD)
}

