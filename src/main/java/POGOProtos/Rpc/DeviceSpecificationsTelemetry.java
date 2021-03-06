// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.DeviceSpecificationsTelemetry}
 */
public final class DeviceSpecificationsTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DeviceSpecificationsTelemetry)
    DeviceSpecificationsTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceSpecificationsTelemetry.newBuilder() to construct.
  private DeviceSpecificationsTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceSpecificationsTelemetry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceSpecificationsTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceSpecificationsTelemetry(
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

            deviceWidth_ = input.readInt32();
            break;
          }
          case 16: {

            deviceHeight_ = input.readInt32();
            break;
          }
          case 24: {

            cameraWidth_ = input.readInt32();
            break;
          }
          case 32: {

            cameraHeight_ = input.readInt32();
            break;
          }
          case 45: {

            cameraFocalLengthFx_ = input.readFloat();
            break;
          }
          case 53: {

            cameraFocalLengthFy_ = input.readFloat();
            break;
          }
          case 56: {

            cameraRefreshRate_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceSpecificationsTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceSpecificationsTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DeviceSpecificationsTelemetry.class, POGOProtos.Rpc.DeviceSpecificationsTelemetry.Builder.class);
  }

  public static final int DEVICE_WIDTH_FIELD_NUMBER = 1;
  private int deviceWidth_;
  /**
   * <code>int32 device_width = 1;</code>
   * @return The deviceWidth.
   */
  @java.lang.Override
  public int getDeviceWidth() {
    return deviceWidth_;
  }

  public static final int DEVICE_HEIGHT_FIELD_NUMBER = 2;
  private int deviceHeight_;
  /**
   * <code>int32 device_height = 2;</code>
   * @return The deviceHeight.
   */
  @java.lang.Override
  public int getDeviceHeight() {
    return deviceHeight_;
  }

  public static final int CAMERA_WIDTH_FIELD_NUMBER = 3;
  private int cameraWidth_;
  /**
   * <code>int32 camera_width = 3;</code>
   * @return The cameraWidth.
   */
  @java.lang.Override
  public int getCameraWidth() {
    return cameraWidth_;
  }

  public static final int CAMERA_HEIGHT_FIELD_NUMBER = 4;
  private int cameraHeight_;
  /**
   * <code>int32 camera_height = 4;</code>
   * @return The cameraHeight.
   */
  @java.lang.Override
  public int getCameraHeight() {
    return cameraHeight_;
  }

  public static final int CAMERA_FOCAL_LENGTH_FX_FIELD_NUMBER = 5;
  private float cameraFocalLengthFx_;
  /**
   * <code>float camera_focal_length_fx = 5;</code>
   * @return The cameraFocalLengthFx.
   */
  @java.lang.Override
  public float getCameraFocalLengthFx() {
    return cameraFocalLengthFx_;
  }

  public static final int CAMERA_FOCAL_LENGTH_FY_FIELD_NUMBER = 6;
  private float cameraFocalLengthFy_;
  /**
   * <code>float camera_focal_length_fy = 6;</code>
   * @return The cameraFocalLengthFy.
   */
  @java.lang.Override
  public float getCameraFocalLengthFy() {
    return cameraFocalLengthFy_;
  }

  public static final int CAMERA_REFRESH_RATE_FIELD_NUMBER = 7;
  private int cameraRefreshRate_;
  /**
   * <code>int32 camera_refresh_rate = 7;</code>
   * @return The cameraRefreshRate.
   */
  @java.lang.Override
  public int getCameraRefreshRate() {
    return cameraRefreshRate_;
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
    if (deviceWidth_ != 0) {
      output.writeInt32(1, deviceWidth_);
    }
    if (deviceHeight_ != 0) {
      output.writeInt32(2, deviceHeight_);
    }
    if (cameraWidth_ != 0) {
      output.writeInt32(3, cameraWidth_);
    }
    if (cameraHeight_ != 0) {
      output.writeInt32(4, cameraHeight_);
    }
    if (cameraFocalLengthFx_ != 0F) {
      output.writeFloat(5, cameraFocalLengthFx_);
    }
    if (cameraFocalLengthFy_ != 0F) {
      output.writeFloat(6, cameraFocalLengthFy_);
    }
    if (cameraRefreshRate_ != 0) {
      output.writeInt32(7, cameraRefreshRate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deviceWidth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, deviceWidth_);
    }
    if (deviceHeight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, deviceHeight_);
    }
    if (cameraWidth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, cameraWidth_);
    }
    if (cameraHeight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, cameraHeight_);
    }
    if (cameraFocalLengthFx_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, cameraFocalLengthFx_);
    }
    if (cameraFocalLengthFy_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, cameraFocalLengthFy_);
    }
    if (cameraRefreshRate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, cameraRefreshRate_);
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
    if (!(obj instanceof POGOProtos.Rpc.DeviceSpecificationsTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DeviceSpecificationsTelemetry other = (POGOProtos.Rpc.DeviceSpecificationsTelemetry) obj;

    if (getDeviceWidth()
        != other.getDeviceWidth()) return false;
    if (getDeviceHeight()
        != other.getDeviceHeight()) return false;
    if (getCameraWidth()
        != other.getCameraWidth()) return false;
    if (getCameraHeight()
        != other.getCameraHeight()) return false;
    if (java.lang.Float.floatToIntBits(getCameraFocalLengthFx())
        != java.lang.Float.floatToIntBits(
            other.getCameraFocalLengthFx())) return false;
    if (java.lang.Float.floatToIntBits(getCameraFocalLengthFy())
        != java.lang.Float.floatToIntBits(
            other.getCameraFocalLengthFy())) return false;
    if (getCameraRefreshRate()
        != other.getCameraRefreshRate()) return false;
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
    hash = (37 * hash) + DEVICE_WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceWidth();
    hash = (37 * hash) + DEVICE_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceHeight();
    hash = (37 * hash) + CAMERA_WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getCameraWidth();
    hash = (37 * hash) + CAMERA_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getCameraHeight();
    hash = (37 * hash) + CAMERA_FOCAL_LENGTH_FX_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCameraFocalLengthFx());
    hash = (37 * hash) + CAMERA_FOCAL_LENGTH_FY_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCameraFocalLengthFy());
    hash = (37 * hash) + CAMERA_REFRESH_RATE_FIELD_NUMBER;
    hash = (53 * hash) + getCameraRefreshRate();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DeviceSpecificationsTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.DeviceSpecificationsTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DeviceSpecificationsTelemetry)
      POGOProtos.Rpc.DeviceSpecificationsTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceSpecificationsTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceSpecificationsTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DeviceSpecificationsTelemetry.class, POGOProtos.Rpc.DeviceSpecificationsTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DeviceSpecificationsTelemetry.newBuilder()
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
      deviceWidth_ = 0;

      deviceHeight_ = 0;

      cameraWidth_ = 0;

      cameraHeight_ = 0;

      cameraFocalLengthFx_ = 0F;

      cameraFocalLengthFy_ = 0F;

      cameraRefreshRate_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceSpecificationsTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DeviceSpecificationsTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.DeviceSpecificationsTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DeviceSpecificationsTelemetry build() {
      POGOProtos.Rpc.DeviceSpecificationsTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DeviceSpecificationsTelemetry buildPartial() {
      POGOProtos.Rpc.DeviceSpecificationsTelemetry result = new POGOProtos.Rpc.DeviceSpecificationsTelemetry(this);
      result.deviceWidth_ = deviceWidth_;
      result.deviceHeight_ = deviceHeight_;
      result.cameraWidth_ = cameraWidth_;
      result.cameraHeight_ = cameraHeight_;
      result.cameraFocalLengthFx_ = cameraFocalLengthFx_;
      result.cameraFocalLengthFy_ = cameraFocalLengthFy_;
      result.cameraRefreshRate_ = cameraRefreshRate_;
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
      if (other instanceof POGOProtos.Rpc.DeviceSpecificationsTelemetry) {
        return mergeFrom((POGOProtos.Rpc.DeviceSpecificationsTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DeviceSpecificationsTelemetry other) {
      if (other == POGOProtos.Rpc.DeviceSpecificationsTelemetry.getDefaultInstance()) return this;
      if (other.getDeviceWidth() != 0) {
        setDeviceWidth(other.getDeviceWidth());
      }
      if (other.getDeviceHeight() != 0) {
        setDeviceHeight(other.getDeviceHeight());
      }
      if (other.getCameraWidth() != 0) {
        setCameraWidth(other.getCameraWidth());
      }
      if (other.getCameraHeight() != 0) {
        setCameraHeight(other.getCameraHeight());
      }
      if (other.getCameraFocalLengthFx() != 0F) {
        setCameraFocalLengthFx(other.getCameraFocalLengthFx());
      }
      if (other.getCameraFocalLengthFy() != 0F) {
        setCameraFocalLengthFy(other.getCameraFocalLengthFy());
      }
      if (other.getCameraRefreshRate() != 0) {
        setCameraRefreshRate(other.getCameraRefreshRate());
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
      POGOProtos.Rpc.DeviceSpecificationsTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DeviceSpecificationsTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int deviceWidth_ ;
    /**
     * <code>int32 device_width = 1;</code>
     * @return The deviceWidth.
     */
    @java.lang.Override
    public int getDeviceWidth() {
      return deviceWidth_;
    }
    /**
     * <code>int32 device_width = 1;</code>
     * @param value The deviceWidth to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceWidth(int value) {
      
      deviceWidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 device_width = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceWidth() {
      
      deviceWidth_ = 0;
      onChanged();
      return this;
    }

    private int deviceHeight_ ;
    /**
     * <code>int32 device_height = 2;</code>
     * @return The deviceHeight.
     */
    @java.lang.Override
    public int getDeviceHeight() {
      return deviceHeight_;
    }
    /**
     * <code>int32 device_height = 2;</code>
     * @param value The deviceHeight to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceHeight(int value) {
      
      deviceHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 device_height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceHeight() {
      
      deviceHeight_ = 0;
      onChanged();
      return this;
    }

    private int cameraWidth_ ;
    /**
     * <code>int32 camera_width = 3;</code>
     * @return The cameraWidth.
     */
    @java.lang.Override
    public int getCameraWidth() {
      return cameraWidth_;
    }
    /**
     * <code>int32 camera_width = 3;</code>
     * @param value The cameraWidth to set.
     * @return This builder for chaining.
     */
    public Builder setCameraWidth(int value) {
      
      cameraWidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 camera_width = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCameraWidth() {
      
      cameraWidth_ = 0;
      onChanged();
      return this;
    }

    private int cameraHeight_ ;
    /**
     * <code>int32 camera_height = 4;</code>
     * @return The cameraHeight.
     */
    @java.lang.Override
    public int getCameraHeight() {
      return cameraHeight_;
    }
    /**
     * <code>int32 camera_height = 4;</code>
     * @param value The cameraHeight to set.
     * @return This builder for chaining.
     */
    public Builder setCameraHeight(int value) {
      
      cameraHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 camera_height = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCameraHeight() {
      
      cameraHeight_ = 0;
      onChanged();
      return this;
    }

    private float cameraFocalLengthFx_ ;
    /**
     * <code>float camera_focal_length_fx = 5;</code>
     * @return The cameraFocalLengthFx.
     */
    @java.lang.Override
    public float getCameraFocalLengthFx() {
      return cameraFocalLengthFx_;
    }
    /**
     * <code>float camera_focal_length_fx = 5;</code>
     * @param value The cameraFocalLengthFx to set.
     * @return This builder for chaining.
     */
    public Builder setCameraFocalLengthFx(float value) {
      
      cameraFocalLengthFx_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float camera_focal_length_fx = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCameraFocalLengthFx() {
      
      cameraFocalLengthFx_ = 0F;
      onChanged();
      return this;
    }

    private float cameraFocalLengthFy_ ;
    /**
     * <code>float camera_focal_length_fy = 6;</code>
     * @return The cameraFocalLengthFy.
     */
    @java.lang.Override
    public float getCameraFocalLengthFy() {
      return cameraFocalLengthFy_;
    }
    /**
     * <code>float camera_focal_length_fy = 6;</code>
     * @param value The cameraFocalLengthFy to set.
     * @return This builder for chaining.
     */
    public Builder setCameraFocalLengthFy(float value) {
      
      cameraFocalLengthFy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float camera_focal_length_fy = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCameraFocalLengthFy() {
      
      cameraFocalLengthFy_ = 0F;
      onChanged();
      return this;
    }

    private int cameraRefreshRate_ ;
    /**
     * <code>int32 camera_refresh_rate = 7;</code>
     * @return The cameraRefreshRate.
     */
    @java.lang.Override
    public int getCameraRefreshRate() {
      return cameraRefreshRate_;
    }
    /**
     * <code>int32 camera_refresh_rate = 7;</code>
     * @param value The cameraRefreshRate to set.
     * @return This builder for chaining.
     */
    public Builder setCameraRefreshRate(int value) {
      
      cameraRefreshRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 camera_refresh_rate = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearCameraRefreshRate() {
      
      cameraRefreshRate_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DeviceSpecificationsTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DeviceSpecificationsTelemetry)
  private static final POGOProtos.Rpc.DeviceSpecificationsTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DeviceSpecificationsTelemetry();
  }

  public static POGOProtos.Rpc.DeviceSpecificationsTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceSpecificationsTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<DeviceSpecificationsTelemetry>() {
    @java.lang.Override
    public DeviceSpecificationsTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceSpecificationsTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceSpecificationsTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceSpecificationsTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DeviceSpecificationsTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

