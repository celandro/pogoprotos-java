// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BuddyEmotionLevelSettings.proto

package POGOProtos.Settings.Master;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.BuddyEmotionLevelSettings}
 */
public final class BuddyEmotionLevelSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.BuddyEmotionLevelSettings)
    BuddyEmotionLevelSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuddyEmotionLevelSettings.newBuilder() to construct.
  private BuddyEmotionLevelSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuddyEmotionLevelSettings() {
    emotionLevel_ = 0;
    emotionAnimation_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuddyEmotionLevelSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuddyEmotionLevelSettings(
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

            emotionLevel_ = rawValue;
            break;
          }
          case 16: {

            minEmotionPointsRequired_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            emotionAnimation_ = rawValue;
            break;
          }
          case 32: {

            decayPreventionDurationMs_ = input.readInt64();
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
    return POGOProtos.Settings.Master.BuddyEmotionLevelSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.BuddyEmotionLevelSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.BuddyEmotionLevelSettings.class, POGOProtos.Settings.Master.BuddyEmotionLevelSettings.Builder.class);
  }

  public static final int EMOTION_LEVEL_FIELD_NUMBER = 1;
  private int emotionLevel_;
  /**
   * <code>.POGOProtos.Enums.BuddyEmotionLevel emotion_level = 1;</code>
   * @return The enum numeric value on the wire for emotionLevel.
   */
  @java.lang.Override public int getEmotionLevelValue() {
    return emotionLevel_;
  }
  /**
   * <code>.POGOProtos.Enums.BuddyEmotionLevel emotion_level = 1;</code>
   * @return The emotionLevel.
   */
  @java.lang.Override public POGOProtos.Enums.BuddyEmotionLevel getEmotionLevel() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.BuddyEmotionLevel result = POGOProtos.Enums.BuddyEmotionLevel.valueOf(emotionLevel_);
    return result == null ? POGOProtos.Enums.BuddyEmotionLevel.UNRECOGNIZED : result;
  }

  public static final int MIN_EMOTION_POINTS_REQUIRED_FIELD_NUMBER = 2;
  private int minEmotionPointsRequired_;
  /**
   * <code>int32 min_emotion_points_required = 2;</code>
   * @return The minEmotionPointsRequired.
   */
  @java.lang.Override
  public int getMinEmotionPointsRequired() {
    return minEmotionPointsRequired_;
  }

  public static final int EMOTION_ANIMATION_FIELD_NUMBER = 3;
  private int emotionAnimation_;
  /**
   * <code>.POGOProtos.Enums.BuddyAnimation emotion_animation = 3;</code>
   * @return The enum numeric value on the wire for emotionAnimation.
   */
  @java.lang.Override public int getEmotionAnimationValue() {
    return emotionAnimation_;
  }
  /**
   * <code>.POGOProtos.Enums.BuddyAnimation emotion_animation = 3;</code>
   * @return The emotionAnimation.
   */
  @java.lang.Override public POGOProtos.Enums.BuddyAnimation getEmotionAnimation() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.BuddyAnimation result = POGOProtos.Enums.BuddyAnimation.valueOf(emotionAnimation_);
    return result == null ? POGOProtos.Enums.BuddyAnimation.UNRECOGNIZED : result;
  }

  public static final int DECAY_PREVENTION_DURATION_MS_FIELD_NUMBER = 4;
  private long decayPreventionDurationMs_;
  /**
   * <code>int64 decay_prevention_duration_ms = 4;</code>
   * @return The decayPreventionDurationMs.
   */
  @java.lang.Override
  public long getDecayPreventionDurationMs() {
    return decayPreventionDurationMs_;
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
    if (emotionLevel_ != POGOProtos.Enums.BuddyEmotionLevel.BUDDY_EMOTION_LEVEL_UNSET.getNumber()) {
      output.writeEnum(1, emotionLevel_);
    }
    if (minEmotionPointsRequired_ != 0) {
      output.writeInt32(2, minEmotionPointsRequired_);
    }
    if (emotionAnimation_ != POGOProtos.Enums.BuddyAnimation.BUDDY_ANIMATION_UNSET.getNumber()) {
      output.writeEnum(3, emotionAnimation_);
    }
    if (decayPreventionDurationMs_ != 0L) {
      output.writeInt64(4, decayPreventionDurationMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (emotionLevel_ != POGOProtos.Enums.BuddyEmotionLevel.BUDDY_EMOTION_LEVEL_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, emotionLevel_);
    }
    if (minEmotionPointsRequired_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minEmotionPointsRequired_);
    }
    if (emotionAnimation_ != POGOProtos.Enums.BuddyAnimation.BUDDY_ANIMATION_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, emotionAnimation_);
    }
    if (decayPreventionDurationMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, decayPreventionDurationMs_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.BuddyEmotionLevelSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.BuddyEmotionLevelSettings other = (POGOProtos.Settings.Master.BuddyEmotionLevelSettings) obj;

    if (emotionLevel_ != other.emotionLevel_) return false;
    if (getMinEmotionPointsRequired()
        != other.getMinEmotionPointsRequired()) return false;
    if (emotionAnimation_ != other.emotionAnimation_) return false;
    if (getDecayPreventionDurationMs()
        != other.getDecayPreventionDurationMs()) return false;
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
    hash = (37 * hash) + EMOTION_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + emotionLevel_;
    hash = (37 * hash) + MIN_EMOTION_POINTS_REQUIRED_FIELD_NUMBER;
    hash = (53 * hash) + getMinEmotionPointsRequired();
    hash = (37 * hash) + EMOTION_ANIMATION_FIELD_NUMBER;
    hash = (53 * hash) + emotionAnimation_;
    hash = (37 * hash) + DECAY_PREVENTION_DURATION_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDecayPreventionDurationMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.BuddyEmotionLevelSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.BuddyEmotionLevelSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.BuddyEmotionLevelSettings)
      POGOProtos.Settings.Master.BuddyEmotionLevelSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.BuddyEmotionLevelSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.BuddyEmotionLevelSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.BuddyEmotionLevelSettings.class, POGOProtos.Settings.Master.BuddyEmotionLevelSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.BuddyEmotionLevelSettings.newBuilder()
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
      emotionLevel_ = 0;

      minEmotionPointsRequired_ = 0;

      emotionAnimation_ = 0;

      decayPreventionDurationMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.BuddyEmotionLevelSettingsOuterClass.internal_static_POGOProtos_Settings_Master_BuddyEmotionLevelSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.BuddyEmotionLevelSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.BuddyEmotionLevelSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.BuddyEmotionLevelSettings build() {
      POGOProtos.Settings.Master.BuddyEmotionLevelSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.BuddyEmotionLevelSettings buildPartial() {
      POGOProtos.Settings.Master.BuddyEmotionLevelSettings result = new POGOProtos.Settings.Master.BuddyEmotionLevelSettings(this);
      result.emotionLevel_ = emotionLevel_;
      result.minEmotionPointsRequired_ = minEmotionPointsRequired_;
      result.emotionAnimation_ = emotionAnimation_;
      result.decayPreventionDurationMs_ = decayPreventionDurationMs_;
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
      if (other instanceof POGOProtos.Settings.Master.BuddyEmotionLevelSettings) {
        return mergeFrom((POGOProtos.Settings.Master.BuddyEmotionLevelSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.BuddyEmotionLevelSettings other) {
      if (other == POGOProtos.Settings.Master.BuddyEmotionLevelSettings.getDefaultInstance()) return this;
      if (other.emotionLevel_ != 0) {
        setEmotionLevelValue(other.getEmotionLevelValue());
      }
      if (other.getMinEmotionPointsRequired() != 0) {
        setMinEmotionPointsRequired(other.getMinEmotionPointsRequired());
      }
      if (other.emotionAnimation_ != 0) {
        setEmotionAnimationValue(other.getEmotionAnimationValue());
      }
      if (other.getDecayPreventionDurationMs() != 0L) {
        setDecayPreventionDurationMs(other.getDecayPreventionDurationMs());
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
      POGOProtos.Settings.Master.BuddyEmotionLevelSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.BuddyEmotionLevelSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int emotionLevel_ = 0;
    /**
     * <code>.POGOProtos.Enums.BuddyEmotionLevel emotion_level = 1;</code>
     * @return The enum numeric value on the wire for emotionLevel.
     */
    @java.lang.Override public int getEmotionLevelValue() {
      return emotionLevel_;
    }
    /**
     * <code>.POGOProtos.Enums.BuddyEmotionLevel emotion_level = 1;</code>
     * @param value The enum numeric value on the wire for emotionLevel to set.
     * @return This builder for chaining.
     */
    public Builder setEmotionLevelValue(int value) {
      
      emotionLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.BuddyEmotionLevel emotion_level = 1;</code>
     * @return The emotionLevel.
     */
    @java.lang.Override
    public POGOProtos.Enums.BuddyEmotionLevel getEmotionLevel() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.BuddyEmotionLevel result = POGOProtos.Enums.BuddyEmotionLevel.valueOf(emotionLevel_);
      return result == null ? POGOProtos.Enums.BuddyEmotionLevel.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.BuddyEmotionLevel emotion_level = 1;</code>
     * @param value The emotionLevel to set.
     * @return This builder for chaining.
     */
    public Builder setEmotionLevel(POGOProtos.Enums.BuddyEmotionLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      emotionLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.BuddyEmotionLevel emotion_level = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmotionLevel() {
      
      emotionLevel_ = 0;
      onChanged();
      return this;
    }

    private int minEmotionPointsRequired_ ;
    /**
     * <code>int32 min_emotion_points_required = 2;</code>
     * @return The minEmotionPointsRequired.
     */
    @java.lang.Override
    public int getMinEmotionPointsRequired() {
      return minEmotionPointsRequired_;
    }
    /**
     * <code>int32 min_emotion_points_required = 2;</code>
     * @param value The minEmotionPointsRequired to set.
     * @return This builder for chaining.
     */
    public Builder setMinEmotionPointsRequired(int value) {
      
      minEmotionPointsRequired_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 min_emotion_points_required = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinEmotionPointsRequired() {
      
      minEmotionPointsRequired_ = 0;
      onChanged();
      return this;
    }

    private int emotionAnimation_ = 0;
    /**
     * <code>.POGOProtos.Enums.BuddyAnimation emotion_animation = 3;</code>
     * @return The enum numeric value on the wire for emotionAnimation.
     */
    @java.lang.Override public int getEmotionAnimationValue() {
      return emotionAnimation_;
    }
    /**
     * <code>.POGOProtos.Enums.BuddyAnimation emotion_animation = 3;</code>
     * @param value The enum numeric value on the wire for emotionAnimation to set.
     * @return This builder for chaining.
     */
    public Builder setEmotionAnimationValue(int value) {
      
      emotionAnimation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.BuddyAnimation emotion_animation = 3;</code>
     * @return The emotionAnimation.
     */
    @java.lang.Override
    public POGOProtos.Enums.BuddyAnimation getEmotionAnimation() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.BuddyAnimation result = POGOProtos.Enums.BuddyAnimation.valueOf(emotionAnimation_);
      return result == null ? POGOProtos.Enums.BuddyAnimation.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.BuddyAnimation emotion_animation = 3;</code>
     * @param value The emotionAnimation to set.
     * @return This builder for chaining.
     */
    public Builder setEmotionAnimation(POGOProtos.Enums.BuddyAnimation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      emotionAnimation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.BuddyAnimation emotion_animation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmotionAnimation() {
      
      emotionAnimation_ = 0;
      onChanged();
      return this;
    }

    private long decayPreventionDurationMs_ ;
    /**
     * <code>int64 decay_prevention_duration_ms = 4;</code>
     * @return The decayPreventionDurationMs.
     */
    @java.lang.Override
    public long getDecayPreventionDurationMs() {
      return decayPreventionDurationMs_;
    }
    /**
     * <code>int64 decay_prevention_duration_ms = 4;</code>
     * @param value The decayPreventionDurationMs to set.
     * @return This builder for chaining.
     */
    public Builder setDecayPreventionDurationMs(long value) {
      
      decayPreventionDurationMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 decay_prevention_duration_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDecayPreventionDurationMs() {
      
      decayPreventionDurationMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.BuddyEmotionLevelSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.BuddyEmotionLevelSettings)
  private static final POGOProtos.Settings.Master.BuddyEmotionLevelSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.BuddyEmotionLevelSettings();
  }

  public static POGOProtos.Settings.Master.BuddyEmotionLevelSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuddyEmotionLevelSettings>
      PARSER = new com.google.protobuf.AbstractParser<BuddyEmotionLevelSettings>() {
    @java.lang.Override
    public BuddyEmotionLevelSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuddyEmotionLevelSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuddyEmotionLevelSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuddyEmotionLevelSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.BuddyEmotionLevelSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

