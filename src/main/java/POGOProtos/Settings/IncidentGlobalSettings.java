// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/IncidentGlobalSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.IncidentGlobalSettings}
 */
public final class IncidentGlobalSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.IncidentGlobalSettings)
    IncidentGlobalSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IncidentGlobalSettings.newBuilder() to construct.
  private IncidentGlobalSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IncidentGlobalSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IncidentGlobalSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IncidentGlobalSettings(
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

            minPlayerLevel_ = input.readInt32();
            break;
          }
          case 16: {

            minPlayerLevelForV2_ = input.readInt32();
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
    return POGOProtos.Settings.IncidentGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_IncidentGlobalSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.IncidentGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_IncidentGlobalSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.IncidentGlobalSettings.class, POGOProtos.Settings.IncidentGlobalSettings.Builder.class);
  }

  public static final int MIN_PLAYER_LEVEL_FIELD_NUMBER = 1;
  private int minPlayerLevel_;
  /**
   * <code>int32 min_player_level = 1;</code>
   * @return The minPlayerLevel.
   */
  @java.lang.Override
  public int getMinPlayerLevel() {
    return minPlayerLevel_;
  }

  public static final int MIN_PLAYER_LEVEL_FOR_V2_FIELD_NUMBER = 2;
  private int minPlayerLevelForV2_;
  /**
   * <code>int32 min_player_level_for_v2 = 2;</code>
   * @return The minPlayerLevelForV2.
   */
  @java.lang.Override
  public int getMinPlayerLevelForV2() {
    return minPlayerLevelForV2_;
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
    if (minPlayerLevel_ != 0) {
      output.writeInt32(1, minPlayerLevel_);
    }
    if (minPlayerLevelForV2_ != 0) {
      output.writeInt32(2, minPlayerLevelForV2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minPlayerLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, minPlayerLevel_);
    }
    if (minPlayerLevelForV2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minPlayerLevelForV2_);
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
    if (!(obj instanceof POGOProtos.Settings.IncidentGlobalSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.IncidentGlobalSettings other = (POGOProtos.Settings.IncidentGlobalSettings) obj;

    if (getMinPlayerLevel()
        != other.getMinPlayerLevel()) return false;
    if (getMinPlayerLevelForV2()
        != other.getMinPlayerLevelForV2()) return false;
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
    hash = (37 * hash) + MIN_PLAYER_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getMinPlayerLevel();
    hash = (37 * hash) + MIN_PLAYER_LEVEL_FOR_V2_FIELD_NUMBER;
    hash = (53 * hash) + getMinPlayerLevelForV2();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.IncidentGlobalSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.IncidentGlobalSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.IncidentGlobalSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.IncidentGlobalSettings)
      POGOProtos.Settings.IncidentGlobalSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.IncidentGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_IncidentGlobalSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.IncidentGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_IncidentGlobalSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.IncidentGlobalSettings.class, POGOProtos.Settings.IncidentGlobalSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.IncidentGlobalSettings.newBuilder()
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
      minPlayerLevel_ = 0;

      minPlayerLevelForV2_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.IncidentGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_IncidentGlobalSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.IncidentGlobalSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.IncidentGlobalSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.IncidentGlobalSettings build() {
      POGOProtos.Settings.IncidentGlobalSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.IncidentGlobalSettings buildPartial() {
      POGOProtos.Settings.IncidentGlobalSettings result = new POGOProtos.Settings.IncidentGlobalSettings(this);
      result.minPlayerLevel_ = minPlayerLevel_;
      result.minPlayerLevelForV2_ = minPlayerLevelForV2_;
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
      if (other instanceof POGOProtos.Settings.IncidentGlobalSettings) {
        return mergeFrom((POGOProtos.Settings.IncidentGlobalSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.IncidentGlobalSettings other) {
      if (other == POGOProtos.Settings.IncidentGlobalSettings.getDefaultInstance()) return this;
      if (other.getMinPlayerLevel() != 0) {
        setMinPlayerLevel(other.getMinPlayerLevel());
      }
      if (other.getMinPlayerLevelForV2() != 0) {
        setMinPlayerLevelForV2(other.getMinPlayerLevelForV2());
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
      POGOProtos.Settings.IncidentGlobalSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.IncidentGlobalSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int minPlayerLevel_ ;
    /**
     * <code>int32 min_player_level = 1;</code>
     * @return The minPlayerLevel.
     */
    @java.lang.Override
    public int getMinPlayerLevel() {
      return minPlayerLevel_;
    }
    /**
     * <code>int32 min_player_level = 1;</code>
     * @param value The minPlayerLevel to set.
     * @return This builder for chaining.
     */
    public Builder setMinPlayerLevel(int value) {
      
      minPlayerLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 min_player_level = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinPlayerLevel() {
      
      minPlayerLevel_ = 0;
      onChanged();
      return this;
    }

    private int minPlayerLevelForV2_ ;
    /**
     * <code>int32 min_player_level_for_v2 = 2;</code>
     * @return The minPlayerLevelForV2.
     */
    @java.lang.Override
    public int getMinPlayerLevelForV2() {
      return minPlayerLevelForV2_;
    }
    /**
     * <code>int32 min_player_level_for_v2 = 2;</code>
     * @param value The minPlayerLevelForV2 to set.
     * @return This builder for chaining.
     */
    public Builder setMinPlayerLevelForV2(int value) {
      
      minPlayerLevelForV2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 min_player_level_for_v2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinPlayerLevelForV2() {
      
      minPlayerLevelForV2_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.IncidentGlobalSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.IncidentGlobalSettings)
  private static final POGOProtos.Settings.IncidentGlobalSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.IncidentGlobalSettings();
  }

  public static POGOProtos.Settings.IncidentGlobalSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IncidentGlobalSettings>
      PARSER = new com.google.protobuf.AbstractParser<IncidentGlobalSettings>() {
    @java.lang.Override
    public IncidentGlobalSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IncidentGlobalSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IncidentGlobalSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IncidentGlobalSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.IncidentGlobalSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

