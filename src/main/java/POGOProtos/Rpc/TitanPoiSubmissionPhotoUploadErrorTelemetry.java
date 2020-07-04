// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry}
 */
public  final class TitanPoiSubmissionPhotoUploadErrorTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry)
    TitanPoiSubmissionPhotoUploadErrorTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TitanPoiSubmissionPhotoUploadErrorTelemetry.newBuilder() to construct.
  private TitanPoiSubmissionPhotoUploadErrorTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TitanPoiSubmissionPhotoUploadErrorTelemetry() {
    errorId_ = 0;
    imageType_ = 0;
    errorMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TitanPoiSubmissionPhotoUploadErrorTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TitanPoiSubmissionPhotoUploadErrorTelemetry(
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

            errorId_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            imageType_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionPhotoUploadErrorTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionPhotoUploadErrorTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.class, POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds}
   */
  public enum PoiSubmissionPhotoUploadErrorIds
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>POI_PHOTO_UPLOAD_ERROR = 1;</code>
     */
    POI_PHOTO_UPLOAD_ERROR(1),
    /**
     * <code>POI_PHOTO_UPLOAD_TIMEOUT = 2;</code>
     */
    POI_PHOTO_UPLOAD_TIMEOUT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>POI_PHOTO_UPLOAD_ERROR = 1;</code>
     */
    public static final int POI_PHOTO_UPLOAD_ERROR_VALUE = 1;
    /**
     * <code>POI_PHOTO_UPLOAD_TIMEOUT = 2;</code>
     */
    public static final int POI_PHOTO_UPLOAD_TIMEOUT_VALUE = 2;


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
    public static PoiSubmissionPhotoUploadErrorIds valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PoiSubmissionPhotoUploadErrorIds forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return POI_PHOTO_UPLOAD_ERROR;
        case 2: return POI_PHOTO_UPLOAD_TIMEOUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PoiSubmissionPhotoUploadErrorIds>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PoiSubmissionPhotoUploadErrorIds> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PoiSubmissionPhotoUploadErrorIds>() {
            public PoiSubmissionPhotoUploadErrorIds findValueByNumber(int number) {
              return PoiSubmissionPhotoUploadErrorIds.forNumber(number);
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
      return POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.getDescriptor().getEnumTypes().get(0);
    }

    private static final PoiSubmissionPhotoUploadErrorIds[] VALUES = values();

    public static PoiSubmissionPhotoUploadErrorIds valueOf(
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

    private PoiSubmissionPhotoUploadErrorIds(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds)
  }

  public static final int ERROR_ID_FIELD_NUMBER = 1;
  private int errorId_;
  /**
   * <code>.POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds error_id = 1;</code>
   * @return The enum numeric value on the wire for errorId.
   */
  public int getErrorIdValue() {
    return errorId_;
  }
  /**
   * <code>.POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds error_id = 1;</code>
   * @return The errorId.
   */
  public POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds getErrorId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds result = POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds.valueOf(errorId_);
    return result == null ? POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds.UNRECOGNIZED : result;
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

  public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>string error_message = 3;</code>
   * @return The errorMessage.
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string error_message = 3;</code>
   * @return The bytes for errorMessage.
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (errorId_ != POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds.UNSET.getNumber()) {
      output.writeEnum(1, errorId_);
    }
    if (imageType_ != POGOProtos.Rpc.TitanPoiImageType.TITAN_POI_IMAGE_TYPE_UNSET.getNumber()) {
      output.writeEnum(2, imageType_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorId_ != POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, errorId_);
    }
    if (imageType_ != POGOProtos.Rpc.TitanPoiImageType.TITAN_POI_IMAGE_TYPE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, imageType_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorMessage_);
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
    if (!(obj instanceof POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry other = (POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry) obj;

    if (errorId_ != other.errorId_) return false;
    if (imageType_ != other.imageType_) return false;
    if (!getErrorMessage()
        .equals(other.getErrorMessage())) return false;
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
    hash = (37 * hash) + ERROR_ID_FIELD_NUMBER;
    hash = (53 * hash) + errorId_;
    hash = (37 * hash) + IMAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + imageType_;
    hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry)
      POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionPhotoUploadErrorTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionPhotoUploadErrorTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.class, POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.newBuilder()
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
      errorId_ = 0;

      imageType_ = 0;

      errorMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanPoiSubmissionPhotoUploadErrorTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry build() {
      POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry buildPartial() {
      POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry result = new POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry(this);
      result.errorId_ = errorId_;
      result.imageType_ = imageType_;
      result.errorMessage_ = errorMessage_;
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
      if (other instanceof POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry) {
        return mergeFrom((POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry other) {
      if (other == POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.getDefaultInstance()) return this;
      if (other.errorId_ != 0) {
        setErrorIdValue(other.getErrorIdValue());
      }
      if (other.imageType_ != 0) {
        setImageTypeValue(other.getImageTypeValue());
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
        onChanged();
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
      POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int errorId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds error_id = 1;</code>
     * @return The enum numeric value on the wire for errorId.
     */
    public int getErrorIdValue() {
      return errorId_;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds error_id = 1;</code>
     * @param value The enum numeric value on the wire for errorId to set.
     * @return This builder for chaining.
     */
    public Builder setErrorIdValue(int value) {
      errorId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds error_id = 1;</code>
     * @return The errorId.
     */
    public POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds getErrorId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds result = POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds.valueOf(errorId_);
      return result == null ? POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds error_id = 1;</code>
     * @param value The errorId to set.
     * @return This builder for chaining.
     */
    public Builder setErrorId(POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      errorId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry.PoiSubmissionPhotoUploadErrorIds error_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorId() {
      
      errorId_ = 0;
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

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>string error_message = 3;</code>
     * @return The errorMessage.
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error_message = 3;</code>
     * @return The bytes for errorMessage.
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error_message = 3;</code>
     * @param value The errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error_message = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string error_message = 3;</code>
     * @param value The bytes for errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry)
  private static final POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry();
  }

  public static POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TitanPoiSubmissionPhotoUploadErrorTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<TitanPoiSubmissionPhotoUploadErrorTelemetry>() {
    @java.lang.Override
    public TitanPoiSubmissionPhotoUploadErrorTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TitanPoiSubmissionPhotoUploadErrorTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TitanPoiSubmissionPhotoUploadErrorTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TitanPoiSubmissionPhotoUploadErrorTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TitanPoiSubmissionPhotoUploadErrorTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

