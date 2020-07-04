// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SetLobbyVisibilityProto}
 */
public  final class SetLobbyVisibilityProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SetLobbyVisibilityProto)
    SetLobbyVisibilityProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetLobbyVisibilityProto.newBuilder() to construct.
  private SetLobbyVisibilityProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetLobbyVisibilityProto() {
    gymId_ = "";
    lobbyId_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetLobbyVisibilityProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetLobbyVisibilityProto(
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

            raidSeed_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            gymId_ = s;
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              lobbyId_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            lobbyId_.addInt(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              lobbyId_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              lobbyId_.addInt(input.readInt32());
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
        lobbyId_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SetLobbyVisibilityProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SetLobbyVisibilityProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SetLobbyVisibilityProto.class, POGOProtos.Rpc.SetLobbyVisibilityProto.Builder.class);
  }

  public static final int RAID_SEED_FIELD_NUMBER = 1;
  private long raidSeed_;
  /**
   * <code>int64 raid_seed = 1;</code>
   * @return The raidSeed.
   */
  public long getRaidSeed() {
    return raidSeed_;
  }

  public static final int GYM_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object gymId_;
  /**
   * <code>string gym_id = 2;</code>
   * @return The gymId.
   */
  public java.lang.String getGymId() {
    java.lang.Object ref = gymId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gymId_ = s;
      return s;
    }
  }
  /**
   * <code>string gym_id = 2;</code>
   * @return The bytes for gymId.
   */
  public com.google.protobuf.ByteString
      getGymIdBytes() {
    java.lang.Object ref = gymId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gymId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOBBY_ID_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList lobbyId_;
  /**
   * <code>repeated int32 lobby_id = 3;</code>
   * @return A list containing the lobbyId.
   */
  public java.util.List<java.lang.Integer>
      getLobbyIdList() {
    return lobbyId_;
  }
  /**
   * <code>repeated int32 lobby_id = 3;</code>
   * @return The count of lobbyId.
   */
  public int getLobbyIdCount() {
    return lobbyId_.size();
  }
  /**
   * <code>repeated int32 lobby_id = 3;</code>
   * @param index The index of the element to return.
   * @return The lobbyId at the given index.
   */
  public int getLobbyId(int index) {
    return lobbyId_.getInt(index);
  }
  private int lobbyIdMemoizedSerializedSize = -1;

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
    if (raidSeed_ != 0L) {
      output.writeInt64(1, raidSeed_);
    }
    if (!getGymIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gymId_);
    }
    if (getLobbyIdList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(lobbyIdMemoizedSerializedSize);
    }
    for (int i = 0; i < lobbyId_.size(); i++) {
      output.writeInt32NoTag(lobbyId_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (raidSeed_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, raidSeed_);
    }
    if (!getGymIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gymId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < lobbyId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(lobbyId_.getInt(i));
      }
      size += dataSize;
      if (!getLobbyIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      lobbyIdMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.SetLobbyVisibilityProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SetLobbyVisibilityProto other = (POGOProtos.Rpc.SetLobbyVisibilityProto) obj;

    if (getRaidSeed()
        != other.getRaidSeed()) return false;
    if (!getGymId()
        .equals(other.getGymId())) return false;
    if (!getLobbyIdList()
        .equals(other.getLobbyIdList())) return false;
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
    hash = (37 * hash) + RAID_SEED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRaidSeed());
    hash = (37 * hash) + GYM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGymId().hashCode();
    if (getLobbyIdCount() > 0) {
      hash = (37 * hash) + LOBBY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLobbyIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SetLobbyVisibilityProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SetLobbyVisibilityProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SetLobbyVisibilityProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SetLobbyVisibilityProto)
      POGOProtos.Rpc.SetLobbyVisibilityProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SetLobbyVisibilityProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SetLobbyVisibilityProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SetLobbyVisibilityProto.class, POGOProtos.Rpc.SetLobbyVisibilityProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SetLobbyVisibilityProto.newBuilder()
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
      raidSeed_ = 0L;

      gymId_ = "";

      lobbyId_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SetLobbyVisibilityProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SetLobbyVisibilityProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.SetLobbyVisibilityProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SetLobbyVisibilityProto build() {
      POGOProtos.Rpc.SetLobbyVisibilityProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SetLobbyVisibilityProto buildPartial() {
      POGOProtos.Rpc.SetLobbyVisibilityProto result = new POGOProtos.Rpc.SetLobbyVisibilityProto(this);
      int from_bitField0_ = bitField0_;
      result.raidSeed_ = raidSeed_;
      result.gymId_ = gymId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        lobbyId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.lobbyId_ = lobbyId_;
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
      if (other instanceof POGOProtos.Rpc.SetLobbyVisibilityProto) {
        return mergeFrom((POGOProtos.Rpc.SetLobbyVisibilityProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SetLobbyVisibilityProto other) {
      if (other == POGOProtos.Rpc.SetLobbyVisibilityProto.getDefaultInstance()) return this;
      if (other.getRaidSeed() != 0L) {
        setRaidSeed(other.getRaidSeed());
      }
      if (!other.getGymId().isEmpty()) {
        gymId_ = other.gymId_;
        onChanged();
      }
      if (!other.lobbyId_.isEmpty()) {
        if (lobbyId_.isEmpty()) {
          lobbyId_ = other.lobbyId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLobbyIdIsMutable();
          lobbyId_.addAll(other.lobbyId_);
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
      POGOProtos.Rpc.SetLobbyVisibilityProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SetLobbyVisibilityProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long raidSeed_ ;
    /**
     * <code>int64 raid_seed = 1;</code>
     * @return The raidSeed.
     */
    public long getRaidSeed() {
      return raidSeed_;
    }
    /**
     * <code>int64 raid_seed = 1;</code>
     * @param value The raidSeed to set.
     * @return This builder for chaining.
     */
    public Builder setRaidSeed(long value) {
      
      raidSeed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 raid_seed = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRaidSeed() {
      
      raidSeed_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object gymId_ = "";
    /**
     * <code>string gym_id = 2;</code>
     * @return The gymId.
     */
    public java.lang.String getGymId() {
      java.lang.Object ref = gymId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gymId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gym_id = 2;</code>
     * @return The bytes for gymId.
     */
    public com.google.protobuf.ByteString
        getGymIdBytes() {
      java.lang.Object ref = gymId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gymId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gym_id = 2;</code>
     * @param value The gymId to set.
     * @return This builder for chaining.
     */
    public Builder setGymId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gymId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gym_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymId() {
      
      gymId_ = getDefaultInstance().getGymId();
      onChanged();
      return this;
    }
    /**
     * <code>string gym_id = 2;</code>
     * @param value The bytes for gymId to set.
     * @return This builder for chaining.
     */
    public Builder setGymIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gymId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList lobbyId_ = emptyIntList();
    private void ensureLobbyIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lobbyId_ = mutableCopy(lobbyId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 lobby_id = 3;</code>
     * @return A list containing the lobbyId.
     */
    public java.util.List<java.lang.Integer>
        getLobbyIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(lobbyId_) : lobbyId_;
    }
    /**
     * <code>repeated int32 lobby_id = 3;</code>
     * @return The count of lobbyId.
     */
    public int getLobbyIdCount() {
      return lobbyId_.size();
    }
    /**
     * <code>repeated int32 lobby_id = 3;</code>
     * @param index The index of the element to return.
     * @return The lobbyId at the given index.
     */
    public int getLobbyId(int index) {
      return lobbyId_.getInt(index);
    }
    /**
     * <code>repeated int32 lobby_id = 3;</code>
     * @param index The index to set the value at.
     * @param value The lobbyId to set.
     * @return This builder for chaining.
     */
    public Builder setLobbyId(
        int index, int value) {
      ensureLobbyIdIsMutable();
      lobbyId_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 lobby_id = 3;</code>
     * @param value The lobbyId to add.
     * @return This builder for chaining.
     */
    public Builder addLobbyId(int value) {
      ensureLobbyIdIsMutable();
      lobbyId_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 lobby_id = 3;</code>
     * @param values The lobbyId to add.
     * @return This builder for chaining.
     */
    public Builder addAllLobbyId(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureLobbyIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, lobbyId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 lobby_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLobbyId() {
      lobbyId_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SetLobbyVisibilityProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SetLobbyVisibilityProto)
  private static final POGOProtos.Rpc.SetLobbyVisibilityProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SetLobbyVisibilityProto();
  }

  public static POGOProtos.Rpc.SetLobbyVisibilityProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetLobbyVisibilityProto>
      PARSER = new com.google.protobuf.AbstractParser<SetLobbyVisibilityProto>() {
    @java.lang.Override
    public SetLobbyVisibilityProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetLobbyVisibilityProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetLobbyVisibilityProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetLobbyVisibilityProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SetLobbyVisibilityProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

