// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Fitness/FitnessMetrics.proto

package POGOProtos.Data.Fitness;

/**
 * Protobuf type {@code POGOProtos.Data.Fitness.FitnessMetrics}
 */
public  final class FitnessMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Fitness.FitnessMetrics)
    FitnessMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FitnessMetrics.newBuilder() to construct.
  private FitnessMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FitnessMetrics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FitnessMetrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FitnessMetrics(
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

            distanceWalkedMeters_ = input.readDouble();
            break;
          }
          case 16: {

            stepCount_ = input.readInt32();
            break;
          }
          case 25: {

            caloriesBurnedKcals_ = input.readDouble();
            break;
          }
          case 32: {

            exerciseDurationMi_ = input.readInt64();
            break;
          }
          case 41: {

            wheelchairDistanceMeters_ = input.readDouble();
            break;
          }
          case 49: {

            wheelchairPushCount_ = input.readDouble();
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
    return POGOProtos.Data.Fitness.FitnessMetricsOuterClass.internal_static_POGOProtos_Data_Fitness_FitnessMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Fitness.FitnessMetricsOuterClass.internal_static_POGOProtos_Data_Fitness_FitnessMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Fitness.FitnessMetrics.class, POGOProtos.Data.Fitness.FitnessMetrics.Builder.class);
  }

  public static final int DISTANCE_WALKED_METERS_FIELD_NUMBER = 1;
  private double distanceWalkedMeters_;
  /**
   * <code>double distance_walked_meters = 1;</code>
   * @return The distanceWalkedMeters.
   */
  public double getDistanceWalkedMeters() {
    return distanceWalkedMeters_;
  }

  public static final int STEP_COUNT_FIELD_NUMBER = 2;
  private int stepCount_;
  /**
   * <code>int32 step_count = 2;</code>
   * @return The stepCount.
   */
  public int getStepCount() {
    return stepCount_;
  }

  public static final int CALORIES_BURNED_KCALS_FIELD_NUMBER = 3;
  private double caloriesBurnedKcals_;
  /**
   * <code>double calories_burned_kcals = 3;</code>
   * @return The caloriesBurnedKcals.
   */
  public double getCaloriesBurnedKcals() {
    return caloriesBurnedKcals_;
  }

  public static final int EXERCISE_DURATION_MI_FIELD_NUMBER = 4;
  private long exerciseDurationMi_;
  /**
   * <code>int64 exercise_duration_mi = 4;</code>
   * @return The exerciseDurationMi.
   */
  public long getExerciseDurationMi() {
    return exerciseDurationMi_;
  }

  public static final int WHEELCHAIR_DISTANCE_METERS_FIELD_NUMBER = 5;
  private double wheelchairDistanceMeters_;
  /**
   * <code>double wheelchair_distance_meters = 5;</code>
   * @return The wheelchairDistanceMeters.
   */
  public double getWheelchairDistanceMeters() {
    return wheelchairDistanceMeters_;
  }

  public static final int WHEELCHAIR_PUSH_COUNT_FIELD_NUMBER = 6;
  private double wheelchairPushCount_;
  /**
   * <code>double wheelchair_push_count = 6;</code>
   * @return The wheelchairPushCount.
   */
  public double getWheelchairPushCount() {
    return wheelchairPushCount_;
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
    if (distanceWalkedMeters_ != 0D) {
      output.writeDouble(1, distanceWalkedMeters_);
    }
    if (stepCount_ != 0) {
      output.writeInt32(2, stepCount_);
    }
    if (caloriesBurnedKcals_ != 0D) {
      output.writeDouble(3, caloriesBurnedKcals_);
    }
    if (exerciseDurationMi_ != 0L) {
      output.writeInt64(4, exerciseDurationMi_);
    }
    if (wheelchairDistanceMeters_ != 0D) {
      output.writeDouble(5, wheelchairDistanceMeters_);
    }
    if (wheelchairPushCount_ != 0D) {
      output.writeDouble(6, wheelchairPushCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (distanceWalkedMeters_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, distanceWalkedMeters_);
    }
    if (stepCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, stepCount_);
    }
    if (caloriesBurnedKcals_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, caloriesBurnedKcals_);
    }
    if (exerciseDurationMi_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, exerciseDurationMi_);
    }
    if (wheelchairDistanceMeters_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, wheelchairDistanceMeters_);
    }
    if (wheelchairPushCount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, wheelchairPushCount_);
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
    if (!(obj instanceof POGOProtos.Data.Fitness.FitnessMetrics)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Fitness.FitnessMetrics other = (POGOProtos.Data.Fitness.FitnessMetrics) obj;

    if (java.lang.Double.doubleToLongBits(getDistanceWalkedMeters())
        != java.lang.Double.doubleToLongBits(
            other.getDistanceWalkedMeters())) return false;
    if (getStepCount()
        != other.getStepCount()) return false;
    if (java.lang.Double.doubleToLongBits(getCaloriesBurnedKcals())
        != java.lang.Double.doubleToLongBits(
            other.getCaloriesBurnedKcals())) return false;
    if (getExerciseDurationMi()
        != other.getExerciseDurationMi()) return false;
    if (java.lang.Double.doubleToLongBits(getWheelchairDistanceMeters())
        != java.lang.Double.doubleToLongBits(
            other.getWheelchairDistanceMeters())) return false;
    if (java.lang.Double.doubleToLongBits(getWheelchairPushCount())
        != java.lang.Double.doubleToLongBits(
            other.getWheelchairPushCount())) return false;
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
    hash = (37 * hash) + DISTANCE_WALKED_METERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDistanceWalkedMeters()));
    hash = (37 * hash) + STEP_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getStepCount();
    hash = (37 * hash) + CALORIES_BURNED_KCALS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCaloriesBurnedKcals()));
    hash = (37 * hash) + EXERCISE_DURATION_MI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExerciseDurationMi());
    hash = (37 * hash) + WHEELCHAIR_DISTANCE_METERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWheelchairDistanceMeters()));
    hash = (37 * hash) + WHEELCHAIR_PUSH_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWheelchairPushCount()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Fitness.FitnessMetrics parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Fitness.FitnessMetrics prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Fitness.FitnessMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Fitness.FitnessMetrics)
      POGOProtos.Data.Fitness.FitnessMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Fitness.FitnessMetricsOuterClass.internal_static_POGOProtos_Data_Fitness_FitnessMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Fitness.FitnessMetricsOuterClass.internal_static_POGOProtos_Data_Fitness_FitnessMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Fitness.FitnessMetrics.class, POGOProtos.Data.Fitness.FitnessMetrics.Builder.class);
    }

    // Construct using POGOProtos.Data.Fitness.FitnessMetrics.newBuilder()
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
      distanceWalkedMeters_ = 0D;

      stepCount_ = 0;

      caloriesBurnedKcals_ = 0D;

      exerciseDurationMi_ = 0L;

      wheelchairDistanceMeters_ = 0D;

      wheelchairPushCount_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Fitness.FitnessMetricsOuterClass.internal_static_POGOProtos_Data_Fitness_FitnessMetrics_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Fitness.FitnessMetrics getDefaultInstanceForType() {
      return POGOProtos.Data.Fitness.FitnessMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Fitness.FitnessMetrics build() {
      POGOProtos.Data.Fitness.FitnessMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Fitness.FitnessMetrics buildPartial() {
      POGOProtos.Data.Fitness.FitnessMetrics result = new POGOProtos.Data.Fitness.FitnessMetrics(this);
      result.distanceWalkedMeters_ = distanceWalkedMeters_;
      result.stepCount_ = stepCount_;
      result.caloriesBurnedKcals_ = caloriesBurnedKcals_;
      result.exerciseDurationMi_ = exerciseDurationMi_;
      result.wheelchairDistanceMeters_ = wheelchairDistanceMeters_;
      result.wheelchairPushCount_ = wheelchairPushCount_;
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
      if (other instanceof POGOProtos.Data.Fitness.FitnessMetrics) {
        return mergeFrom((POGOProtos.Data.Fitness.FitnessMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Fitness.FitnessMetrics other) {
      if (other == POGOProtos.Data.Fitness.FitnessMetrics.getDefaultInstance()) return this;
      if (other.getDistanceWalkedMeters() != 0D) {
        setDistanceWalkedMeters(other.getDistanceWalkedMeters());
      }
      if (other.getStepCount() != 0) {
        setStepCount(other.getStepCount());
      }
      if (other.getCaloriesBurnedKcals() != 0D) {
        setCaloriesBurnedKcals(other.getCaloriesBurnedKcals());
      }
      if (other.getExerciseDurationMi() != 0L) {
        setExerciseDurationMi(other.getExerciseDurationMi());
      }
      if (other.getWheelchairDistanceMeters() != 0D) {
        setWheelchairDistanceMeters(other.getWheelchairDistanceMeters());
      }
      if (other.getWheelchairPushCount() != 0D) {
        setWheelchairPushCount(other.getWheelchairPushCount());
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
      POGOProtos.Data.Fitness.FitnessMetrics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Fitness.FitnessMetrics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double distanceWalkedMeters_ ;
    /**
     * <code>double distance_walked_meters = 1;</code>
     * @return The distanceWalkedMeters.
     */
    public double getDistanceWalkedMeters() {
      return distanceWalkedMeters_;
    }
    /**
     * <code>double distance_walked_meters = 1;</code>
     * @param value The distanceWalkedMeters to set.
     * @return This builder for chaining.
     */
    public Builder setDistanceWalkedMeters(double value) {
      
      distanceWalkedMeters_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double distance_walked_meters = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDistanceWalkedMeters() {
      
      distanceWalkedMeters_ = 0D;
      onChanged();
      return this;
    }

    private int stepCount_ ;
    /**
     * <code>int32 step_count = 2;</code>
     * @return The stepCount.
     */
    public int getStepCount() {
      return stepCount_;
    }
    /**
     * <code>int32 step_count = 2;</code>
     * @param value The stepCount to set.
     * @return This builder for chaining.
     */
    public Builder setStepCount(int value) {
      
      stepCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 step_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStepCount() {
      
      stepCount_ = 0;
      onChanged();
      return this;
    }

    private double caloriesBurnedKcals_ ;
    /**
     * <code>double calories_burned_kcals = 3;</code>
     * @return The caloriesBurnedKcals.
     */
    public double getCaloriesBurnedKcals() {
      return caloriesBurnedKcals_;
    }
    /**
     * <code>double calories_burned_kcals = 3;</code>
     * @param value The caloriesBurnedKcals to set.
     * @return This builder for chaining.
     */
    public Builder setCaloriesBurnedKcals(double value) {
      
      caloriesBurnedKcals_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double calories_burned_kcals = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCaloriesBurnedKcals() {
      
      caloriesBurnedKcals_ = 0D;
      onChanged();
      return this;
    }

    private long exerciseDurationMi_ ;
    /**
     * <code>int64 exercise_duration_mi = 4;</code>
     * @return The exerciseDurationMi.
     */
    public long getExerciseDurationMi() {
      return exerciseDurationMi_;
    }
    /**
     * <code>int64 exercise_duration_mi = 4;</code>
     * @param value The exerciseDurationMi to set.
     * @return This builder for chaining.
     */
    public Builder setExerciseDurationMi(long value) {
      
      exerciseDurationMi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 exercise_duration_mi = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExerciseDurationMi() {
      
      exerciseDurationMi_ = 0L;
      onChanged();
      return this;
    }

    private double wheelchairDistanceMeters_ ;
    /**
     * <code>double wheelchair_distance_meters = 5;</code>
     * @return The wheelchairDistanceMeters.
     */
    public double getWheelchairDistanceMeters() {
      return wheelchairDistanceMeters_;
    }
    /**
     * <code>double wheelchair_distance_meters = 5;</code>
     * @param value The wheelchairDistanceMeters to set.
     * @return This builder for chaining.
     */
    public Builder setWheelchairDistanceMeters(double value) {
      
      wheelchairDistanceMeters_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double wheelchair_distance_meters = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearWheelchairDistanceMeters() {
      
      wheelchairDistanceMeters_ = 0D;
      onChanged();
      return this;
    }

    private double wheelchairPushCount_ ;
    /**
     * <code>double wheelchair_push_count = 6;</code>
     * @return The wheelchairPushCount.
     */
    public double getWheelchairPushCount() {
      return wheelchairPushCount_;
    }
    /**
     * <code>double wheelchair_push_count = 6;</code>
     * @param value The wheelchairPushCount to set.
     * @return This builder for chaining.
     */
    public Builder setWheelchairPushCount(double value) {
      
      wheelchairPushCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double wheelchair_push_count = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearWheelchairPushCount() {
      
      wheelchairPushCount_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Fitness.FitnessMetrics)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Fitness.FitnessMetrics)
  private static final POGOProtos.Data.Fitness.FitnessMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Fitness.FitnessMetrics();
  }

  public static POGOProtos.Data.Fitness.FitnessMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FitnessMetrics>
      PARSER = new com.google.protobuf.AbstractParser<FitnessMetrics>() {
    @java.lang.Override
    public FitnessMetrics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FitnessMetrics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FitnessMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FitnessMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Fitness.FitnessMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

