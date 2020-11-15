// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Weather/WeatherAlert.proto

package POGOProtos.Map.Weather;

/**
 * Protobuf type {@code POGOProtos.Map.Weather.WeatherAlert}
 */
public final class WeatherAlert extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Map.Weather.WeatherAlert)
    WeatherAlertOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeatherAlert.newBuilder() to construct.
  private WeatherAlert(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeatherAlert() {
    severity_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeatherAlert();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeatherAlert(
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

            severity_ = rawValue;
            break;
          }
          case 16: {

            warnWeather_ = input.readBool();
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
    return POGOProtos.Map.Weather.WeatherAlertOuterClass.internal_static_POGOProtos_Map_Weather_WeatherAlert_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Map.Weather.WeatherAlertOuterClass.internal_static_POGOProtos_Map_Weather_WeatherAlert_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Map.Weather.WeatherAlert.class, POGOProtos.Map.Weather.WeatherAlert.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Map.Weather.WeatherAlert.Severity}
   */
  public enum Severity
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 0;</code>
     */
    NONE(0),
    /**
     * <code>MODERATE = 1;</code>
     */
    MODERATE(1),
    /**
     * <code>EXTREME = 2;</code>
     */
    EXTREME(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <code>MODERATE = 1;</code>
     */
    public static final int MODERATE_VALUE = 1;
    /**
     * <code>EXTREME = 2;</code>
     */
    public static final int EXTREME_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Severity valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Severity forNumber(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return MODERATE;
        case 2: return EXTREME;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Severity>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Severity> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
            public Severity findValueByNumber(int number) {
              return Severity.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Map.Weather.WeatherAlert.getDescriptor().getEnumTypes().get(0);
    }

    private static final Severity[] VALUES = values();

    public static Severity valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Severity(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Map.Weather.WeatherAlert.Severity)
  }

  public static final int SEVERITY_FIELD_NUMBER = 1;
  private int severity_;
  /**
   * <code>.POGOProtos.Map.Weather.WeatherAlert.Severity severity = 1;</code>
   * @return The enum numeric value on the wire for severity.
   */
  @java.lang.Override public int getSeverityValue() {
    return severity_;
  }
  /**
   * <code>.POGOProtos.Map.Weather.WeatherAlert.Severity severity = 1;</code>
   * @return The severity.
   */
  @java.lang.Override public POGOProtos.Map.Weather.WeatherAlert.Severity getSeverity() {
    @SuppressWarnings("deprecation")
    POGOProtos.Map.Weather.WeatherAlert.Severity result = POGOProtos.Map.Weather.WeatherAlert.Severity.valueOf(severity_);
    return result == null ? POGOProtos.Map.Weather.WeatherAlert.Severity.UNRECOGNIZED : result;
  }

  public static final int WARN_WEATHER_FIELD_NUMBER = 2;
  private boolean warnWeather_;
  /**
   * <code>bool warn_weather = 2;</code>
   * @return The warnWeather.
   */
  @java.lang.Override
  public boolean getWarnWeather() {
    return warnWeather_;
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
    if (severity_ != POGOProtos.Map.Weather.WeatherAlert.Severity.NONE.getNumber()) {
      output.writeEnum(1, severity_);
    }
    if (warnWeather_ != false) {
      output.writeBool(2, warnWeather_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (severity_ != POGOProtos.Map.Weather.WeatherAlert.Severity.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, severity_);
    }
    if (warnWeather_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, warnWeather_);
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
    if (!(obj instanceof POGOProtos.Map.Weather.WeatherAlert)) {
      return super.equals(obj);
    }
    POGOProtos.Map.Weather.WeatherAlert other = (POGOProtos.Map.Weather.WeatherAlert) obj;

    if (severity_ != other.severity_) return false;
    if (getWarnWeather()
        != other.getWarnWeather()) return false;
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
    hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
    hash = (53 * hash) + severity_;
    hash = (37 * hash) + WARN_WEATHER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWarnWeather());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Map.Weather.WeatherAlert parseFrom(
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
  public static Builder newBuilder(POGOProtos.Map.Weather.WeatherAlert prototype) {
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
   * Protobuf type {@code POGOProtos.Map.Weather.WeatherAlert}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Map.Weather.WeatherAlert)
      POGOProtos.Map.Weather.WeatherAlertOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Map.Weather.WeatherAlertOuterClass.internal_static_POGOProtos_Map_Weather_WeatherAlert_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Map.Weather.WeatherAlertOuterClass.internal_static_POGOProtos_Map_Weather_WeatherAlert_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Map.Weather.WeatherAlert.class, POGOProtos.Map.Weather.WeatherAlert.Builder.class);
    }

    // Construct using POGOProtos.Map.Weather.WeatherAlert.newBuilder()
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
      severity_ = 0;

      warnWeather_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Map.Weather.WeatherAlertOuterClass.internal_static_POGOProtos_Map_Weather_WeatherAlert_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Map.Weather.WeatherAlert getDefaultInstanceForType() {
      return POGOProtos.Map.Weather.WeatherAlert.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Map.Weather.WeatherAlert build() {
      POGOProtos.Map.Weather.WeatherAlert result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Map.Weather.WeatherAlert buildPartial() {
      POGOProtos.Map.Weather.WeatherAlert result = new POGOProtos.Map.Weather.WeatherAlert(this);
      result.severity_ = severity_;
      result.warnWeather_ = warnWeather_;
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
      if (other instanceof POGOProtos.Map.Weather.WeatherAlert) {
        return mergeFrom((POGOProtos.Map.Weather.WeatherAlert)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Map.Weather.WeatherAlert other) {
      if (other == POGOProtos.Map.Weather.WeatherAlert.getDefaultInstance()) return this;
      if (other.severity_ != 0) {
        setSeverityValue(other.getSeverityValue());
      }
      if (other.getWarnWeather() != false) {
        setWarnWeather(other.getWarnWeather());
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
      POGOProtos.Map.Weather.WeatherAlert parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Map.Weather.WeatherAlert) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int severity_ = 0;
    /**
     * <code>.POGOProtos.Map.Weather.WeatherAlert.Severity severity = 1;</code>
     * @return The enum numeric value on the wire for severity.
     */
    @java.lang.Override public int getSeverityValue() {
      return severity_;
    }
    /**
     * <code>.POGOProtos.Map.Weather.WeatherAlert.Severity severity = 1;</code>
     * @param value The enum numeric value on the wire for severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverityValue(int value) {
      
      severity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Map.Weather.WeatherAlert.Severity severity = 1;</code>
     * @return The severity.
     */
    @java.lang.Override
    public POGOProtos.Map.Weather.WeatherAlert.Severity getSeverity() {
      @SuppressWarnings("deprecation")
      POGOProtos.Map.Weather.WeatherAlert.Severity result = POGOProtos.Map.Weather.WeatherAlert.Severity.valueOf(severity_);
      return result == null ? POGOProtos.Map.Weather.WeatherAlert.Severity.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Map.Weather.WeatherAlert.Severity severity = 1;</code>
     * @param value The severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverity(POGOProtos.Map.Weather.WeatherAlert.Severity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      severity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Map.Weather.WeatherAlert.Severity severity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeverity() {
      
      severity_ = 0;
      onChanged();
      return this;
    }

    private boolean warnWeather_ ;
    /**
     * <code>bool warn_weather = 2;</code>
     * @return The warnWeather.
     */
    @java.lang.Override
    public boolean getWarnWeather() {
      return warnWeather_;
    }
    /**
     * <code>bool warn_weather = 2;</code>
     * @param value The warnWeather to set.
     * @return This builder for chaining.
     */
    public Builder setWarnWeather(boolean value) {
      
      warnWeather_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool warn_weather = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWarnWeather() {
      
      warnWeather_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Map.Weather.WeatherAlert)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Map.Weather.WeatherAlert)
  private static final POGOProtos.Map.Weather.WeatherAlert DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Map.Weather.WeatherAlert();
  }

  public static POGOProtos.Map.Weather.WeatherAlert getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeatherAlert>
      PARSER = new com.google.protobuf.AbstractParser<WeatherAlert>() {
    @java.lang.Override
    public WeatherAlert parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeatherAlert(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeatherAlert> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeatherAlert> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Map.Weather.WeatherAlert getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

