// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto}
 */
public final class FriendshipMilestoneRewardNotificationProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto)
    FriendshipMilestoneRewardNotificationProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FriendshipMilestoneRewardNotificationProto.newBuilder() to construct.
  private FriendshipMilestoneRewardNotificationProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FriendshipMilestoneRewardNotificationProto() {
    friendId_ = "";
    friendCodename_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FriendshipMilestoneRewardNotificationProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FriendshipMilestoneRewardNotificationProto(
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

            friendId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            friendCodename_ = s;
            break;
          }
          case 24: {

            friendshipMilestoneLevel_ = input.readInt32();
            break;
          }
          case 32: {

            xpReward_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FriendshipMilestoneRewardNotificationProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FriendshipMilestoneRewardNotificationProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto.class, POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto.Builder.class);
  }

  public static final int FRIEND_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object friendId_;
  /**
   * <code>string friend_id = 1;</code>
   * @return The friendId.
   */
  @java.lang.Override
  public java.lang.String getFriendId() {
    java.lang.Object ref = friendId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      friendId_ = s;
      return s;
    }
  }
  /**
   * <code>string friend_id = 1;</code>
   * @return The bytes for friendId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFriendIdBytes() {
    java.lang.Object ref = friendId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      friendId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FRIEND_CODENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object friendCodename_;
  /**
   * <code>string friend_codename = 2;</code>
   * @return The friendCodename.
   */
  @java.lang.Override
  public java.lang.String getFriendCodename() {
    java.lang.Object ref = friendCodename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      friendCodename_ = s;
      return s;
    }
  }
  /**
   * <code>string friend_codename = 2;</code>
   * @return The bytes for friendCodename.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFriendCodenameBytes() {
    java.lang.Object ref = friendCodename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      friendCodename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FRIENDSHIP_MILESTONE_LEVEL_FIELD_NUMBER = 3;
  private int friendshipMilestoneLevel_;
  /**
   * <code>int32 friendship_milestone_level = 3;</code>
   * @return The friendshipMilestoneLevel.
   */
  @java.lang.Override
  public int getFriendshipMilestoneLevel() {
    return friendshipMilestoneLevel_;
  }

  public static final int XP_REWARD_FIELD_NUMBER = 4;
  private long xpReward_;
  /**
   * <code>int64 xp_reward = 4;</code>
   * @return The xpReward.
   */
  @java.lang.Override
  public long getXpReward() {
    return xpReward_;
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
    if (!getFriendIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, friendId_);
    }
    if (!getFriendCodenameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, friendCodename_);
    }
    if (friendshipMilestoneLevel_ != 0) {
      output.writeInt32(3, friendshipMilestoneLevel_);
    }
    if (xpReward_ != 0L) {
      output.writeInt64(4, xpReward_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFriendIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, friendId_);
    }
    if (!getFriendCodenameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, friendCodename_);
    }
    if (friendshipMilestoneLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, friendshipMilestoneLevel_);
    }
    if (xpReward_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, xpReward_);
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
    if (!(obj instanceof POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto other = (POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto) obj;

    if (!getFriendId()
        .equals(other.getFriendId())) return false;
    if (!getFriendCodename()
        .equals(other.getFriendCodename())) return false;
    if (getFriendshipMilestoneLevel()
        != other.getFriendshipMilestoneLevel()) return false;
    if (getXpReward()
        != other.getXpReward()) return false;
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
    hash = (37 * hash) + FRIEND_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFriendId().hashCode();
    hash = (37 * hash) + FRIEND_CODENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFriendCodename().hashCode();
    hash = (37 * hash) + FRIENDSHIP_MILESTONE_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getFriendshipMilestoneLevel();
    hash = (37 * hash) + XP_REWARD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getXpReward());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto)
      POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FriendshipMilestoneRewardNotificationProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FriendshipMilestoneRewardNotificationProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto.class, POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto.newBuilder()
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
      friendId_ = "";

      friendCodename_ = "";

      friendshipMilestoneLevel_ = 0;

      xpReward_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FriendshipMilestoneRewardNotificationProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto build() {
      POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto buildPartial() {
      POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto result = new POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto(this);
      result.friendId_ = friendId_;
      result.friendCodename_ = friendCodename_;
      result.friendshipMilestoneLevel_ = friendshipMilestoneLevel_;
      result.xpReward_ = xpReward_;
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
      if (other instanceof POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto) {
        return mergeFrom((POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto other) {
      if (other == POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto.getDefaultInstance()) return this;
      if (!other.getFriendId().isEmpty()) {
        friendId_ = other.friendId_;
        onChanged();
      }
      if (!other.getFriendCodename().isEmpty()) {
        friendCodename_ = other.friendCodename_;
        onChanged();
      }
      if (other.getFriendshipMilestoneLevel() != 0) {
        setFriendshipMilestoneLevel(other.getFriendshipMilestoneLevel());
      }
      if (other.getXpReward() != 0L) {
        setXpReward(other.getXpReward());
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
      POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object friendId_ = "";
    /**
     * <code>string friend_id = 1;</code>
     * @return The friendId.
     */
    public java.lang.String getFriendId() {
      java.lang.Object ref = friendId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        friendId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string friend_id = 1;</code>
     * @return The bytes for friendId.
     */
    public com.google.protobuf.ByteString
        getFriendIdBytes() {
      java.lang.Object ref = friendId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        friendId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string friend_id = 1;</code>
     * @param value The friendId to set.
     * @return This builder for chaining.
     */
    public Builder setFriendId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      friendId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string friend_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFriendId() {
      
      friendId_ = getDefaultInstance().getFriendId();
      onChanged();
      return this;
    }
    /**
     * <code>string friend_id = 1;</code>
     * @param value The bytes for friendId to set.
     * @return This builder for chaining.
     */
    public Builder setFriendIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      friendId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object friendCodename_ = "";
    /**
     * <code>string friend_codename = 2;</code>
     * @return The friendCodename.
     */
    public java.lang.String getFriendCodename() {
      java.lang.Object ref = friendCodename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        friendCodename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string friend_codename = 2;</code>
     * @return The bytes for friendCodename.
     */
    public com.google.protobuf.ByteString
        getFriendCodenameBytes() {
      java.lang.Object ref = friendCodename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        friendCodename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string friend_codename = 2;</code>
     * @param value The friendCodename to set.
     * @return This builder for chaining.
     */
    public Builder setFriendCodename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      friendCodename_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string friend_codename = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFriendCodename() {
      
      friendCodename_ = getDefaultInstance().getFriendCodename();
      onChanged();
      return this;
    }
    /**
     * <code>string friend_codename = 2;</code>
     * @param value The bytes for friendCodename to set.
     * @return This builder for chaining.
     */
    public Builder setFriendCodenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      friendCodename_ = value;
      onChanged();
      return this;
    }

    private int friendshipMilestoneLevel_ ;
    /**
     * <code>int32 friendship_milestone_level = 3;</code>
     * @return The friendshipMilestoneLevel.
     */
    @java.lang.Override
    public int getFriendshipMilestoneLevel() {
      return friendshipMilestoneLevel_;
    }
    /**
     * <code>int32 friendship_milestone_level = 3;</code>
     * @param value The friendshipMilestoneLevel to set.
     * @return This builder for chaining.
     */
    public Builder setFriendshipMilestoneLevel(int value) {
      
      friendshipMilestoneLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 friendship_milestone_level = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFriendshipMilestoneLevel() {
      
      friendshipMilestoneLevel_ = 0;
      onChanged();
      return this;
    }

    private long xpReward_ ;
    /**
     * <code>int64 xp_reward = 4;</code>
     * @return The xpReward.
     */
    @java.lang.Override
    public long getXpReward() {
      return xpReward_;
    }
    /**
     * <code>int64 xp_reward = 4;</code>
     * @param value The xpReward to set.
     * @return This builder for chaining.
     */
    public Builder setXpReward(long value) {
      
      xpReward_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 xp_reward = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearXpReward() {
      
      xpReward_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto)
  private static final POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto();
  }

  public static POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FriendshipMilestoneRewardNotificationProto>
      PARSER = new com.google.protobuf.AbstractParser<FriendshipMilestoneRewardNotificationProto>() {
    @java.lang.Override
    public FriendshipMilestoneRewardNotificationProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FriendshipMilestoneRewardNotificationProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FriendshipMilestoneRewardNotificationProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FriendshipMilestoneRewardNotificationProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FriendshipMilestoneRewardNotificationProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

