// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Route/PoiVideoSubmissionMetadataProto.proto

package POGOProtos.Data.Route;

public final class PoiVideoSubmissionMetadataProtoOuterClass {
  private PoiVideoSubmissionMetadataProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Route_PoiVideoSubmissionMetadataProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Route_PoiVideoSubmissionMetadataProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;POGOProtos/Data/Route/PoiVideoSubmissi" +
      "onMetadataProto.proto\022\025POGOProtos.Data.R" +
      "oute\032+POGOProtos/Data/Route/RouteCheckpo" +
      "int.proto\"\214\001\n\037PoiVideoSubmissionMetadata" +
      "Proto\022\016\n\006poi_id\030\001 \001(\t\022C\n\010location\030\002 \001(\0132" +
      "1.POGOProtos.Data.Route.RouteCheckpoint." +
      "LocationE6\022\024\n\014player_level\030\003 \001(\005B\002P\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Route.RouteCheckpointOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Route_PoiVideoSubmissionMetadataProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Route_PoiVideoSubmissionMetadataProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Route_PoiVideoSubmissionMetadataProto_descriptor,
        new java.lang.String[] { "PoiId", "Location", "PlayerLevel", });
    POGOProtos.Data.Route.RouteCheckpointOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
