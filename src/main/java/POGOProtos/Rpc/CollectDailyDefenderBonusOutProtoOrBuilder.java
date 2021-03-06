// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CollectDailyDefenderBonusOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CollectDailyDefenderBonusOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.CollectDailyDefenderBonusOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.CollectDailyDefenderBonusOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.CollectDailyDefenderBonusOutProto.Result getResult();

  /**
   * <code>repeated string currency_type = 2;</code>
   * @return A list containing the currencyType.
   */
  java.util.List<java.lang.String>
      getCurrencyTypeList();
  /**
   * <code>repeated string currency_type = 2;</code>
   * @return The count of currencyType.
   */
  int getCurrencyTypeCount();
  /**
   * <code>repeated string currency_type = 2;</code>
   * @param index The index of the element to return.
   * @return The currencyType at the given index.
   */
  java.lang.String getCurrencyType(int index);
  /**
   * <code>repeated string currency_type = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the currencyType at the given index.
   */
  com.google.protobuf.ByteString
      getCurrencyTypeBytes(int index);

  /**
   * <code>repeated int32 currency_awarded = 3;</code>
   * @return A list containing the currencyAwarded.
   */
  java.util.List<java.lang.Integer> getCurrencyAwardedList();
  /**
   * <code>repeated int32 currency_awarded = 3;</code>
   * @return The count of currencyAwarded.
   */
  int getCurrencyAwardedCount();
  /**
   * <code>repeated int32 currency_awarded = 3;</code>
   * @param index The index of the element to return.
   * @return The currencyAwarded at the given index.
   */
  int getCurrencyAwarded(int index);

  /**
   * <code>int32 num_defenders = 4;</code>
   * @return The numDefenders.
   */
  int getNumDefenders();
}
