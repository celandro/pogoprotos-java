// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.IncidentStartContext}
 */
public enum IncidentStartContext
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INCIDENT_START_CONTEXT_NPC = 0;</code>
   */
  INCIDENT_START_CONTEXT_NPC(0),
  /**
   * <code>INCIDENT_START_CONTEXT_POKESTOP = 1;</code>
   */
  INCIDENT_START_CONTEXT_POKESTOP(1),
  /**
   * <code>INCIDENT_START_CONTEXT_BALLOON = 2;</code>
   */
  INCIDENT_START_CONTEXT_BALLOON(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INCIDENT_START_CONTEXT_NPC = 0;</code>
   */
  public static final int INCIDENT_START_CONTEXT_NPC_VALUE = 0;
  /**
   * <code>INCIDENT_START_CONTEXT_POKESTOP = 1;</code>
   */
  public static final int INCIDENT_START_CONTEXT_POKESTOP_VALUE = 1;
  /**
   * <code>INCIDENT_START_CONTEXT_BALLOON = 2;</code>
   */
  public static final int INCIDENT_START_CONTEXT_BALLOON_VALUE = 2;


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
  public static IncidentStartContext valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IncidentStartContext forNumber(int value) {
    switch (value) {
      case 0: return INCIDENT_START_CONTEXT_NPC;
      case 1: return INCIDENT_START_CONTEXT_POKESTOP;
      case 2: return INCIDENT_START_CONTEXT_BALLOON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IncidentStartContext>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IncidentStartContext> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IncidentStartContext>() {
          public IncidentStartContext findValueByNumber(int number) {
            return IncidentStartContext.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(12);
  }

  private static final IncidentStartContext[] VALUES = values();

  public static IncidentStartContext valueOf(
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

  private IncidentStartContext(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IncidentStartContext)
}

