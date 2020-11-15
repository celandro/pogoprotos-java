// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TelemetryGlobalSettingsProto}
 */
public final class TelemetryGlobalSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TelemetryGlobalSettingsProto)
    TelemetryGlobalSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TelemetryGlobalSettingsProto.newBuilder() to construct.
  private TelemetryGlobalSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TelemetryGlobalSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TelemetryGlobalSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TelemetryGlobalSettingsProto(
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

            enabled_ = input.readBool();
            break;
          }
          case 17: {

            sessionSamplingFraction_ = input.readDouble();
            break;
          }
          case 24: {

            maxBufferSizeKb_ = input.readInt32();
            break;
          }
          case 32: {

            batchSize_ = input.readInt32();
            break;
          }
          case 40: {

            updateIntervalMs_ = input.readInt64();
            break;
          }
          case 48: {

            frameRateSampleIntervalMs_ = input.readInt64();
            break;
          }
          case 56: {

            frameRateSamplePeriodMs_ = input.readInt64();
            break;
          }
          case 64: {

            enableOmniWrapperSending_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryGlobalSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryGlobalSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TelemetryGlobalSettingsProto.class, POGOProtos.Rpc.TelemetryGlobalSettingsProto.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int SESSION_SAMPLING_FRACTION_FIELD_NUMBER = 2;
  private double sessionSamplingFraction_;
  /**
   * <code>double session_sampling_fraction = 2;</code>
   * @return The sessionSamplingFraction.
   */
  @java.lang.Override
  public double getSessionSamplingFraction() {
    return sessionSamplingFraction_;
  }

  public static final int MAX_BUFFER_SIZE_KB_FIELD_NUMBER = 3;
  private int maxBufferSizeKb_;
  /**
   * <code>int32 max_buffer_size_kb = 3;</code>
   * @return The maxBufferSizeKb.
   */
  @java.lang.Override
  public int getMaxBufferSizeKb() {
    return maxBufferSizeKb_;
  }

  public static final int BATCH_SIZE_FIELD_NUMBER = 4;
  private int batchSize_;
  /**
   * <code>int32 batch_size = 4;</code>
   * @return The batchSize.
   */
  @java.lang.Override
  public int getBatchSize() {
    return batchSize_;
  }

  public static final int UPDATE_INTERVAL_MS_FIELD_NUMBER = 5;
  private long updateIntervalMs_;
  /**
   * <code>int64 update_interval_ms = 5;</code>
   * @return The updateIntervalMs.
   */
  @java.lang.Override
  public long getUpdateIntervalMs() {
    return updateIntervalMs_;
  }

  public static final int FRAME_RATE_SAMPLE_INTERVAL_MS_FIELD_NUMBER = 6;
  private long frameRateSampleIntervalMs_;
  /**
   * <code>int64 frame_rate_sample_interval_ms = 6;</code>
   * @return The frameRateSampleIntervalMs.
   */
  @java.lang.Override
  public long getFrameRateSampleIntervalMs() {
    return frameRateSampleIntervalMs_;
  }

  public static final int FRAME_RATE_SAMPLE_PERIOD_MS_FIELD_NUMBER = 7;
  private long frameRateSamplePeriodMs_;
  /**
   * <code>int64 frame_rate_sample_period_ms = 7;</code>
   * @return The frameRateSamplePeriodMs.
   */
  @java.lang.Override
  public long getFrameRateSamplePeriodMs() {
    return frameRateSamplePeriodMs_;
  }

  public static final int ENABLE_OMNI_WRAPPER_SENDING_FIELD_NUMBER = 8;
  private boolean enableOmniWrapperSending_;
  /**
   * <code>bool enable_omni_wrapper_sending = 8;</code>
   * @return The enableOmniWrapperSending.
   */
  @java.lang.Override
  public boolean getEnableOmniWrapperSending() {
    return enableOmniWrapperSending_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (sessionSamplingFraction_ != 0D) {
      output.writeDouble(2, sessionSamplingFraction_);
    }
    if (maxBufferSizeKb_ != 0) {
      output.writeInt32(3, maxBufferSizeKb_);
    }
    if (batchSize_ != 0) {
      output.writeInt32(4, batchSize_);
    }
    if (updateIntervalMs_ != 0L) {
      output.writeInt64(5, updateIntervalMs_);
    }
    if (frameRateSampleIntervalMs_ != 0L) {
      output.writeInt64(6, frameRateSampleIntervalMs_);
    }
    if (frameRateSamplePeriodMs_ != 0L) {
      output.writeInt64(7, frameRateSamplePeriodMs_);
    }
    if (enableOmniWrapperSending_ != false) {
      output.writeBool(8, enableOmniWrapperSending_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    if (sessionSamplingFraction_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, sessionSamplingFraction_);
    }
    if (maxBufferSizeKb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxBufferSizeKb_);
    }
    if (batchSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, batchSize_);
    }
    if (updateIntervalMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, updateIntervalMs_);
    }
    if (frameRateSampleIntervalMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, frameRateSampleIntervalMs_);
    }
    if (frameRateSamplePeriodMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, frameRateSamplePeriodMs_);
    }
    if (enableOmniWrapperSending_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, enableOmniWrapperSending_);
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
    if (!(obj instanceof POGOProtos.Rpc.TelemetryGlobalSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TelemetryGlobalSettingsProto other = (POGOProtos.Rpc.TelemetryGlobalSettingsProto) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
    if (java.lang.Double.doubleToLongBits(getSessionSamplingFraction())
        != java.lang.Double.doubleToLongBits(
            other.getSessionSamplingFraction())) return false;
    if (getMaxBufferSizeKb()
        != other.getMaxBufferSizeKb()) return false;
    if (getBatchSize()
        != other.getBatchSize()) return false;
    if (getUpdateIntervalMs()
        != other.getUpdateIntervalMs()) return false;
    if (getFrameRateSampleIntervalMs()
        != other.getFrameRateSampleIntervalMs()) return false;
    if (getFrameRateSamplePeriodMs()
        != other.getFrameRateSamplePeriodMs()) return false;
    if (getEnableOmniWrapperSending()
        != other.getEnableOmniWrapperSending()) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (37 * hash) + SESSION_SAMPLING_FRACTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSessionSamplingFraction()));
    hash = (37 * hash) + MAX_BUFFER_SIZE_KB_FIELD_NUMBER;
    hash = (53 * hash) + getMaxBufferSizeKb();
    hash = (37 * hash) + BATCH_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getBatchSize();
    hash = (37 * hash) + UPDATE_INTERVAL_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUpdateIntervalMs());
    hash = (37 * hash) + FRAME_RATE_SAMPLE_INTERVAL_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFrameRateSampleIntervalMs());
    hash = (37 * hash) + FRAME_RATE_SAMPLE_PERIOD_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFrameRateSamplePeriodMs());
    hash = (37 * hash) + ENABLE_OMNI_WRAPPER_SENDING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableOmniWrapperSending());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TelemetryGlobalSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.TelemetryGlobalSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TelemetryGlobalSettingsProto)
      POGOProtos.Rpc.TelemetryGlobalSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryGlobalSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryGlobalSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TelemetryGlobalSettingsProto.class, POGOProtos.Rpc.TelemetryGlobalSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TelemetryGlobalSettingsProto.newBuilder()
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
      enabled_ = false;

      sessionSamplingFraction_ = 0D;

      maxBufferSizeKb_ = 0;

      batchSize_ = 0;

      updateIntervalMs_ = 0L;

      frameRateSampleIntervalMs_ = 0L;

      frameRateSamplePeriodMs_ = 0L;

      enableOmniWrapperSending_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryGlobalSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TelemetryGlobalSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TelemetryGlobalSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TelemetryGlobalSettingsProto build() {
      POGOProtos.Rpc.TelemetryGlobalSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TelemetryGlobalSettingsProto buildPartial() {
      POGOProtos.Rpc.TelemetryGlobalSettingsProto result = new POGOProtos.Rpc.TelemetryGlobalSettingsProto(this);
      result.enabled_ = enabled_;
      result.sessionSamplingFraction_ = sessionSamplingFraction_;
      result.maxBufferSizeKb_ = maxBufferSizeKb_;
      result.batchSize_ = batchSize_;
      result.updateIntervalMs_ = updateIntervalMs_;
      result.frameRateSampleIntervalMs_ = frameRateSampleIntervalMs_;
      result.frameRateSamplePeriodMs_ = frameRateSamplePeriodMs_;
      result.enableOmniWrapperSending_ = enableOmniWrapperSending_;
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
      if (other instanceof POGOProtos.Rpc.TelemetryGlobalSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.TelemetryGlobalSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TelemetryGlobalSettingsProto other) {
      if (other == POGOProtos.Rpc.TelemetryGlobalSettingsProto.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.getSessionSamplingFraction() != 0D) {
        setSessionSamplingFraction(other.getSessionSamplingFraction());
      }
      if (other.getMaxBufferSizeKb() != 0) {
        setMaxBufferSizeKb(other.getMaxBufferSizeKb());
      }
      if (other.getBatchSize() != 0) {
        setBatchSize(other.getBatchSize());
      }
      if (other.getUpdateIntervalMs() != 0L) {
        setUpdateIntervalMs(other.getUpdateIntervalMs());
      }
      if (other.getFrameRateSampleIntervalMs() != 0L) {
        setFrameRateSampleIntervalMs(other.getFrameRateSampleIntervalMs());
      }
      if (other.getFrameRateSamplePeriodMs() != 0L) {
        setFrameRateSamplePeriodMs(other.getFrameRateSamplePeriodMs());
      }
      if (other.getEnableOmniWrapperSending() != false) {
        setEnableOmniWrapperSending(other.getEnableOmniWrapperSending());
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
      POGOProtos.Rpc.TelemetryGlobalSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TelemetryGlobalSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enabled_ ;
    /**
     * <code>bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
      onChanged();
      return this;
    }

    private double sessionSamplingFraction_ ;
    /**
     * <code>double session_sampling_fraction = 2;</code>
     * @return The sessionSamplingFraction.
     */
    @java.lang.Override
    public double getSessionSamplingFraction() {
      return sessionSamplingFraction_;
    }
    /**
     * <code>double session_sampling_fraction = 2;</code>
     * @param value The sessionSamplingFraction to set.
     * @return This builder for chaining.
     */
    public Builder setSessionSamplingFraction(double value) {
      
      sessionSamplingFraction_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double session_sampling_fraction = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionSamplingFraction() {
      
      sessionSamplingFraction_ = 0D;
      onChanged();
      return this;
    }

    private int maxBufferSizeKb_ ;
    /**
     * <code>int32 max_buffer_size_kb = 3;</code>
     * @return The maxBufferSizeKb.
     */
    @java.lang.Override
    public int getMaxBufferSizeKb() {
      return maxBufferSizeKb_;
    }
    /**
     * <code>int32 max_buffer_size_kb = 3;</code>
     * @param value The maxBufferSizeKb to set.
     * @return This builder for chaining.
     */
    public Builder setMaxBufferSizeKb(int value) {
      
      maxBufferSizeKb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_buffer_size_kb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxBufferSizeKb() {
      
      maxBufferSizeKb_ = 0;
      onChanged();
      return this;
    }

    private int batchSize_ ;
    /**
     * <code>int32 batch_size = 4;</code>
     * @return The batchSize.
     */
    @java.lang.Override
    public int getBatchSize() {
      return batchSize_;
    }
    /**
     * <code>int32 batch_size = 4;</code>
     * @param value The batchSize to set.
     * @return This builder for chaining.
     */
    public Builder setBatchSize(int value) {
      
      batchSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 batch_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBatchSize() {
      
      batchSize_ = 0;
      onChanged();
      return this;
    }

    private long updateIntervalMs_ ;
    /**
     * <code>int64 update_interval_ms = 5;</code>
     * @return The updateIntervalMs.
     */
    @java.lang.Override
    public long getUpdateIntervalMs() {
      return updateIntervalMs_;
    }
    /**
     * <code>int64 update_interval_ms = 5;</code>
     * @param value The updateIntervalMs to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateIntervalMs(long value) {
      
      updateIntervalMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 update_interval_ms = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateIntervalMs() {
      
      updateIntervalMs_ = 0L;
      onChanged();
      return this;
    }

    private long frameRateSampleIntervalMs_ ;
    /**
     * <code>int64 frame_rate_sample_interval_ms = 6;</code>
     * @return The frameRateSampleIntervalMs.
     */
    @java.lang.Override
    public long getFrameRateSampleIntervalMs() {
      return frameRateSampleIntervalMs_;
    }
    /**
     * <code>int64 frame_rate_sample_interval_ms = 6;</code>
     * @param value The frameRateSampleIntervalMs to set.
     * @return This builder for chaining.
     */
    public Builder setFrameRateSampleIntervalMs(long value) {
      
      frameRateSampleIntervalMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 frame_rate_sample_interval_ms = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrameRateSampleIntervalMs() {
      
      frameRateSampleIntervalMs_ = 0L;
      onChanged();
      return this;
    }

    private long frameRateSamplePeriodMs_ ;
    /**
     * <code>int64 frame_rate_sample_period_ms = 7;</code>
     * @return The frameRateSamplePeriodMs.
     */
    @java.lang.Override
    public long getFrameRateSamplePeriodMs() {
      return frameRateSamplePeriodMs_;
    }
    /**
     * <code>int64 frame_rate_sample_period_ms = 7;</code>
     * @param value The frameRateSamplePeriodMs to set.
     * @return This builder for chaining.
     */
    public Builder setFrameRateSamplePeriodMs(long value) {
      
      frameRateSamplePeriodMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 frame_rate_sample_period_ms = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrameRateSamplePeriodMs() {
      
      frameRateSamplePeriodMs_ = 0L;
      onChanged();
      return this;
    }

    private boolean enableOmniWrapperSending_ ;
    /**
     * <code>bool enable_omni_wrapper_sending = 8;</code>
     * @return The enableOmniWrapperSending.
     */
    @java.lang.Override
    public boolean getEnableOmniWrapperSending() {
      return enableOmniWrapperSending_;
    }
    /**
     * <code>bool enable_omni_wrapper_sending = 8;</code>
     * @param value The enableOmniWrapperSending to set.
     * @return This builder for chaining.
     */
    public Builder setEnableOmniWrapperSending(boolean value) {
      
      enableOmniWrapperSending_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_omni_wrapper_sending = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableOmniWrapperSending() {
      
      enableOmniWrapperSending_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TelemetryGlobalSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TelemetryGlobalSettingsProto)
  private static final POGOProtos.Rpc.TelemetryGlobalSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TelemetryGlobalSettingsProto();
  }

  public static POGOProtos.Rpc.TelemetryGlobalSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TelemetryGlobalSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<TelemetryGlobalSettingsProto>() {
    @java.lang.Override
    public TelemetryGlobalSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TelemetryGlobalSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TelemetryGlobalSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TelemetryGlobalSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TelemetryGlobalSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

