// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePoi/Responses/AddNewPoiResponse.proto

package POGOProtos.Networking.Responses.Game.GamePoi.Responses;

public final class AddNewPoiResponseOuterClass {
  private AddNewPoiResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_AddNewPoiResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_AddNewPoiResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNPOGOProtos/Networking/Responses/Game/G" +
      "amePoi/Responses/AddNewPoiResponse.proto" +
      "\0226POGOProtos.Networking.Responses.Game.G" +
      "amePoi.Responses\"\375\001\n\021AddNewPoiResponse\022`" +
      "\n\006status\030\001 \001(\0162P.POGOProtos.Networking.R" +
      "esponses.Game.GamePoi.Responses.AddNewPo" +
      "iResponse.Status\022\017\n\007message\030\002 \003(\t\"u\n\006Sta" +
      "tus\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\013\n\007FAILURE\020\002" +
      "\022\022\n\016INTERNAL_ERROR\020\003\022\037\n\033TOO_MANY_RECENT_" +
      "SUBMISSIONS\020\004\022\021\n\rINVALID_INPUT\020\005B\002P\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_AddNewPoiResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_AddNewPoiResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GamePoi_Responses_AddNewPoiResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
