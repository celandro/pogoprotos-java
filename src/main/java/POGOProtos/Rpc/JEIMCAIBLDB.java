// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JEIMCAIBLDB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JEIMCAIBLDB}
 */
public final class JEIMCAIBLDB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JEIMCAIBLDB)
    JEIMCAIBLDBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JEIMCAIBLDB.newBuilder() to construct.
  private JEIMCAIBLDB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JEIMCAIBLDB() {
    temporaryEvolutionId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JEIMCAIBLDB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JEIMCAIBLDB(
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

            mfkgkhdmbpb_ = input.readUInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            temporaryEvolutionId_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JEIMCAIBLDB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JEIMCAIBLDB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JEIMCAIBLDB.class, POGOProtos.Rpc.JEIMCAIBLDB.Builder.class);
  }

  public static final int MFKGKHDMBPB_FIELD_NUMBER = 1;
  private long mfkgkhdmbpb_;
  /**
   * <code>uint64 mfkgkhdmbpb = 1;</code>
   * @return The mfkgkhdmbpb.
   */
  @java.lang.Override
  public long getMfkgkhdmbpb() {
    return mfkgkhdmbpb_;
  }

  public static final int TEMPORARY_EVOLUTION_ID_FIELD_NUMBER = 2;
  private int temporaryEvolutionId_;
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 2;</code>
   * @return The enum numeric value on the wire for temporaryEvolutionId.
   */
  @java.lang.Override public int getTemporaryEvolutionIdValue() {
    return temporaryEvolutionId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 2;</code>
   * @return The temporaryEvolutionId.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloTemporaryEvolutionId getTemporaryEvolutionId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloTemporaryEvolutionId result = POGOProtos.Rpc.HoloTemporaryEvolutionId.valueOf(temporaryEvolutionId_);
    return result == null ? POGOProtos.Rpc.HoloTemporaryEvolutionId.UNRECOGNIZED : result;
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
    if (mfkgkhdmbpb_ != 0L) {
      output.writeUInt64(1, mfkgkhdmbpb_);
    }
    if (temporaryEvolutionId_ != POGOProtos.Rpc.HoloTemporaryEvolutionId.TEMP_EVOLUTION_UNSET.getNumber()) {
      output.writeEnum(2, temporaryEvolutionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mfkgkhdmbpb_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, mfkgkhdmbpb_);
    }
    if (temporaryEvolutionId_ != POGOProtos.Rpc.HoloTemporaryEvolutionId.TEMP_EVOLUTION_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, temporaryEvolutionId_);
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
    if (!(obj instanceof POGOProtos.Rpc.JEIMCAIBLDB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JEIMCAIBLDB other = (POGOProtos.Rpc.JEIMCAIBLDB) obj;

    if (getMfkgkhdmbpb()
        != other.getMfkgkhdmbpb()) return false;
    if (temporaryEvolutionId_ != other.temporaryEvolutionId_) return false;
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
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMfkgkhdmbpb());
    hash = (37 * hash) + TEMPORARY_EVOLUTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + temporaryEvolutionId_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JEIMCAIBLDB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JEIMCAIBLDB prototype) {
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
   * ref: JEIMCAIBLDB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JEIMCAIBLDB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JEIMCAIBLDB)
      POGOProtos.Rpc.JEIMCAIBLDBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JEIMCAIBLDB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JEIMCAIBLDB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JEIMCAIBLDB.class, POGOProtos.Rpc.JEIMCAIBLDB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JEIMCAIBLDB.newBuilder()
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
      mfkgkhdmbpb_ = 0L;

      temporaryEvolutionId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JEIMCAIBLDB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JEIMCAIBLDB getDefaultInstanceForType() {
      return POGOProtos.Rpc.JEIMCAIBLDB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JEIMCAIBLDB build() {
      POGOProtos.Rpc.JEIMCAIBLDB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JEIMCAIBLDB buildPartial() {
      POGOProtos.Rpc.JEIMCAIBLDB result = new POGOProtos.Rpc.JEIMCAIBLDB(this);
      result.mfkgkhdmbpb_ = mfkgkhdmbpb_;
      result.temporaryEvolutionId_ = temporaryEvolutionId_;
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
      if (other instanceof POGOProtos.Rpc.JEIMCAIBLDB) {
        return mergeFrom((POGOProtos.Rpc.JEIMCAIBLDB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JEIMCAIBLDB other) {
      if (other == POGOProtos.Rpc.JEIMCAIBLDB.getDefaultInstance()) return this;
      if (other.getMfkgkhdmbpb() != 0L) {
        setMfkgkhdmbpb(other.getMfkgkhdmbpb());
      }
      if (other.temporaryEvolutionId_ != 0) {
        setTemporaryEvolutionIdValue(other.getTemporaryEvolutionIdValue());
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
      POGOProtos.Rpc.JEIMCAIBLDB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JEIMCAIBLDB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long mfkgkhdmbpb_ ;
    /**
     * <code>uint64 mfkgkhdmbpb = 1;</code>
     * @return The mfkgkhdmbpb.
     */
    @java.lang.Override
    public long getMfkgkhdmbpb() {
      return mfkgkhdmbpb_;
    }
    /**
     * <code>uint64 mfkgkhdmbpb = 1;</code>
     * @param value The mfkgkhdmbpb to set.
     * @return This builder for chaining.
     */
    public Builder setMfkgkhdmbpb(long value) {
      
      mfkgkhdmbpb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 mfkgkhdmbpb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfkgkhdmbpb() {
      
      mfkgkhdmbpb_ = 0L;
      onChanged();
      return this;
    }

    private int temporaryEvolutionId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 2;</code>
     * @return The enum numeric value on the wire for temporaryEvolutionId.
     */
    @java.lang.Override public int getTemporaryEvolutionIdValue() {
      return temporaryEvolutionId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 2;</code>
     * @param value The enum numeric value on the wire for temporaryEvolutionId to set.
     * @return This builder for chaining.
     */
    public Builder setTemporaryEvolutionIdValue(int value) {
      
      temporaryEvolutionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 2;</code>
     * @return The temporaryEvolutionId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloTemporaryEvolutionId getTemporaryEvolutionId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloTemporaryEvolutionId result = POGOProtos.Rpc.HoloTemporaryEvolutionId.valueOf(temporaryEvolutionId_);
      return result == null ? POGOProtos.Rpc.HoloTemporaryEvolutionId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 2;</code>
     * @param value The temporaryEvolutionId to set.
     * @return This builder for chaining.
     */
    public Builder setTemporaryEvolutionId(POGOProtos.Rpc.HoloTemporaryEvolutionId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      temporaryEvolutionId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemporaryEvolutionId() {
      
      temporaryEvolutionId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JEIMCAIBLDB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JEIMCAIBLDB)
  private static final POGOProtos.Rpc.JEIMCAIBLDB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JEIMCAIBLDB();
  }

  public static POGOProtos.Rpc.JEIMCAIBLDB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JEIMCAIBLDB>
      PARSER = new com.google.protobuf.AbstractParser<JEIMCAIBLDB>() {
    @java.lang.Override
    public JEIMCAIBLDB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JEIMCAIBLDB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JEIMCAIBLDB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JEIMCAIBLDB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JEIMCAIBLDB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
