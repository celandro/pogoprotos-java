// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GymStartSessionProto}
 */
public  final class GymStartSessionProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GymStartSessionProto)
    GymStartSessionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GymStartSessionProto.newBuilder() to construct.
  private GymStartSessionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GymStartSessionProto() {
    gymId_ = "";
    attackingPokemonId_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GymStartSessionProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GymStartSessionProto(
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

            gymId_ = s;
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
          case 25: {

            defendingPokemonId_ = input.readFixed64();
            break;
          }
          case 33: {

            playerLatDegrees_ = input.readDouble();
            break;
          }
          case 41: {

            playerLngDegrees_ = input.readDouble();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymStartSessionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymStartSessionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GymStartSessionProto.class, POGOProtos.Rpc.GymStartSessionProto.Builder.class);
  }

  public static final int GYM_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object gymId_;
  /**
   * <code>string gym_id = 1;</code>
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
   * <code>string gym_id = 1;</code>
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

  public static final int ATTACKING_POKEMON_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList attackingPokemonId_;
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @return A list containing the attackingPokemonId.
   */
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

  public static final int DEFENDING_POKEMON_ID_FIELD_NUMBER = 3;
  private long defendingPokemonId_;
  /**
   * <code>fixed64 defending_pokemon_id = 3;</code>
   * @return The defendingPokemonId.
   */
  public long getDefendingPokemonId() {
    return defendingPokemonId_;
  }

  public static final int PLAYER_LAT_DEGREES_FIELD_NUMBER = 4;
  private double playerLatDegrees_;
  /**
   * <code>double player_lat_degrees = 4;</code>
   * @return The playerLatDegrees.
   */
  public double getPlayerLatDegrees() {
    return playerLatDegrees_;
  }

  public static final int PLAYER_LNG_DEGREES_FIELD_NUMBER = 5;
  private double playerLngDegrees_;
  /**
   * <code>double player_lng_degrees = 5;</code>
   * @return The playerLngDegrees.
   */
  public double getPlayerLngDegrees() {
    return playerLngDegrees_;
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
    if (!getGymIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gymId_);
    }
    if (getAttackingPokemonIdList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(attackingPokemonIdMemoizedSerializedSize);
    }
    for (int i = 0; i < attackingPokemonId_.size(); i++) {
      output.writeFixed64NoTag(attackingPokemonId_.getLong(i));
    }
    if (defendingPokemonId_ != 0L) {
      output.writeFixed64(3, defendingPokemonId_);
    }
    if (playerLatDegrees_ != 0D) {
      output.writeDouble(4, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      output.writeDouble(5, playerLngDegrees_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGymIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gymId_);
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
    if (defendingPokemonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(3, defendingPokemonId_);
    }
    if (playerLatDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, playerLngDegrees_);
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
    if (!(obj instanceof POGOProtos.Rpc.GymStartSessionProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GymStartSessionProto other = (POGOProtos.Rpc.GymStartSessionProto) obj;

    if (!getGymId()
        .equals(other.getGymId())) return false;
    if (!getAttackingPokemonIdList()
        .equals(other.getAttackingPokemonIdList())) return false;
    if (getDefendingPokemonId()
        != other.getDefendingPokemonId()) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLatDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLatDegrees())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLngDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLngDegrees())) return false;
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
    hash = (37 * hash) + GYM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGymId().hashCode();
    if (getAttackingPokemonIdCount() > 0) {
      hash = (37 * hash) + ATTACKING_POKEMON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAttackingPokemonIdList().hashCode();
    }
    hash = (37 * hash) + DEFENDING_POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDefendingPokemonId());
    hash = (37 * hash) + PLAYER_LAT_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLatDegrees()));
    hash = (37 * hash) + PLAYER_LNG_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLngDegrees()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymStartSessionProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GymStartSessionProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GymStartSessionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GymStartSessionProto)
      POGOProtos.Rpc.GymStartSessionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymStartSessionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymStartSessionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GymStartSessionProto.class, POGOProtos.Rpc.GymStartSessionProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GymStartSessionProto.newBuilder()
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
      gymId_ = "";

      attackingPokemonId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      defendingPokemonId_ = 0L;

      playerLatDegrees_ = 0D;

      playerLngDegrees_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GymStartSessionProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymStartSessionProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GymStartSessionProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymStartSessionProto build() {
      POGOProtos.Rpc.GymStartSessionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymStartSessionProto buildPartial() {
      POGOProtos.Rpc.GymStartSessionProto result = new POGOProtos.Rpc.GymStartSessionProto(this);
      int from_bitField0_ = bitField0_;
      result.gymId_ = gymId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        attackingPokemonId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.attackingPokemonId_ = attackingPokemonId_;
      result.defendingPokemonId_ = defendingPokemonId_;
      result.playerLatDegrees_ = playerLatDegrees_;
      result.playerLngDegrees_ = playerLngDegrees_;
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
      if (other instanceof POGOProtos.Rpc.GymStartSessionProto) {
        return mergeFrom((POGOProtos.Rpc.GymStartSessionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GymStartSessionProto other) {
      if (other == POGOProtos.Rpc.GymStartSessionProto.getDefaultInstance()) return this;
      if (!other.getGymId().isEmpty()) {
        gymId_ = other.gymId_;
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
      if (other.getDefendingPokemonId() != 0L) {
        setDefendingPokemonId(other.getDefendingPokemonId());
      }
      if (other.getPlayerLatDegrees() != 0D) {
        setPlayerLatDegrees(other.getPlayerLatDegrees());
      }
      if (other.getPlayerLngDegrees() != 0D) {
        setPlayerLngDegrees(other.getPlayerLngDegrees());
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
      POGOProtos.Rpc.GymStartSessionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GymStartSessionProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object gymId_ = "";
    /**
     * <code>string gym_id = 1;</code>
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
     * <code>string gym_id = 1;</code>
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
     * <code>string gym_id = 1;</code>
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
     * <code>string gym_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymId() {
      
      gymId_ = getDefaultInstance().getGymId();
      onChanged();
      return this;
    }
    /**
     * <code>string gym_id = 1;</code>
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

    private long defendingPokemonId_ ;
    /**
     * <code>fixed64 defending_pokemon_id = 3;</code>
     * @return The defendingPokemonId.
     */
    public long getDefendingPokemonId() {
      return defendingPokemonId_;
    }
    /**
     * <code>fixed64 defending_pokemon_id = 3;</code>
     * @param value The defendingPokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setDefendingPokemonId(long value) {
      
      defendingPokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 defending_pokemon_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefendingPokemonId() {
      
      defendingPokemonId_ = 0L;
      onChanged();
      return this;
    }

    private double playerLatDegrees_ ;
    /**
     * <code>double player_lat_degrees = 4;</code>
     * @return The playerLatDegrees.
     */
    public double getPlayerLatDegrees() {
      return playerLatDegrees_;
    }
    /**
     * <code>double player_lat_degrees = 4;</code>
     * @param value The playerLatDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLatDegrees(double value) {
      
      playerLatDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lat_degrees = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLatDegrees() {
      
      playerLatDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double playerLngDegrees_ ;
    /**
     * <code>double player_lng_degrees = 5;</code>
     * @return The playerLngDegrees.
     */
    public double getPlayerLngDegrees() {
      return playerLngDegrees_;
    }
    /**
     * <code>double player_lng_degrees = 5;</code>
     * @param value The playerLngDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLngDegrees(double value) {
      
      playerLngDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lng_degrees = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLngDegrees() {
      
      playerLngDegrees_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GymStartSessionProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GymStartSessionProto)
  private static final POGOProtos.Rpc.GymStartSessionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GymStartSessionProto();
  }

  public static POGOProtos.Rpc.GymStartSessionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GymStartSessionProto>
      PARSER = new com.google.protobuf.AbstractParser<GymStartSessionProto>() {
    @java.lang.Override
    public GymStartSessionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GymStartSessionProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GymStartSessionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GymStartSessionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GymStartSessionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

