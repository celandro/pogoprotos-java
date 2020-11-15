// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Store/CurrencyUpdate.proto

package POGOProtos.Data.Store;

/**
 * Protobuf type {@code POGOProtos.Data.Store.CurrencyUpdate}
 */
public final class CurrencyUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Store.CurrencyUpdate)
    CurrencyUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CurrencyUpdate.newBuilder() to construct.
  private CurrencyUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CurrencyUpdate() {
    currencyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CurrencyUpdate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CurrencyUpdate(
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

            currencyName_ = s;
            break;
          }
          case 16: {

            currencyDelta_ = input.readInt32();
            break;
          }
          case 24: {

            currencyBalance_ = input.readInt32();
            break;
          }
          case 32: {

            fiatPurchasedBalance_ = input.readInt32();
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
    return POGOProtos.Data.Store.CurrencyUpdateOuterClass.internal_static_POGOProtos_Data_Store_CurrencyUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Store.CurrencyUpdateOuterClass.internal_static_POGOProtos_Data_Store_CurrencyUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Store.CurrencyUpdate.class, POGOProtos.Data.Store.CurrencyUpdate.Builder.class);
  }

  public static final int CURRENCY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object currencyName_;
  /**
   * <code>string currency_name = 1;</code>
   * @return The currencyName.
   */
  @java.lang.Override
  public java.lang.String getCurrencyName() {
    java.lang.Object ref = currencyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currencyName_ = s;
      return s;
    }
  }
  /**
   * <code>string currency_name = 1;</code>
   * @return The bytes for currencyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCurrencyNameBytes() {
    java.lang.Object ref = currencyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currencyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENCY_DELTA_FIELD_NUMBER = 2;
  private int currencyDelta_;
  /**
   * <code>int32 currency_delta = 2;</code>
   * @return The currencyDelta.
   */
  @java.lang.Override
  public int getCurrencyDelta() {
    return currencyDelta_;
  }

  public static final int CURRENCY_BALANCE_FIELD_NUMBER = 3;
  private int currencyBalance_;
  /**
   * <code>int32 currency_balance = 3;</code>
   * @return The currencyBalance.
   */
  @java.lang.Override
  public int getCurrencyBalance() {
    return currencyBalance_;
  }

  public static final int FIAT_PURCHASED_BALANCE_FIELD_NUMBER = 4;
  private int fiatPurchasedBalance_;
  /**
   * <code>int32 fiat_purchased_balance = 4;</code>
   * @return The fiatPurchasedBalance.
   */
  @java.lang.Override
  public int getFiatPurchasedBalance() {
    return fiatPurchasedBalance_;
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
    if (!getCurrencyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, currencyName_);
    }
    if (currencyDelta_ != 0) {
      output.writeInt32(2, currencyDelta_);
    }
    if (currencyBalance_ != 0) {
      output.writeInt32(3, currencyBalance_);
    }
    if (fiatPurchasedBalance_ != 0) {
      output.writeInt32(4, fiatPurchasedBalance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCurrencyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, currencyName_);
    }
    if (currencyDelta_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, currencyDelta_);
    }
    if (currencyBalance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, currencyBalance_);
    }
    if (fiatPurchasedBalance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, fiatPurchasedBalance_);
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
    if (!(obj instanceof POGOProtos.Data.Store.CurrencyUpdate)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Store.CurrencyUpdate other = (POGOProtos.Data.Store.CurrencyUpdate) obj;

    if (!getCurrencyName()
        .equals(other.getCurrencyName())) return false;
    if (getCurrencyDelta()
        != other.getCurrencyDelta()) return false;
    if (getCurrencyBalance()
        != other.getCurrencyBalance()) return false;
    if (getFiatPurchasedBalance()
        != other.getFiatPurchasedBalance()) return false;
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
    hash = (37 * hash) + CURRENCY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getCurrencyName().hashCode();
    hash = (37 * hash) + CURRENCY_DELTA_FIELD_NUMBER;
    hash = (53 * hash) + getCurrencyDelta();
    hash = (37 * hash) + CURRENCY_BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getCurrencyBalance();
    hash = (37 * hash) + FIAT_PURCHASED_BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getFiatPurchasedBalance();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Store.CurrencyUpdate parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Store.CurrencyUpdate prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Store.CurrencyUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Store.CurrencyUpdate)
      POGOProtos.Data.Store.CurrencyUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Store.CurrencyUpdateOuterClass.internal_static_POGOProtos_Data_Store_CurrencyUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Store.CurrencyUpdateOuterClass.internal_static_POGOProtos_Data_Store_CurrencyUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Store.CurrencyUpdate.class, POGOProtos.Data.Store.CurrencyUpdate.Builder.class);
    }

    // Construct using POGOProtos.Data.Store.CurrencyUpdate.newBuilder()
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
      currencyName_ = "";

      currencyDelta_ = 0;

      currencyBalance_ = 0;

      fiatPurchasedBalance_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Store.CurrencyUpdateOuterClass.internal_static_POGOProtos_Data_Store_CurrencyUpdate_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Store.CurrencyUpdate getDefaultInstanceForType() {
      return POGOProtos.Data.Store.CurrencyUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Store.CurrencyUpdate build() {
      POGOProtos.Data.Store.CurrencyUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Store.CurrencyUpdate buildPartial() {
      POGOProtos.Data.Store.CurrencyUpdate result = new POGOProtos.Data.Store.CurrencyUpdate(this);
      result.currencyName_ = currencyName_;
      result.currencyDelta_ = currencyDelta_;
      result.currencyBalance_ = currencyBalance_;
      result.fiatPurchasedBalance_ = fiatPurchasedBalance_;
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
      if (other instanceof POGOProtos.Data.Store.CurrencyUpdate) {
        return mergeFrom((POGOProtos.Data.Store.CurrencyUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Store.CurrencyUpdate other) {
      if (other == POGOProtos.Data.Store.CurrencyUpdate.getDefaultInstance()) return this;
      if (!other.getCurrencyName().isEmpty()) {
        currencyName_ = other.currencyName_;
        onChanged();
      }
      if (other.getCurrencyDelta() != 0) {
        setCurrencyDelta(other.getCurrencyDelta());
      }
      if (other.getCurrencyBalance() != 0) {
        setCurrencyBalance(other.getCurrencyBalance());
      }
      if (other.getFiatPurchasedBalance() != 0) {
        setFiatPurchasedBalance(other.getFiatPurchasedBalance());
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
      POGOProtos.Data.Store.CurrencyUpdate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Store.CurrencyUpdate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object currencyName_ = "";
    /**
     * <code>string currency_name = 1;</code>
     * @return The currencyName.
     */
    public java.lang.String getCurrencyName() {
      java.lang.Object ref = currencyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currencyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currency_name = 1;</code>
     * @return The bytes for currencyName.
     */
    public com.google.protobuf.ByteString
        getCurrencyNameBytes() {
      java.lang.Object ref = currencyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currencyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currency_name = 1;</code>
     * @param value The currencyName to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currencyName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currency_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrencyName() {
      
      currencyName_ = getDefaultInstance().getCurrencyName();
      onChanged();
      return this;
    }
    /**
     * <code>string currency_name = 1;</code>
     * @param value The bytes for currencyName to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currencyName_ = value;
      onChanged();
      return this;
    }

    private int currencyDelta_ ;
    /**
     * <code>int32 currency_delta = 2;</code>
     * @return The currencyDelta.
     */
    @java.lang.Override
    public int getCurrencyDelta() {
      return currencyDelta_;
    }
    /**
     * <code>int32 currency_delta = 2;</code>
     * @param value The currencyDelta to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyDelta(int value) {
      
      currencyDelta_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 currency_delta = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrencyDelta() {
      
      currencyDelta_ = 0;
      onChanged();
      return this;
    }

    private int currencyBalance_ ;
    /**
     * <code>int32 currency_balance = 3;</code>
     * @return The currencyBalance.
     */
    @java.lang.Override
    public int getCurrencyBalance() {
      return currencyBalance_;
    }
    /**
     * <code>int32 currency_balance = 3;</code>
     * @param value The currencyBalance to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyBalance(int value) {
      
      currencyBalance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 currency_balance = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrencyBalance() {
      
      currencyBalance_ = 0;
      onChanged();
      return this;
    }

    private int fiatPurchasedBalance_ ;
    /**
     * <code>int32 fiat_purchased_balance = 4;</code>
     * @return The fiatPurchasedBalance.
     */
    @java.lang.Override
    public int getFiatPurchasedBalance() {
      return fiatPurchasedBalance_;
    }
    /**
     * <code>int32 fiat_purchased_balance = 4;</code>
     * @param value The fiatPurchasedBalance to set.
     * @return This builder for chaining.
     */
    public Builder setFiatPurchasedBalance(int value) {
      
      fiatPurchasedBalance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fiat_purchased_balance = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiatPurchasedBalance() {
      
      fiatPurchasedBalance_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Store.CurrencyUpdate)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Store.CurrencyUpdate)
  private static final POGOProtos.Data.Store.CurrencyUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Store.CurrencyUpdate();
  }

  public static POGOProtos.Data.Store.CurrencyUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CurrencyUpdate>
      PARSER = new com.google.protobuf.AbstractParser<CurrencyUpdate>() {
    @java.lang.Override
    public CurrencyUpdate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CurrencyUpdate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CurrencyUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CurrencyUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Store.CurrencyUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

