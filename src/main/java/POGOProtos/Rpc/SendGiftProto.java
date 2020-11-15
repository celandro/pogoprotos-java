// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SendGiftProto}
 */
public final class SendGiftProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SendGiftProto)
    SendGiftProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendGiftProto.newBuilder() to construct.
  private SendGiftProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendGiftProto() {
    playerId_ = "";
    stickersSent_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SendGiftProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendGiftProto(
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
          case 8: {

            giftboxId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            playerId_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              stickersSent_ = new java.util.ArrayList<POGOProtos.Rpc.StickerSentProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            stickersSent_.add(
                input.readMessage(POGOProtos.Rpc.StickerSentProto.parser(), extensionRegistry));
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
        stickersSent_ = java.util.Collections.unmodifiableList(stickersSent_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SendGiftProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SendGiftProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SendGiftProto.class, POGOProtos.Rpc.SendGiftProto.Builder.class);
  }

  public static final int GIFTBOX_ID_FIELD_NUMBER = 1;
  private long giftboxId_;
  /**
   * <code>uint64 giftbox_id = 1;</code>
   * @return The giftboxId.
   */
  @java.lang.Override
  public long getGiftboxId() {
    return giftboxId_;
  }

  public static final int PLAYER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object playerId_;
  /**
   * <code>string player_id = 2;</code>
   * @return The playerId.
   */
  @java.lang.Override
  public java.lang.String getPlayerId() {
    java.lang.Object ref = playerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      playerId_ = s;
      return s;
    }
  }
  /**
   * <code>string player_id = 2;</code>
   * @return The bytes for playerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlayerIdBytes() {
    java.lang.Object ref = playerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      playerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STICKERS_SENT_FIELD_NUMBER = 3;
  private java.util.List<POGOProtos.Rpc.StickerSentProto> stickersSent_;
  /**
   * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.StickerSentProto> getStickersSentList() {
    return stickersSent_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.StickerSentProtoOrBuilder> 
      getStickersSentOrBuilderList() {
    return stickersSent_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
   */
  @java.lang.Override
  public int getStickersSentCount() {
    return stickersSent_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.StickerSentProto getStickersSent(int index) {
    return stickersSent_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.StickerSentProtoOrBuilder getStickersSentOrBuilder(
      int index) {
    return stickersSent_.get(index);
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
    if (giftboxId_ != 0L) {
      output.writeUInt64(1, giftboxId_);
    }
    if (!getPlayerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, playerId_);
    }
    for (int i = 0; i < stickersSent_.size(); i++) {
      output.writeMessage(3, stickersSent_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (giftboxId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, giftboxId_);
    }
    if (!getPlayerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, playerId_);
    }
    for (int i = 0; i < stickersSent_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, stickersSent_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.SendGiftProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SendGiftProto other = (POGOProtos.Rpc.SendGiftProto) obj;

    if (getGiftboxId()
        != other.getGiftboxId()) return false;
    if (!getPlayerId()
        .equals(other.getPlayerId())) return false;
    if (!getStickersSentList()
        .equals(other.getStickersSentList())) return false;
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
    hash = (37 * hash) + GIFTBOX_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGiftboxId());
    hash = (37 * hash) + PLAYER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPlayerId().hashCode();
    if (getStickersSentCount() > 0) {
      hash = (37 * hash) + STICKERS_SENT_FIELD_NUMBER;
      hash = (53 * hash) + getStickersSentList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SendGiftProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SendGiftProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SendGiftProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SendGiftProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SendGiftProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SendGiftProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SendGiftProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SendGiftProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SendGiftProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SendGiftProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SendGiftProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SendGiftProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SendGiftProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SendGiftProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SendGiftProto)
      POGOProtos.Rpc.SendGiftProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SendGiftProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SendGiftProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SendGiftProto.class, POGOProtos.Rpc.SendGiftProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SendGiftProto.newBuilder()
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
        getStickersSentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      giftboxId_ = 0L;

      playerId_ = "";

      if (stickersSentBuilder_ == null) {
        stickersSent_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        stickersSentBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SendGiftProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SendGiftProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.SendGiftProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SendGiftProto build() {
      POGOProtos.Rpc.SendGiftProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SendGiftProto buildPartial() {
      POGOProtos.Rpc.SendGiftProto result = new POGOProtos.Rpc.SendGiftProto(this);
      int from_bitField0_ = bitField0_;
      result.giftboxId_ = giftboxId_;
      result.playerId_ = playerId_;
      if (stickersSentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          stickersSent_ = java.util.Collections.unmodifiableList(stickersSent_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.stickersSent_ = stickersSent_;
      } else {
        result.stickersSent_ = stickersSentBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.SendGiftProto) {
        return mergeFrom((POGOProtos.Rpc.SendGiftProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SendGiftProto other) {
      if (other == POGOProtos.Rpc.SendGiftProto.getDefaultInstance()) return this;
      if (other.getGiftboxId() != 0L) {
        setGiftboxId(other.getGiftboxId());
      }
      if (!other.getPlayerId().isEmpty()) {
        playerId_ = other.playerId_;
        onChanged();
      }
      if (stickersSentBuilder_ == null) {
        if (!other.stickersSent_.isEmpty()) {
          if (stickersSent_.isEmpty()) {
            stickersSent_ = other.stickersSent_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStickersSentIsMutable();
            stickersSent_.addAll(other.stickersSent_);
          }
          onChanged();
        }
      } else {
        if (!other.stickersSent_.isEmpty()) {
          if (stickersSentBuilder_.isEmpty()) {
            stickersSentBuilder_.dispose();
            stickersSentBuilder_ = null;
            stickersSent_ = other.stickersSent_;
            bitField0_ = (bitField0_ & ~0x00000001);
            stickersSentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStickersSentFieldBuilder() : null;
          } else {
            stickersSentBuilder_.addAllMessages(other.stickersSent_);
          }
        }
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
      POGOProtos.Rpc.SendGiftProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SendGiftProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long giftboxId_ ;
    /**
     * <code>uint64 giftbox_id = 1;</code>
     * @return The giftboxId.
     */
    @java.lang.Override
    public long getGiftboxId() {
      return giftboxId_;
    }
    /**
     * <code>uint64 giftbox_id = 1;</code>
     * @param value The giftboxId to set.
     * @return This builder for chaining.
     */
    public Builder setGiftboxId(long value) {
      
      giftboxId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 giftbox_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGiftboxId() {
      
      giftboxId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object playerId_ = "";
    /**
     * <code>string player_id = 2;</code>
     * @return The playerId.
     */
    public java.lang.String getPlayerId() {
      java.lang.Object ref = playerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        playerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string player_id = 2;</code>
     * @return The bytes for playerId.
     */
    public com.google.protobuf.ByteString
        getPlayerIdBytes() {
      java.lang.Object ref = playerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        playerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string player_id = 2;</code>
     * @param value The playerId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      playerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string player_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerId() {
      
      playerId_ = getDefaultInstance().getPlayerId();
      onChanged();
      return this;
    }
    /**
     * <code>string player_id = 2;</code>
     * @param value The bytes for playerId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      playerId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.StickerSentProto> stickersSent_ =
      java.util.Collections.emptyList();
    private void ensureStickersSentIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stickersSent_ = new java.util.ArrayList<POGOProtos.Rpc.StickerSentProto>(stickersSent_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.StickerSentProto, POGOProtos.Rpc.StickerSentProto.Builder, POGOProtos.Rpc.StickerSentProtoOrBuilder> stickersSentBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.StickerSentProto> getStickersSentList() {
      if (stickersSentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stickersSent_);
      } else {
        return stickersSentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public int getStickersSentCount() {
      if (stickersSentBuilder_ == null) {
        return stickersSent_.size();
      } else {
        return stickersSentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public POGOProtos.Rpc.StickerSentProto getStickersSent(int index) {
      if (stickersSentBuilder_ == null) {
        return stickersSent_.get(index);
      } else {
        return stickersSentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public Builder setStickersSent(
        int index, POGOProtos.Rpc.StickerSentProto value) {
      if (stickersSentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStickersSentIsMutable();
        stickersSent_.set(index, value);
        onChanged();
      } else {
        stickersSentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public Builder setStickersSent(
        int index, POGOProtos.Rpc.StickerSentProto.Builder builderForValue) {
      if (stickersSentBuilder_ == null) {
        ensureStickersSentIsMutable();
        stickersSent_.set(index, builderForValue.build());
        onChanged();
      } else {
        stickersSentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public Builder addStickersSent(POGOProtos.Rpc.StickerSentProto value) {
      if (stickersSentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStickersSentIsMutable();
        stickersSent_.add(value);
        onChanged();
      } else {
        stickersSentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public Builder addStickersSent(
        int index, POGOProtos.Rpc.StickerSentProto value) {
      if (stickersSentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStickersSentIsMutable();
        stickersSent_.add(index, value);
        onChanged();
      } else {
        stickersSentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public Builder addStickersSent(
        POGOProtos.Rpc.StickerSentProto.Builder builderForValue) {
      if (stickersSentBuilder_ == null) {
        ensureStickersSentIsMutable();
        stickersSent_.add(builderForValue.build());
        onChanged();
      } else {
        stickersSentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public Builder addStickersSent(
        int index, POGOProtos.Rpc.StickerSentProto.Builder builderForValue) {
      if (stickersSentBuilder_ == null) {
        ensureStickersSentIsMutable();
        stickersSent_.add(index, builderForValue.build());
        onChanged();
      } else {
        stickersSentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public Builder addAllStickersSent(
        java.lang.Iterable<? extends POGOProtos.Rpc.StickerSentProto> values) {
      if (stickersSentBuilder_ == null) {
        ensureStickersSentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stickersSent_);
        onChanged();
      } else {
        stickersSentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public Builder clearStickersSent() {
      if (stickersSentBuilder_ == null) {
        stickersSent_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        stickersSentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public Builder removeStickersSent(int index) {
      if (stickersSentBuilder_ == null) {
        ensureStickersSentIsMutable();
        stickersSent_.remove(index);
        onChanged();
      } else {
        stickersSentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public POGOProtos.Rpc.StickerSentProto.Builder getStickersSentBuilder(
        int index) {
      return getStickersSentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public POGOProtos.Rpc.StickerSentProtoOrBuilder getStickersSentOrBuilder(
        int index) {
      if (stickersSentBuilder_ == null) {
        return stickersSent_.get(index);  } else {
        return stickersSentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.StickerSentProtoOrBuilder> 
         getStickersSentOrBuilderList() {
      if (stickersSentBuilder_ != null) {
        return stickersSentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stickersSent_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public POGOProtos.Rpc.StickerSentProto.Builder addStickersSentBuilder() {
      return getStickersSentFieldBuilder().addBuilder(
          POGOProtos.Rpc.StickerSentProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public POGOProtos.Rpc.StickerSentProto.Builder addStickersSentBuilder(
        int index) {
      return getStickersSentFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.StickerSentProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.StickerSentProto stickers_sent = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.StickerSentProto.Builder> 
         getStickersSentBuilderList() {
      return getStickersSentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.StickerSentProto, POGOProtos.Rpc.StickerSentProto.Builder, POGOProtos.Rpc.StickerSentProtoOrBuilder> 
        getStickersSentFieldBuilder() {
      if (stickersSentBuilder_ == null) {
        stickersSentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.StickerSentProto, POGOProtos.Rpc.StickerSentProto.Builder, POGOProtos.Rpc.StickerSentProtoOrBuilder>(
                stickersSent_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        stickersSent_ = null;
      }
      return stickersSentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SendGiftProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SendGiftProto)
  private static final POGOProtos.Rpc.SendGiftProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SendGiftProto();
  }

  public static POGOProtos.Rpc.SendGiftProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendGiftProto>
      PARSER = new com.google.protobuf.AbstractParser<SendGiftProto>() {
    @java.lang.Override
    public SendGiftProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendGiftProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendGiftProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendGiftProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SendGiftProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

