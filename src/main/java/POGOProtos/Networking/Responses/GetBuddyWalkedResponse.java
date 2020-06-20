// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetBuddyWalkedResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.GetBuddyWalkedResponse}
 */
public  final class GetBuddyWalkedResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.GetBuddyWalkedResponse)
    GetBuddyWalkedResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBuddyWalkedResponse.newBuilder() to construct.
  private GetBuddyWalkedResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBuddyWalkedResponse() {
    familyCandyId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBuddyWalkedResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetBuddyWalkedResponse(
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
    return POGOProtos.Networking.Responses.GetBuddyWalkedResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetBuddyWalkedResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.GetBuddyWalkedResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetBuddyWalkedResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.GetBuddyWalkedResponse.class, POGOProtos.Networking.Responses.GetBuddyWalkedResponse.Builder.class);
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
   * <code>.POGOProtos.Enums.PokemonFamilyId family_candy_id = 2;</code>
   * @return The enum numeric value on the wire for familyCandyId.
   */
  public int getFamilyCandyIdValue() {
    return familyCandyId_;
  }
  /**
   * <code>.POGOProtos.Enums.PokemonFamilyId family_candy_id = 2;</code>
   * @return The familyCandyId.
   */
  public POGOProtos.Enums.PokemonFamilyId getFamilyCandyId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.PokemonFamilyId result = POGOProtos.Enums.PokemonFamilyId.valueOf(familyCandyId_);
    return result == null ? POGOProtos.Enums.PokemonFamilyId.UNRECOGNIZED : result;
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
    if (familyCandyId_ != POGOProtos.Enums.PokemonFamilyId.FAMILY_UNSET.getNumber()) {
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
    if (familyCandyId_ != POGOProtos.Enums.PokemonFamilyId.FAMILY_UNSET.getNumber()) {
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
    if (!(obj instanceof POGOProtos.Networking.Responses.GetBuddyWalkedResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.GetBuddyWalkedResponse other = (POGOProtos.Networking.Responses.GetBuddyWalkedResponse) obj;

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

  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.GetBuddyWalkedResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.GetBuddyWalkedResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.GetBuddyWalkedResponse)
      POGOProtos.Networking.Responses.GetBuddyWalkedResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.GetBuddyWalkedResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetBuddyWalkedResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.GetBuddyWalkedResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetBuddyWalkedResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.GetBuddyWalkedResponse.class, POGOProtos.Networking.Responses.GetBuddyWalkedResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.GetBuddyWalkedResponse.newBuilder()
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
      return POGOProtos.Networking.Responses.GetBuddyWalkedResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetBuddyWalkedResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.GetBuddyWalkedResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.GetBuddyWalkedResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.GetBuddyWalkedResponse build() {
      POGOProtos.Networking.Responses.GetBuddyWalkedResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.GetBuddyWalkedResponse buildPartial() {
      POGOProtos.Networking.Responses.GetBuddyWalkedResponse result = new POGOProtos.Networking.Responses.GetBuddyWalkedResponse(this);
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
      if (other instanceof POGOProtos.Networking.Responses.GetBuddyWalkedResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.GetBuddyWalkedResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.GetBuddyWalkedResponse other) {
      if (other == POGOProtos.Networking.Responses.GetBuddyWalkedResponse.getDefaultInstance()) return this;
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
      POGOProtos.Networking.Responses.GetBuddyWalkedResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.GetBuddyWalkedResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Enums.PokemonFamilyId family_candy_id = 2;</code>
     * @return The enum numeric value on the wire for familyCandyId.
     */
    public int getFamilyCandyIdValue() {
      return familyCandyId_;
    }
    /**
     * <code>.POGOProtos.Enums.PokemonFamilyId family_candy_id = 2;</code>
     * @param value The enum numeric value on the wire for familyCandyId to set.
     * @return This builder for chaining.
     */
    public Builder setFamilyCandyIdValue(int value) {
      familyCandyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.PokemonFamilyId family_candy_id = 2;</code>
     * @return The familyCandyId.
     */
    public POGOProtos.Enums.PokemonFamilyId getFamilyCandyId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.PokemonFamilyId result = POGOProtos.Enums.PokemonFamilyId.valueOf(familyCandyId_);
      return result == null ? POGOProtos.Enums.PokemonFamilyId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.PokemonFamilyId family_candy_id = 2;</code>
     * @param value The familyCandyId to set.
     * @return This builder for chaining.
     */
    public Builder setFamilyCandyId(POGOProtos.Enums.PokemonFamilyId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      familyCandyId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.PokemonFamilyId family_candy_id = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.GetBuddyWalkedResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.GetBuddyWalkedResponse)
  private static final POGOProtos.Networking.Responses.GetBuddyWalkedResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.GetBuddyWalkedResponse();
  }

  public static POGOProtos.Networking.Responses.GetBuddyWalkedResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBuddyWalkedResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBuddyWalkedResponse>() {
    @java.lang.Override
    public GetBuddyWalkedResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetBuddyWalkedResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetBuddyWalkedResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBuddyWalkedResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.GetBuddyWalkedResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

