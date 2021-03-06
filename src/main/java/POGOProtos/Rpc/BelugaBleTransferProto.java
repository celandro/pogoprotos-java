// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BelugaBleTransferProto}
 */
public final class BelugaBleTransferProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BelugaBleTransferProto)
    BelugaBleTransferProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BelugaBleTransferProto.newBuilder() to construct.
  private BelugaBleTransferProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BelugaBleTransferProto() {
    serverSignature_ = com.google.protobuf.ByteString.EMPTY;
    localizedOrigins_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    language_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BelugaBleTransferProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BelugaBleTransferProto(
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
            POGOProtos.Rpc.BelugaBleTransferPrepProto.Builder subBuilder = null;
            if (serverResponse_ != null) {
              subBuilder = serverResponse_.toBuilder();
            }
            serverResponse_ = input.readMessage(POGOProtos.Rpc.BelugaBleTransferPrepProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(serverResponse_);
              serverResponse_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            serverSignature_ = input.readBytes();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              localizedOrigins_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            localizedOrigins_.add(s);
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            language_ = s;
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
        localizedOrigins_ = localizedOrigins_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleTransferProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleTransferProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BelugaBleTransferProto.class, POGOProtos.Rpc.BelugaBleTransferProto.Builder.class);
  }

  public static final int SERVER_RESPONSE_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.BelugaBleTransferPrepProto serverResponse_;
  /**
   * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
   * @return Whether the serverResponse field is set.
   */
  @java.lang.Override
  public boolean hasServerResponse() {
    return serverResponse_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
   * @return The serverResponse.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleTransferPrepProto getServerResponse() {
    return serverResponse_ == null ? POGOProtos.Rpc.BelugaBleTransferPrepProto.getDefaultInstance() : serverResponse_;
  }
  /**
   * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleTransferPrepProtoOrBuilder getServerResponseOrBuilder() {
    return getServerResponse();
  }

  public static final int SERVER_SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString serverSignature_;
  /**
   * <code>bytes server_signature = 2;</code>
   * @return The serverSignature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServerSignature() {
    return serverSignature_;
  }

  public static final int LOCALIZED_ORIGINS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList localizedOrigins_;
  /**
   * <code>repeated string localized_origins = 3;</code>
   * @return A list containing the localizedOrigins.
   */
  public com.google.protobuf.ProtocolStringList
      getLocalizedOriginsList() {
    return localizedOrigins_;
  }
  /**
   * <code>repeated string localized_origins = 3;</code>
   * @return The count of localizedOrigins.
   */
  public int getLocalizedOriginsCount() {
    return localizedOrigins_.size();
  }
  /**
   * <code>repeated string localized_origins = 3;</code>
   * @param index The index of the element to return.
   * @return The localizedOrigins at the given index.
   */
  public java.lang.String getLocalizedOrigins(int index) {
    return localizedOrigins_.get(index);
  }
  /**
   * <code>repeated string localized_origins = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the localizedOrigins at the given index.
   */
  public com.google.protobuf.ByteString
      getLocalizedOriginsBytes(int index) {
    return localizedOrigins_.getByteString(index);
  }

  public static final int LANGUAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object language_;
  /**
   * <code>string language = 4;</code>
   * @return The language.
   */
  @java.lang.Override
  public java.lang.String getLanguage() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      language_ = s;
      return s;
    }
  }
  /**
   * <code>string language = 4;</code>
   * @return The bytes for language.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageBytes() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      language_ = b;
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
    if (serverResponse_ != null) {
      output.writeMessage(1, getServerResponse());
    }
    if (!serverSignature_.isEmpty()) {
      output.writeBytes(2, serverSignature_);
    }
    for (int i = 0; i < localizedOrigins_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, localizedOrigins_.getRaw(i));
    }
    if (!getLanguageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, language_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (serverResponse_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getServerResponse());
    }
    if (!serverSignature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, serverSignature_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < localizedOrigins_.size(); i++) {
        dataSize += computeStringSizeNoTag(localizedOrigins_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLocalizedOriginsList().size();
    }
    if (!getLanguageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, language_);
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
    if (!(obj instanceof POGOProtos.Rpc.BelugaBleTransferProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BelugaBleTransferProto other = (POGOProtos.Rpc.BelugaBleTransferProto) obj;

    if (hasServerResponse() != other.hasServerResponse()) return false;
    if (hasServerResponse()) {
      if (!getServerResponse()
          .equals(other.getServerResponse())) return false;
    }
    if (!getServerSignature()
        .equals(other.getServerSignature())) return false;
    if (!getLocalizedOriginsList()
        .equals(other.getLocalizedOriginsList())) return false;
    if (!getLanguage()
        .equals(other.getLanguage())) return false;
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
    if (hasServerResponse()) {
      hash = (37 * hash) + SERVER_RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getServerResponse().hashCode();
    }
    hash = (37 * hash) + SERVER_SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getServerSignature().hashCode();
    if (getLocalizedOriginsCount() > 0) {
      hash = (37 * hash) + LOCALIZED_ORIGINS_FIELD_NUMBER;
      hash = (53 * hash) + getLocalizedOriginsList().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleTransferProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BelugaBleTransferProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BelugaBleTransferProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BelugaBleTransferProto)
      POGOProtos.Rpc.BelugaBleTransferProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleTransferProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleTransferProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BelugaBleTransferProto.class, POGOProtos.Rpc.BelugaBleTransferProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BelugaBleTransferProto.newBuilder()
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
      if (serverResponseBuilder_ == null) {
        serverResponse_ = null;
      } else {
        serverResponse_ = null;
        serverResponseBuilder_ = null;
      }
      serverSignature_ = com.google.protobuf.ByteString.EMPTY;

      localizedOrigins_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      language_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BelugaBleTransferProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleTransferProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BelugaBleTransferProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleTransferProto build() {
      POGOProtos.Rpc.BelugaBleTransferProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleTransferProto buildPartial() {
      POGOProtos.Rpc.BelugaBleTransferProto result = new POGOProtos.Rpc.BelugaBleTransferProto(this);
      int from_bitField0_ = bitField0_;
      if (serverResponseBuilder_ == null) {
        result.serverResponse_ = serverResponse_;
      } else {
        result.serverResponse_ = serverResponseBuilder_.build();
      }
      result.serverSignature_ = serverSignature_;
      if (((bitField0_ & 0x00000001) != 0)) {
        localizedOrigins_ = localizedOrigins_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.localizedOrigins_ = localizedOrigins_;
      result.language_ = language_;
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
      if (other instanceof POGOProtos.Rpc.BelugaBleTransferProto) {
        return mergeFrom((POGOProtos.Rpc.BelugaBleTransferProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BelugaBleTransferProto other) {
      if (other == POGOProtos.Rpc.BelugaBleTransferProto.getDefaultInstance()) return this;
      if (other.hasServerResponse()) {
        mergeServerResponse(other.getServerResponse());
      }
      if (other.getServerSignature() != com.google.protobuf.ByteString.EMPTY) {
        setServerSignature(other.getServerSignature());
      }
      if (!other.localizedOrigins_.isEmpty()) {
        if (localizedOrigins_.isEmpty()) {
          localizedOrigins_ = other.localizedOrigins_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLocalizedOriginsIsMutable();
          localizedOrigins_.addAll(other.localizedOrigins_);
        }
        onChanged();
      }
      if (!other.getLanguage().isEmpty()) {
        language_ = other.language_;
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
      POGOProtos.Rpc.BelugaBleTransferProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BelugaBleTransferProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private POGOProtos.Rpc.BelugaBleTransferPrepProto serverResponse_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BelugaBleTransferPrepProto, POGOProtos.Rpc.BelugaBleTransferPrepProto.Builder, POGOProtos.Rpc.BelugaBleTransferPrepProtoOrBuilder> serverResponseBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
     * @return Whether the serverResponse field is set.
     */
    public boolean hasServerResponse() {
      return serverResponseBuilder_ != null || serverResponse_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
     * @return The serverResponse.
     */
    public POGOProtos.Rpc.BelugaBleTransferPrepProto getServerResponse() {
      if (serverResponseBuilder_ == null) {
        return serverResponse_ == null ? POGOProtos.Rpc.BelugaBleTransferPrepProto.getDefaultInstance() : serverResponse_;
      } else {
        return serverResponseBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
     */
    public Builder setServerResponse(POGOProtos.Rpc.BelugaBleTransferPrepProto value) {
      if (serverResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serverResponse_ = value;
        onChanged();
      } else {
        serverResponseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
     */
    public Builder setServerResponse(
        POGOProtos.Rpc.BelugaBleTransferPrepProto.Builder builderForValue) {
      if (serverResponseBuilder_ == null) {
        serverResponse_ = builderForValue.build();
        onChanged();
      } else {
        serverResponseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
     */
    public Builder mergeServerResponse(POGOProtos.Rpc.BelugaBleTransferPrepProto value) {
      if (serverResponseBuilder_ == null) {
        if (serverResponse_ != null) {
          serverResponse_ =
            POGOProtos.Rpc.BelugaBleTransferPrepProto.newBuilder(serverResponse_).mergeFrom(value).buildPartial();
        } else {
          serverResponse_ = value;
        }
        onChanged();
      } else {
        serverResponseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
     */
    public Builder clearServerResponse() {
      if (serverResponseBuilder_ == null) {
        serverResponse_ = null;
        onChanged();
      } else {
        serverResponse_ = null;
        serverResponseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
     */
    public POGOProtos.Rpc.BelugaBleTransferPrepProto.Builder getServerResponseBuilder() {
      
      onChanged();
      return getServerResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
     */
    public POGOProtos.Rpc.BelugaBleTransferPrepProtoOrBuilder getServerResponseOrBuilder() {
      if (serverResponseBuilder_ != null) {
        return serverResponseBuilder_.getMessageOrBuilder();
      } else {
        return serverResponse_ == null ?
            POGOProtos.Rpc.BelugaBleTransferPrepProto.getDefaultInstance() : serverResponse_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto server_response = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BelugaBleTransferPrepProto, POGOProtos.Rpc.BelugaBleTransferPrepProto.Builder, POGOProtos.Rpc.BelugaBleTransferPrepProtoOrBuilder> 
        getServerResponseFieldBuilder() {
      if (serverResponseBuilder_ == null) {
        serverResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BelugaBleTransferPrepProto, POGOProtos.Rpc.BelugaBleTransferPrepProto.Builder, POGOProtos.Rpc.BelugaBleTransferPrepProtoOrBuilder>(
                getServerResponse(),
                getParentForChildren(),
                isClean());
        serverResponse_ = null;
      }
      return serverResponseBuilder_;
    }

    private com.google.protobuf.ByteString serverSignature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes server_signature = 2;</code>
     * @return The serverSignature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getServerSignature() {
      return serverSignature_;
    }
    /**
     * <code>bytes server_signature = 2;</code>
     * @param value The serverSignature to set.
     * @return This builder for chaining.
     */
    public Builder setServerSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serverSignature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes server_signature = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearServerSignature() {
      
      serverSignature_ = getDefaultInstance().getServerSignature();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList localizedOrigins_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLocalizedOriginsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        localizedOrigins_ = new com.google.protobuf.LazyStringArrayList(localizedOrigins_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string localized_origins = 3;</code>
     * @return A list containing the localizedOrigins.
     */
    public com.google.protobuf.ProtocolStringList
        getLocalizedOriginsList() {
      return localizedOrigins_.getUnmodifiableView();
    }
    /**
     * <code>repeated string localized_origins = 3;</code>
     * @return The count of localizedOrigins.
     */
    public int getLocalizedOriginsCount() {
      return localizedOrigins_.size();
    }
    /**
     * <code>repeated string localized_origins = 3;</code>
     * @param index The index of the element to return.
     * @return The localizedOrigins at the given index.
     */
    public java.lang.String getLocalizedOrigins(int index) {
      return localizedOrigins_.get(index);
    }
    /**
     * <code>repeated string localized_origins = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the localizedOrigins at the given index.
     */
    public com.google.protobuf.ByteString
        getLocalizedOriginsBytes(int index) {
      return localizedOrigins_.getByteString(index);
    }
    /**
     * <code>repeated string localized_origins = 3;</code>
     * @param index The index to set the value at.
     * @param value The localizedOrigins to set.
     * @return This builder for chaining.
     */
    public Builder setLocalizedOrigins(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLocalizedOriginsIsMutable();
      localizedOrigins_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string localized_origins = 3;</code>
     * @param value The localizedOrigins to add.
     * @return This builder for chaining.
     */
    public Builder addLocalizedOrigins(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLocalizedOriginsIsMutable();
      localizedOrigins_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string localized_origins = 3;</code>
     * @param values The localizedOrigins to add.
     * @return This builder for chaining.
     */
    public Builder addAllLocalizedOrigins(
        java.lang.Iterable<java.lang.String> values) {
      ensureLocalizedOriginsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, localizedOrigins_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string localized_origins = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalizedOrigins() {
      localizedOrigins_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string localized_origins = 3;</code>
     * @param value The bytes of the localizedOrigins to add.
     * @return This builder for chaining.
     */
    public Builder addLocalizedOriginsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLocalizedOriginsIsMutable();
      localizedOrigins_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object language_ = "";
    /**
     * <code>string language = 4;</code>
     * @return The language.
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        language_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string language = 4;</code>
     * @return The bytes for language.
     */
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string language = 4;</code>
     * @param value The language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      language_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string language = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguage() {
      
      language_ = getDefaultInstance().getLanguage();
      onChanged();
      return this;
    }
    /**
     * <code>string language = 4;</code>
     * @param value The bytes for language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      language_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BelugaBleTransferProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BelugaBleTransferProto)
  private static final POGOProtos.Rpc.BelugaBleTransferProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BelugaBleTransferProto();
  }

  public static POGOProtos.Rpc.BelugaBleTransferProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BelugaBleTransferProto>
      PARSER = new com.google.protobuf.AbstractParser<BelugaBleTransferProto>() {
    @java.lang.Override
    public BelugaBleTransferProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BelugaBleTransferProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BelugaBleTransferProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BelugaBleTransferProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleTransferProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

