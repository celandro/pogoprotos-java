// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameIap/Requests/RedeemSamsungReceiptMessage.proto

package POGOProtos.Networking.Requests.Game.GameIap.Requests;

public final class RedeemSamsungReceiptMessageOuterClass {
  private RedeemSamsungReceiptMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Game_GameIap_Requests_RedeemSamsungReceiptMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Game_GameIap_Requests_RedeemSamsungReceiptMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nVPOGOProtos/Networking/Requests/Game/Ga" +
      "meIap/Requests/RedeemSamsungReceiptMessa" +
      "ge.proto\0224POGOProtos.Networking.Requests" +
      ".Game.GameIap.Requests\"\200\001\n\033RedeemSamsung" +
      "ReceiptMessage\022\025\n\rpurchase_data\030\001 \001(\t\022\023\n" +
      "\013purchase_id\030\002 \001(\t\022\031\n\021purchase_currency\030" +
      "\003 \001(\t\022\032\n\022price_paid_e6_long\030\004 \001(\003B\002P\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Game_GameIap_Requests_RedeemSamsungReceiptMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Game_GameIap_Requests_RedeemSamsungReceiptMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Game_GameIap_Requests_RedeemSamsungReceiptMessage_descriptor,
        new java.lang.String[] { "PurchaseData", "PurchaseId", "PurchaseCurrency", "PricePaidE6Long", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
