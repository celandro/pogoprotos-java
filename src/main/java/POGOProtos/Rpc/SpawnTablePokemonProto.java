// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EOPAHIOMFIP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.SpawnTablePokemonProto}
 */
public final class SpawnTablePokemonProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SpawnTablePokemonProto)
    SpawnTablePokemonProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpawnTablePokemonProto.newBuilder() to construct.
  private SpawnTablePokemonProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpawnTablePokemonProto() {
    mfkgkhdmbpb_ = 0;
    kgpgpmhinjm_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpawnTablePokemonProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpawnTablePokemonProto(
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

            mfkgkhdmbpb_ = rawValue;
            break;
          }
          case 21: {

            gbgpdefedmo_ = input.readFloat();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            kgpgpmhinjm_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SpawnTablePokemonProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SpawnTablePokemonProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SpawnTablePokemonProto.class, POGOProtos.Rpc.SpawnTablePokemonProto.Builder.class);
  }

  public static final int MFKGKHDMBPB_FIELD_NUMBER = 1;
  private int mfkgkhdmbpb_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId mfkgkhdmbpb = 1;</code>
   * @return The enum numeric value on the wire for mfkgkhdmbpb.
   */
  @java.lang.Override public int getMfkgkhdmbpbValue() {
    return mfkgkhdmbpb_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId mfkgkhdmbpb = 1;</code>
   * @return The mfkgkhdmbpb.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getMfkgkhdmbpb() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(mfkgkhdmbpb_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int GBGPDEFEDMO_FIELD_NUMBER = 2;
  private float gbgpdefedmo_;
  /**
   * <code>float gbgpdefedmo = 2;</code>
   * @return The gbgpdefedmo.
   */
  @java.lang.Override
  public float getGbgpdefedmo() {
    return gbgpdefedmo_;
  }

  public static final int KGPGPMHINJM_FIELD_NUMBER = 3;
  private int kgpgpmhinjm_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form kgpgpmhinjm = 3;</code>
   * @return The enum numeric value on the wire for kgpgpmhinjm.
   */
  @java.lang.Override public int getKgpgpmhinjmValue() {
    return kgpgpmhinjm_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form kgpgpmhinjm = 3;</code>
   * @return The kgpgpmhinjm.
   */
  @java.lang.Override public POGOProtos.Rpc.PokemonDisplayProto.Form getKgpgpmhinjm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(kgpgpmhinjm_);
    return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Form.UNRECOGNIZED : result;
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
    if (mfkgkhdmbpb_ != POGOProtos.Rpc.HoloPokemonId.POKEMON_UNSET.getNumber()) {
      output.writeEnum(1, mfkgkhdmbpb_);
    }
    if (gbgpdefedmo_ != 0F) {
      output.writeFloat(2, gbgpdefedmo_);
    }
    if (kgpgpmhinjm_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      output.writeEnum(3, kgpgpmhinjm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mfkgkhdmbpb_ != POGOProtos.Rpc.HoloPokemonId.POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, mfkgkhdmbpb_);
    }
    if (gbgpdefedmo_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, gbgpdefedmo_);
    }
    if (kgpgpmhinjm_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, kgpgpmhinjm_);
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
    if (!(obj instanceof POGOProtos.Rpc.SpawnTablePokemonProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SpawnTablePokemonProto other = (POGOProtos.Rpc.SpawnTablePokemonProto) obj;

    if (mfkgkhdmbpb_ != other.mfkgkhdmbpb_) return false;
    if (java.lang.Float.floatToIntBits(getGbgpdefedmo())
        != java.lang.Float.floatToIntBits(
            other.getGbgpdefedmo())) return false;
    if (kgpgpmhinjm_ != other.kgpgpmhinjm_) return false;
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
    hash = (37 * hash) + MFKGKHDMBPB_FIELD_NUMBER;
    hash = (53 * hash) + mfkgkhdmbpb_;
    hash = (37 * hash) + GBGPDEFEDMO_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGbgpdefedmo());
    hash = (37 * hash) + KGPGPMHINJM_FIELD_NUMBER;
    hash = (53 * hash) + kgpgpmhinjm_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SpawnTablePokemonProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SpawnTablePokemonProto prototype) {
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
   * <pre>
   * ref: EOPAHIOMFIP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.SpawnTablePokemonProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SpawnTablePokemonProto)
      POGOProtos.Rpc.SpawnTablePokemonProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SpawnTablePokemonProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SpawnTablePokemonProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SpawnTablePokemonProto.class, POGOProtos.Rpc.SpawnTablePokemonProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SpawnTablePokemonProto.newBuilder()
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
      mfkgkhdmbpb_ = 0;

      gbgpdefedmo_ = 0F;

      kgpgpmhinjm_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SpawnTablePokemonProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SpawnTablePokemonProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.SpawnTablePokemonProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SpawnTablePokemonProto build() {
      POGOProtos.Rpc.SpawnTablePokemonProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SpawnTablePokemonProto buildPartial() {
      POGOProtos.Rpc.SpawnTablePokemonProto result = new POGOProtos.Rpc.SpawnTablePokemonProto(this);
      result.mfkgkhdmbpb_ = mfkgkhdmbpb_;
      result.gbgpdefedmo_ = gbgpdefedmo_;
      result.kgpgpmhinjm_ = kgpgpmhinjm_;
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
      if (other instanceof POGOProtos.Rpc.SpawnTablePokemonProto) {
        return mergeFrom((POGOProtos.Rpc.SpawnTablePokemonProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SpawnTablePokemonProto other) {
      if (other == POGOProtos.Rpc.SpawnTablePokemonProto.getDefaultInstance()) return this;
      if (other.mfkgkhdmbpb_ != 0) {
        setMfkgkhdmbpbValue(other.getMfkgkhdmbpbValue());
      }
      if (other.getGbgpdefedmo() != 0F) {
        setGbgpdefedmo(other.getGbgpdefedmo());
      }
      if (other.kgpgpmhinjm_ != 0) {
        setKgpgpmhinjmValue(other.getKgpgpmhinjmValue());
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
      POGOProtos.Rpc.SpawnTablePokemonProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SpawnTablePokemonProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int mfkgkhdmbpb_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId mfkgkhdmbpb = 1;</code>
     * @return The enum numeric value on the wire for mfkgkhdmbpb.
     */
    @java.lang.Override public int getMfkgkhdmbpbValue() {
      return mfkgkhdmbpb_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId mfkgkhdmbpb = 1;</code>
     * @param value The enum numeric value on the wire for mfkgkhdmbpb to set.
     * @return This builder for chaining.
     */
    public Builder setMfkgkhdmbpbValue(int value) {
      
      mfkgkhdmbpb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId mfkgkhdmbpb = 1;</code>
     * @return The mfkgkhdmbpb.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getMfkgkhdmbpb() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(mfkgkhdmbpb_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId mfkgkhdmbpb = 1;</code>
     * @param value The mfkgkhdmbpb to set.
     * @return This builder for chaining.
     */
    public Builder setMfkgkhdmbpb(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mfkgkhdmbpb_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId mfkgkhdmbpb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfkgkhdmbpb() {
      
      mfkgkhdmbpb_ = 0;
      onChanged();
      return this;
    }

    private float gbgpdefedmo_ ;
    /**
     * <code>float gbgpdefedmo = 2;</code>
     * @return The gbgpdefedmo.
     */
    @java.lang.Override
    public float getGbgpdefedmo() {
      return gbgpdefedmo_;
    }
    /**
     * <code>float gbgpdefedmo = 2;</code>
     * @param value The gbgpdefedmo to set.
     * @return This builder for chaining.
     */
    public Builder setGbgpdefedmo(float value) {
      
      gbgpdefedmo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float gbgpdefedmo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGbgpdefedmo() {
      
      gbgpdefedmo_ = 0F;
      onChanged();
      return this;
    }

    private int kgpgpmhinjm_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form kgpgpmhinjm = 3;</code>
     * @return The enum numeric value on the wire for kgpgpmhinjm.
     */
    @java.lang.Override public int getKgpgpmhinjmValue() {
      return kgpgpmhinjm_;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form kgpgpmhinjm = 3;</code>
     * @param value The enum numeric value on the wire for kgpgpmhinjm to set.
     * @return This builder for chaining.
     */
    public Builder setKgpgpmhinjmValue(int value) {
      
      kgpgpmhinjm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form kgpgpmhinjm = 3;</code>
     * @return The kgpgpmhinjm.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PokemonDisplayProto.Form getKgpgpmhinjm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(kgpgpmhinjm_);
      return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Form.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form kgpgpmhinjm = 3;</code>
     * @param value The kgpgpmhinjm to set.
     * @return This builder for chaining.
     */
    public Builder setKgpgpmhinjm(POGOProtos.Rpc.PokemonDisplayProto.Form value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kgpgpmhinjm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form kgpgpmhinjm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKgpgpmhinjm() {
      
      kgpgpmhinjm_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SpawnTablePokemonProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SpawnTablePokemonProto)
  private static final POGOProtos.Rpc.SpawnTablePokemonProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SpawnTablePokemonProto();
  }

  public static POGOProtos.Rpc.SpawnTablePokemonProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpawnTablePokemonProto>
      PARSER = new com.google.protobuf.AbstractParser<SpawnTablePokemonProto>() {
    @java.lang.Override
    public SpawnTablePokemonProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SpawnTablePokemonProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpawnTablePokemonProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpawnTablePokemonProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SpawnTablePokemonProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

