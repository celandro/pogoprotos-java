// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/BackgroundModeClientSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.BackgroundModeClientSettings}
 */
public final class BackgroundModeClientSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.BackgroundModeClientSettings)
    BackgroundModeClientSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BackgroundModeClientSettings.newBuilder() to construct.
  private BackgroundModeClientSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackgroundModeClientSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BackgroundModeClientSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BackgroundModeClientSettings(
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

            maximumSampleAgeMs_ = input.readInt64();
            break;
          }
          case 16: {

            acceptManualFitnessSamples_ = input.readBool();
            break;
          }
          case 25: {

            minimumLocationAccuracyMeters_ = input.readDouble();
            break;
          }
          case 32: {

            backgroundWakeUpIntervalMinutes_ = input.readInt32();
            break;
          }
          case 40: {

            maxUploadSizeInBytes_ = input.readInt32();
            break;
          }
          case 49: {

            minEnclosingGeofenceRadiusM_ = input.readDouble();
            break;
          }
          case 56: {

            backgroundTokenRefreshIntervalS_ = input.readInt64();
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
    return POGOProtos.Settings.BackgroundModeClientSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeClientSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.BackgroundModeClientSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeClientSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.BackgroundModeClientSettings.class, POGOProtos.Settings.BackgroundModeClientSettings.Builder.class);
  }

  public static final int MAXIMUM_SAMPLE_AGE_MS_FIELD_NUMBER = 1;
  private long maximumSampleAgeMs_;
  /**
   * <code>int64 maximum_sample_age_ms = 1;</code>
   * @return The maximumSampleAgeMs.
   */
  @java.lang.Override
  public long getMaximumSampleAgeMs() {
    return maximumSampleAgeMs_;
  }

  public static final int ACCEPT_MANUAL_FITNESS_SAMPLES_FIELD_NUMBER = 2;
  private boolean acceptManualFitnessSamples_;
  /**
   * <code>bool accept_manual_fitness_samples = 2;</code>
   * @return The acceptManualFitnessSamples.
   */
  @java.lang.Override
  public boolean getAcceptManualFitnessSamples() {
    return acceptManualFitnessSamples_;
  }

  public static final int MINIMUM_LOCATION_ACCURACY_METERS_FIELD_NUMBER = 3;
  private double minimumLocationAccuracyMeters_;
  /**
   * <code>double minimum_location_accuracy_meters = 3;</code>
   * @return The minimumLocationAccuracyMeters.
   */
  @java.lang.Override
  public double getMinimumLocationAccuracyMeters() {
    return minimumLocationAccuracyMeters_;
  }

  public static final int BACKGROUND_WAKE_UP_INTERVAL_MINUTES_FIELD_NUMBER = 4;
  private int backgroundWakeUpIntervalMinutes_;
  /**
   * <code>int32 background_wake_up_interval_minutes = 4;</code>
   * @return The backgroundWakeUpIntervalMinutes.
   */
  @java.lang.Override
  public int getBackgroundWakeUpIntervalMinutes() {
    return backgroundWakeUpIntervalMinutes_;
  }

  public static final int MAX_UPLOAD_SIZE_IN_BYTES_FIELD_NUMBER = 5;
  private int maxUploadSizeInBytes_;
  /**
   * <code>int32 max_upload_size_in_bytes = 5;</code>
   * @return The maxUploadSizeInBytes.
   */
  @java.lang.Override
  public int getMaxUploadSizeInBytes() {
    return maxUploadSizeInBytes_;
  }

  public static final int MIN_ENCLOSING_GEOFENCE_RADIUS_M_FIELD_NUMBER = 6;
  private double minEnclosingGeofenceRadiusM_;
  /**
   * <code>double min_enclosing_geofence_radius_m = 6;</code>
   * @return The minEnclosingGeofenceRadiusM.
   */
  @java.lang.Override
  public double getMinEnclosingGeofenceRadiusM() {
    return minEnclosingGeofenceRadiusM_;
  }

  public static final int BACKGROUND_TOKEN_REFRESH_INTERVAL_S_FIELD_NUMBER = 7;
  private long backgroundTokenRefreshIntervalS_;
  /**
   * <code>int64 background_token_refresh_interval_s = 7;</code>
   * @return The backgroundTokenRefreshIntervalS.
   */
  @java.lang.Override
  public long getBackgroundTokenRefreshIntervalS() {
    return backgroundTokenRefreshIntervalS_;
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
    if (maximumSampleAgeMs_ != 0L) {
      output.writeInt64(1, maximumSampleAgeMs_);
    }
    if (acceptManualFitnessSamples_ != false) {
      output.writeBool(2, acceptManualFitnessSamples_);
    }
    if (minimumLocationAccuracyMeters_ != 0D) {
      output.writeDouble(3, minimumLocationAccuracyMeters_);
    }
    if (backgroundWakeUpIntervalMinutes_ != 0) {
      output.writeInt32(4, backgroundWakeUpIntervalMinutes_);
    }
    if (maxUploadSizeInBytes_ != 0) {
      output.writeInt32(5, maxUploadSizeInBytes_);
    }
    if (minEnclosingGeofenceRadiusM_ != 0D) {
      output.writeDouble(6, minEnclosingGeofenceRadiusM_);
    }
    if (backgroundTokenRefreshIntervalS_ != 0L) {
      output.writeInt64(7, backgroundTokenRefreshIntervalS_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maximumSampleAgeMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, maximumSampleAgeMs_);
    }
    if (acceptManualFitnessSamples_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, acceptManualFitnessSamples_);
    }
    if (minimumLocationAccuracyMeters_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, minimumLocationAccuracyMeters_);
    }
    if (backgroundWakeUpIntervalMinutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, backgroundWakeUpIntervalMinutes_);
    }
    if (maxUploadSizeInBytes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, maxUploadSizeInBytes_);
    }
    if (minEnclosingGeofenceRadiusM_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, minEnclosingGeofenceRadiusM_);
    }
    if (backgroundTokenRefreshIntervalS_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, backgroundTokenRefreshIntervalS_);
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
    if (!(obj instanceof POGOProtos.Settings.BackgroundModeClientSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.BackgroundModeClientSettings other = (POGOProtos.Settings.BackgroundModeClientSettings) obj;

    if (getMaximumSampleAgeMs()
        != other.getMaximumSampleAgeMs()) return false;
    if (getAcceptManualFitnessSamples()
        != other.getAcceptManualFitnessSamples()) return false;
    if (java.lang.Double.doubleToLongBits(getMinimumLocationAccuracyMeters())
        != java.lang.Double.doubleToLongBits(
            other.getMinimumLocationAccuracyMeters())) return false;
    if (getBackgroundWakeUpIntervalMinutes()
        != other.getBackgroundWakeUpIntervalMinutes()) return false;
    if (getMaxUploadSizeInBytes()
        != other.getMaxUploadSizeInBytes()) return false;
    if (java.lang.Double.doubleToLongBits(getMinEnclosingGeofenceRadiusM())
        != java.lang.Double.doubleToLongBits(
            other.getMinEnclosingGeofenceRadiusM())) return false;
    if (getBackgroundTokenRefreshIntervalS()
        != other.getBackgroundTokenRefreshIntervalS()) return false;
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
    hash = (37 * hash) + MAXIMUM_SAMPLE_AGE_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaximumSampleAgeMs());
    hash = (37 * hash) + ACCEPT_MANUAL_FITNESS_SAMPLES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAcceptManualFitnessSamples());
    hash = (37 * hash) + MINIMUM_LOCATION_ACCURACY_METERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMinimumLocationAccuracyMeters()));
    hash = (37 * hash) + BACKGROUND_WAKE_UP_INTERVAL_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + getBackgroundWakeUpIntervalMinutes();
    hash = (37 * hash) + MAX_UPLOAD_SIZE_IN_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxUploadSizeInBytes();
    hash = (37 * hash) + MIN_ENCLOSING_GEOFENCE_RADIUS_M_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMinEnclosingGeofenceRadiusM()));
    hash = (37 * hash) + BACKGROUND_TOKEN_REFRESH_INTERVAL_S_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBackgroundTokenRefreshIntervalS());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.BackgroundModeClientSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.BackgroundModeClientSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.BackgroundModeClientSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.BackgroundModeClientSettings)
      POGOProtos.Settings.BackgroundModeClientSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.BackgroundModeClientSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeClientSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.BackgroundModeClientSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeClientSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.BackgroundModeClientSettings.class, POGOProtos.Settings.BackgroundModeClientSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.BackgroundModeClientSettings.newBuilder()
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
      maximumSampleAgeMs_ = 0L;

      acceptManualFitnessSamples_ = false;

      minimumLocationAccuracyMeters_ = 0D;

      backgroundWakeUpIntervalMinutes_ = 0;

      maxUploadSizeInBytes_ = 0;

      minEnclosingGeofenceRadiusM_ = 0D;

      backgroundTokenRefreshIntervalS_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.BackgroundModeClientSettingsOuterClass.internal_static_POGOProtos_Settings_BackgroundModeClientSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.BackgroundModeClientSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.BackgroundModeClientSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.BackgroundModeClientSettings build() {
      POGOProtos.Settings.BackgroundModeClientSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.BackgroundModeClientSettings buildPartial() {
      POGOProtos.Settings.BackgroundModeClientSettings result = new POGOProtos.Settings.BackgroundModeClientSettings(this);
      result.maximumSampleAgeMs_ = maximumSampleAgeMs_;
      result.acceptManualFitnessSamples_ = acceptManualFitnessSamples_;
      result.minimumLocationAccuracyMeters_ = minimumLocationAccuracyMeters_;
      result.backgroundWakeUpIntervalMinutes_ = backgroundWakeUpIntervalMinutes_;
      result.maxUploadSizeInBytes_ = maxUploadSizeInBytes_;
      result.minEnclosingGeofenceRadiusM_ = minEnclosingGeofenceRadiusM_;
      result.backgroundTokenRefreshIntervalS_ = backgroundTokenRefreshIntervalS_;
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
      if (other instanceof POGOProtos.Settings.BackgroundModeClientSettings) {
        return mergeFrom((POGOProtos.Settings.BackgroundModeClientSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.BackgroundModeClientSettings other) {
      if (other == POGOProtos.Settings.BackgroundModeClientSettings.getDefaultInstance()) return this;
      if (other.getMaximumSampleAgeMs() != 0L) {
        setMaximumSampleAgeMs(other.getMaximumSampleAgeMs());
      }
      if (other.getAcceptManualFitnessSamples() != false) {
        setAcceptManualFitnessSamples(other.getAcceptManualFitnessSamples());
      }
      if (other.getMinimumLocationAccuracyMeters() != 0D) {
        setMinimumLocationAccuracyMeters(other.getMinimumLocationAccuracyMeters());
      }
      if (other.getBackgroundWakeUpIntervalMinutes() != 0) {
        setBackgroundWakeUpIntervalMinutes(other.getBackgroundWakeUpIntervalMinutes());
      }
      if (other.getMaxUploadSizeInBytes() != 0) {
        setMaxUploadSizeInBytes(other.getMaxUploadSizeInBytes());
      }
      if (other.getMinEnclosingGeofenceRadiusM() != 0D) {
        setMinEnclosingGeofenceRadiusM(other.getMinEnclosingGeofenceRadiusM());
      }
      if (other.getBackgroundTokenRefreshIntervalS() != 0L) {
        setBackgroundTokenRefreshIntervalS(other.getBackgroundTokenRefreshIntervalS());
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
      POGOProtos.Settings.BackgroundModeClientSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.BackgroundModeClientSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long maximumSampleAgeMs_ ;
    /**
     * <code>int64 maximum_sample_age_ms = 1;</code>
     * @return The maximumSampleAgeMs.
     */
    @java.lang.Override
    public long getMaximumSampleAgeMs() {
      return maximumSampleAgeMs_;
    }
    /**
     * <code>int64 maximum_sample_age_ms = 1;</code>
     * @param value The maximumSampleAgeMs to set.
     * @return This builder for chaining.
     */
    public Builder setMaximumSampleAgeMs(long value) {
      
      maximumSampleAgeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 maximum_sample_age_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaximumSampleAgeMs() {
      
      maximumSampleAgeMs_ = 0L;
      onChanged();
      return this;
    }

    private boolean acceptManualFitnessSamples_ ;
    /**
     * <code>bool accept_manual_fitness_samples = 2;</code>
     * @return The acceptManualFitnessSamples.
     */
    @java.lang.Override
    public boolean getAcceptManualFitnessSamples() {
      return acceptManualFitnessSamples_;
    }
    /**
     * <code>bool accept_manual_fitness_samples = 2;</code>
     * @param value The acceptManualFitnessSamples to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptManualFitnessSamples(boolean value) {
      
      acceptManualFitnessSamples_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool accept_manual_fitness_samples = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceptManualFitnessSamples() {
      
      acceptManualFitnessSamples_ = false;
      onChanged();
      return this;
    }

    private double minimumLocationAccuracyMeters_ ;
    /**
     * <code>double minimum_location_accuracy_meters = 3;</code>
     * @return The minimumLocationAccuracyMeters.
     */
    @java.lang.Override
    public double getMinimumLocationAccuracyMeters() {
      return minimumLocationAccuracyMeters_;
    }
    /**
     * <code>double minimum_location_accuracy_meters = 3;</code>
     * @param value The minimumLocationAccuracyMeters to set.
     * @return This builder for chaining.
     */
    public Builder setMinimumLocationAccuracyMeters(double value) {
      
      minimumLocationAccuracyMeters_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double minimum_location_accuracy_meters = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinimumLocationAccuracyMeters() {
      
      minimumLocationAccuracyMeters_ = 0D;
      onChanged();
      return this;
    }

    private int backgroundWakeUpIntervalMinutes_ ;
    /**
     * <code>int32 background_wake_up_interval_minutes = 4;</code>
     * @return The backgroundWakeUpIntervalMinutes.
     */
    @java.lang.Override
    public int getBackgroundWakeUpIntervalMinutes() {
      return backgroundWakeUpIntervalMinutes_;
    }
    /**
     * <code>int32 background_wake_up_interval_minutes = 4;</code>
     * @param value The backgroundWakeUpIntervalMinutes to set.
     * @return This builder for chaining.
     */
    public Builder setBackgroundWakeUpIntervalMinutes(int value) {
      
      backgroundWakeUpIntervalMinutes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 background_wake_up_interval_minutes = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBackgroundWakeUpIntervalMinutes() {
      
      backgroundWakeUpIntervalMinutes_ = 0;
      onChanged();
      return this;
    }

    private int maxUploadSizeInBytes_ ;
    /**
     * <code>int32 max_upload_size_in_bytes = 5;</code>
     * @return The maxUploadSizeInBytes.
     */
    @java.lang.Override
    public int getMaxUploadSizeInBytes() {
      return maxUploadSizeInBytes_;
    }
    /**
     * <code>int32 max_upload_size_in_bytes = 5;</code>
     * @param value The maxUploadSizeInBytes to set.
     * @return This builder for chaining.
     */
    public Builder setMaxUploadSizeInBytes(int value) {
      
      maxUploadSizeInBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_upload_size_in_bytes = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxUploadSizeInBytes() {
      
      maxUploadSizeInBytes_ = 0;
      onChanged();
      return this;
    }

    private double minEnclosingGeofenceRadiusM_ ;
    /**
     * <code>double min_enclosing_geofence_radius_m = 6;</code>
     * @return The minEnclosingGeofenceRadiusM.
     */
    @java.lang.Override
    public double getMinEnclosingGeofenceRadiusM() {
      return minEnclosingGeofenceRadiusM_;
    }
    /**
     * <code>double min_enclosing_geofence_radius_m = 6;</code>
     * @param value The minEnclosingGeofenceRadiusM to set.
     * @return This builder for chaining.
     */
    public Builder setMinEnclosingGeofenceRadiusM(double value) {
      
      minEnclosingGeofenceRadiusM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double min_enclosing_geofence_radius_m = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinEnclosingGeofenceRadiusM() {
      
      minEnclosingGeofenceRadiusM_ = 0D;
      onChanged();
      return this;
    }

    private long backgroundTokenRefreshIntervalS_ ;
    /**
     * <code>int64 background_token_refresh_interval_s = 7;</code>
     * @return The backgroundTokenRefreshIntervalS.
     */
    @java.lang.Override
    public long getBackgroundTokenRefreshIntervalS() {
      return backgroundTokenRefreshIntervalS_;
    }
    /**
     * <code>int64 background_token_refresh_interval_s = 7;</code>
     * @param value The backgroundTokenRefreshIntervalS to set.
     * @return This builder for chaining.
     */
    public Builder setBackgroundTokenRefreshIntervalS(long value) {
      
      backgroundTokenRefreshIntervalS_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 background_token_refresh_interval_s = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearBackgroundTokenRefreshIntervalS() {
      
      backgroundTokenRefreshIntervalS_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.BackgroundModeClientSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.BackgroundModeClientSettings)
  private static final POGOProtos.Settings.BackgroundModeClientSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.BackgroundModeClientSettings();
  }

  public static POGOProtos.Settings.BackgroundModeClientSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackgroundModeClientSettings>
      PARSER = new com.google.protobuf.AbstractParser<BackgroundModeClientSettings>() {
    @java.lang.Override
    public BackgroundModeClientSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BackgroundModeClientSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BackgroundModeClientSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackgroundModeClientSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.BackgroundModeClientSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

