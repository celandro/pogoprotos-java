// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/IapItemCategoryDisplay.proto

package POGOProtos.Settings.Master;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.IapItemCategoryDisplay}
 */
public  final class IapItemCategoryDisplay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.IapItemCategoryDisplay)
    IapItemCategoryDisplayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IapItemCategoryDisplay.newBuilder() to construct.
  private IapItemCategoryDisplay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IapItemCategoryDisplay() {
    category_ = 0;
    name_ = "";
    bannerTitle_ = "";
    imageUrl_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IapItemCategoryDisplay();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IapItemCategoryDisplay(
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

            category_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            hidden_ = input.readBool();
            break;
          }
          case 32: {

            sortOrder_ = input.readInt32();
            break;
          }
          case 40: {

            bannerEnabled_ = input.readBool();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            bannerTitle_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            imageUrl_ = s;
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
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
    return POGOProtos.Settings.Master.IapItemCategoryDisplayOuterClass.internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.IapItemCategoryDisplayOuterClass.internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.IapItemCategoryDisplay.class, POGOProtos.Settings.Master.IapItemCategoryDisplay.Builder.class);
  }

  public static final int CATEGORY_FIELD_NUMBER = 1;
  private int category_;
  /**
   * <code>.POGOProtos.Enums.HoloIapItemCategory category = 1;</code>
   * @return The enum numeric value on the wire for category.
   */
  public int getCategoryValue() {
    return category_;
  }
  /**
   * <code>.POGOProtos.Enums.HoloIapItemCategory category = 1;</code>
   * @return The category.
   */
  public POGOProtos.Enums.HoloIapItemCategory getCategory() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.HoloIapItemCategory result = POGOProtos.Enums.HoloIapItemCategory.valueOf(category_);
    return result == null ? POGOProtos.Enums.HoloIapItemCategory.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HIDDEN_FIELD_NUMBER = 3;
  private boolean hidden_;
  /**
   * <code>bool hidden = 3;</code>
   * @return The hidden.
   */
  public boolean getHidden() {
    return hidden_;
  }

  public static final int SORT_ORDER_FIELD_NUMBER = 4;
  private int sortOrder_;
  /**
   * <code>int32 sort_order = 4;</code>
   * @return The sortOrder.
   */
  public int getSortOrder() {
    return sortOrder_;
  }

  public static final int BANNER_ENABLED_FIELD_NUMBER = 5;
  private boolean bannerEnabled_;
  /**
   * <code>bool banner_enabled = 5;</code>
   * @return The bannerEnabled.
   */
  public boolean getBannerEnabled() {
    return bannerEnabled_;
  }

  public static final int BANNER_TITLE_FIELD_NUMBER = 6;
  private volatile java.lang.Object bannerTitle_;
  /**
   * <code>string banner_title = 6;</code>
   * @return The bannerTitle.
   */
  public java.lang.String getBannerTitle() {
    java.lang.Object ref = bannerTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bannerTitle_ = s;
      return s;
    }
  }
  /**
   * <code>string banner_title = 6;</code>
   * @return The bytes for bannerTitle.
   */
  public com.google.protobuf.ByteString
      getBannerTitleBytes() {
    java.lang.Object ref = bannerTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bannerTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_URL_FIELD_NUMBER = 7;
  private volatile java.lang.Object imageUrl_;
  /**
   * <code>string image_url = 7;</code>
   * @return The imageUrl.
   */
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
   * <code>string image_url = 7;</code>
   * @return The bytes for imageUrl.
   */
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

  public static final int DESCRIPTION_FIELD_NUMBER = 8;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 8;</code>
   * @return The description.
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 8;</code>
   * @return The bytes for description.
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
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
    if (category_ != POGOProtos.Enums.HoloIapItemCategory.IAP_CATEGORY_NONE.getNumber()) {
      output.writeEnum(1, category_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (hidden_ != false) {
      output.writeBool(3, hidden_);
    }
    if (sortOrder_ != 0) {
      output.writeInt32(4, sortOrder_);
    }
    if (bannerEnabled_ != false) {
      output.writeBool(5, bannerEnabled_);
    }
    if (!getBannerTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, bannerTitle_);
    }
    if (!getImageUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, imageUrl_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, description_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (category_ != POGOProtos.Enums.HoloIapItemCategory.IAP_CATEGORY_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, category_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (hidden_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, hidden_);
    }
    if (sortOrder_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, sortOrder_);
    }
    if (bannerEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, bannerEnabled_);
    }
    if (!getBannerTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, bannerTitle_);
    }
    if (!getImageUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, imageUrl_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, description_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.IapItemCategoryDisplay)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.IapItemCategoryDisplay other = (POGOProtos.Settings.Master.IapItemCategoryDisplay) obj;

    if (category_ != other.category_) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getHidden()
        != other.getHidden()) return false;
    if (getSortOrder()
        != other.getSortOrder()) return false;
    if (getBannerEnabled()
        != other.getBannerEnabled()) return false;
    if (!getBannerTitle()
        .equals(other.getBannerTitle())) return false;
    if (!getImageUrl()
        .equals(other.getImageUrl())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
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
    hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + category_;
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + HIDDEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHidden());
    hash = (37 * hash) + SORT_ORDER_FIELD_NUMBER;
    hash = (53 * hash) + getSortOrder();
    hash = (37 * hash) + BANNER_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBannerEnabled());
    hash = (37 * hash) + BANNER_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getBannerTitle().hashCode();
    hash = (37 * hash) + IMAGE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getImageUrl().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.IapItemCategoryDisplay parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.IapItemCategoryDisplay prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.IapItemCategoryDisplay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.IapItemCategoryDisplay)
      POGOProtos.Settings.Master.IapItemCategoryDisplayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.IapItemCategoryDisplayOuterClass.internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.IapItemCategoryDisplayOuterClass.internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.IapItemCategoryDisplay.class, POGOProtos.Settings.Master.IapItemCategoryDisplay.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.IapItemCategoryDisplay.newBuilder()
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
      category_ = 0;

      name_ = "";

      hidden_ = false;

      sortOrder_ = 0;

      bannerEnabled_ = false;

      bannerTitle_ = "";

      imageUrl_ = "";

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.IapItemCategoryDisplayOuterClass.internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.IapItemCategoryDisplay getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.IapItemCategoryDisplay.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.IapItemCategoryDisplay build() {
      POGOProtos.Settings.Master.IapItemCategoryDisplay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.IapItemCategoryDisplay buildPartial() {
      POGOProtos.Settings.Master.IapItemCategoryDisplay result = new POGOProtos.Settings.Master.IapItemCategoryDisplay(this);
      result.category_ = category_;
      result.name_ = name_;
      result.hidden_ = hidden_;
      result.sortOrder_ = sortOrder_;
      result.bannerEnabled_ = bannerEnabled_;
      result.bannerTitle_ = bannerTitle_;
      result.imageUrl_ = imageUrl_;
      result.description_ = description_;
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
      if (other instanceof POGOProtos.Settings.Master.IapItemCategoryDisplay) {
        return mergeFrom((POGOProtos.Settings.Master.IapItemCategoryDisplay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.IapItemCategoryDisplay other) {
      if (other == POGOProtos.Settings.Master.IapItemCategoryDisplay.getDefaultInstance()) return this;
      if (other.category_ != 0) {
        setCategoryValue(other.getCategoryValue());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getHidden() != false) {
        setHidden(other.getHidden());
      }
      if (other.getSortOrder() != 0) {
        setSortOrder(other.getSortOrder());
      }
      if (other.getBannerEnabled() != false) {
        setBannerEnabled(other.getBannerEnabled());
      }
      if (!other.getBannerTitle().isEmpty()) {
        bannerTitle_ = other.bannerTitle_;
        onChanged();
      }
      if (!other.getImageUrl().isEmpty()) {
        imageUrl_ = other.imageUrl_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
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
      POGOProtos.Settings.Master.IapItemCategoryDisplay parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.IapItemCategoryDisplay) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int category_ = 0;
    /**
     * <code>.POGOProtos.Enums.HoloIapItemCategory category = 1;</code>
     * @return The enum numeric value on the wire for category.
     */
    public int getCategoryValue() {
      return category_;
    }
    /**
     * <code>.POGOProtos.Enums.HoloIapItemCategory category = 1;</code>
     * @param value The enum numeric value on the wire for category to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryValue(int value) {
      category_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.HoloIapItemCategory category = 1;</code>
     * @return The category.
     */
    public POGOProtos.Enums.HoloIapItemCategory getCategory() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.HoloIapItemCategory result = POGOProtos.Enums.HoloIapItemCategory.valueOf(category_);
      return result == null ? POGOProtos.Enums.HoloIapItemCategory.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.HoloIapItemCategory category = 1;</code>
     * @param value The category to set.
     * @return This builder for chaining.
     */
    public Builder setCategory(POGOProtos.Enums.HoloIapItemCategory value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      category_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.HoloIapItemCategory category = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategory() {
      
      category_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private boolean hidden_ ;
    /**
     * <code>bool hidden = 3;</code>
     * @return The hidden.
     */
    public boolean getHidden() {
      return hidden_;
    }
    /**
     * <code>bool hidden = 3;</code>
     * @param value The hidden to set.
     * @return This builder for chaining.
     */
    public Builder setHidden(boolean value) {
      
      hidden_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool hidden = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHidden() {
      
      hidden_ = false;
      onChanged();
      return this;
    }

    private int sortOrder_ ;
    /**
     * <code>int32 sort_order = 4;</code>
     * @return The sortOrder.
     */
    public int getSortOrder() {
      return sortOrder_;
    }
    /**
     * <code>int32 sort_order = 4;</code>
     * @param value The sortOrder to set.
     * @return This builder for chaining.
     */
    public Builder setSortOrder(int value) {
      
      sortOrder_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 sort_order = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSortOrder() {
      
      sortOrder_ = 0;
      onChanged();
      return this;
    }

    private boolean bannerEnabled_ ;
    /**
     * <code>bool banner_enabled = 5;</code>
     * @return The bannerEnabled.
     */
    public boolean getBannerEnabled() {
      return bannerEnabled_;
    }
    /**
     * <code>bool banner_enabled = 5;</code>
     * @param value The bannerEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setBannerEnabled(boolean value) {
      
      bannerEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool banner_enabled = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBannerEnabled() {
      
      bannerEnabled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object bannerTitle_ = "";
    /**
     * <code>string banner_title = 6;</code>
     * @return The bannerTitle.
     */
    public java.lang.String getBannerTitle() {
      java.lang.Object ref = bannerTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bannerTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string banner_title = 6;</code>
     * @return The bytes for bannerTitle.
     */
    public com.google.protobuf.ByteString
        getBannerTitleBytes() {
      java.lang.Object ref = bannerTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bannerTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string banner_title = 6;</code>
     * @param value The bannerTitle to set.
     * @return This builder for chaining.
     */
    public Builder setBannerTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bannerTitle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string banner_title = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBannerTitle() {
      
      bannerTitle_ = getDefaultInstance().getBannerTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string banner_title = 6;</code>
     * @param value The bytes for bannerTitle to set.
     * @return This builder for chaining.
     */
    public Builder setBannerTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bannerTitle_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object imageUrl_ = "";
    /**
     * <code>string image_url = 7;</code>
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
     * <code>string image_url = 7;</code>
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
     * <code>string image_url = 7;</code>
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
     * <code>string image_url = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageUrl() {
      
      imageUrl_ = getDefaultInstance().getImageUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string image_url = 7;</code>
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

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 8;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 8;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 8;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 8;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.IapItemCategoryDisplay)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.IapItemCategoryDisplay)
  private static final POGOProtos.Settings.Master.IapItemCategoryDisplay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.IapItemCategoryDisplay();
  }

  public static POGOProtos.Settings.Master.IapItemCategoryDisplay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IapItemCategoryDisplay>
      PARSER = new com.google.protobuf.AbstractParser<IapItemCategoryDisplay>() {
    @java.lang.Override
    public IapItemCategoryDisplay parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IapItemCategoryDisplay(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IapItemCategoryDisplay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IapItemCategoryDisplay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.IapItemCategoryDisplay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

