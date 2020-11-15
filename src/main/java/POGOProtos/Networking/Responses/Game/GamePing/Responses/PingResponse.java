// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePing/Responses/PingResponse.proto

package POGOProtos.Networking.Responses.Game.GamePing.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse}
 */
public final class PingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse)
    PingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PingResponse.newBuilder() to construct.
  private PingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PingResponse() {
    userInfo_ = "";
    serverInfo_ = "";
    randomResponseBytes_ = "";
    returnValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PingResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PingResponse(
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

            userInfo_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            serverInfo_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            randomResponseBytes_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            returnValue_ = s;
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
    return POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePing_Responses_PingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePing_Responses_PingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse.class, POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse.Builder.class);
  }

  public static final int USER_INFO_FIELD_NUMBER = 1;
  private volatile java.lang.Object userInfo_;
  /**
   * <code>string user_info = 1;</code>
   * @return The userInfo.
   */
  @java.lang.Override
  public java.lang.String getUserInfo() {
    java.lang.Object ref = userInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string user_info = 1;</code>
   * @return The bytes for userInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserInfoBytes() {
    java.lang.Object ref = userInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVER_INFO_FIELD_NUMBER = 2;
  private volatile java.lang.Object serverInfo_;
  /**
   * <code>string server_info = 2;</code>
   * @return The serverInfo.
   */
  @java.lang.Override
  public java.lang.String getServerInfo() {
    java.lang.Object ref = serverInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serverInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string server_info = 2;</code>
   * @return The bytes for serverInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServerInfoBytes() {
    java.lang.Object ref = serverInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serverInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RANDOM_RESPONSE_BYTES_FIELD_NUMBER = 3;
  private volatile java.lang.Object randomResponseBytes_;
  /**
   * <code>string random_response_bytes = 3;</code>
   * @return The randomResponseBytes.
   */
  @java.lang.Override
  public java.lang.String getRandomResponseBytes() {
    java.lang.Object ref = randomResponseBytes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      randomResponseBytes_ = s;
      return s;
    }
  }
  /**
   * <code>string random_response_bytes = 3;</code>
   * @return The bytes for randomResponseBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRandomResponseBytesBytes() {
    java.lang.Object ref = randomResponseBytes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      randomResponseBytes_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RETURN_VALUE_FIELD_NUMBER = 4;
  private volatile java.lang.Object returnValue_;
  /**
   * <code>string return_value = 4;</code>
   * @return The returnValue.
   */
  @java.lang.Override
  public java.lang.String getReturnValue() {
    java.lang.Object ref = returnValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      returnValue_ = s;
      return s;
    }
  }
  /**
   * <code>string return_value = 4;</code>
   * @return The bytes for returnValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReturnValueBytes() {
    java.lang.Object ref = returnValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      returnValue_ = b;
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
    if (!getUserInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userInfo_);
    }
    if (!getServerInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serverInfo_);
    }
    if (!getRandomResponseBytesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, randomResponseBytes_);
    }
    if (!getReturnValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, returnValue_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userInfo_);
    }
    if (!getServerInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serverInfo_);
    }
    if (!getRandomResponseBytesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, randomResponseBytes_);
    }
    if (!getReturnValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, returnValue_);
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
    if (!(obj instanceof POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse other = (POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse) obj;

    if (!getUserInfo()
        .equals(other.getUserInfo())) return false;
    if (!getServerInfo()
        .equals(other.getServerInfo())) return false;
    if (!getRandomResponseBytes()
        .equals(other.getRandomResponseBytes())) return false;
    if (!getReturnValue()
        .equals(other.getReturnValue())) return false;
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
    hash = (37 * hash) + USER_INFO_FIELD_NUMBER;
    hash = (53 * hash) + getUserInfo().hashCode();
    hash = (37 * hash) + SERVER_INFO_FIELD_NUMBER;
    hash = (53 * hash) + getServerInfo().hashCode();
    hash = (37 * hash) + RANDOM_RESPONSE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getRandomResponseBytes().hashCode();
    hash = (37 * hash) + RETURN_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getReturnValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse)
      POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePing_Responses_PingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePing_Responses_PingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse.class, POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse.newBuilder()
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
      userInfo_ = "";

      serverInfo_ = "";

      randomResponseBytes_ = "";

      returnValue_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePing_Responses_PingResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse build() {
      POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse buildPartial() {
      POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse result = new POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse(this);
      result.userInfo_ = userInfo_;
      result.serverInfo_ = serverInfo_;
      result.randomResponseBytes_ = randomResponseBytes_;
      result.returnValue_ = returnValue_;
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
      if (other instanceof POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse other) {
      if (other == POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse.getDefaultInstance()) return this;
      if (!other.getUserInfo().isEmpty()) {
        userInfo_ = other.userInfo_;
        onChanged();
      }
      if (!other.getServerInfo().isEmpty()) {
        serverInfo_ = other.serverInfo_;
        onChanged();
      }
      if (!other.getRandomResponseBytes().isEmpty()) {
        randomResponseBytes_ = other.randomResponseBytes_;
        onChanged();
      }
      if (!other.getReturnValue().isEmpty()) {
        returnValue_ = other.returnValue_;
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
      POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userInfo_ = "";
    /**
     * <code>string user_info = 1;</code>
     * @return The userInfo.
     */
    public java.lang.String getUserInfo() {
      java.lang.Object ref = userInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_info = 1;</code>
     * @return The bytes for userInfo.
     */
    public com.google.protobuf.ByteString
        getUserInfoBytes() {
      java.lang.Object ref = userInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_info = 1;</code>
     * @param value The userInfo to set.
     * @return This builder for chaining.
     */
    public Builder setUserInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_info = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserInfo() {
      
      userInfo_ = getDefaultInstance().getUserInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string user_info = 1;</code>
     * @param value The bytes for userInfo to set.
     * @return This builder for chaining.
     */
    public Builder setUserInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userInfo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serverInfo_ = "";
    /**
     * <code>string server_info = 2;</code>
     * @return The serverInfo.
     */
    public java.lang.String getServerInfo() {
      java.lang.Object ref = serverInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string server_info = 2;</code>
     * @return The bytes for serverInfo.
     */
    public com.google.protobuf.ByteString
        getServerInfoBytes() {
      java.lang.Object ref = serverInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string server_info = 2;</code>
     * @param value The serverInfo to set.
     * @return This builder for chaining.
     */
    public Builder setServerInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serverInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string server_info = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearServerInfo() {
      
      serverInfo_ = getDefaultInstance().getServerInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string server_info = 2;</code>
     * @param value The bytes for serverInfo to set.
     * @return This builder for chaining.
     */
    public Builder setServerInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serverInfo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object randomResponseBytes_ = "";
    /**
     * <code>string random_response_bytes = 3;</code>
     * @return The randomResponseBytes.
     */
    public java.lang.String getRandomResponseBytes() {
      java.lang.Object ref = randomResponseBytes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        randomResponseBytes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string random_response_bytes = 3;</code>
     * @return The bytes for randomResponseBytes.
     */
    public com.google.protobuf.ByteString
        getRandomResponseBytesBytes() {
      java.lang.Object ref = randomResponseBytes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        randomResponseBytes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string random_response_bytes = 3;</code>
     * @param value The randomResponseBytes to set.
     * @return This builder for chaining.
     */
    public Builder setRandomResponseBytes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      randomResponseBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string random_response_bytes = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRandomResponseBytes() {
      
      randomResponseBytes_ = getDefaultInstance().getRandomResponseBytes();
      onChanged();
      return this;
    }
    /**
     * <code>string random_response_bytes = 3;</code>
     * @param value The bytes for randomResponseBytes to set.
     * @return This builder for chaining.
     */
    public Builder setRandomResponseBytesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      randomResponseBytes_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object returnValue_ = "";
    /**
     * <code>string return_value = 4;</code>
     * @return The returnValue.
     */
    public java.lang.String getReturnValue() {
      java.lang.Object ref = returnValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        returnValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string return_value = 4;</code>
     * @return The bytes for returnValue.
     */
    public com.google.protobuf.ByteString
        getReturnValueBytes() {
      java.lang.Object ref = returnValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        returnValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string return_value = 4;</code>
     * @param value The returnValue to set.
     * @return This builder for chaining.
     */
    public Builder setReturnValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      returnValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string return_value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReturnValue() {
      
      returnValue_ = getDefaultInstance().getReturnValue();
      onChanged();
      return this;
    }
    /**
     * <code>string return_value = 4;</code>
     * @param value The bytes for returnValue to set.
     * @return This builder for chaining.
     */
    public Builder setReturnValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      returnValue_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse)
  private static final POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse();
  }

  public static POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PingResponse>
      PARSER = new com.google.protobuf.AbstractParser<PingResponse>() {
    @java.lang.Override
    public PingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.Game.GamePing.Responses.PingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

