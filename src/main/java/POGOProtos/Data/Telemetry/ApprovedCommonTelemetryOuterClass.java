// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/ApprovedCommonTelemetry.proto

package POGOProtos.Data.Telemetry;

public final class ApprovedCommonTelemetryOuterClass {
  private ApprovedCommonTelemetryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_ApprovedCommonTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_ApprovedCommonTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Data/Telemetry/ApprovedComm" +
      "onTelemetry.proto\022\031POGOProtos.Data.Telem" +
      "etry\032;POGOProtos/Data/Analytics/ClientTe" +
      "lemetryCommonFilter.proto\0327POGOProtos/Da" +
      "ta/Telemetry/CommonTelemetryBootTime.pro" +
      "to\0328POGOProtos/Data/Telemetry/CommonTele" +
      "metryShopClick.proto\0327POGOProtos/Data/Te" +
      "lemetry/CommonTelemetryShopView.proto\0324P" +
      "OGOProtos/Data/Telemetry/ServerRecordMet" +
      "adata.proto\0324POGOProtos/Data/Telemetry/C" +
      "ommonTelemetryLogIn.proto\0326POGOProtos/Da" +
      "ta/Telemetry/PoiSubmissionTelemetry.prot" +
      "o\032FPOGOProtos/Data/Telemetry/PoiSubmissi" +
      "onPhotoUploadErrorTelemetry.proto\"\261\005\n\027Ap" +
      "provedCommonTelemetry\022G\n\tboot_time\030\001 \001(\013" +
      "22.POGOProtos.Data.Telemetry.CommonTelem" +
      "etryBootTimeH\000\022I\n\nshop_click\030\002 \001(\01323.POG" +
      "OProtos.Data.Telemetry.CommonTelemetrySh" +
      "opClickH\000\022G\n\tshop_view\030\003 \001(\01322.POGOProto" +
      "s.Data.Telemetry.CommonTelemetryShopView" +
      "H\000\022U\n\030poi_submission_telemetry\030\004 \001(\01321.P" +
      "OGOProtos.Data.Telemetry.PoiSubmissionTe" +
      "lemetryH\000\022x\n+poi_submission_photo_upload" +
      "_error_telemetry\030\005 \001(\0132A.POGOProtos.Data" +
      ".Telemetry.PoiSubmissionPhotoUploadError" +
      "TelemetryH\000\022A\n\006log_in\030\006 \001(\0132/.POGOProtos" +
      ".Data.Telemetry.CommonTelemetryLogInH\000\022D" +
      "\n\013server_data\030\007 \001(\0132/.POGOProtos.Data.Te" +
      "lemetry.ServerRecordMetadata\022N\n\016common_f" +
      "ilters\030\010 \001(\01326.POGOProtos.Data.Analytics" +
      ".ClientTelemetryCommonFilterB\017\n\rTelemetr" +
      "yDataB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOuterClass.getDescriptor(),
          POGOProtos.Data.Telemetry.CommonTelemetryBootTimeOuterClass.getDescriptor(),
          POGOProtos.Data.Telemetry.CommonTelemetryShopClickOuterClass.getDescriptor(),
          POGOProtos.Data.Telemetry.CommonTelemetryShopViewOuterClass.getDescriptor(),
          POGOProtos.Data.Telemetry.ServerRecordMetadataOuterClass.getDescriptor(),
          POGOProtos.Data.Telemetry.CommonTelemetryLogInOuterClass.getDescriptor(),
          POGOProtos.Data.Telemetry.PoiSubmissionTelemetryOuterClass.getDescriptor(),
          POGOProtos.Data.Telemetry.PoiSubmissionPhotoUploadErrorTelemetryOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Telemetry_ApprovedCommonTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_ApprovedCommonTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_ApprovedCommonTelemetry_descriptor,
        new java.lang.String[] { "BootTime", "ShopClick", "ShopView", "PoiSubmissionTelemetry", "PoiSubmissionPhotoUploadErrorTelemetry", "LogIn", "ServerData", "CommonFilters", "TelemetryData", });
    POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOuterClass.getDescriptor();
    POGOProtos.Data.Telemetry.CommonTelemetryBootTimeOuterClass.getDescriptor();
    POGOProtos.Data.Telemetry.CommonTelemetryShopClickOuterClass.getDescriptor();
    POGOProtos.Data.Telemetry.CommonTelemetryShopViewOuterClass.getDescriptor();
    POGOProtos.Data.Telemetry.ServerRecordMetadataOuterClass.getDescriptor();
    POGOProtos.Data.Telemetry.CommonTelemetryLogInOuterClass.getDescriptor();
    POGOProtos.Data.Telemetry.PoiSubmissionTelemetryOuterClass.getDescriptor();
    POGOProtos.Data.Telemetry.PoiSubmissionPhotoUploadErrorTelemetryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}