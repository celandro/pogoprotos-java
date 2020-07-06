// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Analytics/ClientTelemetryCommonFilter.proto

package POGOProtos.Data.Analytics;

/**
 * Protobuf type {@code POGOProtos.Data.Analytics.ClientTelemetryCommonFilter}
 */
public  final class ClientTelemetryCommonFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Analytics.ClientTelemetryCommonFilter)
    ClientTelemetryCommonFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientTelemetryCommonFilter.newBuilder() to construct.
  private ClientTelemetryCommonFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientTelemetryCommonFilter() {
    applicationIdentifier_ = "";
    operatingSystemName_ = "";
    deviceModel_ = "";
    localeCountryCode_ = "";
    localeLanguageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientTelemetryCommonFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientTelemetryCommonFilter(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            applicationIdentifier_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            operatingSystemName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceModel_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            localeCountryCode_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            localeLanguageCode_ = s;
            break;
          }
          case 49: {

            samplingProbability_ = input.readDouble();
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
    return POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.class, POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.Builder.class);
  }

  public static final int APPLICATION_IDENTIFIER_FIELD_NUMBER = 1;
  private volatile java.lang.Object applicationIdentifier_;
  /**
   * <code>string application_identifier = 1;</code>
   * @return The applicationIdentifier.
   */
  public java.lang.String getApplicationIdentifier() {
    java.lang.Object ref = applicationIdentifier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      applicationIdentifier_ = s;
      return s;
    }
  }
  /**
   * <code>string application_identifier = 1;</code>
   * @return The bytes for applicationIdentifier.
   */
  public com.google.protobuf.ByteString
      getApplicationIdentifierBytes() {
    java.lang.Object ref = applicationIdentifier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationIdentifier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATING_SYSTEM_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object operatingSystemName_;
  /**
   * <code>string operating_system_name = 2;</code>
   * @return The operatingSystemName.
   */
  public java.lang.String getOperatingSystemName() {
    java.lang.Object ref = operatingSystemName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operatingSystemName_ = s;
      return s;
    }
  }
  /**
   * <code>string operating_system_name = 2;</code>
   * @return The bytes for operatingSystemName.
   */
  public com.google.protobuf.ByteString
      getOperatingSystemNameBytes() {
    java.lang.Object ref = operatingSystemName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operatingSystemName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
  private volatile java.lang.Object deviceModel_;
  /**
   * <code>string device_model = 3;</code>
   * @return The deviceModel.
   */
  public java.lang.String getDeviceModel() {
    java.lang.Object ref = deviceModel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceModel_ = s;
      return s;
    }
  }
  /**
   * <code>string device_model = 3;</code>
   * @return The bytes for deviceModel.
   */
  public com.google.protobuf.ByteString
      getDeviceModelBytes() {
    java.lang.Object ref = deviceModel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceModel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCALE_COUNTRY_CODE_FIELD_NUMBER = 4;
  private volatile java.lang.Object localeCountryCode_;
  /**
   * <code>string locale_country_code = 4;</code>
   * @return The localeCountryCode.
   */
  public java.lang.String getLocaleCountryCode() {
    java.lang.Object ref = localeCountryCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localeCountryCode_ = s;
      return s;
    }
  }
  /**
   * <code>string locale_country_code = 4;</code>
   * @return The bytes for localeCountryCode.
   */
  public com.google.protobuf.ByteString
      getLocaleCountryCodeBytes() {
    java.lang.Object ref = localeCountryCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      localeCountryCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCALE_LANGUAGE_CODE_FIELD_NUMBER = 5;
  private volatile java.lang.Object localeLanguageCode_;
  /**
   * <code>string locale_language_code = 5;</code>
   * @return The localeLanguageCode.
   */
  public java.lang.String getLocaleLanguageCode() {
    java.lang.Object ref = localeLanguageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localeLanguageCode_ = s;
      return s;
    }
  }
  /**
   * <code>string locale_language_code = 5;</code>
   * @return The bytes for localeLanguageCode.
   */
  public com.google.protobuf.ByteString
      getLocaleLanguageCodeBytes() {
    java.lang.Object ref = localeLanguageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      localeLanguageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAMPLING_PROBABILITY_FIELD_NUMBER = 6;
  private double samplingProbability_;
  /**
   * <code>double sampling_probability = 6;</code>
   * @return The samplingProbability.
   */
  public double getSamplingProbability() {
    return samplingProbability_;
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
    if (!getApplicationIdentifierBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, applicationIdentifier_);
    }
    if (!getOperatingSystemNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operatingSystemName_);
    }
    if (!getDeviceModelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deviceModel_);
    }
    if (!getLocaleCountryCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, localeCountryCode_);
    }
    if (!getLocaleLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, localeLanguageCode_);
    }
    if (samplingProbability_ != 0D) {
      output.writeDouble(6, samplingProbability_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getApplicationIdentifierBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, applicationIdentifier_);
    }
    if (!getOperatingSystemNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operatingSystemName_);
    }
    if (!getDeviceModelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deviceModel_);
    }
    if (!getLocaleCountryCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, localeCountryCode_);
    }
    if (!getLocaleLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, localeLanguageCode_);
    }
    if (samplingProbability_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, samplingProbability_);
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
    if (!(obj instanceof POGOProtos.Data.Analytics.ClientTelemetryCommonFilter)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Analytics.ClientTelemetryCommonFilter other = (POGOProtos.Data.Analytics.ClientTelemetryCommonFilter) obj;

    if (!getApplicationIdentifier()
        .equals(other.getApplicationIdentifier())) return false;
    if (!getOperatingSystemName()
        .equals(other.getOperatingSystemName())) return false;
    if (!getDeviceModel()
        .equals(other.getDeviceModel())) return false;
    if (!getLocaleCountryCode()
        .equals(other.getLocaleCountryCode())) return false;
    if (!getLocaleLanguageCode()
        .equals(other.getLocaleLanguageCode())) return false;
    if (java.lang.Double.doubleToLongBits(getSamplingProbability())
        != java.lang.Double.doubleToLongBits(
            other.getSamplingProbability())) return false;
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
    hash = (37 * hash) + APPLICATION_IDENTIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationIdentifier().hashCode();
    hash = (37 * hash) + OPERATING_SYSTEM_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getOperatingSystemName().hashCode();
    hash = (37 * hash) + DEVICE_MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceModel().hashCode();
    hash = (37 * hash) + LOCALE_COUNTRY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLocaleCountryCode().hashCode();
    hash = (37 * hash) + LOCALE_LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLocaleLanguageCode().hashCode();
    hash = (37 * hash) + SAMPLING_PROBABILITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSamplingProbability()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Analytics.ClientTelemetryCommonFilter prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Analytics.ClientTelemetryCommonFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Analytics.ClientTelemetryCommonFilter)
      POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.class, POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.Builder.class);
    }

    // Construct using POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.newBuilder()
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
      applicationIdentifier_ = "";

      operatingSystemName_ = "";

      deviceModel_ = "";

      localeCountryCode_ = "";

      localeLanguageCode_ = "";

      samplingProbability_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Analytics.ClientTelemetryCommonFilter getDefaultInstanceForType() {
      return POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Analytics.ClientTelemetryCommonFilter build() {
      POGOProtos.Data.Analytics.ClientTelemetryCommonFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Analytics.ClientTelemetryCommonFilter buildPartial() {
      POGOProtos.Data.Analytics.ClientTelemetryCommonFilter result = new POGOProtos.Data.Analytics.ClientTelemetryCommonFilter(this);
      result.applicationIdentifier_ = applicationIdentifier_;
      result.operatingSystemName_ = operatingSystemName_;
      result.deviceModel_ = deviceModel_;
      result.localeCountryCode_ = localeCountryCode_;
      result.localeLanguageCode_ = localeLanguageCode_;
      result.samplingProbability_ = samplingProbability_;
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
      if (other instanceof POGOProtos.Data.Analytics.ClientTelemetryCommonFilter) {
        return mergeFrom((POGOProtos.Data.Analytics.ClientTelemetryCommonFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Analytics.ClientTelemetryCommonFilter other) {
      if (other == POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.getDefaultInstance()) return this;
      if (!other.getApplicationIdentifier().isEmpty()) {
        applicationIdentifier_ = other.applicationIdentifier_;
        onChanged();
      }
      if (!other.getOperatingSystemName().isEmpty()) {
        operatingSystemName_ = other.operatingSystemName_;
        onChanged();
      }
      if (!other.getDeviceModel().isEmpty()) {
        deviceModel_ = other.deviceModel_;
        onChanged();
      }
      if (!other.getLocaleCountryCode().isEmpty()) {
        localeCountryCode_ = other.localeCountryCode_;
        onChanged();
      }
      if (!other.getLocaleLanguageCode().isEmpty()) {
        localeLanguageCode_ = other.localeLanguageCode_;
        onChanged();
      }
      if (other.getSamplingProbability() != 0D) {
        setSamplingProbability(other.getSamplingProbability());
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
      POGOProtos.Data.Analytics.ClientTelemetryCommonFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Analytics.ClientTelemetryCommonFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object applicationIdentifier_ = "";
    /**
     * <code>string application_identifier = 1;</code>
     * @return The applicationIdentifier.
     */
    public java.lang.String getApplicationIdentifier() {
      java.lang.Object ref = applicationIdentifier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applicationIdentifier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string application_identifier = 1;</code>
     * @return The bytes for applicationIdentifier.
     */
    public com.google.protobuf.ByteString
        getApplicationIdentifierBytes() {
      java.lang.Object ref = applicationIdentifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string application_identifier = 1;</code>
     * @param value The applicationIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationIdentifier(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      applicationIdentifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string application_identifier = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationIdentifier() {
      
      applicationIdentifier_ = getDefaultInstance().getApplicationIdentifier();
      onChanged();
      return this;
    }
    /**
     * <code>string application_identifier = 1;</code>
     * @param value The bytes for applicationIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationIdentifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      applicationIdentifier_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object operatingSystemName_ = "";
    /**
     * <code>string operating_system_name = 2;</code>
     * @return The operatingSystemName.
     */
    public java.lang.String getOperatingSystemName() {
      java.lang.Object ref = operatingSystemName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operatingSystemName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string operating_system_name = 2;</code>
     * @return The bytes for operatingSystemName.
     */
    public com.google.protobuf.ByteString
        getOperatingSystemNameBytes() {
      java.lang.Object ref = operatingSystemName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operatingSystemName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operating_system_name = 2;</code>
     * @param value The operatingSystemName to set.
     * @return This builder for chaining.
     */
    public Builder setOperatingSystemName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operatingSystemName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string operating_system_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperatingSystemName() {
      
      operatingSystemName_ = getDefaultInstance().getOperatingSystemName();
      onChanged();
      return this;
    }
    /**
     * <code>string operating_system_name = 2;</code>
     * @param value The bytes for operatingSystemName to set.
     * @return This builder for chaining.
     */
    public Builder setOperatingSystemNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operatingSystemName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deviceModel_ = "";
    /**
     * <code>string device_model = 3;</code>
     * @return The deviceModel.
     */
    public java.lang.String getDeviceModel() {
      java.lang.Object ref = deviceModel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceModel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_model = 3;</code>
     * @return The bytes for deviceModel.
     */
    public com.google.protobuf.ByteString
        getDeviceModelBytes() {
      java.lang.Object ref = deviceModel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_model = 3;</code>
     * @param value The deviceModel to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceModel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device_model = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceModel() {
      
      deviceModel_ = getDefaultInstance().getDeviceModel();
      onChanged();
      return this;
    }
    /**
     * <code>string device_model = 3;</code>
     * @param value The bytes for deviceModel to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceModel_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object localeCountryCode_ = "";
    /**
     * <code>string locale_country_code = 4;</code>
     * @return The localeCountryCode.
     */
    public java.lang.String getLocaleCountryCode() {
      java.lang.Object ref = localeCountryCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localeCountryCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string locale_country_code = 4;</code>
     * @return The bytes for localeCountryCode.
     */
    public com.google.protobuf.ByteString
        getLocaleCountryCodeBytes() {
      java.lang.Object ref = localeCountryCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localeCountryCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string locale_country_code = 4;</code>
     * @param value The localeCountryCode to set.
     * @return This builder for chaining.
     */
    public Builder setLocaleCountryCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      localeCountryCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string locale_country_code = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocaleCountryCode() {
      
      localeCountryCode_ = getDefaultInstance().getLocaleCountryCode();
      onChanged();
      return this;
    }
    /**
     * <code>string locale_country_code = 4;</code>
     * @param value The bytes for localeCountryCode to set.
     * @return This builder for chaining.
     */
    public Builder setLocaleCountryCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      localeCountryCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object localeLanguageCode_ = "";
    /**
     * <code>string locale_language_code = 5;</code>
     * @return The localeLanguageCode.
     */
    public java.lang.String getLocaleLanguageCode() {
      java.lang.Object ref = localeLanguageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localeLanguageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string locale_language_code = 5;</code>
     * @return The bytes for localeLanguageCode.
     */
    public com.google.protobuf.ByteString
        getLocaleLanguageCodeBytes() {
      java.lang.Object ref = localeLanguageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localeLanguageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string locale_language_code = 5;</code>
     * @param value The localeLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLocaleLanguageCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      localeLanguageCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string locale_language_code = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocaleLanguageCode() {
      
      localeLanguageCode_ = getDefaultInstance().getLocaleLanguageCode();
      onChanged();
      return this;
    }
    /**
     * <code>string locale_language_code = 5;</code>
     * @param value The bytes for localeLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLocaleLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      localeLanguageCode_ = value;
      onChanged();
      return this;
    }

    private double samplingProbability_ ;
    /**
     * <code>double sampling_probability = 6;</code>
     * @return The samplingProbability.
     */
    public double getSamplingProbability() {
      return samplingProbability_;
    }
    /**
     * <code>double sampling_probability = 6;</code>
     * @param value The samplingProbability to set.
     * @return This builder for chaining.
     */
    public Builder setSamplingProbability(double value) {
      
      samplingProbability_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double sampling_probability = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSamplingProbability() {
      
      samplingProbability_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Analytics.ClientTelemetryCommonFilter)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Analytics.ClientTelemetryCommonFilter)
  private static final POGOProtos.Data.Analytics.ClientTelemetryCommonFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Analytics.ClientTelemetryCommonFilter();
  }

  public static POGOProtos.Data.Analytics.ClientTelemetryCommonFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientTelemetryCommonFilter>
      PARSER = new com.google.protobuf.AbstractParser<ClientTelemetryCommonFilter>() {
    @java.lang.Override
    public ClientTelemetryCommonFilter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientTelemetryCommonFilter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientTelemetryCommonFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientTelemetryCommonFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Analytics.ClientTelemetryCommonFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

