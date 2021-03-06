// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface LimitedPurchaseSkuSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.LimitedPurchaseSkuSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 purchase_limit = 1;</code>
   * @return The purchaseLimit.
   */
  int getPurchaseLimit();

  /**
   * <code>int32 version = 2;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <code>.POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.ChronoUnit chrono_unit = 3;</code>
   * @return The enum numeric value on the wire for chronoUnit.
   */
  int getChronoUnitValue();
  /**
   * <code>.POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.ChronoUnit chrono_unit = 3;</code>
   * @return The chronoUnit.
   */
  POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.ChronoUnit getChronoUnit();

  /**
   * <code>string loot_table_id = 4;</code>
   * @return The lootTableId.
   */
  java.lang.String getLootTableId();
  /**
   * <code>string loot_table_id = 4;</code>
   * @return The bytes for lootTableId.
   */
  com.google.protobuf.ByteString
      getLootTableIdBytes();

  /**
   * <code>int32 reset_interval = 20;</code>
   * @return The resetInterval.
   */
  int getResetInterval();
}
