// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Pokemon/WildPokemon.proto

package POGOProtos.Map.Pokemon;

/**
 * Protobuf type {@code POGOProtos.Map.Pokemon.WildPokemon}
 */
public final class WildPokemon extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Map.Pokemon.WildPokemon)
    WildPokemonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WildPokemon.newBuilder() to construct.
  private WildPokemon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WildPokemon() {
    spawnPointId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WildPokemon();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WildPokemon(
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
          case 9: {

            encounterId_ = input.readFixed64();
            break;
          }
          case 16: {

            lastModifiedTimestampMs_ = input.readInt64();
            break;
          }
          case 25: {

            latitude_ = input.readDouble();
            break;
          }
          case 33: {

            longitude_ = input.readDouble();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            spawnPointId_ = s;
            break;
          }
          case 58: {
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
          case 88: {

            timeTillHiddenMs_ = input.readInt32();
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
    return POGOProtos.Map.Pokemon.WildPokemonOuterClass.internal_static_POGOProtos_Map_Pokemon_WildPokemon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Map.Pokemon.WildPokemonOuterClass.internal_static_POGOProtos_Map_Pokemon_WildPokemon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Map.Pokemon.WildPokemon.class, POGOProtos.Map.Pokemon.WildPokemon.Builder.class);
  }

  public static final int ENCOUNTER_ID_FIELD_NUMBER = 1;
  private long encounterId_;
  /**
   * <code>fixed64 encounter_id = 1;</code>
   * @return The encounterId.
   */
  @java.lang.Override
  public long getEncounterId() {
    return encounterId_;
  }

  public static final int LAST_MODIFIED_TIMESTAMP_MS_FIELD_NUMBER = 2;
  private long lastModifiedTimestampMs_;
  /**
   * <code>int64 last_modified_timestamp_ms = 2;</code>
   * @return The lastModifiedTimestampMs.
   */
  @java.lang.Override
  public long getLastModifiedTimestampMs() {
    return lastModifiedTimestampMs_;
  }

  public static final int LATITUDE_FIELD_NUMBER = 3;
  private double latitude_;
  /**
   * <code>double latitude = 3;</code>
   * @return The latitude.
   */
  @java.lang.Override
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 4;
  private double longitude_;
  /**
   * <code>double longitude = 4;</code>
   * @return The longitude.
   */
  @java.lang.Override
  public double getLongitude() {
    return longitude_;
  }

  public static final int SPAWN_POINT_ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object spawnPointId_;
  /**
   * <code>string spawn_point_id = 5;</code>
   * @return The spawnPointId.
   */
  @java.lang.Override
  public java.lang.String getSpawnPointId() {
    java.lang.Object ref = spawnPointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spawnPointId_ = s;
      return s;
    }
  }
  /**
   * <code>string spawn_point_id = 5;</code>
   * @return The bytes for spawnPointId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpawnPointIdBytes() {
    java.lang.Object ref = spawnPointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spawnPointId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POKEMON_DATA_FIELD_NUMBER = 7;
  private POGOProtos.Data.PokemonData pokemonData_;
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
   * @return Whether the pokemonData field is set.
   */
  @java.lang.Override
  public boolean hasPokemonData() {
    return pokemonData_ != null;
  }
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
   * @return The pokemonData.
   */
  @java.lang.Override
  public POGOProtos.Data.PokemonData getPokemonData() {
    return pokemonData_ == null ? POGOProtos.Data.PokemonData.getDefaultInstance() : pokemonData_;
  }
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.PokemonDataOrBuilder getPokemonDataOrBuilder() {
    return getPokemonData();
  }

  public static final int TIME_TILL_HIDDEN_MS_FIELD_NUMBER = 11;
  private int timeTillHiddenMs_;
  /**
   * <code>int32 time_till_hidden_ms = 11;</code>
   * @return The timeTillHiddenMs.
   */
  @java.lang.Override
  public int getTimeTillHiddenMs() {
    return timeTillHiddenMs_;
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
    if (encounterId_ != 0L) {
      output.writeFixed64(1, encounterId_);
    }
    if (lastModifiedTimestampMs_ != 0L) {
      output.writeInt64(2, lastModifiedTimestampMs_);
    }
    if (latitude_ != 0D) {
      output.writeDouble(3, latitude_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(4, longitude_);
    }
    if (!getSpawnPointIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, spawnPointId_);
    }
    if (pokemonData_ != null) {
      output.writeMessage(7, getPokemonData());
    }
    if (timeTillHiddenMs_ != 0) {
      output.writeInt32(11, timeTillHiddenMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (encounterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(1, encounterId_);
    }
    if (lastModifiedTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, lastModifiedTimestampMs_);
    }
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, latitude_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, longitude_);
    }
    if (!getSpawnPointIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, spawnPointId_);
    }
    if (pokemonData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getPokemonData());
    }
    if (timeTillHiddenMs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(11, timeTillHiddenMs_);
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
    if (!(obj instanceof POGOProtos.Map.Pokemon.WildPokemon)) {
      return super.equals(obj);
    }
    POGOProtos.Map.Pokemon.WildPokemon other = (POGOProtos.Map.Pokemon.WildPokemon) obj;

    if (getEncounterId()
        != other.getEncounterId()) return false;
    if (getLastModifiedTimestampMs()
        != other.getLastModifiedTimestampMs()) return false;
    if (java.lang.Double.doubleToLongBits(getLatitude())
        != java.lang.Double.doubleToLongBits(
            other.getLatitude())) return false;
    if (java.lang.Double.doubleToLongBits(getLongitude())
        != java.lang.Double.doubleToLongBits(
            other.getLongitude())) return false;
    if (!getSpawnPointId()
        .equals(other.getSpawnPointId())) return false;
    if (hasPokemonData() != other.hasPokemonData()) return false;
    if (hasPokemonData()) {
      if (!getPokemonData()
          .equals(other.getPokemonData())) return false;
    }
    if (getTimeTillHiddenMs()
        != other.getTimeTillHiddenMs()) return false;
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
    hash = (37 * hash) + ENCOUNTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEncounterId());
    hash = (37 * hash) + LAST_MODIFIED_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastModifiedTimestampMs());
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (37 * hash) + SPAWN_POINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSpawnPointId().hashCode();
    if (hasPokemonData()) {
      hash = (37 * hash) + POKEMON_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonData().hashCode();
    }
    hash = (37 * hash) + TIME_TILL_HIDDEN_MS_FIELD_NUMBER;
    hash = (53 * hash) + getTimeTillHiddenMs();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Map.Pokemon.WildPokemon parseFrom(
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
  public static Builder newBuilder(POGOProtos.Map.Pokemon.WildPokemon prototype) {
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
   * Protobuf type {@code POGOProtos.Map.Pokemon.WildPokemon}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Map.Pokemon.WildPokemon)
      POGOProtos.Map.Pokemon.WildPokemonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Map.Pokemon.WildPokemonOuterClass.internal_static_POGOProtos_Map_Pokemon_WildPokemon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Map.Pokemon.WildPokemonOuterClass.internal_static_POGOProtos_Map_Pokemon_WildPokemon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Map.Pokemon.WildPokemon.class, POGOProtos.Map.Pokemon.WildPokemon.Builder.class);
    }

    // Construct using POGOProtos.Map.Pokemon.WildPokemon.newBuilder()
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
      encounterId_ = 0L;

      lastModifiedTimestampMs_ = 0L;

      latitude_ = 0D;

      longitude_ = 0D;

      spawnPointId_ = "";

      if (pokemonDataBuilder_ == null) {
        pokemonData_ = null;
      } else {
        pokemonData_ = null;
        pokemonDataBuilder_ = null;
      }
      timeTillHiddenMs_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Map.Pokemon.WildPokemonOuterClass.internal_static_POGOProtos_Map_Pokemon_WildPokemon_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Map.Pokemon.WildPokemon getDefaultInstanceForType() {
      return POGOProtos.Map.Pokemon.WildPokemon.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Map.Pokemon.WildPokemon build() {
      POGOProtos.Map.Pokemon.WildPokemon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Map.Pokemon.WildPokemon buildPartial() {
      POGOProtos.Map.Pokemon.WildPokemon result = new POGOProtos.Map.Pokemon.WildPokemon(this);
      result.encounterId_ = encounterId_;
      result.lastModifiedTimestampMs_ = lastModifiedTimestampMs_;
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      result.spawnPointId_ = spawnPointId_;
      if (pokemonDataBuilder_ == null) {
        result.pokemonData_ = pokemonData_;
      } else {
        result.pokemonData_ = pokemonDataBuilder_.build();
      }
      result.timeTillHiddenMs_ = timeTillHiddenMs_;
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
      if (other instanceof POGOProtos.Map.Pokemon.WildPokemon) {
        return mergeFrom((POGOProtos.Map.Pokemon.WildPokemon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Map.Pokemon.WildPokemon other) {
      if (other == POGOProtos.Map.Pokemon.WildPokemon.getDefaultInstance()) return this;
      if (other.getEncounterId() != 0L) {
        setEncounterId(other.getEncounterId());
      }
      if (other.getLastModifiedTimestampMs() != 0L) {
        setLastModifiedTimestampMs(other.getLastModifiedTimestampMs());
      }
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (!other.getSpawnPointId().isEmpty()) {
        spawnPointId_ = other.spawnPointId_;
        onChanged();
      }
      if (other.hasPokemonData()) {
        mergePokemonData(other.getPokemonData());
      }
      if (other.getTimeTillHiddenMs() != 0) {
        setTimeTillHiddenMs(other.getTimeTillHiddenMs());
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
      POGOProtos.Map.Pokemon.WildPokemon parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Map.Pokemon.WildPokemon) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long encounterId_ ;
    /**
     * <code>fixed64 encounter_id = 1;</code>
     * @return The encounterId.
     */
    @java.lang.Override
    public long getEncounterId() {
      return encounterId_;
    }
    /**
     * <code>fixed64 encounter_id = 1;</code>
     * @param value The encounterId to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterId(long value) {
      
      encounterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 encounter_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterId() {
      
      encounterId_ = 0L;
      onChanged();
      return this;
    }

    private long lastModifiedTimestampMs_ ;
    /**
     * <code>int64 last_modified_timestamp_ms = 2;</code>
     * @return The lastModifiedTimestampMs.
     */
    @java.lang.Override
    public long getLastModifiedTimestampMs() {
      return lastModifiedTimestampMs_;
    }
    /**
     * <code>int64 last_modified_timestamp_ms = 2;</code>
     * @param value The lastModifiedTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setLastModifiedTimestampMs(long value) {
      
      lastModifiedTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 last_modified_timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastModifiedTimestampMs() {
      
      lastModifiedTimestampMs_ = 0L;
      onChanged();
      return this;
    }

    private double latitude_ ;
    /**
     * <code>double latitude = 3;</code>
     * @return The latitude.
     */
    @java.lang.Override
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>double latitude = 3;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double latitude = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>double longitude = 4;</code>
     * @return The longitude.
     */
    @java.lang.Override
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>double longitude = 4;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double longitude = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object spawnPointId_ = "";
    /**
     * <code>string spawn_point_id = 5;</code>
     * @return The spawnPointId.
     */
    public java.lang.String getSpawnPointId() {
      java.lang.Object ref = spawnPointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spawnPointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string spawn_point_id = 5;</code>
     * @return The bytes for spawnPointId.
     */
    public com.google.protobuf.ByteString
        getSpawnPointIdBytes() {
      java.lang.Object ref = spawnPointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spawnPointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string spawn_point_id = 5;</code>
     * @param value The spawnPointId to set.
     * @return This builder for chaining.
     */
    public Builder setSpawnPointId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spawnPointId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string spawn_point_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpawnPointId() {
      
      spawnPointId_ = getDefaultInstance().getSpawnPointId();
      onChanged();
      return this;
    }
    /**
     * <code>string spawn_point_id = 5;</code>
     * @param value The bytes for spawnPointId to set.
     * @return This builder for chaining.
     */
    public Builder setSpawnPointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spawnPointId_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Data.PokemonData pokemonData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder> pokemonDataBuilder_;
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
     * @return Whether the pokemonData field is set.
     */
    public boolean hasPokemonData() {
      return pokemonDataBuilder_ != null || pokemonData_ != null;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
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
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
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
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
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
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
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
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
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
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
     */
    public POGOProtos.Data.PokemonData.Builder getPokemonDataBuilder() {
      
      onChanged();
      return getPokemonDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
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
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 7;</code>
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

    private int timeTillHiddenMs_ ;
    /**
     * <code>int32 time_till_hidden_ms = 11;</code>
     * @return The timeTillHiddenMs.
     */
    @java.lang.Override
    public int getTimeTillHiddenMs() {
      return timeTillHiddenMs_;
    }
    /**
     * <code>int32 time_till_hidden_ms = 11;</code>
     * @param value The timeTillHiddenMs to set.
     * @return This builder for chaining.
     */
    public Builder setTimeTillHiddenMs(int value) {
      
      timeTillHiddenMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 time_till_hidden_ms = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeTillHiddenMs() {
      
      timeTillHiddenMs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Map.Pokemon.WildPokemon)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Map.Pokemon.WildPokemon)
  private static final POGOProtos.Map.Pokemon.WildPokemon DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Map.Pokemon.WildPokemon();
  }

  public static POGOProtos.Map.Pokemon.WildPokemon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WildPokemon>
      PARSER = new com.google.protobuf.AbstractParser<WildPokemon>() {
    @java.lang.Override
    public WildPokemon parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WildPokemon(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WildPokemon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WildPokemon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Map.Pokemon.WildPokemon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

