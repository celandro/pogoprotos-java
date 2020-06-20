// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/RedeemGoogleReceiptMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage}
 */
public  final class RedeemGoogleReceiptMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage)
    RedeemGoogleReceiptMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RedeemGoogleReceiptMessage.newBuilder() to construct.
  private RedeemGoogleReceiptMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RedeemGoogleReceiptMessage() {
    receipt_ = "";
    receiptSignature_ = "";
    purchaseCurrency_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RedeemGoogleReceiptMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RedeemGoogleReceiptMessage(
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

            receiptSignature_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            purchaseCurrency_ = s;
            break;
          }
          case 32: {

            pricePaidE6_ = input.readInt32();
            break;
          }
          case 40: {

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
    return POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_RedeemGoogleReceiptMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_RedeemGoogleReceiptMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage.class, POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage.Builder.class);
  }

  public static final int RECEIPT_FIELD_NUMBER = 1;
  private volatile java.lang.Object receipt_;
  /**
   * <pre>
   * see https://developer.android.com/google/play/billing/billing_reference.html table 4
   * </pre>
   *
   * <code>string receipt = 1;</code>
   * @return The receipt.
   */
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
   * <pre>
   * see https://developer.android.com/google/play/billing/billing_reference.html table 4
   * </pre>
   *
   * <code>string receipt = 1;</code>
   * @return The bytes for receipt.
   */
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

  public static final int RECEIPT_SIGNATURE_FIELD_NUMBER = 2;
  private volatile java.lang.Object receiptSignature_;
  /**
   * <code>string receipt_signature = 2;</code>
   * @return The receiptSignature.
   */
  public java.lang.String getReceiptSignature() {
    java.lang.Object ref = receiptSignature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receiptSignature_ = s;
      return s;
    }
  }
  /**
   * <code>string receipt_signature = 2;</code>
   * @return The bytes for receiptSignature.
   */
  public com.google.protobuf.ByteString
      getReceiptSignatureBytes() {
    java.lang.Object ref = receiptSignature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receiptSignature_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PURCHASE_CURRENCY_FIELD_NUMBER = 3;
  private volatile java.lang.Object purchaseCurrency_;
  /**
   * <code>string purchase_currency = 3;</code>
   * @return The purchaseCurrency.
   */
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
   * <code>string purchase_currency = 3;</code>
   * @return The bytes for purchaseCurrency.
   */
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

  public static final int PRICE_PAID_E6_FIELD_NUMBER = 4;
  private int pricePaidE6_;
  /**
   * <code>int32 price_paid_e6 = 4;</code>
   * @return The pricePaidE6.
   */
  public int getPricePaidE6() {
    return pricePaidE6_;
  }

  public static final int PRICE_PAID_E6_LONG_FIELD_NUMBER = 5;
  private long pricePaidE6Long_;
  /**
   * <code>int64 price_paid_e6_long = 5;</code>
   * @return The pricePaidE6Long.
   */
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
    if (!getReceiptSignatureBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, receiptSignature_);
    }
    if (!getPurchaseCurrencyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, purchaseCurrency_);
    }
    if (pricePaidE6_ != 0) {
      output.writeInt32(4, pricePaidE6_);
    }
    if (pricePaidE6Long_ != 0L) {
      output.writeInt64(5, pricePaidE6Long_);
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
    if (!getReceiptSignatureBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, receiptSignature_);
    }
    if (!getPurchaseCurrencyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, purchaseCurrency_);
    }
    if (pricePaidE6_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, pricePaidE6_);
    }
    if (pricePaidE6Long_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, pricePaidE6Long_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage other = (POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage) obj;

    if (!getReceipt()
        .equals(other.getReceipt())) return false;
    if (!getReceiptSignature()
        .equals(other.getReceiptSignature())) return false;
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
    hash = (37 * hash) + RECEIPT_SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getReceiptSignature().hashCode();
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

  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage)
      POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_RedeemGoogleReceiptMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_RedeemGoogleReceiptMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage.class, POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage.newBuilder()
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

      receiptSignature_ = "";

      purchaseCurrency_ = "";

      pricePaidE6_ = 0;

      pricePaidE6Long_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_RedeemGoogleReceiptMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage build() {
      POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage result = new POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage(this);
      result.receipt_ = receipt_;
      result.receiptSignature_ = receiptSignature_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage.getDefaultInstance()) return this;
      if (!other.getReceipt().isEmpty()) {
        receipt_ = other.receipt_;
        onChanged();
      }
      if (!other.getReceiptSignature().isEmpty()) {
        receiptSignature_ = other.receiptSignature_;
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
      POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage) e.getUnfinishedMessage();
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
     * <pre>
     * see https://developer.android.com/google/play/billing/billing_reference.html table 4
     * </pre>
     *
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
     * <pre>
     * see https://developer.android.com/google/play/billing/billing_reference.html table 4
     * </pre>
     *
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
     * <pre>
     * see https://developer.android.com/google/play/billing/billing_reference.html table 4
     * </pre>
     *
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
     * <pre>
     * see https://developer.android.com/google/play/billing/billing_reference.html table 4
     * </pre>
     *
     * <code>string receipt = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceipt() {
      
      receipt_ = getDefaultInstance().getReceipt();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * see https://developer.android.com/google/play/billing/billing_reference.html table 4
     * </pre>
     *
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

    private java.lang.Object receiptSignature_ = "";
    /**
     * <code>string receipt_signature = 2;</code>
     * @return The receiptSignature.
     */
    public java.lang.String getReceiptSignature() {
      java.lang.Object ref = receiptSignature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiptSignature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string receipt_signature = 2;</code>
     * @return The bytes for receiptSignature.
     */
    public com.google.protobuf.ByteString
        getReceiptSignatureBytes() {
      java.lang.Object ref = receiptSignature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiptSignature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string receipt_signature = 2;</code>
     * @param value The receiptSignature to set.
     * @return This builder for chaining.
     */
    public Builder setReceiptSignature(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      receiptSignature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string receipt_signature = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiptSignature() {
      
      receiptSignature_ = getDefaultInstance().getReceiptSignature();
      onChanged();
      return this;
    }
    /**
     * <code>string receipt_signature = 2;</code>
     * @param value The bytes for receiptSignature to set.
     * @return This builder for chaining.
     */
    public Builder setReceiptSignatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      receiptSignature_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object purchaseCurrency_ = "";
    /**
     * <code>string purchase_currency = 3;</code>
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
     * <code>string purchase_currency = 3;</code>
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
     * <code>string purchase_currency = 3;</code>
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
     * <code>string purchase_currency = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPurchaseCurrency() {
      
      purchaseCurrency_ = getDefaultInstance().getPurchaseCurrency();
      onChanged();
      return this;
    }
    /**
     * <code>string purchase_currency = 3;</code>
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
     * <code>int32 price_paid_e6 = 4;</code>
     * @return The pricePaidE6.
     */
    public int getPricePaidE6() {
      return pricePaidE6_;
    }
    /**
     * <code>int32 price_paid_e6 = 4;</code>
     * @param value The pricePaidE6 to set.
     * @return This builder for chaining.
     */
    public Builder setPricePaidE6(int value) {
      
      pricePaidE6_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 price_paid_e6 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPricePaidE6() {
      
      pricePaidE6_ = 0;
      onChanged();
      return this;
    }

    private long pricePaidE6Long_ ;
    /**
     * <code>int64 price_paid_e6_long = 5;</code>
     * @return The pricePaidE6Long.
     */
    public long getPricePaidE6Long() {
      return pricePaidE6Long_;
    }
    /**
     * <code>int64 price_paid_e6_long = 5;</code>
     * @param value The pricePaidE6Long to set.
     * @return This builder for chaining.
     */
    public Builder setPricePaidE6Long(long value) {
      
      pricePaidE6Long_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 price_paid_e6_long = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage)
  private static final POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RedeemGoogleReceiptMessage>
      PARSER = new com.google.protobuf.AbstractParser<RedeemGoogleReceiptMessage>() {
    @java.lang.Override
    public RedeemGoogleReceiptMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RedeemGoogleReceiptMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RedeemGoogleReceiptMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RedeemGoogleReceiptMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.RedeemGoogleReceiptMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

