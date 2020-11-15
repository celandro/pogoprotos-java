// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto}
 */
public final class SponsoredPoiFeedbackSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto)
    SponsoredPoiFeedbackSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SponsoredPoiFeedbackSettingsProto.newBuilder() to construct.
  private SponsoredPoiFeedbackSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SponsoredPoiFeedbackSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SponsoredPoiFeedbackSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SponsoredPoiFeedbackSettingsProto(
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

            enabled_ = input.readBool();
            break;
          }
          case 16: {

            enableReportAd_ = input.readBool();
            break;
          }
          case 24: {

            enableNotInterested_ = input.readBool();
            break;
          }
          case 32: {

            enableSeeMore_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SponsoredPoiFeedbackSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SponsoredPoiFeedbackSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto.class, POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int ENABLE_REPORT_AD_FIELD_NUMBER = 2;
  private boolean enableReportAd_;
  /**
   * <code>bool enable_report_ad = 2;</code>
   * @return The enableReportAd.
   */
  @java.lang.Override
  public boolean getEnableReportAd() {
    return enableReportAd_;
  }

  public static final int ENABLE_NOT_INTERESTED_FIELD_NUMBER = 3;
  private boolean enableNotInterested_;
  /**
   * <code>bool enable_not_interested = 3;</code>
   * @return The enableNotInterested.
   */
  @java.lang.Override
  public boolean getEnableNotInterested() {
    return enableNotInterested_;
  }

  public static final int ENABLE_SEE_MORE_FIELD_NUMBER = 4;
  private boolean enableSeeMore_;
  /**
   * <code>bool enable_see_more = 4;</code>
   * @return The enableSeeMore.
   */
  @java.lang.Override
  public boolean getEnableSeeMore() {
    return enableSeeMore_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (enableReportAd_ != false) {
      output.writeBool(2, enableReportAd_);
    }
    if (enableNotInterested_ != false) {
      output.writeBool(3, enableNotInterested_);
    }
    if (enableSeeMore_ != false) {
      output.writeBool(4, enableSeeMore_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    if (enableReportAd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, enableReportAd_);
    }
    if (enableNotInterested_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enableNotInterested_);
    }
    if (enableSeeMore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, enableSeeMore_);
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
    if (!(obj instanceof POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto other = (POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
    if (getEnableReportAd()
        != other.getEnableReportAd()) return false;
    if (getEnableNotInterested()
        != other.getEnableNotInterested()) return false;
    if (getEnableSeeMore()
        != other.getEnableSeeMore()) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (37 * hash) + ENABLE_REPORT_AD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableReportAd());
    hash = (37 * hash) + ENABLE_NOT_INTERESTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableNotInterested());
    hash = (37 * hash) + ENABLE_SEE_MORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableSeeMore());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto)
      POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SponsoredPoiFeedbackSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SponsoredPoiFeedbackSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto.class, POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto.newBuilder()
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
      enabled_ = false;

      enableReportAd_ = false;

      enableNotInterested_ = false;

      enableSeeMore_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SponsoredPoiFeedbackSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto build() {
      POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto buildPartial() {
      POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto result = new POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto(this);
      result.enabled_ = enabled_;
      result.enableReportAd_ = enableReportAd_;
      result.enableNotInterested_ = enableNotInterested_;
      result.enableSeeMore_ = enableSeeMore_;
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
      if (other instanceof POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto other) {
      if (other == POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.getEnableReportAd() != false) {
        setEnableReportAd(other.getEnableReportAd());
      }
      if (other.getEnableNotInterested() != false) {
        setEnableNotInterested(other.getEnableNotInterested());
      }
      if (other.getEnableSeeMore() != false) {
        setEnableSeeMore(other.getEnableSeeMore());
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
      POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enabled_ ;
    /**
     * <code>bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
      onChanged();
      return this;
    }

    private boolean enableReportAd_ ;
    /**
     * <code>bool enable_report_ad = 2;</code>
     * @return The enableReportAd.
     */
    @java.lang.Override
    public boolean getEnableReportAd() {
      return enableReportAd_;
    }
    /**
     * <code>bool enable_report_ad = 2;</code>
     * @param value The enableReportAd to set.
     * @return This builder for chaining.
     */
    public Builder setEnableReportAd(boolean value) {
      
      enableReportAd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_report_ad = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableReportAd() {
      
      enableReportAd_ = false;
      onChanged();
      return this;
    }

    private boolean enableNotInterested_ ;
    /**
     * <code>bool enable_not_interested = 3;</code>
     * @return The enableNotInterested.
     */
    @java.lang.Override
    public boolean getEnableNotInterested() {
      return enableNotInterested_;
    }
    /**
     * <code>bool enable_not_interested = 3;</code>
     * @param value The enableNotInterested to set.
     * @return This builder for chaining.
     */
    public Builder setEnableNotInterested(boolean value) {
      
      enableNotInterested_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_not_interested = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableNotInterested() {
      
      enableNotInterested_ = false;
      onChanged();
      return this;
    }

    private boolean enableSeeMore_ ;
    /**
     * <code>bool enable_see_more = 4;</code>
     * @return The enableSeeMore.
     */
    @java.lang.Override
    public boolean getEnableSeeMore() {
      return enableSeeMore_;
    }
    /**
     * <code>bool enable_see_more = 4;</code>
     * @param value The enableSeeMore to set.
     * @return This builder for chaining.
     */
    public Builder setEnableSeeMore(boolean value) {
      
      enableSeeMore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_see_more = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableSeeMore() {
      
      enableSeeMore_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto)
  private static final POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto();
  }

  public static POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SponsoredPoiFeedbackSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<SponsoredPoiFeedbackSettingsProto>() {
    @java.lang.Override
    public SponsoredPoiFeedbackSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SponsoredPoiFeedbackSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SponsoredPoiFeedbackSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SponsoredPoiFeedbackSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SponsoredPoiFeedbackSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

