// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MHNABDJEOGC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.UpsightLoggingSettingsProto}
 */
public final class UpsightLoggingSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.UpsightLoggingSettingsProto)
    UpsightLoggingSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpsightLoggingSettingsProto.newBuilder() to construct.
  private UpsightLoggingSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpsightLoggingSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpsightLoggingSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpsightLoggingSettingsProto(
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

            useVerboseLogging_ = input.readBool();
            break;
          }
          case 16: {

            loggingPercentage_ = input.readInt32();
            break;
          }
          case 24: {

            disableLogging_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpsightLoggingSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpsightLoggingSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.UpsightLoggingSettingsProto.class, POGOProtos.Rpc.UpsightLoggingSettingsProto.Builder.class);
  }

  public static final int USE_VERBOSE_LOGGING_FIELD_NUMBER = 1;
  private boolean useVerboseLogging_;
  /**
   * <code>bool use_verbose_logging = 1;</code>
   * @return The useVerboseLogging.
   */
  @java.lang.Override
  public boolean getUseVerboseLogging() {
    return useVerboseLogging_;
  }

  public static final int LOGGING_PERCENTAGE_FIELD_NUMBER = 2;
  private int loggingPercentage_;
  /**
   * <code>int32 logging_percentage = 2;</code>
   * @return The loggingPercentage.
   */
  @java.lang.Override
  public int getLoggingPercentage() {
    return loggingPercentage_;
  }

  public static final int DISABLE_LOGGING_FIELD_NUMBER = 3;
  private boolean disableLogging_;
  /**
   * <code>bool disable_logging = 3;</code>
   * @return The disableLogging.
   */
  @java.lang.Override
  public boolean getDisableLogging() {
    return disableLogging_;
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
    if (useVerboseLogging_ != false) {
      output.writeBool(1, useVerboseLogging_);
    }
    if (loggingPercentage_ != 0) {
      output.writeInt32(2, loggingPercentage_);
    }
    if (disableLogging_ != false) {
      output.writeBool(3, disableLogging_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (useVerboseLogging_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, useVerboseLogging_);
    }
    if (loggingPercentage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, loggingPercentage_);
    }
    if (disableLogging_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, disableLogging_);
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
    if (!(obj instanceof POGOProtos.Rpc.UpsightLoggingSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.UpsightLoggingSettingsProto other = (POGOProtos.Rpc.UpsightLoggingSettingsProto) obj;

    if (getUseVerboseLogging()
        != other.getUseVerboseLogging()) return false;
    if (getLoggingPercentage()
        != other.getLoggingPercentage()) return false;
    if (getDisableLogging()
        != other.getDisableLogging()) return false;
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
    hash = (37 * hash) + USE_VERBOSE_LOGGING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseVerboseLogging());
    hash = (37 * hash) + LOGGING_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLoggingPercentage();
    hash = (37 * hash) + DISABLE_LOGGING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisableLogging());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UpsightLoggingSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.UpsightLoggingSettingsProto prototype) {
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
   * <pre>
   * ref: MHNABDJEOGC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.UpsightLoggingSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.UpsightLoggingSettingsProto)
      POGOProtos.Rpc.UpsightLoggingSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpsightLoggingSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpsightLoggingSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.UpsightLoggingSettingsProto.class, POGOProtos.Rpc.UpsightLoggingSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.UpsightLoggingSettingsProto.newBuilder()
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
      useVerboseLogging_ = false;

      loggingPercentage_ = 0;

      disableLogging_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpsightLoggingSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UpsightLoggingSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.UpsightLoggingSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.UpsightLoggingSettingsProto build() {
      POGOProtos.Rpc.UpsightLoggingSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UpsightLoggingSettingsProto buildPartial() {
      POGOProtos.Rpc.UpsightLoggingSettingsProto result = new POGOProtos.Rpc.UpsightLoggingSettingsProto(this);
      result.useVerboseLogging_ = useVerboseLogging_;
      result.loggingPercentage_ = loggingPercentage_;
      result.disableLogging_ = disableLogging_;
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
      if (other instanceof POGOProtos.Rpc.UpsightLoggingSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.UpsightLoggingSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.UpsightLoggingSettingsProto other) {
      if (other == POGOProtos.Rpc.UpsightLoggingSettingsProto.getDefaultInstance()) return this;
      if (other.getUseVerboseLogging() != false) {
        setUseVerboseLogging(other.getUseVerboseLogging());
      }
      if (other.getLoggingPercentage() != 0) {
        setLoggingPercentage(other.getLoggingPercentage());
      }
      if (other.getDisableLogging() != false) {
        setDisableLogging(other.getDisableLogging());
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
      POGOProtos.Rpc.UpsightLoggingSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.UpsightLoggingSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean useVerboseLogging_ ;
    /**
     * <code>bool use_verbose_logging = 1;</code>
     * @return The useVerboseLogging.
     */
    @java.lang.Override
    public boolean getUseVerboseLogging() {
      return useVerboseLogging_;
    }
    /**
     * <code>bool use_verbose_logging = 1;</code>
     * @param value The useVerboseLogging to set.
     * @return This builder for chaining.
     */
    public Builder setUseVerboseLogging(boolean value) {
      
      useVerboseLogging_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool use_verbose_logging = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseVerboseLogging() {
      
      useVerboseLogging_ = false;
      onChanged();
      return this;
    }

    private int loggingPercentage_ ;
    /**
     * <code>int32 logging_percentage = 2;</code>
     * @return The loggingPercentage.
     */
    @java.lang.Override
    public int getLoggingPercentage() {
      return loggingPercentage_;
    }
    /**
     * <code>int32 logging_percentage = 2;</code>
     * @param value The loggingPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setLoggingPercentage(int value) {
      
      loggingPercentage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 logging_percentage = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoggingPercentage() {
      
      loggingPercentage_ = 0;
      onChanged();
      return this;
    }

    private boolean disableLogging_ ;
    /**
     * <code>bool disable_logging = 3;</code>
     * @return The disableLogging.
     */
    @java.lang.Override
    public boolean getDisableLogging() {
      return disableLogging_;
    }
    /**
     * <code>bool disable_logging = 3;</code>
     * @param value The disableLogging to set.
     * @return This builder for chaining.
     */
    public Builder setDisableLogging(boolean value) {
      
      disableLogging_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool disable_logging = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisableLogging() {
      
      disableLogging_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.UpsightLoggingSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.UpsightLoggingSettingsProto)
  private static final POGOProtos.Rpc.UpsightLoggingSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.UpsightLoggingSettingsProto();
  }

  public static POGOProtos.Rpc.UpsightLoggingSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpsightLoggingSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<UpsightLoggingSettingsProto>() {
    @java.lang.Override
    public UpsightLoggingSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpsightLoggingSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpsightLoggingSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpsightLoggingSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.UpsightLoggingSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

