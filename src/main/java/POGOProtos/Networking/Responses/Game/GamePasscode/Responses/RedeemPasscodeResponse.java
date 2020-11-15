// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePasscode/Responses/RedeemPasscodeResponse.proto

package POGOProtos.Networking.Responses.Game.GamePasscode.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse}
 */
public final class RedeemPasscodeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse)
    RedeemPasscodeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RedeemPasscodeResponse.newBuilder() to construct.
  private RedeemPasscodeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RedeemPasscodeResponse() {
    status_ = 0;
    qrcode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RedeemPasscodeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RedeemPasscodeResponse(
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

            status_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            qrcode_ = s;
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
    return POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePasscode_Responses_RedeemPasscodeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePasscode_Responses_RedeemPasscodeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.class, POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNDEFINED = 0;</code>
     */
    UNDEFINED(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>INVALID = 2;</code>
     */
    INVALID(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNDEFINED = 0;</code>
     */
    public static final int UNDEFINED_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>INVALID = 2;</code>
     */
    public static final int INVALID_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED;
        case 1: return SUCCESS;
        case 2: return INVALID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status result = POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status.valueOf(status_);
    return result == null ? POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status.UNRECOGNIZED : result;
  }

  public static final int QRCODE_FIELD_NUMBER = 4;
  private volatile java.lang.Object qrcode_;
  /**
   * <code>string qrcode = 4;</code>
   * @return The qrcode.
   */
  @java.lang.Override
  public java.lang.String getQrcode() {
    java.lang.Object ref = qrcode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      qrcode_ = s;
      return s;
    }
  }
  /**
   * <code>string qrcode = 4;</code>
   * @return The bytes for qrcode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQrcodeBytes() {
    java.lang.Object ref = qrcode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      qrcode_ = b;
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
    if (status_ != POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status.UNDEFINED.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (!getQrcodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, qrcode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status.UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (!getQrcodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, qrcode_);
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
    if (!(obj instanceof POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse other = (POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse) obj;

    if (status_ != other.status_) return false;
    if (!getQrcode()
        .equals(other.getQrcode())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + QRCODE_FIELD_NUMBER;
    hash = (53 * hash) + getQrcode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse)
      POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePasscode_Responses_RedeemPasscodeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePasscode_Responses_RedeemPasscodeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.class, POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.newBuilder()
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
      status_ = 0;

      qrcode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePasscode_Responses_RedeemPasscodeResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse build() {
      POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse buildPartial() {
      POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse result = new POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse(this);
      result.status_ = status_;
      result.qrcode_ = qrcode_;
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
      if (other instanceof POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse other) {
      if (other == POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getQrcode().isEmpty()) {
        qrcode_ = other.qrcode_;
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
      POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status result = POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status.valueOf(status_);
      return result == null ? POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object qrcode_ = "";
    /**
     * <code>string qrcode = 4;</code>
     * @return The qrcode.
     */
    public java.lang.String getQrcode() {
      java.lang.Object ref = qrcode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        qrcode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string qrcode = 4;</code>
     * @return The bytes for qrcode.
     */
    public com.google.protobuf.ByteString
        getQrcodeBytes() {
      java.lang.Object ref = qrcode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        qrcode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string qrcode = 4;</code>
     * @param value The qrcode to set.
     * @return This builder for chaining.
     */
    public Builder setQrcode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      qrcode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string qrcode = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearQrcode() {
      
      qrcode_ = getDefaultInstance().getQrcode();
      onChanged();
      return this;
    }
    /**
     * <code>string qrcode = 4;</code>
     * @param value The bytes for qrcode to set.
     * @return This builder for chaining.
     */
    public Builder setQrcodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      qrcode_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse)
  private static final POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse();
  }

  public static POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RedeemPasscodeResponse>
      PARSER = new com.google.protobuf.AbstractParser<RedeemPasscodeResponse>() {
    @java.lang.Override
    public RedeemPasscodeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RedeemPasscodeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RedeemPasscodeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RedeemPasscodeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

