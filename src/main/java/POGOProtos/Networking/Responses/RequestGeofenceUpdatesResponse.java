// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/RequestGeofenceUpdatesResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse}
 */
public  final class RequestGeofenceUpdatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse)
    RequestGeofenceUpdatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestGeofenceUpdatesResponse.newBuilder() to construct.
  private RequestGeofenceUpdatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestGeofenceUpdatesResponse() {
    geofence_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestGeofenceUpdatesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestGeofenceUpdatesResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              geofence_ = new java.util.ArrayList<POGOProtos.Data.Geofence.GeofenceMetadata>();
              mutable_bitField0_ |= 0x00000001;
            }
            geofence_.add(
                input.readMessage(POGOProtos.Data.Geofence.GeofenceMetadata.parser(), extensionRegistry));
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
        geofence_ = java.util.Collections.unmodifiableList(geofence_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse.class, POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse.Builder.class);
  }

  public static final int GEOFENCE_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Data.Geofence.GeofenceMetadata> geofence_;
  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  public java.util.List<POGOProtos.Data.Geofence.GeofenceMetadata> getGeofenceList() {
    return geofence_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Data.Geofence.GeofenceMetadataOrBuilder> 
      getGeofenceOrBuilderList() {
    return geofence_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  public int getGeofenceCount() {
    return geofence_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  public POGOProtos.Data.Geofence.GeofenceMetadata getGeofence(int index) {
    return geofence_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
   */
  public POGOProtos.Data.Geofence.GeofenceMetadataOrBuilder getGeofenceOrBuilder(
      int index) {
    return geofence_.get(index);
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
    for (int i = 0; i < geofence_.size(); i++) {
      output.writeMessage(1, geofence_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < geofence_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, geofence_.get(i));
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
    if (!(obj instanceof POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse other = (POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse) obj;

    if (!getGeofenceList()
        .equals(other.getGeofenceList())) return false;
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
    if (getGeofenceCount() > 0) {
      hash = (37 * hash) + GEOFENCE_FIELD_NUMBER;
      hash = (53 * hash) + getGeofenceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse)
      POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse.class, POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse.newBuilder()
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
        getGeofenceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (geofenceBuilder_ == null) {
        geofence_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        geofenceBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RequestGeofenceUpdatesResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse build() {
      POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse buildPartial() {
      POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse result = new POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse(this);
      int from_bitField0_ = bitField0_;
      if (geofenceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          geofence_ = java.util.Collections.unmodifiableList(geofence_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.geofence_ = geofence_;
      } else {
        result.geofence_ = geofenceBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse other) {
      if (other == POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse.getDefaultInstance()) return this;
      if (geofenceBuilder_ == null) {
        if (!other.geofence_.isEmpty()) {
          if (geofence_.isEmpty()) {
            geofence_ = other.geofence_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGeofenceIsMutable();
            geofence_.addAll(other.geofence_);
          }
          onChanged();
        }
      } else {
        if (!other.geofence_.isEmpty()) {
          if (geofenceBuilder_.isEmpty()) {
            geofenceBuilder_.dispose();
            geofenceBuilder_ = null;
            geofence_ = other.geofence_;
            bitField0_ = (bitField0_ & ~0x00000001);
            geofenceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGeofenceFieldBuilder() : null;
          } else {
            geofenceBuilder_.addAllMessages(other.geofence_);
          }
        }
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
      POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Data.Geofence.GeofenceMetadata> geofence_ =
      java.util.Collections.emptyList();
    private void ensureGeofenceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        geofence_ = new java.util.ArrayList<POGOProtos.Data.Geofence.GeofenceMetadata>(geofence_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Geofence.GeofenceMetadata, POGOProtos.Data.Geofence.GeofenceMetadata.Builder, POGOProtos.Data.Geofence.GeofenceMetadataOrBuilder> geofenceBuilder_;

    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Geofence.GeofenceMetadata> getGeofenceList() {
      if (geofenceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(geofence_);
      } else {
        return geofenceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public int getGeofenceCount() {
      if (geofenceBuilder_ == null) {
        return geofence_.size();
      } else {
        return geofenceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public POGOProtos.Data.Geofence.GeofenceMetadata getGeofence(int index) {
      if (geofenceBuilder_ == null) {
        return geofence_.get(index);
      } else {
        return geofenceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public Builder setGeofence(
        int index, POGOProtos.Data.Geofence.GeofenceMetadata value) {
      if (geofenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeofenceIsMutable();
        geofence_.set(index, value);
        onChanged();
      } else {
        geofenceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public Builder setGeofence(
        int index, POGOProtos.Data.Geofence.GeofenceMetadata.Builder builderForValue) {
      if (geofenceBuilder_ == null) {
        ensureGeofenceIsMutable();
        geofence_.set(index, builderForValue.build());
        onChanged();
      } else {
        geofenceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public Builder addGeofence(POGOProtos.Data.Geofence.GeofenceMetadata value) {
      if (geofenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeofenceIsMutable();
        geofence_.add(value);
        onChanged();
      } else {
        geofenceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public Builder addGeofence(
        int index, POGOProtos.Data.Geofence.GeofenceMetadata value) {
      if (geofenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGeofenceIsMutable();
        geofence_.add(index, value);
        onChanged();
      } else {
        geofenceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public Builder addGeofence(
        POGOProtos.Data.Geofence.GeofenceMetadata.Builder builderForValue) {
      if (geofenceBuilder_ == null) {
        ensureGeofenceIsMutable();
        geofence_.add(builderForValue.build());
        onChanged();
      } else {
        geofenceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public Builder addGeofence(
        int index, POGOProtos.Data.Geofence.GeofenceMetadata.Builder builderForValue) {
      if (geofenceBuilder_ == null) {
        ensureGeofenceIsMutable();
        geofence_.add(index, builderForValue.build());
        onChanged();
      } else {
        geofenceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public Builder addAllGeofence(
        java.lang.Iterable<? extends POGOProtos.Data.Geofence.GeofenceMetadata> values) {
      if (geofenceBuilder_ == null) {
        ensureGeofenceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, geofence_);
        onChanged();
      } else {
        geofenceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public Builder clearGeofence() {
      if (geofenceBuilder_ == null) {
        geofence_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        geofenceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public Builder removeGeofence(int index) {
      if (geofenceBuilder_ == null) {
        ensureGeofenceIsMutable();
        geofence_.remove(index);
        onChanged();
      } else {
        geofenceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public POGOProtos.Data.Geofence.GeofenceMetadata.Builder getGeofenceBuilder(
        int index) {
      return getGeofenceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public POGOProtos.Data.Geofence.GeofenceMetadataOrBuilder getGeofenceOrBuilder(
        int index) {
      if (geofenceBuilder_ == null) {
        return geofence_.get(index);  } else {
        return geofenceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Data.Geofence.GeofenceMetadataOrBuilder> 
         getGeofenceOrBuilderList() {
      if (geofenceBuilder_ != null) {
        return geofenceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(geofence_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public POGOProtos.Data.Geofence.GeofenceMetadata.Builder addGeofenceBuilder() {
      return getGeofenceFieldBuilder().addBuilder(
          POGOProtos.Data.Geofence.GeofenceMetadata.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public POGOProtos.Data.Geofence.GeofenceMetadata.Builder addGeofenceBuilder(
        int index) {
      return getGeofenceFieldBuilder().addBuilder(
          index, POGOProtos.Data.Geofence.GeofenceMetadata.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Geofence.GeofenceMetadata geofence = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Geofence.GeofenceMetadata.Builder> 
         getGeofenceBuilderList() {
      return getGeofenceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Geofence.GeofenceMetadata, POGOProtos.Data.Geofence.GeofenceMetadata.Builder, POGOProtos.Data.Geofence.GeofenceMetadataOrBuilder> 
        getGeofenceFieldBuilder() {
      if (geofenceBuilder_ == null) {
        geofenceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Data.Geofence.GeofenceMetadata, POGOProtos.Data.Geofence.GeofenceMetadata.Builder, POGOProtos.Data.Geofence.GeofenceMetadataOrBuilder>(
                geofence_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        geofence_ = null;
      }
      return geofenceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse)
  private static final POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse();
  }

  public static POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestGeofenceUpdatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<RequestGeofenceUpdatesResponse>() {
    @java.lang.Override
    public RequestGeofenceUpdatesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestGeofenceUpdatesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestGeofenceUpdatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestGeofenceUpdatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.RequestGeofenceUpdatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

