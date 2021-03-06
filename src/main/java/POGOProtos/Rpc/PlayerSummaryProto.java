// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlayerSummaryProto}
 */
public final class PlayerSummaryProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlayerSummaryProto)
    PlayerSummaryProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerSummaryProto.newBuilder() to construct.
  private PlayerSummaryProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerSummaryProto() {
    playerId_ = "";
    codename_ = "";
    publicData_ = com.google.protobuf.ByteString.EMPTY;
    team_ = "";
    fbUserId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerSummaryProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlayerSummaryProto(
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
            java.lang.String s = input.readStringRequireUtf8();

            playerId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            codename_ = s;
            break;
          }
          case 26: {

            publicData_ = input.readBytes();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            team_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            fbUserId_ = s;
            break;
          }
          case 48: {

            level_ = input.readInt32();
            break;
          }
          case 56: {

            experience_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSummaryProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSummaryProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlayerSummaryProto.class, POGOProtos.Rpc.PlayerSummaryProto.Builder.class);
  }

  public static final int PLAYER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object playerId_;
  /**
   * <code>string player_id = 1;</code>
   * @return The playerId.
   */
  @java.lang.Override
  public java.lang.String getPlayerId() {
    java.lang.Object ref = playerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      playerId_ = s;
      return s;
    }
  }
  /**
   * <code>string player_id = 1;</code>
   * @return The bytes for playerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlayerIdBytes() {
    java.lang.Object ref = playerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      playerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object codename_;
  /**
   * <code>string codename = 2;</code>
   * @return The codename.
   */
  @java.lang.Override
  public java.lang.String getCodename() {
    java.lang.Object ref = codename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codename_ = s;
      return s;
    }
  }
  /**
   * <code>string codename = 2;</code>
   * @return The bytes for codename.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodenameBytes() {
    java.lang.Object ref = codename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLIC_DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString publicData_;
  /**
   * <code>bytes public_data = 3;</code>
   * @return The publicData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPublicData() {
    return publicData_;
  }

  public static final int TEAM_FIELD_NUMBER = 4;
  private volatile java.lang.Object team_;
  /**
   * <code>string team = 4;</code>
   * @return The team.
   */
  @java.lang.Override
  public java.lang.String getTeam() {
    java.lang.Object ref = team_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      team_ = s;
      return s;
    }
  }
  /**
   * <code>string team = 4;</code>
   * @return The bytes for team.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTeamBytes() {
    java.lang.Object ref = team_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      team_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FB_USER_ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object fbUserId_;
  /**
   * <code>string fb_user_id = 5;</code>
   * @return The fbUserId.
   */
  @java.lang.Override
  public java.lang.String getFbUserId() {
    java.lang.Object ref = fbUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fbUserId_ = s;
      return s;
    }
  }
  /**
   * <code>string fb_user_id = 5;</code>
   * @return The bytes for fbUserId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFbUserIdBytes() {
    java.lang.Object ref = fbUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fbUserId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEVEL_FIELD_NUMBER = 6;
  private int level_;
  /**
   * <code>int32 level = 6;</code>
   * @return The level.
   */
  @java.lang.Override
  public int getLevel() {
    return level_;
  }

  public static final int EXPERIENCE_FIELD_NUMBER = 7;
  private long experience_;
  /**
   * <code>int64 experience = 7;</code>
   * @return The experience.
   */
  @java.lang.Override
  public long getExperience() {
    return experience_;
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
    if (!getPlayerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, playerId_);
    }
    if (!getCodenameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, codename_);
    }
    if (!publicData_.isEmpty()) {
      output.writeBytes(3, publicData_);
    }
    if (!getTeamBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, team_);
    }
    if (!getFbUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, fbUserId_);
    }
    if (level_ != 0) {
      output.writeInt32(6, level_);
    }
    if (experience_ != 0L) {
      output.writeInt64(7, experience_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPlayerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, playerId_);
    }
    if (!getCodenameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, codename_);
    }
    if (!publicData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, publicData_);
    }
    if (!getTeamBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, team_);
    }
    if (!getFbUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, fbUserId_);
    }
    if (level_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, level_);
    }
    if (experience_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, experience_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlayerSummaryProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlayerSummaryProto other = (POGOProtos.Rpc.PlayerSummaryProto) obj;

    if (!getPlayerId()
        .equals(other.getPlayerId())) return false;
    if (!getCodename()
        .equals(other.getCodename())) return false;
    if (!getPublicData()
        .equals(other.getPublicData())) return false;
    if (!getTeam()
        .equals(other.getTeam())) return false;
    if (!getFbUserId()
        .equals(other.getFbUserId())) return false;
    if (getLevel()
        != other.getLevel()) return false;
    if (getExperience()
        != other.getExperience()) return false;
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
    hash = (37 * hash) + PLAYER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPlayerId().hashCode();
    hash = (37 * hash) + CODENAME_FIELD_NUMBER;
    hash = (53 * hash) + getCodename().hashCode();
    hash = (37 * hash) + PUBLIC_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getPublicData().hashCode();
    hash = (37 * hash) + TEAM_FIELD_NUMBER;
    hash = (53 * hash) + getTeam().hashCode();
    hash = (37 * hash) + FB_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFbUserId().hashCode();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getLevel();
    hash = (37 * hash) + EXPERIENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExperience());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerSummaryProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlayerSummaryProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlayerSummaryProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlayerSummaryProto)
      POGOProtos.Rpc.PlayerSummaryProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSummaryProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSummaryProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlayerSummaryProto.class, POGOProtos.Rpc.PlayerSummaryProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlayerSummaryProto.newBuilder()
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
      playerId_ = "";

      codename_ = "";

      publicData_ = com.google.protobuf.ByteString.EMPTY;

      team_ = "";

      fbUserId_ = "";

      level_ = 0;

      experience_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSummaryProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerSummaryProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlayerSummaryProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerSummaryProto build() {
      POGOProtos.Rpc.PlayerSummaryProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerSummaryProto buildPartial() {
      POGOProtos.Rpc.PlayerSummaryProto result = new POGOProtos.Rpc.PlayerSummaryProto(this);
      result.playerId_ = playerId_;
      result.codename_ = codename_;
      result.publicData_ = publicData_;
      result.team_ = team_;
      result.fbUserId_ = fbUserId_;
      result.level_ = level_;
      result.experience_ = experience_;
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
      if (other instanceof POGOProtos.Rpc.PlayerSummaryProto) {
        return mergeFrom((POGOProtos.Rpc.PlayerSummaryProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlayerSummaryProto other) {
      if (other == POGOProtos.Rpc.PlayerSummaryProto.getDefaultInstance()) return this;
      if (!other.getPlayerId().isEmpty()) {
        playerId_ = other.playerId_;
        onChanged();
      }
      if (!other.getCodename().isEmpty()) {
        codename_ = other.codename_;
        onChanged();
      }
      if (other.getPublicData() != com.google.protobuf.ByteString.EMPTY) {
        setPublicData(other.getPublicData());
      }
      if (!other.getTeam().isEmpty()) {
        team_ = other.team_;
        onChanged();
      }
      if (!other.getFbUserId().isEmpty()) {
        fbUserId_ = other.fbUserId_;
        onChanged();
      }
      if (other.getLevel() != 0) {
        setLevel(other.getLevel());
      }
      if (other.getExperience() != 0L) {
        setExperience(other.getExperience());
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
      POGOProtos.Rpc.PlayerSummaryProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlayerSummaryProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object playerId_ = "";
    /**
     * <code>string player_id = 1;</code>
     * @return The playerId.
     */
    public java.lang.String getPlayerId() {
      java.lang.Object ref = playerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        playerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string player_id = 1;</code>
     * @return The bytes for playerId.
     */
    public com.google.protobuf.ByteString
        getPlayerIdBytes() {
      java.lang.Object ref = playerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        playerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string player_id = 1;</code>
     * @param value The playerId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      playerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string player_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerId() {
      
      playerId_ = getDefaultInstance().getPlayerId();
      onChanged();
      return this;
    }
    /**
     * <code>string player_id = 1;</code>
     * @param value The bytes for playerId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      playerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object codename_ = "";
    /**
     * <code>string codename = 2;</code>
     * @return The codename.
     */
    public java.lang.String getCodename() {
      java.lang.Object ref = codename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string codename = 2;</code>
     * @return The bytes for codename.
     */
    public com.google.protobuf.ByteString
        getCodenameBytes() {
      java.lang.Object ref = codename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string codename = 2;</code>
     * @param value The codename to set.
     * @return This builder for chaining.
     */
    public Builder setCodename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codename_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string codename = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCodename() {
      
      codename_ = getDefaultInstance().getCodename();
      onChanged();
      return this;
    }
    /**
     * <code>string codename = 2;</code>
     * @param value The bytes for codename to set.
     * @return This builder for chaining.
     */
    public Builder setCodenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codename_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString publicData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes public_data = 3;</code>
     * @return The publicData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPublicData() {
      return publicData_;
    }
    /**
     * <code>bytes public_data = 3;</code>
     * @param value The publicData to set.
     * @return This builder for chaining.
     */
    public Builder setPublicData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      publicData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes public_data = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPublicData() {
      
      publicData_ = getDefaultInstance().getPublicData();
      onChanged();
      return this;
    }

    private java.lang.Object team_ = "";
    /**
     * <code>string team = 4;</code>
     * @return The team.
     */
    public java.lang.String getTeam() {
      java.lang.Object ref = team_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        team_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string team = 4;</code>
     * @return The bytes for team.
     */
    public com.google.protobuf.ByteString
        getTeamBytes() {
      java.lang.Object ref = team_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        team_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string team = 4;</code>
     * @param value The team to set.
     * @return This builder for chaining.
     */
    public Builder setTeam(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      team_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string team = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeam() {
      
      team_ = getDefaultInstance().getTeam();
      onChanged();
      return this;
    }
    /**
     * <code>string team = 4;</code>
     * @param value The bytes for team to set.
     * @return This builder for chaining.
     */
    public Builder setTeamBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      team_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fbUserId_ = "";
    /**
     * <code>string fb_user_id = 5;</code>
     * @return The fbUserId.
     */
    public java.lang.String getFbUserId() {
      java.lang.Object ref = fbUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fbUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fb_user_id = 5;</code>
     * @return The bytes for fbUserId.
     */
    public com.google.protobuf.ByteString
        getFbUserIdBytes() {
      java.lang.Object ref = fbUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fbUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fb_user_id = 5;</code>
     * @param value The fbUserId to set.
     * @return This builder for chaining.
     */
    public Builder setFbUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fbUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fb_user_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFbUserId() {
      
      fbUserId_ = getDefaultInstance().getFbUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string fb_user_id = 5;</code>
     * @param value The bytes for fbUserId to set.
     * @return This builder for chaining.
     */
    public Builder setFbUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fbUserId_ = value;
      onChanged();
      return this;
    }

    private int level_ ;
    /**
     * <code>int32 level = 6;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }
    /**
     * <code>int32 level = 6;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(int value) {
      
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 level = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      
      level_ = 0;
      onChanged();
      return this;
    }

    private long experience_ ;
    /**
     * <code>int64 experience = 7;</code>
     * @return The experience.
     */
    @java.lang.Override
    public long getExperience() {
      return experience_;
    }
    /**
     * <code>int64 experience = 7;</code>
     * @param value The experience to set.
     * @return This builder for chaining.
     */
    public Builder setExperience(long value) {
      
      experience_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 experience = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearExperience() {
      
      experience_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlayerSummaryProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlayerSummaryProto)
  private static final POGOProtos.Rpc.PlayerSummaryProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlayerSummaryProto();
  }

  public static POGOProtos.Rpc.PlayerSummaryProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerSummaryProto>
      PARSER = new com.google.protobuf.AbstractParser<PlayerSummaryProto>() {
    @java.lang.Override
    public PlayerSummaryProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlayerSummaryProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlayerSummaryProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerSummaryProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlayerSummaryProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

