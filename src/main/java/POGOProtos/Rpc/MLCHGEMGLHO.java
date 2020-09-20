// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MLCHGEMGLHO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MLCHGEMGLHO}
 */
public final class MLCHGEMGLHO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MLCHGEMGLHO)
    MLCHGEMGLHOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MLCHGEMGLHO.newBuilder() to construct.
  private MLCHGEMGLHO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MLCHGEMGLHO() {
    status_ = 0;
    ekfidinfbdd_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MLCHGEMGLHO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MLCHGEMGLHO(
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

            status_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ekfidinfbdd_ = new java.util.ArrayList<POGOProtos.Rpc.QuestRewardProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            ekfidinfbdd_.add(
                input.readMessage(POGOProtos.Rpc.QuestRewardProto.parser(), extensionRegistry));
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
        ekfidinfbdd_ = java.util.Collections.unmodifiableList(ekfidinfbdd_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MLCHGEMGLHO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MLCHGEMGLHO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MLCHGEMGLHO.class, POGOProtos.Rpc.MLCHGEMGLHO.Builder.class);
  }

  /**
   * <pre>
   * ref: MLCHGEMGLHO/ILMIMJHGBKK/EDPIGILGPKL
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.MLCHGEMGLHO.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>ERROR_STILL_IN_PROGRESS = 2;</code>
     */
    ERROR_STILL_IN_PROGRESS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>ERROR_STILL_IN_PROGRESS = 2;</code>
     */
    public static final int ERROR_STILL_IN_PROGRESS_VALUE = 2;


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
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_STILL_IN_PROGRESS;
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
      return POGOProtos.Rpc.MLCHGEMGLHO.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.MLCHGEMGLHO.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.MLCHGEMGLHO.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.MLCHGEMGLHO.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.MLCHGEMGLHO.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MLCHGEMGLHO.Status result = POGOProtos.Rpc.MLCHGEMGLHO.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.MLCHGEMGLHO.Status.UNRECOGNIZED : result;
  }

  public static final int EKFIDINFBDD_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.QuestRewardProto> ekfidinfbdd_;
  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.QuestRewardProto> getEkfidinfbddList() {
    return ekfidinfbdd_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.QuestRewardProtoOrBuilder> 
      getEkfidinfbddOrBuilderList() {
    return ekfidinfbdd_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
   */
  @java.lang.Override
  public int getEkfidinfbddCount() {
    return ekfidinfbdd_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestRewardProto getEkfidinfbdd(int index) {
    return ekfidinfbdd_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestRewardProtoOrBuilder getEkfidinfbddOrBuilder(
      int index) {
    return ekfidinfbdd_.get(index);
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
    if (status_ != POGOProtos.Rpc.MLCHGEMGLHO.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    for (int i = 0; i < ekfidinfbdd_.size(); i++) {
      output.writeMessage(2, ekfidinfbdd_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.MLCHGEMGLHO.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (int i = 0; i < ekfidinfbdd_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, ekfidinfbdd_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.MLCHGEMGLHO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MLCHGEMGLHO other = (POGOProtos.Rpc.MLCHGEMGLHO) obj;

    if (status_ != other.status_) return false;
    if (!getEkfidinfbddList()
        .equals(other.getEkfidinfbddList())) return false;
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
    if (getEkfidinfbddCount() > 0) {
      hash = (37 * hash) + EKFIDINFBDD_FIELD_NUMBER;
      hash = (53 * hash) + getEkfidinfbddList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MLCHGEMGLHO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MLCHGEMGLHO prototype) {
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
   * ref: MLCHGEMGLHO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MLCHGEMGLHO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MLCHGEMGLHO)
      POGOProtos.Rpc.MLCHGEMGLHOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MLCHGEMGLHO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MLCHGEMGLHO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MLCHGEMGLHO.class, POGOProtos.Rpc.MLCHGEMGLHO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MLCHGEMGLHO.newBuilder()
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
        getEkfidinfbddFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (ekfidinfbddBuilder_ == null) {
        ekfidinfbdd_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ekfidinfbddBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MLCHGEMGLHO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MLCHGEMGLHO getDefaultInstanceForType() {
      return POGOProtos.Rpc.MLCHGEMGLHO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MLCHGEMGLHO build() {
      POGOProtos.Rpc.MLCHGEMGLHO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MLCHGEMGLHO buildPartial() {
      POGOProtos.Rpc.MLCHGEMGLHO result = new POGOProtos.Rpc.MLCHGEMGLHO(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      if (ekfidinfbddBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ekfidinfbdd_ = java.util.Collections.unmodifiableList(ekfidinfbdd_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ekfidinfbdd_ = ekfidinfbdd_;
      } else {
        result.ekfidinfbdd_ = ekfidinfbddBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.MLCHGEMGLHO) {
        return mergeFrom((POGOProtos.Rpc.MLCHGEMGLHO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MLCHGEMGLHO other) {
      if (other == POGOProtos.Rpc.MLCHGEMGLHO.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (ekfidinfbddBuilder_ == null) {
        if (!other.ekfidinfbdd_.isEmpty()) {
          if (ekfidinfbdd_.isEmpty()) {
            ekfidinfbdd_ = other.ekfidinfbdd_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEkfidinfbddIsMutable();
            ekfidinfbdd_.addAll(other.ekfidinfbdd_);
          }
          onChanged();
        }
      } else {
        if (!other.ekfidinfbdd_.isEmpty()) {
          if (ekfidinfbddBuilder_.isEmpty()) {
            ekfidinfbddBuilder_.dispose();
            ekfidinfbddBuilder_ = null;
            ekfidinfbdd_ = other.ekfidinfbdd_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ekfidinfbddBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEkfidinfbddFieldBuilder() : null;
          } else {
            ekfidinfbddBuilder_.addAllMessages(other.ekfidinfbdd_);
          }
        }
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
      POGOProtos.Rpc.MLCHGEMGLHO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MLCHGEMGLHO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MLCHGEMGLHO.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.MLCHGEMGLHO.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLCHGEMGLHO.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MLCHGEMGLHO.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MLCHGEMGLHO.Status result = POGOProtos.Rpc.MLCHGEMGLHO.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.MLCHGEMGLHO.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MLCHGEMGLHO.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.MLCHGEMGLHO.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLCHGEMGLHO.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.QuestRewardProto> ekfidinfbdd_ =
      java.util.Collections.emptyList();
    private void ensureEkfidinfbddIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ekfidinfbdd_ = new java.util.ArrayList<POGOProtos.Rpc.QuestRewardProto>(ekfidinfbdd_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.QuestRewardProto, POGOProtos.Rpc.QuestRewardProto.Builder, POGOProtos.Rpc.QuestRewardProtoOrBuilder> ekfidinfbddBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.QuestRewardProto> getEkfidinfbddList() {
      if (ekfidinfbddBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ekfidinfbdd_);
      } else {
        return ekfidinfbddBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public int getEkfidinfbddCount() {
      if (ekfidinfbddBuilder_ == null) {
        return ekfidinfbdd_.size();
      } else {
        return ekfidinfbddBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public POGOProtos.Rpc.QuestRewardProto getEkfidinfbdd(int index) {
      if (ekfidinfbddBuilder_ == null) {
        return ekfidinfbdd_.get(index);
      } else {
        return ekfidinfbddBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public Builder setEkfidinfbdd(
        int index, POGOProtos.Rpc.QuestRewardProto value) {
      if (ekfidinfbddBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEkfidinfbddIsMutable();
        ekfidinfbdd_.set(index, value);
        onChanged();
      } else {
        ekfidinfbddBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public Builder setEkfidinfbdd(
        int index, POGOProtos.Rpc.QuestRewardProto.Builder builderForValue) {
      if (ekfidinfbddBuilder_ == null) {
        ensureEkfidinfbddIsMutable();
        ekfidinfbdd_.set(index, builderForValue.build());
        onChanged();
      } else {
        ekfidinfbddBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public Builder addEkfidinfbdd(POGOProtos.Rpc.QuestRewardProto value) {
      if (ekfidinfbddBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEkfidinfbddIsMutable();
        ekfidinfbdd_.add(value);
        onChanged();
      } else {
        ekfidinfbddBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public Builder addEkfidinfbdd(
        int index, POGOProtos.Rpc.QuestRewardProto value) {
      if (ekfidinfbddBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEkfidinfbddIsMutable();
        ekfidinfbdd_.add(index, value);
        onChanged();
      } else {
        ekfidinfbddBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public Builder addEkfidinfbdd(
        POGOProtos.Rpc.QuestRewardProto.Builder builderForValue) {
      if (ekfidinfbddBuilder_ == null) {
        ensureEkfidinfbddIsMutable();
        ekfidinfbdd_.add(builderForValue.build());
        onChanged();
      } else {
        ekfidinfbddBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public Builder addEkfidinfbdd(
        int index, POGOProtos.Rpc.QuestRewardProto.Builder builderForValue) {
      if (ekfidinfbddBuilder_ == null) {
        ensureEkfidinfbddIsMutable();
        ekfidinfbdd_.add(index, builderForValue.build());
        onChanged();
      } else {
        ekfidinfbddBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public Builder addAllEkfidinfbdd(
        java.lang.Iterable<? extends POGOProtos.Rpc.QuestRewardProto> values) {
      if (ekfidinfbddBuilder_ == null) {
        ensureEkfidinfbddIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ekfidinfbdd_);
        onChanged();
      } else {
        ekfidinfbddBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public Builder clearEkfidinfbdd() {
      if (ekfidinfbddBuilder_ == null) {
        ekfidinfbdd_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ekfidinfbddBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public Builder removeEkfidinfbdd(int index) {
      if (ekfidinfbddBuilder_ == null) {
        ensureEkfidinfbddIsMutable();
        ekfidinfbdd_.remove(index);
        onChanged();
      } else {
        ekfidinfbddBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public POGOProtos.Rpc.QuestRewardProto.Builder getEkfidinfbddBuilder(
        int index) {
      return getEkfidinfbddFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public POGOProtos.Rpc.QuestRewardProtoOrBuilder getEkfidinfbddOrBuilder(
        int index) {
      if (ekfidinfbddBuilder_ == null) {
        return ekfidinfbdd_.get(index);  } else {
        return ekfidinfbddBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.QuestRewardProtoOrBuilder> 
         getEkfidinfbddOrBuilderList() {
      if (ekfidinfbddBuilder_ != null) {
        return ekfidinfbddBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ekfidinfbdd_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public POGOProtos.Rpc.QuestRewardProto.Builder addEkfidinfbddBuilder() {
      return getEkfidinfbddFieldBuilder().addBuilder(
          POGOProtos.Rpc.QuestRewardProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public POGOProtos.Rpc.QuestRewardProto.Builder addEkfidinfbddBuilder(
        int index) {
      return getEkfidinfbddFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.QuestRewardProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.QuestRewardProto ekfidinfbdd = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.QuestRewardProto.Builder> 
         getEkfidinfbddBuilderList() {
      return getEkfidinfbddFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.QuestRewardProto, POGOProtos.Rpc.QuestRewardProto.Builder, POGOProtos.Rpc.QuestRewardProtoOrBuilder> 
        getEkfidinfbddFieldBuilder() {
      if (ekfidinfbddBuilder_ == null) {
        ekfidinfbddBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.QuestRewardProto, POGOProtos.Rpc.QuestRewardProto.Builder, POGOProtos.Rpc.QuestRewardProtoOrBuilder>(
                ekfidinfbdd_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ekfidinfbdd_ = null;
      }
      return ekfidinfbddBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MLCHGEMGLHO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MLCHGEMGLHO)
  private static final POGOProtos.Rpc.MLCHGEMGLHO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MLCHGEMGLHO();
  }

  public static POGOProtos.Rpc.MLCHGEMGLHO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MLCHGEMGLHO>
      PARSER = new com.google.protobuf.AbstractParser<MLCHGEMGLHO>() {
    @java.lang.Override
    public MLCHGEMGLHO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MLCHGEMGLHO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MLCHGEMGLHO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MLCHGEMGLHO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MLCHGEMGLHO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

