// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CKLMIIHNJNB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CKLMIIHNJNB}
 */
public final class CKLMIIHNJNB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CKLMIIHNJNB)
    CKLMIIHNJNBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CKLMIIHNJNB.newBuilder() to construct.
  private CKLMIIHNJNB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CKLMIIHNJNB() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CKLMIIHNJNB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CKLMIIHNJNB(
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

            kfnaalbpflm_ = input.readBool();
            break;
          }
          case 16: {

            pageOffset_ = input.readInt32();
            break;
          }
          case 24: {

            jmkkockkpbe_ = input.readUInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKLMIIHNJNB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKLMIIHNJNB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CKLMIIHNJNB.class, POGOProtos.Rpc.CKLMIIHNJNB.Builder.class);
  }

  public static final int KFNAALBPFLM_FIELD_NUMBER = 1;
  private boolean kfnaalbpflm_;
  /**
   * <code>bool kfnaalbpflm = 1;</code>
   * @return The kfnaalbpflm.
   */
  @java.lang.Override
  public boolean getKfnaalbpflm() {
    return kfnaalbpflm_;
  }

  public static final int PAGE_OFFSET_FIELD_NUMBER = 2;
  private int pageOffset_;
  /**
   * <code>int32 page_offset = 2;</code>
   * @return The pageOffset.
   */
  @java.lang.Override
  public int getPageOffset() {
    return pageOffset_;
  }

  public static final int JMKKOCKKPBE_FIELD_NUMBER = 3;
  private long jmkkockkpbe_;
  /**
   * <code>uint64 jmkkockkpbe = 3;</code>
   * @return The jmkkockkpbe.
   */
  @java.lang.Override
  public long getJmkkockkpbe() {
    return jmkkockkpbe_;
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
    if (kfnaalbpflm_ != false) {
      output.writeBool(1, kfnaalbpflm_);
    }
    if (pageOffset_ != 0) {
      output.writeInt32(2, pageOffset_);
    }
    if (jmkkockkpbe_ != 0L) {
      output.writeUInt64(3, jmkkockkpbe_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kfnaalbpflm_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, kfnaalbpflm_);
    }
    if (pageOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageOffset_);
    }
    if (jmkkockkpbe_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, jmkkockkpbe_);
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
    if (!(obj instanceof POGOProtos.Rpc.CKLMIIHNJNB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CKLMIIHNJNB other = (POGOProtos.Rpc.CKLMIIHNJNB) obj;

    if (getKfnaalbpflm()
        != other.getKfnaalbpflm()) return false;
    if (getPageOffset()
        != other.getPageOffset()) return false;
    if (getJmkkockkpbe()
        != other.getJmkkockkpbe()) return false;
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
    hash = (37 * hash) + KFNAALBPFLM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKfnaalbpflm());
    hash = (37 * hash) + PAGE_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getPageOffset();
    hash = (37 * hash) + JMKKOCKKPBE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJmkkockkpbe());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKLMIIHNJNB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CKLMIIHNJNB prototype) {
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
   * ref: CKLMIIHNJNB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CKLMIIHNJNB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CKLMIIHNJNB)
      POGOProtos.Rpc.CKLMIIHNJNBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKLMIIHNJNB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKLMIIHNJNB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CKLMIIHNJNB.class, POGOProtos.Rpc.CKLMIIHNJNB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CKLMIIHNJNB.newBuilder()
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
      kfnaalbpflm_ = false;

      pageOffset_ = 0;

      jmkkockkpbe_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKLMIIHNJNB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKLMIIHNJNB getDefaultInstanceForType() {
      return POGOProtos.Rpc.CKLMIIHNJNB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKLMIIHNJNB build() {
      POGOProtos.Rpc.CKLMIIHNJNB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKLMIIHNJNB buildPartial() {
      POGOProtos.Rpc.CKLMIIHNJNB result = new POGOProtos.Rpc.CKLMIIHNJNB(this);
      result.kfnaalbpflm_ = kfnaalbpflm_;
      result.pageOffset_ = pageOffset_;
      result.jmkkockkpbe_ = jmkkockkpbe_;
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
      if (other instanceof POGOProtos.Rpc.CKLMIIHNJNB) {
        return mergeFrom((POGOProtos.Rpc.CKLMIIHNJNB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CKLMIIHNJNB other) {
      if (other == POGOProtos.Rpc.CKLMIIHNJNB.getDefaultInstance()) return this;
      if (other.getKfnaalbpflm() != false) {
        setKfnaalbpflm(other.getKfnaalbpflm());
      }
      if (other.getPageOffset() != 0) {
        setPageOffset(other.getPageOffset());
      }
      if (other.getJmkkockkpbe() != 0L) {
        setJmkkockkpbe(other.getJmkkockkpbe());
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
      POGOProtos.Rpc.CKLMIIHNJNB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CKLMIIHNJNB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean kfnaalbpflm_ ;
    /**
     * <code>bool kfnaalbpflm = 1;</code>
     * @return The kfnaalbpflm.
     */
    @java.lang.Override
    public boolean getKfnaalbpflm() {
      return kfnaalbpflm_;
    }
    /**
     * <code>bool kfnaalbpflm = 1;</code>
     * @param value The kfnaalbpflm to set.
     * @return This builder for chaining.
     */
    public Builder setKfnaalbpflm(boolean value) {
      
      kfnaalbpflm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool kfnaalbpflm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKfnaalbpflm() {
      
      kfnaalbpflm_ = false;
      onChanged();
      return this;
    }

    private int pageOffset_ ;
    /**
     * <code>int32 page_offset = 2;</code>
     * @return The pageOffset.
     */
    @java.lang.Override
    public int getPageOffset() {
      return pageOffset_;
    }
    /**
     * <code>int32 page_offset = 2;</code>
     * @param value The pageOffset to set.
     * @return This builder for chaining.
     */
    public Builder setPageOffset(int value) {
      
      pageOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageOffset() {
      
      pageOffset_ = 0;
      onChanged();
      return this;
    }

    private long jmkkockkpbe_ ;
    /**
     * <code>uint64 jmkkockkpbe = 3;</code>
     * @return The jmkkockkpbe.
     */
    @java.lang.Override
    public long getJmkkockkpbe() {
      return jmkkockkpbe_;
    }
    /**
     * <code>uint64 jmkkockkpbe = 3;</code>
     * @param value The jmkkockkpbe to set.
     * @return This builder for chaining.
     */
    public Builder setJmkkockkpbe(long value) {
      
      jmkkockkpbe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 jmkkockkpbe = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJmkkockkpbe() {
      
      jmkkockkpbe_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CKLMIIHNJNB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CKLMIIHNJNB)
  private static final POGOProtos.Rpc.CKLMIIHNJNB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CKLMIIHNJNB();
  }

  public static POGOProtos.Rpc.CKLMIIHNJNB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CKLMIIHNJNB>
      PARSER = new com.google.protobuf.AbstractParser<CKLMIIHNJNB>() {
    @java.lang.Override
    public CKLMIIHNJNB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CKLMIIHNJNB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CKLMIIHNJNB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CKLMIIHNJNB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CKLMIIHNJNB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
