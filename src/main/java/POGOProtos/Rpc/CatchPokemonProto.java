// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CatchPokemonProto}
 */
public final class CatchPokemonProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CatchPokemonProto)
    CatchPokemonProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CatchPokemonProto.newBuilder() to construct.
  private CatchPokemonProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CatchPokemonProto() {
    spawnPointGuid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CatchPokemonProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CatchPokemonProto(
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

            pokeball_ = input.readInt32();
            break;
          }
          case 25: {

            normalizedReticleSize_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            spawnPointGuid_ = s;
            break;
          }
          case 40: {

            hitPokemon_ = input.readBool();
            break;
          }
          case 49: {

            spinModifier_ = input.readDouble();
            break;
          }
          case 57: {

            normalizedHitPosition_ = input.readDouble();
            break;
          }
          case 66: {
            POGOProtos.Rpc.ARPlusEncounterValuesProto.Builder subBuilder = null;
            if (arPlusValues_ != null) {
              subBuilder = arPlusValues_.toBuilder();
            }
            arPlusValues_ = input.readMessage(POGOProtos.Rpc.ARPlusEncounterValuesProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(arPlusValues_);
              arPlusValues_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CatchPokemonProto.class, POGOProtos.Rpc.CatchPokemonProto.Builder.class);
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

  public static final int POKEBALL_FIELD_NUMBER = 2;
  private int pokeball_;
  /**
   * <code>int32 pokeball = 2;</code>
   * @return The pokeball.
   */
  @java.lang.Override
  public int getPokeball() {
    return pokeball_;
  }

  public static final int NORMALIZED_RETICLE_SIZE_FIELD_NUMBER = 3;
  private double normalizedReticleSize_;
  /**
   * <code>double normalized_reticle_size = 3;</code>
   * @return The normalizedReticleSize.
   */
  @java.lang.Override
  public double getNormalizedReticleSize() {
    return normalizedReticleSize_;
  }

  public static final int SPAWN_POINT_GUID_FIELD_NUMBER = 4;
  private volatile java.lang.Object spawnPointGuid_;
  /**
   * <code>string spawn_point_guid = 4;</code>
   * @return The spawnPointGuid.
   */
  @java.lang.Override
  public java.lang.String getSpawnPointGuid() {
    java.lang.Object ref = spawnPointGuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spawnPointGuid_ = s;
      return s;
    }
  }
  /**
   * <code>string spawn_point_guid = 4;</code>
   * @return The bytes for spawnPointGuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpawnPointGuidBytes() {
    java.lang.Object ref = spawnPointGuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spawnPointGuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HIT_POKEMON_FIELD_NUMBER = 5;
  private boolean hitPokemon_;
  /**
   * <code>bool hit_pokemon = 5;</code>
   * @return The hitPokemon.
   */
  @java.lang.Override
  public boolean getHitPokemon() {
    return hitPokemon_;
  }

  public static final int SPIN_MODIFIER_FIELD_NUMBER = 6;
  private double spinModifier_;
  /**
   * <code>double spin_modifier = 6;</code>
   * @return The spinModifier.
   */
  @java.lang.Override
  public double getSpinModifier() {
    return spinModifier_;
  }

  public static final int NORMALIZED_HIT_POSITION_FIELD_NUMBER = 7;
  private double normalizedHitPosition_;
  /**
   * <code>double normalized_hit_position = 7;</code>
   * @return The normalizedHitPosition.
   */
  @java.lang.Override
  public double getNormalizedHitPosition() {
    return normalizedHitPosition_;
  }

  public static final int AR_PLUS_VALUES_FIELD_NUMBER = 8;
  private POGOProtos.Rpc.ARPlusEncounterValuesProto arPlusValues_;
  /**
   * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
   * @return Whether the arPlusValues field is set.
   */
  @java.lang.Override
  public boolean hasArPlusValues() {
    return arPlusValues_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
   * @return The arPlusValues.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ARPlusEncounterValuesProto getArPlusValues() {
    return arPlusValues_ == null ? POGOProtos.Rpc.ARPlusEncounterValuesProto.getDefaultInstance() : arPlusValues_;
  }
  /**
   * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ARPlusEncounterValuesProtoOrBuilder getArPlusValuesOrBuilder() {
    return getArPlusValues();
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
    if (pokeball_ != 0) {
      output.writeInt32(2, pokeball_);
    }
    if (normalizedReticleSize_ != 0D) {
      output.writeDouble(3, normalizedReticleSize_);
    }
    if (!getSpawnPointGuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, spawnPointGuid_);
    }
    if (hitPokemon_ != false) {
      output.writeBool(5, hitPokemon_);
    }
    if (spinModifier_ != 0D) {
      output.writeDouble(6, spinModifier_);
    }
    if (normalizedHitPosition_ != 0D) {
      output.writeDouble(7, normalizedHitPosition_);
    }
    if (arPlusValues_ != null) {
      output.writeMessage(8, getArPlusValues());
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
    if (pokeball_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pokeball_);
    }
    if (normalizedReticleSize_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, normalizedReticleSize_);
    }
    if (!getSpawnPointGuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, spawnPointGuid_);
    }
    if (hitPokemon_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, hitPokemon_);
    }
    if (spinModifier_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, spinModifier_);
    }
    if (normalizedHitPosition_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, normalizedHitPosition_);
    }
    if (arPlusValues_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, getArPlusValues());
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
    if (!(obj instanceof POGOProtos.Rpc.CatchPokemonProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CatchPokemonProto other = (POGOProtos.Rpc.CatchPokemonProto) obj;

    if (getEncounterId()
        != other.getEncounterId()) return false;
    if (getPokeball()
        != other.getPokeball()) return false;
    if (java.lang.Double.doubleToLongBits(getNormalizedReticleSize())
        != java.lang.Double.doubleToLongBits(
            other.getNormalizedReticleSize())) return false;
    if (!getSpawnPointGuid()
        .equals(other.getSpawnPointGuid())) return false;
    if (getHitPokemon()
        != other.getHitPokemon()) return false;
    if (java.lang.Double.doubleToLongBits(getSpinModifier())
        != java.lang.Double.doubleToLongBits(
            other.getSpinModifier())) return false;
    if (java.lang.Double.doubleToLongBits(getNormalizedHitPosition())
        != java.lang.Double.doubleToLongBits(
            other.getNormalizedHitPosition())) return false;
    if (hasArPlusValues() != other.hasArPlusValues()) return false;
    if (hasArPlusValues()) {
      if (!getArPlusValues()
          .equals(other.getArPlusValues())) return false;
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
    hash = (37 * hash) + ENCOUNTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEncounterId());
    hash = (37 * hash) + POKEBALL_FIELD_NUMBER;
    hash = (53 * hash) + getPokeball();
    hash = (37 * hash) + NORMALIZED_RETICLE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNormalizedReticleSize()));
    hash = (37 * hash) + SPAWN_POINT_GUID_FIELD_NUMBER;
    hash = (53 * hash) + getSpawnPointGuid().hashCode();
    hash = (37 * hash) + HIT_POKEMON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHitPokemon());
    hash = (37 * hash) + SPIN_MODIFIER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSpinModifier()));
    hash = (37 * hash) + NORMALIZED_HIT_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNormalizedHitPosition()));
    if (hasArPlusValues()) {
      hash = (37 * hash) + AR_PLUS_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getArPlusValues().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CatchPokemonProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CatchPokemonProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CatchPokemonProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CatchPokemonProto)
      POGOProtos.Rpc.CatchPokemonProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CatchPokemonProto.class, POGOProtos.Rpc.CatchPokemonProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CatchPokemonProto.newBuilder()
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

      pokeball_ = 0;

      normalizedReticleSize_ = 0D;

      spawnPointGuid_ = "";

      hitPokemon_ = false;

      spinModifier_ = 0D;

      normalizedHitPosition_ = 0D;

      if (arPlusValuesBuilder_ == null) {
        arPlusValues_ = null;
      } else {
        arPlusValues_ = null;
        arPlusValuesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CatchPokemonProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CatchPokemonProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CatchPokemonProto build() {
      POGOProtos.Rpc.CatchPokemonProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CatchPokemonProto buildPartial() {
      POGOProtos.Rpc.CatchPokemonProto result = new POGOProtos.Rpc.CatchPokemonProto(this);
      result.encounterId_ = encounterId_;
      result.pokeball_ = pokeball_;
      result.normalizedReticleSize_ = normalizedReticleSize_;
      result.spawnPointGuid_ = spawnPointGuid_;
      result.hitPokemon_ = hitPokemon_;
      result.spinModifier_ = spinModifier_;
      result.normalizedHitPosition_ = normalizedHitPosition_;
      if (arPlusValuesBuilder_ == null) {
        result.arPlusValues_ = arPlusValues_;
      } else {
        result.arPlusValues_ = arPlusValuesBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CatchPokemonProto) {
        return mergeFrom((POGOProtos.Rpc.CatchPokemonProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CatchPokemonProto other) {
      if (other == POGOProtos.Rpc.CatchPokemonProto.getDefaultInstance()) return this;
      if (other.getEncounterId() != 0L) {
        setEncounterId(other.getEncounterId());
      }
      if (other.getPokeball() != 0) {
        setPokeball(other.getPokeball());
      }
      if (other.getNormalizedReticleSize() != 0D) {
        setNormalizedReticleSize(other.getNormalizedReticleSize());
      }
      if (!other.getSpawnPointGuid().isEmpty()) {
        spawnPointGuid_ = other.spawnPointGuid_;
        onChanged();
      }
      if (other.getHitPokemon() != false) {
        setHitPokemon(other.getHitPokemon());
      }
      if (other.getSpinModifier() != 0D) {
        setSpinModifier(other.getSpinModifier());
      }
      if (other.getNormalizedHitPosition() != 0D) {
        setNormalizedHitPosition(other.getNormalizedHitPosition());
      }
      if (other.hasArPlusValues()) {
        mergeArPlusValues(other.getArPlusValues());
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
      POGOProtos.Rpc.CatchPokemonProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CatchPokemonProto) e.getUnfinishedMessage();
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

    private int pokeball_ ;
    /**
     * <code>int32 pokeball = 2;</code>
     * @return The pokeball.
     */
    @java.lang.Override
    public int getPokeball() {
      return pokeball_;
    }
    /**
     * <code>int32 pokeball = 2;</code>
     * @param value The pokeball to set.
     * @return This builder for chaining.
     */
    public Builder setPokeball(int value) {
      
      pokeball_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pokeball = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokeball() {
      
      pokeball_ = 0;
      onChanged();
      return this;
    }

    private double normalizedReticleSize_ ;
    /**
     * <code>double normalized_reticle_size = 3;</code>
     * @return The normalizedReticleSize.
     */
    @java.lang.Override
    public double getNormalizedReticleSize() {
      return normalizedReticleSize_;
    }
    /**
     * <code>double normalized_reticle_size = 3;</code>
     * @param value The normalizedReticleSize to set.
     * @return This builder for chaining.
     */
    public Builder setNormalizedReticleSize(double value) {
      
      normalizedReticleSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double normalized_reticle_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNormalizedReticleSize() {
      
      normalizedReticleSize_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object spawnPointGuid_ = "";
    /**
     * <code>string spawn_point_guid = 4;</code>
     * @return The spawnPointGuid.
     */
    public java.lang.String getSpawnPointGuid() {
      java.lang.Object ref = spawnPointGuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spawnPointGuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string spawn_point_guid = 4;</code>
     * @return The bytes for spawnPointGuid.
     */
    public com.google.protobuf.ByteString
        getSpawnPointGuidBytes() {
      java.lang.Object ref = spawnPointGuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spawnPointGuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string spawn_point_guid = 4;</code>
     * @param value The spawnPointGuid to set.
     * @return This builder for chaining.
     */
    public Builder setSpawnPointGuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spawnPointGuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string spawn_point_guid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpawnPointGuid() {
      
      spawnPointGuid_ = getDefaultInstance().getSpawnPointGuid();
      onChanged();
      return this;
    }
    /**
     * <code>string spawn_point_guid = 4;</code>
     * @param value The bytes for spawnPointGuid to set.
     * @return This builder for chaining.
     */
    public Builder setSpawnPointGuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spawnPointGuid_ = value;
      onChanged();
      return this;
    }

    private boolean hitPokemon_ ;
    /**
     * <code>bool hit_pokemon = 5;</code>
     * @return The hitPokemon.
     */
    @java.lang.Override
    public boolean getHitPokemon() {
      return hitPokemon_;
    }
    /**
     * <code>bool hit_pokemon = 5;</code>
     * @param value The hitPokemon to set.
     * @return This builder for chaining.
     */
    public Builder setHitPokemon(boolean value) {
      
      hitPokemon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool hit_pokemon = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHitPokemon() {
      
      hitPokemon_ = false;
      onChanged();
      return this;
    }

    private double spinModifier_ ;
    /**
     * <code>double spin_modifier = 6;</code>
     * @return The spinModifier.
     */
    @java.lang.Override
    public double getSpinModifier() {
      return spinModifier_;
    }
    /**
     * <code>double spin_modifier = 6;</code>
     * @param value The spinModifier to set.
     * @return This builder for chaining.
     */
    public Builder setSpinModifier(double value) {
      
      spinModifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double spin_modifier = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpinModifier() {
      
      spinModifier_ = 0D;
      onChanged();
      return this;
    }

    private double normalizedHitPosition_ ;
    /**
     * <code>double normalized_hit_position = 7;</code>
     * @return The normalizedHitPosition.
     */
    @java.lang.Override
    public double getNormalizedHitPosition() {
      return normalizedHitPosition_;
    }
    /**
     * <code>double normalized_hit_position = 7;</code>
     * @param value The normalizedHitPosition to set.
     * @return This builder for chaining.
     */
    public Builder setNormalizedHitPosition(double value) {
      
      normalizedHitPosition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double normalized_hit_position = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNormalizedHitPosition() {
      
      normalizedHitPosition_ = 0D;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ARPlusEncounterValuesProto arPlusValues_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ARPlusEncounterValuesProto, POGOProtos.Rpc.ARPlusEncounterValuesProto.Builder, POGOProtos.Rpc.ARPlusEncounterValuesProtoOrBuilder> arPlusValuesBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
     * @return Whether the arPlusValues field is set.
     */
    public boolean hasArPlusValues() {
      return arPlusValuesBuilder_ != null || arPlusValues_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
     * @return The arPlusValues.
     */
    public POGOProtos.Rpc.ARPlusEncounterValuesProto getArPlusValues() {
      if (arPlusValuesBuilder_ == null) {
        return arPlusValues_ == null ? POGOProtos.Rpc.ARPlusEncounterValuesProto.getDefaultInstance() : arPlusValues_;
      } else {
        return arPlusValuesBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
     */
    public Builder setArPlusValues(POGOProtos.Rpc.ARPlusEncounterValuesProto value) {
      if (arPlusValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        arPlusValues_ = value;
        onChanged();
      } else {
        arPlusValuesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
     */
    public Builder setArPlusValues(
        POGOProtos.Rpc.ARPlusEncounterValuesProto.Builder builderForValue) {
      if (arPlusValuesBuilder_ == null) {
        arPlusValues_ = builderForValue.build();
        onChanged();
      } else {
        arPlusValuesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
     */
    public Builder mergeArPlusValues(POGOProtos.Rpc.ARPlusEncounterValuesProto value) {
      if (arPlusValuesBuilder_ == null) {
        if (arPlusValues_ != null) {
          arPlusValues_ =
            POGOProtos.Rpc.ARPlusEncounterValuesProto.newBuilder(arPlusValues_).mergeFrom(value).buildPartial();
        } else {
          arPlusValues_ = value;
        }
        onChanged();
      } else {
        arPlusValuesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
     */
    public Builder clearArPlusValues() {
      if (arPlusValuesBuilder_ == null) {
        arPlusValues_ = null;
        onChanged();
      } else {
        arPlusValues_ = null;
        arPlusValuesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
     */
    public POGOProtos.Rpc.ARPlusEncounterValuesProto.Builder getArPlusValuesBuilder() {
      
      onChanged();
      return getArPlusValuesFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
     */
    public POGOProtos.Rpc.ARPlusEncounterValuesProtoOrBuilder getArPlusValuesOrBuilder() {
      if (arPlusValuesBuilder_ != null) {
        return arPlusValuesBuilder_.getMessageOrBuilder();
      } else {
        return arPlusValues_ == null ?
            POGOProtos.Rpc.ARPlusEncounterValuesProto.getDefaultInstance() : arPlusValues_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ARPlusEncounterValuesProto ar_plus_values = 8;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ARPlusEncounterValuesProto, POGOProtos.Rpc.ARPlusEncounterValuesProto.Builder, POGOProtos.Rpc.ARPlusEncounterValuesProtoOrBuilder> 
        getArPlusValuesFieldBuilder() {
      if (arPlusValuesBuilder_ == null) {
        arPlusValuesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ARPlusEncounterValuesProto, POGOProtos.Rpc.ARPlusEncounterValuesProto.Builder, POGOProtos.Rpc.ARPlusEncounterValuesProtoOrBuilder>(
                getArPlusValues(),
                getParentForChildren(),
                isClean());
        arPlusValues_ = null;
      }
      return arPlusValuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CatchPokemonProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CatchPokemonProto)
  private static final POGOProtos.Rpc.CatchPokemonProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CatchPokemonProto();
  }

  public static POGOProtos.Rpc.CatchPokemonProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CatchPokemonProto>
      PARSER = new com.google.protobuf.AbstractParser<CatchPokemonProto>() {
    @java.lang.Override
    public CatchPokemonProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CatchPokemonProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CatchPokemonProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CatchPokemonProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CatchPokemonProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

