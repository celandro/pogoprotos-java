// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GameIap/Responses/PurchaseSkuResponse.proto

package POGOProtos.Networking.Responses.Game.GameIap.Responses;

public final class PurchaseSkuResponseOuterClass {
  private PurchaseSkuResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Game_GameIap_Responses_PurchaseSkuResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Game_GameIap_Responses_PurchaseSkuResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPPOGOProtos/Networking/Responses/Game/G" +
      "ameIap/Responses/PurchaseSkuResponse.pro" +
      "to\0226POGOProtos.Networking.Responses.Game" +
      ".GameIap.Responses\032*POGOProtos/Data/Stor" +
      "e/CurrencyUpdate.proto\"\314\002\n\023PurchaseSkuRe" +
      "sponse\022b\n\006result\030\001 \001(\0162R.POGOProtos.Netw" +
      "orking.Responses.Game.GameIap.Responses." +
      "PurchaseSkuResponse.Status\022\034\n\024added_inve" +
      "ntory_item\030\002 \003(\014\022>\n\017currency_update\030\003 \003(" +
      "\0132%.POGOProtos.Data.Store.CurrencyUpdate" +
      "\"s\n\006Status\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\013\n\007FA" +
      "ILURE\020\002\022\023\n\017BALANCE_TOO_LOW\020\003\022\025\n\021SKU_NOT_" +
      "AVAILABLE\020\004\022\030\n\024OVER_INVENTORY_LIMIT\020\005B\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Store.CurrencyUpdateOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Game_GameIap_Responses_PurchaseSkuResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Game_GameIap_Responses_PurchaseSkuResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Game_GameIap_Responses_PurchaseSkuResponse_descriptor,
        new java.lang.String[] { "Result", "AddedInventoryItem", "CurrencyUpdate", });
    POGOProtos.Data.Store.CurrencyUpdateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
