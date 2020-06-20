// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.KBCADBAPKKL}
 */
public enum KBCADBAPKKL
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>KBCADBAPKKL_ADD = 0;</code>
   */
  KBCADBAPKKL_ADD(0),
  /**
   * <code>KBCADBAPKKL_MODIFY = 1;</code>
   */
  KBCADBAPKKL_MODIFY(1),
  /**
   * <code>KBCADBAPKKL_REMOVE = 2;</code>
   */
  KBCADBAPKKL_REMOVE(2),
  /**
   * <code>KBCADBAPKKL_PREDICTED_MODIFY = 3;</code>
   */
  KBCADBAPKKL_PREDICTED_MODIFY(3),
  /**
   * <code>KBCADBAPKKL_PREDICTED_REMOVE = 4;</code>
   */
  KBCADBAPKKL_PREDICTED_REMOVE(4),
  /**
   * <code>KBCADBAPKKL_ROLLED_BACK_MODIFY = 5;</code>
   */
  KBCADBAPKKL_ROLLED_BACK_MODIFY(5),
  /**
   * <code>KBCADBAPKKL_ROLLED_BACK_REMOVE = 6;</code>
   */
  KBCADBAPKKL_ROLLED_BACK_REMOVE(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>KBCADBAPKKL_ADD = 0;</code>
   */
  public static final int KBCADBAPKKL_ADD_VALUE = 0;
  /**
   * <code>KBCADBAPKKL_MODIFY = 1;</code>
   */
  public static final int KBCADBAPKKL_MODIFY_VALUE = 1;
  /**
   * <code>KBCADBAPKKL_REMOVE = 2;</code>
   */
  public static final int KBCADBAPKKL_REMOVE_VALUE = 2;
  /**
   * <code>KBCADBAPKKL_PREDICTED_MODIFY = 3;</code>
   */
  public static final int KBCADBAPKKL_PREDICTED_MODIFY_VALUE = 3;
  /**
   * <code>KBCADBAPKKL_PREDICTED_REMOVE = 4;</code>
   */
  public static final int KBCADBAPKKL_PREDICTED_REMOVE_VALUE = 4;
  /**
   * <code>KBCADBAPKKL_ROLLED_BACK_MODIFY = 5;</code>
   */
  public static final int KBCADBAPKKL_ROLLED_BACK_MODIFY_VALUE = 5;
  /**
   * <code>KBCADBAPKKL_ROLLED_BACK_REMOVE = 6;</code>
   */
  public static final int KBCADBAPKKL_ROLLED_BACK_REMOVE_VALUE = 6;


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
  public static KBCADBAPKKL valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static KBCADBAPKKL forNumber(int value) {
    switch (value) {
      case 0: return KBCADBAPKKL_ADD;
      case 1: return KBCADBAPKKL_MODIFY;
      case 2: return KBCADBAPKKL_REMOVE;
      case 3: return KBCADBAPKKL_PREDICTED_MODIFY;
      case 4: return KBCADBAPKKL_PREDICTED_REMOVE;
      case 5: return KBCADBAPKKL_ROLLED_BACK_MODIFY;
      case 6: return KBCADBAPKKL_ROLLED_BACK_REMOVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<KBCADBAPKKL>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      KBCADBAPKKL> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<KBCADBAPKKL>() {
          public KBCADBAPKKL findValueByNumber(int number) {
            return KBCADBAPKKL.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(72);
  }

  private static final KBCADBAPKKL[] VALUES = values();

  public static KBCADBAPKKL valueOf(
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

  private KBCADBAPKKL(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.KBCADBAPKKL)
}

