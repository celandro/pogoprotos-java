// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetCombatPlayerProfileResponse.proto

package POGOProtos.Networking.Responses;

public final class GetCombatPlayerProfileResponseOuterClass {
  private GetCombatPlayerProfileResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetCombatPlayerProfileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetCombatPlayerProfileResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDPOGOProtos/Networking/Responses/GetCom" +
      "batPlayerProfileResponse.proto\022\037POGOProt" +
      "os.Networking.Responses\0320POGOProtos/Data" +
      "/Combat/CombatPlayerProfile.proto\"\215\002\n\036Ge" +
      "tCombatPlayerProfileResponse\022V\n\006result\030\001" +
      " \001(\0162F.POGOProtos.Networking.Responses.G" +
      "etCombatPlayerProfileResponse.Result\022<\n\007" +
      "profile\030\002 \001(\0132+.POGOProtos.Data.Combat.C" +
      "ombatPlayerProfile\"U\n\006Result\022\t\n\005UNSET\020\000\022" +
      "\013\n\007SUCCESS\020\001\022\032\n\026ERROR_PLAYER_NOT_FOUND\020\002" +
      "\022\027\n\023ERROR_ACCESS_DENIED\020\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Combat.CombatPlayerProfileOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_GetCombatPlayerProfileResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GetCombatPlayerProfileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetCombatPlayerProfileResponse_descriptor,
        new java.lang.String[] { "Result", "Profile", });
    POGOProtos.Data.Combat.CombatPlayerProfileOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}