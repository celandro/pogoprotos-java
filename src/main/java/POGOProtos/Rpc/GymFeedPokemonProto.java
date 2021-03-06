// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GymFeedPokemonProto}
 */
public final class GymFeedPokemonProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GymFeedPokemonProto)
    GymFeedPokemonProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GymFeedPokemonProto.newBuilder() to construct.
  private GymFeedPokemonProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GymFeedPokemonProto() {
    item_ = 0;
    gymId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GymFeedPokemonProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GymFeedPokemonProto(
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

            startingQuantity_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            gymId_ = s;
            break;
          }
          case 33: {

            pokemonId_ = input.readFixed64();
            break;
          }
          case 41: {

            playerLatDegrees_ = input.readDouble();
            break;
          }
          case 49: {

            playerLngDegrees_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymFeedPokemonProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymFeedPokemonProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GymFeedPokemonProto.class, POGOProtos.Rpc.GymFeedPokemonProto.Builder.class);
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

  public static final int STARTING_QUANTITY_FIELD_NUMBER = 2;
  private int startingQuantity_;
  /**
   * <code>int32 starting_quantity = 2;</code>
   * @return The startingQuantity.
   */
  @java.lang.Override
  public int getStartingQuantity() {
    return startingQuantity_;
  }

  public static final int GYM_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object gymId_;
  /**
   * <code>string gym_id = 3;</code>
   * @return The gymId.
   */
  @java.lang.Override
  public java.lang.String getGymId() {
    java.lang.Object ref = gymId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gymId_ = s;
      return s;
    }
  }
  /**
   * <code>string gym_id = 3;</code>
   * @return The bytes for gymId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGymIdBytes() {
    java.lang.Object ref = gymId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gymId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 4;
  private long pokemonId_;
  /**
   * <code>fixed64 pokemon_id = 4;</code>
   * @return The pokemonId.
   */
  @java.lang.Override
  public long getPokemonId() {
    return pokemonId_;
  }

  public static final int PLAYER_LAT_DEGREES_FIELD_NUMBER = 5;
  private double playerLatDegrees_;
  /**
   * <code>double player_lat_degrees = 5;</code>
   * @return The playerLatDegrees.
   */
  @java.lang.Override
  public double getPlayerLatDegrees() {
    return playerLatDegrees_;
  }

  public static final int PLAYER_LNG_DEGREES_FIELD_NUMBER = 6;
  private double playerLngDegrees_;
  /**
   * <code>double player_lng_degrees = 6;</code>
   * @return The playerLngDegrees.
   */
  @java.lang.Override
  public double getPlayerLngDegrees() {
    return playerLngDegrees_;
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
    if (startingQuantity_ != 0) {
      output.writeInt32(2, startingQuantity_);
    }
    if (!getGymIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gymId_);
    }
    if (pokemonId_ != 0L) {
      output.writeFixed64(4, pokemonId_);
    }
    if (playerLatDegrees_ != 0D) {
      output.writeDouble(5, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      output.writeDouble(6, playerLngDegrees_);
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
    if (startingQuantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, startingQuantity_);
    }
    if (!getGymIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gymId_);
    }
    if (pokemonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(4, pokemonId_);
    }
    if (playerLatDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, playerLngDegrees_);
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
    if (!(obj instanceof POGOProtos.Rpc.GymFeedPokemonProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GymFeedPokemonProto other = (POGOProtos.Rpc.GymFeedPokemonProto) obj;

    if (item_ != other.item_) return false;
    if (getStartingQuantity()
        != other.getStartingQuantity()) return false;
    if (!getGymId()
        .equals(other.getGymId())) return false;
    if (getPokemonId()
        != other.getPokemonId()) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLatDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLatDegrees())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLngDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLngDegrees())) return false;
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
    hash = (37 * hash) + STARTING_QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getStartingQuantity();
    hash = (37 * hash) + GYM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGymId().hashCode();
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPokemonId());
    hash = (37 * hash) + PLAYER_LAT_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLatDegrees()));
    hash = (37 * hash) + PLAYER_LNG_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLngDegrees()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GymFeedPokemonProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GymFeedPokemonProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GymFeedPokemonProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GymFeedPokemonProto)
      POGOProtos.Rpc.GymFeedPokemonProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymFeedPokemonProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymFeedPokemonProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GymFeedPokemonProto.class, POGOProtos.Rpc.GymFeedPokemonProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GymFeedPokemonProto.newBuilder()
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

      startingQuantity_ = 0;

      gymId_ = "";

      pokemonId_ = 0L;

      playerLatDegrees_ = 0D;

      playerLngDegrees_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GymFeedPokemonProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymFeedPokemonProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GymFeedPokemonProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymFeedPokemonProto build() {
      POGOProtos.Rpc.GymFeedPokemonProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GymFeedPokemonProto buildPartial() {
      POGOProtos.Rpc.GymFeedPokemonProto result = new POGOProtos.Rpc.GymFeedPokemonProto(this);
      result.item_ = item_;
      result.startingQuantity_ = startingQuantity_;
      result.gymId_ = gymId_;
      result.pokemonId_ = pokemonId_;
      result.playerLatDegrees_ = playerLatDegrees_;
      result.playerLngDegrees_ = playerLngDegrees_;
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
      if (other instanceof POGOProtos.Rpc.GymFeedPokemonProto) {
        return mergeFrom((POGOProtos.Rpc.GymFeedPokemonProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GymFeedPokemonProto other) {
      if (other == POGOProtos.Rpc.GymFeedPokemonProto.getDefaultInstance()) return this;
      if (other.item_ != 0) {
        setItemValue(other.getItemValue());
      }
      if (other.getStartingQuantity() != 0) {
        setStartingQuantity(other.getStartingQuantity());
      }
      if (!other.getGymId().isEmpty()) {
        gymId_ = other.gymId_;
        onChanged();
      }
      if (other.getPokemonId() != 0L) {
        setPokemonId(other.getPokemonId());
      }
      if (other.getPlayerLatDegrees() != 0D) {
        setPlayerLatDegrees(other.getPlayerLatDegrees());
      }
      if (other.getPlayerLngDegrees() != 0D) {
        setPlayerLngDegrees(other.getPlayerLngDegrees());
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
      POGOProtos.Rpc.GymFeedPokemonProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GymFeedPokemonProto) e.getUnfinishedMessage();
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

    private int startingQuantity_ ;
    /**
     * <code>int32 starting_quantity = 2;</code>
     * @return The startingQuantity.
     */
    @java.lang.Override
    public int getStartingQuantity() {
      return startingQuantity_;
    }
    /**
     * <code>int32 starting_quantity = 2;</code>
     * @param value The startingQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setStartingQuantity(int value) {
      
      startingQuantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 starting_quantity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartingQuantity() {
      
      startingQuantity_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object gymId_ = "";
    /**
     * <code>string gym_id = 3;</code>
     * @return The gymId.
     */
    public java.lang.String getGymId() {
      java.lang.Object ref = gymId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gymId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gym_id = 3;</code>
     * @return The bytes for gymId.
     */
    public com.google.protobuf.ByteString
        getGymIdBytes() {
      java.lang.Object ref = gymId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gymId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gym_id = 3;</code>
     * @param value The gymId to set.
     * @return This builder for chaining.
     */
    public Builder setGymId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gymId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gym_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymId() {
      
      gymId_ = getDefaultInstance().getGymId();
      onChanged();
      return this;
    }
    /**
     * <code>string gym_id = 3;</code>
     * @param value The bytes for gymId to set.
     * @return This builder for chaining.
     */
    public Builder setGymIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gymId_ = value;
      onChanged();
      return this;
    }

    private long pokemonId_ ;
    /**
     * <code>fixed64 pokemon_id = 4;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public long getPokemonId() {
      return pokemonId_;
    }
    /**
     * <code>fixed64 pokemon_id = 4;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(long value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 pokemon_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0L;
      onChanged();
      return this;
    }

    private double playerLatDegrees_ ;
    /**
     * <code>double player_lat_degrees = 5;</code>
     * @return The playerLatDegrees.
     */
    @java.lang.Override
    public double getPlayerLatDegrees() {
      return playerLatDegrees_;
    }
    /**
     * <code>double player_lat_degrees = 5;</code>
     * @param value The playerLatDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLatDegrees(double value) {
      
      playerLatDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lat_degrees = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLatDegrees() {
      
      playerLatDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double playerLngDegrees_ ;
    /**
     * <code>double player_lng_degrees = 6;</code>
     * @return The playerLngDegrees.
     */
    @java.lang.Override
    public double getPlayerLngDegrees() {
      return playerLngDegrees_;
    }
    /**
     * <code>double player_lng_degrees = 6;</code>
     * @param value The playerLngDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLngDegrees(double value) {
      
      playerLngDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lng_degrees = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLngDegrees() {
      
      playerLngDegrees_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GymFeedPokemonProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GymFeedPokemonProto)
  private static final POGOProtos.Rpc.GymFeedPokemonProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GymFeedPokemonProto();
  }

  public static POGOProtos.Rpc.GymFeedPokemonProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GymFeedPokemonProto>
      PARSER = new com.google.protobuf.AbstractParser<GymFeedPokemonProto>() {
    @java.lang.Override
    public GymFeedPokemonProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GymFeedPokemonProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GymFeedPokemonProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GymFeedPokemonProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GymFeedPokemonProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

