// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/ViewPointOfInterestImageTelemetry.proto

package POGOProtos.Data.Telemetry;

public final class ViewPointOfInterestImageTelemetryOuterClass {
  private ViewPointOfInterestImageTelemetryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_ViewPointOfInterestImageTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_ViewPointOfInterestImageTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAPOGOProtos/Data/Telemetry/ViewPointOfI" +
      "nterestImageTelemetry.proto\022\031POGOProtos." +
      "Data.Telemetry\032\"POGOProtos/Map/Fort/Fort" +
      "Type.proto\"\313\001\n!ViewPointOfInterestImageT" +
      "elemetry\022\016\n\006result\030\001 \001(\t\022\017\n\007fort_id\030\002 \001(" +
      "\t\0220\n\tfort_type\030\003 \001(\0162\035.POGOProtos.Map.Fo" +
      "rt.FortType\022\020\n\010in_range\030\004 \001(\010\022\030\n\020was_gym" +
      "_interior\030\005 \001(\010\022\022\n\npartner_id\030\006 \001(\t\022\023\n\013c" +
      "ampaign_id\030\007 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Map.Fort.FortTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Telemetry_ViewPointOfInterestImageTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_ViewPointOfInterestImageTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_ViewPointOfInterestImageTelemetry_descriptor,
        new java.lang.String[] { "Result", "FortId", "FortType", "InRange", "WasGymInterior", "PartnerId", "CampaignId", });
    POGOProtos.Map.Fort.FortTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}