// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MHNEIDDBNGC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MHNEIDDBNGC}
 */
public final class MHNEIDDBNGC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MHNEIDDBNGC)
    MHNEIDDBNGCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MHNEIDDBNGC.newBuilder() to construct.
  private MHNEIDDBNGC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MHNEIDDBNGC() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MHNEIDDBNGC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MHNEIDDBNGC(
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
            POGOProtos.Rpc.LootProto.Builder subBuilder = null;
            if (nldndpcfdmh_ != null) {
              subBuilder = nldndpcfdmh_.toBuilder();
            }
            nldndpcfdmh_ = input.readMessage(POGOProtos.Rpc.LootProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nldndpcfdmh_);
              nldndpcfdmh_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            endlkcenbpd_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MHNEIDDBNGC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MHNEIDDBNGC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MHNEIDDBNGC.class, POGOProtos.Rpc.MHNEIDDBNGC.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC result = POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC.valueOf(status_);
    return result == null ? POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC.UNRECOGNIZED : result;
  }

  public static final int NLDNDPCFDMH_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.LootProto nldndpcfdmh_;
  /**
   * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
   * @return Whether the nldndpcfdmh field is set.
   */
  @java.lang.Override
  public boolean hasNldndpcfdmh() {
    return nldndpcfdmh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
   * @return The nldndpcfdmh.
   */
  @java.lang.Override
  public POGOProtos.Rpc.LootProto getNldndpcfdmh() {
    return nldndpcfdmh_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : nldndpcfdmh_;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LootProtoOrBuilder getNldndpcfdmhOrBuilder() {
    return getNldndpcfdmh();
  }

  public static final int ENDLKCENBPD_FIELD_NUMBER = 3;
  private boolean endlkcenbpd_;
  /**
   * <code>bool endlkcenbpd = 3;</code>
   * @return The endlkcenbpd.
   */
  @java.lang.Override
  public boolean getEndlkcenbpd() {
    return endlkcenbpd_;
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
    if (status_ != POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (nldndpcfdmh_ != null) {
      output.writeMessage(2, getNldndpcfdmh());
    }
    if (endlkcenbpd_ != false) {
      output.writeBool(3, endlkcenbpd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (nldndpcfdmh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNldndpcfdmh());
    }
    if (endlkcenbpd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, endlkcenbpd_);
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
    if (!(obj instanceof POGOProtos.Rpc.MHNEIDDBNGC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MHNEIDDBNGC other = (POGOProtos.Rpc.MHNEIDDBNGC) obj;

    if (status_ != other.status_) return false;
    if (hasNldndpcfdmh() != other.hasNldndpcfdmh()) return false;
    if (hasNldndpcfdmh()) {
      if (!getNldndpcfdmh()
          .equals(other.getNldndpcfdmh())) return false;
    }
    if (getEndlkcenbpd()
        != other.getEndlkcenbpd()) return false;
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
    if (hasNldndpcfdmh()) {
      hash = (37 * hash) + NLDNDPCFDMH_FIELD_NUMBER;
      hash = (53 * hash) + getNldndpcfdmh().hashCode();
    }
    hash = (37 * hash) + ENDLKCENBPD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEndlkcenbpd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MHNEIDDBNGC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MHNEIDDBNGC prototype) {
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
   * ref: MHNEIDDBNGC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MHNEIDDBNGC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MHNEIDDBNGC)
      POGOProtos.Rpc.MHNEIDDBNGCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MHNEIDDBNGC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MHNEIDDBNGC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MHNEIDDBNGC.class, POGOProtos.Rpc.MHNEIDDBNGC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MHNEIDDBNGC.newBuilder()
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

      if (nldndpcfdmhBuilder_ == null) {
        nldndpcfdmh_ = null;
      } else {
        nldndpcfdmh_ = null;
        nldndpcfdmhBuilder_ = null;
      }
      endlkcenbpd_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MHNEIDDBNGC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MHNEIDDBNGC getDefaultInstanceForType() {
      return POGOProtos.Rpc.MHNEIDDBNGC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MHNEIDDBNGC build() {
      POGOProtos.Rpc.MHNEIDDBNGC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MHNEIDDBNGC buildPartial() {
      POGOProtos.Rpc.MHNEIDDBNGC result = new POGOProtos.Rpc.MHNEIDDBNGC(this);
      result.status_ = status_;
      if (nldndpcfdmhBuilder_ == null) {
        result.nldndpcfdmh_ = nldndpcfdmh_;
      } else {
        result.nldndpcfdmh_ = nldndpcfdmhBuilder_.build();
      }
      result.endlkcenbpd_ = endlkcenbpd_;
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
      if (other instanceof POGOProtos.Rpc.MHNEIDDBNGC) {
        return mergeFrom((POGOProtos.Rpc.MHNEIDDBNGC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MHNEIDDBNGC other) {
      if (other == POGOProtos.Rpc.MHNEIDDBNGC.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasNldndpcfdmh()) {
        mergeNldndpcfdmh(other.getNldndpcfdmh());
      }
      if (other.getEndlkcenbpd() != false) {
        setEndlkcenbpd(other.getEndlkcenbpd());
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
      POGOProtos.Rpc.MHNEIDDBNGC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MHNEIDDBNGC) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC result = POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC.valueOf(status_);
      return result == null ? POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFJBGELCPOL.HBIHKKBLENC status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.LootProto nldndpcfdmh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> nldndpcfdmhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     * @return Whether the nldndpcfdmh field is set.
     */
    public boolean hasNldndpcfdmh() {
      return nldndpcfdmhBuilder_ != null || nldndpcfdmh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     * @return The nldndpcfdmh.
     */
    public POGOProtos.Rpc.LootProto getNldndpcfdmh() {
      if (nldndpcfdmhBuilder_ == null) {
        return nldndpcfdmh_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : nldndpcfdmh_;
      } else {
        return nldndpcfdmhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public Builder setNldndpcfdmh(POGOProtos.Rpc.LootProto value) {
      if (nldndpcfdmhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nldndpcfdmh_ = value;
        onChanged();
      } else {
        nldndpcfdmhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public Builder setNldndpcfdmh(
        POGOProtos.Rpc.LootProto.Builder builderForValue) {
      if (nldndpcfdmhBuilder_ == null) {
        nldndpcfdmh_ = builderForValue.build();
        onChanged();
      } else {
        nldndpcfdmhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public Builder mergeNldndpcfdmh(POGOProtos.Rpc.LootProto value) {
      if (nldndpcfdmhBuilder_ == null) {
        if (nldndpcfdmh_ != null) {
          nldndpcfdmh_ =
            POGOProtos.Rpc.LootProto.newBuilder(nldndpcfdmh_).mergeFrom(value).buildPartial();
        } else {
          nldndpcfdmh_ = value;
        }
        onChanged();
      } else {
        nldndpcfdmhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public Builder clearNldndpcfdmh() {
      if (nldndpcfdmhBuilder_ == null) {
        nldndpcfdmh_ = null;
        onChanged();
      } else {
        nldndpcfdmh_ = null;
        nldndpcfdmhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public POGOProtos.Rpc.LootProto.Builder getNldndpcfdmhBuilder() {
      
      onChanged();
      return getNldndpcfdmhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public POGOProtos.Rpc.LootProtoOrBuilder getNldndpcfdmhOrBuilder() {
      if (nldndpcfdmhBuilder_ != null) {
        return nldndpcfdmhBuilder_.getMessageOrBuilder();
      } else {
        return nldndpcfdmh_ == null ?
            POGOProtos.Rpc.LootProto.getDefaultInstance() : nldndpcfdmh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> 
        getNldndpcfdmhFieldBuilder() {
      if (nldndpcfdmhBuilder_ == null) {
        nldndpcfdmhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder>(
                getNldndpcfdmh(),
                getParentForChildren(),
                isClean());
        nldndpcfdmh_ = null;
      }
      return nldndpcfdmhBuilder_;
    }

    private boolean endlkcenbpd_ ;
    /**
     * <code>bool endlkcenbpd = 3;</code>
     * @return The endlkcenbpd.
     */
    @java.lang.Override
    public boolean getEndlkcenbpd() {
      return endlkcenbpd_;
    }
    /**
     * <code>bool endlkcenbpd = 3;</code>
     * @param value The endlkcenbpd to set.
     * @return This builder for chaining.
     */
    public Builder setEndlkcenbpd(boolean value) {
      
      endlkcenbpd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool endlkcenbpd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndlkcenbpd() {
      
      endlkcenbpd_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MHNEIDDBNGC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MHNEIDDBNGC)
  private static final POGOProtos.Rpc.MHNEIDDBNGC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MHNEIDDBNGC();
  }

  public static POGOProtos.Rpc.MHNEIDDBNGC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MHNEIDDBNGC>
      PARSER = new com.google.protobuf.AbstractParser<MHNEIDDBNGC>() {
    @java.lang.Override
    public MHNEIDDBNGC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MHNEIDDBNGC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MHNEIDDBNGC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MHNEIDDBNGC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MHNEIDDBNGC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
