// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetTodayViewOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetTodayViewOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetTodayViewOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.GetTodayViewOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.GetTodayViewOutProto.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
   * @return Whether the todayView field is set.
   */
  boolean hasTodayView();
  /**
   * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
   * @return The todayView.
   */
  POGOProtos.Rpc.TodayViewProto getTodayView();
  /**
   * <code>.POGOProtos.Rpc.TodayViewProto today_view = 2;</code>
   */
  POGOProtos.Rpc.TodayViewProtoOrBuilder getTodayViewOrBuilder();
}
