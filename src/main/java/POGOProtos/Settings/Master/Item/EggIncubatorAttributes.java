// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Item/EggIncubatorAttributes.proto

package POGOProtos.Settings.Master.Item;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.Item.EggIncubatorAttributes}
 */
public final class EggIncubatorAttributes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.Item.EggIncubatorAttributes)
    EggIncubatorAttributesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EggIncubatorAttributes.newBuilder() to construct.
  private EggIncubatorAttributes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EggIncubatorAttributes() {
    incubatorType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EggIncubatorAttributes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EggIncubatorAttributes(
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

            incubatorType_ = rawValue;
            break;
          }
          case 16: {

            uses_ = input.readInt32();
            break;
          }
          case 29: {

            distanceMultiplier_ = input.readFloat();
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
    return POGOProtos.Settings.Master.Item.EggIncubatorAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_EggIncubatorAttributes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.Item.EggIncubatorAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_EggIncubatorAttributes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.Item.EggIncubatorAttributes.class, POGOProtos.Settings.Master.Item.EggIncubatorAttributes.Builder.class);
  }

  public static final int INCUBATOR_TYPE_FIELD_NUMBER = 1;
  private int incubatorType_;
  /**
   * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 1;</code>
   * @return The enum numeric value on the wire for incubatorType.
   */
  @java.lang.Override public int getIncubatorTypeValue() {
    return incubatorType_;
  }
  /**
   * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 1;</code>
   * @return The incubatorType.
   */
  @java.lang.Override public POGOProtos.Inventory.EggIncubatorType getIncubatorType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Inventory.EggIncubatorType result = POGOProtos.Inventory.EggIncubatorType.valueOf(incubatorType_);
    return result == null ? POGOProtos.Inventory.EggIncubatorType.UNRECOGNIZED : result;
  }

  public static final int USES_FIELD_NUMBER = 2;
  private int uses_;
  /**
   * <code>int32 uses = 2;</code>
   * @return The uses.
   */
  @java.lang.Override
  public int getUses() {
    return uses_;
  }

  public static final int DISTANCE_MULTIPLIER_FIELD_NUMBER = 3;
  private float distanceMultiplier_;
  /**
   * <code>float distance_multiplier = 3;</code>
   * @return The distanceMultiplier.
   */
  @java.lang.Override
  public float getDistanceMultiplier() {
    return distanceMultiplier_;
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
    if (incubatorType_ != POGOProtos.Inventory.EggIncubatorType.INCUBATOR_UNSET.getNumber()) {
      output.writeEnum(1, incubatorType_);
    }
    if (uses_ != 0) {
      output.writeInt32(2, uses_);
    }
    if (distanceMultiplier_ != 0F) {
      output.writeFloat(3, distanceMultiplier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (incubatorType_ != POGOProtos.Inventory.EggIncubatorType.INCUBATOR_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, incubatorType_);
    }
    if (uses_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, uses_);
    }
    if (distanceMultiplier_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, distanceMultiplier_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.Item.EggIncubatorAttributes)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.Item.EggIncubatorAttributes other = (POGOProtos.Settings.Master.Item.EggIncubatorAttributes) obj;

    if (incubatorType_ != other.incubatorType_) return false;
    if (getUses()
        != other.getUses()) return false;
    if (java.lang.Float.floatToIntBits(getDistanceMultiplier())
        != java.lang.Float.floatToIntBits(
            other.getDistanceMultiplier())) return false;
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
    hash = (37 * hash) + INCUBATOR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + incubatorType_;
    hash = (37 * hash) + USES_FIELD_NUMBER;
    hash = (53 * hash) + getUses();
    hash = (37 * hash) + DISTANCE_MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDistanceMultiplier());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.Item.EggIncubatorAttributes prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.Item.EggIncubatorAttributes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.Item.EggIncubatorAttributes)
      POGOProtos.Settings.Master.Item.EggIncubatorAttributesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.Item.EggIncubatorAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_EggIncubatorAttributes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.Item.EggIncubatorAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_EggIncubatorAttributes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.Item.EggIncubatorAttributes.class, POGOProtos.Settings.Master.Item.EggIncubatorAttributes.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.Item.EggIncubatorAttributes.newBuilder()
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
      incubatorType_ = 0;

      uses_ = 0;

      distanceMultiplier_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.Item.EggIncubatorAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_EggIncubatorAttributes_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.EggIncubatorAttributes getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.Item.EggIncubatorAttributes.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.EggIncubatorAttributes build() {
      POGOProtos.Settings.Master.Item.EggIncubatorAttributes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.EggIncubatorAttributes buildPartial() {
      POGOProtos.Settings.Master.Item.EggIncubatorAttributes result = new POGOProtos.Settings.Master.Item.EggIncubatorAttributes(this);
      result.incubatorType_ = incubatorType_;
      result.uses_ = uses_;
      result.distanceMultiplier_ = distanceMultiplier_;
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
      if (other instanceof POGOProtos.Settings.Master.Item.EggIncubatorAttributes) {
        return mergeFrom((POGOProtos.Settings.Master.Item.EggIncubatorAttributes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.Item.EggIncubatorAttributes other) {
      if (other == POGOProtos.Settings.Master.Item.EggIncubatorAttributes.getDefaultInstance()) return this;
      if (other.incubatorType_ != 0) {
        setIncubatorTypeValue(other.getIncubatorTypeValue());
      }
      if (other.getUses() != 0) {
        setUses(other.getUses());
      }
      if (other.getDistanceMultiplier() != 0F) {
        setDistanceMultiplier(other.getDistanceMultiplier());
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
      POGOProtos.Settings.Master.Item.EggIncubatorAttributes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.Item.EggIncubatorAttributes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int incubatorType_ = 0;
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 1;</code>
     * @return The enum numeric value on the wire for incubatorType.
     */
    @java.lang.Override public int getIncubatorTypeValue() {
      return incubatorType_;
    }
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 1;</code>
     * @param value The enum numeric value on the wire for incubatorType to set.
     * @return This builder for chaining.
     */
    public Builder setIncubatorTypeValue(int value) {
      
      incubatorType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 1;</code>
     * @return The incubatorType.
     */
    @java.lang.Override
    public POGOProtos.Inventory.EggIncubatorType getIncubatorType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Inventory.EggIncubatorType result = POGOProtos.Inventory.EggIncubatorType.valueOf(incubatorType_);
      return result == null ? POGOProtos.Inventory.EggIncubatorType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 1;</code>
     * @param value The incubatorType to set.
     * @return This builder for chaining.
     */
    public Builder setIncubatorType(POGOProtos.Inventory.EggIncubatorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      incubatorType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncubatorType() {
      
      incubatorType_ = 0;
      onChanged();
      return this;
    }

    private int uses_ ;
    /**
     * <code>int32 uses = 2;</code>
     * @return The uses.
     */
    @java.lang.Override
    public int getUses() {
      return uses_;
    }
    /**
     * <code>int32 uses = 2;</code>
     * @param value The uses to set.
     * @return This builder for chaining.
     */
    public Builder setUses(int value) {
      
      uses_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 uses = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUses() {
      
      uses_ = 0;
      onChanged();
      return this;
    }

    private float distanceMultiplier_ ;
    /**
     * <code>float distance_multiplier = 3;</code>
     * @return The distanceMultiplier.
     */
    @java.lang.Override
    public float getDistanceMultiplier() {
      return distanceMultiplier_;
    }
    /**
     * <code>float distance_multiplier = 3;</code>
     * @param value The distanceMultiplier to set.
     * @return This builder for chaining.
     */
    public Builder setDistanceMultiplier(float value) {
      
      distanceMultiplier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float distance_multiplier = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDistanceMultiplier() {
      
      distanceMultiplier_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.Item.EggIncubatorAttributes)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.Item.EggIncubatorAttributes)
  private static final POGOProtos.Settings.Master.Item.EggIncubatorAttributes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.Item.EggIncubatorAttributes();
  }

  public static POGOProtos.Settings.Master.Item.EggIncubatorAttributes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EggIncubatorAttributes>
      PARSER = new com.google.protobuf.AbstractParser<EggIncubatorAttributes>() {
    @java.lang.Override
    public EggIncubatorAttributes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EggIncubatorAttributes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EggIncubatorAttributes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EggIncubatorAttributes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.Item.EggIncubatorAttributes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

