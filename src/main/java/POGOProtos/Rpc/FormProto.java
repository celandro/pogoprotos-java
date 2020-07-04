// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FormProto}
 */
public  final class FormProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FormProto)
    FormProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FormProto.newBuilder() to construct.
  private FormProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FormProto() {
    form_ = 0;
    assetBundleSuffix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FormProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FormProto(
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

            form_ = rawValue;
            break;
          }
          case 16: {

            assetBundleValue_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            assetBundleSuffix_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FormProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FormProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FormProto.class, POGOProtos.Rpc.FormProto.Builder.class);
  }

  public static final int FORM_FIELD_NUMBER = 1;
  private int form_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 1;</code>
   * @return The enum numeric value on the wire for form.
   */
  public int getFormValue() {
    return form_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 1;</code>
   * @return The form.
   */
  public POGOProtos.Rpc.PokemonDisplayProto.Form getForm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(form_);
    return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Form.UNRECOGNIZED : result;
  }

  public static final int ASSET_BUNDLE_VALUE_FIELD_NUMBER = 2;
  private int assetBundleValue_;
  /**
   * <code>int32 asset_bundle_value = 2;</code>
   * @return The assetBundleValue.
   */
  public int getAssetBundleValue() {
    return assetBundleValue_;
  }

  public static final int ASSET_BUNDLE_SUFFIX_FIELD_NUMBER = 3;
  private volatile java.lang.Object assetBundleSuffix_;
  /**
   * <code>string asset_bundle_suffix = 3;</code>
   * @return The assetBundleSuffix.
   */
  public java.lang.String getAssetBundleSuffix() {
    java.lang.Object ref = assetBundleSuffix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetBundleSuffix_ = s;
      return s;
    }
  }
  /**
   * <code>string asset_bundle_suffix = 3;</code>
   * @return The bytes for assetBundleSuffix.
   */
  public com.google.protobuf.ByteString
      getAssetBundleSuffixBytes() {
    java.lang.Object ref = assetBundleSuffix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetBundleSuffix_ = b;
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
    if (form_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      output.writeEnum(1, form_);
    }
    if (assetBundleValue_ != 0) {
      output.writeInt32(2, assetBundleValue_);
    }
    if (!getAssetBundleSuffixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, assetBundleSuffix_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (form_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, form_);
    }
    if (assetBundleValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, assetBundleValue_);
    }
    if (!getAssetBundleSuffixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, assetBundleSuffix_);
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
    if (!(obj instanceof POGOProtos.Rpc.FormProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FormProto other = (POGOProtos.Rpc.FormProto) obj;

    if (form_ != other.form_) return false;
    if (getAssetBundleValue()
        != other.getAssetBundleValue()) return false;
    if (!getAssetBundleSuffix()
        .equals(other.getAssetBundleSuffix())) return false;
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
    hash = (37 * hash) + FORM_FIELD_NUMBER;
    hash = (53 * hash) + form_;
    hash = (37 * hash) + ASSET_BUNDLE_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getAssetBundleValue();
    hash = (37 * hash) + ASSET_BUNDLE_SUFFIX_FIELD_NUMBER;
    hash = (53 * hash) + getAssetBundleSuffix().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FormProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FormProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FormProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FormProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FormProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FormProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FormProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FormProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FormProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FormProto)
      POGOProtos.Rpc.FormProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FormProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FormProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FormProto.class, POGOProtos.Rpc.FormProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FormProto.newBuilder()
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
      form_ = 0;

      assetBundleValue_ = 0;

      assetBundleSuffix_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FormProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FormProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.FormProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FormProto build() {
      POGOProtos.Rpc.FormProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FormProto buildPartial() {
      POGOProtos.Rpc.FormProto result = new POGOProtos.Rpc.FormProto(this);
      result.form_ = form_;
      result.assetBundleValue_ = assetBundleValue_;
      result.assetBundleSuffix_ = assetBundleSuffix_;
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
      if (other instanceof POGOProtos.Rpc.FormProto) {
        return mergeFrom((POGOProtos.Rpc.FormProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FormProto other) {
      if (other == POGOProtos.Rpc.FormProto.getDefaultInstance()) return this;
      if (other.form_ != 0) {
        setFormValue(other.getFormValue());
      }
      if (other.getAssetBundleValue() != 0) {
        setAssetBundleValue(other.getAssetBundleValue());
      }
      if (!other.getAssetBundleSuffix().isEmpty()) {
        assetBundleSuffix_ = other.assetBundleSuffix_;
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
      POGOProtos.Rpc.FormProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FormProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int form_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 1;</code>
     * @return The enum numeric value on the wire for form.
     */
    public int getFormValue() {
      return form_;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 1;</code>
     * @param value The enum numeric value on the wire for form to set.
     * @return This builder for chaining.
     */
    public Builder setFormValue(int value) {
      form_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 1;</code>
     * @return The form.
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Form getForm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(form_);
      return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Form.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 1;</code>
     * @param value The form to set.
     * @return This builder for chaining.
     */
    public Builder setForm(POGOProtos.Rpc.PokemonDisplayProto.Form value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      form_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearForm() {
      
      form_ = 0;
      onChanged();
      return this;
    }

    private int assetBundleValue_ ;
    /**
     * <code>int32 asset_bundle_value = 2;</code>
     * @return The assetBundleValue.
     */
    public int getAssetBundleValue() {
      return assetBundleValue_;
    }
    /**
     * <code>int32 asset_bundle_value = 2;</code>
     * @param value The assetBundleValue to set.
     * @return This builder for chaining.
     */
    public Builder setAssetBundleValue(int value) {
      
      assetBundleValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 asset_bundle_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetBundleValue() {
      
      assetBundleValue_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object assetBundleSuffix_ = "";
    /**
     * <code>string asset_bundle_suffix = 3;</code>
     * @return The assetBundleSuffix.
     */
    public java.lang.String getAssetBundleSuffix() {
      java.lang.Object ref = assetBundleSuffix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetBundleSuffix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string asset_bundle_suffix = 3;</code>
     * @return The bytes for assetBundleSuffix.
     */
    public com.google.protobuf.ByteString
        getAssetBundleSuffixBytes() {
      java.lang.Object ref = assetBundleSuffix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetBundleSuffix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string asset_bundle_suffix = 3;</code>
     * @param value The assetBundleSuffix to set.
     * @return This builder for chaining.
     */
    public Builder setAssetBundleSuffix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assetBundleSuffix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string asset_bundle_suffix = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetBundleSuffix() {
      
      assetBundleSuffix_ = getDefaultInstance().getAssetBundleSuffix();
      onChanged();
      return this;
    }
    /**
     * <code>string asset_bundle_suffix = 3;</code>
     * @param value The bytes for assetBundleSuffix to set.
     * @return This builder for chaining.
     */
    public Builder setAssetBundleSuffixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assetBundleSuffix_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FormProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FormProto)
  private static final POGOProtos.Rpc.FormProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FormProto();
  }

  public static POGOProtos.Rpc.FormProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FormProto>
      PARSER = new com.google.protobuf.AbstractParser<FormProto>() {
    @java.lang.Override
    public FormProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FormProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FormProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FormProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FormProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
