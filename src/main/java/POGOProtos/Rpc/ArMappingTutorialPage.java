// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.ArMappingTutorialPage}
 */
public enum ArMappingTutorialPage
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TITAN_AR_MAPPING_TUTORIAL_PAGE_RECORDING_TIPS = 0;</code>
   */
  TITAN_AR_MAPPING_TUTORIAL_PAGE_RECORDING_TIPS(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TITAN_AR_MAPPING_TUTORIAL_PAGE_RECORDING_TIPS = 0;</code>
   */
  public static final int TITAN_AR_MAPPING_TUTORIAL_PAGE_RECORDING_TIPS_VALUE = 0;


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
  public static ArMappingTutorialPage valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ArMappingTutorialPage forNumber(int value) {
    switch (value) {
      case 0: return TITAN_AR_MAPPING_TUTORIAL_PAGE_RECORDING_TIPS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ArMappingTutorialPage>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ArMappingTutorialPage> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ArMappingTutorialPage>() {
          public ArMappingTutorialPage findValueByNumber(int number) {
            return ArMappingTutorialPage.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(6);
  }

  private static final ArMappingTutorialPage[] VALUES = values();

  public static ArMappingTutorialPage valueOf(
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

  private ArMappingTutorialPage(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ArMappingTutorialPage)
}

