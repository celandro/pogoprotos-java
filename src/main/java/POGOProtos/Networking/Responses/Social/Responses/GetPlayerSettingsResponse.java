// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Social/Responses/GetPlayerSettingsResponse.proto

package POGOProtos.Networking.Responses.Social.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse}
 */
public final class GetPlayerSettingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse)
    GetPlayerSettingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPlayerSettingsResponse.newBuilder() to construct.
  private GetPlayerSettingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPlayerSettingsResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPlayerSettingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPlayerSettingsResponse(
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

            result_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Settings.PlayerSettings.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(POGOProtos.Settings.PlayerSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(settings_);
              settings_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_GetPlayerSettingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_GetPlayerSettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.class, POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    ERROR_UNKNOWN(2),
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 3;</code>
     */
    ERROR_PLAYER_NOT_FOUND(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 2;
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_PLAYER_NOT_FOUND_VALUE = 3;


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
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_UNKNOWN;
        case 3: return ERROR_PLAYER_NOT_FOUND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
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
      return POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
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

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result result = POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result.UNRECOGNIZED : result;
  }

  public static final int SETTINGS_FIELD_NUMBER = 2;
  private POGOProtos.Settings.PlayerSettings settings_;
  /**
   * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
   * @return The settings.
   */
  @java.lang.Override
  public POGOProtos.Settings.PlayerSettings getSettings() {
    return settings_ == null ? POGOProtos.Settings.PlayerSettings.getDefaultInstance() : settings_;
  }
  /**
   * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Settings.PlayerSettingsOrBuilder getSettingsOrBuilder() {
    return getSettings();
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
    if (result_ != POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (settings_ != null) {
      output.writeMessage(2, getSettings());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSettings());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse other = (POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse) obj;

    if (result_ != other.result_) return false;
    if (hasSettings() != other.hasSettings()) return false;
    if (hasSettings()) {
      if (!getSettings()
          .equals(other.getSettings())) return false;
    }
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse)
      POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_GetPlayerSettingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_GetPlayerSettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.class, POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.newBuilder()
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
      result_ = 0;

      if (settingsBuilder_ == null) {
        settings_ = null;
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_GetPlayerSettingsResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse build() {
      POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse buildPartial() {
      POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse result = new POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse(this);
      result.result_ = result_;
      if (settingsBuilder_ == null) {
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse other) {
      if (other == POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
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
      POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result result = POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Settings.PlayerSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Settings.PlayerSettings, POGOProtos.Settings.PlayerSettings.Builder, POGOProtos.Settings.PlayerSettingsOrBuilder> settingsBuilder_;
    /**
     * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
     * @return The settings.
     */
    public POGOProtos.Settings.PlayerSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? POGOProtos.Settings.PlayerSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
     */
    public Builder setSettings(POGOProtos.Settings.PlayerSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
        onChanged();
      } else {
        settingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
     */
    public Builder setSettings(
        POGOProtos.Settings.PlayerSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
     */
    public Builder mergeSettings(POGOProtos.Settings.PlayerSettings value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            POGOProtos.Settings.PlayerSettings.newBuilder(settings_).mergeFrom(value).buildPartial();
        } else {
          settings_ = value;
        }
        onChanged();
      } else {
        settingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = null;
        onChanged();
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
     */
    public POGOProtos.Settings.PlayerSettings.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
     */
    public POGOProtos.Settings.PlayerSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            POGOProtos.Settings.PlayerSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>.POGOProtos.Settings.PlayerSettings settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Settings.PlayerSettings, POGOProtos.Settings.PlayerSettings.Builder, POGOProtos.Settings.PlayerSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Settings.PlayerSettings, POGOProtos.Settings.PlayerSettings.Builder, POGOProtos.Settings.PlayerSettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse)
  private static final POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse();
  }

  public static POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPlayerSettingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPlayerSettingsResponse>() {
    @java.lang.Override
    public GetPlayerSettingsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPlayerSettingsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPlayerSettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPlayerSettingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.Social.Responses.GetPlayerSettingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

