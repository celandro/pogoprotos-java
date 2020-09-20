// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PDHICIOGMNN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CombatTypeProto}
 */
public final class CombatTypeProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CombatTypeProto)
    CombatTypeProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatTypeProto.newBuilder() to construct.
  private CombatTypeProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatTypeProto() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatTypeProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatTypeProto(
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

            type_ = rawValue;
            break;
          }
          case 21: {

            niceLevelThreshold_ = input.readFloat();
            break;
          }
          case 29: {

            greatLevelThreshold_ = input.readFloat();
            break;
          }
          case 37: {

            excellentLevelThreshold_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatTypeProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatTypeProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CombatTypeProto.class, POGOProtos.Rpc.CombatTypeProto.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonType getType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(type_);
    return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
  }

  public static final int NICE_LEVEL_THRESHOLD_FIELD_NUMBER = 2;
  private float niceLevelThreshold_;
  /**
   * <code>float nice_level_threshold = 2;</code>
   * @return The niceLevelThreshold.
   */
  @java.lang.Override
  public float getNiceLevelThreshold() {
    return niceLevelThreshold_;
  }

  public static final int GREAT_LEVEL_THRESHOLD_FIELD_NUMBER = 3;
  private float greatLevelThreshold_;
  /**
   * <code>float great_level_threshold = 3;</code>
   * @return The greatLevelThreshold.
   */
  @java.lang.Override
  public float getGreatLevelThreshold() {
    return greatLevelThreshold_;
  }

  public static final int EXCELLENT_LEVEL_THRESHOLD_FIELD_NUMBER = 4;
  private float excellentLevelThreshold_;
  /**
   * <code>float excellent_level_threshold = 4;</code>
   * @return The excellentLevelThreshold.
   */
  @java.lang.Override
  public float getExcellentLevelThreshold() {
    return excellentLevelThreshold_;
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
    if (type_ != POGOProtos.Rpc.HoloPokemonType.HOLO_POKEMON_TYPE_POKEMON_TYPE_NONE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (niceLevelThreshold_ != 0F) {
      output.writeFloat(2, niceLevelThreshold_);
    }
    if (greatLevelThreshold_ != 0F) {
      output.writeFloat(3, greatLevelThreshold_);
    }
    if (excellentLevelThreshold_ != 0F) {
      output.writeFloat(4, excellentLevelThreshold_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != POGOProtos.Rpc.HoloPokemonType.HOLO_POKEMON_TYPE_POKEMON_TYPE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (niceLevelThreshold_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, niceLevelThreshold_);
    }
    if (greatLevelThreshold_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, greatLevelThreshold_);
    }
    if (excellentLevelThreshold_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, excellentLevelThreshold_);
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
    if (!(obj instanceof POGOProtos.Rpc.CombatTypeProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CombatTypeProto other = (POGOProtos.Rpc.CombatTypeProto) obj;

    if (type_ != other.type_) return false;
    if (java.lang.Float.floatToIntBits(getNiceLevelThreshold())
        != java.lang.Float.floatToIntBits(
            other.getNiceLevelThreshold())) return false;
    if (java.lang.Float.floatToIntBits(getGreatLevelThreshold())
        != java.lang.Float.floatToIntBits(
            other.getGreatLevelThreshold())) return false;
    if (java.lang.Float.floatToIntBits(getExcellentLevelThreshold())
        != java.lang.Float.floatToIntBits(
            other.getExcellentLevelThreshold())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + NICE_LEVEL_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNiceLevelThreshold());
    hash = (37 * hash) + GREAT_LEVEL_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGreatLevelThreshold());
    hash = (37 * hash) + EXCELLENT_LEVEL_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getExcellentLevelThreshold());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CombatTypeProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatTypeProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CombatTypeProto prototype) {
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
   * ref: PDHICIOGMNN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CombatTypeProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CombatTypeProto)
      POGOProtos.Rpc.CombatTypeProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatTypeProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatTypeProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CombatTypeProto.class, POGOProtos.Rpc.CombatTypeProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CombatTypeProto.newBuilder()
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
      type_ = 0;

      niceLevelThreshold_ = 0F;

      greatLevelThreshold_ = 0F;

      excellentLevelThreshold_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatTypeProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatTypeProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CombatTypeProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatTypeProto build() {
      POGOProtos.Rpc.CombatTypeProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatTypeProto buildPartial() {
      POGOProtos.Rpc.CombatTypeProto result = new POGOProtos.Rpc.CombatTypeProto(this);
      result.type_ = type_;
      result.niceLevelThreshold_ = niceLevelThreshold_;
      result.greatLevelThreshold_ = greatLevelThreshold_;
      result.excellentLevelThreshold_ = excellentLevelThreshold_;
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
      if (other instanceof POGOProtos.Rpc.CombatTypeProto) {
        return mergeFrom((POGOProtos.Rpc.CombatTypeProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CombatTypeProto other) {
      if (other == POGOProtos.Rpc.CombatTypeProto.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getNiceLevelThreshold() != 0F) {
        setNiceLevelThreshold(other.getNiceLevelThreshold());
      }
      if (other.getGreatLevelThreshold() != 0F) {
        setGreatLevelThreshold(other.getGreatLevelThreshold());
      }
      if (other.getExcellentLevelThreshold() != 0F) {
        setExcellentLevelThreshold(other.getExcellentLevelThreshold());
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
      POGOProtos.Rpc.CombatTypeProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CombatTypeProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonType getType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonType result = POGOProtos.Rpc.HoloPokemonType.valueOf(type_);
      return result == null ? POGOProtos.Rpc.HoloPokemonType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(POGOProtos.Rpc.HoloPokemonType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private float niceLevelThreshold_ ;
    /**
     * <code>float nice_level_threshold = 2;</code>
     * @return The niceLevelThreshold.
     */
    @java.lang.Override
    public float getNiceLevelThreshold() {
      return niceLevelThreshold_;
    }
    /**
     * <code>float nice_level_threshold = 2;</code>
     * @param value The niceLevelThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setNiceLevelThreshold(float value) {
      
      niceLevelThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float nice_level_threshold = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNiceLevelThreshold() {
      
      niceLevelThreshold_ = 0F;
      onChanged();
      return this;
    }

    private float greatLevelThreshold_ ;
    /**
     * <code>float great_level_threshold = 3;</code>
     * @return The greatLevelThreshold.
     */
    @java.lang.Override
    public float getGreatLevelThreshold() {
      return greatLevelThreshold_;
    }
    /**
     * <code>float great_level_threshold = 3;</code>
     * @param value The greatLevelThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setGreatLevelThreshold(float value) {
      
      greatLevelThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float great_level_threshold = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGreatLevelThreshold() {
      
      greatLevelThreshold_ = 0F;
      onChanged();
      return this;
    }

    private float excellentLevelThreshold_ ;
    /**
     * <code>float excellent_level_threshold = 4;</code>
     * @return The excellentLevelThreshold.
     */
    @java.lang.Override
    public float getExcellentLevelThreshold() {
      return excellentLevelThreshold_;
    }
    /**
     * <code>float excellent_level_threshold = 4;</code>
     * @param value The excellentLevelThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setExcellentLevelThreshold(float value) {
      
      excellentLevelThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float excellent_level_threshold = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExcellentLevelThreshold() {
      
      excellentLevelThreshold_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CombatTypeProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CombatTypeProto)
  private static final POGOProtos.Rpc.CombatTypeProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CombatTypeProto();
  }

  public static POGOProtos.Rpc.CombatTypeProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatTypeProto>
      PARSER = new com.google.protobuf.AbstractParser<CombatTypeProto>() {
    @java.lang.Override
    public CombatTypeProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatTypeProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatTypeProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatTypeProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CombatTypeProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

