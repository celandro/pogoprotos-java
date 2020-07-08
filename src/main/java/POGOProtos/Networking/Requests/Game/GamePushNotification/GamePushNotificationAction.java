// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GamePushNotification/GamePushNotificationAction.proto

package POGOProtos.Networking.Requests.Game.GamePushNotification;

/**
 * Protobuf enum {@code POGOProtos.Networking.Requests.Game.GamePushNotification.GamePushNotificationAction}
 */
public enum GamePushNotificationAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_PUSH_NOTIFICATION_ACTION = 0;</code>
   */
  UNKNOWN_GAME_PUSH_NOTIFICATION_ACTION(0),
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>REGISTER_PUSH_NOTIFICATION = 320000;</code>
   */
  REGISTER_PUSH_NOTIFICATION(320000),
  /**
   * <pre>
   * ???
   * </pre>
   *
   * <code>UNREGISTER_PUSH_NOTIFICATION = 320001;</code>
   */
  UNREGISTER_PUSH_NOTIFICATION(320001),
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>OPT_OUT_PUSH_NOTIFICATION_CATEGORY = 320002;</code>
   */
  OPT_OUT_PUSH_NOTIFICATION_CATEGORY(320002),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No implementation required
   * </pre>
   *
   * <code>UNKNOWN_GAME_PUSH_NOTIFICATION_ACTION = 0;</code>
   */
  public static final int UNKNOWN_GAME_PUSH_NOTIFICATION_ACTION_VALUE = 0;
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>REGISTER_PUSH_NOTIFICATION = 320000;</code>
   */
  public static final int REGISTER_PUSH_NOTIFICATION_VALUE = 320000;
  /**
   * <pre>
   * ???
   * </pre>
   *
   * <code>UNREGISTER_PUSH_NOTIFICATION = 320001;</code>
   */
  public static final int UNREGISTER_PUSH_NOTIFICATION_VALUE = 320001;
  /**
   * <pre>
   * Implemented
   * </pre>
   *
   * <code>OPT_OUT_PUSH_NOTIFICATION_CATEGORY = 320002;</code>
   */
  public static final int OPT_OUT_PUSH_NOTIFICATION_CATEGORY_VALUE = 320002;


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
  public static GamePushNotificationAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GamePushNotificationAction forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_GAME_PUSH_NOTIFICATION_ACTION;
      case 320000: return REGISTER_PUSH_NOTIFICATION;
      case 320001: return UNREGISTER_PUSH_NOTIFICATION;
      case 320002: return OPT_OUT_PUSH_NOTIFICATION_CATEGORY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GamePushNotificationAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GamePushNotificationAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GamePushNotificationAction>() {
          public GamePushNotificationAction findValueByNumber(int number) {
            return GamePushNotificationAction.forNumber(number);
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
    return POGOProtos.Networking.Requests.Game.GamePushNotification.GamePushNotificationActionOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final GamePushNotificationAction[] VALUES = values();

  public static GamePushNotificationAction valueOf(
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

  private GamePushNotificationAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Requests.Game.GamePushNotification.GamePushNotificationAction)
}
