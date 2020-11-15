// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/CompleteQuestStampCardLogEntry.proto

package POGOProtos.Data.Logs;

/**
 * Protobuf type {@code POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry}
 */
public final class CompleteQuestStampCardLogEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry)
    CompleteQuestStampCardLogEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteQuestStampCardLogEntry.newBuilder() to construct.
  private CompleteQuestStampCardLogEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteQuestStampCardLogEntry() {
    result_ = 0;
    reward_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompleteQuestStampCardLogEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompleteQuestStampCardLogEntry(
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

            result_ = rawValue;
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
    return POGOProtos.Data.Logs.CompleteQuestStampCardLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_CompleteQuestStampCardLogEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Logs.CompleteQuestStampCardLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_CompleteQuestStampCardLogEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.class, POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
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
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
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
      return POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
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

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result.valueOf(result_);
    return result == null ? POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result.UNRECOGNIZED : result;
  }

  public static final int REWARD_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Data.Quests.QuestReward> reward_;
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Data.Quests.QuestReward> getRewardList() {
    return reward_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Data.Quests.QuestRewardOrBuilder> 
      getRewardOrBuilderList() {
    return reward_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  @java.lang.Override
  public int getRewardCount() {
    return reward_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Quests.QuestReward getReward(int index) {
    return reward_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestReward reward = 2;</code>
   */
  @java.lang.Override
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
    if (result_ != POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
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
    if (result_ != POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
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
    if (!(obj instanceof POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry other = (POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry) obj;

    if (result_ != other.result_) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (getRewardCount() > 0) {
      hash = (37 * hash) + REWARD_FIELD_NUMBER;
      hash = (53 * hash) + getRewardList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry)
      POGOProtos.Data.Logs.CompleteQuestStampCardLogEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Logs.CompleteQuestStampCardLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_CompleteQuestStampCardLogEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Logs.CompleteQuestStampCardLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_CompleteQuestStampCardLogEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.class, POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Builder.class);
    }

    // Construct using POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.newBuilder()
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
      result_ = 0;

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
      return POGOProtos.Data.Logs.CompleteQuestStampCardLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_CompleteQuestStampCardLogEntry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry getDefaultInstanceForType() {
      return POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry build() {
      POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry buildPartial() {
      POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry result = new POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry(this);
      int from_bitField0_ = bitField0_;
      result.result_ = result_;
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
      if (other instanceof POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry) {
        return mergeFrom((POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry other) {
      if (other == POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
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
      POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result.valueOf(result_);
      return result == null ? POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry)
  private static final POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry();
  }

  public static POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteQuestStampCardLogEntry>
      PARSER = new com.google.protobuf.AbstractParser<CompleteQuestStampCardLogEntry>() {
    @java.lang.Override
    public CompleteQuestStampCardLogEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompleteQuestStampCardLogEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompleteQuestStampCardLogEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteQuestStampCardLogEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Logs.CompleteQuestStampCardLogEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

