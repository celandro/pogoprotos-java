// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatformRedeemGoogleReceiptOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformRedeemGoogleReceiptOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlatformRedeemGoogleReceiptOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.PlatformRedeemGoogleReceiptOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.PlatformRedeemGoogleReceiptOutProto.Status getStatus();

  /**
   * <code>string transaction_token = 2;</code>
   * @return The transactionToken.
   */
  java.lang.String getTransactionToken();
  /**
   * <code>string transaction_token = 2;</code>
   * @return The bytes for transactionToken.
   */
  com.google.protobuf.ByteString
      getTransactionTokenBytes();
}
