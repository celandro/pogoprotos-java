// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Redeem/RedeemedItem.proto

package POGOProtos.Data.Redeem;

/**
 * Protobuf type {@code POGOProtos.Data.Redeem.RedeemedItem}
 */
public  final class RedeemedItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Redeem.RedeemedItem)
    RedeemedItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RedeemedItem.newBuilder() to construct.
  private RedeemedItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RedeemedItem() {
    item_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RedeemedItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RedeemedItem(
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

            item_ = rawValue;
            break;
          }
          case 16: {

            itemCount_ = input.readInt32();
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
    return POGOProtos.Data.Redeem.RedeemedItemOuterClass.internal_static_POGOProtos_Data_Redeem_RedeemedItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Redeem.RedeemedItemOuterClass.internal_static_POGOProtos_Data_Redeem_RedeemedItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Redeem.RedeemedItem.class, POGOProtos.Data.Redeem.RedeemedItem.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private int item_;
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item = 1;</code>
   * @return The enum numeric value on the wire for item.
   */
  public int getItemValue() {
    return item_;
  }
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item = 1;</code>
   * @return The item.
   */
  public POGOProtos.Inventory.Item.ItemId getItem() {
    @SuppressWarnings("deprecation")
    POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(item_);
    return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
  }

  public static final int ITEM_COUNT_FIELD_NUMBER = 2;
  private int itemCount_;
  /**
   * <code>int32 item_count = 2;</code>
   * @return The itemCount.
   */
  public int getItemCount() {
    return itemCount_;
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
    if (item_ != POGOProtos.Inventory.Item.ItemId.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, item_);
    }
    if (itemCount_ != 0) {
      output.writeInt32(2, itemCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != POGOProtos.Inventory.Item.ItemId.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, item_);
    }
    if (itemCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, itemCount_);
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
    if (!(obj instanceof POGOProtos.Data.Redeem.RedeemedItem)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Redeem.RedeemedItem other = (POGOProtos.Data.Redeem.RedeemedItem) obj;

    if (item_ != other.item_) return false;
    if (getItemCount()
        != other.getItemCount()) return false;
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
    hash = (37 * hash) + ITEM_FIELD_NUMBER;
    hash = (53 * hash) + item_;
    hash = (37 * hash) + ITEM_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getItemCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Redeem.RedeemedItem parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Redeem.RedeemedItem prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Redeem.RedeemedItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Redeem.RedeemedItem)
      POGOProtos.Data.Redeem.RedeemedItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Redeem.RedeemedItemOuterClass.internal_static_POGOProtos_Data_Redeem_RedeemedItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Redeem.RedeemedItemOuterClass.internal_static_POGOProtos_Data_Redeem_RedeemedItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Redeem.RedeemedItem.class, POGOProtos.Data.Redeem.RedeemedItem.Builder.class);
    }

    // Construct using POGOProtos.Data.Redeem.RedeemedItem.newBuilder()
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
      item_ = 0;

      itemCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Redeem.RedeemedItemOuterClass.internal_static_POGOProtos_Data_Redeem_RedeemedItem_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Redeem.RedeemedItem getDefaultInstanceForType() {
      return POGOProtos.Data.Redeem.RedeemedItem.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Redeem.RedeemedItem build() {
      POGOProtos.Data.Redeem.RedeemedItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Redeem.RedeemedItem buildPartial() {
      POGOProtos.Data.Redeem.RedeemedItem result = new POGOProtos.Data.Redeem.RedeemedItem(this);
      result.item_ = item_;
      result.itemCount_ = itemCount_;
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
      if (other instanceof POGOProtos.Data.Redeem.RedeemedItem) {
        return mergeFrom((POGOProtos.Data.Redeem.RedeemedItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Redeem.RedeemedItem other) {
      if (other == POGOProtos.Data.Redeem.RedeemedItem.getDefaultInstance()) return this;
      if (other.item_ != 0) {
        setItemValue(other.getItemValue());
      }
      if (other.getItemCount() != 0) {
        setItemCount(other.getItemCount());
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
      POGOProtos.Data.Redeem.RedeemedItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Redeem.RedeemedItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int item_ = 0;
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item = 1;</code>
     * @return The enum numeric value on the wire for item.
     */
    public int getItemValue() {
      return item_;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item = 1;</code>
     * @param value The enum numeric value on the wire for item to set.
     * @return This builder for chaining.
     */
    public Builder setItemValue(int value) {
      item_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item = 1;</code>
     * @return The item.
     */
    public POGOProtos.Inventory.Item.ItemId getItem() {
      @SuppressWarnings("deprecation")
      POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(item_);
      return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item = 1;</code>
     * @param value The item to set.
     * @return This builder for chaining.
     */
    public Builder setItem(POGOProtos.Inventory.Item.ItemId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      item_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItem() {
      
      item_ = 0;
      onChanged();
      return this;
    }

    private int itemCount_ ;
    /**
     * <code>int32 item_count = 2;</code>
     * @return The itemCount.
     */
    public int getItemCount() {
      return itemCount_;
    }
    /**
     * <code>int32 item_count = 2;</code>
     * @param value The itemCount to set.
     * @return This builder for chaining.
     */
    public Builder setItemCount(int value) {
      
      itemCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 item_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemCount() {
      
      itemCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Redeem.RedeemedItem)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Redeem.RedeemedItem)
  private static final POGOProtos.Data.Redeem.RedeemedItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Redeem.RedeemedItem();
  }

  public static POGOProtos.Data.Redeem.RedeemedItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RedeemedItem>
      PARSER = new com.google.protobuf.AbstractParser<RedeemedItem>() {
    @java.lang.Override
    public RedeemedItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RedeemedItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RedeemedItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RedeemedItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Redeem.RedeemedItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

