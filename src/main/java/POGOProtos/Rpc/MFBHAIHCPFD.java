// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MFBHAIHCPFD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MFBHAIHCPFD}
 */
public final class MFBHAIHCPFD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MFBHAIHCPFD)
    MFBHAIHCPFDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MFBHAIHCPFD.newBuilder() to construct.
  private MFBHAIHCPFD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MFBHAIHCPFD() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MFBHAIHCPFD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MFBHAIHCPFD(
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

            mfkgkhdmbpb_ = input.readInt64();
            break;
          }
          case 16: {

            ohcbbeiobnc_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFBHAIHCPFD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFBHAIHCPFD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MFBHAIHCPFD.class, POGOProtos.Rpc.MFBHAIHCPFD.Builder.class);
  }

  public static final int MFKGKHDMBPB_FIELD_NUMBER = 1;
  private long mfkgkhdmbpb_;
  /**
   * <code>int64 mfkgkhdmbpb = 1;</code>
   * @return The mfkgkhdmbpb.
   */
  @java.lang.Override
  public long getMfkgkhdmbpb() {
    return mfkgkhdmbpb_;
  }

  public static final int OHCBBEIOBNC_FIELD_NUMBER = 2;
  private boolean ohcbbeiobnc_;
  /**
   * <code>bool ohcbbeiobnc = 2;</code>
   * @return The ohcbbeiobnc.
   */
  @java.lang.Override
  public boolean getOhcbbeiobnc() {
    return ohcbbeiobnc_;
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
    if (mfkgkhdmbpb_ != 0L) {
      output.writeInt64(1, mfkgkhdmbpb_);
    }
    if (ohcbbeiobnc_ != false) {
      output.writeBool(2, ohcbbeiobnc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mfkgkhdmbpb_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, mfkgkhdmbpb_);
    }
    if (ohcbbeiobnc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ohcbbeiobnc_);
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
    if (!(obj instanceof POGOProtos.Rpc.MFBHAIHCPFD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MFBHAIHCPFD other = (POGOProtos.Rpc.MFBHAIHCPFD) obj;

    if (getMfkgkhdmbpb()
        != other.getMfkgkhdmbpb()) return false;
    if (getOhcbbeiobnc()
        != other.getOhcbbeiobnc()) return false;
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
    hash = (37 * hash) + MFKGKHDMBPB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMfkgkhdmbpb());
    hash = (37 * hash) + OHCBBEIOBNC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOhcbbeiobnc());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MFBHAIHCPFD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MFBHAIHCPFD prototype) {
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
   * ref: MFBHAIHCPFD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MFBHAIHCPFD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MFBHAIHCPFD)
      POGOProtos.Rpc.MFBHAIHCPFDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFBHAIHCPFD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFBHAIHCPFD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MFBHAIHCPFD.class, POGOProtos.Rpc.MFBHAIHCPFD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MFBHAIHCPFD.newBuilder()
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
      mfkgkhdmbpb_ = 0L;

      ohcbbeiobnc_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MFBHAIHCPFD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MFBHAIHCPFD getDefaultInstanceForType() {
      return POGOProtos.Rpc.MFBHAIHCPFD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MFBHAIHCPFD build() {
      POGOProtos.Rpc.MFBHAIHCPFD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MFBHAIHCPFD buildPartial() {
      POGOProtos.Rpc.MFBHAIHCPFD result = new POGOProtos.Rpc.MFBHAIHCPFD(this);
      result.mfkgkhdmbpb_ = mfkgkhdmbpb_;
      result.ohcbbeiobnc_ = ohcbbeiobnc_;
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
      if (other instanceof POGOProtos.Rpc.MFBHAIHCPFD) {
        return mergeFrom((POGOProtos.Rpc.MFBHAIHCPFD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MFBHAIHCPFD other) {
      if (other == POGOProtos.Rpc.MFBHAIHCPFD.getDefaultInstance()) return this;
      if (other.getMfkgkhdmbpb() != 0L) {
        setMfkgkhdmbpb(other.getMfkgkhdmbpb());
      }
      if (other.getOhcbbeiobnc() != false) {
        setOhcbbeiobnc(other.getOhcbbeiobnc());
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
      POGOProtos.Rpc.MFBHAIHCPFD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MFBHAIHCPFD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long mfkgkhdmbpb_ ;
    /**
     * <code>int64 mfkgkhdmbpb = 1;</code>
     * @return The mfkgkhdmbpb.
     */
    @java.lang.Override
    public long getMfkgkhdmbpb() {
      return mfkgkhdmbpb_;
    }
    /**
     * <code>int64 mfkgkhdmbpb = 1;</code>
     * @param value The mfkgkhdmbpb to set.
     * @return This builder for chaining.
     */
    public Builder setMfkgkhdmbpb(long value) {
      
      mfkgkhdmbpb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mfkgkhdmbpb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfkgkhdmbpb() {
      
      mfkgkhdmbpb_ = 0L;
      onChanged();
      return this;
    }

    private boolean ohcbbeiobnc_ ;
    /**
     * <code>bool ohcbbeiobnc = 2;</code>
     * @return The ohcbbeiobnc.
     */
    @java.lang.Override
    public boolean getOhcbbeiobnc() {
      return ohcbbeiobnc_;
    }
    /**
     * <code>bool ohcbbeiobnc = 2;</code>
     * @param value The ohcbbeiobnc to set.
     * @return This builder for chaining.
     */
    public Builder setOhcbbeiobnc(boolean value) {
      
      ohcbbeiobnc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ohcbbeiobnc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOhcbbeiobnc() {
      
      ohcbbeiobnc_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MFBHAIHCPFD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MFBHAIHCPFD)
  private static final POGOProtos.Rpc.MFBHAIHCPFD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MFBHAIHCPFD();
  }

  public static POGOProtos.Rpc.MFBHAIHCPFD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MFBHAIHCPFD>
      PARSER = new com.google.protobuf.AbstractParser<MFBHAIHCPFD>() {
    @java.lang.Override
    public MFBHAIHCPFD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MFBHAIHCPFD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MFBHAIHCPFD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MFBHAIHCPFD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MFBHAIHCPFD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
