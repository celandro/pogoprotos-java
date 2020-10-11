// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LEHAAAPKBIJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PokemonCandyRewardProto}
 */
public final class PokemonCandyRewardProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonCandyRewardProto)
    PokemonCandyRewardProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonCandyRewardProto.newBuilder() to construct.
  private PokemonCandyRewardProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonCandyRewardProto() {
    mfkgkhdmbpb_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonCandyRewardProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonCandyRewardProto(
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
          case 16: {

            ligbfceekdo_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCandyRewardProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCandyRewardProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonCandyRewardProto.class, POGOProtos.Rpc.PokemonCandyRewardProto.Builder.class);
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

  public static final int LIGBFCEEKDO_FIELD_NUMBER = 2;
  private int ligbfceekdo_;
  /**
   * <code>int32 ligbfceekdo = 2;</code>
   * @return The ligbfceekdo.
   */
  @java.lang.Override
  public int getLigbfceekdo() {
    return ligbfceekdo_;
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
    if (ligbfceekdo_ != 0) {
      output.writeInt32(2, ligbfceekdo_);
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
    if (ligbfceekdo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ligbfceekdo_);
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
    if (!(obj instanceof POGOProtos.Rpc.PokemonCandyRewardProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonCandyRewardProto other = (POGOProtos.Rpc.PokemonCandyRewardProto) obj;

    if (mfkgkhdmbpb_ != other.mfkgkhdmbpb_) return false;
    if (getLigbfceekdo()
        != other.getLigbfceekdo()) return false;
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
    hash = (37 * hash) + LIGBFCEEKDO_FIELD_NUMBER;
    hash = (53 * hash) + getLigbfceekdo();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonCandyRewardProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokemonCandyRewardProto prototype) {
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
   * ref: LEHAAAPKBIJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PokemonCandyRewardProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonCandyRewardProto)
      POGOProtos.Rpc.PokemonCandyRewardProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCandyRewardProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCandyRewardProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonCandyRewardProto.class, POGOProtos.Rpc.PokemonCandyRewardProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonCandyRewardProto.newBuilder()
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

      ligbfceekdo_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCandyRewardProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonCandyRewardProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonCandyRewardProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonCandyRewardProto build() {
      POGOProtos.Rpc.PokemonCandyRewardProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonCandyRewardProto buildPartial() {
      POGOProtos.Rpc.PokemonCandyRewardProto result = new POGOProtos.Rpc.PokemonCandyRewardProto(this);
      result.mfkgkhdmbpb_ = mfkgkhdmbpb_;
      result.ligbfceekdo_ = ligbfceekdo_;
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
      if (other instanceof POGOProtos.Rpc.PokemonCandyRewardProto) {
        return mergeFrom((POGOProtos.Rpc.PokemonCandyRewardProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonCandyRewardProto other) {
      if (other == POGOProtos.Rpc.PokemonCandyRewardProto.getDefaultInstance()) return this;
      if (other.mfkgkhdmbpb_ != 0) {
        setMfkgkhdmbpbValue(other.getMfkgkhdmbpbValue());
      }
      if (other.getLigbfceekdo() != 0) {
        setLigbfceekdo(other.getLigbfceekdo());
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
      POGOProtos.Rpc.PokemonCandyRewardProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonCandyRewardProto) e.getUnfinishedMessage();
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

    private int ligbfceekdo_ ;
    /**
     * <code>int32 ligbfceekdo = 2;</code>
     * @return The ligbfceekdo.
     */
    @java.lang.Override
    public int getLigbfceekdo() {
      return ligbfceekdo_;
    }
    /**
     * <code>int32 ligbfceekdo = 2;</code>
     * @param value The ligbfceekdo to set.
     * @return This builder for chaining.
     */
    public Builder setLigbfceekdo(int value) {
      
      ligbfceekdo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ligbfceekdo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLigbfceekdo() {
      
      ligbfceekdo_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonCandyRewardProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonCandyRewardProto)
  private static final POGOProtos.Rpc.PokemonCandyRewardProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonCandyRewardProto();
  }

  public static POGOProtos.Rpc.PokemonCandyRewardProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonCandyRewardProto>
      PARSER = new com.google.protobuf.AbstractParser<PokemonCandyRewardProto>() {
    @java.lang.Override
    public PokemonCandyRewardProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonCandyRewardProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonCandyRewardProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonCandyRewardProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonCandyRewardProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

