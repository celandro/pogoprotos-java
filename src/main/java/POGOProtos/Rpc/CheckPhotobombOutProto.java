// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CheckPhotobombOutProto}
 */
public  final class CheckPhotobombOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CheckPhotobombOutProto)
    CheckPhotobombOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckPhotobombOutProto.newBuilder() to construct.
  private CheckPhotobombOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckPhotobombOutProto() {
    status_ = 0;
    photobombPokemonId_ = 0;
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckPhotobombOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckPhotobombOutProto(
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
          case 16: {
            int rawValue = input.readEnum();

            photobombPokemonId_ = rawValue;
            break;
          }
          case 26: {
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (photobombPokemonDisplay_ != null) {
              subBuilder = photobombPokemonDisplay_.toBuilder();
            }
            photobombPokemonDisplay_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(photobombPokemonDisplay_);
              photobombPokemonDisplay_ = subBuilder.buildPartial();
            }

            break;
          }
          case 33: {

            encounterId_ = input.readFixed64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            uri_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CheckPhotobombOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CheckPhotobombOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CheckPhotobombOutProto.class, POGOProtos.Rpc.CheckPhotobombOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.CheckPhotobombOutProto.Status}
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
     * <code>ERROR_PHOTO_POKEMON_INVALID = 2;</code>
     */
    ERROR_PHOTO_POKEMON_INVALID(2),
    /**
     * <code>ERROR_UNKNOWN = 3;</code>
     */
    ERROR_UNKNOWN(3),
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
     * <code>ERROR_PHOTO_POKEMON_INVALID = 2;</code>
     */
    public static final int ERROR_PHOTO_POKEMON_INVALID_VALUE = 2;
    /**
     * <code>ERROR_UNKNOWN = 3;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 3;


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
        case 2: return ERROR_PHOTO_POKEMON_INVALID;
        case 3: return ERROR_UNKNOWN;
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
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.CheckPhotobombOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CheckPhotobombOutProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.CheckPhotobombOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.CheckPhotobombOutProto.Status status = 1;</code>
   * @return The status.
   */
  public POGOProtos.Rpc.CheckPhotobombOutProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CheckPhotobombOutProto.Status result = POGOProtos.Rpc.CheckPhotobombOutProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.CheckPhotobombOutProto.Status.UNRECOGNIZED : result;
  }

  public static final int PHOTOBOMB_POKEMON_ID_FIELD_NUMBER = 2;
  private int photobombPokemonId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId photobomb_pokemon_id = 2;</code>
   * @return The enum numeric value on the wire for photobombPokemonId.
   */
  public int getPhotobombPokemonIdValue() {
    return photobombPokemonId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId photobomb_pokemon_id = 2;</code>
   * @return The photobombPokemonId.
   */
  public POGOProtos.Rpc.HoloPokemonId getPhotobombPokemonId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(photobombPokemonId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int PHOTOBOMB_POKEMON_DISPLAY_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.PokemonDisplayProto photobombPokemonDisplay_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
   * @return Whether the photobombPokemonDisplay field is set.
   */
  public boolean hasPhotobombPokemonDisplay() {
    return photobombPokemonDisplay_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
   * @return The photobombPokemonDisplay.
   */
  public POGOProtos.Rpc.PokemonDisplayProto getPhotobombPokemonDisplay() {
    return photobombPokemonDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : photobombPokemonDisplay_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
   */
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPhotobombPokemonDisplayOrBuilder() {
    return getPhotobombPokemonDisplay();
  }

  public static final int ENCOUNTER_ID_FIELD_NUMBER = 4;
  private long encounterId_;
  /**
   * <code>fixed64 encounter_id = 4;</code>
   * @return The encounterId.
   */
  public long getEncounterId() {
    return encounterId_;
  }

  public static final int URI_FIELD_NUMBER = 5;
  private volatile java.lang.Object uri_;
  /**
   * <code>string uri = 5;</code>
   * @return The uri.
   */
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <code>string uri = 5;</code>
   * @return The bytes for uri.
   */
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
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
    if (status_ != POGOProtos.Rpc.CheckPhotobombOutProto.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (photobombPokemonId_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      output.writeEnum(2, photobombPokemonId_);
    }
    if (photobombPokemonDisplay_ != null) {
      output.writeMessage(3, getPhotobombPokemonDisplay());
    }
    if (encounterId_ != 0L) {
      output.writeFixed64(4, encounterId_);
    }
    if (!getUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, uri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.CheckPhotobombOutProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (photobombPokemonId_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, photobombPokemonId_);
    }
    if (photobombPokemonDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPhotobombPokemonDisplay());
    }
    if (encounterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(4, encounterId_);
    }
    if (!getUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, uri_);
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
    if (!(obj instanceof POGOProtos.Rpc.CheckPhotobombOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CheckPhotobombOutProto other = (POGOProtos.Rpc.CheckPhotobombOutProto) obj;

    if (status_ != other.status_) return false;
    if (photobombPokemonId_ != other.photobombPokemonId_) return false;
    if (hasPhotobombPokemonDisplay() != other.hasPhotobombPokemonDisplay()) return false;
    if (hasPhotobombPokemonDisplay()) {
      if (!getPhotobombPokemonDisplay()
          .equals(other.getPhotobombPokemonDisplay())) return false;
    }
    if (getEncounterId()
        != other.getEncounterId()) return false;
    if (!getUri()
        .equals(other.getUri())) return false;
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
    hash = (37 * hash) + PHOTOBOMB_POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + photobombPokemonId_;
    if (hasPhotobombPokemonDisplay()) {
      hash = (37 * hash) + PHOTOBOMB_POKEMON_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getPhotobombPokemonDisplay().hashCode();
    }
    hash = (37 * hash) + ENCOUNTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEncounterId());
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CheckPhotobombOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CheckPhotobombOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CheckPhotobombOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CheckPhotobombOutProto)
      POGOProtos.Rpc.CheckPhotobombOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CheckPhotobombOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CheckPhotobombOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CheckPhotobombOutProto.class, POGOProtos.Rpc.CheckPhotobombOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CheckPhotobombOutProto.newBuilder()
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

      photobombPokemonId_ = 0;

      if (photobombPokemonDisplayBuilder_ == null) {
        photobombPokemonDisplay_ = null;
      } else {
        photobombPokemonDisplay_ = null;
        photobombPokemonDisplayBuilder_ = null;
      }
      encounterId_ = 0L;

      uri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CheckPhotobombOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CheckPhotobombOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CheckPhotobombOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CheckPhotobombOutProto build() {
      POGOProtos.Rpc.CheckPhotobombOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CheckPhotobombOutProto buildPartial() {
      POGOProtos.Rpc.CheckPhotobombOutProto result = new POGOProtos.Rpc.CheckPhotobombOutProto(this);
      result.status_ = status_;
      result.photobombPokemonId_ = photobombPokemonId_;
      if (photobombPokemonDisplayBuilder_ == null) {
        result.photobombPokemonDisplay_ = photobombPokemonDisplay_;
      } else {
        result.photobombPokemonDisplay_ = photobombPokemonDisplayBuilder_.build();
      }
      result.encounterId_ = encounterId_;
      result.uri_ = uri_;
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
      if (other instanceof POGOProtos.Rpc.CheckPhotobombOutProto) {
        return mergeFrom((POGOProtos.Rpc.CheckPhotobombOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CheckPhotobombOutProto other) {
      if (other == POGOProtos.Rpc.CheckPhotobombOutProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.photobombPokemonId_ != 0) {
        setPhotobombPokemonIdValue(other.getPhotobombPokemonIdValue());
      }
      if (other.hasPhotobombPokemonDisplay()) {
        mergePhotobombPokemonDisplay(other.getPhotobombPokemonDisplay());
      }
      if (other.getEncounterId() != 0L) {
        setEncounterId(other.getEncounterId());
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
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
      POGOProtos.Rpc.CheckPhotobombOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CheckPhotobombOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.CheckPhotobombOutProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.CheckPhotobombOutProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CheckPhotobombOutProto.Status status = 1;</code>
     * @return The status.
     */
    public POGOProtos.Rpc.CheckPhotobombOutProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CheckPhotobombOutProto.Status result = POGOProtos.Rpc.CheckPhotobombOutProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.CheckPhotobombOutProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CheckPhotobombOutProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.CheckPhotobombOutProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CheckPhotobombOutProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int photobombPokemonId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId photobomb_pokemon_id = 2;</code>
     * @return The enum numeric value on the wire for photobombPokemonId.
     */
    public int getPhotobombPokemonIdValue() {
      return photobombPokemonId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId photobomb_pokemon_id = 2;</code>
     * @param value The enum numeric value on the wire for photobombPokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPhotobombPokemonIdValue(int value) {
      photobombPokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId photobomb_pokemon_id = 2;</code>
     * @return The photobombPokemonId.
     */
    public POGOProtos.Rpc.HoloPokemonId getPhotobombPokemonId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(photobombPokemonId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId photobomb_pokemon_id = 2;</code>
     * @param value The photobombPokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPhotobombPokemonId(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      photobombPokemonId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId photobomb_pokemon_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhotobombPokemonId() {
      
      photobombPokemonId_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto photobombPokemonDisplay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> photobombPokemonDisplayBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
     * @return Whether the photobombPokemonDisplay field is set.
     */
    public boolean hasPhotobombPokemonDisplay() {
      return photobombPokemonDisplayBuilder_ != null || photobombPokemonDisplay_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
     * @return The photobombPokemonDisplay.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getPhotobombPokemonDisplay() {
      if (photobombPokemonDisplayBuilder_ == null) {
        return photobombPokemonDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : photobombPokemonDisplay_;
      } else {
        return photobombPokemonDisplayBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
     */
    public Builder setPhotobombPokemonDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (photobombPokemonDisplayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        photobombPokemonDisplay_ = value;
        onChanged();
      } else {
        photobombPokemonDisplayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
     */
    public Builder setPhotobombPokemonDisplay(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (photobombPokemonDisplayBuilder_ == null) {
        photobombPokemonDisplay_ = builderForValue.build();
        onChanged();
      } else {
        photobombPokemonDisplayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
     */
    public Builder mergePhotobombPokemonDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (photobombPokemonDisplayBuilder_ == null) {
        if (photobombPokemonDisplay_ != null) {
          photobombPokemonDisplay_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(photobombPokemonDisplay_).mergeFrom(value).buildPartial();
        } else {
          photobombPokemonDisplay_ = value;
        }
        onChanged();
      } else {
        photobombPokemonDisplayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
     */
    public Builder clearPhotobombPokemonDisplay() {
      if (photobombPokemonDisplayBuilder_ == null) {
        photobombPokemonDisplay_ = null;
        onChanged();
      } else {
        photobombPokemonDisplay_ = null;
        photobombPokemonDisplayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getPhotobombPokemonDisplayBuilder() {
      
      onChanged();
      return getPhotobombPokemonDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPhotobombPokemonDisplayOrBuilder() {
      if (photobombPokemonDisplayBuilder_ != null) {
        return photobombPokemonDisplayBuilder_.getMessageOrBuilder();
      } else {
        return photobombPokemonDisplay_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : photobombPokemonDisplay_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto photobomb_pokemon_display = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getPhotobombPokemonDisplayFieldBuilder() {
      if (photobombPokemonDisplayBuilder_ == null) {
        photobombPokemonDisplayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getPhotobombPokemonDisplay(),
                getParentForChildren(),
                isClean());
        photobombPokemonDisplay_ = null;
      }
      return photobombPokemonDisplayBuilder_;
    }

    private long encounterId_ ;
    /**
     * <code>fixed64 encounter_id = 4;</code>
     * @return The encounterId.
     */
    public long getEncounterId() {
      return encounterId_;
    }
    /**
     * <code>fixed64 encounter_id = 4;</code>
     * @param value The encounterId to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterId(long value) {
      
      encounterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 encounter_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterId() {
      
      encounterId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     * <code>string uri = 5;</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uri = 5;</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uri = 5;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uri_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string uri = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      
      uri_ = getDefaultInstance().getUri();
      onChanged();
      return this;
    }
    /**
     * <code>string uri = 5;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uri_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CheckPhotobombOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CheckPhotobombOutProto)
  private static final POGOProtos.Rpc.CheckPhotobombOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CheckPhotobombOutProto();
  }

  public static POGOProtos.Rpc.CheckPhotobombOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckPhotobombOutProto>
      PARSER = new com.google.protobuf.AbstractParser<CheckPhotobombOutProto>() {
    @java.lang.Override
    public CheckPhotobombOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckPhotobombOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckPhotobombOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckPhotobombOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CheckPhotobombOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

