// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MapPokemonProto}
 */
public  final class MapPokemonProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MapPokemonProto)
    MapPokemonProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MapPokemonProto.newBuilder() to construct.
  private MapPokemonProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MapPokemonProto() {
    spawnpointId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MapPokemonProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MapPokemonProto(
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
            java.lang.String s = input.readStringRequireUtf8();

            spawnpointId_ = s;
            break;
          }
          case 17: {

            encounterId_ = input.readFixed64();
            break;
          }
          case 24: {

            pokedexTypeId_ = input.readInt32();
            break;
          }
          case 32: {

            expirationTimeMs_ = input.readInt64();
            break;
          }
          case 41: {

            latitude_ = input.readDouble();
            break;
          }
          case 49: {

            longitude_ = input.readDouble();
            break;
          }
          case 58: {
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (pokemonDisplay_ != null) {
              subBuilder = pokemonDisplay_.toBuilder();
            }
            pokemonDisplay_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemonDisplay_);
              pokemonDisplay_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MapPokemonProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MapPokemonProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MapPokemonProto.class, POGOProtos.Rpc.MapPokemonProto.Builder.class);
  }

  public static final int SPAWNPOINT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object spawnpointId_;
  /**
   * <code>string spawnpoint_id = 1;</code>
   * @return The spawnpointId.
   */
  public java.lang.String getSpawnpointId() {
    java.lang.Object ref = spawnpointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spawnpointId_ = s;
      return s;
    }
  }
  /**
   * <code>string spawnpoint_id = 1;</code>
   * @return The bytes for spawnpointId.
   */
  public com.google.protobuf.ByteString
      getSpawnpointIdBytes() {
    java.lang.Object ref = spawnpointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spawnpointId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENCOUNTER_ID_FIELD_NUMBER = 2;
  private long encounterId_;
  /**
   * <code>fixed64 encounter_id = 2;</code>
   * @return The encounterId.
   */
  public long getEncounterId() {
    return encounterId_;
  }

  public static final int POKEDEX_TYPE_ID_FIELD_NUMBER = 3;
  private int pokedexTypeId_;
  /**
   * <code>int32 pokedex_type_id = 3;</code>
   * @return The pokedexTypeId.
   */
  public int getPokedexTypeId() {
    return pokedexTypeId_;
  }

  public static final int EXPIRATION_TIME_MS_FIELD_NUMBER = 4;
  private long expirationTimeMs_;
  /**
   * <code>int64 expiration_time_ms = 4;</code>
   * @return The expirationTimeMs.
   */
  public long getExpirationTimeMs() {
    return expirationTimeMs_;
  }

  public static final int LATITUDE_FIELD_NUMBER = 5;
  private double latitude_;
  /**
   * <code>double latitude = 5;</code>
   * @return The latitude.
   */
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 6;
  private double longitude_;
  /**
   * <code>double longitude = 6;</code>
   * @return The longitude.
   */
  public double getLongitude() {
    return longitude_;
  }

  public static final int POKEMON_DISPLAY_FIELD_NUMBER = 7;
  private POGOProtos.Rpc.PokemonDisplayProto pokemonDisplay_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  public boolean hasPokemonDisplay() {
    return pokemonDisplay_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
   * @return The pokemonDisplay.
   */
  public POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay() {
    return pokemonDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
   */
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder() {
    return getPokemonDisplay();
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
    if (!getSpawnpointIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spawnpointId_);
    }
    if (encounterId_ != 0L) {
      output.writeFixed64(2, encounterId_);
    }
    if (pokedexTypeId_ != 0) {
      output.writeInt32(3, pokedexTypeId_);
    }
    if (expirationTimeMs_ != 0L) {
      output.writeInt64(4, expirationTimeMs_);
    }
    if (latitude_ != 0D) {
      output.writeDouble(5, latitude_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(6, longitude_);
    }
    if (pokemonDisplay_ != null) {
      output.writeMessage(7, getPokemonDisplay());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpawnpointIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spawnpointId_);
    }
    if (encounterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(2, encounterId_);
    }
    if (pokedexTypeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pokedexTypeId_);
    }
    if (expirationTimeMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, expirationTimeMs_);
    }
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, latitude_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, longitude_);
    }
    if (pokemonDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getPokemonDisplay());
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
    if (!(obj instanceof POGOProtos.Rpc.MapPokemonProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MapPokemonProto other = (POGOProtos.Rpc.MapPokemonProto) obj;

    if (!getSpawnpointId()
        .equals(other.getSpawnpointId())) return false;
    if (getEncounterId()
        != other.getEncounterId()) return false;
    if (getPokedexTypeId()
        != other.getPokedexTypeId()) return false;
    if (getExpirationTimeMs()
        != other.getExpirationTimeMs()) return false;
    if (java.lang.Double.doubleToLongBits(getLatitude())
        != java.lang.Double.doubleToLongBits(
            other.getLatitude())) return false;
    if (java.lang.Double.doubleToLongBits(getLongitude())
        != java.lang.Double.doubleToLongBits(
            other.getLongitude())) return false;
    if (hasPokemonDisplay() != other.hasPokemonDisplay()) return false;
    if (hasPokemonDisplay()) {
      if (!getPokemonDisplay()
          .equals(other.getPokemonDisplay())) return false;
    }
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
    hash = (37 * hash) + SPAWNPOINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSpawnpointId().hashCode();
    hash = (37 * hash) + ENCOUNTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEncounterId());
    hash = (37 * hash) + POKEDEX_TYPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPokedexTypeId();
    hash = (37 * hash) + EXPIRATION_TIME_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpirationTimeMs());
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    if (hasPokemonDisplay()) {
      hash = (37 * hash) + POKEMON_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonDisplay().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MapPokemonProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MapPokemonProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MapPokemonProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MapPokemonProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MapPokemonProto)
      POGOProtos.Rpc.MapPokemonProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MapPokemonProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MapPokemonProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MapPokemonProto.class, POGOProtos.Rpc.MapPokemonProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MapPokemonProto.newBuilder()
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
      spawnpointId_ = "";

      encounterId_ = 0L;

      pokedexTypeId_ = 0;

      expirationTimeMs_ = 0L;

      latitude_ = 0D;

      longitude_ = 0D;

      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = null;
      } else {
        pokemonDisplay_ = null;
        pokemonDisplayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MapPokemonProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MapPokemonProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.MapPokemonProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MapPokemonProto build() {
      POGOProtos.Rpc.MapPokemonProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MapPokemonProto buildPartial() {
      POGOProtos.Rpc.MapPokemonProto result = new POGOProtos.Rpc.MapPokemonProto(this);
      result.spawnpointId_ = spawnpointId_;
      result.encounterId_ = encounterId_;
      result.pokedexTypeId_ = pokedexTypeId_;
      result.expirationTimeMs_ = expirationTimeMs_;
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      if (pokemonDisplayBuilder_ == null) {
        result.pokemonDisplay_ = pokemonDisplay_;
      } else {
        result.pokemonDisplay_ = pokemonDisplayBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.MapPokemonProto) {
        return mergeFrom((POGOProtos.Rpc.MapPokemonProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MapPokemonProto other) {
      if (other == POGOProtos.Rpc.MapPokemonProto.getDefaultInstance()) return this;
      if (!other.getSpawnpointId().isEmpty()) {
        spawnpointId_ = other.spawnpointId_;
        onChanged();
      }
      if (other.getEncounterId() != 0L) {
        setEncounterId(other.getEncounterId());
      }
      if (other.getPokedexTypeId() != 0) {
        setPokedexTypeId(other.getPokedexTypeId());
      }
      if (other.getExpirationTimeMs() != 0L) {
        setExpirationTimeMs(other.getExpirationTimeMs());
      }
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (other.hasPokemonDisplay()) {
        mergePokemonDisplay(other.getPokemonDisplay());
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
      POGOProtos.Rpc.MapPokemonProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MapPokemonProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spawnpointId_ = "";
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @return The spawnpointId.
     */
    public java.lang.String getSpawnpointId() {
      java.lang.Object ref = spawnpointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spawnpointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @return The bytes for spawnpointId.
     */
    public com.google.protobuf.ByteString
        getSpawnpointIdBytes() {
      java.lang.Object ref = spawnpointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spawnpointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @param value The spawnpointId to set.
     * @return This builder for chaining.
     */
    public Builder setSpawnpointId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spawnpointId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpawnpointId() {
      
      spawnpointId_ = getDefaultInstance().getSpawnpointId();
      onChanged();
      return this;
    }
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @param value The bytes for spawnpointId to set.
     * @return This builder for chaining.
     */
    public Builder setSpawnpointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spawnpointId_ = value;
      onChanged();
      return this;
    }

    private long encounterId_ ;
    /**
     * <code>fixed64 encounter_id = 2;</code>
     * @return The encounterId.
     */
    public long getEncounterId() {
      return encounterId_;
    }
    /**
     * <code>fixed64 encounter_id = 2;</code>
     * @param value The encounterId to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterId(long value) {
      
      encounterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 encounter_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterId() {
      
      encounterId_ = 0L;
      onChanged();
      return this;
    }

    private int pokedexTypeId_ ;
    /**
     * <code>int32 pokedex_type_id = 3;</code>
     * @return The pokedexTypeId.
     */
    public int getPokedexTypeId() {
      return pokedexTypeId_;
    }
    /**
     * <code>int32 pokedex_type_id = 3;</code>
     * @param value The pokedexTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setPokedexTypeId(int value) {
      
      pokedexTypeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pokedex_type_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokedexTypeId() {
      
      pokedexTypeId_ = 0;
      onChanged();
      return this;
    }

    private long expirationTimeMs_ ;
    /**
     * <code>int64 expiration_time_ms = 4;</code>
     * @return The expirationTimeMs.
     */
    public long getExpirationTimeMs() {
      return expirationTimeMs_;
    }
    /**
     * <code>int64 expiration_time_ms = 4;</code>
     * @param value The expirationTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setExpirationTimeMs(long value) {
      
      expirationTimeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expiration_time_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpirationTimeMs() {
      
      expirationTimeMs_ = 0L;
      onChanged();
      return this;
    }

    private double latitude_ ;
    /**
     * <code>double latitude = 5;</code>
     * @return The latitude.
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>double latitude = 5;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double latitude = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>double longitude = 6;</code>
     * @return The longitude.
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>double longitude = 6;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double longitude = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto pokemonDisplay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> pokemonDisplayBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
     * @return Whether the pokemonDisplay field is set.
     */
    public boolean hasPokemonDisplay() {
      return pokemonDisplayBuilder_ != null || pokemonDisplay_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
     * @return The pokemonDisplay.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay() {
      if (pokemonDisplayBuilder_ == null) {
        return pokemonDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
      } else {
        return pokemonDisplayBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
     */
    public Builder setPokemonDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (pokemonDisplayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pokemonDisplay_ = value;
        onChanged();
      } else {
        pokemonDisplayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
     */
    public Builder setPokemonDisplay(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = builderForValue.build();
        onChanged();
      } else {
        pokemonDisplayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
     */
    public Builder mergePokemonDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (pokemonDisplayBuilder_ == null) {
        if (pokemonDisplay_ != null) {
          pokemonDisplay_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(pokemonDisplay_).mergeFrom(value).buildPartial();
        } else {
          pokemonDisplay_ = value;
        }
        onChanged();
      } else {
        pokemonDisplayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
     */
    public Builder clearPokemonDisplay() {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = null;
        onChanged();
      } else {
        pokemonDisplay_ = null;
        pokemonDisplayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getPokemonDisplayBuilder() {
      
      onChanged();
      return getPokemonDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder() {
      if (pokemonDisplayBuilder_ != null) {
        return pokemonDisplayBuilder_.getMessageOrBuilder();
      } else {
        return pokemonDisplay_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getPokemonDisplayFieldBuilder() {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getPokemonDisplay(),
                getParentForChildren(),
                isClean());
        pokemonDisplay_ = null;
      }
      return pokemonDisplayBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MapPokemonProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MapPokemonProto)
  private static final POGOProtos.Rpc.MapPokemonProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MapPokemonProto();
  }

  public static POGOProtos.Rpc.MapPokemonProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MapPokemonProto>
      PARSER = new com.google.protobuf.AbstractParser<MapPokemonProto>() {
    @java.lang.Override
    public MapPokemonProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MapPokemonProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MapPokemonProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MapPokemonProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MapPokemonProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

