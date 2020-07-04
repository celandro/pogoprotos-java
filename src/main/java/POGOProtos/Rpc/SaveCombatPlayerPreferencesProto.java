// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SaveCombatPlayerPreferencesProto}
 */
public  final class SaveCombatPlayerPreferencesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SaveCombatPlayerPreferencesProto)
    SaveCombatPlayerPreferencesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveCombatPlayerPreferencesProto.newBuilder() to construct.
  private SaveCombatPlayerPreferencesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveCombatPlayerPreferencesProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SaveCombatPlayerPreferencesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaveCombatPlayerPreferencesProto(
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
            POGOProtos.Rpc.CombatPlayerPreferencesProto.Builder subBuilder = null;
            if (preferences_ != null) {
              subBuilder = preferences_.toBuilder();
            }
            preferences_ = input.readMessage(POGOProtos.Rpc.CombatPlayerPreferencesProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(preferences_);
              preferences_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SaveCombatPlayerPreferencesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SaveCombatPlayerPreferencesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SaveCombatPlayerPreferencesProto.class, POGOProtos.Rpc.SaveCombatPlayerPreferencesProto.Builder.class);
  }

  public static final int PREFERENCES_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.CombatPlayerPreferencesProto preferences_;
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
   * @return Whether the preferences field is set.
   */
  public boolean hasPreferences() {
    return preferences_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
   * @return The preferences.
   */
  public POGOProtos.Rpc.CombatPlayerPreferencesProto getPreferences() {
    return preferences_ == null ? POGOProtos.Rpc.CombatPlayerPreferencesProto.getDefaultInstance() : preferences_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
   */
  public POGOProtos.Rpc.CombatPlayerPreferencesProtoOrBuilder getPreferencesOrBuilder() {
    return getPreferences();
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
    if (preferences_ != null) {
      output.writeMessage(1, getPreferences());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (preferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPreferences());
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
    if (!(obj instanceof POGOProtos.Rpc.SaveCombatPlayerPreferencesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SaveCombatPlayerPreferencesProto other = (POGOProtos.Rpc.SaveCombatPlayerPreferencesProto) obj;

    if (hasPreferences() != other.hasPreferences()) return false;
    if (hasPreferences()) {
      if (!getPreferences()
          .equals(other.getPreferences())) return false;
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
    if (hasPreferences()) {
      hash = (37 * hash) + PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getPreferences().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SaveCombatPlayerPreferencesProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SaveCombatPlayerPreferencesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SaveCombatPlayerPreferencesProto)
      POGOProtos.Rpc.SaveCombatPlayerPreferencesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SaveCombatPlayerPreferencesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SaveCombatPlayerPreferencesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SaveCombatPlayerPreferencesProto.class, POGOProtos.Rpc.SaveCombatPlayerPreferencesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SaveCombatPlayerPreferencesProto.newBuilder()
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
      if (preferencesBuilder_ == null) {
        preferences_ = null;
      } else {
        preferences_ = null;
        preferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_SaveCombatPlayerPreferencesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SaveCombatPlayerPreferencesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.SaveCombatPlayerPreferencesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SaveCombatPlayerPreferencesProto build() {
      POGOProtos.Rpc.SaveCombatPlayerPreferencesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SaveCombatPlayerPreferencesProto buildPartial() {
      POGOProtos.Rpc.SaveCombatPlayerPreferencesProto result = new POGOProtos.Rpc.SaveCombatPlayerPreferencesProto(this);
      if (preferencesBuilder_ == null) {
        result.preferences_ = preferences_;
      } else {
        result.preferences_ = preferencesBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.SaveCombatPlayerPreferencesProto) {
        return mergeFrom((POGOProtos.Rpc.SaveCombatPlayerPreferencesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SaveCombatPlayerPreferencesProto other) {
      if (other == POGOProtos.Rpc.SaveCombatPlayerPreferencesProto.getDefaultInstance()) return this;
      if (other.hasPreferences()) {
        mergePreferences(other.getPreferences());
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
      POGOProtos.Rpc.SaveCombatPlayerPreferencesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SaveCombatPlayerPreferencesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.CombatPlayerPreferencesProto preferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatPlayerPreferencesProto, POGOProtos.Rpc.CombatPlayerPreferencesProto.Builder, POGOProtos.Rpc.CombatPlayerPreferencesProtoOrBuilder> preferencesBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
     * @return Whether the preferences field is set.
     */
    public boolean hasPreferences() {
      return preferencesBuilder_ != null || preferences_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
     * @return The preferences.
     */
    public POGOProtos.Rpc.CombatPlayerPreferencesProto getPreferences() {
      if (preferencesBuilder_ == null) {
        return preferences_ == null ? POGOProtos.Rpc.CombatPlayerPreferencesProto.getDefaultInstance() : preferences_;
      } else {
        return preferencesBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
     */
    public Builder setPreferences(POGOProtos.Rpc.CombatPlayerPreferencesProto value) {
      if (preferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        preferences_ = value;
        onChanged();
      } else {
        preferencesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
     */
    public Builder setPreferences(
        POGOProtos.Rpc.CombatPlayerPreferencesProto.Builder builderForValue) {
      if (preferencesBuilder_ == null) {
        preferences_ = builderForValue.build();
        onChanged();
      } else {
        preferencesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
     */
    public Builder mergePreferences(POGOProtos.Rpc.CombatPlayerPreferencesProto value) {
      if (preferencesBuilder_ == null) {
        if (preferences_ != null) {
          preferences_ =
            POGOProtos.Rpc.CombatPlayerPreferencesProto.newBuilder(preferences_).mergeFrom(value).buildPartial();
        } else {
          preferences_ = value;
        }
        onChanged();
      } else {
        preferencesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
     */
    public Builder clearPreferences() {
      if (preferencesBuilder_ == null) {
        preferences_ = null;
        onChanged();
      } else {
        preferences_ = null;
        preferencesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
     */
    public POGOProtos.Rpc.CombatPlayerPreferencesProto.Builder getPreferencesBuilder() {
      
      onChanged();
      return getPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
     */
    public POGOProtos.Rpc.CombatPlayerPreferencesProtoOrBuilder getPreferencesOrBuilder() {
      if (preferencesBuilder_ != null) {
        return preferencesBuilder_.getMessageOrBuilder();
      } else {
        return preferences_ == null ?
            POGOProtos.Rpc.CombatPlayerPreferencesProto.getDefaultInstance() : preferences_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerPreferencesProto preferences = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatPlayerPreferencesProto, POGOProtos.Rpc.CombatPlayerPreferencesProto.Builder, POGOProtos.Rpc.CombatPlayerPreferencesProtoOrBuilder> 
        getPreferencesFieldBuilder() {
      if (preferencesBuilder_ == null) {
        preferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CombatPlayerPreferencesProto, POGOProtos.Rpc.CombatPlayerPreferencesProto.Builder, POGOProtos.Rpc.CombatPlayerPreferencesProtoOrBuilder>(
                getPreferences(),
                getParentForChildren(),
                isClean());
        preferences_ = null;
      }
      return preferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SaveCombatPlayerPreferencesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SaveCombatPlayerPreferencesProto)
  private static final POGOProtos.Rpc.SaveCombatPlayerPreferencesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SaveCombatPlayerPreferencesProto();
  }

  public static POGOProtos.Rpc.SaveCombatPlayerPreferencesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveCombatPlayerPreferencesProto>
      PARSER = new com.google.protobuf.AbstractParser<SaveCombatPlayerPreferencesProto>() {
    @java.lang.Override
    public SaveCombatPlayerPreferencesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaveCombatPlayerPreferencesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveCombatPlayerPreferencesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveCombatPlayerPreferencesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SaveCombatPlayerPreferencesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
