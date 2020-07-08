// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/EggIncubator.proto

package POGOProtos.Inventory;

/**
 * Protobuf type {@code POGOProtos.Inventory.EggIncubator}
 */
public  final class EggIncubator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Inventory.EggIncubator)
    EggIncubatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EggIncubator.newBuilder() to construct.
  private EggIncubator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EggIncubator() {
    id_ = "";
    itemId_ = 0;
    incubatorType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EggIncubator();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EggIncubator(
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

            id_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            itemId_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            incubatorType_ = rawValue;
            break;
          }
          case 32: {

            usesRemaining_ = input.readInt32();
            break;
          }
          case 41: {

            pokemonId_ = input.readFixed64();
            break;
          }
          case 49: {

            startKmWalked_ = input.readDouble();
            break;
          }
          case 57: {

            targetKmWalked_ = input.readDouble();
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
    return POGOProtos.Inventory.EggIncubatorOuterClass.internal_static_POGOProtos_Inventory_EggIncubator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Inventory.EggIncubatorOuterClass.internal_static_POGOProtos_Inventory_EggIncubator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Inventory.EggIncubator.class, POGOProtos.Inventory.EggIncubator.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEM_ID_FIELD_NUMBER = 2;
  private int itemId_;
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 2;</code>
   * @return The enum numeric value on the wire for itemId.
   */
  public int getItemIdValue() {
    return itemId_;
  }
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 2;</code>
   * @return The itemId.
   */
  public POGOProtos.Inventory.Item.ItemId getItemId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(itemId_);
    return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
  }

  public static final int INCUBATOR_TYPE_FIELD_NUMBER = 3;
  private int incubatorType_;
  /**
   * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 3;</code>
   * @return The enum numeric value on the wire for incubatorType.
   */
  public int getIncubatorTypeValue() {
    return incubatorType_;
  }
  /**
   * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 3;</code>
   * @return The incubatorType.
   */
  public POGOProtos.Inventory.EggIncubatorType getIncubatorType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Inventory.EggIncubatorType result = POGOProtos.Inventory.EggIncubatorType.valueOf(incubatorType_);
    return result == null ? POGOProtos.Inventory.EggIncubatorType.UNRECOGNIZED : result;
  }

  public static final int USES_REMAINING_FIELD_NUMBER = 4;
  private int usesRemaining_;
  /**
   * <code>int32 uses_remaining = 4;</code>
   * @return The usesRemaining.
   */
  public int getUsesRemaining() {
    return usesRemaining_;
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 5;
  private long pokemonId_;
  /**
   * <code>fixed64 pokemon_id = 5;</code>
   * @return The pokemonId.
   */
  public long getPokemonId() {
    return pokemonId_;
  }

  public static final int START_KM_WALKED_FIELD_NUMBER = 6;
  private double startKmWalked_;
  /**
   * <code>double start_km_walked = 6;</code>
   * @return The startKmWalked.
   */
  public double getStartKmWalked() {
    return startKmWalked_;
  }

  public static final int TARGET_KM_WALKED_FIELD_NUMBER = 7;
  private double targetKmWalked_;
  /**
   * <code>double target_km_walked = 7;</code>
   * @return The targetKmWalked.
   */
  public double getTargetKmWalked() {
    return targetKmWalked_;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (itemId_ != POGOProtos.Inventory.Item.ItemId.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(2, itemId_);
    }
    if (incubatorType_ != POGOProtos.Inventory.EggIncubatorType.INCUBATOR_UNSET.getNumber()) {
      output.writeEnum(3, incubatorType_);
    }
    if (usesRemaining_ != 0) {
      output.writeInt32(4, usesRemaining_);
    }
    if (pokemonId_ != 0L) {
      output.writeFixed64(5, pokemonId_);
    }
    if (startKmWalked_ != 0D) {
      output.writeDouble(6, startKmWalked_);
    }
    if (targetKmWalked_ != 0D) {
      output.writeDouble(7, targetKmWalked_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (itemId_ != POGOProtos.Inventory.Item.ItemId.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, itemId_);
    }
    if (incubatorType_ != POGOProtos.Inventory.EggIncubatorType.INCUBATOR_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, incubatorType_);
    }
    if (usesRemaining_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, usesRemaining_);
    }
    if (pokemonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(5, pokemonId_);
    }
    if (startKmWalked_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, startKmWalked_);
    }
    if (targetKmWalked_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, targetKmWalked_);
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
    if (!(obj instanceof POGOProtos.Inventory.EggIncubator)) {
      return super.equals(obj);
    }
    POGOProtos.Inventory.EggIncubator other = (POGOProtos.Inventory.EggIncubator) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (itemId_ != other.itemId_) return false;
    if (incubatorType_ != other.incubatorType_) return false;
    if (getUsesRemaining()
        != other.getUsesRemaining()) return false;
    if (getPokemonId()
        != other.getPokemonId()) return false;
    if (java.lang.Double.doubleToLongBits(getStartKmWalked())
        != java.lang.Double.doubleToLongBits(
            other.getStartKmWalked())) return false;
    if (java.lang.Double.doubleToLongBits(getTargetKmWalked())
        != java.lang.Double.doubleToLongBits(
            other.getTargetKmWalked())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
    hash = (53 * hash) + itemId_;
    hash = (37 * hash) + INCUBATOR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + incubatorType_;
    hash = (37 * hash) + USES_REMAINING_FIELD_NUMBER;
    hash = (53 * hash) + getUsesRemaining();
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPokemonId());
    hash = (37 * hash) + START_KM_WALKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getStartKmWalked()));
    hash = (37 * hash) + TARGET_KM_WALKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTargetKmWalked()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Inventory.EggIncubator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.EggIncubator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.EggIncubator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.EggIncubator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.EggIncubator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Inventory.EggIncubator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Inventory.EggIncubator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.EggIncubator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.EggIncubator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.EggIncubator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Inventory.EggIncubator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Inventory.EggIncubator parseFrom(
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
  public static Builder newBuilder(POGOProtos.Inventory.EggIncubator prototype) {
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
   * Protobuf type {@code POGOProtos.Inventory.EggIncubator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Inventory.EggIncubator)
      POGOProtos.Inventory.EggIncubatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Inventory.EggIncubatorOuterClass.internal_static_POGOProtos_Inventory_EggIncubator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Inventory.EggIncubatorOuterClass.internal_static_POGOProtos_Inventory_EggIncubator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Inventory.EggIncubator.class, POGOProtos.Inventory.EggIncubator.Builder.class);
    }

    // Construct using POGOProtos.Inventory.EggIncubator.newBuilder()
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
      id_ = "";

      itemId_ = 0;

      incubatorType_ = 0;

      usesRemaining_ = 0;

      pokemonId_ = 0L;

      startKmWalked_ = 0D;

      targetKmWalked_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Inventory.EggIncubatorOuterClass.internal_static_POGOProtos_Inventory_EggIncubator_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Inventory.EggIncubator getDefaultInstanceForType() {
      return POGOProtos.Inventory.EggIncubator.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Inventory.EggIncubator build() {
      POGOProtos.Inventory.EggIncubator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Inventory.EggIncubator buildPartial() {
      POGOProtos.Inventory.EggIncubator result = new POGOProtos.Inventory.EggIncubator(this);
      result.id_ = id_;
      result.itemId_ = itemId_;
      result.incubatorType_ = incubatorType_;
      result.usesRemaining_ = usesRemaining_;
      result.pokemonId_ = pokemonId_;
      result.startKmWalked_ = startKmWalked_;
      result.targetKmWalked_ = targetKmWalked_;
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
      if (other instanceof POGOProtos.Inventory.EggIncubator) {
        return mergeFrom((POGOProtos.Inventory.EggIncubator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Inventory.EggIncubator other) {
      if (other == POGOProtos.Inventory.EggIncubator.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.itemId_ != 0) {
        setItemIdValue(other.getItemIdValue());
      }
      if (other.incubatorType_ != 0) {
        setIncubatorTypeValue(other.getIncubatorTypeValue());
      }
      if (other.getUsesRemaining() != 0) {
        setUsesRemaining(other.getUsesRemaining());
      }
      if (other.getPokemonId() != 0L) {
        setPokemonId(other.getPokemonId());
      }
      if (other.getStartKmWalked() != 0D) {
        setStartKmWalked(other.getStartKmWalked());
      }
      if (other.getTargetKmWalked() != 0D) {
        setTargetKmWalked(other.getTargetKmWalked());
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
      POGOProtos.Inventory.EggIncubator parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Inventory.EggIncubator) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private int itemId_ = 0;
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 2;</code>
     * @return The enum numeric value on the wire for itemId.
     */
    public int getItemIdValue() {
      return itemId_;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 2;</code>
     * @param value The enum numeric value on the wire for itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdValue(int value) {
      itemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 2;</code>
     * @return The itemId.
     */
    public POGOProtos.Inventory.Item.ItemId getItemId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Inventory.Item.ItemId result = POGOProtos.Inventory.Item.ItemId.valueOf(itemId_);
      return result == null ? POGOProtos.Inventory.Item.ItemId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 2;</code>
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(POGOProtos.Inventory.Item.ItemId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      itemId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Item.ItemId item_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      
      itemId_ = 0;
      onChanged();
      return this;
    }

    private int incubatorType_ = 0;
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 3;</code>
     * @return The enum numeric value on the wire for incubatorType.
     */
    public int getIncubatorTypeValue() {
      return incubatorType_;
    }
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 3;</code>
     * @param value The enum numeric value on the wire for incubatorType to set.
     * @return This builder for chaining.
     */
    public Builder setIncubatorTypeValue(int value) {
      incubatorType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 3;</code>
     * @return The incubatorType.
     */
    public POGOProtos.Inventory.EggIncubatorType getIncubatorType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Inventory.EggIncubatorType result = POGOProtos.Inventory.EggIncubatorType.valueOf(incubatorType_);
      return result == null ? POGOProtos.Inventory.EggIncubatorType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 3;</code>
     * @param value The incubatorType to set.
     * @return This builder for chaining.
     */
    public Builder setIncubatorType(POGOProtos.Inventory.EggIncubatorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      incubatorType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncubatorType() {
      
      incubatorType_ = 0;
      onChanged();
      return this;
    }

    private int usesRemaining_ ;
    /**
     * <code>int32 uses_remaining = 4;</code>
     * @return The usesRemaining.
     */
    public int getUsesRemaining() {
      return usesRemaining_;
    }
    /**
     * <code>int32 uses_remaining = 4;</code>
     * @param value The usesRemaining to set.
     * @return This builder for chaining.
     */
    public Builder setUsesRemaining(int value) {
      
      usesRemaining_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 uses_remaining = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsesRemaining() {
      
      usesRemaining_ = 0;
      onChanged();
      return this;
    }

    private long pokemonId_ ;
    /**
     * <code>fixed64 pokemon_id = 5;</code>
     * @return The pokemonId.
     */
    public long getPokemonId() {
      return pokemonId_;
    }
    /**
     * <code>fixed64 pokemon_id = 5;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(long value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 pokemon_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0L;
      onChanged();
      return this;
    }

    private double startKmWalked_ ;
    /**
     * <code>double start_km_walked = 6;</code>
     * @return The startKmWalked.
     */
    public double getStartKmWalked() {
      return startKmWalked_;
    }
    /**
     * <code>double start_km_walked = 6;</code>
     * @param value The startKmWalked to set.
     * @return This builder for chaining.
     */
    public Builder setStartKmWalked(double value) {
      
      startKmWalked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double start_km_walked = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartKmWalked() {
      
      startKmWalked_ = 0D;
      onChanged();
      return this;
    }

    private double targetKmWalked_ ;
    /**
     * <code>double target_km_walked = 7;</code>
     * @return The targetKmWalked.
     */
    public double getTargetKmWalked() {
      return targetKmWalked_;
    }
    /**
     * <code>double target_km_walked = 7;</code>
     * @param value The targetKmWalked to set.
     * @return This builder for chaining.
     */
    public Builder setTargetKmWalked(double value) {
      
      targetKmWalked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double target_km_walked = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetKmWalked() {
      
      targetKmWalked_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Inventory.EggIncubator)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Inventory.EggIncubator)
  private static final POGOProtos.Inventory.EggIncubator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Inventory.EggIncubator();
  }

  public static POGOProtos.Inventory.EggIncubator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EggIncubator>
      PARSER = new com.google.protobuf.AbstractParser<EggIncubator>() {
    @java.lang.Override
    public EggIncubator parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EggIncubator(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EggIncubator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EggIncubator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Inventory.EggIncubator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
