// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Platform/Requests/SubmitPoiLocationUpdateMessage.proto

package POGOProtos.Networking.Requests.Platform.Requests;

public interface SubmitPoiLocationUpdateMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Platform.Requests.SubmitPoiLocationUpdateMessage)
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
   * <code>.POGOProtos.Data.Route.RouteCheckpoint.LocationE6 location = 2;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.POGOProtos.Data.Route.RouteCheckpoint.LocationE6 location = 2;</code>
   * @return The location.
   */
  POGOProtos.Data.Route.RouteCheckpoint.LocationE6 getLocation();
  /**
   * <code>.POGOProtos.Data.Route.RouteCheckpoint.LocationE6 location = 2;</code>
   */
  POGOProtos.Data.Route.RouteCheckpoint.LocationE6OrBuilder getLocationOrBuilder();
}
