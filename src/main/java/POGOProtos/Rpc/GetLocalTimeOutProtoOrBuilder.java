// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetLocalTimeOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetLocalTimeOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetLocalTimeOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.GetLocalTimeOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.GetLocalTimeOutProto.Status getStatus();

  /**
   * <code>repeated .POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto local_times = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto> 
      getLocalTimesList();
  /**
   * <code>repeated .POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto local_times = 2;</code>
   */
  POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto getLocalTimes(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto local_times = 2;</code>
   */
  int getLocalTimesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto local_times = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProtoOrBuilder> 
      getLocalTimesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProto local_times = 2;</code>
   */
  POGOProtos.Rpc.GetLocalTimeOutProto.LocalTimeProtoOrBuilder getLocalTimesOrBuilder(
      int index);
}
