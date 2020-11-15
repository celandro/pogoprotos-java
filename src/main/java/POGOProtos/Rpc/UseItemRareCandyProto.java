// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.UseItemRareCandyProto}
 */
public final class UseItemRareCandyProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.UseItemRareCandyProto)
    UseItemRareCandyProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UseItemRareCandyProto.newBuilder() to construct.
  private UseItemRareCandyProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UseItemRareCandyProto() {
    item_ = 0;
    pokemonId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UseItemRareCandyProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UseItemRareCandyProto(
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

            item_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            pokemonId_ = rawValue;
            break;
          }
          case 24: {

            candyCount_ = input.readInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.UseItemRareCandyProto.class, POGOProtos.Rpc.UseItemRareCandyProto.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private int item_;
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The enum numeric value on the wire for item.
   */
  @java.lang.Override public int getItemValue() {
    return item_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The item.
   */
  @java.lang.Override public POGOProtos.Rpc.Item getItem() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(item_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 2;
  private int pokemonId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  @java.lang.Override public int getPokemonIdValue() {
    return pokemonId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
   * @return The pokemonId.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int CANDY_COUNT_FIELD_NUMBER = 3;
  private int candyCount_;
  /**
   * <code>int32 candy_count = 3;</code>
   * @return The candyCount.
   */
  @java.lang.Override
  public int getCandyCount() {
    return candyCount_;
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
    if (item_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, item_);
    }
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(2, pokemonId_);
    }
    if (candyCount_ != 0) {
      output.writeInt32(3, candyCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, item_);
    }
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, pokemonId_);
    }
    if (candyCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, candyCount_);
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
    if (!(obj instanceof POGOProtos.Rpc.UseItemRareCandyProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.UseItemRareCandyProto other = (POGOProtos.Rpc.UseItemRareCandyProto) obj;

    if (item_ != other.item_) return false;
    if (pokemonId_ != other.pokemonId_) return false;
    if (getCandyCount()
        != other.getCandyCount()) return false;
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
    hash = (37 * hash) + ITEM_FIELD_NUMBER;
    hash = (53 * hash) + item_;
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + pokemonId_;
    hash = (37 * hash) + CANDY_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCandyCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemRareCandyProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.UseItemRareCandyProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.UseItemRareCandyProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.UseItemRareCandyProto)
      POGOProtos.Rpc.UseItemRareCandyProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.UseItemRareCandyProto.class, POGOProtos.Rpc.UseItemRareCandyProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.UseItemRareCandyProto.newBuilder()
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
      item_ = 0;

      pokemonId_ = 0;

      candyCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemRareCandyProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.UseItemRareCandyProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemRareCandyProto build() {
      POGOProtos.Rpc.UseItemRareCandyProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemRareCandyProto buildPartial() {
      POGOProtos.Rpc.UseItemRareCandyProto result = new POGOProtos.Rpc.UseItemRareCandyProto(this);
      result.item_ = item_;
      result.pokemonId_ = pokemonId_;
      result.candyCount_ = candyCount_;
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
      if (other instanceof POGOProtos.Rpc.UseItemRareCandyProto) {
        return mergeFrom((POGOProtos.Rpc.UseItemRareCandyProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.UseItemRareCandyProto other) {
      if (other == POGOProtos.Rpc.UseItemRareCandyProto.getDefaultInstance()) return this;
      if (other.item_ != 0) {
        setItemValue(other.getItemValue());
      }
      if (other.pokemonId_ != 0) {
        setPokemonIdValue(other.getPokemonIdValue());
      }
      if (other.getCandyCount() != 0) {
        setCandyCount(other.getCandyCount());
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
      POGOProtos.Rpc.UseItemRareCandyProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.UseItemRareCandyProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int item_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return The enum numeric value on the wire for item.
     */
    @java.lang.Override public int getItemValue() {
      return item_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @param value The enum numeric value on the wire for item to set.
     * @return This builder for chaining.
     */
    public Builder setItemValue(int value) {
      
      item_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return The item.
     */
    @java.lang.Override
    public POGOProtos.Rpc.Item getItem() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(item_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @param value The item to set.
     * @return This builder for chaining.
     */
    public Builder setItem(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      item_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItem() {
      
      item_ = 0;
      onChanged();
      return this;
    }

    private int pokemonId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
     * @return The enum numeric value on the wire for pokemonId.
     */
    @java.lang.Override public int getPokemonIdValue() {
      return pokemonId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
     * @param value The enum numeric value on the wire for pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonIdValue(int value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
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
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0;
      onChanged();
      return this;
    }

    private int candyCount_ ;
    /**
     * <code>int32 candy_count = 3;</code>
     * @return The candyCount.
     */
    @java.lang.Override
    public int getCandyCount() {
      return candyCount_;
    }
    /**
     * <code>int32 candy_count = 3;</code>
     * @param value The candyCount to set.
     * @return This builder for chaining.
     */
    public Builder setCandyCount(int value) {
      
      candyCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 candy_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCandyCount() {
      
      candyCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.UseItemRareCandyProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.UseItemRareCandyProto)
  private static final POGOProtos.Rpc.UseItemRareCandyProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.UseItemRareCandyProto();
  }

  public static POGOProtos.Rpc.UseItemRareCandyProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UseItemRareCandyProto>
      PARSER = new com.google.protobuf.AbstractParser<UseItemRareCandyProto>() {
    @java.lang.Override
    public UseItemRareCandyProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UseItemRareCandyProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UseItemRareCandyProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UseItemRareCandyProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.UseItemRareCandyProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

