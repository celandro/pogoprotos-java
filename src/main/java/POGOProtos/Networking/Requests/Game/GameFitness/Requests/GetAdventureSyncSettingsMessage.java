// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameFitness/Requests/GetAdventureSyncSettingsMessage.proto

package POGOProtos.Networking.Requests.Game.GameFitness.Requests;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage}
 */
public final class GetAdventureSyncSettingsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage)
    GetAdventureSyncSettingsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAdventureSyncSettingsMessage.newBuilder() to construct.
  private GetAdventureSyncSettingsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAdventureSyncSettingsMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAdventureSyncSettingsMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAdventureSyncSettingsMessage(
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
    return POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameFitness_Requests_GetAdventureSyncSettingsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameFitness_Requests_GetAdventureSyncSettingsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage.class, POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage.Builder.class);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage other = (POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage) obj;

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

  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage)
      POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameFitness_Requests_GetAdventureSyncSettingsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameFitness_Requests_GetAdventureSyncSettingsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage.class, POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage.newBuilder()
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
      return POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameFitness_Requests_GetAdventureSyncSettingsMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage build() {
      POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage buildPartial() {
      POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage result = new POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage(this);
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
      if (other instanceof POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage other) {
      if (other == POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage.getDefaultInstance()) return this;
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
      POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage)
  private static final POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage();
  }

  public static POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAdventureSyncSettingsMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetAdventureSyncSettingsMessage>() {
    @java.lang.Override
    public GetAdventureSyncSettingsMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAdventureSyncSettingsMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAdventureSyncSettingsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAdventureSyncSettingsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Game.GameFitness.Requests.GetAdventureSyncSettingsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

