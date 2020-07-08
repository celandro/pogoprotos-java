// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Item/IncidentTicketAttributes.proto

package POGOProtos.Settings.Master.Item;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.Item.IncidentTicketAttributes}
 */
public  final class IncidentTicketAttributes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.Item.IncidentTicketAttributes)
    IncidentTicketAttributesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IncidentTicketAttributes.newBuilder() to construct.
  private IncidentTicketAttributes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IncidentTicketAttributes() {
    upgradedItem_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IncidentTicketAttributes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IncidentTicketAttributes(
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

            ignoreFullInventory_ = input.readBool();
            break;
          }
          case 16: {

            upgradeRequirementCount_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            upgradedItem_ = rawValue;
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
    return POGOProtos.Settings.Master.Item.IncidentTicketAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_IncidentTicketAttributes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.Item.IncidentTicketAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_IncidentTicketAttributes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.Item.IncidentTicketAttributes.class, POGOProtos.Settings.Master.Item.IncidentTicketAttributes.Builder.class);
  }

  public static final int IGNORE_FULL_INVENTORY_FIELD_NUMBER = 1;
  private boolean ignoreFullInventory_;
  /**
   * <code>bool ignore_full_inventory = 1;</code>
   * @return The ignoreFullInventory.
   */
  public boolean getIgnoreFullInventory() {
    return ignoreFullInventory_;
  }

  public static final int UPGRADE_REQUIREMENT_COUNT_FIELD_NUMBER = 2;
  private int upgradeRequirementCount_;
  /**
   * <code>int32 upgrade_requirement_count = 2;</code>
   * @return The upgradeRequirementCount.
   */
  public int getUpgradeRequirementCount() {
    return upgradeRequirementCount_;
  }

  public static final int UPGRADED_ITEM_FIELD_NUMBER = 3;
  private int upgradedItem_;
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId upgraded_item = 3;</code>
   * @return The enum numeric value on the wire for upgradedItem.
   */
  public int getUpgradedItemValue() {
    return upgradedItem_;
  }
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId upgraded_item = 3;</code>
   * @return The upgradedItem.
   */
  public POGOProtos.Inventory.Item.ItemId getUpgradedItem() {
    @SuppressWarnings("deprecation")
    POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(upgradedItem_);
    return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
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
    if (ignoreFullInventory_ != false) {
      output.writeBool(1, ignoreFullInventory_);
    }
    if (upgradeRequirementCount_ != 0) {
      output.writeInt32(2, upgradeRequirementCount_);
    }
    if (upgradedItem_ != POGOProtos.Inventory.Item.ItemId.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(3, upgradedItem_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ignoreFullInventory_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, ignoreFullInventory_);
    }
    if (upgradeRequirementCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, upgradeRequirementCount_);
    }
    if (upgradedItem_ != POGOProtos.Inventory.Item.ItemId.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, upgradedItem_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.Item.IncidentTicketAttributes)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.Item.IncidentTicketAttributes other = (POGOProtos.Settings.Master.Item.IncidentTicketAttributes) obj;

    if (getIgnoreFullInventory()
        != other.getIgnoreFullInventory()) return false;
    if (getUpgradeRequirementCount()
        != other.getUpgradeRequirementCount()) return false;
    if (upgradedItem_ != other.upgradedItem_) return false;
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
    hash = (37 * hash) + IGNORE_FULL_INVENTORY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnoreFullInventory());
    hash = (37 * hash) + UPGRADE_REQUIREMENT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getUpgradeRequirementCount();
    hash = (37 * hash) + UPGRADED_ITEM_FIELD_NUMBER;
    hash = (53 * hash) + upgradedItem_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.Item.IncidentTicketAttributes prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.Item.IncidentTicketAttributes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.Item.IncidentTicketAttributes)
      POGOProtos.Settings.Master.Item.IncidentTicketAttributesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.Item.IncidentTicketAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_IncidentTicketAttributes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.Item.IncidentTicketAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_IncidentTicketAttributes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.Item.IncidentTicketAttributes.class, POGOProtos.Settings.Master.Item.IncidentTicketAttributes.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.Item.IncidentTicketAttributes.newBuilder()
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
      ignoreFullInventory_ = false;

      upgradeRequirementCount_ = 0;

      upgradedItem_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.Item.IncidentTicketAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_IncidentTicketAttributes_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.IncidentTicketAttributes getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.Item.IncidentTicketAttributes.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.IncidentTicketAttributes build() {
      POGOProtos.Settings.Master.Item.IncidentTicketAttributes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.IncidentTicketAttributes buildPartial() {
      POGOProtos.Settings.Master.Item.IncidentTicketAttributes result = new POGOProtos.Settings.Master.Item.IncidentTicketAttributes(this);
      result.ignoreFullInventory_ = ignoreFullInventory_;
      result.upgradeRequirementCount_ = upgradeRequirementCount_;
      result.upgradedItem_ = upgradedItem_;
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
      if (other instanceof POGOProtos.Settings.Master.Item.IncidentTicketAttributes) {
        return mergeFrom((POGOProtos.Settings.Master.Item.IncidentTicketAttributes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.Item.IncidentTicketAttributes other) {
      if (other == POGOProtos.Settings.Master.Item.IncidentTicketAttributes.getDefaultInstance()) return this;
      if (other.getIgnoreFullInventory() != false) {
        setIgnoreFullInventory(other.getIgnoreFullInventory());
      }
      if (other.getUpgradeRequirementCount() != 0) {
        setUpgradeRequirementCount(other.getUpgradeRequirementCount());
      }
      if (other.upgradedItem_ != 0) {
        setUpgradedItemValue(other.getUpgradedItemValue());
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
      POGOProtos.Settings.Master.Item.IncidentTicketAttributes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.Item.IncidentTicketAttributes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean ignoreFullInventory_ ;
    /**
     * <code>bool ignore_full_inventory = 1;</code>
     * @return The ignoreFullInventory.
     */
    public boolean getIgnoreFullInventory() {
      return ignoreFullInventory_;
    }
    /**
     * <code>bool ignore_full_inventory = 1;</code>
     * @param value The ignoreFullInventory to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreFullInventory(boolean value) {
      
      ignoreFullInventory_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ignore_full_inventory = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIgnoreFullInventory() {
      
      ignoreFullInventory_ = false;
      onChanged();
      return this;
    }

    private int upgradeRequirementCount_ ;
    /**
     * <code>int32 upgrade_requirement_count = 2;</code>
     * @return The upgradeRequirementCount.
     */
    public int getUpgradeRequirementCount() {
      return upgradeRequirementCount_;
    }
    /**
     * <code>int32 upgrade_requirement_count = 2;</code>
     * @param value The upgradeRequirementCount to set.
     * @return This builder for chaining.
     */
    public Builder setUpgradeRequirementCount(int value) {
      
      upgradeRequirementCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 upgrade_requirement_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpgradeRequirementCount() {
      
      upgradeRequirementCount_ = 0;
      onChanged();
      return this;
    }

    private int upgradedItem_ = 0;
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId upgraded_item = 3;</code>
     * @return The enum numeric value on the wire for upgradedItem.
     */
    public int getUpgradedItemValue() {
      return upgradedItem_;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId upgraded_item = 3;</code>
     * @param value The enum numeric value on the wire for upgradedItem to set.
     * @return This builder for chaining.
     */
    public Builder setUpgradedItemValue(int value) {
      upgradedItem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId upgraded_item = 3;</code>
     * @return The upgradedItem.
     */
    public POGOProtos.Inventory.Item.ItemId getUpgradedItem() {
      @SuppressWarnings("deprecation")
      POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(upgradedItem_);
      return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId upgraded_item = 3;</code>
     * @param value The upgradedItem to set.
     * @return This builder for chaining.
     */
    public Builder setUpgradedItem(POGOProtos.Inventory.Item.ItemId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      upgradedItem_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId upgraded_item = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpgradedItem() {
      
      upgradedItem_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.Item.IncidentTicketAttributes)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.Item.IncidentTicketAttributes)
  private static final POGOProtos.Settings.Master.Item.IncidentTicketAttributes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.Item.IncidentTicketAttributes();
  }

  public static POGOProtos.Settings.Master.Item.IncidentTicketAttributes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IncidentTicketAttributes>
      PARSER = new com.google.protobuf.AbstractParser<IncidentTicketAttributes>() {
    @java.lang.Override
    public IncidentTicketAttributes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IncidentTicketAttributes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IncidentTicketAttributes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IncidentTicketAttributes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.Item.IncidentTicketAttributes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
