// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BelugaBleTransferPrepProto}
 */
public final class BelugaBleTransferPrepProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BelugaBleTransferPrepProto)
    BelugaBleTransferPrepProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BelugaBleTransferPrepProto.newBuilder() to construct.
  private BelugaBleTransferPrepProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BelugaBleTransferPrepProto() {
    pokemonList_ = java.util.Collections.emptyList();
    belugaId_ = "";
    nonce_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BelugaBleTransferPrepProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BelugaBleTransferPrepProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              pokemonList_ = new java.util.ArrayList<POGOProtos.Rpc.BelugaPokemonProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            pokemonList_.add(
                input.readMessage(POGOProtos.Rpc.BelugaPokemonProto.parser(), extensionRegistry));
            break;
          }
          case 16: {

            eligbleForItem_ = input.readBool();
            break;
          }
          case 24: {

            transactionId_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            belugaId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            nonce_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        pokemonList_ = java.util.Collections.unmodifiableList(pokemonList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleTransferPrepProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleTransferPrepProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BelugaBleTransferPrepProto.class, POGOProtos.Rpc.BelugaBleTransferPrepProto.Builder.class);
  }

  public static final int POKEMON_LIST_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.BelugaPokemonProto> pokemonList_;
  /**
   * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.BelugaPokemonProto> getPokemonListList() {
    return pokemonList_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.BelugaPokemonProtoOrBuilder> 
      getPokemonListOrBuilderList() {
    return pokemonList_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
   */
  @java.lang.Override
  public int getPokemonListCount() {
    return pokemonList_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BelugaPokemonProto getPokemonList(int index) {
    return pokemonList_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BelugaPokemonProtoOrBuilder getPokemonListOrBuilder(
      int index) {
    return pokemonList_.get(index);
  }

  public static final int ELIGBLE_FOR_ITEM_FIELD_NUMBER = 2;
  private boolean eligbleForItem_;
  /**
   * <code>bool eligble_for_item = 2;</code>
   * @return The eligbleForItem.
   */
  @java.lang.Override
  public boolean getEligbleForItem() {
    return eligbleForItem_;
  }

  public static final int TRANSACTION_ID_FIELD_NUMBER = 3;
  private long transactionId_;
  /**
   * <code>int64 transaction_id = 3;</code>
   * @return The transactionId.
   */
  @java.lang.Override
  public long getTransactionId() {
    return transactionId_;
  }

  public static final int BELUGA_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object belugaId_;
  /**
   * <code>string beluga_id = 4;</code>
   * @return The belugaId.
   */
  @java.lang.Override
  public java.lang.String getBelugaId() {
    java.lang.Object ref = belugaId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      belugaId_ = s;
      return s;
    }
  }
  /**
   * <code>string beluga_id = 4;</code>
   * @return The bytes for belugaId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBelugaIdBytes() {
    java.lang.Object ref = belugaId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      belugaId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NONCE_FIELD_NUMBER = 5;
  private volatile java.lang.Object nonce_;
  /**
   * <code>string nonce = 5;</code>
   * @return The nonce.
   */
  @java.lang.Override
  public java.lang.String getNonce() {
    java.lang.Object ref = nonce_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nonce_ = s;
      return s;
    }
  }
  /**
   * <code>string nonce = 5;</code>
   * @return The bytes for nonce.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNonceBytes() {
    java.lang.Object ref = nonce_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nonce_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < pokemonList_.size(); i++) {
      output.writeMessage(1, pokemonList_.get(i));
    }
    if (eligbleForItem_ != false) {
      output.writeBool(2, eligbleForItem_);
    }
    if (transactionId_ != 0L) {
      output.writeInt64(3, transactionId_);
    }
    if (!getBelugaIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, belugaId_);
    }
    if (!getNonceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, nonce_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < pokemonList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, pokemonList_.get(i));
    }
    if (eligbleForItem_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, eligbleForItem_);
    }
    if (transactionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, transactionId_);
    }
    if (!getBelugaIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, belugaId_);
    }
    if (!getNonceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, nonce_);
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
    if (!(obj instanceof POGOProtos.Rpc.BelugaBleTransferPrepProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BelugaBleTransferPrepProto other = (POGOProtos.Rpc.BelugaBleTransferPrepProto) obj;

    if (!getPokemonListList()
        .equals(other.getPokemonListList())) return false;
    if (getEligbleForItem()
        != other.getEligbleForItem()) return false;
    if (getTransactionId()
        != other.getTransactionId()) return false;
    if (!getBelugaId()
        .equals(other.getBelugaId())) return false;
    if (!getNonce()
        .equals(other.getNonce())) return false;
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
    if (getPokemonListCount() > 0) {
      hash = (37 * hash) + POKEMON_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonListList().hashCode();
    }
    hash = (37 * hash) + ELIGBLE_FOR_ITEM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEligbleForItem());
    hash = (37 * hash) + TRANSACTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTransactionId());
    hash = (37 * hash) + BELUGA_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBelugaId().hashCode();
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getNonce().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaBleTransferPrepProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BelugaBleTransferPrepProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BelugaBleTransferPrepProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BelugaBleTransferPrepProto)
      POGOProtos.Rpc.BelugaBleTransferPrepProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleTransferPrepProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleTransferPrepProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BelugaBleTransferPrepProto.class, POGOProtos.Rpc.BelugaBleTransferPrepProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BelugaBleTransferPrepProto.newBuilder()
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
        getPokemonListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pokemonListBuilder_ == null) {
        pokemonList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pokemonListBuilder_.clear();
      }
      eligbleForItem_ = false;

      transactionId_ = 0L;

      belugaId_ = "";

      nonce_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaBleTransferPrepProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleTransferPrepProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BelugaBleTransferPrepProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleTransferPrepProto build() {
      POGOProtos.Rpc.BelugaBleTransferPrepProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaBleTransferPrepProto buildPartial() {
      POGOProtos.Rpc.BelugaBleTransferPrepProto result = new POGOProtos.Rpc.BelugaBleTransferPrepProto(this);
      int from_bitField0_ = bitField0_;
      if (pokemonListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pokemonList_ = java.util.Collections.unmodifiableList(pokemonList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pokemonList_ = pokemonList_;
      } else {
        result.pokemonList_ = pokemonListBuilder_.build();
      }
      result.eligbleForItem_ = eligbleForItem_;
      result.transactionId_ = transactionId_;
      result.belugaId_ = belugaId_;
      result.nonce_ = nonce_;
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
      if (other instanceof POGOProtos.Rpc.BelugaBleTransferPrepProto) {
        return mergeFrom((POGOProtos.Rpc.BelugaBleTransferPrepProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BelugaBleTransferPrepProto other) {
      if (other == POGOProtos.Rpc.BelugaBleTransferPrepProto.getDefaultInstance()) return this;
      if (pokemonListBuilder_ == null) {
        if (!other.pokemonList_.isEmpty()) {
          if (pokemonList_.isEmpty()) {
            pokemonList_ = other.pokemonList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePokemonListIsMutable();
            pokemonList_.addAll(other.pokemonList_);
          }
          onChanged();
        }
      } else {
        if (!other.pokemonList_.isEmpty()) {
          if (pokemonListBuilder_.isEmpty()) {
            pokemonListBuilder_.dispose();
            pokemonListBuilder_ = null;
            pokemonList_ = other.pokemonList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pokemonListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPokemonListFieldBuilder() : null;
          } else {
            pokemonListBuilder_.addAllMessages(other.pokemonList_);
          }
        }
      }
      if (other.getEligbleForItem() != false) {
        setEligbleForItem(other.getEligbleForItem());
      }
      if (other.getTransactionId() != 0L) {
        setTransactionId(other.getTransactionId());
      }
      if (!other.getBelugaId().isEmpty()) {
        belugaId_ = other.belugaId_;
        onChanged();
      }
      if (!other.getNonce().isEmpty()) {
        nonce_ = other.nonce_;
        onChanged();
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
      POGOProtos.Rpc.BelugaBleTransferPrepProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BelugaBleTransferPrepProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.BelugaPokemonProto> pokemonList_ =
      java.util.Collections.emptyList();
    private void ensurePokemonListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pokemonList_ = new java.util.ArrayList<POGOProtos.Rpc.BelugaPokemonProto>(pokemonList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BelugaPokemonProto, POGOProtos.Rpc.BelugaPokemonProto.Builder, POGOProtos.Rpc.BelugaPokemonProtoOrBuilder> pokemonListBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.BelugaPokemonProto> getPokemonListList() {
      if (pokemonListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pokemonList_);
      } else {
        return pokemonListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public int getPokemonListCount() {
      if (pokemonListBuilder_ == null) {
        return pokemonList_.size();
      } else {
        return pokemonListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public POGOProtos.Rpc.BelugaPokemonProto getPokemonList(int index) {
      if (pokemonListBuilder_ == null) {
        return pokemonList_.get(index);
      } else {
        return pokemonListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public Builder setPokemonList(
        int index, POGOProtos.Rpc.BelugaPokemonProto value) {
      if (pokemonListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePokemonListIsMutable();
        pokemonList_.set(index, value);
        onChanged();
      } else {
        pokemonListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public Builder setPokemonList(
        int index, POGOProtos.Rpc.BelugaPokemonProto.Builder builderForValue) {
      if (pokemonListBuilder_ == null) {
        ensurePokemonListIsMutable();
        pokemonList_.set(index, builderForValue.build());
        onChanged();
      } else {
        pokemonListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public Builder addPokemonList(POGOProtos.Rpc.BelugaPokemonProto value) {
      if (pokemonListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePokemonListIsMutable();
        pokemonList_.add(value);
        onChanged();
      } else {
        pokemonListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public Builder addPokemonList(
        int index, POGOProtos.Rpc.BelugaPokemonProto value) {
      if (pokemonListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePokemonListIsMutable();
        pokemonList_.add(index, value);
        onChanged();
      } else {
        pokemonListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public Builder addPokemonList(
        POGOProtos.Rpc.BelugaPokemonProto.Builder builderForValue) {
      if (pokemonListBuilder_ == null) {
        ensurePokemonListIsMutable();
        pokemonList_.add(builderForValue.build());
        onChanged();
      } else {
        pokemonListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public Builder addPokemonList(
        int index, POGOProtos.Rpc.BelugaPokemonProto.Builder builderForValue) {
      if (pokemonListBuilder_ == null) {
        ensurePokemonListIsMutable();
        pokemonList_.add(index, builderForValue.build());
        onChanged();
      } else {
        pokemonListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public Builder addAllPokemonList(
        java.lang.Iterable<? extends POGOProtos.Rpc.BelugaPokemonProto> values) {
      if (pokemonListBuilder_ == null) {
        ensurePokemonListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pokemonList_);
        onChanged();
      } else {
        pokemonListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public Builder clearPokemonList() {
      if (pokemonListBuilder_ == null) {
        pokemonList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pokemonListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public Builder removePokemonList(int index) {
      if (pokemonListBuilder_ == null) {
        ensurePokemonListIsMutable();
        pokemonList_.remove(index);
        onChanged();
      } else {
        pokemonListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public POGOProtos.Rpc.BelugaPokemonProto.Builder getPokemonListBuilder(
        int index) {
      return getPokemonListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public POGOProtos.Rpc.BelugaPokemonProtoOrBuilder getPokemonListOrBuilder(
        int index) {
      if (pokemonListBuilder_ == null) {
        return pokemonList_.get(index);  } else {
        return pokemonListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.BelugaPokemonProtoOrBuilder> 
         getPokemonListOrBuilderList() {
      if (pokemonListBuilder_ != null) {
        return pokemonListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pokemonList_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public POGOProtos.Rpc.BelugaPokemonProto.Builder addPokemonListBuilder() {
      return getPokemonListFieldBuilder().addBuilder(
          POGOProtos.Rpc.BelugaPokemonProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public POGOProtos.Rpc.BelugaPokemonProto.Builder addPokemonListBuilder(
        int index) {
      return getPokemonListFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.BelugaPokemonProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BelugaPokemonProto pokemon_list = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.BelugaPokemonProto.Builder> 
         getPokemonListBuilderList() {
      return getPokemonListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BelugaPokemonProto, POGOProtos.Rpc.BelugaPokemonProto.Builder, POGOProtos.Rpc.BelugaPokemonProtoOrBuilder> 
        getPokemonListFieldBuilder() {
      if (pokemonListBuilder_ == null) {
        pokemonListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.BelugaPokemonProto, POGOProtos.Rpc.BelugaPokemonProto.Builder, POGOProtos.Rpc.BelugaPokemonProtoOrBuilder>(
                pokemonList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pokemonList_ = null;
      }
      return pokemonListBuilder_;
    }

    private boolean eligbleForItem_ ;
    /**
     * <code>bool eligble_for_item = 2;</code>
     * @return The eligbleForItem.
     */
    @java.lang.Override
    public boolean getEligbleForItem() {
      return eligbleForItem_;
    }
    /**
     * <code>bool eligble_for_item = 2;</code>
     * @param value The eligbleForItem to set.
     * @return This builder for chaining.
     */
    public Builder setEligbleForItem(boolean value) {
      
      eligbleForItem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool eligble_for_item = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEligbleForItem() {
      
      eligbleForItem_ = false;
      onChanged();
      return this;
    }

    private long transactionId_ ;
    /**
     * <code>int64 transaction_id = 3;</code>
     * @return The transactionId.
     */
    @java.lang.Override
    public long getTransactionId() {
      return transactionId_;
    }
    /**
     * <code>int64 transaction_id = 3;</code>
     * @param value The transactionId to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionId(long value) {
      
      transactionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 transaction_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransactionId() {
      
      transactionId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object belugaId_ = "";
    /**
     * <code>string beluga_id = 4;</code>
     * @return The belugaId.
     */
    public java.lang.String getBelugaId() {
      java.lang.Object ref = belugaId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        belugaId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string beluga_id = 4;</code>
     * @return The bytes for belugaId.
     */
    public com.google.protobuf.ByteString
        getBelugaIdBytes() {
      java.lang.Object ref = belugaId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        belugaId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string beluga_id = 4;</code>
     * @param value The belugaId to set.
     * @return This builder for chaining.
     */
    public Builder setBelugaId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      belugaId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string beluga_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBelugaId() {
      
      belugaId_ = getDefaultInstance().getBelugaId();
      onChanged();
      return this;
    }
    /**
     * <code>string beluga_id = 4;</code>
     * @param value The bytes for belugaId to set.
     * @return This builder for chaining.
     */
    public Builder setBelugaIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      belugaId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nonce_ = "";
    /**
     * <code>string nonce = 5;</code>
     * @return The nonce.
     */
    public java.lang.String getNonce() {
      java.lang.Object ref = nonce_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nonce_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nonce = 5;</code>
     * @return The bytes for nonce.
     */
    public com.google.protobuf.ByteString
        getNonceBytes() {
      java.lang.Object ref = nonce_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nonce_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nonce = 5;</code>
     * @param value The nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonce(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nonce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nonce = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNonce() {
      
      nonce_ = getDefaultInstance().getNonce();
      onChanged();
      return this;
    }
    /**
     * <code>string nonce = 5;</code>
     * @param value The bytes for nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nonce_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BelugaBleTransferPrepProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BelugaBleTransferPrepProto)
  private static final POGOProtos.Rpc.BelugaBleTransferPrepProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BelugaBleTransferPrepProto();
  }

  public static POGOProtos.Rpc.BelugaBleTransferPrepProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BelugaBleTransferPrepProto>
      PARSER = new com.google.protobuf.AbstractParser<BelugaBleTransferPrepProto>() {
    @java.lang.Override
    public BelugaBleTransferPrepProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BelugaBleTransferPrepProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BelugaBleTransferPrepProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BelugaBleTransferPrepProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleTransferPrepProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

