// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PhoneBoothPresentationMode}
 */
public enum PhoneBoothPresentationMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PHONE_BOOTH_PRESENTATION_MODE_NONE = 0;</code>
   */
  PHONE_BOOTH_PRESENTATION_MODE_NONE(0),
  /**
   * <code>PHONE_BOOTH_PRESENTATION_MODE_PORTRAIT = 1;</code>
   */
  PHONE_BOOTH_PRESENTATION_MODE_PORTRAIT(1),
  /**
   * <code>PHONE_BOOTH_PRESENTATION_MODE_DIALOG = 2;</code>
   */
  PHONE_BOOTH_PRESENTATION_MODE_DIALOG(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PHONE_BOOTH_PRESENTATION_MODE_NONE = 0;</code>
   */
  public static final int PHONE_BOOTH_PRESENTATION_MODE_NONE_VALUE = 0;
  /**
   * <code>PHONE_BOOTH_PRESENTATION_MODE_PORTRAIT = 1;</code>
   */
  public static final int PHONE_BOOTH_PRESENTATION_MODE_PORTRAIT_VALUE = 1;
  /**
   * <code>PHONE_BOOTH_PRESENTATION_MODE_DIALOG = 2;</code>
   */
  public static final int PHONE_BOOTH_PRESENTATION_MODE_DIALOG_VALUE = 2;


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
  public static PhoneBoothPresentationMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PhoneBoothPresentationMode forNumber(int value) {
    switch (value) {
      case 0: return PHONE_BOOTH_PRESENTATION_MODE_NONE;
      case 1: return PHONE_BOOTH_PRESENTATION_MODE_PORTRAIT;
      case 2: return PHONE_BOOTH_PRESENTATION_MODE_DIALOG;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PhoneBoothPresentationMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PhoneBoothPresentationMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PhoneBoothPresentationMode>() {
          public PhoneBoothPresentationMode findValueByNumber(int number) {
            return PhoneBoothPresentationMode.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(29);
  }

  private static final PhoneBoothPresentationMode[] VALUES = values();

  public static PhoneBoothPresentationMode valueOf(
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

  private PhoneBoothPresentationMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PhoneBoothPresentationMode)
}
