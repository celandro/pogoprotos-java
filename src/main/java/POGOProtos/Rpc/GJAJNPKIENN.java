// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GJAJNPKIENN}
 */
public  final class GJAJNPKIENN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GJAJNPKIENN)
    GJAJNPKIENNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GJAJNPKIENN.newBuilder() to construct.
  private GJAJNPKIENN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GJAJNPKIENN() {
    fdhacdblfmn_ = java.util.Collections.emptyList();
    cgakcjmdlcl_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GJAJNPKIENN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GJAJNPKIENN(
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

            knacecmopfg_ = input.readBool();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fdhacdblfmn_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            fdhacdblfmn_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fdhacdblfmn_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              fdhacdblfmn_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            cgakcjmdlcl_ = rawValue;
            break;
          }
          case 32: {

            kmmklijlhhc_ = input.readInt32();
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
        fdhacdblfmn_ = java.util.Collections.unmodifiableList(fdhacdblfmn_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GJAJNPKIENN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GJAJNPKIENN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GJAJNPKIENN.class, POGOProtos.Rpc.GJAJNPKIENN.Builder.class);
  }

  public static final int KNACECMOPFG_FIELD_NUMBER = 1;
  private boolean knacecmopfg_;
  /**
   * <code>bool knacecmopfg = 1;</code>
   * @return The knacecmopfg.
   */
  public boolean getKnacecmopfg() {
    return knacecmopfg_;
  }

  public static final int FDHACDBLFMN_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> fdhacdblfmn_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.DABLMJBNPBD> fdhacdblfmn_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.DABLMJBNPBD>() {
            public POGOProtos.Rpc.DABLMJBNPBD convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(from);
              return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
   * @return A list containing the fdhacdblfmn.
   */
  public java.util.List<POGOProtos.Rpc.DABLMJBNPBD> getFdhacdblfmnList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.DABLMJBNPBD>(fdhacdblfmn_, fdhacdblfmn_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
   * @return The count of fdhacdblfmn.
   */
  public int getFdhacdblfmnCount() {
    return fdhacdblfmn_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
   * @param index The index of the element to return.
   * @return The fdhacdblfmn at the given index.
   */
  public POGOProtos.Rpc.DABLMJBNPBD getFdhacdblfmn(int index) {
    return fdhacdblfmn_converter_.convert(fdhacdblfmn_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
   * @return A list containing the enum numeric values on the wire for fdhacdblfmn.
   */
  public java.util.List<java.lang.Integer>
  getFdhacdblfmnValueList() {
    return fdhacdblfmn_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of fdhacdblfmn at the given index.
   */
  public int getFdhacdblfmnValue(int index) {
    return fdhacdblfmn_.get(index);
  }
  private int fdhacdblfmnMemoizedSerializedSize;

  public static final int CGAKCJMDLCL_FIELD_NUMBER = 3;
  private int cgakcjmdlcl_;
  /**
   * <code>.POGOProtos.Rpc.DABLMJBNPBD cgakcjmdlcl = 3;</code>
   * @return The enum numeric value on the wire for cgakcjmdlcl.
   */
  public int getCgakcjmdlclValue() {
    return cgakcjmdlcl_;
  }
  /**
   * <code>.POGOProtos.Rpc.DABLMJBNPBD cgakcjmdlcl = 3;</code>
   * @return The cgakcjmdlcl.
   */
  public POGOProtos.Rpc.DABLMJBNPBD getCgakcjmdlcl() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(cgakcjmdlcl_);
    return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
  }

  public static final int KMMKLIJLHHC_FIELD_NUMBER = 4;
  private int kmmklijlhhc_;
  /**
   * <code>int32 kmmklijlhhc = 4;</code>
   * @return The kmmklijlhhc.
   */
  public int getKmmklijlhhc() {
    return kmmklijlhhc_;
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
    getSerializedSize();
    if (knacecmopfg_ != false) {
      output.writeBool(1, knacecmopfg_);
    }
    if (getFdhacdblfmnList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(fdhacdblfmnMemoizedSerializedSize);
    }
    for (int i = 0; i < fdhacdblfmn_.size(); i++) {
      output.writeEnumNoTag(fdhacdblfmn_.get(i));
    }
    if (cgakcjmdlcl_ != POGOProtos.Rpc.DABLMJBNPBD.DABLMJBNPBD_POKEMON_UNSET.getNumber()) {
      output.writeEnum(3, cgakcjmdlcl_);
    }
    if (kmmklijlhhc_ != 0) {
      output.writeInt32(4, kmmklijlhhc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (knacecmopfg_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, knacecmopfg_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fdhacdblfmn_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(fdhacdblfmn_.get(i));
      }
      size += dataSize;
      if (!getFdhacdblfmnList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }fdhacdblfmnMemoizedSerializedSize = dataSize;
    }
    if (cgakcjmdlcl_ != POGOProtos.Rpc.DABLMJBNPBD.DABLMJBNPBD_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, cgakcjmdlcl_);
    }
    if (kmmklijlhhc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, kmmklijlhhc_);
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
    if (!(obj instanceof POGOProtos.Rpc.GJAJNPKIENN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GJAJNPKIENN other = (POGOProtos.Rpc.GJAJNPKIENN) obj;

    if (getKnacecmopfg()
        != other.getKnacecmopfg()) return false;
    if (!fdhacdblfmn_.equals(other.fdhacdblfmn_)) return false;
    if (cgakcjmdlcl_ != other.cgakcjmdlcl_) return false;
    if (getKmmklijlhhc()
        != other.getKmmklijlhhc()) return false;
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
    hash = (37 * hash) + KNACECMOPFG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKnacecmopfg());
    if (getFdhacdblfmnCount() > 0) {
      hash = (37 * hash) + FDHACDBLFMN_FIELD_NUMBER;
      hash = (53 * hash) + fdhacdblfmn_.hashCode();
    }
    hash = (37 * hash) + CGAKCJMDLCL_FIELD_NUMBER;
    hash = (53 * hash) + cgakcjmdlcl_;
    hash = (37 * hash) + KMMKLIJLHHC_FIELD_NUMBER;
    hash = (53 * hash) + getKmmklijlhhc();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GJAJNPKIENN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GJAJNPKIENN prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GJAJNPKIENN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GJAJNPKIENN)
      POGOProtos.Rpc.GJAJNPKIENNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GJAJNPKIENN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GJAJNPKIENN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GJAJNPKIENN.class, POGOProtos.Rpc.GJAJNPKIENN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GJAJNPKIENN.newBuilder()
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
      knacecmopfg_ = false;

      fdhacdblfmn_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      cgakcjmdlcl_ = 0;

      kmmklijlhhc_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GJAJNPKIENN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GJAJNPKIENN getDefaultInstanceForType() {
      return POGOProtos.Rpc.GJAJNPKIENN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GJAJNPKIENN build() {
      POGOProtos.Rpc.GJAJNPKIENN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GJAJNPKIENN buildPartial() {
      POGOProtos.Rpc.GJAJNPKIENN result = new POGOProtos.Rpc.GJAJNPKIENN(this);
      int from_bitField0_ = bitField0_;
      result.knacecmopfg_ = knacecmopfg_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fdhacdblfmn_ = java.util.Collections.unmodifiableList(fdhacdblfmn_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fdhacdblfmn_ = fdhacdblfmn_;
      result.cgakcjmdlcl_ = cgakcjmdlcl_;
      result.kmmklijlhhc_ = kmmklijlhhc_;
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
      if (other instanceof POGOProtos.Rpc.GJAJNPKIENN) {
        return mergeFrom((POGOProtos.Rpc.GJAJNPKIENN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GJAJNPKIENN other) {
      if (other == POGOProtos.Rpc.GJAJNPKIENN.getDefaultInstance()) return this;
      if (other.getKnacecmopfg() != false) {
        setKnacecmopfg(other.getKnacecmopfg());
      }
      if (!other.fdhacdblfmn_.isEmpty()) {
        if (fdhacdblfmn_.isEmpty()) {
          fdhacdblfmn_ = other.fdhacdblfmn_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFdhacdblfmnIsMutable();
          fdhacdblfmn_.addAll(other.fdhacdblfmn_);
        }
        onChanged();
      }
      if (other.cgakcjmdlcl_ != 0) {
        setCgakcjmdlclValue(other.getCgakcjmdlclValue());
      }
      if (other.getKmmklijlhhc() != 0) {
        setKmmklijlhhc(other.getKmmklijlhhc());
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
      POGOProtos.Rpc.GJAJNPKIENN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GJAJNPKIENN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean knacecmopfg_ ;
    /**
     * <code>bool knacecmopfg = 1;</code>
     * @return The knacecmopfg.
     */
    public boolean getKnacecmopfg() {
      return knacecmopfg_;
    }
    /**
     * <code>bool knacecmopfg = 1;</code>
     * @param value The knacecmopfg to set.
     * @return This builder for chaining.
     */
    public Builder setKnacecmopfg(boolean value) {
      
      knacecmopfg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool knacecmopfg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKnacecmopfg() {
      
      knacecmopfg_ = false;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> fdhacdblfmn_ =
      java.util.Collections.emptyList();
    private void ensureFdhacdblfmnIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fdhacdblfmn_ = new java.util.ArrayList<java.lang.Integer>(fdhacdblfmn_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @return A list containing the fdhacdblfmn.
     */
    public java.util.List<POGOProtos.Rpc.DABLMJBNPBD> getFdhacdblfmnList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.DABLMJBNPBD>(fdhacdblfmn_, fdhacdblfmn_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @return The count of fdhacdblfmn.
     */
    public int getFdhacdblfmnCount() {
      return fdhacdblfmn_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param index The index of the element to return.
     * @return The fdhacdblfmn at the given index.
     */
    public POGOProtos.Rpc.DABLMJBNPBD getFdhacdblfmn(int index) {
      return fdhacdblfmn_converter_.convert(fdhacdblfmn_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param index The index to set the value at.
     * @param value The fdhacdblfmn to set.
     * @return This builder for chaining.
     */
    public Builder setFdhacdblfmn(
        int index, POGOProtos.Rpc.DABLMJBNPBD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFdhacdblfmnIsMutable();
      fdhacdblfmn_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param value The fdhacdblfmn to add.
     * @return This builder for chaining.
     */
    public Builder addFdhacdblfmn(POGOProtos.Rpc.DABLMJBNPBD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFdhacdblfmnIsMutable();
      fdhacdblfmn_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param values The fdhacdblfmn to add.
     * @return This builder for chaining.
     */
    public Builder addAllFdhacdblfmn(
        java.lang.Iterable<? extends POGOProtos.Rpc.DABLMJBNPBD> values) {
      ensureFdhacdblfmnIsMutable();
      for (POGOProtos.Rpc.DABLMJBNPBD value : values) {
        fdhacdblfmn_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFdhacdblfmn() {
      fdhacdblfmn_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @return A list containing the enum numeric values on the wire for fdhacdblfmn.
     */
    public java.util.List<java.lang.Integer>
    getFdhacdblfmnValueList() {
      return java.util.Collections.unmodifiableList(fdhacdblfmn_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of fdhacdblfmn at the given index.
     */
    public int getFdhacdblfmnValue(int index) {
      return fdhacdblfmn_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of fdhacdblfmn at the given index.
     * @return This builder for chaining.
     */
    public Builder setFdhacdblfmnValue(
        int index, int value) {
      ensureFdhacdblfmnIsMutable();
      fdhacdblfmn_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param value The enum numeric value on the wire for fdhacdblfmn to add.
     * @return This builder for chaining.
     */
    public Builder addFdhacdblfmnValue(int value) {
      ensureFdhacdblfmnIsMutable();
      fdhacdblfmn_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param values The enum numeric values on the wire for fdhacdblfmn to add.
     * @return This builder for chaining.
     */
    public Builder addAllFdhacdblfmnValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureFdhacdblfmnIsMutable();
      for (int value : values) {
        fdhacdblfmn_.add(value);
      }
      onChanged();
      return this;
    }

    private int cgakcjmdlcl_ = 0;
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD cgakcjmdlcl = 3;</code>
     * @return The enum numeric value on the wire for cgakcjmdlcl.
     */
    public int getCgakcjmdlclValue() {
      return cgakcjmdlcl_;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD cgakcjmdlcl = 3;</code>
     * @param value The enum numeric value on the wire for cgakcjmdlcl to set.
     * @return This builder for chaining.
     */
    public Builder setCgakcjmdlclValue(int value) {
      cgakcjmdlcl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD cgakcjmdlcl = 3;</code>
     * @return The cgakcjmdlcl.
     */
    public POGOProtos.Rpc.DABLMJBNPBD getCgakcjmdlcl() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(cgakcjmdlcl_);
      return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD cgakcjmdlcl = 3;</code>
     * @param value The cgakcjmdlcl to set.
     * @return This builder for chaining.
     */
    public Builder setCgakcjmdlcl(POGOProtos.Rpc.DABLMJBNPBD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cgakcjmdlcl_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD cgakcjmdlcl = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCgakcjmdlcl() {
      
      cgakcjmdlcl_ = 0;
      onChanged();
      return this;
    }

    private int kmmklijlhhc_ ;
    /**
     * <code>int32 kmmklijlhhc = 4;</code>
     * @return The kmmklijlhhc.
     */
    public int getKmmklijlhhc() {
      return kmmklijlhhc_;
    }
    /**
     * <code>int32 kmmklijlhhc = 4;</code>
     * @param value The kmmklijlhhc to set.
     * @return This builder for chaining.
     */
    public Builder setKmmklijlhhc(int value) {
      
      kmmklijlhhc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 kmmklijlhhc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKmmklijlhhc() {
      
      kmmklijlhhc_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GJAJNPKIENN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GJAJNPKIENN)
  private static final POGOProtos.Rpc.GJAJNPKIENN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GJAJNPKIENN();
  }

  public static POGOProtos.Rpc.GJAJNPKIENN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GJAJNPKIENN>
      PARSER = new com.google.protobuf.AbstractParser<GJAJNPKIENN>() {
    @java.lang.Override
    public GJAJNPKIENN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GJAJNPKIENN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GJAJNPKIENN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GJAJNPKIENN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GJAJNPKIENN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

