// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Badge/BadgeCaptureReward.proto

package POGOProtos.Data.Badge;

/**
 * Protobuf type {@code POGOProtos.Data.Badge.BadgeCaptureReward}
 */
public  final class BadgeCaptureReward extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Badge.BadgeCaptureReward)
    BadgeCaptureRewardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BadgeCaptureReward.newBuilder() to construct.
  private BadgeCaptureReward(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BadgeCaptureReward() {
    avatarTemplateIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BadgeCaptureReward();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BadgeCaptureReward(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 13: {

            captureRewardMultiplier_ = input.readFloat();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              avatarTemplateIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            avatarTemplateIds_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        avatarTemplateIds_ = avatarTemplateIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Data.Badge.BadgeCaptureRewardOuterClass.internal_static_POGOProtos_Data_Badge_BadgeCaptureReward_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Badge.BadgeCaptureRewardOuterClass.internal_static_POGOProtos_Data_Badge_BadgeCaptureReward_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Badge.BadgeCaptureReward.class, POGOProtos.Data.Badge.BadgeCaptureReward.Builder.class);
  }

  public static final int CAPTURE_REWARD_MULTIPLIER_FIELD_NUMBER = 1;
  private float captureRewardMultiplier_;
  /**
   * <code>float capture_reward_multiplier = 1;</code>
   * @return The captureRewardMultiplier.
   */
  public float getCaptureRewardMultiplier() {
    return captureRewardMultiplier_;
  }

  public static final int AVATAR_TEMPLATE_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList avatarTemplateIds_;
  /**
   * <code>repeated string avatar_template_ids = 2;</code>
   * @return A list containing the avatarTemplateIds.
   */
  public com.google.protobuf.ProtocolStringList
      getAvatarTemplateIdsList() {
    return avatarTemplateIds_;
  }
  /**
   * <code>repeated string avatar_template_ids = 2;</code>
   * @return The count of avatarTemplateIds.
   */
  public int getAvatarTemplateIdsCount() {
    return avatarTemplateIds_.size();
  }
  /**
   * <code>repeated string avatar_template_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The avatarTemplateIds at the given index.
   */
  public java.lang.String getAvatarTemplateIds(int index) {
    return avatarTemplateIds_.get(index);
  }
  /**
   * <code>repeated string avatar_template_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the avatarTemplateIds at the given index.
   */
  public com.google.protobuf.ByteString
      getAvatarTemplateIdsBytes(int index) {
    return avatarTemplateIds_.getByteString(index);
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
    if (captureRewardMultiplier_ != 0F) {
      output.writeFloat(1, captureRewardMultiplier_);
    }
    for (int i = 0; i < avatarTemplateIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, avatarTemplateIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (captureRewardMultiplier_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, captureRewardMultiplier_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < avatarTemplateIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(avatarTemplateIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAvatarTemplateIdsList().size();
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
    if (!(obj instanceof POGOProtos.Data.Badge.BadgeCaptureReward)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Badge.BadgeCaptureReward other = (POGOProtos.Data.Badge.BadgeCaptureReward) obj;

    if (java.lang.Float.floatToIntBits(getCaptureRewardMultiplier())
        != java.lang.Float.floatToIntBits(
            other.getCaptureRewardMultiplier())) return false;
    if (!getAvatarTemplateIdsList()
        .equals(other.getAvatarTemplateIdsList())) return false;
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
    hash = (37 * hash) + CAPTURE_REWARD_MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCaptureRewardMultiplier());
    if (getAvatarTemplateIdsCount() > 0) {
      hash = (37 * hash) + AVATAR_TEMPLATE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarTemplateIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Badge.BadgeCaptureReward parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Badge.BadgeCaptureReward prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Badge.BadgeCaptureReward}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Badge.BadgeCaptureReward)
      POGOProtos.Data.Badge.BadgeCaptureRewardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Badge.BadgeCaptureRewardOuterClass.internal_static_POGOProtos_Data_Badge_BadgeCaptureReward_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Badge.BadgeCaptureRewardOuterClass.internal_static_POGOProtos_Data_Badge_BadgeCaptureReward_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Badge.BadgeCaptureReward.class, POGOProtos.Data.Badge.BadgeCaptureReward.Builder.class);
    }

    // Construct using POGOProtos.Data.Badge.BadgeCaptureReward.newBuilder()
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
      captureRewardMultiplier_ = 0F;

      avatarTemplateIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Badge.BadgeCaptureRewardOuterClass.internal_static_POGOProtos_Data_Badge_BadgeCaptureReward_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Badge.BadgeCaptureReward getDefaultInstanceForType() {
      return POGOProtos.Data.Badge.BadgeCaptureReward.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Badge.BadgeCaptureReward build() {
      POGOProtos.Data.Badge.BadgeCaptureReward result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Badge.BadgeCaptureReward buildPartial() {
      POGOProtos.Data.Badge.BadgeCaptureReward result = new POGOProtos.Data.Badge.BadgeCaptureReward(this);
      int from_bitField0_ = bitField0_;
      result.captureRewardMultiplier_ = captureRewardMultiplier_;
      if (((bitField0_ & 0x00000001) != 0)) {
        avatarTemplateIds_ = avatarTemplateIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.avatarTemplateIds_ = avatarTemplateIds_;
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
      if (other instanceof POGOProtos.Data.Badge.BadgeCaptureReward) {
        return mergeFrom((POGOProtos.Data.Badge.BadgeCaptureReward)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Badge.BadgeCaptureReward other) {
      if (other == POGOProtos.Data.Badge.BadgeCaptureReward.getDefaultInstance()) return this;
      if (other.getCaptureRewardMultiplier() != 0F) {
        setCaptureRewardMultiplier(other.getCaptureRewardMultiplier());
      }
      if (!other.avatarTemplateIds_.isEmpty()) {
        if (avatarTemplateIds_.isEmpty()) {
          avatarTemplateIds_ = other.avatarTemplateIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAvatarTemplateIdsIsMutable();
          avatarTemplateIds_.addAll(other.avatarTemplateIds_);
        }
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
      POGOProtos.Data.Badge.BadgeCaptureReward parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Badge.BadgeCaptureReward) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private float captureRewardMultiplier_ ;
    /**
     * <code>float capture_reward_multiplier = 1;</code>
     * @return The captureRewardMultiplier.
     */
    public float getCaptureRewardMultiplier() {
      return captureRewardMultiplier_;
    }
    /**
     * <code>float capture_reward_multiplier = 1;</code>
     * @param value The captureRewardMultiplier to set.
     * @return This builder for chaining.
     */
    public Builder setCaptureRewardMultiplier(float value) {
      
      captureRewardMultiplier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float capture_reward_multiplier = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCaptureRewardMultiplier() {
      
      captureRewardMultiplier_ = 0F;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList avatarTemplateIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAvatarTemplateIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        avatarTemplateIds_ = new com.google.protobuf.LazyStringArrayList(avatarTemplateIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string avatar_template_ids = 2;</code>
     * @return A list containing the avatarTemplateIds.
     */
    public com.google.protobuf.ProtocolStringList
        getAvatarTemplateIdsList() {
      return avatarTemplateIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string avatar_template_ids = 2;</code>
     * @return The count of avatarTemplateIds.
     */
    public int getAvatarTemplateIdsCount() {
      return avatarTemplateIds_.size();
    }
    /**
     * <code>repeated string avatar_template_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The avatarTemplateIds at the given index.
     */
    public java.lang.String getAvatarTemplateIds(int index) {
      return avatarTemplateIds_.get(index);
    }
    /**
     * <code>repeated string avatar_template_ids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the avatarTemplateIds at the given index.
     */
    public com.google.protobuf.ByteString
        getAvatarTemplateIdsBytes(int index) {
      return avatarTemplateIds_.getByteString(index);
    }
    /**
     * <code>repeated string avatar_template_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The avatarTemplateIds to set.
     * @return This builder for chaining.
     */
    public Builder setAvatarTemplateIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAvatarTemplateIdsIsMutable();
      avatarTemplateIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string avatar_template_ids = 2;</code>
     * @param value The avatarTemplateIds to add.
     * @return This builder for chaining.
     */
    public Builder addAvatarTemplateIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAvatarTemplateIdsIsMutable();
      avatarTemplateIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string avatar_template_ids = 2;</code>
     * @param values The avatarTemplateIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAvatarTemplateIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureAvatarTemplateIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, avatarTemplateIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string avatar_template_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvatarTemplateIds() {
      avatarTemplateIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string avatar_template_ids = 2;</code>
     * @param value The bytes of the avatarTemplateIds to add.
     * @return This builder for chaining.
     */
    public Builder addAvatarTemplateIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAvatarTemplateIdsIsMutable();
      avatarTemplateIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Badge.BadgeCaptureReward)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Badge.BadgeCaptureReward)
  private static final POGOProtos.Data.Badge.BadgeCaptureReward DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Badge.BadgeCaptureReward();
  }

  public static POGOProtos.Data.Badge.BadgeCaptureReward getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BadgeCaptureReward>
      PARSER = new com.google.protobuf.AbstractParser<BadgeCaptureReward>() {
    @java.lang.Override
    public BadgeCaptureReward parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BadgeCaptureReward(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BadgeCaptureReward> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BadgeCaptureReward> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Badge.BadgeCaptureReward getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

