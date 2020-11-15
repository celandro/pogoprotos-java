// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.OpenCombatSessionProto}
 */
public final class OpenCombatSessionProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OpenCombatSessionProto)
    OpenCombatSessionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenCombatSessionProto.newBuilder() to construct.
  private OpenCombatSessionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenCombatSessionProto() {
    combatId_ = "";
    attackingPokemonId_ = emptyLongList();
    combatLeagueTemplateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenCombatSessionProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpenCombatSessionProto(
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
            java.lang.String s = input.readStringRequireUtf8();

            combatId_ = s;
            break;
          }
          case 17: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attackingPokemonId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            attackingPokemonId_.addLong(input.readFixed64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              attackingPokemonId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              attackingPokemonId_.addLong(input.readFixed64());
            }
            input.popLimit(limit);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            combatLeagueTemplateId_ = s;
            break;
          }
          case 32: {

            lobbyJoinTimeMs_ = input.readInt64();
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
        attackingPokemonId_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenCombatSessionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenCombatSessionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OpenCombatSessionProto.class, POGOProtos.Rpc.OpenCombatSessionProto.Builder.class);
  }

  public static final int COMBAT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object combatId_;
  /**
   * <code>string combat_id = 1;</code>
   * @return The combatId.
   */
  @java.lang.Override
  public java.lang.String getCombatId() {
    java.lang.Object ref = combatId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      combatId_ = s;
      return s;
    }
  }
  /**
   * <code>string combat_id = 1;</code>
   * @return The bytes for combatId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCombatIdBytes() {
    java.lang.Object ref = combatId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      combatId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTACKING_POKEMON_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList attackingPokemonId_;
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @return A list containing the attackingPokemonId.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getAttackingPokemonIdList() {
    return attackingPokemonId_;
  }
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @return The count of attackingPokemonId.
   */
  public int getAttackingPokemonIdCount() {
    return attackingPokemonId_.size();
  }
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @param index The index of the element to return.
   * @return The attackingPokemonId at the given index.
   */
  public long getAttackingPokemonId(int index) {
    return attackingPokemonId_.getLong(index);
  }
  private int attackingPokemonIdMemoizedSerializedSize = -1;

  public static final int COMBAT_LEAGUE_TEMPLATE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object combatLeagueTemplateId_;
  /**
   * <code>string combat_league_template_id = 3;</code>
   * @return The combatLeagueTemplateId.
   */
  @java.lang.Override
  public java.lang.String getCombatLeagueTemplateId() {
    java.lang.Object ref = combatLeagueTemplateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      combatLeagueTemplateId_ = s;
      return s;
    }
  }
  /**
   * <code>string combat_league_template_id = 3;</code>
   * @return The bytes for combatLeagueTemplateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCombatLeagueTemplateIdBytes() {
    java.lang.Object ref = combatLeagueTemplateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      combatLeagueTemplateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOBBY_JOIN_TIME_MS_FIELD_NUMBER = 4;
  private long lobbyJoinTimeMs_;
  /**
   * <code>int64 lobby_join_time_ms = 4;</code>
   * @return The lobbyJoinTimeMs.
   */
  @java.lang.Override
  public long getLobbyJoinTimeMs() {
    return lobbyJoinTimeMs_;
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
    getSerializedSize();
    if (!getCombatIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, combatId_);
    }
    if (getAttackingPokemonIdList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(attackingPokemonIdMemoizedSerializedSize);
    }
    for (int i = 0; i < attackingPokemonId_.size(); i++) {
      output.writeFixed64NoTag(attackingPokemonId_.getLong(i));
    }
    if (!getCombatLeagueTemplateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, combatLeagueTemplateId_);
    }
    if (lobbyJoinTimeMs_ != 0L) {
      output.writeInt64(4, lobbyJoinTimeMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCombatIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, combatId_);
    }
    {
      int dataSize = 0;
      dataSize = 8 * getAttackingPokemonIdList().size();
      size += dataSize;
      if (!getAttackingPokemonIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      attackingPokemonIdMemoizedSerializedSize = dataSize;
    }
    if (!getCombatLeagueTemplateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, combatLeagueTemplateId_);
    }
    if (lobbyJoinTimeMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, lobbyJoinTimeMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.OpenCombatSessionProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OpenCombatSessionProto other = (POGOProtos.Rpc.OpenCombatSessionProto) obj;

    if (!getCombatId()
        .equals(other.getCombatId())) return false;
    if (!getAttackingPokemonIdList()
        .equals(other.getAttackingPokemonIdList())) return false;
    if (!getCombatLeagueTemplateId()
        .equals(other.getCombatLeagueTemplateId())) return false;
    if (getLobbyJoinTimeMs()
        != other.getLobbyJoinTimeMs()) return false;
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
    hash = (37 * hash) + COMBAT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCombatId().hashCode();
    if (getAttackingPokemonIdCount() > 0) {
      hash = (37 * hash) + ATTACKING_POKEMON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAttackingPokemonIdList().hashCode();
    }
    hash = (37 * hash) + COMBAT_LEAGUE_TEMPLATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCombatLeagueTemplateId().hashCode();
    hash = (37 * hash) + LOBBY_JOIN_TIME_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLobbyJoinTimeMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenCombatSessionProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OpenCombatSessionProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.OpenCombatSessionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OpenCombatSessionProto)
      POGOProtos.Rpc.OpenCombatSessionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenCombatSessionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenCombatSessionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OpenCombatSessionProto.class, POGOProtos.Rpc.OpenCombatSessionProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OpenCombatSessionProto.newBuilder()
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
      combatId_ = "";

      attackingPokemonId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      combatLeagueTemplateId_ = "";

      lobbyJoinTimeMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenCombatSessionProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenCombatSessionProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.OpenCombatSessionProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenCombatSessionProto build() {
      POGOProtos.Rpc.OpenCombatSessionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenCombatSessionProto buildPartial() {
      POGOProtos.Rpc.OpenCombatSessionProto result = new POGOProtos.Rpc.OpenCombatSessionProto(this);
      int from_bitField0_ = bitField0_;
      result.combatId_ = combatId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        attackingPokemonId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.attackingPokemonId_ = attackingPokemonId_;
      result.combatLeagueTemplateId_ = combatLeagueTemplateId_;
      result.lobbyJoinTimeMs_ = lobbyJoinTimeMs_;
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
      if (other instanceof POGOProtos.Rpc.OpenCombatSessionProto) {
        return mergeFrom((POGOProtos.Rpc.OpenCombatSessionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OpenCombatSessionProto other) {
      if (other == POGOProtos.Rpc.OpenCombatSessionProto.getDefaultInstance()) return this;
      if (!other.getCombatId().isEmpty()) {
        combatId_ = other.combatId_;
        onChanged();
      }
      if (!other.attackingPokemonId_.isEmpty()) {
        if (attackingPokemonId_.isEmpty()) {
          attackingPokemonId_ = other.attackingPokemonId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAttackingPokemonIdIsMutable();
          attackingPokemonId_.addAll(other.attackingPokemonId_);
        }
        onChanged();
      }
      if (!other.getCombatLeagueTemplateId().isEmpty()) {
        combatLeagueTemplateId_ = other.combatLeagueTemplateId_;
        onChanged();
      }
      if (other.getLobbyJoinTimeMs() != 0L) {
        setLobbyJoinTimeMs(other.getLobbyJoinTimeMs());
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
      POGOProtos.Rpc.OpenCombatSessionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OpenCombatSessionProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object combatId_ = "";
    /**
     * <code>string combat_id = 1;</code>
     * @return The combatId.
     */
    public java.lang.String getCombatId() {
      java.lang.Object ref = combatId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        combatId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string combat_id = 1;</code>
     * @return The bytes for combatId.
     */
    public com.google.protobuf.ByteString
        getCombatIdBytes() {
      java.lang.Object ref = combatId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        combatId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string combat_id = 1;</code>
     * @param value The combatId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      combatId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string combat_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombatId() {
      
      combatId_ = getDefaultInstance().getCombatId();
      onChanged();
      return this;
    }
    /**
     * <code>string combat_id = 1;</code>
     * @param value The bytes for combatId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      combatId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList attackingPokemonId_ = emptyLongList();
    private void ensureAttackingPokemonIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attackingPokemonId_ = mutableCopy(attackingPokemonId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
     * @return A list containing the attackingPokemonId.
     */
    public java.util.List<java.lang.Long>
        getAttackingPokemonIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(attackingPokemonId_) : attackingPokemonId_;
    }
    /**
     * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
     * @return The count of attackingPokemonId.
     */
    public int getAttackingPokemonIdCount() {
      return attackingPokemonId_.size();
    }
    /**
     * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
     * @param index The index of the element to return.
     * @return The attackingPokemonId at the given index.
     */
    public long getAttackingPokemonId(int index) {
      return attackingPokemonId_.getLong(index);
    }
    /**
     * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
     * @param index The index to set the value at.
     * @param value The attackingPokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setAttackingPokemonId(
        int index, long value) {
      ensureAttackingPokemonIdIsMutable();
      attackingPokemonId_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
     * @param value The attackingPokemonId to add.
     * @return This builder for chaining.
     */
    public Builder addAttackingPokemonId(long value) {
      ensureAttackingPokemonIdIsMutable();
      attackingPokemonId_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
     * @param values The attackingPokemonId to add.
     * @return This builder for chaining.
     */
    public Builder addAllAttackingPokemonId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureAttackingPokemonIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, attackingPokemonId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttackingPokemonId() {
      attackingPokemonId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object combatLeagueTemplateId_ = "";
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @return The combatLeagueTemplateId.
     */
    public java.lang.String getCombatLeagueTemplateId() {
      java.lang.Object ref = combatLeagueTemplateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        combatLeagueTemplateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @return The bytes for combatLeagueTemplateId.
     */
    public com.google.protobuf.ByteString
        getCombatLeagueTemplateIdBytes() {
      java.lang.Object ref = combatLeagueTemplateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        combatLeagueTemplateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @param value The combatLeagueTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatLeagueTemplateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      combatLeagueTemplateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombatLeagueTemplateId() {
      
      combatLeagueTemplateId_ = getDefaultInstance().getCombatLeagueTemplateId();
      onChanged();
      return this;
    }
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @param value The bytes for combatLeagueTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatLeagueTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      combatLeagueTemplateId_ = value;
      onChanged();
      return this;
    }

    private long lobbyJoinTimeMs_ ;
    /**
     * <code>int64 lobby_join_time_ms = 4;</code>
     * @return The lobbyJoinTimeMs.
     */
    @java.lang.Override
    public long getLobbyJoinTimeMs() {
      return lobbyJoinTimeMs_;
    }
    /**
     * <code>int64 lobby_join_time_ms = 4;</code>
     * @param value The lobbyJoinTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setLobbyJoinTimeMs(long value) {
      
      lobbyJoinTimeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 lobby_join_time_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLobbyJoinTimeMs() {
      
      lobbyJoinTimeMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OpenCombatSessionProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OpenCombatSessionProto)
  private static final POGOProtos.Rpc.OpenCombatSessionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OpenCombatSessionProto();
  }

  public static POGOProtos.Rpc.OpenCombatSessionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenCombatSessionProto>
      PARSER = new com.google.protobuf.AbstractParser<OpenCombatSessionProto>() {
    @java.lang.Override
    public OpenCombatSessionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpenCombatSessionProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpenCombatSessionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenCombatSessionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OpenCombatSessionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

