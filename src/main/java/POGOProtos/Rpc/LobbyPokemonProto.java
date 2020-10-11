// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PMMPMEGHOOB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LobbyPokemonProto}
 */
public final class LobbyPokemonProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LobbyPokemonProto)
    LobbyPokemonProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LobbyPokemonProto.newBuilder() to construct.
  private LobbyPokemonProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LobbyPokemonProto() {
    kcbcpdfdkel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LobbyPokemonProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LobbyPokemonProto(
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

            mjlofidknme_ = input.readInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            kcbcpdfdkel_ = rawValue;
            break;
          }
          case 24: {

            fgeliggeohb_ = input.readInt32();
            break;
          }
          case 37: {

            homeghafodj_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LobbyPokemonProto.class, POGOProtos.Rpc.LobbyPokemonProto.Builder.class);
  }

  public static final int MJLOFIDKNME_FIELD_NUMBER = 1;
  private long mjlofidknme_;
  /**
   * <code>int64 mjlofidknme = 1;</code>
   * @return The mjlofidknme.
   */
  @java.lang.Override
  public long getMjlofidknme() {
    return mjlofidknme_;
  }

  public static final int KCBCPDFDKEL_FIELD_NUMBER = 2;
  private int kcbcpdfdkel_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId kcbcpdfdkel = 2;</code>
   * @return The enum numeric value on the wire for kcbcpdfdkel.
   */
  @java.lang.Override public int getKcbcpdfdkelValue() {
    return kcbcpdfdkel_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId kcbcpdfdkel = 2;</code>
   * @return The kcbcpdfdkel.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getKcbcpdfdkel() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(kcbcpdfdkel_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int FGELIGGEOHB_FIELD_NUMBER = 3;
  private int fgeliggeohb_;
  /**
   * <code>int32 fgeliggeohb = 3;</code>
   * @return The fgeliggeohb.
   */
  @java.lang.Override
  public int getFgeliggeohb() {
    return fgeliggeohb_;
  }

  public static final int HOMEGHAFODJ_FIELD_NUMBER = 4;
  private float homeghafodj_;
  /**
   * <code>float homeghafodj = 4;</code>
   * @return The homeghafodj.
   */
  @java.lang.Override
  public float getHomeghafodj() {
    return homeghafodj_;
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
    if (mjlofidknme_ != 0L) {
      output.writeInt64(1, mjlofidknme_);
    }
    if (kcbcpdfdkel_ != POGOProtos.Rpc.HoloPokemonId.POKEMON_UNSET.getNumber()) {
      output.writeEnum(2, kcbcpdfdkel_);
    }
    if (fgeliggeohb_ != 0) {
      output.writeInt32(3, fgeliggeohb_);
    }
    if (homeghafodj_ != 0F) {
      output.writeFloat(4, homeghafodj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mjlofidknme_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, mjlofidknme_);
    }
    if (kcbcpdfdkel_ != POGOProtos.Rpc.HoloPokemonId.POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, kcbcpdfdkel_);
    }
    if (fgeliggeohb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, fgeliggeohb_);
    }
    if (homeghafodj_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, homeghafodj_);
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
    if (!(obj instanceof POGOProtos.Rpc.LobbyPokemonProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LobbyPokemonProto other = (POGOProtos.Rpc.LobbyPokemonProto) obj;

    if (getMjlofidknme()
        != other.getMjlofidknme()) return false;
    if (kcbcpdfdkel_ != other.kcbcpdfdkel_) return false;
    if (getFgeliggeohb()
        != other.getFgeliggeohb()) return false;
    if (java.lang.Float.floatToIntBits(getHomeghafodj())
        != java.lang.Float.floatToIntBits(
            other.getHomeghafodj())) return false;
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
    hash = (37 * hash) + MJLOFIDKNME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMjlofidknme());
    hash = (37 * hash) + KCBCPDFDKEL_FIELD_NUMBER;
    hash = (53 * hash) + kcbcpdfdkel_;
    hash = (37 * hash) + FGELIGGEOHB_FIELD_NUMBER;
    hash = (53 * hash) + getFgeliggeohb();
    hash = (37 * hash) + HOMEGHAFODJ_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getHomeghafodj());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LobbyPokemonProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LobbyPokemonProto prototype) {
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
   * ref: PMMPMEGHOOB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LobbyPokemonProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LobbyPokemonProto)
      POGOProtos.Rpc.LobbyPokemonProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LobbyPokemonProto.class, POGOProtos.Rpc.LobbyPokemonProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LobbyPokemonProto.newBuilder()
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
      mjlofidknme_ = 0L;

      kcbcpdfdkel_ = 0;

      fgeliggeohb_ = 0;

      homeghafodj_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LobbyPokemonProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LobbyPokemonProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.LobbyPokemonProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LobbyPokemonProto build() {
      POGOProtos.Rpc.LobbyPokemonProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LobbyPokemonProto buildPartial() {
      POGOProtos.Rpc.LobbyPokemonProto result = new POGOProtos.Rpc.LobbyPokemonProto(this);
      result.mjlofidknme_ = mjlofidknme_;
      result.kcbcpdfdkel_ = kcbcpdfdkel_;
      result.fgeliggeohb_ = fgeliggeohb_;
      result.homeghafodj_ = homeghafodj_;
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
      if (other instanceof POGOProtos.Rpc.LobbyPokemonProto) {
        return mergeFrom((POGOProtos.Rpc.LobbyPokemonProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LobbyPokemonProto other) {
      if (other == POGOProtos.Rpc.LobbyPokemonProto.getDefaultInstance()) return this;
      if (other.getMjlofidknme() != 0L) {
        setMjlofidknme(other.getMjlofidknme());
      }
      if (other.kcbcpdfdkel_ != 0) {
        setKcbcpdfdkelValue(other.getKcbcpdfdkelValue());
      }
      if (other.getFgeliggeohb() != 0) {
        setFgeliggeohb(other.getFgeliggeohb());
      }
      if (other.getHomeghafodj() != 0F) {
        setHomeghafodj(other.getHomeghafodj());
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
      POGOProtos.Rpc.LobbyPokemonProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LobbyPokemonProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long mjlofidknme_ ;
    /**
     * <code>int64 mjlofidknme = 1;</code>
     * @return The mjlofidknme.
     */
    @java.lang.Override
    public long getMjlofidknme() {
      return mjlofidknme_;
    }
    /**
     * <code>int64 mjlofidknme = 1;</code>
     * @param value The mjlofidknme to set.
     * @return This builder for chaining.
     */
    public Builder setMjlofidknme(long value) {
      
      mjlofidknme_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mjlofidknme = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMjlofidknme() {
      
      mjlofidknme_ = 0L;
      onChanged();
      return this;
    }

    private int kcbcpdfdkel_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId kcbcpdfdkel = 2;</code>
     * @return The enum numeric value on the wire for kcbcpdfdkel.
     */
    @java.lang.Override public int getKcbcpdfdkelValue() {
      return kcbcpdfdkel_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId kcbcpdfdkel = 2;</code>
     * @param value The enum numeric value on the wire for kcbcpdfdkel to set.
     * @return This builder for chaining.
     */
    public Builder setKcbcpdfdkelValue(int value) {
      
      kcbcpdfdkel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId kcbcpdfdkel = 2;</code>
     * @return The kcbcpdfdkel.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getKcbcpdfdkel() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(kcbcpdfdkel_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId kcbcpdfdkel = 2;</code>
     * @param value The kcbcpdfdkel to set.
     * @return This builder for chaining.
     */
    public Builder setKcbcpdfdkel(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kcbcpdfdkel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId kcbcpdfdkel = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKcbcpdfdkel() {
      
      kcbcpdfdkel_ = 0;
      onChanged();
      return this;
    }

    private int fgeliggeohb_ ;
    /**
     * <code>int32 fgeliggeohb = 3;</code>
     * @return The fgeliggeohb.
     */
    @java.lang.Override
    public int getFgeliggeohb() {
      return fgeliggeohb_;
    }
    /**
     * <code>int32 fgeliggeohb = 3;</code>
     * @param value The fgeliggeohb to set.
     * @return This builder for chaining.
     */
    public Builder setFgeliggeohb(int value) {
      
      fgeliggeohb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fgeliggeohb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFgeliggeohb() {
      
      fgeliggeohb_ = 0;
      onChanged();
      return this;
    }

    private float homeghafodj_ ;
    /**
     * <code>float homeghafodj = 4;</code>
     * @return The homeghafodj.
     */
    @java.lang.Override
    public float getHomeghafodj() {
      return homeghafodj_;
    }
    /**
     * <code>float homeghafodj = 4;</code>
     * @param value The homeghafodj to set.
     * @return This builder for chaining.
     */
    public Builder setHomeghafodj(float value) {
      
      homeghafodj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float homeghafodj = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHomeghafodj() {
      
      homeghafodj_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LobbyPokemonProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LobbyPokemonProto)
  private static final POGOProtos.Rpc.LobbyPokemonProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LobbyPokemonProto();
  }

  public static POGOProtos.Rpc.LobbyPokemonProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LobbyPokemonProto>
      PARSER = new com.google.protobuf.AbstractParser<LobbyPokemonProto>() {
    @java.lang.Override
    public LobbyPokemonProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LobbyPokemonProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LobbyPokemonProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LobbyPokemonProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LobbyPokemonProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

