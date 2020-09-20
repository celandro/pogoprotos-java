// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IJIFAHEOEHN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EventSettingsProto}
 */
public final class EventSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EventSettingsProto)
    EventSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventSettingsProto.newBuilder() to construct.
  private EventSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventSettingsProto() {
    condolenceRibbonCountry_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    eventWebtokenServerUrl_ = "";
    eventLntUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventSettingsProto(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              condolenceRibbonCountry_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            condolenceRibbonCountry_.add(s);
            break;
          }
          case 16: {

            enableEventLink_ = input.readBool();
            break;
          }
          case 24: {

            enableEventLinkForChildren_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            eventWebtokenServerUrl_ = s;
            break;
          }
          case 40: {

            enableEventLnt_ = input.readBool();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            eventLntUrl_ = s;
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
        condolenceRibbonCountry_ = condolenceRibbonCountry_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EventSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EventSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EventSettingsProto.class, POGOProtos.Rpc.EventSettingsProto.Builder.class);
  }

  public static final int CONDOLENCE_RIBBON_COUNTRY_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList condolenceRibbonCountry_;
  /**
   * <code>repeated string condolence_ribbon_country = 1;</code>
   * @return A list containing the condolenceRibbonCountry.
   */
  public com.google.protobuf.ProtocolStringList
      getCondolenceRibbonCountryList() {
    return condolenceRibbonCountry_;
  }
  /**
   * <code>repeated string condolence_ribbon_country = 1;</code>
   * @return The count of condolenceRibbonCountry.
   */
  public int getCondolenceRibbonCountryCount() {
    return condolenceRibbonCountry_.size();
  }
  /**
   * <code>repeated string condolence_ribbon_country = 1;</code>
   * @param index The index of the element to return.
   * @return The condolenceRibbonCountry at the given index.
   */
  public java.lang.String getCondolenceRibbonCountry(int index) {
    return condolenceRibbonCountry_.get(index);
  }
  /**
   * <code>repeated string condolence_ribbon_country = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the condolenceRibbonCountry at the given index.
   */
  public com.google.protobuf.ByteString
      getCondolenceRibbonCountryBytes(int index) {
    return condolenceRibbonCountry_.getByteString(index);
  }

  public static final int ENABLE_EVENT_LINK_FIELD_NUMBER = 2;
  private boolean enableEventLink_;
  /**
   * <code>bool enable_event_link = 2;</code>
   * @return The enableEventLink.
   */
  @java.lang.Override
  public boolean getEnableEventLink() {
    return enableEventLink_;
  }

  public static final int ENABLE_EVENT_LINK_FOR_CHILDREN_FIELD_NUMBER = 3;
  private boolean enableEventLinkForChildren_;
  /**
   * <code>bool enable_event_link_for_children = 3;</code>
   * @return The enableEventLinkForChildren.
   */
  @java.lang.Override
  public boolean getEnableEventLinkForChildren() {
    return enableEventLinkForChildren_;
  }

  public static final int EVENT_WEBTOKEN_SERVER_URL_FIELD_NUMBER = 4;
  private volatile java.lang.Object eventWebtokenServerUrl_;
  /**
   * <code>string event_webtoken_server_url = 4;</code>
   * @return The eventWebtokenServerUrl.
   */
  @java.lang.Override
  public java.lang.String getEventWebtokenServerUrl() {
    java.lang.Object ref = eventWebtokenServerUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventWebtokenServerUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string event_webtoken_server_url = 4;</code>
   * @return The bytes for eventWebtokenServerUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventWebtokenServerUrlBytes() {
    java.lang.Object ref = eventWebtokenServerUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventWebtokenServerUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLE_EVENT_LNT_FIELD_NUMBER = 5;
  private boolean enableEventLnt_;
  /**
   * <code>bool enable_event_lnt = 5;</code>
   * @return The enableEventLnt.
   */
  @java.lang.Override
  public boolean getEnableEventLnt() {
    return enableEventLnt_;
  }

  public static final int EVENT_LNT_URL_FIELD_NUMBER = 6;
  private volatile java.lang.Object eventLntUrl_;
  /**
   * <code>string event_lnt_url = 6;</code>
   * @return The eventLntUrl.
   */
  @java.lang.Override
  public java.lang.String getEventLntUrl() {
    java.lang.Object ref = eventLntUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventLntUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string event_lnt_url = 6;</code>
   * @return The bytes for eventLntUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventLntUrlBytes() {
    java.lang.Object ref = eventLntUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventLntUrl_ = b;
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
    for (int i = 0; i < condolenceRibbonCountry_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, condolenceRibbonCountry_.getRaw(i));
    }
    if (enableEventLink_ != false) {
      output.writeBool(2, enableEventLink_);
    }
    if (enableEventLinkForChildren_ != false) {
      output.writeBool(3, enableEventLinkForChildren_);
    }
    if (!getEventWebtokenServerUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, eventWebtokenServerUrl_);
    }
    if (enableEventLnt_ != false) {
      output.writeBool(5, enableEventLnt_);
    }
    if (!getEventLntUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, eventLntUrl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < condolenceRibbonCountry_.size(); i++) {
        dataSize += computeStringSizeNoTag(condolenceRibbonCountry_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCondolenceRibbonCountryList().size();
    }
    if (enableEventLink_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, enableEventLink_);
    }
    if (enableEventLinkForChildren_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enableEventLinkForChildren_);
    }
    if (!getEventWebtokenServerUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, eventWebtokenServerUrl_);
    }
    if (enableEventLnt_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, enableEventLnt_);
    }
    if (!getEventLntUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, eventLntUrl_);
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
    if (!(obj instanceof POGOProtos.Rpc.EventSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EventSettingsProto other = (POGOProtos.Rpc.EventSettingsProto) obj;

    if (!getCondolenceRibbonCountryList()
        .equals(other.getCondolenceRibbonCountryList())) return false;
    if (getEnableEventLink()
        != other.getEnableEventLink()) return false;
    if (getEnableEventLinkForChildren()
        != other.getEnableEventLinkForChildren()) return false;
    if (!getEventWebtokenServerUrl()
        .equals(other.getEventWebtokenServerUrl())) return false;
    if (getEnableEventLnt()
        != other.getEnableEventLnt()) return false;
    if (!getEventLntUrl()
        .equals(other.getEventLntUrl())) return false;
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
    if (getCondolenceRibbonCountryCount() > 0) {
      hash = (37 * hash) + CONDOLENCE_RIBBON_COUNTRY_FIELD_NUMBER;
      hash = (53 * hash) + getCondolenceRibbonCountryList().hashCode();
    }
    hash = (37 * hash) + ENABLE_EVENT_LINK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableEventLink());
    hash = (37 * hash) + ENABLE_EVENT_LINK_FOR_CHILDREN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableEventLinkForChildren());
    hash = (37 * hash) + EVENT_WEBTOKEN_SERVER_URL_FIELD_NUMBER;
    hash = (53 * hash) + getEventWebtokenServerUrl().hashCode();
    hash = (37 * hash) + ENABLE_EVENT_LNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableEventLnt());
    hash = (37 * hash) + EVENT_LNT_URL_FIELD_NUMBER;
    hash = (53 * hash) + getEventLntUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EventSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EventSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EventSettingsProto prototype) {
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
   * ref: IJIFAHEOEHN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EventSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EventSettingsProto)
      POGOProtos.Rpc.EventSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EventSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EventSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EventSettingsProto.class, POGOProtos.Rpc.EventSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EventSettingsProto.newBuilder()
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
      condolenceRibbonCountry_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      enableEventLink_ = false;

      enableEventLinkForChildren_ = false;

      eventWebtokenServerUrl_ = "";

      enableEventLnt_ = false;

      eventLntUrl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EventSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EventSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.EventSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EventSettingsProto build() {
      POGOProtos.Rpc.EventSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EventSettingsProto buildPartial() {
      POGOProtos.Rpc.EventSettingsProto result = new POGOProtos.Rpc.EventSettingsProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        condolenceRibbonCountry_ = condolenceRibbonCountry_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.condolenceRibbonCountry_ = condolenceRibbonCountry_;
      result.enableEventLink_ = enableEventLink_;
      result.enableEventLinkForChildren_ = enableEventLinkForChildren_;
      result.eventWebtokenServerUrl_ = eventWebtokenServerUrl_;
      result.enableEventLnt_ = enableEventLnt_;
      result.eventLntUrl_ = eventLntUrl_;
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
      if (other instanceof POGOProtos.Rpc.EventSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.EventSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EventSettingsProto other) {
      if (other == POGOProtos.Rpc.EventSettingsProto.getDefaultInstance()) return this;
      if (!other.condolenceRibbonCountry_.isEmpty()) {
        if (condolenceRibbonCountry_.isEmpty()) {
          condolenceRibbonCountry_ = other.condolenceRibbonCountry_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCondolenceRibbonCountryIsMutable();
          condolenceRibbonCountry_.addAll(other.condolenceRibbonCountry_);
        }
        onChanged();
      }
      if (other.getEnableEventLink() != false) {
        setEnableEventLink(other.getEnableEventLink());
      }
      if (other.getEnableEventLinkForChildren() != false) {
        setEnableEventLinkForChildren(other.getEnableEventLinkForChildren());
      }
      if (!other.getEventWebtokenServerUrl().isEmpty()) {
        eventWebtokenServerUrl_ = other.eventWebtokenServerUrl_;
        onChanged();
      }
      if (other.getEnableEventLnt() != false) {
        setEnableEventLnt(other.getEnableEventLnt());
      }
      if (!other.getEventLntUrl().isEmpty()) {
        eventLntUrl_ = other.eventLntUrl_;
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
      POGOProtos.Rpc.EventSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EventSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList condolenceRibbonCountry_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCondolenceRibbonCountryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        condolenceRibbonCountry_ = new com.google.protobuf.LazyStringArrayList(condolenceRibbonCountry_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string condolence_ribbon_country = 1;</code>
     * @return A list containing the condolenceRibbonCountry.
     */
    public com.google.protobuf.ProtocolStringList
        getCondolenceRibbonCountryList() {
      return condolenceRibbonCountry_.getUnmodifiableView();
    }
    /**
     * <code>repeated string condolence_ribbon_country = 1;</code>
     * @return The count of condolenceRibbonCountry.
     */
    public int getCondolenceRibbonCountryCount() {
      return condolenceRibbonCountry_.size();
    }
    /**
     * <code>repeated string condolence_ribbon_country = 1;</code>
     * @param index The index of the element to return.
     * @return The condolenceRibbonCountry at the given index.
     */
    public java.lang.String getCondolenceRibbonCountry(int index) {
      return condolenceRibbonCountry_.get(index);
    }
    /**
     * <code>repeated string condolence_ribbon_country = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the condolenceRibbonCountry at the given index.
     */
    public com.google.protobuf.ByteString
        getCondolenceRibbonCountryBytes(int index) {
      return condolenceRibbonCountry_.getByteString(index);
    }
    /**
     * <code>repeated string condolence_ribbon_country = 1;</code>
     * @param index The index to set the value at.
     * @param value The condolenceRibbonCountry to set.
     * @return This builder for chaining.
     */
    public Builder setCondolenceRibbonCountry(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCondolenceRibbonCountryIsMutable();
      condolenceRibbonCountry_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string condolence_ribbon_country = 1;</code>
     * @param value The condolenceRibbonCountry to add.
     * @return This builder for chaining.
     */
    public Builder addCondolenceRibbonCountry(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCondolenceRibbonCountryIsMutable();
      condolenceRibbonCountry_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string condolence_ribbon_country = 1;</code>
     * @param values The condolenceRibbonCountry to add.
     * @return This builder for chaining.
     */
    public Builder addAllCondolenceRibbonCountry(
        java.lang.Iterable<java.lang.String> values) {
      ensureCondolenceRibbonCountryIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, condolenceRibbonCountry_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string condolence_ribbon_country = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCondolenceRibbonCountry() {
      condolenceRibbonCountry_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string condolence_ribbon_country = 1;</code>
     * @param value The bytes of the condolenceRibbonCountry to add.
     * @return This builder for chaining.
     */
    public Builder addCondolenceRibbonCountryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCondolenceRibbonCountryIsMutable();
      condolenceRibbonCountry_.add(value);
      onChanged();
      return this;
    }

    private boolean enableEventLink_ ;
    /**
     * <code>bool enable_event_link = 2;</code>
     * @return The enableEventLink.
     */
    @java.lang.Override
    public boolean getEnableEventLink() {
      return enableEventLink_;
    }
    /**
     * <code>bool enable_event_link = 2;</code>
     * @param value The enableEventLink to set.
     * @return This builder for chaining.
     */
    public Builder setEnableEventLink(boolean value) {
      
      enableEventLink_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_event_link = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableEventLink() {
      
      enableEventLink_ = false;
      onChanged();
      return this;
    }

    private boolean enableEventLinkForChildren_ ;
    /**
     * <code>bool enable_event_link_for_children = 3;</code>
     * @return The enableEventLinkForChildren.
     */
    @java.lang.Override
    public boolean getEnableEventLinkForChildren() {
      return enableEventLinkForChildren_;
    }
    /**
     * <code>bool enable_event_link_for_children = 3;</code>
     * @param value The enableEventLinkForChildren to set.
     * @return This builder for chaining.
     */
    public Builder setEnableEventLinkForChildren(boolean value) {
      
      enableEventLinkForChildren_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_event_link_for_children = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableEventLinkForChildren() {
      
      enableEventLinkForChildren_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object eventWebtokenServerUrl_ = "";
    /**
     * <code>string event_webtoken_server_url = 4;</code>
     * @return The eventWebtokenServerUrl.
     */
    public java.lang.String getEventWebtokenServerUrl() {
      java.lang.Object ref = eventWebtokenServerUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventWebtokenServerUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event_webtoken_server_url = 4;</code>
     * @return The bytes for eventWebtokenServerUrl.
     */
    public com.google.protobuf.ByteString
        getEventWebtokenServerUrlBytes() {
      java.lang.Object ref = eventWebtokenServerUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventWebtokenServerUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event_webtoken_server_url = 4;</code>
     * @param value The eventWebtokenServerUrl to set.
     * @return This builder for chaining.
     */
    public Builder setEventWebtokenServerUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventWebtokenServerUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string event_webtoken_server_url = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventWebtokenServerUrl() {
      
      eventWebtokenServerUrl_ = getDefaultInstance().getEventWebtokenServerUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string event_webtoken_server_url = 4;</code>
     * @param value The bytes for eventWebtokenServerUrl to set.
     * @return This builder for chaining.
     */
    public Builder setEventWebtokenServerUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventWebtokenServerUrl_ = value;
      onChanged();
      return this;
    }

    private boolean enableEventLnt_ ;
    /**
     * <code>bool enable_event_lnt = 5;</code>
     * @return The enableEventLnt.
     */
    @java.lang.Override
    public boolean getEnableEventLnt() {
      return enableEventLnt_;
    }
    /**
     * <code>bool enable_event_lnt = 5;</code>
     * @param value The enableEventLnt to set.
     * @return This builder for chaining.
     */
    public Builder setEnableEventLnt(boolean value) {
      
      enableEventLnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_event_lnt = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableEventLnt() {
      
      enableEventLnt_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object eventLntUrl_ = "";
    /**
     * <code>string event_lnt_url = 6;</code>
     * @return The eventLntUrl.
     */
    public java.lang.String getEventLntUrl() {
      java.lang.Object ref = eventLntUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventLntUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event_lnt_url = 6;</code>
     * @return The bytes for eventLntUrl.
     */
    public com.google.protobuf.ByteString
        getEventLntUrlBytes() {
      java.lang.Object ref = eventLntUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventLntUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event_lnt_url = 6;</code>
     * @param value The eventLntUrl to set.
     * @return This builder for chaining.
     */
    public Builder setEventLntUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventLntUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string event_lnt_url = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventLntUrl() {
      
      eventLntUrl_ = getDefaultInstance().getEventLntUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string event_lnt_url = 6;</code>
     * @param value The bytes for eventLntUrl to set.
     * @return This builder for chaining.
     */
    public Builder setEventLntUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventLntUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EventSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EventSettingsProto)
  private static final POGOProtos.Rpc.EventSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EventSettingsProto();
  }

  public static POGOProtos.Rpc.EventSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<EventSettingsProto>() {
    @java.lang.Override
    public EventSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EventSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

