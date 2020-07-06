// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Token/SfidaAuthToken.proto

package POGOProtos.Data.Token;

/**
 * Protobuf type {@code POGOProtos.Data.Token.SfidaAuthToken}
 */
public  final class SfidaAuthToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Token.SfidaAuthToken)
    SfidaAuthTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SfidaAuthToken.newBuilder() to construct.
  private SfidaAuthToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SfidaAuthToken() {
    responseToken_ = com.google.protobuf.ByteString.EMPTY;
    sfidaId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SfidaAuthToken();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SfidaAuthToken(
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

            responseToken_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sfidaId_ = s;
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
    return POGOProtos.Data.Token.SfidaAuthTokenOuterClass.internal_static_POGOProtos_Data_Token_SfidaAuthToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Token.SfidaAuthTokenOuterClass.internal_static_POGOProtos_Data_Token_SfidaAuthToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Token.SfidaAuthToken.class, POGOProtos.Data.Token.SfidaAuthToken.Builder.class);
  }

  public static final int RESPONSE_TOKEN_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString responseToken_;
  /**
   * <code>bytes response_token = 1;</code>
   * @return The responseToken.
   */
  public com.google.protobuf.ByteString getResponseToken() {
    return responseToken_;
  }

  public static final int SFIDA_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object sfidaId_;
  /**
   * <code>string sfida_id = 2;</code>
   * @return The sfidaId.
   */
  public java.lang.String getSfidaId() {
    java.lang.Object ref = sfidaId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sfidaId_ = s;
      return s;
    }
  }
  /**
   * <code>string sfida_id = 2;</code>
   * @return The bytes for sfidaId.
   */
  public com.google.protobuf.ByteString
      getSfidaIdBytes() {
    java.lang.Object ref = sfidaId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sfidaId_ = b;
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
    if (!responseToken_.isEmpty()) {
      output.writeBytes(1, responseToken_);
    }
    if (!getSfidaIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sfidaId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!responseToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, responseToken_);
    }
    if (!getSfidaIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sfidaId_);
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
    if (!(obj instanceof POGOProtos.Data.Token.SfidaAuthToken)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Token.SfidaAuthToken other = (POGOProtos.Data.Token.SfidaAuthToken) obj;

    if (!getResponseToken()
        .equals(other.getResponseToken())) return false;
    if (!getSfidaId()
        .equals(other.getSfidaId())) return false;
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
    hash = (37 * hash) + RESPONSE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getResponseToken().hashCode();
    hash = (37 * hash) + SFIDA_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSfidaId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Token.SfidaAuthToken parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Token.SfidaAuthToken prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Token.SfidaAuthToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Token.SfidaAuthToken)
      POGOProtos.Data.Token.SfidaAuthTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Token.SfidaAuthTokenOuterClass.internal_static_POGOProtos_Data_Token_SfidaAuthToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Token.SfidaAuthTokenOuterClass.internal_static_POGOProtos_Data_Token_SfidaAuthToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Token.SfidaAuthToken.class, POGOProtos.Data.Token.SfidaAuthToken.Builder.class);
    }

    // Construct using POGOProtos.Data.Token.SfidaAuthToken.newBuilder()
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
      responseToken_ = com.google.protobuf.ByteString.EMPTY;

      sfidaId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Token.SfidaAuthTokenOuterClass.internal_static_POGOProtos_Data_Token_SfidaAuthToken_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Token.SfidaAuthToken getDefaultInstanceForType() {
      return POGOProtos.Data.Token.SfidaAuthToken.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Token.SfidaAuthToken build() {
      POGOProtos.Data.Token.SfidaAuthToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Token.SfidaAuthToken buildPartial() {
      POGOProtos.Data.Token.SfidaAuthToken result = new POGOProtos.Data.Token.SfidaAuthToken(this);
      result.responseToken_ = responseToken_;
      result.sfidaId_ = sfidaId_;
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
      if (other instanceof POGOProtos.Data.Token.SfidaAuthToken) {
        return mergeFrom((POGOProtos.Data.Token.SfidaAuthToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Token.SfidaAuthToken other) {
      if (other == POGOProtos.Data.Token.SfidaAuthToken.getDefaultInstance()) return this;
      if (other.getResponseToken() != com.google.protobuf.ByteString.EMPTY) {
        setResponseToken(other.getResponseToken());
      }
      if (!other.getSfidaId().isEmpty()) {
        sfidaId_ = other.sfidaId_;
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
      POGOProtos.Data.Token.SfidaAuthToken parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Token.SfidaAuthToken) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString responseToken_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes response_token = 1;</code>
     * @return The responseToken.
     */
    public com.google.protobuf.ByteString getResponseToken() {
      return responseToken_;
    }
    /**
     * <code>bytes response_token = 1;</code>
     * @param value The responseToken to set.
     * @return This builder for chaining.
     */
    public Builder setResponseToken(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responseToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes response_token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseToken() {
      
      responseToken_ = getDefaultInstance().getResponseToken();
      onChanged();
      return this;
    }

    private java.lang.Object sfidaId_ = "";
    /**
     * <code>string sfida_id = 2;</code>
     * @return The sfidaId.
     */
    public java.lang.String getSfidaId() {
      java.lang.Object ref = sfidaId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sfidaId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sfida_id = 2;</code>
     * @return The bytes for sfidaId.
     */
    public com.google.protobuf.ByteString
        getSfidaIdBytes() {
      java.lang.Object ref = sfidaId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sfidaId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sfida_id = 2;</code>
     * @param value The sfidaId to set.
     * @return This builder for chaining.
     */
    public Builder setSfidaId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sfidaId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sfida_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSfidaId() {
      
      sfidaId_ = getDefaultInstance().getSfidaId();
      onChanged();
      return this;
    }
    /**
     * <code>string sfida_id = 2;</code>
     * @param value The bytes for sfidaId to set.
     * @return This builder for chaining.
     */
    public Builder setSfidaIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sfidaId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Token.SfidaAuthToken)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Token.SfidaAuthToken)
  private static final POGOProtos.Data.Token.SfidaAuthToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Token.SfidaAuthToken();
  }

  public static POGOProtos.Data.Token.SfidaAuthToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SfidaAuthToken>
      PARSER = new com.google.protobuf.AbstractParser<SfidaAuthToken>() {
    @java.lang.Override
    public SfidaAuthToken parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SfidaAuthToken(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SfidaAuthToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SfidaAuthToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Token.SfidaAuthToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

