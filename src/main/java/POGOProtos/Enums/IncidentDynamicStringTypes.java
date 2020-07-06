// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/IncidentDynamicStringTypes.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.IncidentDynamicStringTypes}
 */
public enum IncidentDynamicStringTypes
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GREETING = 0;</code>
   */
  GREETING(0),
  /**
   * <code>CHALLENGE = 1;</code>
   */
  CHALLENGE(1),
  /**
   * <code>DEFEAT = 2;</code>
   */
  DEFEAT(2),
  /**
   * <code>VICTORY = 3;</code>
   */
  VICTORY(3),
  /**
   * <code>PRE_BATTLE = 4;</code>
   */
  PRE_BATTLE(4),
  /**
   * <code>POST_BATTLE = 5;</code>
   */
  POST_BATTLE(5),
  /**
   * <code>ITEMS_STOLEN = 6;</code>
   */
  ITEMS_STOLEN(6),
  /**
   * <code>TUTORIAL = 7;</code>
   */
  TUTORIAL(7),
  /**
   * <code>COMBAT_QUOTE = 8;</code>
   */
  COMBAT_QUOTE(8),
  /**
   * <code>CANDELA_INSPIRE = 9;</code>
   */
  CANDELA_INSPIRE(9),
  /**
   * <code>BLANCHE_INSPIRE = 10;</code>
   */
  BLANCHE_INSPIRE(10),
  /**
   * <code>SPARK_INSPIRE = 11;</code>
   */
  SPARK_INSPIRE(11),
  /**
   * <code>GRUNT_DECOY = 12;</code>
   */
  GRUNT_DECOY(12),
  /**
   * <code>COMBAT_DECOY_QUOTE = 13;</code>
   */
  COMBAT_DECOY_QUOTE(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GREETING = 0;</code>
   */
  public static final int GREETING_VALUE = 0;
  /**
   * <code>CHALLENGE = 1;</code>
   */
  public static final int CHALLENGE_VALUE = 1;
  /**
   * <code>DEFEAT = 2;</code>
   */
  public static final int DEFEAT_VALUE = 2;
  /**
   * <code>VICTORY = 3;</code>
   */
  public static final int VICTORY_VALUE = 3;
  /**
   * <code>PRE_BATTLE = 4;</code>
   */
  public static final int PRE_BATTLE_VALUE = 4;
  /**
   * <code>POST_BATTLE = 5;</code>
   */
  public static final int POST_BATTLE_VALUE = 5;
  /**
   * <code>ITEMS_STOLEN = 6;</code>
   */
  public static final int ITEMS_STOLEN_VALUE = 6;
  /**
   * <code>TUTORIAL = 7;</code>
   */
  public static final int TUTORIAL_VALUE = 7;
  /**
   * <code>COMBAT_QUOTE = 8;</code>
   */
  public static final int COMBAT_QUOTE_VALUE = 8;
  /**
   * <code>CANDELA_INSPIRE = 9;</code>
   */
  public static final int CANDELA_INSPIRE_VALUE = 9;
  /**
   * <code>BLANCHE_INSPIRE = 10;</code>
   */
  public static final int BLANCHE_INSPIRE_VALUE = 10;
  /**
   * <code>SPARK_INSPIRE = 11;</code>
   */
  public static final int SPARK_INSPIRE_VALUE = 11;
  /**
   * <code>GRUNT_DECOY = 12;</code>
   */
  public static final int GRUNT_DECOY_VALUE = 12;
  /**
   * <code>COMBAT_DECOY_QUOTE = 13;</code>
   */
  public static final int COMBAT_DECOY_QUOTE_VALUE = 13;


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
  public static IncidentDynamicStringTypes valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IncidentDynamicStringTypes forNumber(int value) {
    switch (value) {
      case 0: return GREETING;
      case 1: return CHALLENGE;
      case 2: return DEFEAT;
      case 3: return VICTORY;
      case 4: return PRE_BATTLE;
      case 5: return POST_BATTLE;
      case 6: return ITEMS_STOLEN;
      case 7: return TUTORIAL;
      case 8: return COMBAT_QUOTE;
      case 9: return CANDELA_INSPIRE;
      case 10: return BLANCHE_INSPIRE;
      case 11: return SPARK_INSPIRE;
      case 12: return GRUNT_DECOY;
      case 13: return COMBAT_DECOY_QUOTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IncidentDynamicStringTypes>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IncidentDynamicStringTypes> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IncidentDynamicStringTypes>() {
          public IncidentDynamicStringTypes findValueByNumber(int number) {
            return IncidentDynamicStringTypes.forNumber(number);
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
    return POGOProtos.Enums.IncidentDynamicStringTypesOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final IncidentDynamicStringTypes[] VALUES = values();

  public static IncidentDynamicStringTypes valueOf(
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

  private IncidentDynamicStringTypes(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.IncidentDynamicStringTypes)
}

