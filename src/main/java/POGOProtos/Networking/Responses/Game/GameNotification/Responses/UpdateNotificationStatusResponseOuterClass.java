// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GameNotification/Responses/UpdateNotificationStatusResponse.proto

package POGOProtos.Networking.Responses.Game.GameNotification.Responses;

public final class UpdateNotificationStatusResponseOuterClass {
  private UpdateNotificationStatusResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GameNotification_Responses_UpdateNotificationStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GameNotification_Responses_UpdateNotificationStatusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nfPOGOProtos/Networking/Responses/Game/G" +
      "ameNotification/Responses/UpdateNotifica" +
      "tionStatusResponse.proto\022?POGOProtos.Net" +
      "working.Responses.Game.GameNotification." +
      "Responses\032(POGOProtos/Enums/Notification" +
      "State.proto\"\215\001\n UpdateNotificationStatus" +
      "Response\022\030\n\020notification_ids\030\001 \003(\t\022\033\n\023cr" +
      "eate_timestamp_ms\030\002 \003(\003\0222\n\005state\030\003 \001(\0162#" +
      ".POGOProtos.Enums.NotificationStateB\002P\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.NotificationStateOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Game_GameNotification_Responses_UpdateNotificationStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GameNotification_Responses_UpdateNotificationStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GameNotification_Responses_UpdateNotificationStatusResponse_descriptor,
        new java.lang.String[] { "NotificationIds", "CreateTimestampMs", "State", });
    POGOProtos.Enums.NotificationStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}