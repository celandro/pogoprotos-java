// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Pokemon/AnimationOverride.proto

package POGOProtos.Settings.Master.Pokemon;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.Pokemon.AnimationOverride}
 */
public final class AnimationOverride extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.Pokemon.AnimationOverride)
    AnimationOverrideOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnimationOverride.newBuilder() to construct.
  private AnimationOverride(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnimationOverride() {
    animation_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnimationOverride();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnimationOverride(
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

            animation_ = rawValue;
            break;
          }
          case 16: {

            blacklist_ = input.readBool();
            break;
          }
          case 29: {

            animMin_ = input.readFloat();
            break;
          }
          case 37: {

            animMax_ = input.readFloat();
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
    return POGOProtos.Settings.Master.Pokemon.AnimationOverrideOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_AnimationOverride_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.Pokemon.AnimationOverrideOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_AnimationOverride_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.Pokemon.AnimationOverride.class, POGOProtos.Settings.Master.Pokemon.AnimationOverride.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim}
   */
  public enum PokemonAnim
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 0;</code>
     */
    NONE(0),
    /**
     * <code>IDLE_01 = 1;</code>
     */
    IDLE_01(1),
    /**
     * <code>IDLE_02 = 2;</code>
     */
    IDLE_02(2),
    /**
     * <code>LAND = 3;</code>
     */
    LAND(3),
    /**
     * <code>ATTACK_01 = 4;</code>
     */
    ATTACK_01(4),
    /**
     * <code>ATTACK_02 = 5;</code>
     */
    ATTACK_02(5),
    /**
     * <code>DAMAGED = 6;</code>
     */
    DAMAGED(6),
    /**
     * <code>STUNNED = 7;</code>
     */
    STUNNED(7),
    /**
     * <code>LOOP = 8;</code>
     */
    LOOP(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <code>IDLE_01 = 1;</code>
     */
    public static final int IDLE_01_VALUE = 1;
    /**
     * <code>IDLE_02 = 2;</code>
     */
    public static final int IDLE_02_VALUE = 2;
    /**
     * <code>LAND = 3;</code>
     */
    public static final int LAND_VALUE = 3;
    /**
     * <code>ATTACK_01 = 4;</code>
     */
    public static final int ATTACK_01_VALUE = 4;
    /**
     * <code>ATTACK_02 = 5;</code>
     */
    public static final int ATTACK_02_VALUE = 5;
    /**
     * <code>DAMAGED = 6;</code>
     */
    public static final int DAMAGED_VALUE = 6;
    /**
     * <code>STUNNED = 7;</code>
     */
    public static final int STUNNED_VALUE = 7;
    /**
     * <code>LOOP = 8;</code>
     */
    public static final int LOOP_VALUE = 8;


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
    public static PokemonAnim valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PokemonAnim forNumber(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return IDLE_01;
        case 2: return IDLE_02;
        case 3: return LAND;
        case 4: return ATTACK_01;
        case 5: return ATTACK_02;
        case 6: return DAMAGED;
        case 7: return STUNNED;
        case 8: return LOOP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PokemonAnim>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PokemonAnim> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PokemonAnim>() {
            public PokemonAnim findValueByNumber(int number) {
              return PokemonAnim.forNumber(number);
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
      return POGOProtos.Settings.Master.Pokemon.AnimationOverride.getDescriptor().getEnumTypes().get(0);
    }

    private static final PokemonAnim[] VALUES = values();

    public static PokemonAnim valueOf(
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

    private PokemonAnim(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim)
  }

  public static final int ANIMATION_FIELD_NUMBER = 1;
  private int animation_;
  /**
   * <code>.POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim animation = 1;</code>
   * @return The enum numeric value on the wire for animation.
   */
  @java.lang.Override public int getAnimationValue() {
    return animation_;
  }
  /**
   * <code>.POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim animation = 1;</code>
   * @return The animation.
   */
  @java.lang.Override public POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim getAnimation() {
    @SuppressWarnings("deprecation")
    POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim result = POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim.valueOf(animation_);
    return result == null ? POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim.UNRECOGNIZED : result;
  }

  public static final int BLACKLIST_FIELD_NUMBER = 2;
  private boolean blacklist_;
  /**
   * <code>bool blacklist = 2;</code>
   * @return The blacklist.
   */
  @java.lang.Override
  public boolean getBlacklist() {
    return blacklist_;
  }

  public static final int ANIM_MIN_FIELD_NUMBER = 3;
  private float animMin_;
  /**
   * <code>float anim_min = 3;</code>
   * @return The animMin.
   */
  @java.lang.Override
  public float getAnimMin() {
    return animMin_;
  }

  public static final int ANIM_MAX_FIELD_NUMBER = 4;
  private float animMax_;
  /**
   * <code>float anim_max = 4;</code>
   * @return The animMax.
   */
  @java.lang.Override
  public float getAnimMax() {
    return animMax_;
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
    if (animation_ != POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim.NONE.getNumber()) {
      output.writeEnum(1, animation_);
    }
    if (blacklist_ != false) {
      output.writeBool(2, blacklist_);
    }
    if (animMin_ != 0F) {
      output.writeFloat(3, animMin_);
    }
    if (animMax_ != 0F) {
      output.writeFloat(4, animMax_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (animation_ != POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, animation_);
    }
    if (blacklist_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, blacklist_);
    }
    if (animMin_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, animMin_);
    }
    if (animMax_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, animMax_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.Pokemon.AnimationOverride)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.Pokemon.AnimationOverride other = (POGOProtos.Settings.Master.Pokemon.AnimationOverride) obj;

    if (animation_ != other.animation_) return false;
    if (getBlacklist()
        != other.getBlacklist()) return false;
    if (java.lang.Float.floatToIntBits(getAnimMin())
        != java.lang.Float.floatToIntBits(
            other.getAnimMin())) return false;
    if (java.lang.Float.floatToIntBits(getAnimMax())
        != java.lang.Float.floatToIntBits(
            other.getAnimMax())) return false;
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
    hash = (37 * hash) + ANIMATION_FIELD_NUMBER;
    hash = (53 * hash) + animation_;
    hash = (37 * hash) + BLACKLIST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBlacklist());
    hash = (37 * hash) + ANIM_MIN_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAnimMin());
    hash = (37 * hash) + ANIM_MAX_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAnimMax());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.Pokemon.AnimationOverride prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.Pokemon.AnimationOverride}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.Pokemon.AnimationOverride)
      POGOProtos.Settings.Master.Pokemon.AnimationOverrideOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.Pokemon.AnimationOverrideOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_AnimationOverride_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.Pokemon.AnimationOverrideOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_AnimationOverride_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.Pokemon.AnimationOverride.class, POGOProtos.Settings.Master.Pokemon.AnimationOverride.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.Pokemon.AnimationOverride.newBuilder()
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
      animation_ = 0;

      blacklist_ = false;

      animMin_ = 0F;

      animMax_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.Pokemon.AnimationOverrideOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_AnimationOverride_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Pokemon.AnimationOverride getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.Pokemon.AnimationOverride.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Pokemon.AnimationOverride build() {
      POGOProtos.Settings.Master.Pokemon.AnimationOverride result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Pokemon.AnimationOverride buildPartial() {
      POGOProtos.Settings.Master.Pokemon.AnimationOverride result = new POGOProtos.Settings.Master.Pokemon.AnimationOverride(this);
      result.animation_ = animation_;
      result.blacklist_ = blacklist_;
      result.animMin_ = animMin_;
      result.animMax_ = animMax_;
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
      if (other instanceof POGOProtos.Settings.Master.Pokemon.AnimationOverride) {
        return mergeFrom((POGOProtos.Settings.Master.Pokemon.AnimationOverride)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.Pokemon.AnimationOverride other) {
      if (other == POGOProtos.Settings.Master.Pokemon.AnimationOverride.getDefaultInstance()) return this;
      if (other.animation_ != 0) {
        setAnimationValue(other.getAnimationValue());
      }
      if (other.getBlacklist() != false) {
        setBlacklist(other.getBlacklist());
      }
      if (other.getAnimMin() != 0F) {
        setAnimMin(other.getAnimMin());
      }
      if (other.getAnimMax() != 0F) {
        setAnimMax(other.getAnimMax());
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
      POGOProtos.Settings.Master.Pokemon.AnimationOverride parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.Pokemon.AnimationOverride) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int animation_ = 0;
    /**
     * <code>.POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim animation = 1;</code>
     * @return The enum numeric value on the wire for animation.
     */
    @java.lang.Override public int getAnimationValue() {
      return animation_;
    }
    /**
     * <code>.POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim animation = 1;</code>
     * @param value The enum numeric value on the wire for animation to set.
     * @return This builder for chaining.
     */
    public Builder setAnimationValue(int value) {
      
      animation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim animation = 1;</code>
     * @return The animation.
     */
    @java.lang.Override
    public POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim getAnimation() {
      @SuppressWarnings("deprecation")
      POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim result = POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim.valueOf(animation_);
      return result == null ? POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim animation = 1;</code>
     * @param value The animation to set.
     * @return This builder for chaining.
     */
    public Builder setAnimation(POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      animation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Settings.Master.Pokemon.AnimationOverride.PokemonAnim animation = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimation() {
      
      animation_ = 0;
      onChanged();
      return this;
    }

    private boolean blacklist_ ;
    /**
     * <code>bool blacklist = 2;</code>
     * @return The blacklist.
     */
    @java.lang.Override
    public boolean getBlacklist() {
      return blacklist_;
    }
    /**
     * <code>bool blacklist = 2;</code>
     * @param value The blacklist to set.
     * @return This builder for chaining.
     */
    public Builder setBlacklist(boolean value) {
      
      blacklist_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool blacklist = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlacklist() {
      
      blacklist_ = false;
      onChanged();
      return this;
    }

    private float animMin_ ;
    /**
     * <code>float anim_min = 3;</code>
     * @return The animMin.
     */
    @java.lang.Override
    public float getAnimMin() {
      return animMin_;
    }
    /**
     * <code>float anim_min = 3;</code>
     * @param value The animMin to set.
     * @return This builder for chaining.
     */
    public Builder setAnimMin(float value) {
      
      animMin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float anim_min = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimMin() {
      
      animMin_ = 0F;
      onChanged();
      return this;
    }

    private float animMax_ ;
    /**
     * <code>float anim_max = 4;</code>
     * @return The animMax.
     */
    @java.lang.Override
    public float getAnimMax() {
      return animMax_;
    }
    /**
     * <code>float anim_max = 4;</code>
     * @param value The animMax to set.
     * @return This builder for chaining.
     */
    public Builder setAnimMax(float value) {
      
      animMax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float anim_max = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimMax() {
      
      animMax_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.Pokemon.AnimationOverride)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.Pokemon.AnimationOverride)
  private static final POGOProtos.Settings.Master.Pokemon.AnimationOverride DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.Pokemon.AnimationOverride();
  }

  public static POGOProtos.Settings.Master.Pokemon.AnimationOverride getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnimationOverride>
      PARSER = new com.google.protobuf.AbstractParser<AnimationOverride>() {
    @java.lang.Override
    public AnimationOverride parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnimationOverride(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnimationOverride> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnimationOverride> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.Pokemon.AnimationOverride getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

