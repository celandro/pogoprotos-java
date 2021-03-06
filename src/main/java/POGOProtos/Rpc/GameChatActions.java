// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.GameChatActions}
 */
public enum GameChatActions
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_GAME_CHAT_ACTION = 0;</code>
   */
  UNKNOWN_GAME_CHAT_ACTION(0),
  /**
   * <code>PROXY_CHAT_ACTION = 660000;</code>
   */
  PROXY_CHAT_ACTION(660000),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_GAME_CHAT_ACTION = 0;</code>
   */
  public static final int UNKNOWN_GAME_CHAT_ACTION_VALUE = 0;
  /**
   * <code>PROXY_CHAT_ACTION = 660000;</code>
   */
  public static final int PROXY_CHAT_ACTION_VALUE = 660000;


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
  public static GameChatActions valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameChatActions forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_GAME_CHAT_ACTION;
      case 660000: return PROXY_CHAT_ACTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameChatActions>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameChatActions> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameChatActions>() {
          public GameChatActions findValueByNumber(int number) {
            return GameChatActions.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(47);
  }

  private static final GameChatActions[] VALUES = values();

  public static GameChatActions valueOf(
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

  private GameChatActions(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GameChatActions)
}

