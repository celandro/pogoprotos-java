// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.IncidentFinishSequence}
 */
public enum IncidentFinishSequence
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INCIDENT_FINISH_SEQUENCE_NONE = 0;</code>
   */
  INCIDENT_FINISH_SEQUENCE_NONE(0),
  /**
   * <code>INCIDENT_FINISH_SEQUENCE_VICTORY = 1;</code>
   */
  INCIDENT_FINISH_SEQUENCE_VICTORY(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INCIDENT_FINISH_SEQUENCE_NONE = 0;</code>
   */
  public static final int INCIDENT_FINISH_SEQUENCE_NONE_VALUE = 0;
  /**
   * <code>INCIDENT_FINISH_SEQUENCE_VICTORY = 1;</code>
   */
  public static final int INCIDENT_FINISH_SEQUENCE_VICTORY_VALUE = 1;


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
  public static IncidentFinishSequence valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IncidentFinishSequence forNumber(int value) {
    switch (value) {
      case 0: return INCIDENT_FINISH_SEQUENCE_NONE;
      case 1: return INCIDENT_FINISH_SEQUENCE_VICTORY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IncidentFinishSequence>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IncidentFinishSequence> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IncidentFinishSequence>() {
          public IncidentFinishSequence findValueByNumber(int number) {
            return IncidentFinishSequence.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(72);
  }

  private static final IncidentFinishSequence[] VALUES = values();

  public static IncidentFinishSequence valueOf(
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

  private IncidentFinishSequence(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IncidentFinishSequence)
}

