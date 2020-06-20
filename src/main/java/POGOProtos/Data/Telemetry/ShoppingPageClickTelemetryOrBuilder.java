// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/ShoppingPageClickTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface ShoppingPageClickTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.ShoppingPageClickTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.ShoppingPageTelemetryIds shopping_page_click_id = 1;</code>
   * @return The enum numeric value on the wire for shoppingPageClickId.
   */
  int getShoppingPageClickIdValue();
  /**
   * <code>.POGOProtos.Enums.ShoppingPageTelemetryIds shopping_page_click_id = 1;</code>
   * @return The shoppingPageClickId.
   */
  POGOProtos.Enums.ShoppingPageTelemetryIds getShoppingPageClickId();

  /**
   * <code>.POGOProtos.Data.Telemetry.ShoppingPageClickTelemetry.ShoppingPageTelemetrySource shopping_page_click_source = 2;</code>
   * @return The enum numeric value on the wire for shoppingPageClickSource.
   */
  int getShoppingPageClickSourceValue();
  /**
   * <code>.POGOProtos.Data.Telemetry.ShoppingPageClickTelemetry.ShoppingPageTelemetrySource shopping_page_click_source = 2;</code>
   * @return The shoppingPageClickSource.
   */
  POGOProtos.Data.Telemetry.ShoppingPageClickTelemetry.ShoppingPageTelemetrySource getShoppingPageClickSource();

  /**
   * <code>string item_sku = 3;</code>
   * @return The itemSku.
   */
  java.lang.String getItemSku();
  /**
   * <code>string item_sku = 3;</code>
   * @return The bytes for itemSku.
   */
  com.google.protobuf.ByteString
      getItemSkuBytes();

  /**
   * <code>bool has_item = 4;</code>
   * @return The hasItem.
   */
  boolean getHasItem();
}
