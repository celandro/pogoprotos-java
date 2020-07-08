// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Gift/GiftBox.proto

package POGOProtos.Data.Gift;

/**
 * Protobuf type {@code POGOProtos.Data.Gift.GiftBox}
 */
public  final class GiftBox extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Gift.GiftBox)
    GiftBoxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GiftBox.newBuilder() to construct.
  private GiftBox(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GiftBox() {
    senderId_ = "";
    receiverId_ = "";
    fortId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GiftBox();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GiftBox(
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

            giftboxId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            senderId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            receiverId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            fortId_ = s;
            break;
          }
          case 41: {

            fortLat_ = input.readDouble();
            break;
          }
          case 49: {

            fortLng_ = input.readDouble();
            break;
          }
          case 56: {

            creationTimestamp_ = input.readInt64();
            break;
          }
          case 64: {

            sentTimestamp_ = input.readInt64();
            break;
          }
          case 72: {

            sentBucket_ = input.readInt64();
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
    return POGOProtos.Data.Gift.GiftBoxOuterClass.internal_static_POGOProtos_Data_Gift_GiftBox_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Gift.GiftBoxOuterClass.internal_static_POGOProtos_Data_Gift_GiftBox_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Gift.GiftBox.class, POGOProtos.Data.Gift.GiftBox.Builder.class);
  }

  public static final int GIFTBOX_ID_FIELD_NUMBER = 1;
  private long giftboxId_;
  /**
   * <code>uint64 giftbox_id = 1;</code>
   * @return The giftboxId.
   */
  public long getGiftboxId() {
    return giftboxId_;
  }

  public static final int SENDER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object senderId_;
  /**
   * <code>string sender_id = 2;</code>
   * @return The senderId.
   */
  public java.lang.String getSenderId() {
    java.lang.Object ref = senderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      senderId_ = s;
      return s;
    }
  }
  /**
   * <code>string sender_id = 2;</code>
   * @return The bytes for senderId.
   */
  public com.google.protobuf.ByteString
      getSenderIdBytes() {
    java.lang.Object ref = senderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      senderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIVER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object receiverId_;
  /**
   * <code>string receiver_id = 3;</code>
   * @return The receiverId.
   */
  public java.lang.String getReceiverId() {
    java.lang.Object ref = receiverId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receiverId_ = s;
      return s;
    }
  }
  /**
   * <code>string receiver_id = 3;</code>
   * @return The bytes for receiverId.
   */
  public com.google.protobuf.ByteString
      getReceiverIdBytes() {
    java.lang.Object ref = receiverId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receiverId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORT_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object fortId_;
  /**
   * <code>string fort_id = 4;</code>
   * @return The fortId.
   */
  public java.lang.String getFortId() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fortId_ = s;
      return s;
    }
  }
  /**
   * <code>string fort_id = 4;</code>
   * @return The bytes for fortId.
   */
  public com.google.protobuf.ByteString
      getFortIdBytes() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fortId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORT_LAT_FIELD_NUMBER = 5;
  private double fortLat_;
  /**
   * <code>double fort_lat = 5;</code>
   * @return The fortLat.
   */
  public double getFortLat() {
    return fortLat_;
  }

  public static final int FORT_LNG_FIELD_NUMBER = 6;
  private double fortLng_;
  /**
   * <code>double fort_lng = 6;</code>
   * @return The fortLng.
   */
  public double getFortLng() {
    return fortLng_;
  }

  public static final int CREATION_TIMESTAMP_FIELD_NUMBER = 7;
  private long creationTimestamp_;
  /**
   * <code>int64 creation_timestamp = 7;</code>
   * @return The creationTimestamp.
   */
  public long getCreationTimestamp() {
    return creationTimestamp_;
  }

  public static final int SENT_TIMESTAMP_FIELD_NUMBER = 8;
  private long sentTimestamp_;
  /**
   * <code>int64 sent_timestamp = 8;</code>
   * @return The sentTimestamp.
   */
  public long getSentTimestamp() {
    return sentTimestamp_;
  }

  public static final int SENT_BUCKET_FIELD_NUMBER = 9;
  private long sentBucket_;
  /**
   * <code>int64 sent_bucket = 9;</code>
   * @return The sentBucket.
   */
  public long getSentBucket() {
    return sentBucket_;
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
    if (giftboxId_ != 0L) {
      output.writeUInt64(1, giftboxId_);
    }
    if (!getSenderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, senderId_);
    }
    if (!getReceiverIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, receiverId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fortId_);
    }
    if (fortLat_ != 0D) {
      output.writeDouble(5, fortLat_);
    }
    if (fortLng_ != 0D) {
      output.writeDouble(6, fortLng_);
    }
    if (creationTimestamp_ != 0L) {
      output.writeInt64(7, creationTimestamp_);
    }
    if (sentTimestamp_ != 0L) {
      output.writeInt64(8, sentTimestamp_);
    }
    if (sentBucket_ != 0L) {
      output.writeInt64(9, sentBucket_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (giftboxId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, giftboxId_);
    }
    if (!getSenderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, senderId_);
    }
    if (!getReceiverIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, receiverId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fortId_);
    }
    if (fortLat_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, fortLat_);
    }
    if (fortLng_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, fortLng_);
    }
    if (creationTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, creationTimestamp_);
    }
    if (sentTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, sentTimestamp_);
    }
    if (sentBucket_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, sentBucket_);
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
    if (!(obj instanceof POGOProtos.Data.Gift.GiftBox)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Gift.GiftBox other = (POGOProtos.Data.Gift.GiftBox) obj;

    if (getGiftboxId()
        != other.getGiftboxId()) return false;
    if (!getSenderId()
        .equals(other.getSenderId())) return false;
    if (!getReceiverId()
        .equals(other.getReceiverId())) return false;
    if (!getFortId()
        .equals(other.getFortId())) return false;
    if (java.lang.Double.doubleToLongBits(getFortLat())
        != java.lang.Double.doubleToLongBits(
            other.getFortLat())) return false;
    if (java.lang.Double.doubleToLongBits(getFortLng())
        != java.lang.Double.doubleToLongBits(
            other.getFortLng())) return false;
    if (getCreationTimestamp()
        != other.getCreationTimestamp()) return false;
    if (getSentTimestamp()
        != other.getSentTimestamp()) return false;
    if (getSentBucket()
        != other.getSentBucket()) return false;
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
    hash = (37 * hash) + GIFTBOX_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGiftboxId());
    hash = (37 * hash) + SENDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSenderId().hashCode();
    hash = (37 * hash) + RECEIVER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReceiverId().hashCode();
    hash = (37 * hash) + FORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFortId().hashCode();
    hash = (37 * hash) + FORT_LAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFortLat()));
    hash = (37 * hash) + FORT_LNG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFortLng()));
    hash = (37 * hash) + CREATION_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreationTimestamp());
    hash = (37 * hash) + SENT_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSentTimestamp());
    hash = (37 * hash) + SENT_BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSentBucket());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Gift.GiftBox parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Gift.GiftBox parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Gift.GiftBox parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Gift.GiftBox parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Gift.GiftBox parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Gift.GiftBox parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Gift.GiftBox parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Gift.GiftBox parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Gift.GiftBox parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Gift.GiftBox parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Gift.GiftBox parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Gift.GiftBox parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Gift.GiftBox prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Gift.GiftBox}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Gift.GiftBox)
      POGOProtos.Data.Gift.GiftBoxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Gift.GiftBoxOuterClass.internal_static_POGOProtos_Data_Gift_GiftBox_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Gift.GiftBoxOuterClass.internal_static_POGOProtos_Data_Gift_GiftBox_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Gift.GiftBox.class, POGOProtos.Data.Gift.GiftBox.Builder.class);
    }

    // Construct using POGOProtos.Data.Gift.GiftBox.newBuilder()
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
      giftboxId_ = 0L;

      senderId_ = "";

      receiverId_ = "";

      fortId_ = "";

      fortLat_ = 0D;

      fortLng_ = 0D;

      creationTimestamp_ = 0L;

      sentTimestamp_ = 0L;

      sentBucket_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Gift.GiftBoxOuterClass.internal_static_POGOProtos_Data_Gift_GiftBox_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Gift.GiftBox getDefaultInstanceForType() {
      return POGOProtos.Data.Gift.GiftBox.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Gift.GiftBox build() {
      POGOProtos.Data.Gift.GiftBox result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Gift.GiftBox buildPartial() {
      POGOProtos.Data.Gift.GiftBox result = new POGOProtos.Data.Gift.GiftBox(this);
      result.giftboxId_ = giftboxId_;
      result.senderId_ = senderId_;
      result.receiverId_ = receiverId_;
      result.fortId_ = fortId_;
      result.fortLat_ = fortLat_;
      result.fortLng_ = fortLng_;
      result.creationTimestamp_ = creationTimestamp_;
      result.sentTimestamp_ = sentTimestamp_;
      result.sentBucket_ = sentBucket_;
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
      if (other instanceof POGOProtos.Data.Gift.GiftBox) {
        return mergeFrom((POGOProtos.Data.Gift.GiftBox)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Gift.GiftBox other) {
      if (other == POGOProtos.Data.Gift.GiftBox.getDefaultInstance()) return this;
      if (other.getGiftboxId() != 0L) {
        setGiftboxId(other.getGiftboxId());
      }
      if (!other.getSenderId().isEmpty()) {
        senderId_ = other.senderId_;
        onChanged();
      }
      if (!other.getReceiverId().isEmpty()) {
        receiverId_ = other.receiverId_;
        onChanged();
      }
      if (!other.getFortId().isEmpty()) {
        fortId_ = other.fortId_;
        onChanged();
      }
      if (other.getFortLat() != 0D) {
        setFortLat(other.getFortLat());
      }
      if (other.getFortLng() != 0D) {
        setFortLng(other.getFortLng());
      }
      if (other.getCreationTimestamp() != 0L) {
        setCreationTimestamp(other.getCreationTimestamp());
      }
      if (other.getSentTimestamp() != 0L) {
        setSentTimestamp(other.getSentTimestamp());
      }
      if (other.getSentBucket() != 0L) {
        setSentBucket(other.getSentBucket());
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
      POGOProtos.Data.Gift.GiftBox parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Gift.GiftBox) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long giftboxId_ ;
    /**
     * <code>uint64 giftbox_id = 1;</code>
     * @return The giftboxId.
     */
    public long getGiftboxId() {
      return giftboxId_;
    }
    /**
     * <code>uint64 giftbox_id = 1;</code>
     * @param value The giftboxId to set.
     * @return This builder for chaining.
     */
    public Builder setGiftboxId(long value) {
      
      giftboxId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 giftbox_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGiftboxId() {
      
      giftboxId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object senderId_ = "";
    /**
     * <code>string sender_id = 2;</code>
     * @return The senderId.
     */
    public java.lang.String getSenderId() {
      java.lang.Object ref = senderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sender_id = 2;</code>
     * @return The bytes for senderId.
     */
    public com.google.protobuf.ByteString
        getSenderIdBytes() {
      java.lang.Object ref = senderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sender_id = 2;</code>
     * @param value The senderId to set.
     * @return This builder for chaining.
     */
    public Builder setSenderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      senderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sender_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSenderId() {
      
      senderId_ = getDefaultInstance().getSenderId();
      onChanged();
      return this;
    }
    /**
     * <code>string sender_id = 2;</code>
     * @param value The bytes for senderId to set.
     * @return This builder for chaining.
     */
    public Builder setSenderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      senderId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object receiverId_ = "";
    /**
     * <code>string receiver_id = 3;</code>
     * @return The receiverId.
     */
    public java.lang.String getReceiverId() {
      java.lang.Object ref = receiverId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiverId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string receiver_id = 3;</code>
     * @return The bytes for receiverId.
     */
    public com.google.protobuf.ByteString
        getReceiverIdBytes() {
      java.lang.Object ref = receiverId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string receiver_id = 3;</code>
     * @param value The receiverId to set.
     * @return This builder for chaining.
     */
    public Builder setReceiverId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      receiverId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string receiver_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiverId() {
      
      receiverId_ = getDefaultInstance().getReceiverId();
      onChanged();
      return this;
    }
    /**
     * <code>string receiver_id = 3;</code>
     * @param value The bytes for receiverId to set.
     * @return This builder for chaining.
     */
    public Builder setReceiverIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      receiverId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fortId_ = "";
    /**
     * <code>string fort_id = 4;</code>
     * @return The fortId.
     */
    public java.lang.String getFortId() {
      java.lang.Object ref = fortId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fortId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fort_id = 4;</code>
     * @return The bytes for fortId.
     */
    public com.google.protobuf.ByteString
        getFortIdBytes() {
      java.lang.Object ref = fortId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fortId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fort_id = 4;</code>
     * @param value The fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fortId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortId() {
      
      fortId_ = getDefaultInstance().getFortId();
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 4;</code>
     * @param value The bytes for fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fortId_ = value;
      onChanged();
      return this;
    }

    private double fortLat_ ;
    /**
     * <code>double fort_lat = 5;</code>
     * @return The fortLat.
     */
    public double getFortLat() {
      return fortLat_;
    }
    /**
     * <code>double fort_lat = 5;</code>
     * @param value The fortLat to set.
     * @return This builder for chaining.
     */
    public Builder setFortLat(double value) {
      
      fortLat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double fort_lat = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortLat() {
      
      fortLat_ = 0D;
      onChanged();
      return this;
    }

    private double fortLng_ ;
    /**
     * <code>double fort_lng = 6;</code>
     * @return The fortLng.
     */
    public double getFortLng() {
      return fortLng_;
    }
    /**
     * <code>double fort_lng = 6;</code>
     * @param value The fortLng to set.
     * @return This builder for chaining.
     */
    public Builder setFortLng(double value) {
      
      fortLng_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double fort_lng = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortLng() {
      
      fortLng_ = 0D;
      onChanged();
      return this;
    }

    private long creationTimestamp_ ;
    /**
     * <code>int64 creation_timestamp = 7;</code>
     * @return The creationTimestamp.
     */
    public long getCreationTimestamp() {
      return creationTimestamp_;
    }
    /**
     * <code>int64 creation_timestamp = 7;</code>
     * @param value The creationTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setCreationTimestamp(long value) {
      
      creationTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 creation_timestamp = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreationTimestamp() {
      
      creationTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private long sentTimestamp_ ;
    /**
     * <code>int64 sent_timestamp = 8;</code>
     * @return The sentTimestamp.
     */
    public long getSentTimestamp() {
      return sentTimestamp_;
    }
    /**
     * <code>int64 sent_timestamp = 8;</code>
     * @param value The sentTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setSentTimestamp(long value) {
      
      sentTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 sent_timestamp = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearSentTimestamp() {
      
      sentTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private long sentBucket_ ;
    /**
     * <code>int64 sent_bucket = 9;</code>
     * @return The sentBucket.
     */
    public long getSentBucket() {
      return sentBucket_;
    }
    /**
     * <code>int64 sent_bucket = 9;</code>
     * @param value The sentBucket to set.
     * @return This builder for chaining.
     */
    public Builder setSentBucket(long value) {
      
      sentBucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 sent_bucket = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearSentBucket() {
      
      sentBucket_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Gift.GiftBox)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Gift.GiftBox)
  private static final POGOProtos.Data.Gift.GiftBox DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Gift.GiftBox();
  }

  public static POGOProtos.Data.Gift.GiftBox getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GiftBox>
      PARSER = new com.google.protobuf.AbstractParser<GiftBox>() {
    @java.lang.Override
    public GiftBox parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GiftBox(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GiftBox> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GiftBox> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Gift.GiftBox getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
