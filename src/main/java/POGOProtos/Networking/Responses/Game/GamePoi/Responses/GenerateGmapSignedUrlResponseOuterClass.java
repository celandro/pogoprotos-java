// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePoi/Responses/GenerateGmapSignedUrlResponse.proto

package POGOProtos.Networking.Responses.Game.GamePoi.Responses;

public final class GenerateGmapSignedUrlResponseOuterClass {
  private GenerateGmapSignedUrlResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GenerateGmapSignedUrlResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GenerateGmapSignedUrlResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nZPOGOProtos/Networking/Responses/Game/G" +
      "amePoi/Responses/GenerateGmapSignedUrlRe" +
      "sponse.proto\0226POGOProtos.Networking.Resp" +
      "onses.Game.GamePoi.Responses\"\244\002\n\035Generat" +
      "eGmapSignedUrlResponse\022l\n\006result\030\001 \001(\0162\\" +
      ".POGOProtos.Networking.Responses.Game.Ga" +
      "mePoi.Responses.GenerateGmapSignedUrlRes" +
      "ponse.Result\022\022\n\nsigned_url\030\002 \001(\t\"\200\001\n\006Res" +
      "ult\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\032\n\026ERROR_PLA" +
      "YER_NOT_VALID\020\002\022\026\n\022ERROR_RATE_LIMITED\020\003\022" +
      "\027\n\023ERROR_MISSING_INPUT\020\004\022\021\n\rERROR_UNKNOW" +
      "N\020\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GenerateGmapSignedUrlResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GenerateGmapSignedUrlResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_GenerateGmapSignedUrlResponse_descriptor,
        new java.lang.String[] { "Result", "SignedUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
