// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GymGetInfoProto}
 */
public final class GymGetInfoProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GymGetInfoProto)
    GymGetInfoProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GymGetInfoProto.newBuilder() to construct.
  private GymGetInfoProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GymGetInfoProto() {
    gymId_ = "";
    inviterId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GymGetInfoProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GymGetInfoProto(
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

            gymId_ = s;
            break;
          }
          case 17: {

            playerLatDegrees_ = input.readDouble();
            break;
          }
          case 25: {

            playerLngDegrees_ = input.readDouble();
            break;
          }
          case 33: {

            gymLatDegrees_ = input.readDouble();
            break;
          }
          case 41: {

            gymLngDegrees_ = input.readDouble();
            break;
          }
          case 50: {
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymGetInfoProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymGetInfoProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GymGetInfoProto.class, POGOProtos.Rpc.GymGetInfoProto.Builder.class);
  }

  public static final int GYM_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object gymId_;
  /**
   * <code>string gym_id = 1;</code>
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
   * <code>string gym_id = 1;</code>
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

  public static final int PLAYER_LAT_DEGREES_FIELD_NUMBER = 2;
  private double playerLatDegrees_;
  /**
   * <code>double player_lat_degrees = 2;</code>
   * @return The playerLatDegrees.
   */
  @java.lang.Override
  public double getPlayerLatDegrees() {
    return playerLatDegrees_;
  }

  public static final int PLAYER_LNG_DEGREES_FIELD_NUMBER = 3;
  private double playerLngDegrees_;
  /**
   * <code>double player_lng_degrees = 3;</code>
   * @return The playerLngDegrees.
   */
  @java.lang.Override
  public double getPlayerLngDegrees() {
    return playerLngDegrees_;
  }

  public static final int GYM_LAT_DEGREES_FIELD_NUMBER = 4;
  private double gymLatDegrees_;
  /**
   * <code>double gym_lat_degrees = 4;</code>
   * @return The gymLatDegrees.
   */
  @java.lang.Override
  public double getGymLatDegrees() {
    return gymLatDegrees_;
  }

  public static final int GYM_LNG_DEGREES_FIELD_NUMBER = 5;
  private double gymLngDegrees_;
  /**
   * <code>double gym_lng_degrees = 5;</code>
   * @return The gymLngDegrees.
   */
  @java.lang.Override
  public double getGymLngDegrees() {
    return gymLngDegrees_;
  }

  public static final int INVITER_ID_FIELD_NUMBER = 6;
  private volatile java.lang.Object inviterId_;
  /**
   * <code>string inviter_id = 6;</code>
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
   * <code>string inviter_id = 6;</code>
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
    if (!getGymIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gymId_);
    }
    if (playerLatDegrees_ != 0D) {
      output.writeDouble(2, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      output.writeDouble(3, playerLngDegrees_);
    }
    if (gymLatDegrees_ != 0D) {
      output.writeDouble(4, gymLatDegrees_);
    }
    if (gymLngDegrees_ != 0D) {
      output.writeDouble(5, gymLngDegrees_);
    }
    if (!getInviterIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, inviterId_);
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
    if (playerLatDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, playerLngDegrees_);
    }
    if (gymLatDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, gymLatDegrees_);
    }
    if (gymLngDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, gymLngDegrees_);
    }
    if (!getInviterIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, inviterId_);
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
    if (!(obj instanceof POGOProtos.Rpc.GymGetInfoProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GymGetInfoProto other = (POGOProtos.Rpc.GymGetInfoProto) obj;

    if (!getGymId()
        .equals(other.getGymId())) return false;
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
    hash = (37 * hash) + GYM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGymId().hashCode();
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
    hash = (37 * hash) + INVITER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInviterId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymGetInfoProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GymGetInfoProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GymGetInfoProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GymGetInfoProto)
      POGOProtos.Rpc.GymGetInfoProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymGetInfoProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymGetInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GymGetInfoProto.class, POGOProtos.Rpc.GymGetInfoProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GymGetInfoProto.newBuilder()
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

      playerLatDegrees_ = 0D;

      playerLngDegrees_ = 0D;

      gymLatDegrees_ = 0D;

      gymLngDegrees_ = 0D;

      inviterId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymGetInfoProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymGetInfoProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GymGetInfoProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymGetInfoProto build() {
      POGOProtos.Rpc.GymGetInfoProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymGetInfoProto buildPartial() {
      POGOProtos.Rpc.GymGetInfoProto result = new POGOProtos.Rpc.GymGetInfoProto(this);
      result.gymId_ = gymId_;
      result.playerLatDegrees_ = playerLatDegrees_;
      result.playerLngDegrees_ = playerLngDegrees_;
      result.gymLatDegrees_ = gymLatDegrees_;
      result.gymLngDegrees_ = gymLngDegrees_;
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
      if (other instanceof POGOProtos.Rpc.GymGetInfoProto) {
        return mergeFrom((POGOProtos.Rpc.GymGetInfoProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GymGetInfoProto other) {
      if (other == POGOProtos.Rpc.GymGetInfoProto.getDefaultInstance()) return this;
      if (!other.getGymId().isEmpty()) {
        gymId_ = other.gymId_;
        onChanged();
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
      POGOProtos.Rpc.GymGetInfoProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GymGetInfoProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private double playerLatDegrees_ ;
    /**
     * <code>double player_lat_degrees = 2;</code>
     * @return The playerLatDegrees.
     */
    @java.lang.Override
    public double getPlayerLatDegrees() {
      return playerLatDegrees_;
    }
    /**
     * <code>double player_lat_degrees = 2;</code>
     * @param value The playerLatDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLatDegrees(double value) {
      
      playerLatDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lat_degrees = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLatDegrees() {
      
      playerLatDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double playerLngDegrees_ ;
    /**
     * <code>double player_lng_degrees = 3;</code>
     * @return The playerLngDegrees.
     */
    @java.lang.Override
    public double getPlayerLngDegrees() {
      return playerLngDegrees_;
    }
    /**
     * <code>double player_lng_degrees = 3;</code>
     * @param value The playerLngDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLngDegrees(double value) {
      
      playerLngDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lng_degrees = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLngDegrees() {
      
      playerLngDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double gymLatDegrees_ ;
    /**
     * <code>double gym_lat_degrees = 4;</code>
     * @return The gymLatDegrees.
     */
    @java.lang.Override
    public double getGymLatDegrees() {
      return gymLatDegrees_;
    }
    /**
     * <code>double gym_lat_degrees = 4;</code>
     * @param value The gymLatDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setGymLatDegrees(double value) {
      
      gymLatDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_lat_degrees = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLatDegrees() {
      
      gymLatDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double gymLngDegrees_ ;
    /**
     * <code>double gym_lng_degrees = 5;</code>
     * @return The gymLngDegrees.
     */
    @java.lang.Override
    public double getGymLngDegrees() {
      return gymLngDegrees_;
    }
    /**
     * <code>double gym_lng_degrees = 5;</code>
     * @param value The gymLngDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setGymLngDegrees(double value) {
      
      gymLngDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_lng_degrees = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLngDegrees() {
      
      gymLngDegrees_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object inviterId_ = "";
    /**
     * <code>string inviter_id = 6;</code>
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
     * <code>string inviter_id = 6;</code>
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
     * <code>string inviter_id = 6;</code>
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
     * <code>string inviter_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearInviterId() {
      
      inviterId_ = getDefaultInstance().getInviterId();
      onChanged();
      return this;
    }
    /**
     * <code>string inviter_id = 6;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GymGetInfoProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GymGetInfoProto)
  private static final POGOProtos.Rpc.GymGetInfoProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GymGetInfoProto();
  }

  public static POGOProtos.Rpc.GymGetInfoProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GymGetInfoProto>
      PARSER = new com.google.protobuf.AbstractParser<GymGetInfoProto>() {
    @java.lang.Override
    public GymGetInfoProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GymGetInfoProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GymGetInfoProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GymGetInfoProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GymGetInfoProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

