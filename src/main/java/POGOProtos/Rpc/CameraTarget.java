// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.CameraTarget}
 */
public enum CameraTarget
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER = 0;</code>
   */
  CAMERA_TARGET_CAM_TARGET_ATTACKER(0),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_EDGE = 1;</code>
   */
  CAMERA_TARGET_CAM_TARGET_ATTACKER_EDGE(1),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_GROUND = 2;</code>
   */
  CAMERA_TARGET_CAM_TARGET_ATTACKER_GROUND(2),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER = 3;</code>
   */
  CAMERA_TARGET_CAM_TARGET_DEFENDER(3),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER_EDGE = 4;</code>
   */
  CAMERA_TARGET_CAM_TARGET_DEFENDER_EDGE(4),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER_GROUND = 5;</code>
   */
  CAMERA_TARGET_CAM_TARGET_DEFENDER_GROUND(5),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER = 6;</code>
   */
  CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER(6),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_EDGE = 7;</code>
   */
  CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_EDGE(7),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER = 8;</code>
   */
  CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER(8),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER_EDGE = 9;</code>
   */
  CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER_EDGE(9),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_MIRROR = 11;</code>
   */
  CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_MIRROR(11),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER = 12;</code>
   */
  CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER(12),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER_MIRROR = 13;</code>
   */
  CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER_MIRROR(13),
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_WORLD = 14;</code>
   */
  CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_WORLD(14),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER = 0;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_ATTACKER_VALUE = 0;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_EDGE = 1;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_ATTACKER_EDGE_VALUE = 1;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_GROUND = 2;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_ATTACKER_GROUND_VALUE = 2;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER = 3;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_DEFENDER_VALUE = 3;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER_EDGE = 4;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_DEFENDER_EDGE_VALUE = 4;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER_GROUND = 5;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_DEFENDER_GROUND_VALUE = 5;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER = 6;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_VALUE = 6;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_EDGE = 7;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_EDGE_VALUE = 7;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER = 8;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER_VALUE = 8;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER_EDGE = 9;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER_EDGE_VALUE = 9;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_MIRROR = 11;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_MIRROR_VALUE = 11;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER = 12;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER_VALUE = 12;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER_MIRROR = 13;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER_MIRROR_VALUE = 13;
  /**
   * <code>CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_WORLD = 14;</code>
   */
  public static final int CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_WORLD_VALUE = 14;


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
  public static CameraTarget valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CameraTarget forNumber(int value) {
    switch (value) {
      case 0: return CAMERA_TARGET_CAM_TARGET_ATTACKER;
      case 1: return CAMERA_TARGET_CAM_TARGET_ATTACKER_EDGE;
      case 2: return CAMERA_TARGET_CAM_TARGET_ATTACKER_GROUND;
      case 3: return CAMERA_TARGET_CAM_TARGET_DEFENDER;
      case 4: return CAMERA_TARGET_CAM_TARGET_DEFENDER_EDGE;
      case 5: return CAMERA_TARGET_CAM_TARGET_DEFENDER_GROUND;
      case 6: return CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER;
      case 7: return CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_EDGE;
      case 8: return CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER;
      case 9: return CAMERA_TARGET_CAM_TARGET_DEFENDER_ATTACKER_EDGE;
      case 11: return CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_MIRROR;
      case 12: return CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER;
      case 13: return CAMERA_TARGET_CAM_TARGET_SHOULDER_ATTACKER_DEFENDER_MIRROR;
      case 14: return CAMERA_TARGET_CAM_TARGET_ATTACKER_DEFENDER_WORLD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CameraTarget>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CameraTarget> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CameraTarget>() {
          public CameraTarget findValueByNumber(int number) {
            return CameraTarget.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(25);
  }

  private static final CameraTarget[] VALUES = values();

  public static CameraTarget valueOf(
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

  private CameraTarget(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CameraTarget)
}

