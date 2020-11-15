// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Raid/PlayerRaidInfo.proto

package POGOProtos.Data.Raid;

/**
 * Protobuf type {@code POGOProtos.Data.Raid.PlayerRaidInfo}
 */
public final class PlayerRaidInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Raid.PlayerRaidInfo)
    PlayerRaidInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerRaidInfo.newBuilder() to construct.
  private PlayerRaidInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerRaidInfo() {
    raids_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerRaidInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlayerRaidInfo(
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
          case 24: {

            totalCompletedRaids_ = input.readInt32();
            break;
          }
          case 32: {

            totalCompletedLegendaryRaids_ = input.readInt32();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              raids_ = new java.util.ArrayList<POGOProtos.Data.Raid.Raid>();
              mutable_bitField0_ |= 0x00000001;
            }
            raids_.add(
                input.readMessage(POGOProtos.Data.Raid.Raid.parser(), extensionRegistry));
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
        raids_ = java.util.Collections.unmodifiableList(raids_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Data.Raid.PlayerRaidInfoOuterClass.internal_static_POGOProtos_Data_Raid_PlayerRaidInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Raid.PlayerRaidInfoOuterClass.internal_static_POGOProtos_Data_Raid_PlayerRaidInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Raid.PlayerRaidInfo.class, POGOProtos.Data.Raid.PlayerRaidInfo.Builder.class);
  }

  public static final int TOTAL_COMPLETED_RAIDS_FIELD_NUMBER = 3;
  private int totalCompletedRaids_;
  /**
   * <code>int32 total_completed_raids = 3;</code>
   * @return The totalCompletedRaids.
   */
  @java.lang.Override
  public int getTotalCompletedRaids() {
    return totalCompletedRaids_;
  }

  public static final int TOTAL_COMPLETED_LEGENDARY_RAIDS_FIELD_NUMBER = 4;
  private int totalCompletedLegendaryRaids_;
  /**
   * <code>int32 total_completed_legendary_raids = 4;</code>
   * @return The totalCompletedLegendaryRaids.
   */
  @java.lang.Override
  public int getTotalCompletedLegendaryRaids() {
    return totalCompletedLegendaryRaids_;
  }

  public static final int RAIDS_FIELD_NUMBER = 5;
  private java.util.List<POGOProtos.Data.Raid.Raid> raids_;
  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Data.Raid.Raid> getRaidsList() {
    return raids_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Data.Raid.RaidOrBuilder> 
      getRaidsOrBuilderList() {
    return raids_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  @java.lang.Override
  public int getRaidsCount() {
    return raids_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Raid.Raid getRaids(int index) {
    return raids_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Raid.RaidOrBuilder getRaidsOrBuilder(
      int index) {
    return raids_.get(index);
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
    if (totalCompletedRaids_ != 0) {
      output.writeInt32(3, totalCompletedRaids_);
    }
    if (totalCompletedLegendaryRaids_ != 0) {
      output.writeInt32(4, totalCompletedLegendaryRaids_);
    }
    for (int i = 0; i < raids_.size(); i++) {
      output.writeMessage(5, raids_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalCompletedRaids_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalCompletedRaids_);
    }
    if (totalCompletedLegendaryRaids_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, totalCompletedLegendaryRaids_);
    }
    for (int i = 0; i < raids_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, raids_.get(i));
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
    if (!(obj instanceof POGOProtos.Data.Raid.PlayerRaidInfo)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Raid.PlayerRaidInfo other = (POGOProtos.Data.Raid.PlayerRaidInfo) obj;

    if (getTotalCompletedRaids()
        != other.getTotalCompletedRaids()) return false;
    if (getTotalCompletedLegendaryRaids()
        != other.getTotalCompletedLegendaryRaids()) return false;
    if (!getRaidsList()
        .equals(other.getRaidsList())) return false;
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
    hash = (37 * hash) + TOTAL_COMPLETED_RAIDS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalCompletedRaids();
    hash = (37 * hash) + TOTAL_COMPLETED_LEGENDARY_RAIDS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalCompletedLegendaryRaids();
    if (getRaidsCount() > 0) {
      hash = (37 * hash) + RAIDS_FIELD_NUMBER;
      hash = (53 * hash) + getRaidsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Raid.PlayerRaidInfo parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Raid.PlayerRaidInfo prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Raid.PlayerRaidInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Raid.PlayerRaidInfo)
      POGOProtos.Data.Raid.PlayerRaidInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Raid.PlayerRaidInfoOuterClass.internal_static_POGOProtos_Data_Raid_PlayerRaidInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Raid.PlayerRaidInfoOuterClass.internal_static_POGOProtos_Data_Raid_PlayerRaidInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Raid.PlayerRaidInfo.class, POGOProtos.Data.Raid.PlayerRaidInfo.Builder.class);
    }

    // Construct using POGOProtos.Data.Raid.PlayerRaidInfo.newBuilder()
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
        getRaidsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      totalCompletedRaids_ = 0;

      totalCompletedLegendaryRaids_ = 0;

      if (raidsBuilder_ == null) {
        raids_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        raidsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Raid.PlayerRaidInfoOuterClass.internal_static_POGOProtos_Data_Raid_PlayerRaidInfo_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Raid.PlayerRaidInfo getDefaultInstanceForType() {
      return POGOProtos.Data.Raid.PlayerRaidInfo.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Raid.PlayerRaidInfo build() {
      POGOProtos.Data.Raid.PlayerRaidInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Raid.PlayerRaidInfo buildPartial() {
      POGOProtos.Data.Raid.PlayerRaidInfo result = new POGOProtos.Data.Raid.PlayerRaidInfo(this);
      int from_bitField0_ = bitField0_;
      result.totalCompletedRaids_ = totalCompletedRaids_;
      result.totalCompletedLegendaryRaids_ = totalCompletedLegendaryRaids_;
      if (raidsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          raids_ = java.util.Collections.unmodifiableList(raids_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.raids_ = raids_;
      } else {
        result.raids_ = raidsBuilder_.build();
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
      if (other instanceof POGOProtos.Data.Raid.PlayerRaidInfo) {
        return mergeFrom((POGOProtos.Data.Raid.PlayerRaidInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Raid.PlayerRaidInfo other) {
      if (other == POGOProtos.Data.Raid.PlayerRaidInfo.getDefaultInstance()) return this;
      if (other.getTotalCompletedRaids() != 0) {
        setTotalCompletedRaids(other.getTotalCompletedRaids());
      }
      if (other.getTotalCompletedLegendaryRaids() != 0) {
        setTotalCompletedLegendaryRaids(other.getTotalCompletedLegendaryRaids());
      }
      if (raidsBuilder_ == null) {
        if (!other.raids_.isEmpty()) {
          if (raids_.isEmpty()) {
            raids_ = other.raids_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRaidsIsMutable();
            raids_.addAll(other.raids_);
          }
          onChanged();
        }
      } else {
        if (!other.raids_.isEmpty()) {
          if (raidsBuilder_.isEmpty()) {
            raidsBuilder_.dispose();
            raidsBuilder_ = null;
            raids_ = other.raids_;
            bitField0_ = (bitField0_ & ~0x00000001);
            raidsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRaidsFieldBuilder() : null;
          } else {
            raidsBuilder_.addAllMessages(other.raids_);
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
      POGOProtos.Data.Raid.PlayerRaidInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Raid.PlayerRaidInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int totalCompletedRaids_ ;
    /**
     * <code>int32 total_completed_raids = 3;</code>
     * @return The totalCompletedRaids.
     */
    @java.lang.Override
    public int getTotalCompletedRaids() {
      return totalCompletedRaids_;
    }
    /**
     * <code>int32 total_completed_raids = 3;</code>
     * @param value The totalCompletedRaids to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCompletedRaids(int value) {
      
      totalCompletedRaids_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_completed_raids = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCompletedRaids() {
      
      totalCompletedRaids_ = 0;
      onChanged();
      return this;
    }

    private int totalCompletedLegendaryRaids_ ;
    /**
     * <code>int32 total_completed_legendary_raids = 4;</code>
     * @return The totalCompletedLegendaryRaids.
     */
    @java.lang.Override
    public int getTotalCompletedLegendaryRaids() {
      return totalCompletedLegendaryRaids_;
    }
    /**
     * <code>int32 total_completed_legendary_raids = 4;</code>
     * @param value The totalCompletedLegendaryRaids to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCompletedLegendaryRaids(int value) {
      
      totalCompletedLegendaryRaids_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_completed_legendary_raids = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCompletedLegendaryRaids() {
      
      totalCompletedLegendaryRaids_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Data.Raid.Raid> raids_ =
      java.util.Collections.emptyList();
    private void ensureRaidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        raids_ = new java.util.ArrayList<POGOProtos.Data.Raid.Raid>(raids_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Raid.Raid, POGOProtos.Data.Raid.Raid.Builder, POGOProtos.Data.Raid.RaidOrBuilder> raidsBuilder_;

    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public java.util.List<POGOProtos.Data.Raid.Raid> getRaidsList() {
      if (raidsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(raids_);
      } else {
        return raidsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public int getRaidsCount() {
      if (raidsBuilder_ == null) {
        return raids_.size();
      } else {
        return raidsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public POGOProtos.Data.Raid.Raid getRaids(int index) {
      if (raidsBuilder_ == null) {
        return raids_.get(index);
      } else {
        return raidsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public Builder setRaids(
        int index, POGOProtos.Data.Raid.Raid value) {
      if (raidsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRaidsIsMutable();
        raids_.set(index, value);
        onChanged();
      } else {
        raidsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public Builder setRaids(
        int index, POGOProtos.Data.Raid.Raid.Builder builderForValue) {
      if (raidsBuilder_ == null) {
        ensureRaidsIsMutable();
        raids_.set(index, builderForValue.build());
        onChanged();
      } else {
        raidsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public Builder addRaids(POGOProtos.Data.Raid.Raid value) {
      if (raidsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRaidsIsMutable();
        raids_.add(value);
        onChanged();
      } else {
        raidsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public Builder addRaids(
        int index, POGOProtos.Data.Raid.Raid value) {
      if (raidsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRaidsIsMutable();
        raids_.add(index, value);
        onChanged();
      } else {
        raidsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public Builder addRaids(
        POGOProtos.Data.Raid.Raid.Builder builderForValue) {
      if (raidsBuilder_ == null) {
        ensureRaidsIsMutable();
        raids_.add(builderForValue.build());
        onChanged();
      } else {
        raidsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public Builder addRaids(
        int index, POGOProtos.Data.Raid.Raid.Builder builderForValue) {
      if (raidsBuilder_ == null) {
        ensureRaidsIsMutable();
        raids_.add(index, builderForValue.build());
        onChanged();
      } else {
        raidsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public Builder addAllRaids(
        java.lang.Iterable<? extends POGOProtos.Data.Raid.Raid> values) {
      if (raidsBuilder_ == null) {
        ensureRaidsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, raids_);
        onChanged();
      } else {
        raidsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public Builder clearRaids() {
      if (raidsBuilder_ == null) {
        raids_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        raidsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public Builder removeRaids(int index) {
      if (raidsBuilder_ == null) {
        ensureRaidsIsMutable();
        raids_.remove(index);
        onChanged();
      } else {
        raidsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public POGOProtos.Data.Raid.Raid.Builder getRaidsBuilder(
        int index) {
      return getRaidsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public POGOProtos.Data.Raid.RaidOrBuilder getRaidsOrBuilder(
        int index) {
      if (raidsBuilder_ == null) {
        return raids_.get(index);  } else {
        return raidsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public java.util.List<? extends POGOProtos.Data.Raid.RaidOrBuilder> 
         getRaidsOrBuilderList() {
      if (raidsBuilder_ != null) {
        return raidsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(raids_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public POGOProtos.Data.Raid.Raid.Builder addRaidsBuilder() {
      return getRaidsFieldBuilder().addBuilder(
          POGOProtos.Data.Raid.Raid.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public POGOProtos.Data.Raid.Raid.Builder addRaidsBuilder(
        int index) {
      return getRaidsFieldBuilder().addBuilder(
          index, POGOProtos.Data.Raid.Raid.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
     */
    public java.util.List<POGOProtos.Data.Raid.Raid.Builder> 
         getRaidsBuilderList() {
      return getRaidsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Raid.Raid, POGOProtos.Data.Raid.Raid.Builder, POGOProtos.Data.Raid.RaidOrBuilder> 
        getRaidsFieldBuilder() {
      if (raidsBuilder_ == null) {
        raidsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Data.Raid.Raid, POGOProtos.Data.Raid.Raid.Builder, POGOProtos.Data.Raid.RaidOrBuilder>(
                raids_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        raids_ = null;
      }
      return raidsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Raid.PlayerRaidInfo)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Raid.PlayerRaidInfo)
  private static final POGOProtos.Data.Raid.PlayerRaidInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Raid.PlayerRaidInfo();
  }

  public static POGOProtos.Data.Raid.PlayerRaidInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerRaidInfo>
      PARSER = new com.google.protobuf.AbstractParser<PlayerRaidInfo>() {
    @java.lang.Override
    public PlayerRaidInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlayerRaidInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlayerRaidInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerRaidInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Raid.PlayerRaidInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

