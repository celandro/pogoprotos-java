// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface RpcSocketResponseTimeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.RpcSocketResponseTime)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 request_id = 1;</code>
   * @return The requestId.
   */
  long getRequestId();

  /**
   * <code>string probe_id = 2;</code>
   * @return The probeId.
   */
  java.lang.String getProbeId();
  /**
   * <code>string probe_id = 2;</code>
   * @return The bytes for probeId.
   */
  com.google.protobuf.ByteString
      getProbeIdBytes();

  /**
   * <code>float response_time = 3;</code>
   * @return The responseTime.
   */
  float getResponseTime();

  /**
   * <code>bool side_channel = 4;</code>
   * @return The sideChannel.
   */
  boolean getSideChannel();

  /**
   * <code>bool ad_hoc = 5;</code>
   * @return The adHoc.
   */
  boolean getAdHoc();

  /**
   * <code>float ad_hoc_delay = 6;</code>
   * @return The adHocDelay.
   */
  float getAdHocDelay();
}