// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface MarkTutorialCompleteOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.MarkTutorialCompleteOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto player = 2;</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto player = 2;</code>
   * @return The player.
   */
  POGOProtos.Rpc.ClientPlayerProto getPlayer();
  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto player = 2;</code>
   */
  POGOProtos.Rpc.ClientPlayerProtoOrBuilder getPlayerOrBuilder();
}
