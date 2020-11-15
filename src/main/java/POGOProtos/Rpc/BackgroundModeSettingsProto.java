// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BackgroundModeSettingsProto}
 */
public final class BackgroundModeSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BackgroundModeSettingsProto)
    BackgroundModeSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BackgroundModeSettingsProto.newBuilder() to construct.
  private BackgroundModeSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackgroundModeSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BackgroundModeSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BackgroundModeSettingsProto(
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
          case 9: {

            weeklyFitnessGoalLevel1DistanceKm_ = input.readDouble();
            break;
          }
          case 17: {

            weeklyFitnessGoalLevel2DistanceKm_ = input.readDouble();
            break;
          }
          case 25: {

            weeklyFitnessGoalLevel3DistanceKm_ = input.readDouble();
            break;
          }
          case 33: {

            weeklyFitnessGoalLevel4DistanceKm_ = input.readDouble();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BackgroundModeSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BackgroundModeSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BackgroundModeSettingsProto.class, POGOProtos.Rpc.BackgroundModeSettingsProto.Builder.class);
  }

  public static final int WEEKLY_FITNESS_GOAL_LEVEL1_DISTANCE_KM_FIELD_NUMBER = 1;
  private double weeklyFitnessGoalLevel1DistanceKm_;
  /**
   * <code>double weekly_fitness_goal_level1_distance_km = 1;</code>
   * @return The weeklyFitnessGoalLevel1DistanceKm.
   */
  @java.lang.Override
  public double getWeeklyFitnessGoalLevel1DistanceKm() {
    return weeklyFitnessGoalLevel1DistanceKm_;
  }

  public static final int WEEKLY_FITNESS_GOAL_LEVEL2_DISTANCE_KM_FIELD_NUMBER = 2;
  private double weeklyFitnessGoalLevel2DistanceKm_;
  /**
   * <code>double weekly_fitness_goal_level2_distance_km = 2;</code>
   * @return The weeklyFitnessGoalLevel2DistanceKm.
   */
  @java.lang.Override
  public double getWeeklyFitnessGoalLevel2DistanceKm() {
    return weeklyFitnessGoalLevel2DistanceKm_;
  }

  public static final int WEEKLY_FITNESS_GOAL_LEVEL3_DISTANCE_KM_FIELD_NUMBER = 3;
  private double weeklyFitnessGoalLevel3DistanceKm_;
  /**
   * <code>double weekly_fitness_goal_level3_distance_km = 3;</code>
   * @return The weeklyFitnessGoalLevel3DistanceKm.
   */
  @java.lang.Override
  public double getWeeklyFitnessGoalLevel3DistanceKm() {
    return weeklyFitnessGoalLevel3DistanceKm_;
  }

  public static final int WEEKLY_FITNESS_GOAL_LEVEL4_DISTANCE_KM_FIELD_NUMBER = 4;
  private double weeklyFitnessGoalLevel4DistanceKm_;
  /**
   * <code>double weekly_fitness_goal_level4_distance_km = 4;</code>
   * @return The weeklyFitnessGoalLevel4DistanceKm.
   */
  @java.lang.Override
  public double getWeeklyFitnessGoalLevel4DistanceKm() {
    return weeklyFitnessGoalLevel4DistanceKm_;
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
    if (weeklyFitnessGoalLevel1DistanceKm_ != 0D) {
      output.writeDouble(1, weeklyFitnessGoalLevel1DistanceKm_);
    }
    if (weeklyFitnessGoalLevel2DistanceKm_ != 0D) {
      output.writeDouble(2, weeklyFitnessGoalLevel2DistanceKm_);
    }
    if (weeklyFitnessGoalLevel3DistanceKm_ != 0D) {
      output.writeDouble(3, weeklyFitnessGoalLevel3DistanceKm_);
    }
    if (weeklyFitnessGoalLevel4DistanceKm_ != 0D) {
      output.writeDouble(4, weeklyFitnessGoalLevel4DistanceKm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weeklyFitnessGoalLevel1DistanceKm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, weeklyFitnessGoalLevel1DistanceKm_);
    }
    if (weeklyFitnessGoalLevel2DistanceKm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, weeklyFitnessGoalLevel2DistanceKm_);
    }
    if (weeklyFitnessGoalLevel3DistanceKm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, weeklyFitnessGoalLevel3DistanceKm_);
    }
    if (weeklyFitnessGoalLevel4DistanceKm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, weeklyFitnessGoalLevel4DistanceKm_);
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
    if (!(obj instanceof POGOProtos.Rpc.BackgroundModeSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BackgroundModeSettingsProto other = (POGOProtos.Rpc.BackgroundModeSettingsProto) obj;

    if (java.lang.Double.doubleToLongBits(getWeeklyFitnessGoalLevel1DistanceKm())
        != java.lang.Double.doubleToLongBits(
            other.getWeeklyFitnessGoalLevel1DistanceKm())) return false;
    if (java.lang.Double.doubleToLongBits(getWeeklyFitnessGoalLevel2DistanceKm())
        != java.lang.Double.doubleToLongBits(
            other.getWeeklyFitnessGoalLevel2DistanceKm())) return false;
    if (java.lang.Double.doubleToLongBits(getWeeklyFitnessGoalLevel3DistanceKm())
        != java.lang.Double.doubleToLongBits(
            other.getWeeklyFitnessGoalLevel3DistanceKm())) return false;
    if (java.lang.Double.doubleToLongBits(getWeeklyFitnessGoalLevel4DistanceKm())
        != java.lang.Double.doubleToLongBits(
            other.getWeeklyFitnessGoalLevel4DistanceKm())) return false;
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
    hash = (37 * hash) + WEEKLY_FITNESS_GOAL_LEVEL1_DISTANCE_KM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeeklyFitnessGoalLevel1DistanceKm()));
    hash = (37 * hash) + WEEKLY_FITNESS_GOAL_LEVEL2_DISTANCE_KM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeeklyFitnessGoalLevel2DistanceKm()));
    hash = (37 * hash) + WEEKLY_FITNESS_GOAL_LEVEL3_DISTANCE_KM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeeklyFitnessGoalLevel3DistanceKm()));
    hash = (37 * hash) + WEEKLY_FITNESS_GOAL_LEVEL4_DISTANCE_KM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeeklyFitnessGoalLevel4DistanceKm()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BackgroundModeSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BackgroundModeSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BackgroundModeSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BackgroundModeSettingsProto)
      POGOProtos.Rpc.BackgroundModeSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BackgroundModeSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BackgroundModeSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BackgroundModeSettingsProto.class, POGOProtos.Rpc.BackgroundModeSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BackgroundModeSettingsProto.newBuilder()
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
      weeklyFitnessGoalLevel1DistanceKm_ = 0D;

      weeklyFitnessGoalLevel2DistanceKm_ = 0D;

      weeklyFitnessGoalLevel3DistanceKm_ = 0D;

      weeklyFitnessGoalLevel4DistanceKm_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BackgroundModeSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BackgroundModeSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BackgroundModeSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BackgroundModeSettingsProto build() {
      POGOProtos.Rpc.BackgroundModeSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BackgroundModeSettingsProto buildPartial() {
      POGOProtos.Rpc.BackgroundModeSettingsProto result = new POGOProtos.Rpc.BackgroundModeSettingsProto(this);
      result.weeklyFitnessGoalLevel1DistanceKm_ = weeklyFitnessGoalLevel1DistanceKm_;
      result.weeklyFitnessGoalLevel2DistanceKm_ = weeklyFitnessGoalLevel2DistanceKm_;
      result.weeklyFitnessGoalLevel3DistanceKm_ = weeklyFitnessGoalLevel3DistanceKm_;
      result.weeklyFitnessGoalLevel4DistanceKm_ = weeklyFitnessGoalLevel4DistanceKm_;
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
      if (other instanceof POGOProtos.Rpc.BackgroundModeSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.BackgroundModeSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BackgroundModeSettingsProto other) {
      if (other == POGOProtos.Rpc.BackgroundModeSettingsProto.getDefaultInstance()) return this;
      if (other.getWeeklyFitnessGoalLevel1DistanceKm() != 0D) {
        setWeeklyFitnessGoalLevel1DistanceKm(other.getWeeklyFitnessGoalLevel1DistanceKm());
      }
      if (other.getWeeklyFitnessGoalLevel2DistanceKm() != 0D) {
        setWeeklyFitnessGoalLevel2DistanceKm(other.getWeeklyFitnessGoalLevel2DistanceKm());
      }
      if (other.getWeeklyFitnessGoalLevel3DistanceKm() != 0D) {
        setWeeklyFitnessGoalLevel3DistanceKm(other.getWeeklyFitnessGoalLevel3DistanceKm());
      }
      if (other.getWeeklyFitnessGoalLevel4DistanceKm() != 0D) {
        setWeeklyFitnessGoalLevel4DistanceKm(other.getWeeklyFitnessGoalLevel4DistanceKm());
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
      POGOProtos.Rpc.BackgroundModeSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BackgroundModeSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double weeklyFitnessGoalLevel1DistanceKm_ ;
    /**
     * <code>double weekly_fitness_goal_level1_distance_km = 1;</code>
     * @return The weeklyFitnessGoalLevel1DistanceKm.
     */
    @java.lang.Override
    public double getWeeklyFitnessGoalLevel1DistanceKm() {
      return weeklyFitnessGoalLevel1DistanceKm_;
    }
    /**
     * <code>double weekly_fitness_goal_level1_distance_km = 1;</code>
     * @param value The weeklyFitnessGoalLevel1DistanceKm to set.
     * @return This builder for chaining.
     */
    public Builder setWeeklyFitnessGoalLevel1DistanceKm(double value) {
      
      weeklyFitnessGoalLevel1DistanceKm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weekly_fitness_goal_level1_distance_km = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeeklyFitnessGoalLevel1DistanceKm() {
      
      weeklyFitnessGoalLevel1DistanceKm_ = 0D;
      onChanged();
      return this;
    }

    private double weeklyFitnessGoalLevel2DistanceKm_ ;
    /**
     * <code>double weekly_fitness_goal_level2_distance_km = 2;</code>
     * @return The weeklyFitnessGoalLevel2DistanceKm.
     */
    @java.lang.Override
    public double getWeeklyFitnessGoalLevel2DistanceKm() {
      return weeklyFitnessGoalLevel2DistanceKm_;
    }
    /**
     * <code>double weekly_fitness_goal_level2_distance_km = 2;</code>
     * @param value The weeklyFitnessGoalLevel2DistanceKm to set.
     * @return This builder for chaining.
     */
    public Builder setWeeklyFitnessGoalLevel2DistanceKm(double value) {
      
      weeklyFitnessGoalLevel2DistanceKm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weekly_fitness_goal_level2_distance_km = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeeklyFitnessGoalLevel2DistanceKm() {
      
      weeklyFitnessGoalLevel2DistanceKm_ = 0D;
      onChanged();
      return this;
    }

    private double weeklyFitnessGoalLevel3DistanceKm_ ;
    /**
     * <code>double weekly_fitness_goal_level3_distance_km = 3;</code>
     * @return The weeklyFitnessGoalLevel3DistanceKm.
     */
    @java.lang.Override
    public double getWeeklyFitnessGoalLevel3DistanceKm() {
      return weeklyFitnessGoalLevel3DistanceKm_;
    }
    /**
     * <code>double weekly_fitness_goal_level3_distance_km = 3;</code>
     * @param value The weeklyFitnessGoalLevel3DistanceKm to set.
     * @return This builder for chaining.
     */
    public Builder setWeeklyFitnessGoalLevel3DistanceKm(double value) {
      
      weeklyFitnessGoalLevel3DistanceKm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weekly_fitness_goal_level3_distance_km = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeeklyFitnessGoalLevel3DistanceKm() {
      
      weeklyFitnessGoalLevel3DistanceKm_ = 0D;
      onChanged();
      return this;
    }

    private double weeklyFitnessGoalLevel4DistanceKm_ ;
    /**
     * <code>double weekly_fitness_goal_level4_distance_km = 4;</code>
     * @return The weeklyFitnessGoalLevel4DistanceKm.
     */
    @java.lang.Override
    public double getWeeklyFitnessGoalLevel4DistanceKm() {
      return weeklyFitnessGoalLevel4DistanceKm_;
    }
    /**
     * <code>double weekly_fitness_goal_level4_distance_km = 4;</code>
     * @param value The weeklyFitnessGoalLevel4DistanceKm to set.
     * @return This builder for chaining.
     */
    public Builder setWeeklyFitnessGoalLevel4DistanceKm(double value) {
      
      weeklyFitnessGoalLevel4DistanceKm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weekly_fitness_goal_level4_distance_km = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeeklyFitnessGoalLevel4DistanceKm() {
      
      weeklyFitnessGoalLevel4DistanceKm_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BackgroundModeSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BackgroundModeSettingsProto)
  private static final POGOProtos.Rpc.BackgroundModeSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BackgroundModeSettingsProto();
  }

  public static POGOProtos.Rpc.BackgroundModeSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackgroundModeSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<BackgroundModeSettingsProto>() {
    @java.lang.Override
    public BackgroundModeSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BackgroundModeSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BackgroundModeSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackgroundModeSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BackgroundModeSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

