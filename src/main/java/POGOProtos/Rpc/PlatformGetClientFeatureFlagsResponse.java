// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse}
 */
public final class PlatformGetClientFeatureFlagsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse)
    PlatformGetClientFeatureFlagsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformGetClientFeatureFlagsResponse.newBuilder() to construct.
  private PlatformGetClientFeatureFlagsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformGetClientFeatureFlagsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformGetClientFeatureFlagsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformGetClientFeatureFlagsResponse(
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
            POGOProtos.Rpc.PlatformSocialClientFeatures.Builder subBuilder = null;
            if (featureFlags_ != null) {
              subBuilder = featureFlags_.toBuilder();
            }
            featureFlags_ = input.readMessage(POGOProtos.Rpc.PlatformSocialClientFeatures.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(featureFlags_);
              featureFlags_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            POGOProtos.Rpc.PlatformSocialClientGlobalSettings.Builder subBuilder = null;
            if (globalSettings_ != null) {
              subBuilder = globalSettings_.toBuilder();
            }
            globalSettings_ = input.readMessage(POGOProtos.Rpc.PlatformSocialClientGlobalSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(globalSettings_);
              globalSettings_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetClientFeatureFlagsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetClientFeatureFlagsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse.class, POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse.Builder.class);
  }

  public static final int FEATURE_FLAGS_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PlatformSocialClientFeatures featureFlags_;
  /**
   * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
   * @return Whether the featureFlags field is set.
   */
  @java.lang.Override
  public boolean hasFeatureFlags() {
    return featureFlags_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
   * @return The featureFlags.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformSocialClientFeatures getFeatureFlags() {
    return featureFlags_ == null ? POGOProtos.Rpc.PlatformSocialClientFeatures.getDefaultInstance() : featureFlags_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformSocialClientFeaturesOrBuilder getFeatureFlagsOrBuilder() {
    return getFeatureFlags();
  }

  public static final int GLOBAL_SETTINGS_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.PlatformSocialClientGlobalSettings globalSettings_;
  /**
   * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
   * @return Whether the globalSettings field is set.
   */
  @java.lang.Override
  public boolean hasGlobalSettings() {
    return globalSettings_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
   * @return The globalSettings.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformSocialClientGlobalSettings getGlobalSettings() {
    return globalSettings_ == null ? POGOProtos.Rpc.PlatformSocialClientGlobalSettings.getDefaultInstance() : globalSettings_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformSocialClientGlobalSettingsOrBuilder getGlobalSettingsOrBuilder() {
    return getGlobalSettings();
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
    if (featureFlags_ != null) {
      output.writeMessage(1, getFeatureFlags());
    }
    if (globalSettings_ != null) {
      output.writeMessage(2, getGlobalSettings());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (featureFlags_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFeatureFlags());
    }
    if (globalSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGlobalSettings());
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse other = (POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse) obj;

    if (hasFeatureFlags() != other.hasFeatureFlags()) return false;
    if (hasFeatureFlags()) {
      if (!getFeatureFlags()
          .equals(other.getFeatureFlags())) return false;
    }
    if (hasGlobalSettings() != other.hasGlobalSettings()) return false;
    if (hasGlobalSettings()) {
      if (!getGlobalSettings()
          .equals(other.getGlobalSettings())) return false;
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
    if (hasFeatureFlags()) {
      hash = (37 * hash) + FEATURE_FLAGS_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureFlags().hashCode();
    }
    if (hasGlobalSettings()) {
      hash = (37 * hash) + GLOBAL_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getGlobalSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse)
      POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetClientFeatureFlagsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetClientFeatureFlagsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse.class, POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse.newBuilder()
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
      if (featureFlagsBuilder_ == null) {
        featureFlags_ = null;
      } else {
        featureFlags_ = null;
        featureFlagsBuilder_ = null;
      }
      if (globalSettingsBuilder_ == null) {
        globalSettings_ = null;
      } else {
        globalSettings_ = null;
        globalSettingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetClientFeatureFlagsResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse build() {
      POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse buildPartial() {
      POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse result = new POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse(this);
      if (featureFlagsBuilder_ == null) {
        result.featureFlags_ = featureFlags_;
      } else {
        result.featureFlags_ = featureFlagsBuilder_.build();
      }
      if (globalSettingsBuilder_ == null) {
        result.globalSettings_ = globalSettings_;
      } else {
        result.globalSettings_ = globalSettingsBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse) {
        return mergeFrom((POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse other) {
      if (other == POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse.getDefaultInstance()) return this;
      if (other.hasFeatureFlags()) {
        mergeFeatureFlags(other.getFeatureFlags());
      }
      if (other.hasGlobalSettings()) {
        mergeGlobalSettings(other.getGlobalSettings());
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
      POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PlatformSocialClientFeatures featureFlags_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformSocialClientFeatures, POGOProtos.Rpc.PlatformSocialClientFeatures.Builder, POGOProtos.Rpc.PlatformSocialClientFeaturesOrBuilder> featureFlagsBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
     * @return Whether the featureFlags field is set.
     */
    public boolean hasFeatureFlags() {
      return featureFlagsBuilder_ != null || featureFlags_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
     * @return The featureFlags.
     */
    public POGOProtos.Rpc.PlatformSocialClientFeatures getFeatureFlags() {
      if (featureFlagsBuilder_ == null) {
        return featureFlags_ == null ? POGOProtos.Rpc.PlatformSocialClientFeatures.getDefaultInstance() : featureFlags_;
      } else {
        return featureFlagsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
     */
    public Builder setFeatureFlags(POGOProtos.Rpc.PlatformSocialClientFeatures value) {
      if (featureFlagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureFlags_ = value;
        onChanged();
      } else {
        featureFlagsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
     */
    public Builder setFeatureFlags(
        POGOProtos.Rpc.PlatformSocialClientFeatures.Builder builderForValue) {
      if (featureFlagsBuilder_ == null) {
        featureFlags_ = builderForValue.build();
        onChanged();
      } else {
        featureFlagsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
     */
    public Builder mergeFeatureFlags(POGOProtos.Rpc.PlatformSocialClientFeatures value) {
      if (featureFlagsBuilder_ == null) {
        if (featureFlags_ != null) {
          featureFlags_ =
            POGOProtos.Rpc.PlatformSocialClientFeatures.newBuilder(featureFlags_).mergeFrom(value).buildPartial();
        } else {
          featureFlags_ = value;
        }
        onChanged();
      } else {
        featureFlagsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
     */
    public Builder clearFeatureFlags() {
      if (featureFlagsBuilder_ == null) {
        featureFlags_ = null;
        onChanged();
      } else {
        featureFlags_ = null;
        featureFlagsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
     */
    public POGOProtos.Rpc.PlatformSocialClientFeatures.Builder getFeatureFlagsBuilder() {
      
      onChanged();
      return getFeatureFlagsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
     */
    public POGOProtos.Rpc.PlatformSocialClientFeaturesOrBuilder getFeatureFlagsOrBuilder() {
      if (featureFlagsBuilder_ != null) {
        return featureFlagsBuilder_.getMessageOrBuilder();
      } else {
        return featureFlags_ == null ?
            POGOProtos.Rpc.PlatformSocialClientFeatures.getDefaultInstance() : featureFlags_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientFeatures feature_flags = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformSocialClientFeatures, POGOProtos.Rpc.PlatformSocialClientFeatures.Builder, POGOProtos.Rpc.PlatformSocialClientFeaturesOrBuilder> 
        getFeatureFlagsFieldBuilder() {
      if (featureFlagsBuilder_ == null) {
        featureFlagsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PlatformSocialClientFeatures, POGOProtos.Rpc.PlatformSocialClientFeatures.Builder, POGOProtos.Rpc.PlatformSocialClientFeaturesOrBuilder>(
                getFeatureFlags(),
                getParentForChildren(),
                isClean());
        featureFlags_ = null;
      }
      return featureFlagsBuilder_;
    }

    private POGOProtos.Rpc.PlatformSocialClientGlobalSettings globalSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformSocialClientGlobalSettings, POGOProtos.Rpc.PlatformSocialClientGlobalSettings.Builder, POGOProtos.Rpc.PlatformSocialClientGlobalSettingsOrBuilder> globalSettingsBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
     * @return Whether the globalSettings field is set.
     */
    public boolean hasGlobalSettings() {
      return globalSettingsBuilder_ != null || globalSettings_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
     * @return The globalSettings.
     */
    public POGOProtos.Rpc.PlatformSocialClientGlobalSettings getGlobalSettings() {
      if (globalSettingsBuilder_ == null) {
        return globalSettings_ == null ? POGOProtos.Rpc.PlatformSocialClientGlobalSettings.getDefaultInstance() : globalSettings_;
      } else {
        return globalSettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
     */
    public Builder setGlobalSettings(POGOProtos.Rpc.PlatformSocialClientGlobalSettings value) {
      if (globalSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        globalSettings_ = value;
        onChanged();
      } else {
        globalSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
     */
    public Builder setGlobalSettings(
        POGOProtos.Rpc.PlatformSocialClientGlobalSettings.Builder builderForValue) {
      if (globalSettingsBuilder_ == null) {
        globalSettings_ = builderForValue.build();
        onChanged();
      } else {
        globalSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
     */
    public Builder mergeGlobalSettings(POGOProtos.Rpc.PlatformSocialClientGlobalSettings value) {
      if (globalSettingsBuilder_ == null) {
        if (globalSettings_ != null) {
          globalSettings_ =
            POGOProtos.Rpc.PlatformSocialClientGlobalSettings.newBuilder(globalSettings_).mergeFrom(value).buildPartial();
        } else {
          globalSettings_ = value;
        }
        onChanged();
      } else {
        globalSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
     */
    public Builder clearGlobalSettings() {
      if (globalSettingsBuilder_ == null) {
        globalSettings_ = null;
        onChanged();
      } else {
        globalSettings_ = null;
        globalSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
     */
    public POGOProtos.Rpc.PlatformSocialClientGlobalSettings.Builder getGlobalSettingsBuilder() {
      
      onChanged();
      return getGlobalSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
     */
    public POGOProtos.Rpc.PlatformSocialClientGlobalSettingsOrBuilder getGlobalSettingsOrBuilder() {
      if (globalSettingsBuilder_ != null) {
        return globalSettingsBuilder_.getMessageOrBuilder();
      } else {
        return globalSettings_ == null ?
            POGOProtos.Rpc.PlatformSocialClientGlobalSettings.getDefaultInstance() : globalSettings_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformSocialClientGlobalSettings global_settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformSocialClientGlobalSettings, POGOProtos.Rpc.PlatformSocialClientGlobalSettings.Builder, POGOProtos.Rpc.PlatformSocialClientGlobalSettingsOrBuilder> 
        getGlobalSettingsFieldBuilder() {
      if (globalSettingsBuilder_ == null) {
        globalSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PlatformSocialClientGlobalSettings, POGOProtos.Rpc.PlatformSocialClientGlobalSettings.Builder, POGOProtos.Rpc.PlatformSocialClientGlobalSettingsOrBuilder>(
                getGlobalSettings(),
                getParentForChildren(),
                isClean());
        globalSettings_ = null;
      }
      return globalSettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse)
  private static final POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse();
  }

  public static POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformGetClientFeatureFlagsResponse>
      PARSER = new com.google.protobuf.AbstractParser<PlatformGetClientFeatureFlagsResponse>() {
    @java.lang.Override
    public PlatformGetClientFeatureFlagsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformGetClientFeatureFlagsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformGetClientFeatureFlagsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformGetClientFeatureFlagsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformGetClientFeatureFlagsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

