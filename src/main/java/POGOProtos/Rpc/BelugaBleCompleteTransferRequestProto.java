// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto}
 */
public  final class BelugaBleCompleteTransferRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto)
    BelugaBleCompleteTransferRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BelugaBleCompleteTransferRequestProto.newBuilder() to construct.
  private BelugaBleCompleteTransferRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BelugaBleCompleteTransferRequestProto() {
    nonce_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BelugaBleCompleteTransferRequestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BelugaBleCompleteTransferRequestProto(
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

            transactionId_ = input.readInt64();
            break;
          }
          case 16: {

            belugaRequestedItemId_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nonce_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleCompleteTransferRequestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleCompleteTransferRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.class, POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.Builder.class);
  }

  public static final int TRANSACTION_ID_FIELD_NUMBER = 1;
  private long transactionId_;
  /**
   * <code>int64 transaction_id = 1;</code>
   * @return The transactionId.
   */
  public long getTransactionId() {
    return transactionId_;
  }

  public static final int BELUGA_REQUESTED_ITEM_ID_FIELD_NUMBER = 2;
  private int belugaRequestedItemId_;
  /**
   * <code>int32 beluga_requested_item_id = 2;</code>
   * @return The belugaRequestedItemId.
   */
  public int getBelugaRequestedItemId() {
    return belugaRequestedItemId_;
  }

  public static final int NONCE_FIELD_NUMBER = 3;
  private volatile java.lang.Object nonce_;
  /**
   * <code>string nonce = 3;</code>
   * @return The nonce.
   */
  public java.lang.String getNonce() {
    java.lang.Object ref = nonce_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nonce_ = s;
      return s;
    }
  }
  /**
   * <code>string nonce = 3;</code>
   * @return The bytes for nonce.
   */
  public com.google.protobuf.ByteString
      getNonceBytes() {
    java.lang.Object ref = nonce_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nonce_ = b;
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
    if (transactionId_ != 0L) {
      output.writeInt64(1, transactionId_);
    }
    if (belugaRequestedItemId_ != 0) {
      output.writeInt32(2, belugaRequestedItemId_);
    }
    if (!getNonceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nonce_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transactionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, transactionId_);
    }
    if (belugaRequestedItemId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, belugaRequestedItemId_);
    }
    if (!getNonceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nonce_);
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
    if (!(obj instanceof POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto other = (POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto) obj;

    if (getTransactionId()
        != other.getTransactionId()) return false;
    if (getBelugaRequestedItemId()
        != other.getBelugaRequestedItemId()) return false;
    if (!getNonce()
        .equals(other.getNonce())) return false;
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
    hash = (37 * hash) + TRANSACTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTransactionId());
    hash = (37 * hash) + BELUGA_REQUESTED_ITEM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBelugaRequestedItemId();
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getNonce().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto)
      POGOProtos.Rpc.BelugaBleCompleteTransferRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleCompleteTransferRequestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleCompleteTransferRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.class, POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.newBuilder()
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
      transactionId_ = 0L;

      belugaRequestedItemId_ = 0;

      nonce_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleCompleteTransferRequestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto build() {
      POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto buildPartial() {
      POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto result = new POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto(this);
      result.transactionId_ = transactionId_;
      result.belugaRequestedItemId_ = belugaRequestedItemId_;
      result.nonce_ = nonce_;
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
      if (other instanceof POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto) {
        return mergeFrom((POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto other) {
      if (other == POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.getDefaultInstance()) return this;
      if (other.getTransactionId() != 0L) {
        setTransactionId(other.getTransactionId());
      }
      if (other.getBelugaRequestedItemId() != 0) {
        setBelugaRequestedItemId(other.getBelugaRequestedItemId());
      }
      if (!other.getNonce().isEmpty()) {
        nonce_ = other.nonce_;
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
      POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long transactionId_ ;
    /**
     * <code>int64 transaction_id = 1;</code>
     * @return The transactionId.
     */
    public long getTransactionId() {
      return transactionId_;
    }
    /**
     * <code>int64 transaction_id = 1;</code>
     * @param value The transactionId to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionId(long value) {
      
      transactionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 transaction_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransactionId() {
      
      transactionId_ = 0L;
      onChanged();
      return this;
    }

    private int belugaRequestedItemId_ ;
    /**
     * <code>int32 beluga_requested_item_id = 2;</code>
     * @return The belugaRequestedItemId.
     */
    public int getBelugaRequestedItemId() {
      return belugaRequestedItemId_;
    }
    /**
     * <code>int32 beluga_requested_item_id = 2;</code>
     * @param value The belugaRequestedItemId to set.
     * @return This builder for chaining.
     */
    public Builder setBelugaRequestedItemId(int value) {
      
      belugaRequestedItemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 beluga_requested_item_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBelugaRequestedItemId() {
      
      belugaRequestedItemId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object nonce_ = "";
    /**
     * <code>string nonce = 3;</code>
     * @return The nonce.
     */
    public java.lang.String getNonce() {
      java.lang.Object ref = nonce_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nonce_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nonce = 3;</code>
     * @return The bytes for nonce.
     */
    public com.google.protobuf.ByteString
        getNonceBytes() {
      java.lang.Object ref = nonce_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nonce_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nonce = 3;</code>
     * @param value The nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonce(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nonce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nonce = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNonce() {
      
      nonce_ = getDefaultInstance().getNonce();
      onChanged();
      return this;
    }
    /**
     * <code>string nonce = 3;</code>
     * @param value The bytes for nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nonce_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto)
  private static final POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto();
  }

  public static POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BelugaBleCompleteTransferRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<BelugaBleCompleteTransferRequestProto>() {
    @java.lang.Override
    public BelugaBleCompleteTransferRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BelugaBleCompleteTransferRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BelugaBleCompleteTransferRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BelugaBleCompleteTransferRequestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

