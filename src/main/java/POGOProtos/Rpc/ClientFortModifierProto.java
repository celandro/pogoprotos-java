// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OOLKFIOELFG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ClientFortModifierProto}
 */
public final class ClientFortModifierProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ClientFortModifierProto)
    ClientFortModifierProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientFortModifierProto.newBuilder() to construct.
  private ClientFortModifierProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientFortModifierProto() {
    modifierType_ = 0;
    deployingPlayerCodename_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientFortModifierProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientFortModifierProto(
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
            int rawValue = input.readEnum();

            modifierType_ = rawValue;
            break;
          }
          case 16: {

            expirationTimeMs_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            deployingPlayerCodename_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientFortModifierProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientFortModifierProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ClientFortModifierProto.class, POGOProtos.Rpc.ClientFortModifierProto.Builder.class);
  }

  public static final int MODIFIER_TYPE_FIELD_NUMBER = 1;
  private int modifierType_;
  /**
   * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
   * @return The enum numeric value on the wire for modifierType.
   */
  @java.lang.Override public int getModifierTypeValue() {
    return modifierType_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
   * @return The modifierType.
   */
  @java.lang.Override public POGOProtos.Rpc.Item getModifierType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(modifierType_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int EXPIRATION_TIME_MS_FIELD_NUMBER = 2;
  private long expirationTimeMs_;
  /**
   * <code>int64 expiration_time_ms = 2;</code>
   * @return The expirationTimeMs.
   */
  @java.lang.Override
  public long getExpirationTimeMs() {
    return expirationTimeMs_;
  }

  public static final int DEPLOYING_PLAYER_CODENAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object deployingPlayerCodename_;
  /**
   * <code>string deploying_player_codename = 3;</code>
   * @return The deployingPlayerCodename.
   */
  @java.lang.Override
  public java.lang.String getDeployingPlayerCodename() {
    java.lang.Object ref = deployingPlayerCodename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployingPlayerCodename_ = s;
      return s;
    }
  }
  /**
   * <code>string deploying_player_codename = 3;</code>
   * @return The bytes for deployingPlayerCodename.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeployingPlayerCodenameBytes() {
    java.lang.Object ref = deployingPlayerCodename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deployingPlayerCodename_ = b;
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
    if (modifierType_ != POGOProtos.Rpc.Item.UNKNOWN.getNumber()) {
      output.writeEnum(1, modifierType_);
    }
    if (expirationTimeMs_ != 0L) {
      output.writeInt64(2, expirationTimeMs_);
    }
    if (!getDeployingPlayerCodenameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deployingPlayerCodename_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modifierType_ != POGOProtos.Rpc.Item.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, modifierType_);
    }
    if (expirationTimeMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, expirationTimeMs_);
    }
    if (!getDeployingPlayerCodenameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deployingPlayerCodename_);
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
    if (!(obj instanceof POGOProtos.Rpc.ClientFortModifierProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ClientFortModifierProto other = (POGOProtos.Rpc.ClientFortModifierProto) obj;

    if (modifierType_ != other.modifierType_) return false;
    if (getExpirationTimeMs()
        != other.getExpirationTimeMs()) return false;
    if (!getDeployingPlayerCodename()
        .equals(other.getDeployingPlayerCodename())) return false;
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
    hash = (37 * hash) + MODIFIER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + modifierType_;
    hash = (37 * hash) + EXPIRATION_TIME_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpirationTimeMs());
    hash = (37 * hash) + DEPLOYING_PLAYER_CODENAME_FIELD_NUMBER;
    hash = (53 * hash) + getDeployingPlayerCodename().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientFortModifierProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ClientFortModifierProto prototype) {
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
   * <pre>
   * ref: OOLKFIOELFG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ClientFortModifierProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ClientFortModifierProto)
      POGOProtos.Rpc.ClientFortModifierProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientFortModifierProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientFortModifierProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ClientFortModifierProto.class, POGOProtos.Rpc.ClientFortModifierProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ClientFortModifierProto.newBuilder()
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
      modifierType_ = 0;

      expirationTimeMs_ = 0L;

      deployingPlayerCodename_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientFortModifierProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientFortModifierProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ClientFortModifierProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientFortModifierProto build() {
      POGOProtos.Rpc.ClientFortModifierProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientFortModifierProto buildPartial() {
      POGOProtos.Rpc.ClientFortModifierProto result = new POGOProtos.Rpc.ClientFortModifierProto(this);
      result.modifierType_ = modifierType_;
      result.expirationTimeMs_ = expirationTimeMs_;
      result.deployingPlayerCodename_ = deployingPlayerCodename_;
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
      if (other instanceof POGOProtos.Rpc.ClientFortModifierProto) {
        return mergeFrom((POGOProtos.Rpc.ClientFortModifierProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ClientFortModifierProto other) {
      if (other == POGOProtos.Rpc.ClientFortModifierProto.getDefaultInstance()) return this;
      if (other.modifierType_ != 0) {
        setModifierTypeValue(other.getModifierTypeValue());
      }
      if (other.getExpirationTimeMs() != 0L) {
        setExpirationTimeMs(other.getExpirationTimeMs());
      }
      if (!other.getDeployingPlayerCodename().isEmpty()) {
        deployingPlayerCodename_ = other.deployingPlayerCodename_;
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
      POGOProtos.Rpc.ClientFortModifierProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ClientFortModifierProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int modifierType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
     * @return The enum numeric value on the wire for modifierType.
     */
    @java.lang.Override public int getModifierTypeValue() {
      return modifierType_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
     * @param value The enum numeric value on the wire for modifierType to set.
     * @return This builder for chaining.
     */
    public Builder setModifierTypeValue(int value) {
      
      modifierType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
     * @return The modifierType.
     */
    @java.lang.Override
    public POGOProtos.Rpc.Item getModifierType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(modifierType_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
     * @param value The modifierType to set.
     * @return This builder for chaining.
     */
    public Builder setModifierType(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      modifierType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModifierType() {
      
      modifierType_ = 0;
      onChanged();
      return this;
    }

    private long expirationTimeMs_ ;
    /**
     * <code>int64 expiration_time_ms = 2;</code>
     * @return The expirationTimeMs.
     */
    @java.lang.Override
    public long getExpirationTimeMs() {
      return expirationTimeMs_;
    }
    /**
     * <code>int64 expiration_time_ms = 2;</code>
     * @param value The expirationTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setExpirationTimeMs(long value) {
      
      expirationTimeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expiration_time_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpirationTimeMs() {
      
      expirationTimeMs_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object deployingPlayerCodename_ = "";
    /**
     * <code>string deploying_player_codename = 3;</code>
     * @return The deployingPlayerCodename.
     */
    public java.lang.String getDeployingPlayerCodename() {
      java.lang.Object ref = deployingPlayerCodename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployingPlayerCodename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deploying_player_codename = 3;</code>
     * @return The bytes for deployingPlayerCodename.
     */
    public com.google.protobuf.ByteString
        getDeployingPlayerCodenameBytes() {
      java.lang.Object ref = deployingPlayerCodename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deployingPlayerCodename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deploying_player_codename = 3;</code>
     * @param value The deployingPlayerCodename to set.
     * @return This builder for chaining.
     */
    public Builder setDeployingPlayerCodename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deployingPlayerCodename_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string deploying_player_codename = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeployingPlayerCodename() {
      
      deployingPlayerCodename_ = getDefaultInstance().getDeployingPlayerCodename();
      onChanged();
      return this;
    }
    /**
     * <code>string deploying_player_codename = 3;</code>
     * @param value The bytes for deployingPlayerCodename to set.
     * @return This builder for chaining.
     */
    public Builder setDeployingPlayerCodenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deployingPlayerCodename_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ClientFortModifierProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ClientFortModifierProto)
  private static final POGOProtos.Rpc.ClientFortModifierProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ClientFortModifierProto();
  }

  public static POGOProtos.Rpc.ClientFortModifierProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientFortModifierProto>
      PARSER = new com.google.protobuf.AbstractParser<ClientFortModifierProto>() {
    @java.lang.Override
    public ClientFortModifierProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientFortModifierProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientFortModifierProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientFortModifierProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ClientFortModifierProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

