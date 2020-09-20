// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HANFDEBBNAL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.SmeargleMovesSettingsProto}
 */
public final class SmeargleMovesSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SmeargleMovesSettingsProto)
    SmeargleMovesSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmeargleMovesSettingsProto.newBuilder() to construct.
  private SmeargleMovesSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmeargleMovesSettingsProto() {
    quickMoves_ = java.util.Collections.emptyList();
    cinematicMoves_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmeargleMovesSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SmeargleMovesSettingsProto(
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
          case 8: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              quickMoves_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            quickMoves_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                quickMoves_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              quickMoves_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              cinematicMoves_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            cinematicMoves_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                cinematicMoves_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              cinematicMoves_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        quickMoves_ = java.util.Collections.unmodifiableList(quickMoves_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        cinematicMoves_ = java.util.Collections.unmodifiableList(cinematicMoves_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SmeargleMovesSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SmeargleMovesSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SmeargleMovesSettingsProto.class, POGOProtos.Rpc.SmeargleMovesSettingsProto.Builder.class);
  }

  public static final int QUICK_MOVES_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> quickMoves_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.HoloPokemonMove> quickMoves_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.HoloPokemonMove>() {
            public POGOProtos.Rpc.HoloPokemonMove convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.HoloPokemonMove result = POGOProtos.Rpc.HoloPokemonMove.valueOf(from);
              return result == null ? POGOProtos.Rpc.HoloPokemonMove.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
   * @return A list containing the quickMoves.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.HoloPokemonMove> getQuickMovesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.HoloPokemonMove>(quickMoves_, quickMoves_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
   * @return The count of quickMoves.
   */
  @java.lang.Override
  public int getQuickMovesCount() {
    return quickMoves_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
   * @param index The index of the element to return.
   * @return The quickMoves at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HoloPokemonMove getQuickMoves(int index) {
    return quickMoves_converter_.convert(quickMoves_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
   * @return A list containing the enum numeric values on the wire for quickMoves.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getQuickMovesValueList() {
    return quickMoves_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of quickMoves at the given index.
   */
  @java.lang.Override
  public int getQuickMovesValue(int index) {
    return quickMoves_.get(index);
  }
  private int quickMovesMemoizedSerializedSize;

  public static final int CINEMATIC_MOVES_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> cinematicMoves_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.HoloPokemonMove> cinematicMoves_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.HoloPokemonMove>() {
            public POGOProtos.Rpc.HoloPokemonMove convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.HoloPokemonMove result = POGOProtos.Rpc.HoloPokemonMove.valueOf(from);
              return result == null ? POGOProtos.Rpc.HoloPokemonMove.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
   * @return A list containing the cinematicMoves.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.HoloPokemonMove> getCinematicMovesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.HoloPokemonMove>(cinematicMoves_, cinematicMoves_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
   * @return The count of cinematicMoves.
   */
  @java.lang.Override
  public int getCinematicMovesCount() {
    return cinematicMoves_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
   * @param index The index of the element to return.
   * @return The cinematicMoves at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HoloPokemonMove getCinematicMoves(int index) {
    return cinematicMoves_converter_.convert(cinematicMoves_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
   * @return A list containing the enum numeric values on the wire for cinematicMoves.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getCinematicMovesValueList() {
    return cinematicMoves_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of cinematicMoves at the given index.
   */
  @java.lang.Override
  public int getCinematicMovesValue(int index) {
    return cinematicMoves_.get(index);
  }
  private int cinematicMovesMemoizedSerializedSize;

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
    getSerializedSize();
    if (getQuickMovesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(quickMovesMemoizedSerializedSize);
    }
    for (int i = 0; i < quickMoves_.size(); i++) {
      output.writeEnumNoTag(quickMoves_.get(i));
    }
    if (getCinematicMovesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(cinematicMovesMemoizedSerializedSize);
    }
    for (int i = 0; i < cinematicMoves_.size(); i++) {
      output.writeEnumNoTag(cinematicMoves_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < quickMoves_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(quickMoves_.get(i));
      }
      size += dataSize;
      if (!getQuickMovesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }quickMovesMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < cinematicMoves_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(cinematicMoves_.get(i));
      }
      size += dataSize;
      if (!getCinematicMovesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }cinematicMovesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.SmeargleMovesSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SmeargleMovesSettingsProto other = (POGOProtos.Rpc.SmeargleMovesSettingsProto) obj;

    if (!quickMoves_.equals(other.quickMoves_)) return false;
    if (!cinematicMoves_.equals(other.cinematicMoves_)) return false;
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
    if (getQuickMovesCount() > 0) {
      hash = (37 * hash) + QUICK_MOVES_FIELD_NUMBER;
      hash = (53 * hash) + quickMoves_.hashCode();
    }
    if (getCinematicMovesCount() > 0) {
      hash = (37 * hash) + CINEMATIC_MOVES_FIELD_NUMBER;
      hash = (53 * hash) + cinematicMoves_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SmeargleMovesSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SmeargleMovesSettingsProto prototype) {
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
   * ref: HANFDEBBNAL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.SmeargleMovesSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SmeargleMovesSettingsProto)
      POGOProtos.Rpc.SmeargleMovesSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SmeargleMovesSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SmeargleMovesSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SmeargleMovesSettingsProto.class, POGOProtos.Rpc.SmeargleMovesSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SmeargleMovesSettingsProto.newBuilder()
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
      quickMoves_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      cinematicMoves_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SmeargleMovesSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SmeargleMovesSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.SmeargleMovesSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SmeargleMovesSettingsProto build() {
      POGOProtos.Rpc.SmeargleMovesSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SmeargleMovesSettingsProto buildPartial() {
      POGOProtos.Rpc.SmeargleMovesSettingsProto result = new POGOProtos.Rpc.SmeargleMovesSettingsProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        quickMoves_ = java.util.Collections.unmodifiableList(quickMoves_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.quickMoves_ = quickMoves_;
      if (((bitField0_ & 0x00000002) != 0)) {
        cinematicMoves_ = java.util.Collections.unmodifiableList(cinematicMoves_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.cinematicMoves_ = cinematicMoves_;
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
      if (other instanceof POGOProtos.Rpc.SmeargleMovesSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.SmeargleMovesSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SmeargleMovesSettingsProto other) {
      if (other == POGOProtos.Rpc.SmeargleMovesSettingsProto.getDefaultInstance()) return this;
      if (!other.quickMoves_.isEmpty()) {
        if (quickMoves_.isEmpty()) {
          quickMoves_ = other.quickMoves_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureQuickMovesIsMutable();
          quickMoves_.addAll(other.quickMoves_);
        }
        onChanged();
      }
      if (!other.cinematicMoves_.isEmpty()) {
        if (cinematicMoves_.isEmpty()) {
          cinematicMoves_ = other.cinematicMoves_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCinematicMovesIsMutable();
          cinematicMoves_.addAll(other.cinematicMoves_);
        }
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
      POGOProtos.Rpc.SmeargleMovesSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SmeargleMovesSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> quickMoves_ =
      java.util.Collections.emptyList();
    private void ensureQuickMovesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        quickMoves_ = new java.util.ArrayList<java.lang.Integer>(quickMoves_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @return A list containing the quickMoves.
     */
    public java.util.List<POGOProtos.Rpc.HoloPokemonMove> getQuickMovesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.HoloPokemonMove>(quickMoves_, quickMoves_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @return The count of quickMoves.
     */
    public int getQuickMovesCount() {
      return quickMoves_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @param index The index of the element to return.
     * @return The quickMoves at the given index.
     */
    public POGOProtos.Rpc.HoloPokemonMove getQuickMoves(int index) {
      return quickMoves_converter_.convert(quickMoves_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @param index The index to set the value at.
     * @param value The quickMoves to set.
     * @return This builder for chaining.
     */
    public Builder setQuickMoves(
        int index, POGOProtos.Rpc.HoloPokemonMove value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureQuickMovesIsMutable();
      quickMoves_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @param value The quickMoves to add.
     * @return This builder for chaining.
     */
    public Builder addQuickMoves(POGOProtos.Rpc.HoloPokemonMove value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureQuickMovesIsMutable();
      quickMoves_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @param values The quickMoves to add.
     * @return This builder for chaining.
     */
    public Builder addAllQuickMoves(
        java.lang.Iterable<? extends POGOProtos.Rpc.HoloPokemonMove> values) {
      ensureQuickMovesIsMutable();
      for (POGOProtos.Rpc.HoloPokemonMove value : values) {
        quickMoves_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuickMoves() {
      quickMoves_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @return A list containing the enum numeric values on the wire for quickMoves.
     */
    public java.util.List<java.lang.Integer>
    getQuickMovesValueList() {
      return java.util.Collections.unmodifiableList(quickMoves_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of quickMoves at the given index.
     */
    public int getQuickMovesValue(int index) {
      return quickMoves_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of quickMoves at the given index.
     * @return This builder for chaining.
     */
    public Builder setQuickMovesValue(
        int index, int value) {
      ensureQuickMovesIsMutable();
      quickMoves_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @param value The enum numeric value on the wire for quickMoves to add.
     * @return This builder for chaining.
     */
    public Builder addQuickMovesValue(int value) {
      ensureQuickMovesIsMutable();
      quickMoves_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove quick_moves = 1;</code>
     * @param values The enum numeric values on the wire for quickMoves to add.
     * @return This builder for chaining.
     */
    public Builder addAllQuickMovesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureQuickMovesIsMutable();
      for (int value : values) {
        quickMoves_.add(value);
      }
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> cinematicMoves_ =
      java.util.Collections.emptyList();
    private void ensureCinematicMovesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        cinematicMoves_ = new java.util.ArrayList<java.lang.Integer>(cinematicMoves_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @return A list containing the cinematicMoves.
     */
    public java.util.List<POGOProtos.Rpc.HoloPokemonMove> getCinematicMovesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.HoloPokemonMove>(cinematicMoves_, cinematicMoves_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @return The count of cinematicMoves.
     */
    public int getCinematicMovesCount() {
      return cinematicMoves_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @param index The index of the element to return.
     * @return The cinematicMoves at the given index.
     */
    public POGOProtos.Rpc.HoloPokemonMove getCinematicMoves(int index) {
      return cinematicMoves_converter_.convert(cinematicMoves_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @param index The index to set the value at.
     * @param value The cinematicMoves to set.
     * @return This builder for chaining.
     */
    public Builder setCinematicMoves(
        int index, POGOProtos.Rpc.HoloPokemonMove value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCinematicMovesIsMutable();
      cinematicMoves_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @param value The cinematicMoves to add.
     * @return This builder for chaining.
     */
    public Builder addCinematicMoves(POGOProtos.Rpc.HoloPokemonMove value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCinematicMovesIsMutable();
      cinematicMoves_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @param values The cinematicMoves to add.
     * @return This builder for chaining.
     */
    public Builder addAllCinematicMoves(
        java.lang.Iterable<? extends POGOProtos.Rpc.HoloPokemonMove> values) {
      ensureCinematicMovesIsMutable();
      for (POGOProtos.Rpc.HoloPokemonMove value : values) {
        cinematicMoves_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCinematicMoves() {
      cinematicMoves_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @return A list containing the enum numeric values on the wire for cinematicMoves.
     */
    public java.util.List<java.lang.Integer>
    getCinematicMovesValueList() {
      return java.util.Collections.unmodifiableList(cinematicMoves_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of cinematicMoves at the given index.
     */
    public int getCinematicMovesValue(int index) {
      return cinematicMoves_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of cinematicMoves at the given index.
     * @return This builder for chaining.
     */
    public Builder setCinematicMovesValue(
        int index, int value) {
      ensureCinematicMovesIsMutable();
      cinematicMoves_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @param value The enum numeric value on the wire for cinematicMoves to add.
     * @return This builder for chaining.
     */
    public Builder addCinematicMovesValue(int value) {
      ensureCinematicMovesIsMutable();
      cinematicMoves_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonMove cinematic_moves = 2;</code>
     * @param values The enum numeric values on the wire for cinematicMoves to add.
     * @return This builder for chaining.
     */
    public Builder addAllCinematicMovesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureCinematicMovesIsMutable();
      for (int value : values) {
        cinematicMoves_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SmeargleMovesSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SmeargleMovesSettingsProto)
  private static final POGOProtos.Rpc.SmeargleMovesSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SmeargleMovesSettingsProto();
  }

  public static POGOProtos.Rpc.SmeargleMovesSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmeargleMovesSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<SmeargleMovesSettingsProto>() {
    @java.lang.Override
    public SmeargleMovesSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SmeargleMovesSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SmeargleMovesSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmeargleMovesSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SmeargleMovesSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

