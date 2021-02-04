// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ChangePokemonFormProto}
 */
public final class ChangePokemonFormProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ChangePokemonFormProto)
    ChangePokemonFormProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangePokemonFormProto.newBuilder() to construct.
  private ChangePokemonFormProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangePokemonFormProto() {
    targetForm_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChangePokemonFormProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangePokemonFormProto(
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
          case 9: {

            pokemonId_ = input.readFixed64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            targetForm_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ChangePokemonFormProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ChangePokemonFormProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ChangePokemonFormProto.class, POGOProtos.Rpc.ChangePokemonFormProto.Builder.class);
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 1;
  private long pokemonId_;
  /**
   * <code>fixed64 pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  @java.lang.Override
  public long getPokemonId() {
    return pokemonId_;
  }

  public static final int TARGET_FORM_FIELD_NUMBER = 2;
  private int targetForm_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form target_form = 2;</code>
   * @return The enum numeric value on the wire for targetForm.
   */
  @java.lang.Override public int getTargetFormValue() {
    return targetForm_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form target_form = 2;</code>
   * @return The targetForm.
   */
  @java.lang.Override public POGOProtos.Rpc.PokemonDisplayProto.Form getTargetForm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(targetForm_);
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
    if (pokemonId_ != 0L) {
      output.writeFixed64(1, pokemonId_);
    }
    if (targetForm_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      output.writeEnum(2, targetForm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(1, pokemonId_);
    }
    if (targetForm_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, targetForm_);
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
    if (!(obj instanceof POGOProtos.Rpc.ChangePokemonFormProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ChangePokemonFormProto other = (POGOProtos.Rpc.ChangePokemonFormProto) obj;

    if (getPokemonId()
        != other.getPokemonId()) return false;
    if (targetForm_ != other.targetForm_) return false;
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
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPokemonId());
    hash = (37 * hash) + TARGET_FORM_FIELD_NUMBER;
    hash = (53 * hash) + targetForm_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ChangePokemonFormProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ChangePokemonFormProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ChangePokemonFormProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ChangePokemonFormProto)
      POGOProtos.Rpc.ChangePokemonFormProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ChangePokemonFormProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ChangePokemonFormProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ChangePokemonFormProto.class, POGOProtos.Rpc.ChangePokemonFormProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ChangePokemonFormProto.newBuilder()
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
      pokemonId_ = 0L;

      targetForm_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ChangePokemonFormProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ChangePokemonFormProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ChangePokemonFormProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ChangePokemonFormProto build() {
      POGOProtos.Rpc.ChangePokemonFormProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ChangePokemonFormProto buildPartial() {
      POGOProtos.Rpc.ChangePokemonFormProto result = new POGOProtos.Rpc.ChangePokemonFormProto(this);
      result.pokemonId_ = pokemonId_;
      result.targetForm_ = targetForm_;
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
      if (other instanceof POGOProtos.Rpc.ChangePokemonFormProto) {
        return mergeFrom((POGOProtos.Rpc.ChangePokemonFormProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ChangePokemonFormProto other) {
      if (other == POGOProtos.Rpc.ChangePokemonFormProto.getDefaultInstance()) return this;
      if (other.getPokemonId() != 0L) {
        setPokemonId(other.getPokemonId());
      }
      if (other.targetForm_ != 0) {
        setTargetFormValue(other.getTargetFormValue());
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
      POGOProtos.Rpc.ChangePokemonFormProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ChangePokemonFormProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long pokemonId_ ;
    /**
     * <code>fixed64 pokemon_id = 1;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public long getPokemonId() {
      return pokemonId_;
    }
    /**
     * <code>fixed64 pokemon_id = 1;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(long value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 pokemon_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0L;
      onChanged();
      return this;
    }

    private int targetForm_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form target_form = 2;</code>
     * @return The enum numeric value on the wire for targetForm.
     */
    @java.lang.Override public int getTargetFormValue() {
      return targetForm_;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form target_form = 2;</code>
     * @param value The enum numeric value on the wire for targetForm to set.
     * @return This builder for chaining.
     */
    public Builder setTargetFormValue(int value) {
      
      targetForm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form target_form = 2;</code>
     * @return The targetForm.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PokemonDisplayProto.Form getTargetForm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(targetForm_);
      return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Form.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form target_form = 2;</code>
     * @param value The targetForm to set.
     * @return This builder for chaining.
     */
    public Builder setTargetForm(POGOProtos.Rpc.PokemonDisplayProto.Form value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      targetForm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form target_form = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetForm() {
      
      targetForm_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ChangePokemonFormProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ChangePokemonFormProto)
  private static final POGOProtos.Rpc.ChangePokemonFormProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ChangePokemonFormProto();
  }

  public static POGOProtos.Rpc.ChangePokemonFormProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangePokemonFormProto>
      PARSER = new com.google.protobuf.AbstractParser<ChangePokemonFormProto>() {
    @java.lang.Override
    public ChangePokemonFormProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangePokemonFormProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangePokemonFormProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangePokemonFormProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ChangePokemonFormProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

