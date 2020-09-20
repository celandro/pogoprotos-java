// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KLAOODOBBIG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PokemonThirdMoveAttributesProto}
 */
public final class PokemonThirdMoveAttributesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonThirdMoveAttributesProto)
    PokemonThirdMoveAttributesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonThirdMoveAttributesProto.newBuilder() to construct.
  private PokemonThirdMoveAttributesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonThirdMoveAttributesProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonThirdMoveAttributesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonThirdMoveAttributesProto(
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

            stardustToUnlock_ = input.readInt32();
            break;
          }
          case 16: {

            candyToUnlock_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonThirdMoveAttributesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonThirdMoveAttributesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonThirdMoveAttributesProto.class, POGOProtos.Rpc.PokemonThirdMoveAttributesProto.Builder.class);
  }

  public static final int STARDUST_TO_UNLOCK_FIELD_NUMBER = 1;
  private int stardustToUnlock_;
  /**
   * <code>int32 stardust_to_unlock = 1;</code>
   * @return The stardustToUnlock.
   */
  @java.lang.Override
  public int getStardustToUnlock() {
    return stardustToUnlock_;
  }

  public static final int CANDY_TO_UNLOCK_FIELD_NUMBER = 2;
  private int candyToUnlock_;
  /**
   * <code>int32 candy_to_unlock = 2;</code>
   * @return The candyToUnlock.
   */
  @java.lang.Override
  public int getCandyToUnlock() {
    return candyToUnlock_;
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
    if (stardustToUnlock_ != 0) {
      output.writeInt32(1, stardustToUnlock_);
    }
    if (candyToUnlock_ != 0) {
      output.writeInt32(2, candyToUnlock_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stardustToUnlock_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, stardustToUnlock_);
    }
    if (candyToUnlock_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, candyToUnlock_);
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
    if (!(obj instanceof POGOProtos.Rpc.PokemonThirdMoveAttributesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonThirdMoveAttributesProto other = (POGOProtos.Rpc.PokemonThirdMoveAttributesProto) obj;

    if (getStardustToUnlock()
        != other.getStardustToUnlock()) return false;
    if (getCandyToUnlock()
        != other.getCandyToUnlock()) return false;
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
    hash = (37 * hash) + STARDUST_TO_UNLOCK_FIELD_NUMBER;
    hash = (53 * hash) + getStardustToUnlock();
    hash = (37 * hash) + CANDY_TO_UNLOCK_FIELD_NUMBER;
    hash = (53 * hash) + getCandyToUnlock();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokemonThirdMoveAttributesProto prototype) {
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
   * ref: KLAOODOBBIG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PokemonThirdMoveAttributesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonThirdMoveAttributesProto)
      POGOProtos.Rpc.PokemonThirdMoveAttributesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonThirdMoveAttributesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonThirdMoveAttributesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonThirdMoveAttributesProto.class, POGOProtos.Rpc.PokemonThirdMoveAttributesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonThirdMoveAttributesProto.newBuilder()
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
      stardustToUnlock_ = 0;

      candyToUnlock_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonThirdMoveAttributesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonThirdMoveAttributesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonThirdMoveAttributesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonThirdMoveAttributesProto build() {
      POGOProtos.Rpc.PokemonThirdMoveAttributesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonThirdMoveAttributesProto buildPartial() {
      POGOProtos.Rpc.PokemonThirdMoveAttributesProto result = new POGOProtos.Rpc.PokemonThirdMoveAttributesProto(this);
      result.stardustToUnlock_ = stardustToUnlock_;
      result.candyToUnlock_ = candyToUnlock_;
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
      if (other instanceof POGOProtos.Rpc.PokemonThirdMoveAttributesProto) {
        return mergeFrom((POGOProtos.Rpc.PokemonThirdMoveAttributesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonThirdMoveAttributesProto other) {
      if (other == POGOProtos.Rpc.PokemonThirdMoveAttributesProto.getDefaultInstance()) return this;
      if (other.getStardustToUnlock() != 0) {
        setStardustToUnlock(other.getStardustToUnlock());
      }
      if (other.getCandyToUnlock() != 0) {
        setCandyToUnlock(other.getCandyToUnlock());
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
      POGOProtos.Rpc.PokemonThirdMoveAttributesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonThirdMoveAttributesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int stardustToUnlock_ ;
    /**
     * <code>int32 stardust_to_unlock = 1;</code>
     * @return The stardustToUnlock.
     */
    @java.lang.Override
    public int getStardustToUnlock() {
      return stardustToUnlock_;
    }
    /**
     * <code>int32 stardust_to_unlock = 1;</code>
     * @param value The stardustToUnlock to set.
     * @return This builder for chaining.
     */
    public Builder setStardustToUnlock(int value) {
      
      stardustToUnlock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 stardust_to_unlock = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStardustToUnlock() {
      
      stardustToUnlock_ = 0;
      onChanged();
      return this;
    }

    private int candyToUnlock_ ;
    /**
     * <code>int32 candy_to_unlock = 2;</code>
     * @return The candyToUnlock.
     */
    @java.lang.Override
    public int getCandyToUnlock() {
      return candyToUnlock_;
    }
    /**
     * <code>int32 candy_to_unlock = 2;</code>
     * @param value The candyToUnlock to set.
     * @return This builder for chaining.
     */
    public Builder setCandyToUnlock(int value) {
      
      candyToUnlock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 candy_to_unlock = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCandyToUnlock() {
      
      candyToUnlock_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonThirdMoveAttributesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonThirdMoveAttributesProto)
  private static final POGOProtos.Rpc.PokemonThirdMoveAttributesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonThirdMoveAttributesProto();
  }

  public static POGOProtos.Rpc.PokemonThirdMoveAttributesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonThirdMoveAttributesProto>
      PARSER = new com.google.protobuf.AbstractParser<PokemonThirdMoveAttributesProto>() {
    @java.lang.Override
    public PokemonThirdMoveAttributesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonThirdMoveAttributesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonThirdMoveAttributesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonThirdMoveAttributesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonThirdMoveAttributesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

