// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GamePing/GamePingAction.proto

package POGOProtos.Networking.Requests.Game.GamePing;

/**
 * Protobuf enum {@code POGOProtos.Networking.Requests.Game.GamePing.GamePingAction}
 */
public enum GamePingAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_PING_ACTION = 0;</code>
   */
  UNKNOWN_GAME_PING_ACTION(0),
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>PING = 220000;</code>
   */
  PING(220000),
  /**
   * <pre>
   * ???
   * </pre>
   *
   * <code>PING_ASYNC = 220001;</code>
   */
  PING_ASYNC(220001),
  /**
   * <pre>
   * ???
   * </pre>
   *
   * <code>PING_DOWNSTREAM = 220002;</code>
   */
  PING_DOWNSTREAM(220002),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_PING_ACTION = 0;</code>
   */
  public static final int UNKNOWN_GAME_PING_ACTION_VALUE = 0;
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>PING = 220000;</code>
   */
  public static final int PING_VALUE = 220000;
  /**
   * <pre>
   * ???
   * </pre>
   *
   * <code>PING_ASYNC = 220001;</code>
   */
  public static final int PING_ASYNC_VALUE = 220001;
  /**
   * <pre>
   * ???
   * </pre>
   *
   * <code>PING_DOWNSTREAM = 220002;</code>
   */
  public static final int PING_DOWNSTREAM_VALUE = 220002;


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
  public static GamePingAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GamePingAction forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_GAME_PING_ACTION;
      case 220000: return PING;
      case 220001: return PING_ASYNC;
      case 220002: return PING_DOWNSTREAM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GamePingAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GamePingAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GamePingAction>() {
          public GamePingAction findValueByNumber(int number) {
            return GamePingAction.forNumber(number);
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
    return POGOProtos.Networking.Requests.Game.GamePing.GamePingActionOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final GamePingAction[] VALUES = values();

  public static GamePingAction valueOf(
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

  private GamePingAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Requests.Game.GamePing.GamePingAction)
}

