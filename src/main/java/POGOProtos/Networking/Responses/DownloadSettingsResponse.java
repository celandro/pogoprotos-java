// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/DownloadSettingsResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.DownloadSettingsResponse}
 */
public final class DownloadSettingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.DownloadSettingsResponse)
    DownloadSettingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DownloadSettingsResponse.newBuilder() to construct.
  private DownloadSettingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownloadSettingsResponse() {
    error_ = "";
    hash_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DownloadSettingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DownloadSettingsResponse(
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

            error_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            hash_ = s;
            break;
          }
          case 26: {
            POGOProtos.Settings.GlobalSettings.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(POGOProtos.Settings.GlobalSettings.parser(), extensionRegistry);
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
    return POGOProtos.Networking.Responses.DownloadSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_DownloadSettingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.DownloadSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_DownloadSettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.DownloadSettingsResponse.class, POGOProtos.Networking.Responses.DownloadSettingsResponse.Builder.class);
  }

  public static final int ERROR_FIELD_NUMBER = 1;
  private volatile java.lang.Object error_;
  /**
   * <code>string error = 1;</code>
   * @return The error.
   */
  @java.lang.Override
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
   * <code>string error = 1;</code>
   * @return The bytes for error.
   */
  @java.lang.Override
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

  public static final int HASH_FIELD_NUMBER = 2;
  private volatile java.lang.Object hash_;
  /**
   * <code>string hash = 2;</code>
   * @return The hash.
   */
  @java.lang.Override
  public java.lang.String getHash() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hash_ = s;
      return s;
    }
  }
  /**
   * <code>string hash = 2;</code>
   * @return The bytes for hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SETTINGS_FIELD_NUMBER = 3;
  private POGOProtos.Settings.GlobalSettings settings_;
  /**
   * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
   * @return The settings.
   */
  @java.lang.Override
  public POGOProtos.Settings.GlobalSettings getSettings() {
    return settings_ == null ? POGOProtos.Settings.GlobalSettings.getDefaultInstance() : settings_;
  }
  /**
   * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Settings.GlobalSettingsOrBuilder getSettingsOrBuilder() {
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
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, error_);
    }
    if (!getHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hash_);
    }
    if (settings_ != null) {
      output.writeMessage(3, getSettings());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, error_);
    }
    if (!getHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hash_);
    }
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSettings());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.DownloadSettingsResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.DownloadSettingsResponse other = (POGOProtos.Networking.Responses.DownloadSettingsResponse) obj;

    if (!getError()
        .equals(other.getError())) return false;
    if (!getHash()
        .equals(other.getHash())) return false;
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
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.DownloadSettingsResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.DownloadSettingsResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.DownloadSettingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.DownloadSettingsResponse)
      POGOProtos.Networking.Responses.DownloadSettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.DownloadSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_DownloadSettingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.DownloadSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_DownloadSettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.DownloadSettingsResponse.class, POGOProtos.Networking.Responses.DownloadSettingsResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.DownloadSettingsResponse.newBuilder()
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
      error_ = "";

      hash_ = "";

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
      return POGOProtos.Networking.Responses.DownloadSettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_DownloadSettingsResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.DownloadSettingsResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.DownloadSettingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.DownloadSettingsResponse build() {
      POGOProtos.Networking.Responses.DownloadSettingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.DownloadSettingsResponse buildPartial() {
      POGOProtos.Networking.Responses.DownloadSettingsResponse result = new POGOProtos.Networking.Responses.DownloadSettingsResponse(this);
      result.error_ = error_;
      result.hash_ = hash_;
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
      if (other instanceof POGOProtos.Networking.Responses.DownloadSettingsResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.DownloadSettingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.DownloadSettingsResponse other) {
      if (other == POGOProtos.Networking.Responses.DownloadSettingsResponse.getDefaultInstance()) return this;
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (!other.getHash().isEmpty()) {
        hash_ = other.hash_;
        onChanged();
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
      POGOProtos.Networking.Responses.DownloadSettingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.DownloadSettingsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>string error = 1;</code>
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
     * <code>string error = 1;</code>
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
     * <code>string error = 1;</code>
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
     * <code>string error = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>string error = 1;</code>
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

    private java.lang.Object hash_ = "";
    /**
     * <code>string hash = 2;</code>
     * @return The hash.
     */
    public java.lang.String getHash() {
      java.lang.Object ref = hash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hash = 2;</code>
     * @return The bytes for hash.
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hash = 2;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }
    /**
     * <code>string hash = 2;</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hash_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Settings.GlobalSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Settings.GlobalSettings, POGOProtos.Settings.GlobalSettings.Builder, POGOProtos.Settings.GlobalSettingsOrBuilder> settingsBuilder_;
    /**
     * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
     * @return The settings.
     */
    public POGOProtos.Settings.GlobalSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? POGOProtos.Settings.GlobalSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
     */
    public Builder setSettings(POGOProtos.Settings.GlobalSettings value) {
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
     * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
     */
    public Builder setSettings(
        POGOProtos.Settings.GlobalSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
     */
    public Builder mergeSettings(POGOProtos.Settings.GlobalSettings value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            POGOProtos.Settings.GlobalSettings.newBuilder(settings_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
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
     * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
     */
    public POGOProtos.Settings.GlobalSettings.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
     */
    public POGOProtos.Settings.GlobalSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            POGOProtos.Settings.GlobalSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>.POGOProtos.Settings.GlobalSettings settings = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Settings.GlobalSettings, POGOProtos.Settings.GlobalSettings.Builder, POGOProtos.Settings.GlobalSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Settings.GlobalSettings, POGOProtos.Settings.GlobalSettings.Builder, POGOProtos.Settings.GlobalSettingsOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.DownloadSettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.DownloadSettingsResponse)
  private static final POGOProtos.Networking.Responses.DownloadSettingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.DownloadSettingsResponse();
  }

  public static POGOProtos.Networking.Responses.DownloadSettingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownloadSettingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<DownloadSettingsResponse>() {
    @java.lang.Override
    public DownloadSettingsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DownloadSettingsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DownloadSettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DownloadSettingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.DownloadSettingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

