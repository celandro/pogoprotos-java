// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetIncomingGameInvitesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetIncomingGameInvitesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Rpc.GetIncomingGameInvitesResponse.IncomingGameInvite invites = 1;</code>
   */
  java.util.List<POGOProtos.Rpc.GetIncomingGameInvitesResponse.IncomingGameInvite> 
      getInvitesList();
  /**
   * <code>repeated .POGOProtos.Rpc.GetIncomingGameInvitesResponse.IncomingGameInvite invites = 1;</code>
   */
  POGOProtos.Rpc.GetIncomingGameInvitesResponse.IncomingGameInvite getInvites(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.GetIncomingGameInvitesResponse.IncomingGameInvite invites = 1;</code>
   */
  int getInvitesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.GetIncomingGameInvitesResponse.IncomingGameInvite invites = 1;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.GetIncomingGameInvitesResponse.IncomingGameInviteOrBuilder> 
      getInvitesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.GetIncomingGameInvitesResponse.IncomingGameInvite invites = 1;</code>
   */
  POGOProtos.Rpc.GetIncomingGameInvitesResponse.IncomingGameInviteOrBuilder getInvitesOrBuilder(
      int index);

  /**
   * <code>.POGOProtos.Rpc.GetIncomingGameInvitesResponse.Result result = 2;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetIncomingGameInvitesResponse.Result result = 2;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetIncomingGameInvitesResponse.Result getResult();
}