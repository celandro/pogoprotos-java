// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Pokemon/CameraAttributes.proto

package POGOProtos.Settings.Master.Pokemon;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.Pokemon.CameraAttributes}
 */
public final class CameraAttributes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.Pokemon.CameraAttributes)
    CameraAttributesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CameraAttributes.newBuilder() to construct.
  private CameraAttributes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CameraAttributes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CameraAttributes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CameraAttributes(
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

            diskRadiusM_ = input.readFloat();
            break;
          }
          case 21: {

            cylinderRadiusM_ = input.readFloat();
            break;
          }
          case 29: {

            cylinderHeightM_ = input.readFloat();
            break;
          }
          case 37: {

            cylinderGroundM_ = input.readFloat();
            break;
          }
          case 45: {

            shoulderModeScale_ = input.readFloat();
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
    return POGOProtos.Settings.Master.Pokemon.CameraAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_CameraAttributes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.Pokemon.CameraAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_CameraAttributes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.Pokemon.CameraAttributes.class, POGOProtos.Settings.Master.Pokemon.CameraAttributes.Builder.class);
  }

  public static final int DISK_RADIUS_M_FIELD_NUMBER = 1;
  private float diskRadiusM_;
  /**
   * <code>float disk_radius_m = 1;</code>
   * @return The diskRadiusM.
   */
  @java.lang.Override
  public float getDiskRadiusM() {
    return diskRadiusM_;
  }

  public static final int CYLINDER_RADIUS_M_FIELD_NUMBER = 2;
  private float cylinderRadiusM_;
  /**
   * <code>float cylinder_radius_m = 2;</code>
   * @return The cylinderRadiusM.
   */
  @java.lang.Override
  public float getCylinderRadiusM() {
    return cylinderRadiusM_;
  }

  public static final int CYLINDER_HEIGHT_M_FIELD_NUMBER = 3;
  private float cylinderHeightM_;
  /**
   * <code>float cylinder_height_m = 3;</code>
   * @return The cylinderHeightM.
   */
  @java.lang.Override
  public float getCylinderHeightM() {
    return cylinderHeightM_;
  }

  public static final int CYLINDER_GROUND_M_FIELD_NUMBER = 4;
  private float cylinderGroundM_;
  /**
   * <code>float cylinder_ground_m = 4;</code>
   * @return The cylinderGroundM.
   */
  @java.lang.Override
  public float getCylinderGroundM() {
    return cylinderGroundM_;
  }

  public static final int SHOULDER_MODE_SCALE_FIELD_NUMBER = 5;
  private float shoulderModeScale_;
  /**
   * <code>float shoulder_mode_scale = 5;</code>
   * @return The shoulderModeScale.
   */
  @java.lang.Override
  public float getShoulderModeScale() {
    return shoulderModeScale_;
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
    if (diskRadiusM_ != 0F) {
      output.writeFloat(1, diskRadiusM_);
    }
    if (cylinderRadiusM_ != 0F) {
      output.writeFloat(2, cylinderRadiusM_);
    }
    if (cylinderHeightM_ != 0F) {
      output.writeFloat(3, cylinderHeightM_);
    }
    if (cylinderGroundM_ != 0F) {
      output.writeFloat(4, cylinderGroundM_);
    }
    if (shoulderModeScale_ != 0F) {
      output.writeFloat(5, shoulderModeScale_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (diskRadiusM_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, diskRadiusM_);
    }
    if (cylinderRadiusM_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, cylinderRadiusM_);
    }
    if (cylinderHeightM_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, cylinderHeightM_);
    }
    if (cylinderGroundM_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, cylinderGroundM_);
    }
    if (shoulderModeScale_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, shoulderModeScale_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.Pokemon.CameraAttributes)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.Pokemon.CameraAttributes other = (POGOProtos.Settings.Master.Pokemon.CameraAttributes) obj;

    if (java.lang.Float.floatToIntBits(getDiskRadiusM())
        != java.lang.Float.floatToIntBits(
            other.getDiskRadiusM())) return false;
    if (java.lang.Float.floatToIntBits(getCylinderRadiusM())
        != java.lang.Float.floatToIntBits(
            other.getCylinderRadiusM())) return false;
    if (java.lang.Float.floatToIntBits(getCylinderHeightM())
        != java.lang.Float.floatToIntBits(
            other.getCylinderHeightM())) return false;
    if (java.lang.Float.floatToIntBits(getCylinderGroundM())
        != java.lang.Float.floatToIntBits(
            other.getCylinderGroundM())) return false;
    if (java.lang.Float.floatToIntBits(getShoulderModeScale())
        != java.lang.Float.floatToIntBits(
            other.getShoulderModeScale())) return false;
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
    hash = (37 * hash) + DISK_RADIUS_M_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDiskRadiusM());
    hash = (37 * hash) + CYLINDER_RADIUS_M_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCylinderRadiusM());
    hash = (37 * hash) + CYLINDER_HEIGHT_M_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCylinderHeightM());
    hash = (37 * hash) + CYLINDER_GROUND_M_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCylinderGroundM());
    hash = (37 * hash) + SHOULDER_MODE_SCALE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getShoulderModeScale());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.Pokemon.CameraAttributes prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.Pokemon.CameraAttributes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.Pokemon.CameraAttributes)
      POGOProtos.Settings.Master.Pokemon.CameraAttributesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.Pokemon.CameraAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_CameraAttributes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.Pokemon.CameraAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_CameraAttributes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.Pokemon.CameraAttributes.class, POGOProtos.Settings.Master.Pokemon.CameraAttributes.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.Pokemon.CameraAttributes.newBuilder()
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
      diskRadiusM_ = 0F;

      cylinderRadiusM_ = 0F;

      cylinderHeightM_ = 0F;

      cylinderGroundM_ = 0F;

      shoulderModeScale_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.Pokemon.CameraAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Pokemon_CameraAttributes_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Pokemon.CameraAttributes getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.Pokemon.CameraAttributes.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Pokemon.CameraAttributes build() {
      POGOProtos.Settings.Master.Pokemon.CameraAttributes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Pokemon.CameraAttributes buildPartial() {
      POGOProtos.Settings.Master.Pokemon.CameraAttributes result = new POGOProtos.Settings.Master.Pokemon.CameraAttributes(this);
      result.diskRadiusM_ = diskRadiusM_;
      result.cylinderRadiusM_ = cylinderRadiusM_;
      result.cylinderHeightM_ = cylinderHeightM_;
      result.cylinderGroundM_ = cylinderGroundM_;
      result.shoulderModeScale_ = shoulderModeScale_;
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
      if (other instanceof POGOProtos.Settings.Master.Pokemon.CameraAttributes) {
        return mergeFrom((POGOProtos.Settings.Master.Pokemon.CameraAttributes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.Pokemon.CameraAttributes other) {
      if (other == POGOProtos.Settings.Master.Pokemon.CameraAttributes.getDefaultInstance()) return this;
      if (other.getDiskRadiusM() != 0F) {
        setDiskRadiusM(other.getDiskRadiusM());
      }
      if (other.getCylinderRadiusM() != 0F) {
        setCylinderRadiusM(other.getCylinderRadiusM());
      }
      if (other.getCylinderHeightM() != 0F) {
        setCylinderHeightM(other.getCylinderHeightM());
      }
      if (other.getCylinderGroundM() != 0F) {
        setCylinderGroundM(other.getCylinderGroundM());
      }
      if (other.getShoulderModeScale() != 0F) {
        setShoulderModeScale(other.getShoulderModeScale());
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
      POGOProtos.Settings.Master.Pokemon.CameraAttributes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.Pokemon.CameraAttributes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float diskRadiusM_ ;
    /**
     * <code>float disk_radius_m = 1;</code>
     * @return The diskRadiusM.
     */
    @java.lang.Override
    public float getDiskRadiusM() {
      return diskRadiusM_;
    }
    /**
     * <code>float disk_radius_m = 1;</code>
     * @param value The diskRadiusM to set.
     * @return This builder for chaining.
     */
    public Builder setDiskRadiusM(float value) {
      
      diskRadiusM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float disk_radius_m = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiskRadiusM() {
      
      diskRadiusM_ = 0F;
      onChanged();
      return this;
    }

    private float cylinderRadiusM_ ;
    /**
     * <code>float cylinder_radius_m = 2;</code>
     * @return The cylinderRadiusM.
     */
    @java.lang.Override
    public float getCylinderRadiusM() {
      return cylinderRadiusM_;
    }
    /**
     * <code>float cylinder_radius_m = 2;</code>
     * @param value The cylinderRadiusM to set.
     * @return This builder for chaining.
     */
    public Builder setCylinderRadiusM(float value) {
      
      cylinderRadiusM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cylinder_radius_m = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCylinderRadiusM() {
      
      cylinderRadiusM_ = 0F;
      onChanged();
      return this;
    }

    private float cylinderHeightM_ ;
    /**
     * <code>float cylinder_height_m = 3;</code>
     * @return The cylinderHeightM.
     */
    @java.lang.Override
    public float getCylinderHeightM() {
      return cylinderHeightM_;
    }
    /**
     * <code>float cylinder_height_m = 3;</code>
     * @param value The cylinderHeightM to set.
     * @return This builder for chaining.
     */
    public Builder setCylinderHeightM(float value) {
      
      cylinderHeightM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cylinder_height_m = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCylinderHeightM() {
      
      cylinderHeightM_ = 0F;
      onChanged();
      return this;
    }

    private float cylinderGroundM_ ;
    /**
     * <code>float cylinder_ground_m = 4;</code>
     * @return The cylinderGroundM.
     */
    @java.lang.Override
    public float getCylinderGroundM() {
      return cylinderGroundM_;
    }
    /**
     * <code>float cylinder_ground_m = 4;</code>
     * @param value The cylinderGroundM to set.
     * @return This builder for chaining.
     */
    public Builder setCylinderGroundM(float value) {
      
      cylinderGroundM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cylinder_ground_m = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCylinderGroundM() {
      
      cylinderGroundM_ = 0F;
      onChanged();
      return this;
    }

    private float shoulderModeScale_ ;
    /**
     * <code>float shoulder_mode_scale = 5;</code>
     * @return The shoulderModeScale.
     */
    @java.lang.Override
    public float getShoulderModeScale() {
      return shoulderModeScale_;
    }
    /**
     * <code>float shoulder_mode_scale = 5;</code>
     * @param value The shoulderModeScale to set.
     * @return This builder for chaining.
     */
    public Builder setShoulderModeScale(float value) {
      
      shoulderModeScale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float shoulder_mode_scale = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearShoulderModeScale() {
      
      shoulderModeScale_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.Pokemon.CameraAttributes)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.Pokemon.CameraAttributes)
  private static final POGOProtos.Settings.Master.Pokemon.CameraAttributes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.Pokemon.CameraAttributes();
  }

  public static POGOProtos.Settings.Master.Pokemon.CameraAttributes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CameraAttributes>
      PARSER = new com.google.protobuf.AbstractParser<CameraAttributes>() {
    @java.lang.Override
    public CameraAttributes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CameraAttributes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CameraAttributes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CameraAttributes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.Pokemon.CameraAttributes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

