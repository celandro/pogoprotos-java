// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetTodayViewOutProto}
 */
public final class GetTodayViewOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetTodayViewOutProto)
    GetTodayViewOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTodayViewOutProto.newBuilder() to construct.
  private GetTodayViewOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTodayViewOutProto() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTodayViewOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTodayViewOutProto(
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
          case 18: {
            POGOProtos.Rpc.TodayViewProto.Builder subBuilder = null;
            if (todayView_ != null) {
              subBuilder = todayView_.toBuilder();
            }
            todayView_ = input.readMessage(POGOProtos.Rpc.TodayViewProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(todayView_);
              todayView_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetTodayViewOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetTodayViewOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetTodayViewOutProto.class, POGOProtos.Rpc.GetTodayViewOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.GetTodayViewOutProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>ERROR = 2;</code>
     */
    ERROR(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>ERROR = 2;</code>
     */
    public static final int ERROR_VALUE = 2;


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
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR;
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
      return POGOProtos.Rpc.GetTodayViewOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GetTodayViewOutProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.GetTodayViewOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.GetTodayViewOutProto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.GetTodayViewOutProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GetTodayViewOutProto.Status result = POGOProtos.Rpc.GetTodayViewOutProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.GetTodayViewOutProto.Status.UNRECOGNIZED : result;
  }

  public static final int TODAY_VIEW_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.TodayViewProto todayView_;
  /**
   * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
   * @return Whether the todayView field is set.
   */
  @java.lang.Override
  public boolean hasTodayView() {
    return todayView_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
   * @return The todayView.
   */
  @java.lang.Override
  public POGOProtos.Rpc.TodayViewProto getTodayView() {
    return todayView_ == null ? POGOProtos.Rpc.TodayViewProto.getDefaultInstance() : todayView_;
  }
  /**
   * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.TodayViewProtoOrBuilder getTodayViewOrBuilder() {
    return getTodayView();
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
    if (status_ != POGOProtos.Rpc.GetTodayViewOutProto.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (todayView_ != null) {
      output.writeMessage(2, getTodayView());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.GetTodayViewOutProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (todayView_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTodayView());
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
    if (!(obj instanceof POGOProtos.Rpc.GetTodayViewOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetTodayViewOutProto other = (POGOProtos.Rpc.GetTodayViewOutProto) obj;

    if (status_ != other.status_) return false;
    if (hasTodayView() != other.hasTodayView()) return false;
    if (hasTodayView()) {
      if (!getTodayView()
          .equals(other.getTodayView())) return false;
    }
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
    if (hasTodayView()) {
      hash = (37 * hash) + TODAY_VIEW_FIELD_NUMBER;
      hash = (53 * hash) + getTodayView().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetTodayViewOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetTodayViewOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetTodayViewOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetTodayViewOutProto)
      POGOProtos.Rpc.GetTodayViewOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetTodayViewOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetTodayViewOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetTodayViewOutProto.class, POGOProtos.Rpc.GetTodayViewOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetTodayViewOutProto.newBuilder()
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

      if (todayViewBuilder_ == null) {
        todayView_ = null;
      } else {
        todayView_ = null;
        todayViewBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetTodayViewOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetTodayViewOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetTodayViewOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetTodayViewOutProto build() {
      POGOProtos.Rpc.GetTodayViewOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetTodayViewOutProto buildPartial() {
      POGOProtos.Rpc.GetTodayViewOutProto result = new POGOProtos.Rpc.GetTodayViewOutProto(this);
      result.status_ = status_;
      if (todayViewBuilder_ == null) {
        result.todayView_ = todayView_;
      } else {
        result.todayView_ = todayViewBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.GetTodayViewOutProto) {
        return mergeFrom((POGOProtos.Rpc.GetTodayViewOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetTodayViewOutProto other) {
      if (other == POGOProtos.Rpc.GetTodayViewOutProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasTodayView()) {
        mergeTodayView(other.getTodayView());
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
      POGOProtos.Rpc.GetTodayViewOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetTodayViewOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.GetTodayViewOutProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.GetTodayViewOutProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetTodayViewOutProto.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GetTodayViewOutProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GetTodayViewOutProto.Status result = POGOProtos.Rpc.GetTodayViewOutProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.GetTodayViewOutProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GetTodayViewOutProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.GetTodayViewOutProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetTodayViewOutProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.TodayViewProto todayView_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.TodayViewProto, POGOProtos.Rpc.TodayViewProto.Builder, POGOProtos.Rpc.TodayViewProtoOrBuilder> todayViewBuilder_;
    /**
     * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
     * @return Whether the todayView field is set.
     */
    public boolean hasTodayView() {
      return todayViewBuilder_ != null || todayView_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
     * @return The todayView.
     */
    public POGOProtos.Rpc.TodayViewProto getTodayView() {
      if (todayViewBuilder_ == null) {
        return todayView_ == null ? POGOProtos.Rpc.TodayViewProto.getDefaultInstance() : todayView_;
      } else {
        return todayViewBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
     */
    public Builder setTodayView(POGOProtos.Rpc.TodayViewProto value) {
      if (todayViewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        todayView_ = value;
        onChanged();
      } else {
        todayViewBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
     */
    public Builder setTodayView(
        POGOProtos.Rpc.TodayViewProto.Builder builderForValue) {
      if (todayViewBuilder_ == null) {
        todayView_ = builderForValue.build();
        onChanged();
      } else {
        todayViewBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
     */
    public Builder mergeTodayView(POGOProtos.Rpc.TodayViewProto value) {
      if (todayViewBuilder_ == null) {
        if (todayView_ != null) {
          todayView_ =
            POGOProtos.Rpc.TodayViewProto.newBuilder(todayView_).mergeFrom(value).buildPartial();
        } else {
          todayView_ = value;
        }
        onChanged();
      } else {
        todayViewBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
     */
    public Builder clearTodayView() {
      if (todayViewBuilder_ == null) {
        todayView_ = null;
        onChanged();
      } else {
        todayView_ = null;
        todayViewBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
     */
    public POGOProtos.Rpc.TodayViewProto.Builder getTodayViewBuilder() {
      
      onChanged();
      return getTodayViewFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
     */
    public POGOProtos.Rpc.TodayViewProtoOrBuilder getTodayViewOrBuilder() {
      if (todayViewBuilder_ != null) {
        return todayViewBuilder_.getMessageOrBuilder();
      } else {
        return todayView_ == null ?
            POGOProtos.Rpc.TodayViewProto.getDefaultInstance() : todayView_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.TodayViewProto, POGOProtos.Rpc.TodayViewProto.Builder, POGOProtos.Rpc.TodayViewProtoOrBuilder> 
        getTodayViewFieldBuilder() {
      if (todayViewBuilder_ == null) {
        todayViewBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.TodayViewProto, POGOProtos.Rpc.TodayViewProto.Builder, POGOProtos.Rpc.TodayViewProtoOrBuilder>(
                getTodayView(),
                getParentForChildren(),
                isClean());
        todayView_ = null;
      }
      return todayViewBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetTodayViewOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetTodayViewOutProto)
  private static final POGOProtos.Rpc.GetTodayViewOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetTodayViewOutProto();
  }

  public static POGOProtos.Rpc.GetTodayViewOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTodayViewOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GetTodayViewOutProto>() {
    @java.lang.Override
    public GetTodayViewOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTodayViewOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTodayViewOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTodayViewOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetTodayViewOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

