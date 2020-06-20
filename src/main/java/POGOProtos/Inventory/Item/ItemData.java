// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/Item/ItemData.proto

package POGOProtos.Inventory.Item;

/**
 * Protobuf type {@code POGOProtos.Inventory.Item.ItemData}
 */
public  final class ItemData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Inventory.Item.ItemData)
    ItemDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ItemData.newBuilder() to construct.
  private ItemData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ItemData() {
    itemId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ItemData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ItemData(
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

            count_ = input.readInt32();
            break;
          }
          case 24: {

            unseen_ = input.readBool();
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
    return POGOProtos.Inventory.Item.ItemDataOuterClass.internal_static_POGOProtos_Inventory_Item_ItemData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Inventory.Item.ItemDataOuterClass.internal_static_POGOProtos_Inventory_Item_ItemData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Inventory.Item.ItemData.class, POGOProtos.Inventory.Item.ItemData.Builder.class);
  }

  public static final int ITEM_ID_FIELD_NUMBER = 1;
  private int itemId_;
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
   * @return The enum numeric value on the wire for itemId.
   */
  public int getItemIdValue() {
    return itemId_;
  }
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
   * @return The itemId.
   */
  public POGOProtos.Inventory.Item.ItemId getItemId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(itemId_);
    return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  public int getCount() {
    return count_;
  }

  public static final int UNSEEN_FIELD_NUMBER = 3;
  private boolean unseen_;
  /**
   * <code>bool unseen = 3;</code>
   * @return The unseen.
   */
  public boolean getUnseen() {
    return unseen_;
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
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    if (unseen_ != false) {
      output.writeBool(3, unseen_);
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
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    if (unseen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, unseen_);
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
    if (!(obj instanceof POGOProtos.Inventory.Item.ItemData)) {
      return super.equals(obj);
    }
    POGOProtos.Inventory.Item.ItemData other = (POGOProtos.Inventory.Item.ItemData) obj;

    if (itemId_ != other.itemId_) return false;
    if (getCount()
        != other.getCount()) return false;
    if (getUnseen()
        != other.getUnseen()) return false;
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
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + UNSEEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUnseen());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Inventory.Item.ItemData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.Item.ItemData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.Item.ItemData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.Item.ItemData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.Item.ItemData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.Item.ItemData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.Item.ItemData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.Item.ItemData parseFrom(
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
  public static Builder newBuilder(POGOProtos.Inventory.Item.ItemData prototype) {
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
   * Protobuf type {@code POGOProtos.Inventory.Item.ItemData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Inventory.Item.ItemData)
      POGOProtos.Inventory.Item.ItemDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Inventory.Item.ItemDataOuterClass.internal_static_POGOProtos_Inventory_Item_ItemData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Inventory.Item.ItemDataOuterClass.internal_static_POGOProtos_Inventory_Item_ItemData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Inventory.Item.ItemData.class, POGOProtos.Inventory.Item.ItemData.Builder.class);
    }

    // Construct using POGOProtos.Inventory.Item.ItemData.newBuilder()
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

      count_ = 0;

      unseen_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Inventory.Item.ItemDataOuterClass.internal_static_POGOProtos_Inventory_Item_ItemData_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Inventory.Item.ItemData getDefaultInstanceForType() {
      return POGOProtos.Inventory.Item.ItemData.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Inventory.Item.ItemData build() {
      POGOProtos.Inventory.Item.ItemData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Inventory.Item.ItemData buildPartial() {
      POGOProtos.Inventory.Item.ItemData result = new POGOProtos.Inventory.Item.ItemData(this);
      result.itemId_ = itemId_;
      result.count_ = count_;
      result.unseen_ = unseen_;
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
      if (other instanceof POGOProtos.Inventory.Item.ItemData) {
        return mergeFrom((POGOProtos.Inventory.Item.ItemData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Inventory.Item.ItemData other) {
      if (other == POGOProtos.Inventory.Item.ItemData.getDefaultInstance()) return this;
      if (other.itemId_ != 0) {
        setItemIdValue(other.getItemIdValue());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.getUnseen() != false) {
        setUnseen(other.getUnseen());
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
      POGOProtos.Inventory.Item.ItemData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Inventory.Item.ItemData) e.getUnfinishedMessage();
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
    public int getItemIdValue() {
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

    private int count_ ;
    /**
     * <code>int32 count = 2;</code>
     * @return The count.
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private boolean unseen_ ;
    /**
     * <code>bool unseen = 3;</code>
     * @return The unseen.
     */
    public boolean getUnseen() {
      return unseen_;
    }
    /**
     * <code>bool unseen = 3;</code>
     * @param value The unseen to set.
     * @return This builder for chaining.
     */
    public Builder setUnseen(boolean value) {
      
      unseen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool unseen = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnseen() {
      
      unseen_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Inventory.Item.ItemData)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Inventory.Item.ItemData)
  private static final POGOProtos.Inventory.Item.ItemData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Inventory.Item.ItemData();
  }

  public static POGOProtos.Inventory.Item.ItemData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ItemData>
      PARSER = new com.google.protobuf.AbstractParser<ItemData>() {
    @java.lang.Override
    public ItemData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ItemData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ItemData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ItemData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Inventory.Item.ItemData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

