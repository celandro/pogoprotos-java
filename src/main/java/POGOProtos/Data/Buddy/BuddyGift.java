// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Buddy/BuddyGift.proto

package POGOProtos.Data.Buddy;

/**
 * Protobuf type {@code POGOProtos.Data.Buddy.BuddyGift}
 */
public  final class BuddyGift extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Buddy.BuddyGift)
    BuddyGiftOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuddyGift.newBuilder() to construct.
  private BuddyGift(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuddyGift() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuddyGift();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuddyGift(
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
            POGOProtos.Data.Souvenir.Builder subBuilder = null;
            if (souvenir_ != null) {
              subBuilder = souvenir_.toBuilder();
            }
            souvenir_ = input.readMessage(POGOProtos.Data.Souvenir.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(souvenir_);
              souvenir_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            POGOProtos.Inventory.Loot.Builder subBuilder = null;
            if (lootProto_ != null) {
              subBuilder = lootProto_.toBuilder();
            }
            lootProto_ = input.readMessage(POGOProtos.Inventory.Loot.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lootProto_);
              lootProto_ = subBuilder.buildPartial();
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
    return POGOProtos.Data.Buddy.BuddyGiftOuterClass.internal_static_POGOProtos_Data_Buddy_BuddyGift_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Buddy.BuddyGiftOuterClass.internal_static_POGOProtos_Data_Buddy_BuddyGift_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Buddy.BuddyGift.class, POGOProtos.Data.Buddy.BuddyGift.Builder.class);
  }

  public static final int SOUVENIR_FIELD_NUMBER = 1;
  private POGOProtos.Data.Souvenir souvenir_;
  /**
   * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
   * @return Whether the souvenir field is set.
   */
  public boolean hasSouvenir() {
    return souvenir_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
   * @return The souvenir.
   */
  public POGOProtos.Data.Souvenir getSouvenir() {
    return souvenir_ == null ? POGOProtos.Data.Souvenir.getDefaultInstance() : souvenir_;
  }
  /**
   * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
   */
  public POGOProtos.Data.SouvenirOrBuilder getSouvenirOrBuilder() {
    return getSouvenir();
  }

  public static final int LOOT_PROTO_FIELD_NUMBER = 2;
  private POGOProtos.Inventory.Loot lootProto_;
  /**
   * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
   * @return Whether the lootProto field is set.
   */
  public boolean hasLootProto() {
    return lootProto_ != null;
  }
  /**
   * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
   * @return The lootProto.
   */
  public POGOProtos.Inventory.Loot getLootProto() {
    return lootProto_ == null ? POGOProtos.Inventory.Loot.getDefaultInstance() : lootProto_;
  }
  /**
   * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
   */
  public POGOProtos.Inventory.LootOrBuilder getLootProtoOrBuilder() {
    return getLootProto();
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
    if (souvenir_ != null) {
      output.writeMessage(1, getSouvenir());
    }
    if (lootProto_ != null) {
      output.writeMessage(2, getLootProto());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (souvenir_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSouvenir());
    }
    if (lootProto_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLootProto());
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
    if (!(obj instanceof POGOProtos.Data.Buddy.BuddyGift)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Buddy.BuddyGift other = (POGOProtos.Data.Buddy.BuddyGift) obj;

    if (hasSouvenir() != other.hasSouvenir()) return false;
    if (hasSouvenir()) {
      if (!getSouvenir()
          .equals(other.getSouvenir())) return false;
    }
    if (hasLootProto() != other.hasLootProto()) return false;
    if (hasLootProto()) {
      if (!getLootProto()
          .equals(other.getLootProto())) return false;
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
    if (hasSouvenir()) {
      hash = (37 * hash) + SOUVENIR_FIELD_NUMBER;
      hash = (53 * hash) + getSouvenir().hashCode();
    }
    if (hasLootProto()) {
      hash = (37 * hash) + LOOT_PROTO_FIELD_NUMBER;
      hash = (53 * hash) + getLootProto().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Buddy.BuddyGift parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Buddy.BuddyGift prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Buddy.BuddyGift}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Buddy.BuddyGift)
      POGOProtos.Data.Buddy.BuddyGiftOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Buddy.BuddyGiftOuterClass.internal_static_POGOProtos_Data_Buddy_BuddyGift_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Buddy.BuddyGiftOuterClass.internal_static_POGOProtos_Data_Buddy_BuddyGift_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Buddy.BuddyGift.class, POGOProtos.Data.Buddy.BuddyGift.Builder.class);
    }

    // Construct using POGOProtos.Data.Buddy.BuddyGift.newBuilder()
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
      if (souvenirBuilder_ == null) {
        souvenir_ = null;
      } else {
        souvenir_ = null;
        souvenirBuilder_ = null;
      }
      if (lootProtoBuilder_ == null) {
        lootProto_ = null;
      } else {
        lootProto_ = null;
        lootProtoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Buddy.BuddyGiftOuterClass.internal_static_POGOProtos_Data_Buddy_BuddyGift_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Buddy.BuddyGift getDefaultInstanceForType() {
      return POGOProtos.Data.Buddy.BuddyGift.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Buddy.BuddyGift build() {
      POGOProtos.Data.Buddy.BuddyGift result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Buddy.BuddyGift buildPartial() {
      POGOProtos.Data.Buddy.BuddyGift result = new POGOProtos.Data.Buddy.BuddyGift(this);
      if (souvenirBuilder_ == null) {
        result.souvenir_ = souvenir_;
      } else {
        result.souvenir_ = souvenirBuilder_.build();
      }
      if (lootProtoBuilder_ == null) {
        result.lootProto_ = lootProto_;
      } else {
        result.lootProto_ = lootProtoBuilder_.build();
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
      if (other instanceof POGOProtos.Data.Buddy.BuddyGift) {
        return mergeFrom((POGOProtos.Data.Buddy.BuddyGift)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Buddy.BuddyGift other) {
      if (other == POGOProtos.Data.Buddy.BuddyGift.getDefaultInstance()) return this;
      if (other.hasSouvenir()) {
        mergeSouvenir(other.getSouvenir());
      }
      if (other.hasLootProto()) {
        mergeLootProto(other.getLootProto());
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
      POGOProtos.Data.Buddy.BuddyGift parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Buddy.BuddyGift) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Data.Souvenir souvenir_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Souvenir, POGOProtos.Data.Souvenir.Builder, POGOProtos.Data.SouvenirOrBuilder> souvenirBuilder_;
    /**
     * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
     * @return Whether the souvenir field is set.
     */
    public boolean hasSouvenir() {
      return souvenirBuilder_ != null || souvenir_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
     * @return The souvenir.
     */
    public POGOProtos.Data.Souvenir getSouvenir() {
      if (souvenirBuilder_ == null) {
        return souvenir_ == null ? POGOProtos.Data.Souvenir.getDefaultInstance() : souvenir_;
      } else {
        return souvenirBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
     */
    public Builder setSouvenir(POGOProtos.Data.Souvenir value) {
      if (souvenirBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        souvenir_ = value;
        onChanged();
      } else {
        souvenirBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
     */
    public Builder setSouvenir(
        POGOProtos.Data.Souvenir.Builder builderForValue) {
      if (souvenirBuilder_ == null) {
        souvenir_ = builderForValue.build();
        onChanged();
      } else {
        souvenirBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
     */
    public Builder mergeSouvenir(POGOProtos.Data.Souvenir value) {
      if (souvenirBuilder_ == null) {
        if (souvenir_ != null) {
          souvenir_ =
            POGOProtos.Data.Souvenir.newBuilder(souvenir_).mergeFrom(value).buildPartial();
        } else {
          souvenir_ = value;
        }
        onChanged();
      } else {
        souvenirBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
     */
    public Builder clearSouvenir() {
      if (souvenirBuilder_ == null) {
        souvenir_ = null;
        onChanged();
      } else {
        souvenir_ = null;
        souvenirBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
     */
    public POGOProtos.Data.Souvenir.Builder getSouvenirBuilder() {
      
      onChanged();
      return getSouvenirFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
     */
    public POGOProtos.Data.SouvenirOrBuilder getSouvenirOrBuilder() {
      if (souvenirBuilder_ != null) {
        return souvenirBuilder_.getMessageOrBuilder();
      } else {
        return souvenir_ == null ?
            POGOProtos.Data.Souvenir.getDefaultInstance() : souvenir_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Souvenir souvenir = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Souvenir, POGOProtos.Data.Souvenir.Builder, POGOProtos.Data.SouvenirOrBuilder> 
        getSouvenirFieldBuilder() {
      if (souvenirBuilder_ == null) {
        souvenirBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Souvenir, POGOProtos.Data.Souvenir.Builder, POGOProtos.Data.SouvenirOrBuilder>(
                getSouvenir(),
                getParentForChildren(),
                isClean());
        souvenir_ = null;
      }
      return souvenirBuilder_;
    }

    private POGOProtos.Inventory.Loot lootProto_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Inventory.Loot, POGOProtos.Inventory.Loot.Builder, POGOProtos.Inventory.LootOrBuilder> lootProtoBuilder_;
    /**
     * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
     * @return Whether the lootProto field is set.
     */
    public boolean hasLootProto() {
      return lootProtoBuilder_ != null || lootProto_ != null;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
     * @return The lootProto.
     */
    public POGOProtos.Inventory.Loot getLootProto() {
      if (lootProtoBuilder_ == null) {
        return lootProto_ == null ? POGOProtos.Inventory.Loot.getDefaultInstance() : lootProto_;
      } else {
        return lootProtoBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
     */
    public Builder setLootProto(POGOProtos.Inventory.Loot value) {
      if (lootProtoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lootProto_ = value;
        onChanged();
      } else {
        lootProtoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
     */
    public Builder setLootProto(
        POGOProtos.Inventory.Loot.Builder builderForValue) {
      if (lootProtoBuilder_ == null) {
        lootProto_ = builderForValue.build();
        onChanged();
      } else {
        lootProtoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
     */
    public Builder mergeLootProto(POGOProtos.Inventory.Loot value) {
      if (lootProtoBuilder_ == null) {
        if (lootProto_ != null) {
          lootProto_ =
            POGOProtos.Inventory.Loot.newBuilder(lootProto_).mergeFrom(value).buildPartial();
        } else {
          lootProto_ = value;
        }
        onChanged();
      } else {
        lootProtoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
     */
    public Builder clearLootProto() {
      if (lootProtoBuilder_ == null) {
        lootProto_ = null;
        onChanged();
      } else {
        lootProto_ = null;
        lootProtoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
     */
    public POGOProtos.Inventory.Loot.Builder getLootProtoBuilder() {
      
      onChanged();
      return getLootProtoFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
     */
    public POGOProtos.Inventory.LootOrBuilder getLootProtoOrBuilder() {
      if (lootProtoBuilder_ != null) {
        return lootProtoBuilder_.getMessageOrBuilder();
      } else {
        return lootProto_ == null ?
            POGOProtos.Inventory.Loot.getDefaultInstance() : lootProto_;
      }
    }
    /**
     * <code>.POGOProtos.Inventory.Loot loot_proto = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Inventory.Loot, POGOProtos.Inventory.Loot.Builder, POGOProtos.Inventory.LootOrBuilder> 
        getLootProtoFieldBuilder() {
      if (lootProtoBuilder_ == null) {
        lootProtoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Inventory.Loot, POGOProtos.Inventory.Loot.Builder, POGOProtos.Inventory.LootOrBuilder>(
                getLootProto(),
                getParentForChildren(),
                isClean());
        lootProto_ = null;
      }
      return lootProtoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Buddy.BuddyGift)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Buddy.BuddyGift)
  private static final POGOProtos.Data.Buddy.BuddyGift DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Buddy.BuddyGift();
  }

  public static POGOProtos.Data.Buddy.BuddyGift getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuddyGift>
      PARSER = new com.google.protobuf.AbstractParser<BuddyGift>() {
    @java.lang.Override
    public BuddyGift parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuddyGift(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuddyGift> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuddyGift> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Buddy.BuddyGift getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

