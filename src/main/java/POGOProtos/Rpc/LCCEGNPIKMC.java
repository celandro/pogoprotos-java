// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LCCEGNPIKMC}
 */
public  final class LCCEGNPIKMC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LCCEGNPIKMC)
    LCCEGNPIKMCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LCCEGNPIKMC.newBuilder() to construct.
  private LCCEGNPIKMC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LCCEGNPIKMC() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LCCEGNPIKMC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LCCEGNPIKMC(
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
          case 13: {

            ebeapgfcgjl_ = input.readFloat();
            break;
          }
          case 21: {

            oojcpbmmnee_ = input.readFloat();
            break;
          }
          case 29: {

            ojhpieliicp_ = input.readFloat();
            break;
          }
          case 37: {

            bdjpdedcjcg_ = input.readFloat();
            break;
          }
          case 45: {

            agaadeiicln_ = input.readFloat();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LCCEGNPIKMC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LCCEGNPIKMC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LCCEGNPIKMC.class, POGOProtos.Rpc.LCCEGNPIKMC.Builder.class);
  }

  public static final int EBEAPGFCGJL_FIELD_NUMBER = 1;
  private float ebeapgfcgjl_;
  /**
   * <code>float ebeapgfcgjl = 1;</code>
   * @return The ebeapgfcgjl.
   */
  public float getEbeapgfcgjl() {
    return ebeapgfcgjl_;
  }

  public static final int OOJCPBMMNEE_FIELD_NUMBER = 2;
  private float oojcpbmmnee_;
  /**
   * <code>float oojcpbmmnee = 2;</code>
   * @return The oojcpbmmnee.
   */
  public float getOojcpbmmnee() {
    return oojcpbmmnee_;
  }

  public static final int OJHPIELIICP_FIELD_NUMBER = 3;
  private float ojhpieliicp_;
  /**
   * <code>float ojhpieliicp = 3;</code>
   * @return The ojhpieliicp.
   */
  public float getOjhpieliicp() {
    return ojhpieliicp_;
  }

  public static final int BDJPDEDCJCG_FIELD_NUMBER = 4;
  private float bdjpdedcjcg_;
  /**
   * <code>float bdjpdedcjcg = 4;</code>
   * @return The bdjpdedcjcg.
   */
  public float getBdjpdedcjcg() {
    return bdjpdedcjcg_;
  }

  public static final int AGAADEIICLN_FIELD_NUMBER = 5;
  private float agaadeiicln_;
  /**
   * <code>float agaadeiicln = 5;</code>
   * @return The agaadeiicln.
   */
  public float getAgaadeiicln() {
    return agaadeiicln_;
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
    if (ebeapgfcgjl_ != 0F) {
      output.writeFloat(1, ebeapgfcgjl_);
    }
    if (oojcpbmmnee_ != 0F) {
      output.writeFloat(2, oojcpbmmnee_);
    }
    if (ojhpieliicp_ != 0F) {
      output.writeFloat(3, ojhpieliicp_);
    }
    if (bdjpdedcjcg_ != 0F) {
      output.writeFloat(4, bdjpdedcjcg_);
    }
    if (agaadeiicln_ != 0F) {
      output.writeFloat(5, agaadeiicln_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ebeapgfcgjl_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, ebeapgfcgjl_);
    }
    if (oojcpbmmnee_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, oojcpbmmnee_);
    }
    if (ojhpieliicp_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, ojhpieliicp_);
    }
    if (bdjpdedcjcg_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, bdjpdedcjcg_);
    }
    if (agaadeiicln_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, agaadeiicln_);
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
    if (!(obj instanceof POGOProtos.Rpc.LCCEGNPIKMC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LCCEGNPIKMC other = (POGOProtos.Rpc.LCCEGNPIKMC) obj;

    if (java.lang.Float.floatToIntBits(getEbeapgfcgjl())
        != java.lang.Float.floatToIntBits(
            other.getEbeapgfcgjl())) return false;
    if (java.lang.Float.floatToIntBits(getOojcpbmmnee())
        != java.lang.Float.floatToIntBits(
            other.getOojcpbmmnee())) return false;
    if (java.lang.Float.floatToIntBits(getOjhpieliicp())
        != java.lang.Float.floatToIntBits(
            other.getOjhpieliicp())) return false;
    if (java.lang.Float.floatToIntBits(getBdjpdedcjcg())
        != java.lang.Float.floatToIntBits(
            other.getBdjpdedcjcg())) return false;
    if (java.lang.Float.floatToIntBits(getAgaadeiicln())
        != java.lang.Float.floatToIntBits(
            other.getAgaadeiicln())) return false;
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
    hash = (37 * hash) + EBEAPGFCGJL_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getEbeapgfcgjl());
    hash = (37 * hash) + OOJCPBMMNEE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getOojcpbmmnee());
    hash = (37 * hash) + OJHPIELIICP_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getOjhpieliicp());
    hash = (37 * hash) + BDJPDEDCJCG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBdjpdedcjcg());
    hash = (37 * hash) + AGAADEIICLN_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAgaadeiicln());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LCCEGNPIKMC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LCCEGNPIKMC prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LCCEGNPIKMC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LCCEGNPIKMC)
      POGOProtos.Rpc.LCCEGNPIKMCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LCCEGNPIKMC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LCCEGNPIKMC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LCCEGNPIKMC.class, POGOProtos.Rpc.LCCEGNPIKMC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LCCEGNPIKMC.newBuilder()
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
      ebeapgfcgjl_ = 0F;

      oojcpbmmnee_ = 0F;

      ojhpieliicp_ = 0F;

      bdjpdedcjcg_ = 0F;

      agaadeiicln_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LCCEGNPIKMC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LCCEGNPIKMC getDefaultInstanceForType() {
      return POGOProtos.Rpc.LCCEGNPIKMC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LCCEGNPIKMC build() {
      POGOProtos.Rpc.LCCEGNPIKMC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LCCEGNPIKMC buildPartial() {
      POGOProtos.Rpc.LCCEGNPIKMC result = new POGOProtos.Rpc.LCCEGNPIKMC(this);
      result.ebeapgfcgjl_ = ebeapgfcgjl_;
      result.oojcpbmmnee_ = oojcpbmmnee_;
      result.ojhpieliicp_ = ojhpieliicp_;
      result.bdjpdedcjcg_ = bdjpdedcjcg_;
      result.agaadeiicln_ = agaadeiicln_;
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
      if (other instanceof POGOProtos.Rpc.LCCEGNPIKMC) {
        return mergeFrom((POGOProtos.Rpc.LCCEGNPIKMC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LCCEGNPIKMC other) {
      if (other == POGOProtos.Rpc.LCCEGNPIKMC.getDefaultInstance()) return this;
      if (other.getEbeapgfcgjl() != 0F) {
        setEbeapgfcgjl(other.getEbeapgfcgjl());
      }
      if (other.getOojcpbmmnee() != 0F) {
        setOojcpbmmnee(other.getOojcpbmmnee());
      }
      if (other.getOjhpieliicp() != 0F) {
        setOjhpieliicp(other.getOjhpieliicp());
      }
      if (other.getBdjpdedcjcg() != 0F) {
        setBdjpdedcjcg(other.getBdjpdedcjcg());
      }
      if (other.getAgaadeiicln() != 0F) {
        setAgaadeiicln(other.getAgaadeiicln());
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
      POGOProtos.Rpc.LCCEGNPIKMC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LCCEGNPIKMC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float ebeapgfcgjl_ ;
    /**
     * <code>float ebeapgfcgjl = 1;</code>
     * @return The ebeapgfcgjl.
     */
    public float getEbeapgfcgjl() {
      return ebeapgfcgjl_;
    }
    /**
     * <code>float ebeapgfcgjl = 1;</code>
     * @param value The ebeapgfcgjl to set.
     * @return This builder for chaining.
     */
    public Builder setEbeapgfcgjl(float value) {
      
      ebeapgfcgjl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ebeapgfcgjl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEbeapgfcgjl() {
      
      ebeapgfcgjl_ = 0F;
      onChanged();
      return this;
    }

    private float oojcpbmmnee_ ;
    /**
     * <code>float oojcpbmmnee = 2;</code>
     * @return The oojcpbmmnee.
     */
    public float getOojcpbmmnee() {
      return oojcpbmmnee_;
    }
    /**
     * <code>float oojcpbmmnee = 2;</code>
     * @param value The oojcpbmmnee to set.
     * @return This builder for chaining.
     */
    public Builder setOojcpbmmnee(float value) {
      
      oojcpbmmnee_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float oojcpbmmnee = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOojcpbmmnee() {
      
      oojcpbmmnee_ = 0F;
      onChanged();
      return this;
    }

    private float ojhpieliicp_ ;
    /**
     * <code>float ojhpieliicp = 3;</code>
     * @return The ojhpieliicp.
     */
    public float getOjhpieliicp() {
      return ojhpieliicp_;
    }
    /**
     * <code>float ojhpieliicp = 3;</code>
     * @param value The ojhpieliicp to set.
     * @return This builder for chaining.
     */
    public Builder setOjhpieliicp(float value) {
      
      ojhpieliicp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ojhpieliicp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOjhpieliicp() {
      
      ojhpieliicp_ = 0F;
      onChanged();
      return this;
    }

    private float bdjpdedcjcg_ ;
    /**
     * <code>float bdjpdedcjcg = 4;</code>
     * @return The bdjpdedcjcg.
     */
    public float getBdjpdedcjcg() {
      return bdjpdedcjcg_;
    }
    /**
     * <code>float bdjpdedcjcg = 4;</code>
     * @param value The bdjpdedcjcg to set.
     * @return This builder for chaining.
     */
    public Builder setBdjpdedcjcg(float value) {
      
      bdjpdedcjcg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float bdjpdedcjcg = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBdjpdedcjcg() {
      
      bdjpdedcjcg_ = 0F;
      onChanged();
      return this;
    }

    private float agaadeiicln_ ;
    /**
     * <code>float agaadeiicln = 5;</code>
     * @return The agaadeiicln.
     */
    public float getAgaadeiicln() {
      return agaadeiicln_;
    }
    /**
     * <code>float agaadeiicln = 5;</code>
     * @param value The agaadeiicln to set.
     * @return This builder for chaining.
     */
    public Builder setAgaadeiicln(float value) {
      
      agaadeiicln_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float agaadeiicln = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAgaadeiicln() {
      
      agaadeiicln_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LCCEGNPIKMC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LCCEGNPIKMC)
  private static final POGOProtos.Rpc.LCCEGNPIKMC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LCCEGNPIKMC();
  }

  public static POGOProtos.Rpc.LCCEGNPIKMC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LCCEGNPIKMC>
      PARSER = new com.google.protobuf.AbstractParser<LCCEGNPIKMC>() {
    @java.lang.Override
    public LCCEGNPIKMC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LCCEGNPIKMC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LCCEGNPIKMC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LCCEGNPIKMC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LCCEGNPIKMC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

