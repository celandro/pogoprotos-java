// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TimedGroupChallengeDefinitionProto}
 */
public final class TimedGroupChallengeDefinitionProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TimedGroupChallengeDefinitionProto)
    TimedGroupChallengeDefinitionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimedGroupChallengeDefinitionProto.newBuilder() to construct.
  private TimedGroupChallengeDefinitionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimedGroupChallengeDefinitionProto() {
    challengeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimedGroupChallengeDefinitionProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TimedGroupChallengeDefinitionProto(
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
          case 18: {
            POGOProtos.Rpc.GroupChallengeDisplayProto.Builder subBuilder = null;
            if (display_ != null) {
              subBuilder = display_.toBuilder();
            }
            display_ = input.readMessage(POGOProtos.Rpc.GroupChallengeDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(display_);
              display_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            startTimeMsInclusive_ = input.readInt64();
            break;
          }
          case 32: {

            endTimeMsExclusive_ = input.readInt64();
            break;
          }
          case 42: {
            POGOProtos.Rpc.GroupChallengeCriteriaProto.Builder subBuilder = null;
            if (challengeCriteria_ != null) {
              subBuilder = challengeCriteria_.toBuilder();
            }
            challengeCriteria_ = input.readMessage(POGOProtos.Rpc.GroupChallengeCriteriaProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(challengeCriteria_);
              challengeCriteria_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TimedGroupChallengeDefinitionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TimedGroupChallengeDefinitionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TimedGroupChallengeDefinitionProto.class, POGOProtos.Rpc.TimedGroupChallengeDefinitionProto.Builder.class);
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

  public static final int DISPLAY_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.GroupChallengeDisplayProto display_;
  /**
   * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
   * @return Whether the display field is set.
   */
  @java.lang.Override
  public boolean hasDisplay() {
    return display_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
   * @return The display.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GroupChallengeDisplayProto getDisplay() {
    return display_ == null ? POGOProtos.Rpc.GroupChallengeDisplayProto.getDefaultInstance() : display_;
  }
  /**
   * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GroupChallengeDisplayProtoOrBuilder getDisplayOrBuilder() {
    return getDisplay();
  }

  public static final int START_TIME_MS_INCLUSIVE_FIELD_NUMBER = 3;
  private long startTimeMsInclusive_;
  /**
   * <code>int64 start_time_ms_inclusive = 3;</code>
   * @return The startTimeMsInclusive.
   */
  @java.lang.Override
  public long getStartTimeMsInclusive() {
    return startTimeMsInclusive_;
  }

  public static final int END_TIME_MS_EXCLUSIVE_FIELD_NUMBER = 4;
  private long endTimeMsExclusive_;
  /**
   * <code>int64 end_time_ms_exclusive = 4;</code>
   * @return The endTimeMsExclusive.
   */
  @java.lang.Override
  public long getEndTimeMsExclusive() {
    return endTimeMsExclusive_;
  }

  public static final int CHALLENGE_CRITERIA_FIELD_NUMBER = 5;
  private POGOProtos.Rpc.GroupChallengeCriteriaProto challengeCriteria_;
  /**
   * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
   * @return Whether the challengeCriteria field is set.
   */
  @java.lang.Override
  public boolean hasChallengeCriteria() {
    return challengeCriteria_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
   * @return The challengeCriteria.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GroupChallengeCriteriaProto getChallengeCriteria() {
    return challengeCriteria_ == null ? POGOProtos.Rpc.GroupChallengeCriteriaProto.getDefaultInstance() : challengeCriteria_;
  }
  /**
   * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GroupChallengeCriteriaProtoOrBuilder getChallengeCriteriaOrBuilder() {
    return getChallengeCriteria();
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
    if (display_ != null) {
      output.writeMessage(2, getDisplay());
    }
    if (startTimeMsInclusive_ != 0L) {
      output.writeInt64(3, startTimeMsInclusive_);
    }
    if (endTimeMsExclusive_ != 0L) {
      output.writeInt64(4, endTimeMsExclusive_);
    }
    if (challengeCriteria_ != null) {
      output.writeMessage(5, getChallengeCriteria());
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
    if (display_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDisplay());
    }
    if (startTimeMsInclusive_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, startTimeMsInclusive_);
    }
    if (endTimeMsExclusive_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, endTimeMsExclusive_);
    }
    if (challengeCriteria_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getChallengeCriteria());
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
    if (!(obj instanceof POGOProtos.Rpc.TimedGroupChallengeDefinitionProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TimedGroupChallengeDefinitionProto other = (POGOProtos.Rpc.TimedGroupChallengeDefinitionProto) obj;

    if (!getChallengeId()
        .equals(other.getChallengeId())) return false;
    if (hasDisplay() != other.hasDisplay()) return false;
    if (hasDisplay()) {
      if (!getDisplay()
          .equals(other.getDisplay())) return false;
    }
    if (getStartTimeMsInclusive()
        != other.getStartTimeMsInclusive()) return false;
    if (getEndTimeMsExclusive()
        != other.getEndTimeMsExclusive()) return false;
    if (hasChallengeCriteria() != other.hasChallengeCriteria()) return false;
    if (hasChallengeCriteria()) {
      if (!getChallengeCriteria()
          .equals(other.getChallengeCriteria())) return false;
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
    hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChallengeId().hashCode();
    if (hasDisplay()) {
      hash = (37 * hash) + DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getDisplay().hashCode();
    }
    hash = (37 * hash) + START_TIME_MS_INCLUSIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTimeMsInclusive());
    hash = (37 * hash) + END_TIME_MS_EXCLUSIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndTimeMsExclusive());
    if (hasChallengeCriteria()) {
      hash = (37 * hash) + CHALLENGE_CRITERIA_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeCriteria().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TimedGroupChallengeDefinitionProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.TimedGroupChallengeDefinitionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TimedGroupChallengeDefinitionProto)
      POGOProtos.Rpc.TimedGroupChallengeDefinitionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TimedGroupChallengeDefinitionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TimedGroupChallengeDefinitionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TimedGroupChallengeDefinitionProto.class, POGOProtos.Rpc.TimedGroupChallengeDefinitionProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TimedGroupChallengeDefinitionProto.newBuilder()
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

      if (displayBuilder_ == null) {
        display_ = null;
      } else {
        display_ = null;
        displayBuilder_ = null;
      }
      startTimeMsInclusive_ = 0L;

      endTimeMsExclusive_ = 0L;

      if (challengeCriteriaBuilder_ == null) {
        challengeCriteria_ = null;
      } else {
        challengeCriteria_ = null;
        challengeCriteriaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TimedGroupChallengeDefinitionProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TimedGroupChallengeDefinitionProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TimedGroupChallengeDefinitionProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TimedGroupChallengeDefinitionProto build() {
      POGOProtos.Rpc.TimedGroupChallengeDefinitionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TimedGroupChallengeDefinitionProto buildPartial() {
      POGOProtos.Rpc.TimedGroupChallengeDefinitionProto result = new POGOProtos.Rpc.TimedGroupChallengeDefinitionProto(this);
      result.challengeId_ = challengeId_;
      if (displayBuilder_ == null) {
        result.display_ = display_;
      } else {
        result.display_ = displayBuilder_.build();
      }
      result.startTimeMsInclusive_ = startTimeMsInclusive_;
      result.endTimeMsExclusive_ = endTimeMsExclusive_;
      if (challengeCriteriaBuilder_ == null) {
        result.challengeCriteria_ = challengeCriteria_;
      } else {
        result.challengeCriteria_ = challengeCriteriaBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.TimedGroupChallengeDefinitionProto) {
        return mergeFrom((POGOProtos.Rpc.TimedGroupChallengeDefinitionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TimedGroupChallengeDefinitionProto other) {
      if (other == POGOProtos.Rpc.TimedGroupChallengeDefinitionProto.getDefaultInstance()) return this;
      if (!other.getChallengeId().isEmpty()) {
        challengeId_ = other.challengeId_;
        onChanged();
      }
      if (other.hasDisplay()) {
        mergeDisplay(other.getDisplay());
      }
      if (other.getStartTimeMsInclusive() != 0L) {
        setStartTimeMsInclusive(other.getStartTimeMsInclusive());
      }
      if (other.getEndTimeMsExclusive() != 0L) {
        setEndTimeMsExclusive(other.getEndTimeMsExclusive());
      }
      if (other.hasChallengeCriteria()) {
        mergeChallengeCriteria(other.getChallengeCriteria());
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
      POGOProtos.Rpc.TimedGroupChallengeDefinitionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TimedGroupChallengeDefinitionProto) e.getUnfinishedMessage();
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

    private POGOProtos.Rpc.GroupChallengeDisplayProto display_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GroupChallengeDisplayProto, POGOProtos.Rpc.GroupChallengeDisplayProto.Builder, POGOProtos.Rpc.GroupChallengeDisplayProtoOrBuilder> displayBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
     * @return Whether the display field is set.
     */
    public boolean hasDisplay() {
      return displayBuilder_ != null || display_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
     * @return The display.
     */
    public POGOProtos.Rpc.GroupChallengeDisplayProto getDisplay() {
      if (displayBuilder_ == null) {
        return display_ == null ? POGOProtos.Rpc.GroupChallengeDisplayProto.getDefaultInstance() : display_;
      } else {
        return displayBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
     */
    public Builder setDisplay(POGOProtos.Rpc.GroupChallengeDisplayProto value) {
      if (displayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        display_ = value;
        onChanged();
      } else {
        displayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
     */
    public Builder setDisplay(
        POGOProtos.Rpc.GroupChallengeDisplayProto.Builder builderForValue) {
      if (displayBuilder_ == null) {
        display_ = builderForValue.build();
        onChanged();
      } else {
        displayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
     */
    public Builder mergeDisplay(POGOProtos.Rpc.GroupChallengeDisplayProto value) {
      if (displayBuilder_ == null) {
        if (display_ != null) {
          display_ =
            POGOProtos.Rpc.GroupChallengeDisplayProto.newBuilder(display_).mergeFrom(value).buildPartial();
        } else {
          display_ = value;
        }
        onChanged();
      } else {
        displayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
     */
    public Builder clearDisplay() {
      if (displayBuilder_ == null) {
        display_ = null;
        onChanged();
      } else {
        display_ = null;
        displayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
     */
    public POGOProtos.Rpc.GroupChallengeDisplayProto.Builder getDisplayBuilder() {
      
      onChanged();
      return getDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
     */
    public POGOProtos.Rpc.GroupChallengeDisplayProtoOrBuilder getDisplayOrBuilder() {
      if (displayBuilder_ != null) {
        return displayBuilder_.getMessageOrBuilder();
      } else {
        return display_ == null ?
            POGOProtos.Rpc.GroupChallengeDisplayProto.getDefaultInstance() : display_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeDisplayProto display = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GroupChallengeDisplayProto, POGOProtos.Rpc.GroupChallengeDisplayProto.Builder, POGOProtos.Rpc.GroupChallengeDisplayProtoOrBuilder> 
        getDisplayFieldBuilder() {
      if (displayBuilder_ == null) {
        displayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GroupChallengeDisplayProto, POGOProtos.Rpc.GroupChallengeDisplayProto.Builder, POGOProtos.Rpc.GroupChallengeDisplayProtoOrBuilder>(
                getDisplay(),
                getParentForChildren(),
                isClean());
        display_ = null;
      }
      return displayBuilder_;
    }

    private long startTimeMsInclusive_ ;
    /**
     * <code>int64 start_time_ms_inclusive = 3;</code>
     * @return The startTimeMsInclusive.
     */
    @java.lang.Override
    public long getStartTimeMsInclusive() {
      return startTimeMsInclusive_;
    }
    /**
     * <code>int64 start_time_ms_inclusive = 3;</code>
     * @param value The startTimeMsInclusive to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeMsInclusive(long value) {
      
      startTimeMsInclusive_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 start_time_ms_inclusive = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTimeMsInclusive() {
      
      startTimeMsInclusive_ = 0L;
      onChanged();
      return this;
    }

    private long endTimeMsExclusive_ ;
    /**
     * <code>int64 end_time_ms_exclusive = 4;</code>
     * @return The endTimeMsExclusive.
     */
    @java.lang.Override
    public long getEndTimeMsExclusive() {
      return endTimeMsExclusive_;
    }
    /**
     * <code>int64 end_time_ms_exclusive = 4;</code>
     * @param value The endTimeMsExclusive to set.
     * @return This builder for chaining.
     */
    public Builder setEndTimeMsExclusive(long value) {
      
      endTimeMsExclusive_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 end_time_ms_exclusive = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTimeMsExclusive() {
      
      endTimeMsExclusive_ = 0L;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.GroupChallengeCriteriaProto challengeCriteria_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GroupChallengeCriteriaProto, POGOProtos.Rpc.GroupChallengeCriteriaProto.Builder, POGOProtos.Rpc.GroupChallengeCriteriaProtoOrBuilder> challengeCriteriaBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
     * @return Whether the challengeCriteria field is set.
     */
    public boolean hasChallengeCriteria() {
      return challengeCriteriaBuilder_ != null || challengeCriteria_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
     * @return The challengeCriteria.
     */
    public POGOProtos.Rpc.GroupChallengeCriteriaProto getChallengeCriteria() {
      if (challengeCriteriaBuilder_ == null) {
        return challengeCriteria_ == null ? POGOProtos.Rpc.GroupChallengeCriteriaProto.getDefaultInstance() : challengeCriteria_;
      } else {
        return challengeCriteriaBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
     */
    public Builder setChallengeCriteria(POGOProtos.Rpc.GroupChallengeCriteriaProto value) {
      if (challengeCriteriaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        challengeCriteria_ = value;
        onChanged();
      } else {
        challengeCriteriaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
     */
    public Builder setChallengeCriteria(
        POGOProtos.Rpc.GroupChallengeCriteriaProto.Builder builderForValue) {
      if (challengeCriteriaBuilder_ == null) {
        challengeCriteria_ = builderForValue.build();
        onChanged();
      } else {
        challengeCriteriaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
     */
    public Builder mergeChallengeCriteria(POGOProtos.Rpc.GroupChallengeCriteriaProto value) {
      if (challengeCriteriaBuilder_ == null) {
        if (challengeCriteria_ != null) {
          challengeCriteria_ =
            POGOProtos.Rpc.GroupChallengeCriteriaProto.newBuilder(challengeCriteria_).mergeFrom(value).buildPartial();
        } else {
          challengeCriteria_ = value;
        }
        onChanged();
      } else {
        challengeCriteriaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
     */
    public Builder clearChallengeCriteria() {
      if (challengeCriteriaBuilder_ == null) {
        challengeCriteria_ = null;
        onChanged();
      } else {
        challengeCriteria_ = null;
        challengeCriteriaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
     */
    public POGOProtos.Rpc.GroupChallengeCriteriaProto.Builder getChallengeCriteriaBuilder() {
      
      onChanged();
      return getChallengeCriteriaFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
     */
    public POGOProtos.Rpc.GroupChallengeCriteriaProtoOrBuilder getChallengeCriteriaOrBuilder() {
      if (challengeCriteriaBuilder_ != null) {
        return challengeCriteriaBuilder_.getMessageOrBuilder();
      } else {
        return challengeCriteria_ == null ?
            POGOProtos.Rpc.GroupChallengeCriteriaProto.getDefaultInstance() : challengeCriteria_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GroupChallengeCriteriaProto challenge_criteria = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GroupChallengeCriteriaProto, POGOProtos.Rpc.GroupChallengeCriteriaProto.Builder, POGOProtos.Rpc.GroupChallengeCriteriaProtoOrBuilder> 
        getChallengeCriteriaFieldBuilder() {
      if (challengeCriteriaBuilder_ == null) {
        challengeCriteriaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GroupChallengeCriteriaProto, POGOProtos.Rpc.GroupChallengeCriteriaProto.Builder, POGOProtos.Rpc.GroupChallengeCriteriaProtoOrBuilder>(
                getChallengeCriteria(),
                getParentForChildren(),
                isClean());
        challengeCriteria_ = null;
      }
      return challengeCriteriaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TimedGroupChallengeDefinitionProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TimedGroupChallengeDefinitionProto)
  private static final POGOProtos.Rpc.TimedGroupChallengeDefinitionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TimedGroupChallengeDefinitionProto();
  }

  public static POGOProtos.Rpc.TimedGroupChallengeDefinitionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimedGroupChallengeDefinitionProto>
      PARSER = new com.google.protobuf.AbstractParser<TimedGroupChallengeDefinitionProto>() {
    @java.lang.Override
    public TimedGroupChallengeDefinitionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TimedGroupChallengeDefinitionProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TimedGroupChallengeDefinitionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimedGroupChallengeDefinitionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TimedGroupChallengeDefinitionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

