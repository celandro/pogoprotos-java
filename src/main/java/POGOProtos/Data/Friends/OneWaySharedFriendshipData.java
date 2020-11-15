// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Friends/OneWaySharedFriendshipData.proto

package POGOProtos.Data.Friends;

/**
 * Protobuf type {@code POGOProtos.Data.Friends.OneWaySharedFriendshipData}
 */
public final class OneWaySharedFriendshipData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Friends.OneWaySharedFriendshipData)
    OneWaySharedFriendshipDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OneWaySharedFriendshipData.newBuilder() to construct.
  private OneWaySharedFriendshipData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OneWaySharedFriendshipData() {
    giftboxDetails_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OneWaySharedFriendshipData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OneWaySharedFriendshipData(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              giftboxDetails_ = new java.util.ArrayList<POGOProtos.Data.Gift.GiftBoxDetails>();
              mutable_bitField0_ |= 0x00000001;
            }
            giftboxDetails_.add(
                input.readMessage(POGOProtos.Data.Gift.GiftBoxDetails.parser(), extensionRegistry));
            break;
          }
          case 16: {

            openTradeExpireMs_ = input.readInt64();
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
        giftboxDetails_ = java.util.Collections.unmodifiableList(giftboxDetails_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Data.Friends.OneWaySharedFriendshipDataOuterClass.internal_static_POGOProtos_Data_Friends_OneWaySharedFriendshipData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Friends.OneWaySharedFriendshipDataOuterClass.internal_static_POGOProtos_Data_Friends_OneWaySharedFriendshipData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Friends.OneWaySharedFriendshipData.class, POGOProtos.Data.Friends.OneWaySharedFriendshipData.Builder.class);
  }

  public static final int GIFTBOX_DETAILS_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Data.Gift.GiftBoxDetails> giftboxDetails_;
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Data.Gift.GiftBoxDetails> getGiftboxDetailsList() {
    return giftboxDetails_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder> 
      getGiftboxDetailsOrBuilderList() {
    return giftboxDetails_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  @java.lang.Override
  public int getGiftboxDetailsCount() {
    return giftboxDetails_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Gift.GiftBoxDetails getGiftboxDetails(int index) {
    return giftboxDetails_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder getGiftboxDetailsOrBuilder(
      int index) {
    return giftboxDetails_.get(index);
  }

  public static final int OPEN_TRADE_EXPIRE_MS_FIELD_NUMBER = 2;
  private long openTradeExpireMs_;
  /**
   * <code>int64 open_trade_expire_ms = 2;</code>
   * @return The openTradeExpireMs.
   */
  @java.lang.Override
  public long getOpenTradeExpireMs() {
    return openTradeExpireMs_;
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
    for (int i = 0; i < giftboxDetails_.size(); i++) {
      output.writeMessage(1, giftboxDetails_.get(i));
    }
    if (openTradeExpireMs_ != 0L) {
      output.writeInt64(2, openTradeExpireMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < giftboxDetails_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, giftboxDetails_.get(i));
    }
    if (openTradeExpireMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, openTradeExpireMs_);
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
    if (!(obj instanceof POGOProtos.Data.Friends.OneWaySharedFriendshipData)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Friends.OneWaySharedFriendshipData other = (POGOProtos.Data.Friends.OneWaySharedFriendshipData) obj;

    if (!getGiftboxDetailsList()
        .equals(other.getGiftboxDetailsList())) return false;
    if (getOpenTradeExpireMs()
        != other.getOpenTradeExpireMs()) return false;
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
    if (getGiftboxDetailsCount() > 0) {
      hash = (37 * hash) + GIFTBOX_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getGiftboxDetailsList().hashCode();
    }
    hash = (37 * hash) + OPEN_TRADE_EXPIRE_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOpenTradeExpireMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Friends.OneWaySharedFriendshipData prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Friends.OneWaySharedFriendshipData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Friends.OneWaySharedFriendshipData)
      POGOProtos.Data.Friends.OneWaySharedFriendshipDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Friends.OneWaySharedFriendshipDataOuterClass.internal_static_POGOProtos_Data_Friends_OneWaySharedFriendshipData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Friends.OneWaySharedFriendshipDataOuterClass.internal_static_POGOProtos_Data_Friends_OneWaySharedFriendshipData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Friends.OneWaySharedFriendshipData.class, POGOProtos.Data.Friends.OneWaySharedFriendshipData.Builder.class);
    }

    // Construct using POGOProtos.Data.Friends.OneWaySharedFriendshipData.newBuilder()
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
        getGiftboxDetailsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (giftboxDetailsBuilder_ == null) {
        giftboxDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        giftboxDetailsBuilder_.clear();
      }
      openTradeExpireMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Friends.OneWaySharedFriendshipDataOuterClass.internal_static_POGOProtos_Data_Friends_OneWaySharedFriendshipData_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Friends.OneWaySharedFriendshipData getDefaultInstanceForType() {
      return POGOProtos.Data.Friends.OneWaySharedFriendshipData.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Friends.OneWaySharedFriendshipData build() {
      POGOProtos.Data.Friends.OneWaySharedFriendshipData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Friends.OneWaySharedFriendshipData buildPartial() {
      POGOProtos.Data.Friends.OneWaySharedFriendshipData result = new POGOProtos.Data.Friends.OneWaySharedFriendshipData(this);
      int from_bitField0_ = bitField0_;
      if (giftboxDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          giftboxDetails_ = java.util.Collections.unmodifiableList(giftboxDetails_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.giftboxDetails_ = giftboxDetails_;
      } else {
        result.giftboxDetails_ = giftboxDetailsBuilder_.build();
      }
      result.openTradeExpireMs_ = openTradeExpireMs_;
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
      if (other instanceof POGOProtos.Data.Friends.OneWaySharedFriendshipData) {
        return mergeFrom((POGOProtos.Data.Friends.OneWaySharedFriendshipData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Friends.OneWaySharedFriendshipData other) {
      if (other == POGOProtos.Data.Friends.OneWaySharedFriendshipData.getDefaultInstance()) return this;
      if (giftboxDetailsBuilder_ == null) {
        if (!other.giftboxDetails_.isEmpty()) {
          if (giftboxDetails_.isEmpty()) {
            giftboxDetails_ = other.giftboxDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGiftboxDetailsIsMutable();
            giftboxDetails_.addAll(other.giftboxDetails_);
          }
          onChanged();
        }
      } else {
        if (!other.giftboxDetails_.isEmpty()) {
          if (giftboxDetailsBuilder_.isEmpty()) {
            giftboxDetailsBuilder_.dispose();
            giftboxDetailsBuilder_ = null;
            giftboxDetails_ = other.giftboxDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
            giftboxDetailsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGiftboxDetailsFieldBuilder() : null;
          } else {
            giftboxDetailsBuilder_.addAllMessages(other.giftboxDetails_);
          }
        }
      }
      if (other.getOpenTradeExpireMs() != 0L) {
        setOpenTradeExpireMs(other.getOpenTradeExpireMs());
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
      POGOProtos.Data.Friends.OneWaySharedFriendshipData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Friends.OneWaySharedFriendshipData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Data.Gift.GiftBoxDetails> giftboxDetails_ =
      java.util.Collections.emptyList();
    private void ensureGiftboxDetailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        giftboxDetails_ = new java.util.ArrayList<POGOProtos.Data.Gift.GiftBoxDetails>(giftboxDetails_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Gift.GiftBoxDetails, POGOProtos.Data.Gift.GiftBoxDetails.Builder, POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder> giftboxDetailsBuilder_;

    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Gift.GiftBoxDetails> getGiftboxDetailsList() {
      if (giftboxDetailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(giftboxDetails_);
      } else {
        return giftboxDetailsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public int getGiftboxDetailsCount() {
      if (giftboxDetailsBuilder_ == null) {
        return giftboxDetails_.size();
      } else {
        return giftboxDetailsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public POGOProtos.Data.Gift.GiftBoxDetails getGiftboxDetails(int index) {
      if (giftboxDetailsBuilder_ == null) {
        return giftboxDetails_.get(index);
      } else {
        return giftboxDetailsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public Builder setGiftboxDetails(
        int index, POGOProtos.Data.Gift.GiftBoxDetails value) {
      if (giftboxDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGiftboxDetailsIsMutable();
        giftboxDetails_.set(index, value);
        onChanged();
      } else {
        giftboxDetailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public Builder setGiftboxDetails(
        int index, POGOProtos.Data.Gift.GiftBoxDetails.Builder builderForValue) {
      if (giftboxDetailsBuilder_ == null) {
        ensureGiftboxDetailsIsMutable();
        giftboxDetails_.set(index, builderForValue.build());
        onChanged();
      } else {
        giftboxDetailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public Builder addGiftboxDetails(POGOProtos.Data.Gift.GiftBoxDetails value) {
      if (giftboxDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGiftboxDetailsIsMutable();
        giftboxDetails_.add(value);
        onChanged();
      } else {
        giftboxDetailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public Builder addGiftboxDetails(
        int index, POGOProtos.Data.Gift.GiftBoxDetails value) {
      if (giftboxDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGiftboxDetailsIsMutable();
        giftboxDetails_.add(index, value);
        onChanged();
      } else {
        giftboxDetailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public Builder addGiftboxDetails(
        POGOProtos.Data.Gift.GiftBoxDetails.Builder builderForValue) {
      if (giftboxDetailsBuilder_ == null) {
        ensureGiftboxDetailsIsMutable();
        giftboxDetails_.add(builderForValue.build());
        onChanged();
      } else {
        giftboxDetailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public Builder addGiftboxDetails(
        int index, POGOProtos.Data.Gift.GiftBoxDetails.Builder builderForValue) {
      if (giftboxDetailsBuilder_ == null) {
        ensureGiftboxDetailsIsMutable();
        giftboxDetails_.add(index, builderForValue.build());
        onChanged();
      } else {
        giftboxDetailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public Builder addAllGiftboxDetails(
        java.lang.Iterable<? extends POGOProtos.Data.Gift.GiftBoxDetails> values) {
      if (giftboxDetailsBuilder_ == null) {
        ensureGiftboxDetailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, giftboxDetails_);
        onChanged();
      } else {
        giftboxDetailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public Builder clearGiftboxDetails() {
      if (giftboxDetailsBuilder_ == null) {
        giftboxDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        giftboxDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public Builder removeGiftboxDetails(int index) {
      if (giftboxDetailsBuilder_ == null) {
        ensureGiftboxDetailsIsMutable();
        giftboxDetails_.remove(index);
        onChanged();
      } else {
        giftboxDetailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public POGOProtos.Data.Gift.GiftBoxDetails.Builder getGiftboxDetailsBuilder(
        int index) {
      return getGiftboxDetailsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder getGiftboxDetailsOrBuilder(
        int index) {
      if (giftboxDetailsBuilder_ == null) {
        return giftboxDetails_.get(index);  } else {
        return giftboxDetailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder> 
         getGiftboxDetailsOrBuilderList() {
      if (giftboxDetailsBuilder_ != null) {
        return giftboxDetailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(giftboxDetails_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public POGOProtos.Data.Gift.GiftBoxDetails.Builder addGiftboxDetailsBuilder() {
      return getGiftboxDetailsFieldBuilder().addBuilder(
          POGOProtos.Data.Gift.GiftBoxDetails.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public POGOProtos.Data.Gift.GiftBoxDetails.Builder addGiftboxDetailsBuilder(
        int index) {
      return getGiftboxDetailsFieldBuilder().addBuilder(
          index, POGOProtos.Data.Gift.GiftBoxDetails.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Gift.GiftBoxDetails.Builder> 
         getGiftboxDetailsBuilderList() {
      return getGiftboxDetailsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Gift.GiftBoxDetails, POGOProtos.Data.Gift.GiftBoxDetails.Builder, POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder> 
        getGiftboxDetailsFieldBuilder() {
      if (giftboxDetailsBuilder_ == null) {
        giftboxDetailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Data.Gift.GiftBoxDetails, POGOProtos.Data.Gift.GiftBoxDetails.Builder, POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder>(
                giftboxDetails_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        giftboxDetails_ = null;
      }
      return giftboxDetailsBuilder_;
    }

    private long openTradeExpireMs_ ;
    /**
     * <code>int64 open_trade_expire_ms = 2;</code>
     * @return The openTradeExpireMs.
     */
    @java.lang.Override
    public long getOpenTradeExpireMs() {
      return openTradeExpireMs_;
    }
    /**
     * <code>int64 open_trade_expire_ms = 2;</code>
     * @param value The openTradeExpireMs to set.
     * @return This builder for chaining.
     */
    public Builder setOpenTradeExpireMs(long value) {
      
      openTradeExpireMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 open_trade_expire_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpenTradeExpireMs() {
      
      openTradeExpireMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Friends.OneWaySharedFriendshipData)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Friends.OneWaySharedFriendshipData)
  private static final POGOProtos.Data.Friends.OneWaySharedFriendshipData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Friends.OneWaySharedFriendshipData();
  }

  public static POGOProtos.Data.Friends.OneWaySharedFriendshipData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OneWaySharedFriendshipData>
      PARSER = new com.google.protobuf.AbstractParser<OneWaySharedFriendshipData>() {
    @java.lang.Override
    public OneWaySharedFriendshipData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OneWaySharedFriendshipData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OneWaySharedFriendshipData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OneWaySharedFriendshipData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Friends.OneWaySharedFriendshipData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

