// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetGameMasterClientTemplatesProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetGameMasterClientTemplatesProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool paginate = 1;</code>
   * @return The paginate.
   */
  boolean getPaginate();

  /**
   * <code>int32 page_offset = 2;</code>
   * @return The pageOffset.
   */
  int getPageOffset();

  /**
   * <code>uint64 page_timestamp = 3;</code>
   * @return The pageTimestamp.
   */
  long getPageTimestamp();
}
