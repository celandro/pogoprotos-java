// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GameGmTemplates/Responses/DownloadGameMasterTemplatesResponse.proto

package POGOProtos.Networking.Responses.Game.GameGmTemplates.Responses;

public final class DownloadGameMasterTemplatesResponseOuterClass {
  private DownloadGameMasterTemplatesResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_ClientGameMasterTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_ClientGameMasterTemplate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nhPOGOProtos/Networking/Responses/Game/G" +
      "ameGmTemplates/Responses/DownloadGameMas" +
      "terTemplatesResponse.proto\022>POGOProtos.N" +
      "etworking.Responses.Game.GameGmTemplates" +
      ".Responses\032CPOGOProtos/Networking/Respon" +
      "ses/DownloadItemTemplatesResponse.proto\"" +
      "\242\005\n#DownloadGameMasterTemplatesResponse\022" +
      "z\n\006result\030\001 \001(\0162j.POGOProtos.Networking." +
      "Responses.Game.GameGmTemplates.Responses" +
      ".DownloadGameMasterTemplatesResponse.Res" +
      "ult\022\216\001\n\010template\030\002 \003(\0132|.POGOProtos.Netw" +
      "orking.Responses.Game.GameGmTemplates.Re" +
      "sponses.DownloadGameMasterTemplatesRespo" +
      "nse.ClientGameMasterTemplate\022\030\n\020deleted_" +
      "template\030\003 \003(\t\022\020\n\010batch_id\030\004 \001(\004\022\023\n\013page" +
      "_offset\030\005 \001(\005\022\025\n\rexperiment_id\030\006 \003(\005\032\226\001\n" +
      "\030ClientGameMasterTemplate\022\023\n\013template_id" +
      "\030\001 \001(\t\022e\n\004data\030\002 \001(\0132W.POGOProtos.Networ" +
      "king.Responses.DownloadItemTemplatesResp" +
      "onse.GameMasterClientTemplate\"}\n\006Result\022" +
      "\t\n\005UNSET\020\000\022\014\n\010COMPLETE\020\001\022\020\n\014MORE_RESULTS" +
      "\020\002\022\025\n\021BATCH_ID_NOT_LIVE\020\003\022\032\n\026INVALID_BAS" +
      "IS_BATCH_ID\020\004\022\025\n\021WRONG_EXPERIMENTS\020\005B\002P\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Networking.Responses.DownloadItemTemplatesResponseOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_descriptor,
        new java.lang.String[] { "Result", "Template", "DeletedTemplate", "BatchId", "PageOffset", "ExperimentId", });
    internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_ClientGameMasterTemplate_descriptor =
      internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_ClientGameMasterTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GameGmTemplates_Responses_DownloadGameMasterTemplatesResponse_ClientGameMasterTemplate_descriptor,
        new java.lang.String[] { "TemplateId", "Data", });
    POGOProtos.Networking.Responses.DownloadItemTemplatesResponseOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
