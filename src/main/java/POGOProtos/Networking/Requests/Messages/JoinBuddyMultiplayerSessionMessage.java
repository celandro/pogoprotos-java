// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/JoinBuddyMultiplayerSessionMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage}
 */
public  final class JoinBuddyMultiplayerSessionMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage)
    JoinBuddyMultiplayerSessionMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JoinBuddyMultiplayerSessionMessage.newBuilder() to construct.
  private JoinBuddyMultiplayerSessionMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinBuddyMultiplayerSessionMessage() {
    plfeSessionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JoinBuddyMultiplayerSessionMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JoinBuddyMultiplayerSessionMessage(
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

            plfeSessionId_ = s;
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
    return POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_JoinBuddyMultiplayerSessionMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_JoinBuddyMultiplayerSessionMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage.class, POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage.Builder.class);
  }

  public static final int PLFE_SESSION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object plfeSessionId_;
  /**
   * <code>string plfe_session_id = 1;</code>
   * @return The plfeSessionId.
   */
  public java.lang.String getPlfeSessionId() {
    java.lang.Object ref = plfeSessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plfeSessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string plfe_session_id = 1;</code>
   * @return The bytes for plfeSessionId.
   */
  public com.google.protobuf.ByteString
      getPlfeSessionIdBytes() {
    java.lang.Object ref = plfeSessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plfeSessionId_ = b;
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
    if (!getPlfeSessionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, plfeSessionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPlfeSessionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, plfeSessionId_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage other = (POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage) obj;

    if (!getPlfeSessionId()
        .equals(other.getPlfeSessionId())) return false;
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
    hash = (37 * hash) + PLFE_SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPlfeSessionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage)
      POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_JoinBuddyMultiplayerSessionMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_JoinBuddyMultiplayerSessionMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage.class, POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage.newBuilder()
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
      plfeSessionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_JoinBuddyMultiplayerSessionMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage build() {
      POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage result = new POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage(this);
      result.plfeSessionId_ = plfeSessionId_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage.getDefaultInstance()) return this;
      if (!other.getPlfeSessionId().isEmpty()) {
        plfeSessionId_ = other.plfeSessionId_;
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
      POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object plfeSessionId_ = "";
    /**
     * <code>string plfe_session_id = 1;</code>
     * @return The plfeSessionId.
     */
    public java.lang.String getPlfeSessionId() {
      java.lang.Object ref = plfeSessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plfeSessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string plfe_session_id = 1;</code>
     * @return The bytes for plfeSessionId.
     */
    public com.google.protobuf.ByteString
        getPlfeSessionIdBytes() {
      java.lang.Object ref = plfeSessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plfeSessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string plfe_session_id = 1;</code>
     * @param value The plfeSessionId to set.
     * @return This builder for chaining.
     */
    public Builder setPlfeSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      plfeSessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string plfe_session_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlfeSessionId() {
      
      plfeSessionId_ = getDefaultInstance().getPlfeSessionId();
      onChanged();
      return this;
    }
    /**
     * <code>string plfe_session_id = 1;</code>
     * @param value The bytes for plfeSessionId to set.
     * @return This builder for chaining.
     */
    public Builder setPlfeSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      plfeSessionId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage)
  private static final POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinBuddyMultiplayerSessionMessage>
      PARSER = new com.google.protobuf.AbstractParser<JoinBuddyMultiplayerSessionMessage>() {
    @java.lang.Override
    public JoinBuddyMultiplayerSessionMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JoinBuddyMultiplayerSessionMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JoinBuddyMultiplayerSessionMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinBuddyMultiplayerSessionMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.JoinBuddyMultiplayerSessionMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

