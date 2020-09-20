// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Platform.Protos.PlayerSubmissionTypeProto
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.PlayerSubmissionTypeProto}
 */
public enum PlayerSubmissionTypeProto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_TYPE_UNSPECIFIED = 0;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_TYPE_UNSPECIFIED(0),
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_SUBMISSION = 1;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_POI_SUBMISSION(1),
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_ROUTE_SUBMISSION = 2;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_ROUTE_SUBMISSION(2),
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_IMAGE_SUBMISSION = 3;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_POI_IMAGE_SUBMISSION(3),
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_TEXT_METADATA_UPDATE = 4;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_POI_TEXT_METADATA_UPDATE(4),
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_LOCATION_UPDATE = 5;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_POI_LOCATION_UPDATE(5),
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_TAKEDOWN_REQUEST = 6;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_POI_TAKEDOWN_REQUEST(6),
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_AR_VIDEO_SUBMISSION = 7;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_POI_AR_VIDEO_SUBMISSION(7),
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_REPORT = 8;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_REPORT(8),
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_LOCATION_UPDATE = 9;</code>
   */
  PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_LOCATION_UPDATE(9),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_SUBMISSION = 1;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_POI_SUBMISSION_VALUE = 1;
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_ROUTE_SUBMISSION = 2;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_ROUTE_SUBMISSION_VALUE = 2;
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_IMAGE_SUBMISSION = 3;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_POI_IMAGE_SUBMISSION_VALUE = 3;
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_TEXT_METADATA_UPDATE = 4;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_POI_TEXT_METADATA_UPDATE_VALUE = 4;
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_LOCATION_UPDATE = 5;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_POI_LOCATION_UPDATE_VALUE = 5;
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_TAKEDOWN_REQUEST = 6;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_POI_TAKEDOWN_REQUEST_VALUE = 6;
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_POI_AR_VIDEO_SUBMISSION = 7;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_POI_AR_VIDEO_SUBMISSION_VALUE = 7;
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_REPORT = 8;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_REPORT_VALUE = 8;
  /**
   * <code>PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_LOCATION_UPDATE = 9;</code>
   */
  public static final int PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_LOCATION_UPDATE_VALUE = 9;


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
  public static PlayerSubmissionTypeProto valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PlayerSubmissionTypeProto forNumber(int value) {
    switch (value) {
      case 0: return PLAYER_SUBMISSION_TYPE_PROTO_TYPE_UNSPECIFIED;
      case 1: return PLAYER_SUBMISSION_TYPE_PROTO_POI_SUBMISSION;
      case 2: return PLAYER_SUBMISSION_TYPE_PROTO_ROUTE_SUBMISSION;
      case 3: return PLAYER_SUBMISSION_TYPE_PROTO_POI_IMAGE_SUBMISSION;
      case 4: return PLAYER_SUBMISSION_TYPE_PROTO_POI_TEXT_METADATA_UPDATE;
      case 5: return PLAYER_SUBMISSION_TYPE_PROTO_POI_LOCATION_UPDATE;
      case 6: return PLAYER_SUBMISSION_TYPE_PROTO_POI_TAKEDOWN_REQUEST;
      case 7: return PLAYER_SUBMISSION_TYPE_PROTO_POI_AR_VIDEO_SUBMISSION;
      case 8: return PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_REPORT;
      case 9: return PLAYER_SUBMISSION_TYPE_PROTO_SPONSOR_POI_LOCATION_UPDATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PlayerSubmissionTypeProto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PlayerSubmissionTypeProto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PlayerSubmissionTypeProto>() {
          public PlayerSubmissionTypeProto findValueByNumber(int number) {
            return PlayerSubmissionTypeProto.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(139);
  }

  private static final PlayerSubmissionTypeProto[] VALUES = values();

  public static PlayerSubmissionTypeProto valueOf(
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

  private PlayerSubmissionTypeProto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlayerSubmissionTypeProto)
}

