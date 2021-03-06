// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.EquippedBadgeSettingsProto}
 */
public final class EquippedBadgeSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EquippedBadgeSettingsProto)
    EquippedBadgeSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EquippedBadgeSettingsProto.newBuilder() to construct.
  private EquippedBadgeSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EquippedBadgeSettingsProto() {
    catchProbabilityBonus_ = emptyFloatList();
    fleeProbabilityBonus_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EquippedBadgeSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EquippedBadgeSettingsProto(
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

            equipBadgeCooldownMs_ = input.readInt64();
            break;
          }
          case 21: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              catchProbabilityBonus_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            catchProbabilityBonus_.addFloat(input.readFloat());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              catchProbabilityBonus_ = newFloatList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              catchProbabilityBonus_.addFloat(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 29: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              fleeProbabilityBonus_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            fleeProbabilityBonus_.addFloat(input.readFloat());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              fleeProbabilityBonus_ = newFloatList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              fleeProbabilityBonus_.addFloat(input.readFloat());
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
        catchProbabilityBonus_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        fleeProbabilityBonus_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquippedBadgeSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquippedBadgeSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EquippedBadgeSettingsProto.class, POGOProtos.Rpc.EquippedBadgeSettingsProto.Builder.class);
  }

  public static final int EQUIP_BADGE_COOLDOWN_MS_FIELD_NUMBER = 1;
  private long equipBadgeCooldownMs_;
  /**
   * <code>int64 equip_badge_cooldown_ms = 1;</code>
   * @return The equipBadgeCooldownMs.
   */
  @java.lang.Override
  public long getEquipBadgeCooldownMs() {
    return equipBadgeCooldownMs_;
  }

  public static final int CATCH_PROBABILITY_BONUS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.FloatList catchProbabilityBonus_;
  /**
   * <code>repeated float catch_probability_bonus = 2;</code>
   * @return A list containing the catchProbabilityBonus.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getCatchProbabilityBonusList() {
    return catchProbabilityBonus_;
  }
  /**
   * <code>repeated float catch_probability_bonus = 2;</code>
   * @return The count of catchProbabilityBonus.
   */
  public int getCatchProbabilityBonusCount() {
    return catchProbabilityBonus_.size();
  }
  /**
   * <code>repeated float catch_probability_bonus = 2;</code>
   * @param index The index of the element to return.
   * @return The catchProbabilityBonus at the given index.
   */
  public float getCatchProbabilityBonus(int index) {
    return catchProbabilityBonus_.getFloat(index);
  }
  private int catchProbabilityBonusMemoizedSerializedSize = -1;

  public static final int FLEE_PROBABILITY_BONUS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.FloatList fleeProbabilityBonus_;
  /**
   * <code>repeated float flee_probability_bonus = 3;</code>
   * @return A list containing the fleeProbabilityBonus.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getFleeProbabilityBonusList() {
    return fleeProbabilityBonus_;
  }
  /**
   * <code>repeated float flee_probability_bonus = 3;</code>
   * @return The count of fleeProbabilityBonus.
   */
  public int getFleeProbabilityBonusCount() {
    return fleeProbabilityBonus_.size();
  }
  /**
   * <code>repeated float flee_probability_bonus = 3;</code>
   * @param index The index of the element to return.
   * @return The fleeProbabilityBonus at the given index.
   */
  public float getFleeProbabilityBonus(int index) {
    return fleeProbabilityBonus_.getFloat(index);
  }
  private int fleeProbabilityBonusMemoizedSerializedSize = -1;

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
    if (equipBadgeCooldownMs_ != 0L) {
      output.writeInt64(1, equipBadgeCooldownMs_);
    }
    if (getCatchProbabilityBonusList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(catchProbabilityBonusMemoizedSerializedSize);
    }
    for (int i = 0; i < catchProbabilityBonus_.size(); i++) {
      output.writeFloatNoTag(catchProbabilityBonus_.getFloat(i));
    }
    if (getFleeProbabilityBonusList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(fleeProbabilityBonusMemoizedSerializedSize);
    }
    for (int i = 0; i < fleeProbabilityBonus_.size(); i++) {
      output.writeFloatNoTag(fleeProbabilityBonus_.getFloat(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (equipBadgeCooldownMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, equipBadgeCooldownMs_);
    }
    {
      int dataSize = 0;
      dataSize = 4 * getCatchProbabilityBonusList().size();
      size += dataSize;
      if (!getCatchProbabilityBonusList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      catchProbabilityBonusMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 4 * getFleeProbabilityBonusList().size();
      size += dataSize;
      if (!getFleeProbabilityBonusList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fleeProbabilityBonusMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.EquippedBadgeSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EquippedBadgeSettingsProto other = (POGOProtos.Rpc.EquippedBadgeSettingsProto) obj;

    if (getEquipBadgeCooldownMs()
        != other.getEquipBadgeCooldownMs()) return false;
    if (!getCatchProbabilityBonusList()
        .equals(other.getCatchProbabilityBonusList())) return false;
    if (!getFleeProbabilityBonusList()
        .equals(other.getFleeProbabilityBonusList())) return false;
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
    hash = (37 * hash) + EQUIP_BADGE_COOLDOWN_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEquipBadgeCooldownMs());
    if (getCatchProbabilityBonusCount() > 0) {
      hash = (37 * hash) + CATCH_PROBABILITY_BONUS_FIELD_NUMBER;
      hash = (53 * hash) + getCatchProbabilityBonusList().hashCode();
    }
    if (getFleeProbabilityBonusCount() > 0) {
      hash = (37 * hash) + FLEE_PROBABILITY_BONUS_FIELD_NUMBER;
      hash = (53 * hash) + getFleeProbabilityBonusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EquippedBadgeSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EquippedBadgeSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.EquippedBadgeSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EquippedBadgeSettingsProto)
      POGOProtos.Rpc.EquippedBadgeSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquippedBadgeSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquippedBadgeSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EquippedBadgeSettingsProto.class, POGOProtos.Rpc.EquippedBadgeSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EquippedBadgeSettingsProto.newBuilder()
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
      equipBadgeCooldownMs_ = 0L;

      catchProbabilityBonus_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      fleeProbabilityBonus_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquippedBadgeSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EquippedBadgeSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.EquippedBadgeSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EquippedBadgeSettingsProto build() {
      POGOProtos.Rpc.EquippedBadgeSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EquippedBadgeSettingsProto buildPartial() {
      POGOProtos.Rpc.EquippedBadgeSettingsProto result = new POGOProtos.Rpc.EquippedBadgeSettingsProto(this);
      int from_bitField0_ = bitField0_;
      result.equipBadgeCooldownMs_ = equipBadgeCooldownMs_;
      if (((bitField0_ & 0x00000001) != 0)) {
        catchProbabilityBonus_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.catchProbabilityBonus_ = catchProbabilityBonus_;
      if (((bitField0_ & 0x00000002) != 0)) {
        fleeProbabilityBonus_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.fleeProbabilityBonus_ = fleeProbabilityBonus_;
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
      if (other instanceof POGOProtos.Rpc.EquippedBadgeSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.EquippedBadgeSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EquippedBadgeSettingsProto other) {
      if (other == POGOProtos.Rpc.EquippedBadgeSettingsProto.getDefaultInstance()) return this;
      if (other.getEquipBadgeCooldownMs() != 0L) {
        setEquipBadgeCooldownMs(other.getEquipBadgeCooldownMs());
      }
      if (!other.catchProbabilityBonus_.isEmpty()) {
        if (catchProbabilityBonus_.isEmpty()) {
          catchProbabilityBonus_ = other.catchProbabilityBonus_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCatchProbabilityBonusIsMutable();
          catchProbabilityBonus_.addAll(other.catchProbabilityBonus_);
        }
        onChanged();
      }
      if (!other.fleeProbabilityBonus_.isEmpty()) {
        if (fleeProbabilityBonus_.isEmpty()) {
          fleeProbabilityBonus_ = other.fleeProbabilityBonus_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureFleeProbabilityBonusIsMutable();
          fleeProbabilityBonus_.addAll(other.fleeProbabilityBonus_);
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
      POGOProtos.Rpc.EquippedBadgeSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EquippedBadgeSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long equipBadgeCooldownMs_ ;
    /**
     * <code>int64 equip_badge_cooldown_ms = 1;</code>
     * @return The equipBadgeCooldownMs.
     */
    @java.lang.Override
    public long getEquipBadgeCooldownMs() {
      return equipBadgeCooldownMs_;
    }
    /**
     * <code>int64 equip_badge_cooldown_ms = 1;</code>
     * @param value The equipBadgeCooldownMs to set.
     * @return This builder for chaining.
     */
    public Builder setEquipBadgeCooldownMs(long value) {
      
      equipBadgeCooldownMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 equip_badge_cooldown_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEquipBadgeCooldownMs() {
      
      equipBadgeCooldownMs_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList catchProbabilityBonus_ = emptyFloatList();
    private void ensureCatchProbabilityBonusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        catchProbabilityBonus_ = mutableCopy(catchProbabilityBonus_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated float catch_probability_bonus = 2;</code>
     * @return A list containing the catchProbabilityBonus.
     */
    public java.util.List<java.lang.Float>
        getCatchProbabilityBonusList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(catchProbabilityBonus_) : catchProbabilityBonus_;
    }
    /**
     * <code>repeated float catch_probability_bonus = 2;</code>
     * @return The count of catchProbabilityBonus.
     */
    public int getCatchProbabilityBonusCount() {
      return catchProbabilityBonus_.size();
    }
    /**
     * <code>repeated float catch_probability_bonus = 2;</code>
     * @param index The index of the element to return.
     * @return The catchProbabilityBonus at the given index.
     */
    public float getCatchProbabilityBonus(int index) {
      return catchProbabilityBonus_.getFloat(index);
    }
    /**
     * <code>repeated float catch_probability_bonus = 2;</code>
     * @param index The index to set the value at.
     * @param value The catchProbabilityBonus to set.
     * @return This builder for chaining.
     */
    public Builder setCatchProbabilityBonus(
        int index, float value) {
      ensureCatchProbabilityBonusIsMutable();
      catchProbabilityBonus_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float catch_probability_bonus = 2;</code>
     * @param value The catchProbabilityBonus to add.
     * @return This builder for chaining.
     */
    public Builder addCatchProbabilityBonus(float value) {
      ensureCatchProbabilityBonusIsMutable();
      catchProbabilityBonus_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float catch_probability_bonus = 2;</code>
     * @param values The catchProbabilityBonus to add.
     * @return This builder for chaining.
     */
    public Builder addAllCatchProbabilityBonus(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureCatchProbabilityBonusIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, catchProbabilityBonus_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float catch_probability_bonus = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCatchProbabilityBonus() {
      catchProbabilityBonus_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList fleeProbabilityBonus_ = emptyFloatList();
    private void ensureFleeProbabilityBonusIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        fleeProbabilityBonus_ = mutableCopy(fleeProbabilityBonus_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated float flee_probability_bonus = 3;</code>
     * @return A list containing the fleeProbabilityBonus.
     */
    public java.util.List<java.lang.Float>
        getFleeProbabilityBonusList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(fleeProbabilityBonus_) : fleeProbabilityBonus_;
    }
    /**
     * <code>repeated float flee_probability_bonus = 3;</code>
     * @return The count of fleeProbabilityBonus.
     */
    public int getFleeProbabilityBonusCount() {
      return fleeProbabilityBonus_.size();
    }
    /**
     * <code>repeated float flee_probability_bonus = 3;</code>
     * @param index The index of the element to return.
     * @return The fleeProbabilityBonus at the given index.
     */
    public float getFleeProbabilityBonus(int index) {
      return fleeProbabilityBonus_.getFloat(index);
    }
    /**
     * <code>repeated float flee_probability_bonus = 3;</code>
     * @param index The index to set the value at.
     * @param value The fleeProbabilityBonus to set.
     * @return This builder for chaining.
     */
    public Builder setFleeProbabilityBonus(
        int index, float value) {
      ensureFleeProbabilityBonusIsMutable();
      fleeProbabilityBonus_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float flee_probability_bonus = 3;</code>
     * @param value The fleeProbabilityBonus to add.
     * @return This builder for chaining.
     */
    public Builder addFleeProbabilityBonus(float value) {
      ensureFleeProbabilityBonusIsMutable();
      fleeProbabilityBonus_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float flee_probability_bonus = 3;</code>
     * @param values The fleeProbabilityBonus to add.
     * @return This builder for chaining.
     */
    public Builder addAllFleeProbabilityBonus(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureFleeProbabilityBonusIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fleeProbabilityBonus_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float flee_probability_bonus = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFleeProbabilityBonus() {
      fleeProbabilityBonus_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EquippedBadgeSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EquippedBadgeSettingsProto)
  private static final POGOProtos.Rpc.EquippedBadgeSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EquippedBadgeSettingsProto();
  }

  public static POGOProtos.Rpc.EquippedBadgeSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EquippedBadgeSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<EquippedBadgeSettingsProto>() {
    @java.lang.Override
    public EquippedBadgeSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EquippedBadgeSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EquippedBadgeSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EquippedBadgeSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EquippedBadgeSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

