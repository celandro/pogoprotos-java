// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/QuestGoal.proto

package POGOProtos.Data.Quests;

/**
 * Protobuf type {@code POGOProtos.Data.Quests.QuestGoal}
 */
public  final class QuestGoal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Quests.QuestGoal)
    QuestGoalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuestGoal.newBuilder() to construct.
  private QuestGoal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuestGoal() {
    condition_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuestGoal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuestGoal(
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
              condition_ = new java.util.ArrayList<POGOProtos.Data.Quests.QuestCondition>();
              mutable_bitField0_ |= 0x00000001;
            }
            condition_.add(
                input.readMessage(POGOProtos.Data.Quests.QuestCondition.parser(), extensionRegistry));
            break;
          }
          case 16: {

            target_ = input.readInt32();
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
        condition_ = java.util.Collections.unmodifiableList(condition_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Data.Quests.QuestGoalOuterClass.internal_static_POGOProtos_Data_Quests_QuestGoal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Quests.QuestGoalOuterClass.internal_static_POGOProtos_Data_Quests_QuestGoal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Quests.QuestGoal.class, POGOProtos.Data.Quests.QuestGoal.Builder.class);
  }

  public static final int CONDITION_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Data.Quests.QuestCondition> condition_;
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
   */
  public java.util.List<POGOProtos.Data.Quests.QuestCondition> getConditionList() {
    return condition_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Data.Quests.QuestConditionOrBuilder> 
      getConditionOrBuilderList() {
    return condition_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
   */
  public int getConditionCount() {
    return condition_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
   */
  public POGOProtos.Data.Quests.QuestCondition getCondition(int index) {
    return condition_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
   */
  public POGOProtos.Data.Quests.QuestConditionOrBuilder getConditionOrBuilder(
      int index) {
    return condition_.get(index);
  }

  public static final int TARGET_FIELD_NUMBER = 2;
  private int target_;
  /**
   * <code>int32 target = 2;</code>
   * @return The target.
   */
  public int getTarget() {
    return target_;
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
    for (int i = 0; i < condition_.size(); i++) {
      output.writeMessage(1, condition_.get(i));
    }
    if (target_ != 0) {
      output.writeInt32(2, target_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < condition_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, condition_.get(i));
    }
    if (target_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, target_);
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
    if (!(obj instanceof POGOProtos.Data.Quests.QuestGoal)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Quests.QuestGoal other = (POGOProtos.Data.Quests.QuestGoal) obj;

    if (!getConditionList()
        .equals(other.getConditionList())) return false;
    if (getTarget()
        != other.getTarget()) return false;
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
    if (getConditionCount() > 0) {
      hash = (37 * hash) + CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + getConditionList().hashCode();
    }
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Quests.QuestGoal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.QuestGoal parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Quests.QuestGoal prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Quests.QuestGoal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Quests.QuestGoal)
      POGOProtos.Data.Quests.QuestGoalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Quests.QuestGoalOuterClass.internal_static_POGOProtos_Data_Quests_QuestGoal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Quests.QuestGoalOuterClass.internal_static_POGOProtos_Data_Quests_QuestGoal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Quests.QuestGoal.class, POGOProtos.Data.Quests.QuestGoal.Builder.class);
    }

    // Construct using POGOProtos.Data.Quests.QuestGoal.newBuilder()
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
        getConditionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (conditionBuilder_ == null) {
        condition_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        conditionBuilder_.clear();
      }
      target_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Quests.QuestGoalOuterClass.internal_static_POGOProtos_Data_Quests_QuestGoal_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.QuestGoal getDefaultInstanceForType() {
      return POGOProtos.Data.Quests.QuestGoal.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.QuestGoal build() {
      POGOProtos.Data.Quests.QuestGoal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.QuestGoal buildPartial() {
      POGOProtos.Data.Quests.QuestGoal result = new POGOProtos.Data.Quests.QuestGoal(this);
      int from_bitField0_ = bitField0_;
      if (conditionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          condition_ = java.util.Collections.unmodifiableList(condition_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.condition_ = condition_;
      } else {
        result.condition_ = conditionBuilder_.build();
      }
      result.target_ = target_;
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
      if (other instanceof POGOProtos.Data.Quests.QuestGoal) {
        return mergeFrom((POGOProtos.Data.Quests.QuestGoal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Quests.QuestGoal other) {
      if (other == POGOProtos.Data.Quests.QuestGoal.getDefaultInstance()) return this;
      if (conditionBuilder_ == null) {
        if (!other.condition_.isEmpty()) {
          if (condition_.isEmpty()) {
            condition_ = other.condition_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConditionIsMutable();
            condition_.addAll(other.condition_);
          }
          onChanged();
        }
      } else {
        if (!other.condition_.isEmpty()) {
          if (conditionBuilder_.isEmpty()) {
            conditionBuilder_.dispose();
            conditionBuilder_ = null;
            condition_ = other.condition_;
            bitField0_ = (bitField0_ & ~0x00000001);
            conditionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConditionFieldBuilder() : null;
          } else {
            conditionBuilder_.addAllMessages(other.condition_);
          }
        }
      }
      if (other.getTarget() != 0) {
        setTarget(other.getTarget());
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
      POGOProtos.Data.Quests.QuestGoal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Quests.QuestGoal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Data.Quests.QuestCondition> condition_ =
      java.util.Collections.emptyList();
    private void ensureConditionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        condition_ = new java.util.ArrayList<POGOProtos.Data.Quests.QuestCondition>(condition_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Quests.QuestCondition, POGOProtos.Data.Quests.QuestCondition.Builder, POGOProtos.Data.Quests.QuestConditionOrBuilder> conditionBuilder_;

    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Quests.QuestCondition> getConditionList() {
      if (conditionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(condition_);
      } else {
        return conditionBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public int getConditionCount() {
      if (conditionBuilder_ == null) {
        return condition_.size();
      } else {
        return conditionBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestCondition getCondition(int index) {
      if (conditionBuilder_ == null) {
        return condition_.get(index);
      } else {
        return conditionBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public Builder setCondition(
        int index, POGOProtos.Data.Quests.QuestCondition value) {
      if (conditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConditionIsMutable();
        condition_.set(index, value);
        onChanged();
      } else {
        conditionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public Builder setCondition(
        int index, POGOProtos.Data.Quests.QuestCondition.Builder builderForValue) {
      if (conditionBuilder_ == null) {
        ensureConditionIsMutable();
        condition_.set(index, builderForValue.build());
        onChanged();
      } else {
        conditionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public Builder addCondition(POGOProtos.Data.Quests.QuestCondition value) {
      if (conditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConditionIsMutable();
        condition_.add(value);
        onChanged();
      } else {
        conditionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public Builder addCondition(
        int index, POGOProtos.Data.Quests.QuestCondition value) {
      if (conditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConditionIsMutable();
        condition_.add(index, value);
        onChanged();
      } else {
        conditionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public Builder addCondition(
        POGOProtos.Data.Quests.QuestCondition.Builder builderForValue) {
      if (conditionBuilder_ == null) {
        ensureConditionIsMutable();
        condition_.add(builderForValue.build());
        onChanged();
      } else {
        conditionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public Builder addCondition(
        int index, POGOProtos.Data.Quests.QuestCondition.Builder builderForValue) {
      if (conditionBuilder_ == null) {
        ensureConditionIsMutable();
        condition_.add(index, builderForValue.build());
        onChanged();
      } else {
        conditionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public Builder addAllCondition(
        java.lang.Iterable<? extends POGOProtos.Data.Quests.QuestCondition> values) {
      if (conditionBuilder_ == null) {
        ensureConditionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, condition_);
        onChanged();
      } else {
        conditionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public Builder clearCondition() {
      if (conditionBuilder_ == null) {
        condition_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        conditionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public Builder removeCondition(int index) {
      if (conditionBuilder_ == null) {
        ensureConditionIsMutable();
        condition_.remove(index);
        onChanged();
      } else {
        conditionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestCondition.Builder getConditionBuilder(
        int index) {
      return getConditionFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestConditionOrBuilder getConditionOrBuilder(
        int index) {
      if (conditionBuilder_ == null) {
        return condition_.get(index);  } else {
        return conditionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Data.Quests.QuestConditionOrBuilder> 
         getConditionOrBuilderList() {
      if (conditionBuilder_ != null) {
        return conditionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(condition_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestCondition.Builder addConditionBuilder() {
      return getConditionFieldBuilder().addBuilder(
          POGOProtos.Data.Quests.QuestCondition.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestCondition.Builder addConditionBuilder(
        int index) {
      return getConditionFieldBuilder().addBuilder(
          index, POGOProtos.Data.Quests.QuestCondition.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestCondition condition = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Quests.QuestCondition.Builder> 
         getConditionBuilderList() {
      return getConditionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Quests.QuestCondition, POGOProtos.Data.Quests.QuestCondition.Builder, POGOProtos.Data.Quests.QuestConditionOrBuilder> 
        getConditionFieldBuilder() {
      if (conditionBuilder_ == null) {
        conditionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Data.Quests.QuestCondition, POGOProtos.Data.Quests.QuestCondition.Builder, POGOProtos.Data.Quests.QuestConditionOrBuilder>(
                condition_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        condition_ = null;
      }
      return conditionBuilder_;
    }

    private int target_ ;
    /**
     * <code>int32 target = 2;</code>
     * @return The target.
     */
    public int getTarget() {
      return target_;
    }
    /**
     * <code>int32 target = 2;</code>
     * @param value The target to set.
     * @return This builder for chaining.
     */
    public Builder setTarget(int value) {
      
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 target = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTarget() {
      
      target_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Quests.QuestGoal)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Quests.QuestGoal)
  private static final POGOProtos.Data.Quests.QuestGoal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Quests.QuestGoal();
  }

  public static POGOProtos.Data.Quests.QuestGoal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuestGoal>
      PARSER = new com.google.protobuf.AbstractParser<QuestGoal>() {
    @java.lang.Override
    public QuestGoal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuestGoal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuestGoal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuestGoal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Quests.QuestGoal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

