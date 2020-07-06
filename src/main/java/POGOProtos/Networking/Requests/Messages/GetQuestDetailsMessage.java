// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetQuestDetailsMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage}
 */
public  final class GetQuestDetailsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage)
    GetQuestDetailsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetQuestDetailsMessage.newBuilder() to construct.
  private GetQuestDetailsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetQuestDetailsMessage() {
    questId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetQuestDetailsMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetQuestDetailsMessage(
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
              questId_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            questId_.add(s);
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
        questId_ = questId_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetQuestDetailsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetQuestDetailsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage.class, POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage.Builder.class);
  }

  public static final int QUEST_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList questId_;
  /**
   * <code>repeated string quest_id = 1;</code>
   * @return A list containing the questId.
   */
  public com.google.protobuf.ProtocolStringList
      getQuestIdList() {
    return questId_;
  }
  /**
   * <code>repeated string quest_id = 1;</code>
   * @return The count of questId.
   */
  public int getQuestIdCount() {
    return questId_.size();
  }
  /**
   * <code>repeated string quest_id = 1;</code>
   * @param index The index of the element to return.
   * @return The questId at the given index.
   */
  public java.lang.String getQuestId(int index) {
    return questId_.get(index);
  }
  /**
   * <code>repeated string quest_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the questId at the given index.
   */
  public com.google.protobuf.ByteString
      getQuestIdBytes(int index) {
    return questId_.getByteString(index);
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
    for (int i = 0; i < questId_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, questId_.getRaw(i));
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
      for (int i = 0; i < questId_.size(); i++) {
        dataSize += computeStringSizeNoTag(questId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getQuestIdList().size();
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage other = (POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage) obj;

    if (!getQuestIdList()
        .equals(other.getQuestIdList())) return false;
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
    if (getQuestIdCount() > 0) {
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage)
      POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetQuestDetailsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetQuestDetailsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage.class, POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage.newBuilder()
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
      questId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetQuestDetailsMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage build() {
      POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage result = new POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        questId_ = questId_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.questId_ = questId_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage.getDefaultInstance()) return this;
      if (!other.questId_.isEmpty()) {
        if (questId_.isEmpty()) {
          questId_ = other.questId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureQuestIdIsMutable();
          questId_.addAll(other.questId_);
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
      POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList questId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureQuestIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        questId_ = new com.google.protobuf.LazyStringArrayList(questId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string quest_id = 1;</code>
     * @return A list containing the questId.
     */
    public com.google.protobuf.ProtocolStringList
        getQuestIdList() {
      return questId_.getUnmodifiableView();
    }
    /**
     * <code>repeated string quest_id = 1;</code>
     * @return The count of questId.
     */
    public int getQuestIdCount() {
      return questId_.size();
    }
    /**
     * <code>repeated string quest_id = 1;</code>
     * @param index The index of the element to return.
     * @return The questId at the given index.
     */
    public java.lang.String getQuestId(int index) {
      return questId_.get(index);
    }
    /**
     * <code>repeated string quest_id = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the questId at the given index.
     */
    public com.google.protobuf.ByteString
        getQuestIdBytes(int index) {
      return questId_.getByteString(index);
    }
    /**
     * <code>repeated string quest_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The questId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestId(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureQuestIdIsMutable();
      questId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string quest_id = 1;</code>
     * @param value The questId to add.
     * @return This builder for chaining.
     */
    public Builder addQuestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureQuestIdIsMutable();
      questId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string quest_id = 1;</code>
     * @param values The questId to add.
     * @return This builder for chaining.
     */
    public Builder addAllQuestId(
        java.lang.Iterable<java.lang.String> values) {
      ensureQuestIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, questId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string quest_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestId() {
      questId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string quest_id = 1;</code>
     * @param value The bytes of the questId to add.
     * @return This builder for chaining.
     */
    public Builder addQuestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureQuestIdIsMutable();
      questId_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage)
  private static final POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetQuestDetailsMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetQuestDetailsMessage>() {
    @java.lang.Override
    public GetQuestDetailsMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetQuestDetailsMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetQuestDetailsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetQuestDetailsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

