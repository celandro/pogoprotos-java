// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface JoinLobbyOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.JoinLobbyOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.JoinLobbyOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.JoinLobbyOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.JoinLobbyOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.LobbyProto lobby = 2;</code>
   * @return Whether the lobby field is set.
   */
  boolean hasLobby();
  /**
   * <code>.POGOProtos.Rpc.LobbyProto lobby = 2;</code>
   * @return The lobby.
   */
  POGOProtos.Rpc.LobbyProto getLobby();
  /**
   * <code>.POGOProtos.Rpc.LobbyProto lobby = 2;</code>
   */
  POGOProtos.Rpc.LobbyProtoOrBuilder getLobbyOrBuilder();
}
