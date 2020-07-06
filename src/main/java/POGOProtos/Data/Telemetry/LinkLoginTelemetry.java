// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/LinkLoginTelemetry.proto

package POGOProtos.Data.Telemetry;

/**
 * Protobuf type {@code POGOProtos.Data.Telemetry.LinkLoginTelemetry}
 */
public  final class LinkLoginTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Telemetry.LinkLoginTelemetry)
    LinkLoginTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LinkLoginTelemetry.newBuilder() to construct.
  private LinkLoginTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LinkLoginTelemetry() {
    success_ = "";
    error_ = "";
    activeAuthProviderId_ = "";
    provider_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LinkLoginTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LinkLoginTelemetry(
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

            linked_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            success_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            error_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            activeAuthProviderId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            provider_ = s;
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
    return POGOProtos.Data.Telemetry.LinkLoginTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_LinkLoginTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Telemetry.LinkLoginTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_LinkLoginTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Telemetry.LinkLoginTelemetry.class, POGOProtos.Data.Telemetry.LinkLoginTelemetry.Builder.class);
  }

  public static final int LINKED_FIELD_NUMBER = 1;
  private boolean linked_;
  /**
   * <code>bool linked = 1;</code>
   * @return The linked.
   */
  public boolean getLinked() {
    return linked_;
  }

  public static final int SUCCESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object success_;
  /**
   * <code>string success = 2;</code>
   * @return The success.
   */
  public java.lang.String getSuccess() {
    java.lang.Object ref = success_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      success_ = s;
      return s;
    }
  }
  /**
   * <code>string success = 2;</code>
   * @return The bytes for success.
   */
  public com.google.protobuf.ByteString
      getSuccessBytes() {
    java.lang.Object ref = success_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      success_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  private volatile java.lang.Object error_;
  /**
   * <code>string error = 3;</code>
   * @return The error.
   */
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <code>string error = 3;</code>
   * @return The bytes for error.
   */
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTIVE_AUTH_PROVIDER_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object activeAuthProviderId_;
  /**
   * <code>string active_auth_provider_id = 4;</code>
   * @return The activeAuthProviderId.
   */
  public java.lang.String getActiveAuthProviderId() {
    java.lang.Object ref = activeAuthProviderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      activeAuthProviderId_ = s;
      return s;
    }
  }
  /**
   * <code>string active_auth_provider_id = 4;</code>
   * @return The bytes for activeAuthProviderId.
   */
  public com.google.protobuf.ByteString
      getActiveAuthProviderIdBytes() {
    java.lang.Object ref = activeAuthProviderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      activeAuthProviderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROVIDER_FIELD_NUMBER = 5;
  private volatile java.lang.Object provider_;
  /**
   * <code>string provider = 5;</code>
   * @return The provider.
   */
  public java.lang.String getProvider() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provider_ = s;
      return s;
    }
  }
  /**
   * <code>string provider = 5;</code>
   * @return The bytes for provider.
   */
  public com.google.protobuf.ByteString
      getProviderBytes() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      provider_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (linked_ != false) {
      output.writeBool(1, linked_);
    }
    if (!getSuccessBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, success_);
    }
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, error_);
    }
    if (!getActiveAuthProviderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, activeAuthProviderId_);
    }
    if (!getProviderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, provider_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (linked_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, linked_);
    }
    if (!getSuccessBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, success_);
    }
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, error_);
    }
    if (!getActiveAuthProviderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, activeAuthProviderId_);
    }
    if (!getProviderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, provider_);
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
    if (!(obj instanceof POGOProtos.Data.Telemetry.LinkLoginTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Telemetry.LinkLoginTelemetry other = (POGOProtos.Data.Telemetry.LinkLoginTelemetry) obj;

    if (getLinked()
        != other.getLinked()) return false;
    if (!getSuccess()
        .equals(other.getSuccess())) return false;
    if (!getError()
        .equals(other.getError())) return false;
    if (!getActiveAuthProviderId()
        .equals(other.getActiveAuthProviderId())) return false;
    if (!getProvider()
        .equals(other.getProvider())) return false;
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
    hash = (37 * hash) + LINKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLinked());
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + getSuccess().hashCode();
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (37 * hash) + ACTIVE_AUTH_PROVIDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getActiveAuthProviderId().hashCode();
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getProvider().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Telemetry.LinkLoginTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Telemetry.LinkLoginTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Telemetry.LinkLoginTelemetry)
      POGOProtos.Data.Telemetry.LinkLoginTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Telemetry.LinkLoginTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_LinkLoginTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Telemetry.LinkLoginTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_LinkLoginTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Telemetry.LinkLoginTelemetry.class, POGOProtos.Data.Telemetry.LinkLoginTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Data.Telemetry.LinkLoginTelemetry.newBuilder()
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
      linked_ = false;

      success_ = "";

      error_ = "";

      activeAuthProviderId_ = "";

      provider_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Telemetry.LinkLoginTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_LinkLoginTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.LinkLoginTelemetry getDefaultInstanceForType() {
      return POGOProtos.Data.Telemetry.LinkLoginTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.LinkLoginTelemetry build() {
      POGOProtos.Data.Telemetry.LinkLoginTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.LinkLoginTelemetry buildPartial() {
      POGOProtos.Data.Telemetry.LinkLoginTelemetry result = new POGOProtos.Data.Telemetry.LinkLoginTelemetry(this);
      result.linked_ = linked_;
      result.success_ = success_;
      result.error_ = error_;
      result.activeAuthProviderId_ = activeAuthProviderId_;
      result.provider_ = provider_;
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
      if (other instanceof POGOProtos.Data.Telemetry.LinkLoginTelemetry) {
        return mergeFrom((POGOProtos.Data.Telemetry.LinkLoginTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Telemetry.LinkLoginTelemetry other) {
      if (other == POGOProtos.Data.Telemetry.LinkLoginTelemetry.getDefaultInstance()) return this;
      if (other.getLinked() != false) {
        setLinked(other.getLinked());
      }
      if (!other.getSuccess().isEmpty()) {
        success_ = other.success_;
        onChanged();
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (!other.getActiveAuthProviderId().isEmpty()) {
        activeAuthProviderId_ = other.activeAuthProviderId_;
        onChanged();
      }
      if (!other.getProvider().isEmpty()) {
        provider_ = other.provider_;
        onChanged();
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
      POGOProtos.Data.Telemetry.LinkLoginTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Telemetry.LinkLoginTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean linked_ ;
    /**
     * <code>bool linked = 1;</code>
     * @return The linked.
     */
    public boolean getLinked() {
      return linked_;
    }
    /**
     * <code>bool linked = 1;</code>
     * @param value The linked to set.
     * @return This builder for chaining.
     */
    public Builder setLinked(boolean value) {
      
      linked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool linked = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLinked() {
      
      linked_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object success_ = "";
    /**
     * <code>string success = 2;</code>
     * @return The success.
     */
    public java.lang.String getSuccess() {
      java.lang.Object ref = success_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        success_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string success = 2;</code>
     * @return The bytes for success.
     */
    public com.google.protobuf.ByteString
        getSuccessBytes() {
      java.lang.Object ref = success_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        success_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string success = 2;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string success = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = getDefaultInstance().getSuccess();
      onChanged();
      return this;
    }
    /**
     * <code>string success = 2;</code>
     * @param value The bytes for success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccessBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      success_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>string error = 3;</code>
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error = 3;</code>
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error = 3;</code>
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>string error = 3;</code>
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object activeAuthProviderId_ = "";
    /**
     * <code>string active_auth_provider_id = 4;</code>
     * @return The activeAuthProviderId.
     */
    public java.lang.String getActiveAuthProviderId() {
      java.lang.Object ref = activeAuthProviderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        activeAuthProviderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string active_auth_provider_id = 4;</code>
     * @return The bytes for activeAuthProviderId.
     */
    public com.google.protobuf.ByteString
        getActiveAuthProviderIdBytes() {
      java.lang.Object ref = activeAuthProviderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        activeAuthProviderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string active_auth_provider_id = 4;</code>
     * @param value The activeAuthProviderId to set.
     * @return This builder for chaining.
     */
    public Builder setActiveAuthProviderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      activeAuthProviderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string active_auth_provider_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveAuthProviderId() {
      
      activeAuthProviderId_ = getDefaultInstance().getActiveAuthProviderId();
      onChanged();
      return this;
    }
    /**
     * <code>string active_auth_provider_id = 4;</code>
     * @param value The bytes for activeAuthProviderId to set.
     * @return This builder for chaining.
     */
    public Builder setActiveAuthProviderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      activeAuthProviderId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object provider_ = "";
    /**
     * <code>string provider = 5;</code>
     * @return The provider.
     */
    public java.lang.String getProvider() {
      java.lang.Object ref = provider_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provider_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string provider = 5;</code>
     * @return The bytes for provider.
     */
    public com.google.protobuf.ByteString
        getProviderBytes() {
      java.lang.Object ref = provider_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        provider_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string provider = 5;</code>
     * @param value The provider to set.
     * @return This builder for chaining.
     */
    public Builder setProvider(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      provider_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string provider = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearProvider() {
      
      provider_ = getDefaultInstance().getProvider();
      onChanged();
      return this;
    }
    /**
     * <code>string provider = 5;</code>
     * @param value The bytes for provider to set.
     * @return This builder for chaining.
     */
    public Builder setProviderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      provider_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Telemetry.LinkLoginTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Telemetry.LinkLoginTelemetry)
  private static final POGOProtos.Data.Telemetry.LinkLoginTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Telemetry.LinkLoginTelemetry();
  }

  public static POGOProtos.Data.Telemetry.LinkLoginTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinkLoginTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<LinkLoginTelemetry>() {
    @java.lang.Override
    public LinkLoginTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LinkLoginTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LinkLoginTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinkLoginTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Telemetry.LinkLoginTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

