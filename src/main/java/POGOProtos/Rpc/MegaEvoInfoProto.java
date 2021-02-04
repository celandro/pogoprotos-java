// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MegaEvoInfoProto}
 */
public final class MegaEvoInfoProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MegaEvoInfoProto)
    MegaEvoInfoProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MegaEvoInfoProto.newBuilder() to construct.
  private MegaEvoInfoProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MegaEvoInfoProto() {
    pokedexId_ = 0;
    tempEvoId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MegaEvoInfoProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MegaEvoInfoProto(
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

            pokedexId_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            tempEvoId_ = rawValue;
            break;
          }
          case 24: {

            evoExpirationTimeMs_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MegaEvoInfoProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MegaEvoInfoProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MegaEvoInfoProto.class, POGOProtos.Rpc.MegaEvoInfoProto.Builder.class);
  }

  public static final int POKEDEX_ID_FIELD_NUMBER = 1;
  private int pokedexId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 1;</code>
   * @return The enum numeric value on the wire for pokedexId.
   */
  @java.lang.Override public int getPokedexIdValue() {
    return pokedexId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 1;</code>
   * @return The pokedexId.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getPokedexId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokedexId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int TEMP_EVO_ID_FIELD_NUMBER = 2;
  private int tempEvoId_;
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temp_evo_id = 2;</code>
   * @return The enum numeric value on the wire for tempEvoId.
   */
  @java.lang.Override public int getTempEvoIdValue() {
    return tempEvoId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temp_evo_id = 2;</code>
   * @return The tempEvoId.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloTemporaryEvolutionId getTempEvoId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloTemporaryEvolutionId result = POGOProtos.Rpc.HoloTemporaryEvolutionId.valueOf(tempEvoId_);
    return result == null ? POGOProtos.Rpc.HoloTemporaryEvolutionId.UNRECOGNIZED : result;
  }

  public static final int EVO_EXPIRATION_TIME_MS_FIELD_NUMBER = 3;
  private long evoExpirationTimeMs_;
  /**
   * <code>int64 evo_expiration_time_ms = 3;</code>
   * @return The evoExpirationTimeMs.
   */
  @java.lang.Override
  public long getEvoExpirationTimeMs() {
    return evoExpirationTimeMs_;
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
    if (pokedexId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(1, pokedexId_);
    }
    if (tempEvoId_ != POGOProtos.Rpc.HoloTemporaryEvolutionId.TEMP_EVOLUTION_UNSET.getNumber()) {
      output.writeEnum(2, tempEvoId_);
    }
    if (evoExpirationTimeMs_ != 0L) {
      output.writeInt64(3, evoExpirationTimeMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokedexId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pokedexId_);
    }
    if (tempEvoId_ != POGOProtos.Rpc.HoloTemporaryEvolutionId.TEMP_EVOLUTION_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, tempEvoId_);
    }
    if (evoExpirationTimeMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, evoExpirationTimeMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.MegaEvoInfoProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MegaEvoInfoProto other = (POGOProtos.Rpc.MegaEvoInfoProto) obj;

    if (pokedexId_ != other.pokedexId_) return false;
    if (tempEvoId_ != other.tempEvoId_) return false;
    if (getEvoExpirationTimeMs()
        != other.getEvoExpirationTimeMs()) return false;
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
    hash = (37 * hash) + POKEDEX_ID_FIELD_NUMBER;
    hash = (53 * hash) + pokedexId_;
    hash = (37 * hash) + TEMP_EVO_ID_FIELD_NUMBER;
    hash = (53 * hash) + tempEvoId_;
    hash = (37 * hash) + EVO_EXPIRATION_TIME_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEvoExpirationTimeMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MegaEvoInfoProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MegaEvoInfoProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MegaEvoInfoProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MegaEvoInfoProto)
      POGOProtos.Rpc.MegaEvoInfoProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MegaEvoInfoProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MegaEvoInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MegaEvoInfoProto.class, POGOProtos.Rpc.MegaEvoInfoProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MegaEvoInfoProto.newBuilder()
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
      pokedexId_ = 0;

      tempEvoId_ = 0;

      evoExpirationTimeMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MegaEvoInfoProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MegaEvoInfoProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.MegaEvoInfoProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MegaEvoInfoProto build() {
      POGOProtos.Rpc.MegaEvoInfoProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MegaEvoInfoProto buildPartial() {
      POGOProtos.Rpc.MegaEvoInfoProto result = new POGOProtos.Rpc.MegaEvoInfoProto(this);
      result.pokedexId_ = pokedexId_;
      result.tempEvoId_ = tempEvoId_;
      result.evoExpirationTimeMs_ = evoExpirationTimeMs_;
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
      if (other instanceof POGOProtos.Rpc.MegaEvoInfoProto) {
        return mergeFrom((POGOProtos.Rpc.MegaEvoInfoProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MegaEvoInfoProto other) {
      if (other == POGOProtos.Rpc.MegaEvoInfoProto.getDefaultInstance()) return this;
      if (other.pokedexId_ != 0) {
        setPokedexIdValue(other.getPokedexIdValue());
      }
      if (other.tempEvoId_ != 0) {
        setTempEvoIdValue(other.getTempEvoIdValue());
      }
      if (other.getEvoExpirationTimeMs() != 0L) {
        setEvoExpirationTimeMs(other.getEvoExpirationTimeMs());
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
      POGOProtos.Rpc.MegaEvoInfoProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MegaEvoInfoProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pokedexId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 1;</code>
     * @return The enum numeric value on the wire for pokedexId.
     */
    @java.lang.Override public int getPokedexIdValue() {
      return pokedexId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 1;</code>
     * @param value The enum numeric value on the wire for pokedexId to set.
     * @return This builder for chaining.
     */
    public Builder setPokedexIdValue(int value) {
      
      pokedexId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 1;</code>
     * @return The pokedexId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getPokedexId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokedexId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 1;</code>
     * @param value The pokedexId to set.
     * @return This builder for chaining.
     */
    public Builder setPokedexId(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokedexId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokedex_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokedexId() {
      
      pokedexId_ = 0;
      onChanged();
      return this;
    }

    private int tempEvoId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temp_evo_id = 2;</code>
     * @return The enum numeric value on the wire for tempEvoId.
     */
    @java.lang.Override public int getTempEvoIdValue() {
      return tempEvoId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temp_evo_id = 2;</code>
     * @param value The enum numeric value on the wire for tempEvoId to set.
     * @return This builder for chaining.
     */
    public Builder setTempEvoIdValue(int value) {
      
      tempEvoId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temp_evo_id = 2;</code>
     * @return The tempEvoId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloTemporaryEvolutionId getTempEvoId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloTemporaryEvolutionId result = POGOProtos.Rpc.HoloTemporaryEvolutionId.valueOf(tempEvoId_);
      return result == null ? POGOProtos.Rpc.HoloTemporaryEvolutionId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temp_evo_id = 2;</code>
     * @param value The tempEvoId to set.
     * @return This builder for chaining.
     */
    public Builder setTempEvoId(POGOProtos.Rpc.HoloTemporaryEvolutionId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      tempEvoId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temp_evo_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTempEvoId() {
      
      tempEvoId_ = 0;
      onChanged();
      return this;
    }

    private long evoExpirationTimeMs_ ;
    /**
     * <code>int64 evo_expiration_time_ms = 3;</code>
     * @return The evoExpirationTimeMs.
     */
    @java.lang.Override
    public long getEvoExpirationTimeMs() {
      return evoExpirationTimeMs_;
    }
    /**
     * <code>int64 evo_expiration_time_ms = 3;</code>
     * @param value The evoExpirationTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setEvoExpirationTimeMs(long value) {
      
      evoExpirationTimeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 evo_expiration_time_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvoExpirationTimeMs() {
      
      evoExpirationTimeMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MegaEvoInfoProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MegaEvoInfoProto)
  private static final POGOProtos.Rpc.MegaEvoInfoProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MegaEvoInfoProto();
  }

  public static POGOProtos.Rpc.MegaEvoInfoProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MegaEvoInfoProto>
      PARSER = new com.google.protobuf.AbstractParser<MegaEvoInfoProto>() {
    @java.lang.Override
    public MegaEvoInfoProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MegaEvoInfoProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MegaEvoInfoProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MegaEvoInfoProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MegaEvoInfoProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
