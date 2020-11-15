// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/CombatCompetitiveSeasonSettings.proto

package POGOProtos.Settings.Master;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings}
 */
public final class CombatCompetitiveSeasonSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings)
    CombatCompetitiveSeasonSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatCompetitiveSeasonSettings.newBuilder() to construct.
  private CombatCompetitiveSeasonSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatCompetitiveSeasonSettings() {
    seasonEndTimeTimestamp_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatCompetitiveSeasonSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatCompetitiveSeasonSettings(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              seasonEndTimeTimestamp_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            seasonEndTimeTimestamp_.addLong(input.readUInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              seasonEndTimeTimestamp_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              seasonEndTimeTimestamp_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 21: {

            ratingAdjustmentPercentage_ = input.readFloat();
            break;
          }
          case 29: {

            rankingAdjustmentPercentage_ = input.readFloat();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        seasonEndTimeTimestamp_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Settings.Master.CombatCompetitiveSeasonSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatCompetitiveSeasonSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.CombatCompetitiveSeasonSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatCompetitiveSeasonSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings.class, POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings.Builder.class);
  }

  public static final int SEASON_END_TIME_TIMESTAMP_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList seasonEndTimeTimestamp_;
  /**
   * <code>repeated uint64 season_end_time_timestamp = 1;</code>
   * @return A list containing the seasonEndTimeTimestamp.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getSeasonEndTimeTimestampList() {
    return seasonEndTimeTimestamp_;
  }
  /**
   * <code>repeated uint64 season_end_time_timestamp = 1;</code>
   * @return The count of seasonEndTimeTimestamp.
   */
  public int getSeasonEndTimeTimestampCount() {
    return seasonEndTimeTimestamp_.size();
  }
  /**
   * <code>repeated uint64 season_end_time_timestamp = 1;</code>
   * @param index The index of the element to return.
   * @return The seasonEndTimeTimestamp at the given index.
   */
  public long getSeasonEndTimeTimestamp(int index) {
    return seasonEndTimeTimestamp_.getLong(index);
  }
  private int seasonEndTimeTimestampMemoizedSerializedSize = -1;

  public static final int RATING_ADJUSTMENT_PERCENTAGE_FIELD_NUMBER = 2;
  private float ratingAdjustmentPercentage_;
  /**
   * <code>float rating_adjustment_percentage = 2;</code>
   * @return The ratingAdjustmentPercentage.
   */
  @java.lang.Override
  public float getRatingAdjustmentPercentage() {
    return ratingAdjustmentPercentage_;
  }

  public static final int RANKING_ADJUSTMENT_PERCENTAGE_FIELD_NUMBER = 3;
  private float rankingAdjustmentPercentage_;
  /**
   * <code>float ranking_adjustment_percentage = 3;</code>
   * @return The rankingAdjustmentPercentage.
   */
  @java.lang.Override
  public float getRankingAdjustmentPercentage() {
    return rankingAdjustmentPercentage_;
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
    getSerializedSize();
    if (getSeasonEndTimeTimestampList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(seasonEndTimeTimestampMemoizedSerializedSize);
    }
    for (int i = 0; i < seasonEndTimeTimestamp_.size(); i++) {
      output.writeUInt64NoTag(seasonEndTimeTimestamp_.getLong(i));
    }
    if (ratingAdjustmentPercentage_ != 0F) {
      output.writeFloat(2, ratingAdjustmentPercentage_);
    }
    if (rankingAdjustmentPercentage_ != 0F) {
      output.writeFloat(3, rankingAdjustmentPercentage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < seasonEndTimeTimestamp_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(seasonEndTimeTimestamp_.getLong(i));
      }
      size += dataSize;
      if (!getSeasonEndTimeTimestampList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      seasonEndTimeTimestampMemoizedSerializedSize = dataSize;
    }
    if (ratingAdjustmentPercentage_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, ratingAdjustmentPercentage_);
    }
    if (rankingAdjustmentPercentage_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, rankingAdjustmentPercentage_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings other = (POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings) obj;

    if (!getSeasonEndTimeTimestampList()
        .equals(other.getSeasonEndTimeTimestampList())) return false;
    if (java.lang.Float.floatToIntBits(getRatingAdjustmentPercentage())
        != java.lang.Float.floatToIntBits(
            other.getRatingAdjustmentPercentage())) return false;
    if (java.lang.Float.floatToIntBits(getRankingAdjustmentPercentage())
        != java.lang.Float.floatToIntBits(
            other.getRankingAdjustmentPercentage())) return false;
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
    if (getSeasonEndTimeTimestampCount() > 0) {
      hash = (37 * hash) + SEASON_END_TIME_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getSeasonEndTimeTimestampList().hashCode();
    }
    hash = (37 * hash) + RATING_ADJUSTMENT_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRatingAdjustmentPercentage());
    hash = (37 * hash) + RANKING_ADJUSTMENT_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRankingAdjustmentPercentage());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings)
      POGOProtos.Settings.Master.CombatCompetitiveSeasonSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.CombatCompetitiveSeasonSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatCompetitiveSeasonSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.CombatCompetitiveSeasonSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatCompetitiveSeasonSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings.class, POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings.newBuilder()
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
      seasonEndTimeTimestamp_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ratingAdjustmentPercentage_ = 0F;

      rankingAdjustmentPercentage_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.CombatCompetitiveSeasonSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatCompetitiveSeasonSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings build() {
      POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings buildPartial() {
      POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings result = new POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        seasonEndTimeTimestamp_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.seasonEndTimeTimestamp_ = seasonEndTimeTimestamp_;
      result.ratingAdjustmentPercentage_ = ratingAdjustmentPercentage_;
      result.rankingAdjustmentPercentage_ = rankingAdjustmentPercentage_;
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
      if (other instanceof POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings) {
        return mergeFrom((POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings other) {
      if (other == POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings.getDefaultInstance()) return this;
      if (!other.seasonEndTimeTimestamp_.isEmpty()) {
        if (seasonEndTimeTimestamp_.isEmpty()) {
          seasonEndTimeTimestamp_ = other.seasonEndTimeTimestamp_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSeasonEndTimeTimestampIsMutable();
          seasonEndTimeTimestamp_.addAll(other.seasonEndTimeTimestamp_);
        }
        onChanged();
      }
      if (other.getRatingAdjustmentPercentage() != 0F) {
        setRatingAdjustmentPercentage(other.getRatingAdjustmentPercentage());
      }
      if (other.getRankingAdjustmentPercentage() != 0F) {
        setRankingAdjustmentPercentage(other.getRankingAdjustmentPercentage());
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
      POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList seasonEndTimeTimestamp_ = emptyLongList();
    private void ensureSeasonEndTimeTimestampIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        seasonEndTimeTimestamp_ = mutableCopy(seasonEndTimeTimestamp_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 season_end_time_timestamp = 1;</code>
     * @return A list containing the seasonEndTimeTimestamp.
     */
    public java.util.List<java.lang.Long>
        getSeasonEndTimeTimestampList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(seasonEndTimeTimestamp_) : seasonEndTimeTimestamp_;
    }
    /**
     * <code>repeated uint64 season_end_time_timestamp = 1;</code>
     * @return The count of seasonEndTimeTimestamp.
     */
    public int getSeasonEndTimeTimestampCount() {
      return seasonEndTimeTimestamp_.size();
    }
    /**
     * <code>repeated uint64 season_end_time_timestamp = 1;</code>
     * @param index The index of the element to return.
     * @return The seasonEndTimeTimestamp at the given index.
     */
    public long getSeasonEndTimeTimestamp(int index) {
      return seasonEndTimeTimestamp_.getLong(index);
    }
    /**
     * <code>repeated uint64 season_end_time_timestamp = 1;</code>
     * @param index The index to set the value at.
     * @param value The seasonEndTimeTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setSeasonEndTimeTimestamp(
        int index, long value) {
      ensureSeasonEndTimeTimestampIsMutable();
      seasonEndTimeTimestamp_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 season_end_time_timestamp = 1;</code>
     * @param value The seasonEndTimeTimestamp to add.
     * @return This builder for chaining.
     */
    public Builder addSeasonEndTimeTimestamp(long value) {
      ensureSeasonEndTimeTimestampIsMutable();
      seasonEndTimeTimestamp_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 season_end_time_timestamp = 1;</code>
     * @param values The seasonEndTimeTimestamp to add.
     * @return This builder for chaining.
     */
    public Builder addAllSeasonEndTimeTimestamp(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureSeasonEndTimeTimestampIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, seasonEndTimeTimestamp_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 season_end_time_timestamp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeasonEndTimeTimestamp() {
      seasonEndTimeTimestamp_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private float ratingAdjustmentPercentage_ ;
    /**
     * <code>float rating_adjustment_percentage = 2;</code>
     * @return The ratingAdjustmentPercentage.
     */
    @java.lang.Override
    public float getRatingAdjustmentPercentage() {
      return ratingAdjustmentPercentage_;
    }
    /**
     * <code>float rating_adjustment_percentage = 2;</code>
     * @param value The ratingAdjustmentPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setRatingAdjustmentPercentage(float value) {
      
      ratingAdjustmentPercentage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float rating_adjustment_percentage = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRatingAdjustmentPercentage() {
      
      ratingAdjustmentPercentage_ = 0F;
      onChanged();
      return this;
    }

    private float rankingAdjustmentPercentage_ ;
    /**
     * <code>float ranking_adjustment_percentage = 3;</code>
     * @return The rankingAdjustmentPercentage.
     */
    @java.lang.Override
    public float getRankingAdjustmentPercentage() {
      return rankingAdjustmentPercentage_;
    }
    /**
     * <code>float ranking_adjustment_percentage = 3;</code>
     * @param value The rankingAdjustmentPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setRankingAdjustmentPercentage(float value) {
      
      rankingAdjustmentPercentage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ranking_adjustment_percentage = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRankingAdjustmentPercentage() {
      
      rankingAdjustmentPercentage_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings)
  private static final POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings();
  }

  public static POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatCompetitiveSeasonSettings>
      PARSER = new com.google.protobuf.AbstractParser<CombatCompetitiveSeasonSettings>() {
    @java.lang.Override
    public CombatCompetitiveSeasonSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatCompetitiveSeasonSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatCompetitiveSeasonSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatCompetitiveSeasonSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.CombatCompetitiveSeasonSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

