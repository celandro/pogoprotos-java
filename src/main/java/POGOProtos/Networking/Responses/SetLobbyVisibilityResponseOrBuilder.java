// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/SetLobbyVisibilityResponse.proto

package POGOProtos.Networking.Responses;

public interface SetLobbyVisibilityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.SetLobbyVisibilityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.SetLobbyVisibilityResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.SetLobbyVisibilityResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.SetLobbyVisibilityResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.Raid.Lobby lobby = 2;</code>
   * @return Whether the lobby field is set.
   */
  boolean hasLobby();
  /**
   * <code>.POGOProtos.Data.Raid.Lobby lobby = 2;</code>
   * @return The lobby.
   */
  POGOProtos.Data.Raid.Lobby getLobby();
  /**
   * <code>.POGOProtos.Data.Raid.Lobby lobby = 2;</code>
   */
  POGOProtos.Data.Raid.LobbyOrBuilder getLobbyOrBuilder();
}
