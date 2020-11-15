// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/Item/ItemAward.proto

package POGOProtos.Inventory.Item;

/**
 * Protobuf type {@code POGOProtos.Inventory.Item.ItemAward}
 */
public final class ItemAward extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Inventory.Item.ItemAward)
    ItemAwardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ItemAward.newBuilder() to construct.
  private ItemAward(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ItemAward() {
    itemId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ItemAward();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ItemAward(
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

            itemId_ = rawValue;
            break;
          }
          case 16: {

            itemCount_ = input.readInt32();
            break;
          }
          case 24: {

            bonusCount_ = input.readInt32();
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
    return POGOProtos.Inventory.Item.ItemAwardOuterClass.internal_static_POGOProtos_Inventory_Item_ItemAward_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Inventory.Item.ItemAwardOuterClass.internal_static_POGOProtos_Inventory_Item_ItemAward_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Inventory.Item.ItemAward.class, POGOProtos.Inventory.Item.ItemAward.Builder.class);
  }

  public static final int ITEM_ID_FIELD_NUMBER = 1;
  private int itemId_;
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
   * @return The enum numeric value on the wire for itemId.
   */
  @java.lang.Override public int getItemIdValue() {
    return itemId_;
  }
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
   * @return The itemId.
   */
  @java.lang.Override public POGOProtos.Inventory.Item.ItemId getItemId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(itemId_);
    return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
  }

  public static final int ITEM_COUNT_FIELD_NUMBER = 2;
  private int itemCount_;
  /**
   * <code>int32 item_count = 2;</code>
   * @return The itemCount.
   */
  @java.lang.Override
  public int getItemCount() {
    return itemCount_;
  }

  public static final int BONUS_COUNT_FIELD_NUMBER = 3;
  private int bonusCount_;
  /**
   * <code>int32 bonus_count = 3;</code>
   * @return The bonusCount.
   */
  @java.lang.Override
  public int getBonusCount() {
    return bonusCount_;
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
    if (itemId_ != POGOProtos.Inventory.Item.ItemId.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, itemId_);
    }
    if (itemCount_ != 0) {
      output.writeInt32(2, itemCount_);
    }
    if (bonusCount_ != 0) {
      output.writeInt32(3, bonusCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (itemId_ != POGOProtos.Inventory.Item.ItemId.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, itemId_);
    }
    if (itemCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, itemCount_);
    }
    if (bonusCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, bonusCount_);
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
    if (!(obj instanceof POGOProtos.Inventory.Item.ItemAward)) {
      return super.equals(obj);
    }
    POGOProtos.Inventory.Item.ItemAward other = (POGOProtos.Inventory.Item.ItemAward) obj;

    if (itemId_ != other.itemId_) return false;
    if (getItemCount()
        != other.getItemCount()) return false;
    if (getBonusCount()
        != other.getBonusCount()) return false;
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
    hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
    hash = (53 * hash) + itemId_;
    hash = (37 * hash) + ITEM_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getItemCount();
    hash = (37 * hash) + BONUS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getBonusCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Inventory.Item.ItemAward parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.Item.ItemAward parseFrom(
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
  public static Builder newBuilder(POGOProtos.Inventory.Item.ItemAward prototype) {
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
   * Protobuf type {@code POGOProtos.Inventory.Item.ItemAward}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Inventory.Item.ItemAward)
      POGOProtos.Inventory.Item.ItemAwardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Inventory.Item.ItemAwardOuterClass.internal_static_POGOProtos_Inventory_Item_ItemAward_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Inventory.Item.ItemAwardOuterClass.internal_static_POGOProtos_Inventory_Item_ItemAward_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Inventory.Item.ItemAward.class, POGOProtos.Inventory.Item.ItemAward.Builder.class);
    }

    // Construct using POGOProtos.Inventory.Item.ItemAward.newBuilder()
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
      itemId_ = 0;

      itemCount_ = 0;

      bonusCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Inventory.Item.ItemAwardOuterClass.internal_static_POGOProtos_Inventory_Item_ItemAward_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Inventory.Item.ItemAward getDefaultInstanceForType() {
      return POGOProtos.Inventory.Item.ItemAward.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Inventory.Item.ItemAward build() {
      POGOProtos.Inventory.Item.ItemAward result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Inventory.Item.ItemAward buildPartial() {
      POGOProtos.Inventory.Item.ItemAward result = new POGOProtos.Inventory.Item.ItemAward(this);
      result.itemId_ = itemId_;
      result.itemCount_ = itemCount_;
      result.bonusCount_ = bonusCount_;
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
      if (other instanceof POGOProtos.Inventory.Item.ItemAward) {
        return mergeFrom((POGOProtos.Inventory.Item.ItemAward)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Inventory.Item.ItemAward other) {
      if (other == POGOProtos.Inventory.Item.ItemAward.getDefaultInstance()) return this;
      if (other.itemId_ != 0) {
        setItemIdValue(other.getItemIdValue());
      }
      if (other.getItemCount() != 0) {
        setItemCount(other.getItemCount());
      }
      if (other.getBonusCount() != 0) {
        setBonusCount(other.getBonusCount());
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
      POGOProtos.Inventory.Item.ItemAward parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Inventory.Item.ItemAward) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int itemId_ = 0;
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
     * @return The enum numeric value on the wire for itemId.
     */
    @java.lang.Override public int getItemIdValue() {
      return itemId_;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
     * @param value The enum numeric value on the wire for itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdValue(int value) {
      
      itemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public POGOProtos.Inventory.Item.ItemId getItemId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(itemId_);
      return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(POGOProtos.Inventory.Item.ItemId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      itemId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      
      itemId_ = 0;
      onChanged();
      return this;
    }

    private int itemCount_ ;
    /**
     * <code>int32 item_count = 2;</code>
     * @return The itemCount.
     */
    @java.lang.Override
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

    private int bonusCount_ ;
    /**
     * <code>int32 bonus_count = 3;</code>
     * @return The bonusCount.
     */
    @java.lang.Override
    public int getBonusCount() {
      return bonusCount_;
    }
    /**
     * <code>int32 bonus_count = 3;</code>
     * @param value The bonusCount to set.
     * @return This builder for chaining.
     */
    public Builder setBonusCount(int value) {
      
      bonusCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bonus_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBonusCount() {
      
      bonusCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Inventory.Item.ItemAward)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Inventory.Item.ItemAward)
  private static final POGOProtos.Inventory.Item.ItemAward DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Inventory.Item.ItemAward();
  }

  public static POGOProtos.Inventory.Item.ItemAward getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ItemAward>
      PARSER = new com.google.protobuf.AbstractParser<ItemAward>() {
    @java.lang.Override
    public ItemAward parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ItemAward(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ItemAward> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ItemAward> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Inventory.Item.ItemAward getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

