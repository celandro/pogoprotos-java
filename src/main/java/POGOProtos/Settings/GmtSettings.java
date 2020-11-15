// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/GmtSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.GmtSettings}
 */
public final class GmtSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.GmtSettings)
    GmtSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GmtSettings.newBuilder() to construct.
  private GmtSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GmtSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GmtSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GmtSettings(
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

            enableGmtdownloadV2_ = input.readBool();
            break;
          }
          case 16: {

            downloadPollPeriodMs_ = input.readInt32();
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
    return POGOProtos.Settings.GmtSettingsOuterClass.internal_static_POGOProtos_Settings_GmtSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.GmtSettingsOuterClass.internal_static_POGOProtos_Settings_GmtSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.GmtSettings.class, POGOProtos.Settings.GmtSettings.Builder.class);
  }

  public static final int ENABLE_GMTDOWNLOAD_V2_FIELD_NUMBER = 1;
  private boolean enableGmtdownloadV2_;
  /**
   * <code>bool enable_gmtdownload_v2 = 1;</code>
   * @return The enableGmtdownloadV2.
   */
  @java.lang.Override
  public boolean getEnableGmtdownloadV2() {
    return enableGmtdownloadV2_;
  }

  public static final int DOWNLOAD_POLL_PERIOD_MS_FIELD_NUMBER = 2;
  private int downloadPollPeriodMs_;
  /**
   * <code>int32 download_poll_period_ms = 2;</code>
   * @return The downloadPollPeriodMs.
   */
  @java.lang.Override
  public int getDownloadPollPeriodMs() {
    return downloadPollPeriodMs_;
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
    if (enableGmtdownloadV2_ != false) {
      output.writeBool(1, enableGmtdownloadV2_);
    }
    if (downloadPollPeriodMs_ != 0) {
      output.writeInt32(2, downloadPollPeriodMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableGmtdownloadV2_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableGmtdownloadV2_);
    }
    if (downloadPollPeriodMs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, downloadPollPeriodMs_);
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
    if (!(obj instanceof POGOProtos.Settings.GmtSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.GmtSettings other = (POGOProtos.Settings.GmtSettings) obj;

    if (getEnableGmtdownloadV2()
        != other.getEnableGmtdownloadV2()) return false;
    if (getDownloadPollPeriodMs()
        != other.getDownloadPollPeriodMs()) return false;
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
    hash = (37 * hash) + ENABLE_GMTDOWNLOAD_V2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableGmtdownloadV2());
    hash = (37 * hash) + DOWNLOAD_POLL_PERIOD_MS_FIELD_NUMBER;
    hash = (53 * hash) + getDownloadPollPeriodMs();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.GmtSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.GmtSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.GmtSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.GmtSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.GmtSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.GmtSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.GmtSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.GmtSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.GmtSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.GmtSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.GmtSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.GmtSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.GmtSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.GmtSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.GmtSettings)
      POGOProtos.Settings.GmtSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.GmtSettingsOuterClass.internal_static_POGOProtos_Settings_GmtSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.GmtSettingsOuterClass.internal_static_POGOProtos_Settings_GmtSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.GmtSettings.class, POGOProtos.Settings.GmtSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.GmtSettings.newBuilder()
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
      enableGmtdownloadV2_ = false;

      downloadPollPeriodMs_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.GmtSettingsOuterClass.internal_static_POGOProtos_Settings_GmtSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.GmtSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.GmtSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.GmtSettings build() {
      POGOProtos.Settings.GmtSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.GmtSettings buildPartial() {
      POGOProtos.Settings.GmtSettings result = new POGOProtos.Settings.GmtSettings(this);
      result.enableGmtdownloadV2_ = enableGmtdownloadV2_;
      result.downloadPollPeriodMs_ = downloadPollPeriodMs_;
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
      if (other instanceof POGOProtos.Settings.GmtSettings) {
        return mergeFrom((POGOProtos.Settings.GmtSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.GmtSettings other) {
      if (other == POGOProtos.Settings.GmtSettings.getDefaultInstance()) return this;
      if (other.getEnableGmtdownloadV2() != false) {
        setEnableGmtdownloadV2(other.getEnableGmtdownloadV2());
      }
      if (other.getDownloadPollPeriodMs() != 0) {
        setDownloadPollPeriodMs(other.getDownloadPollPeriodMs());
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
      POGOProtos.Settings.GmtSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.GmtSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableGmtdownloadV2_ ;
    /**
     * <code>bool enable_gmtdownload_v2 = 1;</code>
     * @return The enableGmtdownloadV2.
     */
    @java.lang.Override
    public boolean getEnableGmtdownloadV2() {
      return enableGmtdownloadV2_;
    }
    /**
     * <code>bool enable_gmtdownload_v2 = 1;</code>
     * @param value The enableGmtdownloadV2 to set.
     * @return This builder for chaining.
     */
    public Builder setEnableGmtdownloadV2(boolean value) {
      
      enableGmtdownloadV2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_gmtdownload_v2 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableGmtdownloadV2() {
      
      enableGmtdownloadV2_ = false;
      onChanged();
      return this;
    }

    private int downloadPollPeriodMs_ ;
    /**
     * <code>int32 download_poll_period_ms = 2;</code>
     * @return The downloadPollPeriodMs.
     */
    @java.lang.Override
    public int getDownloadPollPeriodMs() {
      return downloadPollPeriodMs_;
    }
    /**
     * <code>int32 download_poll_period_ms = 2;</code>
     * @param value The downloadPollPeriodMs to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadPollPeriodMs(int value) {
      
      downloadPollPeriodMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 download_poll_period_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDownloadPollPeriodMs() {
      
      downloadPollPeriodMs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.GmtSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.GmtSettings)
  private static final POGOProtos.Settings.GmtSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.GmtSettings();
  }

  public static POGOProtos.Settings.GmtSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GmtSettings>
      PARSER = new com.google.protobuf.AbstractParser<GmtSettings>() {
    @java.lang.Override
    public GmtSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GmtSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GmtSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GmtSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.GmtSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

