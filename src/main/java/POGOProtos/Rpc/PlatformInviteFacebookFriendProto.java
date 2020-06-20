// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformInviteFacebookFriendProto}
 */
public  final class PlatformInviteFacebookFriendProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformInviteFacebookFriendProto)
    PlatformInviteFacebookFriendProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformInviteFacebookFriendProto.newBuilder() to construct.
  private PlatformInviteFacebookFriendProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformInviteFacebookFriendProto() {
    fbAccessToken_ = "";
    friendFbUserId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformInviteFacebookFriendProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformInviteFacebookFriendProto(
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

            fbAccessToken_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            friendFbUserId_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformInviteFacebookFriendProto.class, POGOProtos.Rpc.PlatformInviteFacebookFriendProto.Builder.class);
  }

  public static final int FB_ACCESS_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object fbAccessToken_;
  /**
   * <code>string fb_access_token = 1;</code>
   * @return The fbAccessToken.
   */
  public java.lang.String getFbAccessToken() {
    java.lang.Object ref = fbAccessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fbAccessToken_ = s;
      return s;
    }
  }
  /**
   * <code>string fb_access_token = 1;</code>
   * @return The bytes for fbAccessToken.
   */
  public com.google.protobuf.ByteString
      getFbAccessTokenBytes() {
    java.lang.Object ref = fbAccessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fbAccessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FRIEND_FB_USER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object friendFbUserId_;
  /**
   * <code>string friend_fb_user_id = 2;</code>
   * @return The friendFbUserId.
   */
  public java.lang.String getFriendFbUserId() {
    java.lang.Object ref = friendFbUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      friendFbUserId_ = s;
      return s;
    }
  }
  /**
   * <code>string friend_fb_user_id = 2;</code>
   * @return The bytes for friendFbUserId.
   */
  public com.google.protobuf.ByteString
      getFriendFbUserIdBytes() {
    java.lang.Object ref = friendFbUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      friendFbUserId_ = b;
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
    if (!getFbAccessTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fbAccessToken_);
    }
    if (!getFriendFbUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, friendFbUserId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFbAccessTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fbAccessToken_);
    }
    if (!getFriendFbUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, friendFbUserId_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformInviteFacebookFriendProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformInviteFacebookFriendProto other = (POGOProtos.Rpc.PlatformInviteFacebookFriendProto) obj;

    if (!getFbAccessToken()
        .equals(other.getFbAccessToken())) return false;
    if (!getFriendFbUserId()
        .equals(other.getFriendFbUserId())) return false;
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
    hash = (37 * hash) + FB_ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getFbAccessToken().hashCode();
    hash = (37 * hash) + FRIEND_FB_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFriendFbUserId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformInviteFacebookFriendProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformInviteFacebookFriendProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformInviteFacebookFriendProto)
      POGOProtos.Rpc.PlatformInviteFacebookFriendProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformInviteFacebookFriendProto.class, POGOProtos.Rpc.PlatformInviteFacebookFriendProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformInviteFacebookFriendProto.newBuilder()
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
      fbAccessToken_ = "";

      friendFbUserId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformInviteFacebookFriendProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformInviteFacebookFriendProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformInviteFacebookFriendProto build() {
      POGOProtos.Rpc.PlatformInviteFacebookFriendProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformInviteFacebookFriendProto buildPartial() {
      POGOProtos.Rpc.PlatformInviteFacebookFriendProto result = new POGOProtos.Rpc.PlatformInviteFacebookFriendProto(this);
      result.fbAccessToken_ = fbAccessToken_;
      result.friendFbUserId_ = friendFbUserId_;
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
      if (other instanceof POGOProtos.Rpc.PlatformInviteFacebookFriendProto) {
        return mergeFrom((POGOProtos.Rpc.PlatformInviteFacebookFriendProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformInviteFacebookFriendProto other) {
      if (other == POGOProtos.Rpc.PlatformInviteFacebookFriendProto.getDefaultInstance()) return this;
      if (!other.getFbAccessToken().isEmpty()) {
        fbAccessToken_ = other.fbAccessToken_;
        onChanged();
      }
      if (!other.getFriendFbUserId().isEmpty()) {
        friendFbUserId_ = other.friendFbUserId_;
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
      POGOProtos.Rpc.PlatformInviteFacebookFriendProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformInviteFacebookFriendProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fbAccessToken_ = "";
    /**
     * <code>string fb_access_token = 1;</code>
     * @return The fbAccessToken.
     */
    public java.lang.String getFbAccessToken() {
      java.lang.Object ref = fbAccessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fbAccessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fb_access_token = 1;</code>
     * @return The bytes for fbAccessToken.
     */
    public com.google.protobuf.ByteString
        getFbAccessTokenBytes() {
      java.lang.Object ref = fbAccessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fbAccessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fb_access_token = 1;</code>
     * @param value The fbAccessToken to set.
     * @return This builder for chaining.
     */
    public Builder setFbAccessToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fbAccessToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fb_access_token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFbAccessToken() {
      
      fbAccessToken_ = getDefaultInstance().getFbAccessToken();
      onChanged();
      return this;
    }
    /**
     * <code>string fb_access_token = 1;</code>
     * @param value The bytes for fbAccessToken to set.
     * @return This builder for chaining.
     */
    public Builder setFbAccessTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fbAccessToken_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object friendFbUserId_ = "";
    /**
     * <code>string friend_fb_user_id = 2;</code>
     * @return The friendFbUserId.
     */
    public java.lang.String getFriendFbUserId() {
      java.lang.Object ref = friendFbUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        friendFbUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string friend_fb_user_id = 2;</code>
     * @return The bytes for friendFbUserId.
     */
    public com.google.protobuf.ByteString
        getFriendFbUserIdBytes() {
      java.lang.Object ref = friendFbUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        friendFbUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string friend_fb_user_id = 2;</code>
     * @param value The friendFbUserId to set.
     * @return This builder for chaining.
     */
    public Builder setFriendFbUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      friendFbUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string friend_fb_user_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFriendFbUserId() {
      
      friendFbUserId_ = getDefaultInstance().getFriendFbUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string friend_fb_user_id = 2;</code>
     * @param value The bytes for friendFbUserId to set.
     * @return This builder for chaining.
     */
    public Builder setFriendFbUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      friendFbUserId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformInviteFacebookFriendProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformInviteFacebookFriendProto)
  private static final POGOProtos.Rpc.PlatformInviteFacebookFriendProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformInviteFacebookFriendProto();
  }

  public static POGOProtos.Rpc.PlatformInviteFacebookFriendProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformInviteFacebookFriendProto>
      PARSER = new com.google.protobuf.AbstractParser<PlatformInviteFacebookFriendProto>() {
    @java.lang.Override
    public PlatformInviteFacebookFriendProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformInviteFacebookFriendProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformInviteFacebookFriendProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformInviteFacebookFriendProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformInviteFacebookFriendProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

