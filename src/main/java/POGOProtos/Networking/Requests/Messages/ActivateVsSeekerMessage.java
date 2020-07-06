// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/ActivateVsSeekerMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage}
 */
public  final class ActivateVsSeekerMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage)
    ActivateVsSeekerMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ActivateVsSeekerMessage.newBuilder() to construct.
  private ActivateVsSeekerMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActivateVsSeekerMessage() {
    rewardTrack_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ActivateVsSeekerMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ActivateVsSeekerMessage(
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

            rewardTrack_ = rawValue;
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
    return POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ActivateVsSeekerMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ActivateVsSeekerMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage.class, POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage.Builder.class);
  }

  public static final int REWARD_TRACK_FIELD_NUMBER = 1;
  private int rewardTrack_;
  /**
   * <code>.POGOProtos.Data.VsSeeker.VsSeekerRewardTrack reward_track = 1;</code>
   * @return The enum numeric value on the wire for rewardTrack.
   */
  public int getRewardTrackValue() {
    return rewardTrack_;
  }
  /**
   * <code>.POGOProtos.Data.VsSeeker.VsSeekerRewardTrack reward_track = 1;</code>
   * @return The rewardTrack.
   */
  public POGOProtos.Data.VsSeeker.VsSeekerRewardTrack getRewardTrack() {
    @SuppressWarnings("deprecation")
    POGOProtos.Data.VsSeeker.VsSeekerRewardTrack result = POGOProtos.Data.VsSeeker.VsSeekerRewardTrack.valueOf(rewardTrack_);
    return result == null ? POGOProtos.Data.VsSeeker.VsSeekerRewardTrack.UNRECOGNIZED : result;
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
    if (rewardTrack_ != POGOProtos.Data.VsSeeker.VsSeekerRewardTrack.FREE.getNumber()) {
      output.writeEnum(1, rewardTrack_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rewardTrack_ != POGOProtos.Data.VsSeeker.VsSeekerRewardTrack.FREE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, rewardTrack_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage other = (POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage) obj;

    if (rewardTrack_ != other.rewardTrack_) return false;
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
    hash = (37 * hash) + REWARD_TRACK_FIELD_NUMBER;
    hash = (53 * hash) + rewardTrack_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage)
      POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ActivateVsSeekerMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ActivateVsSeekerMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage.class, POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage.newBuilder()
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
      rewardTrack_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ActivateVsSeekerMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage build() {
      POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage result = new POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage(this);
      result.rewardTrack_ = rewardTrack_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage.getDefaultInstance()) return this;
      if (other.rewardTrack_ != 0) {
        setRewardTrackValue(other.getRewardTrackValue());
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
      POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int rewardTrack_ = 0;
    /**
     * <code>.POGOProtos.Data.VsSeeker.VsSeekerRewardTrack reward_track = 1;</code>
     * @return The enum numeric value on the wire for rewardTrack.
     */
    public int getRewardTrackValue() {
      return rewardTrack_;
    }
    /**
     * <code>.POGOProtos.Data.VsSeeker.VsSeekerRewardTrack reward_track = 1;</code>
     * @param value The enum numeric value on the wire for rewardTrack to set.
     * @return This builder for chaining.
     */
    public Builder setRewardTrackValue(int value) {
      rewardTrack_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.VsSeeker.VsSeekerRewardTrack reward_track = 1;</code>
     * @return The rewardTrack.
     */
    public POGOProtos.Data.VsSeeker.VsSeekerRewardTrack getRewardTrack() {
      @SuppressWarnings("deprecation")
      POGOProtos.Data.VsSeeker.VsSeekerRewardTrack result = POGOProtos.Data.VsSeeker.VsSeekerRewardTrack.valueOf(rewardTrack_);
      return result == null ? POGOProtos.Data.VsSeeker.VsSeekerRewardTrack.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Data.VsSeeker.VsSeekerRewardTrack reward_track = 1;</code>
     * @param value The rewardTrack to set.
     * @return This builder for chaining.
     */
    public Builder setRewardTrack(POGOProtos.Data.VsSeeker.VsSeekerRewardTrack value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      rewardTrack_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.VsSeeker.VsSeekerRewardTrack reward_track = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardTrack() {
      
      rewardTrack_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage)
  private static final POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActivateVsSeekerMessage>
      PARSER = new com.google.protobuf.AbstractParser<ActivateVsSeekerMessage>() {
    @java.lang.Override
    public ActivateVsSeekerMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ActivateVsSeekerMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ActivateVsSeekerMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActivateVsSeekerMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.ActivateVsSeekerMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

