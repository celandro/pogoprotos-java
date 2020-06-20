// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/PurchaseSkuResponse.proto

package POGOProtos.Networking.Responses;

public interface PurchaseSkuResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.PurchaseSkuResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.PurchaseSkuResponse.Status result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.PurchaseSkuResponse.Status result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.PurchaseSkuResponse.Status getResult();

  /**
   * <code>repeated bytes added_inventory_item = 2;</code>
   * @return A list containing the addedInventoryItem.
   */
  java.util.List<com.google.protobuf.ByteString> getAddedInventoryItemList();
  /**
   * <code>repeated bytes added_inventory_item = 2;</code>
   * @return The count of addedInventoryItem.
   */
  int getAddedInventoryItemCount();
  /**
   * <code>repeated bytes added_inventory_item = 2;</code>
   * @param index The index of the element to return.
   * @return The addedInventoryItem at the given index.
   */
  com.google.protobuf.ByteString getAddedInventoryItem(int index);

  /**
   * <code>repeated .POGOProtos.Data.Store.CurrencyUpdate currency_update = 3;</code>
   */
  java.util.List<POGOProtos.Data.Store.CurrencyUpdate> 
      getCurrencyUpdateList();
  /**
   * <code>repeated .POGOProtos.Data.Store.CurrencyUpdate currency_update = 3;</code>
   */
  POGOProtos.Data.Store.CurrencyUpdate getCurrencyUpdate(int index);
  /**
   * <code>repeated .POGOProtos.Data.Store.CurrencyUpdate currency_update = 3;</code>
   */
  int getCurrencyUpdateCount();
  /**
   * <code>repeated .POGOProtos.Data.Store.CurrencyUpdate currency_update = 3;</code>
   */
  java.util.List<? extends POGOProtos.Data.Store.CurrencyUpdateOrBuilder> 
      getCurrencyUpdateOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Store.CurrencyUpdate currency_update = 3;</code>
   */
  POGOProtos.Data.Store.CurrencyUpdateOrBuilder getCurrencyUpdateOrBuilder(
      int index);
}
