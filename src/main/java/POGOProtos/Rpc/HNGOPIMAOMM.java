// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HNGOPIMAOMM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HNGOPIMAOMM}
 */
public final class HNGOPIMAOMM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HNGOPIMAOMM)
    HNGOPIMAOMMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HNGOPIMAOMM.newBuilder() to construct.
  private HNGOPIMAOMM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HNGOPIMAOMM() {
    adfnjbdncbj_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HNGOPIMAOMM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HNGOPIMAOMM(
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

            ckniekbneoe_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            adfnjbdncbj_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNGOPIMAOMM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNGOPIMAOMM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HNGOPIMAOMM.class, POGOProtos.Rpc.HNGOPIMAOMM.Builder.class);
  }

  public static final int CKNIEKBNEOE_FIELD_NUMBER = 1;
  private long ckniekbneoe_;
  /**
   * <code>uint64 ckniekbneoe = 1;</code>
   * @return The ckniekbneoe.
   */
  @java.lang.Override
  public long getCkniekbneoe() {
    return ckniekbneoe_;
  }

  public static final int ADFNJBDNCBJ_FIELD_NUMBER = 2;
  private volatile java.lang.Object adfnjbdncbj_;
  /**
   * <code>string adfnjbdncbj = 2;</code>
   * @return The adfnjbdncbj.
   */
  @java.lang.Override
  public java.lang.String getAdfnjbdncbj() {
    java.lang.Object ref = adfnjbdncbj_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      adfnjbdncbj_ = s;
      return s;
    }
  }
  /**
   * <code>string adfnjbdncbj = 2;</code>
   * @return The bytes for adfnjbdncbj.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdfnjbdncbjBytes() {
    java.lang.Object ref = adfnjbdncbj_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      adfnjbdncbj_ = b;
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
    if (ckniekbneoe_ != 0L) {
      output.writeUInt64(1, ckniekbneoe_);
    }
    if (!getAdfnjbdncbjBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, adfnjbdncbj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ckniekbneoe_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, ckniekbneoe_);
    }
    if (!getAdfnjbdncbjBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, adfnjbdncbj_);
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
    if (!(obj instanceof POGOProtos.Rpc.HNGOPIMAOMM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HNGOPIMAOMM other = (POGOProtos.Rpc.HNGOPIMAOMM) obj;

    if (getCkniekbneoe()
        != other.getCkniekbneoe()) return false;
    if (!getAdfnjbdncbj()
        .equals(other.getAdfnjbdncbj())) return false;
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
    hash = (37 * hash) + CKNIEKBNEOE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCkniekbneoe());
    hash = (37 * hash) + ADFNJBDNCBJ_FIELD_NUMBER;
    hash = (53 * hash) + getAdfnjbdncbj().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNGOPIMAOMM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HNGOPIMAOMM prototype) {
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
   * ref: HNGOPIMAOMM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HNGOPIMAOMM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HNGOPIMAOMM)
      POGOProtos.Rpc.HNGOPIMAOMMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNGOPIMAOMM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNGOPIMAOMM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HNGOPIMAOMM.class, POGOProtos.Rpc.HNGOPIMAOMM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HNGOPIMAOMM.newBuilder()
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
      ckniekbneoe_ = 0L;

      adfnjbdncbj_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNGOPIMAOMM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNGOPIMAOMM getDefaultInstanceForType() {
      return POGOProtos.Rpc.HNGOPIMAOMM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNGOPIMAOMM build() {
      POGOProtos.Rpc.HNGOPIMAOMM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNGOPIMAOMM buildPartial() {
      POGOProtos.Rpc.HNGOPIMAOMM result = new POGOProtos.Rpc.HNGOPIMAOMM(this);
      result.ckniekbneoe_ = ckniekbneoe_;
      result.adfnjbdncbj_ = adfnjbdncbj_;
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
      if (other instanceof POGOProtos.Rpc.HNGOPIMAOMM) {
        return mergeFrom((POGOProtos.Rpc.HNGOPIMAOMM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HNGOPIMAOMM other) {
      if (other == POGOProtos.Rpc.HNGOPIMAOMM.getDefaultInstance()) return this;
      if (other.getCkniekbneoe() != 0L) {
        setCkniekbneoe(other.getCkniekbneoe());
      }
      if (!other.getAdfnjbdncbj().isEmpty()) {
        adfnjbdncbj_ = other.adfnjbdncbj_;
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
      POGOProtos.Rpc.HNGOPIMAOMM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HNGOPIMAOMM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long ckniekbneoe_ ;
    /**
     * <code>uint64 ckniekbneoe = 1;</code>
     * @return The ckniekbneoe.
     */
    @java.lang.Override
    public long getCkniekbneoe() {
      return ckniekbneoe_;
    }
    /**
     * <code>uint64 ckniekbneoe = 1;</code>
     * @param value The ckniekbneoe to set.
     * @return This builder for chaining.
     */
    public Builder setCkniekbneoe(long value) {
      
      ckniekbneoe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 ckniekbneoe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCkniekbneoe() {
      
      ckniekbneoe_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object adfnjbdncbj_ = "";
    /**
     * <code>string adfnjbdncbj = 2;</code>
     * @return The adfnjbdncbj.
     */
    public java.lang.String getAdfnjbdncbj() {
      java.lang.Object ref = adfnjbdncbj_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        adfnjbdncbj_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string adfnjbdncbj = 2;</code>
     * @return The bytes for adfnjbdncbj.
     */
    public com.google.protobuf.ByteString
        getAdfnjbdncbjBytes() {
      java.lang.Object ref = adfnjbdncbj_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        adfnjbdncbj_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string adfnjbdncbj = 2;</code>
     * @param value The adfnjbdncbj to set.
     * @return This builder for chaining.
     */
    public Builder setAdfnjbdncbj(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      adfnjbdncbj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string adfnjbdncbj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdfnjbdncbj() {
      
      adfnjbdncbj_ = getDefaultInstance().getAdfnjbdncbj();
      onChanged();
      return this;
    }
    /**
     * <code>string adfnjbdncbj = 2;</code>
     * @param value The bytes for adfnjbdncbj to set.
     * @return This builder for chaining.
     */
    public Builder setAdfnjbdncbjBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      adfnjbdncbj_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HNGOPIMAOMM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HNGOPIMAOMM)
  private static final POGOProtos.Rpc.HNGOPIMAOMM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HNGOPIMAOMM();
  }

  public static POGOProtos.Rpc.HNGOPIMAOMM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HNGOPIMAOMM>
      PARSER = new com.google.protobuf.AbstractParser<HNGOPIMAOMM>() {
    @java.lang.Override
    public HNGOPIMAOMM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HNGOPIMAOMM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HNGOPIMAOMM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HNGOPIMAOMM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HNGOPIMAOMM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

