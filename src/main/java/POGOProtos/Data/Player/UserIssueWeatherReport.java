// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/UserIssueWeatherReport.proto

package POGOProtos.Data.Player;

/**
 * Protobuf type {@code POGOProtos.Data.Player.UserIssueWeatherReport}
 */
public final class UserIssueWeatherReport extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Player.UserIssueWeatherReport)
    UserIssueWeatherReportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserIssueWeatherReport.newBuilder() to construct.
  private UserIssueWeatherReport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserIssueWeatherReport() {
    gameplayerWeather_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserIssueWeatherReport();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserIssueWeatherReport(
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

            gameplayerWeather_ = s;
            break;
          }
          case 16: {

            alertActive_ = input.readBool();
            break;
          }
          case 24: {

            severity_ = input.readInt32();
            break;
          }
          case 32: {

            userReport_ = input.readInt32();
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
    return POGOProtos.Data.Player.UserIssueWeatherReportOuterClass.internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Player.UserIssueWeatherReportOuterClass.internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Player.UserIssueWeatherReport.class, POGOProtos.Data.Player.UserIssueWeatherReport.Builder.class);
  }

  public static final int GAMEPLAYER_WEATHER_FIELD_NUMBER = 1;
  private volatile java.lang.Object gameplayerWeather_;
  /**
   * <code>string gameplayer_weather = 1;</code>
   * @return The gameplayerWeather.
   */
  @java.lang.Override
  public java.lang.String getGameplayerWeather() {
    java.lang.Object ref = gameplayerWeather_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gameplayerWeather_ = s;
      return s;
    }
  }
  /**
   * <code>string gameplayer_weather = 1;</code>
   * @return The bytes for gameplayerWeather.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGameplayerWeatherBytes() {
    java.lang.Object ref = gameplayerWeather_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gameplayerWeather_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALERT_ACTIVE_FIELD_NUMBER = 2;
  private boolean alertActive_;
  /**
   * <code>bool alert_active = 2;</code>
   * @return The alertActive.
   */
  @java.lang.Override
  public boolean getAlertActive() {
    return alertActive_;
  }

  public static final int SEVERITY_FIELD_NUMBER = 3;
  private int severity_;
  /**
   * <code>int32 severity = 3;</code>
   * @return The severity.
   */
  @java.lang.Override
  public int getSeverity() {
    return severity_;
  }

  public static final int USER_REPORT_FIELD_NUMBER = 4;
  private int userReport_;
  /**
   * <code>int32 user_report = 4;</code>
   * @return The userReport.
   */
  @java.lang.Override
  public int getUserReport() {
    return userReport_;
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
    if (!getGameplayerWeatherBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gameplayerWeather_);
    }
    if (alertActive_ != false) {
      output.writeBool(2, alertActive_);
    }
    if (severity_ != 0) {
      output.writeInt32(3, severity_);
    }
    if (userReport_ != 0) {
      output.writeInt32(4, userReport_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGameplayerWeatherBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gameplayerWeather_);
    }
    if (alertActive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, alertActive_);
    }
    if (severity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, severity_);
    }
    if (userReport_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, userReport_);
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
    if (!(obj instanceof POGOProtos.Data.Player.UserIssueWeatherReport)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Player.UserIssueWeatherReport other = (POGOProtos.Data.Player.UserIssueWeatherReport) obj;

    if (!getGameplayerWeather()
        .equals(other.getGameplayerWeather())) return false;
    if (getAlertActive()
        != other.getAlertActive()) return false;
    if (getSeverity()
        != other.getSeverity()) return false;
    if (getUserReport()
        != other.getUserReport()) return false;
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
    hash = (37 * hash) + GAMEPLAYER_WEATHER_FIELD_NUMBER;
    hash = (53 * hash) + getGameplayerWeather().hashCode();
    hash = (37 * hash) + ALERT_ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAlertActive());
    hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
    hash = (53 * hash) + getSeverity();
    hash = (37 * hash) + USER_REPORT_FIELD_NUMBER;
    hash = (53 * hash) + getUserReport();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Player.UserIssueWeatherReport parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Player.UserIssueWeatherReport prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Player.UserIssueWeatherReport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Player.UserIssueWeatherReport)
      POGOProtos.Data.Player.UserIssueWeatherReportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Player.UserIssueWeatherReportOuterClass.internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Player.UserIssueWeatherReportOuterClass.internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Player.UserIssueWeatherReport.class, POGOProtos.Data.Player.UserIssueWeatherReport.Builder.class);
    }

    // Construct using POGOProtos.Data.Player.UserIssueWeatherReport.newBuilder()
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
      gameplayerWeather_ = "";

      alertActive_ = false;

      severity_ = 0;

      userReport_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Player.UserIssueWeatherReportOuterClass.internal_static_POGOProtos_Data_Player_UserIssueWeatherReport_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Player.UserIssueWeatherReport getDefaultInstanceForType() {
      return POGOProtos.Data.Player.UserIssueWeatherReport.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Player.UserIssueWeatherReport build() {
      POGOProtos.Data.Player.UserIssueWeatherReport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Player.UserIssueWeatherReport buildPartial() {
      POGOProtos.Data.Player.UserIssueWeatherReport result = new POGOProtos.Data.Player.UserIssueWeatherReport(this);
      result.gameplayerWeather_ = gameplayerWeather_;
      result.alertActive_ = alertActive_;
      result.severity_ = severity_;
      result.userReport_ = userReport_;
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
      if (other instanceof POGOProtos.Data.Player.UserIssueWeatherReport) {
        return mergeFrom((POGOProtos.Data.Player.UserIssueWeatherReport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Player.UserIssueWeatherReport other) {
      if (other == POGOProtos.Data.Player.UserIssueWeatherReport.getDefaultInstance()) return this;
      if (!other.getGameplayerWeather().isEmpty()) {
        gameplayerWeather_ = other.gameplayerWeather_;
        onChanged();
      }
      if (other.getAlertActive() != false) {
        setAlertActive(other.getAlertActive());
      }
      if (other.getSeverity() != 0) {
        setSeverity(other.getSeverity());
      }
      if (other.getUserReport() != 0) {
        setUserReport(other.getUserReport());
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
      POGOProtos.Data.Player.UserIssueWeatherReport parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Player.UserIssueWeatherReport) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object gameplayerWeather_ = "";
    /**
     * <code>string gameplayer_weather = 1;</code>
     * @return The gameplayerWeather.
     */
    public java.lang.String getGameplayerWeather() {
      java.lang.Object ref = gameplayerWeather_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gameplayerWeather_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gameplayer_weather = 1;</code>
     * @return The bytes for gameplayerWeather.
     */
    public com.google.protobuf.ByteString
        getGameplayerWeatherBytes() {
      java.lang.Object ref = gameplayerWeather_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameplayerWeather_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gameplayer_weather = 1;</code>
     * @param value The gameplayerWeather to set.
     * @return This builder for chaining.
     */
    public Builder setGameplayerWeather(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gameplayerWeather_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gameplayer_weather = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGameplayerWeather() {
      
      gameplayerWeather_ = getDefaultInstance().getGameplayerWeather();
      onChanged();
      return this;
    }
    /**
     * <code>string gameplayer_weather = 1;</code>
     * @param value The bytes for gameplayerWeather to set.
     * @return This builder for chaining.
     */
    public Builder setGameplayerWeatherBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gameplayerWeather_ = value;
      onChanged();
      return this;
    }

    private boolean alertActive_ ;
    /**
     * <code>bool alert_active = 2;</code>
     * @return The alertActive.
     */
    @java.lang.Override
    public boolean getAlertActive() {
      return alertActive_;
    }
    /**
     * <code>bool alert_active = 2;</code>
     * @param value The alertActive to set.
     * @return This builder for chaining.
     */
    public Builder setAlertActive(boolean value) {
      
      alertActive_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool alert_active = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlertActive() {
      
      alertActive_ = false;
      onChanged();
      return this;
    }

    private int severity_ ;
    /**
     * <code>int32 severity = 3;</code>
     * @return The severity.
     */
    @java.lang.Override
    public int getSeverity() {
      return severity_;
    }
    /**
     * <code>int32 severity = 3;</code>
     * @param value The severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverity(int value) {
      
      severity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 severity = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeverity() {
      
      severity_ = 0;
      onChanged();
      return this;
    }

    private int userReport_ ;
    /**
     * <code>int32 user_report = 4;</code>
     * @return The userReport.
     */
    @java.lang.Override
    public int getUserReport() {
      return userReport_;
    }
    /**
     * <code>int32 user_report = 4;</code>
     * @param value The userReport to set.
     * @return This builder for chaining.
     */
    public Builder setUserReport(int value) {
      
      userReport_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_report = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserReport() {
      
      userReport_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Player.UserIssueWeatherReport)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Player.UserIssueWeatherReport)
  private static final POGOProtos.Data.Player.UserIssueWeatherReport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Player.UserIssueWeatherReport();
  }

  public static POGOProtos.Data.Player.UserIssueWeatherReport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserIssueWeatherReport>
      PARSER = new com.google.protobuf.AbstractParser<UserIssueWeatherReport>() {
    @java.lang.Override
    public UserIssueWeatherReport parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserIssueWeatherReport(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserIssueWeatherReport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserIssueWeatherReport> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Player.UserIssueWeatherReport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

