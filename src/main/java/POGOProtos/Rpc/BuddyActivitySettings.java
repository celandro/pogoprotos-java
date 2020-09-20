// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IHEOKLGNCGP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BuddyActivitySettings}
 */
public final class BuddyActivitySettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BuddyActivitySettings)
    BuddyActivitySettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuddyActivitySettings.newBuilder() to construct.
  private BuddyActivitySettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuddyActivitySettings() {
    activity_ = 0;
    activityCategory_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuddyActivitySettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuddyActivitySettings(
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

            activity_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            activityCategory_ = rawValue;
            break;
          }
          case 24: {

            maxTimesPerDay_ = input.readInt32();
            break;
          }
          case 32: {

            numPointsPerAction_ = input.readInt32();
            break;
          }
          case 40: {

            numEmotionPointsPerAction_ = input.readInt32();
            break;
          }
          case 48: {

            emotionCooldownDurationMs_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyActivitySettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyActivitySettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BuddyActivitySettings.class, POGOProtos.Rpc.BuddyActivitySettings.Builder.class);
  }

  public static final int ACTIVITY_FIELD_NUMBER = 1;
  private int activity_;
  /**
   * <code>.POGOProtos.Rpc.BuddyActivity activity = 1;</code>
   * @return The enum numeric value on the wire for activity.
   */
  @java.lang.Override public int getActivityValue() {
    return activity_;
  }
  /**
   * <code>.POGOProtos.Rpc.BuddyActivity activity = 1;</code>
   * @return The activity.
   */
  @java.lang.Override public POGOProtos.Rpc.BuddyActivity getActivity() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BuddyActivity result = POGOProtos.Rpc.BuddyActivity.valueOf(activity_);
    return result == null ? POGOProtos.Rpc.BuddyActivity.UNRECOGNIZED : result;
  }

  public static final int ACTIVITY_CATEGORY_FIELD_NUMBER = 2;
  private int activityCategory_;
  /**
   * <code>.POGOProtos.Rpc.BuddyActivityCategory activity_category = 2;</code>
   * @return The enum numeric value on the wire for activityCategory.
   */
  @java.lang.Override public int getActivityCategoryValue() {
    return activityCategory_;
  }
  /**
   * <code>.POGOProtos.Rpc.BuddyActivityCategory activity_category = 2;</code>
   * @return The activityCategory.
   */
  @java.lang.Override public POGOProtos.Rpc.BuddyActivityCategory getActivityCategory() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BuddyActivityCategory result = POGOProtos.Rpc.BuddyActivityCategory.valueOf(activityCategory_);
    return result == null ? POGOProtos.Rpc.BuddyActivityCategory.UNRECOGNIZED : result;
  }

  public static final int MAX_TIMES_PER_DAY_FIELD_NUMBER = 3;
  private int maxTimesPerDay_;
  /**
   * <code>int32 max_times_per_day = 3;</code>
   * @return The maxTimesPerDay.
   */
  @java.lang.Override
  public int getMaxTimesPerDay() {
    return maxTimesPerDay_;
  }

  public static final int NUM_POINTS_PER_ACTION_FIELD_NUMBER = 4;
  private int numPointsPerAction_;
  /**
   * <code>int32 num_points_per_action = 4;</code>
   * @return The numPointsPerAction.
   */
  @java.lang.Override
  public int getNumPointsPerAction() {
    return numPointsPerAction_;
  }

  public static final int NUM_EMOTION_POINTS_PER_ACTION_FIELD_NUMBER = 5;
  private int numEmotionPointsPerAction_;
  /**
   * <code>int32 num_emotion_points_per_action = 5;</code>
   * @return The numEmotionPointsPerAction.
   */
  @java.lang.Override
  public int getNumEmotionPointsPerAction() {
    return numEmotionPointsPerAction_;
  }

  public static final int EMOTION_COOLDOWN_DURATION_MS_FIELD_NUMBER = 6;
  private long emotionCooldownDurationMs_;
  /**
   * <code>int64 emotion_cooldown_duration_ms = 6;</code>
   * @return The emotionCooldownDurationMs.
   */
  @java.lang.Override
  public long getEmotionCooldownDurationMs() {
    return emotionCooldownDurationMs_;
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
    if (activity_ != POGOProtos.Rpc.BuddyActivity.BUDDY_ACTIVITY_BUDDY_ACTIVITY_UNSET.getNumber()) {
      output.writeEnum(1, activity_);
    }
    if (activityCategory_ != POGOProtos.Rpc.BuddyActivityCategory.BUDDY_ACTIVITY_CATEGORY_BUDDY_CATEGORY_UNSET.getNumber()) {
      output.writeEnum(2, activityCategory_);
    }
    if (maxTimesPerDay_ != 0) {
      output.writeInt32(3, maxTimesPerDay_);
    }
    if (numPointsPerAction_ != 0) {
      output.writeInt32(4, numPointsPerAction_);
    }
    if (numEmotionPointsPerAction_ != 0) {
      output.writeInt32(5, numEmotionPointsPerAction_);
    }
    if (emotionCooldownDurationMs_ != 0L) {
      output.writeInt64(6, emotionCooldownDurationMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (activity_ != POGOProtos.Rpc.BuddyActivity.BUDDY_ACTIVITY_BUDDY_ACTIVITY_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, activity_);
    }
    if (activityCategory_ != POGOProtos.Rpc.BuddyActivityCategory.BUDDY_ACTIVITY_CATEGORY_BUDDY_CATEGORY_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, activityCategory_);
    }
    if (maxTimesPerDay_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxTimesPerDay_);
    }
    if (numPointsPerAction_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, numPointsPerAction_);
    }
    if (numEmotionPointsPerAction_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, numEmotionPointsPerAction_);
    }
    if (emotionCooldownDurationMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, emotionCooldownDurationMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.BuddyActivitySettings)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BuddyActivitySettings other = (POGOProtos.Rpc.BuddyActivitySettings) obj;

    if (activity_ != other.activity_) return false;
    if (activityCategory_ != other.activityCategory_) return false;
    if (getMaxTimesPerDay()
        != other.getMaxTimesPerDay()) return false;
    if (getNumPointsPerAction()
        != other.getNumPointsPerAction()) return false;
    if (getNumEmotionPointsPerAction()
        != other.getNumEmotionPointsPerAction()) return false;
    if (getEmotionCooldownDurationMs()
        != other.getEmotionCooldownDurationMs()) return false;
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
    hash = (37 * hash) + ACTIVITY_FIELD_NUMBER;
    hash = (53 * hash) + activity_;
    hash = (37 * hash) + ACTIVITY_CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + activityCategory_;
    hash = (37 * hash) + MAX_TIMES_PER_DAY_FIELD_NUMBER;
    hash = (53 * hash) + getMaxTimesPerDay();
    hash = (37 * hash) + NUM_POINTS_PER_ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getNumPointsPerAction();
    hash = (37 * hash) + NUM_EMOTION_POINTS_PER_ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getNumEmotionPointsPerAction();
    hash = (37 * hash) + EMOTION_COOLDOWN_DURATION_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEmotionCooldownDurationMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyActivitySettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BuddyActivitySettings prototype) {
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
   * ref: IHEOKLGNCGP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BuddyActivitySettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BuddyActivitySettings)
      POGOProtos.Rpc.BuddyActivitySettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyActivitySettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyActivitySettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BuddyActivitySettings.class, POGOProtos.Rpc.BuddyActivitySettings.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BuddyActivitySettings.newBuilder()
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
      activity_ = 0;

      activityCategory_ = 0;

      maxTimesPerDay_ = 0;

      numPointsPerAction_ = 0;

      numEmotionPointsPerAction_ = 0;

      emotionCooldownDurationMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyActivitySettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyActivitySettings getDefaultInstanceForType() {
      return POGOProtos.Rpc.BuddyActivitySettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyActivitySettings build() {
      POGOProtos.Rpc.BuddyActivitySettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyActivitySettings buildPartial() {
      POGOProtos.Rpc.BuddyActivitySettings result = new POGOProtos.Rpc.BuddyActivitySettings(this);
      result.activity_ = activity_;
      result.activityCategory_ = activityCategory_;
      result.maxTimesPerDay_ = maxTimesPerDay_;
      result.numPointsPerAction_ = numPointsPerAction_;
      result.numEmotionPointsPerAction_ = numEmotionPointsPerAction_;
      result.emotionCooldownDurationMs_ = emotionCooldownDurationMs_;
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
      if (other instanceof POGOProtos.Rpc.BuddyActivitySettings) {
        return mergeFrom((POGOProtos.Rpc.BuddyActivitySettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BuddyActivitySettings other) {
      if (other == POGOProtos.Rpc.BuddyActivitySettings.getDefaultInstance()) return this;
      if (other.activity_ != 0) {
        setActivityValue(other.getActivityValue());
      }
      if (other.activityCategory_ != 0) {
        setActivityCategoryValue(other.getActivityCategoryValue());
      }
      if (other.getMaxTimesPerDay() != 0) {
        setMaxTimesPerDay(other.getMaxTimesPerDay());
      }
      if (other.getNumPointsPerAction() != 0) {
        setNumPointsPerAction(other.getNumPointsPerAction());
      }
      if (other.getNumEmotionPointsPerAction() != 0) {
        setNumEmotionPointsPerAction(other.getNumEmotionPointsPerAction());
      }
      if (other.getEmotionCooldownDurationMs() != 0L) {
        setEmotionCooldownDurationMs(other.getEmotionCooldownDurationMs());
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
      POGOProtos.Rpc.BuddyActivitySettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BuddyActivitySettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int activity_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BuddyActivity activity = 1;</code>
     * @return The enum numeric value on the wire for activity.
     */
    @java.lang.Override public int getActivityValue() {
      return activity_;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyActivity activity = 1;</code>
     * @param value The enum numeric value on the wire for activity to set.
     * @return This builder for chaining.
     */
    public Builder setActivityValue(int value) {
      
      activity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyActivity activity = 1;</code>
     * @return The activity.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BuddyActivity getActivity() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BuddyActivity result = POGOProtos.Rpc.BuddyActivity.valueOf(activity_);
      return result == null ? POGOProtos.Rpc.BuddyActivity.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyActivity activity = 1;</code>
     * @param value The activity to set.
     * @return This builder for chaining.
     */
    public Builder setActivity(POGOProtos.Rpc.BuddyActivity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      activity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyActivity activity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearActivity() {
      
      activity_ = 0;
      onChanged();
      return this;
    }

    private int activityCategory_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BuddyActivityCategory activity_category = 2;</code>
     * @return The enum numeric value on the wire for activityCategory.
     */
    @java.lang.Override public int getActivityCategoryValue() {
      return activityCategory_;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyActivityCategory activity_category = 2;</code>
     * @param value The enum numeric value on the wire for activityCategory to set.
     * @return This builder for chaining.
     */
    public Builder setActivityCategoryValue(int value) {
      
      activityCategory_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyActivityCategory activity_category = 2;</code>
     * @return The activityCategory.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BuddyActivityCategory getActivityCategory() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BuddyActivityCategory result = POGOProtos.Rpc.BuddyActivityCategory.valueOf(activityCategory_);
      return result == null ? POGOProtos.Rpc.BuddyActivityCategory.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyActivityCategory activity_category = 2;</code>
     * @param value The activityCategory to set.
     * @return This builder for chaining.
     */
    public Builder setActivityCategory(POGOProtos.Rpc.BuddyActivityCategory value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      activityCategory_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyActivityCategory activity_category = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActivityCategory() {
      
      activityCategory_ = 0;
      onChanged();
      return this;
    }

    private int maxTimesPerDay_ ;
    /**
     * <code>int32 max_times_per_day = 3;</code>
     * @return The maxTimesPerDay.
     */
    @java.lang.Override
    public int getMaxTimesPerDay() {
      return maxTimesPerDay_;
    }
    /**
     * <code>int32 max_times_per_day = 3;</code>
     * @param value The maxTimesPerDay to set.
     * @return This builder for chaining.
     */
    public Builder setMaxTimesPerDay(int value) {
      
      maxTimesPerDay_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_times_per_day = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxTimesPerDay() {
      
      maxTimesPerDay_ = 0;
      onChanged();
      return this;
    }

    private int numPointsPerAction_ ;
    /**
     * <code>int32 num_points_per_action = 4;</code>
     * @return The numPointsPerAction.
     */
    @java.lang.Override
    public int getNumPointsPerAction() {
      return numPointsPerAction_;
    }
    /**
     * <code>int32 num_points_per_action = 4;</code>
     * @param value The numPointsPerAction to set.
     * @return This builder for chaining.
     */
    public Builder setNumPointsPerAction(int value) {
      
      numPointsPerAction_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_points_per_action = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumPointsPerAction() {
      
      numPointsPerAction_ = 0;
      onChanged();
      return this;
    }

    private int numEmotionPointsPerAction_ ;
    /**
     * <code>int32 num_emotion_points_per_action = 5;</code>
     * @return The numEmotionPointsPerAction.
     */
    @java.lang.Override
    public int getNumEmotionPointsPerAction() {
      return numEmotionPointsPerAction_;
    }
    /**
     * <code>int32 num_emotion_points_per_action = 5;</code>
     * @param value The numEmotionPointsPerAction to set.
     * @return This builder for chaining.
     */
    public Builder setNumEmotionPointsPerAction(int value) {
      
      numEmotionPointsPerAction_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_emotion_points_per_action = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumEmotionPointsPerAction() {
      
      numEmotionPointsPerAction_ = 0;
      onChanged();
      return this;
    }

    private long emotionCooldownDurationMs_ ;
    /**
     * <code>int64 emotion_cooldown_duration_ms = 6;</code>
     * @return The emotionCooldownDurationMs.
     */
    @java.lang.Override
    public long getEmotionCooldownDurationMs() {
      return emotionCooldownDurationMs_;
    }
    /**
     * <code>int64 emotion_cooldown_duration_ms = 6;</code>
     * @param value The emotionCooldownDurationMs to set.
     * @return This builder for chaining.
     */
    public Builder setEmotionCooldownDurationMs(long value) {
      
      emotionCooldownDurationMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 emotion_cooldown_duration_ms = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmotionCooldownDurationMs() {
      
      emotionCooldownDurationMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BuddyActivitySettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BuddyActivitySettings)
  private static final POGOProtos.Rpc.BuddyActivitySettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BuddyActivitySettings();
  }

  public static POGOProtos.Rpc.BuddyActivitySettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuddyActivitySettings>
      PARSER = new com.google.protobuf.AbstractParser<BuddyActivitySettings>() {
    @java.lang.Override
    public BuddyActivitySettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuddyActivitySettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuddyActivitySettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuddyActivitySettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BuddyActivitySettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

