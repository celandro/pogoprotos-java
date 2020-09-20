// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CEKAJEANOCP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CEKAJEANOCP}
 */
public final class CEKAJEANOCP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CEKAJEANOCP)
    CEKAJEANOCPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CEKAJEANOCP.newBuilder() to construct.
  private CEKAJEANOCP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CEKAJEANOCP() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CEKAJEANOCP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CEKAJEANOCP(
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
            POGOProtos.Rpc.CMHIDLPOFEM.Builder subBuilder = null;
            if (dnaohkepbgf_ != null) {
              subBuilder = dnaohkepbgf_.toBuilder();
            }
            dnaohkepbgf_ = input.readMessage(POGOProtos.Rpc.CMHIDLPOFEM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dnaohkepbgf_);
              dnaohkepbgf_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CEKAJEANOCP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CEKAJEANOCP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CEKAJEANOCP.class, POGOProtos.Rpc.CEKAJEANOCP.Builder.class);
  }

  /**
   * <pre>
   * ref: CEKAJEANOCP/IEFLKDMIKFI/BHPIHJECPGC
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.CEKAJEANOCP.Status}
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
     * <code>ERROR = 2;</code>
     */
    ERROR(2),
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
     * <code>ERROR = 2;</code>
     */
    public static final int ERROR_VALUE = 2;


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
        case 2: return ERROR;
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
      return POGOProtos.Rpc.CEKAJEANOCP.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CEKAJEANOCP.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.CEKAJEANOCP.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.CEKAJEANOCP.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.CEKAJEANOCP.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CEKAJEANOCP.Status result = POGOProtos.Rpc.CEKAJEANOCP.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.CEKAJEANOCP.Status.UNRECOGNIZED : result;
  }

  public static final int DNAOHKEPBGF_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf_;
  /**
   * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
   * @return Whether the dnaohkepbgf field is set.
   */
  @java.lang.Override
  public boolean hasDnaohkepbgf() {
    return dnaohkepbgf_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
   * @return The dnaohkepbgf.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CMHIDLPOFEM getDnaohkepbgf() {
    return dnaohkepbgf_ == null ? POGOProtos.Rpc.CMHIDLPOFEM.getDefaultInstance() : dnaohkepbgf_;
  }
  /**
   * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CMHIDLPOFEMOrBuilder getDnaohkepbgfOrBuilder() {
    return getDnaohkepbgf();
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
    if (status_ != POGOProtos.Rpc.CEKAJEANOCP.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (dnaohkepbgf_ != null) {
      output.writeMessage(2, getDnaohkepbgf());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.CEKAJEANOCP.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (dnaohkepbgf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDnaohkepbgf());
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
    if (!(obj instanceof POGOProtos.Rpc.CEKAJEANOCP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CEKAJEANOCP other = (POGOProtos.Rpc.CEKAJEANOCP) obj;

    if (status_ != other.status_) return false;
    if (hasDnaohkepbgf() != other.hasDnaohkepbgf()) return false;
    if (hasDnaohkepbgf()) {
      if (!getDnaohkepbgf()
          .equals(other.getDnaohkepbgf())) return false;
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
    if (hasDnaohkepbgf()) {
      hash = (37 * hash) + DNAOHKEPBGF_FIELD_NUMBER;
      hash = (53 * hash) + getDnaohkepbgf().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CEKAJEANOCP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CEKAJEANOCP prototype) {
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
   * ref: CEKAJEANOCP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CEKAJEANOCP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CEKAJEANOCP)
      POGOProtos.Rpc.CEKAJEANOCPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CEKAJEANOCP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CEKAJEANOCP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CEKAJEANOCP.class, POGOProtos.Rpc.CEKAJEANOCP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CEKAJEANOCP.newBuilder()
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

      if (dnaohkepbgfBuilder_ == null) {
        dnaohkepbgf_ = null;
      } else {
        dnaohkepbgf_ = null;
        dnaohkepbgfBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CEKAJEANOCP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CEKAJEANOCP getDefaultInstanceForType() {
      return POGOProtos.Rpc.CEKAJEANOCP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CEKAJEANOCP build() {
      POGOProtos.Rpc.CEKAJEANOCP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CEKAJEANOCP buildPartial() {
      POGOProtos.Rpc.CEKAJEANOCP result = new POGOProtos.Rpc.CEKAJEANOCP(this);
      result.status_ = status_;
      if (dnaohkepbgfBuilder_ == null) {
        result.dnaohkepbgf_ = dnaohkepbgf_;
      } else {
        result.dnaohkepbgf_ = dnaohkepbgfBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CEKAJEANOCP) {
        return mergeFrom((POGOProtos.Rpc.CEKAJEANOCP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CEKAJEANOCP other) {
      if (other == POGOProtos.Rpc.CEKAJEANOCP.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasDnaohkepbgf()) {
        mergeDnaohkepbgf(other.getDnaohkepbgf());
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
      POGOProtos.Rpc.CEKAJEANOCP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CEKAJEANOCP) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.CEKAJEANOCP.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.CEKAJEANOCP.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CEKAJEANOCP.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.CEKAJEANOCP.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CEKAJEANOCP.Status result = POGOProtos.Rpc.CEKAJEANOCP.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.CEKAJEANOCP.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CEKAJEANOCP.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.CEKAJEANOCP.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CEKAJEANOCP.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CMHIDLPOFEM, POGOProtos.Rpc.CMHIDLPOFEM.Builder, POGOProtos.Rpc.CMHIDLPOFEMOrBuilder> dnaohkepbgfBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
     * @return Whether the dnaohkepbgf field is set.
     */
    public boolean hasDnaohkepbgf() {
      return dnaohkepbgfBuilder_ != null || dnaohkepbgf_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
     * @return The dnaohkepbgf.
     */
    public POGOProtos.Rpc.CMHIDLPOFEM getDnaohkepbgf() {
      if (dnaohkepbgfBuilder_ == null) {
        return dnaohkepbgf_ == null ? POGOProtos.Rpc.CMHIDLPOFEM.getDefaultInstance() : dnaohkepbgf_;
      } else {
        return dnaohkepbgfBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
     */
    public Builder setDnaohkepbgf(POGOProtos.Rpc.CMHIDLPOFEM value) {
      if (dnaohkepbgfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dnaohkepbgf_ = value;
        onChanged();
      } else {
        dnaohkepbgfBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
     */
    public Builder setDnaohkepbgf(
        POGOProtos.Rpc.CMHIDLPOFEM.Builder builderForValue) {
      if (dnaohkepbgfBuilder_ == null) {
        dnaohkepbgf_ = builderForValue.build();
        onChanged();
      } else {
        dnaohkepbgfBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
     */
    public Builder mergeDnaohkepbgf(POGOProtos.Rpc.CMHIDLPOFEM value) {
      if (dnaohkepbgfBuilder_ == null) {
        if (dnaohkepbgf_ != null) {
          dnaohkepbgf_ =
            POGOProtos.Rpc.CMHIDLPOFEM.newBuilder(dnaohkepbgf_).mergeFrom(value).buildPartial();
        } else {
          dnaohkepbgf_ = value;
        }
        onChanged();
      } else {
        dnaohkepbgfBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
     */
    public Builder clearDnaohkepbgf() {
      if (dnaohkepbgfBuilder_ == null) {
        dnaohkepbgf_ = null;
        onChanged();
      } else {
        dnaohkepbgf_ = null;
        dnaohkepbgfBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
     */
    public POGOProtos.Rpc.CMHIDLPOFEM.Builder getDnaohkepbgfBuilder() {
      
      onChanged();
      return getDnaohkepbgfFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
     */
    public POGOProtos.Rpc.CMHIDLPOFEMOrBuilder getDnaohkepbgfOrBuilder() {
      if (dnaohkepbgfBuilder_ != null) {
        return dnaohkepbgfBuilder_.getMessageOrBuilder();
      } else {
        return dnaohkepbgf_ == null ?
            POGOProtos.Rpc.CMHIDLPOFEM.getDefaultInstance() : dnaohkepbgf_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CMHIDLPOFEM dnaohkepbgf = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CMHIDLPOFEM, POGOProtos.Rpc.CMHIDLPOFEM.Builder, POGOProtos.Rpc.CMHIDLPOFEMOrBuilder> 
        getDnaohkepbgfFieldBuilder() {
      if (dnaohkepbgfBuilder_ == null) {
        dnaohkepbgfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CMHIDLPOFEM, POGOProtos.Rpc.CMHIDLPOFEM.Builder, POGOProtos.Rpc.CMHIDLPOFEMOrBuilder>(
                getDnaohkepbgf(),
                getParentForChildren(),
                isClean());
        dnaohkepbgf_ = null;
      }
      return dnaohkepbgfBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CEKAJEANOCP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CEKAJEANOCP)
  private static final POGOProtos.Rpc.CEKAJEANOCP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CEKAJEANOCP();
  }

  public static POGOProtos.Rpc.CEKAJEANOCP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CEKAJEANOCP>
      PARSER = new com.google.protobuf.AbstractParser<CEKAJEANOCP>() {
    @java.lang.Override
    public CEKAJEANOCP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CEKAJEANOCP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CEKAJEANOCP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CEKAJEANOCP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CEKAJEANOCP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

