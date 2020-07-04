// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetBuddyWalkedOutProto}
 */
public  final class GetBuddyWalkedOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetBuddyWalkedOutProto)
    GetBuddyWalkedOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBuddyWalkedOutProto.newBuilder() to construct.
  private GetBuddyWalkedOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBuddyWalkedOutProto() {
    familyCandyId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBuddyWalkedOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetBuddyWalkedOutProto(
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

            success_ = input.readBool();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            familyCandyId_ = rawValue;
            break;
          }
          case 24: {

            candyEarnedCount_ = input.readInt32();
            break;
          }
          case 33: {

            kmRemaining_ = input.readDouble();
            break;
          }
          case 41: {

            lastKmAwarded_ = input.readDouble();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetBuddyWalkedOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetBuddyWalkedOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetBuddyWalkedOutProto.class, POGOProtos.Rpc.GetBuddyWalkedOutProto.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int FAMILY_CANDY_ID_FIELD_NUMBER = 2;
  private int familyCandyId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_candy_id = 2;</code>
   * @return The enum numeric value on the wire for familyCandyId.
   */
  public int getFamilyCandyIdValue() {
    return familyCandyId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_candy_id = 2;</code>
   * @return The familyCandyId.
   */
  public POGOProtos.Rpc.HoloPokemonFamilyId getFamilyCandyId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonFamilyId result = POGOProtos.Rpc.HoloPokemonFamilyId.valueOf(familyCandyId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonFamilyId.UNRECOGNIZED : result;
  }

  public static final int CANDY_EARNED_COUNT_FIELD_NUMBER = 3;
  private int candyEarnedCount_;
  /**
   * <code>int32 candy_earned_count = 3;</code>
   * @return The candyEarnedCount.
   */
  public int getCandyEarnedCount() {
    return candyEarnedCount_;
  }

  public static final int KM_REMAINING_FIELD_NUMBER = 4;
  private double kmRemaining_;
  /**
   * <code>double km_remaining = 4;</code>
   * @return The kmRemaining.
   */
  public double getKmRemaining() {
    return kmRemaining_;
  }

  public static final int LAST_KM_AWARDED_FIELD_NUMBER = 5;
  private double lastKmAwarded_;
  /**
   * <code>double last_km_awarded = 5;</code>
   * @return The lastKmAwarded.
   */
  public double getLastKmAwarded() {
    return lastKmAwarded_;
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    if (familyCandyId_ != POGOProtos.Rpc.HoloPokemonFamilyId.HOLO_POKEMON_FAMILY_ID_FAMILY_UNSET.getNumber()) {
      output.writeEnum(2, familyCandyId_);
    }
    if (candyEarnedCount_ != 0) {
      output.writeInt32(3, candyEarnedCount_);
    }
    if (kmRemaining_ != 0D) {
      output.writeDouble(4, kmRemaining_);
    }
    if (lastKmAwarded_ != 0D) {
      output.writeDouble(5, lastKmAwarded_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    if (familyCandyId_ != POGOProtos.Rpc.HoloPokemonFamilyId.HOLO_POKEMON_FAMILY_ID_FAMILY_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, familyCandyId_);
    }
    if (candyEarnedCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, candyEarnedCount_);
    }
    if (kmRemaining_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, kmRemaining_);
    }
    if (lastKmAwarded_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, lastKmAwarded_);
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
    if (!(obj instanceof POGOProtos.Rpc.GetBuddyWalkedOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetBuddyWalkedOutProto other = (POGOProtos.Rpc.GetBuddyWalkedOutProto) obj;

    if (getSuccess()
        != other.getSuccess()) return false;
    if (familyCandyId_ != other.familyCandyId_) return false;
    if (getCandyEarnedCount()
        != other.getCandyEarnedCount()) return false;
    if (java.lang.Double.doubleToLongBits(getKmRemaining())
        != java.lang.Double.doubleToLongBits(
            other.getKmRemaining())) return false;
    if (java.lang.Double.doubleToLongBits(getLastKmAwarded())
        != java.lang.Double.doubleToLongBits(
            other.getLastKmAwarded())) return false;
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (37 * hash) + FAMILY_CANDY_ID_FIELD_NUMBER;
    hash = (53 * hash) + familyCandyId_;
    hash = (37 * hash) + CANDY_EARNED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCandyEarnedCount();
    hash = (37 * hash) + KM_REMAINING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getKmRemaining()));
    hash = (37 * hash) + LAST_KM_AWARDED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLastKmAwarded()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetBuddyWalkedOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetBuddyWalkedOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetBuddyWalkedOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetBuddyWalkedOutProto)
      POGOProtos.Rpc.GetBuddyWalkedOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetBuddyWalkedOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetBuddyWalkedOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetBuddyWalkedOutProto.class, POGOProtos.Rpc.GetBuddyWalkedOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetBuddyWalkedOutProto.newBuilder()
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
      success_ = false;

      familyCandyId_ = 0;

      candyEarnedCount_ = 0;

      kmRemaining_ = 0D;

      lastKmAwarded_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetBuddyWalkedOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetBuddyWalkedOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetBuddyWalkedOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetBuddyWalkedOutProto build() {
      POGOProtos.Rpc.GetBuddyWalkedOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetBuddyWalkedOutProto buildPartial() {
      POGOProtos.Rpc.GetBuddyWalkedOutProto result = new POGOProtos.Rpc.GetBuddyWalkedOutProto(this);
      result.success_ = success_;
      result.familyCandyId_ = familyCandyId_;
      result.candyEarnedCount_ = candyEarnedCount_;
      result.kmRemaining_ = kmRemaining_;
      result.lastKmAwarded_ = lastKmAwarded_;
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
      if (other instanceof POGOProtos.Rpc.GetBuddyWalkedOutProto) {
        return mergeFrom((POGOProtos.Rpc.GetBuddyWalkedOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetBuddyWalkedOutProto other) {
      if (other == POGOProtos.Rpc.GetBuddyWalkedOutProto.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (other.familyCandyId_ != 0) {
        setFamilyCandyIdValue(other.getFamilyCandyIdValue());
      }
      if (other.getCandyEarnedCount() != 0) {
        setCandyEarnedCount(other.getCandyEarnedCount());
      }
      if (other.getKmRemaining() != 0D) {
        setKmRemaining(other.getKmRemaining());
      }
      if (other.getLastKmAwarded() != 0D) {
        setLastKmAwarded(other.getLastKmAwarded());
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
      POGOProtos.Rpc.GetBuddyWalkedOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetBuddyWalkedOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean success_ ;
    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private int familyCandyId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_candy_id = 2;</code>
     * @return The enum numeric value on the wire for familyCandyId.
     */
    public int getFamilyCandyIdValue() {
      return familyCandyId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_candy_id = 2;</code>
     * @param value The enum numeric value on the wire for familyCandyId to set.
     * @return This builder for chaining.
     */
    public Builder setFamilyCandyIdValue(int value) {
      familyCandyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_candy_id = 2;</code>
     * @return The familyCandyId.
     */
    public POGOProtos.Rpc.HoloPokemonFamilyId getFamilyCandyId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonFamilyId result = POGOProtos.Rpc.HoloPokemonFamilyId.valueOf(familyCandyId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonFamilyId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_candy_id = 2;</code>
     * @param value The familyCandyId to set.
     * @return This builder for chaining.
     */
    public Builder setFamilyCandyId(POGOProtos.Rpc.HoloPokemonFamilyId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      familyCandyId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_candy_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFamilyCandyId() {
      
      familyCandyId_ = 0;
      onChanged();
      return this;
    }

    private int candyEarnedCount_ ;
    /**
     * <code>int32 candy_earned_count = 3;</code>
     * @return The candyEarnedCount.
     */
    public int getCandyEarnedCount() {
      return candyEarnedCount_;
    }
    /**
     * <code>int32 candy_earned_count = 3;</code>
     * @param value The candyEarnedCount to set.
     * @return This builder for chaining.
     */
    public Builder setCandyEarnedCount(int value) {
      
      candyEarnedCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 candy_earned_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCandyEarnedCount() {
      
      candyEarnedCount_ = 0;
      onChanged();
      return this;
    }

    private double kmRemaining_ ;
    /**
     * <code>double km_remaining = 4;</code>
     * @return The kmRemaining.
     */
    public double getKmRemaining() {
      return kmRemaining_;
    }
    /**
     * <code>double km_remaining = 4;</code>
     * @param value The kmRemaining to set.
     * @return This builder for chaining.
     */
    public Builder setKmRemaining(double value) {
      
      kmRemaining_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double km_remaining = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKmRemaining() {
      
      kmRemaining_ = 0D;
      onChanged();
      return this;
    }

    private double lastKmAwarded_ ;
    /**
     * <code>double last_km_awarded = 5;</code>
     * @return The lastKmAwarded.
     */
    public double getLastKmAwarded() {
      return lastKmAwarded_;
    }
    /**
     * <code>double last_km_awarded = 5;</code>
     * @param value The lastKmAwarded to set.
     * @return This builder for chaining.
     */
    public Builder setLastKmAwarded(double value) {
      
      lastKmAwarded_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double last_km_awarded = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastKmAwarded() {
      
      lastKmAwarded_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetBuddyWalkedOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetBuddyWalkedOutProto)
  private static final POGOProtos.Rpc.GetBuddyWalkedOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetBuddyWalkedOutProto();
  }

  public static POGOProtos.Rpc.GetBuddyWalkedOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBuddyWalkedOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GetBuddyWalkedOutProto>() {
    @java.lang.Override
    public GetBuddyWalkedOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetBuddyWalkedOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetBuddyWalkedOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBuddyWalkedOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetBuddyWalkedOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

