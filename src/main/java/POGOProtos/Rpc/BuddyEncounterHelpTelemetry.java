// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BuddyEncounterHelpTelemetry}
 */
public final class BuddyEncounterHelpTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BuddyEncounterHelpTelemetry)
    BuddyEncounterHelpTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuddyEncounterHelpTelemetry.newBuilder() to construct.
  private BuddyEncounterHelpTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuddyEncounterHelpTelemetry() {
    pokemonId_ = 0;
    encounterType_ = "";
    encounter_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuddyEncounterHelpTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuddyEncounterHelpTelemetry(
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

            pokemonId_ = rawValue;
            break;
          }
          case 16: {

            cp_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            encounterType_ = s;
            break;
          }
          case 32: {

            arClassicEnabled_ = input.readBool();
            break;
          }
          case 40: {

            arPlusEnabled_ = input.readBool();
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            encounter_ = rawValue;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyEncounterHelpTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyEncounterHelpTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BuddyEncounterHelpTelemetry.class, POGOProtos.Rpc.BuddyEncounterHelpTelemetry.Builder.class);
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 1;
  private int pokemonId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  @java.lang.Override public int getPokemonIdValue() {
    return pokemonId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int CP_FIELD_NUMBER = 2;
  private int cp_;
  /**
   * <code>int32 cp = 2;</code>
   * @return The cp.
   */
  @java.lang.Override
  public int getCp() {
    return cp_;
  }

  public static final int ENCOUNTER_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object encounterType_;
  /**
   * <code>string encounter_type = 3;</code>
   * @return The encounterType.
   */
  @java.lang.Override
  public java.lang.String getEncounterType() {
    java.lang.Object ref = encounterType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encounterType_ = s;
      return s;
    }
  }
  /**
   * <code>string encounter_type = 3;</code>
   * @return The bytes for encounterType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncounterTypeBytes() {
    java.lang.Object ref = encounterType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encounterType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AR_CLASSIC_ENABLED_FIELD_NUMBER = 4;
  private boolean arClassicEnabled_;
  /**
   * <code>bool ar_classic_enabled = 4;</code>
   * @return The arClassicEnabled.
   */
  @java.lang.Override
  public boolean getArClassicEnabled() {
    return arClassicEnabled_;
  }

  public static final int AR_PLUS_ENABLED_FIELD_NUMBER = 5;
  private boolean arPlusEnabled_;
  /**
   * <code>bool ar_plus_enabled = 5;</code>
   * @return The arPlusEnabled.
   */
  @java.lang.Override
  public boolean getArPlusEnabled() {
    return arPlusEnabled_;
  }

  public static final int ENCOUNTER_FIELD_NUMBER = 6;
  private int encounter_;
  /**
   * <code>.POGOProtos.Rpc.EncounterType encounter = 6;</code>
   * @return The enum numeric value on the wire for encounter.
   */
  @java.lang.Override public int getEncounterValue() {
    return encounter_;
  }
  /**
   * <code>.POGOProtos.Rpc.EncounterType encounter = 6;</code>
   * @return The encounter.
   */
  @java.lang.Override public POGOProtos.Rpc.EncounterType getEncounter() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EncounterType result = POGOProtos.Rpc.EncounterType.valueOf(encounter_);
    return result == null ? POGOProtos.Rpc.EncounterType.UNRECOGNIZED : result;
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
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(1, pokemonId_);
    }
    if (cp_ != 0) {
      output.writeInt32(2, cp_);
    }
    if (!getEncounterTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, encounterType_);
    }
    if (arClassicEnabled_ != false) {
      output.writeBool(4, arClassicEnabled_);
    }
    if (arPlusEnabled_ != false) {
      output.writeBool(5, arPlusEnabled_);
    }
    if (encounter_ != POGOProtos.Rpc.EncounterType.ENCOUNTER_TYPE_SPAWN_POINT.getNumber()) {
      output.writeEnum(6, encounter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pokemonId_);
    }
    if (cp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, cp_);
    }
    if (!getEncounterTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, encounterType_);
    }
    if (arClassicEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, arClassicEnabled_);
    }
    if (arPlusEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, arPlusEnabled_);
    }
    if (encounter_ != POGOProtos.Rpc.EncounterType.ENCOUNTER_TYPE_SPAWN_POINT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, encounter_);
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
    if (!(obj instanceof POGOProtos.Rpc.BuddyEncounterHelpTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BuddyEncounterHelpTelemetry other = (POGOProtos.Rpc.BuddyEncounterHelpTelemetry) obj;

    if (pokemonId_ != other.pokemonId_) return false;
    if (getCp()
        != other.getCp()) return false;
    if (!getEncounterType()
        .equals(other.getEncounterType())) return false;
    if (getArClassicEnabled()
        != other.getArClassicEnabled()) return false;
    if (getArPlusEnabled()
        != other.getArPlusEnabled()) return false;
    if (encounter_ != other.encounter_) return false;
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
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + pokemonId_;
    hash = (37 * hash) + CP_FIELD_NUMBER;
    hash = (53 * hash) + getCp();
    hash = (37 * hash) + ENCOUNTER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEncounterType().hashCode();
    hash = (37 * hash) + AR_CLASSIC_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getArClassicEnabled());
    hash = (37 * hash) + AR_PLUS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getArPlusEnabled());
    hash = (37 * hash) + ENCOUNTER_FIELD_NUMBER;
    hash = (53 * hash) + encounter_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BuddyEncounterHelpTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BuddyEncounterHelpTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BuddyEncounterHelpTelemetry)
      POGOProtos.Rpc.BuddyEncounterHelpTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyEncounterHelpTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyEncounterHelpTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BuddyEncounterHelpTelemetry.class, POGOProtos.Rpc.BuddyEncounterHelpTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BuddyEncounterHelpTelemetry.newBuilder()
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
      pokemonId_ = 0;

      cp_ = 0;

      encounterType_ = "";

      arClassicEnabled_ = false;

      arPlusEnabled_ = false;

      encounter_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyEncounterHelpTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyEncounterHelpTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.BuddyEncounterHelpTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyEncounterHelpTelemetry build() {
      POGOProtos.Rpc.BuddyEncounterHelpTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyEncounterHelpTelemetry buildPartial() {
      POGOProtos.Rpc.BuddyEncounterHelpTelemetry result = new POGOProtos.Rpc.BuddyEncounterHelpTelemetry(this);
      result.pokemonId_ = pokemonId_;
      result.cp_ = cp_;
      result.encounterType_ = encounterType_;
      result.arClassicEnabled_ = arClassicEnabled_;
      result.arPlusEnabled_ = arPlusEnabled_;
      result.encounter_ = encounter_;
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
      if (other instanceof POGOProtos.Rpc.BuddyEncounterHelpTelemetry) {
        return mergeFrom((POGOProtos.Rpc.BuddyEncounterHelpTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BuddyEncounterHelpTelemetry other) {
      if (other == POGOProtos.Rpc.BuddyEncounterHelpTelemetry.getDefaultInstance()) return this;
      if (other.pokemonId_ != 0) {
        setPokemonIdValue(other.getPokemonIdValue());
      }
      if (other.getCp() != 0) {
        setCp(other.getCp());
      }
      if (!other.getEncounterType().isEmpty()) {
        encounterType_ = other.encounterType_;
        onChanged();
      }
      if (other.getArClassicEnabled() != false) {
        setArClassicEnabled(other.getArClassicEnabled());
      }
      if (other.getArPlusEnabled() != false) {
        setArPlusEnabled(other.getArPlusEnabled());
      }
      if (other.encounter_ != 0) {
        setEncounterValue(other.getEncounterValue());
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
      POGOProtos.Rpc.BuddyEncounterHelpTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BuddyEncounterHelpTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pokemonId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return The enum numeric value on the wire for pokemonId.
     */
    @java.lang.Override public int getPokemonIdValue() {
      return pokemonId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @param value The enum numeric value on the wire for pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonIdValue(int value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokemonId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0;
      onChanged();
      return this;
    }

    private int cp_ ;
    /**
     * <code>int32 cp = 2;</code>
     * @return The cp.
     */
    @java.lang.Override
    public int getCp() {
      return cp_;
    }
    /**
     * <code>int32 cp = 2;</code>
     * @param value The cp to set.
     * @return This builder for chaining.
     */
    public Builder setCp(int value) {
      
      cp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCp() {
      
      cp_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object encounterType_ = "";
    /**
     * <code>string encounter_type = 3;</code>
     * @return The encounterType.
     */
    public java.lang.String getEncounterType() {
      java.lang.Object ref = encounterType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encounterType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string encounter_type = 3;</code>
     * @return The bytes for encounterType.
     */
    public com.google.protobuf.ByteString
        getEncounterTypeBytes() {
      java.lang.Object ref = encounterType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encounterType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string encounter_type = 3;</code>
     * @param value The encounterType to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encounterType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string encounter_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterType() {
      
      encounterType_ = getDefaultInstance().getEncounterType();
      onChanged();
      return this;
    }
    /**
     * <code>string encounter_type = 3;</code>
     * @param value The bytes for encounterType to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      encounterType_ = value;
      onChanged();
      return this;
    }

    private boolean arClassicEnabled_ ;
    /**
     * <code>bool ar_classic_enabled = 4;</code>
     * @return The arClassicEnabled.
     */
    @java.lang.Override
    public boolean getArClassicEnabled() {
      return arClassicEnabled_;
    }
    /**
     * <code>bool ar_classic_enabled = 4;</code>
     * @param value The arClassicEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setArClassicEnabled(boolean value) {
      
      arClassicEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ar_classic_enabled = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearArClassicEnabled() {
      
      arClassicEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean arPlusEnabled_ ;
    /**
     * <code>bool ar_plus_enabled = 5;</code>
     * @return The arPlusEnabled.
     */
    @java.lang.Override
    public boolean getArPlusEnabled() {
      return arPlusEnabled_;
    }
    /**
     * <code>bool ar_plus_enabled = 5;</code>
     * @param value The arPlusEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setArPlusEnabled(boolean value) {
      
      arPlusEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ar_plus_enabled = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearArPlusEnabled() {
      
      arPlusEnabled_ = false;
      onChanged();
      return this;
    }

    private int encounter_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter = 6;</code>
     * @return The enum numeric value on the wire for encounter.
     */
    @java.lang.Override public int getEncounterValue() {
      return encounter_;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter = 6;</code>
     * @param value The enum numeric value on the wire for encounter to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterValue(int value) {
      
      encounter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter = 6;</code>
     * @return The encounter.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EncounterType getEncounter() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EncounterType result = POGOProtos.Rpc.EncounterType.valueOf(encounter_);
      return result == null ? POGOProtos.Rpc.EncounterType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter = 6;</code>
     * @param value The encounter to set.
     * @return This builder for chaining.
     */
    public Builder setEncounter(POGOProtos.Rpc.EncounterType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      encounter_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounter() {
      
      encounter_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BuddyEncounterHelpTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BuddyEncounterHelpTelemetry)
  private static final POGOProtos.Rpc.BuddyEncounterHelpTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BuddyEncounterHelpTelemetry();
  }

  public static POGOProtos.Rpc.BuddyEncounterHelpTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuddyEncounterHelpTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<BuddyEncounterHelpTelemetry>() {
    @java.lang.Override
    public BuddyEncounterHelpTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuddyEncounterHelpTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuddyEncounterHelpTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuddyEncounterHelpTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BuddyEncounterHelpTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

