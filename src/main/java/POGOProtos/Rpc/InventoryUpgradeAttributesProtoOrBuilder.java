// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface InventoryUpgradeAttributesProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.InventoryUpgradeAttributesProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 additional_storage = 1;</code>
   * @return The additionalStorage.
   */
  int getAdditionalStorage();

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
}
