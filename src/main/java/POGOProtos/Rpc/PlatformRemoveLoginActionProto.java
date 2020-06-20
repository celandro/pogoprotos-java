// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformRemoveLoginActionProto}
 */
public  final class PlatformRemoveLoginActionProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformRemoveLoginActionProto)
    PlatformRemoveLoginActionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformRemoveLoginActionProto.newBuilder() to construct.
  private PlatformRemoveLoginActionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformRemoveLoginActionProto() {
    authProviderId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformRemoveLoginActionProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformRemoveLoginActionProto(
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
          case 8: {

            identityProvider_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            authProviderId_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformRemoveLoginActionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformRemoveLoginActionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformRemoveLoginActionProto.class, POGOProtos.Rpc.PlatformRemoveLoginActionProto.Builder.class);
  }

  public static final int IDENTITY_PROVIDER_FIELD_NUMBER = 1;
  private int identityProvider_;
  /**
   * <code>int32 identity_provider = 1;</code>
   * @return The identityProvider.
   */
  public int getIdentityProvider() {
    return identityProvider_;
  }

  public static final int AUTH_PROVIDER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object authProviderId_;
  /**
   * <code>string auth_provider_id = 2;</code>
   * @return The authProviderId.
   */
  public java.lang.String getAuthProviderId() {
    java.lang.Object ref = authProviderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authProviderId_ = s;
      return s;
    }
  }
  /**
   * <code>string auth_provider_id = 2;</code>
   * @return The bytes for authProviderId.
   */
  public com.google.protobuf.ByteString
      getAuthProviderIdBytes() {
    java.lang.Object ref = authProviderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authProviderId_ = b;
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
    if (identityProvider_ != 0) {
      output.writeInt32(1, identityProvider_);
    }
    if (!getAuthProviderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authProviderId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identityProvider_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, identityProvider_);
    }
    if (!getAuthProviderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, authProviderId_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformRemoveLoginActionProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformRemoveLoginActionProto other = (POGOProtos.Rpc.PlatformRemoveLoginActionProto) obj;

    if (getIdentityProvider()
        != other.getIdentityProvider()) return false;
    if (!getAuthProviderId()
        .equals(other.getAuthProviderId())) return false;
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
    hash = (37 * hash) + IDENTITY_PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getIdentityProvider();
    hash = (37 * hash) + AUTH_PROVIDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAuthProviderId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformRemoveLoginActionProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformRemoveLoginActionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformRemoveLoginActionProto)
      POGOProtos.Rpc.PlatformRemoveLoginActionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformRemoveLoginActionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformRemoveLoginActionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformRemoveLoginActionProto.class, POGOProtos.Rpc.PlatformRemoveLoginActionProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformRemoveLoginActionProto.newBuilder()
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
      identityProvider_ = 0;

      authProviderId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformRemoveLoginActionProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformRemoveLoginActionProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformRemoveLoginActionProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformRemoveLoginActionProto build() {
      POGOProtos.Rpc.PlatformRemoveLoginActionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformRemoveLoginActionProto buildPartial() {
      POGOProtos.Rpc.PlatformRemoveLoginActionProto result = new POGOProtos.Rpc.PlatformRemoveLoginActionProto(this);
      result.identityProvider_ = identityProvider_;
      result.authProviderId_ = authProviderId_;
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
      if (other instanceof POGOProtos.Rpc.PlatformRemoveLoginActionProto) {
        return mergeFrom((POGOProtos.Rpc.PlatformRemoveLoginActionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformRemoveLoginActionProto other) {
      if (other == POGOProtos.Rpc.PlatformRemoveLoginActionProto.getDefaultInstance()) return this;
      if (other.getIdentityProvider() != 0) {
        setIdentityProvider(other.getIdentityProvider());
      }
      if (!other.getAuthProviderId().isEmpty()) {
        authProviderId_ = other.authProviderId_;
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
      POGOProtos.Rpc.PlatformRemoveLoginActionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformRemoveLoginActionProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int identityProvider_ ;
    /**
     * <code>int32 identity_provider = 1;</code>
     * @return The identityProvider.
     */
    public int getIdentityProvider() {
      return identityProvider_;
    }
    /**
     * <code>int32 identity_provider = 1;</code>
     * @param value The identityProvider to set.
     * @return This builder for chaining.
     */
    public Builder setIdentityProvider(int value) {
      
      identityProvider_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 identity_provider = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdentityProvider() {
      
      identityProvider_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object authProviderId_ = "";
    /**
     * <code>string auth_provider_id = 2;</code>
     * @return The authProviderId.
     */
    public java.lang.String getAuthProviderId() {
      java.lang.Object ref = authProviderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authProviderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string auth_provider_id = 2;</code>
     * @return The bytes for authProviderId.
     */
    public com.google.protobuf.ByteString
        getAuthProviderIdBytes() {
      java.lang.Object ref = authProviderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authProviderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string auth_provider_id = 2;</code>
     * @param value The authProviderId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthProviderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      authProviderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string auth_provider_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthProviderId() {
      
      authProviderId_ = getDefaultInstance().getAuthProviderId();
      onChanged();
      return this;
    }
    /**
     * <code>string auth_provider_id = 2;</code>
     * @param value The bytes for authProviderId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthProviderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      authProviderId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformRemoveLoginActionProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformRemoveLoginActionProto)
  private static final POGOProtos.Rpc.PlatformRemoveLoginActionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformRemoveLoginActionProto();
  }

  public static POGOProtos.Rpc.PlatformRemoveLoginActionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformRemoveLoginActionProto>
      PARSER = new com.google.protobuf.AbstractParser<PlatformRemoveLoginActionProto>() {
    @java.lang.Override
    public PlatformRemoveLoginActionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformRemoveLoginActionProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformRemoveLoginActionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformRemoveLoginActionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformRemoveLoginActionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

