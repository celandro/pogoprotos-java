// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GOIOFJJHIIC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GOIOFJJHIIC}
 */
public final class GOIOFJJHIIC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GOIOFJJHIIC)
    GOIOFJJHIICOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GOIOFJJHIIC.newBuilder() to construct.
  private GOIOFJJHIIC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GOIOFJJHIIC() {
    fpajnndefpc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GOIOFJJHIIC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GOIOFJJHIIC(
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

            fpajnndefpc_ = s;
            break;
          }
          case 16: {

            eenbccefmfp_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOIOFJJHIIC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOIOFJJHIIC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GOIOFJJHIIC.class, POGOProtos.Rpc.GOIOFJJHIIC.Builder.class);
  }

  public static final int FPAJNNDEFPC_FIELD_NUMBER = 1;
  private volatile java.lang.Object fpajnndefpc_;
  /**
   * <code>string fpajnndefpc = 1;</code>
   * @return The fpajnndefpc.
   */
  @java.lang.Override
  public java.lang.String getFpajnndefpc() {
    java.lang.Object ref = fpajnndefpc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fpajnndefpc_ = s;
      return s;
    }
  }
  /**
   * <code>string fpajnndefpc = 1;</code>
   * @return The bytes for fpajnndefpc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFpajnndefpcBytes() {
    java.lang.Object ref = fpajnndefpc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fpajnndefpc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EENBCCEFMFP_FIELD_NUMBER = 2;
  private long eenbccefmfp_;
  /**
   * <code>int64 eenbccefmfp = 2;</code>
   * @return The eenbccefmfp.
   */
  @java.lang.Override
  public long getEenbccefmfp() {
    return eenbccefmfp_;
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
    if (!getFpajnndefpcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fpajnndefpc_);
    }
    if (eenbccefmfp_ != 0L) {
      output.writeInt64(2, eenbccefmfp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFpajnndefpcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fpajnndefpc_);
    }
    if (eenbccefmfp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, eenbccefmfp_);
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
    if (!(obj instanceof POGOProtos.Rpc.GOIOFJJHIIC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GOIOFJJHIIC other = (POGOProtos.Rpc.GOIOFJJHIIC) obj;

    if (!getFpajnndefpc()
        .equals(other.getFpajnndefpc())) return false;
    if (getEenbccefmfp()
        != other.getEenbccefmfp()) return false;
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
    hash = (37 * hash) + FPAJNNDEFPC_FIELD_NUMBER;
    hash = (53 * hash) + getFpajnndefpc().hashCode();
    hash = (37 * hash) + EENBCCEFMFP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEenbccefmfp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GOIOFJJHIIC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GOIOFJJHIIC prototype) {
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
   * ref: GOIOFJJHIIC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GOIOFJJHIIC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GOIOFJJHIIC)
      POGOProtos.Rpc.GOIOFJJHIICOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOIOFJJHIIC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOIOFJJHIIC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GOIOFJJHIIC.class, POGOProtos.Rpc.GOIOFJJHIIC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GOIOFJJHIIC.newBuilder()
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
      fpajnndefpc_ = "";

      eenbccefmfp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GOIOFJJHIIC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GOIOFJJHIIC getDefaultInstanceForType() {
      return POGOProtos.Rpc.GOIOFJJHIIC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GOIOFJJHIIC build() {
      POGOProtos.Rpc.GOIOFJJHIIC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GOIOFJJHIIC buildPartial() {
      POGOProtos.Rpc.GOIOFJJHIIC result = new POGOProtos.Rpc.GOIOFJJHIIC(this);
      result.fpajnndefpc_ = fpajnndefpc_;
      result.eenbccefmfp_ = eenbccefmfp_;
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
      if (other instanceof POGOProtos.Rpc.GOIOFJJHIIC) {
        return mergeFrom((POGOProtos.Rpc.GOIOFJJHIIC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GOIOFJJHIIC other) {
      if (other == POGOProtos.Rpc.GOIOFJJHIIC.getDefaultInstance()) return this;
      if (!other.getFpajnndefpc().isEmpty()) {
        fpajnndefpc_ = other.fpajnndefpc_;
        onChanged();
      }
      if (other.getEenbccefmfp() != 0L) {
        setEenbccefmfp(other.getEenbccefmfp());
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
      POGOProtos.Rpc.GOIOFJJHIIC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GOIOFJJHIIC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fpajnndefpc_ = "";
    /**
     * <code>string fpajnndefpc = 1;</code>
     * @return The fpajnndefpc.
     */
    public java.lang.String getFpajnndefpc() {
      java.lang.Object ref = fpajnndefpc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fpajnndefpc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fpajnndefpc = 1;</code>
     * @return The bytes for fpajnndefpc.
     */
    public com.google.protobuf.ByteString
        getFpajnndefpcBytes() {
      java.lang.Object ref = fpajnndefpc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fpajnndefpc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fpajnndefpc = 1;</code>
     * @param value The fpajnndefpc to set.
     * @return This builder for chaining.
     */
    public Builder setFpajnndefpc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fpajnndefpc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fpajnndefpc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFpajnndefpc() {
      
      fpajnndefpc_ = getDefaultInstance().getFpajnndefpc();
      onChanged();
      return this;
    }
    /**
     * <code>string fpajnndefpc = 1;</code>
     * @param value The bytes for fpajnndefpc to set.
     * @return This builder for chaining.
     */
    public Builder setFpajnndefpcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fpajnndefpc_ = value;
      onChanged();
      return this;
    }

    private long eenbccefmfp_ ;
    /**
     * <code>int64 eenbccefmfp = 2;</code>
     * @return The eenbccefmfp.
     */
    @java.lang.Override
    public long getEenbccefmfp() {
      return eenbccefmfp_;
    }
    /**
     * <code>int64 eenbccefmfp = 2;</code>
     * @param value The eenbccefmfp to set.
     * @return This builder for chaining.
     */
    public Builder setEenbccefmfp(long value) {
      
      eenbccefmfp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 eenbccefmfp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEenbccefmfp() {
      
      eenbccefmfp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GOIOFJJHIIC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GOIOFJJHIIC)
  private static final POGOProtos.Rpc.GOIOFJJHIIC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GOIOFJJHIIC();
  }

  public static POGOProtos.Rpc.GOIOFJJHIIC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GOIOFJJHIIC>
      PARSER = new com.google.protobuf.AbstractParser<GOIOFJJHIIC>() {
    @java.lang.Override
    public GOIOFJJHIIC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GOIOFJJHIIC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GOIOFJJHIIC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GOIOFJJHIIC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GOIOFJJHIIC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
