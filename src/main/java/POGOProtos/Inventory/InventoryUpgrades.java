// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/InventoryUpgrades.proto

package POGOProtos.Inventory;

/**
 * Protobuf type {@code POGOProtos.Inventory.InventoryUpgrades}
 */
public  final class InventoryUpgrades extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Inventory.InventoryUpgrades)
    InventoryUpgradesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryUpgrades.newBuilder() to construct.
  private InventoryUpgrades(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryUpgrades() {
    inventoryUpgrades_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InventoryUpgrades();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryUpgrades(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              inventoryUpgrades_ = new java.util.ArrayList<POGOProtos.Inventory.InventoryUpgrade>();
              mutable_bitField0_ |= 0x00000001;
            }
            inventoryUpgrades_.add(
                input.readMessage(POGOProtos.Inventory.InventoryUpgrade.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        inventoryUpgrades_ = java.util.Collections.unmodifiableList(inventoryUpgrades_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Inventory.InventoryUpgradesOuterClass.internal_static_POGOProtos_Inventory_InventoryUpgrades_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Inventory.InventoryUpgradesOuterClass.internal_static_POGOProtos_Inventory_InventoryUpgrades_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Inventory.InventoryUpgrades.class, POGOProtos.Inventory.InventoryUpgrades.Builder.class);
  }

  public static final int INVENTORY_UPGRADES_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Inventory.InventoryUpgrade> inventoryUpgrades_;
  /**
   * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
   */
  public java.util.List<POGOProtos.Inventory.InventoryUpgrade> getInventoryUpgradesList() {
    return inventoryUpgrades_;
  }
  /**
   * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Inventory.InventoryUpgradeOrBuilder> 
      getInventoryUpgradesOrBuilderList() {
    return inventoryUpgrades_;
  }
  /**
   * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
   */
  public int getInventoryUpgradesCount() {
    return inventoryUpgrades_.size();
  }
  /**
   * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
   */
  public POGOProtos.Inventory.InventoryUpgrade getInventoryUpgrades(int index) {
    return inventoryUpgrades_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
   */
  public POGOProtos.Inventory.InventoryUpgradeOrBuilder getInventoryUpgradesOrBuilder(
      int index) {
    return inventoryUpgrades_.get(index);
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
    for (int i = 0; i < inventoryUpgrades_.size(); i++) {
      output.writeMessage(1, inventoryUpgrades_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < inventoryUpgrades_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, inventoryUpgrades_.get(i));
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
    if (!(obj instanceof POGOProtos.Inventory.InventoryUpgrades)) {
      return super.equals(obj);
    }
    POGOProtos.Inventory.InventoryUpgrades other = (POGOProtos.Inventory.InventoryUpgrades) obj;

    if (!getInventoryUpgradesList()
        .equals(other.getInventoryUpgradesList())) return false;
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
    if (getInventoryUpgradesCount() > 0) {
      hash = (37 * hash) + INVENTORY_UPGRADES_FIELD_NUMBER;
      hash = (53 * hash) + getInventoryUpgradesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.InventoryUpgrades parseFrom(
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
  public static Builder newBuilder(POGOProtos.Inventory.InventoryUpgrades prototype) {
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
   * Protobuf type {@code POGOProtos.Inventory.InventoryUpgrades}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Inventory.InventoryUpgrades)
      POGOProtos.Inventory.InventoryUpgradesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Inventory.InventoryUpgradesOuterClass.internal_static_POGOProtos_Inventory_InventoryUpgrades_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Inventory.InventoryUpgradesOuterClass.internal_static_POGOProtos_Inventory_InventoryUpgrades_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Inventory.InventoryUpgrades.class, POGOProtos.Inventory.InventoryUpgrades.Builder.class);
    }

    // Construct using POGOProtos.Inventory.InventoryUpgrades.newBuilder()
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
        getInventoryUpgradesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (inventoryUpgradesBuilder_ == null) {
        inventoryUpgrades_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inventoryUpgradesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Inventory.InventoryUpgradesOuterClass.internal_static_POGOProtos_Inventory_InventoryUpgrades_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Inventory.InventoryUpgrades getDefaultInstanceForType() {
      return POGOProtos.Inventory.InventoryUpgrades.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Inventory.InventoryUpgrades build() {
      POGOProtos.Inventory.InventoryUpgrades result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Inventory.InventoryUpgrades buildPartial() {
      POGOProtos.Inventory.InventoryUpgrades result = new POGOProtos.Inventory.InventoryUpgrades(this);
      int from_bitField0_ = bitField0_;
      if (inventoryUpgradesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inventoryUpgrades_ = java.util.Collections.unmodifiableList(inventoryUpgrades_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inventoryUpgrades_ = inventoryUpgrades_;
      } else {
        result.inventoryUpgrades_ = inventoryUpgradesBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Inventory.InventoryUpgrades) {
        return mergeFrom((POGOProtos.Inventory.InventoryUpgrades)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Inventory.InventoryUpgrades other) {
      if (other == POGOProtos.Inventory.InventoryUpgrades.getDefaultInstance()) return this;
      if (inventoryUpgradesBuilder_ == null) {
        if (!other.inventoryUpgrades_.isEmpty()) {
          if (inventoryUpgrades_.isEmpty()) {
            inventoryUpgrades_ = other.inventoryUpgrades_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInventoryUpgradesIsMutable();
            inventoryUpgrades_.addAll(other.inventoryUpgrades_);
          }
          onChanged();
        }
      } else {
        if (!other.inventoryUpgrades_.isEmpty()) {
          if (inventoryUpgradesBuilder_.isEmpty()) {
            inventoryUpgradesBuilder_.dispose();
            inventoryUpgradesBuilder_ = null;
            inventoryUpgrades_ = other.inventoryUpgrades_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inventoryUpgradesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInventoryUpgradesFieldBuilder() : null;
          } else {
            inventoryUpgradesBuilder_.addAllMessages(other.inventoryUpgrades_);
          }
        }
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
      POGOProtos.Inventory.InventoryUpgrades parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Inventory.InventoryUpgrades) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Inventory.InventoryUpgrade> inventoryUpgrades_ =
      java.util.Collections.emptyList();
    private void ensureInventoryUpgradesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inventoryUpgrades_ = new java.util.ArrayList<POGOProtos.Inventory.InventoryUpgrade>(inventoryUpgrades_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Inventory.InventoryUpgrade, POGOProtos.Inventory.InventoryUpgrade.Builder, POGOProtos.Inventory.InventoryUpgradeOrBuilder> inventoryUpgradesBuilder_;

    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public java.util.List<POGOProtos.Inventory.InventoryUpgrade> getInventoryUpgradesList() {
      if (inventoryUpgradesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inventoryUpgrades_);
      } else {
        return inventoryUpgradesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public int getInventoryUpgradesCount() {
      if (inventoryUpgradesBuilder_ == null) {
        return inventoryUpgrades_.size();
      } else {
        return inventoryUpgradesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public POGOProtos.Inventory.InventoryUpgrade getInventoryUpgrades(int index) {
      if (inventoryUpgradesBuilder_ == null) {
        return inventoryUpgrades_.get(index);
      } else {
        return inventoryUpgradesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public Builder setInventoryUpgrades(
        int index, POGOProtos.Inventory.InventoryUpgrade value) {
      if (inventoryUpgradesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoryUpgradesIsMutable();
        inventoryUpgrades_.set(index, value);
        onChanged();
      } else {
        inventoryUpgradesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public Builder setInventoryUpgrades(
        int index, POGOProtos.Inventory.InventoryUpgrade.Builder builderForValue) {
      if (inventoryUpgradesBuilder_ == null) {
        ensureInventoryUpgradesIsMutable();
        inventoryUpgrades_.set(index, builderForValue.build());
        onChanged();
      } else {
        inventoryUpgradesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public Builder addInventoryUpgrades(POGOProtos.Inventory.InventoryUpgrade value) {
      if (inventoryUpgradesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoryUpgradesIsMutable();
        inventoryUpgrades_.add(value);
        onChanged();
      } else {
        inventoryUpgradesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public Builder addInventoryUpgrades(
        int index, POGOProtos.Inventory.InventoryUpgrade value) {
      if (inventoryUpgradesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInventoryUpgradesIsMutable();
        inventoryUpgrades_.add(index, value);
        onChanged();
      } else {
        inventoryUpgradesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public Builder addInventoryUpgrades(
        POGOProtos.Inventory.InventoryUpgrade.Builder builderForValue) {
      if (inventoryUpgradesBuilder_ == null) {
        ensureInventoryUpgradesIsMutable();
        inventoryUpgrades_.add(builderForValue.build());
        onChanged();
      } else {
        inventoryUpgradesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public Builder addInventoryUpgrades(
        int index, POGOProtos.Inventory.InventoryUpgrade.Builder builderForValue) {
      if (inventoryUpgradesBuilder_ == null) {
        ensureInventoryUpgradesIsMutable();
        inventoryUpgrades_.add(index, builderForValue.build());
        onChanged();
      } else {
        inventoryUpgradesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public Builder addAllInventoryUpgrades(
        java.lang.Iterable<? extends POGOProtos.Inventory.InventoryUpgrade> values) {
      if (inventoryUpgradesBuilder_ == null) {
        ensureInventoryUpgradesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inventoryUpgrades_);
        onChanged();
      } else {
        inventoryUpgradesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public Builder clearInventoryUpgrades() {
      if (inventoryUpgradesBuilder_ == null) {
        inventoryUpgrades_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inventoryUpgradesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public Builder removeInventoryUpgrades(int index) {
      if (inventoryUpgradesBuilder_ == null) {
        ensureInventoryUpgradesIsMutable();
        inventoryUpgrades_.remove(index);
        onChanged();
      } else {
        inventoryUpgradesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public POGOProtos.Inventory.InventoryUpgrade.Builder getInventoryUpgradesBuilder(
        int index) {
      return getInventoryUpgradesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public POGOProtos.Inventory.InventoryUpgradeOrBuilder getInventoryUpgradesOrBuilder(
        int index) {
      if (inventoryUpgradesBuilder_ == null) {
        return inventoryUpgrades_.get(index);  } else {
        return inventoryUpgradesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Inventory.InventoryUpgradeOrBuilder> 
         getInventoryUpgradesOrBuilderList() {
      if (inventoryUpgradesBuilder_ != null) {
        return inventoryUpgradesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inventoryUpgrades_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public POGOProtos.Inventory.InventoryUpgrade.Builder addInventoryUpgradesBuilder() {
      return getInventoryUpgradesFieldBuilder().addBuilder(
          POGOProtos.Inventory.InventoryUpgrade.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public POGOProtos.Inventory.InventoryUpgrade.Builder addInventoryUpgradesBuilder(
        int index) {
      return getInventoryUpgradesFieldBuilder().addBuilder(
          index, POGOProtos.Inventory.InventoryUpgrade.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Inventory.InventoryUpgrade inventory_upgrades = 1;</code>
     */
    public java.util.List<POGOProtos.Inventory.InventoryUpgrade.Builder> 
         getInventoryUpgradesBuilderList() {
      return getInventoryUpgradesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Inventory.InventoryUpgrade, POGOProtos.Inventory.InventoryUpgrade.Builder, POGOProtos.Inventory.InventoryUpgradeOrBuilder> 
        getInventoryUpgradesFieldBuilder() {
      if (inventoryUpgradesBuilder_ == null) {
        inventoryUpgradesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Inventory.InventoryUpgrade, POGOProtos.Inventory.InventoryUpgrade.Builder, POGOProtos.Inventory.InventoryUpgradeOrBuilder>(
                inventoryUpgrades_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inventoryUpgrades_ = null;
      }
      return inventoryUpgradesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Inventory.InventoryUpgrades)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Inventory.InventoryUpgrades)
  private static final POGOProtos.Inventory.InventoryUpgrades DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Inventory.InventoryUpgrades();
  }

  public static POGOProtos.Inventory.InventoryUpgrades getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryUpgrades>
      PARSER = new com.google.protobuf.AbstractParser<InventoryUpgrades>() {
    @java.lang.Override
    public InventoryUpgrades parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryUpgrades(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryUpgrades> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryUpgrades> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Inventory.InventoryUpgrades getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

