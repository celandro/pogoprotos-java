// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface BelugaTransactionStartOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BelugaTransactionStartOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.BelugaTransactionStartOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.BelugaTransactionStartOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.BelugaTransactionStartOutProto.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto beluga_transfer_prep = 2;</code>
   * @return Whether the belugaTransferPrep field is set.
   */
  boolean hasBelugaTransferPrep();
  /**
   * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto beluga_transfer_prep = 2;</code>
   * @return The belugaTransferPrep.
   */
  POGOProtos.Rpc.BelugaBleTransferPrepProto getBelugaTransferPrep();
  /**
   * <code>.POGOProtos.Rpc.BelugaBleTransferPrepProto beluga_transfer_prep = 2;</code>
   */
  POGOProtos.Rpc.BelugaBleTransferPrepProtoOrBuilder getBelugaTransferPrepOrBuilder();

  /**
   * <code>bytes server_signature = 3;</code>
   * @return The serverSignature.
   */
  com.google.protobuf.ByteString getServerSignature();
}
