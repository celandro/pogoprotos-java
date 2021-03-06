// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AdDetails}
 */
public final class AdDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AdDetails)
    AdDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdDetails.newBuilder() to construct.
  private AdDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdDetails() {
    encryptedAdToken_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdDetails(
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
          case 10: {
            POGOProtos.Rpc.ImageTextCreativeProto.Builder subBuilder = null;
            if (imageTextCreative_ != null) {
              subBuilder = imageTextCreative_.toBuilder();
            }
            imageTextCreative_ = input.readMessage(POGOProtos.Rpc.ImageTextCreativeProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(imageTextCreative_);
              imageTextCreative_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            encryptedAdToken_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AdDetails.class, POGOProtos.Rpc.AdDetails.Builder.class);
  }

  public static final int IMAGE_TEXT_CREATIVE_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.ImageTextCreativeProto imageTextCreative_;
  /**
   * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
   * @return Whether the imageTextCreative field is set.
   */
  @java.lang.Override
  public boolean hasImageTextCreative() {
    return imageTextCreative_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
   * @return The imageTextCreative.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ImageTextCreativeProto getImageTextCreative() {
    return imageTextCreative_ == null ? POGOProtos.Rpc.ImageTextCreativeProto.getDefaultInstance() : imageTextCreative_;
  }
  /**
   * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ImageTextCreativeProtoOrBuilder getImageTextCreativeOrBuilder() {
    return getImageTextCreative();
  }

  public static final int ENCRYPTED_AD_TOKEN_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString encryptedAdToken_;
  /**
   * <code>bytes encrypted_ad_token = 2;</code>
   * @return The encryptedAdToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEncryptedAdToken() {
    return encryptedAdToken_;
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
    if (imageTextCreative_ != null) {
      output.writeMessage(1, getImageTextCreative());
    }
    if (!encryptedAdToken_.isEmpty()) {
      output.writeBytes(2, encryptedAdToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (imageTextCreative_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getImageTextCreative());
    }
    if (!encryptedAdToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, encryptedAdToken_);
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
    if (!(obj instanceof POGOProtos.Rpc.AdDetails)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AdDetails other = (POGOProtos.Rpc.AdDetails) obj;

    if (hasImageTextCreative() != other.hasImageTextCreative()) return false;
    if (hasImageTextCreative()) {
      if (!getImageTextCreative()
          .equals(other.getImageTextCreative())) return false;
    }
    if (!getEncryptedAdToken()
        .equals(other.getEncryptedAdToken())) return false;
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
    if (hasImageTextCreative()) {
      hash = (37 * hash) + IMAGE_TEXT_CREATIVE_FIELD_NUMBER;
      hash = (53 * hash) + getImageTextCreative().hashCode();
    }
    hash = (37 * hash) + ENCRYPTED_AD_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getEncryptedAdToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AdDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AdDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AdDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AdDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AdDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AdDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AdDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AdDetails parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AdDetails prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AdDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AdDetails)
      POGOProtos.Rpc.AdDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AdDetails.class, POGOProtos.Rpc.AdDetails.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AdDetails.newBuilder()
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
      if (imageTextCreativeBuilder_ == null) {
        imageTextCreative_ = null;
      } else {
        imageTextCreative_ = null;
        imageTextCreativeBuilder_ = null;
      }
      encryptedAdToken_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AdDetails_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AdDetails getDefaultInstanceForType() {
      return POGOProtos.Rpc.AdDetails.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AdDetails build() {
      POGOProtos.Rpc.AdDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AdDetails buildPartial() {
      POGOProtos.Rpc.AdDetails result = new POGOProtos.Rpc.AdDetails(this);
      if (imageTextCreativeBuilder_ == null) {
        result.imageTextCreative_ = imageTextCreative_;
      } else {
        result.imageTextCreative_ = imageTextCreativeBuilder_.build();
      }
      result.encryptedAdToken_ = encryptedAdToken_;
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
      if (other instanceof POGOProtos.Rpc.AdDetails) {
        return mergeFrom((POGOProtos.Rpc.AdDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AdDetails other) {
      if (other == POGOProtos.Rpc.AdDetails.getDefaultInstance()) return this;
      if (other.hasImageTextCreative()) {
        mergeImageTextCreative(other.getImageTextCreative());
      }
      if (other.getEncryptedAdToken() != com.google.protobuf.ByteString.EMPTY) {
        setEncryptedAdToken(other.getEncryptedAdToken());
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
      POGOProtos.Rpc.AdDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AdDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.ImageTextCreativeProto imageTextCreative_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ImageTextCreativeProto, POGOProtos.Rpc.ImageTextCreativeProto.Builder, POGOProtos.Rpc.ImageTextCreativeProtoOrBuilder> imageTextCreativeBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
     * @return Whether the imageTextCreative field is set.
     */
    public boolean hasImageTextCreative() {
      return imageTextCreativeBuilder_ != null || imageTextCreative_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
     * @return The imageTextCreative.
     */
    public POGOProtos.Rpc.ImageTextCreativeProto getImageTextCreative() {
      if (imageTextCreativeBuilder_ == null) {
        return imageTextCreative_ == null ? POGOProtos.Rpc.ImageTextCreativeProto.getDefaultInstance() : imageTextCreative_;
      } else {
        return imageTextCreativeBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
     */
    public Builder setImageTextCreative(POGOProtos.Rpc.ImageTextCreativeProto value) {
      if (imageTextCreativeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        imageTextCreative_ = value;
        onChanged();
      } else {
        imageTextCreativeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
     */
    public Builder setImageTextCreative(
        POGOProtos.Rpc.ImageTextCreativeProto.Builder builderForValue) {
      if (imageTextCreativeBuilder_ == null) {
        imageTextCreative_ = builderForValue.build();
        onChanged();
      } else {
        imageTextCreativeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
     */
    public Builder mergeImageTextCreative(POGOProtos.Rpc.ImageTextCreativeProto value) {
      if (imageTextCreativeBuilder_ == null) {
        if (imageTextCreative_ != null) {
          imageTextCreative_ =
            POGOProtos.Rpc.ImageTextCreativeProto.newBuilder(imageTextCreative_).mergeFrom(value).buildPartial();
        } else {
          imageTextCreative_ = value;
        }
        onChanged();
      } else {
        imageTextCreativeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
     */
    public Builder clearImageTextCreative() {
      if (imageTextCreativeBuilder_ == null) {
        imageTextCreative_ = null;
        onChanged();
      } else {
        imageTextCreative_ = null;
        imageTextCreativeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
     */
    public POGOProtos.Rpc.ImageTextCreativeProto.Builder getImageTextCreativeBuilder() {
      
      onChanged();
      return getImageTextCreativeFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
     */
    public POGOProtos.Rpc.ImageTextCreativeProtoOrBuilder getImageTextCreativeOrBuilder() {
      if (imageTextCreativeBuilder_ != null) {
        return imageTextCreativeBuilder_.getMessageOrBuilder();
      } else {
        return imageTextCreative_ == null ?
            POGOProtos.Rpc.ImageTextCreativeProto.getDefaultInstance() : imageTextCreative_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ImageTextCreativeProto image_text_creative = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ImageTextCreativeProto, POGOProtos.Rpc.ImageTextCreativeProto.Builder, POGOProtos.Rpc.ImageTextCreativeProtoOrBuilder> 
        getImageTextCreativeFieldBuilder() {
      if (imageTextCreativeBuilder_ == null) {
        imageTextCreativeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ImageTextCreativeProto, POGOProtos.Rpc.ImageTextCreativeProto.Builder, POGOProtos.Rpc.ImageTextCreativeProtoOrBuilder>(
                getImageTextCreative(),
                getParentForChildren(),
                isClean());
        imageTextCreative_ = null;
      }
      return imageTextCreativeBuilder_;
    }

    private com.google.protobuf.ByteString encryptedAdToken_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes encrypted_ad_token = 2;</code>
     * @return The encryptedAdToken.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEncryptedAdToken() {
      return encryptedAdToken_;
    }
    /**
     * <code>bytes encrypted_ad_token = 2;</code>
     * @param value The encryptedAdToken to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptedAdToken(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encryptedAdToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes encrypted_ad_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncryptedAdToken() {
      
      encryptedAdToken_ = getDefaultInstance().getEncryptedAdToken();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AdDetails)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AdDetails)
  private static final POGOProtos.Rpc.AdDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AdDetails();
  }

  public static POGOProtos.Rpc.AdDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdDetails>
      PARSER = new com.google.protobuf.AbstractParser<AdDetails>() {
    @java.lang.Override
    public AdDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AdDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

