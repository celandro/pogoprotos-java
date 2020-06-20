// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/CompleteQuestStampCardResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.CompleteQuestStampCardResponse}
 */
public  final class CompleteQuestStampCardResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.CompleteQuestStampCardResponse)
    CompleteQuestStampCardResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteQuestStampCardResponse.newBuilder() to construct.
  private CompleteQuestStampCardResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteQuestStampCardResponse() {
    status_ = 0;
    reward_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompleteQuestStampCardResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompleteQuestStampCardResponse(
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
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              reward_ = new java.util.ArrayList<POGOProtos.Data.Quests.QuestReward>();
              mutable_bitField0_ |= 0x00000001;
            }
            reward_.add(
                input.readMessage(POGOProtos.Data.Quests.QuestReward.parser(), extensionRegistry));
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
        reward_ = java.util.Collections.unmodifiableList(reward_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Responses.CompleteQuestStampCardResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CompleteQuestStampCardResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.CompleteQuestStampCardResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CompleteQuestStampCardResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.class, POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>ERROR_STILL_IN_PROGRESS = 2;</code>
     */
    ERROR_STILL_IN_PROGRESS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>ERROR_STILL_IN_PROGRESS = 2;</code>
     */
    public static final int ERROR_STILL_IN_PROGRESS_VALUE = 2;


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
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_STILL_IN_PROGRESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
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

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status status = 1;</code>
   * @return The status.
   */
  public POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status result = POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status.valueOf(status_);
    return result == null ? POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status.UNRECOGNIZED : result;
  }

  public static final int REWARD_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Data.Quests.QuestReward> reward_;
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  public java.util.List<POGOProtos.Data.Quests.QuestReward> getRewardList() {
    return reward_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  public java.util.List<? extends POGOProtos.Data.Quests.QuestRewardOrBuilder> 
      getRewardOrBuilderList() {
    return reward_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  public int getRewardCount() {
    return reward_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  public POGOProtos.Data.Quests.QuestReward getReward(int index) {
    return reward_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  public POGOProtos.Data.Quests.QuestRewardOrBuilder getRewardOrBuilder(
      int index) {
    return reward_.get(index);
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
    if (status_ != POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    for (int i = 0; i < reward_.size(); i++) {
      output.writeMessage(2, reward_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (int i = 0; i < reward_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, reward_.get(i));
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
    if (!(obj instanceof POGOProtos.Networking.Responses.CompleteQuestStampCardResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.CompleteQuestStampCardResponse other = (POGOProtos.Networking.Responses.CompleteQuestStampCardResponse) obj;

    if (status_ != other.status_) return false;
    if (!getRewardList()
        .equals(other.getRewardList())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (getRewardCount() > 0) {
      hash = (37 * hash) + REWARD_FIELD_NUMBER;
      hash = (53 * hash) + getRewardList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.CompleteQuestStampCardResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.CompleteQuestStampCardResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.CompleteQuestStampCardResponse)
      POGOProtos.Networking.Responses.CompleteQuestStampCardResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.CompleteQuestStampCardResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CompleteQuestStampCardResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.CompleteQuestStampCardResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CompleteQuestStampCardResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.class, POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.newBuilder()
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
        getRewardFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (rewardBuilder_ == null) {
        reward_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rewardBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.CompleteQuestStampCardResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CompleteQuestStampCardResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.CompleteQuestStampCardResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.CompleteQuestStampCardResponse build() {
      POGOProtos.Networking.Responses.CompleteQuestStampCardResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.CompleteQuestStampCardResponse buildPartial() {
      POGOProtos.Networking.Responses.CompleteQuestStampCardResponse result = new POGOProtos.Networking.Responses.CompleteQuestStampCardResponse(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      if (rewardBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          reward_ = java.util.Collections.unmodifiableList(reward_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reward_ = reward_;
      } else {
        result.reward_ = rewardBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.CompleteQuestStampCardResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.CompleteQuestStampCardResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.CompleteQuestStampCardResponse other) {
      if (other == POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (rewardBuilder_ == null) {
        if (!other.reward_.isEmpty()) {
          if (reward_.isEmpty()) {
            reward_ = other.reward_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRewardIsMutable();
            reward_.addAll(other.reward_);
          }
          onChanged();
        }
      } else {
        if (!other.reward_.isEmpty()) {
          if (rewardBuilder_.isEmpty()) {
            rewardBuilder_.dispose();
            rewardBuilder_ = null;
            reward_ = other.reward_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rewardBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRewardFieldBuilder() : null;
          } else {
            rewardBuilder_.addAllMessages(other.reward_);
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
      POGOProtos.Networking.Responses.CompleteQuestStampCardResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.CompleteQuestStampCardResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status status = 1;</code>
     * @return The status.
     */
    public POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status result = POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status.valueOf(status_);
      return result == null ? POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.CompleteQuestStampCardResponse.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Data.Quests.QuestReward> reward_ =
      java.util.Collections.emptyList();
    private void ensureRewardIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reward_ = new java.util.ArrayList<POGOProtos.Data.Quests.QuestReward>(reward_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Quests.QuestReward, POGOProtos.Data.Quests.QuestReward.Builder, POGOProtos.Data.Quests.QuestRewardOrBuilder> rewardBuilder_;

    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public java.util.List<POGOProtos.Data.Quests.QuestReward> getRewardList() {
      if (rewardBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reward_);
      } else {
        return rewardBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public int getRewardCount() {
      if (rewardBuilder_ == null) {
        return reward_.size();
      } else {
        return rewardBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public POGOProtos.Data.Quests.QuestReward getReward(int index) {
      if (rewardBuilder_ == null) {
        return reward_.get(index);
      } else {
        return rewardBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public Builder setReward(
        int index, POGOProtos.Data.Quests.QuestReward value) {
      if (rewardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardIsMutable();
        reward_.set(index, value);
        onChanged();
      } else {
        rewardBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public Builder setReward(
        int index, POGOProtos.Data.Quests.QuestReward.Builder builderForValue) {
      if (rewardBuilder_ == null) {
        ensureRewardIsMutable();
        reward_.set(index, builderForValue.build());
        onChanged();
      } else {
        rewardBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public Builder addReward(POGOProtos.Data.Quests.QuestReward value) {
      if (rewardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardIsMutable();
        reward_.add(value);
        onChanged();
      } else {
        rewardBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public Builder addReward(
        int index, POGOProtos.Data.Quests.QuestReward value) {
      if (rewardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardIsMutable();
        reward_.add(index, value);
        onChanged();
      } else {
        rewardBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public Builder addReward(
        POGOProtos.Data.Quests.QuestReward.Builder builderForValue) {
      if (rewardBuilder_ == null) {
        ensureRewardIsMutable();
        reward_.add(builderForValue.build());
        onChanged();
      } else {
        rewardBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public Builder addReward(
        int index, POGOProtos.Data.Quests.QuestReward.Builder builderForValue) {
      if (rewardBuilder_ == null) {
        ensureRewardIsMutable();
        reward_.add(index, builderForValue.build());
        onChanged();
      } else {
        rewardBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public Builder addAllReward(
        java.lang.Iterable<? extends POGOProtos.Data.Quests.QuestReward> values) {
      if (rewardBuilder_ == null) {
        ensureRewardIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reward_);
        onChanged();
      } else {
        rewardBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public Builder clearReward() {
      if (rewardBuilder_ == null) {
        reward_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rewardBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public Builder removeReward(int index) {
      if (rewardBuilder_ == null) {
        ensureRewardIsMutable();
        reward_.remove(index);
        onChanged();
      } else {
        rewardBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public POGOProtos.Data.Quests.QuestReward.Builder getRewardBuilder(
        int index) {
      return getRewardFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public POGOProtos.Data.Quests.QuestRewardOrBuilder getRewardOrBuilder(
        int index) {
      if (rewardBuilder_ == null) {
        return reward_.get(index);  } else {
        return rewardBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Data.Quests.QuestRewardOrBuilder> 
         getRewardOrBuilderList() {
      if (rewardBuilder_ != null) {
        return rewardBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reward_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public POGOProtos.Data.Quests.QuestReward.Builder addRewardBuilder() {
      return getRewardFieldBuilder().addBuilder(
          POGOProtos.Data.Quests.QuestReward.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public POGOProtos.Data.Quests.QuestReward.Builder addRewardBuilder(
        int index) {
      return getRewardFieldBuilder().addBuilder(
          index, POGOProtos.Data.Quests.QuestReward.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
     */
    public java.util.List<POGOProtos.Data.Quests.QuestReward.Builder> 
         getRewardBuilderList() {
      return getRewardFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Quests.QuestReward, POGOProtos.Data.Quests.QuestReward.Builder, POGOProtos.Data.Quests.QuestRewardOrBuilder> 
        getRewardFieldBuilder() {
      if (rewardBuilder_ == null) {
        rewardBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Data.Quests.QuestReward, POGOProtos.Data.Quests.QuestReward.Builder, POGOProtos.Data.Quests.QuestRewardOrBuilder>(
                reward_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        reward_ = null;
      }
      return rewardBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.CompleteQuestStampCardResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.CompleteQuestStampCardResponse)
  private static final POGOProtos.Networking.Responses.CompleteQuestStampCardResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.CompleteQuestStampCardResponse();
  }

  public static POGOProtos.Networking.Responses.CompleteQuestStampCardResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteQuestStampCardResponse>
      PARSER = new com.google.protobuf.AbstractParser<CompleteQuestStampCardResponse>() {
    @java.lang.Override
    public CompleteQuestStampCardResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompleteQuestStampCardResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompleteQuestStampCardResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteQuestStampCardResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.CompleteQuestStampCardResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

