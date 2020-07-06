// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePoi/Responses/SubmitPoiImageResponse.proto

package POGOProtos.Networking.Responses.Game.GamePoi.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse}
 */
public  final class SubmitPoiImageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse)
    SubmitPoiImageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitPoiImageResponse.newBuilder() to construct.
  private SubmitPoiImageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitPoiImageResponse() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubmitPoiImageResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubmitPoiImageResponse(
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
    return POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiImageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiImageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.class, POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    STATUS_UNSPECIFIED(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>INTERNAL_ERROR = 2;</code>
     */
    INTERNAL_ERROR(2),
    /**
     * <code>TOO_MANY_RECENT_SUBMISSIONS = 3;</code>
     */
    TOO_MANY_RECENT_SUBMISSIONS(3),
    /**
     * <code>MINOR = 4;</code>
     */
    MINOR(4),
    /**
     * <code>NOT_AVAILABLE = 5;</code>
     */
    NOT_AVAILABLE(5),
    /**
     * <code>MISSING_IMAGE = 6;</code>
     */
    MISSING_IMAGE(6),
    /**
     * <code>INVALID_INPUT = 7;</code>
     */
    INVALID_INPUT(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int STATUS_UNSPECIFIED_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>INTERNAL_ERROR = 2;</code>
     */
    public static final int INTERNAL_ERROR_VALUE = 2;
    /**
     * <code>TOO_MANY_RECENT_SUBMISSIONS = 3;</code>
     */
    public static final int TOO_MANY_RECENT_SUBMISSIONS_VALUE = 3;
    /**
     * <code>MINOR = 4;</code>
     */
    public static final int MINOR_VALUE = 4;
    /**
     * <code>NOT_AVAILABLE = 5;</code>
     */
    public static final int NOT_AVAILABLE_VALUE = 5;
    /**
     * <code>MISSING_IMAGE = 6;</code>
     */
    public static final int MISSING_IMAGE_VALUE = 6;
    /**
     * <code>INVALID_INPUT = 7;</code>
     */
    public static final int INVALID_INPUT_VALUE = 7;


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
        case 0: return STATUS_UNSPECIFIED;
        case 1: return SUCCESS;
        case 2: return INTERNAL_ERROR;
        case 3: return TOO_MANY_RECENT_SUBMISSIONS;
        case 4: return MINOR;
        case 5: return NOT_AVAILABLE;
        case 6: return MISSING_IMAGE;
        case 7: return INVALID_INPUT;
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
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status status = 1;</code>
   * @return The status.
   */
  public POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status result = POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status.valueOf(status_);
    return result == null ? POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status.UNRECOGNIZED : result;
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
    if (status_ != POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
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
    if (!(obj instanceof POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse other = (POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse) obj;

    if (status_ != other.status_) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse)
      POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiImageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiImageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.class, POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.newBuilder()
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

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_SubmitPoiImageResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse build() {
      POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse buildPartial() {
      POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse result = new POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse(this);
      result.status_ = status_;
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
      if (other instanceof POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse other) {
      if (other == POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status status = 1;</code>
     * @return The status.
     */
    public POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status result = POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status.valueOf(status_);
      return result == null ? POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse)
  private static final POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse();
  }

  public static POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitPoiImageResponse>
      PARSER = new com.google.protobuf.AbstractParser<SubmitPoiImageResponse>() {
    @java.lang.Override
    public SubmitPoiImageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubmitPoiImageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubmitPoiImageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitPoiImageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.Game.GamePoi.Responses.SubmitPoiImageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

