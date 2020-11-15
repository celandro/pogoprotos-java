// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.WeatherAffinityProto}
 */
public final class WeatherAffinityProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.WeatherAffinityProto)
    WeatherAffinityProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeatherAffinityProto.newBuilder() to construct.
  private WeatherAffinityProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeatherAffinityProto() {
    weatherCondition_ = 0;
    pokemonType_ = java.util.Collections.emptyList();
    weaknessPokemonType_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeatherAffinityProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeatherAffinityProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            weatherCondition_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              pokemonType_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            pokemonType_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pokemonType_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              pokemonType_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              weaknessPokemonType_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            weaknessPokemonType_.add(rawValue);
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                weaknessPokemonType_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              weaknessPokemonType_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        pokemonType_ = java.util.Collections.unmodifiableList(pokemonType_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        weaknessPokemonType_ = java.util.Collections.unmodifiableList(weaknessPokemonType_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WeatherAffinityProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WeatherAffinityProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.WeatherAffinityProto.class, POGOProtos.Rpc.WeatherAffinityProto.Builder.class);
  }

  public static final int WEATHER_CONDITION_FIELD_NUMBER = 1;
  private int weatherCondition_;
  /**
   * <code>.POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition weather_condition = 1;</code>
   * @return The enum numeric value on the wire for weatherCondition.
   */
  @java.lang.Override public int getWeatherConditionValue() {
    return weatherCondition_;
  }
  /**
   * <code>.POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition weather_condition = 1;</code>
   * @return The weatherCondition.
   */
  @java.lang.Override public POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition getWeatherCondition() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition result = POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition.valueOf(weatherCondition_);
    return result == null ? POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition.UNRECOGNIZED : result;
  }

  public static final int POKEMON_TYPE_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> pokemonType_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.HoloPokemonType> pokemonType_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.HoloPokemonType>() {
            public POGOProtos.Rpc.HoloPokemonType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(from);
              return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @return A list containing the pokemonType.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.HoloPokemonType> getPokemonTypeList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.HoloPokemonType>(pokemonType_, pokemonType_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @return The count of pokemonType.
   */
  @java.lang.Override
  public int getPokemonTypeCount() {
    return pokemonType_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @param index The index of the element to return.
   * @return The pokemonType at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HoloPokemonType getPokemonType(int index) {
    return pokemonType_converter_.convert(pokemonType_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @return A list containing the enum numeric values on the wire for pokemonType.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getPokemonTypeValueList() {
    return pokemonType_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of pokemonType at the given index.
   */
  @java.lang.Override
  public int getPokemonTypeValue(int index) {
    return pokemonType_.get(index);
  }
  private int pokemonTypeMemoizedSerializedSize;

  public static final int WEAKNESS_POKEMON_TYPE_FIELD_NUMBER = 3;
  private java.util.List<java.lang.Integer> weaknessPokemonType_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.HoloPokemonType> weaknessPokemonType_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.HoloPokemonType>() {
            public POGOProtos.Rpc.HoloPokemonType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(from);
              return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
   * @return A list containing the weaknessPokemonType.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.HoloPokemonType> getWeaknessPokemonTypeList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.HoloPokemonType>(weaknessPokemonType_, weaknessPokemonType_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
   * @return The count of weaknessPokemonType.
   */
  @java.lang.Override
  public int getWeaknessPokemonTypeCount() {
    return weaknessPokemonType_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
   * @param index The index of the element to return.
   * @return The weaknessPokemonType at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HoloPokemonType getWeaknessPokemonType(int index) {
    return weaknessPokemonType_converter_.convert(weaknessPokemonType_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
   * @return A list containing the enum numeric values on the wire for weaknessPokemonType.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getWeaknessPokemonTypeValueList() {
    return weaknessPokemonType_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of weaknessPokemonType at the given index.
   */
  @java.lang.Override
  public int getWeaknessPokemonTypeValue(int index) {
    return weaknessPokemonType_.get(index);
  }
  private int weaknessPokemonTypeMemoizedSerializedSize;

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
    getSerializedSize();
    if (weatherCondition_ != POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition.NONE.getNumber()) {
      output.writeEnum(1, weatherCondition_);
    }
    if (getPokemonTypeList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(pokemonTypeMemoizedSerializedSize);
    }
    for (int i = 0; i < pokemonType_.size(); i++) {
      output.writeEnumNoTag(pokemonType_.get(i));
    }
    if (getWeaknessPokemonTypeList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(weaknessPokemonTypeMemoizedSerializedSize);
    }
    for (int i = 0; i < weaknessPokemonType_.size(); i++) {
      output.writeEnumNoTag(weaknessPokemonType_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weatherCondition_ != POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, weatherCondition_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < pokemonType_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(pokemonType_.get(i));
      }
      size += dataSize;
      if (!getPokemonTypeList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }pokemonTypeMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < weaknessPokemonType_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(weaknessPokemonType_.get(i));
      }
      size += dataSize;
      if (!getWeaknessPokemonTypeList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }weaknessPokemonTypeMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.WeatherAffinityProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.WeatherAffinityProto other = (POGOProtos.Rpc.WeatherAffinityProto) obj;

    if (weatherCondition_ != other.weatherCondition_) return false;
    if (!pokemonType_.equals(other.pokemonType_)) return false;
    if (!weaknessPokemonType_.equals(other.weaknessPokemonType_)) return false;
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
    hash = (37 * hash) + WEATHER_CONDITION_FIELD_NUMBER;
    hash = (53 * hash) + weatherCondition_;
    if (getPokemonTypeCount() > 0) {
      hash = (37 * hash) + POKEMON_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + pokemonType_.hashCode();
    }
    if (getWeaknessPokemonTypeCount() > 0) {
      hash = (37 * hash) + WEAKNESS_POKEMON_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + weaknessPokemonType_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WeatherAffinityProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.WeatherAffinityProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.WeatherAffinityProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.WeatherAffinityProto)
      POGOProtos.Rpc.WeatherAffinityProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WeatherAffinityProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WeatherAffinityProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.WeatherAffinityProto.class, POGOProtos.Rpc.WeatherAffinityProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.WeatherAffinityProto.newBuilder()
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
      weatherCondition_ = 0;

      pokemonType_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      weaknessPokemonType_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WeatherAffinityProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WeatherAffinityProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.WeatherAffinityProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.WeatherAffinityProto build() {
      POGOProtos.Rpc.WeatherAffinityProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WeatherAffinityProto buildPartial() {
      POGOProtos.Rpc.WeatherAffinityProto result = new POGOProtos.Rpc.WeatherAffinityProto(this);
      int from_bitField0_ = bitField0_;
      result.weatherCondition_ = weatherCondition_;
      if (((bitField0_ & 0x00000001) != 0)) {
        pokemonType_ = java.util.Collections.unmodifiableList(pokemonType_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.pokemonType_ = pokemonType_;
      if (((bitField0_ & 0x00000002) != 0)) {
        weaknessPokemonType_ = java.util.Collections.unmodifiableList(weaknessPokemonType_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.weaknessPokemonType_ = weaknessPokemonType_;
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
      if (other instanceof POGOProtos.Rpc.WeatherAffinityProto) {
        return mergeFrom((POGOProtos.Rpc.WeatherAffinityProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.WeatherAffinityProto other) {
      if (other == POGOProtos.Rpc.WeatherAffinityProto.getDefaultInstance()) return this;
      if (other.weatherCondition_ != 0) {
        setWeatherConditionValue(other.getWeatherConditionValue());
      }
      if (!other.pokemonType_.isEmpty()) {
        if (pokemonType_.isEmpty()) {
          pokemonType_ = other.pokemonType_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePokemonTypeIsMutable();
          pokemonType_.addAll(other.pokemonType_);
        }
        onChanged();
      }
      if (!other.weaknessPokemonType_.isEmpty()) {
        if (weaknessPokemonType_.isEmpty()) {
          weaknessPokemonType_ = other.weaknessPokemonType_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureWeaknessPokemonTypeIsMutable();
          weaknessPokemonType_.addAll(other.weaknessPokemonType_);
        }
        onChanged();
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
      POGOProtos.Rpc.WeatherAffinityProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.WeatherAffinityProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int weatherCondition_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition weather_condition = 1;</code>
     * @return The enum numeric value on the wire for weatherCondition.
     */
    @java.lang.Override public int getWeatherConditionValue() {
      return weatherCondition_;
    }
    /**
     * <code>.POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition weather_condition = 1;</code>
     * @param value The enum numeric value on the wire for weatherCondition to set.
     * @return This builder for chaining.
     */
    public Builder setWeatherConditionValue(int value) {
      
      weatherCondition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition weather_condition = 1;</code>
     * @return The weatherCondition.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition getWeatherCondition() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition result = POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition.valueOf(weatherCondition_);
      return result == null ? POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition weather_condition = 1;</code>
     * @param value The weatherCondition to set.
     * @return This builder for chaining.
     */
    public Builder setWeatherCondition(POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      weatherCondition_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GameplayWeatherProto.WeatherCondition weather_condition = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeatherCondition() {
      
      weatherCondition_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> pokemonType_ =
      java.util.Collections.emptyList();
    private void ensurePokemonTypeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pokemonType_ = new java.util.ArrayList<java.lang.Integer>(pokemonType_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @return A list containing the pokemonType.
     */
    public java.util.List<POGOProtos.Rpc.HoloPokemonType> getPokemonTypeList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.HoloPokemonType>(pokemonType_, pokemonType_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @return The count of pokemonType.
     */
    public int getPokemonTypeCount() {
      return pokemonType_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @param index The index of the element to return.
     * @return The pokemonType at the given index.
     */
    public POGOProtos.Rpc.HoloPokemonType getPokemonType(int index) {
      return pokemonType_converter_.convert(pokemonType_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @param index The index to set the value at.
     * @param value The pokemonType to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonType(
        int index, POGOProtos.Rpc.HoloPokemonType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePokemonTypeIsMutable();
      pokemonType_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @param value The pokemonType to add.
     * @return This builder for chaining.
     */
    public Builder addPokemonType(POGOProtos.Rpc.HoloPokemonType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePokemonTypeIsMutable();
      pokemonType_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @param values The pokemonType to add.
     * @return This builder for chaining.
     */
    public Builder addAllPokemonType(
        java.lang.Iterable<? extends POGOProtos.Rpc.HoloPokemonType> values) {
      ensurePokemonTypeIsMutable();
      for (POGOProtos.Rpc.HoloPokemonType value : values) {
        pokemonType_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonType() {
      pokemonType_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @return A list containing the enum numeric values on the wire for pokemonType.
     */
    public java.util.List<java.lang.Integer>
    getPokemonTypeValueList() {
      return java.util.Collections.unmodifiableList(pokemonType_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of pokemonType at the given index.
     */
    public int getPokemonTypeValue(int index) {
      return pokemonType_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of pokemonType at the given index.
     * @return This builder for chaining.
     */
    public Builder setPokemonTypeValue(
        int index, int value) {
      ensurePokemonTypeIsMutable();
      pokemonType_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @param value The enum numeric value on the wire for pokemonType to add.
     * @return This builder for chaining.
     */
    public Builder addPokemonTypeValue(int value) {
      ensurePokemonTypeIsMutable();
      pokemonType_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType pokemon_type = 2;</code>
     * @param values The enum numeric values on the wire for pokemonType to add.
     * @return This builder for chaining.
     */
    public Builder addAllPokemonTypeValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensurePokemonTypeIsMutable();
      for (int value : values) {
        pokemonType_.add(value);
      }
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> weaknessPokemonType_ =
      java.util.Collections.emptyList();
    private void ensureWeaknessPokemonTypeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        weaknessPokemonType_ = new java.util.ArrayList<java.lang.Integer>(weaknessPokemonType_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @return A list containing the weaknessPokemonType.
     */
    public java.util.List<POGOProtos.Rpc.HoloPokemonType> getWeaknessPokemonTypeList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.HoloPokemonType>(weaknessPokemonType_, weaknessPokemonType_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @return The count of weaknessPokemonType.
     */
    public int getWeaknessPokemonTypeCount() {
      return weaknessPokemonType_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @param index The index of the element to return.
     * @return The weaknessPokemonType at the given index.
     */
    public POGOProtos.Rpc.HoloPokemonType getWeaknessPokemonType(int index) {
      return weaknessPokemonType_converter_.convert(weaknessPokemonType_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @param index The index to set the value at.
     * @param value The weaknessPokemonType to set.
     * @return This builder for chaining.
     */
    public Builder setWeaknessPokemonType(
        int index, POGOProtos.Rpc.HoloPokemonType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureWeaknessPokemonTypeIsMutable();
      weaknessPokemonType_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @param value The weaknessPokemonType to add.
     * @return This builder for chaining.
     */
    public Builder addWeaknessPokemonType(POGOProtos.Rpc.HoloPokemonType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureWeaknessPokemonTypeIsMutable();
      weaknessPokemonType_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @param values The weaknessPokemonType to add.
     * @return This builder for chaining.
     */
    public Builder addAllWeaknessPokemonType(
        java.lang.Iterable<? extends POGOProtos.Rpc.HoloPokemonType> values) {
      ensureWeaknessPokemonTypeIsMutable();
      for (POGOProtos.Rpc.HoloPokemonType value : values) {
        weaknessPokemonType_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeaknessPokemonType() {
      weaknessPokemonType_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @return A list containing the enum numeric values on the wire for weaknessPokemonType.
     */
    public java.util.List<java.lang.Integer>
    getWeaknessPokemonTypeValueList() {
      return java.util.Collections.unmodifiableList(weaknessPokemonType_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of weaknessPokemonType at the given index.
     */
    public int getWeaknessPokemonTypeValue(int index) {
      return weaknessPokemonType_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of weaknessPokemonType at the given index.
     * @return This builder for chaining.
     */
    public Builder setWeaknessPokemonTypeValue(
        int index, int value) {
      ensureWeaknessPokemonTypeIsMutable();
      weaknessPokemonType_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @param value The enum numeric value on the wire for weaknessPokemonType to add.
     * @return This builder for chaining.
     */
    public Builder addWeaknessPokemonTypeValue(int value) {
      ensureWeaknessPokemonTypeIsMutable();
      weaknessPokemonType_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonType weakness_pokemon_type = 3;</code>
     * @param values The enum numeric values on the wire for weaknessPokemonType to add.
     * @return This builder for chaining.
     */
    public Builder addAllWeaknessPokemonTypeValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureWeaknessPokemonTypeIsMutable();
      for (int value : values) {
        weaknessPokemonType_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.WeatherAffinityProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.WeatherAffinityProto)
  private static final POGOProtos.Rpc.WeatherAffinityProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.WeatherAffinityProto();
  }

  public static POGOProtos.Rpc.WeatherAffinityProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeatherAffinityProto>
      PARSER = new com.google.protobuf.AbstractParser<WeatherAffinityProto>() {
    @java.lang.Override
    public WeatherAffinityProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeatherAffinityProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeatherAffinityProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeatherAffinityProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.WeatherAffinityProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

