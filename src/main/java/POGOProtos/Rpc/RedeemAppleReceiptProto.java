// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.RedeemAppleReceiptProto}
 */
public final class RedeemAppleReceiptProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.RedeemAppleReceiptProto)
    RedeemAppleReceiptProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RedeemAppleReceiptProto.newBuilder() to construct.
  private RedeemAppleReceiptProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RedeemAppleReceiptProto() {
    receipt_ = "";
    purchaseCurrency_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RedeemAppleReceiptProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RedeemAppleReceiptProto(
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

            receipt_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            purchaseCurrency_ = s;
            break;
          }
          case 24: {

            pricePaidE6_ = input.readInt32();
            break;
          }
          case 32: {

            pricePaidE6Long_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RedeemAppleReceiptProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RedeemAppleReceiptProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.RedeemAppleReceiptProto.class, POGOProtos.Rpc.RedeemAppleReceiptProto.Builder.class);
  }

  public static final int RECEIPT_FIELD_NUMBER = 1;
  private volatile java.lang.Object receipt_;
  /**
   * <code>string receipt = 1;</code>
   * @return The receipt.
   */
  @java.lang.Override
  public java.lang.String getReceipt() {
    java.lang.Object ref = receipt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receipt_ = s;
      return s;
    }
  }
  /**
   * <code>string receipt = 1;</code>
   * @return The bytes for receipt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReceiptBytes() {
    java.lang.Object ref = receipt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receipt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PURCHASE_CURRENCY_FIELD_NUMBER = 2;
  private volatile java.lang.Object purchaseCurrency_;
  /**
   * <code>string purchase_currency = 2;</code>
   * @return The purchaseCurrency.
   */
  @java.lang.Override
  public java.lang.String getPurchaseCurrency() {
    java.lang.Object ref = purchaseCurrency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      purchaseCurrency_ = s;
      return s;
    }
  }
  /**
   * <code>string purchase_currency = 2;</code>
   * @return The bytes for purchaseCurrency.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPurchaseCurrencyBytes() {
    java.lang.Object ref = purchaseCurrency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      purchaseCurrency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_PAID_E6_FIELD_NUMBER = 3;
  private int pricePaidE6_;
  /**
   * <code>int32 price_paid_e6 = 3;</code>
   * @return The pricePaidE6.
   */
  @java.lang.Override
  public int getPricePaidE6() {
    return pricePaidE6_;
  }

  public static final int PRICE_PAID_E6_LONG_FIELD_NUMBER = 4;
  private long pricePaidE6Long_;
  /**
   * <code>int64 price_paid_e6_long = 4;</code>
   * @return The pricePaidE6Long.
   */
  @java.lang.Override
  public long getPricePaidE6Long() {
    return pricePaidE6Long_;
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
    if (!getReceiptBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, receipt_);
    }
    if (!getPurchaseCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, purchaseCurrency_);
    }
    if (pricePaidE6_ != 0) {
      output.writeInt32(3, pricePaidE6_);
    }
    if (pricePaidE6Long_ != 0L) {
      output.writeInt64(4, pricePaidE6Long_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getReceiptBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, receipt_);
    }
    if (!getPurchaseCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, purchaseCurrency_);
    }
    if (pricePaidE6_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pricePaidE6_);
    }
    if (pricePaidE6Long_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, pricePaidE6Long_);
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
    if (!(obj instanceof POGOProtos.Rpc.RedeemAppleReceiptProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.RedeemAppleReceiptProto other = (POGOProtos.Rpc.RedeemAppleReceiptProto) obj;

    if (!getReceipt()
        .equals(other.getReceipt())) return false;
    if (!getPurchaseCurrency()
        .equals(other.getPurchaseCurrency())) return false;
    if (getPricePaidE6()
        != other.getPricePaidE6()) return false;
    if (getPricePaidE6Long()
        != other.getPricePaidE6Long()) return false;
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
    hash = (37 * hash) + RECEIPT_FIELD_NUMBER;
    hash = (53 * hash) + getReceipt().hashCode();
    hash = (37 * hash) + PURCHASE_CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getPurchaseCurrency().hashCode();
    hash = (37 * hash) + PRICE_PAID_E6_FIELD_NUMBER;
    hash = (53 * hash) + getPricePaidE6();
    hash = (37 * hash) + PRICE_PAID_E6_LONG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPricePaidE6Long());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RedeemAppleReceiptProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.RedeemAppleReceiptProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.RedeemAppleReceiptProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.RedeemAppleReceiptProto)
      POGOProtos.Rpc.RedeemAppleReceiptProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RedeemAppleReceiptProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RedeemAppleReceiptProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.RedeemAppleReceiptProto.class, POGOProtos.Rpc.RedeemAppleReceiptProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.RedeemAppleReceiptProto.newBuilder()
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
      receipt_ = "";

      purchaseCurrency_ = "";

      pricePaidE6_ = 0;

      pricePaidE6Long_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RedeemAppleReceiptProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RedeemAppleReceiptProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.RedeemAppleReceiptProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.RedeemAppleReceiptProto build() {
      POGOProtos.Rpc.RedeemAppleReceiptProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RedeemAppleReceiptProto buildPartial() {
      POGOProtos.Rpc.RedeemAppleReceiptProto result = new POGOProtos.Rpc.RedeemAppleReceiptProto(this);
      result.receipt_ = receipt_;
      result.purchaseCurrency_ = purchaseCurrency_;
      result.pricePaidE6_ = pricePaidE6_;
      result.pricePaidE6Long_ = pricePaidE6Long_;
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
      if (other instanceof POGOProtos.Rpc.RedeemAppleReceiptProto) {
        return mergeFrom((POGOProtos.Rpc.RedeemAppleReceiptProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.RedeemAppleReceiptProto other) {
      if (other == POGOProtos.Rpc.RedeemAppleReceiptProto.getDefaultInstance()) return this;
      if (!other.getReceipt().isEmpty()) {
        receipt_ = other.receipt_;
        onChanged();
      }
      if (!other.getPurchaseCurrency().isEmpty()) {
        purchaseCurrency_ = other.purchaseCurrency_;
        onChanged();
      }
      if (other.getPricePaidE6() != 0) {
        setPricePaidE6(other.getPricePaidE6());
      }
      if (other.getPricePaidE6Long() != 0L) {
        setPricePaidE6Long(other.getPricePaidE6Long());
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
      POGOProtos.Rpc.RedeemAppleReceiptProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.RedeemAppleReceiptProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object receipt_ = "";
    /**
     * <code>string receipt = 1;</code>
     * @return The receipt.
     */
    public java.lang.String getReceipt() {
      java.lang.Object ref = receipt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receipt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string receipt = 1;</code>
     * @return The bytes for receipt.
     */
    public com.google.protobuf.ByteString
        getReceiptBytes() {
      java.lang.Object ref = receipt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receipt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string receipt = 1;</code>
     * @param value The receipt to set.
     * @return This builder for chaining.
     */
    public Builder setReceipt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      receipt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string receipt = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceipt() {
      
      receipt_ = getDefaultInstance().getReceipt();
      onChanged();
      return this;
    }
    /**
     * <code>string receipt = 1;</code>
     * @param value The bytes for receipt to set.
     * @return This builder for chaining.
     */
    public Builder setReceiptBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      receipt_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object purchaseCurrency_ = "";
    /**
     * <code>string purchase_currency = 2;</code>
     * @return The purchaseCurrency.
     */
    public java.lang.String getPurchaseCurrency() {
      java.lang.Object ref = purchaseCurrency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        purchaseCurrency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string purchase_currency = 2;</code>
     * @return The bytes for purchaseCurrency.
     */
    public com.google.protobuf.ByteString
        getPurchaseCurrencyBytes() {
      java.lang.Object ref = purchaseCurrency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        purchaseCurrency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string purchase_currency = 2;</code>
     * @param value The purchaseCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setPurchaseCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      purchaseCurrency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string purchase_currency = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPurchaseCurrency() {
      
      purchaseCurrency_ = getDefaultInstance().getPurchaseCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string purchase_currency = 2;</code>
     * @param value The bytes for purchaseCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setPurchaseCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      purchaseCurrency_ = value;
      onChanged();
      return this;
    }

    private int pricePaidE6_ ;
    /**
     * <code>int32 price_paid_e6 = 3;</code>
     * @return The pricePaidE6.
     */
    @java.lang.Override
    public int getPricePaidE6() {
      return pricePaidE6_;
    }
    /**
     * <code>int32 price_paid_e6 = 3;</code>
     * @param value The pricePaidE6 to set.
     * @return This builder for chaining.
     */
    public Builder setPricePaidE6(int value) {
      
      pricePaidE6_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 price_paid_e6 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPricePaidE6() {
      
      pricePaidE6_ = 0;
      onChanged();
      return this;
    }

    private long pricePaidE6Long_ ;
    /**
     * <code>int64 price_paid_e6_long = 4;</code>
     * @return The pricePaidE6Long.
     */
    @java.lang.Override
    public long getPricePaidE6Long() {
      return pricePaidE6Long_;
    }
    /**
     * <code>int64 price_paid_e6_long = 4;</code>
     * @param value The pricePaidE6Long to set.
     * @return This builder for chaining.
     */
    public Builder setPricePaidE6Long(long value) {
      
      pricePaidE6Long_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 price_paid_e6_long = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPricePaidE6Long() {
      
      pricePaidE6Long_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.RedeemAppleReceiptProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.RedeemAppleReceiptProto)
  private static final POGOProtos.Rpc.RedeemAppleReceiptProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.RedeemAppleReceiptProto();
  }

  public static POGOProtos.Rpc.RedeemAppleReceiptProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RedeemAppleReceiptProto>
      PARSER = new com.google.protobuf.AbstractParser<RedeemAppleReceiptProto>() {
    @java.lang.Override
    public RedeemAppleReceiptProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RedeemAppleReceiptProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RedeemAppleReceiptProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RedeemAppleReceiptProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.RedeemAppleReceiptProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

