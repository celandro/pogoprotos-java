// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BattleAttributesProto}
 */
public  final class BattleAttributesProto extends
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

            staPercent_ = input.readFloat();
            break;
          }
          case 21: {

            atkPercent_ = input.readFloat();
            break;
          }
          case 29: {

            defPercent_ = input.readFloat();
            break;
          }
          case 37: {

            durationS_ = input.readFloat();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BattleAttributesProto.class, POGOProtos.Rpc.BattleAttributesProto.Builder.class);
  }

  public static final int STA_PERCENT_FIELD_NUMBER = 1;
  private float staPercent_;
  /**
   * <code>float sta_percent = 1;</code>
   * @return The staPercent.
   */
  public float getStaPercent() {
    return staPercent_;
  }

  public static final int ATK_PERCENT_FIELD_NUMBER = 2;
  private float atkPercent_;
  /**
   * <code>float atk_percent = 2;</code>
   * @return The atkPercent.
   */
  public float getAtkPercent() {
    return atkPercent_;
  }

  public static final int DEF_PERCENT_FIELD_NUMBER = 3;
  private float defPercent_;
  /**
   * <code>float def_percent = 3;</code>
   * @return The defPercent.
   */
  public float getDefPercent() {
    return defPercent_;
  }

  public static final int DURATION_S_FIELD_NUMBER = 4;
  private float durationS_;
  /**
   * <code>float duration_s = 4;</code>
   * @return The durationS.
   */
  public float getDurationS() {
    return durationS_;
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
    if (staPercent_ != 0F) {
      output.writeFloat(1, staPercent_);
    }
    if (atkPercent_ != 0F) {
      output.writeFloat(2, atkPercent_);
    }
    if (defPercent_ != 0F) {
      output.writeFloat(3, defPercent_);
    }
    if (durationS_ != 0F) {
      output.writeFloat(4, durationS_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (staPercent_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, staPercent_);
    }
    if (atkPercent_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, atkPercent_);
    }
    if (defPercent_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, defPercent_);
    }
    if (durationS_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, durationS_);
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

    if (java.lang.Float.floatToIntBits(getStaPercent())
        != java.lang.Float.floatToIntBits(
            other.getStaPercent())) return false;
    if (java.lang.Float.floatToIntBits(getAtkPercent())
        != java.lang.Float.floatToIntBits(
            other.getAtkPercent())) return false;
    if (java.lang.Float.floatToIntBits(getDefPercent())
        != java.lang.Float.floatToIntBits(
            other.getDefPercent())) return false;
    if (java.lang.Float.floatToIntBits(getDurationS())
        != java.lang.Float.floatToIntBits(
            other.getDurationS())) return false;
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
    hash = (37 * hash) + STA_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getStaPercent());
    hash = (37 * hash) + ATK_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAtkPercent());
    hash = (37 * hash) + DEF_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDefPercent());
    hash = (37 * hash) + DURATION_S_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDurationS());
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
   * Protobuf type {@code POGOProtos.Rpc.BattleAttributesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BattleAttributesProto)
      POGOProtos.Rpc.BattleAttributesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_fieldAccessorTable
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
      staPercent_ = 0F;

      atkPercent_ = 0F;

      defPercent_ = 0F;

      durationS_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattleAttributesProto_descriptor;
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
      result.staPercent_ = staPercent_;
      result.atkPercent_ = atkPercent_;
      result.defPercent_ = defPercent_;
      result.durationS_ = durationS_;
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
      if (other.getStaPercent() != 0F) {
        setStaPercent(other.getStaPercent());
      }
      if (other.getAtkPercent() != 0F) {
        setAtkPercent(other.getAtkPercent());
      }
      if (other.getDefPercent() != 0F) {
        setDefPercent(other.getDefPercent());
      }
      if (other.getDurationS() != 0F) {
        setDurationS(other.getDurationS());
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

    private float staPercent_ ;
    /**
     * <code>float sta_percent = 1;</code>
     * @return The staPercent.
     */
    public float getStaPercent() {
      return staPercent_;
    }
    /**
     * <code>float sta_percent = 1;</code>
     * @param value The staPercent to set.
     * @return This builder for chaining.
     */
    public Builder setStaPercent(float value) {
      
      staPercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float sta_percent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStaPercent() {
      
      staPercent_ = 0F;
      onChanged();
      return this;
    }

    private float atkPercent_ ;
    /**
     * <code>float atk_percent = 2;</code>
     * @return The atkPercent.
     */
    public float getAtkPercent() {
      return atkPercent_;
    }
    /**
     * <code>float atk_percent = 2;</code>
     * @param value The atkPercent to set.
     * @return This builder for chaining.
     */
    public Builder setAtkPercent(float value) {
      
      atkPercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float atk_percent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAtkPercent() {
      
      atkPercent_ = 0F;
      onChanged();
      return this;
    }

    private float defPercent_ ;
    /**
     * <code>float def_percent = 3;</code>
     * @return The defPercent.
     */
    public float getDefPercent() {
      return defPercent_;
    }
    /**
     * <code>float def_percent = 3;</code>
     * @param value The defPercent to set.
     * @return This builder for chaining.
     */
    public Builder setDefPercent(float value) {
      
      defPercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float def_percent = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefPercent() {
      
      defPercent_ = 0F;
      onChanged();
      return this;
    }

    private float durationS_ ;
    /**
     * <code>float duration_s = 4;</code>
     * @return The durationS.
     */
    public float getDurationS() {
      return durationS_;
    }
    /**
     * <code>float duration_s = 4;</code>
     * @param value The durationS to set.
     * @return This builder for chaining.
     */
    public Builder setDurationS(float value) {
      
      durationS_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float duration_s = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationS() {
      
      durationS_ = 0F;
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
