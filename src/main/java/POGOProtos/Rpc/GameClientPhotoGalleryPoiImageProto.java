// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Titan.Protos.GameClientPhotoGalleryPoiImageProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto}
 */
public final class GameClientPhotoGalleryPoiImageProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto)
    GameClientPhotoGalleryPoiImageProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameClientPhotoGalleryPoiImageProto.newBuilder() to construct.
  private GameClientPhotoGalleryPoiImageProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameClientPhotoGalleryPoiImageProto() {
    imageId_ = "";
    poiId_ = "";
    submitterCodename_ = "";
    imageUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GameClientPhotoGalleryPoiImageProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GameClientPhotoGalleryPoiImageProto(
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

            imageId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            poiId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            submitterCodename_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            imageUrl_ = s;
            break;
          }
          case 40: {

            creationTimestampMs_ = input.readInt64();
            break;
          }
          case 48: {

            hasPlayerVoted_ = input.readBool();
            break;
          }
          case 56: {

            numVotesFromGame_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GameClientPhotoGalleryPoiImageProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GameClientPhotoGalleryPoiImageProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.class, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder.class);
  }

  public static final int IMAGE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object imageId_;
  /**
   * <code>string image_id = 1;</code>
   * @return The imageId.
   */
  @java.lang.Override
  public java.lang.String getImageId() {
    java.lang.Object ref = imageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageId_ = s;
      return s;
    }
  }
  /**
   * <code>string image_id = 1;</code>
   * @return The bytes for imageId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageIdBytes() {
    java.lang.Object ref = imageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POI_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object poiId_;
  /**
   * <code>string poi_id = 2;</code>
   * @return The poiId.
   */
  @java.lang.Override
  public java.lang.String getPoiId() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poiId_ = s;
      return s;
    }
  }
  /**
   * <code>string poi_id = 2;</code>
   * @return The bytes for poiId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoiIdBytes() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poiId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBMITTER_CODENAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object submitterCodename_;
  /**
   * <code>string submitter_codename = 3;</code>
   * @return The submitterCodename.
   */
  @java.lang.Override
  public java.lang.String getSubmitterCodename() {
    java.lang.Object ref = submitterCodename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      submitterCodename_ = s;
      return s;
    }
  }
  /**
   * <code>string submitter_codename = 3;</code>
   * @return The bytes for submitterCodename.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubmitterCodenameBytes() {
    java.lang.Object ref = submitterCodename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      submitterCodename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_URL_FIELD_NUMBER = 4;
  private volatile java.lang.Object imageUrl_;
  /**
   * <code>string image_url = 4;</code>
   * @return The imageUrl.
   */
  @java.lang.Override
  public java.lang.String getImageUrl() {
    java.lang.Object ref = imageUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string image_url = 4;</code>
   * @return The bytes for imageUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageUrlBytes() {
    java.lang.Object ref = imageUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATION_TIMESTAMP_MS_FIELD_NUMBER = 5;
  private long creationTimestampMs_;
  /**
   * <code>int64 creation_timestamp_ms = 5;</code>
   * @return The creationTimestampMs.
   */
  @java.lang.Override
  public long getCreationTimestampMs() {
    return creationTimestampMs_;
  }

  public static final int HAS_PLAYER_VOTED_FIELD_NUMBER = 6;
  private boolean hasPlayerVoted_;
  /**
   * <code>bool has_player_voted = 6;</code>
   * @return The hasPlayerVoted.
   */
  @java.lang.Override
  public boolean getHasPlayerVoted() {
    return hasPlayerVoted_;
  }

  public static final int NUM_VOTES_FROM_GAME_FIELD_NUMBER = 7;
  private int numVotesFromGame_;
  /**
   * <code>int32 num_votes_from_game = 7;</code>
   * @return The numVotesFromGame.
   */
  @java.lang.Override
  public int getNumVotesFromGame() {
    return numVotesFromGame_;
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
    if (!getImageIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, imageId_);
    }
    if (!getPoiIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, poiId_);
    }
    if (!getSubmitterCodenameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, submitterCodename_);
    }
    if (!getImageUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, imageUrl_);
    }
    if (creationTimestampMs_ != 0L) {
      output.writeInt64(5, creationTimestampMs_);
    }
    if (hasPlayerVoted_ != false) {
      output.writeBool(6, hasPlayerVoted_);
    }
    if (numVotesFromGame_ != 0) {
      output.writeInt32(7, numVotesFromGame_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getImageIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, imageId_);
    }
    if (!getPoiIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, poiId_);
    }
    if (!getSubmitterCodenameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, submitterCodename_);
    }
    if (!getImageUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, imageUrl_);
    }
    if (creationTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, creationTimestampMs_);
    }
    if (hasPlayerVoted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, hasPlayerVoted_);
    }
    if (numVotesFromGame_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, numVotesFromGame_);
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
    if (!(obj instanceof POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto other = (POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto) obj;

    if (!getImageId()
        .equals(other.getImageId())) return false;
    if (!getPoiId()
        .equals(other.getPoiId())) return false;
    if (!getSubmitterCodename()
        .equals(other.getSubmitterCodename())) return false;
    if (!getImageUrl()
        .equals(other.getImageUrl())) return false;
    if (getCreationTimestampMs()
        != other.getCreationTimestampMs()) return false;
    if (getHasPlayerVoted()
        != other.getHasPlayerVoted()) return false;
    if (getNumVotesFromGame()
        != other.getNumVotesFromGame()) return false;
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
    hash = (37 * hash) + IMAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getImageId().hashCode();
    hash = (37 * hash) + POI_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPoiId().hashCode();
    hash = (37 * hash) + SUBMITTER_CODENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSubmitterCodename().hashCode();
    hash = (37 * hash) + IMAGE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getImageUrl().hashCode();
    hash = (37 * hash) + CREATION_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreationTimestampMs());
    hash = (37 * hash) + HAS_PLAYER_VOTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasPlayerVoted());
    hash = (37 * hash) + NUM_VOTES_FROM_GAME_FIELD_NUMBER;
    hash = (53 * hash) + getNumVotesFromGame();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto prototype) {
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
   * <pre>
   * ref: Niantic.Titan.Protos.GameClientPhotoGalleryPoiImageProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto)
      POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GameClientPhotoGalleryPoiImageProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GameClientPhotoGalleryPoiImageProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.class, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.newBuilder()
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
      imageId_ = "";

      poiId_ = "";

      submitterCodename_ = "";

      imageUrl_ = "";

      creationTimestampMs_ = 0L;

      hasPlayerVoted_ = false;

      numVotesFromGame_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GameClientPhotoGalleryPoiImageProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto build() {
      POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto buildPartial() {
      POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto result = new POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto(this);
      result.imageId_ = imageId_;
      result.poiId_ = poiId_;
      result.submitterCodename_ = submitterCodename_;
      result.imageUrl_ = imageUrl_;
      result.creationTimestampMs_ = creationTimestampMs_;
      result.hasPlayerVoted_ = hasPlayerVoted_;
      result.numVotesFromGame_ = numVotesFromGame_;
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
      if (other instanceof POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto) {
        return mergeFrom((POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto other) {
      if (other == POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.getDefaultInstance()) return this;
      if (!other.getImageId().isEmpty()) {
        imageId_ = other.imageId_;
        onChanged();
      }
      if (!other.getPoiId().isEmpty()) {
        poiId_ = other.poiId_;
        onChanged();
      }
      if (!other.getSubmitterCodename().isEmpty()) {
        submitterCodename_ = other.submitterCodename_;
        onChanged();
      }
      if (!other.getImageUrl().isEmpty()) {
        imageUrl_ = other.imageUrl_;
        onChanged();
      }
      if (other.getCreationTimestampMs() != 0L) {
        setCreationTimestampMs(other.getCreationTimestampMs());
      }
      if (other.getHasPlayerVoted() != false) {
        setHasPlayerVoted(other.getHasPlayerVoted());
      }
      if (other.getNumVotesFromGame() != 0) {
        setNumVotesFromGame(other.getNumVotesFromGame());
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
      POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object imageId_ = "";
    /**
     * <code>string image_id = 1;</code>
     * @return The imageId.
     */
    public java.lang.String getImageId() {
      java.lang.Object ref = imageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string image_id = 1;</code>
     * @return The bytes for imageId.
     */
    public com.google.protobuf.ByteString
        getImageIdBytes() {
      java.lang.Object ref = imageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string image_id = 1;</code>
     * @param value The imageId to set.
     * @return This builder for chaining.
     */
    public Builder setImageId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string image_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageId() {
      
      imageId_ = getDefaultInstance().getImageId();
      onChanged();
      return this;
    }
    /**
     * <code>string image_id = 1;</code>
     * @param value The bytes for imageId to set.
     * @return This builder for chaining.
     */
    public Builder setImageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object poiId_ = "";
    /**
     * <code>string poi_id = 2;</code>
     * @return The poiId.
     */
    public java.lang.String getPoiId() {
      java.lang.Object ref = poiId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poiId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string poi_id = 2;</code>
     * @return The bytes for poiId.
     */
    public com.google.protobuf.ByteString
        getPoiIdBytes() {
      java.lang.Object ref = poiId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poiId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string poi_id = 2;</code>
     * @param value The poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      poiId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoiId() {
      
      poiId_ = getDefaultInstance().getPoiId();
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 2;</code>
     * @param value The bytes for poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      poiId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object submitterCodename_ = "";
    /**
     * <code>string submitter_codename = 3;</code>
     * @return The submitterCodename.
     */
    public java.lang.String getSubmitterCodename() {
      java.lang.Object ref = submitterCodename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        submitterCodename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string submitter_codename = 3;</code>
     * @return The bytes for submitterCodename.
     */
    public com.google.protobuf.ByteString
        getSubmitterCodenameBytes() {
      java.lang.Object ref = submitterCodename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        submitterCodename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string submitter_codename = 3;</code>
     * @param value The submitterCodename to set.
     * @return This builder for chaining.
     */
    public Builder setSubmitterCodename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      submitterCodename_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string submitter_codename = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmitterCodename() {
      
      submitterCodename_ = getDefaultInstance().getSubmitterCodename();
      onChanged();
      return this;
    }
    /**
     * <code>string submitter_codename = 3;</code>
     * @param value The bytes for submitterCodename to set.
     * @return This builder for chaining.
     */
    public Builder setSubmitterCodenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      submitterCodename_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object imageUrl_ = "";
    /**
     * <code>string image_url = 4;</code>
     * @return The imageUrl.
     */
    public java.lang.String getImageUrl() {
      java.lang.Object ref = imageUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string image_url = 4;</code>
     * @return The bytes for imageUrl.
     */
    public com.google.protobuf.ByteString
        getImageUrlBytes() {
      java.lang.Object ref = imageUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string image_url = 4;</code>
     * @param value The imageUrl to set.
     * @return This builder for chaining.
     */
    public Builder setImageUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string image_url = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageUrl() {
      
      imageUrl_ = getDefaultInstance().getImageUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string image_url = 4;</code>
     * @param value The bytes for imageUrl to set.
     * @return This builder for chaining.
     */
    public Builder setImageUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageUrl_ = value;
      onChanged();
      return this;
    }

    private long creationTimestampMs_ ;
    /**
     * <code>int64 creation_timestamp_ms = 5;</code>
     * @return The creationTimestampMs.
     */
    @java.lang.Override
    public long getCreationTimestampMs() {
      return creationTimestampMs_;
    }
    /**
     * <code>int64 creation_timestamp_ms = 5;</code>
     * @param value The creationTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setCreationTimestampMs(long value) {
      
      creationTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 creation_timestamp_ms = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreationTimestampMs() {
      
      creationTimestampMs_ = 0L;
      onChanged();
      return this;
    }

    private boolean hasPlayerVoted_ ;
    /**
     * <code>bool has_player_voted = 6;</code>
     * @return The hasPlayerVoted.
     */
    @java.lang.Override
    public boolean getHasPlayerVoted() {
      return hasPlayerVoted_;
    }
    /**
     * <code>bool has_player_voted = 6;</code>
     * @param value The hasPlayerVoted to set.
     * @return This builder for chaining.
     */
    public Builder setHasPlayerVoted(boolean value) {
      
      hasPlayerVoted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool has_player_voted = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasPlayerVoted() {
      
      hasPlayerVoted_ = false;
      onChanged();
      return this;
    }

    private int numVotesFromGame_ ;
    /**
     * <code>int32 num_votes_from_game = 7;</code>
     * @return The numVotesFromGame.
     */
    @java.lang.Override
    public int getNumVotesFromGame() {
      return numVotesFromGame_;
    }
    /**
     * <code>int32 num_votes_from_game = 7;</code>
     * @param value The numVotesFromGame to set.
     * @return This builder for chaining.
     */
    public Builder setNumVotesFromGame(int value) {
      
      numVotesFromGame_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_votes_from_game = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumVotesFromGame() {
      
      numVotesFromGame_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto)
  private static final POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto();
  }

  public static POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameClientPhotoGalleryPoiImageProto>
      PARSER = new com.google.protobuf.AbstractParser<GameClientPhotoGalleryPoiImageProto>() {
    @java.lang.Override
    public GameClientPhotoGalleryPoiImageProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GameClientPhotoGalleryPoiImageProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GameClientPhotoGalleryPoiImageProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameClientPhotoGalleryPoiImageProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

