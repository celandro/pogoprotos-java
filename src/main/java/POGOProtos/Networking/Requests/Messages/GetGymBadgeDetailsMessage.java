// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetGymBadgeDetailsMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage}
 */
public  final class GetGymBadgeDetailsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage)
    GetGymBadgeDetailsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGymBadgeDetailsMessage.newBuilder() to construct.
  private GetGymBadgeDetailsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGymBadgeDetailsMessage() {
    fortId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGymBadgeDetailsMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetGymBadgeDetailsMessage(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            fortId_ = s;
            break;
          }
          case 17: {

            latitude_ = input.readDouble();
            break;
          }
          case 25: {

            longitude_ = input.readDouble();
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
    return POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymBadgeDetailsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymBadgeDetailsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage.class, POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage.Builder.class);
  }

  public static final int FORT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object fortId_;
  /**
   * <code>string fort_id = 1;</code>
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
   * <code>string fort_id = 1;</code>
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

  public static final int LATITUDE_FIELD_NUMBER = 2;
  private double latitude_;
  /**
   * <code>double latitude = 2;</code>
   * @return The latitude.
   */
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 3;
  private double longitude_;
  /**
   * <code>double longitude = 3;</code>
   * @return The longitude.
   */
  public double getLongitude() {
    return longitude_;
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
    if (!getFortIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fortId_);
    }
    if (latitude_ != 0D) {
      output.writeDouble(2, latitude_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(3, longitude_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFortIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fortId_);
    }
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, latitude_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, longitude_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage other = (POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage) obj;

    if (!getFortId()
        .equals(other.getFortId())) return false;
    if (java.lang.Double.doubleToLongBits(getLatitude())
        != java.lang.Double.doubleToLongBits(
            other.getLatitude())) return false;
    if (java.lang.Double.doubleToLongBits(getLongitude())
        != java.lang.Double.doubleToLongBits(
            other.getLongitude())) return false;
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
    hash = (37 * hash) + FORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFortId().hashCode();
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage)
      POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymBadgeDetailsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymBadgeDetailsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage.class, POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage.newBuilder()
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
      fortId_ = "";

      latitude_ = 0D;

      longitude_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymBadgeDetailsMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage build() {
      POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage result = new POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage(this);
      result.fortId_ = fortId_;
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage.getDefaultInstance()) return this;
      if (!other.getFortId().isEmpty()) {
        fortId_ = other.fortId_;
        onChanged();
      }
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
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
      POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fortId_ = "";
    /**
     * <code>string fort_id = 1;</code>
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
     * <code>string fort_id = 1;</code>
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
     * <code>string fort_id = 1;</code>
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
     * <code>string fort_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortId() {
      
      fortId_ = getDefaultInstance().getFortId();
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 1;</code>
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

    private double latitude_ ;
    /**
     * <code>double latitude = 2;</code>
     * @return The latitude.
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>double latitude = 2;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double latitude = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>double longitude = 3;</code>
     * @return The longitude.
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>double longitude = 3;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double longitude = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage)
  private static final POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGymBadgeDetailsMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetGymBadgeDetailsMessage>() {
    @java.lang.Override
    public GetGymBadgeDetailsMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetGymBadgeDetailsMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetGymBadgeDetailsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGymBadgeDetailsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.GetGymBadgeDetailsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
