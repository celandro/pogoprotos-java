// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Item/ReviveAttributes.proto

package POGOProtos.Settings.Master.Item;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.Item.ReviveAttributes}
 */
public final class ReviveAttributes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.Item.ReviveAttributes)
    ReviveAttributesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReviveAttributes.newBuilder() to construct.
  private ReviveAttributes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReviveAttributes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReviveAttributes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReviveAttributes(
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

            staPercent_ = input.readFloat();
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
    return POGOProtos.Settings.Master.Item.ReviveAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_ReviveAttributes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.Item.ReviveAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_ReviveAttributes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.Item.ReviveAttributes.class, POGOProtos.Settings.Master.Item.ReviveAttributes.Builder.class);
  }

  public static final int STA_PERCENT_FIELD_NUMBER = 1;
  private float staPercent_;
  /**
   * <code>float sta_percent = 1;</code>
   * @return The staPercent.
   */
  @java.lang.Override
  public float getStaPercent() {
    return staPercent_;
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
    if (staPercent_ != 0F) {
      output.writeFloat(1, staPercent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (staPercent_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, staPercent_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.Item.ReviveAttributes)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.Item.ReviveAttributes other = (POGOProtos.Settings.Master.Item.ReviveAttributes) obj;

    if (java.lang.Float.floatToIntBits(getStaPercent())
        != java.lang.Float.floatToIntBits(
            other.getStaPercent())) return false;
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
    hash = (37 * hash) + STA_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getStaPercent());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.ReviveAttributes parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.Item.ReviveAttributes prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.Item.ReviveAttributes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.Item.ReviveAttributes)
      POGOProtos.Settings.Master.Item.ReviveAttributesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.Item.ReviveAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_ReviveAttributes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.Item.ReviveAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_ReviveAttributes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.Item.ReviveAttributes.class, POGOProtos.Settings.Master.Item.ReviveAttributes.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.Item.ReviveAttributes.newBuilder()
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
      staPercent_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.Item.ReviveAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_ReviveAttributes_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.ReviveAttributes getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.Item.ReviveAttributes.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.ReviveAttributes build() {
      POGOProtos.Settings.Master.Item.ReviveAttributes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.ReviveAttributes buildPartial() {
      POGOProtos.Settings.Master.Item.ReviveAttributes result = new POGOProtos.Settings.Master.Item.ReviveAttributes(this);
      result.staPercent_ = staPercent_;
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
      if (other instanceof POGOProtos.Settings.Master.Item.ReviveAttributes) {
        return mergeFrom((POGOProtos.Settings.Master.Item.ReviveAttributes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.Item.ReviveAttributes other) {
      if (other == POGOProtos.Settings.Master.Item.ReviveAttributes.getDefaultInstance()) return this;
      if (other.getStaPercent() != 0F) {
        setStaPercent(other.getStaPercent());
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
      POGOProtos.Settings.Master.Item.ReviveAttributes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.Item.ReviveAttributes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float staPercent_ ;
    /**
     * <code>float sta_percent = 1;</code>
     * @return The staPercent.
     */
    @java.lang.Override
    public float getStaPercent() {
      return staPercent_;
    }
    /**
     * <code>float sta_percent = 1;</code>
     * @param value The staPercent to set.
     * @return This builder for chaining.
     */
    public Builder setStaPercent(float value) {
      
      staPercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float sta_percent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStaPercent() {
      
      staPercent_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.Item.ReviveAttributes)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.Item.ReviveAttributes)
  private static final POGOProtos.Settings.Master.Item.ReviveAttributes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.Item.ReviveAttributes();
  }

  public static POGOProtos.Settings.Master.Item.ReviveAttributes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReviveAttributes>
      PARSER = new com.google.protobuf.AbstractParser<ReviveAttributes>() {
    @java.lang.Override
    public ReviveAttributes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReviveAttributes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReviveAttributes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReviveAttributes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.Item.ReviveAttributes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

