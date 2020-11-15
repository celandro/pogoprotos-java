// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ZZ_UndefinedProto2}
 */
public final class ZZ_UndefinedProto2 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ZZ_UndefinedProto2)
    ZZ_UndefinedProto2OrBuilder {
private static final long serialVersionUID = 0L;
  // Use ZZ_UndefinedProto2.newBuilder() to construct.
  private ZZ_UndefinedProto2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ZZ_UndefinedProto2() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ZZ_UndefinedProto2();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ZZ_UndefinedProto2(
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

            zz2ObInt64Value_ = input.readInt64();
            break;
          }
          case 17: {

            zz2ObDoubleValue0_ = input.readDouble();
            break;
          }
          case 25: {

            zz2ObDoubleValue1_ = input.readDouble();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ZZ_UndefinedProto2_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ZZ_UndefinedProto2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ZZ_UndefinedProto2.class, POGOProtos.Rpc.ZZ_UndefinedProto2.Builder.class);
  }

  public static final int ZZ_2_OB_INT64_VALUE_FIELD_NUMBER = 1;
  private long zz2ObInt64Value_;
  /**
   * <code>int64 zz_2_ob_int64_value = 1;</code>
   * @return The zz2ObInt64Value.
   */
  @java.lang.Override
  public long getZz2ObInt64Value() {
    return zz2ObInt64Value_;
  }

  public static final int ZZ_2_OB_DOUBLE_VALUE_0_FIELD_NUMBER = 2;
  private double zz2ObDoubleValue0_;
  /**
   * <code>double zz_2_ob_double_value_0 = 2;</code>
   * @return The zz2ObDoubleValue0.
   */
  @java.lang.Override
  public double getZz2ObDoubleValue0() {
    return zz2ObDoubleValue0_;
  }

  public static final int ZZ_2_OB_DOUBLE_VALUE_1_FIELD_NUMBER = 3;
  private double zz2ObDoubleValue1_;
  /**
   * <code>double zz_2_ob_double_value_1 = 3;</code>
   * @return The zz2ObDoubleValue1.
   */
  @java.lang.Override
  public double getZz2ObDoubleValue1() {
    return zz2ObDoubleValue1_;
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
    if (zz2ObInt64Value_ != 0L) {
      output.writeInt64(1, zz2ObInt64Value_);
    }
    if (zz2ObDoubleValue0_ != 0D) {
      output.writeDouble(2, zz2ObDoubleValue0_);
    }
    if (zz2ObDoubleValue1_ != 0D) {
      output.writeDouble(3, zz2ObDoubleValue1_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (zz2ObInt64Value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, zz2ObInt64Value_);
    }
    if (zz2ObDoubleValue0_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, zz2ObDoubleValue0_);
    }
    if (zz2ObDoubleValue1_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, zz2ObDoubleValue1_);
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
    if (!(obj instanceof POGOProtos.Rpc.ZZ_UndefinedProto2)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ZZ_UndefinedProto2 other = (POGOProtos.Rpc.ZZ_UndefinedProto2) obj;

    if (getZz2ObInt64Value()
        != other.getZz2ObInt64Value()) return false;
    if (java.lang.Double.doubleToLongBits(getZz2ObDoubleValue0())
        != java.lang.Double.doubleToLongBits(
            other.getZz2ObDoubleValue0())) return false;
    if (java.lang.Double.doubleToLongBits(getZz2ObDoubleValue1())
        != java.lang.Double.doubleToLongBits(
            other.getZz2ObDoubleValue1())) return false;
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
    hash = (37 * hash) + ZZ_2_OB_INT64_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getZz2ObInt64Value());
    hash = (37 * hash) + ZZ_2_OB_DOUBLE_VALUE_0_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getZz2ObDoubleValue0()));
    hash = (37 * hash) + ZZ_2_OB_DOUBLE_VALUE_1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getZz2ObDoubleValue1()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ZZ_UndefinedProto2 parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ZZ_UndefinedProto2 prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ZZ_UndefinedProto2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ZZ_UndefinedProto2)
      POGOProtos.Rpc.ZZ_UndefinedProto2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ZZ_UndefinedProto2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ZZ_UndefinedProto2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ZZ_UndefinedProto2.class, POGOProtos.Rpc.ZZ_UndefinedProto2.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ZZ_UndefinedProto2.newBuilder()
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
      zz2ObInt64Value_ = 0L;

      zz2ObDoubleValue0_ = 0D;

      zz2ObDoubleValue1_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ZZ_UndefinedProto2_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ZZ_UndefinedProto2 getDefaultInstanceForType() {
      return POGOProtos.Rpc.ZZ_UndefinedProto2.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ZZ_UndefinedProto2 build() {
      POGOProtos.Rpc.ZZ_UndefinedProto2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ZZ_UndefinedProto2 buildPartial() {
      POGOProtos.Rpc.ZZ_UndefinedProto2 result = new POGOProtos.Rpc.ZZ_UndefinedProto2(this);
      result.zz2ObInt64Value_ = zz2ObInt64Value_;
      result.zz2ObDoubleValue0_ = zz2ObDoubleValue0_;
      result.zz2ObDoubleValue1_ = zz2ObDoubleValue1_;
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
      if (other instanceof POGOProtos.Rpc.ZZ_UndefinedProto2) {
        return mergeFrom((POGOProtos.Rpc.ZZ_UndefinedProto2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ZZ_UndefinedProto2 other) {
      if (other == POGOProtos.Rpc.ZZ_UndefinedProto2.getDefaultInstance()) return this;
      if (other.getZz2ObInt64Value() != 0L) {
        setZz2ObInt64Value(other.getZz2ObInt64Value());
      }
      if (other.getZz2ObDoubleValue0() != 0D) {
        setZz2ObDoubleValue0(other.getZz2ObDoubleValue0());
      }
      if (other.getZz2ObDoubleValue1() != 0D) {
        setZz2ObDoubleValue1(other.getZz2ObDoubleValue1());
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
      POGOProtos.Rpc.ZZ_UndefinedProto2 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ZZ_UndefinedProto2) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long zz2ObInt64Value_ ;
    /**
     * <code>int64 zz_2_ob_int64_value = 1;</code>
     * @return The zz2ObInt64Value.
     */
    @java.lang.Override
    public long getZz2ObInt64Value() {
      return zz2ObInt64Value_;
    }
    /**
     * <code>int64 zz_2_ob_int64_value = 1;</code>
     * @param value The zz2ObInt64Value to set.
     * @return This builder for chaining.
     */
    public Builder setZz2ObInt64Value(long value) {
      
      zz2ObInt64Value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 zz_2_ob_int64_value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearZz2ObInt64Value() {
      
      zz2ObInt64Value_ = 0L;
      onChanged();
      return this;
    }

    private double zz2ObDoubleValue0_ ;
    /**
     * <code>double zz_2_ob_double_value_0 = 2;</code>
     * @return The zz2ObDoubleValue0.
     */
    @java.lang.Override
    public double getZz2ObDoubleValue0() {
      return zz2ObDoubleValue0_;
    }
    /**
     * <code>double zz_2_ob_double_value_0 = 2;</code>
     * @param value The zz2ObDoubleValue0 to set.
     * @return This builder for chaining.
     */
    public Builder setZz2ObDoubleValue0(double value) {
      
      zz2ObDoubleValue0_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double zz_2_ob_double_value_0 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearZz2ObDoubleValue0() {
      
      zz2ObDoubleValue0_ = 0D;
      onChanged();
      return this;
    }

    private double zz2ObDoubleValue1_ ;
    /**
     * <code>double zz_2_ob_double_value_1 = 3;</code>
     * @return The zz2ObDoubleValue1.
     */
    @java.lang.Override
    public double getZz2ObDoubleValue1() {
      return zz2ObDoubleValue1_;
    }
    /**
     * <code>double zz_2_ob_double_value_1 = 3;</code>
     * @param value The zz2ObDoubleValue1 to set.
     * @return This builder for chaining.
     */
    public Builder setZz2ObDoubleValue1(double value) {
      
      zz2ObDoubleValue1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double zz_2_ob_double_value_1 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearZz2ObDoubleValue1() {
      
      zz2ObDoubleValue1_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ZZ_UndefinedProto2)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ZZ_UndefinedProto2)
  private static final POGOProtos.Rpc.ZZ_UndefinedProto2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ZZ_UndefinedProto2();
  }

  public static POGOProtos.Rpc.ZZ_UndefinedProto2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ZZ_UndefinedProto2>
      PARSER = new com.google.protobuf.AbstractParser<ZZ_UndefinedProto2>() {
    @java.lang.Override
    public ZZ_UndefinedProto2 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ZZ_UndefinedProto2(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ZZ_UndefinedProto2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ZZ_UndefinedProto2> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ZZ_UndefinedProto2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

