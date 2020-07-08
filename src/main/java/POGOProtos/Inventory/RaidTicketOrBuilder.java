// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/RaidTicket.proto

package POGOProtos.Inventory;

public interface RaidTicketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Inventory.RaidTicket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ticket_id = 1;</code>
   * @return The ticketId.
   */
  java.lang.String getTicketId();
  /**
   * <code>string ticket_id = 1;</code>
   * @return The bytes for ticketId.
   */
  com.google.protobuf.ByteString
      getTicketIdBytes();

  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item = 2;</code>
   * @return The enum numeric value on the wire for item.
   */
  int getItemValue();
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item = 2;</code>
   * @return The item.
   */
  POGOProtos.Inventory.Item.ItemId getItem();

  /**
   * <code>.POGOProtos.Inventory.ExclusiveTicketInfo exclusive_info = 4;</code>
   * @return Whether the exclusiveInfo field is set.
   */
  boolean hasExclusiveInfo();
  /**
   * <code>.POGOProtos.Inventory.ExclusiveTicketInfo exclusive_info = 4;</code>
   * @return The exclusiveInfo.
   */
  POGOProtos.Inventory.ExclusiveTicketInfo getExclusiveInfo();
  /**
   * <code>.POGOProtos.Inventory.ExclusiveTicketInfo exclusive_info = 4;</code>
   */
  POGOProtos.Inventory.ExclusiveTicketInfoOrBuilder getExclusiveInfoOrBuilder();
}