// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface CompleteSnapshotSessionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CompleteSnapshotSessionProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed64 photo_pokemon_id = 1;</code>
   * @return The photoPokemonId.
   */
  long getPhotoPokemonId();

  /**
   * <code>int32 num_photos_taken = 2;</code>
   * @return The numPhotosTaken.
   */
  int getNumPhotosTaken();

  /**
   * <code>int64 snapshot_session_start_time = 3;</code>
   * @return The snapshotSessionStartTime.
   */
  long getSnapshotSessionStartTime();
}
