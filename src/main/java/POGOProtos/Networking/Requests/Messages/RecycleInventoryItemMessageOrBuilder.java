// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/RecycleInventoryItemMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface RecycleInventoryItemMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.RecycleInventoryItemMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
   * @return The enum numeric value on the wire for itemId.
   */
  int getItemIdValue();
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 1;</code>
   * @return The itemId.
   */
  POGOProtos.Inventory.Item.ItemId getItemId();

  /**
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  int getCount();
}
