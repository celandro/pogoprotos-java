// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface TwoWaySharedFriendshipDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TwoWaySharedFriendshipDataProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool is_lucky = 1;</code>
   * @return The isLucky.
   */
  boolean getIsLucky();

  /**
   * <code>int32 lucky_count = 2;</code>
   * @return The luckyCount.
   */
  int getLuckyCount();

  /**
   * <code>.POGOProtos.Rpc.TwoWaySharedFriendshipDataProto.SharedMigrations shared_migrations = 3;</code>
   * @return Whether the sharedMigrations field is set.
   */
  boolean hasSharedMigrations();
  /**
   * <code>.POGOProtos.Rpc.TwoWaySharedFriendshipDataProto.SharedMigrations shared_migrations = 3;</code>
   * @return The sharedMigrations.
   */
  POGOProtos.Rpc.TwoWaySharedFriendshipDataProto.SharedMigrations getSharedMigrations();
  /**
   * <code>.POGOProtos.Rpc.TwoWaySharedFriendshipDataProto.SharedMigrations shared_migrations = 3;</code>
   */
  POGOProtos.Rpc.TwoWaySharedFriendshipDataProto.SharedMigrationsOrBuilder getSharedMigrationsOrBuilder();
}
