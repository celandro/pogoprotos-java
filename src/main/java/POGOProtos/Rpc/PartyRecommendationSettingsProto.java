// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PartyRecommendationSettingsProto}
 */
public final class PartyRecommendationSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PartyRecommendationSettingsProto)
    PartyRecommendationSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartyRecommendationSettingsProto.newBuilder() to construct.
  private PartyRecommendationSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartyRecommendationSettingsProto() {
    mode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PartyRecommendationSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartyRecommendationSettingsProto(
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

            mode_ = rawValue;
            break;
          }
          case 21: {

            variance_ = input.readFloat();
            break;
          }
          case 29: {

            thirdMoveWeight_ = input.readFloat();
            break;
          }
          case 37: {

            megaEvoCombatRatingScale_ = input.readFloat();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PartyRecommendationSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PartyRecommendationSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PartyRecommendationSettingsProto.class, POGOProtos.Rpc.PartyRecommendationSettingsProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode}
   */
  public enum PartyRcommendationMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>PARTY_RECOMMENDATION_MODE_1 = 1;</code>
     */
    PARTY_RECOMMENDATION_MODE_1(1),
    /**
     * <code>PARTY_RECOMMENDATION_MODE_2 = 2;</code>
     */
    PARTY_RECOMMENDATION_MODE_2(2),
    /**
     * <code>PARTY_RECOMMENDATION_MODE_3 = 3;</code>
     */
    PARTY_RECOMMENDATION_MODE_3(3),
    /**
     * <code>PARTY_RECOMMENDATION_MODE_4 = 4;</code>
     */
    PARTY_RECOMMENDATION_MODE_4(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>PARTY_RECOMMENDATION_MODE_1 = 1;</code>
     */
    public static final int PARTY_RECOMMENDATION_MODE_1_VALUE = 1;
    /**
     * <code>PARTY_RECOMMENDATION_MODE_2 = 2;</code>
     */
    public static final int PARTY_RECOMMENDATION_MODE_2_VALUE = 2;
    /**
     * <code>PARTY_RECOMMENDATION_MODE_3 = 3;</code>
     */
    public static final int PARTY_RECOMMENDATION_MODE_3_VALUE = 3;
    /**
     * <code>PARTY_RECOMMENDATION_MODE_4 = 4;</code>
     */
    public static final int PARTY_RECOMMENDATION_MODE_4_VALUE = 4;


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
    public static PartyRcommendationMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PartyRcommendationMode forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return PARTY_RECOMMENDATION_MODE_1;
        case 2: return PARTY_RECOMMENDATION_MODE_2;
        case 3: return PARTY_RECOMMENDATION_MODE_3;
        case 4: return PARTY_RECOMMENDATION_MODE_4;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PartyRcommendationMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PartyRcommendationMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PartyRcommendationMode>() {
            public PartyRcommendationMode findValueByNumber(int number) {
              return PartyRcommendationMode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.PartyRecommendationSettingsProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final PartyRcommendationMode[] VALUES = values();

    public static PartyRcommendationMode valueOf(
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

    private PartyRcommendationMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode)
  }

  public static final int MODE_FIELD_NUMBER = 1;
  private int mode_;
  /**
   * <code>.POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode mode = 1;</code>
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override public int getModeValue() {
    return mode_;
  }
  /**
   * <code>.POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode mode = 1;</code>
   * @return The mode.
   */
  @java.lang.Override public POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode getMode() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode result = POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode.valueOf(mode_);
    return result == null ? POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode.UNRECOGNIZED : result;
  }

  public static final int VARIANCE_FIELD_NUMBER = 2;
  private float variance_;
  /**
   * <code>float variance = 2;</code>
   * @return The variance.
   */
  @java.lang.Override
  public float getVariance() {
    return variance_;
  }

  public static final int THIRD_MOVE_WEIGHT_FIELD_NUMBER = 3;
  private float thirdMoveWeight_;
  /**
   * <code>float third_move_weight = 3;</code>
   * @return The thirdMoveWeight.
   */
  @java.lang.Override
  public float getThirdMoveWeight() {
    return thirdMoveWeight_;
  }

  public static final int MEGA_EVO_COMBAT_RATING_SCALE_FIELD_NUMBER = 4;
  private float megaEvoCombatRatingScale_;
  /**
   * <code>float mega_evo_combat_rating_scale = 4;</code>
   * @return The megaEvoCombatRatingScale.
   */
  @java.lang.Override
  public float getMegaEvoCombatRatingScale() {
    return megaEvoCombatRatingScale_;
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
    if (mode_ != POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode.UNSET.getNumber()) {
      output.writeEnum(1, mode_);
    }
    if (variance_ != 0F) {
      output.writeFloat(2, variance_);
    }
    if (thirdMoveWeight_ != 0F) {
      output.writeFloat(3, thirdMoveWeight_);
    }
    if (megaEvoCombatRatingScale_ != 0F) {
      output.writeFloat(4, megaEvoCombatRatingScale_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mode_ != POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, mode_);
    }
    if (variance_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, variance_);
    }
    if (thirdMoveWeight_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, thirdMoveWeight_);
    }
    if (megaEvoCombatRatingScale_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, megaEvoCombatRatingScale_);
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
    if (!(obj instanceof POGOProtos.Rpc.PartyRecommendationSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PartyRecommendationSettingsProto other = (POGOProtos.Rpc.PartyRecommendationSettingsProto) obj;

    if (mode_ != other.mode_) return false;
    if (java.lang.Float.floatToIntBits(getVariance())
        != java.lang.Float.floatToIntBits(
            other.getVariance())) return false;
    if (java.lang.Float.floatToIntBits(getThirdMoveWeight())
        != java.lang.Float.floatToIntBits(
            other.getThirdMoveWeight())) return false;
    if (java.lang.Float.floatToIntBits(getMegaEvoCombatRatingScale())
        != java.lang.Float.floatToIntBits(
            other.getMegaEvoCombatRatingScale())) return false;
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
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    hash = (37 * hash) + VARIANCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getVariance());
    hash = (37 * hash) + THIRD_MOVE_WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getThirdMoveWeight());
    hash = (37 * hash) + MEGA_EVO_COMBAT_RATING_SCALE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMegaEvoCombatRatingScale());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PartyRecommendationSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PartyRecommendationSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PartyRecommendationSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PartyRecommendationSettingsProto)
      POGOProtos.Rpc.PartyRecommendationSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PartyRecommendationSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PartyRecommendationSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PartyRecommendationSettingsProto.class, POGOProtos.Rpc.PartyRecommendationSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PartyRecommendationSettingsProto.newBuilder()
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
      mode_ = 0;

      variance_ = 0F;

      thirdMoveWeight_ = 0F;

      megaEvoCombatRatingScale_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PartyRecommendationSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PartyRecommendationSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PartyRecommendationSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PartyRecommendationSettingsProto build() {
      POGOProtos.Rpc.PartyRecommendationSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PartyRecommendationSettingsProto buildPartial() {
      POGOProtos.Rpc.PartyRecommendationSettingsProto result = new POGOProtos.Rpc.PartyRecommendationSettingsProto(this);
      result.mode_ = mode_;
      result.variance_ = variance_;
      result.thirdMoveWeight_ = thirdMoveWeight_;
      result.megaEvoCombatRatingScale_ = megaEvoCombatRatingScale_;
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
      if (other instanceof POGOProtos.Rpc.PartyRecommendationSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.PartyRecommendationSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PartyRecommendationSettingsProto other) {
      if (other == POGOProtos.Rpc.PartyRecommendationSettingsProto.getDefaultInstance()) return this;
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
      }
      if (other.getVariance() != 0F) {
        setVariance(other.getVariance());
      }
      if (other.getThirdMoveWeight() != 0F) {
        setThirdMoveWeight(other.getThirdMoveWeight());
      }
      if (other.getMegaEvoCombatRatingScale() != 0F) {
        setMegaEvoCombatRatingScale(other.getMegaEvoCombatRatingScale());
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
      POGOProtos.Rpc.PartyRecommendationSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PartyRecommendationSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int mode_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode mode = 1;</code>
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override public int getModeValue() {
      return mode_;
    }
    /**
     * <code>.POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode mode = 1;</code>
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {
      
      mode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode mode = 1;</code>
     * @return The mode.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode getMode() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode result = POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode.valueOf(mode_);
      return result == null ? POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode mode = 1;</code>
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      
      mode_ = 0;
      onChanged();
      return this;
    }

    private float variance_ ;
    /**
     * <code>float variance = 2;</code>
     * @return The variance.
     */
    @java.lang.Override
    public float getVariance() {
      return variance_;
    }
    /**
     * <code>float variance = 2;</code>
     * @param value The variance to set.
     * @return This builder for chaining.
     */
    public Builder setVariance(float value) {
      
      variance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float variance = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVariance() {
      
      variance_ = 0F;
      onChanged();
      return this;
    }

    private float thirdMoveWeight_ ;
    /**
     * <code>float third_move_weight = 3;</code>
     * @return The thirdMoveWeight.
     */
    @java.lang.Override
    public float getThirdMoveWeight() {
      return thirdMoveWeight_;
    }
    /**
     * <code>float third_move_weight = 3;</code>
     * @param value The thirdMoveWeight to set.
     * @return This builder for chaining.
     */
    public Builder setThirdMoveWeight(float value) {
      
      thirdMoveWeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float third_move_weight = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearThirdMoveWeight() {
      
      thirdMoveWeight_ = 0F;
      onChanged();
      return this;
    }

    private float megaEvoCombatRatingScale_ ;
    /**
     * <code>float mega_evo_combat_rating_scale = 4;</code>
     * @return The megaEvoCombatRatingScale.
     */
    @java.lang.Override
    public float getMegaEvoCombatRatingScale() {
      return megaEvoCombatRatingScale_;
    }
    /**
     * <code>float mega_evo_combat_rating_scale = 4;</code>
     * @param value The megaEvoCombatRatingScale to set.
     * @return This builder for chaining.
     */
    public Builder setMegaEvoCombatRatingScale(float value) {
      
      megaEvoCombatRatingScale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float mega_evo_combat_rating_scale = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMegaEvoCombatRatingScale() {
      
      megaEvoCombatRatingScale_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PartyRecommendationSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PartyRecommendationSettingsProto)
  private static final POGOProtos.Rpc.PartyRecommendationSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PartyRecommendationSettingsProto();
  }

  public static POGOProtos.Rpc.PartyRecommendationSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartyRecommendationSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<PartyRecommendationSettingsProto>() {
    @java.lang.Override
    public PartyRecommendationSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartyRecommendationSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartyRecommendationSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartyRecommendationSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PartyRecommendationSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

