// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto}
 */
public  final class PlatformInviteFacebookFriendOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto)
    PlatformInviteFacebookFriendOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformInviteFacebookFriendOutProto.newBuilder() to construct.
  private PlatformInviteFacebookFriendOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformInviteFacebookFriendOutProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformInviteFacebookFriendOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformInviteFacebookFriendOutProto(
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.class, POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.Result}
   */
  public enum Result
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    ERROR_UNKNOWN(2),
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 3;</code>
     */
    ERROR_PLAYER_NOT_FOUND(3),
    /**
     * <code>ERROR_PLAYER_OUTBOX_FULL = 4;</code>
     */
    ERROR_PLAYER_OUTBOX_FULL(4),
    /**
     * <code>ERROR_PLAYER_INBOX_FULL = 5;</code>
     */
    ERROR_PLAYER_INBOX_FULL(5),
    /**
     * <code>ERROR_SENDER_HAS_MAX_FRIENDS = 6;</code>
     */
    ERROR_SENDER_HAS_MAX_FRIENDS(6),
    /**
     * <code>ERROR_RECEIVER_HAS_MAX_FRIENDS = 7;</code>
     */
    ERROR_RECEIVER_HAS_MAX_FRIENDS(7),
    /**
     * <code>ERROR_ALREADY_A_FRIEND = 8;</code>
     */
    ERROR_ALREADY_A_FRIEND(8),
    /**
     * <code>ERROR_INVITE_ALREADY_SENT = 9;</code>
     */
    ERROR_INVITE_ALREADY_SENT(9),
    /**
     * <code>ERROR_INVITE_ALREADY_RECEIVED = 10;</code>
     */
    ERROR_INVITE_ALREADY_RECEIVED(10),
    /**
     * <code>ERROR_CANNOT_SEND_INVITES_TO_YOURSELF = 11;</code>
     */
    ERROR_CANNOT_SEND_INVITES_TO_YOURSELF(11),
    /**
     * <code>ERROR_FRIEND_CACHE_EXPIRED = 12;</code>
     */
    ERROR_FRIEND_CACHE_EXPIRED(12),
    /**
     * <code>ERROR_FRIEND_NOT_CACHED = 13;</code>
     */
    ERROR_FRIEND_NOT_CACHED(13),
    /**
     * <code>ERROR_INVALID_SENDER_FACEBOOK_ID = 14;</code>
     */
    ERROR_INVALID_SENDER_FACEBOOK_ID(14),
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 2;
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_PLAYER_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_PLAYER_OUTBOX_FULL = 4;</code>
     */
    public static final int ERROR_PLAYER_OUTBOX_FULL_VALUE = 4;
    /**
     * <code>ERROR_PLAYER_INBOX_FULL = 5;</code>
     */
    public static final int ERROR_PLAYER_INBOX_FULL_VALUE = 5;
    /**
     * <code>ERROR_SENDER_HAS_MAX_FRIENDS = 6;</code>
     */
    public static final int ERROR_SENDER_HAS_MAX_FRIENDS_VALUE = 6;
    /**
     * <code>ERROR_RECEIVER_HAS_MAX_FRIENDS = 7;</code>
     */
    public static final int ERROR_RECEIVER_HAS_MAX_FRIENDS_VALUE = 7;
    /**
     * <code>ERROR_ALREADY_A_FRIEND = 8;</code>
     */
    public static final int ERROR_ALREADY_A_FRIEND_VALUE = 8;
    /**
     * <code>ERROR_INVITE_ALREADY_SENT = 9;</code>
     */
    public static final int ERROR_INVITE_ALREADY_SENT_VALUE = 9;
    /**
     * <code>ERROR_INVITE_ALREADY_RECEIVED = 10;</code>
     */
    public static final int ERROR_INVITE_ALREADY_RECEIVED_VALUE = 10;
    /**
     * <code>ERROR_CANNOT_SEND_INVITES_TO_YOURSELF = 11;</code>
     */
    public static final int ERROR_CANNOT_SEND_INVITES_TO_YOURSELF_VALUE = 11;
    /**
     * <code>ERROR_FRIEND_CACHE_EXPIRED = 12;</code>
     */
    public static final int ERROR_FRIEND_CACHE_EXPIRED_VALUE = 12;
    /**
     * <code>ERROR_FRIEND_NOT_CACHED = 13;</code>
     */
    public static final int ERROR_FRIEND_NOT_CACHED_VALUE = 13;
    /**
     * <code>ERROR_INVALID_SENDER_FACEBOOK_ID = 14;</code>
     */
    public static final int ERROR_INVALID_SENDER_FACEBOOK_ID_VALUE = 14;


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
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_UNKNOWN;
        case 3: return ERROR_PLAYER_NOT_FOUND;
        case 4: return ERROR_PLAYER_OUTBOX_FULL;
        case 5: return ERROR_PLAYER_INBOX_FULL;
        case 6: return ERROR_SENDER_HAS_MAX_FRIENDS;
        case 7: return ERROR_RECEIVER_HAS_MAX_FRIENDS;
        case 8: return ERROR_ALREADY_A_FRIEND;
        case 9: return ERROR_INVITE_ALREADY_SENT;
        case 10: return ERROR_INVITE_ALREADY_RECEIVED;
        case 11: return ERROR_CANNOT_SEND_INVITES_TO_YOURSELF;
        case 12: return ERROR_FRIEND_CACHE_EXPIRED;
        case 13: return ERROR_FRIEND_NOT_CACHED;
        case 14: return ERROR_INVALID_SENDER_FACEBOOK_ID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
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
      return POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
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

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.Result)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto other = (POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto)
      POGOProtos.Rpc.PlatformInviteFacebookFriendOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.class, POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformInviteFacebookFriendOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto build() {
      POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto buildPartial() {
      POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto result = new POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto(this);
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
      if (other instanceof POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto) {
        return mergeFrom((POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto other) {
      if (other == POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto.getDefaultInstance()) return this;
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
      POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto)
  private static final POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto();
  }

  public static POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformInviteFacebookFriendOutProto>
      PARSER = new com.google.protobuf.AbstractParser<PlatformInviteFacebookFriendOutProto>() {
    @java.lang.Override
    public PlatformInviteFacebookFriendOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformInviteFacebookFriendOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformInviteFacebookFriendOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformInviteFacebookFriendOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformInviteFacebookFriendOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
