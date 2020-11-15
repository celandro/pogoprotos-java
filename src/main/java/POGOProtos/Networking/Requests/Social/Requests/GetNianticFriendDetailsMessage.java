// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Social/Requests/GetNianticFriendDetailsMessage.proto

package POGOProtos.Networking.Requests.Social.Requests;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage}
 */
public final class GetNianticFriendDetailsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage)
    GetNianticFriendDetailsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNianticFriendDetailsMessage.newBuilder() to construct.
  private GetNianticFriendDetailsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNianticFriendDetailsMessage() {
    playerId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetNianticFriendDetailsMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetNianticFriendDetailsMessage(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              playerId_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            playerId_.add(s);
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
        playerId_ = playerId_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_GetNianticFriendDetailsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_GetNianticFriendDetailsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage.class, POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage.Builder.class);
  }

  public static final int PLAYER_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList playerId_;
  /**
   * <code>repeated string player_id = 1;</code>
   * @return A list containing the playerId.
   */
  public com.google.protobuf.ProtocolStringList
      getPlayerIdList() {
    return playerId_;
  }
  /**
   * <code>repeated string player_id = 1;</code>
   * @return The count of playerId.
   */
  public int getPlayerIdCount() {
    return playerId_.size();
  }
  /**
   * <code>repeated string player_id = 1;</code>
   * @param index The index of the element to return.
   * @return The playerId at the given index.
   */
  public java.lang.String getPlayerId(int index) {
    return playerId_.get(index);
  }
  /**
   * <code>repeated string player_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the playerId at the given index.
   */
  public com.google.protobuf.ByteString
      getPlayerIdBytes(int index) {
    return playerId_.getByteString(index);
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
    for (int i = 0; i < playerId_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, playerId_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < playerId_.size(); i++) {
        dataSize += computeStringSizeNoTag(playerId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPlayerIdList().size();
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage other = (POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage) obj;

    if (!getPlayerIdList()
        .equals(other.getPlayerIdList())) return false;
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
    if (getPlayerIdCount() > 0) {
      hash = (37 * hash) + PLAYER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage)
      POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_GetNianticFriendDetailsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_GetNianticFriendDetailsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage.class, POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage.newBuilder()
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
      playerId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_GetNianticFriendDetailsMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage build() {
      POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage buildPartial() {
      POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage result = new POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        playerId_ = playerId_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.playerId_ = playerId_;
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
      if (other instanceof POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage other) {
      if (other == POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage.getDefaultInstance()) return this;
      if (!other.playerId_.isEmpty()) {
        if (playerId_.isEmpty()) {
          playerId_ = other.playerId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePlayerIdIsMutable();
          playerId_.addAll(other.playerId_);
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
      POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList playerId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePlayerIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        playerId_ = new com.google.protobuf.LazyStringArrayList(playerId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string player_id = 1;</code>
     * @return A list containing the playerId.
     */
    public com.google.protobuf.ProtocolStringList
        getPlayerIdList() {
      return playerId_.getUnmodifiableView();
    }
    /**
     * <code>repeated string player_id = 1;</code>
     * @return The count of playerId.
     */
    public int getPlayerIdCount() {
      return playerId_.size();
    }
    /**
     * <code>repeated string player_id = 1;</code>
     * @param index The index of the element to return.
     * @return The playerId at the given index.
     */
    public java.lang.String getPlayerId(int index) {
      return playerId_.get(index);
    }
    /**
     * <code>repeated string player_id = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the playerId at the given index.
     */
    public com.google.protobuf.ByteString
        getPlayerIdBytes(int index) {
      return playerId_.getByteString(index);
    }
    /**
     * <code>repeated string player_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The playerId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerId(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePlayerIdIsMutable();
      playerId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string player_id = 1;</code>
     * @param value The playerId to add.
     * @return This builder for chaining.
     */
    public Builder addPlayerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePlayerIdIsMutable();
      playerId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string player_id = 1;</code>
     * @param values The playerId to add.
     * @return This builder for chaining.
     */
    public Builder addAllPlayerId(
        java.lang.Iterable<java.lang.String> values) {
      ensurePlayerIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, playerId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string player_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerId() {
      playerId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string player_id = 1;</code>
     * @param value The bytes of the playerId to add.
     * @return This builder for chaining.
     */
    public Builder addPlayerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePlayerIdIsMutable();
      playerId_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage)
  private static final POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage();
  }

  public static POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNianticFriendDetailsMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetNianticFriendDetailsMessage>() {
    @java.lang.Override
    public GetNianticFriendDetailsMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetNianticFriendDetailsMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetNianticFriendDetailsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNianticFriendDetailsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Social.Requests.GetNianticFriendDetailsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

