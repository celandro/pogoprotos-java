// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface TemporaryEvolutionsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TemporaryEvolutionsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 1;</code>
   * @return The enum numeric value on the wire for temporaryEvolutionId.
   */
  int getTemporaryEvolutionIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 1;</code>
   * @return The temporaryEvolutionId.
   */
  POGOProtos.Rpc.HoloTemporaryEvolutionId getTemporaryEvolutionId();

  /**
   * <code>int32 asset_bunble_value = 2;</code>
   * @return The assetBunbleValue.
   */
  int getAssetBunbleValue();

  /**
   * <code>string asset_bunble_name = 3;</code>
   * @return The assetBunbleName.
   */
  java.lang.String getAssetBunbleName();
  /**
   * <code>string asset_bunble_name = 3;</code>
   * @return The bytes for assetBunbleName.
   */
  com.google.protobuf.ByteString
      getAssetBunbleNameBytes();
}