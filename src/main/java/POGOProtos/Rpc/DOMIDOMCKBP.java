// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.DOMIDOMCKBP}
 */
public  final class DOMIDOMCKBP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DOMIDOMCKBP)
    DOMIDOMCKBPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DOMIDOMCKBP.newBuilder() to construct.
  private DOMIDOMCKBP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DOMIDOMCKBP() {
    mmmebkpmnml_ = "";
    hjaaehnhpej_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DOMIDOMCKBP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DOMIDOMCKBP(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            mmmebkpmnml_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            hjaaehnhpej_ = rawValue;
            break;
          }
          case 26: {
            POGOProtos.Rpc.NAKGHCDIABM.Builder subBuilder = null;
            if (ehdglpppibf_ != null) {
              subBuilder = ehdglpppibf_.toBuilder();
            }
            ehdglpppibf_ = input.readMessage(POGOProtos.Rpc.NAKGHCDIABM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ehdglpppibf_);
              ehdglpppibf_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DOMIDOMCKBP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DOMIDOMCKBP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DOMIDOMCKBP.class, POGOProtos.Rpc.DOMIDOMCKBP.Builder.class);
  }

  public static final int MMMEBKPMNML_FIELD_NUMBER = 1;
  private volatile java.lang.Object mmmebkpmnml_;
  /**
   * <code>string mmmebkpmnml = 1;</code>
   * @return The mmmebkpmnml.
   */
  public java.lang.String getMmmebkpmnml() {
    java.lang.Object ref = mmmebkpmnml_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mmmebkpmnml_ = s;
      return s;
    }
  }
  /**
   * <code>string mmmebkpmnml = 1;</code>
   * @return The bytes for mmmebkpmnml.
   */
  public com.google.protobuf.ByteString
      getMmmebkpmnmlBytes() {
    java.lang.Object ref = mmmebkpmnml_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mmmebkpmnml_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HJAAEHNHPEJ_FIELD_NUMBER = 2;
  private int hjaaehnhpej_;
  /**
   * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 2;</code>
   * @return The enum numeric value on the wire for hjaaehnhpej.
   */
  public int getHjaaehnhpejValue() {
    return hjaaehnhpej_;
  }
  /**
   * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 2;</code>
   * @return The hjaaehnhpej.
   */
  public POGOProtos.Rpc.EAFFLJCABOK getHjaaehnhpej() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EAFFLJCABOK result = POGOProtos.Rpc.EAFFLJCABOK.valueOf(hjaaehnhpej_);
    return result == null ? POGOProtos.Rpc.EAFFLJCABOK.UNRECOGNIZED : result;
  }

  public static final int EHDGLPPPIBF_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf_;
  /**
   * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
   * @return Whether the ehdglpppibf field is set.
   */
  public boolean hasEhdglpppibf() {
    return ehdglpppibf_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
   * @return The ehdglpppibf.
   */
  public POGOProtos.Rpc.NAKGHCDIABM getEhdglpppibf() {
    return ehdglpppibf_ == null ? POGOProtos.Rpc.NAKGHCDIABM.getDefaultInstance() : ehdglpppibf_;
  }
  /**
   * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
   */
  public POGOProtos.Rpc.NAKGHCDIABMOrBuilder getEhdglpppibfOrBuilder() {
    return getEhdglpppibf();
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
    if (!getMmmebkpmnmlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mmmebkpmnml_);
    }
    if (hjaaehnhpej_ != POGOProtos.Rpc.EAFFLJCABOK.EAFFLJCABOK_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(2, hjaaehnhpej_);
    }
    if (ehdglpppibf_ != null) {
      output.writeMessage(3, getEhdglpppibf());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMmmebkpmnmlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mmmebkpmnml_);
    }
    if (hjaaehnhpej_ != POGOProtos.Rpc.EAFFLJCABOK.EAFFLJCABOK_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, hjaaehnhpej_);
    }
    if (ehdglpppibf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEhdglpppibf());
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
    if (!(obj instanceof POGOProtos.Rpc.DOMIDOMCKBP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DOMIDOMCKBP other = (POGOProtos.Rpc.DOMIDOMCKBP) obj;

    if (!getMmmebkpmnml()
        .equals(other.getMmmebkpmnml())) return false;
    if (hjaaehnhpej_ != other.hjaaehnhpej_) return false;
    if (hasEhdglpppibf() != other.hasEhdglpppibf()) return false;
    if (hasEhdglpppibf()) {
      if (!getEhdglpppibf()
          .equals(other.getEhdglpppibf())) return false;
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
    hash = (37 * hash) + MMMEBKPMNML_FIELD_NUMBER;
    hash = (53 * hash) + getMmmebkpmnml().hashCode();
    hash = (37 * hash) + HJAAEHNHPEJ_FIELD_NUMBER;
    hash = (53 * hash) + hjaaehnhpej_;
    if (hasEhdglpppibf()) {
      hash = (37 * hash) + EHDGLPPPIBF_FIELD_NUMBER;
      hash = (53 * hash) + getEhdglpppibf().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DOMIDOMCKBP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DOMIDOMCKBP prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.DOMIDOMCKBP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DOMIDOMCKBP)
      POGOProtos.Rpc.DOMIDOMCKBPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DOMIDOMCKBP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DOMIDOMCKBP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DOMIDOMCKBP.class, POGOProtos.Rpc.DOMIDOMCKBP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DOMIDOMCKBP.newBuilder()
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
      mmmebkpmnml_ = "";

      hjaaehnhpej_ = 0;

      if (ehdglpppibfBuilder_ == null) {
        ehdglpppibf_ = null;
      } else {
        ehdglpppibf_ = null;
        ehdglpppibfBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DOMIDOMCKBP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DOMIDOMCKBP getDefaultInstanceForType() {
      return POGOProtos.Rpc.DOMIDOMCKBP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DOMIDOMCKBP build() {
      POGOProtos.Rpc.DOMIDOMCKBP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DOMIDOMCKBP buildPartial() {
      POGOProtos.Rpc.DOMIDOMCKBP result = new POGOProtos.Rpc.DOMIDOMCKBP(this);
      result.mmmebkpmnml_ = mmmebkpmnml_;
      result.hjaaehnhpej_ = hjaaehnhpej_;
      if (ehdglpppibfBuilder_ == null) {
        result.ehdglpppibf_ = ehdglpppibf_;
      } else {
        result.ehdglpppibf_ = ehdglpppibfBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.DOMIDOMCKBP) {
        return mergeFrom((POGOProtos.Rpc.DOMIDOMCKBP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DOMIDOMCKBP other) {
      if (other == POGOProtos.Rpc.DOMIDOMCKBP.getDefaultInstance()) return this;
      if (!other.getMmmebkpmnml().isEmpty()) {
        mmmebkpmnml_ = other.mmmebkpmnml_;
        onChanged();
      }
      if (other.hjaaehnhpej_ != 0) {
        setHjaaehnhpejValue(other.getHjaaehnhpejValue());
      }
      if (other.hasEhdglpppibf()) {
        mergeEhdglpppibf(other.getEhdglpppibf());
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
      POGOProtos.Rpc.DOMIDOMCKBP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DOMIDOMCKBP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mmmebkpmnml_ = "";
    /**
     * <code>string mmmebkpmnml = 1;</code>
     * @return The mmmebkpmnml.
     */
    public java.lang.String getMmmebkpmnml() {
      java.lang.Object ref = mmmebkpmnml_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mmmebkpmnml_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mmmebkpmnml = 1;</code>
     * @return The bytes for mmmebkpmnml.
     */
    public com.google.protobuf.ByteString
        getMmmebkpmnmlBytes() {
      java.lang.Object ref = mmmebkpmnml_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mmmebkpmnml_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mmmebkpmnml = 1;</code>
     * @param value The mmmebkpmnml to set.
     * @return This builder for chaining.
     */
    public Builder setMmmebkpmnml(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mmmebkpmnml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mmmebkpmnml = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMmmebkpmnml() {
      
      mmmebkpmnml_ = getDefaultInstance().getMmmebkpmnml();
      onChanged();
      return this;
    }
    /**
     * <code>string mmmebkpmnml = 1;</code>
     * @param value The bytes for mmmebkpmnml to set.
     * @return This builder for chaining.
     */
    public Builder setMmmebkpmnmlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mmmebkpmnml_ = value;
      onChanged();
      return this;
    }

    private int hjaaehnhpej_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 2;</code>
     * @return The enum numeric value on the wire for hjaaehnhpej.
     */
    public int getHjaaehnhpejValue() {
      return hjaaehnhpej_;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 2;</code>
     * @param value The enum numeric value on the wire for hjaaehnhpej to set.
     * @return This builder for chaining.
     */
    public Builder setHjaaehnhpejValue(int value) {
      hjaaehnhpej_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 2;</code>
     * @return The hjaaehnhpej.
     */
    public POGOProtos.Rpc.EAFFLJCABOK getHjaaehnhpej() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EAFFLJCABOK result = POGOProtos.Rpc.EAFFLJCABOK.valueOf(hjaaehnhpej_);
      return result == null ? POGOProtos.Rpc.EAFFLJCABOK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 2;</code>
     * @param value The hjaaehnhpej to set.
     * @return This builder for chaining.
     */
    public Builder setHjaaehnhpej(POGOProtos.Rpc.EAFFLJCABOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      hjaaehnhpej_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EAFFLJCABOK hjaaehnhpej = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHjaaehnhpej() {
      
      hjaaehnhpej_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NAKGHCDIABM, POGOProtos.Rpc.NAKGHCDIABM.Builder, POGOProtos.Rpc.NAKGHCDIABMOrBuilder> ehdglpppibfBuilder_;
    /**
     * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
     * @return Whether the ehdglpppibf field is set.
     */
    public boolean hasEhdglpppibf() {
      return ehdglpppibfBuilder_ != null || ehdglpppibf_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
     * @return The ehdglpppibf.
     */
    public POGOProtos.Rpc.NAKGHCDIABM getEhdglpppibf() {
      if (ehdglpppibfBuilder_ == null) {
        return ehdglpppibf_ == null ? POGOProtos.Rpc.NAKGHCDIABM.getDefaultInstance() : ehdglpppibf_;
      } else {
        return ehdglpppibfBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
     */
    public Builder setEhdglpppibf(POGOProtos.Rpc.NAKGHCDIABM value) {
      if (ehdglpppibfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ehdglpppibf_ = value;
        onChanged();
      } else {
        ehdglpppibfBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
     */
    public Builder setEhdglpppibf(
        POGOProtos.Rpc.NAKGHCDIABM.Builder builderForValue) {
      if (ehdglpppibfBuilder_ == null) {
        ehdglpppibf_ = builderForValue.build();
        onChanged();
      } else {
        ehdglpppibfBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
     */
    public Builder mergeEhdglpppibf(POGOProtos.Rpc.NAKGHCDIABM value) {
      if (ehdglpppibfBuilder_ == null) {
        if (ehdglpppibf_ != null) {
          ehdglpppibf_ =
            POGOProtos.Rpc.NAKGHCDIABM.newBuilder(ehdglpppibf_).mergeFrom(value).buildPartial();
        } else {
          ehdglpppibf_ = value;
        }
        onChanged();
      } else {
        ehdglpppibfBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
     */
    public Builder clearEhdglpppibf() {
      if (ehdglpppibfBuilder_ == null) {
        ehdglpppibf_ = null;
        onChanged();
      } else {
        ehdglpppibf_ = null;
        ehdglpppibfBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
     */
    public POGOProtos.Rpc.NAKGHCDIABM.Builder getEhdglpppibfBuilder() {
      
      onChanged();
      return getEhdglpppibfFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
     */
    public POGOProtos.Rpc.NAKGHCDIABMOrBuilder getEhdglpppibfOrBuilder() {
      if (ehdglpppibfBuilder_ != null) {
        return ehdglpppibfBuilder_.getMessageOrBuilder();
      } else {
        return ehdglpppibf_ == null ?
            POGOProtos.Rpc.NAKGHCDIABM.getDefaultInstance() : ehdglpppibf_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NAKGHCDIABM ehdglpppibf = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NAKGHCDIABM, POGOProtos.Rpc.NAKGHCDIABM.Builder, POGOProtos.Rpc.NAKGHCDIABMOrBuilder> 
        getEhdglpppibfFieldBuilder() {
      if (ehdglpppibfBuilder_ == null) {
        ehdglpppibfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.NAKGHCDIABM, POGOProtos.Rpc.NAKGHCDIABM.Builder, POGOProtos.Rpc.NAKGHCDIABMOrBuilder>(
                getEhdglpppibf(),
                getParentForChildren(),
                isClean());
        ehdglpppibf_ = null;
      }
      return ehdglpppibfBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DOMIDOMCKBP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DOMIDOMCKBP)
  private static final POGOProtos.Rpc.DOMIDOMCKBP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DOMIDOMCKBP();
  }

  public static POGOProtos.Rpc.DOMIDOMCKBP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DOMIDOMCKBP>
      PARSER = new com.google.protobuf.AbstractParser<DOMIDOMCKBP>() {
    @java.lang.Override
    public DOMIDOMCKBP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DOMIDOMCKBP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DOMIDOMCKBP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DOMIDOMCKBP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DOMIDOMCKBP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

