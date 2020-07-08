// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Sticker/RedeemedSticker.proto

package POGOProtos.Data.Sticker;

/**
 * Protobuf type {@code POGOProtos.Data.Sticker.RedeemedSticker}
 */
public  final class RedeemedSticker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Sticker.RedeemedSticker)
    RedeemedStickerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RedeemedSticker.newBuilder() to construct.
  private RedeemedSticker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RedeemedSticker() {
    stickerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RedeemedSticker();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RedeemedSticker(
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
            java.lang.String s = input.readStringRequireUtf8();

            stickerId_ = s;
            break;
          }
          case 16: {

            count_ = input.readInt32();
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
    return POGOProtos.Data.Sticker.RedeemedStickerOuterClass.internal_static_POGOProtos_Data_Sticker_RedeemedSticker_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Sticker.RedeemedStickerOuterClass.internal_static_POGOProtos_Data_Sticker_RedeemedSticker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Sticker.RedeemedSticker.class, POGOProtos.Data.Sticker.RedeemedSticker.Builder.class);
  }

  public static final int STICKER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object stickerId_;
  /**
   * <code>string sticker_id = 1;</code>
   * @return The stickerId.
   */
  public java.lang.String getStickerId() {
    java.lang.Object ref = stickerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stickerId_ = s;
      return s;
    }
  }
  /**
   * <code>string sticker_id = 1;</code>
   * @return The bytes for stickerId.
   */
  public com.google.protobuf.ByteString
      getStickerIdBytes() {
    java.lang.Object ref = stickerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stickerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  public int getCount() {
    return count_;
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
    if (!getStickerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stickerId_);
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStickerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, stickerId_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
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
    if (!(obj instanceof POGOProtos.Data.Sticker.RedeemedSticker)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Sticker.RedeemedSticker other = (POGOProtos.Data.Sticker.RedeemedSticker) obj;

    if (!getStickerId()
        .equals(other.getStickerId())) return false;
    if (getCount()
        != other.getCount()) return false;
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
    hash = (37 * hash) + STICKER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStickerId().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Sticker.RedeemedSticker parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Sticker.RedeemedSticker prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Sticker.RedeemedSticker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Sticker.RedeemedSticker)
      POGOProtos.Data.Sticker.RedeemedStickerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Sticker.RedeemedStickerOuterClass.internal_static_POGOProtos_Data_Sticker_RedeemedSticker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Sticker.RedeemedStickerOuterClass.internal_static_POGOProtos_Data_Sticker_RedeemedSticker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Sticker.RedeemedSticker.class, POGOProtos.Data.Sticker.RedeemedSticker.Builder.class);
    }

    // Construct using POGOProtos.Data.Sticker.RedeemedSticker.newBuilder()
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
      stickerId_ = "";

      count_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Sticker.RedeemedStickerOuterClass.internal_static_POGOProtos_Data_Sticker_RedeemedSticker_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Sticker.RedeemedSticker getDefaultInstanceForType() {
      return POGOProtos.Data.Sticker.RedeemedSticker.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Sticker.RedeemedSticker build() {
      POGOProtos.Data.Sticker.RedeemedSticker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Sticker.RedeemedSticker buildPartial() {
      POGOProtos.Data.Sticker.RedeemedSticker result = new POGOProtos.Data.Sticker.RedeemedSticker(this);
      result.stickerId_ = stickerId_;
      result.count_ = count_;
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
      if (other instanceof POGOProtos.Data.Sticker.RedeemedSticker) {
        return mergeFrom((POGOProtos.Data.Sticker.RedeemedSticker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Sticker.RedeemedSticker other) {
      if (other == POGOProtos.Data.Sticker.RedeemedSticker.getDefaultInstance()) return this;
      if (!other.getStickerId().isEmpty()) {
        stickerId_ = other.stickerId_;
        onChanged();
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
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
      POGOProtos.Data.Sticker.RedeemedSticker parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Sticker.RedeemedSticker) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object stickerId_ = "";
    /**
     * <code>string sticker_id = 1;</code>
     * @return The stickerId.
     */
    public java.lang.String getStickerId() {
      java.lang.Object ref = stickerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stickerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sticker_id = 1;</code>
     * @return The bytes for stickerId.
     */
    public com.google.protobuf.ByteString
        getStickerIdBytes() {
      java.lang.Object ref = stickerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stickerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sticker_id = 1;</code>
     * @param value The stickerId to set.
     * @return This builder for chaining.
     */
    public Builder setStickerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stickerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sticker_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStickerId() {
      
      stickerId_ = getDefaultInstance().getStickerId();
      onChanged();
      return this;
    }
    /**
     * <code>string sticker_id = 1;</code>
     * @param value The bytes for stickerId to set.
     * @return This builder for chaining.
     */
    public Builder setStickerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stickerId_ = value;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>int32 count = 2;</code>
     * @return The count.
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      
      count_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Sticker.RedeemedSticker)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Sticker.RedeemedSticker)
  private static final POGOProtos.Data.Sticker.RedeemedSticker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Sticker.RedeemedSticker();
  }

  public static POGOProtos.Data.Sticker.RedeemedSticker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RedeemedSticker>
      PARSER = new com.google.protobuf.AbstractParser<RedeemedSticker>() {
    @java.lang.Override
    public RedeemedSticker parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RedeemedSticker(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RedeemedSticker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RedeemedSticker> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Sticker.RedeemedSticker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
