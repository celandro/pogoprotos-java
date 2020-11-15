// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformProxyResponseProto}
 */
public final class PlatformProxyResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformProxyResponseProto)
    PlatformProxyResponseProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformProxyResponseProto.newBuilder() to construct.
  private PlatformProxyResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformProxyResponseProto() {
    status_ = 0;
    assignedHost_ = "";
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformProxyResponseProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformProxyResponseProto(
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
            java.lang.String s = input.readStringRequireUtf8();

            assignedHost_ = s;
            break;
          }
          case 26: {

            payload_ = input.readBytes();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformProxyResponseProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformProxyResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformProxyResponseProto.class, POGOProtos.Rpc.PlatformProxyResponseProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.PlatformProxyResponseProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>COMPLETED = 1;</code>
     */
    COMPLETED(1),
    /**
     * <code>COMPLETED_AND_REASSIGNED = 2;</code>
     */
    COMPLETED_AND_REASSIGNED(2),
    /**
     * <code>ACTION_NOT_FOUND = 3;</code>
     */
    ACTION_NOT_FOUND(3),
    /**
     * <code>ASSIGNMENT_ERROR = 4;</code>
     */
    ASSIGNMENT_ERROR(4),
    /**
     * <code>PROXY_UNAUTHORIZED_ERROR = 5;</code>
     */
    PROXY_UNAUTHORIZED_ERROR(5),
    /**
     * <code>INTERNAL_ERROR = 6;</code>
     */
    INTERNAL_ERROR(6),
    /**
     * <code>BAD_REQUEST = 7;</code>
     */
    BAD_REQUEST(7),
    /**
     * <code>ACCESS_DENIED = 8;</code>
     */
    ACCESS_DENIED(8),
    /**
     * <code>TIMEOUT_ERROR = 9;</code>
     */
    TIMEOUT_ERROR(9),
    /**
     * <code>RATE_LIMITED = 10;</code>
     */
    RATE_LIMITED(10),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>COMPLETED = 1;</code>
     */
    public static final int COMPLETED_VALUE = 1;
    /**
     * <code>COMPLETED_AND_REASSIGNED = 2;</code>
     */
    public static final int COMPLETED_AND_REASSIGNED_VALUE = 2;
    /**
     * <code>ACTION_NOT_FOUND = 3;</code>
     */
    public static final int ACTION_NOT_FOUND_VALUE = 3;
    /**
     * <code>ASSIGNMENT_ERROR = 4;</code>
     */
    public static final int ASSIGNMENT_ERROR_VALUE = 4;
    /**
     * <code>PROXY_UNAUTHORIZED_ERROR = 5;</code>
     */
    public static final int PROXY_UNAUTHORIZED_ERROR_VALUE = 5;
    /**
     * <code>INTERNAL_ERROR = 6;</code>
     */
    public static final int INTERNAL_ERROR_VALUE = 6;
    /**
     * <code>BAD_REQUEST = 7;</code>
     */
    public static final int BAD_REQUEST_VALUE = 7;
    /**
     * <code>ACCESS_DENIED = 8;</code>
     */
    public static final int ACCESS_DENIED_VALUE = 8;
    /**
     * <code>TIMEOUT_ERROR = 9;</code>
     */
    public static final int TIMEOUT_ERROR_VALUE = 9;
    /**
     * <code>RATE_LIMITED = 10;</code>
     */
    public static final int RATE_LIMITED_VALUE = 10;


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
        case 1: return COMPLETED;
        case 2: return COMPLETED_AND_REASSIGNED;
        case 3: return ACTION_NOT_FOUND;
        case 4: return ASSIGNMENT_ERROR;
        case 5: return PROXY_UNAUTHORIZED_ERROR;
        case 6: return INTERNAL_ERROR;
        case 7: return BAD_REQUEST;
        case 8: return ACCESS_DENIED;
        case 9: return TIMEOUT_ERROR;
        case 10: return RATE_LIMITED;
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
      return POGOProtos.Rpc.PlatformProxyResponseProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlatformProxyResponseProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.PlatformProxyResponseProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformProxyResponseProto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.PlatformProxyResponseProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PlatformProxyResponseProto.Status result = POGOProtos.Rpc.PlatformProxyResponseProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.PlatformProxyResponseProto.Status.UNRECOGNIZED : result;
  }

  public static final int ASSIGNED_HOST_FIELD_NUMBER = 2;
  private volatile java.lang.Object assignedHost_;
  /**
   * <code>string assigned_host = 2;</code>
   * @return The assignedHost.
   */
  @java.lang.Override
  public java.lang.String getAssignedHost() {
    java.lang.Object ref = assignedHost_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assignedHost_ = s;
      return s;
    }
  }
  /**
   * <code>string assigned_host = 2;</code>
   * @return The bytes for assignedHost.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssignedHostBytes() {
    java.lang.Object ref = assignedHost_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assignedHost_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString payload_;
  /**
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
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
    if (status_ != POGOProtos.Rpc.PlatformProxyResponseProto.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (!getAssignedHostBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assignedHost_);
    }
    if (!payload_.isEmpty()) {
      output.writeBytes(3, payload_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.PlatformProxyResponseProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (!getAssignedHostBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, assignedHost_);
    }
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, payload_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformProxyResponseProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformProxyResponseProto other = (POGOProtos.Rpc.PlatformProxyResponseProto) obj;

    if (status_ != other.status_) return false;
    if (!getAssignedHost()
        .equals(other.getAssignedHost())) return false;
    if (!getPayload()
        .equals(other.getPayload())) return false;
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
    hash = (37 * hash) + ASSIGNED_HOST_FIELD_NUMBER;
    hash = (53 * hash) + getAssignedHost().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformProxyResponseProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformProxyResponseProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformProxyResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformProxyResponseProto)
      POGOProtos.Rpc.PlatformProxyResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformProxyResponseProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformProxyResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformProxyResponseProto.class, POGOProtos.Rpc.PlatformProxyResponseProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformProxyResponseProto.newBuilder()
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

      assignedHost_ = "";

      payload_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformProxyResponseProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformProxyResponseProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformProxyResponseProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformProxyResponseProto build() {
      POGOProtos.Rpc.PlatformProxyResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformProxyResponseProto buildPartial() {
      POGOProtos.Rpc.PlatformProxyResponseProto result = new POGOProtos.Rpc.PlatformProxyResponseProto(this);
      result.status_ = status_;
      result.assignedHost_ = assignedHost_;
      result.payload_ = payload_;
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
      if (other instanceof POGOProtos.Rpc.PlatformProxyResponseProto) {
        return mergeFrom((POGOProtos.Rpc.PlatformProxyResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformProxyResponseProto other) {
      if (other == POGOProtos.Rpc.PlatformProxyResponseProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getAssignedHost().isEmpty()) {
        assignedHost_ = other.assignedHost_;
        onChanged();
      }
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
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
      POGOProtos.Rpc.PlatformProxyResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformProxyResponseProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.PlatformProxyResponseProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformProxyResponseProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformProxyResponseProto.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PlatformProxyResponseProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PlatformProxyResponseProto.Status result = POGOProtos.Rpc.PlatformProxyResponseProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.PlatformProxyResponseProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformProxyResponseProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.PlatformProxyResponseProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformProxyResponseProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object assignedHost_ = "";
    /**
     * <code>string assigned_host = 2;</code>
     * @return The assignedHost.
     */
    public java.lang.String getAssignedHost() {
      java.lang.Object ref = assignedHost_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assignedHost_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string assigned_host = 2;</code>
     * @return The bytes for assignedHost.
     */
    public com.google.protobuf.ByteString
        getAssignedHostBytes() {
      java.lang.Object ref = assignedHost_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assignedHost_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string assigned_host = 2;</code>
     * @param value The assignedHost to set.
     * @return This builder for chaining.
     */
    public Builder setAssignedHost(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assignedHost_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string assigned_host = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssignedHost() {
      
      assignedHost_ = getDefaultInstance().getAssignedHost();
      onChanged();
      return this;
    }
    /**
     * <code>string assigned_host = 2;</code>
     * @param value The bytes for assignedHost to set.
     * @return This builder for chaining.
     */
    public Builder setAssignedHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assignedHost_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 3;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 3;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformProxyResponseProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformProxyResponseProto)
  private static final POGOProtos.Rpc.PlatformProxyResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformProxyResponseProto();
  }

  public static POGOProtos.Rpc.PlatformProxyResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformProxyResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<PlatformProxyResponseProto>() {
    @java.lang.Override
    public PlatformProxyResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformProxyResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformProxyResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformProxyResponseProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformProxyResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

