// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetLocalTimeMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface GetLocalTimeMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.GetLocalTimeMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 timestamp_ms = 1;</code>
   * @return A list containing the timestampMs.
   */
  java.util.List<java.lang.Long> getTimestampMsList();
  /**
   * <code>repeated int64 timestamp_ms = 1;</code>
   * @return The count of timestampMs.
   */
  int getTimestampMsCount();
  /**
   * <code>repeated int64 timestamp_ms = 1;</code>
   * @param index The index of the element to return.
   * @return The timestampMs at the given index.
   */
  long getTimestampMs(int index);
}
