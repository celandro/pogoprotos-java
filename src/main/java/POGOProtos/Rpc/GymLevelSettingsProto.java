// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GymLevelSettingsProto}
 */
public  final class GymLevelSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GymLevelSettingsProto)
    GymLevelSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GymLevelSettingsProto.newBuilder() to construct.
  private GymLevelSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GymLevelSettingsProto() {
    requiredExp_ = emptyIntList();
    leaderSlots_ = emptyIntList();
    trainerSlots_ = emptyIntList();
    searchRollBonus_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GymLevelSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GymLevelSettingsProto(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              requiredExp_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            requiredExp_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              requiredExp_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              requiredExp_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              leaderSlots_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            leaderSlots_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              leaderSlots_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              leaderSlots_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              trainerSlots_ = newIntList();
              mutable_bitField0_ |= 0x00000004;
            }
            trainerSlots_.addInt(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
              trainerSlots_ = newIntList();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              trainerSlots_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000008) != 0)) {
              searchRollBonus_ = newIntList();
              mutable_bitField0_ |= 0x00000008;
            }
            searchRollBonus_.addInt(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000008) != 0) && input.getBytesUntilLimit() > 0) {
              searchRollBonus_ = newIntList();
              mutable_bitField0_ |= 0x00000008;
            }
            while (input.getBytesUntilLimit() > 0) {
              searchRollBonus_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
        requiredExp_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        leaderSlots_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        trainerSlots_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        searchRollBonus_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymLevelSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymLevelSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GymLevelSettingsProto.class, POGOProtos.Rpc.GymLevelSettingsProto.Builder.class);
  }

  public static final int REQUIRED_EXP_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList requiredExp_;
  /**
   * <code>repeated int32 required_exp = 1;</code>
   * @return A list containing the requiredExp.
   */
  public java.util.List<java.lang.Integer>
      getRequiredExpList() {
    return requiredExp_;
  }
  /**
   * <code>repeated int32 required_exp = 1;</code>
   * @return The count of requiredExp.
   */
  public int getRequiredExpCount() {
    return requiredExp_.size();
  }
  /**
   * <code>repeated int32 required_exp = 1;</code>
   * @param index The index of the element to return.
   * @return The requiredExp at the given index.
   */
  public int getRequiredExp(int index) {
    return requiredExp_.getInt(index);
  }
  private int requiredExpMemoizedSerializedSize = -1;

  public static final int LEADER_SLOTS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList leaderSlots_;
  /**
   * <code>repeated int32 leader_slots = 2;</code>
   * @return A list containing the leaderSlots.
   */
  public java.util.List<java.lang.Integer>
      getLeaderSlotsList() {
    return leaderSlots_;
  }
  /**
   * <code>repeated int32 leader_slots = 2;</code>
   * @return The count of leaderSlots.
   */
  public int getLeaderSlotsCount() {
    return leaderSlots_.size();
  }
  /**
   * <code>repeated int32 leader_slots = 2;</code>
   * @param index The index of the element to return.
   * @return The leaderSlots at the given index.
   */
  public int getLeaderSlots(int index) {
    return leaderSlots_.getInt(index);
  }
  private int leaderSlotsMemoizedSerializedSize = -1;

  public static final int TRAINER_SLOTS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList trainerSlots_;
  /**
   * <code>repeated int32 trainer_slots = 3;</code>
   * @return A list containing the trainerSlots.
   */
  public java.util.List<java.lang.Integer>
      getTrainerSlotsList() {
    return trainerSlots_;
  }
  /**
   * <code>repeated int32 trainer_slots = 3;</code>
   * @return The count of trainerSlots.
   */
  public int getTrainerSlotsCount() {
    return trainerSlots_.size();
  }
  /**
   * <code>repeated int32 trainer_slots = 3;</code>
   * @param index The index of the element to return.
   * @return The trainerSlots at the given index.
   */
  public int getTrainerSlots(int index) {
    return trainerSlots_.getInt(index);
  }
  private int trainerSlotsMemoizedSerializedSize = -1;

  public static final int SEARCH_ROLL_BONUS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList searchRollBonus_;
  /**
   * <code>repeated int32 search_roll_bonus = 4;</code>
   * @return A list containing the searchRollBonus.
   */
  public java.util.List<java.lang.Integer>
      getSearchRollBonusList() {
    return searchRollBonus_;
  }
  /**
   * <code>repeated int32 search_roll_bonus = 4;</code>
   * @return The count of searchRollBonus.
   */
  public int getSearchRollBonusCount() {
    return searchRollBonus_.size();
  }
  /**
   * <code>repeated int32 search_roll_bonus = 4;</code>
   * @param index The index of the element to return.
   * @return The searchRollBonus at the given index.
   */
  public int getSearchRollBonus(int index) {
    return searchRollBonus_.getInt(index);
  }
  private int searchRollBonusMemoizedSerializedSize = -1;

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
    if (getRequiredExpList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(requiredExpMemoizedSerializedSize);
    }
    for (int i = 0; i < requiredExp_.size(); i++) {
      output.writeInt32NoTag(requiredExp_.getInt(i));
    }
    if (getLeaderSlotsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(leaderSlotsMemoizedSerializedSize);
    }
    for (int i = 0; i < leaderSlots_.size(); i++) {
      output.writeInt32NoTag(leaderSlots_.getInt(i));
    }
    if (getTrainerSlotsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(trainerSlotsMemoizedSerializedSize);
    }
    for (int i = 0; i < trainerSlots_.size(); i++) {
      output.writeInt32NoTag(trainerSlots_.getInt(i));
    }
    if (getSearchRollBonusList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(searchRollBonusMemoizedSerializedSize);
    }
    for (int i = 0; i < searchRollBonus_.size(); i++) {
      output.writeInt32NoTag(searchRollBonus_.getInt(i));
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
      for (int i = 0; i < requiredExp_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(requiredExp_.getInt(i));
      }
      size += dataSize;
      if (!getRequiredExpList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      requiredExpMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < leaderSlots_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(leaderSlots_.getInt(i));
      }
      size += dataSize;
      if (!getLeaderSlotsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      leaderSlotsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < trainerSlots_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(trainerSlots_.getInt(i));
      }
      size += dataSize;
      if (!getTrainerSlotsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      trainerSlotsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < searchRollBonus_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(searchRollBonus_.getInt(i));
      }
      size += dataSize;
      if (!getSearchRollBonusList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      searchRollBonusMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.GymLevelSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GymLevelSettingsProto other = (POGOProtos.Rpc.GymLevelSettingsProto) obj;

    if (!getRequiredExpList()
        .equals(other.getRequiredExpList())) return false;
    if (!getLeaderSlotsList()
        .equals(other.getLeaderSlotsList())) return false;
    if (!getTrainerSlotsList()
        .equals(other.getTrainerSlotsList())) return false;
    if (!getSearchRollBonusList()
        .equals(other.getSearchRollBonusList())) return false;
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
    if (getRequiredExpCount() > 0) {
      hash = (37 * hash) + REQUIRED_EXP_FIELD_NUMBER;
      hash = (53 * hash) + getRequiredExpList().hashCode();
    }
    if (getLeaderSlotsCount() > 0) {
      hash = (37 * hash) + LEADER_SLOTS_FIELD_NUMBER;
      hash = (53 * hash) + getLeaderSlotsList().hashCode();
    }
    if (getTrainerSlotsCount() > 0) {
      hash = (37 * hash) + TRAINER_SLOTS_FIELD_NUMBER;
      hash = (53 * hash) + getTrainerSlotsList().hashCode();
    }
    if (getSearchRollBonusCount() > 0) {
      hash = (37 * hash) + SEARCH_ROLL_BONUS_FIELD_NUMBER;
      hash = (53 * hash) + getSearchRollBonusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymLevelSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GymLevelSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GymLevelSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GymLevelSettingsProto)
      POGOProtos.Rpc.GymLevelSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymLevelSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymLevelSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GymLevelSettingsProto.class, POGOProtos.Rpc.GymLevelSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GymLevelSettingsProto.newBuilder()
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
      requiredExp_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      leaderSlots_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      trainerSlots_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      searchRollBonus_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymLevelSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymLevelSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GymLevelSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymLevelSettingsProto build() {
      POGOProtos.Rpc.GymLevelSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymLevelSettingsProto buildPartial() {
      POGOProtos.Rpc.GymLevelSettingsProto result = new POGOProtos.Rpc.GymLevelSettingsProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        requiredExp_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.requiredExp_ = requiredExp_;
      if (((bitField0_ & 0x00000002) != 0)) {
        leaderSlots_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.leaderSlots_ = leaderSlots_;
      if (((bitField0_ & 0x00000004) != 0)) {
        trainerSlots_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.trainerSlots_ = trainerSlots_;
      if (((bitField0_ & 0x00000008) != 0)) {
        searchRollBonus_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.searchRollBonus_ = searchRollBonus_;
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
      if (other instanceof POGOProtos.Rpc.GymLevelSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.GymLevelSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GymLevelSettingsProto other) {
      if (other == POGOProtos.Rpc.GymLevelSettingsProto.getDefaultInstance()) return this;
      if (!other.requiredExp_.isEmpty()) {
        if (requiredExp_.isEmpty()) {
          requiredExp_ = other.requiredExp_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureRequiredExpIsMutable();
          requiredExp_.addAll(other.requiredExp_);
        }
        onChanged();
      }
      if (!other.leaderSlots_.isEmpty()) {
        if (leaderSlots_.isEmpty()) {
          leaderSlots_ = other.leaderSlots_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureLeaderSlotsIsMutable();
          leaderSlots_.addAll(other.leaderSlots_);
        }
        onChanged();
      }
      if (!other.trainerSlots_.isEmpty()) {
        if (trainerSlots_.isEmpty()) {
          trainerSlots_ = other.trainerSlots_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureTrainerSlotsIsMutable();
          trainerSlots_.addAll(other.trainerSlots_);
        }
        onChanged();
      }
      if (!other.searchRollBonus_.isEmpty()) {
        if (searchRollBonus_.isEmpty()) {
          searchRollBonus_ = other.searchRollBonus_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureSearchRollBonusIsMutable();
          searchRollBonus_.addAll(other.searchRollBonus_);
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
      POGOProtos.Rpc.GymLevelSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GymLevelSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList requiredExp_ = emptyIntList();
    private void ensureRequiredExpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        requiredExp_ = mutableCopy(requiredExp_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 required_exp = 1;</code>
     * @return A list containing the requiredExp.
     */
    public java.util.List<java.lang.Integer>
        getRequiredExpList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(requiredExp_) : requiredExp_;
    }
    /**
     * <code>repeated int32 required_exp = 1;</code>
     * @return The count of requiredExp.
     */
    public int getRequiredExpCount() {
      return requiredExp_.size();
    }
    /**
     * <code>repeated int32 required_exp = 1;</code>
     * @param index The index of the element to return.
     * @return The requiredExp at the given index.
     */
    public int getRequiredExp(int index) {
      return requiredExp_.getInt(index);
    }
    /**
     * <code>repeated int32 required_exp = 1;</code>
     * @param index The index to set the value at.
     * @param value The requiredExp to set.
     * @return This builder for chaining.
     */
    public Builder setRequiredExp(
        int index, int value) {
      ensureRequiredExpIsMutable();
      requiredExp_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 required_exp = 1;</code>
     * @param value The requiredExp to add.
     * @return This builder for chaining.
     */
    public Builder addRequiredExp(int value) {
      ensureRequiredExpIsMutable();
      requiredExp_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 required_exp = 1;</code>
     * @param values The requiredExp to add.
     * @return This builder for chaining.
     */
    public Builder addAllRequiredExp(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureRequiredExpIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, requiredExp_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 required_exp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequiredExp() {
      requiredExp_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList leaderSlots_ = emptyIntList();
    private void ensureLeaderSlotsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        leaderSlots_ = mutableCopy(leaderSlots_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 leader_slots = 2;</code>
     * @return A list containing the leaderSlots.
     */
    public java.util.List<java.lang.Integer>
        getLeaderSlotsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(leaderSlots_) : leaderSlots_;
    }
    /**
     * <code>repeated int32 leader_slots = 2;</code>
     * @return The count of leaderSlots.
     */
    public int getLeaderSlotsCount() {
      return leaderSlots_.size();
    }
    /**
     * <code>repeated int32 leader_slots = 2;</code>
     * @param index The index of the element to return.
     * @return The leaderSlots at the given index.
     */
    public int getLeaderSlots(int index) {
      return leaderSlots_.getInt(index);
    }
    /**
     * <code>repeated int32 leader_slots = 2;</code>
     * @param index The index to set the value at.
     * @param value The leaderSlots to set.
     * @return This builder for chaining.
     */
    public Builder setLeaderSlots(
        int index, int value) {
      ensureLeaderSlotsIsMutable();
      leaderSlots_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 leader_slots = 2;</code>
     * @param value The leaderSlots to add.
     * @return This builder for chaining.
     */
    public Builder addLeaderSlots(int value) {
      ensureLeaderSlotsIsMutable();
      leaderSlots_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 leader_slots = 2;</code>
     * @param values The leaderSlots to add.
     * @return This builder for chaining.
     */
    public Builder addAllLeaderSlots(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureLeaderSlotsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, leaderSlots_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 leader_slots = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeaderSlots() {
      leaderSlots_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList trainerSlots_ = emptyIntList();
    private void ensureTrainerSlotsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        trainerSlots_ = mutableCopy(trainerSlots_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated int32 trainer_slots = 3;</code>
     * @return A list containing the trainerSlots.
     */
    public java.util.List<java.lang.Integer>
        getTrainerSlotsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(trainerSlots_) : trainerSlots_;
    }
    /**
     * <code>repeated int32 trainer_slots = 3;</code>
     * @return The count of trainerSlots.
     */
    public int getTrainerSlotsCount() {
      return trainerSlots_.size();
    }
    /**
     * <code>repeated int32 trainer_slots = 3;</code>
     * @param index The index of the element to return.
     * @return The trainerSlots at the given index.
     */
    public int getTrainerSlots(int index) {
      return trainerSlots_.getInt(index);
    }
    /**
     * <code>repeated int32 trainer_slots = 3;</code>
     * @param index The index to set the value at.
     * @param value The trainerSlots to set.
     * @return This builder for chaining.
     */
    public Builder setTrainerSlots(
        int index, int value) {
      ensureTrainerSlotsIsMutable();
      trainerSlots_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 trainer_slots = 3;</code>
     * @param value The trainerSlots to add.
     * @return This builder for chaining.
     */
    public Builder addTrainerSlots(int value) {
      ensureTrainerSlotsIsMutable();
      trainerSlots_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 trainer_slots = 3;</code>
     * @param values The trainerSlots to add.
     * @return This builder for chaining.
     */
    public Builder addAllTrainerSlots(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureTrainerSlotsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, trainerSlots_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 trainer_slots = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrainerSlots() {
      trainerSlots_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList searchRollBonus_ = emptyIntList();
    private void ensureSearchRollBonusIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        searchRollBonus_ = mutableCopy(searchRollBonus_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated int32 search_roll_bonus = 4;</code>
     * @return A list containing the searchRollBonus.
     */
    public java.util.List<java.lang.Integer>
        getSearchRollBonusList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(searchRollBonus_) : searchRollBonus_;
    }
    /**
     * <code>repeated int32 search_roll_bonus = 4;</code>
     * @return The count of searchRollBonus.
     */
    public int getSearchRollBonusCount() {
      return searchRollBonus_.size();
    }
    /**
     * <code>repeated int32 search_roll_bonus = 4;</code>
     * @param index The index of the element to return.
     * @return The searchRollBonus at the given index.
     */
    public int getSearchRollBonus(int index) {
      return searchRollBonus_.getInt(index);
    }
    /**
     * <code>repeated int32 search_roll_bonus = 4;</code>
     * @param index The index to set the value at.
     * @param value The searchRollBonus to set.
     * @return This builder for chaining.
     */
    public Builder setSearchRollBonus(
        int index, int value) {
      ensureSearchRollBonusIsMutable();
      searchRollBonus_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 search_roll_bonus = 4;</code>
     * @param value The searchRollBonus to add.
     * @return This builder for chaining.
     */
    public Builder addSearchRollBonus(int value) {
      ensureSearchRollBonusIsMutable();
      searchRollBonus_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 search_roll_bonus = 4;</code>
     * @param values The searchRollBonus to add.
     * @return This builder for chaining.
     */
    public Builder addAllSearchRollBonus(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureSearchRollBonusIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, searchRollBonus_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 search_roll_bonus = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSearchRollBonus() {
      searchRollBonus_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000008);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GymLevelSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GymLevelSettingsProto)
  private static final POGOProtos.Rpc.GymLevelSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GymLevelSettingsProto();
  }

  public static POGOProtos.Rpc.GymLevelSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GymLevelSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<GymLevelSettingsProto>() {
    @java.lang.Override
    public GymLevelSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GymLevelSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GymLevelSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GymLevelSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GymLevelSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

