// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface OpenTradingOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.OpenTradingOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.OpenTradingOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.OpenTradingOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.OpenTradingOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
   * @return Whether the trading field is set.
   */
  boolean hasTrading();
  /**
   * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
   * @return The trading.
   */
  POGOProtos.Rpc.TradingProto getTrading();
  /**
   * <code>.POGOProtos.Rpc.TradingProto trading = 2;</code>
   */
  POGOProtos.Rpc.TradingProtoOrBuilder getTradingOrBuilder();
}
