// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatformMapTileDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformMapTileDataProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlatformMapTileProto map_tile = 1;</code>
   * @return Whether the mapTile field is set.
   */
  boolean hasMapTile();
  /**
   * <code>.POGOProtos.Rpc.PlatformMapTileProto map_tile = 1;</code>
   * @return The mapTile.
   */
  POGOProtos.Rpc.PlatformMapTileProto getMapTile();
  /**
   * <code>.POGOProtos.Rpc.PlatformMapTileProto map_tile = 1;</code>
   */
  POGOProtos.Rpc.PlatformMapTileProtoOrBuilder getMapTileOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PlatformLabelTile tile_data = 2;</code>
   * @return Whether the tileData field is set.
   */
  boolean hasTileData();
  /**
   * <code>.POGOProtos.Rpc.PlatformLabelTile tile_data = 2;</code>
   * @return The tileData.
   */
  POGOProtos.Rpc.PlatformLabelTile getTileData();
  /**
   * <code>.POGOProtos.Rpc.PlatformLabelTile tile_data = 2;</code>
   */
  POGOProtos.Rpc.PlatformLabelTileOrBuilder getTileDataOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PlatformMapCompositionRoot label_data = 3;</code>
   * @return Whether the labelData field is set.
   */
  boolean hasLabelData();
  /**
   * <code>.POGOProtos.Rpc.PlatformMapCompositionRoot label_data = 3;</code>
   * @return The labelData.
   */
  POGOProtos.Rpc.PlatformMapCompositionRoot getLabelData();
  /**
   * <code>.POGOProtos.Rpc.PlatformMapCompositionRoot label_data = 3;</code>
   */
  POGOProtos.Rpc.PlatformMapCompositionRootOrBuilder getLabelDataOrBuilder();
}
