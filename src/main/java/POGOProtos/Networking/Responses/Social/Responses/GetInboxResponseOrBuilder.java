// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Social/Responses/GetInboxResponse.proto

package POGOProtos.Networking.Responses.Social.Responses;

public interface GetInboxResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.Social.Responses.GetInboxResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.Social.Responses.GetInboxResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.Social.Responses.GetInboxResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.Social.Responses.GetInboxResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.Inbox.ClientInbox inbox = 2;</code>
   * @return Whether the inbox field is set.
   */
  boolean hasInbox();
  /**
   * <code>.POGOProtos.Data.Inbox.ClientInbox inbox = 2;</code>
   * @return The inbox.
   */
  POGOProtos.Data.Inbox.ClientInbox getInbox();
  /**
   * <code>.POGOProtos.Data.Inbox.ClientInbox inbox = 2;</code>
   */
  POGOProtos.Data.Inbox.ClientInboxOrBuilder getInboxOrBuilder();
}
