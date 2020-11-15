// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/BelugaTransactionStartResponse.proto

package POGOProtos.Networking.Responses;

public interface BelugaTransactionStartResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.BelugaTransactionStartResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.BelugaTransactionStartResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Networking.Responses.BelugaTransactionStartResponse.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Networking.Responses.BelugaTransactionStartResponse.Status getStatus();

  /**
   * <code>.POGOProtos.Data.Beluga.BelugaBleTransferPrep beluga_transfer_prep = 2;</code>
   * @return Whether the belugaTransferPrep field is set.
   */
  boolean hasBelugaTransferPrep();
  /**
   * <code>.POGOProtos.Data.Beluga.BelugaBleTransferPrep beluga_transfer_prep = 2;</code>
   * @return The belugaTransferPrep.
   */
  POGOProtos.Data.Beluga.BelugaBleTransferPrep getBelugaTransferPrep();
  /**
   * <code>.POGOProtos.Data.Beluga.BelugaBleTransferPrep beluga_transfer_prep = 2;</code>
   */
  POGOProtos.Data.Beluga.BelugaBleTransferPrepOrBuilder getBelugaTransferPrepOrBuilder();

  /**
   * <code>bytes server_signature = 3;</code>
   * @return The serverSignature.
   */
  com.google.protobuf.ByteString getServerSignature();
}
