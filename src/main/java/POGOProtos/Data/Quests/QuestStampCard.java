// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/QuestStampCard.proto

package POGOProtos.Data.Quests;

/**
 * Protobuf type {@code POGOProtos.Data.Quests.QuestStampCard}
 */
public  final class QuestStampCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Quests.QuestStampCard)
    QuestStampCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuestStampCard.newBuilder() to construct.
  private QuestStampCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuestStampCard() {
    stamp_ = java.util.Collections.emptyList();
    id_ = "";
    iconUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuestStampCard();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuestStampCard(
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
              stamp_ = new java.util.ArrayList<POGOProtos.Data.Quests.QuestStamp>();
              mutable_bitField0_ |= 0x00000001;
            }
            stamp_.add(
                input.readMessage(POGOProtos.Data.Quests.QuestStamp.parser(), extensionRegistry));
            break;
          }
          case 16: {

            target_ = input.readInt32();
            break;
          }
          case 24: {

            remainingDailyStamps_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            iconUrl_ = s;
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
        stamp_ = java.util.Collections.unmodifiableList(stamp_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Data.Quests.QuestStampCardOuterClass.internal_static_POGOProtos_Data_Quests_QuestStampCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Quests.QuestStampCardOuterClass.internal_static_POGOProtos_Data_Quests_QuestStampCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Quests.QuestStampCard.class, POGOProtos.Data.Quests.QuestStampCard.Builder.class);
  }

  public static final int STAMP_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Data.Quests.QuestStamp> stamp_;
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
   */
  public java.util.List<POGOProtos.Data.Quests.QuestStamp> getStampList() {
    return stamp_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Data.Quests.QuestStampOrBuilder> 
      getStampOrBuilderList() {
    return stamp_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
   */
  public int getStampCount() {
    return stamp_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
   */
  public POGOProtos.Data.Quests.QuestStamp getStamp(int index) {
    return stamp_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
   */
  public POGOProtos.Data.Quests.QuestStampOrBuilder getStampOrBuilder(
      int index) {
    return stamp_.get(index);
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

  public static final int REMAINING_DAILY_STAMPS_FIELD_NUMBER = 3;
  private int remainingDailyStamps_;
  /**
   * <code>int32 remaining_daily_stamps = 3;</code>
   * @return The remainingDailyStamps.
   */
  public int getRemainingDailyStamps() {
    return remainingDailyStamps_;
  }

  public static final int ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 4;</code>
   * @return The id.
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 4;</code>
   * @return The bytes for id.
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICON_URL_FIELD_NUMBER = 5;
  private volatile java.lang.Object iconUrl_;
  /**
   * <code>string icon_url = 5;</code>
   * @return The iconUrl.
   */
  public java.lang.String getIconUrl() {
    java.lang.Object ref = iconUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iconUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string icon_url = 5;</code>
   * @return The bytes for iconUrl.
   */
  public com.google.protobuf.ByteString
      getIconUrlBytes() {
    java.lang.Object ref = iconUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iconUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < stamp_.size(); i++) {
      output.writeMessage(1, stamp_.get(i));
    }
    if (target_ != 0) {
      output.writeInt32(2, target_);
    }
    if (remainingDailyStamps_ != 0) {
      output.writeInt32(3, remainingDailyStamps_);
    }
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, id_);
    }
    if (!getIconUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, iconUrl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < stamp_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, stamp_.get(i));
    }
    if (target_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, target_);
    }
    if (remainingDailyStamps_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, remainingDailyStamps_);
    }
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, id_);
    }
    if (!getIconUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, iconUrl_);
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
    if (!(obj instanceof POGOProtos.Data.Quests.QuestStampCard)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Quests.QuestStampCard other = (POGOProtos.Data.Quests.QuestStampCard) obj;

    if (!getStampList()
        .equals(other.getStampList())) return false;
    if (getTarget()
        != other.getTarget()) return false;
    if (getRemainingDailyStamps()
        != other.getRemainingDailyStamps()) return false;
    if (!getId()
        .equals(other.getId())) return false;
    if (!getIconUrl()
        .equals(other.getIconUrl())) return false;
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
    if (getStampCount() > 0) {
      hash = (37 * hash) + STAMP_FIELD_NUMBER;
      hash = (53 * hash) + getStampList().hashCode();
    }
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget();
    hash = (37 * hash) + REMAINING_DAILY_STAMPS_FIELD_NUMBER;
    hash = (53 * hash) + getRemainingDailyStamps();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + ICON_URL_FIELD_NUMBER;
    hash = (53 * hash) + getIconUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.QuestStampCard parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Quests.QuestStampCard prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Quests.QuestStampCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Quests.QuestStampCard)
      POGOProtos.Data.Quests.QuestStampCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Quests.QuestStampCardOuterClass.internal_static_POGOProtos_Data_Quests_QuestStampCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Quests.QuestStampCardOuterClass.internal_static_POGOProtos_Data_Quests_QuestStampCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Quests.QuestStampCard.class, POGOProtos.Data.Quests.QuestStampCard.Builder.class);
    }

    // Construct using POGOProtos.Data.Quests.QuestStampCard.newBuilder()
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
        getStampFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (stampBuilder_ == null) {
        stamp_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        stampBuilder_.clear();
      }
      target_ = 0;

      remainingDailyStamps_ = 0;

      id_ = "";

      iconUrl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Quests.QuestStampCardOuterClass.internal_static_POGOProtos_Data_Quests_QuestStampCard_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.QuestStampCard getDefaultInstanceForType() {
      return POGOProtos.Data.Quests.QuestStampCard.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.QuestStampCard build() {
      POGOProtos.Data.Quests.QuestStampCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.QuestStampCard buildPartial() {
      POGOProtos.Data.Quests.QuestStampCard result = new POGOProtos.Data.Quests.QuestStampCard(this);
      int from_bitField0_ = bitField0_;
      if (stampBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          stamp_ = java.util.Collections.unmodifiableList(stamp_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.stamp_ = stamp_;
      } else {
        result.stamp_ = stampBuilder_.build();
      }
      result.target_ = target_;
      result.remainingDailyStamps_ = remainingDailyStamps_;
      result.id_ = id_;
      result.iconUrl_ = iconUrl_;
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
      if (other instanceof POGOProtos.Data.Quests.QuestStampCard) {
        return mergeFrom((POGOProtos.Data.Quests.QuestStampCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Quests.QuestStampCard other) {
      if (other == POGOProtos.Data.Quests.QuestStampCard.getDefaultInstance()) return this;
      if (stampBuilder_ == null) {
        if (!other.stamp_.isEmpty()) {
          if (stamp_.isEmpty()) {
            stamp_ = other.stamp_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStampIsMutable();
            stamp_.addAll(other.stamp_);
          }
          onChanged();
        }
      } else {
        if (!other.stamp_.isEmpty()) {
          if (stampBuilder_.isEmpty()) {
            stampBuilder_.dispose();
            stampBuilder_ = null;
            stamp_ = other.stamp_;
            bitField0_ = (bitField0_ & ~0x00000001);
            stampBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStampFieldBuilder() : null;
          } else {
            stampBuilder_.addAllMessages(other.stamp_);
          }
        }
      }
      if (other.getTarget() != 0) {
        setTarget(other.getTarget());
      }
      if (other.getRemainingDailyStamps() != 0) {
        setRemainingDailyStamps(other.getRemainingDailyStamps());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getIconUrl().isEmpty()) {
        iconUrl_ = other.iconUrl_;
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
      POGOProtos.Data.Quests.QuestStampCard parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Quests.QuestStampCard) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Data.Quests.QuestStamp> stamp_ =
      java.util.Collections.emptyList();
    private void ensureStampIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stamp_ = new java.util.ArrayList<POGOProtos.Data.Quests.QuestStamp>(stamp_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Quests.QuestStamp, POGOProtos.Data.Quests.QuestStamp.Builder, POGOProtos.Data.Quests.QuestStampOrBuilder> stampBuilder_;

    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Quests.QuestStamp> getStampList() {
      if (stampBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stamp_);
      } else {
        return stampBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public int getStampCount() {
      if (stampBuilder_ == null) {
        return stamp_.size();
      } else {
        return stampBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestStamp getStamp(int index) {
      if (stampBuilder_ == null) {
        return stamp_.get(index);
      } else {
        return stampBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public Builder setStamp(
        int index, POGOProtos.Data.Quests.QuestStamp value) {
      if (stampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStampIsMutable();
        stamp_.set(index, value);
        onChanged();
      } else {
        stampBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public Builder setStamp(
        int index, POGOProtos.Data.Quests.QuestStamp.Builder builderForValue) {
      if (stampBuilder_ == null) {
        ensureStampIsMutable();
        stamp_.set(index, builderForValue.build());
        onChanged();
      } else {
        stampBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public Builder addStamp(POGOProtos.Data.Quests.QuestStamp value) {
      if (stampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStampIsMutable();
        stamp_.add(value);
        onChanged();
      } else {
        stampBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public Builder addStamp(
        int index, POGOProtos.Data.Quests.QuestStamp value) {
      if (stampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStampIsMutable();
        stamp_.add(index, value);
        onChanged();
      } else {
        stampBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public Builder addStamp(
        POGOProtos.Data.Quests.QuestStamp.Builder builderForValue) {
      if (stampBuilder_ == null) {
        ensureStampIsMutable();
        stamp_.add(builderForValue.build());
        onChanged();
      } else {
        stampBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public Builder addStamp(
        int index, POGOProtos.Data.Quests.QuestStamp.Builder builderForValue) {
      if (stampBuilder_ == null) {
        ensureStampIsMutable();
        stamp_.add(index, builderForValue.build());
        onChanged();
      } else {
        stampBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public Builder addAllStamp(
        java.lang.Iterable<? extends POGOProtos.Data.Quests.QuestStamp> values) {
      if (stampBuilder_ == null) {
        ensureStampIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stamp_);
        onChanged();
      } else {
        stampBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public Builder clearStamp() {
      if (stampBuilder_ == null) {
        stamp_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        stampBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public Builder removeStamp(int index) {
      if (stampBuilder_ == null) {
        ensureStampIsMutable();
        stamp_.remove(index);
        onChanged();
      } else {
        stampBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestStamp.Builder getStampBuilder(
        int index) {
      return getStampFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestStampOrBuilder getStampOrBuilder(
        int index) {
      if (stampBuilder_ == null) {
        return stamp_.get(index);  } else {
        return stampBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Data.Quests.QuestStampOrBuilder> 
         getStampOrBuilderList() {
      if (stampBuilder_ != null) {
        return stampBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stamp_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestStamp.Builder addStampBuilder() {
      return getStampFieldBuilder().addBuilder(
          POGOProtos.Data.Quests.QuestStamp.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public POGOProtos.Data.Quests.QuestStamp.Builder addStampBuilder(
        int index) {
      return getStampFieldBuilder().addBuilder(
          index, POGOProtos.Data.Quests.QuestStamp.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Quests.QuestStamp.Builder> 
         getStampBuilderList() {
      return getStampFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Quests.QuestStamp, POGOProtos.Data.Quests.QuestStamp.Builder, POGOProtos.Data.Quests.QuestStampOrBuilder> 
        getStampFieldBuilder() {
      if (stampBuilder_ == null) {
        stampBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Data.Quests.QuestStamp, POGOProtos.Data.Quests.QuestStamp.Builder, POGOProtos.Data.Quests.QuestStampOrBuilder>(
                stamp_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        stamp_ = null;
      }
      return stampBuilder_;
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

    private int remainingDailyStamps_ ;
    /**
     * <code>int32 remaining_daily_stamps = 3;</code>
     * @return The remainingDailyStamps.
     */
    public int getRemainingDailyStamps() {
      return remainingDailyStamps_;
    }
    /**
     * <code>int32 remaining_daily_stamps = 3;</code>
     * @param value The remainingDailyStamps to set.
     * @return This builder for chaining.
     */
    public Builder setRemainingDailyStamps(int value) {
      
      remainingDailyStamps_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 remaining_daily_stamps = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRemainingDailyStamps() {
      
      remainingDailyStamps_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 4;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 4;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 4;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 4;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object iconUrl_ = "";
    /**
     * <code>string icon_url = 5;</code>
     * @return The iconUrl.
     */
    public java.lang.String getIconUrl() {
      java.lang.Object ref = iconUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iconUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string icon_url = 5;</code>
     * @return The bytes for iconUrl.
     */
    public com.google.protobuf.ByteString
        getIconUrlBytes() {
      java.lang.Object ref = iconUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iconUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string icon_url = 5;</code>
     * @param value The iconUrl to set.
     * @return This builder for chaining.
     */
    public Builder setIconUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      iconUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string icon_url = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIconUrl() {
      
      iconUrl_ = getDefaultInstance().getIconUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string icon_url = 5;</code>
     * @param value The bytes for iconUrl to set.
     * @return This builder for chaining.
     */
    public Builder setIconUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      iconUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Quests.QuestStampCard)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Quests.QuestStampCard)
  private static final POGOProtos.Data.Quests.QuestStampCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Quests.QuestStampCard();
  }

  public static POGOProtos.Data.Quests.QuestStampCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuestStampCard>
      PARSER = new com.google.protobuf.AbstractParser<QuestStampCard>() {
    @java.lang.Override
    public QuestStampCard parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuestStampCard(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuestStampCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuestStampCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Quests.QuestStampCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

