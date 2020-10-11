// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PBAKFPGGAEC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PBAKFPGGAEC}
 */
public final class PBAKFPGGAEC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PBAKFPGGAEC)
    PBAKFPGGAECOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PBAKFPGGAEC.newBuilder() to construct.
  private PBAKFPGGAEC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PBAKFPGGAEC() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PBAKFPGGAEC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PBAKFPGGAEC(
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
            POGOProtos.Rpc.ADHJCLFLGEP.Builder subBuilder = null;
            if (jfoojdpjjei_ != null) {
              subBuilder = jfoojdpjjei_.toBuilder();
            }
            jfoojdpjjei_ = input.readMessage(POGOProtos.Rpc.ADHJCLFLGEP.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jfoojdpjjei_);
              jfoojdpjjei_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBAKFPGGAEC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBAKFPGGAEC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PBAKFPGGAEC.class, POGOProtos.Rpc.PBAKFPGGAEC.Builder.class);
  }

  /**
   * <pre>
   * ref: PBAKFPGGAEC/OBOPMHCMENG/JIGKOHKNPMO
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PBAKFPGGAEC.Status}
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
     * <code>ERROR_NOT_IN_RANGE = 2;</code>
     */
    ERROR_NOT_IN_RANGE(2),
    /**
     * <code>ERROR_INCIDENT_COMPLETED = 3;</code>
     */
    ERROR_INCIDENT_COMPLETED(3),
    /**
     * <code>ERROR_INCIDENT_NOT_FOUND = 4;</code>
     */
    ERROR_INCIDENT_NOT_FOUND(4),
    /**
     * <code>ERROR_PLAYER_BELOW_MIN_LEVEL = 5;</code>
     */
    ERROR_PLAYER_BELOW_MIN_LEVEL(5),
    /**
     * <code>ERROR = 6;</code>
     */
    ERROR(6),
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
     * <code>ERROR_NOT_IN_RANGE = 2;</code>
     */
    public static final int ERROR_NOT_IN_RANGE_VALUE = 2;
    /**
     * <code>ERROR_INCIDENT_COMPLETED = 3;</code>
     */
    public static final int ERROR_INCIDENT_COMPLETED_VALUE = 3;
    /**
     * <code>ERROR_INCIDENT_NOT_FOUND = 4;</code>
     */
    public static final int ERROR_INCIDENT_NOT_FOUND_VALUE = 4;
    /**
     * <code>ERROR_PLAYER_BELOW_MIN_LEVEL = 5;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MIN_LEVEL_VALUE = 5;
    /**
     * <code>ERROR = 6;</code>
     */
    public static final int ERROR_VALUE = 6;


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
        case 2: return ERROR_NOT_IN_RANGE;
        case 3: return ERROR_INCIDENT_COMPLETED;
        case 4: return ERROR_INCIDENT_NOT_FOUND;
        case 5: return ERROR_PLAYER_BELOW_MIN_LEVEL;
        case 6: return ERROR;
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
      return POGOProtos.Rpc.PBAKFPGGAEC.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PBAKFPGGAEC.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.PBAKFPGGAEC.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.PBAKFPGGAEC.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.PBAKFPGGAEC.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PBAKFPGGAEC.Status result = POGOProtos.Rpc.PBAKFPGGAEC.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.PBAKFPGGAEC.Status.UNRECOGNIZED : result;
  }

  public static final int JFOOJDPJJEI_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei_;
  /**
   * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
   * @return Whether the jfoojdpjjei field is set.
   */
  @java.lang.Override
  public boolean hasJfoojdpjjei() {
    return jfoojdpjjei_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
   * @return The jfoojdpjjei.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ADHJCLFLGEP getJfoojdpjjei() {
    return jfoojdpjjei_ == null ? POGOProtos.Rpc.ADHJCLFLGEP.getDefaultInstance() : jfoojdpjjei_;
  }
  /**
   * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ADHJCLFLGEPOrBuilder getJfoojdpjjeiOrBuilder() {
    return getJfoojdpjjei();
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
    if (status_ != POGOProtos.Rpc.PBAKFPGGAEC.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (jfoojdpjjei_ != null) {
      output.writeMessage(2, getJfoojdpjjei());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.PBAKFPGGAEC.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (jfoojdpjjei_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJfoojdpjjei());
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
    if (!(obj instanceof POGOProtos.Rpc.PBAKFPGGAEC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PBAKFPGGAEC other = (POGOProtos.Rpc.PBAKFPGGAEC) obj;

    if (status_ != other.status_) return false;
    if (hasJfoojdpjjei() != other.hasJfoojdpjjei()) return false;
    if (hasJfoojdpjjei()) {
      if (!getJfoojdpjjei()
          .equals(other.getJfoojdpjjei())) return false;
    }
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
    if (hasJfoojdpjjei()) {
      hash = (37 * hash) + JFOOJDPJJEI_FIELD_NUMBER;
      hash = (53 * hash) + getJfoojdpjjei().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PBAKFPGGAEC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PBAKFPGGAEC prototype) {
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
   * ref: PBAKFPGGAEC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PBAKFPGGAEC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PBAKFPGGAEC)
      POGOProtos.Rpc.PBAKFPGGAECOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBAKFPGGAEC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBAKFPGGAEC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PBAKFPGGAEC.class, POGOProtos.Rpc.PBAKFPGGAEC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PBAKFPGGAEC.newBuilder()
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

      if (jfoojdpjjeiBuilder_ == null) {
        jfoojdpjjei_ = null;
      } else {
        jfoojdpjjei_ = null;
        jfoojdpjjeiBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBAKFPGGAEC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PBAKFPGGAEC getDefaultInstanceForType() {
      return POGOProtos.Rpc.PBAKFPGGAEC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PBAKFPGGAEC build() {
      POGOProtos.Rpc.PBAKFPGGAEC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PBAKFPGGAEC buildPartial() {
      POGOProtos.Rpc.PBAKFPGGAEC result = new POGOProtos.Rpc.PBAKFPGGAEC(this);
      result.status_ = status_;
      if (jfoojdpjjeiBuilder_ == null) {
        result.jfoojdpjjei_ = jfoojdpjjei_;
      } else {
        result.jfoojdpjjei_ = jfoojdpjjeiBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PBAKFPGGAEC) {
        return mergeFrom((POGOProtos.Rpc.PBAKFPGGAEC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PBAKFPGGAEC other) {
      if (other == POGOProtos.Rpc.PBAKFPGGAEC.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasJfoojdpjjei()) {
        mergeJfoojdpjjei(other.getJfoojdpjjei());
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
      POGOProtos.Rpc.PBAKFPGGAEC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PBAKFPGGAEC) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.PBAKFPGGAEC.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.PBAKFPGGAEC.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PBAKFPGGAEC.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PBAKFPGGAEC.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PBAKFPGGAEC.Status result = POGOProtos.Rpc.PBAKFPGGAEC.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.PBAKFPGGAEC.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PBAKFPGGAEC.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.PBAKFPGGAEC.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PBAKFPGGAEC.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ADHJCLFLGEP, POGOProtos.Rpc.ADHJCLFLGEP.Builder, POGOProtos.Rpc.ADHJCLFLGEPOrBuilder> jfoojdpjjeiBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
     * @return Whether the jfoojdpjjei field is set.
     */
    public boolean hasJfoojdpjjei() {
      return jfoojdpjjeiBuilder_ != null || jfoojdpjjei_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
     * @return The jfoojdpjjei.
     */
    public POGOProtos.Rpc.ADHJCLFLGEP getJfoojdpjjei() {
      if (jfoojdpjjeiBuilder_ == null) {
        return jfoojdpjjei_ == null ? POGOProtos.Rpc.ADHJCLFLGEP.getDefaultInstance() : jfoojdpjjei_;
      } else {
        return jfoojdpjjeiBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
     */
    public Builder setJfoojdpjjei(POGOProtos.Rpc.ADHJCLFLGEP value) {
      if (jfoojdpjjeiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jfoojdpjjei_ = value;
        onChanged();
      } else {
        jfoojdpjjeiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
     */
    public Builder setJfoojdpjjei(
        POGOProtos.Rpc.ADHJCLFLGEP.Builder builderForValue) {
      if (jfoojdpjjeiBuilder_ == null) {
        jfoojdpjjei_ = builderForValue.build();
        onChanged();
      } else {
        jfoojdpjjeiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
     */
    public Builder mergeJfoojdpjjei(POGOProtos.Rpc.ADHJCLFLGEP value) {
      if (jfoojdpjjeiBuilder_ == null) {
        if (jfoojdpjjei_ != null) {
          jfoojdpjjei_ =
            POGOProtos.Rpc.ADHJCLFLGEP.newBuilder(jfoojdpjjei_).mergeFrom(value).buildPartial();
        } else {
          jfoojdpjjei_ = value;
        }
        onChanged();
      } else {
        jfoojdpjjeiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
     */
    public Builder clearJfoojdpjjei() {
      if (jfoojdpjjeiBuilder_ == null) {
        jfoojdpjjei_ = null;
        onChanged();
      } else {
        jfoojdpjjei_ = null;
        jfoojdpjjeiBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
     */
    public POGOProtos.Rpc.ADHJCLFLGEP.Builder getJfoojdpjjeiBuilder() {
      
      onChanged();
      return getJfoojdpjjeiFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
     */
    public POGOProtos.Rpc.ADHJCLFLGEPOrBuilder getJfoojdpjjeiOrBuilder() {
      if (jfoojdpjjeiBuilder_ != null) {
        return jfoojdpjjeiBuilder_.getMessageOrBuilder();
      } else {
        return jfoojdpjjei_ == null ?
            POGOProtos.Rpc.ADHJCLFLGEP.getDefaultInstance() : jfoojdpjjei_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ADHJCLFLGEP jfoojdpjjei = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ADHJCLFLGEP, POGOProtos.Rpc.ADHJCLFLGEP.Builder, POGOProtos.Rpc.ADHJCLFLGEPOrBuilder> 
        getJfoojdpjjeiFieldBuilder() {
      if (jfoojdpjjeiBuilder_ == null) {
        jfoojdpjjeiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ADHJCLFLGEP, POGOProtos.Rpc.ADHJCLFLGEP.Builder, POGOProtos.Rpc.ADHJCLFLGEPOrBuilder>(
                getJfoojdpjjei(),
                getParentForChildren(),
                isClean());
        jfoojdpjjei_ = null;
      }
      return jfoojdpjjeiBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PBAKFPGGAEC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PBAKFPGGAEC)
  private static final POGOProtos.Rpc.PBAKFPGGAEC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PBAKFPGGAEC();
  }

  public static POGOProtos.Rpc.PBAKFPGGAEC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PBAKFPGGAEC>
      PARSER = new com.google.protobuf.AbstractParser<PBAKFPGGAEC>() {
    @java.lang.Override
    public PBAKFPGGAEC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PBAKFPGGAEC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PBAKFPGGAEC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PBAKFPGGAEC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PBAKFPGGAEC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
