// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/UpdateTradingResponse.proto

package POGOProtos.Networking.Responses;

public interface UpdateTradingResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.UpdateTradingResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.UpdateTradingResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.UpdateTradingResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.UpdateTradingResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
   * @return Whether the trading field is set.
   */
  boolean hasTrading();
  /**
   * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
   * @return The trading.
   */
  POGOProtos.Data.Trading.Trading getTrading();
  /**
   * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
   */
  POGOProtos.Data.Trading.TradingOrBuilder getTradingOrBuilder();
}
