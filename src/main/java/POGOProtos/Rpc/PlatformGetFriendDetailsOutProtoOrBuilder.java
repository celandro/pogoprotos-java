// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatformGetFriendDetailsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformGetFriendDetailsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlatformGetFriendDetailsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.PlatformGetFriendDetailsOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.PlatformGetFriendDetailsOutProto.Result getResult();

  /**
   * <code>repeated .POGOProtos.Rpc.PlatformFriendDetailsProto friend = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.PlatformFriendDetailsProto> 
      getFriendList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformFriendDetailsProto friend = 2;</code>
   */
  POGOProtos.Rpc.PlatformFriendDetailsProto getFriend(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformFriendDetailsProto friend = 2;</code>
   */
  int getFriendCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformFriendDetailsProto friend = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PlatformFriendDetailsProtoOrBuilder> 
      getFriendOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformFriendDetailsProto friend = 2;</code>
   */
  POGOProtos.Rpc.PlatformFriendDetailsProtoOrBuilder getFriendOrBuilder(
      int index);

  /**
   * <code>.POGOProtos.Rpc.PlatformGetFriendDetailsOutProto.DebugProto friend_details_debug_info = 3;</code>
   * @return Whether the friendDetailsDebugInfo field is set.
   */
  boolean hasFriendDetailsDebugInfo();
  /**
   * <code>.POGOProtos.Rpc.PlatformGetFriendDetailsOutProto.DebugProto friend_details_debug_info = 3;</code>
   * @return The friendDetailsDebugInfo.
   */
  POGOProtos.Rpc.PlatformGetFriendDetailsOutProto.DebugProto getFriendDetailsDebugInfo();
  /**
   * <code>.POGOProtos.Rpc.PlatformGetFriendDetailsOutProto.DebugProto friend_details_debug_info = 3;</code>
   */
  POGOProtos.Rpc.PlatformGetFriendDetailsOutProto.DebugProtoOrBuilder getFriendDetailsDebugInfoOrBuilder();
}
