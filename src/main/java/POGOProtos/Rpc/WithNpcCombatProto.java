// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.WithNpcCombatProto}
 */
public  final class WithNpcCombatProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.WithNpcCombatProto)
    WithNpcCombatProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithNpcCombatProto.newBuilder() to construct.
  private WithNpcCombatProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithNpcCombatProto() {
    combatNpcTrainerId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithNpcCombatProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WithNpcCombatProto(
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

            requiresWin_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              combatNpcTrainerId_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            combatNpcTrainerId_.add(s);
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
        combatNpcTrainerId_ = combatNpcTrainerId_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithNpcCombatProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithNpcCombatProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.WithNpcCombatProto.class, POGOProtos.Rpc.WithNpcCombatProto.Builder.class);
  }

  public static final int REQUIRES_WIN_FIELD_NUMBER = 1;
  private boolean requiresWin_;
  /**
   * <code>bool requires_win = 1;</code>
   * @return The requiresWin.
   */
  public boolean getRequiresWin() {
    return requiresWin_;
  }

  public static final int COMBAT_NPC_TRAINER_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList combatNpcTrainerId_;
  /**
   * <code>repeated string combat_npc_trainer_id = 2;</code>
   * @return A list containing the combatNpcTrainerId.
   */
  public com.google.protobuf.ProtocolStringList
      getCombatNpcTrainerIdList() {
    return combatNpcTrainerId_;
  }
  /**
   * <code>repeated string combat_npc_trainer_id = 2;</code>
   * @return The count of combatNpcTrainerId.
   */
  public int getCombatNpcTrainerIdCount() {
    return combatNpcTrainerId_.size();
  }
  /**
   * <code>repeated string combat_npc_trainer_id = 2;</code>
   * @param index The index of the element to return.
   * @return The combatNpcTrainerId at the given index.
   */
  public java.lang.String getCombatNpcTrainerId(int index) {
    return combatNpcTrainerId_.get(index);
  }
  /**
   * <code>repeated string combat_npc_trainer_id = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the combatNpcTrainerId at the given index.
   */
  public com.google.protobuf.ByteString
      getCombatNpcTrainerIdBytes(int index) {
    return combatNpcTrainerId_.getByteString(index);
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
    if (requiresWin_ != false) {
      output.writeBool(1, requiresWin_);
    }
    for (int i = 0; i < combatNpcTrainerId_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, combatNpcTrainerId_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requiresWin_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, requiresWin_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < combatNpcTrainerId_.size(); i++) {
        dataSize += computeStringSizeNoTag(combatNpcTrainerId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCombatNpcTrainerIdList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.WithNpcCombatProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.WithNpcCombatProto other = (POGOProtos.Rpc.WithNpcCombatProto) obj;

    if (getRequiresWin()
        != other.getRequiresWin()) return false;
    if (!getCombatNpcTrainerIdList()
        .equals(other.getCombatNpcTrainerIdList())) return false;
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
    hash = (37 * hash) + REQUIRES_WIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRequiresWin());
    if (getCombatNpcTrainerIdCount() > 0) {
      hash = (37 * hash) + COMBAT_NPC_TRAINER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCombatNpcTrainerIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithNpcCombatProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.WithNpcCombatProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.WithNpcCombatProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.WithNpcCombatProto)
      POGOProtos.Rpc.WithNpcCombatProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithNpcCombatProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithNpcCombatProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.WithNpcCombatProto.class, POGOProtos.Rpc.WithNpcCombatProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.WithNpcCombatProto.newBuilder()
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
      requiresWin_ = false;

      combatNpcTrainerId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithNpcCombatProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithNpcCombatProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.WithNpcCombatProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithNpcCombatProto build() {
      POGOProtos.Rpc.WithNpcCombatProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithNpcCombatProto buildPartial() {
      POGOProtos.Rpc.WithNpcCombatProto result = new POGOProtos.Rpc.WithNpcCombatProto(this);
      int from_bitField0_ = bitField0_;
      result.requiresWin_ = requiresWin_;
      if (((bitField0_ & 0x00000001) != 0)) {
        combatNpcTrainerId_ = combatNpcTrainerId_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.combatNpcTrainerId_ = combatNpcTrainerId_;
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
      if (other instanceof POGOProtos.Rpc.WithNpcCombatProto) {
        return mergeFrom((POGOProtos.Rpc.WithNpcCombatProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.WithNpcCombatProto other) {
      if (other == POGOProtos.Rpc.WithNpcCombatProto.getDefaultInstance()) return this;
      if (other.getRequiresWin() != false) {
        setRequiresWin(other.getRequiresWin());
      }
      if (!other.combatNpcTrainerId_.isEmpty()) {
        if (combatNpcTrainerId_.isEmpty()) {
          combatNpcTrainerId_ = other.combatNpcTrainerId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCombatNpcTrainerIdIsMutable();
          combatNpcTrainerId_.addAll(other.combatNpcTrainerId_);
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
      POGOProtos.Rpc.WithNpcCombatProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.WithNpcCombatProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean requiresWin_ ;
    /**
     * <code>bool requires_win = 1;</code>
     * @return The requiresWin.
     */
    public boolean getRequiresWin() {
      return requiresWin_;
    }
    /**
     * <code>bool requires_win = 1;</code>
     * @param value The requiresWin to set.
     * @return This builder for chaining.
     */
    public Builder setRequiresWin(boolean value) {
      
      requiresWin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool requires_win = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequiresWin() {
      
      requiresWin_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList combatNpcTrainerId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCombatNpcTrainerIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        combatNpcTrainerId_ = new com.google.protobuf.LazyStringArrayList(combatNpcTrainerId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string combat_npc_trainer_id = 2;</code>
     * @return A list containing the combatNpcTrainerId.
     */
    public com.google.protobuf.ProtocolStringList
        getCombatNpcTrainerIdList() {
      return combatNpcTrainerId_.getUnmodifiableView();
    }
    /**
     * <code>repeated string combat_npc_trainer_id = 2;</code>
     * @return The count of combatNpcTrainerId.
     */
    public int getCombatNpcTrainerIdCount() {
      return combatNpcTrainerId_.size();
    }
    /**
     * <code>repeated string combat_npc_trainer_id = 2;</code>
     * @param index The index of the element to return.
     * @return The combatNpcTrainerId at the given index.
     */
    public java.lang.String getCombatNpcTrainerId(int index) {
      return combatNpcTrainerId_.get(index);
    }
    /**
     * <code>repeated string combat_npc_trainer_id = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the combatNpcTrainerId at the given index.
     */
    public com.google.protobuf.ByteString
        getCombatNpcTrainerIdBytes(int index) {
      return combatNpcTrainerId_.getByteString(index);
    }
    /**
     * <code>repeated string combat_npc_trainer_id = 2;</code>
     * @param index The index to set the value at.
     * @param value The combatNpcTrainerId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatNpcTrainerId(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCombatNpcTrainerIdIsMutable();
      combatNpcTrainerId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string combat_npc_trainer_id = 2;</code>
     * @param value The combatNpcTrainerId to add.
     * @return This builder for chaining.
     */
    public Builder addCombatNpcTrainerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCombatNpcTrainerIdIsMutable();
      combatNpcTrainerId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string combat_npc_trainer_id = 2;</code>
     * @param values The combatNpcTrainerId to add.
     * @return This builder for chaining.
     */
    public Builder addAllCombatNpcTrainerId(
        java.lang.Iterable<java.lang.String> values) {
      ensureCombatNpcTrainerIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, combatNpcTrainerId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string combat_npc_trainer_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombatNpcTrainerId() {
      combatNpcTrainerId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string combat_npc_trainer_id = 2;</code>
     * @param value The bytes of the combatNpcTrainerId to add.
     * @return This builder for chaining.
     */
    public Builder addCombatNpcTrainerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCombatNpcTrainerIdIsMutable();
      combatNpcTrainerId_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.WithNpcCombatProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.WithNpcCombatProto)
  private static final POGOProtos.Rpc.WithNpcCombatProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.WithNpcCombatProto();
  }

  public static POGOProtos.Rpc.WithNpcCombatProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithNpcCombatProto>
      PARSER = new com.google.protobuf.AbstractParser<WithNpcCombatProto>() {
    @java.lang.Override
    public WithNpcCombatProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WithNpcCombatProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WithNpcCombatProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithNpcCombatProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.WithNpcCombatProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

