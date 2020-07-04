// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PokemonScaleSettingProto}
 */
public  final class PokemonScaleSettingProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonScaleSettingProto)
    PokemonScaleSettingProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonScaleSettingProto.newBuilder() to construct.
  private PokemonScaleSettingProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonScaleSettingProto() {
    pokemonScaleMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonScaleSettingProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonScaleSettingProto(
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

            pokemonScaleMode_ = rawValue;
            break;
          }
          case 21: {

            minHeight_ = input.readFloat();
            break;
          }
          case 29: {

            maxHeight_ = input.readFloat();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokemonScaleSettingProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokemonScaleSettingProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonScaleSettingProto.class, POGOProtos.Rpc.PokemonScaleSettingProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode}
   */
  public enum PokemonScaleMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>natural_scale = 0;</code>
     */
    natural_scale(0),
    /**
     * <code>gui_scale = 1;</code>
     */
    gui_scale(1),
    /**
     * <code>battle_pokemon_scale = 2;</code>
     */
    battle_pokemon_scale(2),
    /**
     * <code>raid_boss_scale = 3;</code>
     */
    raid_boss_scale(3),
    /**
     * <code>gym_topper_scale = 4;</code>
     */
    gym_topper_scale(4),
    /**
     * <code>map_pokemon_scale = 5;</code>
     */
    map_pokemon_scale(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>natural_scale = 0;</code>
     */
    public static final int natural_scale_VALUE = 0;
    /**
     * <code>gui_scale = 1;</code>
     */
    public static final int gui_scale_VALUE = 1;
    /**
     * <code>battle_pokemon_scale = 2;</code>
     */
    public static final int battle_pokemon_scale_VALUE = 2;
    /**
     * <code>raid_boss_scale = 3;</code>
     */
    public static final int raid_boss_scale_VALUE = 3;
    /**
     * <code>gym_topper_scale = 4;</code>
     */
    public static final int gym_topper_scale_VALUE = 4;
    /**
     * <code>map_pokemon_scale = 5;</code>
     */
    public static final int map_pokemon_scale_VALUE = 5;


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
    public static PokemonScaleMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PokemonScaleMode forNumber(int value) {
      switch (value) {
        case 0: return natural_scale;
        case 1: return gui_scale;
        case 2: return battle_pokemon_scale;
        case 3: return raid_boss_scale;
        case 4: return gym_topper_scale;
        case 5: return map_pokemon_scale;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PokemonScaleMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PokemonScaleMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PokemonScaleMode>() {
            public PokemonScaleMode findValueByNumber(int number) {
              return PokemonScaleMode.forNumber(number);
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
      return POGOProtos.Rpc.PokemonScaleSettingProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final PokemonScaleMode[] VALUES = values();

    public static PokemonScaleMode valueOf(
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

    private PokemonScaleMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode)
  }

  public static final int POKEMON_SCALE_MODE_FIELD_NUMBER = 1;
  private int pokemonScaleMode_;
  /**
   * <code>.POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode pokemon_scale_mode = 1;</code>
   * @return The enum numeric value on the wire for pokemonScaleMode.
   */
  public int getPokemonScaleModeValue() {
    return pokemonScaleMode_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode pokemon_scale_mode = 1;</code>
   * @return The pokemonScaleMode.
   */
  public POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode getPokemonScaleMode() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode result = POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode.valueOf(pokemonScaleMode_);
    return result == null ? POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode.UNRECOGNIZED : result;
  }

  public static final int MIN_HEIGHT_FIELD_NUMBER = 2;
  private float minHeight_;
  /**
   * <code>float min_height = 2;</code>
   * @return The minHeight.
   */
  public float getMinHeight() {
    return minHeight_;
  }

  public static final int MAX_HEIGHT_FIELD_NUMBER = 3;
  private float maxHeight_;
  /**
   * <code>float max_height = 3;</code>
   * @return The maxHeight.
   */
  public float getMaxHeight() {
    return maxHeight_;
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
    if (pokemonScaleMode_ != POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode.natural_scale.getNumber()) {
      output.writeEnum(1, pokemonScaleMode_);
    }
    if (minHeight_ != 0F) {
      output.writeFloat(2, minHeight_);
    }
    if (maxHeight_ != 0F) {
      output.writeFloat(3, maxHeight_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemonScaleMode_ != POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode.natural_scale.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pokemonScaleMode_);
    }
    if (minHeight_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, minHeight_);
    }
    if (maxHeight_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, maxHeight_);
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
    if (!(obj instanceof POGOProtos.Rpc.PokemonScaleSettingProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonScaleSettingProto other = (POGOProtos.Rpc.PokemonScaleSettingProto) obj;

    if (pokemonScaleMode_ != other.pokemonScaleMode_) return false;
    if (java.lang.Float.floatToIntBits(getMinHeight())
        != java.lang.Float.floatToIntBits(
            other.getMinHeight())) return false;
    if (java.lang.Float.floatToIntBits(getMaxHeight())
        != java.lang.Float.floatToIntBits(
            other.getMaxHeight())) return false;
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
    hash = (37 * hash) + POKEMON_SCALE_MODE_FIELD_NUMBER;
    hash = (53 * hash) + pokemonScaleMode_;
    hash = (37 * hash) + MIN_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMinHeight());
    hash = (37 * hash) + MAX_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMaxHeight());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonScaleSettingProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokemonScaleSettingProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PokemonScaleSettingProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonScaleSettingProto)
      POGOProtos.Rpc.PokemonScaleSettingProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokemonScaleSettingProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokemonScaleSettingProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonScaleSettingProto.class, POGOProtos.Rpc.PokemonScaleSettingProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonScaleSettingProto.newBuilder()
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
      pokemonScaleMode_ = 0;

      minHeight_ = 0F;

      maxHeight_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PokemonScaleSettingProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonScaleSettingProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonScaleSettingProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonScaleSettingProto build() {
      POGOProtos.Rpc.PokemonScaleSettingProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonScaleSettingProto buildPartial() {
      POGOProtos.Rpc.PokemonScaleSettingProto result = new POGOProtos.Rpc.PokemonScaleSettingProto(this);
      result.pokemonScaleMode_ = pokemonScaleMode_;
      result.minHeight_ = minHeight_;
      result.maxHeight_ = maxHeight_;
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
      if (other instanceof POGOProtos.Rpc.PokemonScaleSettingProto) {
        return mergeFrom((POGOProtos.Rpc.PokemonScaleSettingProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonScaleSettingProto other) {
      if (other == POGOProtos.Rpc.PokemonScaleSettingProto.getDefaultInstance()) return this;
      if (other.pokemonScaleMode_ != 0) {
        setPokemonScaleModeValue(other.getPokemonScaleModeValue());
      }
      if (other.getMinHeight() != 0F) {
        setMinHeight(other.getMinHeight());
      }
      if (other.getMaxHeight() != 0F) {
        setMaxHeight(other.getMaxHeight());
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
      POGOProtos.Rpc.PokemonScaleSettingProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonScaleSettingProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pokemonScaleMode_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode pokemon_scale_mode = 1;</code>
     * @return The enum numeric value on the wire for pokemonScaleMode.
     */
    public int getPokemonScaleModeValue() {
      return pokemonScaleMode_;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode pokemon_scale_mode = 1;</code>
     * @param value The enum numeric value on the wire for pokemonScaleMode to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonScaleModeValue(int value) {
      pokemonScaleMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode pokemon_scale_mode = 1;</code>
     * @return The pokemonScaleMode.
     */
    public POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode getPokemonScaleMode() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode result = POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode.valueOf(pokemonScaleMode_);
      return result == null ? POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode pokemon_scale_mode = 1;</code>
     * @param value The pokemonScaleMode to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonScaleMode(POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokemonScaleMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonScaleSettingProto.PokemonScaleMode pokemon_scale_mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonScaleMode() {
      
      pokemonScaleMode_ = 0;
      onChanged();
      return this;
    }

    private float minHeight_ ;
    /**
     * <code>float min_height = 2;</code>
     * @return The minHeight.
     */
    public float getMinHeight() {
      return minHeight_;
    }
    /**
     * <code>float min_height = 2;</code>
     * @param value The minHeight to set.
     * @return This builder for chaining.
     */
    public Builder setMinHeight(float value) {
      
      minHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float min_height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinHeight() {
      
      minHeight_ = 0F;
      onChanged();
      return this;
    }

    private float maxHeight_ ;
    /**
     * <code>float max_height = 3;</code>
     * @return The maxHeight.
     */
    public float getMaxHeight() {
      return maxHeight_;
    }
    /**
     * <code>float max_height = 3;</code>
     * @param value The maxHeight to set.
     * @return This builder for chaining.
     */
    public Builder setMaxHeight(float value) {
      
      maxHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float max_height = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxHeight() {
      
      maxHeight_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonScaleSettingProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonScaleSettingProto)
  private static final POGOProtos.Rpc.PokemonScaleSettingProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonScaleSettingProto();
  }

  public static POGOProtos.Rpc.PokemonScaleSettingProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonScaleSettingProto>
      PARSER = new com.google.protobuf.AbstractParser<PokemonScaleSettingProto>() {
    @java.lang.Override
    public PokemonScaleSettingProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonScaleSettingProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonScaleSettingProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonScaleSettingProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonScaleSettingProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

