// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface LimitedPurchaseSkuRecordProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.LimitedPurchaseSkuRecordProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto&gt; purchases = 1;</code>
   */
  int getPurchasesCount();
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto&gt; purchases = 1;</code>
   */
  boolean containsPurchases(
      java.lang.String key);
  /**
   * Use {@link #getPurchasesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto>
  getPurchases();
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto&gt; purchases = 1;</code>
   */
  java.util.Map<java.lang.String, POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto>
  getPurchasesMap();
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto&gt; purchases = 1;</code>
   */

  POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto getPurchasesOrDefault(
      java.lang.String key,
      POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto defaultValue);
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto&gt; purchases = 1;</code>
   */

  POGOProtos.Rpc.LimitedPurchaseSkuRecordProto.PurchaseProto getPurchasesOrThrow(
      java.lang.String key);
}
