// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Platform/Responses/GetClientBgmodeSettingsResponse.proto

package POGOProtos.Networking.Responses.Platform.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse}
 */
public final class GetClientBgmodeSettingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse)
    GetClientBgmodeSettingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetClientBgmodeSettingsResponse.newBuilder() to construct.
  private GetClientBgmodeSettingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetClientBgmodeSettingsResponse() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetClientBgmodeSettingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetClientBgmodeSettingsResponse(
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

            status_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Settings.BackgroundModeClientSettings.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(POGOProtos.Settings.BackgroundModeClientSettings.parser(), extensionRegistry);
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
    return POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientBgmodeSettingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientBgmodeSettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.class, POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status}
   */
  public enum Status
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
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_UNKNOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
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

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status result = POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status.valueOf(status_);
    return result == null ? POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status.UNRECOGNIZED : result;
  }

  public static final int SETTINGS_FIELD_NUMBER = 2;
  private POGOProtos.Settings.BackgroundModeClientSettings settings_;
  /**
   * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
   * @return The settings.
   */
  @java.lang.Override
  public POGOProtos.Settings.BackgroundModeClientSettings getSettings() {
    return settings_ == null ? POGOProtos.Settings.BackgroundModeClientSettings.getDefaultInstance() : settings_;
  }
  /**
   * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Settings.BackgroundModeClientSettingsOrBuilder getSettingsOrBuilder() {
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
    if (status_ != POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
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
    if (status_ != POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
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
    if (!(obj instanceof POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse other = (POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse) obj;

    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse)
      POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientBgmodeSettingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientBgmodeSettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.class, POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.newBuilder()
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
      status_ = 0;

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
      return POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientBgmodeSettingsResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse build() {
      POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse buildPartial() {
      POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse result = new POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse(this);
      result.status_ = status_;
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
      if (other instanceof POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse other) {
      if (other == POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status result = POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status.valueOf(status_);
      return result == null ? POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Settings.BackgroundModeClientSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Settings.BackgroundModeClientSettings, POGOProtos.Settings.BackgroundModeClientSettings.Builder, POGOProtos.Settings.BackgroundModeClientSettingsOrBuilder> settingsBuilder_;
    /**
     * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
     * @return The settings.
     */
    public POGOProtos.Settings.BackgroundModeClientSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? POGOProtos.Settings.BackgroundModeClientSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
     */
    public Builder setSettings(POGOProtos.Settings.BackgroundModeClientSettings value) {
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
     * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
     */
    public Builder setSettings(
        POGOProtos.Settings.BackgroundModeClientSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
     */
    public Builder mergeSettings(POGOProtos.Settings.BackgroundModeClientSettings value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            POGOProtos.Settings.BackgroundModeClientSettings.newBuilder(settings_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
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
     * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
     */
    public POGOProtos.Settings.BackgroundModeClientSettings.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
     */
    public POGOProtos.Settings.BackgroundModeClientSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            POGOProtos.Settings.BackgroundModeClientSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>.POGOProtos.Settings.BackgroundModeClientSettings settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Settings.BackgroundModeClientSettings, POGOProtos.Settings.BackgroundModeClientSettings.Builder, POGOProtos.Settings.BackgroundModeClientSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Settings.BackgroundModeClientSettings, POGOProtos.Settings.BackgroundModeClientSettings.Builder, POGOProtos.Settings.BackgroundModeClientSettingsOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse)
  private static final POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse();
  }

  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetClientBgmodeSettingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetClientBgmodeSettingsResponse>() {
    @java.lang.Override
    public GetClientBgmodeSettingsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetClientBgmodeSettingsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetClientBgmodeSettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetClientBgmodeSettingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.Platform.Responses.GetClientBgmodeSettingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

