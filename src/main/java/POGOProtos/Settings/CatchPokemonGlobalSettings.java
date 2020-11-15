// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/CatchPokemonGlobalSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.CatchPokemonGlobalSettings}
 */
public final class CatchPokemonGlobalSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.CatchPokemonGlobalSettings)
    CatchPokemonGlobalSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CatchPokemonGlobalSettings.newBuilder() to construct.
  private CatchPokemonGlobalSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CatchPokemonGlobalSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CatchPokemonGlobalSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CatchPokemonGlobalSettings(
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

            enableCaptureOriginDetailsDisplay_ = input.readBool();
            break;
          }
          case 16: {

            enableCaptureOriginEventsDisplay_ = input.readBool();
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
    return POGOProtos.Settings.CatchPokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CatchPokemonGlobalSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.CatchPokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CatchPokemonGlobalSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.CatchPokemonGlobalSettings.class, POGOProtos.Settings.CatchPokemonGlobalSettings.Builder.class);
  }

  public static final int ENABLE_CAPTURE_ORIGIN_DETAILS_DISPLAY_FIELD_NUMBER = 1;
  private boolean enableCaptureOriginDetailsDisplay_;
  /**
   * <code>bool enable_capture_origin_details_display = 1;</code>
   * @return The enableCaptureOriginDetailsDisplay.
   */
  @java.lang.Override
  public boolean getEnableCaptureOriginDetailsDisplay() {
    return enableCaptureOriginDetailsDisplay_;
  }

  public static final int ENABLE_CAPTURE_ORIGIN_EVENTS_DISPLAY_FIELD_NUMBER = 2;
  private boolean enableCaptureOriginEventsDisplay_;
  /**
   * <code>bool enable_capture_origin_events_display = 2;</code>
   * @return The enableCaptureOriginEventsDisplay.
   */
  @java.lang.Override
  public boolean getEnableCaptureOriginEventsDisplay() {
    return enableCaptureOriginEventsDisplay_;
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
    if (enableCaptureOriginDetailsDisplay_ != false) {
      output.writeBool(1, enableCaptureOriginDetailsDisplay_);
    }
    if (enableCaptureOriginEventsDisplay_ != false) {
      output.writeBool(2, enableCaptureOriginEventsDisplay_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableCaptureOriginDetailsDisplay_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableCaptureOriginDetailsDisplay_);
    }
    if (enableCaptureOriginEventsDisplay_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, enableCaptureOriginEventsDisplay_);
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
    if (!(obj instanceof POGOProtos.Settings.CatchPokemonGlobalSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.CatchPokemonGlobalSettings other = (POGOProtos.Settings.CatchPokemonGlobalSettings) obj;

    if (getEnableCaptureOriginDetailsDisplay()
        != other.getEnableCaptureOriginDetailsDisplay()) return false;
    if (getEnableCaptureOriginEventsDisplay()
        != other.getEnableCaptureOriginEventsDisplay()) return false;
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
    hash = (37 * hash) + ENABLE_CAPTURE_ORIGIN_DETAILS_DISPLAY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableCaptureOriginDetailsDisplay());
    hash = (37 * hash) + ENABLE_CAPTURE_ORIGIN_EVENTS_DISPLAY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableCaptureOriginEventsDisplay());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.CatchPokemonGlobalSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.CatchPokemonGlobalSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.CatchPokemonGlobalSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.CatchPokemonGlobalSettings)
      POGOProtos.Settings.CatchPokemonGlobalSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.CatchPokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CatchPokemonGlobalSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.CatchPokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CatchPokemonGlobalSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.CatchPokemonGlobalSettings.class, POGOProtos.Settings.CatchPokemonGlobalSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.CatchPokemonGlobalSettings.newBuilder()
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
      enableCaptureOriginDetailsDisplay_ = false;

      enableCaptureOriginEventsDisplay_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.CatchPokemonGlobalSettingsOuterClass.internal_static_POGOProtos_Settings_CatchPokemonGlobalSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.CatchPokemonGlobalSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.CatchPokemonGlobalSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.CatchPokemonGlobalSettings build() {
      POGOProtos.Settings.CatchPokemonGlobalSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.CatchPokemonGlobalSettings buildPartial() {
      POGOProtos.Settings.CatchPokemonGlobalSettings result = new POGOProtos.Settings.CatchPokemonGlobalSettings(this);
      result.enableCaptureOriginDetailsDisplay_ = enableCaptureOriginDetailsDisplay_;
      result.enableCaptureOriginEventsDisplay_ = enableCaptureOriginEventsDisplay_;
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
      if (other instanceof POGOProtos.Settings.CatchPokemonGlobalSettings) {
        return mergeFrom((POGOProtos.Settings.CatchPokemonGlobalSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.CatchPokemonGlobalSettings other) {
      if (other == POGOProtos.Settings.CatchPokemonGlobalSettings.getDefaultInstance()) return this;
      if (other.getEnableCaptureOriginDetailsDisplay() != false) {
        setEnableCaptureOriginDetailsDisplay(other.getEnableCaptureOriginDetailsDisplay());
      }
      if (other.getEnableCaptureOriginEventsDisplay() != false) {
        setEnableCaptureOriginEventsDisplay(other.getEnableCaptureOriginEventsDisplay());
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
      POGOProtos.Settings.CatchPokemonGlobalSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.CatchPokemonGlobalSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableCaptureOriginDetailsDisplay_ ;
    /**
     * <code>bool enable_capture_origin_details_display = 1;</code>
     * @return The enableCaptureOriginDetailsDisplay.
     */
    @java.lang.Override
    public boolean getEnableCaptureOriginDetailsDisplay() {
      return enableCaptureOriginDetailsDisplay_;
    }
    /**
     * <code>bool enable_capture_origin_details_display = 1;</code>
     * @param value The enableCaptureOriginDetailsDisplay to set.
     * @return This builder for chaining.
     */
    public Builder setEnableCaptureOriginDetailsDisplay(boolean value) {
      
      enableCaptureOriginDetailsDisplay_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_capture_origin_details_display = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableCaptureOriginDetailsDisplay() {
      
      enableCaptureOriginDetailsDisplay_ = false;
      onChanged();
      return this;
    }

    private boolean enableCaptureOriginEventsDisplay_ ;
    /**
     * <code>bool enable_capture_origin_events_display = 2;</code>
     * @return The enableCaptureOriginEventsDisplay.
     */
    @java.lang.Override
    public boolean getEnableCaptureOriginEventsDisplay() {
      return enableCaptureOriginEventsDisplay_;
    }
    /**
     * <code>bool enable_capture_origin_events_display = 2;</code>
     * @param value The enableCaptureOriginEventsDisplay to set.
     * @return This builder for chaining.
     */
    public Builder setEnableCaptureOriginEventsDisplay(boolean value) {
      
      enableCaptureOriginEventsDisplay_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_capture_origin_events_display = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableCaptureOriginEventsDisplay() {
      
      enableCaptureOriginEventsDisplay_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.CatchPokemonGlobalSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.CatchPokemonGlobalSettings)
  private static final POGOProtos.Settings.CatchPokemonGlobalSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.CatchPokemonGlobalSettings();
  }

  public static POGOProtos.Settings.CatchPokemonGlobalSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CatchPokemonGlobalSettings>
      PARSER = new com.google.protobuf.AbstractParser<CatchPokemonGlobalSettings>() {
    @java.lang.Override
    public CatchPokemonGlobalSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CatchPokemonGlobalSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CatchPokemonGlobalSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CatchPokemonGlobalSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.CatchPokemonGlobalSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

