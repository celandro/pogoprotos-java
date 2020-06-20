// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/KoalaSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.KoalaSettings}
 */
public  final class KoalaSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.KoalaSettings)
    KoalaSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KoalaSettings.newBuilder() to construct.
  private KoalaSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KoalaSettings() {
    appId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KoalaSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KoalaSettings(
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

            appId_ = s;
            break;
          }
          case 16: {

            useSandbox_ = input.readBool();
            break;
          }
          case 24: {

            useKoala_ = input.readBool();
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
    return POGOProtos.Settings.KoalaSettingsOuterClass.internal_static_POGOProtos_Settings_KoalaSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.KoalaSettingsOuterClass.internal_static_POGOProtos_Settings_KoalaSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.KoalaSettings.class, POGOProtos.Settings.KoalaSettings.Builder.class);
  }

  public static final int APP_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object appId_;
  /**
   * <code>string app_id = 1;</code>
   * @return The appId.
   */
  public java.lang.String getAppId() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appId_ = s;
      return s;
    }
  }
  /**
   * <code>string app_id = 1;</code>
   * @return The bytes for appId.
   */
  public com.google.protobuf.ByteString
      getAppIdBytes() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USE_SANDBOX_FIELD_NUMBER = 2;
  private boolean useSandbox_;
  /**
   * <code>bool use_sandbox = 2;</code>
   * @return The useSandbox.
   */
  public boolean getUseSandbox() {
    return useSandbox_;
  }

  public static final int USE_KOALA_FIELD_NUMBER = 3;
  private boolean useKoala_;
  /**
   * <code>bool use_koala = 3;</code>
   * @return The useKoala.
   */
  public boolean getUseKoala() {
    return useKoala_;
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
    if (!getAppIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appId_);
    }
    if (useSandbox_ != false) {
      output.writeBool(2, useSandbox_);
    }
    if (useKoala_ != false) {
      output.writeBool(3, useKoala_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAppIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appId_);
    }
    if (useSandbox_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, useSandbox_);
    }
    if (useKoala_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, useKoala_);
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
    if (!(obj instanceof POGOProtos.Settings.KoalaSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.KoalaSettings other = (POGOProtos.Settings.KoalaSettings) obj;

    if (!getAppId()
        .equals(other.getAppId())) return false;
    if (getUseSandbox()
        != other.getUseSandbox()) return false;
    if (getUseKoala()
        != other.getUseKoala()) return false;
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
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAppId().hashCode();
    hash = (37 * hash) + USE_SANDBOX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseSandbox());
    hash = (37 * hash) + USE_KOALA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseKoala());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.KoalaSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.KoalaSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.KoalaSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.KoalaSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.KoalaSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.KoalaSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.KoalaSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.KoalaSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.KoalaSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.KoalaSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.KoalaSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.KoalaSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.KoalaSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.KoalaSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.KoalaSettings)
      POGOProtos.Settings.KoalaSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.KoalaSettingsOuterClass.internal_static_POGOProtos_Settings_KoalaSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.KoalaSettingsOuterClass.internal_static_POGOProtos_Settings_KoalaSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.KoalaSettings.class, POGOProtos.Settings.KoalaSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.KoalaSettings.newBuilder()
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
      appId_ = "";

      useSandbox_ = false;

      useKoala_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.KoalaSettingsOuterClass.internal_static_POGOProtos_Settings_KoalaSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.KoalaSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.KoalaSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.KoalaSettings build() {
      POGOProtos.Settings.KoalaSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.KoalaSettings buildPartial() {
      POGOProtos.Settings.KoalaSettings result = new POGOProtos.Settings.KoalaSettings(this);
      result.appId_ = appId_;
      result.useSandbox_ = useSandbox_;
      result.useKoala_ = useKoala_;
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
      if (other instanceof POGOProtos.Settings.KoalaSettings) {
        return mergeFrom((POGOProtos.Settings.KoalaSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.KoalaSettings other) {
      if (other == POGOProtos.Settings.KoalaSettings.getDefaultInstance()) return this;
      if (!other.getAppId().isEmpty()) {
        appId_ = other.appId_;
        onChanged();
      }
      if (other.getUseSandbox() != false) {
        setUseSandbox(other.getUseSandbox());
      }
      if (other.getUseKoala() != false) {
        setUseKoala(other.getUseKoala());
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
      POGOProtos.Settings.KoalaSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.KoalaSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object appId_ = "";
    /**
     * <code>string app_id = 1;</code>
     * @return The appId.
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string app_id = 1;</code>
     * @return The bytes for appId.
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string app_id = 1;</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string app_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      
      appId_ = getDefaultInstance().getAppId();
      onChanged();
      return this;
    }
    /**
     * <code>string app_id = 1;</code>
     * @param value The bytes for appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appId_ = value;
      onChanged();
      return this;
    }

    private boolean useSandbox_ ;
    /**
     * <code>bool use_sandbox = 2;</code>
     * @return The useSandbox.
     */
    public boolean getUseSandbox() {
      return useSandbox_;
    }
    /**
     * <code>bool use_sandbox = 2;</code>
     * @param value The useSandbox to set.
     * @return This builder for chaining.
     */
    public Builder setUseSandbox(boolean value) {
      
      useSandbox_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool use_sandbox = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseSandbox() {
      
      useSandbox_ = false;
      onChanged();
      return this;
    }

    private boolean useKoala_ ;
    /**
     * <code>bool use_koala = 3;</code>
     * @return The useKoala.
     */
    public boolean getUseKoala() {
      return useKoala_;
    }
    /**
     * <code>bool use_koala = 3;</code>
     * @param value The useKoala to set.
     * @return This builder for chaining.
     */
    public Builder setUseKoala(boolean value) {
      
      useKoala_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool use_koala = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseKoala() {
      
      useKoala_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.KoalaSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.KoalaSettings)
  private static final POGOProtos.Settings.KoalaSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.KoalaSettings();
  }

  public static POGOProtos.Settings.KoalaSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KoalaSettings>
      PARSER = new com.google.protobuf.AbstractParser<KoalaSettings>() {
    @java.lang.Override
    public KoalaSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KoalaSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KoalaSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KoalaSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.KoalaSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

