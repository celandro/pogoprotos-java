// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface QuestStampProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.QuestStampProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.QuestProto.Context context = 1;</code>
   * @return The enum numeric value on the wire for context.
   */
  int getContextValue();
  /**
   * <code>.POGOProtos.Rpc.QuestProto.Context context = 1;</code>
   * @return The context.
   */
  POGOProtos.Rpc.QuestProto.Context getContext();

  /**
   * <code>uint64 timestamp_ms = 2;</code>
   * @return The timestampMs.
   */
  long getTimestampMs();
}