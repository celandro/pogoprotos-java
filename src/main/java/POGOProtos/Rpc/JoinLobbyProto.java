// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.JoinLobbyProto}
 */
public final class JoinLobbyProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JoinLobbyProto)
    JoinLobbyProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JoinLobbyProto.newBuilder() to construct.
  private JoinLobbyProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinLobbyProto() {
    gymId_ = "";
    lobbyId_ = emptyIntList();
    inviterId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JoinLobbyProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JoinLobbyProto(
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
          case 32: {

            private_ = input.readBool();
            break;
          }
          case 41: {

            playerLatDegrees_ = input.readDouble();
            break;
          }
          case 49: {

            playerLngDegrees_ = input.readDouble();
            break;
          }
          case 57: {

            gymLatDegrees_ = input.readDouble();
            break;
          }
          case 65: {

            gymLngDegrees_ = input.readDouble();
            break;
          }
          case 72: {

            useRemotePass_ = input.readBool();
            break;
          }
          case 82: {
            java.lang.String s = input.readStringRequireUtf8();

            inviterId_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JoinLobbyProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JoinLobbyProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JoinLobbyProto.class, POGOProtos.Rpc.JoinLobbyProto.Builder.class);
  }

  public static final int RAID_SEED_FIELD_NUMBER = 1;
  private long raidSeed_;
  /**
   * <code>int64 raid_seed = 1;</code>
   * @return The raidSeed.
   */
  @java.lang.Override
  public long getRaidSeed() {
    return raidSeed_;
  }

  public static final int GYM_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object gymId_;
  /**
   * <code>string gym_id = 2;</code>
   * @return The gymId.
   */
  @java.lang.Override
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
  @java.lang.Override
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
  @java.lang.Override
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

  public static final int PRIVATE_FIELD_NUMBER = 4;
  private boolean private_;
  /**
   * <code>bool private = 4;</code>
   * @return The private.
   */
  @java.lang.Override
  public boolean getPrivate() {
    return private_;
  }

  public static final int PLAYER_LAT_DEGREES_FIELD_NUMBER = 5;
  private double playerLatDegrees_;
  /**
   * <code>double player_lat_degrees = 5;</code>
   * @return The playerLatDegrees.
   */
  @java.lang.Override
  public double getPlayerLatDegrees() {
    return playerLatDegrees_;
  }

  public static final int PLAYER_LNG_DEGREES_FIELD_NUMBER = 6;
  private double playerLngDegrees_;
  /**
   * <code>double player_lng_degrees = 6;</code>
   * @return The playerLngDegrees.
   */
  @java.lang.Override
  public double getPlayerLngDegrees() {
    return playerLngDegrees_;
  }

  public static final int GYM_LAT_DEGREES_FIELD_NUMBER = 7;
  private double gymLatDegrees_;
  /**
   * <code>double gym_lat_degrees = 7;</code>
   * @return The gymLatDegrees.
   */
  @java.lang.Override
  public double getGymLatDegrees() {
    return gymLatDegrees_;
  }

  public static final int GYM_LNG_DEGREES_FIELD_NUMBER = 8;
  private double gymLngDegrees_;
  /**
   * <code>double gym_lng_degrees = 8;</code>
   * @return The gymLngDegrees.
   */
  @java.lang.Override
  public double getGymLngDegrees() {
    return gymLngDegrees_;
  }

  public static final int USE_REMOTE_PASS_FIELD_NUMBER = 9;
  private boolean useRemotePass_;
  /**
   * <code>bool use_remote_pass = 9;</code>
   * @return The useRemotePass.
   */
  @java.lang.Override
  public boolean getUseRemotePass() {
    return useRemotePass_;
  }

  public static final int INVITER_ID_FIELD_NUMBER = 10;
  private volatile java.lang.Object inviterId_;
  /**
   * <code>string inviter_id = 10;</code>
   * @return The inviterId.
   */
  @java.lang.Override
  public java.lang.String getInviterId() {
    java.lang.Object ref = inviterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inviterId_ = s;
      return s;
    }
  }
  /**
   * <code>string inviter_id = 10;</code>
   * @return The bytes for inviterId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInviterIdBytes() {
    java.lang.Object ref = inviterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inviterId_ = b;
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
    if (private_ != false) {
      output.writeBool(4, private_);
    }
    if (playerLatDegrees_ != 0D) {
      output.writeDouble(5, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      output.writeDouble(6, playerLngDegrees_);
    }
    if (gymLatDegrees_ != 0D) {
      output.writeDouble(7, gymLatDegrees_);
    }
    if (gymLngDegrees_ != 0D) {
      output.writeDouble(8, gymLngDegrees_);
    }
    if (useRemotePass_ != false) {
      output.writeBool(9, useRemotePass_);
    }
    if (!getInviterIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, inviterId_);
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
    if (private_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, private_);
    }
    if (playerLatDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, playerLngDegrees_);
    }
    if (gymLatDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, gymLatDegrees_);
    }
    if (gymLngDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(8, gymLngDegrees_);
    }
    if (useRemotePass_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, useRemotePass_);
    }
    if (!getInviterIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, inviterId_);
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
    if (!(obj instanceof POGOProtos.Rpc.JoinLobbyProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JoinLobbyProto other = (POGOProtos.Rpc.JoinLobbyProto) obj;

    if (getRaidSeed()
        != other.getRaidSeed()) return false;
    if (!getGymId()
        .equals(other.getGymId())) return false;
    if (!getLobbyIdList()
        .equals(other.getLobbyIdList())) return false;
    if (getPrivate()
        != other.getPrivate()) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLatDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLatDegrees())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLngDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLngDegrees())) return false;
    if (java.lang.Double.doubleToLongBits(getGymLatDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getGymLatDegrees())) return false;
    if (java.lang.Double.doubleToLongBits(getGymLngDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getGymLngDegrees())) return false;
    if (getUseRemotePass()
        != other.getUseRemotePass()) return false;
    if (!getInviterId()
        .equals(other.getInviterId())) return false;
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
    hash = (37 * hash) + PRIVATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPrivate());
    hash = (37 * hash) + PLAYER_LAT_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLatDegrees()));
    hash = (37 * hash) + PLAYER_LNG_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLngDegrees()));
    hash = (37 * hash) + GYM_LAT_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGymLatDegrees()));
    hash = (37 * hash) + GYM_LNG_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGymLngDegrees()));
    hash = (37 * hash) + USE_REMOTE_PASS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseRemotePass());
    hash = (37 * hash) + INVITER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInviterId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JoinLobbyProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JoinLobbyProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.JoinLobbyProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JoinLobbyProto)
      POGOProtos.Rpc.JoinLobbyProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JoinLobbyProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JoinLobbyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JoinLobbyProto.class, POGOProtos.Rpc.JoinLobbyProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JoinLobbyProto.newBuilder()
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
      private_ = false;

      playerLatDegrees_ = 0D;

      playerLngDegrees_ = 0D;

      gymLatDegrees_ = 0D;

      gymLngDegrees_ = 0D;

      useRemotePass_ = false;

      inviterId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JoinLobbyProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JoinLobbyProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.JoinLobbyProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JoinLobbyProto build() {
      POGOProtos.Rpc.JoinLobbyProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JoinLobbyProto buildPartial() {
      POGOProtos.Rpc.JoinLobbyProto result = new POGOProtos.Rpc.JoinLobbyProto(this);
      int from_bitField0_ = bitField0_;
      result.raidSeed_ = raidSeed_;
      result.gymId_ = gymId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        lobbyId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.lobbyId_ = lobbyId_;
      result.private_ = private_;
      result.playerLatDegrees_ = playerLatDegrees_;
      result.playerLngDegrees_ = playerLngDegrees_;
      result.gymLatDegrees_ = gymLatDegrees_;
      result.gymLngDegrees_ = gymLngDegrees_;
      result.useRemotePass_ = useRemotePass_;
      result.inviterId_ = inviterId_;
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
      if (other instanceof POGOProtos.Rpc.JoinLobbyProto) {
        return mergeFrom((POGOProtos.Rpc.JoinLobbyProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JoinLobbyProto other) {
      if (other == POGOProtos.Rpc.JoinLobbyProto.getDefaultInstance()) return this;
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
      if (other.getPrivate() != false) {
        setPrivate(other.getPrivate());
      }
      if (other.getPlayerLatDegrees() != 0D) {
        setPlayerLatDegrees(other.getPlayerLatDegrees());
      }
      if (other.getPlayerLngDegrees() != 0D) {
        setPlayerLngDegrees(other.getPlayerLngDegrees());
      }
      if (other.getGymLatDegrees() != 0D) {
        setGymLatDegrees(other.getGymLatDegrees());
      }
      if (other.getGymLngDegrees() != 0D) {
        setGymLngDegrees(other.getGymLngDegrees());
      }
      if (other.getUseRemotePass() != false) {
        setUseRemotePass(other.getUseRemotePass());
      }
      if (!other.getInviterId().isEmpty()) {
        inviterId_ = other.inviterId_;
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
      POGOProtos.Rpc.JoinLobbyProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JoinLobbyProto) e.getUnfinishedMessage();
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
    @java.lang.Override
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

    private boolean private_ ;
    /**
     * <code>bool private = 4;</code>
     * @return The private.
     */
    @java.lang.Override
    public boolean getPrivate() {
      return private_;
    }
    /**
     * <code>bool private = 4;</code>
     * @param value The private to set.
     * @return This builder for chaining.
     */
    public Builder setPrivate(boolean value) {
      
      private_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool private = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrivate() {
      
      private_ = false;
      onChanged();
      return this;
    }

    private double playerLatDegrees_ ;
    /**
     * <code>double player_lat_degrees = 5;</code>
     * @return The playerLatDegrees.
     */
    @java.lang.Override
    public double getPlayerLatDegrees() {
      return playerLatDegrees_;
    }
    /**
     * <code>double player_lat_degrees = 5;</code>
     * @param value The playerLatDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLatDegrees(double value) {
      
      playerLatDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lat_degrees = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLatDegrees() {
      
      playerLatDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double playerLngDegrees_ ;
    /**
     * <code>double player_lng_degrees = 6;</code>
     * @return The playerLngDegrees.
     */
    @java.lang.Override
    public double getPlayerLngDegrees() {
      return playerLngDegrees_;
    }
    /**
     * <code>double player_lng_degrees = 6;</code>
     * @param value The playerLngDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLngDegrees(double value) {
      
      playerLngDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lng_degrees = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLngDegrees() {
      
      playerLngDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double gymLatDegrees_ ;
    /**
     * <code>double gym_lat_degrees = 7;</code>
     * @return The gymLatDegrees.
     */
    @java.lang.Override
    public double getGymLatDegrees() {
      return gymLatDegrees_;
    }
    /**
     * <code>double gym_lat_degrees = 7;</code>
     * @param value The gymLatDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setGymLatDegrees(double value) {
      
      gymLatDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_lat_degrees = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLatDegrees() {
      
      gymLatDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double gymLngDegrees_ ;
    /**
     * <code>double gym_lng_degrees = 8;</code>
     * @return The gymLngDegrees.
     */
    @java.lang.Override
    public double getGymLngDegrees() {
      return gymLngDegrees_;
    }
    /**
     * <code>double gym_lng_degrees = 8;</code>
     * @param value The gymLngDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setGymLngDegrees(double value) {
      
      gymLngDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_lng_degrees = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLngDegrees() {
      
      gymLngDegrees_ = 0D;
      onChanged();
      return this;
    }

    private boolean useRemotePass_ ;
    /**
     * <code>bool use_remote_pass = 9;</code>
     * @return The useRemotePass.
     */
    @java.lang.Override
    public boolean getUseRemotePass() {
      return useRemotePass_;
    }
    /**
     * <code>bool use_remote_pass = 9;</code>
     * @param value The useRemotePass to set.
     * @return This builder for chaining.
     */
    public Builder setUseRemotePass(boolean value) {
      
      useRemotePass_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool use_remote_pass = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseRemotePass() {
      
      useRemotePass_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object inviterId_ = "";
    /**
     * <code>string inviter_id = 10;</code>
     * @return The inviterId.
     */
    public java.lang.String getInviterId() {
      java.lang.Object ref = inviterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inviterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string inviter_id = 10;</code>
     * @return The bytes for inviterId.
     */
    public com.google.protobuf.ByteString
        getInviterIdBytes() {
      java.lang.Object ref = inviterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inviterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string inviter_id = 10;</code>
     * @param value The inviterId to set.
     * @return This builder for chaining.
     */
    public Builder setInviterId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      inviterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string inviter_id = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearInviterId() {
      
      inviterId_ = getDefaultInstance().getInviterId();
      onChanged();
      return this;
    }
    /**
     * <code>string inviter_id = 10;</code>
     * @param value The bytes for inviterId to set.
     * @return This builder for chaining.
     */
    public Builder setInviterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      inviterId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JoinLobbyProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JoinLobbyProto)
  private static final POGOProtos.Rpc.JoinLobbyProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JoinLobbyProto();
  }

  public static POGOProtos.Rpc.JoinLobbyProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinLobbyProto>
      PARSER = new com.google.protobuf.AbstractParser<JoinLobbyProto>() {
    @java.lang.Override
    public JoinLobbyProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JoinLobbyProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JoinLobbyProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinLobbyProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JoinLobbyProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
