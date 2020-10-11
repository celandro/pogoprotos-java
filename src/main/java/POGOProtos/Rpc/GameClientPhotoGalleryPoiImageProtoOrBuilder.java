// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GameClientPhotoGalleryPoiImageProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string image_id = 1;</code>
   * @return The imageId.
   */
  java.lang.String getImageId();
  /**
   * <code>string image_id = 1;</code>
   * @return The bytes for imageId.
   */
  com.google.protobuf.ByteString
      getImageIdBytes();

  /**
   * <code>string poi_id = 2;</code>
   * @return The poiId.
   */
  java.lang.String getPoiId();
  /**
   * <code>string poi_id = 2;</code>
   * @return The bytes for poiId.
   */
  com.google.protobuf.ByteString
      getPoiIdBytes();

  /**
   * <code>string submitter_codename = 3;</code>
   * @return The submitterCodename.
   */
  java.lang.String getSubmitterCodename();
  /**
   * <code>string submitter_codename = 3;</code>
   * @return The bytes for submitterCodename.
   */
  com.google.protobuf.ByteString
      getSubmitterCodenameBytes();

  /**
   * <code>string image_url = 4;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <code>string image_url = 4;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <code>int64 creation_timestamp_ms = 5;</code>
   * @return The creationTimestampMs.
   */
  long getCreationTimestampMs();

  /**
   * <code>bool has_player_voted = 6;</code>
   * @return The hasPlayerVoted.
   */
  boolean getHasPlayerVoted();

  /**
   * <code>int32 num_votes_from_game = 7;</code>
   * @return The numVotesFromGame.
   */
  int getNumVotesFromGame();
}