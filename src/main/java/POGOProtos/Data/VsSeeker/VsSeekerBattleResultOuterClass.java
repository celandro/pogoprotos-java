// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/VsSeeker/VsSeekerBattleResult.proto

package POGOProtos.Data.VsSeeker;

public final class VsSeekerBattleResultOuterClass {
  private VsSeekerBattleResultOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerBattleResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_VsSeeker_VsSeekerBattleResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3POGOProtos/Data/VsSeeker/VsSeekerBattl" +
      "eResult.proto\022\030POGOProtos.Data.VsSeeker\032" +
      ".POGOProtos/Enums/CombatPlayerFinishStat" +
      "e.proto\"\224\001\n\024VsSeekerBattleResult\022@\n\rbatt" +
      "le_result\030\001 \001(\0162).POGOProtos.Enums.Comba" +
      "tPlayerFinishState\022\027\n\017rewards_claimed\030\002 " +
      "\001(\010\022!\n\031is_pending_pokemon_reward\030\003 \001(\010B\002" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.CombatPlayerFinishStateOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerBattleResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_VsSeeker_VsSeekerBattleResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_VsSeeker_VsSeekerBattleResult_descriptor,
        new java.lang.String[] { "BattleResult", "RewardsClaimed", "IsPendingPokemonReward", });
    POGOProtos.Enums.CombatPlayerFinishStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}