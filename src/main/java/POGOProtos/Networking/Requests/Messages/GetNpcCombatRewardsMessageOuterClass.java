// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetNpcCombatRewardsMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class GetNpcCombatRewardsMessageOuterClass {
  private GetNpcCombatRewardsMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_GetNpcCombatRewardsMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_GetNpcCombatRewardsMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHPOGOProtos/Networking/Requests/Message" +
      "s/GetNpcCombatRewardsMessage.proto\022\'POGO" +
      "Protos.Networking.Requests.Messages\032.POG" +
      "OProtos/Enums/CombatPlayerFinishState.pr" +
      "oto\032.POGOProtos/Data/Combat/CombatQuestU" +
      "pdate.proto\"\376\001\n\032GetNpcCombatRewardsMessa" +
      "ge\022&\n\036combat_npc_trainer_template_id\030\001 \001" +
      "(\t\022?\n\014finish_state\030\002 \001(\0162).POGOProtos.En" +
      "ums.CombatPlayerFinishState\022\034\n\024attacking" +
      "_pokemon_id\030\003 \003(\006\022\021\n\tcombat_id\030\004 \001(\t\022F\n\023" +
      "combat_quest_update\030\005 \001(\0132).POGOProtos.D" +
      "ata.Combat.CombatQuestUpdateB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.CombatPlayerFinishStateOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.CombatQuestUpdateOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Messages_GetNpcCombatRewardsMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_GetNpcCombatRewardsMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_GetNpcCombatRewardsMessage_descriptor,
        new java.lang.String[] { "CombatNpcTrainerTemplateId", "FinishState", "AttackingPokemonId", "CombatId", "CombatQuestUpdate", });
    POGOProtos.Enums.CombatPlayerFinishStateOuterClass.getDescriptor();
    POGOProtos.Data.Combat.CombatQuestUpdateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
