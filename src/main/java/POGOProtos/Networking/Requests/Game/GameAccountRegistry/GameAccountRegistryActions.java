// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameAccountRegistry/GameAccountRegistryActions.proto

package POGOProtos.Networking.Requests.Game.GameAccountRegistry;

/**
 * Protobuf enum {@code POGOProtos.Networking.Requests.Game.GameAccountRegistry.GameAccountRegistryActions}
 */
public enum GameAccountRegistryActions
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_ACCOUNT_REGISTRY_ACTION = 0;</code>
   */
  UNKNOWN_GAME_ACCOUNT_REGISTRY_ACTION(0),
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>ADD_LOGIN_ACTION = 600000;</code>
   */
  ADD_LOGIN_ACTION(600000),
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>REMOVE_LOGIN_ACTION = 600001;</code>
   */
  REMOVE_LOGIN_ACTION(600001),
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>LIST_LOGIN_ACTION = 600002;</code>
   */
  LIST_LOGIN_ACTION(600002),
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>REPLACE_LOGIN_ACTION = 600003;</code>
   */
  REPLACE_LOGIN_ACTION(600003),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_ACCOUNT_REGISTRY_ACTION = 0;</code>
   */
  public static final int UNKNOWN_GAME_ACCOUNT_REGISTRY_ACTION_VALUE = 0;
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>ADD_LOGIN_ACTION = 600000;</code>
   */
  public static final int ADD_LOGIN_ACTION_VALUE = 600000;
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>REMOVE_LOGIN_ACTION = 600001;</code>
   */
  public static final int REMOVE_LOGIN_ACTION_VALUE = 600001;
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>LIST_LOGIN_ACTION = 600002;</code>
   */
  public static final int LIST_LOGIN_ACTION_VALUE = 600002;
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>REPLACE_LOGIN_ACTION = 600003;</code>
   */
  public static final int REPLACE_LOGIN_ACTION_VALUE = 600003;


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
  public static GameAccountRegistryActions valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameAccountRegistryActions forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_GAME_ACCOUNT_REGISTRY_ACTION;
      case 600000: return ADD_LOGIN_ACTION;
      case 600001: return REMOVE_LOGIN_ACTION;
      case 600002: return LIST_LOGIN_ACTION;
      case 600003: return REPLACE_LOGIN_ACTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameAccountRegistryActions>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameAccountRegistryActions> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameAccountRegistryActions>() {
          public GameAccountRegistryActions findValueByNumber(int number) {
            return GameAccountRegistryActions.forNumber(number);
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
    return POGOProtos.Networking.Requests.Game.GameAccountRegistry.GameAccountRegistryActionsOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final GameAccountRegistryActions[] VALUES = values();

  public static GameAccountRegistryActions valueOf(
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

  private GameAccountRegistryActions(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Requests.Game.GameAccountRegistry.GameAccountRegistryActions)
}

