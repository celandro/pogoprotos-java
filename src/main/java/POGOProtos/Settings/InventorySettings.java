// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/InventorySettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.InventorySettings}
 */
public  final class InventorySettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.InventorySettings)
    InventorySettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventorySettings.newBuilder() to construct.
  private InventorySettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventorySettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InventorySettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventorySettings(
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

            maxPokemon_ = input.readInt32();
            break;
          }
          case 16: {

            maxBagItems_ = input.readInt32();
            break;
          }
          case 24: {

            basePokemon_ = input.readInt32();
            break;
          }
          case 32: {

            baseBagItems_ = input.readInt32();
            break;
          }
          case 40: {

            baseEggs_ = input.readInt32();
            break;
          }
          case 48: {

            maxTeamChanges_ = input.readInt32();
            break;
          }
          case 56: {

            teamChangeItemResetPeriodInDays_ = input.readInt64();
            break;
          }
          case 64: {

            maxItemBoostDurationMs_ = input.readInt64();
            break;
          }
          case 72: {

            defaultStickerMaxCount_ = input.readInt32();
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
    return POGOProtos.Settings.InventorySettingsOuterClass.internal_static_POGOProtos_Settings_InventorySettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.InventorySettingsOuterClass.internal_static_POGOProtos_Settings_InventorySettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.InventorySettings.class, POGOProtos.Settings.InventorySettings.Builder.class);
  }

  public static final int MAX_POKEMON_FIELD_NUMBER = 1;
  private int maxPokemon_;
  /**
   * <code>int32 max_pokemon = 1;</code>
   * @return The maxPokemon.
   */
  public int getMaxPokemon() {
    return maxPokemon_;
  }

  public static final int MAX_BAG_ITEMS_FIELD_NUMBER = 2;
  private int maxBagItems_;
  /**
   * <code>int32 max_bag_items = 2;</code>
   * @return The maxBagItems.
   */
  public int getMaxBagItems() {
    return maxBagItems_;
  }

  public static final int BASE_POKEMON_FIELD_NUMBER = 3;
  private int basePokemon_;
  /**
   * <code>int32 base_pokemon = 3;</code>
   * @return The basePokemon.
   */
  public int getBasePokemon() {
    return basePokemon_;
  }

  public static final int BASE_BAG_ITEMS_FIELD_NUMBER = 4;
  private int baseBagItems_;
  /**
   * <code>int32 base_bag_items = 4;</code>
   * @return The baseBagItems.
   */
  public int getBaseBagItems() {
    return baseBagItems_;
  }

  public static final int BASE_EGGS_FIELD_NUMBER = 5;
  private int baseEggs_;
  /**
   * <code>int32 base_eggs = 5;</code>
   * @return The baseEggs.
   */
  public int getBaseEggs() {
    return baseEggs_;
  }

  public static final int MAX_TEAM_CHANGES_FIELD_NUMBER = 6;
  private int maxTeamChanges_;
  /**
   * <code>int32 max_team_changes = 6;</code>
   * @return The maxTeamChanges.
   */
  public int getMaxTeamChanges() {
    return maxTeamChanges_;
  }

  public static final int TEAM_CHANGE_ITEM_RESET_PERIOD_IN_DAYS_FIELD_NUMBER = 7;
  private long teamChangeItemResetPeriodInDays_;
  /**
   * <code>int64 team_change_item_reset_period_in_days = 7;</code>
   * @return The teamChangeItemResetPeriodInDays.
   */
  public long getTeamChangeItemResetPeriodInDays() {
    return teamChangeItemResetPeriodInDays_;
  }

  public static final int MAX_ITEM_BOOST_DURATION_MS_FIELD_NUMBER = 8;
  private long maxItemBoostDurationMs_;
  /**
   * <code>int64 max_item_boost_duration_ms = 8;</code>
   * @return The maxItemBoostDurationMs.
   */
  public long getMaxItemBoostDurationMs() {
    return maxItemBoostDurationMs_;
  }

  public static final int DEFAULT_STICKER_MAX_COUNT_FIELD_NUMBER = 9;
  private int defaultStickerMaxCount_;
  /**
   * <code>int32 default_sticker_max_count = 9;</code>
   * @return The defaultStickerMaxCount.
   */
  public int getDefaultStickerMaxCount() {
    return defaultStickerMaxCount_;
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
    if (maxPokemon_ != 0) {
      output.writeInt32(1, maxPokemon_);
    }
    if (maxBagItems_ != 0) {
      output.writeInt32(2, maxBagItems_);
    }
    if (basePokemon_ != 0) {
      output.writeInt32(3, basePokemon_);
    }
    if (baseBagItems_ != 0) {
      output.writeInt32(4, baseBagItems_);
    }
    if (baseEggs_ != 0) {
      output.writeInt32(5, baseEggs_);
    }
    if (maxTeamChanges_ != 0) {
      output.writeInt32(6, maxTeamChanges_);
    }
    if (teamChangeItemResetPeriodInDays_ != 0L) {
      output.writeInt64(7, teamChangeItemResetPeriodInDays_);
    }
    if (maxItemBoostDurationMs_ != 0L) {
      output.writeInt64(8, maxItemBoostDurationMs_);
    }
    if (defaultStickerMaxCount_ != 0) {
      output.writeInt32(9, defaultStickerMaxCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxPokemon_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, maxPokemon_);
    }
    if (maxBagItems_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxBagItems_);
    }
    if (basePokemon_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, basePokemon_);
    }
    if (baseBagItems_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, baseBagItems_);
    }
    if (baseEggs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, baseEggs_);
    }
    if (maxTeamChanges_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, maxTeamChanges_);
    }
    if (teamChangeItemResetPeriodInDays_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, teamChangeItemResetPeriodInDays_);
    }
    if (maxItemBoostDurationMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, maxItemBoostDurationMs_);
    }
    if (defaultStickerMaxCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, defaultStickerMaxCount_);
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
    if (!(obj instanceof POGOProtos.Settings.InventorySettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.InventorySettings other = (POGOProtos.Settings.InventorySettings) obj;

    if (getMaxPokemon()
        != other.getMaxPokemon()) return false;
    if (getMaxBagItems()
        != other.getMaxBagItems()) return false;
    if (getBasePokemon()
        != other.getBasePokemon()) return false;
    if (getBaseBagItems()
        != other.getBaseBagItems()) return false;
    if (getBaseEggs()
        != other.getBaseEggs()) return false;
    if (getMaxTeamChanges()
        != other.getMaxTeamChanges()) return false;
    if (getTeamChangeItemResetPeriodInDays()
        != other.getTeamChangeItemResetPeriodInDays()) return false;
    if (getMaxItemBoostDurationMs()
        != other.getMaxItemBoostDurationMs()) return false;
    if (getDefaultStickerMaxCount()
        != other.getDefaultStickerMaxCount()) return false;
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
    hash = (37 * hash) + MAX_POKEMON_FIELD_NUMBER;
    hash = (53 * hash) + getMaxPokemon();
    hash = (37 * hash) + MAX_BAG_ITEMS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxBagItems();
    hash = (37 * hash) + BASE_POKEMON_FIELD_NUMBER;
    hash = (53 * hash) + getBasePokemon();
    hash = (37 * hash) + BASE_BAG_ITEMS_FIELD_NUMBER;
    hash = (53 * hash) + getBaseBagItems();
    hash = (37 * hash) + BASE_EGGS_FIELD_NUMBER;
    hash = (53 * hash) + getBaseEggs();
    hash = (37 * hash) + MAX_TEAM_CHANGES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxTeamChanges();
    hash = (37 * hash) + TEAM_CHANGE_ITEM_RESET_PERIOD_IN_DAYS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTeamChangeItemResetPeriodInDays());
    hash = (37 * hash) + MAX_ITEM_BOOST_DURATION_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxItemBoostDurationMs());
    hash = (37 * hash) + DEFAULT_STICKER_MAX_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultStickerMaxCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.InventorySettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.InventorySettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.InventorySettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.InventorySettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.InventorySettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.InventorySettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.InventorySettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.InventorySettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.InventorySettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.InventorySettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.InventorySettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.InventorySettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.InventorySettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.InventorySettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.InventorySettings)
      POGOProtos.Settings.InventorySettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.InventorySettingsOuterClass.internal_static_POGOProtos_Settings_InventorySettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.InventorySettingsOuterClass.internal_static_POGOProtos_Settings_InventorySettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.InventorySettings.class, POGOProtos.Settings.InventorySettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.InventorySettings.newBuilder()
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
      maxPokemon_ = 0;

      maxBagItems_ = 0;

      basePokemon_ = 0;

      baseBagItems_ = 0;

      baseEggs_ = 0;

      maxTeamChanges_ = 0;

      teamChangeItemResetPeriodInDays_ = 0L;

      maxItemBoostDurationMs_ = 0L;

      defaultStickerMaxCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.InventorySettingsOuterClass.internal_static_POGOProtos_Settings_InventorySettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.InventorySettings getDefaultInstanceForType() {
      return POGOProtos.Settings.InventorySettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.InventorySettings build() {
      POGOProtos.Settings.InventorySettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.InventorySettings buildPartial() {
      POGOProtos.Settings.InventorySettings result = new POGOProtos.Settings.InventorySettings(this);
      result.maxPokemon_ = maxPokemon_;
      result.maxBagItems_ = maxBagItems_;
      result.basePokemon_ = basePokemon_;
      result.baseBagItems_ = baseBagItems_;
      result.baseEggs_ = baseEggs_;
      result.maxTeamChanges_ = maxTeamChanges_;
      result.teamChangeItemResetPeriodInDays_ = teamChangeItemResetPeriodInDays_;
      result.maxItemBoostDurationMs_ = maxItemBoostDurationMs_;
      result.defaultStickerMaxCount_ = defaultStickerMaxCount_;
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
      if (other instanceof POGOProtos.Settings.InventorySettings) {
        return mergeFrom((POGOProtos.Settings.InventorySettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.InventorySettings other) {
      if (other == POGOProtos.Settings.InventorySettings.getDefaultInstance()) return this;
      if (other.getMaxPokemon() != 0) {
        setMaxPokemon(other.getMaxPokemon());
      }
      if (other.getMaxBagItems() != 0) {
        setMaxBagItems(other.getMaxBagItems());
      }
      if (other.getBasePokemon() != 0) {
        setBasePokemon(other.getBasePokemon());
      }
      if (other.getBaseBagItems() != 0) {
        setBaseBagItems(other.getBaseBagItems());
      }
      if (other.getBaseEggs() != 0) {
        setBaseEggs(other.getBaseEggs());
      }
      if (other.getMaxTeamChanges() != 0) {
        setMaxTeamChanges(other.getMaxTeamChanges());
      }
      if (other.getTeamChangeItemResetPeriodInDays() != 0L) {
        setTeamChangeItemResetPeriodInDays(other.getTeamChangeItemResetPeriodInDays());
      }
      if (other.getMaxItemBoostDurationMs() != 0L) {
        setMaxItemBoostDurationMs(other.getMaxItemBoostDurationMs());
      }
      if (other.getDefaultStickerMaxCount() != 0) {
        setDefaultStickerMaxCount(other.getDefaultStickerMaxCount());
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
      POGOProtos.Settings.InventorySettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.InventorySettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int maxPokemon_ ;
    /**
     * <code>int32 max_pokemon = 1;</code>
     * @return The maxPokemon.
     */
    public int getMaxPokemon() {
      return maxPokemon_;
    }
    /**
     * <code>int32 max_pokemon = 1;</code>
     * @param value The maxPokemon to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPokemon(int value) {
      
      maxPokemon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_pokemon = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxPokemon() {
      
      maxPokemon_ = 0;
      onChanged();
      return this;
    }

    private int maxBagItems_ ;
    /**
     * <code>int32 max_bag_items = 2;</code>
     * @return The maxBagItems.
     */
    public int getMaxBagItems() {
      return maxBagItems_;
    }
    /**
     * <code>int32 max_bag_items = 2;</code>
     * @param value The maxBagItems to set.
     * @return This builder for chaining.
     */
    public Builder setMaxBagItems(int value) {
      
      maxBagItems_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_bag_items = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxBagItems() {
      
      maxBagItems_ = 0;
      onChanged();
      return this;
    }

    private int basePokemon_ ;
    /**
     * <code>int32 base_pokemon = 3;</code>
     * @return The basePokemon.
     */
    public int getBasePokemon() {
      return basePokemon_;
    }
    /**
     * <code>int32 base_pokemon = 3;</code>
     * @param value The basePokemon to set.
     * @return This builder for chaining.
     */
    public Builder setBasePokemon(int value) {
      
      basePokemon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 base_pokemon = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBasePokemon() {
      
      basePokemon_ = 0;
      onChanged();
      return this;
    }

    private int baseBagItems_ ;
    /**
     * <code>int32 base_bag_items = 4;</code>
     * @return The baseBagItems.
     */
    public int getBaseBagItems() {
      return baseBagItems_;
    }
    /**
     * <code>int32 base_bag_items = 4;</code>
     * @param value The baseBagItems to set.
     * @return This builder for chaining.
     */
    public Builder setBaseBagItems(int value) {
      
      baseBagItems_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 base_bag_items = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBaseBagItems() {
      
      baseBagItems_ = 0;
      onChanged();
      return this;
    }

    private int baseEggs_ ;
    /**
     * <code>int32 base_eggs = 5;</code>
     * @return The baseEggs.
     */
    public int getBaseEggs() {
      return baseEggs_;
    }
    /**
     * <code>int32 base_eggs = 5;</code>
     * @param value The baseEggs to set.
     * @return This builder for chaining.
     */
    public Builder setBaseEggs(int value) {
      
      baseEggs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 base_eggs = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBaseEggs() {
      
      baseEggs_ = 0;
      onChanged();
      return this;
    }

    private int maxTeamChanges_ ;
    /**
     * <code>int32 max_team_changes = 6;</code>
     * @return The maxTeamChanges.
     */
    public int getMaxTeamChanges() {
      return maxTeamChanges_;
    }
    /**
     * <code>int32 max_team_changes = 6;</code>
     * @param value The maxTeamChanges to set.
     * @return This builder for chaining.
     */
    public Builder setMaxTeamChanges(int value) {
      
      maxTeamChanges_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_team_changes = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxTeamChanges() {
      
      maxTeamChanges_ = 0;
      onChanged();
      return this;
    }

    private long teamChangeItemResetPeriodInDays_ ;
    /**
     * <code>int64 team_change_item_reset_period_in_days = 7;</code>
     * @return The teamChangeItemResetPeriodInDays.
     */
    public long getTeamChangeItemResetPeriodInDays() {
      return teamChangeItemResetPeriodInDays_;
    }
    /**
     * <code>int64 team_change_item_reset_period_in_days = 7;</code>
     * @param value The teamChangeItemResetPeriodInDays to set.
     * @return This builder for chaining.
     */
    public Builder setTeamChangeItemResetPeriodInDays(long value) {
      
      teamChangeItemResetPeriodInDays_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 team_change_item_reset_period_in_days = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeamChangeItemResetPeriodInDays() {
      
      teamChangeItemResetPeriodInDays_ = 0L;
      onChanged();
      return this;
    }

    private long maxItemBoostDurationMs_ ;
    /**
     * <code>int64 max_item_boost_duration_ms = 8;</code>
     * @return The maxItemBoostDurationMs.
     */
    public long getMaxItemBoostDurationMs() {
      return maxItemBoostDurationMs_;
    }
    /**
     * <code>int64 max_item_boost_duration_ms = 8;</code>
     * @param value The maxItemBoostDurationMs to set.
     * @return This builder for chaining.
     */
    public Builder setMaxItemBoostDurationMs(long value) {
      
      maxItemBoostDurationMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 max_item_boost_duration_ms = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxItemBoostDurationMs() {
      
      maxItemBoostDurationMs_ = 0L;
      onChanged();
      return this;
    }

    private int defaultStickerMaxCount_ ;
    /**
     * <code>int32 default_sticker_max_count = 9;</code>
     * @return The defaultStickerMaxCount.
     */
    public int getDefaultStickerMaxCount() {
      return defaultStickerMaxCount_;
    }
    /**
     * <code>int32 default_sticker_max_count = 9;</code>
     * @param value The defaultStickerMaxCount to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultStickerMaxCount(int value) {
      
      defaultStickerMaxCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 default_sticker_max_count = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultStickerMaxCount() {
      
      defaultStickerMaxCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.InventorySettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.InventorySettings)
  private static final POGOProtos.Settings.InventorySettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.InventorySettings();
  }

  public static POGOProtos.Settings.InventorySettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventorySettings>
      PARSER = new com.google.protobuf.AbstractParser<InventorySettings>() {
    @java.lang.Override
    public InventorySettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventorySettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventorySettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventorySettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.InventorySettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

