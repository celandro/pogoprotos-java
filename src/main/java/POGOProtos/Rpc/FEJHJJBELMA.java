// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FEJHJJBELMA}
 */
public  final class FEJHJJBELMA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FEJHJJBELMA)
    FEJHJJBELMAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FEJHJJBELMA.newBuilder() to construct.
  private FEJHJJBELMA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FEJHJJBELMA() {
    aacijcchnmd_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FEJHJJBELMA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FEJHJJBELMA(
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

            aacijcchnmd_ = rawValue;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FEJHJJBELMA.class, POGOProtos.Rpc.FEJHJJBELMA.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK}
   */
  public enum CKECGJFCJOK
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CKECGJFCJOK_UNSET = 0;</code>
     */
    CKECGJFCJOK_UNSET(0),
    /**
     * <code>CKECGJFCJOK_SUCCESS = 1;</code>
     */
    CKECGJFCJOK_SUCCESS(1),
    /**
     * <code>CKECGJFCJOK_FAILURE = 2;</code>
     */
    CKECGJFCJOK_FAILURE(2),
    /**
     * <code>CKECGJFCJOK_TOO_SOON = 3;</code>
     */
    CKECGJFCJOK_TOO_SOON(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CKECGJFCJOK_UNSET = 0;</code>
     */
    public static final int CKECGJFCJOK_UNSET_VALUE = 0;
    /**
     * <code>CKECGJFCJOK_SUCCESS = 1;</code>
     */
    public static final int CKECGJFCJOK_SUCCESS_VALUE = 1;
    /**
     * <code>CKECGJFCJOK_FAILURE = 2;</code>
     */
    public static final int CKECGJFCJOK_FAILURE_VALUE = 2;
    /**
     * <code>CKECGJFCJOK_TOO_SOON = 3;</code>
     */
    public static final int CKECGJFCJOK_TOO_SOON_VALUE = 3;


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
    public static CKECGJFCJOK valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CKECGJFCJOK forNumber(int value) {
      switch (value) {
        case 0: return CKECGJFCJOK_UNSET;
        case 1: return CKECGJFCJOK_SUCCESS;
        case 2: return CKECGJFCJOK_FAILURE;
        case 3: return CKECGJFCJOK_TOO_SOON;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CKECGJFCJOK>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CKECGJFCJOK> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CKECGJFCJOK>() {
            public CKECGJFCJOK findValueByNumber(int number) {
              return CKECGJFCJOK.forNumber(number);
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
      return POGOProtos.Rpc.FEJHJJBELMA.getDescriptor().getEnumTypes().get(0);
    }

    private static final CKECGJFCJOK[] VALUES = values();

    public static CKECGJFCJOK valueOf(
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

    private CKECGJFCJOK(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK)
  }

  public interface IDFLDPPHOLDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD}
   */
  public  static final class IDFLDPPHOLD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD)
      IDFLDPPHOLDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IDFLDPPHOLD.newBuilder() to construct.
    private IDFLDPPHOLD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IDFLDPPHOLD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IDFLDPPHOLD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IDFLDPPHOLD(
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
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_IDFLDPPHOLD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_IDFLDPPHOLD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.class, POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.Builder.class);
    }

    /**
     * Protobuf enum {@code POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.CKECGJFCJOK}
     */
    public enum CKECGJFCJOK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>CKECGJFCJOK_UNSET = 0;</code>
       */
      CKECGJFCJOK_UNSET(0),
      /**
       * <code>CKECGJFCJOK_SUCCESS = 1;</code>
       */
      CKECGJFCJOK_SUCCESS(1),
      /**
       * <code>CKECGJFCJOK_FAILURE = 2;</code>
       */
      CKECGJFCJOK_FAILURE(2),
      /**
       * <code>CKECGJFCJOK_TOO_SOON = 3;</code>
       */
      CKECGJFCJOK_TOO_SOON(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>CKECGJFCJOK_UNSET = 0;</code>
       */
      public static final int CKECGJFCJOK_UNSET_VALUE = 0;
      /**
       * <code>CKECGJFCJOK_SUCCESS = 1;</code>
       */
      public static final int CKECGJFCJOK_SUCCESS_VALUE = 1;
      /**
       * <code>CKECGJFCJOK_FAILURE = 2;</code>
       */
      public static final int CKECGJFCJOK_FAILURE_VALUE = 2;
      /**
       * <code>CKECGJFCJOK_TOO_SOON = 3;</code>
       */
      public static final int CKECGJFCJOK_TOO_SOON_VALUE = 3;


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
      public static CKECGJFCJOK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CKECGJFCJOK forNumber(int value) {
        switch (value) {
          case 0: return CKECGJFCJOK_UNSET;
          case 1: return CKECGJFCJOK_SUCCESS;
          case 2: return CKECGJFCJOK_FAILURE;
          case 3: return CKECGJFCJOK_TOO_SOON;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CKECGJFCJOK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CKECGJFCJOK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CKECGJFCJOK>() {
              public CKECGJFCJOK findValueByNumber(int number) {
                return CKECGJFCJOK.forNumber(number);
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
        return POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.getDescriptor().getEnumTypes().get(0);
      }

      private static final CKECGJFCJOK[] VALUES = values();

      public static CKECGJFCJOK valueOf(
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

      private CKECGJFCJOK(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.CKECGJFCJOK)
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD)) {
        return super.equals(obj);
      }
      POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD other = (POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parseFrom(
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
    public static Builder newBuilder(POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD prototype) {
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
     * Protobuf type {@code POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD)
        POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_IDFLDPPHOLD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_IDFLDPPHOLD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.class, POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.Builder.class);
      }

      // Construct using POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_IDFLDPPHOLD_descriptor;
      }

      @java.lang.Override
      public POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD getDefaultInstanceForType() {
        return POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.getDefaultInstance();
      }

      @java.lang.Override
      public POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD build() {
        POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD buildPartial() {
        POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD result = new POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD(this);
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
        if (other instanceof POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD) {
          return mergeFrom((POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD other) {
        if (other == POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD.getDefaultInstance()) return this;
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
        POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD)
    }

    // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD)
    private static final POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD();
    }

    public static POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IDFLDPPHOLD>
        PARSER = new com.google.protobuf.AbstractParser<IDFLDPPHOLD>() {
      @java.lang.Override
      public IDFLDPPHOLD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IDFLDPPHOLD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IDFLDPPHOLD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IDFLDPPHOLD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FEJHJJBELMA.IDFLDPPHOLD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int AACIJCCHNMD_FIELD_NUMBER = 1;
  private int aacijcchnmd_;
  /**
   * <code>.POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK aacijcchnmd = 1;</code>
   * @return The enum numeric value on the wire for aacijcchnmd.
   */
  public int getAacijcchnmdValue() {
    return aacijcchnmd_;
  }
  /**
   * <code>.POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK aacijcchnmd = 1;</code>
   * @return The aacijcchnmd.
   */
  public POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK getAacijcchnmd() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK result = POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK.valueOf(aacijcchnmd_);
    return result == null ? POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK.UNRECOGNIZED : result;
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
    if (aacijcchnmd_ != POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK.CKECGJFCJOK_UNSET.getNumber()) {
      output.writeEnum(1, aacijcchnmd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aacijcchnmd_ != POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK.CKECGJFCJOK_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, aacijcchnmd_);
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
    if (!(obj instanceof POGOProtos.Rpc.FEJHJJBELMA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FEJHJJBELMA other = (POGOProtos.Rpc.FEJHJJBELMA) obj;

    if (aacijcchnmd_ != other.aacijcchnmd_) return false;
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
    hash = (37 * hash) + AACIJCCHNMD_FIELD_NUMBER;
    hash = (53 * hash) + aacijcchnmd_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FEJHJJBELMA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FEJHJJBELMA prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FEJHJJBELMA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FEJHJJBELMA)
      POGOProtos.Rpc.FEJHJJBELMAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FEJHJJBELMA.class, POGOProtos.Rpc.FEJHJJBELMA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FEJHJJBELMA.newBuilder()
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
      aacijcchnmd_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FEJHJJBELMA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FEJHJJBELMA getDefaultInstanceForType() {
      return POGOProtos.Rpc.FEJHJJBELMA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FEJHJJBELMA build() {
      POGOProtos.Rpc.FEJHJJBELMA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FEJHJJBELMA buildPartial() {
      POGOProtos.Rpc.FEJHJJBELMA result = new POGOProtos.Rpc.FEJHJJBELMA(this);
      result.aacijcchnmd_ = aacijcchnmd_;
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
      if (other instanceof POGOProtos.Rpc.FEJHJJBELMA) {
        return mergeFrom((POGOProtos.Rpc.FEJHJJBELMA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FEJHJJBELMA other) {
      if (other == POGOProtos.Rpc.FEJHJJBELMA.getDefaultInstance()) return this;
      if (other.aacijcchnmd_ != 0) {
        setAacijcchnmdValue(other.getAacijcchnmdValue());
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
      POGOProtos.Rpc.FEJHJJBELMA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FEJHJJBELMA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int aacijcchnmd_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK aacijcchnmd = 1;</code>
     * @return The enum numeric value on the wire for aacijcchnmd.
     */
    public int getAacijcchnmdValue() {
      return aacijcchnmd_;
    }
    /**
     * <code>.POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK aacijcchnmd = 1;</code>
     * @param value The enum numeric value on the wire for aacijcchnmd to set.
     * @return This builder for chaining.
     */
    public Builder setAacijcchnmdValue(int value) {
      aacijcchnmd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK aacijcchnmd = 1;</code>
     * @return The aacijcchnmd.
     */
    public POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK getAacijcchnmd() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK result = POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK.valueOf(aacijcchnmd_);
      return result == null ? POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK aacijcchnmd = 1;</code>
     * @param value The aacijcchnmd to set.
     * @return This builder for chaining.
     */
    public Builder setAacijcchnmd(POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      aacijcchnmd_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FEJHJJBELMA.CKECGJFCJOK aacijcchnmd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAacijcchnmd() {
      
      aacijcchnmd_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FEJHJJBELMA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FEJHJJBELMA)
  private static final POGOProtos.Rpc.FEJHJJBELMA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FEJHJJBELMA();
  }

  public static POGOProtos.Rpc.FEJHJJBELMA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FEJHJJBELMA>
      PARSER = new com.google.protobuf.AbstractParser<FEJHJJBELMA>() {
    @java.lang.Override
    public FEJHJJBELMA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FEJHJJBELMA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FEJHJJBELMA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FEJHJJBELMA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FEJHJJBELMA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

