// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/CompleteVsSeekerAndRestartChargingResponse.proto

package POGOProtos.Networking.Responses;

public final class CompleteVsSeekerAndRestartChargingResponseOuterClass {
  private CompleteVsSeekerAndRestartChargingResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_CompleteVsSeekerAndRestartChargingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_CompleteVsSeekerAndRestartChargingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPPOGOProtos/Networking/Responses/Comple" +
      "teVsSeekerAndRestartChargingResponse.pro" +
      "to\022\037POGOProtos.Networking.Responses\0328POG" +
      "OProtos/Settings/Master/Item/VsSeekerAtt" +
      "ributes.proto\032\037POGOProtos/Inventory/Loot" +
      ".proto\032/POGOProtos/Data/Combat/CombatSea" +
      "sonResult.proto\032,POGOProtos/Data/Combat/" +
      "CombatBaseStats.proto\"\376\005\n*CompleteVsSeek" +
      "erAndRestartChargingResponse\022b\n\006result\030\001" +
      " \001(\0162R.POGOProtos.Networking.Responses.C" +
      "ompleteVsSeekerAndRestartChargingRespons" +
      "e.Result\022F\n\tvs_seeker\030\002 \001(\01323.POGOProtos" +
      ".Settings.Master.Item.VsSeekerAttributes" +
      "\022.\n\nloot_proto\030\003 \001(\0132\032.POGOProtos.Invent" +
      "ory.Loot\022I\n\025current_season_result\030\004 \001(\0132" +
      "*.POGOProtos.Data.Combat.CombatSeasonRes" +
      "ult\022\025\n\rprevious_rank\030\005 \001(\005\022\027\n\017previous_r" +
      "ating\030\006 \001(\002\022D\n\023stats_at_rank_start\030\007 \001(\013" +
      "2\'.POGOProtos.Data.Combat.CombatBaseStat" +
      "s\022#\n\033avatar_template_id_rewarded\030\010 \003(\t\"\215" +
      "\002\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\035\n\031ERR" +
      "OR_VS_SEEKER_NOT_FOUND\020\002\022,\n(ERROR_VS_SEE" +
      "KER_ALREADY_STARTED_CHARGING\020\003\022)\n%ERROR_" +
      "VS_SEEKER_ALREADY_FULLY_CHARGED\020\004\022*\n&ERR" +
      "OR_VS_SEEKER_PLAYER_IN_WRONG_SEASON\020\005\022\037\n" +
      "\033ERROR_PLAYER_INVENTORY_FULL\020\006\022&\n\"ERROR_" +
      "PLAYER_HAS_UNCLAIMED_REWARDS\020\007B\002P\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Settings.Master.Item.VsSeekerAttributesOuterClass.getDescriptor(),
          POGOProtos.Inventory.LootOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.CombatSeasonResultOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.CombatBaseStatsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_CompleteVsSeekerAndRestartChargingResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_CompleteVsSeekerAndRestartChargingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_CompleteVsSeekerAndRestartChargingResponse_descriptor,
        new java.lang.String[] { "Result", "VsSeeker", "LootProto", "CurrentSeasonResult", "PreviousRank", "PreviousRating", "StatsAtRankStart", "AvatarTemplateIdRewarded", });
    POGOProtos.Settings.Master.Item.VsSeekerAttributesOuterClass.getDescriptor();
    POGOProtos.Inventory.LootOuterClass.getDescriptor();
    POGOProtos.Data.Combat.CombatSeasonResultOuterClass.getDescriptor();
    POGOProtos.Data.Combat.CombatBaseStatsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
