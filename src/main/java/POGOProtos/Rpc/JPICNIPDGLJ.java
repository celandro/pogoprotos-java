// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JPICNIPDGLJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JPICNIPDGLJ}
 */
public final class JPICNIPDGLJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JPICNIPDGLJ)
    JPICNIPDGLJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JPICNIPDGLJ.newBuilder() to construct.
  private JPICNIPDGLJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JPICNIPDGLJ() {
    ibojchhbikc_ = "";
    cebkcoodeca_ = "";
    amgfpdgccfm_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JPICNIPDGLJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JPICNIPDGLJ(
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

            ibojchhbikc_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cebkcoodeca_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            amgfpdgccfm_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPICNIPDGLJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPICNIPDGLJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JPICNIPDGLJ.class, POGOProtos.Rpc.JPICNIPDGLJ.Builder.class);
  }

  public static final int IBOJCHHBIKC_FIELD_NUMBER = 1;
  private volatile java.lang.Object ibojchhbikc_;
  /**
   * <code>string ibojchhbikc = 1;</code>
   * @return The ibojchhbikc.
   */
  @java.lang.Override
  public java.lang.String getIbojchhbikc() {
    java.lang.Object ref = ibojchhbikc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ibojchhbikc_ = s;
      return s;
    }
  }
  /**
   * <code>string ibojchhbikc = 1;</code>
   * @return The bytes for ibojchhbikc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIbojchhbikcBytes() {
    java.lang.Object ref = ibojchhbikc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ibojchhbikc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CEBKCOODECA_FIELD_NUMBER = 2;
  private volatile java.lang.Object cebkcoodeca_;
  /**
   * <code>string cebkcoodeca = 2;</code>
   * @return The cebkcoodeca.
   */
  @java.lang.Override
  public java.lang.String getCebkcoodeca() {
    java.lang.Object ref = cebkcoodeca_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cebkcoodeca_ = s;
      return s;
    }
  }
  /**
   * <code>string cebkcoodeca = 2;</code>
   * @return The bytes for cebkcoodeca.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCebkcoodecaBytes() {
    java.lang.Object ref = cebkcoodeca_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cebkcoodeca_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMGFPDGCCFM_FIELD_NUMBER = 3;
  private volatile java.lang.Object amgfpdgccfm_;
  /**
   * <code>string amgfpdgccfm = 3;</code>
   * @return The amgfpdgccfm.
   */
  @java.lang.Override
  public java.lang.String getAmgfpdgccfm() {
    java.lang.Object ref = amgfpdgccfm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amgfpdgccfm_ = s;
      return s;
    }
  }
  /**
   * <code>string amgfpdgccfm = 3;</code>
   * @return The bytes for amgfpdgccfm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmgfpdgccfmBytes() {
    java.lang.Object ref = amgfpdgccfm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amgfpdgccfm_ = b;
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
    if (!getIbojchhbikcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ibojchhbikc_);
    }
    if (!getCebkcoodecaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cebkcoodeca_);
    }
    if (!getAmgfpdgccfmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, amgfpdgccfm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIbojchhbikcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ibojchhbikc_);
    }
    if (!getCebkcoodecaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cebkcoodeca_);
    }
    if (!getAmgfpdgccfmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, amgfpdgccfm_);
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
    if (!(obj instanceof POGOProtos.Rpc.JPICNIPDGLJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JPICNIPDGLJ other = (POGOProtos.Rpc.JPICNIPDGLJ) obj;

    if (!getIbojchhbikc()
        .equals(other.getIbojchhbikc())) return false;
    if (!getCebkcoodeca()
        .equals(other.getCebkcoodeca())) return false;
    if (!getAmgfpdgccfm()
        .equals(other.getAmgfpdgccfm())) return false;
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
    hash = (37 * hash) + IBOJCHHBIKC_FIELD_NUMBER;
    hash = (53 * hash) + getIbojchhbikc().hashCode();
    hash = (37 * hash) + CEBKCOODECA_FIELD_NUMBER;
    hash = (53 * hash) + getCebkcoodeca().hashCode();
    hash = (37 * hash) + AMGFPDGCCFM_FIELD_NUMBER;
    hash = (53 * hash) + getAmgfpdgccfm().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPICNIPDGLJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JPICNIPDGLJ prototype) {
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
   * ref: JPICNIPDGLJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JPICNIPDGLJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JPICNIPDGLJ)
      POGOProtos.Rpc.JPICNIPDGLJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPICNIPDGLJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPICNIPDGLJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JPICNIPDGLJ.class, POGOProtos.Rpc.JPICNIPDGLJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JPICNIPDGLJ.newBuilder()
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
      ibojchhbikc_ = "";

      cebkcoodeca_ = "";

      amgfpdgccfm_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPICNIPDGLJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPICNIPDGLJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.JPICNIPDGLJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPICNIPDGLJ build() {
      POGOProtos.Rpc.JPICNIPDGLJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPICNIPDGLJ buildPartial() {
      POGOProtos.Rpc.JPICNIPDGLJ result = new POGOProtos.Rpc.JPICNIPDGLJ(this);
      result.ibojchhbikc_ = ibojchhbikc_;
      result.cebkcoodeca_ = cebkcoodeca_;
      result.amgfpdgccfm_ = amgfpdgccfm_;
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
      if (other instanceof POGOProtos.Rpc.JPICNIPDGLJ) {
        return mergeFrom((POGOProtos.Rpc.JPICNIPDGLJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JPICNIPDGLJ other) {
      if (other == POGOProtos.Rpc.JPICNIPDGLJ.getDefaultInstance()) return this;
      if (!other.getIbojchhbikc().isEmpty()) {
        ibojchhbikc_ = other.ibojchhbikc_;
        onChanged();
      }
      if (!other.getCebkcoodeca().isEmpty()) {
        cebkcoodeca_ = other.cebkcoodeca_;
        onChanged();
      }
      if (!other.getAmgfpdgccfm().isEmpty()) {
        amgfpdgccfm_ = other.amgfpdgccfm_;
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
      POGOProtos.Rpc.JPICNIPDGLJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JPICNIPDGLJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ibojchhbikc_ = "";
    /**
     * <code>string ibojchhbikc = 1;</code>
     * @return The ibojchhbikc.
     */
    public java.lang.String getIbojchhbikc() {
      java.lang.Object ref = ibojchhbikc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ibojchhbikc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ibojchhbikc = 1;</code>
     * @return The bytes for ibojchhbikc.
     */
    public com.google.protobuf.ByteString
        getIbojchhbikcBytes() {
      java.lang.Object ref = ibojchhbikc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ibojchhbikc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ibojchhbikc = 1;</code>
     * @param value The ibojchhbikc to set.
     * @return This builder for chaining.
     */
    public Builder setIbojchhbikc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ibojchhbikc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ibojchhbikc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIbojchhbikc() {
      
      ibojchhbikc_ = getDefaultInstance().getIbojchhbikc();
      onChanged();
      return this;
    }
    /**
     * <code>string ibojchhbikc = 1;</code>
     * @param value The bytes for ibojchhbikc to set.
     * @return This builder for chaining.
     */
    public Builder setIbojchhbikcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ibojchhbikc_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cebkcoodeca_ = "";
    /**
     * <code>string cebkcoodeca = 2;</code>
     * @return The cebkcoodeca.
     */
    public java.lang.String getCebkcoodeca() {
      java.lang.Object ref = cebkcoodeca_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cebkcoodeca_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cebkcoodeca = 2;</code>
     * @return The bytes for cebkcoodeca.
     */
    public com.google.protobuf.ByteString
        getCebkcoodecaBytes() {
      java.lang.Object ref = cebkcoodeca_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cebkcoodeca_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cebkcoodeca = 2;</code>
     * @param value The cebkcoodeca to set.
     * @return This builder for chaining.
     */
    public Builder setCebkcoodeca(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cebkcoodeca_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cebkcoodeca = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCebkcoodeca() {
      
      cebkcoodeca_ = getDefaultInstance().getCebkcoodeca();
      onChanged();
      return this;
    }
    /**
     * <code>string cebkcoodeca = 2;</code>
     * @param value The bytes for cebkcoodeca to set.
     * @return This builder for chaining.
     */
    public Builder setCebkcoodecaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cebkcoodeca_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object amgfpdgccfm_ = "";
    /**
     * <code>string amgfpdgccfm = 3;</code>
     * @return The amgfpdgccfm.
     */
    public java.lang.String getAmgfpdgccfm() {
      java.lang.Object ref = amgfpdgccfm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amgfpdgccfm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amgfpdgccfm = 3;</code>
     * @return The bytes for amgfpdgccfm.
     */
    public com.google.protobuf.ByteString
        getAmgfpdgccfmBytes() {
      java.lang.Object ref = amgfpdgccfm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amgfpdgccfm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amgfpdgccfm = 3;</code>
     * @param value The amgfpdgccfm to set.
     * @return This builder for chaining.
     */
    public Builder setAmgfpdgccfm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      amgfpdgccfm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string amgfpdgccfm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmgfpdgccfm() {
      
      amgfpdgccfm_ = getDefaultInstance().getAmgfpdgccfm();
      onChanged();
      return this;
    }
    /**
     * <code>string amgfpdgccfm = 3;</code>
     * @param value The bytes for amgfpdgccfm to set.
     * @return This builder for chaining.
     */
    public Builder setAmgfpdgccfmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      amgfpdgccfm_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JPICNIPDGLJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JPICNIPDGLJ)
  private static final POGOProtos.Rpc.JPICNIPDGLJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JPICNIPDGLJ();
  }

  public static POGOProtos.Rpc.JPICNIPDGLJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JPICNIPDGLJ>
      PARSER = new com.google.protobuf.AbstractParser<JPICNIPDGLJ>() {
    @java.lang.Override
    public JPICNIPDGLJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JPICNIPDGLJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JPICNIPDGLJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JPICNIPDGLJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JPICNIPDGLJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

