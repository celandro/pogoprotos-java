// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/OpenSponsoredGiftResponse.proto

package POGOProtos.Networking.Responses;

public final class OpenSponsoredGiftResponseOuterClass {
  private OpenSponsoredGiftResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_OpenSponsoredGiftResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_OpenSponsoredGiftResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?POGOProtos/Networking/Responses/OpenSp" +
      "onsoredGiftResponse.proto\022\037POGOProtos.Ne" +
      "tworking.Responses\032\037POGOProtos/Inventory" +
      "/Loot.proto\"\204\002\n\031OpenSponsoredGiftRespons" +
      "e\022Q\n\006result\030\001 \001(\0162A.POGOProtos.Networkin" +
      "g.Responses.OpenSponsoredGiftResponse.Re" +
      "sult\022+\n\007rewards\030\002 \001(\0132\032.POGOProtos.Inven" +
      "tory.Loot\"g\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCES" +
      "S\020\001\022\021\n\rERROR_UNKNOWN\020\002\022\031\n\025ERROR_PLAYER_B" +
      "AG_FULL\020\003\022\027\n\023ERROR_GIFT_REDEEMED\020\004B\002P\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.LootOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_OpenSponsoredGiftResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_OpenSponsoredGiftResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_OpenSponsoredGiftResponse_descriptor,
        new java.lang.String[] { "Result", "Rewards", });
    POGOProtos.Inventory.LootOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
