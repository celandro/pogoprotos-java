// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ECDCICLMBOC}
 */
public  final class ECDCICLMBOC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ECDCICLMBOC)
    ECDCICLMBOCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ECDCICLMBOC.newBuilder() to construct.
  private ECDCICLMBOC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ECDCICLMBOC() {
    opiapbcehbm_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ECDCICLMBOC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ECDCICLMBOC(
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

            opiapbcehbm_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.HECPNNENEJK.Builder subBuilder = null;
            if (hobpljiejfl_ != null) {
              subBuilder = hobpljiejfl_.toBuilder();
            }
            hobpljiejfl_ = input.readMessage(POGOProtos.Rpc.HECPNNENEJK.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hobpljiejfl_);
              hobpljiejfl_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            mbflapjfhce_ = input.readUInt64();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ECDCICLMBOC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ECDCICLMBOC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ECDCICLMBOC.class, POGOProtos.Rpc.ECDCICLMBOC.Builder.class);
  }

  public static final int OPIAPBCEHBM_FIELD_NUMBER = 1;
  private int opiapbcehbm_;
  /**
   * <code>.POGOProtos.Rpc.DABLMJBNPBD opiapbcehbm = 1;</code>
   * @return The enum numeric value on the wire for opiapbcehbm.
   */
  public int getOpiapbcehbmValue() {
    return opiapbcehbm_;
  }
  /**
   * <code>.POGOProtos.Rpc.DABLMJBNPBD opiapbcehbm = 1;</code>
   * @return The opiapbcehbm.
   */
  public POGOProtos.Rpc.DABLMJBNPBD getOpiapbcehbm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(opiapbcehbm_);
    return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
  }

  public static final int HOBPLJIEJFL_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.HECPNNENEJK hobpljiejfl_;
  /**
   * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
   * @return Whether the hobpljiejfl field is set.
   */
  public boolean hasHobpljiejfl() {
    return hobpljiejfl_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
   * @return The hobpljiejfl.
   */
  public POGOProtos.Rpc.HECPNNENEJK getHobpljiejfl() {
    return hobpljiejfl_ == null ? POGOProtos.Rpc.HECPNNENEJK.getDefaultInstance() : hobpljiejfl_;
  }
  /**
   * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
   */
  public POGOProtos.Rpc.HECPNNENEJKOrBuilder getHobpljiejflOrBuilder() {
    return getHobpljiejfl();
  }

  public static final int MBFLAPJFHCE_FIELD_NUMBER = 3;
  private long mbflapjfhce_;
  /**
   * <code>uint64 mbflapjfhce = 3;</code>
   * @return The mbflapjfhce.
   */
  public long getMbflapjfhce() {
    return mbflapjfhce_;
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
    if (opiapbcehbm_ != POGOProtos.Rpc.DABLMJBNPBD.DABLMJBNPBD_POKEMON_UNSET.getNumber()) {
      output.writeEnum(1, opiapbcehbm_);
    }
    if (hobpljiejfl_ != null) {
      output.writeMessage(2, getHobpljiejfl());
    }
    if (mbflapjfhce_ != 0L) {
      output.writeUInt64(3, mbflapjfhce_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (opiapbcehbm_ != POGOProtos.Rpc.DABLMJBNPBD.DABLMJBNPBD_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, opiapbcehbm_);
    }
    if (hobpljiejfl_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHobpljiejfl());
    }
    if (mbflapjfhce_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, mbflapjfhce_);
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
    if (!(obj instanceof POGOProtos.Rpc.ECDCICLMBOC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ECDCICLMBOC other = (POGOProtos.Rpc.ECDCICLMBOC) obj;

    if (opiapbcehbm_ != other.opiapbcehbm_) return false;
    if (hasHobpljiejfl() != other.hasHobpljiejfl()) return false;
    if (hasHobpljiejfl()) {
      if (!getHobpljiejfl()
          .equals(other.getHobpljiejfl())) return false;
    }
    if (getMbflapjfhce()
        != other.getMbflapjfhce()) return false;
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
    hash = (37 * hash) + OPIAPBCEHBM_FIELD_NUMBER;
    hash = (53 * hash) + opiapbcehbm_;
    if (hasHobpljiejfl()) {
      hash = (37 * hash) + HOBPLJIEJFL_FIELD_NUMBER;
      hash = (53 * hash) + getHobpljiejfl().hashCode();
    }
    hash = (37 * hash) + MBFLAPJFHCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMbflapjfhce());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ECDCICLMBOC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ECDCICLMBOC prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ECDCICLMBOC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ECDCICLMBOC)
      POGOProtos.Rpc.ECDCICLMBOCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ECDCICLMBOC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ECDCICLMBOC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ECDCICLMBOC.class, POGOProtos.Rpc.ECDCICLMBOC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ECDCICLMBOC.newBuilder()
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
      opiapbcehbm_ = 0;

      if (hobpljiejflBuilder_ == null) {
        hobpljiejfl_ = null;
      } else {
        hobpljiejfl_ = null;
        hobpljiejflBuilder_ = null;
      }
      mbflapjfhce_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ECDCICLMBOC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ECDCICLMBOC getDefaultInstanceForType() {
      return POGOProtos.Rpc.ECDCICLMBOC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ECDCICLMBOC build() {
      POGOProtos.Rpc.ECDCICLMBOC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ECDCICLMBOC buildPartial() {
      POGOProtos.Rpc.ECDCICLMBOC result = new POGOProtos.Rpc.ECDCICLMBOC(this);
      result.opiapbcehbm_ = opiapbcehbm_;
      if (hobpljiejflBuilder_ == null) {
        result.hobpljiejfl_ = hobpljiejfl_;
      } else {
        result.hobpljiejfl_ = hobpljiejflBuilder_.build();
      }
      result.mbflapjfhce_ = mbflapjfhce_;
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
      if (other instanceof POGOProtos.Rpc.ECDCICLMBOC) {
        return mergeFrom((POGOProtos.Rpc.ECDCICLMBOC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ECDCICLMBOC other) {
      if (other == POGOProtos.Rpc.ECDCICLMBOC.getDefaultInstance()) return this;
      if (other.opiapbcehbm_ != 0) {
        setOpiapbcehbmValue(other.getOpiapbcehbmValue());
      }
      if (other.hasHobpljiejfl()) {
        mergeHobpljiejfl(other.getHobpljiejfl());
      }
      if (other.getMbflapjfhce() != 0L) {
        setMbflapjfhce(other.getMbflapjfhce());
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
      POGOProtos.Rpc.ECDCICLMBOC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ECDCICLMBOC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int opiapbcehbm_ = 0;
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD opiapbcehbm = 1;</code>
     * @return The enum numeric value on the wire for opiapbcehbm.
     */
    public int getOpiapbcehbmValue() {
      return opiapbcehbm_;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD opiapbcehbm = 1;</code>
     * @param value The enum numeric value on the wire for opiapbcehbm to set.
     * @return This builder for chaining.
     */
    public Builder setOpiapbcehbmValue(int value) {
      opiapbcehbm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD opiapbcehbm = 1;</code>
     * @return The opiapbcehbm.
     */
    public POGOProtos.Rpc.DABLMJBNPBD getOpiapbcehbm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DABLMJBNPBD result = POGOProtos.Rpc.DABLMJBNPBD.valueOf(opiapbcehbm_);
      return result == null ? POGOProtos.Rpc.DABLMJBNPBD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD opiapbcehbm = 1;</code>
     * @param value The opiapbcehbm to set.
     * @return This builder for chaining.
     */
    public Builder setOpiapbcehbm(POGOProtos.Rpc.DABLMJBNPBD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      opiapbcehbm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DABLMJBNPBD opiapbcehbm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpiapbcehbm() {
      
      opiapbcehbm_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.HECPNNENEJK hobpljiejfl_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HECPNNENEJK, POGOProtos.Rpc.HECPNNENEJK.Builder, POGOProtos.Rpc.HECPNNENEJKOrBuilder> hobpljiejflBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
     * @return Whether the hobpljiejfl field is set.
     */
    public boolean hasHobpljiejfl() {
      return hobpljiejflBuilder_ != null || hobpljiejfl_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
     * @return The hobpljiejfl.
     */
    public POGOProtos.Rpc.HECPNNENEJK getHobpljiejfl() {
      if (hobpljiejflBuilder_ == null) {
        return hobpljiejfl_ == null ? POGOProtos.Rpc.HECPNNENEJK.getDefaultInstance() : hobpljiejfl_;
      } else {
        return hobpljiejflBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
     */
    public Builder setHobpljiejfl(POGOProtos.Rpc.HECPNNENEJK value) {
      if (hobpljiejflBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hobpljiejfl_ = value;
        onChanged();
      } else {
        hobpljiejflBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
     */
    public Builder setHobpljiejfl(
        POGOProtos.Rpc.HECPNNENEJK.Builder builderForValue) {
      if (hobpljiejflBuilder_ == null) {
        hobpljiejfl_ = builderForValue.build();
        onChanged();
      } else {
        hobpljiejflBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
     */
    public Builder mergeHobpljiejfl(POGOProtos.Rpc.HECPNNENEJK value) {
      if (hobpljiejflBuilder_ == null) {
        if (hobpljiejfl_ != null) {
          hobpljiejfl_ =
            POGOProtos.Rpc.HECPNNENEJK.newBuilder(hobpljiejfl_).mergeFrom(value).buildPartial();
        } else {
          hobpljiejfl_ = value;
        }
        onChanged();
      } else {
        hobpljiejflBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
     */
    public Builder clearHobpljiejfl() {
      if (hobpljiejflBuilder_ == null) {
        hobpljiejfl_ = null;
        onChanged();
      } else {
        hobpljiejfl_ = null;
        hobpljiejflBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
     */
    public POGOProtos.Rpc.HECPNNENEJK.Builder getHobpljiejflBuilder() {
      
      onChanged();
      return getHobpljiejflFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
     */
    public POGOProtos.Rpc.HECPNNENEJKOrBuilder getHobpljiejflOrBuilder() {
      if (hobpljiejflBuilder_ != null) {
        return hobpljiejflBuilder_.getMessageOrBuilder();
      } else {
        return hobpljiejfl_ == null ?
            POGOProtos.Rpc.HECPNNENEJK.getDefaultInstance() : hobpljiejfl_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HECPNNENEJK hobpljiejfl = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HECPNNENEJK, POGOProtos.Rpc.HECPNNENEJK.Builder, POGOProtos.Rpc.HECPNNENEJKOrBuilder> 
        getHobpljiejflFieldBuilder() {
      if (hobpljiejflBuilder_ == null) {
        hobpljiejflBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HECPNNENEJK, POGOProtos.Rpc.HECPNNENEJK.Builder, POGOProtos.Rpc.HECPNNENEJKOrBuilder>(
                getHobpljiejfl(),
                getParentForChildren(),
                isClean());
        hobpljiejfl_ = null;
      }
      return hobpljiejflBuilder_;
    }

    private long mbflapjfhce_ ;
    /**
     * <code>uint64 mbflapjfhce = 3;</code>
     * @return The mbflapjfhce.
     */
    public long getMbflapjfhce() {
      return mbflapjfhce_;
    }
    /**
     * <code>uint64 mbflapjfhce = 3;</code>
     * @param value The mbflapjfhce to set.
     * @return This builder for chaining.
     */
    public Builder setMbflapjfhce(long value) {
      
      mbflapjfhce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 mbflapjfhce = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMbflapjfhce() {
      
      mbflapjfhce_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ECDCICLMBOC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ECDCICLMBOC)
  private static final POGOProtos.Rpc.ECDCICLMBOC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ECDCICLMBOC();
  }

  public static POGOProtos.Rpc.ECDCICLMBOC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ECDCICLMBOC>
      PARSER = new com.google.protobuf.AbstractParser<ECDCICLMBOC>() {
    @java.lang.Override
    public ECDCICLMBOC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ECDCICLMBOC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ECDCICLMBOC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ECDCICLMBOC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ECDCICLMBOC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

