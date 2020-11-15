// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.InvitationType}
 */
public enum InvitationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_UNSET = 0;</code>
   */
  INVITATION_TYPE_INVITATION_TYPE_UNSET(0),
  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_CODE = 1;</code>
   */
  INVITATION_TYPE_INVITATION_TYPE_CODE(1),
  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_FACEBOOK = 2;</code>
   */
  INVITATION_TYPE_INVITATION_TYPE_FACEBOOK(2),
  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_SERVER_REQUEST = 3;</code>
   */
  INVITATION_TYPE_INVITATION_TYPE_SERVER_REQUEST(3),
  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_NIANTIC_SOCIAL_GRAPH = 4;</code>
   */
  INVITATION_TYPE_INVITATION_TYPE_NIANTIC_SOCIAL_GRAPH(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_UNSET = 0;</code>
   */
  public static final int INVITATION_TYPE_INVITATION_TYPE_UNSET_VALUE = 0;
  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_CODE = 1;</code>
   */
  public static final int INVITATION_TYPE_INVITATION_TYPE_CODE_VALUE = 1;
  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_FACEBOOK = 2;</code>
   */
  public static final int INVITATION_TYPE_INVITATION_TYPE_FACEBOOK_VALUE = 2;
  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_SERVER_REQUEST = 3;</code>
   */
  public static final int INVITATION_TYPE_INVITATION_TYPE_SERVER_REQUEST_VALUE = 3;
  /**
   * <code>INVITATION_TYPE_INVITATION_TYPE_NIANTIC_SOCIAL_GRAPH = 4;</code>
   */
  public static final int INVITATION_TYPE_INVITATION_TYPE_NIANTIC_SOCIAL_GRAPH_VALUE = 4;


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
  public static InvitationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InvitationType forNumber(int value) {
    switch (value) {
      case 0: return INVITATION_TYPE_INVITATION_TYPE_UNSET;
      case 1: return INVITATION_TYPE_INVITATION_TYPE_CODE;
      case 2: return INVITATION_TYPE_INVITATION_TYPE_FACEBOOK;
      case 3: return INVITATION_TYPE_INVITATION_TYPE_SERVER_REQUEST;
      case 4: return INVITATION_TYPE_INVITATION_TYPE_NIANTIC_SOCIAL_GRAPH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InvitationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InvitationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InvitationType>() {
          public InvitationType findValueByNumber(int number) {
            return InvitationType.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(74);
  }

  private static final InvitationType[] VALUES = values();

  public static InvitationType valueOf(
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

  private InvitationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.InvitationType)
}

