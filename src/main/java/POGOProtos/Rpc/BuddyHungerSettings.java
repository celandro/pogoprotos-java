// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BuddyHungerSettings}
 */
public final class BuddyHungerSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BuddyHungerSettings)
    BuddyHungerSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuddyHungerSettings.newBuilder() to construct.
  private BuddyHungerSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuddyHungerSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuddyHungerSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuddyHungerSettings(
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

            numHungerPointsRequiredForFull_ = input.readInt32();
            break;
          }
          case 16: {

            decayPointsPerBucket_ = input.readInt32();
            break;
          }
          case 24: {

            millisecondsPerBucket_ = input.readInt64();
            break;
          }
          case 32: {

            cooldownDurationMs_ = input.readInt64();
            break;
          }
          case 40: {

            decayDurationAfterFullMs_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyHungerSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyHungerSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BuddyHungerSettings.class, POGOProtos.Rpc.BuddyHungerSettings.Builder.class);
  }

  public static final int NUM_HUNGER_POINTS_REQUIRED_FOR_FULL_FIELD_NUMBER = 1;
  private int numHungerPointsRequiredForFull_;
  /**
   * <code>int32 num_hunger_points_required_for_full = 1;</code>
   * @return The numHungerPointsRequiredForFull.
   */
  @java.lang.Override
  public int getNumHungerPointsRequiredForFull() {
    return numHungerPointsRequiredForFull_;
  }

  public static final int DECAY_POINTS_PER_BUCKET_FIELD_NUMBER = 2;
  private int decayPointsPerBucket_;
  /**
   * <code>int32 decay_points_per_bucket = 2;</code>
   * @return The decayPointsPerBucket.
   */
  @java.lang.Override
  public int getDecayPointsPerBucket() {
    return decayPointsPerBucket_;
  }

  public static final int MILLISECONDS_PER_BUCKET_FIELD_NUMBER = 3;
  private long millisecondsPerBucket_;
  /**
   * <code>int64 milliseconds_per_bucket = 3;</code>
   * @return The millisecondsPerBucket.
   */
  @java.lang.Override
  public long getMillisecondsPerBucket() {
    return millisecondsPerBucket_;
  }

  public static final int COOLDOWN_DURATION_MS_FIELD_NUMBER = 4;
  private long cooldownDurationMs_;
  /**
   * <code>int64 cooldown_duration_ms = 4;</code>
   * @return The cooldownDurationMs.
   */
  @java.lang.Override
  public long getCooldownDurationMs() {
    return cooldownDurationMs_;
  }

  public static final int DECAY_DURATION_AFTER_FULL_MS_FIELD_NUMBER = 5;
  private long decayDurationAfterFullMs_;
  /**
   * <code>int64 decay_duration_after_full_ms = 5;</code>
   * @return The decayDurationAfterFullMs.
   */
  @java.lang.Override
  public long getDecayDurationAfterFullMs() {
    return decayDurationAfterFullMs_;
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
    if (numHungerPointsRequiredForFull_ != 0) {
      output.writeInt32(1, numHungerPointsRequiredForFull_);
    }
    if (decayPointsPerBucket_ != 0) {
      output.writeInt32(2, decayPointsPerBucket_);
    }
    if (millisecondsPerBucket_ != 0L) {
      output.writeInt64(3, millisecondsPerBucket_);
    }
    if (cooldownDurationMs_ != 0L) {
      output.writeInt64(4, cooldownDurationMs_);
    }
    if (decayDurationAfterFullMs_ != 0L) {
      output.writeInt64(5, decayDurationAfterFullMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numHungerPointsRequiredForFull_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numHungerPointsRequiredForFull_);
    }
    if (decayPointsPerBucket_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, decayPointsPerBucket_);
    }
    if (millisecondsPerBucket_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, millisecondsPerBucket_);
    }
    if (cooldownDurationMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, cooldownDurationMs_);
    }
    if (decayDurationAfterFullMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, decayDurationAfterFullMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.BuddyHungerSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BuddyHungerSettings other = (POGOProtos.Rpc.BuddyHungerSettings) obj;

    if (getNumHungerPointsRequiredForFull()
        != other.getNumHungerPointsRequiredForFull()) return false;
    if (getDecayPointsPerBucket()
        != other.getDecayPointsPerBucket()) return false;
    if (getMillisecondsPerBucket()
        != other.getMillisecondsPerBucket()) return false;
    if (getCooldownDurationMs()
        != other.getCooldownDurationMs()) return false;
    if (getDecayDurationAfterFullMs()
        != other.getDecayDurationAfterFullMs()) return false;
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
    hash = (37 * hash) + NUM_HUNGER_POINTS_REQUIRED_FOR_FULL_FIELD_NUMBER;
    hash = (53 * hash) + getNumHungerPointsRequiredForFull();
    hash = (37 * hash) + DECAY_POINTS_PER_BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getDecayPointsPerBucket();
    hash = (37 * hash) + MILLISECONDS_PER_BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMillisecondsPerBucket());
    hash = (37 * hash) + COOLDOWN_DURATION_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCooldownDurationMs());
    hash = (37 * hash) + DECAY_DURATION_AFTER_FULL_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDecayDurationAfterFullMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyHungerSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BuddyHungerSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BuddyHungerSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BuddyHungerSettings)
      POGOProtos.Rpc.BuddyHungerSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyHungerSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyHungerSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BuddyHungerSettings.class, POGOProtos.Rpc.BuddyHungerSettings.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BuddyHungerSettings.newBuilder()
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
      numHungerPointsRequiredForFull_ = 0;

      decayPointsPerBucket_ = 0;

      millisecondsPerBucket_ = 0L;

      cooldownDurationMs_ = 0L;

      decayDurationAfterFullMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BuddyHungerSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyHungerSettings getDefaultInstanceForType() {
      return POGOProtos.Rpc.BuddyHungerSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyHungerSettings build() {
      POGOProtos.Rpc.BuddyHungerSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyHungerSettings buildPartial() {
      POGOProtos.Rpc.BuddyHungerSettings result = new POGOProtos.Rpc.BuddyHungerSettings(this);
      result.numHungerPointsRequiredForFull_ = numHungerPointsRequiredForFull_;
      result.decayPointsPerBucket_ = decayPointsPerBucket_;
      result.millisecondsPerBucket_ = millisecondsPerBucket_;
      result.cooldownDurationMs_ = cooldownDurationMs_;
      result.decayDurationAfterFullMs_ = decayDurationAfterFullMs_;
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
      if (other instanceof POGOProtos.Rpc.BuddyHungerSettings) {
        return mergeFrom((POGOProtos.Rpc.BuddyHungerSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BuddyHungerSettings other) {
      if (other == POGOProtos.Rpc.BuddyHungerSettings.getDefaultInstance()) return this;
      if (other.getNumHungerPointsRequiredForFull() != 0) {
        setNumHungerPointsRequiredForFull(other.getNumHungerPointsRequiredForFull());
      }
      if (other.getDecayPointsPerBucket() != 0) {
        setDecayPointsPerBucket(other.getDecayPointsPerBucket());
      }
      if (other.getMillisecondsPerBucket() != 0L) {
        setMillisecondsPerBucket(other.getMillisecondsPerBucket());
      }
      if (other.getCooldownDurationMs() != 0L) {
        setCooldownDurationMs(other.getCooldownDurationMs());
      }
      if (other.getDecayDurationAfterFullMs() != 0L) {
        setDecayDurationAfterFullMs(other.getDecayDurationAfterFullMs());
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
      POGOProtos.Rpc.BuddyHungerSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BuddyHungerSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int numHungerPointsRequiredForFull_ ;
    /**
     * <code>int32 num_hunger_points_required_for_full = 1;</code>
     * @return The numHungerPointsRequiredForFull.
     */
    @java.lang.Override
    public int getNumHungerPointsRequiredForFull() {
      return numHungerPointsRequiredForFull_;
    }
    /**
     * <code>int32 num_hunger_points_required_for_full = 1;</code>
     * @param value The numHungerPointsRequiredForFull to set.
     * @return This builder for chaining.
     */
    public Builder setNumHungerPointsRequiredForFull(int value) {
      
      numHungerPointsRequiredForFull_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_hunger_points_required_for_full = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumHungerPointsRequiredForFull() {
      
      numHungerPointsRequiredForFull_ = 0;
      onChanged();
      return this;
    }

    private int decayPointsPerBucket_ ;
    /**
     * <code>int32 decay_points_per_bucket = 2;</code>
     * @return The decayPointsPerBucket.
     */
    @java.lang.Override
    public int getDecayPointsPerBucket() {
      return decayPointsPerBucket_;
    }
    /**
     * <code>int32 decay_points_per_bucket = 2;</code>
     * @param value The decayPointsPerBucket to set.
     * @return This builder for chaining.
     */
    public Builder setDecayPointsPerBucket(int value) {
      
      decayPointsPerBucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 decay_points_per_bucket = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDecayPointsPerBucket() {
      
      decayPointsPerBucket_ = 0;
      onChanged();
      return this;
    }

    private long millisecondsPerBucket_ ;
    /**
     * <code>int64 milliseconds_per_bucket = 3;</code>
     * @return The millisecondsPerBucket.
     */
    @java.lang.Override
    public long getMillisecondsPerBucket() {
      return millisecondsPerBucket_;
    }
    /**
     * <code>int64 milliseconds_per_bucket = 3;</code>
     * @param value The millisecondsPerBucket to set.
     * @return This builder for chaining.
     */
    public Builder setMillisecondsPerBucket(long value) {
      
      millisecondsPerBucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 milliseconds_per_bucket = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMillisecondsPerBucket() {
      
      millisecondsPerBucket_ = 0L;
      onChanged();
      return this;
    }

    private long cooldownDurationMs_ ;
    /**
     * <code>int64 cooldown_duration_ms = 4;</code>
     * @return The cooldownDurationMs.
     */
    @java.lang.Override
    public long getCooldownDurationMs() {
      return cooldownDurationMs_;
    }
    /**
     * <code>int64 cooldown_duration_ms = 4;</code>
     * @param value The cooldownDurationMs to set.
     * @return This builder for chaining.
     */
    public Builder setCooldownDurationMs(long value) {
      
      cooldownDurationMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 cooldown_duration_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCooldownDurationMs() {
      
      cooldownDurationMs_ = 0L;
      onChanged();
      return this;
    }

    private long decayDurationAfterFullMs_ ;
    /**
     * <code>int64 decay_duration_after_full_ms = 5;</code>
     * @return The decayDurationAfterFullMs.
     */
    @java.lang.Override
    public long getDecayDurationAfterFullMs() {
      return decayDurationAfterFullMs_;
    }
    /**
     * <code>int64 decay_duration_after_full_ms = 5;</code>
     * @param value The decayDurationAfterFullMs to set.
     * @return This builder for chaining.
     */
    public Builder setDecayDurationAfterFullMs(long value) {
      
      decayDurationAfterFullMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 decay_duration_after_full_ms = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDecayDurationAfterFullMs() {
      
      decayDurationAfterFullMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BuddyHungerSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BuddyHungerSettings)
  private static final POGOProtos.Rpc.BuddyHungerSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BuddyHungerSettings();
  }

  public static POGOProtos.Rpc.BuddyHungerSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuddyHungerSettings>
      PARSER = new com.google.protobuf.AbstractParser<BuddyHungerSettings>() {
    @java.lang.Override
    public BuddyHungerSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuddyHungerSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuddyHungerSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuddyHungerSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BuddyHungerSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

