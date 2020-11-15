// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/PokecoinPurchaseDisplaySettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.PokecoinPurchaseDisplaySettings}
 */
public final class PokecoinPurchaseDisplaySettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.PokecoinPurchaseDisplaySettings)
    PokecoinPurchaseDisplaySettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokecoinPurchaseDisplaySettings.newBuilder() to construct.
  private PokecoinPurchaseDisplaySettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokecoinPurchaseDisplaySettings() {
    enabledCountries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    enabledCurrencies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokecoinPurchaseDisplaySettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokecoinPurchaseDisplaySettings(
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

            featureEnabled_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              enabledCountries_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            enabledCountries_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              enabledCurrencies_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            enabledCurrencies_.add(s);
            break;
          }
          case 32: {

            usePokecoinPurchaseDisplayGmt_ = input.readBool();
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
        enabledCountries_ = enabledCountries_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        enabledCurrencies_ = enabledCurrencies_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Settings.PokecoinPurchaseDisplaySettingsOuterClass.internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.PokecoinPurchaseDisplaySettingsOuterClass.internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.PokecoinPurchaseDisplaySettings.class, POGOProtos.Settings.PokecoinPurchaseDisplaySettings.Builder.class);
  }

  public static final int FEATURE_ENABLED_FIELD_NUMBER = 1;
  private boolean featureEnabled_;
  /**
   * <code>bool feature_enabled = 1;</code>
   * @return The featureEnabled.
   */
  @java.lang.Override
  public boolean getFeatureEnabled() {
    return featureEnabled_;
  }

  public static final int ENABLED_COUNTRIES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList enabledCountries_;
  /**
   * <code>repeated string enabled_countries = 2;</code>
   * @return A list containing the enabledCountries.
   */
  public com.google.protobuf.ProtocolStringList
      getEnabledCountriesList() {
    return enabledCountries_;
  }
  /**
   * <code>repeated string enabled_countries = 2;</code>
   * @return The count of enabledCountries.
   */
  public int getEnabledCountriesCount() {
    return enabledCountries_.size();
  }
  /**
   * <code>repeated string enabled_countries = 2;</code>
   * @param index The index of the element to return.
   * @return The enabledCountries at the given index.
   */
  public java.lang.String getEnabledCountries(int index) {
    return enabledCountries_.get(index);
  }
  /**
   * <code>repeated string enabled_countries = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the enabledCountries at the given index.
   */
  public com.google.protobuf.ByteString
      getEnabledCountriesBytes(int index) {
    return enabledCountries_.getByteString(index);
  }

  public static final int ENABLED_CURRENCIES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList enabledCurrencies_;
  /**
   * <code>repeated string enabled_currencies = 3;</code>
   * @return A list containing the enabledCurrencies.
   */
  public com.google.protobuf.ProtocolStringList
      getEnabledCurrenciesList() {
    return enabledCurrencies_;
  }
  /**
   * <code>repeated string enabled_currencies = 3;</code>
   * @return The count of enabledCurrencies.
   */
  public int getEnabledCurrenciesCount() {
    return enabledCurrencies_.size();
  }
  /**
   * <code>repeated string enabled_currencies = 3;</code>
   * @param index The index of the element to return.
   * @return The enabledCurrencies at the given index.
   */
  public java.lang.String getEnabledCurrencies(int index) {
    return enabledCurrencies_.get(index);
  }
  /**
   * <code>repeated string enabled_currencies = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the enabledCurrencies at the given index.
   */
  public com.google.protobuf.ByteString
      getEnabledCurrenciesBytes(int index) {
    return enabledCurrencies_.getByteString(index);
  }

  public static final int USE_POKECOIN_PURCHASE_DISPLAY_GMT_FIELD_NUMBER = 4;
  private boolean usePokecoinPurchaseDisplayGmt_;
  /**
   * <code>bool use_pokecoin_purchase_display_gmt = 4;</code>
   * @return The usePokecoinPurchaseDisplayGmt.
   */
  @java.lang.Override
  public boolean getUsePokecoinPurchaseDisplayGmt() {
    return usePokecoinPurchaseDisplayGmt_;
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
    if (featureEnabled_ != false) {
      output.writeBool(1, featureEnabled_);
    }
    for (int i = 0; i < enabledCountries_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, enabledCountries_.getRaw(i));
    }
    for (int i = 0; i < enabledCurrencies_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, enabledCurrencies_.getRaw(i));
    }
    if (usePokecoinPurchaseDisplayGmt_ != false) {
      output.writeBool(4, usePokecoinPurchaseDisplayGmt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (featureEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, featureEnabled_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < enabledCountries_.size(); i++) {
        dataSize += computeStringSizeNoTag(enabledCountries_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEnabledCountriesList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < enabledCurrencies_.size(); i++) {
        dataSize += computeStringSizeNoTag(enabledCurrencies_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEnabledCurrenciesList().size();
    }
    if (usePokecoinPurchaseDisplayGmt_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, usePokecoinPurchaseDisplayGmt_);
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
    if (!(obj instanceof POGOProtos.Settings.PokecoinPurchaseDisplaySettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.PokecoinPurchaseDisplaySettings other = (POGOProtos.Settings.PokecoinPurchaseDisplaySettings) obj;

    if (getFeatureEnabled()
        != other.getFeatureEnabled()) return false;
    if (!getEnabledCountriesList()
        .equals(other.getEnabledCountriesList())) return false;
    if (!getEnabledCurrenciesList()
        .equals(other.getEnabledCurrenciesList())) return false;
    if (getUsePokecoinPurchaseDisplayGmt()
        != other.getUsePokecoinPurchaseDisplayGmt()) return false;
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
    hash = (37 * hash) + FEATURE_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFeatureEnabled());
    if (getEnabledCountriesCount() > 0) {
      hash = (37 * hash) + ENABLED_COUNTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getEnabledCountriesList().hashCode();
    }
    if (getEnabledCurrenciesCount() > 0) {
      hash = (37 * hash) + ENABLED_CURRENCIES_FIELD_NUMBER;
      hash = (53 * hash) + getEnabledCurrenciesList().hashCode();
    }
    hash = (37 * hash) + USE_POKECOIN_PURCHASE_DISPLAY_GMT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUsePokecoinPurchaseDisplayGmt());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.PokecoinPurchaseDisplaySettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.PokecoinPurchaseDisplaySettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.PokecoinPurchaseDisplaySettings)
      POGOProtos.Settings.PokecoinPurchaseDisplaySettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.PokecoinPurchaseDisplaySettingsOuterClass.internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.PokecoinPurchaseDisplaySettingsOuterClass.internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.PokecoinPurchaseDisplaySettings.class, POGOProtos.Settings.PokecoinPurchaseDisplaySettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.PokecoinPurchaseDisplaySettings.newBuilder()
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
      featureEnabled_ = false;

      enabledCountries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      enabledCurrencies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      usePokecoinPurchaseDisplayGmt_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.PokecoinPurchaseDisplaySettingsOuterClass.internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.PokecoinPurchaseDisplaySettings getDefaultInstanceForType() {
      return POGOProtos.Settings.PokecoinPurchaseDisplaySettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.PokecoinPurchaseDisplaySettings build() {
      POGOProtos.Settings.PokecoinPurchaseDisplaySettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.PokecoinPurchaseDisplaySettings buildPartial() {
      POGOProtos.Settings.PokecoinPurchaseDisplaySettings result = new POGOProtos.Settings.PokecoinPurchaseDisplaySettings(this);
      int from_bitField0_ = bitField0_;
      result.featureEnabled_ = featureEnabled_;
      if (((bitField0_ & 0x00000001) != 0)) {
        enabledCountries_ = enabledCountries_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.enabledCountries_ = enabledCountries_;
      if (((bitField0_ & 0x00000002) != 0)) {
        enabledCurrencies_ = enabledCurrencies_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.enabledCurrencies_ = enabledCurrencies_;
      result.usePokecoinPurchaseDisplayGmt_ = usePokecoinPurchaseDisplayGmt_;
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
      if (other instanceof POGOProtos.Settings.PokecoinPurchaseDisplaySettings) {
        return mergeFrom((POGOProtos.Settings.PokecoinPurchaseDisplaySettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.PokecoinPurchaseDisplaySettings other) {
      if (other == POGOProtos.Settings.PokecoinPurchaseDisplaySettings.getDefaultInstance()) return this;
      if (other.getFeatureEnabled() != false) {
        setFeatureEnabled(other.getFeatureEnabled());
      }
      if (!other.enabledCountries_.isEmpty()) {
        if (enabledCountries_.isEmpty()) {
          enabledCountries_ = other.enabledCountries_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEnabledCountriesIsMutable();
          enabledCountries_.addAll(other.enabledCountries_);
        }
        onChanged();
      }
      if (!other.enabledCurrencies_.isEmpty()) {
        if (enabledCurrencies_.isEmpty()) {
          enabledCurrencies_ = other.enabledCurrencies_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureEnabledCurrenciesIsMutable();
          enabledCurrencies_.addAll(other.enabledCurrencies_);
        }
        onChanged();
      }
      if (other.getUsePokecoinPurchaseDisplayGmt() != false) {
        setUsePokecoinPurchaseDisplayGmt(other.getUsePokecoinPurchaseDisplayGmt());
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
      POGOProtos.Settings.PokecoinPurchaseDisplaySettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.PokecoinPurchaseDisplaySettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean featureEnabled_ ;
    /**
     * <code>bool feature_enabled = 1;</code>
     * @return The featureEnabled.
     */
    @java.lang.Override
    public boolean getFeatureEnabled() {
      return featureEnabled_;
    }
    /**
     * <code>bool feature_enabled = 1;</code>
     * @param value The featureEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureEnabled(boolean value) {
      
      featureEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool feature_enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeatureEnabled() {
      
      featureEnabled_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList enabledCountries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEnabledCountriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        enabledCountries_ = new com.google.protobuf.LazyStringArrayList(enabledCountries_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string enabled_countries = 2;</code>
     * @return A list containing the enabledCountries.
     */
    public com.google.protobuf.ProtocolStringList
        getEnabledCountriesList() {
      return enabledCountries_.getUnmodifiableView();
    }
    /**
     * <code>repeated string enabled_countries = 2;</code>
     * @return The count of enabledCountries.
     */
    public int getEnabledCountriesCount() {
      return enabledCountries_.size();
    }
    /**
     * <code>repeated string enabled_countries = 2;</code>
     * @param index The index of the element to return.
     * @return The enabledCountries at the given index.
     */
    public java.lang.String getEnabledCountries(int index) {
      return enabledCountries_.get(index);
    }
    /**
     * <code>repeated string enabled_countries = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the enabledCountries at the given index.
     */
    public com.google.protobuf.ByteString
        getEnabledCountriesBytes(int index) {
      return enabledCountries_.getByteString(index);
    }
    /**
     * <code>repeated string enabled_countries = 2;</code>
     * @param index The index to set the value at.
     * @param value The enabledCountries to set.
     * @return This builder for chaining.
     */
    public Builder setEnabledCountries(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEnabledCountriesIsMutable();
      enabledCountries_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string enabled_countries = 2;</code>
     * @param value The enabledCountries to add.
     * @return This builder for chaining.
     */
    public Builder addEnabledCountries(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEnabledCountriesIsMutable();
      enabledCountries_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string enabled_countries = 2;</code>
     * @param values The enabledCountries to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnabledCountries(
        java.lang.Iterable<java.lang.String> values) {
      ensureEnabledCountriesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, enabledCountries_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string enabled_countries = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabledCountries() {
      enabledCountries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string enabled_countries = 2;</code>
     * @param value The bytes of the enabledCountries to add.
     * @return This builder for chaining.
     */
    public Builder addEnabledCountriesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEnabledCountriesIsMutable();
      enabledCountries_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList enabledCurrencies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEnabledCurrenciesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        enabledCurrencies_ = new com.google.protobuf.LazyStringArrayList(enabledCurrencies_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string enabled_currencies = 3;</code>
     * @return A list containing the enabledCurrencies.
     */
    public com.google.protobuf.ProtocolStringList
        getEnabledCurrenciesList() {
      return enabledCurrencies_.getUnmodifiableView();
    }
    /**
     * <code>repeated string enabled_currencies = 3;</code>
     * @return The count of enabledCurrencies.
     */
    public int getEnabledCurrenciesCount() {
      return enabledCurrencies_.size();
    }
    /**
     * <code>repeated string enabled_currencies = 3;</code>
     * @param index The index of the element to return.
     * @return The enabledCurrencies at the given index.
     */
    public java.lang.String getEnabledCurrencies(int index) {
      return enabledCurrencies_.get(index);
    }
    /**
     * <code>repeated string enabled_currencies = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the enabledCurrencies at the given index.
     */
    public com.google.protobuf.ByteString
        getEnabledCurrenciesBytes(int index) {
      return enabledCurrencies_.getByteString(index);
    }
    /**
     * <code>repeated string enabled_currencies = 3;</code>
     * @param index The index to set the value at.
     * @param value The enabledCurrencies to set.
     * @return This builder for chaining.
     */
    public Builder setEnabledCurrencies(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEnabledCurrenciesIsMutable();
      enabledCurrencies_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string enabled_currencies = 3;</code>
     * @param value The enabledCurrencies to add.
     * @return This builder for chaining.
     */
    public Builder addEnabledCurrencies(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEnabledCurrenciesIsMutable();
      enabledCurrencies_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string enabled_currencies = 3;</code>
     * @param values The enabledCurrencies to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnabledCurrencies(
        java.lang.Iterable<java.lang.String> values) {
      ensureEnabledCurrenciesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, enabledCurrencies_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string enabled_currencies = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabledCurrencies() {
      enabledCurrencies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string enabled_currencies = 3;</code>
     * @param value The bytes of the enabledCurrencies to add.
     * @return This builder for chaining.
     */
    public Builder addEnabledCurrenciesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEnabledCurrenciesIsMutable();
      enabledCurrencies_.add(value);
      onChanged();
      return this;
    }

    private boolean usePokecoinPurchaseDisplayGmt_ ;
    /**
     * <code>bool use_pokecoin_purchase_display_gmt = 4;</code>
     * @return The usePokecoinPurchaseDisplayGmt.
     */
    @java.lang.Override
    public boolean getUsePokecoinPurchaseDisplayGmt() {
      return usePokecoinPurchaseDisplayGmt_;
    }
    /**
     * <code>bool use_pokecoin_purchase_display_gmt = 4;</code>
     * @param value The usePokecoinPurchaseDisplayGmt to set.
     * @return This builder for chaining.
     */
    public Builder setUsePokecoinPurchaseDisplayGmt(boolean value) {
      
      usePokecoinPurchaseDisplayGmt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool use_pokecoin_purchase_display_gmt = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsePokecoinPurchaseDisplayGmt() {
      
      usePokecoinPurchaseDisplayGmt_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.PokecoinPurchaseDisplaySettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.PokecoinPurchaseDisplaySettings)
  private static final POGOProtos.Settings.PokecoinPurchaseDisplaySettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.PokecoinPurchaseDisplaySettings();
  }

  public static POGOProtos.Settings.PokecoinPurchaseDisplaySettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokecoinPurchaseDisplaySettings>
      PARSER = new com.google.protobuf.AbstractParser<PokecoinPurchaseDisplaySettings>() {
    @java.lang.Override
    public PokecoinPurchaseDisplaySettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokecoinPurchaseDisplaySettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokecoinPurchaseDisplaySettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokecoinPurchaseDisplaySettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.PokecoinPurchaseDisplaySettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

