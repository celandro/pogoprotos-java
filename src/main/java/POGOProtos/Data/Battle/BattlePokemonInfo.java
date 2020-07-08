// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Battle/BattlePokemonInfo.proto

package POGOProtos.Data.Battle;

/**
 * Protobuf type {@code POGOProtos.Data.Battle.BattlePokemonInfo}
 */
public  final class BattlePokemonInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Battle.BattlePokemonInfo)
    BattlePokemonInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BattlePokemonInfo.newBuilder() to construct.
  private BattlePokemonInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BattlePokemonInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BattlePokemonInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BattlePokemonInfo(
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
          case 10: {
            POGOProtos.Data.PokemonData.Builder subBuilder = null;
            if (pokemonData_ != null) {
              subBuilder = pokemonData_.toBuilder();
            }
            pokemonData_ = input.readMessage(POGOProtos.Data.PokemonData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemonData_);
              pokemonData_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            currentHealth_ = input.readInt32();
            break;
          }
          case 24: {

            currentEnergy_ = input.readInt32();
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
    return POGOProtos.Data.Battle.BattlePokemonInfoOuterClass.internal_static_POGOProtos_Data_Battle_BattlePokemonInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Battle.BattlePokemonInfoOuterClass.internal_static_POGOProtos_Data_Battle_BattlePokemonInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Battle.BattlePokemonInfo.class, POGOProtos.Data.Battle.BattlePokemonInfo.Builder.class);
  }

  public static final int POKEMON_DATA_FIELD_NUMBER = 1;
  private POGOProtos.Data.PokemonData pokemonData_;
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
   * @return Whether the pokemonData field is set.
   */
  public boolean hasPokemonData() {
    return pokemonData_ != null;
  }
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
   * @return The pokemonData.
   */
  public POGOProtos.Data.PokemonData getPokemonData() {
    return pokemonData_ == null ? POGOProtos.Data.PokemonData.getDefaultInstance() : pokemonData_;
  }
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
   */
  public POGOProtos.Data.PokemonDataOrBuilder getPokemonDataOrBuilder() {
    return getPokemonData();
  }

  public static final int CURRENT_HEALTH_FIELD_NUMBER = 2;
  private int currentHealth_;
  /**
   * <code>int32 current_health = 2;</code>
   * @return The currentHealth.
   */
  public int getCurrentHealth() {
    return currentHealth_;
  }

  public static final int CURRENT_ENERGY_FIELD_NUMBER = 3;
  private int currentEnergy_;
  /**
   * <code>int32 current_energy = 3;</code>
   * @return The currentEnergy.
   */
  public int getCurrentEnergy() {
    return currentEnergy_;
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
    if (pokemonData_ != null) {
      output.writeMessage(1, getPokemonData());
    }
    if (currentHealth_ != 0) {
      output.writeInt32(2, currentHealth_);
    }
    if (currentEnergy_ != 0) {
      output.writeInt32(3, currentEnergy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemonData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPokemonData());
    }
    if (currentHealth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, currentHealth_);
    }
    if (currentEnergy_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, currentEnergy_);
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
    if (!(obj instanceof POGOProtos.Data.Battle.BattlePokemonInfo)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Battle.BattlePokemonInfo other = (POGOProtos.Data.Battle.BattlePokemonInfo) obj;

    if (hasPokemonData() != other.hasPokemonData()) return false;
    if (hasPokemonData()) {
      if (!getPokemonData()
          .equals(other.getPokemonData())) return false;
    }
    if (getCurrentHealth()
        != other.getCurrentHealth()) return false;
    if (getCurrentEnergy()
        != other.getCurrentEnergy()) return false;
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
    if (hasPokemonData()) {
      hash = (37 * hash) + POKEMON_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonData().hashCode();
    }
    hash = (37 * hash) + CURRENT_HEALTH_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentHealth();
    hash = (37 * hash) + CURRENT_ENERGY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentEnergy();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Battle.BattlePokemonInfo parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Battle.BattlePokemonInfo prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Battle.BattlePokemonInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Battle.BattlePokemonInfo)
      POGOProtos.Data.Battle.BattlePokemonInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Battle.BattlePokemonInfoOuterClass.internal_static_POGOProtos_Data_Battle_BattlePokemonInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Battle.BattlePokemonInfoOuterClass.internal_static_POGOProtos_Data_Battle_BattlePokemonInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Battle.BattlePokemonInfo.class, POGOProtos.Data.Battle.BattlePokemonInfo.Builder.class);
    }

    // Construct using POGOProtos.Data.Battle.BattlePokemonInfo.newBuilder()
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
      if (pokemonDataBuilder_ == null) {
        pokemonData_ = null;
      } else {
        pokemonData_ = null;
        pokemonDataBuilder_ = null;
      }
      currentHealth_ = 0;

      currentEnergy_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Battle.BattlePokemonInfoOuterClass.internal_static_POGOProtos_Data_Battle_BattlePokemonInfo_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Battle.BattlePokemonInfo getDefaultInstanceForType() {
      return POGOProtos.Data.Battle.BattlePokemonInfo.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Battle.BattlePokemonInfo build() {
      POGOProtos.Data.Battle.BattlePokemonInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Battle.BattlePokemonInfo buildPartial() {
      POGOProtos.Data.Battle.BattlePokemonInfo result = new POGOProtos.Data.Battle.BattlePokemonInfo(this);
      if (pokemonDataBuilder_ == null) {
        result.pokemonData_ = pokemonData_;
      } else {
        result.pokemonData_ = pokemonDataBuilder_.build();
      }
      result.currentHealth_ = currentHealth_;
      result.currentEnergy_ = currentEnergy_;
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
      if (other instanceof POGOProtos.Data.Battle.BattlePokemonInfo) {
        return mergeFrom((POGOProtos.Data.Battle.BattlePokemonInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Battle.BattlePokemonInfo other) {
      if (other == POGOProtos.Data.Battle.BattlePokemonInfo.getDefaultInstance()) return this;
      if (other.hasPokemonData()) {
        mergePokemonData(other.getPokemonData());
      }
      if (other.getCurrentHealth() != 0) {
        setCurrentHealth(other.getCurrentHealth());
      }
      if (other.getCurrentEnergy() != 0) {
        setCurrentEnergy(other.getCurrentEnergy());
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
      POGOProtos.Data.Battle.BattlePokemonInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Battle.BattlePokemonInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Data.PokemonData pokemonData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder> pokemonDataBuilder_;
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
     * @return Whether the pokemonData field is set.
     */
    public boolean hasPokemonData() {
      return pokemonDataBuilder_ != null || pokemonData_ != null;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
     * @return The pokemonData.
     */
    public POGOProtos.Data.PokemonData getPokemonData() {
      if (pokemonDataBuilder_ == null) {
        return pokemonData_ == null ? POGOProtos.Data.PokemonData.getDefaultInstance() : pokemonData_;
      } else {
        return pokemonDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
     */
    public Builder setPokemonData(POGOProtos.Data.PokemonData value) {
      if (pokemonDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pokemonData_ = value;
        onChanged();
      } else {
        pokemonDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
     */
    public Builder setPokemonData(
        POGOProtos.Data.PokemonData.Builder builderForValue) {
      if (pokemonDataBuilder_ == null) {
        pokemonData_ = builderForValue.build();
        onChanged();
      } else {
        pokemonDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
     */
    public Builder mergePokemonData(POGOProtos.Data.PokemonData value) {
      if (pokemonDataBuilder_ == null) {
        if (pokemonData_ != null) {
          pokemonData_ =
            POGOProtos.Data.PokemonData.newBuilder(pokemonData_).mergeFrom(value).buildPartial();
        } else {
          pokemonData_ = value;
        }
        onChanged();
      } else {
        pokemonDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
     */
    public Builder clearPokemonData() {
      if (pokemonDataBuilder_ == null) {
        pokemonData_ = null;
        onChanged();
      } else {
        pokemonData_ = null;
        pokemonDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
     */
    public POGOProtos.Data.PokemonData.Builder getPokemonDataBuilder() {
      
      onChanged();
      return getPokemonDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
     */
    public POGOProtos.Data.PokemonDataOrBuilder getPokemonDataOrBuilder() {
      if (pokemonDataBuilder_ != null) {
        return pokemonDataBuilder_.getMessageOrBuilder();
      } else {
        return pokemonData_ == null ?
            POGOProtos.Data.PokemonData.getDefaultInstance() : pokemonData_;
      }
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder> 
        getPokemonDataFieldBuilder() {
      if (pokemonDataBuilder_ == null) {
        pokemonDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder>(
                getPokemonData(),
                getParentForChildren(),
                isClean());
        pokemonData_ = null;
      }
      return pokemonDataBuilder_;
    }

    private int currentHealth_ ;
    /**
     * <code>int32 current_health = 2;</code>
     * @return The currentHealth.
     */
    public int getCurrentHealth() {
      return currentHealth_;
    }
    /**
     * <code>int32 current_health = 2;</code>
     * @param value The currentHealth to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentHealth(int value) {
      
      currentHealth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 current_health = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentHealth() {
      
      currentHealth_ = 0;
      onChanged();
      return this;
    }

    private int currentEnergy_ ;
    /**
     * <code>int32 current_energy = 3;</code>
     * @return The currentEnergy.
     */
    public int getCurrentEnergy() {
      return currentEnergy_;
    }
    /**
     * <code>int32 current_energy = 3;</code>
     * @param value The currentEnergy to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentEnergy(int value) {
      
      currentEnergy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 current_energy = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentEnergy() {
      
      currentEnergy_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Battle.BattlePokemonInfo)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Battle.BattlePokemonInfo)
  private static final POGOProtos.Data.Battle.BattlePokemonInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Battle.BattlePokemonInfo();
  }

  public static POGOProtos.Data.Battle.BattlePokemonInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BattlePokemonInfo>
      PARSER = new com.google.protobuf.AbstractParser<BattlePokemonInfo>() {
    @java.lang.Override
    public BattlePokemonInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BattlePokemonInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BattlePokemonInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BattlePokemonInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Battle.BattlePokemonInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
