// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/SendRaidInvitationResponse.proto

package POGOProtos.Networking.Responses;

public interface SendRaidInvitationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.SendRaidInvitationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.SendRaidInvitationResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.SendRaidInvitationResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.SendRaidInvitationResponse.Result getResult();

  /**
   * <code>int32 num_friend_invites_remaining = 2;</code>
   * @return The numFriendInvitesRemaining.
   */
  int getNumFriendInvitesRemaining();
}
