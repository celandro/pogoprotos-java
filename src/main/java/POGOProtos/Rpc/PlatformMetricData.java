// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformMetricData}
 */
public  final class PlatformMetricData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformMetricData)
    PlatformMetricDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformMetricData.newBuilder() to construct.
  private PlatformMetricData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformMetricData() {
    metricKind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformMetricData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformMetricData(
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
            POGOProtos.Rpc.TelemetryCommon.Builder subBuilder = null;
            if (commonTelemetry_ != null) {
              subBuilder = commonTelemetry_.toBuilder();
            }
            commonTelemetry_ = input.readMessage(POGOProtos.Rpc.TelemetryCommon.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commonTelemetry_);
              commonTelemetry_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            longValue_ = input.readInt64();
            break;
          }
          case 25: {

            doubleValue_ = input.readDouble();
            break;
          }
          case 32: {

            booleanValue_ = input.readBool();
            break;
          }
          case 42: {
            POGOProtos.Rpc.Distribution.Builder subBuilder = null;
            if (distribution_ != null) {
              subBuilder = distribution_.toBuilder();
            }
            distribution_ = input.readMessage(POGOProtos.Rpc.Distribution.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(distribution_);
              distribution_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            metricKind_ = rawValue;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformMetricData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformMetricData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformMetricData.class, POGOProtos.Rpc.PlatformMetricData.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.PlatformMetricData.Kind}
   */
  public enum Kind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <code>GAUGE = 1;</code>
     */
    GAUGE(1),
    /**
     * <code>DELTA = 2;</code>
     */
    DELTA(2),
    /**
     * <code>CUMULATIVE = 3;</code>
     */
    CUMULATIVE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <code>GAUGE = 1;</code>
     */
    public static final int GAUGE_VALUE = 1;
    /**
     * <code>DELTA = 2;</code>
     */
    public static final int DELTA_VALUE = 2;
    /**
     * <code>CUMULATIVE = 3;</code>
     */
    public static final int CUMULATIVE_VALUE = 3;


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
    public static Kind valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Kind forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return GAUGE;
        case 2: return DELTA;
        case 3: return CUMULATIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Kind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Kind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
            public Kind findValueByNumber(int number) {
              return Kind.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.PlatformMetricData.getDescriptor().getEnumTypes().get(0);
    }

    private static final Kind[] VALUES = values();

    public static Kind valueOf(
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

    private Kind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlatformMetricData.Kind)
  }

  public static final int COMMON_TELEMETRY_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.TelemetryCommon commonTelemetry_;
  /**
   * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
   * @return Whether the commonTelemetry field is set.
   */
  public boolean hasCommonTelemetry() {
    return commonTelemetry_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
   * @return The commonTelemetry.
   */
  public POGOProtos.Rpc.TelemetryCommon getCommonTelemetry() {
    return commonTelemetry_ == null ? POGOProtos.Rpc.TelemetryCommon.getDefaultInstance() : commonTelemetry_;
  }
  /**
   * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
   */
  public POGOProtos.Rpc.TelemetryCommonOrBuilder getCommonTelemetryOrBuilder() {
    return getCommonTelemetry();
  }

  public static final int LONG_VALUE_FIELD_NUMBER = 2;
  private long longValue_;
  /**
   * <code>int64 long_value = 2;</code>
   * @return The longValue.
   */
  public long getLongValue() {
    return longValue_;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
  private double doubleValue_;
  /**
   * <code>double double_value = 3;</code>
   * @return The doubleValue.
   */
  public double getDoubleValue() {
    return doubleValue_;
  }

  public static final int BOOLEAN_VALUE_FIELD_NUMBER = 4;
  private boolean booleanValue_;
  /**
   * <code>bool boolean_value = 4;</code>
   * @return The booleanValue.
   */
  public boolean getBooleanValue() {
    return booleanValue_;
  }

  public static final int DISTRIBUTION_FIELD_NUMBER = 5;
  private POGOProtos.Rpc.Distribution distribution_;
  /**
   * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
   * @return Whether the distribution field is set.
   */
  public boolean hasDistribution() {
    return distribution_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
   * @return The distribution.
   */
  public POGOProtos.Rpc.Distribution getDistribution() {
    return distribution_ == null ? POGOProtos.Rpc.Distribution.getDefaultInstance() : distribution_;
  }
  /**
   * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
   */
  public POGOProtos.Rpc.DistributionOrBuilder getDistributionOrBuilder() {
    return getDistribution();
  }

  public static final int METRIC_KIND_FIELD_NUMBER = 6;
  private int metricKind_;
  /**
   * <code>.POGOProtos.Rpc.PlatformMetricData.Kind metric_kind = 6;</code>
   * @return The enum numeric value on the wire for metricKind.
   */
  public int getMetricKindValue() {
    return metricKind_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformMetricData.Kind metric_kind = 6;</code>
   * @return The metricKind.
   */
  public POGOProtos.Rpc.PlatformMetricData.Kind getMetricKind() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PlatformMetricData.Kind result = POGOProtos.Rpc.PlatformMetricData.Kind.valueOf(metricKind_);
    return result == null ? POGOProtos.Rpc.PlatformMetricData.Kind.UNRECOGNIZED : result;
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
    if (commonTelemetry_ != null) {
      output.writeMessage(1, getCommonTelemetry());
    }
    if (longValue_ != 0L) {
      output.writeInt64(2, longValue_);
    }
    if (doubleValue_ != 0D) {
      output.writeDouble(3, doubleValue_);
    }
    if (booleanValue_ != false) {
      output.writeBool(4, booleanValue_);
    }
    if (distribution_ != null) {
      output.writeMessage(5, getDistribution());
    }
    if (metricKind_ != POGOProtos.Rpc.PlatformMetricData.Kind.UNSPECIFIED.getNumber()) {
      output.writeEnum(6, metricKind_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commonTelemetry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommonTelemetry());
    }
    if (longValue_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, longValue_);
    }
    if (doubleValue_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, doubleValue_);
    }
    if (booleanValue_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, booleanValue_);
    }
    if (distribution_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDistribution());
    }
    if (metricKind_ != POGOProtos.Rpc.PlatformMetricData.Kind.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, metricKind_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformMetricData)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformMetricData other = (POGOProtos.Rpc.PlatformMetricData) obj;

    if (hasCommonTelemetry() != other.hasCommonTelemetry()) return false;
    if (hasCommonTelemetry()) {
      if (!getCommonTelemetry()
          .equals(other.getCommonTelemetry())) return false;
    }
    if (getLongValue()
        != other.getLongValue()) return false;
    if (java.lang.Double.doubleToLongBits(getDoubleValue())
        != java.lang.Double.doubleToLongBits(
            other.getDoubleValue())) return false;
    if (getBooleanValue()
        != other.getBooleanValue()) return false;
    if (hasDistribution() != other.hasDistribution()) return false;
    if (hasDistribution()) {
      if (!getDistribution()
          .equals(other.getDistribution())) return false;
    }
    if (metricKind_ != other.metricKind_) return false;
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
    if (hasCommonTelemetry()) {
      hash = (37 * hash) + COMMON_TELEMETRY_FIELD_NUMBER;
      hash = (53 * hash) + getCommonTelemetry().hashCode();
    }
    hash = (37 * hash) + LONG_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLongValue());
    hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDoubleValue()));
    hash = (37 * hash) + BOOLEAN_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBooleanValue());
    if (hasDistribution()) {
      hash = (37 * hash) + DISTRIBUTION_FIELD_NUMBER;
      hash = (53 * hash) + getDistribution().hashCode();
    }
    hash = (37 * hash) + METRIC_KIND_FIELD_NUMBER;
    hash = (53 * hash) + metricKind_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformMetricData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformMetricData parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformMetricData prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformMetricData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformMetricData)
      POGOProtos.Rpc.PlatformMetricDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformMetricData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformMetricData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformMetricData.class, POGOProtos.Rpc.PlatformMetricData.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformMetricData.newBuilder()
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
      if (commonTelemetryBuilder_ == null) {
        commonTelemetry_ = null;
      } else {
        commonTelemetry_ = null;
        commonTelemetryBuilder_ = null;
      }
      longValue_ = 0L;

      doubleValue_ = 0D;

      booleanValue_ = false;

      if (distributionBuilder_ == null) {
        distribution_ = null;
      } else {
        distribution_ = null;
        distributionBuilder_ = null;
      }
      metricKind_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformMetricData_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformMetricData getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformMetricData.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformMetricData build() {
      POGOProtos.Rpc.PlatformMetricData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformMetricData buildPartial() {
      POGOProtos.Rpc.PlatformMetricData result = new POGOProtos.Rpc.PlatformMetricData(this);
      if (commonTelemetryBuilder_ == null) {
        result.commonTelemetry_ = commonTelemetry_;
      } else {
        result.commonTelemetry_ = commonTelemetryBuilder_.build();
      }
      result.longValue_ = longValue_;
      result.doubleValue_ = doubleValue_;
      result.booleanValue_ = booleanValue_;
      if (distributionBuilder_ == null) {
        result.distribution_ = distribution_;
      } else {
        result.distribution_ = distributionBuilder_.build();
      }
      result.metricKind_ = metricKind_;
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
      if (other instanceof POGOProtos.Rpc.PlatformMetricData) {
        return mergeFrom((POGOProtos.Rpc.PlatformMetricData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformMetricData other) {
      if (other == POGOProtos.Rpc.PlatformMetricData.getDefaultInstance()) return this;
      if (other.hasCommonTelemetry()) {
        mergeCommonTelemetry(other.getCommonTelemetry());
      }
      if (other.getLongValue() != 0L) {
        setLongValue(other.getLongValue());
      }
      if (other.getDoubleValue() != 0D) {
        setDoubleValue(other.getDoubleValue());
      }
      if (other.getBooleanValue() != false) {
        setBooleanValue(other.getBooleanValue());
      }
      if (other.hasDistribution()) {
        mergeDistribution(other.getDistribution());
      }
      if (other.metricKind_ != 0) {
        setMetricKindValue(other.getMetricKindValue());
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
      POGOProtos.Rpc.PlatformMetricData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformMetricData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.TelemetryCommon commonTelemetry_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.TelemetryCommon, POGOProtos.Rpc.TelemetryCommon.Builder, POGOProtos.Rpc.TelemetryCommonOrBuilder> commonTelemetryBuilder_;
    /**
     * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
     * @return Whether the commonTelemetry field is set.
     */
    public boolean hasCommonTelemetry() {
      return commonTelemetryBuilder_ != null || commonTelemetry_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
     * @return The commonTelemetry.
     */
    public POGOProtos.Rpc.TelemetryCommon getCommonTelemetry() {
      if (commonTelemetryBuilder_ == null) {
        return commonTelemetry_ == null ? POGOProtos.Rpc.TelemetryCommon.getDefaultInstance() : commonTelemetry_;
      } else {
        return commonTelemetryBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
     */
    public Builder setCommonTelemetry(POGOProtos.Rpc.TelemetryCommon value) {
      if (commonTelemetryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonTelemetry_ = value;
        onChanged();
      } else {
        commonTelemetryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
     */
    public Builder setCommonTelemetry(
        POGOProtos.Rpc.TelemetryCommon.Builder builderForValue) {
      if (commonTelemetryBuilder_ == null) {
        commonTelemetry_ = builderForValue.build();
        onChanged();
      } else {
        commonTelemetryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
     */
    public Builder mergeCommonTelemetry(POGOProtos.Rpc.TelemetryCommon value) {
      if (commonTelemetryBuilder_ == null) {
        if (commonTelemetry_ != null) {
          commonTelemetry_ =
            POGOProtos.Rpc.TelemetryCommon.newBuilder(commonTelemetry_).mergeFrom(value).buildPartial();
        } else {
          commonTelemetry_ = value;
        }
        onChanged();
      } else {
        commonTelemetryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
     */
    public Builder clearCommonTelemetry() {
      if (commonTelemetryBuilder_ == null) {
        commonTelemetry_ = null;
        onChanged();
      } else {
        commonTelemetry_ = null;
        commonTelemetryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
     */
    public POGOProtos.Rpc.TelemetryCommon.Builder getCommonTelemetryBuilder() {
      
      onChanged();
      return getCommonTelemetryFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
     */
    public POGOProtos.Rpc.TelemetryCommonOrBuilder getCommonTelemetryOrBuilder() {
      if (commonTelemetryBuilder_ != null) {
        return commonTelemetryBuilder_.getMessageOrBuilder();
      } else {
        return commonTelemetry_ == null ?
            POGOProtos.Rpc.TelemetryCommon.getDefaultInstance() : commonTelemetry_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.TelemetryCommon common_telemetry = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.TelemetryCommon, POGOProtos.Rpc.TelemetryCommon.Builder, POGOProtos.Rpc.TelemetryCommonOrBuilder> 
        getCommonTelemetryFieldBuilder() {
      if (commonTelemetryBuilder_ == null) {
        commonTelemetryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.TelemetryCommon, POGOProtos.Rpc.TelemetryCommon.Builder, POGOProtos.Rpc.TelemetryCommonOrBuilder>(
                getCommonTelemetry(),
                getParentForChildren(),
                isClean());
        commonTelemetry_ = null;
      }
      return commonTelemetryBuilder_;
    }

    private long longValue_ ;
    /**
     * <code>int64 long_value = 2;</code>
     * @return The longValue.
     */
    public long getLongValue() {
      return longValue_;
    }
    /**
     * <code>int64 long_value = 2;</code>
     * @param value The longValue to set.
     * @return This builder for chaining.
     */
    public Builder setLongValue(long value) {
      
      longValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 long_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongValue() {
      
      longValue_ = 0L;
      onChanged();
      return this;
    }

    private double doubleValue_ ;
    /**
     * <code>double double_value = 3;</code>
     * @return The doubleValue.
     */
    public double getDoubleValue() {
      return doubleValue_;
    }
    /**
     * <code>double double_value = 3;</code>
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {
      
      doubleValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double double_value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      
      doubleValue_ = 0D;
      onChanged();
      return this;
    }

    private boolean booleanValue_ ;
    /**
     * <code>bool boolean_value = 4;</code>
     * @return The booleanValue.
     */
    public boolean getBooleanValue() {
      return booleanValue_;
    }
    /**
     * <code>bool boolean_value = 4;</code>
     * @param value The booleanValue to set.
     * @return This builder for chaining.
     */
    public Builder setBooleanValue(boolean value) {
      
      booleanValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool boolean_value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBooleanValue() {
      
      booleanValue_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.Distribution distribution_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.Distribution, POGOProtos.Rpc.Distribution.Builder, POGOProtos.Rpc.DistributionOrBuilder> distributionBuilder_;
    /**
     * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
     * @return Whether the distribution field is set.
     */
    public boolean hasDistribution() {
      return distributionBuilder_ != null || distribution_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
     * @return The distribution.
     */
    public POGOProtos.Rpc.Distribution getDistribution() {
      if (distributionBuilder_ == null) {
        return distribution_ == null ? POGOProtos.Rpc.Distribution.getDefaultInstance() : distribution_;
      } else {
        return distributionBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
     */
    public Builder setDistribution(POGOProtos.Rpc.Distribution value) {
      if (distributionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        distribution_ = value;
        onChanged();
      } else {
        distributionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
     */
    public Builder setDistribution(
        POGOProtos.Rpc.Distribution.Builder builderForValue) {
      if (distributionBuilder_ == null) {
        distribution_ = builderForValue.build();
        onChanged();
      } else {
        distributionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
     */
    public Builder mergeDistribution(POGOProtos.Rpc.Distribution value) {
      if (distributionBuilder_ == null) {
        if (distribution_ != null) {
          distribution_ =
            POGOProtos.Rpc.Distribution.newBuilder(distribution_).mergeFrom(value).buildPartial();
        } else {
          distribution_ = value;
        }
        onChanged();
      } else {
        distributionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
     */
    public Builder clearDistribution() {
      if (distributionBuilder_ == null) {
        distribution_ = null;
        onChanged();
      } else {
        distribution_ = null;
        distributionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
     */
    public POGOProtos.Rpc.Distribution.Builder getDistributionBuilder() {
      
      onChanged();
      return getDistributionFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
     */
    public POGOProtos.Rpc.DistributionOrBuilder getDistributionOrBuilder() {
      if (distributionBuilder_ != null) {
        return distributionBuilder_.getMessageOrBuilder();
      } else {
        return distribution_ == null ?
            POGOProtos.Rpc.Distribution.getDefaultInstance() : distribution_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.Distribution distribution = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.Distribution, POGOProtos.Rpc.Distribution.Builder, POGOProtos.Rpc.DistributionOrBuilder> 
        getDistributionFieldBuilder() {
      if (distributionBuilder_ == null) {
        distributionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.Distribution, POGOProtos.Rpc.Distribution.Builder, POGOProtos.Rpc.DistributionOrBuilder>(
                getDistribution(),
                getParentForChildren(),
                isClean());
        distribution_ = null;
      }
      return distributionBuilder_;
    }

    private int metricKind_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData.Kind metric_kind = 6;</code>
     * @return The enum numeric value on the wire for metricKind.
     */
    public int getMetricKindValue() {
      return metricKind_;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData.Kind metric_kind = 6;</code>
     * @param value The enum numeric value on the wire for metricKind to set.
     * @return This builder for chaining.
     */
    public Builder setMetricKindValue(int value) {
      metricKind_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData.Kind metric_kind = 6;</code>
     * @return The metricKind.
     */
    public POGOProtos.Rpc.PlatformMetricData.Kind getMetricKind() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PlatformMetricData.Kind result = POGOProtos.Rpc.PlatformMetricData.Kind.valueOf(metricKind_);
      return result == null ? POGOProtos.Rpc.PlatformMetricData.Kind.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData.Kind metric_kind = 6;</code>
     * @param value The metricKind to set.
     * @return This builder for chaining.
     */
    public Builder setMetricKind(POGOProtos.Rpc.PlatformMetricData.Kind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      metricKind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformMetricData.Kind metric_kind = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetricKind() {
      
      metricKind_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformMetricData)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformMetricData)
  private static final POGOProtos.Rpc.PlatformMetricData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformMetricData();
  }

  public static POGOProtos.Rpc.PlatformMetricData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformMetricData>
      PARSER = new com.google.protobuf.AbstractParser<PlatformMetricData>() {
    @java.lang.Override
    public PlatformMetricData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformMetricData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformMetricData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformMetricData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformMetricData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

