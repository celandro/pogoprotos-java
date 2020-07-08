// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/BackgroundModeGlobalSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.BackgroundModeGlobalSettings}
 */
public  final class BackgroundModeGlobalSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.BackgroundModeGlobalSettings)
    BackgroundModeGlobalSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BackgroundModeGlobalSettings.newBuilder() to construct.
  private BackgroundModeGlobalSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackgroundModeGlobalSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BackgroundModeGlobalSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BackgroundModeGlobalSettings(
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

            minPlayerLevelFitness_ = input.readUInt32();
            break;
          }
          case 16: {

            servicePromptTimestampMs_ = input.readInt64();
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
    return POGOProtos.Settings.BackgroundModeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeGlobalSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.BackgroundModeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeGlobalSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.BackgroundModeGlobalSettings.class, POGOProtos.Settings.BackgroundModeGlobalSettings.Builder.class);
  }

  public static final int MIN_PLAYER_LEVEL_FITNESS_FIELD_NUMBER = 1;
  private int minPlayerLevelFitness_;
  /**
   * <code>uint32 min_player_level_fitness = 1;</code>
   * @return The minPlayerLevelFitness.
   */
  public int getMinPlayerLevelFitness() {
    return minPlayerLevelFitness_;
  }

  public static final int SERVICE_PROMPT_TIMESTAMP_MS_FIELD_NUMBER = 2;
  private long servicePromptTimestampMs_;
  /**
   * <code>int64 service_prompt_timestamp_ms = 2;</code>
   * @return The servicePromptTimestampMs.
   */
  public long getServicePromptTimestampMs() {
    return servicePromptTimestampMs_;
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
    if (minPlayerLevelFitness_ != 0) {
      output.writeUInt32(1, minPlayerLevelFitness_);
    }
    if (servicePromptTimestampMs_ != 0L) {
      output.writeInt64(2, servicePromptTimestampMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minPlayerLevelFitness_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, minPlayerLevelFitness_);
    }
    if (servicePromptTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, servicePromptTimestampMs_);
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
    if (!(obj instanceof POGOProtos.Settings.BackgroundModeGlobalSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.BackgroundModeGlobalSettings other = (POGOProtos.Settings.BackgroundModeGlobalSettings) obj;

    if (getMinPlayerLevelFitness()
        != other.getMinPlayerLevelFitness()) return false;
    if (getServicePromptTimestampMs()
        != other.getServicePromptTimestampMs()) return false;
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
    hash = (37 * hash) + MIN_PLAYER_LEVEL_FITNESS_FIELD_NUMBER;
    hash = (53 * hash) + getMinPlayerLevelFitness();
    hash = (37 * hash) + SERVICE_PROMPT_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getServicePromptTimestampMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.BackgroundModeGlobalSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.BackgroundModeGlobalSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.BackgroundModeGlobalSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.BackgroundModeGlobalSettings)
      POGOProtos.Settings.BackgroundModeGlobalSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.BackgroundModeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeGlobalSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.BackgroundModeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeGlobalSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.BackgroundModeGlobalSettings.class, POGOProtos.Settings.BackgroundModeGlobalSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.BackgroundModeGlobalSettings.newBuilder()
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
      minPlayerLevelFitness_ = 0;

      servicePromptTimestampMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.BackgroundModeGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeGlobalSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.BackgroundModeGlobalSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.BackgroundModeGlobalSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.BackgroundModeGlobalSettings build() {
      POGOProtos.Settings.BackgroundModeGlobalSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.BackgroundModeGlobalSettings buildPartial() {
      POGOProtos.Settings.BackgroundModeGlobalSettings result = new POGOProtos.Settings.BackgroundModeGlobalSettings(this);
      result.minPlayerLevelFitness_ = minPlayerLevelFitness_;
      result.servicePromptTimestampMs_ = servicePromptTimestampMs_;
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
      if (other instanceof POGOProtos.Settings.BackgroundModeGlobalSettings) {
        return mergeFrom((POGOProtos.Settings.BackgroundModeGlobalSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.BackgroundModeGlobalSettings other) {
      if (other == POGOProtos.Settings.BackgroundModeGlobalSettings.getDefaultInstance()) return this;
      if (other.getMinPlayerLevelFitness() != 0) {
        setMinPlayerLevelFitness(other.getMinPlayerLevelFitness());
      }
      if (other.getServicePromptTimestampMs() != 0L) {
        setServicePromptTimestampMs(other.getServicePromptTimestampMs());
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
      POGOProtos.Settings.BackgroundModeGlobalSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.BackgroundModeGlobalSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int minPlayerLevelFitness_ ;
    /**
     * <code>uint32 min_player_level_fitness = 1;</code>
     * @return The minPlayerLevelFitness.
     */
    public int getMinPlayerLevelFitness() {
      return minPlayerLevelFitness_;
    }
    /**
     * <code>uint32 min_player_level_fitness = 1;</code>
     * @param value The minPlayerLevelFitness to set.
     * @return This builder for chaining.
     */
    public Builder setMinPlayerLevelFitness(int value) {
      
      minPlayerLevelFitness_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 min_player_level_fitness = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinPlayerLevelFitness() {
      
      minPlayerLevelFitness_ = 0;
      onChanged();
      return this;
    }

    private long servicePromptTimestampMs_ ;
    /**
     * <code>int64 service_prompt_timestamp_ms = 2;</code>
     * @return The servicePromptTimestampMs.
     */
    public long getServicePromptTimestampMs() {
      return servicePromptTimestampMs_;
    }
    /**
     * <code>int64 service_prompt_timestamp_ms = 2;</code>
     * @param value The servicePromptTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setServicePromptTimestampMs(long value) {
      
      servicePromptTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 service_prompt_timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearServicePromptTimestampMs() {
      
      servicePromptTimestampMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.BackgroundModeGlobalSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.BackgroundModeGlobalSettings)
  private static final POGOProtos.Settings.BackgroundModeGlobalSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.BackgroundModeGlobalSettings();
  }

  public static POGOProtos.Settings.BackgroundModeGlobalSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackgroundModeGlobalSettings>
      PARSER = new com.google.protobuf.AbstractParser<BackgroundModeGlobalSettings>() {
    @java.lang.Override
    public BackgroundModeGlobalSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BackgroundModeGlobalSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BackgroundModeGlobalSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackgroundModeGlobalSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.BackgroundModeGlobalSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
