// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Titan/TitanGameClientTelemetryOmni.proto

package POGOProtos.Data.Titan;

public final class TitanGameClientTelemetryOmniOuterClass {
  private TitanGameClientTelemetryOmniOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiPlayerMetadataTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiPlayerMetadataTelemetry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionPhotoUploadErrorTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionPhotoUploadErrorTelemetry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8POGOProtos/Data/Titan/TitanGameClientT" +
      "elemetryOmni.proto\022\025POGOProtos.Data.Tita" +
      "n\032#POGOProtos/Enums/PoiImageType.proto\0322" +
      "POGOProtos/Data/Telemetry/PlatformServer" +
      "Data.proto\"\323\r\n\034TitanGameClientTelemetryO" +
      "mni\022n\n\030poi_submission_telemetry\030\001 \001(\0132J." +
      "POGOProtos.Data.Titan.TitanGameClientTel" +
      "emetryOmni.PoiSubmissionTelemetryH\000\022\221\001\n+" +
      "poi_submission_photo_upload_error_teleme" +
      "try\030\002 \001(\0132Z.POGOProtos.Data.Titan.TitanG" +
      "ameClientTelemetryOmni.PoiSubmissionPhot" +
      "oUploadErrorTelemetryH\000\022s\n\031player_metada" +
      "ta_telemetry\030\003 \001(\0132N.POGOProtos.Data.Tit" +
      "an.TitanGameClientTelemetryOmni.PoiPlaye" +
      "rMetadataTelemetryH\000\022C\n\013server_data\030\351\007 \001" +
      "(\0132-.POGOProtos.Data.Telemetry.PlatformS" +
      "erverData\032E\n\032PoiPlayerMetadataTelemetry\022" +
      "\024\n\014device_model\030\001 \001(\t\022\021\n\tdevice_os\030\002 \001(\t" +
      "\032\354\002\n&PoiSubmissionPhotoUploadErrorTeleme" +
      "try\022\215\001\n\010error_id\030\001 \001(\0162{.POGOProtos.Data" +
      ".Titan.TitanGameClientTelemetryOmni.PoiS" +
      "ubmissionPhotoUploadErrorTelemetry.PoiSu" +
      "bmissionPhotoUploadErrorIds\0222\n\nimage_typ" +
      "e\030\002 \001(\0162\036.POGOProtos.Enums.PoiImageType\022" +
      "\025\n\rerror_message\030\003 \001(\t\"g\n PoiSubmissionP" +
      "hotoUploadErrorIds\022\t\n\005UNSET\020\000\022\032\n\026POI_PHO" +
      "TO_UPLOAD_ERROR\020\001\022\034\n\030POI_PHOTO_UPLOAD_TI" +
      "MEOUT\020\002\032\255\006\n\026PoiSubmissionTelemetry\022x\n\014gu" +
      "i_event_id\030\001 \001(\0162b.POGOProtos.Data.Titan" +
      ".TitanGameClientTelemetryOmni.PoiSubmiss" +
      "ionTelemetry.PoiSubmissionGuiEventId\0222\n\n" +
      "image_type\030\002 \001(\0162\036.POGOProtos.Enums.PoiI" +
      "mageType\022s\n\016camera_step_id\030\003 \001(\0162[.POGOP" +
      "rotos.Data.Titan.TitanGameClientTelemetr" +
      "yOmni.PoiSubmissionTelemetry.PoiCameraSt" +
      "epIds\"K\n\020PoiCameraStepIds\022\t\n\005UNSET\020\000\022\t\n\005" +
      "ENTER\020\001\022\n\n\006RETAKE\020\002\022\013\n\007CONFIRM\020\003\022\010\n\004EXIT" +
      "\020\004\"\242\003\n\027PoiSubmissionGuiEventId\022\013\n\007UNKNOW" +
      "N\020\000\022\030\n\024POI_NOMINATION_ENTER\020\001\022\031\n\025POI_TUT" +
      "ORIAL_COMPLETE\020\002\022\033\n\027POI_MAP_CHANGEDVIEW_" +
      "MAP\020\003\022!\n\035POI_MAP_CHANGEDVIEW_SATELLITE\020\004" +
      "\022\033\n\027POI_MAP_CENTER_LOCATION\020\005\022\024\n\020POI_LOC" +
      "ATION_SET\020\006\022\032\n\026POI_PHOTO_CAMERA_ENTER\020\007\022" +
      "\031\n\025POI_PHOTO_CAMERA_EXIT\020\010\022\025\n\021POI_TITLE_" +
      "ENTERED\020\t\022\031\n\025POI_DESCRIPTION_ENTER\020\n\022\027\n\023" +
      "POI_DETAILS_CONFIRM\020\013\022\034\n\030POI_SUPPORTINGI" +
      "NFO_ENTER\020\014\022\031\n\025POI_SUBMIT_BUTTON_HIT\020\r\022\027" +
      "\n\023POI_EXIT_BUTTON_HIT\020\016B\017\n\rTelemetryData" +
      "B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.PoiImageTypeOuterClass.getDescriptor(),
          POGOProtos.Data.Telemetry.PlatformServerDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_descriptor,
        new java.lang.String[] { "PoiSubmissionTelemetry", "PoiSubmissionPhotoUploadErrorTelemetry", "PlayerMetadataTelemetry", "ServerData", "TelemetryData", });
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiPlayerMetadataTelemetry_descriptor =
      internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiPlayerMetadataTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiPlayerMetadataTelemetry_descriptor,
        new java.lang.String[] { "DeviceModel", "DeviceOs", });
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionPhotoUploadErrorTelemetry_descriptor =
      internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_descriptor.getNestedTypes().get(1);
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionPhotoUploadErrorTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionPhotoUploadErrorTelemetry_descriptor,
        new java.lang.String[] { "ErrorId", "ImageType", "ErrorMessage", });
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionTelemetry_descriptor =
      internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_descriptor.getNestedTypes().get(2);
    internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Titan_TitanGameClientTelemetryOmni_PoiSubmissionTelemetry_descriptor,
        new java.lang.String[] { "GuiEventId", "ImageType", "CameraStepId", });
    POGOProtos.Enums.PoiImageTypeOuterClass.getDescriptor();
    POGOProtos.Data.Telemetry.PlatformServerDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
