// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Platform/Responses/GetClientTelemetrySettingsResponse.proto

package POGOProtos.Networking.Responses.Platform.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse}
 */
public final class GetClientTelemetrySettingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse)
    GetClientTelemetrySettingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetClientTelemetrySettingsResponse.newBuilder() to construct.
  private GetClientTelemetrySettingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetClientTelemetrySettingsResponse() {
    nine_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetClientTelemetrySettingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetClientTelemetrySettingsResponse(
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

            one_ = input.readInt32();
            break;
          }
          case 16: {

            two_ = input.readInt32();
            break;
          }
          case 24: {

            three_ = input.readInt32();
            break;
          }
          case 32: {

            four_ = input.readInt32();
            break;
          }
          case 40: {

            five_ = input.readInt32();
            break;
          }
          case 49: {

            six_ = input.readFixed64();
            break;
          }
          case 56: {

            seven_ = input.readInt32();
            break;
          }
          case 65: {

            eight_ = input.readFixed64();
            break;
          }
          case 74: {
            java.lang.String s = input.readStringRequireUtf8();

            nine_ = s;
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
    return POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientTelemetrySettingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientTelemetrySettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse.class, POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse.Builder.class);
  }

  public static final int ONE_FIELD_NUMBER = 1;
  private int one_;
  /**
   * <code>int32 one = 1;</code>
   * @return The one.
   */
  @java.lang.Override
  public int getOne() {
    return one_;
  }

  public static final int TWO_FIELD_NUMBER = 2;
  private int two_;
  /**
   * <code>int32 two = 2;</code>
   * @return The two.
   */
  @java.lang.Override
  public int getTwo() {
    return two_;
  }

  public static final int THREE_FIELD_NUMBER = 3;
  private int three_;
  /**
   * <code>int32 three = 3;</code>
   * @return The three.
   */
  @java.lang.Override
  public int getThree() {
    return three_;
  }

  public static final int FOUR_FIELD_NUMBER = 4;
  private int four_;
  /**
   * <code>int32 four = 4;</code>
   * @return The four.
   */
  @java.lang.Override
  public int getFour() {
    return four_;
  }

  public static final int FIVE_FIELD_NUMBER = 5;
  private int five_;
  /**
   * <code>int32 five = 5;</code>
   * @return The five.
   */
  @java.lang.Override
  public int getFive() {
    return five_;
  }

  public static final int SIX_FIELD_NUMBER = 6;
  private long six_;
  /**
   * <code>fixed64 six = 6;</code>
   * @return The six.
   */
  @java.lang.Override
  public long getSix() {
    return six_;
  }

  public static final int SEVEN_FIELD_NUMBER = 7;
  private int seven_;
  /**
   * <code>int32 seven = 7;</code>
   * @return The seven.
   */
  @java.lang.Override
  public int getSeven() {
    return seven_;
  }

  public static final int EIGHT_FIELD_NUMBER = 8;
  private long eight_;
  /**
   * <code>fixed64 eight = 8;</code>
   * @return The eight.
   */
  @java.lang.Override
  public long getEight() {
    return eight_;
  }

  public static final int NINE_FIELD_NUMBER = 9;
  private volatile java.lang.Object nine_;
  /**
   * <code>string nine = 9;</code>
   * @return The nine.
   */
  @java.lang.Override
  public java.lang.String getNine() {
    java.lang.Object ref = nine_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nine_ = s;
      return s;
    }
  }
  /**
   * <code>string nine = 9;</code>
   * @return The bytes for nine.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNineBytes() {
    java.lang.Object ref = nine_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nine_ = b;
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
    if (one_ != 0) {
      output.writeInt32(1, one_);
    }
    if (two_ != 0) {
      output.writeInt32(2, two_);
    }
    if (three_ != 0) {
      output.writeInt32(3, three_);
    }
    if (four_ != 0) {
      output.writeInt32(4, four_);
    }
    if (five_ != 0) {
      output.writeInt32(5, five_);
    }
    if (six_ != 0L) {
      output.writeFixed64(6, six_);
    }
    if (seven_ != 0) {
      output.writeInt32(7, seven_);
    }
    if (eight_ != 0L) {
      output.writeFixed64(8, eight_);
    }
    if (!getNineBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, nine_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (one_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, one_);
    }
    if (two_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, two_);
    }
    if (three_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, three_);
    }
    if (four_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, four_);
    }
    if (five_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, five_);
    }
    if (six_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(6, six_);
    }
    if (seven_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, seven_);
    }
    if (eight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(8, eight_);
    }
    if (!getNineBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, nine_);
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
    if (!(obj instanceof POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse other = (POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse) obj;

    if (getOne()
        != other.getOne()) return false;
    if (getTwo()
        != other.getTwo()) return false;
    if (getThree()
        != other.getThree()) return false;
    if (getFour()
        != other.getFour()) return false;
    if (getFive()
        != other.getFive()) return false;
    if (getSix()
        != other.getSix()) return false;
    if (getSeven()
        != other.getSeven()) return false;
    if (getEight()
        != other.getEight()) return false;
    if (!getNine()
        .equals(other.getNine())) return false;
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
    hash = (37 * hash) + ONE_FIELD_NUMBER;
    hash = (53 * hash) + getOne();
    hash = (37 * hash) + TWO_FIELD_NUMBER;
    hash = (53 * hash) + getTwo();
    hash = (37 * hash) + THREE_FIELD_NUMBER;
    hash = (53 * hash) + getThree();
    hash = (37 * hash) + FOUR_FIELD_NUMBER;
    hash = (53 * hash) + getFour();
    hash = (37 * hash) + FIVE_FIELD_NUMBER;
    hash = (53 * hash) + getFive();
    hash = (37 * hash) + SIX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSix());
    hash = (37 * hash) + SEVEN_FIELD_NUMBER;
    hash = (53 * hash) + getSeven();
    hash = (37 * hash) + EIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEight());
    hash = (37 * hash) + NINE_FIELD_NUMBER;
    hash = (53 * hash) + getNine().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse)
      POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientTelemetrySettingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientTelemetrySettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse.class, POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse.newBuilder()
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
      one_ = 0;

      two_ = 0;

      three_ = 0;

      four_ = 0;

      five_ = 0;

      six_ = 0L;

      seven_ = 0;

      eight_ = 0L;

      nine_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetClientTelemetrySettingsResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse build() {
      POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse buildPartial() {
      POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse result = new POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse(this);
      result.one_ = one_;
      result.two_ = two_;
      result.three_ = three_;
      result.four_ = four_;
      result.five_ = five_;
      result.six_ = six_;
      result.seven_ = seven_;
      result.eight_ = eight_;
      result.nine_ = nine_;
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
      if (other instanceof POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse other) {
      if (other == POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse.getDefaultInstance()) return this;
      if (other.getOne() != 0) {
        setOne(other.getOne());
      }
      if (other.getTwo() != 0) {
        setTwo(other.getTwo());
      }
      if (other.getThree() != 0) {
        setThree(other.getThree());
      }
      if (other.getFour() != 0) {
        setFour(other.getFour());
      }
      if (other.getFive() != 0) {
        setFive(other.getFive());
      }
      if (other.getSix() != 0L) {
        setSix(other.getSix());
      }
      if (other.getSeven() != 0) {
        setSeven(other.getSeven());
      }
      if (other.getEight() != 0L) {
        setEight(other.getEight());
      }
      if (!other.getNine().isEmpty()) {
        nine_ = other.nine_;
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
      POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int one_ ;
    /**
     * <code>int32 one = 1;</code>
     * @return The one.
     */
    @java.lang.Override
    public int getOne() {
      return one_;
    }
    /**
     * <code>int32 one = 1;</code>
     * @param value The one to set.
     * @return This builder for chaining.
     */
    public Builder setOne(int value) {
      
      one_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 one = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOne() {
      
      one_ = 0;
      onChanged();
      return this;
    }

    private int two_ ;
    /**
     * <code>int32 two = 2;</code>
     * @return The two.
     */
    @java.lang.Override
    public int getTwo() {
      return two_;
    }
    /**
     * <code>int32 two = 2;</code>
     * @param value The two to set.
     * @return This builder for chaining.
     */
    public Builder setTwo(int value) {
      
      two_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 two = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTwo() {
      
      two_ = 0;
      onChanged();
      return this;
    }

    private int three_ ;
    /**
     * <code>int32 three = 3;</code>
     * @return The three.
     */
    @java.lang.Override
    public int getThree() {
      return three_;
    }
    /**
     * <code>int32 three = 3;</code>
     * @param value The three to set.
     * @return This builder for chaining.
     */
    public Builder setThree(int value) {
      
      three_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 three = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearThree() {
      
      three_ = 0;
      onChanged();
      return this;
    }

    private int four_ ;
    /**
     * <code>int32 four = 4;</code>
     * @return The four.
     */
    @java.lang.Override
    public int getFour() {
      return four_;
    }
    /**
     * <code>int32 four = 4;</code>
     * @param value The four to set.
     * @return This builder for chaining.
     */
    public Builder setFour(int value) {
      
      four_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 four = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFour() {
      
      four_ = 0;
      onChanged();
      return this;
    }

    private int five_ ;
    /**
     * <code>int32 five = 5;</code>
     * @return The five.
     */
    @java.lang.Override
    public int getFive() {
      return five_;
    }
    /**
     * <code>int32 five = 5;</code>
     * @param value The five to set.
     * @return This builder for chaining.
     */
    public Builder setFive(int value) {
      
      five_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 five = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFive() {
      
      five_ = 0;
      onChanged();
      return this;
    }

    private long six_ ;
    /**
     * <code>fixed64 six = 6;</code>
     * @return The six.
     */
    @java.lang.Override
    public long getSix() {
      return six_;
    }
    /**
     * <code>fixed64 six = 6;</code>
     * @param value The six to set.
     * @return This builder for chaining.
     */
    public Builder setSix(long value) {
      
      six_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 six = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSix() {
      
      six_ = 0L;
      onChanged();
      return this;
    }

    private int seven_ ;
    /**
     * <code>int32 seven = 7;</code>
     * @return The seven.
     */
    @java.lang.Override
    public int getSeven() {
      return seven_;
    }
    /**
     * <code>int32 seven = 7;</code>
     * @param value The seven to set.
     * @return This builder for chaining.
     */
    public Builder setSeven(int value) {
      
      seven_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 seven = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeven() {
      
      seven_ = 0;
      onChanged();
      return this;
    }

    private long eight_ ;
    /**
     * <code>fixed64 eight = 8;</code>
     * @return The eight.
     */
    @java.lang.Override
    public long getEight() {
      return eight_;
    }
    /**
     * <code>fixed64 eight = 8;</code>
     * @param value The eight to set.
     * @return This builder for chaining.
     */
    public Builder setEight(long value) {
      
      eight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 eight = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearEight() {
      
      eight_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object nine_ = "";
    /**
     * <code>string nine = 9;</code>
     * @return The nine.
     */
    public java.lang.String getNine() {
      java.lang.Object ref = nine_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nine_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nine = 9;</code>
     * @return The bytes for nine.
     */
    public com.google.protobuf.ByteString
        getNineBytes() {
      java.lang.Object ref = nine_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nine_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nine = 9;</code>
     * @param value The nine to set.
     * @return This builder for chaining.
     */
    public Builder setNine(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nine_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nine = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearNine() {
      
      nine_ = getDefaultInstance().getNine();
      onChanged();
      return this;
    }
    /**
     * <code>string nine = 9;</code>
     * @param value The bytes for nine to set.
     * @return This builder for chaining.
     */
    public Builder setNineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nine_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse)
  private static final POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse();
  }

  public static POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetClientTelemetrySettingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetClientTelemetrySettingsResponse>() {
    @java.lang.Override
    public GetClientTelemetrySettingsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetClientTelemetrySettingsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetClientTelemetrySettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetClientTelemetrySettingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.Platform.Responses.GetClientTelemetrySettingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

