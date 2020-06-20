// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BuddyInteractionSettings.proto

package POGOProtos.Settings.Master;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.BuddyInteractionSettings}
 */
public  final class BuddyInteractionSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.BuddyInteractionSettings)
    BuddyInteractionSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuddyInteractionSettings.newBuilder() to construct.
  private BuddyInteractionSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuddyInteractionSettings() {
    feedItemWhitelist_ = java.util.Collections.emptyList();
    careItemWhitelist_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuddyInteractionSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuddyInteractionSettings(
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
          case 8: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              feedItemWhitelist_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            feedItemWhitelist_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                feedItemWhitelist_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              feedItemWhitelist_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              careItemWhitelist_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            careItemWhitelist_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                careItemWhitelist_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              careItemWhitelist_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        feedItemWhitelist_ = java.util.Collections.unmodifiableList(feedItemWhitelist_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        careItemWhitelist_ = java.util.Collections.unmodifiableList(careItemWhitelist_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Settings.Master.BuddyInteractionSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.BuddyInteractionSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.BuddyInteractionSettings.class, POGOProtos.Settings.Master.BuddyInteractionSettings.Builder.class);
  }

  public static final int FEED_ITEM_WHITELIST_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> feedItemWhitelist_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Inventory.Item.ItemId> feedItemWhitelist_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Inventory.Item.ItemId>() {
            public POGOProtos.Inventory.Item.ItemId convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(from);
              return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
   * @return A list containing the feedItemWhitelist.
   */
  public java.util.List<POGOProtos.Inventory.Item.ItemId> getFeedItemWhitelistList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Inventory.Item.ItemId>(feedItemWhitelist_, feedItemWhitelist_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
   * @return The count of feedItemWhitelist.
   */
  public int getFeedItemWhitelistCount() {
    return feedItemWhitelist_.size();
  }
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
   * @param index The index of the element to return.
   * @return The feedItemWhitelist at the given index.
   */
  public POGOProtos.Inventory.Item.ItemId getFeedItemWhitelist(int index) {
    return feedItemWhitelist_converter_.convert(feedItemWhitelist_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
   * @return A list containing the enum numeric values on the wire for feedItemWhitelist.
   */
  public java.util.List<java.lang.Integer>
  getFeedItemWhitelistValueList() {
    return feedItemWhitelist_;
  }
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of feedItemWhitelist at the given index.
   */
  public int getFeedItemWhitelistValue(int index) {
    return feedItemWhitelist_.get(index);
  }
  private int feedItemWhitelistMemoizedSerializedSize;

  public static final int CARE_ITEM_WHITELIST_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> careItemWhitelist_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Inventory.Item.ItemId> careItemWhitelist_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Inventory.Item.ItemId>() {
            public POGOProtos.Inventory.Item.ItemId convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(from);
              return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
   * @return A list containing the careItemWhitelist.
   */
  public java.util.List<POGOProtos.Inventory.Item.ItemId> getCareItemWhitelistList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Inventory.Item.ItemId>(careItemWhitelist_, careItemWhitelist_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
   * @return The count of careItemWhitelist.
   */
  public int getCareItemWhitelistCount() {
    return careItemWhitelist_.size();
  }
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
   * @param index The index of the element to return.
   * @return The careItemWhitelist at the given index.
   */
  public POGOProtos.Inventory.Item.ItemId getCareItemWhitelist(int index) {
    return careItemWhitelist_converter_.convert(careItemWhitelist_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
   * @return A list containing the enum numeric values on the wire for careItemWhitelist.
   */
  public java.util.List<java.lang.Integer>
  getCareItemWhitelistValueList() {
    return careItemWhitelist_;
  }
  /**
   * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of careItemWhitelist at the given index.
   */
  public int getCareItemWhitelistValue(int index) {
    return careItemWhitelist_.get(index);
  }
  private int careItemWhitelistMemoizedSerializedSize;

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
    getSerializedSize();
    if (getFeedItemWhitelistList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(feedItemWhitelistMemoizedSerializedSize);
    }
    for (int i = 0; i < feedItemWhitelist_.size(); i++) {
      output.writeEnumNoTag(feedItemWhitelist_.get(i));
    }
    if (getCareItemWhitelistList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(careItemWhitelistMemoizedSerializedSize);
    }
    for (int i = 0; i < careItemWhitelist_.size(); i++) {
      output.writeEnumNoTag(careItemWhitelist_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < feedItemWhitelist_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(feedItemWhitelist_.get(i));
      }
      size += dataSize;
      if (!getFeedItemWhitelistList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }feedItemWhitelistMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < careItemWhitelist_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(careItemWhitelist_.get(i));
      }
      size += dataSize;
      if (!getCareItemWhitelistList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }careItemWhitelistMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Settings.Master.BuddyInteractionSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.BuddyInteractionSettings other = (POGOProtos.Settings.Master.BuddyInteractionSettings) obj;

    if (!feedItemWhitelist_.equals(other.feedItemWhitelist_)) return false;
    if (!careItemWhitelist_.equals(other.careItemWhitelist_)) return false;
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
    if (getFeedItemWhitelistCount() > 0) {
      hash = (37 * hash) + FEED_ITEM_WHITELIST_FIELD_NUMBER;
      hash = (53 * hash) + feedItemWhitelist_.hashCode();
    }
    if (getCareItemWhitelistCount() > 0) {
      hash = (37 * hash) + CARE_ITEM_WHITELIST_FIELD_NUMBER;
      hash = (53 * hash) + careItemWhitelist_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.BuddyInteractionSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.BuddyInteractionSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.BuddyInteractionSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.BuddyInteractionSettings)
      POGOProtos.Settings.Master.BuddyInteractionSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.BuddyInteractionSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.BuddyInteractionSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.BuddyInteractionSettings.class, POGOProtos.Settings.Master.BuddyInteractionSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.BuddyInteractionSettings.newBuilder()
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
      feedItemWhitelist_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      careItemWhitelist_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.BuddyInteractionSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyInteractionSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.BuddyInteractionSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.BuddyInteractionSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.BuddyInteractionSettings build() {
      POGOProtos.Settings.Master.BuddyInteractionSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.BuddyInteractionSettings buildPartial() {
      POGOProtos.Settings.Master.BuddyInteractionSettings result = new POGOProtos.Settings.Master.BuddyInteractionSettings(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        feedItemWhitelist_ = java.util.Collections.unmodifiableList(feedItemWhitelist_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.feedItemWhitelist_ = feedItemWhitelist_;
      if (((bitField0_ & 0x00000002) != 0)) {
        careItemWhitelist_ = java.util.Collections.unmodifiableList(careItemWhitelist_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.careItemWhitelist_ = careItemWhitelist_;
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
      if (other instanceof POGOProtos.Settings.Master.BuddyInteractionSettings) {
        return mergeFrom((POGOProtos.Settings.Master.BuddyInteractionSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.BuddyInteractionSettings other) {
      if (other == POGOProtos.Settings.Master.BuddyInteractionSettings.getDefaultInstance()) return this;
      if (!other.feedItemWhitelist_.isEmpty()) {
        if (feedItemWhitelist_.isEmpty()) {
          feedItemWhitelist_ = other.feedItemWhitelist_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFeedItemWhitelistIsMutable();
          feedItemWhitelist_.addAll(other.feedItemWhitelist_);
        }
        onChanged();
      }
      if (!other.careItemWhitelist_.isEmpty()) {
        if (careItemWhitelist_.isEmpty()) {
          careItemWhitelist_ = other.careItemWhitelist_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCareItemWhitelistIsMutable();
          careItemWhitelist_.addAll(other.careItemWhitelist_);
        }
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
      POGOProtos.Settings.Master.BuddyInteractionSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.BuddyInteractionSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> feedItemWhitelist_ =
      java.util.Collections.emptyList();
    private void ensureFeedItemWhitelistIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        feedItemWhitelist_ = new java.util.ArrayList<java.lang.Integer>(feedItemWhitelist_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @return A list containing the feedItemWhitelist.
     */
    public java.util.List<POGOProtos.Inventory.Item.ItemId> getFeedItemWhitelistList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Inventory.Item.ItemId>(feedItemWhitelist_, feedItemWhitelist_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @return The count of feedItemWhitelist.
     */
    public int getFeedItemWhitelistCount() {
      return feedItemWhitelist_.size();
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @param index The index of the element to return.
     * @return The feedItemWhitelist at the given index.
     */
    public POGOProtos.Inventory.Item.ItemId getFeedItemWhitelist(int index) {
      return feedItemWhitelist_converter_.convert(feedItemWhitelist_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @param index The index to set the value at.
     * @param value The feedItemWhitelist to set.
     * @return This builder for chaining.
     */
    public Builder setFeedItemWhitelist(
        int index, POGOProtos.Inventory.Item.ItemId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFeedItemWhitelistIsMutable();
      feedItemWhitelist_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @param value The feedItemWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addFeedItemWhitelist(POGOProtos.Inventory.Item.ItemId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFeedItemWhitelistIsMutable();
      feedItemWhitelist_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @param values The feedItemWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addAllFeedItemWhitelist(
        java.lang.Iterable<? extends POGOProtos.Inventory.Item.ItemId> values) {
      ensureFeedItemWhitelistIsMutable();
      for (POGOProtos.Inventory.Item.ItemId value : values) {
        feedItemWhitelist_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeedItemWhitelist() {
      feedItemWhitelist_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @return A list containing the enum numeric values on the wire for feedItemWhitelist.
     */
    public java.util.List<java.lang.Integer>
    getFeedItemWhitelistValueList() {
      return java.util.Collections.unmodifiableList(feedItemWhitelist_);
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of feedItemWhitelist at the given index.
     */
    public int getFeedItemWhitelistValue(int index) {
      return feedItemWhitelist_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of feedItemWhitelist at the given index.
     * @return This builder for chaining.
     */
    public Builder setFeedItemWhitelistValue(
        int index, int value) {
      ensureFeedItemWhitelistIsMutable();
      feedItemWhitelist_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @param value The enum numeric value on the wire for feedItemWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addFeedItemWhitelistValue(int value) {
      ensureFeedItemWhitelistIsMutable();
      feedItemWhitelist_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId feed_item_whitelist = 1;</code>
     * @param values The enum numeric values on the wire for feedItemWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addAllFeedItemWhitelistValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureFeedItemWhitelistIsMutable();
      for (int value : values) {
        feedItemWhitelist_.add(value);
      }
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> careItemWhitelist_ =
      java.util.Collections.emptyList();
    private void ensureCareItemWhitelistIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        careItemWhitelist_ = new java.util.ArrayList<java.lang.Integer>(careItemWhitelist_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @return A list containing the careItemWhitelist.
     */
    public java.util.List<POGOProtos.Inventory.Item.ItemId> getCareItemWhitelistList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Inventory.Item.ItemId>(careItemWhitelist_, careItemWhitelist_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @return The count of careItemWhitelist.
     */
    public int getCareItemWhitelistCount() {
      return careItemWhitelist_.size();
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @param index The index of the element to return.
     * @return The careItemWhitelist at the given index.
     */
    public POGOProtos.Inventory.Item.ItemId getCareItemWhitelist(int index) {
      return careItemWhitelist_converter_.convert(careItemWhitelist_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @param index The index to set the value at.
     * @param value The careItemWhitelist to set.
     * @return This builder for chaining.
     */
    public Builder setCareItemWhitelist(
        int index, POGOProtos.Inventory.Item.ItemId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCareItemWhitelistIsMutable();
      careItemWhitelist_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @param value The careItemWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addCareItemWhitelist(POGOProtos.Inventory.Item.ItemId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCareItemWhitelistIsMutable();
      careItemWhitelist_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @param values The careItemWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addAllCareItemWhitelist(
        java.lang.Iterable<? extends POGOProtos.Inventory.Item.ItemId> values) {
      ensureCareItemWhitelistIsMutable();
      for (POGOProtos.Inventory.Item.ItemId value : values) {
        careItemWhitelist_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCareItemWhitelist() {
      careItemWhitelist_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @return A list containing the enum numeric values on the wire for careItemWhitelist.
     */
    public java.util.List<java.lang.Integer>
    getCareItemWhitelistValueList() {
      return java.util.Collections.unmodifiableList(careItemWhitelist_);
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of careItemWhitelist at the given index.
     */
    public int getCareItemWhitelistValue(int index) {
      return careItemWhitelist_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of careItemWhitelist at the given index.
     * @return This builder for chaining.
     */
    public Builder setCareItemWhitelistValue(
        int index, int value) {
      ensureCareItemWhitelistIsMutable();
      careItemWhitelist_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @param value The enum numeric value on the wire for careItemWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addCareItemWhitelistValue(int value) {
      ensureCareItemWhitelistIsMutable();
      careItemWhitelist_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Inventory.Item.ItemId care_item_whitelist = 2;</code>
     * @param values The enum numeric values on the wire for careItemWhitelist to add.
     * @return This builder for chaining.
     */
    public Builder addAllCareItemWhitelistValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureCareItemWhitelistIsMutable();
      for (int value : values) {
        careItemWhitelist_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.BuddyInteractionSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.BuddyInteractionSettings)
  private static final POGOProtos.Settings.Master.BuddyInteractionSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.BuddyInteractionSettings();
  }

  public static POGOProtos.Settings.Master.BuddyInteractionSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuddyInteractionSettings>
      PARSER = new com.google.protobuf.AbstractParser<BuddyInteractionSettings>() {
    @java.lang.Override
    public BuddyInteractionSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuddyInteractionSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuddyInteractionSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuddyInteractionSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.BuddyInteractionSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

