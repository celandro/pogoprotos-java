// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePoi/Responses/GetGrapeshotUploadUrlResponse.proto

package POGOProtos.Networking.Responses.Game.GamePoi.Responses;

public final class GetGrapeshotUploadUrlResponseOuterClass {
  private GetGrapeshotUploadUrlResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_FileContextToGrapeshotDataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_FileContextToGrapeshotDataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nZPOGOProtos/Networking/Responses/Game/G" +
      "amePoi/Responses/GetGrapeshotUploadUrlRe" +
      "sponse.proto\0226POGOProtos.Networking.Resp" +
      "onses.Game.GamePoi.Responses\0326POGOProtos" +
      "/Data/Grapeshot/GrapeshotUploadingData.p" +
      "roto\"\302\004\n\035GetGrapeshotUploadUrlResponse\022l" +
      "\n\006status\030\001 \001(\0162\\.POGOProtos.Networking.R" +
      "esponses.Game.GamePoi.Responses.GetGrape" +
      "shotUploadUrlResponse.Status\022\235\001\n\036file_co" +
      "ntext_to_grapeshot_data\030\004 \003(\0132u.POGOProt" +
      "os.Networking.Responses.Game.GamePoi.Res" +
      "ponses.GetGrapeshotUploadUrlResponse.Fil" +
      "eContextToGrapeshotDataEntry\032t\n\037FileCont" +
      "extToGrapeshotDataEntry\022\013\n\003key\030\001 \001(\t\022@\n\005" +
      "value\030\002 \001(\01321.POGOProtos.Data.Grapeshot." +
      "GrapeshotUploadingData:\0028\001\"\234\001\n\006Status\022\t\n" +
      "\005UNSET\020\000\022\013\n\007FAILURE\020\001\022\013\n\007SUCCESS\020\002\022\031\n\025MI" +
      "SSING_FILE_CONTEXTS\020\003\022\032\n\026DUPLICATE_FILE_" +
      "CONTEXT\020\004\022\033\n\027MISSING_SUBMISSION_TYPE\020\005\022\031" +
      "\n\025MISSING_SUBMISSION_ID\020\006B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Grapeshot.GrapeshotUploadingDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_descriptor,
        new java.lang.String[] { "Status", "FileContextToGrapeshotData", });
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_FileContextToGrapeshotDataEntry_descriptor =
      internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_FileContextToGrapeshotDataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GetGrapeshotUploadUrlResponse_FileContextToGrapeshotDataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    POGOProtos.Data.Grapeshot.GrapeshotUploadingDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
