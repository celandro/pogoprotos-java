// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FitnessRewardsLogEntry}
 */
public  final class FitnessRewardsLogEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FitnessRewardsLogEntry)
    FitnessRewardsLogEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FitnessRewardsLogEntry.newBuilder() to construct.
  private FitnessRewardsLogEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FitnessRewardsLogEntry() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FitnessRewardsLogEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FitnessRewardsLogEntry(
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

            result_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.LootProto.Builder subBuilder = null;
            if (rewards_ != null) {
              subBuilder = rewards_.toBuilder();
            }
            rewards_ = input.readMessage(POGOProtos.Rpc.LootProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rewards_);
              rewards_ = subBuilder.buildPartial();
            }

            break;
          }
          case 25: {

            distanceWalkedKm_ = input.readDouble();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FitnessRewardsLogEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FitnessRewardsLogEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FitnessRewardsLogEntry.class, POGOProtos.Rpc.FitnessRewardsLogEntry.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.FitnessRewardsLogEntry.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.FitnessRewardsLogEntry.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FitnessRewardsLogEntry.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.FitnessRewardsLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.FitnessRewardsLogEntry.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Rpc.FitnessRewardsLogEntry.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FitnessRewardsLogEntry.Result result = POGOProtos.Rpc.FitnessRewardsLogEntry.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.FitnessRewardsLogEntry.Result.UNRECOGNIZED : result;
  }

  public static final int REWARDS_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.LootProto rewards_;
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   * @return Whether the rewards field is set.
   */
  public boolean hasRewards() {
    return rewards_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   * @return The rewards.
   */
  public POGOProtos.Rpc.LootProto getRewards() {
    return rewards_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : rewards_;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   */
  public POGOProtos.Rpc.LootProtoOrBuilder getRewardsOrBuilder() {
    return getRewards();
  }

  public static final int DISTANCE_WALKED_KM_FIELD_NUMBER = 3;
  private double distanceWalkedKm_;
  /**
   * <code>double distance_walked_km = 3;</code>
   * @return The distanceWalkedKm.
   */
  public double getDistanceWalkedKm() {
    return distanceWalkedKm_;
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
    if (result_ != POGOProtos.Rpc.FitnessRewardsLogEntry.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (rewards_ != null) {
      output.writeMessage(2, getRewards());
    }
    if (distanceWalkedKm_ != 0D) {
      output.writeDouble(3, distanceWalkedKm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.FitnessRewardsLogEntry.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (rewards_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRewards());
    }
    if (distanceWalkedKm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, distanceWalkedKm_);
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
    if (!(obj instanceof POGOProtos.Rpc.FitnessRewardsLogEntry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FitnessRewardsLogEntry other = (POGOProtos.Rpc.FitnessRewardsLogEntry) obj;

    if (result_ != other.result_) return false;
    if (hasRewards() != other.hasRewards()) return false;
    if (hasRewards()) {
      if (!getRewards()
          .equals(other.getRewards())) return false;
    }
    if (java.lang.Double.doubleToLongBits(getDistanceWalkedKm())
        != java.lang.Double.doubleToLongBits(
            other.getDistanceWalkedKm())) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (hasRewards()) {
      hash = (37 * hash) + REWARDS_FIELD_NUMBER;
      hash = (53 * hash) + getRewards().hashCode();
    }
    hash = (37 * hash) + DISTANCE_WALKED_KM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDistanceWalkedKm()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FitnessRewardsLogEntry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FitnessRewardsLogEntry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FitnessRewardsLogEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FitnessRewardsLogEntry)
      POGOProtos.Rpc.FitnessRewardsLogEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FitnessRewardsLogEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FitnessRewardsLogEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FitnessRewardsLogEntry.class, POGOProtos.Rpc.FitnessRewardsLogEntry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FitnessRewardsLogEntry.newBuilder()
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
      result_ = 0;

      if (rewardsBuilder_ == null) {
        rewards_ = null;
      } else {
        rewards_ = null;
        rewardsBuilder_ = null;
      }
      distanceWalkedKm_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FitnessRewardsLogEntry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FitnessRewardsLogEntry getDefaultInstanceForType() {
      return POGOProtos.Rpc.FitnessRewardsLogEntry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FitnessRewardsLogEntry build() {
      POGOProtos.Rpc.FitnessRewardsLogEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FitnessRewardsLogEntry buildPartial() {
      POGOProtos.Rpc.FitnessRewardsLogEntry result = new POGOProtos.Rpc.FitnessRewardsLogEntry(this);
      result.result_ = result_;
      if (rewardsBuilder_ == null) {
        result.rewards_ = rewards_;
      } else {
        result.rewards_ = rewardsBuilder_.build();
      }
      result.distanceWalkedKm_ = distanceWalkedKm_;
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
      if (other instanceof POGOProtos.Rpc.FitnessRewardsLogEntry) {
        return mergeFrom((POGOProtos.Rpc.FitnessRewardsLogEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FitnessRewardsLogEntry other) {
      if (other == POGOProtos.Rpc.FitnessRewardsLogEntry.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasRewards()) {
        mergeRewards(other.getRewards());
      }
      if (other.getDistanceWalkedKm() != 0D) {
        setDistanceWalkedKm(other.getDistanceWalkedKm());
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
      POGOProtos.Rpc.FitnessRewardsLogEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FitnessRewardsLogEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FitnessRewardsLogEntry.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.FitnessRewardsLogEntry.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FitnessRewardsLogEntry.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Rpc.FitnessRewardsLogEntry.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FitnessRewardsLogEntry.Result result = POGOProtos.Rpc.FitnessRewardsLogEntry.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.FitnessRewardsLogEntry.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FitnessRewardsLogEntry.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.FitnessRewardsLogEntry.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FitnessRewardsLogEntry.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.LootProto rewards_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> rewardsBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     * @return Whether the rewards field is set.
     */
    public boolean hasRewards() {
      return rewardsBuilder_ != null || rewards_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     * @return The rewards.
     */
    public POGOProtos.Rpc.LootProto getRewards() {
      if (rewardsBuilder_ == null) {
        return rewards_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : rewards_;
      } else {
        return rewardsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public Builder setRewards(POGOProtos.Rpc.LootProto value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rewards_ = value;
        onChanged();
      } else {
        rewardsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public Builder setRewards(
        POGOProtos.Rpc.LootProto.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        rewards_ = builderForValue.build();
        onChanged();
      } else {
        rewardsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public Builder mergeRewards(POGOProtos.Rpc.LootProto value) {
      if (rewardsBuilder_ == null) {
        if (rewards_ != null) {
          rewards_ =
            POGOProtos.Rpc.LootProto.newBuilder(rewards_).mergeFrom(value).buildPartial();
        } else {
          rewards_ = value;
        }
        onChanged();
      } else {
        rewardsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public Builder clearRewards() {
      if (rewardsBuilder_ == null) {
        rewards_ = null;
        onChanged();
      } else {
        rewards_ = null;
        rewardsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public POGOProtos.Rpc.LootProto.Builder getRewardsBuilder() {
      
      onChanged();
      return getRewardsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    public POGOProtos.Rpc.LootProtoOrBuilder getRewardsOrBuilder() {
      if (rewardsBuilder_ != null) {
        return rewardsBuilder_.getMessageOrBuilder();
      } else {
        return rewards_ == null ?
            POGOProtos.Rpc.LootProto.getDefaultInstance() : rewards_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> 
        getRewardsFieldBuilder() {
      if (rewardsBuilder_ == null) {
        rewardsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder>(
                getRewards(),
                getParentForChildren(),
                isClean());
        rewards_ = null;
      }
      return rewardsBuilder_;
    }

    private double distanceWalkedKm_ ;
    /**
     * <code>double distance_walked_km = 3;</code>
     * @return The distanceWalkedKm.
     */
    public double getDistanceWalkedKm() {
      return distanceWalkedKm_;
    }
    /**
     * <code>double distance_walked_km = 3;</code>
     * @param value The distanceWalkedKm to set.
     * @return This builder for chaining.
     */
    public Builder setDistanceWalkedKm(double value) {
      
      distanceWalkedKm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double distance_walked_km = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDistanceWalkedKm() {
      
      distanceWalkedKm_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FitnessRewardsLogEntry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FitnessRewardsLogEntry)
  private static final POGOProtos.Rpc.FitnessRewardsLogEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FitnessRewardsLogEntry();
  }

  public static POGOProtos.Rpc.FitnessRewardsLogEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FitnessRewardsLogEntry>
      PARSER = new com.google.protobuf.AbstractParser<FitnessRewardsLogEntry>() {
    @java.lang.Override
    public FitnessRewardsLogEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FitnessRewardsLogEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FitnessRewardsLogEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FitnessRewardsLogEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FitnessRewardsLogEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
