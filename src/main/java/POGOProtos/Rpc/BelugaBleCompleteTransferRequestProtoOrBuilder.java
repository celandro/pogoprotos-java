// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface BelugaBleCompleteTransferRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 transaction_id = 1;</code>
   * @return The transactionId.
   */
  long getTransactionId();

  /**
   * <code>int32 beluga_requested_item_id = 2;</code>
   * @return The belugaRequestedItemId.
   */
  int getBelugaRequestedItemId();

  /**
   * <code>string nonce = 3;</code>
   * @return The nonce.
   */
  java.lang.String getNonce();
  /**
   * <code>string nonce = 3;</code>
   * @return The bytes for nonce.
   */
  com.google.protobuf.ByteString
      getNonceBytes();
}