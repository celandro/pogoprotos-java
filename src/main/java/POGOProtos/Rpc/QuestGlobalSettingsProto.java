// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.QuestGlobalSettingsProto}
 */
public  final class QuestGlobalSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.QuestGlobalSettingsProto)
    QuestGlobalSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuestGlobalSettingsProto.newBuilder() to construct.
  private QuestGlobalSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuestGlobalSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuestGlobalSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuestGlobalSettingsProto(
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

            enableQuests_ = input.readBool();
            break;
          }
          case 16: {

            maxChallengeQuests_ = input.readInt32();
            break;
          }
          case 24: {

            enableShowSponsorName_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_QuestGlobalSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_QuestGlobalSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.QuestGlobalSettingsProto.class, POGOProtos.Rpc.QuestGlobalSettingsProto.Builder.class);
  }

  public static final int ENABLE_QUESTS_FIELD_NUMBER = 1;
  private boolean enableQuests_;
  /**
   * <code>bool enable_quests = 1;</code>
   * @return The enableQuests.
   */
  public boolean getEnableQuests() {
    return enableQuests_;
  }

  public static final int MAX_CHALLENGE_QUESTS_FIELD_NUMBER = 2;
  private int maxChallengeQuests_;
  /**
   * <code>int32 max_challenge_quests = 2;</code>
   * @return The maxChallengeQuests.
   */
  public int getMaxChallengeQuests() {
    return maxChallengeQuests_;
  }

  public static final int ENABLE_SHOW_SPONSOR_NAME_FIELD_NUMBER = 3;
  private boolean enableShowSponsorName_;
  /**
   * <code>bool enable_show_sponsor_name = 3;</code>
   * @return The enableShowSponsorName.
   */
  public boolean getEnableShowSponsorName() {
    return enableShowSponsorName_;
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
    if (enableQuests_ != false) {
      output.writeBool(1, enableQuests_);
    }
    if (maxChallengeQuests_ != 0) {
      output.writeInt32(2, maxChallengeQuests_);
    }
    if (enableShowSponsorName_ != false) {
      output.writeBool(3, enableShowSponsorName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableQuests_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableQuests_);
    }
    if (maxChallengeQuests_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxChallengeQuests_);
    }
    if (enableShowSponsorName_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enableShowSponsorName_);
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
    if (!(obj instanceof POGOProtos.Rpc.QuestGlobalSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.QuestGlobalSettingsProto other = (POGOProtos.Rpc.QuestGlobalSettingsProto) obj;

    if (getEnableQuests()
        != other.getEnableQuests()) return false;
    if (getMaxChallengeQuests()
        != other.getMaxChallengeQuests()) return false;
    if (getEnableShowSponsorName()
        != other.getEnableShowSponsorName()) return false;
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
    hash = (37 * hash) + ENABLE_QUESTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableQuests());
    hash = (37 * hash) + MAX_CHALLENGE_QUESTS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxChallengeQuests();
    hash = (37 * hash) + ENABLE_SHOW_SPONSOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableShowSponsorName());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.QuestGlobalSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.QuestGlobalSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.QuestGlobalSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.QuestGlobalSettingsProto)
      POGOProtos.Rpc.QuestGlobalSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_QuestGlobalSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_QuestGlobalSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.QuestGlobalSettingsProto.class, POGOProtos.Rpc.QuestGlobalSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.QuestGlobalSettingsProto.newBuilder()
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
      enableQuests_ = false;

      maxChallengeQuests_ = 0;

      enableShowSponsorName_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_QuestGlobalSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.QuestGlobalSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.QuestGlobalSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.QuestGlobalSettingsProto build() {
      POGOProtos.Rpc.QuestGlobalSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.QuestGlobalSettingsProto buildPartial() {
      POGOProtos.Rpc.QuestGlobalSettingsProto result = new POGOProtos.Rpc.QuestGlobalSettingsProto(this);
      result.enableQuests_ = enableQuests_;
      result.maxChallengeQuests_ = maxChallengeQuests_;
      result.enableShowSponsorName_ = enableShowSponsorName_;
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
      if (other instanceof POGOProtos.Rpc.QuestGlobalSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.QuestGlobalSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.QuestGlobalSettingsProto other) {
      if (other == POGOProtos.Rpc.QuestGlobalSettingsProto.getDefaultInstance()) return this;
      if (other.getEnableQuests() != false) {
        setEnableQuests(other.getEnableQuests());
      }
      if (other.getMaxChallengeQuests() != 0) {
        setMaxChallengeQuests(other.getMaxChallengeQuests());
      }
      if (other.getEnableShowSponsorName() != false) {
        setEnableShowSponsorName(other.getEnableShowSponsorName());
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
      POGOProtos.Rpc.QuestGlobalSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.QuestGlobalSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableQuests_ ;
    /**
     * <code>bool enable_quests = 1;</code>
     * @return The enableQuests.
     */
    public boolean getEnableQuests() {
      return enableQuests_;
    }
    /**
     * <code>bool enable_quests = 1;</code>
     * @param value The enableQuests to set.
     * @return This builder for chaining.
     */
    public Builder setEnableQuests(boolean value) {
      
      enableQuests_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_quests = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableQuests() {
      
      enableQuests_ = false;
      onChanged();
      return this;
    }

    private int maxChallengeQuests_ ;
    /**
     * <code>int32 max_challenge_quests = 2;</code>
     * @return The maxChallengeQuests.
     */
    public int getMaxChallengeQuests() {
      return maxChallengeQuests_;
    }
    /**
     * <code>int32 max_challenge_quests = 2;</code>
     * @param value The maxChallengeQuests to set.
     * @return This builder for chaining.
     */
    public Builder setMaxChallengeQuests(int value) {
      
      maxChallengeQuests_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_challenge_quests = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxChallengeQuests() {
      
      maxChallengeQuests_ = 0;
      onChanged();
      return this;
    }

    private boolean enableShowSponsorName_ ;
    /**
     * <code>bool enable_show_sponsor_name = 3;</code>
     * @return The enableShowSponsorName.
     */
    public boolean getEnableShowSponsorName() {
      return enableShowSponsorName_;
    }
    /**
     * <code>bool enable_show_sponsor_name = 3;</code>
     * @param value The enableShowSponsorName to set.
     * @return This builder for chaining.
     */
    public Builder setEnableShowSponsorName(boolean value) {
      
      enableShowSponsorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_show_sponsor_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableShowSponsorName() {
      
      enableShowSponsorName_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.QuestGlobalSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.QuestGlobalSettingsProto)
  private static final POGOProtos.Rpc.QuestGlobalSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.QuestGlobalSettingsProto();
  }

  public static POGOProtos.Rpc.QuestGlobalSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuestGlobalSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<QuestGlobalSettingsProto>() {
    @java.lang.Override
    public QuestGlobalSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuestGlobalSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuestGlobalSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuestGlobalSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.QuestGlobalSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
