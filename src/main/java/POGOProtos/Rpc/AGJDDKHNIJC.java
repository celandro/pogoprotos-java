// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AGJDDKHNIJC}
 */
public  final class AGJDDKHNIJC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AGJDDKHNIJC)
    AGJDDKHNIJCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AGJDDKHNIJC.newBuilder() to construct.
  private AGJDDKHNIJC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AGJDDKHNIJC() {
    fdhacdblfmn_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AGJDDKHNIJC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AGJDDKHNIJC(
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

            bejihkfamje_ = input.readInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            fdhacdblfmn_ = rawValue;
            break;
          }
          case 24: {

            mkophddhbld_ = input.readInt32();
            break;
          }
          case 37: {

            inaanmknjbj_ = input.readFloat();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AGJDDKHNIJC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AGJDDKHNIJC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AGJDDKHNIJC.class, POGOProtos.Rpc.AGJDDKHNIJC.Builder.class);
  }

  public static final int BEJIHKFAMJE_FIELD_NUMBER = 1;
  private long bejihkfamje_;
  /**
   * <code>int64 bejihkfamje = 1;</code>
   * @return The bejihkfamje.
   */
  public long getBejihkfamje() {
    return bejihkfamje_;
  }

  public static final int FDHACDBLFMN_FIELD_NUMBER = 2;
  private int fdhacdblfmn_;
  /**
   * <code>.POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
   * @return The enum numeric value on the wire for fdhacdblfmn.
   */
  public int getFdhacdblfmnValue() {
    return fdhacdblfmn_;
  }
  /**
   * <code>.POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
   * @return The fdhacdblfmn.
   */
  public POGOProtos.Rpc.DABLMJBNPBD getFdhacdblfmn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(fdhacdblfmn_);
    return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
  }

  public static final int MKOPHDDHBLD_FIELD_NUMBER = 3;
  private int mkophddhbld_;
  /**
   * <code>int32 mkophddhbld = 3;</code>
   * @return The mkophddhbld.
   */
  public int getMkophddhbld() {
    return mkophddhbld_;
  }

  public static final int INAANMKNJBJ_FIELD_NUMBER = 4;
  private float inaanmknjbj_;
  /**
   * <code>float inaanmknjbj = 4;</code>
   * @return The inaanmknjbj.
   */
  public float getInaanmknjbj() {
    return inaanmknjbj_;
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
    if (bejihkfamje_ != 0L) {
      output.writeInt64(1, bejihkfamje_);
    }
    if (fdhacdblfmn_ != POGOProtos.Rpc.DABLMJBNPBD.DABLMJBNPBD_POKEMON_UNSET.getNumber()) {
      output.writeEnum(2, fdhacdblfmn_);
    }
    if (mkophddhbld_ != 0) {
      output.writeInt32(3, mkophddhbld_);
    }
    if (inaanmknjbj_ != 0F) {
      output.writeFloat(4, inaanmknjbj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bejihkfamje_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, bejihkfamje_);
    }
    if (fdhacdblfmn_ != POGOProtos.Rpc.DABLMJBNPBD.DABLMJBNPBD_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, fdhacdblfmn_);
    }
    if (mkophddhbld_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, mkophddhbld_);
    }
    if (inaanmknjbj_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, inaanmknjbj_);
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
    if (!(obj instanceof POGOProtos.Rpc.AGJDDKHNIJC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AGJDDKHNIJC other = (POGOProtos.Rpc.AGJDDKHNIJC) obj;

    if (getBejihkfamje()
        != other.getBejihkfamje()) return false;
    if (fdhacdblfmn_ != other.fdhacdblfmn_) return false;
    if (getMkophddhbld()
        != other.getMkophddhbld()) return false;
    if (java.lang.Float.floatToIntBits(getInaanmknjbj())
        != java.lang.Float.floatToIntBits(
            other.getInaanmknjbj())) return false;
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
    hash = (37 * hash) + BEJIHKFAMJE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBejihkfamje());
    hash = (37 * hash) + FDHACDBLFMN_FIELD_NUMBER;
    hash = (53 * hash) + fdhacdblfmn_;
    hash = (37 * hash) + MKOPHDDHBLD_FIELD_NUMBER;
    hash = (53 * hash) + getMkophddhbld();
    hash = (37 * hash) + INAANMKNJBJ_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getInaanmknjbj());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AGJDDKHNIJC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AGJDDKHNIJC prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AGJDDKHNIJC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AGJDDKHNIJC)
      POGOProtos.Rpc.AGJDDKHNIJCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AGJDDKHNIJC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AGJDDKHNIJC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AGJDDKHNIJC.class, POGOProtos.Rpc.AGJDDKHNIJC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AGJDDKHNIJC.newBuilder()
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
      bejihkfamje_ = 0L;

      fdhacdblfmn_ = 0;

      mkophddhbld_ = 0;

      inaanmknjbj_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AGJDDKHNIJC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AGJDDKHNIJC getDefaultInstanceForType() {
      return POGOProtos.Rpc.AGJDDKHNIJC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AGJDDKHNIJC build() {
      POGOProtos.Rpc.AGJDDKHNIJC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AGJDDKHNIJC buildPartial() {
      POGOProtos.Rpc.AGJDDKHNIJC result = new POGOProtos.Rpc.AGJDDKHNIJC(this);
      result.bejihkfamje_ = bejihkfamje_;
      result.fdhacdblfmn_ = fdhacdblfmn_;
      result.mkophddhbld_ = mkophddhbld_;
      result.inaanmknjbj_ = inaanmknjbj_;
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
      if (other instanceof POGOProtos.Rpc.AGJDDKHNIJC) {
        return mergeFrom((POGOProtos.Rpc.AGJDDKHNIJC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AGJDDKHNIJC other) {
      if (other == POGOProtos.Rpc.AGJDDKHNIJC.getDefaultInstance()) return this;
      if (other.getBejihkfamje() != 0L) {
        setBejihkfamje(other.getBejihkfamje());
      }
      if (other.fdhacdblfmn_ != 0) {
        setFdhacdblfmnValue(other.getFdhacdblfmnValue());
      }
      if (other.getMkophddhbld() != 0) {
        setMkophddhbld(other.getMkophddhbld());
      }
      if (other.getInaanmknjbj() != 0F) {
        setInaanmknjbj(other.getInaanmknjbj());
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
      POGOProtos.Rpc.AGJDDKHNIJC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AGJDDKHNIJC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long bejihkfamje_ ;
    /**
     * <code>int64 bejihkfamje = 1;</code>
     * @return The bejihkfamje.
     */
    public long getBejihkfamje() {
      return bejihkfamje_;
    }
    /**
     * <code>int64 bejihkfamje = 1;</code>
     * @param value The bejihkfamje to set.
     * @return This builder for chaining.
     */
    public Builder setBejihkfamje(long value) {
      
      bejihkfamje_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 bejihkfamje = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBejihkfamje() {
      
      bejihkfamje_ = 0L;
      onChanged();
      return this;
    }

    private int fdhacdblfmn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @return The enum numeric value on the wire for fdhacdblfmn.
     */
    public int getFdhacdblfmnValue() {
      return fdhacdblfmn_;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param value The enum numeric value on the wire for fdhacdblfmn to set.
     * @return This builder for chaining.
     */
    public Builder setFdhacdblfmnValue(int value) {
      fdhacdblfmn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @return The fdhacdblfmn.
     */
    public POGOProtos.Rpc.DABLMJBNPBD getFdhacdblfmn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(fdhacdblfmn_);
      return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @param value The fdhacdblfmn to set.
     * @return This builder for chaining.
     */
    public Builder setFdhacdblfmn(POGOProtos.Rpc.DABLMJBNPBD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      fdhacdblfmn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD fdhacdblfmn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFdhacdblfmn() {
      
      fdhacdblfmn_ = 0;
      onChanged();
      return this;
    }

    private int mkophddhbld_ ;
    /**
     * <code>int32 mkophddhbld = 3;</code>
     * @return The mkophddhbld.
     */
    public int getMkophddhbld() {
      return mkophddhbld_;
    }
    /**
     * <code>int32 mkophddhbld = 3;</code>
     * @param value The mkophddhbld to set.
     * @return This builder for chaining.
     */
    public Builder setMkophddhbld(int value) {
      
      mkophddhbld_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mkophddhbld = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMkophddhbld() {
      
      mkophddhbld_ = 0;
      onChanged();
      return this;
    }

    private float inaanmknjbj_ ;
    /**
     * <code>float inaanmknjbj = 4;</code>
     * @return The inaanmknjbj.
     */
    public float getInaanmknjbj() {
      return inaanmknjbj_;
    }
    /**
     * <code>float inaanmknjbj = 4;</code>
     * @param value The inaanmknjbj to set.
     * @return This builder for chaining.
     */
    public Builder setInaanmknjbj(float value) {
      
      inaanmknjbj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float inaanmknjbj = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearInaanmknjbj() {
      
      inaanmknjbj_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AGJDDKHNIJC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AGJDDKHNIJC)
  private static final POGOProtos.Rpc.AGJDDKHNIJC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AGJDDKHNIJC();
  }

  public static POGOProtos.Rpc.AGJDDKHNIJC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AGJDDKHNIJC>
      PARSER = new com.google.protobuf.AbstractParser<AGJDDKHNIJC>() {
    @java.lang.Override
    public AGJDDKHNIJC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AGJDDKHNIJC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AGJDDKHNIJC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AGJDDKHNIJC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AGJDDKHNIJC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

