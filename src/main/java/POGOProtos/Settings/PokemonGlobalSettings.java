// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/PokemonGlobalSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.PokemonGlobalSettings}
 */
public  final class PokemonGlobalSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.PokemonGlobalSettings)
    PokemonGlobalSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonGlobalSettings.newBuilder() to construct.
  private PokemonGlobalSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonGlobalSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonGlobalSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonGlobalSettings(
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

            enableCamoShader_ = input.readBool();
            break;
          }
          case 16: {

            displayPokemonBadgeOnModel_ = input.readBool();
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
    return POGOProtos.Settings.PokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_PokemonGlobalSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.PokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_PokemonGlobalSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.PokemonGlobalSettings.class, POGOProtos.Settings.PokemonGlobalSettings.Builder.class);
  }

  public static final int ENABLE_CAMO_SHADER_FIELD_NUMBER = 1;
  private boolean enableCamoShader_;
  /**
   * <code>bool enable_camo_shader = 1;</code>
   * @return The enableCamoShader.
   */
  public boolean getEnableCamoShader() {
    return enableCamoShader_;
  }

  public static final int DISPLAY_POKEMON_BADGE_ON_MODEL_FIELD_NUMBER = 2;
  private boolean displayPokemonBadgeOnModel_;
  /**
   * <code>bool display_pokemon_badge_on_model = 2;</code>
   * @return The displayPokemonBadgeOnModel.
   */
  public boolean getDisplayPokemonBadgeOnModel() {
    return displayPokemonBadgeOnModel_;
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
    if (enableCamoShader_ != false) {
      output.writeBool(1, enableCamoShader_);
    }
    if (displayPokemonBadgeOnModel_ != false) {
      output.writeBool(2, displayPokemonBadgeOnModel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableCamoShader_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableCamoShader_);
    }
    if (displayPokemonBadgeOnModel_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, displayPokemonBadgeOnModel_);
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
    if (!(obj instanceof POGOProtos.Settings.PokemonGlobalSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.PokemonGlobalSettings other = (POGOProtos.Settings.PokemonGlobalSettings) obj;

    if (getEnableCamoShader()
        != other.getEnableCamoShader()) return false;
    if (getDisplayPokemonBadgeOnModel()
        != other.getDisplayPokemonBadgeOnModel()) return false;
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
    hash = (37 * hash) + ENABLE_CAMO_SHADER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableCamoShader());
    hash = (37 * hash) + DISPLAY_POKEMON_BADGE_ON_MODEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisplayPokemonBadgeOnModel());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.PokemonGlobalSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.PokemonGlobalSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.PokemonGlobalSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.PokemonGlobalSettings)
      POGOProtos.Settings.PokemonGlobalSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.PokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_PokemonGlobalSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.PokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_PokemonGlobalSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.PokemonGlobalSettings.class, POGOProtos.Settings.PokemonGlobalSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.PokemonGlobalSettings.newBuilder()
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
      enableCamoShader_ = false;

      displayPokemonBadgeOnModel_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.PokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_PokemonGlobalSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.PokemonGlobalSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.PokemonGlobalSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.PokemonGlobalSettings build() {
      POGOProtos.Settings.PokemonGlobalSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.PokemonGlobalSettings buildPartial() {
      POGOProtos.Settings.PokemonGlobalSettings result = new POGOProtos.Settings.PokemonGlobalSettings(this);
      result.enableCamoShader_ = enableCamoShader_;
      result.displayPokemonBadgeOnModel_ = displayPokemonBadgeOnModel_;
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
      if (other instanceof POGOProtos.Settings.PokemonGlobalSettings) {
        return mergeFrom((POGOProtos.Settings.PokemonGlobalSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.PokemonGlobalSettings other) {
      if (other == POGOProtos.Settings.PokemonGlobalSettings.getDefaultInstance()) return this;
      if (other.getEnableCamoShader() != false) {
        setEnableCamoShader(other.getEnableCamoShader());
      }
      if (other.getDisplayPokemonBadgeOnModel() != false) {
        setDisplayPokemonBadgeOnModel(other.getDisplayPokemonBadgeOnModel());
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
      POGOProtos.Settings.PokemonGlobalSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.PokemonGlobalSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableCamoShader_ ;
    /**
     * <code>bool enable_camo_shader = 1;</code>
     * @return The enableCamoShader.
     */
    public boolean getEnableCamoShader() {
      return enableCamoShader_;
    }
    /**
     * <code>bool enable_camo_shader = 1;</code>
     * @param value The enableCamoShader to set.
     * @return This builder for chaining.
     */
    public Builder setEnableCamoShader(boolean value) {
      
      enableCamoShader_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_camo_shader = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableCamoShader() {
      
      enableCamoShader_ = false;
      onChanged();
      return this;
    }

    private boolean displayPokemonBadgeOnModel_ ;
    /**
     * <code>bool display_pokemon_badge_on_model = 2;</code>
     * @return The displayPokemonBadgeOnModel.
     */
    public boolean getDisplayPokemonBadgeOnModel() {
      return displayPokemonBadgeOnModel_;
    }
    /**
     * <code>bool display_pokemon_badge_on_model = 2;</code>
     * @param value The displayPokemonBadgeOnModel to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayPokemonBadgeOnModel(boolean value) {
      
      displayPokemonBadgeOnModel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool display_pokemon_badge_on_model = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayPokemonBadgeOnModel() {
      
      displayPokemonBadgeOnModel_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.PokemonGlobalSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.PokemonGlobalSettings)
  private static final POGOProtos.Settings.PokemonGlobalSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.PokemonGlobalSettings();
  }

  public static POGOProtos.Settings.PokemonGlobalSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonGlobalSettings>
      PARSER = new com.google.protobuf.AbstractParser<PokemonGlobalSettings>() {
    @java.lang.Override
    public PokemonGlobalSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonGlobalSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonGlobalSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonGlobalSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.PokemonGlobalSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

