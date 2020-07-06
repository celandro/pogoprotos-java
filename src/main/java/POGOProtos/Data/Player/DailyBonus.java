// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/DailyBonus.proto

package POGOProtos.Data.Player;

/**
 * Protobuf type {@code POGOProtos.Data.Player.DailyBonus}
 */
public  final class DailyBonus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Player.DailyBonus)
    DailyBonusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DailyBonus.newBuilder() to construct.
  private DailyBonus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DailyBonus() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DailyBonus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DailyBonus(
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

            nextCollectedTimestampMs_ = input.readInt64();
            break;
          }
          case 16: {

            nextDefenderBonusCollectTimestampMs_ = input.readInt64();
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
    return POGOProtos.Data.Player.DailyBonusOuterClass.internal_static_POGOProtos_Data_Player_DailyBonus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Player.DailyBonusOuterClass.internal_static_POGOProtos_Data_Player_DailyBonus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Player.DailyBonus.class, POGOProtos.Data.Player.DailyBonus.Builder.class);
  }

  public static final int NEXT_COLLECTED_TIMESTAMP_MS_FIELD_NUMBER = 1;
  private long nextCollectedTimestampMs_;
  /**
   * <code>int64 next_collected_timestamp_ms = 1;</code>
   * @return The nextCollectedTimestampMs.
   */
  public long getNextCollectedTimestampMs() {
    return nextCollectedTimestampMs_;
  }

  public static final int NEXT_DEFENDER_BONUS_COLLECT_TIMESTAMP_MS_FIELD_NUMBER = 2;
  private long nextDefenderBonusCollectTimestampMs_;
  /**
   * <code>int64 next_defender_bonus_collect_timestamp_ms = 2;</code>
   * @return The nextDefenderBonusCollectTimestampMs.
   */
  public long getNextDefenderBonusCollectTimestampMs() {
    return nextDefenderBonusCollectTimestampMs_;
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
    if (nextCollectedTimestampMs_ != 0L) {
      output.writeInt64(1, nextCollectedTimestampMs_);
    }
    if (nextDefenderBonusCollectTimestampMs_ != 0L) {
      output.writeInt64(2, nextDefenderBonusCollectTimestampMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nextCollectedTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, nextCollectedTimestampMs_);
    }
    if (nextDefenderBonusCollectTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, nextDefenderBonusCollectTimestampMs_);
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
    if (!(obj instanceof POGOProtos.Data.Player.DailyBonus)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Player.DailyBonus other = (POGOProtos.Data.Player.DailyBonus) obj;

    if (getNextCollectedTimestampMs()
        != other.getNextCollectedTimestampMs()) return false;
    if (getNextDefenderBonusCollectTimestampMs()
        != other.getNextDefenderBonusCollectTimestampMs()) return false;
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
    hash = (37 * hash) + NEXT_COLLECTED_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNextCollectedTimestampMs());
    hash = (37 * hash) + NEXT_DEFENDER_BONUS_COLLECT_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNextDefenderBonusCollectTimestampMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Player.DailyBonus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Player.DailyBonus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Player.DailyBonus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Player.DailyBonus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Player.DailyBonus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Player.DailyBonus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Player.DailyBonus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Player.DailyBonus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Player.DailyBonus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Player.DailyBonus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Player.DailyBonus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Player.DailyBonus parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Player.DailyBonus prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Player.DailyBonus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Player.DailyBonus)
      POGOProtos.Data.Player.DailyBonusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Player.DailyBonusOuterClass.internal_static_POGOProtos_Data_Player_DailyBonus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Player.DailyBonusOuterClass.internal_static_POGOProtos_Data_Player_DailyBonus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Player.DailyBonus.class, POGOProtos.Data.Player.DailyBonus.Builder.class);
    }

    // Construct using POGOProtos.Data.Player.DailyBonus.newBuilder()
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
      nextCollectedTimestampMs_ = 0L;

      nextDefenderBonusCollectTimestampMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Player.DailyBonusOuterClass.internal_static_POGOProtos_Data_Player_DailyBonus_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Player.DailyBonus getDefaultInstanceForType() {
      return POGOProtos.Data.Player.DailyBonus.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Player.DailyBonus build() {
      POGOProtos.Data.Player.DailyBonus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Player.DailyBonus buildPartial() {
      POGOProtos.Data.Player.DailyBonus result = new POGOProtos.Data.Player.DailyBonus(this);
      result.nextCollectedTimestampMs_ = nextCollectedTimestampMs_;
      result.nextDefenderBonusCollectTimestampMs_ = nextDefenderBonusCollectTimestampMs_;
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
      if (other instanceof POGOProtos.Data.Player.DailyBonus) {
        return mergeFrom((POGOProtos.Data.Player.DailyBonus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Player.DailyBonus other) {
      if (other == POGOProtos.Data.Player.DailyBonus.getDefaultInstance()) return this;
      if (other.getNextCollectedTimestampMs() != 0L) {
        setNextCollectedTimestampMs(other.getNextCollectedTimestampMs());
      }
      if (other.getNextDefenderBonusCollectTimestampMs() != 0L) {
        setNextDefenderBonusCollectTimestampMs(other.getNextDefenderBonusCollectTimestampMs());
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
      POGOProtos.Data.Player.DailyBonus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Player.DailyBonus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long nextCollectedTimestampMs_ ;
    /**
     * <code>int64 next_collected_timestamp_ms = 1;</code>
     * @return The nextCollectedTimestampMs.
     */
    public long getNextCollectedTimestampMs() {
      return nextCollectedTimestampMs_;
    }
    /**
     * <code>int64 next_collected_timestamp_ms = 1;</code>
     * @param value The nextCollectedTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setNextCollectedTimestampMs(long value) {
      
      nextCollectedTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 next_collected_timestamp_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextCollectedTimestampMs() {
      
      nextCollectedTimestampMs_ = 0L;
      onChanged();
      return this;
    }

    private long nextDefenderBonusCollectTimestampMs_ ;
    /**
     * <code>int64 next_defender_bonus_collect_timestamp_ms = 2;</code>
     * @return The nextDefenderBonusCollectTimestampMs.
     */
    public long getNextDefenderBonusCollectTimestampMs() {
      return nextDefenderBonusCollectTimestampMs_;
    }
    /**
     * <code>int64 next_defender_bonus_collect_timestamp_ms = 2;</code>
     * @param value The nextDefenderBonusCollectTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setNextDefenderBonusCollectTimestampMs(long value) {
      
      nextDefenderBonusCollectTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 next_defender_bonus_collect_timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextDefenderBonusCollectTimestampMs() {
      
      nextDefenderBonusCollectTimestampMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Player.DailyBonus)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Player.DailyBonus)
  private static final POGOProtos.Data.Player.DailyBonus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Player.DailyBonus();
  }

  public static POGOProtos.Data.Player.DailyBonus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DailyBonus>
      PARSER = new com.google.protobuf.AbstractParser<DailyBonus>() {
    @java.lang.Override
    public DailyBonus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DailyBonus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DailyBonus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DailyBonus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Player.DailyBonus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

