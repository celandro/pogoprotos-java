// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/ArTelemetrySettings.proto

package POGOProtos.Settings.Master;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.ArTelemetrySettings}
 */
public final class ArTelemetrySettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.ArTelemetrySettings)
    ArTelemetrySettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArTelemetrySettings.newBuilder() to construct.
  private ArTelemetrySettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArTelemetrySettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ArTelemetrySettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ArTelemetrySettings(
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

            measureBattery_ = input.readBool();
            break;
          }
          case 16: {

            batterySamplingIntervalMs_ = input.readInt32();
            break;
          }
          case 24: {

            measureProcessor_ = input.readBool();
            break;
          }
          case 32: {

            processorSamplingIntervalMs_ = input.readInt32();
            break;
          }
          case 40: {

            measureFramerate_ = input.readBool();
            break;
          }
          case 48: {

            framerateSamplingIntervalMs_ = input.readInt32();
            break;
          }
          case 61: {

            percentageSessionsToSample_ = input.readFloat();
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
    return POGOProtos.Settings.Master.ArTelemetrySettingsOuterClass.internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.ArTelemetrySettingsOuterClass.internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.ArTelemetrySettings.class, POGOProtos.Settings.Master.ArTelemetrySettings.Builder.class);
  }

  public static final int MEASURE_BATTERY_FIELD_NUMBER = 1;
  private boolean measureBattery_;
  /**
   * <code>bool measure_battery = 1;</code>
   * @return The measureBattery.
   */
  @java.lang.Override
  public boolean getMeasureBattery() {
    return measureBattery_;
  }

  public static final int BATTERY_SAMPLING_INTERVAL_MS_FIELD_NUMBER = 2;
  private int batterySamplingIntervalMs_;
  /**
   * <code>int32 battery_sampling_interval_ms = 2;</code>
   * @return The batterySamplingIntervalMs.
   */
  @java.lang.Override
  public int getBatterySamplingIntervalMs() {
    return batterySamplingIntervalMs_;
  }

  public static final int MEASURE_PROCESSOR_FIELD_NUMBER = 3;
  private boolean measureProcessor_;
  /**
   * <code>bool measure_processor = 3;</code>
   * @return The measureProcessor.
   */
  @java.lang.Override
  public boolean getMeasureProcessor() {
    return measureProcessor_;
  }

  public static final int PROCESSOR_SAMPLING_INTERVAL_MS_FIELD_NUMBER = 4;
  private int processorSamplingIntervalMs_;
  /**
   * <code>int32 processor_sampling_interval_ms = 4;</code>
   * @return The processorSamplingIntervalMs.
   */
  @java.lang.Override
  public int getProcessorSamplingIntervalMs() {
    return processorSamplingIntervalMs_;
  }

  public static final int MEASURE_FRAMERATE_FIELD_NUMBER = 5;
  private boolean measureFramerate_;
  /**
   * <code>bool measure_framerate = 5;</code>
   * @return The measureFramerate.
   */
  @java.lang.Override
  public boolean getMeasureFramerate() {
    return measureFramerate_;
  }

  public static final int FRAMERATE_SAMPLING_INTERVAL_MS_FIELD_NUMBER = 6;
  private int framerateSamplingIntervalMs_;
  /**
   * <code>int32 framerate_sampling_interval_ms = 6;</code>
   * @return The framerateSamplingIntervalMs.
   */
  @java.lang.Override
  public int getFramerateSamplingIntervalMs() {
    return framerateSamplingIntervalMs_;
  }

  public static final int PERCENTAGE_SESSIONS_TO_SAMPLE_FIELD_NUMBER = 7;
  private float percentageSessionsToSample_;
  /**
   * <code>float percentage_sessions_to_sample = 7;</code>
   * @return The percentageSessionsToSample.
   */
  @java.lang.Override
  public float getPercentageSessionsToSample() {
    return percentageSessionsToSample_;
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
    if (measureBattery_ != false) {
      output.writeBool(1, measureBattery_);
    }
    if (batterySamplingIntervalMs_ != 0) {
      output.writeInt32(2, batterySamplingIntervalMs_);
    }
    if (measureProcessor_ != false) {
      output.writeBool(3, measureProcessor_);
    }
    if (processorSamplingIntervalMs_ != 0) {
      output.writeInt32(4, processorSamplingIntervalMs_);
    }
    if (measureFramerate_ != false) {
      output.writeBool(5, measureFramerate_);
    }
    if (framerateSamplingIntervalMs_ != 0) {
      output.writeInt32(6, framerateSamplingIntervalMs_);
    }
    if (percentageSessionsToSample_ != 0F) {
      output.writeFloat(7, percentageSessionsToSample_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (measureBattery_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, measureBattery_);
    }
    if (batterySamplingIntervalMs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, batterySamplingIntervalMs_);
    }
    if (measureProcessor_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, measureProcessor_);
    }
    if (processorSamplingIntervalMs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, processorSamplingIntervalMs_);
    }
    if (measureFramerate_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, measureFramerate_);
    }
    if (framerateSamplingIntervalMs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, framerateSamplingIntervalMs_);
    }
    if (percentageSessionsToSample_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, percentageSessionsToSample_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.ArTelemetrySettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.ArTelemetrySettings other = (POGOProtos.Settings.Master.ArTelemetrySettings) obj;

    if (getMeasureBattery()
        != other.getMeasureBattery()) return false;
    if (getBatterySamplingIntervalMs()
        != other.getBatterySamplingIntervalMs()) return false;
    if (getMeasureProcessor()
        != other.getMeasureProcessor()) return false;
    if (getProcessorSamplingIntervalMs()
        != other.getProcessorSamplingIntervalMs()) return false;
    if (getMeasureFramerate()
        != other.getMeasureFramerate()) return false;
    if (getFramerateSamplingIntervalMs()
        != other.getFramerateSamplingIntervalMs()) return false;
    if (java.lang.Float.floatToIntBits(getPercentageSessionsToSample())
        != java.lang.Float.floatToIntBits(
            other.getPercentageSessionsToSample())) return false;
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
    hash = (37 * hash) + MEASURE_BATTERY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMeasureBattery());
    hash = (37 * hash) + BATTERY_SAMPLING_INTERVAL_MS_FIELD_NUMBER;
    hash = (53 * hash) + getBatterySamplingIntervalMs();
    hash = (37 * hash) + MEASURE_PROCESSOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMeasureProcessor());
    hash = (37 * hash) + PROCESSOR_SAMPLING_INTERVAL_MS_FIELD_NUMBER;
    hash = (53 * hash) + getProcessorSamplingIntervalMs();
    hash = (37 * hash) + MEASURE_FRAMERATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMeasureFramerate());
    hash = (37 * hash) + FRAMERATE_SAMPLING_INTERVAL_MS_FIELD_NUMBER;
    hash = (53 * hash) + getFramerateSamplingIntervalMs();
    hash = (37 * hash) + PERCENTAGE_SESSIONS_TO_SAMPLE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPercentageSessionsToSample());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.ArTelemetrySettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.ArTelemetrySettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.ArTelemetrySettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.ArTelemetrySettings)
      POGOProtos.Settings.Master.ArTelemetrySettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.ArTelemetrySettingsOuterClass.internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.ArTelemetrySettingsOuterClass.internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.ArTelemetrySettings.class, POGOProtos.Settings.Master.ArTelemetrySettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.ArTelemetrySettings.newBuilder()
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
      measureBattery_ = false;

      batterySamplingIntervalMs_ = 0;

      measureProcessor_ = false;

      processorSamplingIntervalMs_ = 0;

      measureFramerate_ = false;

      framerateSamplingIntervalMs_ = 0;

      percentageSessionsToSample_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.ArTelemetrySettingsOuterClass.internal_static_POGOProtos_Settings_Master_ArTelemetrySettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.ArTelemetrySettings getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.ArTelemetrySettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.ArTelemetrySettings build() {
      POGOProtos.Settings.Master.ArTelemetrySettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.ArTelemetrySettings buildPartial() {
      POGOProtos.Settings.Master.ArTelemetrySettings result = new POGOProtos.Settings.Master.ArTelemetrySettings(this);
      result.measureBattery_ = measureBattery_;
      result.batterySamplingIntervalMs_ = batterySamplingIntervalMs_;
      result.measureProcessor_ = measureProcessor_;
      result.processorSamplingIntervalMs_ = processorSamplingIntervalMs_;
      result.measureFramerate_ = measureFramerate_;
      result.framerateSamplingIntervalMs_ = framerateSamplingIntervalMs_;
      result.percentageSessionsToSample_ = percentageSessionsToSample_;
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
      if (other instanceof POGOProtos.Settings.Master.ArTelemetrySettings) {
        return mergeFrom((POGOProtos.Settings.Master.ArTelemetrySettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.ArTelemetrySettings other) {
      if (other == POGOProtos.Settings.Master.ArTelemetrySettings.getDefaultInstance()) return this;
      if (other.getMeasureBattery() != false) {
        setMeasureBattery(other.getMeasureBattery());
      }
      if (other.getBatterySamplingIntervalMs() != 0) {
        setBatterySamplingIntervalMs(other.getBatterySamplingIntervalMs());
      }
      if (other.getMeasureProcessor() != false) {
        setMeasureProcessor(other.getMeasureProcessor());
      }
      if (other.getProcessorSamplingIntervalMs() != 0) {
        setProcessorSamplingIntervalMs(other.getProcessorSamplingIntervalMs());
      }
      if (other.getMeasureFramerate() != false) {
        setMeasureFramerate(other.getMeasureFramerate());
      }
      if (other.getFramerateSamplingIntervalMs() != 0) {
        setFramerateSamplingIntervalMs(other.getFramerateSamplingIntervalMs());
      }
      if (other.getPercentageSessionsToSample() != 0F) {
        setPercentageSessionsToSample(other.getPercentageSessionsToSample());
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
      POGOProtos.Settings.Master.ArTelemetrySettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.ArTelemetrySettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean measureBattery_ ;
    /**
     * <code>bool measure_battery = 1;</code>
     * @return The measureBattery.
     */
    @java.lang.Override
    public boolean getMeasureBattery() {
      return measureBattery_;
    }
    /**
     * <code>bool measure_battery = 1;</code>
     * @param value The measureBattery to set.
     * @return This builder for chaining.
     */
    public Builder setMeasureBattery(boolean value) {
      
      measureBattery_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool measure_battery = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMeasureBattery() {
      
      measureBattery_ = false;
      onChanged();
      return this;
    }

    private int batterySamplingIntervalMs_ ;
    /**
     * <code>int32 battery_sampling_interval_ms = 2;</code>
     * @return The batterySamplingIntervalMs.
     */
    @java.lang.Override
    public int getBatterySamplingIntervalMs() {
      return batterySamplingIntervalMs_;
    }
    /**
     * <code>int32 battery_sampling_interval_ms = 2;</code>
     * @param value The batterySamplingIntervalMs to set.
     * @return This builder for chaining.
     */
    public Builder setBatterySamplingIntervalMs(int value) {
      
      batterySamplingIntervalMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 battery_sampling_interval_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBatterySamplingIntervalMs() {
      
      batterySamplingIntervalMs_ = 0;
      onChanged();
      return this;
    }

    private boolean measureProcessor_ ;
    /**
     * <code>bool measure_processor = 3;</code>
     * @return The measureProcessor.
     */
    @java.lang.Override
    public boolean getMeasureProcessor() {
      return measureProcessor_;
    }
    /**
     * <code>bool measure_processor = 3;</code>
     * @param value The measureProcessor to set.
     * @return This builder for chaining.
     */
    public Builder setMeasureProcessor(boolean value) {
      
      measureProcessor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool measure_processor = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMeasureProcessor() {
      
      measureProcessor_ = false;
      onChanged();
      return this;
    }

    private int processorSamplingIntervalMs_ ;
    /**
     * <code>int32 processor_sampling_interval_ms = 4;</code>
     * @return The processorSamplingIntervalMs.
     */
    @java.lang.Override
    public int getProcessorSamplingIntervalMs() {
      return processorSamplingIntervalMs_;
    }
    /**
     * <code>int32 processor_sampling_interval_ms = 4;</code>
     * @param value The processorSamplingIntervalMs to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorSamplingIntervalMs(int value) {
      
      processorSamplingIntervalMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 processor_sampling_interval_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearProcessorSamplingIntervalMs() {
      
      processorSamplingIntervalMs_ = 0;
      onChanged();
      return this;
    }

    private boolean measureFramerate_ ;
    /**
     * <code>bool measure_framerate = 5;</code>
     * @return The measureFramerate.
     */
    @java.lang.Override
    public boolean getMeasureFramerate() {
      return measureFramerate_;
    }
    /**
     * <code>bool measure_framerate = 5;</code>
     * @param value The measureFramerate to set.
     * @return This builder for chaining.
     */
    public Builder setMeasureFramerate(boolean value) {
      
      measureFramerate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool measure_framerate = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMeasureFramerate() {
      
      measureFramerate_ = false;
      onChanged();
      return this;
    }

    private int framerateSamplingIntervalMs_ ;
    /**
     * <code>int32 framerate_sampling_interval_ms = 6;</code>
     * @return The framerateSamplingIntervalMs.
     */
    @java.lang.Override
    public int getFramerateSamplingIntervalMs() {
      return framerateSamplingIntervalMs_;
    }
    /**
     * <code>int32 framerate_sampling_interval_ms = 6;</code>
     * @param value The framerateSamplingIntervalMs to set.
     * @return This builder for chaining.
     */
    public Builder setFramerateSamplingIntervalMs(int value) {
      
      framerateSamplingIntervalMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 framerate_sampling_interval_ms = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFramerateSamplingIntervalMs() {
      
      framerateSamplingIntervalMs_ = 0;
      onChanged();
      return this;
    }

    private float percentageSessionsToSample_ ;
    /**
     * <code>float percentage_sessions_to_sample = 7;</code>
     * @return The percentageSessionsToSample.
     */
    @java.lang.Override
    public float getPercentageSessionsToSample() {
      return percentageSessionsToSample_;
    }
    /**
     * <code>float percentage_sessions_to_sample = 7;</code>
     * @param value The percentageSessionsToSample to set.
     * @return This builder for chaining.
     */
    public Builder setPercentageSessionsToSample(float value) {
      
      percentageSessionsToSample_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float percentage_sessions_to_sample = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearPercentageSessionsToSample() {
      
      percentageSessionsToSample_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.ArTelemetrySettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.ArTelemetrySettings)
  private static final POGOProtos.Settings.Master.ArTelemetrySettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.ArTelemetrySettings();
  }

  public static POGOProtos.Settings.Master.ArTelemetrySettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArTelemetrySettings>
      PARSER = new com.google.protobuf.AbstractParser<ArTelemetrySettings>() {
    @java.lang.Override
    public ArTelemetrySettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ArTelemetrySettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ArTelemetrySettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArTelemetrySettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.ArTelemetrySettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

