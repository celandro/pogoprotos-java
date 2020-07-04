// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TitanPoiSubmissionTelemetry}
 */
public  final class TitanPoiSubmissionTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TitanPoiSubmissionTelemetry)
    TitanPoiSubmissionTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TitanPoiSubmissionTelemetry.newBuilder() to construct.
  private TitanPoiSubmissionTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TitanPoiSubmissionTelemetry() {
    guiEventId_ = 0;
    imageType_ = 0;
    cameraStepId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TitanPoiSubmissionTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TitanPoiSubmissionTelemetry(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            guiEventId_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            imageType_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            cameraStepId_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TitanPoiSubmissionTelemetry.class, POGOProtos.Rpc.TitanPoiSubmissionTelemetry.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds}
   */
  public enum PoiCameraStepIds
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>ENTER = 1;</code>
     */
    ENTER(1),
    /**
     * <code>RETAKE = 2;</code>
     */
    RETAKE(2),
    /**
     * <code>CONFIRM = 3;</code>
     */
    CONFIRM(3),
    /**
     * <code>EXIT = 4;</code>
     */
    EXIT(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>ENTER = 1;</code>
     */
    public static final int ENTER_VALUE = 1;
    /**
     * <code>RETAKE = 2;</code>
     */
    public static final int RETAKE_VALUE = 2;
    /**
     * <code>CONFIRM = 3;</code>
     */
    public static final int CONFIRM_VALUE = 3;
    /**
     * <code>EXIT = 4;</code>
     */
    public static final int EXIT_VALUE = 4;


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
    public static PoiCameraStepIds valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PoiCameraStepIds forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return ENTER;
        case 2: return RETAKE;
        case 3: return CONFIRM;
        case 4: return EXIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PoiCameraStepIds>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PoiCameraStepIds> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PoiCameraStepIds>() {
            public PoiCameraStepIds findValueByNumber(int number) {
              return PoiCameraStepIds.forNumber(number);
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
      return POGOProtos.Rpc.TitanPoiSubmissionTelemetry.getDescriptor().getEnumTypes().get(0);
    }

    private static final PoiCameraStepIds[] VALUES = values();

    public static PoiCameraStepIds valueOf(
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

    private PoiCameraStepIds(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds)
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId}
   */
  public enum PoiSubmissionGuiEventId
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>POI_NOMINATION_ENTER = 1;</code>
     */
    POI_NOMINATION_ENTER(1),
    /**
     * <code>POI_TUTORIAL_COMPLETE = 2;</code>
     */
    POI_TUTORIAL_COMPLETE(2),
    /**
     * <code>POI_MAP_CHANGEDVIEW_MAP = 3;</code>
     */
    POI_MAP_CHANGEDVIEW_MAP(3),
    /**
     * <code>POI_MAP_CHANGEDVIEW_SATELLITE = 4;</code>
     */
    POI_MAP_CHANGEDVIEW_SATELLITE(4),
    /**
     * <code>POI_MAP_CENTER_LOCATION = 5;</code>
     */
    POI_MAP_CENTER_LOCATION(5),
    /**
     * <code>POI_LOCATION_SET = 6;</code>
     */
    POI_LOCATION_SET(6),
    /**
     * <code>POI_PHOTO_CAMERA_ENTER = 7;</code>
     */
    POI_PHOTO_CAMERA_ENTER(7),
    /**
     * <code>POI_PHOTO_CAMERA_EXIT = 8;</code>
     */
    POI_PHOTO_CAMERA_EXIT(8),
    /**
     * <code>POI_TITLE_ENTERED = 9;</code>
     */
    POI_TITLE_ENTERED(9),
    /**
     * <code>POI_DESCRIPTION_ENTER = 10;</code>
     */
    POI_DESCRIPTION_ENTER(10),
    /**
     * <code>POI_DETAILS_CONFIRM = 11;</code>
     */
    POI_DETAILS_CONFIRM(11),
    /**
     * <code>POI_SUPPORTINGINFO_ENTER = 12;</code>
     */
    POI_SUPPORTINGINFO_ENTER(12),
    /**
     * <code>POI_SUBMIT_BUTTON_HIT = 13;</code>
     */
    POI_SUBMIT_BUTTON_HIT(13),
    /**
     * <code>POI_EXIT_BUTTON_HIT = 14;</code>
     */
    POI_EXIT_BUTTON_HIT(14),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>POI_NOMINATION_ENTER = 1;</code>
     */
    public static final int POI_NOMINATION_ENTER_VALUE = 1;
    /**
     * <code>POI_TUTORIAL_COMPLETE = 2;</code>
     */
    public static final int POI_TUTORIAL_COMPLETE_VALUE = 2;
    /**
     * <code>POI_MAP_CHANGEDVIEW_MAP = 3;</code>
     */
    public static final int POI_MAP_CHANGEDVIEW_MAP_VALUE = 3;
    /**
     * <code>POI_MAP_CHANGEDVIEW_SATELLITE = 4;</code>
     */
    public static final int POI_MAP_CHANGEDVIEW_SATELLITE_VALUE = 4;
    /**
     * <code>POI_MAP_CENTER_LOCATION = 5;</code>
     */
    public static final int POI_MAP_CENTER_LOCATION_VALUE = 5;
    /**
     * <code>POI_LOCATION_SET = 6;</code>
     */
    public static final int POI_LOCATION_SET_VALUE = 6;
    /**
     * <code>POI_PHOTO_CAMERA_ENTER = 7;</code>
     */
    public static final int POI_PHOTO_CAMERA_ENTER_VALUE = 7;
    /**
     * <code>POI_PHOTO_CAMERA_EXIT = 8;</code>
     */
    public static final int POI_PHOTO_CAMERA_EXIT_VALUE = 8;
    /**
     * <code>POI_TITLE_ENTERED = 9;</code>
     */
    public static final int POI_TITLE_ENTERED_VALUE = 9;
    /**
     * <code>POI_DESCRIPTION_ENTER = 10;</code>
     */
    public static final int POI_DESCRIPTION_ENTER_VALUE = 10;
    /**
     * <code>POI_DETAILS_CONFIRM = 11;</code>
     */
    public static final int POI_DETAILS_CONFIRM_VALUE = 11;
    /**
     * <code>POI_SUPPORTINGINFO_ENTER = 12;</code>
     */
    public static final int POI_SUPPORTINGINFO_ENTER_VALUE = 12;
    /**
     * <code>POI_SUBMIT_BUTTON_HIT = 13;</code>
     */
    public static final int POI_SUBMIT_BUTTON_HIT_VALUE = 13;
    /**
     * <code>POI_EXIT_BUTTON_HIT = 14;</code>
     */
    public static final int POI_EXIT_BUTTON_HIT_VALUE = 14;


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
    public static PoiSubmissionGuiEventId valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PoiSubmissionGuiEventId forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return POI_NOMINATION_ENTER;
        case 2: return POI_TUTORIAL_COMPLETE;
        case 3: return POI_MAP_CHANGEDVIEW_MAP;
        case 4: return POI_MAP_CHANGEDVIEW_SATELLITE;
        case 5: return POI_MAP_CENTER_LOCATION;
        case 6: return POI_LOCATION_SET;
        case 7: return POI_PHOTO_CAMERA_ENTER;
        case 8: return POI_PHOTO_CAMERA_EXIT;
        case 9: return POI_TITLE_ENTERED;
        case 10: return POI_DESCRIPTION_ENTER;
        case 11: return POI_DETAILS_CONFIRM;
        case 12: return POI_SUPPORTINGINFO_ENTER;
        case 13: return POI_SUBMIT_BUTTON_HIT;
        case 14: return POI_EXIT_BUTTON_HIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PoiSubmissionGuiEventId>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PoiSubmissionGuiEventId> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PoiSubmissionGuiEventId>() {
            public PoiSubmissionGuiEventId findValueByNumber(int number) {
              return PoiSubmissionGuiEventId.forNumber(number);
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
      return POGOProtos.Rpc.TitanPoiSubmissionTelemetry.getDescriptor().getEnumTypes().get(1);
    }

    private static final PoiSubmissionGuiEventId[] VALUES = values();

    public static PoiSubmissionGuiEventId valueOf(
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

    private PoiSubmissionGuiEventId(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId)
  }

  public static final int GUI_EVENT_ID_FIELD_NUMBER = 1;
  private int guiEventId_;
  /**
   * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId gui_event_id = 1;</code>
   * @return The enum numeric value on the wire for guiEventId.
   */
  public int getGuiEventIdValue() {
    return guiEventId_;
  }
  /**
   * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId gui_event_id = 1;</code>
   * @return The guiEventId.
   */
  public POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId getGuiEventId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId result = POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId.valueOf(guiEventId_);
    return result == null ? POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId.UNRECOGNIZED : result;
  }

  public static final int IMAGE_TYPE_FIELD_NUMBER = 2;
  private int imageType_;
  /**
   * <code>.POGOProtos.Rpc.TitanPoiImageType image_type = 2;</code>
   * @return The enum numeric value on the wire for imageType.
   */
  public int getImageTypeValue() {
    return imageType_;
  }
  /**
   * <code>.POGOProtos.Rpc.TitanPoiImageType image_type = 2;</code>
   * @return The imageType.
   */
  public POGOProtos.Rpc.TitanPoiImageType getImageType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.TitanPoiImageType result = POGOProtos.Rpc.TitanPoiImageType.valueOf(imageType_);
    return result == null ? POGOProtos.Rpc.TitanPoiImageType.UNRECOGNIZED : result;
  }

  public static final int CAMERA_STEP_ID_FIELD_NUMBER = 3;
  private int cameraStepId_;
  /**
   * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds camera_step_id = 3;</code>
   * @return The enum numeric value on the wire for cameraStepId.
   */
  public int getCameraStepIdValue() {
    return cameraStepId_;
  }
  /**
   * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds camera_step_id = 3;</code>
   * @return The cameraStepId.
   */
  public POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds getCameraStepId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds result = POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds.valueOf(cameraStepId_);
    return result == null ? POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (guiEventId_ != POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId.UNKNOWN.getNumber()) {
      output.writeEnum(1, guiEventId_);
    }
    if (imageType_ != POGOProtos.Rpc.TitanPoiImageType.TITAN_POI_IMAGE_TYPE_UNSET.getNumber()) {
      output.writeEnum(2, imageType_);
    }
    if (cameraStepId_ != POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds.UNSET.getNumber()) {
      output.writeEnum(3, cameraStepId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (guiEventId_ != POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, guiEventId_);
    }
    if (imageType_ != POGOProtos.Rpc.TitanPoiImageType.TITAN_POI_IMAGE_TYPE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, imageType_);
    }
    if (cameraStepId_ != POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, cameraStepId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof POGOProtos.Rpc.TitanPoiSubmissionTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TitanPoiSubmissionTelemetry other = (POGOProtos.Rpc.TitanPoiSubmissionTelemetry) obj;

    if (guiEventId_ != other.guiEventId_) return false;
    if (imageType_ != other.imageType_) return false;
    if (cameraStepId_ != other.cameraStepId_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GUI_EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + guiEventId_;
    hash = (37 * hash) + IMAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + imageType_;
    hash = (37 * hash) + CAMERA_STEP_ID_FIELD_NUMBER;
    hash = (53 * hash) + cameraStepId_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(POGOProtos.Rpc.TitanPoiSubmissionTelemetry prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code POGOProtos.Rpc.TitanPoiSubmissionTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TitanPoiSubmissionTelemetry)
      POGOProtos.Rpc.TitanPoiSubmissionTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TitanPoiSubmissionTelemetry.class, POGOProtos.Rpc.TitanPoiSubmissionTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TitanPoiSubmissionTelemetry.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      guiEventId_ = 0;

      imageType_ = 0;

      cameraStepId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanPoiSubmissionTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.TitanPoiSubmissionTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanPoiSubmissionTelemetry build() {
      POGOProtos.Rpc.TitanPoiSubmissionTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanPoiSubmissionTelemetry buildPartial() {
      POGOProtos.Rpc.TitanPoiSubmissionTelemetry result = new POGOProtos.Rpc.TitanPoiSubmissionTelemetry(this);
      result.guiEventId_ = guiEventId_;
      result.imageType_ = imageType_;
      result.cameraStepId_ = cameraStepId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof POGOProtos.Rpc.TitanPoiSubmissionTelemetry) {
        return mergeFrom((POGOProtos.Rpc.TitanPoiSubmissionTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TitanPoiSubmissionTelemetry other) {
      if (other == POGOProtos.Rpc.TitanPoiSubmissionTelemetry.getDefaultInstance()) return this;
      if (other.guiEventId_ != 0) {
        setGuiEventIdValue(other.getGuiEventIdValue());
      }
      if (other.imageType_ != 0) {
        setImageTypeValue(other.getImageTypeValue());
      }
      if (other.cameraStepId_ != 0) {
        setCameraStepIdValue(other.getCameraStepIdValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      POGOProtos.Rpc.TitanPoiSubmissionTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TitanPoiSubmissionTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int guiEventId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId gui_event_id = 1;</code>
     * @return The enum numeric value on the wire for guiEventId.
     */
    public int getGuiEventIdValue() {
      return guiEventId_;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId gui_event_id = 1;</code>
     * @param value The enum numeric value on the wire for guiEventId to set.
     * @return This builder for chaining.
     */
    public Builder setGuiEventIdValue(int value) {
      guiEventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId gui_event_id = 1;</code>
     * @return The guiEventId.
     */
    public POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId getGuiEventId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId result = POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId.valueOf(guiEventId_);
      return result == null ? POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId gui_event_id = 1;</code>
     * @param value The guiEventId to set.
     * @return This builder for chaining.
     */
    public Builder setGuiEventId(POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      guiEventId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiSubmissionGuiEventId gui_event_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuiEventId() {
      
      guiEventId_ = 0;
      onChanged();
      return this;
    }

    private int imageType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.TitanPoiImageType image_type = 2;</code>
     * @return The enum numeric value on the wire for imageType.
     */
    public int getImageTypeValue() {
      return imageType_;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiImageType image_type = 2;</code>
     * @param value The enum numeric value on the wire for imageType to set.
     * @return This builder for chaining.
     */
    public Builder setImageTypeValue(int value) {
      imageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiImageType image_type = 2;</code>
     * @return The imageType.
     */
    public POGOProtos.Rpc.TitanPoiImageType getImageType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.TitanPoiImageType result = POGOProtos.Rpc.TitanPoiImageType.valueOf(imageType_);
      return result == null ? POGOProtos.Rpc.TitanPoiImageType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiImageType image_type = 2;</code>
     * @param value The imageType to set.
     * @return This builder for chaining.
     */
    public Builder setImageType(POGOProtos.Rpc.TitanPoiImageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      imageType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiImageType image_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageType() {
      
      imageType_ = 0;
      onChanged();
      return this;
    }

    private int cameraStepId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds camera_step_id = 3;</code>
     * @return The enum numeric value on the wire for cameraStepId.
     */
    public int getCameraStepIdValue() {
      return cameraStepId_;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds camera_step_id = 3;</code>
     * @param value The enum numeric value on the wire for cameraStepId to set.
     * @return This builder for chaining.
     */
    public Builder setCameraStepIdValue(int value) {
      cameraStepId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds camera_step_id = 3;</code>
     * @return The cameraStepId.
     */
    public POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds getCameraStepId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds result = POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds.valueOf(cameraStepId_);
      return result == null ? POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds camera_step_id = 3;</code>
     * @param value The cameraStepId to set.
     * @return This builder for chaining.
     */
    public Builder setCameraStepId(POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cameraStepId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionTelemetry.PoiCameraStepIds camera_step_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCameraStepId() {
      
      cameraStepId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TitanPoiSubmissionTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TitanPoiSubmissionTelemetry)
  private static final POGOProtos.Rpc.TitanPoiSubmissionTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TitanPoiSubmissionTelemetry();
  }

  public static POGOProtos.Rpc.TitanPoiSubmissionTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TitanPoiSubmissionTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<TitanPoiSubmissionTelemetry>() {
    @java.lang.Override
    public TitanPoiSubmissionTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TitanPoiSubmissionTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TitanPoiSubmissionTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TitanPoiSubmissionTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TitanPoiSubmissionTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

