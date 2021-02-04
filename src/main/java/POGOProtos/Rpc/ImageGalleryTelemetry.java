// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ImageGalleryTelemetry}
 */
public final class ImageGalleryTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ImageGalleryTelemetry)
    ImageGalleryTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageGalleryTelemetry.newBuilder() to construct.
  private ImageGalleryTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageGalleryTelemetry() {
    imageGalleryTelemetryId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageGalleryTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImageGalleryTelemetry(
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

            imageGalleryTelemetryId_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ImageGalleryTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ImageGalleryTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ImageGalleryTelemetry.class, POGOProtos.Rpc.ImageGalleryTelemetry.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId}
   */
  public enum ImageGalleryEventId
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>ENTER_IMAGE_GALLERY = 1;</code>
     */
    ENTER_IMAGE_GALLERY(1),
    /**
     * <code>ENTER_IMAGE_DETAILS_PAGE = 2;</code>
     */
    ENTER_IMAGE_DETAILS_PAGE(2),
    /**
     * <code>VOTE_FROM_MAIN_GALLERY_PAGE = 3;</code>
     */
    VOTE_FROM_MAIN_GALLERY_PAGE(3),
    /**
     * <code>UNVOTE_FROM_MAIN_GALLERY_PAGE = 4;</code>
     */
    UNVOTE_FROM_MAIN_GALLERY_PAGE(4),
    /**
     * <code>VOTE_FROM_IMAGE_DETAILS_PAGE = 5;</code>
     */
    VOTE_FROM_IMAGE_DETAILS_PAGE(5),
    /**
     * <code>UNVOTE_FROM_IMAGE_DETAILS_PAGE = 6;</code>
     */
    UNVOTE_FROM_IMAGE_DETAILS_PAGE(6),
    /**
     * <code>ENTER_IMAGE_EDIT_FROM_GALLERY = 7;</code>
     */
    ENTER_IMAGE_EDIT_FROM_GALLERY(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>ENTER_IMAGE_GALLERY = 1;</code>
     */
    public static final int ENTER_IMAGE_GALLERY_VALUE = 1;
    /**
     * <code>ENTER_IMAGE_DETAILS_PAGE = 2;</code>
     */
    public static final int ENTER_IMAGE_DETAILS_PAGE_VALUE = 2;
    /**
     * <code>VOTE_FROM_MAIN_GALLERY_PAGE = 3;</code>
     */
    public static final int VOTE_FROM_MAIN_GALLERY_PAGE_VALUE = 3;
    /**
     * <code>UNVOTE_FROM_MAIN_GALLERY_PAGE = 4;</code>
     */
    public static final int UNVOTE_FROM_MAIN_GALLERY_PAGE_VALUE = 4;
    /**
     * <code>VOTE_FROM_IMAGE_DETAILS_PAGE = 5;</code>
     */
    public static final int VOTE_FROM_IMAGE_DETAILS_PAGE_VALUE = 5;
    /**
     * <code>UNVOTE_FROM_IMAGE_DETAILS_PAGE = 6;</code>
     */
    public static final int UNVOTE_FROM_IMAGE_DETAILS_PAGE_VALUE = 6;
    /**
     * <code>ENTER_IMAGE_EDIT_FROM_GALLERY = 7;</code>
     */
    public static final int ENTER_IMAGE_EDIT_FROM_GALLERY_VALUE = 7;


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
    public static ImageGalleryEventId valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ImageGalleryEventId forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return ENTER_IMAGE_GALLERY;
        case 2: return ENTER_IMAGE_DETAILS_PAGE;
        case 3: return VOTE_FROM_MAIN_GALLERY_PAGE;
        case 4: return UNVOTE_FROM_MAIN_GALLERY_PAGE;
        case 5: return VOTE_FROM_IMAGE_DETAILS_PAGE;
        case 6: return UNVOTE_FROM_IMAGE_DETAILS_PAGE;
        case 7: return ENTER_IMAGE_EDIT_FROM_GALLERY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ImageGalleryEventId>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ImageGalleryEventId> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ImageGalleryEventId>() {
            public ImageGalleryEventId findValueByNumber(int number) {
              return ImageGalleryEventId.forNumber(number);
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
      return POGOProtos.Rpc.ImageGalleryTelemetry.getDescriptor().getEnumTypes().get(0);
    }

    private static final ImageGalleryEventId[] VALUES = values();

    public static ImageGalleryEventId valueOf(
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

    private ImageGalleryEventId(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId)
  }

  public static final int IMAGE_GALLERY_TELEMETRY_ID_FIELD_NUMBER = 1;
  private int imageGalleryTelemetryId_;
  /**
   * <code>.POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId image_gallery_telemetry_id = 1;</code>
   * @return The enum numeric value on the wire for imageGalleryTelemetryId.
   */
  @java.lang.Override public int getImageGalleryTelemetryIdValue() {
    return imageGalleryTelemetryId_;
  }
  /**
   * <code>.POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId image_gallery_telemetry_id = 1;</code>
   * @return The imageGalleryTelemetryId.
   */
  @java.lang.Override public POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId getImageGalleryTelemetryId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId result = POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId.valueOf(imageGalleryTelemetryId_);
    return result == null ? POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId.UNRECOGNIZED : result;
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
    if (imageGalleryTelemetryId_ != POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId.UNKNOWN.getNumber()) {
      output.writeEnum(1, imageGalleryTelemetryId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (imageGalleryTelemetryId_ != POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, imageGalleryTelemetryId_);
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
    if (!(obj instanceof POGOProtos.Rpc.ImageGalleryTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ImageGalleryTelemetry other = (POGOProtos.Rpc.ImageGalleryTelemetry) obj;

    if (imageGalleryTelemetryId_ != other.imageGalleryTelemetryId_) return false;
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
    hash = (37 * hash) + IMAGE_GALLERY_TELEMETRY_ID_FIELD_NUMBER;
    hash = (53 * hash) + imageGalleryTelemetryId_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ImageGalleryTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ImageGalleryTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ImageGalleryTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ImageGalleryTelemetry)
      POGOProtos.Rpc.ImageGalleryTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ImageGalleryTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ImageGalleryTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ImageGalleryTelemetry.class, POGOProtos.Rpc.ImageGalleryTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ImageGalleryTelemetry.newBuilder()
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
      imageGalleryTelemetryId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ImageGalleryTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ImageGalleryTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.ImageGalleryTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ImageGalleryTelemetry build() {
      POGOProtos.Rpc.ImageGalleryTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ImageGalleryTelemetry buildPartial() {
      POGOProtos.Rpc.ImageGalleryTelemetry result = new POGOProtos.Rpc.ImageGalleryTelemetry(this);
      result.imageGalleryTelemetryId_ = imageGalleryTelemetryId_;
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
      if (other instanceof POGOProtos.Rpc.ImageGalleryTelemetry) {
        return mergeFrom((POGOProtos.Rpc.ImageGalleryTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ImageGalleryTelemetry other) {
      if (other == POGOProtos.Rpc.ImageGalleryTelemetry.getDefaultInstance()) return this;
      if (other.imageGalleryTelemetryId_ != 0) {
        setImageGalleryTelemetryIdValue(other.getImageGalleryTelemetryIdValue());
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
      POGOProtos.Rpc.ImageGalleryTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ImageGalleryTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int imageGalleryTelemetryId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId image_gallery_telemetry_id = 1;</code>
     * @return The enum numeric value on the wire for imageGalleryTelemetryId.
     */
    @java.lang.Override public int getImageGalleryTelemetryIdValue() {
      return imageGalleryTelemetryId_;
    }
    /**
     * <code>.POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId image_gallery_telemetry_id = 1;</code>
     * @param value The enum numeric value on the wire for imageGalleryTelemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setImageGalleryTelemetryIdValue(int value) {
      
      imageGalleryTelemetryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId image_gallery_telemetry_id = 1;</code>
     * @return The imageGalleryTelemetryId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId getImageGalleryTelemetryId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId result = POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId.valueOf(imageGalleryTelemetryId_);
      return result == null ? POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId image_gallery_telemetry_id = 1;</code>
     * @param value The imageGalleryTelemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setImageGalleryTelemetryId(POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      imageGalleryTelemetryId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ImageGalleryTelemetry.ImageGalleryEventId image_gallery_telemetry_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageGalleryTelemetryId() {
      
      imageGalleryTelemetryId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ImageGalleryTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ImageGalleryTelemetry)
  private static final POGOProtos.Rpc.ImageGalleryTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ImageGalleryTelemetry();
  }

  public static POGOProtos.Rpc.ImageGalleryTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageGalleryTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<ImageGalleryTelemetry>() {
    @java.lang.Override
    public ImageGalleryTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImageGalleryTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImageGalleryTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageGalleryTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ImageGalleryTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

