// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Geofence/GeofenceMetadata.proto

package POGOProtos.Data.Geofence;

public final class GeofenceMetadataOuterClass {
  private GeofenceMetadataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Geofence_GeofenceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Geofence_GeofenceMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/POGOProtos/Data/Geofence/GeofenceMetad" +
      "ata.proto\022\030POGOProtos.Data.Geofence\"\301\001\n\020" +
      "GeofenceMetadata\022\024\n\014latitude_deg\030\001 \001(\001\022\025" +
      "\n\rlongitude_deg\030\002 \001(\001\022\016\n\006radius\030\003 \001(\001\022\022\n" +
      "\nidentifier\030\004 \001(\t\022\025\n\rexpiration_ms\030\005 \001(\003" +
      "\022\025\n\rdwell_time_ms\030\006 \001(\003\022\030\n\020fire_on_entra" +
      "nce\030\007 \001(\010\022\024\n\014fire_on_exit\030\010 \001(\010B\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Geofence_GeofenceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Geofence_GeofenceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Geofence_GeofenceMetadata_descriptor,
        new java.lang.String[] { "LatitudeDeg", "LongitudeDeg", "Radius", "Identifier", "ExpirationMs", "DwellTimeMs", "FireOnEntrance", "FireOnExit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
