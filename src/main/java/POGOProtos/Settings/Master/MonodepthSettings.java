// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/MonodepthSettings.proto

package POGOProtos.Settings.Master;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.MonodepthSettings}
 */
public final class MonodepthSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.MonodepthSettings)
    MonodepthSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MonodepthSettings.newBuilder() to construct.
  private MonodepthSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MonodepthSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MonodepthSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MonodepthSettings(
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

            enableOcclusions_ = input.readBool();
            break;
          }
          case 16: {

            occlusionsDefaultOn_ = input.readBool();
            break;
          }
          case 24: {

            occlusionsToggleVisible_ = input.readBool();
            break;
          }
          case 32: {

            enableGroundSuppression_ = input.readBool();
            break;
          }
          case 45: {

            minGroundSuppressionThresh_ = input.readFloat();
            break;
          }
          case 48: {

            suppressionChannelId_ = input.readUInt32();
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
    return POGOProtos.Settings.Master.MonodepthSettingsOuterClass.internal_static_POGOProtos_Settings_Master_MonodepthSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.MonodepthSettingsOuterClass.internal_static_POGOProtos_Settings_Master_MonodepthSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.MonodepthSettings.class, POGOProtos.Settings.Master.MonodepthSettings.Builder.class);
  }

  public static final int ENABLE_OCCLUSIONS_FIELD_NUMBER = 1;
  private boolean enableOcclusions_;
  /**
   * <code>bool enable_occlusions = 1;</code>
   * @return The enableOcclusions.
   */
  @java.lang.Override
  public boolean getEnableOcclusions() {
    return enableOcclusions_;
  }

  public static final int OCCLUSIONS_DEFAULT_ON_FIELD_NUMBER = 2;
  private boolean occlusionsDefaultOn_;
  /**
   * <code>bool occlusions_default_on = 2;</code>
   * @return The occlusionsDefaultOn.
   */
  @java.lang.Override
  public boolean getOcclusionsDefaultOn() {
    return occlusionsDefaultOn_;
  }

  public static final int OCCLUSIONS_TOGGLE_VISIBLE_FIELD_NUMBER = 3;
  private boolean occlusionsToggleVisible_;
  /**
   * <code>bool occlusions_toggle_visible = 3;</code>
   * @return The occlusionsToggleVisible.
   */
  @java.lang.Override
  public boolean getOcclusionsToggleVisible() {
    return occlusionsToggleVisible_;
  }

  public static final int ENABLE_GROUND_SUPPRESSION_FIELD_NUMBER = 4;
  private boolean enableGroundSuppression_;
  /**
   * <code>bool enable_ground_suppression = 4;</code>
   * @return The enableGroundSuppression.
   */
  @java.lang.Override
  public boolean getEnableGroundSuppression() {
    return enableGroundSuppression_;
  }

  public static final int MIN_GROUND_SUPPRESSION_THRESH_FIELD_NUMBER = 5;
  private float minGroundSuppressionThresh_;
  /**
   * <code>float min_ground_suppression_thresh = 5;</code>
   * @return The minGroundSuppressionThresh.
   */
  @java.lang.Override
  public float getMinGroundSuppressionThresh() {
    return minGroundSuppressionThresh_;
  }

  public static final int SUPPRESSION_CHANNEL_ID_FIELD_NUMBER = 6;
  private int suppressionChannelId_;
  /**
   * <code>uint32 suppression_channel_id = 6;</code>
   * @return The suppressionChannelId.
   */
  @java.lang.Override
  public int getSuppressionChannelId() {
    return suppressionChannelId_;
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
    if (enableOcclusions_ != false) {
      output.writeBool(1, enableOcclusions_);
    }
    if (occlusionsDefaultOn_ != false) {
      output.writeBool(2, occlusionsDefaultOn_);
    }
    if (occlusionsToggleVisible_ != false) {
      output.writeBool(3, occlusionsToggleVisible_);
    }
    if (enableGroundSuppression_ != false) {
      output.writeBool(4, enableGroundSuppression_);
    }
    if (minGroundSuppressionThresh_ != 0F) {
      output.writeFloat(5, minGroundSuppressionThresh_);
    }
    if (suppressionChannelId_ != 0) {
      output.writeUInt32(6, suppressionChannelId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableOcclusions_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableOcclusions_);
    }
    if (occlusionsDefaultOn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, occlusionsDefaultOn_);
    }
    if (occlusionsToggleVisible_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, occlusionsToggleVisible_);
    }
    if (enableGroundSuppression_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, enableGroundSuppression_);
    }
    if (minGroundSuppressionThresh_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, minGroundSuppressionThresh_);
    }
    if (suppressionChannelId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, suppressionChannelId_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.MonodepthSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.MonodepthSettings other = (POGOProtos.Settings.Master.MonodepthSettings) obj;

    if (getEnableOcclusions()
        != other.getEnableOcclusions()) return false;
    if (getOcclusionsDefaultOn()
        != other.getOcclusionsDefaultOn()) return false;
    if (getOcclusionsToggleVisible()
        != other.getOcclusionsToggleVisible()) return false;
    if (getEnableGroundSuppression()
        != other.getEnableGroundSuppression()) return false;
    if (java.lang.Float.floatToIntBits(getMinGroundSuppressionThresh())
        != java.lang.Float.floatToIntBits(
            other.getMinGroundSuppressionThresh())) return false;
    if (getSuppressionChannelId()
        != other.getSuppressionChannelId()) return false;
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
    hash = (37 * hash) + ENABLE_OCCLUSIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableOcclusions());
    hash = (37 * hash) + OCCLUSIONS_DEFAULT_ON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOcclusionsDefaultOn());
    hash = (37 * hash) + OCCLUSIONS_TOGGLE_VISIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOcclusionsToggleVisible());
    hash = (37 * hash) + ENABLE_GROUND_SUPPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableGroundSuppression());
    hash = (37 * hash) + MIN_GROUND_SUPPRESSION_THRESH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMinGroundSuppressionThresh());
    hash = (37 * hash) + SUPPRESSION_CHANNEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSuppressionChannelId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.MonodepthSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.MonodepthSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.MonodepthSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.MonodepthSettings)
      POGOProtos.Settings.Master.MonodepthSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.MonodepthSettingsOuterClass.internal_static_POGOProtos_Settings_Master_MonodepthSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.MonodepthSettingsOuterClass.internal_static_POGOProtos_Settings_Master_MonodepthSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.MonodepthSettings.class, POGOProtos.Settings.Master.MonodepthSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.MonodepthSettings.newBuilder()
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
      enableOcclusions_ = false;

      occlusionsDefaultOn_ = false;

      occlusionsToggleVisible_ = false;

      enableGroundSuppression_ = false;

      minGroundSuppressionThresh_ = 0F;

      suppressionChannelId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.MonodepthSettingsOuterClass.internal_static_POGOProtos_Settings_Master_MonodepthSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.MonodepthSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.MonodepthSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.MonodepthSettings build() {
      POGOProtos.Settings.Master.MonodepthSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.MonodepthSettings buildPartial() {
      POGOProtos.Settings.Master.MonodepthSettings result = new POGOProtos.Settings.Master.MonodepthSettings(this);
      result.enableOcclusions_ = enableOcclusions_;
      result.occlusionsDefaultOn_ = occlusionsDefaultOn_;
      result.occlusionsToggleVisible_ = occlusionsToggleVisible_;
      result.enableGroundSuppression_ = enableGroundSuppression_;
      result.minGroundSuppressionThresh_ = minGroundSuppressionThresh_;
      result.suppressionChannelId_ = suppressionChannelId_;
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
      if (other instanceof POGOProtos.Settings.Master.MonodepthSettings) {
        return mergeFrom((POGOProtos.Settings.Master.MonodepthSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.MonodepthSettings other) {
      if (other == POGOProtos.Settings.Master.MonodepthSettings.getDefaultInstance()) return this;
      if (other.getEnableOcclusions() != false) {
        setEnableOcclusions(other.getEnableOcclusions());
      }
      if (other.getOcclusionsDefaultOn() != false) {
        setOcclusionsDefaultOn(other.getOcclusionsDefaultOn());
      }
      if (other.getOcclusionsToggleVisible() != false) {
        setOcclusionsToggleVisible(other.getOcclusionsToggleVisible());
      }
      if (other.getEnableGroundSuppression() != false) {
        setEnableGroundSuppression(other.getEnableGroundSuppression());
      }
      if (other.getMinGroundSuppressionThresh() != 0F) {
        setMinGroundSuppressionThresh(other.getMinGroundSuppressionThresh());
      }
      if (other.getSuppressionChannelId() != 0) {
        setSuppressionChannelId(other.getSuppressionChannelId());
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
      POGOProtos.Settings.Master.MonodepthSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.MonodepthSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableOcclusions_ ;
    /**
     * <code>bool enable_occlusions = 1;</code>
     * @return The enableOcclusions.
     */
    @java.lang.Override
    public boolean getEnableOcclusions() {
      return enableOcclusions_;
    }
    /**
     * <code>bool enable_occlusions = 1;</code>
     * @param value The enableOcclusions to set.
     * @return This builder for chaining.
     */
    public Builder setEnableOcclusions(boolean value) {
      
      enableOcclusions_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_occlusions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableOcclusions() {
      
      enableOcclusions_ = false;
      onChanged();
      return this;
    }

    private boolean occlusionsDefaultOn_ ;
    /**
     * <code>bool occlusions_default_on = 2;</code>
     * @return The occlusionsDefaultOn.
     */
    @java.lang.Override
    public boolean getOcclusionsDefaultOn() {
      return occlusionsDefaultOn_;
    }
    /**
     * <code>bool occlusions_default_on = 2;</code>
     * @param value The occlusionsDefaultOn to set.
     * @return This builder for chaining.
     */
    public Builder setOcclusionsDefaultOn(boolean value) {
      
      occlusionsDefaultOn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool occlusions_default_on = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOcclusionsDefaultOn() {
      
      occlusionsDefaultOn_ = false;
      onChanged();
      return this;
    }

    private boolean occlusionsToggleVisible_ ;
    /**
     * <code>bool occlusions_toggle_visible = 3;</code>
     * @return The occlusionsToggleVisible.
     */
    @java.lang.Override
    public boolean getOcclusionsToggleVisible() {
      return occlusionsToggleVisible_;
    }
    /**
     * <code>bool occlusions_toggle_visible = 3;</code>
     * @param value The occlusionsToggleVisible to set.
     * @return This builder for chaining.
     */
    public Builder setOcclusionsToggleVisible(boolean value) {
      
      occlusionsToggleVisible_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool occlusions_toggle_visible = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOcclusionsToggleVisible() {
      
      occlusionsToggleVisible_ = false;
      onChanged();
      return this;
    }

    private boolean enableGroundSuppression_ ;
    /**
     * <code>bool enable_ground_suppression = 4;</code>
     * @return The enableGroundSuppression.
     */
    @java.lang.Override
    public boolean getEnableGroundSuppression() {
      return enableGroundSuppression_;
    }
    /**
     * <code>bool enable_ground_suppression = 4;</code>
     * @param value The enableGroundSuppression to set.
     * @return This builder for chaining.
     */
    public Builder setEnableGroundSuppression(boolean value) {
      
      enableGroundSuppression_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_ground_suppression = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableGroundSuppression() {
      
      enableGroundSuppression_ = false;
      onChanged();
      return this;
    }

    private float minGroundSuppressionThresh_ ;
    /**
     * <code>float min_ground_suppression_thresh = 5;</code>
     * @return The minGroundSuppressionThresh.
     */
    @java.lang.Override
    public float getMinGroundSuppressionThresh() {
      return minGroundSuppressionThresh_;
    }
    /**
     * <code>float min_ground_suppression_thresh = 5;</code>
     * @param value The minGroundSuppressionThresh to set.
     * @return This builder for chaining.
     */
    public Builder setMinGroundSuppressionThresh(float value) {
      
      minGroundSuppressionThresh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float min_ground_suppression_thresh = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinGroundSuppressionThresh() {
      
      minGroundSuppressionThresh_ = 0F;
      onChanged();
      return this;
    }

    private int suppressionChannelId_ ;
    /**
     * <code>uint32 suppression_channel_id = 6;</code>
     * @return The suppressionChannelId.
     */
    @java.lang.Override
    public int getSuppressionChannelId() {
      return suppressionChannelId_;
    }
    /**
     * <code>uint32 suppression_channel_id = 6;</code>
     * @param value The suppressionChannelId to set.
     * @return This builder for chaining.
     */
    public Builder setSuppressionChannelId(int value) {
      
      suppressionChannelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 suppression_channel_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuppressionChannelId() {
      
      suppressionChannelId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.MonodepthSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.MonodepthSettings)
  private static final POGOProtos.Settings.Master.MonodepthSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.MonodepthSettings();
  }

  public static POGOProtos.Settings.Master.MonodepthSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonodepthSettings>
      PARSER = new com.google.protobuf.AbstractParser<MonodepthSettings>() {
    @java.lang.Override
    public MonodepthSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MonodepthSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MonodepthSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MonodepthSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.MonodepthSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

