// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.UseItemEncounterOutProto}
 */
public final class UseItemEncounterOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.UseItemEncounterOutProto)
    UseItemEncounterOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UseItemEncounterOutProto.newBuilder() to construct.
  private UseItemEncounterOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UseItemEncounterOutProto() {
    status_ = 0;
    activeItem_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UseItemEncounterOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UseItemEncounterOutProto(
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

            status_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.CaptureProbabilityProto.Builder subBuilder = null;
            if (captureProbability_ != null) {
              subBuilder = captureProbability_.toBuilder();
            }
            captureProbability_ = input.readMessage(POGOProtos.Rpc.CaptureProbabilityProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(captureProbability_);
              captureProbability_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            activeItem_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemEncounterOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemEncounterOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.UseItemEncounterOutProto.class, POGOProtos.Rpc.UseItemEncounterOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.UseItemEncounterOutProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SUCCESS = 0;</code>
     */
    SUCCESS(0),
    /**
     * <code>ALREADY_COMPLETED = 1;</code>
     */
    ALREADY_COMPLETED(1),
    /**
     * <code>ACTIVE_ITEM_EXISTS = 2;</code>
     */
    ACTIVE_ITEM_EXISTS(2),
    /**
     * <code>NO_ITEM_IN_INVENTORY = 3;</code>
     */
    NO_ITEM_IN_INVENTORY(3),
    /**
     * <code>INVALID_ITEM_CATEGORY = 4;</code>
     */
    INVALID_ITEM_CATEGORY(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SUCCESS = 0;</code>
     */
    public static final int SUCCESS_VALUE = 0;
    /**
     * <code>ALREADY_COMPLETED = 1;</code>
     */
    public static final int ALREADY_COMPLETED_VALUE = 1;
    /**
     * <code>ACTIVE_ITEM_EXISTS = 2;</code>
     */
    public static final int ACTIVE_ITEM_EXISTS_VALUE = 2;
    /**
     * <code>NO_ITEM_IN_INVENTORY = 3;</code>
     */
    public static final int NO_ITEM_IN_INVENTORY_VALUE = 3;
    /**
     * <code>INVALID_ITEM_CATEGORY = 4;</code>
     */
    public static final int INVALID_ITEM_CATEGORY_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return SUCCESS;
        case 1: return ALREADY_COMPLETED;
        case 2: return ACTIVE_ITEM_EXISTS;
        case 3: return NO_ITEM_IN_INVENTORY;
        case 4: return INVALID_ITEM_CATEGORY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.UseItemEncounterOutProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.UseItemEncounterOutProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.UseItemEncounterOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.UseItemEncounterOutProto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.UseItemEncounterOutProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.UseItemEncounterOutProto.Status result = POGOProtos.Rpc.UseItemEncounterOutProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.UseItemEncounterOutProto.Status.UNRECOGNIZED : result;
  }

  public static final int CAPTURE_PROBABILITY_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CaptureProbabilityProto captureProbability_;
  /**
   * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
   * @return Whether the captureProbability field is set.
   */
  @java.lang.Override
  public boolean hasCaptureProbability() {
    return captureProbability_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
   * @return The captureProbability.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CaptureProbabilityProto getCaptureProbability() {
    return captureProbability_ == null ? POGOProtos.Rpc.CaptureProbabilityProto.getDefaultInstance() : captureProbability_;
  }
  /**
   * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder getCaptureProbabilityOrBuilder() {
    return getCaptureProbability();
  }

  public static final int ACTIVE_ITEM_FIELD_NUMBER = 3;
  private int activeItem_;
  /**
   * <code>.POGOProtos.Rpc.Item active_item = 3;</code>
   * @return The enum numeric value on the wire for activeItem.
   */
  @java.lang.Override public int getActiveItemValue() {
    return activeItem_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item active_item = 3;</code>
   * @return The activeItem.
   */
  @java.lang.Override public POGOProtos.Rpc.Item getActiveItem() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(activeItem_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
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
    if (status_ != POGOProtos.Rpc.UseItemEncounterOutProto.Status.SUCCESS.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (captureProbability_ != null) {
      output.writeMessage(2, getCaptureProbability());
    }
    if (activeItem_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(3, activeItem_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.UseItemEncounterOutProto.Status.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (captureProbability_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCaptureProbability());
    }
    if (activeItem_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, activeItem_);
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
    if (!(obj instanceof POGOProtos.Rpc.UseItemEncounterOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.UseItemEncounterOutProto other = (POGOProtos.Rpc.UseItemEncounterOutProto) obj;

    if (status_ != other.status_) return false;
    if (hasCaptureProbability() != other.hasCaptureProbability()) return false;
    if (hasCaptureProbability()) {
      if (!getCaptureProbability()
          .equals(other.getCaptureProbability())) return false;
    }
    if (activeItem_ != other.activeItem_) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasCaptureProbability()) {
      hash = (37 * hash) + CAPTURE_PROBABILITY_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureProbability().hashCode();
    }
    hash = (37 * hash) + ACTIVE_ITEM_FIELD_NUMBER;
    hash = (53 * hash) + activeItem_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemEncounterOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.UseItemEncounterOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.UseItemEncounterOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.UseItemEncounterOutProto)
      POGOProtos.Rpc.UseItemEncounterOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemEncounterOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemEncounterOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.UseItemEncounterOutProto.class, POGOProtos.Rpc.UseItemEncounterOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.UseItemEncounterOutProto.newBuilder()
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
      status_ = 0;

      if (captureProbabilityBuilder_ == null) {
        captureProbability_ = null;
      } else {
        captureProbability_ = null;
        captureProbabilityBuilder_ = null;
      }
      activeItem_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UseItemEncounterOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemEncounterOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.UseItemEncounterOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemEncounterOutProto build() {
      POGOProtos.Rpc.UseItemEncounterOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemEncounterOutProto buildPartial() {
      POGOProtos.Rpc.UseItemEncounterOutProto result = new POGOProtos.Rpc.UseItemEncounterOutProto(this);
      result.status_ = status_;
      if (captureProbabilityBuilder_ == null) {
        result.captureProbability_ = captureProbability_;
      } else {
        result.captureProbability_ = captureProbabilityBuilder_.build();
      }
      result.activeItem_ = activeItem_;
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
      if (other instanceof POGOProtos.Rpc.UseItemEncounterOutProto) {
        return mergeFrom((POGOProtos.Rpc.UseItemEncounterOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.UseItemEncounterOutProto other) {
      if (other == POGOProtos.Rpc.UseItemEncounterOutProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasCaptureProbability()) {
        mergeCaptureProbability(other.getCaptureProbability());
      }
      if (other.activeItem_ != 0) {
        setActiveItemValue(other.getActiveItemValue());
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
      POGOProtos.Rpc.UseItemEncounterOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.UseItemEncounterOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Rpc.UseItemEncounterOutProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.UseItemEncounterOutProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.UseItemEncounterOutProto.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.UseItemEncounterOutProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.UseItemEncounterOutProto.Status result = POGOProtos.Rpc.UseItemEncounterOutProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.UseItemEncounterOutProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.UseItemEncounterOutProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.UseItemEncounterOutProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.UseItemEncounterOutProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CaptureProbabilityProto captureProbability_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CaptureProbabilityProto, POGOProtos.Rpc.CaptureProbabilityProto.Builder, POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder> captureProbabilityBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
     * @return Whether the captureProbability field is set.
     */
    public boolean hasCaptureProbability() {
      return captureProbabilityBuilder_ != null || captureProbability_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
     * @return The captureProbability.
     */
    public POGOProtos.Rpc.CaptureProbabilityProto getCaptureProbability() {
      if (captureProbabilityBuilder_ == null) {
        return captureProbability_ == null ? POGOProtos.Rpc.CaptureProbabilityProto.getDefaultInstance() : captureProbability_;
      } else {
        return captureProbabilityBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
     */
    public Builder setCaptureProbability(POGOProtos.Rpc.CaptureProbabilityProto value) {
      if (captureProbabilityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        captureProbability_ = value;
        onChanged();
      } else {
        captureProbabilityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
     */
    public Builder setCaptureProbability(
        POGOProtos.Rpc.CaptureProbabilityProto.Builder builderForValue) {
      if (captureProbabilityBuilder_ == null) {
        captureProbability_ = builderForValue.build();
        onChanged();
      } else {
        captureProbabilityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
     */
    public Builder mergeCaptureProbability(POGOProtos.Rpc.CaptureProbabilityProto value) {
      if (captureProbabilityBuilder_ == null) {
        if (captureProbability_ != null) {
          captureProbability_ =
            POGOProtos.Rpc.CaptureProbabilityProto.newBuilder(captureProbability_).mergeFrom(value).buildPartial();
        } else {
          captureProbability_ = value;
        }
        onChanged();
      } else {
        captureProbabilityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
     */
    public Builder clearCaptureProbability() {
      if (captureProbabilityBuilder_ == null) {
        captureProbability_ = null;
        onChanged();
      } else {
        captureProbability_ = null;
        captureProbabilityBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
     */
    public POGOProtos.Rpc.CaptureProbabilityProto.Builder getCaptureProbabilityBuilder() {
      
      onChanged();
      return getCaptureProbabilityFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
     */
    public POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder getCaptureProbabilityOrBuilder() {
      if (captureProbabilityBuilder_ != null) {
        return captureProbabilityBuilder_.getMessageOrBuilder();
      } else {
        return captureProbability_ == null ?
            POGOProtos.Rpc.CaptureProbabilityProto.getDefaultInstance() : captureProbability_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CaptureProbabilityProto, POGOProtos.Rpc.CaptureProbabilityProto.Builder, POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder> 
        getCaptureProbabilityFieldBuilder() {
      if (captureProbabilityBuilder_ == null) {
        captureProbabilityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CaptureProbabilityProto, POGOProtos.Rpc.CaptureProbabilityProto.Builder, POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder>(
                getCaptureProbability(),
                getParentForChildren(),
                isClean());
        captureProbability_ = null;
      }
      return captureProbabilityBuilder_;
    }

    private int activeItem_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 3;</code>
     * @return The enum numeric value on the wire for activeItem.
     */
    @java.lang.Override public int getActiveItemValue() {
      return activeItem_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 3;</code>
     * @param value The enum numeric value on the wire for activeItem to set.
     * @return This builder for chaining.
     */
    public Builder setActiveItemValue(int value) {
      
      activeItem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 3;</code>
     * @return The activeItem.
     */
    @java.lang.Override
    public POGOProtos.Rpc.Item getActiveItem() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(activeItem_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 3;</code>
     * @param value The activeItem to set.
     * @return This builder for chaining.
     */
    public Builder setActiveItem(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      activeItem_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveItem() {
      
      activeItem_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.UseItemEncounterOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.UseItemEncounterOutProto)
  private static final POGOProtos.Rpc.UseItemEncounterOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.UseItemEncounterOutProto();
  }

  public static POGOProtos.Rpc.UseItemEncounterOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UseItemEncounterOutProto>
      PARSER = new com.google.protobuf.AbstractParser<UseItemEncounterOutProto>() {
    @java.lang.Override
    public UseItemEncounterOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UseItemEncounterOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UseItemEncounterOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UseItemEncounterOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.UseItemEncounterOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

