// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MNPDDJNNFFL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.QuestStampCardProto}
 */
public final class QuestStampCardProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.QuestStampCardProto)
    QuestStampCardProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuestStampCardProto.newBuilder() to construct.
  private QuestStampCardProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuestStampCardProto() {
    phcdogbllok_ = java.util.Collections.emptyList();
    mjlofidknme_ = "";
    pekopdofdpi_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuestStampCardProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuestStampCardProto(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              phcdogbllok_ = new java.util.ArrayList<POGOProtos.Rpc.EJDMHKENPII>();
              mutable_bitField0_ |= 0x00000001;
            }
            phcdogbllok_.add(
                input.readMessage(POGOProtos.Rpc.EJDMHKENPII.parser(), extensionRegistry));
            break;
          }
          case 16: {

            heaeepoemki_ = input.readInt32();
            break;
          }
          case 24: {

            efmloggmbic_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            mjlofidknme_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            pekopdofdpi_ = s;
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
        phcdogbllok_ = java.util.Collections.unmodifiableList(phcdogbllok_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_QuestStampCardProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_QuestStampCardProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.QuestStampCardProto.class, POGOProtos.Rpc.QuestStampCardProto.Builder.class);
  }

  public static final int PHCDOGBLLOK_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.EJDMHKENPII> phcdogbllok_;
  /**
   * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.EJDMHKENPII> getPhcdogbllokList() {
    return phcdogbllok_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.EJDMHKENPIIOrBuilder> 
      getPhcdogbllokOrBuilderList() {
    return phcdogbllok_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
   */
  @java.lang.Override
  public int getPhcdogbllokCount() {
    return phcdogbllok_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.EJDMHKENPII getPhcdogbllok(int index) {
    return phcdogbllok_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.EJDMHKENPIIOrBuilder getPhcdogbllokOrBuilder(
      int index) {
    return phcdogbllok_.get(index);
  }

  public static final int HEAEEPOEMKI_FIELD_NUMBER = 2;
  private int heaeepoemki_;
  /**
   * <code>int32 heaeepoemki = 2;</code>
   * @return The heaeepoemki.
   */
  @java.lang.Override
  public int getHeaeepoemki() {
    return heaeepoemki_;
  }

  public static final int EFMLOGGMBIC_FIELD_NUMBER = 3;
  private int efmloggmbic_;
  /**
   * <code>int32 efmloggmbic = 3;</code>
   * @return The efmloggmbic.
   */
  @java.lang.Override
  public int getEfmloggmbic() {
    return efmloggmbic_;
  }

  public static final int MJLOFIDKNME_FIELD_NUMBER = 4;
  private volatile java.lang.Object mjlofidknme_;
  /**
   * <code>string mjlofidknme = 4;</code>
   * @return The mjlofidknme.
   */
  @java.lang.Override
  public java.lang.String getMjlofidknme() {
    java.lang.Object ref = mjlofidknme_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mjlofidknme_ = s;
      return s;
    }
  }
  /**
   * <code>string mjlofidknme = 4;</code>
   * @return The bytes for mjlofidknme.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMjlofidknmeBytes() {
    java.lang.Object ref = mjlofidknme_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mjlofidknme_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PEKOPDOFDPI_FIELD_NUMBER = 5;
  private volatile java.lang.Object pekopdofdpi_;
  /**
   * <code>string pekopdofdpi = 5;</code>
   * @return The pekopdofdpi.
   */
  @java.lang.Override
  public java.lang.String getPekopdofdpi() {
    java.lang.Object ref = pekopdofdpi_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pekopdofdpi_ = s;
      return s;
    }
  }
  /**
   * <code>string pekopdofdpi = 5;</code>
   * @return The bytes for pekopdofdpi.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPekopdofdpiBytes() {
    java.lang.Object ref = pekopdofdpi_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pekopdofdpi_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < phcdogbllok_.size(); i++) {
      output.writeMessage(1, phcdogbllok_.get(i));
    }
    if (heaeepoemki_ != 0) {
      output.writeInt32(2, heaeepoemki_);
    }
    if (efmloggmbic_ != 0) {
      output.writeInt32(3, efmloggmbic_);
    }
    if (!getMjlofidknmeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, mjlofidknme_);
    }
    if (!getPekopdofdpiBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, pekopdofdpi_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < phcdogbllok_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, phcdogbllok_.get(i));
    }
    if (heaeepoemki_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, heaeepoemki_);
    }
    if (efmloggmbic_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, efmloggmbic_);
    }
    if (!getMjlofidknmeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, mjlofidknme_);
    }
    if (!getPekopdofdpiBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, pekopdofdpi_);
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
    if (!(obj instanceof POGOProtos.Rpc.QuestStampCardProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.QuestStampCardProto other = (POGOProtos.Rpc.QuestStampCardProto) obj;

    if (!getPhcdogbllokList()
        .equals(other.getPhcdogbllokList())) return false;
    if (getHeaeepoemki()
        != other.getHeaeepoemki()) return false;
    if (getEfmloggmbic()
        != other.getEfmloggmbic()) return false;
    if (!getMjlofidknme()
        .equals(other.getMjlofidknme())) return false;
    if (!getPekopdofdpi()
        .equals(other.getPekopdofdpi())) return false;
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
    if (getPhcdogbllokCount() > 0) {
      hash = (37 * hash) + PHCDOGBLLOK_FIELD_NUMBER;
      hash = (53 * hash) + getPhcdogbllokList().hashCode();
    }
    hash = (37 * hash) + HEAEEPOEMKI_FIELD_NUMBER;
    hash = (53 * hash) + getHeaeepoemki();
    hash = (37 * hash) + EFMLOGGMBIC_FIELD_NUMBER;
    hash = (53 * hash) + getEfmloggmbic();
    hash = (37 * hash) + MJLOFIDKNME_FIELD_NUMBER;
    hash = (53 * hash) + getMjlofidknme().hashCode();
    hash = (37 * hash) + PEKOPDOFDPI_FIELD_NUMBER;
    hash = (53 * hash) + getPekopdofdpi().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.QuestStampCardProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.QuestStampCardProto prototype) {
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
   * ref: MNPDDJNNFFL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.QuestStampCardProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.QuestStampCardProto)
      POGOProtos.Rpc.QuestStampCardProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_QuestStampCardProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_QuestStampCardProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.QuestStampCardProto.class, POGOProtos.Rpc.QuestStampCardProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.QuestStampCardProto.newBuilder()
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
        getPhcdogbllokFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (phcdogbllokBuilder_ == null) {
        phcdogbllok_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        phcdogbllokBuilder_.clear();
      }
      heaeepoemki_ = 0;

      efmloggmbic_ = 0;

      mjlofidknme_ = "";

      pekopdofdpi_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_QuestStampCardProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.QuestStampCardProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.QuestStampCardProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.QuestStampCardProto build() {
      POGOProtos.Rpc.QuestStampCardProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.QuestStampCardProto buildPartial() {
      POGOProtos.Rpc.QuestStampCardProto result = new POGOProtos.Rpc.QuestStampCardProto(this);
      int from_bitField0_ = bitField0_;
      if (phcdogbllokBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          phcdogbllok_ = java.util.Collections.unmodifiableList(phcdogbllok_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.phcdogbllok_ = phcdogbllok_;
      } else {
        result.phcdogbllok_ = phcdogbllokBuilder_.build();
      }
      result.heaeepoemki_ = heaeepoemki_;
      result.efmloggmbic_ = efmloggmbic_;
      result.mjlofidknme_ = mjlofidknme_;
      result.pekopdofdpi_ = pekopdofdpi_;
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
      if (other instanceof POGOProtos.Rpc.QuestStampCardProto) {
        return mergeFrom((POGOProtos.Rpc.QuestStampCardProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.QuestStampCardProto other) {
      if (other == POGOProtos.Rpc.QuestStampCardProto.getDefaultInstance()) return this;
      if (phcdogbllokBuilder_ == null) {
        if (!other.phcdogbllok_.isEmpty()) {
          if (phcdogbllok_.isEmpty()) {
            phcdogbllok_ = other.phcdogbllok_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePhcdogbllokIsMutable();
            phcdogbllok_.addAll(other.phcdogbllok_);
          }
          onChanged();
        }
      } else {
        if (!other.phcdogbllok_.isEmpty()) {
          if (phcdogbllokBuilder_.isEmpty()) {
            phcdogbllokBuilder_.dispose();
            phcdogbllokBuilder_ = null;
            phcdogbllok_ = other.phcdogbllok_;
            bitField0_ = (bitField0_ & ~0x00000001);
            phcdogbllokBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPhcdogbllokFieldBuilder() : null;
          } else {
            phcdogbllokBuilder_.addAllMessages(other.phcdogbllok_);
          }
        }
      }
      if (other.getHeaeepoemki() != 0) {
        setHeaeepoemki(other.getHeaeepoemki());
      }
      if (other.getEfmloggmbic() != 0) {
        setEfmloggmbic(other.getEfmloggmbic());
      }
      if (!other.getMjlofidknme().isEmpty()) {
        mjlofidknme_ = other.mjlofidknme_;
        onChanged();
      }
      if (!other.getPekopdofdpi().isEmpty()) {
        pekopdofdpi_ = other.pekopdofdpi_;
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
      POGOProtos.Rpc.QuestStampCardProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.QuestStampCardProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.EJDMHKENPII> phcdogbllok_ =
      java.util.Collections.emptyList();
    private void ensurePhcdogbllokIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        phcdogbllok_ = new java.util.ArrayList<POGOProtos.Rpc.EJDMHKENPII>(phcdogbllok_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.EJDMHKENPII, POGOProtos.Rpc.EJDMHKENPII.Builder, POGOProtos.Rpc.EJDMHKENPIIOrBuilder> phcdogbllokBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.EJDMHKENPII> getPhcdogbllokList() {
      if (phcdogbllokBuilder_ == null) {
        return java.util.Collections.unmodifiableList(phcdogbllok_);
      } else {
        return phcdogbllokBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public int getPhcdogbllokCount() {
      if (phcdogbllokBuilder_ == null) {
        return phcdogbllok_.size();
      } else {
        return phcdogbllokBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public POGOProtos.Rpc.EJDMHKENPII getPhcdogbllok(int index) {
      if (phcdogbllokBuilder_ == null) {
        return phcdogbllok_.get(index);
      } else {
        return phcdogbllokBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public Builder setPhcdogbllok(
        int index, POGOProtos.Rpc.EJDMHKENPII value) {
      if (phcdogbllokBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhcdogbllokIsMutable();
        phcdogbllok_.set(index, value);
        onChanged();
      } else {
        phcdogbllokBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public Builder setPhcdogbllok(
        int index, POGOProtos.Rpc.EJDMHKENPII.Builder builderForValue) {
      if (phcdogbllokBuilder_ == null) {
        ensurePhcdogbllokIsMutable();
        phcdogbllok_.set(index, builderForValue.build());
        onChanged();
      } else {
        phcdogbllokBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public Builder addPhcdogbllok(POGOProtos.Rpc.EJDMHKENPII value) {
      if (phcdogbllokBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhcdogbllokIsMutable();
        phcdogbllok_.add(value);
        onChanged();
      } else {
        phcdogbllokBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public Builder addPhcdogbllok(
        int index, POGOProtos.Rpc.EJDMHKENPII value) {
      if (phcdogbllokBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhcdogbllokIsMutable();
        phcdogbllok_.add(index, value);
        onChanged();
      } else {
        phcdogbllokBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public Builder addPhcdogbllok(
        POGOProtos.Rpc.EJDMHKENPII.Builder builderForValue) {
      if (phcdogbllokBuilder_ == null) {
        ensurePhcdogbllokIsMutable();
        phcdogbllok_.add(builderForValue.build());
        onChanged();
      } else {
        phcdogbllokBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public Builder addPhcdogbllok(
        int index, POGOProtos.Rpc.EJDMHKENPII.Builder builderForValue) {
      if (phcdogbllokBuilder_ == null) {
        ensurePhcdogbllokIsMutable();
        phcdogbllok_.add(index, builderForValue.build());
        onChanged();
      } else {
        phcdogbllokBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public Builder addAllPhcdogbllok(
        java.lang.Iterable<? extends POGOProtos.Rpc.EJDMHKENPII> values) {
      if (phcdogbllokBuilder_ == null) {
        ensurePhcdogbllokIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, phcdogbllok_);
        onChanged();
      } else {
        phcdogbllokBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public Builder clearPhcdogbllok() {
      if (phcdogbllokBuilder_ == null) {
        phcdogbllok_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        phcdogbllokBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public Builder removePhcdogbllok(int index) {
      if (phcdogbllokBuilder_ == null) {
        ensurePhcdogbllokIsMutable();
        phcdogbllok_.remove(index);
        onChanged();
      } else {
        phcdogbllokBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public POGOProtos.Rpc.EJDMHKENPII.Builder getPhcdogbllokBuilder(
        int index) {
      return getPhcdogbllokFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public POGOProtos.Rpc.EJDMHKENPIIOrBuilder getPhcdogbllokOrBuilder(
        int index) {
      if (phcdogbllokBuilder_ == null) {
        return phcdogbllok_.get(index);  } else {
        return phcdogbllokBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.EJDMHKENPIIOrBuilder> 
         getPhcdogbllokOrBuilderList() {
      if (phcdogbllokBuilder_ != null) {
        return phcdogbllokBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(phcdogbllok_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public POGOProtos.Rpc.EJDMHKENPII.Builder addPhcdogbllokBuilder() {
      return getPhcdogbllokFieldBuilder().addBuilder(
          POGOProtos.Rpc.EJDMHKENPII.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public POGOProtos.Rpc.EJDMHKENPII.Builder addPhcdogbllokBuilder(
        int index) {
      return getPhcdogbllokFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.EJDMHKENPII.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EJDMHKENPII phcdogbllok = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.EJDMHKENPII.Builder> 
         getPhcdogbllokBuilderList() {
      return getPhcdogbllokFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.EJDMHKENPII, POGOProtos.Rpc.EJDMHKENPII.Builder, POGOProtos.Rpc.EJDMHKENPIIOrBuilder> 
        getPhcdogbllokFieldBuilder() {
      if (phcdogbllokBuilder_ == null) {
        phcdogbllokBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.EJDMHKENPII, POGOProtos.Rpc.EJDMHKENPII.Builder, POGOProtos.Rpc.EJDMHKENPIIOrBuilder>(
                phcdogbllok_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        phcdogbllok_ = null;
      }
      return phcdogbllokBuilder_;
    }

    private int heaeepoemki_ ;
    /**
     * <code>int32 heaeepoemki = 2;</code>
     * @return The heaeepoemki.
     */
    @java.lang.Override
    public int getHeaeepoemki() {
      return heaeepoemki_;
    }
    /**
     * <code>int32 heaeepoemki = 2;</code>
     * @param value The heaeepoemki to set.
     * @return This builder for chaining.
     */
    public Builder setHeaeepoemki(int value) {
      
      heaeepoemki_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 heaeepoemki = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeaeepoemki() {
      
      heaeepoemki_ = 0;
      onChanged();
      return this;
    }

    private int efmloggmbic_ ;
    /**
     * <code>int32 efmloggmbic = 3;</code>
     * @return The efmloggmbic.
     */
    @java.lang.Override
    public int getEfmloggmbic() {
      return efmloggmbic_;
    }
    /**
     * <code>int32 efmloggmbic = 3;</code>
     * @param value The efmloggmbic to set.
     * @return This builder for chaining.
     */
    public Builder setEfmloggmbic(int value) {
      
      efmloggmbic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 efmloggmbic = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEfmloggmbic() {
      
      efmloggmbic_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object mjlofidknme_ = "";
    /**
     * <code>string mjlofidknme = 4;</code>
     * @return The mjlofidknme.
     */
    public java.lang.String getMjlofidknme() {
      java.lang.Object ref = mjlofidknme_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mjlofidknme_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mjlofidknme = 4;</code>
     * @return The bytes for mjlofidknme.
     */
    public com.google.protobuf.ByteString
        getMjlofidknmeBytes() {
      java.lang.Object ref = mjlofidknme_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mjlofidknme_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mjlofidknme = 4;</code>
     * @param value The mjlofidknme to set.
     * @return This builder for chaining.
     */
    public Builder setMjlofidknme(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mjlofidknme_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mjlofidknme = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMjlofidknme() {
      
      mjlofidknme_ = getDefaultInstance().getMjlofidknme();
      onChanged();
      return this;
    }
    /**
     * <code>string mjlofidknme = 4;</code>
     * @param value The bytes for mjlofidknme to set.
     * @return This builder for chaining.
     */
    public Builder setMjlofidknmeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mjlofidknme_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pekopdofdpi_ = "";
    /**
     * <code>string pekopdofdpi = 5;</code>
     * @return The pekopdofdpi.
     */
    public java.lang.String getPekopdofdpi() {
      java.lang.Object ref = pekopdofdpi_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pekopdofdpi_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pekopdofdpi = 5;</code>
     * @return The bytes for pekopdofdpi.
     */
    public com.google.protobuf.ByteString
        getPekopdofdpiBytes() {
      java.lang.Object ref = pekopdofdpi_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pekopdofdpi_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pekopdofdpi = 5;</code>
     * @param value The pekopdofdpi to set.
     * @return This builder for chaining.
     */
    public Builder setPekopdofdpi(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pekopdofdpi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pekopdofdpi = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPekopdofdpi() {
      
      pekopdofdpi_ = getDefaultInstance().getPekopdofdpi();
      onChanged();
      return this;
    }
    /**
     * <code>string pekopdofdpi = 5;</code>
     * @param value The bytes for pekopdofdpi to set.
     * @return This builder for chaining.
     */
    public Builder setPekopdofdpiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pekopdofdpi_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.QuestStampCardProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.QuestStampCardProto)
  private static final POGOProtos.Rpc.QuestStampCardProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.QuestStampCardProto();
  }

  public static POGOProtos.Rpc.QuestStampCardProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuestStampCardProto>
      PARSER = new com.google.protobuf.AbstractParser<QuestStampCardProto>() {
    @java.lang.Override
    public QuestStampCardProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuestStampCardProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuestStampCardProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuestStampCardProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.QuestStampCardProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

