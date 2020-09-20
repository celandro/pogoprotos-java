// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ABIPCPGGNFD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DeviceServiceToggleTelemetry}
 */
public final class DeviceServiceToggleTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DeviceServiceToggleTelemetry)
    DeviceServiceToggleTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceServiceToggleTelemetry.newBuilder() to construct.
  private DeviceServiceToggleTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceServiceToggleTelemetry() {
    deviceServiceTelemetryId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceServiceToggleTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceServiceToggleTelemetry(
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
            int rawValue = input.readEnum();

            deviceServiceTelemetryId_ = rawValue;
            break;
          }
          case 16: {

            wasEnabled_ = input.readBool();
            break;
          }
          case 24: {

            wasSubsequent_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceServiceToggleTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceServiceToggleTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DeviceServiceToggleTelemetry.class, POGOProtos.Rpc.DeviceServiceToggleTelemetry.Builder.class);
  }

  public static final int DEVICE_SERVICE_TELEMETRY_ID_FIELD_NUMBER = 1;
  private int deviceServiceTelemetryId_;
  /**
   * <code>.POGOProtos.Rpc.DeviceServiceTelemetryIds device_service_telemetry_id = 1;</code>
   * @return The enum numeric value on the wire for deviceServiceTelemetryId.
   */
  @java.lang.Override public int getDeviceServiceTelemetryIdValue() {
    return deviceServiceTelemetryId_;
  }
  /**
   * <code>.POGOProtos.Rpc.DeviceServiceTelemetryIds device_service_telemetry_id = 1;</code>
   * @return The deviceServiceTelemetryId.
   */
  @java.lang.Override public POGOProtos.Rpc.DeviceServiceTelemetryIds getDeviceServiceTelemetryId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DeviceServiceTelemetryIds result = POGOProtos.Rpc.DeviceServiceTelemetryIds.valueOf(deviceServiceTelemetryId_);
    return result == null ? POGOProtos.Rpc.DeviceServiceTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int WAS_ENABLED_FIELD_NUMBER = 2;
  private boolean wasEnabled_;
  /**
   * <code>bool was_enabled = 2;</code>
   * @return The wasEnabled.
   */
  @java.lang.Override
  public boolean getWasEnabled() {
    return wasEnabled_;
  }

  public static final int WAS_SUBSEQUENT_FIELD_NUMBER = 3;
  private boolean wasSubsequent_;
  /**
   * <code>bool was_subsequent = 3;</code>
   * @return The wasSubsequent.
   */
  @java.lang.Override
  public boolean getWasSubsequent() {
    return wasSubsequent_;
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
    if (deviceServiceTelemetryId_ != POGOProtos.Rpc.DeviceServiceTelemetryIds.DEVICE_SERVICE_TELEMETRY_IDS_UNDEFINED_DEVICE_SERVICE.getNumber()) {
      output.writeEnum(1, deviceServiceTelemetryId_);
    }
    if (wasEnabled_ != false) {
      output.writeBool(2, wasEnabled_);
    }
    if (wasSubsequent_ != false) {
      output.writeBool(3, wasSubsequent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deviceServiceTelemetryId_ != POGOProtos.Rpc.DeviceServiceTelemetryIds.DEVICE_SERVICE_TELEMETRY_IDS_UNDEFINED_DEVICE_SERVICE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, deviceServiceTelemetryId_);
    }
    if (wasEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, wasEnabled_);
    }
    if (wasSubsequent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, wasSubsequent_);
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
    if (!(obj instanceof POGOProtos.Rpc.DeviceServiceToggleTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DeviceServiceToggleTelemetry other = (POGOProtos.Rpc.DeviceServiceToggleTelemetry) obj;

    if (deviceServiceTelemetryId_ != other.deviceServiceTelemetryId_) return false;
    if (getWasEnabled()
        != other.getWasEnabled()) return false;
    if (getWasSubsequent()
        != other.getWasSubsequent()) return false;
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
    hash = (37 * hash) + DEVICE_SERVICE_TELEMETRY_ID_FIELD_NUMBER;
    hash = (53 * hash) + deviceServiceTelemetryId_;
    hash = (37 * hash) + WAS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWasEnabled());
    hash = (37 * hash) + WAS_SUBSEQUENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWasSubsequent());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DeviceServiceToggleTelemetry prototype) {
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
   * <pre>
   * ref: ABIPCPGGNFD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DeviceServiceToggleTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DeviceServiceToggleTelemetry)
      POGOProtos.Rpc.DeviceServiceToggleTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceServiceToggleTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceServiceToggleTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DeviceServiceToggleTelemetry.class, POGOProtos.Rpc.DeviceServiceToggleTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DeviceServiceToggleTelemetry.newBuilder()
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
      deviceServiceTelemetryId_ = 0;

      wasEnabled_ = false;

      wasSubsequent_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeviceServiceToggleTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DeviceServiceToggleTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.DeviceServiceToggleTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DeviceServiceToggleTelemetry build() {
      POGOProtos.Rpc.DeviceServiceToggleTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DeviceServiceToggleTelemetry buildPartial() {
      POGOProtos.Rpc.DeviceServiceToggleTelemetry result = new POGOProtos.Rpc.DeviceServiceToggleTelemetry(this);
      result.deviceServiceTelemetryId_ = deviceServiceTelemetryId_;
      result.wasEnabled_ = wasEnabled_;
      result.wasSubsequent_ = wasSubsequent_;
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
      if (other instanceof POGOProtos.Rpc.DeviceServiceToggleTelemetry) {
        return mergeFrom((POGOProtos.Rpc.DeviceServiceToggleTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DeviceServiceToggleTelemetry other) {
      if (other == POGOProtos.Rpc.DeviceServiceToggleTelemetry.getDefaultInstance()) return this;
      if (other.deviceServiceTelemetryId_ != 0) {
        setDeviceServiceTelemetryIdValue(other.getDeviceServiceTelemetryIdValue());
      }
      if (other.getWasEnabled() != false) {
        setWasEnabled(other.getWasEnabled());
      }
      if (other.getWasSubsequent() != false) {
        setWasSubsequent(other.getWasSubsequent());
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
      POGOProtos.Rpc.DeviceServiceToggleTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DeviceServiceToggleTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int deviceServiceTelemetryId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.DeviceServiceTelemetryIds device_service_telemetry_id = 1;</code>
     * @return The enum numeric value on the wire for deviceServiceTelemetryId.
     */
    @java.lang.Override public int getDeviceServiceTelemetryIdValue() {
      return deviceServiceTelemetryId_;
    }
    /**
     * <code>.POGOProtos.Rpc.DeviceServiceTelemetryIds device_service_telemetry_id = 1;</code>
     * @param value The enum numeric value on the wire for deviceServiceTelemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceServiceTelemetryIdValue(int value) {
      
      deviceServiceTelemetryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DeviceServiceTelemetryIds device_service_telemetry_id = 1;</code>
     * @return The deviceServiceTelemetryId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.DeviceServiceTelemetryIds getDeviceServiceTelemetryId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DeviceServiceTelemetryIds result = POGOProtos.Rpc.DeviceServiceTelemetryIds.valueOf(deviceServiceTelemetryId_);
      return result == null ? POGOProtos.Rpc.DeviceServiceTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DeviceServiceTelemetryIds device_service_telemetry_id = 1;</code>
     * @param value The deviceServiceTelemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceServiceTelemetryId(POGOProtos.Rpc.DeviceServiceTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      deviceServiceTelemetryId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DeviceServiceTelemetryIds device_service_telemetry_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceServiceTelemetryId() {
      
      deviceServiceTelemetryId_ = 0;
      onChanged();
      return this;
    }

    private boolean wasEnabled_ ;
    /**
     * <code>bool was_enabled = 2;</code>
     * @return The wasEnabled.
     */
    @java.lang.Override
    public boolean getWasEnabled() {
      return wasEnabled_;
    }
    /**
     * <code>bool was_enabled = 2;</code>
     * @param value The wasEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setWasEnabled(boolean value) {
      
      wasEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool was_enabled = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWasEnabled() {
      
      wasEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean wasSubsequent_ ;
    /**
     * <code>bool was_subsequent = 3;</code>
     * @return The wasSubsequent.
     */
    @java.lang.Override
    public boolean getWasSubsequent() {
      return wasSubsequent_;
    }
    /**
     * <code>bool was_subsequent = 3;</code>
     * @param value The wasSubsequent to set.
     * @return This builder for chaining.
     */
    public Builder setWasSubsequent(boolean value) {
      
      wasSubsequent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool was_subsequent = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWasSubsequent() {
      
      wasSubsequent_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DeviceServiceToggleTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DeviceServiceToggleTelemetry)
  private static final POGOProtos.Rpc.DeviceServiceToggleTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DeviceServiceToggleTelemetry();
  }

  public static POGOProtos.Rpc.DeviceServiceToggleTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceServiceToggleTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<DeviceServiceToggleTelemetry>() {
    @java.lang.Override
    public DeviceServiceToggleTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceServiceToggleTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceServiceToggleTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceServiceToggleTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DeviceServiceToggleTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

