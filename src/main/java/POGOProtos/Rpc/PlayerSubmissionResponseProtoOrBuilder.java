// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PlayerSubmissionResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlayerSubmissionResponseProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlayerSubmissionResponseProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.PlayerSubmissionResponseProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.PlayerSubmissionResponseProto.Status getStatus();

  /**
   * <code>string submission_id = 2;</code>
   * @return The submissionId.
   */
  java.lang.String getSubmissionId();
  /**
   * <code>string submission_id = 2;</code>
   * @return The bytes for submissionId.
   */
  com.google.protobuf.ByteString
      getSubmissionIdBytes();

  /**
   * <code>repeated string messages = 3;</code>
   * @return A list containing the messages.
   */
  java.util.List<java.lang.String>
      getMessagesList();
  /**
   * <code>repeated string messages = 3;</code>
   * @return The count of messages.
   */
  int getMessagesCount();
  /**
   * <code>repeated string messages = 3;</code>
   * @param index The index of the element to return.
   * @return The messages at the given index.
   */
  java.lang.String getMessages(int index);
  /**
   * <code>repeated string messages = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the messages at the given index.
   */
  com.google.protobuf.ByteString
      getMessagesBytes(int index);
}