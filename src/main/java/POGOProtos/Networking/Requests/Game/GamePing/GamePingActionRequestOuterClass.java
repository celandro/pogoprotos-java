// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GamePing/GamePingActionRequest.proto

package POGOProtos.Networking.Requests.Game.GamePing;

public final class GamePingActionRequestOuterClass {
  private GamePingActionRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Game_GamePing_GamePingActionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Game_GamePing_GamePingActionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHPOGOProtos/Networking/Requests/Game/Ga" +
      "mePing/GamePingActionRequest.proto\022,POGO" +
      "Protos.Networking.Requests.Game.GamePing" +
      "\032APOGOProtos/Networking/Requests/Game/Ga" +
      "mePing/GamePingAction.proto\"\204\001\n\025GamePing" +
      "ActionRequest\022R\n\014request_type\030\001 \001(\0162<.PO" +
      "GOProtos.Networking.Requests.Game.GamePi" +
      "ng.GamePingAction\022\027\n\017request_message\030\002 \001" +
      "(\014B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Networking.Requests.Game.GamePing.GamePingActionOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Game_GamePing_GamePingActionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Game_GamePing_GamePingActionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Game_GamePing_GamePingActionRequest_descriptor,
        new java.lang.String[] { "RequestType", "RequestMessage", });
    POGOProtos.Networking.Requests.Game.GamePing.GamePingActionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
