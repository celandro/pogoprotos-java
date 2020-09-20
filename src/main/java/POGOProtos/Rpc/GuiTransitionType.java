// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 *----- End gamemaster -----
 *------------------------------
 *----- Begin gui -----
 * ref: Niantic.Platform.CrossGameSocial.Gui.GuiTransitionType
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.GuiTransitionType}
 */
public enum GuiTransitionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GUI_TRANSITION_TYPE_IN = 0;</code>
   */
  GUI_TRANSITION_TYPE_IN(0),
  /**
   * <code>GUI_TRANSITION_TYPE_OUT = 1;</code>
   */
  GUI_TRANSITION_TYPE_OUT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GUI_TRANSITION_TYPE_IN = 0;</code>
   */
  public static final int GUI_TRANSITION_TYPE_IN_VALUE = 0;
  /**
   * <code>GUI_TRANSITION_TYPE_OUT = 1;</code>
   */
  public static final int GUI_TRANSITION_TYPE_OUT_VALUE = 1;


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
  public static GuiTransitionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GuiTransitionType forNumber(int value) {
    switch (value) {
      case 0: return GUI_TRANSITION_TYPE_IN;
      case 1: return GUI_TRANSITION_TYPE_OUT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GuiTransitionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GuiTransitionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GuiTransitionType>() {
          public GuiTransitionType findValueByNumber(int number) {
            return GuiTransitionType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(9);
  }

  private static final GuiTransitionType[] VALUES = values();

  public static GuiTransitionType valueOf(
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

  private GuiTransitionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GuiTransitionType)
}

