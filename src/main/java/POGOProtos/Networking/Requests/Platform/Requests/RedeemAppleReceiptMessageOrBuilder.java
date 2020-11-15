// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Platform/Requests/RedeemAppleReceiptMessage.proto

package POGOProtos.Networking.Requests.Platform.Requests;

public interface RedeemAppleReceiptMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Platform.Requests.RedeemAppleReceiptMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string receipt = 1;</code>
   * @return The receipt.
   */
  java.lang.String getReceipt();
  /**
   * <code>string receipt = 1;</code>
   * @return The bytes for receipt.
   */
  com.google.protobuf.ByteString
      getReceiptBytes();

  /**
   * <code>string purchase_currency = 2;</code>
   * @return The purchaseCurrency.
   */
  java.lang.String getPurchaseCurrency();
  /**
   * <code>string purchase_currency = 2;</code>
   * @return The bytes for purchaseCurrency.
   */
  com.google.protobuf.ByteString
      getPurchaseCurrencyBytes();

  /**
   * <code>int32 price_paid_e6 = 3;</code>
   * @return The pricePaidE6.
   */
  int getPricePaidE6();

  /**
   * <code>int64 price_paid_e6_long = 4;</code>
   * @return The pricePaidE6Long.
   */
  long getPricePaidE6Long();
}
