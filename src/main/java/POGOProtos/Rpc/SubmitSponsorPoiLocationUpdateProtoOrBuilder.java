// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface SubmitSponsorPoiLocationUpdateProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.SubmitSponsorPoiLocationUpdateProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string poi_id = 1;</code>
   * @return The poiId.
   */
  java.lang.String getPoiId();
  /**
   * <code>string poi_id = 1;</code>
   * @return The bytes for poiId.
   */
  com.google.protobuf.ByteString
      getPoiIdBytes();

  /**
   * <code>.POGOProtos.Rpc.LocationE6Proto location = 2;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.POGOProtos.Rpc.LocationE6Proto location = 2;</code>
   * @return The location.
   */
  POGOProtos.Rpc.LocationE6Proto getLocation();
  /**
   * <code>.POGOProtos.Rpc.LocationE6Proto location = 2;</code>
   */
  POGOProtos.Rpc.LocationE6ProtoOrBuilder getLocationOrBuilder();
}
