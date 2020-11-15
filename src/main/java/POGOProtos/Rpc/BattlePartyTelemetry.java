// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
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
    battlePartyClickId_ = 0;
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

            battlePartyClickId_ = rawValue;
            break;
          }
          case 16: {

            battlePartyCount_ = input.readInt32();
            break;
          }
          case 24: {

            battlePartyNumber_ = input.readInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BattlePartyTelemetry.class, POGOProtos.Rpc.BattlePartyTelemetry.Builder.class);
  }

  public static final int BATTLE_PARTY_CLICK_ID_FIELD_NUMBER = 1;
  private int battlePartyClickId_;
  /**
   * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds battle_party_click_id = 1;</code>
   * @return The enum numeric value on the wire for battlePartyClickId.
   */
  @java.lang.Override public int getBattlePartyClickIdValue() {
    return battlePartyClickId_;
  }
  /**
   * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds battle_party_click_id = 1;</code>
   * @return The battlePartyClickId.
   */
  @java.lang.Override public POGOProtos.Rpc.BattlePartyTelemetryIds getBattlePartyClickId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BattlePartyTelemetryIds result = POGOProtos.Rpc.BattlePartyTelemetryIds.valueOf(battlePartyClickId_);
    return result == null ? POGOProtos.Rpc.BattlePartyTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int BATTLE_PARTY_COUNT_FIELD_NUMBER = 2;
  private int battlePartyCount_;
  /**
   * <code>int32 battle_party_count = 2;</code>
   * @return The battlePartyCount.
   */
  @java.lang.Override
  public int getBattlePartyCount() {
    return battlePartyCount_;
  }

  public static final int BATTLE_PARTY_NUMBER_FIELD_NUMBER = 3;
  private int battlePartyNumber_;
  /**
   * <code>int32 battle_party_number = 3;</code>
   * @return The battlePartyNumber.
   */
  @java.lang.Override
  public int getBattlePartyNumber() {
    return battlePartyNumber_;
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
    if (battlePartyClickId_ != POGOProtos.Rpc.BattlePartyTelemetryIds.BATTLE_PARTY_TELEMETRY_IDS_UNDEFINED_BATTLE_PARTY_EVENT.getNumber()) {
      output.writeEnum(1, battlePartyClickId_);
    }
    if (battlePartyCount_ != 0) {
      output.writeInt32(2, battlePartyCount_);
    }
    if (battlePartyNumber_ != 0) {
      output.writeInt32(3, battlePartyNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (battlePartyClickId_ != POGOProtos.Rpc.BattlePartyTelemetryIds.BATTLE_PARTY_TELEMETRY_IDS_UNDEFINED_BATTLE_PARTY_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, battlePartyClickId_);
    }
    if (battlePartyCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, battlePartyCount_);
    }
    if (battlePartyNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, battlePartyNumber_);
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

    if (battlePartyClickId_ != other.battlePartyClickId_) return false;
    if (getBattlePartyCount()
        != other.getBattlePartyCount()) return false;
    if (getBattlePartyNumber()
        != other.getBattlePartyNumber()) return false;
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
    hash = (37 * hash) + BATTLE_PARTY_CLICK_ID_FIELD_NUMBER;
    hash = (53 * hash) + battlePartyClickId_;
    hash = (37 * hash) + BATTLE_PARTY_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getBattlePartyCount();
    hash = (37 * hash) + BATTLE_PARTY_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getBattlePartyNumber();
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
   * Protobuf type {@code POGOProtos.Rpc.BattlePartyTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BattlePartyTelemetry)
      POGOProtos.Rpc.BattlePartyTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_fieldAccessorTable
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
      battlePartyClickId_ = 0;

      battlePartyCount_ = 0;

      battlePartyNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BattlePartyTelemetry_descriptor;
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
      result.battlePartyClickId_ = battlePartyClickId_;
      result.battlePartyCount_ = battlePartyCount_;
      result.battlePartyNumber_ = battlePartyNumber_;
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
      if (other.battlePartyClickId_ != 0) {
        setBattlePartyClickIdValue(other.getBattlePartyClickIdValue());
      }
      if (other.getBattlePartyCount() != 0) {
        setBattlePartyCount(other.getBattlePartyCount());
      }
      if (other.getBattlePartyNumber() != 0) {
        setBattlePartyNumber(other.getBattlePartyNumber());
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

    private int battlePartyClickId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds battle_party_click_id = 1;</code>
     * @return The enum numeric value on the wire for battlePartyClickId.
     */
    @java.lang.Override public int getBattlePartyClickIdValue() {
      return battlePartyClickId_;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds battle_party_click_id = 1;</code>
     * @param value The enum numeric value on the wire for battlePartyClickId to set.
     * @return This builder for chaining.
     */
    public Builder setBattlePartyClickIdValue(int value) {
      
      battlePartyClickId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds battle_party_click_id = 1;</code>
     * @return The battlePartyClickId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BattlePartyTelemetryIds getBattlePartyClickId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BattlePartyTelemetryIds result = POGOProtos.Rpc.BattlePartyTelemetryIds.valueOf(battlePartyClickId_);
      return result == null ? POGOProtos.Rpc.BattlePartyTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds battle_party_click_id = 1;</code>
     * @param value The battlePartyClickId to set.
     * @return This builder for chaining.
     */
    public Builder setBattlePartyClickId(POGOProtos.Rpc.BattlePartyTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      battlePartyClickId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BattlePartyTelemetryIds battle_party_click_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBattlePartyClickId() {
      
      battlePartyClickId_ = 0;
      onChanged();
      return this;
    }

    private int battlePartyCount_ ;
    /**
     * <code>int32 battle_party_count = 2;</code>
     * @return The battlePartyCount.
     */
    @java.lang.Override
    public int getBattlePartyCount() {
      return battlePartyCount_;
    }
    /**
     * <code>int32 battle_party_count = 2;</code>
     * @param value The battlePartyCount to set.
     * @return This builder for chaining.
     */
    public Builder setBattlePartyCount(int value) {
      
      battlePartyCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 battle_party_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBattlePartyCount() {
      
      battlePartyCount_ = 0;
      onChanged();
      return this;
    }

    private int battlePartyNumber_ ;
    /**
     * <code>int32 battle_party_number = 3;</code>
     * @return The battlePartyNumber.
     */
    @java.lang.Override
    public int getBattlePartyNumber() {
      return battlePartyNumber_;
    }
    /**
     * <code>int32 battle_party_number = 3;</code>
     * @param value The battlePartyNumber to set.
     * @return This builder for chaining.
     */
    public Builder setBattlePartyNumber(int value) {
      
      battlePartyNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 battle_party_number = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBattlePartyNumber() {
      
      battlePartyNumber_ = 0;
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

