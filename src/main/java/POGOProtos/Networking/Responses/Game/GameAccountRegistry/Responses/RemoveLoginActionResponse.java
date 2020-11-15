// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GameAccountRegistry/Responses/RemoveLoginActionResponse.proto

package POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse}
 */
public final class RemoveLoginActionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse)
    RemoveLoginActionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveLoginActionResponse.newBuilder() to construct.
  private RemoveLoginActionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveLoginActionResponse() {
    loginDetail_ = java.util.Collections.emptyList();
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveLoginActionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveLoginActionResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            success_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              loginDetail_ = new java.util.ArrayList<POGOProtos.Data.Login.LoginDetail>();
              mutable_bitField0_ |= 0x00000001;
            }
            loginDetail_.add(
                input.readMessage(POGOProtos.Data.Login.LoginDetail.parser(), extensionRegistry));
            break;
          }
          case 24: {
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        loginDetail_ = java.util.Collections.unmodifiableList(loginDetail_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GameAccountRegistry_Responses_RemoveLoginActionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GameAccountRegistry_Responses_RemoveLoginActionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.class, POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>LOGIN_NOT_REMOVABLE = 1;</code>
     */
    LOGIN_NOT_REMOVABLE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>LOGIN_NOT_REMOVABLE = 1;</code>
     */
    public static final int LOGIN_NOT_REMOVABLE_VALUE = 1;


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
        case 1: return LOGIN_NOT_REMOVABLE;
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
      return POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status)
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
  }

  public static final int LOGIN_DETAIL_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Data.Login.LoginDetail> loginDetail_;
  /**
   * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Data.Login.LoginDetail> getLoginDetailList() {
    return loginDetail_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Data.Login.LoginDetailOrBuilder> 
      getLoginDetailOrBuilderList() {
    return loginDetail_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public int getLoginDetailCount() {
    return loginDetail_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Login.LoginDetail getLoginDetail(int index) {
    return loginDetail_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Login.LoginDetailOrBuilder getLoginDetailOrBuilder(
      int index) {
    return loginDetail_.get(index);
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status status = 3;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status result = POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status.valueOf(status_);
    return result == null ? POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status.UNRECOGNIZED : result;
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    for (int i = 0; i < loginDetail_.size(); i++) {
      output.writeMessage(2, loginDetail_.get(i));
    }
    if (status_ != POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status.UNSET.getNumber()) {
      output.writeEnum(3, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    for (int i = 0; i < loginDetail_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, loginDetail_.get(i));
    }
    if (status_ != POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
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
    if (!(obj instanceof POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse other = (POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse) obj;

    if (getSuccess()
        != other.getSuccess()) return false;
    if (!getLoginDetailList()
        .equals(other.getLoginDetailList())) return false;
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    if (getLoginDetailCount() > 0) {
      hash = (37 * hash) + LOGIN_DETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getLoginDetailList().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse)
      POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GameAccountRegistry_Responses_RemoveLoginActionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GameAccountRegistry_Responses_RemoveLoginActionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.class, POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.newBuilder()
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
        getLoginDetailFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      success_ = false;

      if (loginDetailBuilder_ == null) {
        loginDetail_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        loginDetailBuilder_.clear();
      }
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GameAccountRegistry_Responses_RemoveLoginActionResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse build() {
      POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse buildPartial() {
      POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse result = new POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse(this);
      int from_bitField0_ = bitField0_;
      result.success_ = success_;
      if (loginDetailBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          loginDetail_ = java.util.Collections.unmodifiableList(loginDetail_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.loginDetail_ = loginDetail_;
      } else {
        result.loginDetail_ = loginDetailBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse other) {
      if (other == POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (loginDetailBuilder_ == null) {
        if (!other.loginDetail_.isEmpty()) {
          if (loginDetail_.isEmpty()) {
            loginDetail_ = other.loginDetail_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLoginDetailIsMutable();
            loginDetail_.addAll(other.loginDetail_);
          }
          onChanged();
        }
      } else {
        if (!other.loginDetail_.isEmpty()) {
          if (loginDetailBuilder_.isEmpty()) {
            loginDetailBuilder_.dispose();
            loginDetailBuilder_ = null;
            loginDetail_ = other.loginDetail_;
            bitField0_ = (bitField0_ & ~0x00000001);
            loginDetailBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLoginDetailFieldBuilder() : null;
          } else {
            loginDetailBuilder_.addAllMessages(other.loginDetail_);
          }
        }
      }
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
      POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean success_ ;
    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Data.Login.LoginDetail> loginDetail_ =
      java.util.Collections.emptyList();
    private void ensureLoginDetailIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        loginDetail_ = new java.util.ArrayList<POGOProtos.Data.Login.LoginDetail>(loginDetail_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Login.LoginDetail, POGOProtos.Data.Login.LoginDetail.Builder, POGOProtos.Data.Login.LoginDetailOrBuilder> loginDetailBuilder_;

    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public java.util.List<POGOProtos.Data.Login.LoginDetail> getLoginDetailList() {
      if (loginDetailBuilder_ == null) {
        return java.util.Collections.unmodifiableList(loginDetail_);
      } else {
        return loginDetailBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public int getLoginDetailCount() {
      if (loginDetailBuilder_ == null) {
        return loginDetail_.size();
      } else {
        return loginDetailBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Data.Login.LoginDetail getLoginDetail(int index) {
      if (loginDetailBuilder_ == null) {
        return loginDetail_.get(index);
      } else {
        return loginDetailBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public Builder setLoginDetail(
        int index, POGOProtos.Data.Login.LoginDetail value) {
      if (loginDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLoginDetailIsMutable();
        loginDetail_.set(index, value);
        onChanged();
      } else {
        loginDetailBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public Builder setLoginDetail(
        int index, POGOProtos.Data.Login.LoginDetail.Builder builderForValue) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        loginDetail_.set(index, builderForValue.build());
        onChanged();
      } else {
        loginDetailBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public Builder addLoginDetail(POGOProtos.Data.Login.LoginDetail value) {
      if (loginDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLoginDetailIsMutable();
        loginDetail_.add(value);
        onChanged();
      } else {
        loginDetailBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public Builder addLoginDetail(
        int index, POGOProtos.Data.Login.LoginDetail value) {
      if (loginDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLoginDetailIsMutable();
        loginDetail_.add(index, value);
        onChanged();
      } else {
        loginDetailBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public Builder addLoginDetail(
        POGOProtos.Data.Login.LoginDetail.Builder builderForValue) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        loginDetail_.add(builderForValue.build());
        onChanged();
      } else {
        loginDetailBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public Builder addLoginDetail(
        int index, POGOProtos.Data.Login.LoginDetail.Builder builderForValue) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        loginDetail_.add(index, builderForValue.build());
        onChanged();
      } else {
        loginDetailBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public Builder addAllLoginDetail(
        java.lang.Iterable<? extends POGOProtos.Data.Login.LoginDetail> values) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, loginDetail_);
        onChanged();
      } else {
        loginDetailBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public Builder clearLoginDetail() {
      if (loginDetailBuilder_ == null) {
        loginDetail_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        loginDetailBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public Builder removeLoginDetail(int index) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        loginDetail_.remove(index);
        onChanged();
      } else {
        loginDetailBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Data.Login.LoginDetail.Builder getLoginDetailBuilder(
        int index) {
      return getLoginDetailFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Data.Login.LoginDetailOrBuilder getLoginDetailOrBuilder(
        int index) {
      if (loginDetailBuilder_ == null) {
        return loginDetail_.get(index);  } else {
        return loginDetailBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Data.Login.LoginDetailOrBuilder> 
         getLoginDetailOrBuilderList() {
      if (loginDetailBuilder_ != null) {
        return loginDetailBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(loginDetail_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Data.Login.LoginDetail.Builder addLoginDetailBuilder() {
      return getLoginDetailFieldBuilder().addBuilder(
          POGOProtos.Data.Login.LoginDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Data.Login.LoginDetail.Builder addLoginDetailBuilder(
        int index) {
      return getLoginDetailFieldBuilder().addBuilder(
          index, POGOProtos.Data.Login.LoginDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Login.LoginDetail login_detail = 2;</code>
     */
    public java.util.List<POGOProtos.Data.Login.LoginDetail.Builder> 
         getLoginDetailBuilderList() {
      return getLoginDetailFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Login.LoginDetail, POGOProtos.Data.Login.LoginDetail.Builder, POGOProtos.Data.Login.LoginDetailOrBuilder> 
        getLoginDetailFieldBuilder() {
      if (loginDetailBuilder_ == null) {
        loginDetailBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Data.Login.LoginDetail, POGOProtos.Data.Login.LoginDetail.Builder, POGOProtos.Data.Login.LoginDetailOrBuilder>(
                loginDetail_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        loginDetail_ = null;
      }
      return loginDetailBuilder_;
    }

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status result = POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status.valueOf(status_);
      return result == null ? POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse.Status status = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse)
  private static final POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse();
  }

  public static POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveLoginActionResponse>
      PARSER = new com.google.protobuf.AbstractParser<RemoveLoginActionResponse>() {
    @java.lang.Override
    public RemoveLoginActionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveLoginActionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveLoginActionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveLoginActionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.Game.GameAccountRegistry.Responses.RemoveLoginActionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

