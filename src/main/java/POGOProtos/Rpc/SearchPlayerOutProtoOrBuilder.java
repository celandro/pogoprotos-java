// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface SearchPlayerOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.SearchPlayerOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.SearchPlayerOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.SearchPlayerOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.SearchPlayerOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto player = 2;</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto player = 2;</code>
   * @return The player.
   */
  POGOProtos.Rpc.PlatformPlayerSummaryProto getPlayer();
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto player = 2;</code>
   */
  POGOProtos.Rpc.PlatformPlayerSummaryProtoOrBuilder getPlayerOrBuilder();
}