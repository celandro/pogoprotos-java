// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PasscodeSettingsProto}
 */
public  final class PasscodeSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PasscodeSettingsProto)
    PasscodeSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PasscodeSettingsProto.newBuilder() to construct.
  private PasscodeSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PasscodeSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PasscodeSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PasscodeSettingsProto(
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

            showPasscodeInStore_ = input.readBool();
            break;
          }
          case 16: {

            usePasscodeV2_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PasscodeSettingsProto.class, POGOProtos.Rpc.PasscodeSettingsProto.Builder.class);
  }

  public static final int SHOW_PASSCODE_IN_STORE_FIELD_NUMBER = 1;
  private boolean showPasscodeInStore_;
  /**
   * <code>bool show_passcode_in_store = 1;</code>
   * @return The showPasscodeInStore.
   */
  public boolean getShowPasscodeInStore() {
    return showPasscodeInStore_;
  }

  public static final int USE_PASSCODE_V2_FIELD_NUMBER = 2;
  private boolean usePasscodeV2_;
  /**
   * <code>bool use_passcode_v2 = 2;</code>
   * @return The usePasscodeV2.
   */
  public boolean getUsePasscodeV2() {
    return usePasscodeV2_;
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
    if (showPasscodeInStore_ != false) {
      output.writeBool(1, showPasscodeInStore_);
    }
    if (usePasscodeV2_ != false) {
      output.writeBool(2, usePasscodeV2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (showPasscodeInStore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, showPasscodeInStore_);
    }
    if (usePasscodeV2_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, usePasscodeV2_);
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
    if (!(obj instanceof POGOProtos.Rpc.PasscodeSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PasscodeSettingsProto other = (POGOProtos.Rpc.PasscodeSettingsProto) obj;

    if (getShowPasscodeInStore()
        != other.getShowPasscodeInStore()) return false;
    if (getUsePasscodeV2()
        != other.getUsePasscodeV2()) return false;
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
    hash = (37 * hash) + SHOW_PASSCODE_IN_STORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getShowPasscodeInStore());
    hash = (37 * hash) + USE_PASSCODE_V2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUsePasscodeV2());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PasscodeSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PasscodeSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PasscodeSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PasscodeSettingsProto)
      POGOProtos.Rpc.PasscodeSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PasscodeSettingsProto.class, POGOProtos.Rpc.PasscodeSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PasscodeSettingsProto.newBuilder()
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
      showPasscodeInStore_ = false;

      usePasscodeV2_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PasscodeSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PasscodeSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PasscodeSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PasscodeSettingsProto build() {
      POGOProtos.Rpc.PasscodeSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PasscodeSettingsProto buildPartial() {
      POGOProtos.Rpc.PasscodeSettingsProto result = new POGOProtos.Rpc.PasscodeSettingsProto(this);
      result.showPasscodeInStore_ = showPasscodeInStore_;
      result.usePasscodeV2_ = usePasscodeV2_;
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
      if (other instanceof POGOProtos.Rpc.PasscodeSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.PasscodeSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PasscodeSettingsProto other) {
      if (other == POGOProtos.Rpc.PasscodeSettingsProto.getDefaultInstance()) return this;
      if (other.getShowPasscodeInStore() != false) {
        setShowPasscodeInStore(other.getShowPasscodeInStore());
      }
      if (other.getUsePasscodeV2() != false) {
        setUsePasscodeV2(other.getUsePasscodeV2());
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
      POGOProtos.Rpc.PasscodeSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PasscodeSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean showPasscodeInStore_ ;
    /**
     * <code>bool show_passcode_in_store = 1;</code>
     * @return The showPasscodeInStore.
     */
    public boolean getShowPasscodeInStore() {
      return showPasscodeInStore_;
    }
    /**
     * <code>bool show_passcode_in_store = 1;</code>
     * @param value The showPasscodeInStore to set.
     * @return This builder for chaining.
     */
    public Builder setShowPasscodeInStore(boolean value) {
      
      showPasscodeInStore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool show_passcode_in_store = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShowPasscodeInStore() {
      
      showPasscodeInStore_ = false;
      onChanged();
      return this;
    }

    private boolean usePasscodeV2_ ;
    /**
     * <code>bool use_passcode_v2 = 2;</code>
     * @return The usePasscodeV2.
     */
    public boolean getUsePasscodeV2() {
      return usePasscodeV2_;
    }
    /**
     * <code>bool use_passcode_v2 = 2;</code>
     * @param value The usePasscodeV2 to set.
     * @return This builder for chaining.
     */
    public Builder setUsePasscodeV2(boolean value) {
      
      usePasscodeV2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool use_passcode_v2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsePasscodeV2() {
      
      usePasscodeV2_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PasscodeSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PasscodeSettingsProto)
  private static final POGOProtos.Rpc.PasscodeSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PasscodeSettingsProto();
  }

  public static POGOProtos.Rpc.PasscodeSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PasscodeSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<PasscodeSettingsProto>() {
    @java.lang.Override
    public PasscodeSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PasscodeSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PasscodeSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PasscodeSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PasscodeSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

