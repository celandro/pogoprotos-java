// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ShoppingPageClickTelemetry}
 */
public  final class ShoppingPageClickTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ShoppingPageClickTelemetry)
    ShoppingPageClickTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShoppingPageClickTelemetry.newBuilder() to construct.
  private ShoppingPageClickTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShoppingPageClickTelemetry() {
    shoppingPageClickId_ = 0;
    shoppingPageClickSource_ = 0;
    itemSku_ = "";
    mlBundleTrackingId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShoppingPageClickTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShoppingPageClickTelemetry(
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

            shoppingPageClickId_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            shoppingPageClickSource_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            itemSku_ = s;
            break;
          }
          case 32: {

            hasItem_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            mlBundleTrackingId_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ShoppingPageClickTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ShoppingPageClickTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ShoppingPageClickTelemetry.class, POGOProtos.Rpc.ShoppingPageClickTelemetry.Builder.class);
  }

  public static final int SHOPPING_PAGE_CLICK_ID_FIELD_NUMBER = 1;
  private int shoppingPageClickId_;
  /**
   * <code>.POGOProtos.Rpc.ShoppingPageTelemetryIds shopping_page_click_id = 1;</code>
   * @return The enum numeric value on the wire for shoppingPageClickId.
   */
  public int getShoppingPageClickIdValue() {
    return shoppingPageClickId_;
  }
  /**
   * <code>.POGOProtos.Rpc.ShoppingPageTelemetryIds shopping_page_click_id = 1;</code>
   * @return The shoppingPageClickId.
   */
  public POGOProtos.Rpc.ShoppingPageTelemetryIds getShoppingPageClickId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ShoppingPageTelemetryIds result = POGOProtos.Rpc.ShoppingPageTelemetryIds.valueOf(shoppingPageClickId_);
    return result == null ? POGOProtos.Rpc.ShoppingPageTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int SHOPPING_PAGE_CLICK_SOURCE_FIELD_NUMBER = 2;
  private int shoppingPageClickSource_;
  /**
   * <code>.POGOProtos.Rpc.ShoppingPageTelemetrySource shopping_page_click_source = 2;</code>
   * @return The enum numeric value on the wire for shoppingPageClickSource.
   */
  public int getShoppingPageClickSourceValue() {
    return shoppingPageClickSource_;
  }
  /**
   * <code>.POGOProtos.Rpc.ShoppingPageTelemetrySource shopping_page_click_source = 2;</code>
   * @return The shoppingPageClickSource.
   */
  public POGOProtos.Rpc.ShoppingPageTelemetrySource getShoppingPageClickSource() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ShoppingPageTelemetrySource result = POGOProtos.Rpc.ShoppingPageTelemetrySource.valueOf(shoppingPageClickSource_);
    return result == null ? POGOProtos.Rpc.ShoppingPageTelemetrySource.UNRECOGNIZED : result;
  }

  public static final int ITEM_SKU_FIELD_NUMBER = 3;
  private volatile java.lang.Object itemSku_;
  /**
   * <code>string item_sku = 3;</code>
   * @return The itemSku.
   */
  public java.lang.String getItemSku() {
    java.lang.Object ref = itemSku_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemSku_ = s;
      return s;
    }
  }
  /**
   * <code>string item_sku = 3;</code>
   * @return The bytes for itemSku.
   */
  public com.google.protobuf.ByteString
      getItemSkuBytes() {
    java.lang.Object ref = itemSku_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemSku_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HAS_ITEM_FIELD_NUMBER = 4;
  private boolean hasItem_;
  /**
   * <code>bool has_item = 4;</code>
   * @return The hasItem.
   */
  public boolean getHasItem() {
    return hasItem_;
  }

  public static final int ML_BUNDLE_TRACKING_ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object mlBundleTrackingId_;
  /**
   * <code>string ml_bundle_tracking_id = 5;</code>
   * @return The mlBundleTrackingId.
   */
  public java.lang.String getMlBundleTrackingId() {
    java.lang.Object ref = mlBundleTrackingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mlBundleTrackingId_ = s;
      return s;
    }
  }
  /**
   * <code>string ml_bundle_tracking_id = 5;</code>
   * @return The bytes for mlBundleTrackingId.
   */
  public com.google.protobuf.ByteString
      getMlBundleTrackingIdBytes() {
    java.lang.Object ref = mlBundleTrackingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mlBundleTrackingId_ = b;
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
    if (shoppingPageClickId_ != POGOProtos.Rpc.ShoppingPageTelemetryIds.SHOPPING_PAGE_TELEMETRY_IDS_UNDEFINED_SHOPPING_PAGE_EVENT.getNumber()) {
      output.writeEnum(1, shoppingPageClickId_);
    }
    if (shoppingPageClickSource_ != POGOProtos.Rpc.ShoppingPageTelemetrySource.SHOPPING_PAGE_TELEMETRY_SOURCE_UNDEFINED_SHOPPING_PAGE_SOURCE.getNumber()) {
      output.writeEnum(2, shoppingPageClickSource_);
    }
    if (!getItemSkuBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, itemSku_);
    }
    if (hasItem_ != false) {
      output.writeBool(4, hasItem_);
    }
    if (!getMlBundleTrackingIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, mlBundleTrackingId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shoppingPageClickId_ != POGOProtos.Rpc.ShoppingPageTelemetryIds.SHOPPING_PAGE_TELEMETRY_IDS_UNDEFINED_SHOPPING_PAGE_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, shoppingPageClickId_);
    }
    if (shoppingPageClickSource_ != POGOProtos.Rpc.ShoppingPageTelemetrySource.SHOPPING_PAGE_TELEMETRY_SOURCE_UNDEFINED_SHOPPING_PAGE_SOURCE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, shoppingPageClickSource_);
    }
    if (!getItemSkuBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, itemSku_);
    }
    if (hasItem_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, hasItem_);
    }
    if (!getMlBundleTrackingIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, mlBundleTrackingId_);
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
    if (!(obj instanceof POGOProtos.Rpc.ShoppingPageClickTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ShoppingPageClickTelemetry other = (POGOProtos.Rpc.ShoppingPageClickTelemetry) obj;

    if (shoppingPageClickId_ != other.shoppingPageClickId_) return false;
    if (shoppingPageClickSource_ != other.shoppingPageClickSource_) return false;
    if (!getItemSku()
        .equals(other.getItemSku())) return false;
    if (getHasItem()
        != other.getHasItem()) return false;
    if (!getMlBundleTrackingId()
        .equals(other.getMlBundleTrackingId())) return false;
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
    hash = (37 * hash) + SHOPPING_PAGE_CLICK_ID_FIELD_NUMBER;
    hash = (53 * hash) + shoppingPageClickId_;
    hash = (37 * hash) + SHOPPING_PAGE_CLICK_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + shoppingPageClickSource_;
    hash = (37 * hash) + ITEM_SKU_FIELD_NUMBER;
    hash = (53 * hash) + getItemSku().hashCode();
    hash = (37 * hash) + HAS_ITEM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasItem());
    hash = (37 * hash) + ML_BUNDLE_TRACKING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMlBundleTrackingId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ShoppingPageClickTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ShoppingPageClickTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ShoppingPageClickTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ShoppingPageClickTelemetry)
      POGOProtos.Rpc.ShoppingPageClickTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ShoppingPageClickTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ShoppingPageClickTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ShoppingPageClickTelemetry.class, POGOProtos.Rpc.ShoppingPageClickTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ShoppingPageClickTelemetry.newBuilder()
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
      shoppingPageClickId_ = 0;

      shoppingPageClickSource_ = 0;

      itemSku_ = "";

      hasItem_ = false;

      mlBundleTrackingId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ShoppingPageClickTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ShoppingPageClickTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.ShoppingPageClickTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ShoppingPageClickTelemetry build() {
      POGOProtos.Rpc.ShoppingPageClickTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ShoppingPageClickTelemetry buildPartial() {
      POGOProtos.Rpc.ShoppingPageClickTelemetry result = new POGOProtos.Rpc.ShoppingPageClickTelemetry(this);
      result.shoppingPageClickId_ = shoppingPageClickId_;
      result.shoppingPageClickSource_ = shoppingPageClickSource_;
      result.itemSku_ = itemSku_;
      result.hasItem_ = hasItem_;
      result.mlBundleTrackingId_ = mlBundleTrackingId_;
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
      if (other instanceof POGOProtos.Rpc.ShoppingPageClickTelemetry) {
        return mergeFrom((POGOProtos.Rpc.ShoppingPageClickTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ShoppingPageClickTelemetry other) {
      if (other == POGOProtos.Rpc.ShoppingPageClickTelemetry.getDefaultInstance()) return this;
      if (other.shoppingPageClickId_ != 0) {
        setShoppingPageClickIdValue(other.getShoppingPageClickIdValue());
      }
      if (other.shoppingPageClickSource_ != 0) {
        setShoppingPageClickSourceValue(other.getShoppingPageClickSourceValue());
      }
      if (!other.getItemSku().isEmpty()) {
        itemSku_ = other.itemSku_;
        onChanged();
      }
      if (other.getHasItem() != false) {
        setHasItem(other.getHasItem());
      }
      if (!other.getMlBundleTrackingId().isEmpty()) {
        mlBundleTrackingId_ = other.mlBundleTrackingId_;
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
      POGOProtos.Rpc.ShoppingPageClickTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ShoppingPageClickTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int shoppingPageClickId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetryIds shopping_page_click_id = 1;</code>
     * @return The enum numeric value on the wire for shoppingPageClickId.
     */
    public int getShoppingPageClickIdValue() {
      return shoppingPageClickId_;
    }
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetryIds shopping_page_click_id = 1;</code>
     * @param value The enum numeric value on the wire for shoppingPageClickId to set.
     * @return This builder for chaining.
     */
    public Builder setShoppingPageClickIdValue(int value) {
      shoppingPageClickId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetryIds shopping_page_click_id = 1;</code>
     * @return The shoppingPageClickId.
     */
    public POGOProtos.Rpc.ShoppingPageTelemetryIds getShoppingPageClickId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ShoppingPageTelemetryIds result = POGOProtos.Rpc.ShoppingPageTelemetryIds.valueOf(shoppingPageClickId_);
      return result == null ? POGOProtos.Rpc.ShoppingPageTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetryIds shopping_page_click_id = 1;</code>
     * @param value The shoppingPageClickId to set.
     * @return This builder for chaining.
     */
    public Builder setShoppingPageClickId(POGOProtos.Rpc.ShoppingPageTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      shoppingPageClickId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetryIds shopping_page_click_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShoppingPageClickId() {
      
      shoppingPageClickId_ = 0;
      onChanged();
      return this;
    }

    private int shoppingPageClickSource_ = 0;
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetrySource shopping_page_click_source = 2;</code>
     * @return The enum numeric value on the wire for shoppingPageClickSource.
     */
    public int getShoppingPageClickSourceValue() {
      return shoppingPageClickSource_;
    }
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetrySource shopping_page_click_source = 2;</code>
     * @param value The enum numeric value on the wire for shoppingPageClickSource to set.
     * @return This builder for chaining.
     */
    public Builder setShoppingPageClickSourceValue(int value) {
      shoppingPageClickSource_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetrySource shopping_page_click_source = 2;</code>
     * @return The shoppingPageClickSource.
     */
    public POGOProtos.Rpc.ShoppingPageTelemetrySource getShoppingPageClickSource() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ShoppingPageTelemetrySource result = POGOProtos.Rpc.ShoppingPageTelemetrySource.valueOf(shoppingPageClickSource_);
      return result == null ? POGOProtos.Rpc.ShoppingPageTelemetrySource.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetrySource shopping_page_click_source = 2;</code>
     * @param value The shoppingPageClickSource to set.
     * @return This builder for chaining.
     */
    public Builder setShoppingPageClickSource(POGOProtos.Rpc.ShoppingPageTelemetrySource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      shoppingPageClickSource_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ShoppingPageTelemetrySource shopping_page_click_source = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearShoppingPageClickSource() {
      
      shoppingPageClickSource_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object itemSku_ = "";
    /**
     * <code>string item_sku = 3;</code>
     * @return The itemSku.
     */
    public java.lang.String getItemSku() {
      java.lang.Object ref = itemSku_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemSku_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string item_sku = 3;</code>
     * @return The bytes for itemSku.
     */
    public com.google.protobuf.ByteString
        getItemSkuBytes() {
      java.lang.Object ref = itemSku_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemSku_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string item_sku = 3;</code>
     * @param value The itemSku to set.
     * @return This builder for chaining.
     */
    public Builder setItemSku(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemSku_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string item_sku = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemSku() {
      
      itemSku_ = getDefaultInstance().getItemSku();
      onChanged();
      return this;
    }
    /**
     * <code>string item_sku = 3;</code>
     * @param value The bytes for itemSku to set.
     * @return This builder for chaining.
     */
    public Builder setItemSkuBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemSku_ = value;
      onChanged();
      return this;
    }

    private boolean hasItem_ ;
    /**
     * <code>bool has_item = 4;</code>
     * @return The hasItem.
     */
    public boolean getHasItem() {
      return hasItem_;
    }
    /**
     * <code>bool has_item = 4;</code>
     * @param value The hasItem to set.
     * @return This builder for chaining.
     */
    public Builder setHasItem(boolean value) {
      
      hasItem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool has_item = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasItem() {
      
      hasItem_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object mlBundleTrackingId_ = "";
    /**
     * <code>string ml_bundle_tracking_id = 5;</code>
     * @return The mlBundleTrackingId.
     */
    public java.lang.String getMlBundleTrackingId() {
      java.lang.Object ref = mlBundleTrackingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mlBundleTrackingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ml_bundle_tracking_id = 5;</code>
     * @return The bytes for mlBundleTrackingId.
     */
    public com.google.protobuf.ByteString
        getMlBundleTrackingIdBytes() {
      java.lang.Object ref = mlBundleTrackingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mlBundleTrackingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ml_bundle_tracking_id = 5;</code>
     * @param value The mlBundleTrackingId to set.
     * @return This builder for chaining.
     */
    public Builder setMlBundleTrackingId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mlBundleTrackingId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ml_bundle_tracking_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMlBundleTrackingId() {
      
      mlBundleTrackingId_ = getDefaultInstance().getMlBundleTrackingId();
      onChanged();
      return this;
    }
    /**
     * <code>string ml_bundle_tracking_id = 5;</code>
     * @param value The bytes for mlBundleTrackingId to set.
     * @return This builder for chaining.
     */
    public Builder setMlBundleTrackingIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mlBundleTrackingId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ShoppingPageClickTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ShoppingPageClickTelemetry)
  private static final POGOProtos.Rpc.ShoppingPageClickTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ShoppingPageClickTelemetry();
  }

  public static POGOProtos.Rpc.ShoppingPageClickTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShoppingPageClickTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<ShoppingPageClickTelemetry>() {
    @java.lang.Override
    public ShoppingPageClickTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShoppingPageClickTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShoppingPageClickTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShoppingPageClickTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ShoppingPageClickTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

