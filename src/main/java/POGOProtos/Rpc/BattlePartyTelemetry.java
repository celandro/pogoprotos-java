// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GMEKONCDLGC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BattlePartyTelemetry}
 */
public final class BattlePartyTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BattlePartyTelemetry)
    BattlePartyTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BattlePartyTelemetry.newBuilder() to construct.
  private BattlePartyTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BattlePartyTelemetry() {
    jfjdkdhppdd_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BattlePartyTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BattlePartyTelemetry(
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

            jfjdkdhppdd_ = rawValue;
            break;
          }
          case 16: {

            efbgmldiemp_ = input.readInt32();
            break;
          }
          case 24: {

            kokkgoimcbo_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BattlePartyTelemetry.class, POGOProtos.Rpc.BattlePartyTelemetry.Builder.class);
  }

  public static final int JFJDKDHPPDD_FIELD_NUMBER = 1;
  private int jfjdkdhppdd_;
  /**
   * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds jfjdkdhppdd = 1;</code>
   * @return The enum numeric value on the wire for jfjdkdhppdd.
   */
  @java.lang.Override public int getJfjdkdhppddValue() {
    return jfjdkdhppdd_;
  }
  /**
   * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds jfjdkdhppdd = 1;</code>
   * @return The jfjdkdhppdd.
   */
  @java.lang.Override public POGOProtos.Rpc.BattlePartyTelemetryIds getJfjdkdhppdd() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BattlePartyTelemetryIds result = POGOProtos.Rpc.BattlePartyTelemetryIds.valueOf(jfjdkdhppdd_);
    return result == null ? POGOProtos.Rpc.BattlePartyTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int EFBGMLDIEMP_FIELD_NUMBER = 2;
  private int efbgmldiemp_;
  /**
   * <code>int32 efbgmldiemp = 2;</code>
   * @return The efbgmldiemp.
   */
  @java.lang.Override
  public int getEfbgmldiemp() {
    return efbgmldiemp_;
  }

  public static final int KOKKGOIMCBO_FIELD_NUMBER = 3;
  private int kokkgoimcbo_;
  /**
   * <code>int32 kokkgoimcbo = 3;</code>
   * @return The kokkgoimcbo.
   */
  @java.lang.Override
  public int getKokkgoimcbo() {
    return kokkgoimcbo_;
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
    if (jfjdkdhppdd_ != POGOProtos.Rpc.BattlePartyTelemetryIds.BATTLE_PARTY_TELEMETRY_IDS_UNDEFINED_BATTLE_PARTY_EVENT.getNumber()) {
      output.writeEnum(1, jfjdkdhppdd_);
    }
    if (efbgmldiemp_ != 0) {
      output.writeInt32(2, efbgmldiemp_);
    }
    if (kokkgoimcbo_ != 0) {
      output.writeInt32(3, kokkgoimcbo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jfjdkdhppdd_ != POGOProtos.Rpc.BattlePartyTelemetryIds.BATTLE_PARTY_TELEMETRY_IDS_UNDEFINED_BATTLE_PARTY_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jfjdkdhppdd_);
    }
    if (efbgmldiemp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, efbgmldiemp_);
    }
    if (kokkgoimcbo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, kokkgoimcbo_);
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
    if (!(obj instanceof POGOProtos.Rpc.BattlePartyTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BattlePartyTelemetry other = (POGOProtos.Rpc.BattlePartyTelemetry) obj;

    if (jfjdkdhppdd_ != other.jfjdkdhppdd_) return false;
    if (getEfbgmldiemp()
        != other.getEfbgmldiemp()) return false;
    if (getKokkgoimcbo()
        != other.getKokkgoimcbo()) return false;
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
    hash = (37 * hash) + JFJDKDHPPDD_FIELD_NUMBER;
    hash = (53 * hash) + jfjdkdhppdd_;
    hash = (37 * hash) + EFBGMLDIEMP_FIELD_NUMBER;
    hash = (53 * hash) + getEfbgmldiemp();
    hash = (37 * hash) + KOKKGOIMCBO_FIELD_NUMBER;
    hash = (53 * hash) + getKokkgoimcbo();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BattlePartyTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BattlePartyTelemetry prototype) {
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
   * ref: GMEKONCDLGC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BattlePartyTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BattlePartyTelemetry)
      POGOProtos.Rpc.BattlePartyTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BattlePartyTelemetry.class, POGOProtos.Rpc.BattlePartyTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BattlePartyTelemetry.newBuilder()
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
      jfjdkdhppdd_ = 0;

      efbgmldiemp_ = 0;

      kokkgoimcbo_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BattlePartyTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.BattlePartyTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BattlePartyTelemetry build() {
      POGOProtos.Rpc.BattlePartyTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BattlePartyTelemetry buildPartial() {
      POGOProtos.Rpc.BattlePartyTelemetry result = new POGOProtos.Rpc.BattlePartyTelemetry(this);
      result.jfjdkdhppdd_ = jfjdkdhppdd_;
      result.efbgmldiemp_ = efbgmldiemp_;
      result.kokkgoimcbo_ = kokkgoimcbo_;
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
      if (other instanceof POGOProtos.Rpc.BattlePartyTelemetry) {
        return mergeFrom((POGOProtos.Rpc.BattlePartyTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BattlePartyTelemetry other) {
      if (other == POGOProtos.Rpc.BattlePartyTelemetry.getDefaultInstance()) return this;
      if (other.jfjdkdhppdd_ != 0) {
        setJfjdkdhppddValue(other.getJfjdkdhppddValue());
      }
      if (other.getEfbgmldiemp() != 0) {
        setEfbgmldiemp(other.getEfbgmldiemp());
      }
      if (other.getKokkgoimcbo() != 0) {
        setKokkgoimcbo(other.getKokkgoimcbo());
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
      POGOProtos.Rpc.BattlePartyTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BattlePartyTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int jfjdkdhppdd_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds jfjdkdhppdd = 1;</code>
     * @return The enum numeric value on the wire for jfjdkdhppdd.
     */
    @java.lang.Override public int getJfjdkdhppddValue() {
      return jfjdkdhppdd_;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds jfjdkdhppdd = 1;</code>
     * @param value The enum numeric value on the wire for jfjdkdhppdd to set.
     * @return This builder for chaining.
     */
    public Builder setJfjdkdhppddValue(int value) {
      
      jfjdkdhppdd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds jfjdkdhppdd = 1;</code>
     * @return The jfjdkdhppdd.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BattlePartyTelemetryIds getJfjdkdhppdd() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BattlePartyTelemetryIds result = POGOProtos.Rpc.BattlePartyTelemetryIds.valueOf(jfjdkdhppdd_);
      return result == null ? POGOProtos.Rpc.BattlePartyTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds jfjdkdhppdd = 1;</code>
     * @param value The jfjdkdhppdd to set.
     * @return This builder for chaining.
     */
    public Builder setJfjdkdhppdd(POGOProtos.Rpc.BattlePartyTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jfjdkdhppdd_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds jfjdkdhppdd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJfjdkdhppdd() {
      
      jfjdkdhppdd_ = 0;
      onChanged();
      return this;
    }

    private int efbgmldiemp_ ;
    /**
     * <code>int32 efbgmldiemp = 2;</code>
     * @return The efbgmldiemp.
     */
    @java.lang.Override
    public int getEfbgmldiemp() {
      return efbgmldiemp_;
    }
    /**
     * <code>int32 efbgmldiemp = 2;</code>
     * @param value The efbgmldiemp to set.
     * @return This builder for chaining.
     */
    public Builder setEfbgmldiemp(int value) {
      
      efbgmldiemp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 efbgmldiemp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEfbgmldiemp() {
      
      efbgmldiemp_ = 0;
      onChanged();
      return this;
    }

    private int kokkgoimcbo_ ;
    /**
     * <code>int32 kokkgoimcbo = 3;</code>
     * @return The kokkgoimcbo.
     */
    @java.lang.Override
    public int getKokkgoimcbo() {
      return kokkgoimcbo_;
    }
    /**
     * <code>int32 kokkgoimcbo = 3;</code>
     * @param value The kokkgoimcbo to set.
     * @return This builder for chaining.
     */
    public Builder setKokkgoimcbo(int value) {
      
      kokkgoimcbo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 kokkgoimcbo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKokkgoimcbo() {
      
      kokkgoimcbo_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BattlePartyTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BattlePartyTelemetry)
  private static final POGOProtos.Rpc.BattlePartyTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BattlePartyTelemetry();
  }

  public static POGOProtos.Rpc.BattlePartyTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BattlePartyTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<BattlePartyTelemetry>() {
    @java.lang.Override
    public BattlePartyTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BattlePartyTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BattlePartyTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BattlePartyTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BattlePartyTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

