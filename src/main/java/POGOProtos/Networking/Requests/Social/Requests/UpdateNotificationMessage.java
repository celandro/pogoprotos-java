// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Social/Requests/UpdateNotificationMessage.proto

package POGOProtos.Networking.Requests.Social.Requests;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage}
 */
public final class UpdateNotificationMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage)
    UpdateNotificationMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateNotificationMessage.newBuilder() to construct.
  private UpdateNotificationMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateNotificationMessage() {
    notificationIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    createTimestampMs_ = emptyLongList();
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateNotificationMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateNotificationMessage(
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
              notificationIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            notificationIds_.add(s);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              createTimestampMs_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            createTimestampMs_.addLong(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              createTimestampMs_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              createTimestampMs_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            state_ = rawValue;
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
        notificationIds_ = notificationIds_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        createTimestampMs_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage.class, POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage.Builder.class);
  }

  public static final int NOTIFICATION_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList notificationIds_;
  /**
   * <code>repeated string notification_ids = 1;</code>
   * @return A list containing the notificationIds.
   */
  public com.google.protobuf.ProtocolStringList
      getNotificationIdsList() {
    return notificationIds_;
  }
  /**
   * <code>repeated string notification_ids = 1;</code>
   * @return The count of notificationIds.
   */
  public int getNotificationIdsCount() {
    return notificationIds_.size();
  }
  /**
   * <code>repeated string notification_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The notificationIds at the given index.
   */
  public java.lang.String getNotificationIds(int index) {
    return notificationIds_.get(index);
  }
  /**
   * <code>repeated string notification_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notificationIds at the given index.
   */
  public com.google.protobuf.ByteString
      getNotificationIdsBytes(int index) {
    return notificationIds_.getByteString(index);
  }

  public static final int CREATE_TIMESTAMP_MS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList createTimestampMs_;
  /**
   * <code>repeated int64 create_timestamp_ms = 2;</code>
   * @return A list containing the createTimestampMs.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getCreateTimestampMsList() {
    return createTimestampMs_;
  }
  /**
   * <code>repeated int64 create_timestamp_ms = 2;</code>
   * @return The count of createTimestampMs.
   */
  public int getCreateTimestampMsCount() {
    return createTimestampMs_.size();
  }
  /**
   * <code>repeated int64 create_timestamp_ms = 2;</code>
   * @param index The index of the element to return.
   * @return The createTimestampMs at the given index.
   */
  public long getCreateTimestampMs(int index) {
    return createTimestampMs_.getLong(index);
  }
  private int createTimestampMsMemoizedSerializedSize = -1;

  public static final int STATE_FIELD_NUMBER = 3;
  private int state_;
  /**
   * <code>.POGOProtos.Enums.NotificationState state = 3;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.POGOProtos.Enums.NotificationState state = 3;</code>
   * @return The state.
   */
  @java.lang.Override public POGOProtos.Enums.NotificationState getState() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.NotificationState result = POGOProtos.Enums.NotificationState.valueOf(state_);
    return result == null ? POGOProtos.Enums.NotificationState.UNRECOGNIZED : result;
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
    getSerializedSize();
    for (int i = 0; i < notificationIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notificationIds_.getRaw(i));
    }
    if (getCreateTimestampMsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(createTimestampMsMemoizedSerializedSize);
    }
    for (int i = 0; i < createTimestampMs_.size(); i++) {
      output.writeInt64NoTag(createTimestampMs_.getLong(i));
    }
    if (state_ != POGOProtos.Enums.NotificationState.UNSET_STATE.getNumber()) {
      output.writeEnum(3, state_);
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
      for (int i = 0; i < notificationIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(notificationIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotificationIdsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < createTimestampMs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(createTimestampMs_.getLong(i));
      }
      size += dataSize;
      if (!getCreateTimestampMsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      createTimestampMsMemoizedSerializedSize = dataSize;
    }
    if (state_ != POGOProtos.Enums.NotificationState.UNSET_STATE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, state_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage other = (POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage) obj;

    if (!getNotificationIdsList()
        .equals(other.getNotificationIdsList())) return false;
    if (!getCreateTimestampMsList()
        .equals(other.getCreateTimestampMsList())) return false;
    if (state_ != other.state_) return false;
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
    if (getNotificationIdsCount() > 0) {
      hash = (37 * hash) + NOTIFICATION_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getNotificationIdsList().hashCode();
    }
    if (getCreateTimestampMsCount() > 0) {
      hash = (37 * hash) + CREATE_TIMESTAMP_MS_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTimestampMsList().hashCode();
    }
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage)
      POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage.class, POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage.newBuilder()
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
      notificationIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      createTimestampMs_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Social_Requests_UpdateNotificationMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage build() {
      POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage buildPartial() {
      POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage result = new POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        notificationIds_ = notificationIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.notificationIds_ = notificationIds_;
      if (((bitField0_ & 0x00000002) != 0)) {
        createTimestampMs_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.createTimestampMs_ = createTimestampMs_;
      result.state_ = state_;
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
      if (other instanceof POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage other) {
      if (other == POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage.getDefaultInstance()) return this;
      if (!other.notificationIds_.isEmpty()) {
        if (notificationIds_.isEmpty()) {
          notificationIds_ = other.notificationIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNotificationIdsIsMutable();
          notificationIds_.addAll(other.notificationIds_);
        }
        onChanged();
      }
      if (!other.createTimestampMs_.isEmpty()) {
        if (createTimestampMs_.isEmpty()) {
          createTimestampMs_ = other.createTimestampMs_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCreateTimestampMsIsMutable();
          createTimestampMs_.addAll(other.createTimestampMs_);
        }
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
      POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList notificationIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNotificationIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        notificationIds_ = new com.google.protobuf.LazyStringArrayList(notificationIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string notification_ids = 1;</code>
     * @return A list containing the notificationIds.
     */
    public com.google.protobuf.ProtocolStringList
        getNotificationIdsList() {
      return notificationIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string notification_ids = 1;</code>
     * @return The count of notificationIds.
     */
    public int getNotificationIdsCount() {
      return notificationIds_.size();
    }
    /**
     * <code>repeated string notification_ids = 1;</code>
     * @param index The index of the element to return.
     * @return The notificationIds at the given index.
     */
    public java.lang.String getNotificationIds(int index) {
      return notificationIds_.get(index);
    }
    /**
     * <code>repeated string notification_ids = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the notificationIds at the given index.
     */
    public com.google.protobuf.ByteString
        getNotificationIdsBytes(int index) {
      return notificationIds_.getByteString(index);
    }
    /**
     * <code>repeated string notification_ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The notificationIds to set.
     * @return This builder for chaining.
     */
    public Builder setNotificationIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotificationIdsIsMutable();
      notificationIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string notification_ids = 1;</code>
     * @param value The notificationIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotificationIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotificationIdsIsMutable();
      notificationIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string notification_ids = 1;</code>
     * @param values The notificationIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotificationIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotificationIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notificationIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string notification_ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotificationIds() {
      notificationIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string notification_ids = 1;</code>
     * @param value The bytes of the notificationIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotificationIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNotificationIdsIsMutable();
      notificationIds_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList createTimestampMs_ = emptyLongList();
    private void ensureCreateTimestampMsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        createTimestampMs_ = mutableCopy(createTimestampMs_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int64 create_timestamp_ms = 2;</code>
     * @return A list containing the createTimestampMs.
     */
    public java.util.List<java.lang.Long>
        getCreateTimestampMsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(createTimestampMs_) : createTimestampMs_;
    }
    /**
     * <code>repeated int64 create_timestamp_ms = 2;</code>
     * @return The count of createTimestampMs.
     */
    public int getCreateTimestampMsCount() {
      return createTimestampMs_.size();
    }
    /**
     * <code>repeated int64 create_timestamp_ms = 2;</code>
     * @param index The index of the element to return.
     * @return The createTimestampMs at the given index.
     */
    public long getCreateTimestampMs(int index) {
      return createTimestampMs_.getLong(index);
    }
    /**
     * <code>repeated int64 create_timestamp_ms = 2;</code>
     * @param index The index to set the value at.
     * @param value The createTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setCreateTimestampMs(
        int index, long value) {
      ensureCreateTimestampMsIsMutable();
      createTimestampMs_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 create_timestamp_ms = 2;</code>
     * @param value The createTimestampMs to add.
     * @return This builder for chaining.
     */
    public Builder addCreateTimestampMs(long value) {
      ensureCreateTimestampMsIsMutable();
      createTimestampMs_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 create_timestamp_ms = 2;</code>
     * @param values The createTimestampMs to add.
     * @return This builder for chaining.
     */
    public Builder addAllCreateTimestampMs(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureCreateTimestampMsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, createTimestampMs_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 create_timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreateTimestampMs() {
      createTimestampMs_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <code>.POGOProtos.Enums.NotificationState state = 3;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.POGOProtos.Enums.NotificationState state = 3;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.NotificationState state = 3;</code>
     * @return The state.
     */
    @java.lang.Override
    public POGOProtos.Enums.NotificationState getState() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.NotificationState result = POGOProtos.Enums.NotificationState.valueOf(state_);
      return result == null ? POGOProtos.Enums.NotificationState.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.NotificationState state = 3;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(POGOProtos.Enums.NotificationState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.NotificationState state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage)
  private static final POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage();
  }

  public static POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateNotificationMessage>
      PARSER = new com.google.protobuf.AbstractParser<UpdateNotificationMessage>() {
    @java.lang.Override
    public UpdateNotificationMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateNotificationMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateNotificationMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateNotificationMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Social.Requests.UpdateNotificationMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

