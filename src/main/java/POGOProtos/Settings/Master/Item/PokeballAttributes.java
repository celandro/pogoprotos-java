// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Item/PokeballAttributes.proto

package POGOProtos.Settings.Master.Item;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.Item.PokeballAttributes}
 */
public final class PokeballAttributes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.Item.PokeballAttributes)
    PokeballAttributesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokeballAttributes.newBuilder() to construct.
  private PokeballAttributes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokeballAttributes() {
    itemEffect_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokeballAttributes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokeballAttributes(
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

            itemEffect_ = rawValue;
            break;
          }
          case 21: {

            captureMulti_ = input.readFloat();
            break;
          }
          case 29: {

            captureMultiEffect_ = input.readFloat();
            break;
          }
          case 37: {

            itemEffectMod_ = input.readFloat();
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
    return POGOProtos.Settings.Master.Item.PokeballAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_PokeballAttributes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.Item.PokeballAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_PokeballAttributes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.Item.PokeballAttributes.class, POGOProtos.Settings.Master.Item.PokeballAttributes.Builder.class);
  }

  public static final int ITEM_EFFECT_FIELD_NUMBER = 1;
  private int itemEffect_;
  /**
   * <code>.POGOProtos.Enums.ItemEffect item_effect = 1;</code>
   * @return The enum numeric value on the wire for itemEffect.
   */
  @java.lang.Override public int getItemEffectValue() {
    return itemEffect_;
  }
  /**
   * <code>.POGOProtos.Enums.ItemEffect item_effect = 1;</code>
   * @return The itemEffect.
   */
  @java.lang.Override public POGOProtos.Enums.ItemEffect getItemEffect() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.ItemEffect result = POGOProtos.Enums.ItemEffect.valueOf(itemEffect_);
    return result == null ? POGOProtos.Enums.ItemEffect.UNRECOGNIZED : result;
  }

  public static final int CAPTURE_MULTI_FIELD_NUMBER = 2;
  private float captureMulti_;
  /**
   * <code>float capture_multi = 2;</code>
   * @return The captureMulti.
   */
  @java.lang.Override
  public float getCaptureMulti() {
    return captureMulti_;
  }

  public static final int CAPTURE_MULTI_EFFECT_FIELD_NUMBER = 3;
  private float captureMultiEffect_;
  /**
   * <code>float capture_multi_effect = 3;</code>
   * @return The captureMultiEffect.
   */
  @java.lang.Override
  public float getCaptureMultiEffect() {
    return captureMultiEffect_;
  }

  public static final int ITEM_EFFECT_MOD_FIELD_NUMBER = 4;
  private float itemEffectMod_;
  /**
   * <code>float item_effect_mod = 4;</code>
   * @return The itemEffectMod.
   */
  @java.lang.Override
  public float getItemEffectMod() {
    return itemEffectMod_;
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
    if (itemEffect_ != POGOProtos.Enums.ItemEffect.ITEM_EFFECT_NONE.getNumber()) {
      output.writeEnum(1, itemEffect_);
    }
    if (captureMulti_ != 0F) {
      output.writeFloat(2, captureMulti_);
    }
    if (captureMultiEffect_ != 0F) {
      output.writeFloat(3, captureMultiEffect_);
    }
    if (itemEffectMod_ != 0F) {
      output.writeFloat(4, itemEffectMod_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (itemEffect_ != POGOProtos.Enums.ItemEffect.ITEM_EFFECT_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, itemEffect_);
    }
    if (captureMulti_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, captureMulti_);
    }
    if (captureMultiEffect_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, captureMultiEffect_);
    }
    if (itemEffectMod_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, itemEffectMod_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.Item.PokeballAttributes)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.Item.PokeballAttributes other = (POGOProtos.Settings.Master.Item.PokeballAttributes) obj;

    if (itemEffect_ != other.itemEffect_) return false;
    if (java.lang.Float.floatToIntBits(getCaptureMulti())
        != java.lang.Float.floatToIntBits(
            other.getCaptureMulti())) return false;
    if (java.lang.Float.floatToIntBits(getCaptureMultiEffect())
        != java.lang.Float.floatToIntBits(
            other.getCaptureMultiEffect())) return false;
    if (java.lang.Float.floatToIntBits(getItemEffectMod())
        != java.lang.Float.floatToIntBits(
            other.getItemEffectMod())) return false;
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
    hash = (37 * hash) + ITEM_EFFECT_FIELD_NUMBER;
    hash = (53 * hash) + itemEffect_;
    hash = (37 * hash) + CAPTURE_MULTI_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCaptureMulti());
    hash = (37 * hash) + CAPTURE_MULTI_EFFECT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCaptureMultiEffect());
    hash = (37 * hash) + ITEM_EFFECT_MOD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getItemEffectMod());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.PokeballAttributes parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.Item.PokeballAttributes prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.Item.PokeballAttributes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.Item.PokeballAttributes)
      POGOProtos.Settings.Master.Item.PokeballAttributesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.Item.PokeballAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_PokeballAttributes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.Item.PokeballAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_PokeballAttributes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.Item.PokeballAttributes.class, POGOProtos.Settings.Master.Item.PokeballAttributes.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.Item.PokeballAttributes.newBuilder()
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
      itemEffect_ = 0;

      captureMulti_ = 0F;

      captureMultiEffect_ = 0F;

      itemEffectMod_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.Item.PokeballAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_PokeballAttributes_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.PokeballAttributes getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.Item.PokeballAttributes.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.PokeballAttributes build() {
      POGOProtos.Settings.Master.Item.PokeballAttributes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.PokeballAttributes buildPartial() {
      POGOProtos.Settings.Master.Item.PokeballAttributes result = new POGOProtos.Settings.Master.Item.PokeballAttributes(this);
      result.itemEffect_ = itemEffect_;
      result.captureMulti_ = captureMulti_;
      result.captureMultiEffect_ = captureMultiEffect_;
      result.itemEffectMod_ = itemEffectMod_;
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
      if (other instanceof POGOProtos.Settings.Master.Item.PokeballAttributes) {
        return mergeFrom((POGOProtos.Settings.Master.Item.PokeballAttributes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.Item.PokeballAttributes other) {
      if (other == POGOProtos.Settings.Master.Item.PokeballAttributes.getDefaultInstance()) return this;
      if (other.itemEffect_ != 0) {
        setItemEffectValue(other.getItemEffectValue());
      }
      if (other.getCaptureMulti() != 0F) {
        setCaptureMulti(other.getCaptureMulti());
      }
      if (other.getCaptureMultiEffect() != 0F) {
        setCaptureMultiEffect(other.getCaptureMultiEffect());
      }
      if (other.getItemEffectMod() != 0F) {
        setItemEffectMod(other.getItemEffectMod());
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
      POGOProtos.Settings.Master.Item.PokeballAttributes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.Item.PokeballAttributes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int itemEffect_ = 0;
    /**
     * <code>.POGOProtos.Enums.ItemEffect item_effect = 1;</code>
     * @return The enum numeric value on the wire for itemEffect.
     */
    @java.lang.Override public int getItemEffectValue() {
      return itemEffect_;
    }
    /**
     * <code>.POGOProtos.Enums.ItemEffect item_effect = 1;</code>
     * @param value The enum numeric value on the wire for itemEffect to set.
     * @return This builder for chaining.
     */
    public Builder setItemEffectValue(int value) {
      
      itemEffect_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.ItemEffect item_effect = 1;</code>
     * @return The itemEffect.
     */
    @java.lang.Override
    public POGOProtos.Enums.ItemEffect getItemEffect() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.ItemEffect result = POGOProtos.Enums.ItemEffect.valueOf(itemEffect_);
      return result == null ? POGOProtos.Enums.ItemEffect.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.ItemEffect item_effect = 1;</code>
     * @param value The itemEffect to set.
     * @return This builder for chaining.
     */
    public Builder setItemEffect(POGOProtos.Enums.ItemEffect value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      itemEffect_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.ItemEffect item_effect = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemEffect() {
      
      itemEffect_ = 0;
      onChanged();
      return this;
    }

    private float captureMulti_ ;
    /**
     * <code>float capture_multi = 2;</code>
     * @return The captureMulti.
     */
    @java.lang.Override
    public float getCaptureMulti() {
      return captureMulti_;
    }
    /**
     * <code>float capture_multi = 2;</code>
     * @param value The captureMulti to set.
     * @return This builder for chaining.
     */
    public Builder setCaptureMulti(float value) {
      
      captureMulti_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float capture_multi = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCaptureMulti() {
      
      captureMulti_ = 0F;
      onChanged();
      return this;
    }

    private float captureMultiEffect_ ;
    /**
     * <code>float capture_multi_effect = 3;</code>
     * @return The captureMultiEffect.
     */
    @java.lang.Override
    public float getCaptureMultiEffect() {
      return captureMultiEffect_;
    }
    /**
     * <code>float capture_multi_effect = 3;</code>
     * @param value The captureMultiEffect to set.
     * @return This builder for chaining.
     */
    public Builder setCaptureMultiEffect(float value) {
      
      captureMultiEffect_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float capture_multi_effect = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCaptureMultiEffect() {
      
      captureMultiEffect_ = 0F;
      onChanged();
      return this;
    }

    private float itemEffectMod_ ;
    /**
     * <code>float item_effect_mod = 4;</code>
     * @return The itemEffectMod.
     */
    @java.lang.Override
    public float getItemEffectMod() {
      return itemEffectMod_;
    }
    /**
     * <code>float item_effect_mod = 4;</code>
     * @param value The itemEffectMod to set.
     * @return This builder for chaining.
     */
    public Builder setItemEffectMod(float value) {
      
      itemEffectMod_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float item_effect_mod = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemEffectMod() {
      
      itemEffectMod_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.Item.PokeballAttributes)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.Item.PokeballAttributes)
  private static final POGOProtos.Settings.Master.Item.PokeballAttributes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.Item.PokeballAttributes();
  }

  public static POGOProtos.Settings.Master.Item.PokeballAttributes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokeballAttributes>
      PARSER = new com.google.protobuf.AbstractParser<PokeballAttributes>() {
    @java.lang.Override
    public PokeballAttributes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokeballAttributes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokeballAttributes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokeballAttributes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.Item.PokeballAttributes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

