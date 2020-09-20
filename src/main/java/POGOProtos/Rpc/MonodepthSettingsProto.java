// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ONPNFJGELON
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MonodepthSettingsProto}
 */
public final class MonodepthSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MonodepthSettingsProto)
    MonodepthSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MonodepthSettingsProto.newBuilder() to construct.
  private MonodepthSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MonodepthSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MonodepthSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MonodepthSettingsProto(
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

            enableOcclusions_ = input.readBool();
            break;
          }
          case 16: {

            occlusionsDefaultOn_ = input.readBool();
            break;
          }
          case 24: {

            occlusionsToggleVisible_ = input.readBool();
            break;
          }
          case 32: {

            field1_ = input.readBool();
            break;
          }
          case 45: {

            field2_ = input.readFloat();
            break;
          }
          case 48: {

            field3_ = input.readUInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MonodepthSettingsProto.class, POGOProtos.Rpc.MonodepthSettingsProto.Builder.class);
  }

  public static final int ENABLE_OCCLUSIONS_FIELD_NUMBER = 1;
  private boolean enableOcclusions_;
  /**
   * <code>bool enable_occlusions = 1;</code>
   * @return The enableOcclusions.
   */
  @java.lang.Override
  public boolean getEnableOcclusions() {
    return enableOcclusions_;
  }

  public static final int OCCLUSIONS_DEFAULT_ON_FIELD_NUMBER = 2;
  private boolean occlusionsDefaultOn_;
  /**
   * <code>bool occlusions_default_on = 2;</code>
   * @return The occlusionsDefaultOn.
   */
  @java.lang.Override
  public boolean getOcclusionsDefaultOn() {
    return occlusionsDefaultOn_;
  }

  public static final int OCCLUSIONS_TOGGLE_VISIBLE_FIELD_NUMBER = 3;
  private boolean occlusionsToggleVisible_;
  /**
   * <code>bool occlusions_toggle_visible = 3;</code>
   * @return The occlusionsToggleVisible.
   */
  @java.lang.Override
  public boolean getOcclusionsToggleVisible() {
    return occlusionsToggleVisible_;
  }

  public static final int FIELD1_FIELD_NUMBER = 4;
  private boolean field1_;
  /**
   * <code>bool field1 = 4;</code>
   * @return The field1.
   */
  @java.lang.Override
  public boolean getField1() {
    return field1_;
  }

  public static final int FIELD2_FIELD_NUMBER = 5;
  private float field2_;
  /**
   * <code>float field2 = 5;</code>
   * @return The field2.
   */
  @java.lang.Override
  public float getField2() {
    return field2_;
  }

  public static final int FIELD3_FIELD_NUMBER = 6;
  private int field3_;
  /**
   * <code>uint32 field3 = 6;</code>
   * @return The field3.
   */
  @java.lang.Override
  public int getField3() {
    return field3_;
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
    if (enableOcclusions_ != false) {
      output.writeBool(1, enableOcclusions_);
    }
    if (occlusionsDefaultOn_ != false) {
      output.writeBool(2, occlusionsDefaultOn_);
    }
    if (occlusionsToggleVisible_ != false) {
      output.writeBool(3, occlusionsToggleVisible_);
    }
    if (field1_ != false) {
      output.writeBool(4, field1_);
    }
    if (field2_ != 0F) {
      output.writeFloat(5, field2_);
    }
    if (field3_ != 0) {
      output.writeUInt32(6, field3_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableOcclusions_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableOcclusions_);
    }
    if (occlusionsDefaultOn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, occlusionsDefaultOn_);
    }
    if (occlusionsToggleVisible_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, occlusionsToggleVisible_);
    }
    if (field1_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, field1_);
    }
    if (field2_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, field2_);
    }
    if (field3_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, field3_);
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
    if (!(obj instanceof POGOProtos.Rpc.MonodepthSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MonodepthSettingsProto other = (POGOProtos.Rpc.MonodepthSettingsProto) obj;

    if (getEnableOcclusions()
        != other.getEnableOcclusions()) return false;
    if (getOcclusionsDefaultOn()
        != other.getOcclusionsDefaultOn()) return false;
    if (getOcclusionsToggleVisible()
        != other.getOcclusionsToggleVisible()) return false;
    if (getField1()
        != other.getField1()) return false;
    if (java.lang.Float.floatToIntBits(getField2())
        != java.lang.Float.floatToIntBits(
            other.getField2())) return false;
    if (getField3()
        != other.getField3()) return false;
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
    hash = (37 * hash) + ENABLE_OCCLUSIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableOcclusions());
    hash = (37 * hash) + OCCLUSIONS_DEFAULT_ON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOcclusionsDefaultOn());
    hash = (37 * hash) + OCCLUSIONS_TOGGLE_VISIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOcclusionsToggleVisible());
    hash = (37 * hash) + FIELD1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getField1());
    hash = (37 * hash) + FIELD2_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getField2());
    hash = (37 * hash) + FIELD3_FIELD_NUMBER;
    hash = (53 * hash) + getField3();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MonodepthSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MonodepthSettingsProto prototype) {
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
   * ref: ONPNFJGELON
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MonodepthSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MonodepthSettingsProto)
      POGOProtos.Rpc.MonodepthSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MonodepthSettingsProto.class, POGOProtos.Rpc.MonodepthSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MonodepthSettingsProto.newBuilder()
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
      enableOcclusions_ = false;

      occlusionsDefaultOn_ = false;

      occlusionsToggleVisible_ = false;

      field1_ = false;

      field2_ = 0F;

      field3_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MonodepthSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MonodepthSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.MonodepthSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MonodepthSettingsProto build() {
      POGOProtos.Rpc.MonodepthSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MonodepthSettingsProto buildPartial() {
      POGOProtos.Rpc.MonodepthSettingsProto result = new POGOProtos.Rpc.MonodepthSettingsProto(this);
      result.enableOcclusions_ = enableOcclusions_;
      result.occlusionsDefaultOn_ = occlusionsDefaultOn_;
      result.occlusionsToggleVisible_ = occlusionsToggleVisible_;
      result.field1_ = field1_;
      result.field2_ = field2_;
      result.field3_ = field3_;
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
      if (other instanceof POGOProtos.Rpc.MonodepthSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.MonodepthSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MonodepthSettingsProto other) {
      if (other == POGOProtos.Rpc.MonodepthSettingsProto.getDefaultInstance()) return this;
      if (other.getEnableOcclusions() != false) {
        setEnableOcclusions(other.getEnableOcclusions());
      }
      if (other.getOcclusionsDefaultOn() != false) {
        setOcclusionsDefaultOn(other.getOcclusionsDefaultOn());
      }
      if (other.getOcclusionsToggleVisible() != false) {
        setOcclusionsToggleVisible(other.getOcclusionsToggleVisible());
      }
      if (other.getField1() != false) {
        setField1(other.getField1());
      }
      if (other.getField2() != 0F) {
        setField2(other.getField2());
      }
      if (other.getField3() != 0) {
        setField3(other.getField3());
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
      POGOProtos.Rpc.MonodepthSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MonodepthSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableOcclusions_ ;
    /**
     * <code>bool enable_occlusions = 1;</code>
     * @return The enableOcclusions.
     */
    @java.lang.Override
    public boolean getEnableOcclusions() {
      return enableOcclusions_;
    }
    /**
     * <code>bool enable_occlusions = 1;</code>
     * @param value The enableOcclusions to set.
     * @return This builder for chaining.
     */
    public Builder setEnableOcclusions(boolean value) {
      
      enableOcclusions_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_occlusions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableOcclusions() {
      
      enableOcclusions_ = false;
      onChanged();
      return this;
    }

    private boolean occlusionsDefaultOn_ ;
    /**
     * <code>bool occlusions_default_on = 2;</code>
     * @return The occlusionsDefaultOn.
     */
    @java.lang.Override
    public boolean getOcclusionsDefaultOn() {
      return occlusionsDefaultOn_;
    }
    /**
     * <code>bool occlusions_default_on = 2;</code>
     * @param value The occlusionsDefaultOn to set.
     * @return This builder for chaining.
     */
    public Builder setOcclusionsDefaultOn(boolean value) {
      
      occlusionsDefaultOn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool occlusions_default_on = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOcclusionsDefaultOn() {
      
      occlusionsDefaultOn_ = false;
      onChanged();
      return this;
    }

    private boolean occlusionsToggleVisible_ ;
    /**
     * <code>bool occlusions_toggle_visible = 3;</code>
     * @return The occlusionsToggleVisible.
     */
    @java.lang.Override
    public boolean getOcclusionsToggleVisible() {
      return occlusionsToggleVisible_;
    }
    /**
     * <code>bool occlusions_toggle_visible = 3;</code>
     * @param value The occlusionsToggleVisible to set.
     * @return This builder for chaining.
     */
    public Builder setOcclusionsToggleVisible(boolean value) {
      
      occlusionsToggleVisible_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool occlusions_toggle_visible = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOcclusionsToggleVisible() {
      
      occlusionsToggleVisible_ = false;
      onChanged();
      return this;
    }

    private boolean field1_ ;
    /**
     * <code>bool field1 = 4;</code>
     * @return The field1.
     */
    @java.lang.Override
    public boolean getField1() {
      return field1_;
    }
    /**
     * <code>bool field1 = 4;</code>
     * @param value The field1 to set.
     * @return This builder for chaining.
     */
    public Builder setField1(boolean value) {
      
      field1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool field1 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearField1() {
      
      field1_ = false;
      onChanged();
      return this;
    }

    private float field2_ ;
    /**
     * <code>float field2 = 5;</code>
     * @return The field2.
     */
    @java.lang.Override
    public float getField2() {
      return field2_;
    }
    /**
     * <code>float field2 = 5;</code>
     * @param value The field2 to set.
     * @return This builder for chaining.
     */
    public Builder setField2(float value) {
      
      field2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float field2 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearField2() {
      
      field2_ = 0F;
      onChanged();
      return this;
    }

    private int field3_ ;
    /**
     * <code>uint32 field3 = 6;</code>
     * @return The field3.
     */
    @java.lang.Override
    public int getField3() {
      return field3_;
    }
    /**
     * <code>uint32 field3 = 6;</code>
     * @param value The field3 to set.
     * @return This builder for chaining.
     */
    public Builder setField3(int value) {
      
      field3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 field3 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearField3() {
      
      field3_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MonodepthSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MonodepthSettingsProto)
  private static final POGOProtos.Rpc.MonodepthSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MonodepthSettingsProto();
  }

  public static POGOProtos.Rpc.MonodepthSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonodepthSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<MonodepthSettingsProto>() {
    @java.lang.Override
    public MonodepthSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MonodepthSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MonodepthSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MonodepthSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MonodepthSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

