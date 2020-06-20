// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface AssetDigestDecoderToolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.AssetDigestDecoderTool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  java.util.List<POGOProtos.Rpc.AssetDigestDecoderTool.AssetDigestEntry> 
      getDigestList();
  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  POGOProtos.Rpc.AssetDigestDecoderTool.AssetDigestEntry getDigest(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  int getDigestCount();
  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.AssetDigestDecoderTool.AssetDigestEntryOrBuilder> 
      getDigestOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  POGOProtos.Rpc.AssetDigestDecoderTool.AssetDigestEntryOrBuilder getDigestOrBuilder(
      int index);

  /**
   * <code>uint64 timestamp_ms = 2;</code>
   * @return The timestampMs.
   */
  long getTimestampMs();

  /**
   * <code>.POGOProtos.Rpc.AssetDigestDecoderTool.Result result = 3;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.AssetDigestDecoderTool.Result result = 3;</code>
   * @return The result.
   */
  POGOProtos.Rpc.AssetDigestDecoderTool.Result getResult();

  /**
   * <code>int32 page_offset = 4;</code>
   * @return The pageOffset.
   */
  int getPageOffset();
}
