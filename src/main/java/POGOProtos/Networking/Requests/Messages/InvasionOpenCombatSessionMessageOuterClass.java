// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/InvasionOpenCombatSessionMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class InvasionOpenCombatSessionMessageOuterClass {
  private InvasionOpenCombatSessionMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_InvasionOpenCombatSessionMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_InvasionOpenCombatSessionMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNPOGOProtos/Networking/Requests/Message" +
      "s/InvasionOpenCombatSessionMessage.proto" +
      "\022\'POGOProtos.Networking.Requests.Message" +
      "s\032(POGOProtos/Map/Fort/IncidentLookup.pr" +
      "oto\"\250\001\n InvasionOpenCombatSessionMessage" +
      "\022<\n\017incident_lookup\030\001 \001(\0132#.POGOProtos.M" +
      "ap.Fort.IncidentLookup\022\014\n\004step\030\002 \001(\005\022\034\n\024" +
      "attacking_pokemon_id\030\003 \003(\006\022\032\n\022lobby_join" +
      "_time_ms\030\004 \001(\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Map.Fort.IncidentLookupOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Messages_InvasionOpenCombatSessionMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_InvasionOpenCombatSessionMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_InvasionOpenCombatSessionMessage_descriptor,
        new java.lang.String[] { "IncidentLookup", "Step", "AttackingPokemonId", "LobbyJoinTimeMs", });
    POGOProtos.Map.Fort.IncidentLookupOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
