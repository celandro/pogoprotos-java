// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BattlePartySettings.proto

package POGOProtos.Settings.Master;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.BattlePartySettings}
 */
public final class BattlePartySettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.BattlePartySettings)
    BattlePartySettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BattlePartySettings.newBuilder() to construct.
  private BattlePartySettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BattlePartySettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BattlePartySettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BattlePartySettings(
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

            enableBattlePartySaving_ = input.readBool();
            break;
          }
          case 16: {

            maxBattleParties_ = input.readInt32();
            break;
          }
          case 24: {

            overallPartiesCap_ = input.readInt32();
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
    return POGOProtos.Settings.Master.BattlePartySettingsOuterClass.internal_static_POGOProtos_Settings_Master_BattlePartySettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.BattlePartySettingsOuterClass.internal_static_POGOProtos_Settings_Master_BattlePartySettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.BattlePartySettings.class, POGOProtos.Settings.Master.BattlePartySettings.Builder.class);
  }

  public static final int ENABLE_BATTLE_PARTY_SAVING_FIELD_NUMBER = 1;
  private boolean enableBattlePartySaving_;
  /**
   * <code>bool enable_battle_party_saving = 1;</code>
   * @return The enableBattlePartySaving.
   */
  @java.lang.Override
  public boolean getEnableBattlePartySaving() {
    return enableBattlePartySaving_;
  }

  public static final int MAX_BATTLE_PARTIES_FIELD_NUMBER = 2;
  private int maxBattleParties_;
  /**
   * <code>int32 max_battle_parties = 2;</code>
   * @return The maxBattleParties.
   */
  @java.lang.Override
  public int getMaxBattleParties() {
    return maxBattleParties_;
  }

  public static final int OVERALL_PARTIES_CAP_FIELD_NUMBER = 3;
  private int overallPartiesCap_;
  /**
   * <code>int32 overall_parties_cap = 3;</code>
   * @return The overallPartiesCap.
   */
  @java.lang.Override
  public int getOverallPartiesCap() {
    return overallPartiesCap_;
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
    if (enableBattlePartySaving_ != false) {
      output.writeBool(1, enableBattlePartySaving_);
    }
    if (maxBattleParties_ != 0) {
      output.writeInt32(2, maxBattleParties_);
    }
    if (overallPartiesCap_ != 0) {
      output.writeInt32(3, overallPartiesCap_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableBattlePartySaving_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableBattlePartySaving_);
    }
    if (maxBattleParties_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxBattleParties_);
    }
    if (overallPartiesCap_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, overallPartiesCap_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.BattlePartySettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.BattlePartySettings other = (POGOProtos.Settings.Master.BattlePartySettings) obj;

    if (getEnableBattlePartySaving()
        != other.getEnableBattlePartySaving()) return false;
    if (getMaxBattleParties()
        != other.getMaxBattleParties()) return false;
    if (getOverallPartiesCap()
        != other.getOverallPartiesCap()) return false;
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
    hash = (37 * hash) + ENABLE_BATTLE_PARTY_SAVING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableBattlePartySaving());
    hash = (37 * hash) + MAX_BATTLE_PARTIES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxBattleParties();
    hash = (37 * hash) + OVERALL_PARTIES_CAP_FIELD_NUMBER;
    hash = (53 * hash) + getOverallPartiesCap();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.BattlePartySettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.BattlePartySettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.BattlePartySettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.BattlePartySettings)
      POGOProtos.Settings.Master.BattlePartySettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.BattlePartySettingsOuterClass.internal_static_POGOProtos_Settings_Master_BattlePartySettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.BattlePartySettingsOuterClass.internal_static_POGOProtos_Settings_Master_BattlePartySettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.BattlePartySettings.class, POGOProtos.Settings.Master.BattlePartySettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.BattlePartySettings.newBuilder()
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
      enableBattlePartySaving_ = false;

      maxBattleParties_ = 0;

      overallPartiesCap_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.BattlePartySettingsOuterClass.internal_static_POGOProtos_Settings_Master_BattlePartySettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.BattlePartySettings getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.BattlePartySettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.BattlePartySettings build() {
      POGOProtos.Settings.Master.BattlePartySettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.BattlePartySettings buildPartial() {
      POGOProtos.Settings.Master.BattlePartySettings result = new POGOProtos.Settings.Master.BattlePartySettings(this);
      result.enableBattlePartySaving_ = enableBattlePartySaving_;
      result.maxBattleParties_ = maxBattleParties_;
      result.overallPartiesCap_ = overallPartiesCap_;
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
      if (other instanceof POGOProtos.Settings.Master.BattlePartySettings) {
        return mergeFrom((POGOProtos.Settings.Master.BattlePartySettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.BattlePartySettings other) {
      if (other == POGOProtos.Settings.Master.BattlePartySettings.getDefaultInstance()) return this;
      if (other.getEnableBattlePartySaving() != false) {
        setEnableBattlePartySaving(other.getEnableBattlePartySaving());
      }
      if (other.getMaxBattleParties() != 0) {
        setMaxBattleParties(other.getMaxBattleParties());
      }
      if (other.getOverallPartiesCap() != 0) {
        setOverallPartiesCap(other.getOverallPartiesCap());
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
      POGOProtos.Settings.Master.BattlePartySettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.BattlePartySettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableBattlePartySaving_ ;
    /**
     * <code>bool enable_battle_party_saving = 1;</code>
     * @return The enableBattlePartySaving.
     */
    @java.lang.Override
    public boolean getEnableBattlePartySaving() {
      return enableBattlePartySaving_;
    }
    /**
     * <code>bool enable_battle_party_saving = 1;</code>
     * @param value The enableBattlePartySaving to set.
     * @return This builder for chaining.
     */
    public Builder setEnableBattlePartySaving(boolean value) {
      
      enableBattlePartySaving_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_battle_party_saving = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableBattlePartySaving() {
      
      enableBattlePartySaving_ = false;
      onChanged();
      return this;
    }

    private int maxBattleParties_ ;
    /**
     * <code>int32 max_battle_parties = 2;</code>
     * @return The maxBattleParties.
     */
    @java.lang.Override
    public int getMaxBattleParties() {
      return maxBattleParties_;
    }
    /**
     * <code>int32 max_battle_parties = 2;</code>
     * @param value The maxBattleParties to set.
     * @return This builder for chaining.
     */
    public Builder setMaxBattleParties(int value) {
      
      maxBattleParties_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_battle_parties = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxBattleParties() {
      
      maxBattleParties_ = 0;
      onChanged();
      return this;
    }

    private int overallPartiesCap_ ;
    /**
     * <code>int32 overall_parties_cap = 3;</code>
     * @return The overallPartiesCap.
     */
    @java.lang.Override
    public int getOverallPartiesCap() {
      return overallPartiesCap_;
    }
    /**
     * <code>int32 overall_parties_cap = 3;</code>
     * @param value The overallPartiesCap to set.
     * @return This builder for chaining.
     */
    public Builder setOverallPartiesCap(int value) {
      
      overallPartiesCap_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 overall_parties_cap = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOverallPartiesCap() {
      
      overallPartiesCap_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.BattlePartySettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.BattlePartySettings)
  private static final POGOProtos.Settings.Master.BattlePartySettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.BattlePartySettings();
  }

  public static POGOProtos.Settings.Master.BattlePartySettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BattlePartySettings>
      PARSER = new com.google.protobuf.AbstractParser<BattlePartySettings>() {
    @java.lang.Override
    public BattlePartySettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BattlePartySettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BattlePartySettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BattlePartySettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.BattlePartySettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

