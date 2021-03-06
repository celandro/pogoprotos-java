// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CurrencyQuantityProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CurrencyQuantityProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string currency_type = 1;</code>
   * @return The currencyType.
   */
  java.lang.String getCurrencyType();
  /**
   * <code>string currency_type = 1;</code>
   * @return The bytes for currencyType.
   */
  com.google.protobuf.ByteString
      getCurrencyTypeBytes();

  /**
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  int getQuantity();

  /**
   * <code>int32 fiat_purchased_quantity = 3;</code>
   * @return The fiatPurchasedQuantity.
   */
  int getFiatPurchasedQuantity();

  /**
   * <code>string fiat_currency_type = 4;</code>
   * @return The fiatCurrencyType.
   */
  java.lang.String getFiatCurrencyType();
  /**
   * <code>string fiat_currency_type = 4;</code>
   * @return The bytes for fiatCurrencyType.
   */
  com.google.protobuf.ByteString
      getFiatCurrencyTypeBytes();

  /**
   * <code>int64 fiat_currency_cost_e6 = 5;</code>
   * @return The fiatCurrencyCostE6.
   */
  long getFiatCurrencyCostE6();
}
