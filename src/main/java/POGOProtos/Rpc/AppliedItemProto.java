// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AppliedItemProto}
 */
public  final class AppliedItemProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AppliedItemProto)
    AppliedItemProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppliedItemProto.newBuilder() to construct.
  private AppliedItemProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppliedItemProto() {
    item_ = 0;
    itemType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppliedItemProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppliedItemProto(
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

            item_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            itemType_ = rawValue;
            break;
          }
          case 24: {

            expirationMs_ = input.readInt64();
            break;
          }
          case 32: {

            appliedMs_ = input.readInt64();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AppliedItemProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AppliedItemProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AppliedItemProto.class, POGOProtos.Rpc.AppliedItemProto.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private int item_;
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The enum numeric value on the wire for item.
   */
  public int getItemValue() {
    return item_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The item.
   */
  public POGOProtos.Rpc.Item getItem() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(item_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int ITEM_TYPE_FIELD_NUMBER = 2;
  private int itemType_;
  /**
   * <code>.POGOProtos.Rpc.HoloItemType item_type = 2;</code>
   * @return The enum numeric value on the wire for itemType.
   */
  public int getItemTypeValue() {
    return itemType_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloItemType item_type = 2;</code>
   * @return The itemType.
   */
  public POGOProtos.Rpc.HoloItemType getItemType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloItemType result = POGOProtos.Rpc.HoloItemType.valueOf(itemType_);
    return result == null ? POGOProtos.Rpc.HoloItemType.UNRECOGNIZED : result;
  }

  public static final int EXPIRATION_MS_FIELD_NUMBER = 3;
  private long expirationMs_;
  /**
   * <code>int64 expiration_ms = 3;</code>
   * @return The expirationMs.
   */
  public long getExpirationMs() {
    return expirationMs_;
  }

  public static final int APPLIED_MS_FIELD_NUMBER = 4;
  private long appliedMs_;
  /**
   * <code>int64 applied_ms = 4;</code>
   * @return The appliedMs.
   */
  public long getAppliedMs() {
    return appliedMs_;
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
    if (item_ != POGOProtos.Rpc.Item.ITEM_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, item_);
    }
    if (itemType_ != POGOProtos.Rpc.HoloItemType.HOLO_ITEM_TYPE_ITEM_TYPE_NONE.getNumber()) {
      output.writeEnum(2, itemType_);
    }
    if (expirationMs_ != 0L) {
      output.writeInt64(3, expirationMs_);
    }
    if (appliedMs_ != 0L) {
      output.writeInt64(4, appliedMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != POGOProtos.Rpc.Item.ITEM_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, item_);
    }
    if (itemType_ != POGOProtos.Rpc.HoloItemType.HOLO_ITEM_TYPE_ITEM_TYPE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, itemType_);
    }
    if (expirationMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, expirationMs_);
    }
    if (appliedMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, appliedMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.AppliedItemProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AppliedItemProto other = (POGOProtos.Rpc.AppliedItemProto) obj;

    if (item_ != other.item_) return false;
    if (itemType_ != other.itemType_) return false;
    if (getExpirationMs()
        != other.getExpirationMs()) return false;
    if (getAppliedMs()
        != other.getAppliedMs()) return false;
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
    hash = (37 * hash) + ITEM_FIELD_NUMBER;
    hash = (53 * hash) + item_;
    hash = (37 * hash) + ITEM_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + itemType_;
    hash = (37 * hash) + EXPIRATION_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpirationMs());
    hash = (37 * hash) + APPLIED_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppliedMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AppliedItemProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AppliedItemProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AppliedItemProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AppliedItemProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AppliedItemProto)
      POGOProtos.Rpc.AppliedItemProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AppliedItemProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AppliedItemProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AppliedItemProto.class, POGOProtos.Rpc.AppliedItemProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AppliedItemProto.newBuilder()
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
      item_ = 0;

      itemType_ = 0;

      expirationMs_ = 0L;

      appliedMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AppliedItemProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AppliedItemProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.AppliedItemProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AppliedItemProto build() {
      POGOProtos.Rpc.AppliedItemProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AppliedItemProto buildPartial() {
      POGOProtos.Rpc.AppliedItemProto result = new POGOProtos.Rpc.AppliedItemProto(this);
      result.item_ = item_;
      result.itemType_ = itemType_;
      result.expirationMs_ = expirationMs_;
      result.appliedMs_ = appliedMs_;
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
      if (other instanceof POGOProtos.Rpc.AppliedItemProto) {
        return mergeFrom((POGOProtos.Rpc.AppliedItemProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AppliedItemProto other) {
      if (other == POGOProtos.Rpc.AppliedItemProto.getDefaultInstance()) return this;
      if (other.item_ != 0) {
        setItemValue(other.getItemValue());
      }
      if (other.itemType_ != 0) {
        setItemTypeValue(other.getItemTypeValue());
      }
      if (other.getExpirationMs() != 0L) {
        setExpirationMs(other.getExpirationMs());
      }
      if (other.getAppliedMs() != 0L) {
        setAppliedMs(other.getAppliedMs());
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
      POGOProtos.Rpc.AppliedItemProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AppliedItemProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int item_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return The enum numeric value on the wire for item.
     */
    public int getItemValue() {
      return item_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @param value The enum numeric value on the wire for item to set.
     * @return This builder for chaining.
     */
    public Builder setItemValue(int value) {
      item_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return The item.
     */
    public POGOProtos.Rpc.Item getItem() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(item_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @param value The item to set.
     * @return This builder for chaining.
     */
    public Builder setItem(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      item_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item item = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItem() {
      
      item_ = 0;
      onChanged();
      return this;
    }

    private int itemType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloItemType item_type = 2;</code>
     * @return The enum numeric value on the wire for itemType.
     */
    public int getItemTypeValue() {
      return itemType_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloItemType item_type = 2;</code>
     * @param value The enum numeric value on the wire for itemType to set.
     * @return This builder for chaining.
     */
    public Builder setItemTypeValue(int value) {
      itemType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloItemType item_type = 2;</code>
     * @return The itemType.
     */
    public POGOProtos.Rpc.HoloItemType getItemType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloItemType result = POGOProtos.Rpc.HoloItemType.valueOf(itemType_);
      return result == null ? POGOProtos.Rpc.HoloItemType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloItemType item_type = 2;</code>
     * @param value The itemType to set.
     * @return This builder for chaining.
     */
    public Builder setItemType(POGOProtos.Rpc.HoloItemType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      itemType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloItemType item_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemType() {
      
      itemType_ = 0;
      onChanged();
      return this;
    }

    private long expirationMs_ ;
    /**
     * <code>int64 expiration_ms = 3;</code>
     * @return The expirationMs.
     */
    public long getExpirationMs() {
      return expirationMs_;
    }
    /**
     * <code>int64 expiration_ms = 3;</code>
     * @param value The expirationMs to set.
     * @return This builder for chaining.
     */
    public Builder setExpirationMs(long value) {
      
      expirationMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expiration_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpirationMs() {
      
      expirationMs_ = 0L;
      onChanged();
      return this;
    }

    private long appliedMs_ ;
    /**
     * <code>int64 applied_ms = 4;</code>
     * @return The appliedMs.
     */
    public long getAppliedMs() {
      return appliedMs_;
    }
    /**
     * <code>int64 applied_ms = 4;</code>
     * @param value The appliedMs to set.
     * @return This builder for chaining.
     */
    public Builder setAppliedMs(long value) {
      
      appliedMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 applied_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppliedMs() {
      
      appliedMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AppliedItemProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AppliedItemProto)
  private static final POGOProtos.Rpc.AppliedItemProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AppliedItemProto();
  }

  public static POGOProtos.Rpc.AppliedItemProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppliedItemProto>
      PARSER = new com.google.protobuf.AbstractParser<AppliedItemProto>() {
    @java.lang.Override
    public AppliedItemProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppliedItemProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppliedItemProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppliedItemProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AppliedItemProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
