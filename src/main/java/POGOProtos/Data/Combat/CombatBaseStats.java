// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Combat/CombatBaseStats.proto

package POGOProtos.Data.Combat;

/**
 * Protobuf type {@code POGOProtos.Data.Combat.CombatBaseStats}
 */
public  final class CombatBaseStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Combat.CombatBaseStats)
    CombatBaseStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatBaseStats.newBuilder() to construct.
  private CombatBaseStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatBaseStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatBaseStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatBaseStats(
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

            totalBattles_ = input.readInt32();
            break;
          }
          case 16: {

            wins_ = input.readInt32();
            break;
          }
          case 29: {

            rating_ = input.readFloat();
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
    return POGOProtos.Data.Combat.CombatBaseStatsOuterClass.internal_static_POGOProtos_Data_Combat_CombatBaseStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Combat.CombatBaseStatsOuterClass.internal_static_POGOProtos_Data_Combat_CombatBaseStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Combat.CombatBaseStats.class, POGOProtos.Data.Combat.CombatBaseStats.Builder.class);
  }

  public static final int TOTAL_BATTLES_FIELD_NUMBER = 1;
  private int totalBattles_;
  /**
   * <code>int32 total_battles = 1;</code>
   * @return The totalBattles.
   */
  public int getTotalBattles() {
    return totalBattles_;
  }

  public static final int WINS_FIELD_NUMBER = 2;
  private int wins_;
  /**
   * <code>int32 wins = 2;</code>
   * @return The wins.
   */
  public int getWins() {
    return wins_;
  }

  public static final int RATING_FIELD_NUMBER = 3;
  private float rating_;
  /**
   * <code>float rating = 3;</code>
   * @return The rating.
   */
  public float getRating() {
    return rating_;
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
    if (totalBattles_ != 0) {
      output.writeInt32(1, totalBattles_);
    }
    if (wins_ != 0) {
      output.writeInt32(2, wins_);
    }
    if (rating_ != 0F) {
      output.writeFloat(3, rating_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalBattles_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, totalBattles_);
    }
    if (wins_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, wins_);
    }
    if (rating_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, rating_);
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
    if (!(obj instanceof POGOProtos.Data.Combat.CombatBaseStats)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Combat.CombatBaseStats other = (POGOProtos.Data.Combat.CombatBaseStats) obj;

    if (getTotalBattles()
        != other.getTotalBattles()) return false;
    if (getWins()
        != other.getWins()) return false;
    if (java.lang.Float.floatToIntBits(getRating())
        != java.lang.Float.floatToIntBits(
            other.getRating())) return false;
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
    hash = (37 * hash) + TOTAL_BATTLES_FIELD_NUMBER;
    hash = (53 * hash) + getTotalBattles();
    hash = (37 * hash) + WINS_FIELD_NUMBER;
    hash = (53 * hash) + getWins();
    hash = (37 * hash) + RATING_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRating());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Combat.CombatBaseStats parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Combat.CombatBaseStats prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Combat.CombatBaseStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Combat.CombatBaseStats)
      POGOProtos.Data.Combat.CombatBaseStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Combat.CombatBaseStatsOuterClass.internal_static_POGOProtos_Data_Combat_CombatBaseStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Combat.CombatBaseStatsOuterClass.internal_static_POGOProtos_Data_Combat_CombatBaseStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Combat.CombatBaseStats.class, POGOProtos.Data.Combat.CombatBaseStats.Builder.class);
    }

    // Construct using POGOProtos.Data.Combat.CombatBaseStats.newBuilder()
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
      totalBattles_ = 0;

      wins_ = 0;

      rating_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Combat.CombatBaseStatsOuterClass.internal_static_POGOProtos_Data_Combat_CombatBaseStats_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Combat.CombatBaseStats getDefaultInstanceForType() {
      return POGOProtos.Data.Combat.CombatBaseStats.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Combat.CombatBaseStats build() {
      POGOProtos.Data.Combat.CombatBaseStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Combat.CombatBaseStats buildPartial() {
      POGOProtos.Data.Combat.CombatBaseStats result = new POGOProtos.Data.Combat.CombatBaseStats(this);
      result.totalBattles_ = totalBattles_;
      result.wins_ = wins_;
      result.rating_ = rating_;
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
      if (other instanceof POGOProtos.Data.Combat.CombatBaseStats) {
        return mergeFrom((POGOProtos.Data.Combat.CombatBaseStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Combat.CombatBaseStats other) {
      if (other == POGOProtos.Data.Combat.CombatBaseStats.getDefaultInstance()) return this;
      if (other.getTotalBattles() != 0) {
        setTotalBattles(other.getTotalBattles());
      }
      if (other.getWins() != 0) {
        setWins(other.getWins());
      }
      if (other.getRating() != 0F) {
        setRating(other.getRating());
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
      POGOProtos.Data.Combat.CombatBaseStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Combat.CombatBaseStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int totalBattles_ ;
    /**
     * <code>int32 total_battles = 1;</code>
     * @return The totalBattles.
     */
    public int getTotalBattles() {
      return totalBattles_;
    }
    /**
     * <code>int32 total_battles = 1;</code>
     * @param value The totalBattles to set.
     * @return This builder for chaining.
     */
    public Builder setTotalBattles(int value) {
      
      totalBattles_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_battles = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalBattles() {
      
      totalBattles_ = 0;
      onChanged();
      return this;
    }

    private int wins_ ;
    /**
     * <code>int32 wins = 2;</code>
     * @return The wins.
     */
    public int getWins() {
      return wins_;
    }
    /**
     * <code>int32 wins = 2;</code>
     * @param value The wins to set.
     * @return This builder for chaining.
     */
    public Builder setWins(int value) {
      
      wins_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 wins = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWins() {
      
      wins_ = 0;
      onChanged();
      return this;
    }

    private float rating_ ;
    /**
     * <code>float rating = 3;</code>
     * @return The rating.
     */
    public float getRating() {
      return rating_;
    }
    /**
     * <code>float rating = 3;</code>
     * @param value The rating to set.
     * @return This builder for chaining.
     */
    public Builder setRating(float value) {
      
      rating_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float rating = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRating() {
      
      rating_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Combat.CombatBaseStats)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Combat.CombatBaseStats)
  private static final POGOProtos.Data.Combat.CombatBaseStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Combat.CombatBaseStats();
  }

  public static POGOProtos.Data.Combat.CombatBaseStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatBaseStats>
      PARSER = new com.google.protobuf.AbstractParser<CombatBaseStats>() {
    @java.lang.Override
    public CombatBaseStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatBaseStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatBaseStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatBaseStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Combat.CombatBaseStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

