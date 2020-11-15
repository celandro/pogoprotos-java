// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/InvasionVictoryLogEntry.proto

package POGOProtos.Data.Logs;

/**
 * Protobuf type {@code POGOProtos.Data.Logs.InvasionVictoryLogEntry}
 */
public final class InvasionVictoryLogEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Logs.InvasionVictoryLogEntry)
    InvasionVictoryLogEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InvasionVictoryLogEntry.newBuilder() to construct.
  private InvasionVictoryLogEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvasionVictoryLogEntry() {
    invasionNpc_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InvasionVictoryLogEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InvasionVictoryLogEntry(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            POGOProtos.Inventory.Loot.Builder subBuilder = null;
            if (rewards_ != null) {
              subBuilder = rewards_.toBuilder();
            }
            rewards_ = input.readMessage(POGOProtos.Inventory.Loot.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rewards_);
              rewards_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            invasionNpc_ = rawValue;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Data.Logs.InvasionVictoryLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_InvasionVictoryLogEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Logs.InvasionVictoryLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_InvasionVictoryLogEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Logs.InvasionVictoryLogEntry.class, POGOProtos.Data.Logs.InvasionVictoryLogEntry.Builder.class);
  }

  public static final int REWARDS_FIELD_NUMBER = 1;
  private POGOProtos.Inventory.Loot rewards_;
  /**
   * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
   * @return Whether the rewards field is set.
   */
  @java.lang.Override
  public boolean hasRewards() {
    return rewards_ != null;
  }
  /**
   * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
   * @return The rewards.
   */
  @java.lang.Override
  public POGOProtos.Inventory.Loot getRewards() {
    return rewards_ == null ? POGOProtos.Inventory.Loot.getDefaultInstance() : rewards_;
  }
  /**
   * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Inventory.LootOrBuilder getRewardsOrBuilder() {
    return getRewards();
  }

  public static final int INVASION_NPC_FIELD_NUMBER = 2;
  private int invasionNpc_;
  /**
   * <code>.POGOProtos.Enums.EnumWrapper.InvasionCharacter invasion_npc = 2;</code>
   * @return The enum numeric value on the wire for invasionNpc.
   */
  @java.lang.Override public int getInvasionNpcValue() {
    return invasionNpc_;
  }
  /**
   * <code>.POGOProtos.Enums.EnumWrapper.InvasionCharacter invasion_npc = 2;</code>
   * @return The invasionNpc.
   */
  @java.lang.Override public POGOProtos.Enums.EnumWrapper.InvasionCharacter getInvasionNpc() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.EnumWrapper.InvasionCharacter result = POGOProtos.Enums.EnumWrapper.InvasionCharacter.valueOf(invasionNpc_);
    return result == null ? POGOProtos.Enums.EnumWrapper.InvasionCharacter.UNRECOGNIZED : result;
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
    if (rewards_ != null) {
      output.writeMessage(1, getRewards());
    }
    if (invasionNpc_ != POGOProtos.Enums.EnumWrapper.InvasionCharacter.CHARACTER_UNSET.getNumber()) {
      output.writeEnum(2, invasionNpc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rewards_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRewards());
    }
    if (invasionNpc_ != POGOProtos.Enums.EnumWrapper.InvasionCharacter.CHARACTER_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, invasionNpc_);
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
    if (!(obj instanceof POGOProtos.Data.Logs.InvasionVictoryLogEntry)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Logs.InvasionVictoryLogEntry other = (POGOProtos.Data.Logs.InvasionVictoryLogEntry) obj;

    if (hasRewards() != other.hasRewards()) return false;
    if (hasRewards()) {
      if (!getRewards()
          .equals(other.getRewards())) return false;
    }
    if (invasionNpc_ != other.invasionNpc_) return false;
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
    if (hasRewards()) {
      hash = (37 * hash) + REWARDS_FIELD_NUMBER;
      hash = (53 * hash) + getRewards().hashCode();
    }
    hash = (37 * hash) + INVASION_NPC_FIELD_NUMBER;
    hash = (53 * hash) + invasionNpc_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Logs.InvasionVictoryLogEntry prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Logs.InvasionVictoryLogEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Logs.InvasionVictoryLogEntry)
      POGOProtos.Data.Logs.InvasionVictoryLogEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Logs.InvasionVictoryLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_InvasionVictoryLogEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Logs.InvasionVictoryLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_InvasionVictoryLogEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Logs.InvasionVictoryLogEntry.class, POGOProtos.Data.Logs.InvasionVictoryLogEntry.Builder.class);
    }

    // Construct using POGOProtos.Data.Logs.InvasionVictoryLogEntry.newBuilder()
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
      if (rewardsBuilder_ == null) {
        rewards_ = null;
      } else {
        rewards_ = null;
        rewardsBuilder_ = null;
      }
      invasionNpc_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Logs.InvasionVictoryLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_InvasionVictoryLogEntry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Logs.InvasionVictoryLogEntry getDefaultInstanceForType() {
      return POGOProtos.Data.Logs.InvasionVictoryLogEntry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Logs.InvasionVictoryLogEntry build() {
      POGOProtos.Data.Logs.InvasionVictoryLogEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Logs.InvasionVictoryLogEntry buildPartial() {
      POGOProtos.Data.Logs.InvasionVictoryLogEntry result = new POGOProtos.Data.Logs.InvasionVictoryLogEntry(this);
      if (rewardsBuilder_ == null) {
        result.rewards_ = rewards_;
      } else {
        result.rewards_ = rewardsBuilder_.build();
      }
      result.invasionNpc_ = invasionNpc_;
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
      if (other instanceof POGOProtos.Data.Logs.InvasionVictoryLogEntry) {
        return mergeFrom((POGOProtos.Data.Logs.InvasionVictoryLogEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Logs.InvasionVictoryLogEntry other) {
      if (other == POGOProtos.Data.Logs.InvasionVictoryLogEntry.getDefaultInstance()) return this;
      if (other.hasRewards()) {
        mergeRewards(other.getRewards());
      }
      if (other.invasionNpc_ != 0) {
        setInvasionNpcValue(other.getInvasionNpcValue());
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
      POGOProtos.Data.Logs.InvasionVictoryLogEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Logs.InvasionVictoryLogEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Inventory.Loot rewards_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Inventory.Loot, POGOProtos.Inventory.Loot.Builder, POGOProtos.Inventory.LootOrBuilder> rewardsBuilder_;
    /**
     * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
     * @return Whether the rewards field is set.
     */
    public boolean hasRewards() {
      return rewardsBuilder_ != null || rewards_ != null;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
     * @return The rewards.
     */
    public POGOProtos.Inventory.Loot getRewards() {
      if (rewardsBuilder_ == null) {
        return rewards_ == null ? POGOProtos.Inventory.Loot.getDefaultInstance() : rewards_;
      } else {
        return rewardsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
     */
    public Builder setRewards(POGOProtos.Inventory.Loot value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rewards_ = value;
        onChanged();
      } else {
        rewardsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
     */
    public Builder setRewards(
        POGOProtos.Inventory.Loot.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        rewards_ = builderForValue.build();
        onChanged();
      } else {
        rewardsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
     */
    public Builder mergeRewards(POGOProtos.Inventory.Loot value) {
      if (rewardsBuilder_ == null) {
        if (rewards_ != null) {
          rewards_ =
            POGOProtos.Inventory.Loot.newBuilder(rewards_).mergeFrom(value).buildPartial();
        } else {
          rewards_ = value;
        }
        onChanged();
      } else {
        rewardsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
     */
    public Builder clearRewards() {
      if (rewardsBuilder_ == null) {
        rewards_ = null;
        onChanged();
      } else {
        rewards_ = null;
        rewardsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
     */
    public POGOProtos.Inventory.Loot.Builder getRewardsBuilder() {
      
      onChanged();
      return getRewardsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
     */
    public POGOProtos.Inventory.LootOrBuilder getRewardsOrBuilder() {
      if (rewardsBuilder_ != null) {
        return rewardsBuilder_.getMessageOrBuilder();
      } else {
        return rewards_ == null ?
            POGOProtos.Inventory.Loot.getDefaultInstance() : rewards_;
      }
    }
    /**
     * <code>.POGOProtos.Inventory.Loot rewards = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Inventory.Loot, POGOProtos.Inventory.Loot.Builder, POGOProtos.Inventory.LootOrBuilder> 
        getRewardsFieldBuilder() {
      if (rewardsBuilder_ == null) {
        rewardsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Inventory.Loot, POGOProtos.Inventory.Loot.Builder, POGOProtos.Inventory.LootOrBuilder>(
                getRewards(),
                getParentForChildren(),
                isClean());
        rewards_ = null;
      }
      return rewardsBuilder_;
    }

    private int invasionNpc_ = 0;
    /**
     * <code>.POGOProtos.Enums.EnumWrapper.InvasionCharacter invasion_npc = 2;</code>
     * @return The enum numeric value on the wire for invasionNpc.
     */
    @java.lang.Override public int getInvasionNpcValue() {
      return invasionNpc_;
    }
    /**
     * <code>.POGOProtos.Enums.EnumWrapper.InvasionCharacter invasion_npc = 2;</code>
     * @param value The enum numeric value on the wire for invasionNpc to set.
     * @return This builder for chaining.
     */
    public Builder setInvasionNpcValue(int value) {
      
      invasionNpc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.EnumWrapper.InvasionCharacter invasion_npc = 2;</code>
     * @return The invasionNpc.
     */
    @java.lang.Override
    public POGOProtos.Enums.EnumWrapper.InvasionCharacter getInvasionNpc() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.EnumWrapper.InvasionCharacter result = POGOProtos.Enums.EnumWrapper.InvasionCharacter.valueOf(invasionNpc_);
      return result == null ? POGOProtos.Enums.EnumWrapper.InvasionCharacter.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.EnumWrapper.InvasionCharacter invasion_npc = 2;</code>
     * @param value The invasionNpc to set.
     * @return This builder for chaining.
     */
    public Builder setInvasionNpc(POGOProtos.Enums.EnumWrapper.InvasionCharacter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      invasionNpc_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.EnumWrapper.InvasionCharacter invasion_npc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInvasionNpc() {
      
      invasionNpc_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Logs.InvasionVictoryLogEntry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Logs.InvasionVictoryLogEntry)
  private static final POGOProtos.Data.Logs.InvasionVictoryLogEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Logs.InvasionVictoryLogEntry();
  }

  public static POGOProtos.Data.Logs.InvasionVictoryLogEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvasionVictoryLogEntry>
      PARSER = new com.google.protobuf.AbstractParser<InvasionVictoryLogEntry>() {
    @java.lang.Override
    public InvasionVictoryLogEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InvasionVictoryLogEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InvasionVictoryLogEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvasionVictoryLogEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Logs.InvasionVictoryLogEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

