// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetCombatChallengeMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage}
 */
public final class GetCombatChallengeMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage)
    GetCombatChallengeMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCombatChallengeMessage.newBuilder() to construct.
  private GetCombatChallengeMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCombatChallengeMessage() {
    challengeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCombatChallengeMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCombatChallengeMessage(
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

            challengeId_ = s;
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
    return POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetCombatChallengeMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetCombatChallengeMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage.class, POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage.Builder.class);
  }

  public static final int CHALLENGE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object challengeId_;
  /**
   * <code>string challenge_id = 1;</code>
   * @return The challengeId.
   */
  @java.lang.Override
  public java.lang.String getChallengeId() {
    java.lang.Object ref = challengeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      challengeId_ = s;
      return s;
    }
  }
  /**
   * <code>string challenge_id = 1;</code>
   * @return The bytes for challengeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChallengeIdBytes() {
    java.lang.Object ref = challengeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      challengeId_ = b;
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
    if (!getChallengeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, challengeId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getChallengeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, challengeId_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage other = (POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage) obj;

    if (!getChallengeId()
        .equals(other.getChallengeId())) return false;
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
    hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChallengeId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage)
      POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetCombatChallengeMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetCombatChallengeMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage.class, POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage.newBuilder()
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
      challengeId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetCombatChallengeMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage build() {
      POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage result = new POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage(this);
      result.challengeId_ = challengeId_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage.getDefaultInstance()) return this;
      if (!other.getChallengeId().isEmpty()) {
        challengeId_ = other.challengeId_;
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
      POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object challengeId_ = "";
    /**
     * <code>string challenge_id = 1;</code>
     * @return The challengeId.
     */
    public java.lang.String getChallengeId() {
      java.lang.Object ref = challengeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        challengeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string challenge_id = 1;</code>
     * @return The bytes for challengeId.
     */
    public com.google.protobuf.ByteString
        getChallengeIdBytes() {
      java.lang.Object ref = challengeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        challengeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string challenge_id = 1;</code>
     * @param value The challengeId to set.
     * @return This builder for chaining.
     */
    public Builder setChallengeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      challengeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string challenge_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChallengeId() {
      
      challengeId_ = getDefaultInstance().getChallengeId();
      onChanged();
      return this;
    }
    /**
     * <code>string challenge_id = 1;</code>
     * @param value The bytes for challengeId to set.
     * @return This builder for chaining.
     */
    public Builder setChallengeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      challengeId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage)
  private static final POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCombatChallengeMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetCombatChallengeMessage>() {
    @java.lang.Override
    public GetCombatChallengeMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCombatChallengeMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCombatChallengeMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCombatChallengeMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.GetCombatChallengeMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

