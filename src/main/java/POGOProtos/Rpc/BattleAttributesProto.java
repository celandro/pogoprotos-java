// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LBLNNGLBOGB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BattleAttributesProto}
 */
public final class BattleAttributesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BattleAttributesProto)
    BattleAttributesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BattleAttributesProto.newBuilder() to construct.
  private BattleAttributesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BattleAttributesProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BattleAttributesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BattleAttributesProto(
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
          case 13: {

            mopajblfilb_ = input.readFloat();
            break;
          }
          case 21: {

            ekgmjpdbpcg_ = input.readFloat();
            break;
          }
          case 29: {

            hdpfooknanf_ = input.readFloat();
            break;
          }
          case 37: {

            adbcjmkmpnn_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BattleAttributesProto.class, POGOProtos.Rpc.BattleAttributesProto.Builder.class);
  }

  public static final int MOPAJBLFILB_FIELD_NUMBER = 1;
  private float mopajblfilb_;
  /**
   * <code>float mopajblfilb = 1;</code>
   * @return The mopajblfilb.
   */
  @java.lang.Override
  public float getMopajblfilb() {
    return mopajblfilb_;
  }

  public static final int EKGMJPDBPCG_FIELD_NUMBER = 2;
  private float ekgmjpdbpcg_;
  /**
   * <code>float ekgmjpdbpcg = 2;</code>
   * @return The ekgmjpdbpcg.
   */
  @java.lang.Override
  public float getEkgmjpdbpcg() {
    return ekgmjpdbpcg_;
  }

  public static final int HDPFOOKNANF_FIELD_NUMBER = 3;
  private float hdpfooknanf_;
  /**
   * <code>float hdpfooknanf = 3;</code>
   * @return The hdpfooknanf.
   */
  @java.lang.Override
  public float getHdpfooknanf() {
    return hdpfooknanf_;
  }

  public static final int ADBCJMKMPNN_FIELD_NUMBER = 4;
  private float adbcjmkmpnn_;
  /**
   * <code>float adbcjmkmpnn = 4;</code>
   * @return The adbcjmkmpnn.
   */
  @java.lang.Override
  public float getAdbcjmkmpnn() {
    return adbcjmkmpnn_;
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
    if (mopajblfilb_ != 0F) {
      output.writeFloat(1, mopajblfilb_);
    }
    if (ekgmjpdbpcg_ != 0F) {
      output.writeFloat(2, ekgmjpdbpcg_);
    }
    if (hdpfooknanf_ != 0F) {
      output.writeFloat(3, hdpfooknanf_);
    }
    if (adbcjmkmpnn_ != 0F) {
      output.writeFloat(4, adbcjmkmpnn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mopajblfilb_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, mopajblfilb_);
    }
    if (ekgmjpdbpcg_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, ekgmjpdbpcg_);
    }
    if (hdpfooknanf_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, hdpfooknanf_);
    }
    if (adbcjmkmpnn_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, adbcjmkmpnn_);
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
    if (!(obj instanceof POGOProtos.Rpc.BattleAttributesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BattleAttributesProto other = (POGOProtos.Rpc.BattleAttributesProto) obj;

    if (java.lang.Float.floatToIntBits(getMopajblfilb())
        != java.lang.Float.floatToIntBits(
            other.getMopajblfilb())) return false;
    if (java.lang.Float.floatToIntBits(getEkgmjpdbpcg())
        != java.lang.Float.floatToIntBits(
            other.getEkgmjpdbpcg())) return false;
    if (java.lang.Float.floatToIntBits(getHdpfooknanf())
        != java.lang.Float.floatToIntBits(
            other.getHdpfooknanf())) return false;
    if (java.lang.Float.floatToIntBits(getAdbcjmkmpnn())
        != java.lang.Float.floatToIntBits(
            other.getAdbcjmkmpnn())) return false;
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
    hash = (37 * hash) + MOPAJBLFILB_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMopajblfilb());
    hash = (37 * hash) + EKGMJPDBPCG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getEkgmjpdbpcg());
    hash = (37 * hash) + HDPFOOKNANF_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getHdpfooknanf());
    hash = (37 * hash) + ADBCJMKMPNN_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAdbcjmkmpnn());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BattleAttributesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BattleAttributesProto prototype) {
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
   * ref: LBLNNGLBOGB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BattleAttributesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BattleAttributesProto)
      POGOProtos.Rpc.BattleAttributesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BattleAttributesProto.class, POGOProtos.Rpc.BattleAttributesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BattleAttributesProto.newBuilder()
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
      mopajblfilb_ = 0F;

      ekgmjpdbpcg_ = 0F;

      hdpfooknanf_ = 0F;

      adbcjmkmpnn_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BattleAttributesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BattleAttributesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BattleAttributesProto build() {
      POGOProtos.Rpc.BattleAttributesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BattleAttributesProto buildPartial() {
      POGOProtos.Rpc.BattleAttributesProto result = new POGOProtos.Rpc.BattleAttributesProto(this);
      result.mopajblfilb_ = mopajblfilb_;
      result.ekgmjpdbpcg_ = ekgmjpdbpcg_;
      result.hdpfooknanf_ = hdpfooknanf_;
      result.adbcjmkmpnn_ = adbcjmkmpnn_;
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
      if (other instanceof POGOProtos.Rpc.BattleAttributesProto) {
        return mergeFrom((POGOProtos.Rpc.BattleAttributesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BattleAttributesProto other) {
      if (other == POGOProtos.Rpc.BattleAttributesProto.getDefaultInstance()) return this;
      if (other.getMopajblfilb() != 0F) {
        setMopajblfilb(other.getMopajblfilb());
      }
      if (other.getEkgmjpdbpcg() != 0F) {
        setEkgmjpdbpcg(other.getEkgmjpdbpcg());
      }
      if (other.getHdpfooknanf() != 0F) {
        setHdpfooknanf(other.getHdpfooknanf());
      }
      if (other.getAdbcjmkmpnn() != 0F) {
        setAdbcjmkmpnn(other.getAdbcjmkmpnn());
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
      POGOProtos.Rpc.BattleAttributesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BattleAttributesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float mopajblfilb_ ;
    /**
     * <code>float mopajblfilb = 1;</code>
     * @return The mopajblfilb.
     */
    @java.lang.Override
    public float getMopajblfilb() {
      return mopajblfilb_;
    }
    /**
     * <code>float mopajblfilb = 1;</code>
     * @param value The mopajblfilb to set.
     * @return This builder for chaining.
     */
    public Builder setMopajblfilb(float value) {
      
      mopajblfilb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float mopajblfilb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMopajblfilb() {
      
      mopajblfilb_ = 0F;
      onChanged();
      return this;
    }

    private float ekgmjpdbpcg_ ;
    /**
     * <code>float ekgmjpdbpcg = 2;</code>
     * @return The ekgmjpdbpcg.
     */
    @java.lang.Override
    public float getEkgmjpdbpcg() {
      return ekgmjpdbpcg_;
    }
    /**
     * <code>float ekgmjpdbpcg = 2;</code>
     * @param value The ekgmjpdbpcg to set.
     * @return This builder for chaining.
     */
    public Builder setEkgmjpdbpcg(float value) {
      
      ekgmjpdbpcg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ekgmjpdbpcg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEkgmjpdbpcg() {
      
      ekgmjpdbpcg_ = 0F;
      onChanged();
      return this;
    }

    private float hdpfooknanf_ ;
    /**
     * <code>float hdpfooknanf = 3;</code>
     * @return The hdpfooknanf.
     */
    @java.lang.Override
    public float getHdpfooknanf() {
      return hdpfooknanf_;
    }
    /**
     * <code>float hdpfooknanf = 3;</code>
     * @param value The hdpfooknanf to set.
     * @return This builder for chaining.
     */
    public Builder setHdpfooknanf(float value) {
      
      hdpfooknanf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float hdpfooknanf = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHdpfooknanf() {
      
      hdpfooknanf_ = 0F;
      onChanged();
      return this;
    }

    private float adbcjmkmpnn_ ;
    /**
     * <code>float adbcjmkmpnn = 4;</code>
     * @return The adbcjmkmpnn.
     */
    @java.lang.Override
    public float getAdbcjmkmpnn() {
      return adbcjmkmpnn_;
    }
    /**
     * <code>float adbcjmkmpnn = 4;</code>
     * @param value The adbcjmkmpnn to set.
     * @return This builder for chaining.
     */
    public Builder setAdbcjmkmpnn(float value) {
      
      adbcjmkmpnn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float adbcjmkmpnn = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdbcjmkmpnn() {
      
      adbcjmkmpnn_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BattleAttributesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BattleAttributesProto)
  private static final POGOProtos.Rpc.BattleAttributesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BattleAttributesProto();
  }

  public static POGOProtos.Rpc.BattleAttributesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BattleAttributesProto>
      PARSER = new com.google.protobuf.AbstractParser<BattleAttributesProto>() {
    @java.lang.Override
    public BattleAttributesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BattleAttributesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BattleAttributesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BattleAttributesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BattleAttributesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

