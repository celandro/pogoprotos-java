// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface InventoryUpgradeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.InventoryUpgradeProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The enum numeric value on the wire for item.
   */
  int getItemValue();
  /**
   * <code>.POGOProtos.Rpc.Item item = 1;</code>
   * @return The item.
   */
  POGOProtos.Rpc.Item getItem();

  /**
   * <code>.POGOProtos.Rpc.InventoryUpgradeType upgrade_type = 2;</code>
   * @return The enum numeric value on the wire for upgradeType.
   */
  int getUpgradeTypeValue();
  /**
   * <code>.POGOProtos.Rpc.InventoryUpgradeType upgrade_type = 2;</code>
   * @return The upgradeType.
   */
  POGOProtos.Rpc.InventoryUpgradeType getUpgradeType();

  /**
   * <code>int32 additional_storage = 3;</code>
   * @return The additionalStorage.
   */
  int getAdditionalStorage();
}