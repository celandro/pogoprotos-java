// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface InventoryItemProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.InventoryItemProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.HoloInventoryKeyProto deleted_item_key = 2;</code>
   * @return Whether the deletedItemKey field is set.
   */
  boolean hasDeletedItemKey();
  /**
   * <code>.POGOProtos.Rpc.HoloInventoryKeyProto deleted_item_key = 2;</code>
   * @return The deletedItemKey.
   */
  POGOProtos.Rpc.HoloInventoryKeyProto getDeletedItemKey();
  /**
   * <code>.POGOProtos.Rpc.HoloInventoryKeyProto deleted_item_key = 2;</code>
   */
  POGOProtos.Rpc.HoloInventoryKeyProtoOrBuilder getDeletedItemKeyOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.HoloInventoryItemProto item = 3;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <code>.POGOProtos.Rpc.HoloInventoryItemProto item = 3;</code>
   * @return The item.
   */
  POGOProtos.Rpc.HoloInventoryItemProto getItem();
  /**
   * <code>.POGOProtos.Rpc.HoloInventoryItemProto item = 3;</code>
   */
  POGOProtos.Rpc.HoloInventoryItemProtoOrBuilder getItemOrBuilder();

  /**
   * <code>int64 modified_timestamp = 1;</code>
   * @return The modifiedTimestamp.
   */
  long getModifiedTimestamp();

  public POGOProtos.Rpc.InventoryItemProto.InventoryItemCase getInventoryItemCase();
}