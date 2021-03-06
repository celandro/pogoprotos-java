// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MapBuddySettingsProto}
 */
public final class MapBuddySettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MapBuddySettingsProto)
    MapBuddySettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MapBuddySettingsProto.newBuilder() to construct.
  private MapBuddySettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MapBuddySettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MapBuddySettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MapBuddySettingsProto(
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

            forBuddyGroupNumber_ = input.readInt32();
            break;
          }
          case 21: {

            targetOffsetMin_ = input.readFloat();
            break;
          }
          case 29: {

            targetOffsetMax_ = input.readFloat();
            break;
          }
          case 37: {

            leashDistance_ = input.readFloat();
            break;
          }
          case 45: {

            maxSecondsToIdle_ = input.readFloat();
            break;
          }
          case 53: {

            maxRotationSpeed_ = input.readFloat();
            break;
          }
          case 61: {

            walkThreshold_ = input.readFloat();
            break;
          }
          case 69: {

            runThreshold_ = input.readFloat();
            break;
          }
          case 72: {

            shouldGlide_ = input.readBool();
            break;
          }
          case 85: {

            glideSmoothTime_ = input.readFloat();
            break;
          }
          case 93: {

            glideMaxSpeed_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MapBuddySettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MapBuddySettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MapBuddySettingsProto.class, POGOProtos.Rpc.MapBuddySettingsProto.Builder.class);
  }

  public static final int FOR_BUDDY_GROUP_NUMBER_FIELD_NUMBER = 1;
  private int forBuddyGroupNumber_;
  /**
   * <code>int32 for_buddy_group_number = 1;</code>
   * @return The forBuddyGroupNumber.
   */
  @java.lang.Override
  public int getForBuddyGroupNumber() {
    return forBuddyGroupNumber_;
  }

  public static final int TARGET_OFFSET_MIN_FIELD_NUMBER = 2;
  private float targetOffsetMin_;
  /**
   * <code>float target_offset_min = 2;</code>
   * @return The targetOffsetMin.
   */
  @java.lang.Override
  public float getTargetOffsetMin() {
    return targetOffsetMin_;
  }

  public static final int TARGET_OFFSET_MAX_FIELD_NUMBER = 3;
  private float targetOffsetMax_;
  /**
   * <code>float target_offset_max = 3;</code>
   * @return The targetOffsetMax.
   */
  @java.lang.Override
  public float getTargetOffsetMax() {
    return targetOffsetMax_;
  }

  public static final int LEASH_DISTANCE_FIELD_NUMBER = 4;
  private float leashDistance_;
  /**
   * <code>float leash_distance = 4;</code>
   * @return The leashDistance.
   */
  @java.lang.Override
  public float getLeashDistance() {
    return leashDistance_;
  }

  public static final int MAX_SECONDS_TO_IDLE_FIELD_NUMBER = 5;
  private float maxSecondsToIdle_;
  /**
   * <code>float max_seconds_to_idle = 5;</code>
   * @return The maxSecondsToIdle.
   */
  @java.lang.Override
  public float getMaxSecondsToIdle() {
    return maxSecondsToIdle_;
  }

  public static final int MAX_ROTATION_SPEED_FIELD_NUMBER = 6;
  private float maxRotationSpeed_;
  /**
   * <code>float max_rotation_speed = 6;</code>
   * @return The maxRotationSpeed.
   */
  @java.lang.Override
  public float getMaxRotationSpeed() {
    return maxRotationSpeed_;
  }

  public static final int WALK_THRESHOLD_FIELD_NUMBER = 7;
  private float walkThreshold_;
  /**
   * <code>float walk_threshold = 7;</code>
   * @return The walkThreshold.
   */
  @java.lang.Override
  public float getWalkThreshold() {
    return walkThreshold_;
  }

  public static final int RUN_THRESHOLD_FIELD_NUMBER = 8;
  private float runThreshold_;
  /**
   * <code>float run_threshold = 8;</code>
   * @return The runThreshold.
   */
  @java.lang.Override
  public float getRunThreshold() {
    return runThreshold_;
  }

  public static final int SHOULD_GLIDE_FIELD_NUMBER = 9;
  private boolean shouldGlide_;
  /**
   * <code>bool should_glide = 9;</code>
   * @return The shouldGlide.
   */
  @java.lang.Override
  public boolean getShouldGlide() {
    return shouldGlide_;
  }

  public static final int GLIDE_SMOOTH_TIME_FIELD_NUMBER = 10;
  private float glideSmoothTime_;
  /**
   * <code>float glide_smooth_time = 10;</code>
   * @return The glideSmoothTime.
   */
  @java.lang.Override
  public float getGlideSmoothTime() {
    return glideSmoothTime_;
  }

  public static final int GLIDE_MAX_SPEED_FIELD_NUMBER = 11;
  private float glideMaxSpeed_;
  /**
   * <code>float glide_max_speed = 11;</code>
   * @return The glideMaxSpeed.
   */
  @java.lang.Override
  public float getGlideMaxSpeed() {
    return glideMaxSpeed_;
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
    if (forBuddyGroupNumber_ != 0) {
      output.writeInt32(1, forBuddyGroupNumber_);
    }
    if (targetOffsetMin_ != 0F) {
      output.writeFloat(2, targetOffsetMin_);
    }
    if (targetOffsetMax_ != 0F) {
      output.writeFloat(3, targetOffsetMax_);
    }
    if (leashDistance_ != 0F) {
      output.writeFloat(4, leashDistance_);
    }
    if (maxSecondsToIdle_ != 0F) {
      output.writeFloat(5, maxSecondsToIdle_);
    }
    if (maxRotationSpeed_ != 0F) {
      output.writeFloat(6, maxRotationSpeed_);
    }
    if (walkThreshold_ != 0F) {
      output.writeFloat(7, walkThreshold_);
    }
    if (runThreshold_ != 0F) {
      output.writeFloat(8, runThreshold_);
    }
    if (shouldGlide_ != false) {
      output.writeBool(9, shouldGlide_);
    }
    if (glideSmoothTime_ != 0F) {
      output.writeFloat(10, glideSmoothTime_);
    }
    if (glideMaxSpeed_ != 0F) {
      output.writeFloat(11, glideMaxSpeed_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (forBuddyGroupNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, forBuddyGroupNumber_);
    }
    if (targetOffsetMin_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, targetOffsetMin_);
    }
    if (targetOffsetMax_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, targetOffsetMax_);
    }
    if (leashDistance_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, leashDistance_);
    }
    if (maxSecondsToIdle_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, maxSecondsToIdle_);
    }
    if (maxRotationSpeed_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, maxRotationSpeed_);
    }
    if (walkThreshold_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, walkThreshold_);
    }
    if (runThreshold_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(8, runThreshold_);
    }
    if (shouldGlide_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, shouldGlide_);
    }
    if (glideSmoothTime_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(10, glideSmoothTime_);
    }
    if (glideMaxSpeed_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(11, glideMaxSpeed_);
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
    if (!(obj instanceof POGOProtos.Rpc.MapBuddySettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MapBuddySettingsProto other = (POGOProtos.Rpc.MapBuddySettingsProto) obj;

    if (getForBuddyGroupNumber()
        != other.getForBuddyGroupNumber()) return false;
    if (java.lang.Float.floatToIntBits(getTargetOffsetMin())
        != java.lang.Float.floatToIntBits(
            other.getTargetOffsetMin())) return false;
    if (java.lang.Float.floatToIntBits(getTargetOffsetMax())
        != java.lang.Float.floatToIntBits(
            other.getTargetOffsetMax())) return false;
    if (java.lang.Float.floatToIntBits(getLeashDistance())
        != java.lang.Float.floatToIntBits(
            other.getLeashDistance())) return false;
    if (java.lang.Float.floatToIntBits(getMaxSecondsToIdle())
        != java.lang.Float.floatToIntBits(
            other.getMaxSecondsToIdle())) return false;
    if (java.lang.Float.floatToIntBits(getMaxRotationSpeed())
        != java.lang.Float.floatToIntBits(
            other.getMaxRotationSpeed())) return false;
    if (java.lang.Float.floatToIntBits(getWalkThreshold())
        != java.lang.Float.floatToIntBits(
            other.getWalkThreshold())) return false;
    if (java.lang.Float.floatToIntBits(getRunThreshold())
        != java.lang.Float.floatToIntBits(
            other.getRunThreshold())) return false;
    if (getShouldGlide()
        != other.getShouldGlide()) return false;
    if (java.lang.Float.floatToIntBits(getGlideSmoothTime())
        != java.lang.Float.floatToIntBits(
            other.getGlideSmoothTime())) return false;
    if (java.lang.Float.floatToIntBits(getGlideMaxSpeed())
        != java.lang.Float.floatToIntBits(
            other.getGlideMaxSpeed())) return false;
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
    hash = (37 * hash) + FOR_BUDDY_GROUP_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getForBuddyGroupNumber();
    hash = (37 * hash) + TARGET_OFFSET_MIN_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTargetOffsetMin());
    hash = (37 * hash) + TARGET_OFFSET_MAX_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTargetOffsetMax());
    hash = (37 * hash) + LEASH_DISTANCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLeashDistance());
    hash = (37 * hash) + MAX_SECONDS_TO_IDLE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMaxSecondsToIdle());
    hash = (37 * hash) + MAX_ROTATION_SPEED_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMaxRotationSpeed());
    hash = (37 * hash) + WALK_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getWalkThreshold());
    hash = (37 * hash) + RUN_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRunThreshold());
    hash = (37 * hash) + SHOULD_GLIDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getShouldGlide());
    hash = (37 * hash) + GLIDE_SMOOTH_TIME_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGlideSmoothTime());
    hash = (37 * hash) + GLIDE_MAX_SPEED_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGlideMaxSpeed());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MapBuddySettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MapBuddySettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MapBuddySettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MapBuddySettingsProto)
      POGOProtos.Rpc.MapBuddySettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MapBuddySettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MapBuddySettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MapBuddySettingsProto.class, POGOProtos.Rpc.MapBuddySettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MapBuddySettingsProto.newBuilder()
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
      forBuddyGroupNumber_ = 0;

      targetOffsetMin_ = 0F;

      targetOffsetMax_ = 0F;

      leashDistance_ = 0F;

      maxSecondsToIdle_ = 0F;

      maxRotationSpeed_ = 0F;

      walkThreshold_ = 0F;

      runThreshold_ = 0F;

      shouldGlide_ = false;

      glideSmoothTime_ = 0F;

      glideMaxSpeed_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MapBuddySettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MapBuddySettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.MapBuddySettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MapBuddySettingsProto build() {
      POGOProtos.Rpc.MapBuddySettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MapBuddySettingsProto buildPartial() {
      POGOProtos.Rpc.MapBuddySettingsProto result = new POGOProtos.Rpc.MapBuddySettingsProto(this);
      result.forBuddyGroupNumber_ = forBuddyGroupNumber_;
      result.targetOffsetMin_ = targetOffsetMin_;
      result.targetOffsetMax_ = targetOffsetMax_;
      result.leashDistance_ = leashDistance_;
      result.maxSecondsToIdle_ = maxSecondsToIdle_;
      result.maxRotationSpeed_ = maxRotationSpeed_;
      result.walkThreshold_ = walkThreshold_;
      result.runThreshold_ = runThreshold_;
      result.shouldGlide_ = shouldGlide_;
      result.glideSmoothTime_ = glideSmoothTime_;
      result.glideMaxSpeed_ = glideMaxSpeed_;
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
      if (other instanceof POGOProtos.Rpc.MapBuddySettingsProto) {
        return mergeFrom((POGOProtos.Rpc.MapBuddySettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MapBuddySettingsProto other) {
      if (other == POGOProtos.Rpc.MapBuddySettingsProto.getDefaultInstance()) return this;
      if (other.getForBuddyGroupNumber() != 0) {
        setForBuddyGroupNumber(other.getForBuddyGroupNumber());
      }
      if (other.getTargetOffsetMin() != 0F) {
        setTargetOffsetMin(other.getTargetOffsetMin());
      }
      if (other.getTargetOffsetMax() != 0F) {
        setTargetOffsetMax(other.getTargetOffsetMax());
      }
      if (other.getLeashDistance() != 0F) {
        setLeashDistance(other.getLeashDistance());
      }
      if (other.getMaxSecondsToIdle() != 0F) {
        setMaxSecondsToIdle(other.getMaxSecondsToIdle());
      }
      if (other.getMaxRotationSpeed() != 0F) {
        setMaxRotationSpeed(other.getMaxRotationSpeed());
      }
      if (other.getWalkThreshold() != 0F) {
        setWalkThreshold(other.getWalkThreshold());
      }
      if (other.getRunThreshold() != 0F) {
        setRunThreshold(other.getRunThreshold());
      }
      if (other.getShouldGlide() != false) {
        setShouldGlide(other.getShouldGlide());
      }
      if (other.getGlideSmoothTime() != 0F) {
        setGlideSmoothTime(other.getGlideSmoothTime());
      }
      if (other.getGlideMaxSpeed() != 0F) {
        setGlideMaxSpeed(other.getGlideMaxSpeed());
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
      POGOProtos.Rpc.MapBuddySettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MapBuddySettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int forBuddyGroupNumber_ ;
    /**
     * <code>int32 for_buddy_group_number = 1;</code>
     * @return The forBuddyGroupNumber.
     */
    @java.lang.Override
    public int getForBuddyGroupNumber() {
      return forBuddyGroupNumber_;
    }
    /**
     * <code>int32 for_buddy_group_number = 1;</code>
     * @param value The forBuddyGroupNumber to set.
     * @return This builder for chaining.
     */
    public Builder setForBuddyGroupNumber(int value) {
      
      forBuddyGroupNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 for_buddy_group_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearForBuddyGroupNumber() {
      
      forBuddyGroupNumber_ = 0;
      onChanged();
      return this;
    }

    private float targetOffsetMin_ ;
    /**
     * <code>float target_offset_min = 2;</code>
     * @return The targetOffsetMin.
     */
    @java.lang.Override
    public float getTargetOffsetMin() {
      return targetOffsetMin_;
    }
    /**
     * <code>float target_offset_min = 2;</code>
     * @param value The targetOffsetMin to set.
     * @return This builder for chaining.
     */
    public Builder setTargetOffsetMin(float value) {
      
      targetOffsetMin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float target_offset_min = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetOffsetMin() {
      
      targetOffsetMin_ = 0F;
      onChanged();
      return this;
    }

    private float targetOffsetMax_ ;
    /**
     * <code>float target_offset_max = 3;</code>
     * @return The targetOffsetMax.
     */
    @java.lang.Override
    public float getTargetOffsetMax() {
      return targetOffsetMax_;
    }
    /**
     * <code>float target_offset_max = 3;</code>
     * @param value The targetOffsetMax to set.
     * @return This builder for chaining.
     */
    public Builder setTargetOffsetMax(float value) {
      
      targetOffsetMax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float target_offset_max = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetOffsetMax() {
      
      targetOffsetMax_ = 0F;
      onChanged();
      return this;
    }

    private float leashDistance_ ;
    /**
     * <code>float leash_distance = 4;</code>
     * @return The leashDistance.
     */
    @java.lang.Override
    public float getLeashDistance() {
      return leashDistance_;
    }
    /**
     * <code>float leash_distance = 4;</code>
     * @param value The leashDistance to set.
     * @return This builder for chaining.
     */
    public Builder setLeashDistance(float value) {
      
      leashDistance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float leash_distance = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeashDistance() {
      
      leashDistance_ = 0F;
      onChanged();
      return this;
    }

    private float maxSecondsToIdle_ ;
    /**
     * <code>float max_seconds_to_idle = 5;</code>
     * @return The maxSecondsToIdle.
     */
    @java.lang.Override
    public float getMaxSecondsToIdle() {
      return maxSecondsToIdle_;
    }
    /**
     * <code>float max_seconds_to_idle = 5;</code>
     * @param value The maxSecondsToIdle to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSecondsToIdle(float value) {
      
      maxSecondsToIdle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float max_seconds_to_idle = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxSecondsToIdle() {
      
      maxSecondsToIdle_ = 0F;
      onChanged();
      return this;
    }

    private float maxRotationSpeed_ ;
    /**
     * <code>float max_rotation_speed = 6;</code>
     * @return The maxRotationSpeed.
     */
    @java.lang.Override
    public float getMaxRotationSpeed() {
      return maxRotationSpeed_;
    }
    /**
     * <code>float max_rotation_speed = 6;</code>
     * @param value The maxRotationSpeed to set.
     * @return This builder for chaining.
     */
    public Builder setMaxRotationSpeed(float value) {
      
      maxRotationSpeed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float max_rotation_speed = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxRotationSpeed() {
      
      maxRotationSpeed_ = 0F;
      onChanged();
      return this;
    }

    private float walkThreshold_ ;
    /**
     * <code>float walk_threshold = 7;</code>
     * @return The walkThreshold.
     */
    @java.lang.Override
    public float getWalkThreshold() {
      return walkThreshold_;
    }
    /**
     * <code>float walk_threshold = 7;</code>
     * @param value The walkThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setWalkThreshold(float value) {
      
      walkThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float walk_threshold = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearWalkThreshold() {
      
      walkThreshold_ = 0F;
      onChanged();
      return this;
    }

    private float runThreshold_ ;
    /**
     * <code>float run_threshold = 8;</code>
     * @return The runThreshold.
     */
    @java.lang.Override
    public float getRunThreshold() {
      return runThreshold_;
    }
    /**
     * <code>float run_threshold = 8;</code>
     * @param value The runThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setRunThreshold(float value) {
      
      runThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float run_threshold = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearRunThreshold() {
      
      runThreshold_ = 0F;
      onChanged();
      return this;
    }

    private boolean shouldGlide_ ;
    /**
     * <code>bool should_glide = 9;</code>
     * @return The shouldGlide.
     */
    @java.lang.Override
    public boolean getShouldGlide() {
      return shouldGlide_;
    }
    /**
     * <code>bool should_glide = 9;</code>
     * @param value The shouldGlide to set.
     * @return This builder for chaining.
     */
    public Builder setShouldGlide(boolean value) {
      
      shouldGlide_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool should_glide = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearShouldGlide() {
      
      shouldGlide_ = false;
      onChanged();
      return this;
    }

    private float glideSmoothTime_ ;
    /**
     * <code>float glide_smooth_time = 10;</code>
     * @return The glideSmoothTime.
     */
    @java.lang.Override
    public float getGlideSmoothTime() {
      return glideSmoothTime_;
    }
    /**
     * <code>float glide_smooth_time = 10;</code>
     * @param value The glideSmoothTime to set.
     * @return This builder for chaining.
     */
    public Builder setGlideSmoothTime(float value) {
      
      glideSmoothTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float glide_smooth_time = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlideSmoothTime() {
      
      glideSmoothTime_ = 0F;
      onChanged();
      return this;
    }

    private float glideMaxSpeed_ ;
    /**
     * <code>float glide_max_speed = 11;</code>
     * @return The glideMaxSpeed.
     */
    @java.lang.Override
    public float getGlideMaxSpeed() {
      return glideMaxSpeed_;
    }
    /**
     * <code>float glide_max_speed = 11;</code>
     * @param value The glideMaxSpeed to set.
     * @return This builder for chaining.
     */
    public Builder setGlideMaxSpeed(float value) {
      
      glideMaxSpeed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float glide_max_speed = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlideMaxSpeed() {
      
      glideMaxSpeed_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MapBuddySettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MapBuddySettingsProto)
  private static final POGOProtos.Rpc.MapBuddySettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MapBuddySettingsProto();
  }

  public static POGOProtos.Rpc.MapBuddySettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MapBuddySettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<MapBuddySettingsProto>() {
    @java.lang.Override
    public MapBuddySettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MapBuddySettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MapBuddySettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MapBuddySettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MapBuddySettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

