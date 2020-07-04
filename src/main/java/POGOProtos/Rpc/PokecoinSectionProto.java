// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PokecoinSectionProto}
 */
public  final class PokecoinSectionProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokecoinSectionProto)
    PokecoinSectionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokecoinSectionProto.newBuilder() to construct.
  private PokecoinSectionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokecoinSectionProto() {
    coinsQuestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokecoinSectionProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokecoinSectionProto(
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

            coinsEarnedToday_ = input.readInt32();
            break;
          }
          case 16: {

            maxCoinsPerDay_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            coinsQuestId_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokecoinSectionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokecoinSectionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokecoinSectionProto.class, POGOProtos.Rpc.PokecoinSectionProto.Builder.class);
  }

  public static final int COINS_EARNED_TODAY_FIELD_NUMBER = 1;
  private int coinsEarnedToday_;
  /**
   * <code>int32 coins_earned_today = 1;</code>
   * @return The coinsEarnedToday.
   */
  public int getCoinsEarnedToday() {
    return coinsEarnedToday_;
  }

  public static final int MAX_COINS_PER_DAY_FIELD_NUMBER = 2;
  private int maxCoinsPerDay_;
  /**
   * <code>int32 max_coins_per_day = 2;</code>
   * @return The maxCoinsPerDay.
   */
  public int getMaxCoinsPerDay() {
    return maxCoinsPerDay_;
  }

  public static final int COINS_QUEST_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object coinsQuestId_;
  /**
   * <code>string coins_quest_id = 3;</code>
   * @return The coinsQuestId.
   */
  public java.lang.String getCoinsQuestId() {
    java.lang.Object ref = coinsQuestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      coinsQuestId_ = s;
      return s;
    }
  }
  /**
   * <code>string coins_quest_id = 3;</code>
   * @return The bytes for coinsQuestId.
   */
  public com.google.protobuf.ByteString
      getCoinsQuestIdBytes() {
    java.lang.Object ref = coinsQuestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      coinsQuestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (coinsEarnedToday_ != 0) {
      output.writeInt32(1, coinsEarnedToday_);
    }
    if (maxCoinsPerDay_ != 0) {
      output.writeInt32(2, maxCoinsPerDay_);
    }
    if (!getCoinsQuestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, coinsQuestId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (coinsEarnedToday_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, coinsEarnedToday_);
    }
    if (maxCoinsPerDay_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxCoinsPerDay_);
    }
    if (!getCoinsQuestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, coinsQuestId_);
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
    if (!(obj instanceof POGOProtos.Rpc.PokecoinSectionProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokecoinSectionProto other = (POGOProtos.Rpc.PokecoinSectionProto) obj;

    if (getCoinsEarnedToday()
        != other.getCoinsEarnedToday()) return false;
    if (getMaxCoinsPerDay()
        != other.getMaxCoinsPerDay()) return false;
    if (!getCoinsQuestId()
        .equals(other.getCoinsQuestId())) return false;
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
    hash = (37 * hash) + COINS_EARNED_TODAY_FIELD_NUMBER;
    hash = (53 * hash) + getCoinsEarnedToday();
    hash = (37 * hash) + MAX_COINS_PER_DAY_FIELD_NUMBER;
    hash = (53 * hash) + getMaxCoinsPerDay();
    hash = (37 * hash) + COINS_QUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCoinsQuestId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokecoinSectionProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokecoinSectionProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PokecoinSectionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokecoinSectionProto)
      POGOProtos.Rpc.PokecoinSectionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokecoinSectionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokecoinSectionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokecoinSectionProto.class, POGOProtos.Rpc.PokecoinSectionProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokecoinSectionProto.newBuilder()
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
      coinsEarnedToday_ = 0;

      maxCoinsPerDay_ = 0;

      coinsQuestId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokecoinSectionProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokecoinSectionProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokecoinSectionProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokecoinSectionProto build() {
      POGOProtos.Rpc.PokecoinSectionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokecoinSectionProto buildPartial() {
      POGOProtos.Rpc.PokecoinSectionProto result = new POGOProtos.Rpc.PokecoinSectionProto(this);
      result.coinsEarnedToday_ = coinsEarnedToday_;
      result.maxCoinsPerDay_ = maxCoinsPerDay_;
      result.coinsQuestId_ = coinsQuestId_;
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
      if (other instanceof POGOProtos.Rpc.PokecoinSectionProto) {
        return mergeFrom((POGOProtos.Rpc.PokecoinSectionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokecoinSectionProto other) {
      if (other == POGOProtos.Rpc.PokecoinSectionProto.getDefaultInstance()) return this;
      if (other.getCoinsEarnedToday() != 0) {
        setCoinsEarnedToday(other.getCoinsEarnedToday());
      }
      if (other.getMaxCoinsPerDay() != 0) {
        setMaxCoinsPerDay(other.getMaxCoinsPerDay());
      }
      if (!other.getCoinsQuestId().isEmpty()) {
        coinsQuestId_ = other.coinsQuestId_;
        onChanged();
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
      POGOProtos.Rpc.PokecoinSectionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokecoinSectionProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int coinsEarnedToday_ ;
    /**
     * <code>int32 coins_earned_today = 1;</code>
     * @return The coinsEarnedToday.
     */
    public int getCoinsEarnedToday() {
      return coinsEarnedToday_;
    }
    /**
     * <code>int32 coins_earned_today = 1;</code>
     * @param value The coinsEarnedToday to set.
     * @return This builder for chaining.
     */
    public Builder setCoinsEarnedToday(int value) {
      
      coinsEarnedToday_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 coins_earned_today = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoinsEarnedToday() {
      
      coinsEarnedToday_ = 0;
      onChanged();
      return this;
    }

    private int maxCoinsPerDay_ ;
    /**
     * <code>int32 max_coins_per_day = 2;</code>
     * @return The maxCoinsPerDay.
     */
    public int getMaxCoinsPerDay() {
      return maxCoinsPerDay_;
    }
    /**
     * <code>int32 max_coins_per_day = 2;</code>
     * @param value The maxCoinsPerDay to set.
     * @return This builder for chaining.
     */
    public Builder setMaxCoinsPerDay(int value) {
      
      maxCoinsPerDay_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_coins_per_day = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxCoinsPerDay() {
      
      maxCoinsPerDay_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object coinsQuestId_ = "";
    /**
     * <code>string coins_quest_id = 3;</code>
     * @return The coinsQuestId.
     */
    public java.lang.String getCoinsQuestId() {
      java.lang.Object ref = coinsQuestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        coinsQuestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string coins_quest_id = 3;</code>
     * @return The bytes for coinsQuestId.
     */
    public com.google.protobuf.ByteString
        getCoinsQuestIdBytes() {
      java.lang.Object ref = coinsQuestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        coinsQuestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string coins_quest_id = 3;</code>
     * @param value The coinsQuestId to set.
     * @return This builder for chaining.
     */
    public Builder setCoinsQuestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      coinsQuestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string coins_quest_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoinsQuestId() {
      
      coinsQuestId_ = getDefaultInstance().getCoinsQuestId();
      onChanged();
      return this;
    }
    /**
     * <code>string coins_quest_id = 3;</code>
     * @param value The bytes for coinsQuestId to set.
     * @return This builder for chaining.
     */
    public Builder setCoinsQuestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      coinsQuestId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokecoinSectionProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokecoinSectionProto)
  private static final POGOProtos.Rpc.PokecoinSectionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokecoinSectionProto();
  }

  public static POGOProtos.Rpc.PokecoinSectionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokecoinSectionProto>
      PARSER = new com.google.protobuf.AbstractParser<PokecoinSectionProto>() {
    @java.lang.Override
    public PokecoinSectionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokecoinSectionProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokecoinSectionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokecoinSectionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokecoinSectionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

