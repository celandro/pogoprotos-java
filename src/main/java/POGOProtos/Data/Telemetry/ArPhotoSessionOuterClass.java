// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/ArPhotoSession.proto

package POGOProtos.Data.Telemetry;

public final class ArPhotoSessionOuterClass {
  private ArPhotoSessionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ArConditions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ArConditions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_BatterySample_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_BatterySample_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_FramerateSample_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_FramerateSample_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ProcessorSample_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ProcessorSample_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.POGOProtos/Data/Telemetry/ArPhotoSessi" +
      "on.proto\022\031POGOProtos.Data.Telemetry\"\234\017\n\016" +
      "ArPhotoSession\022A\n\007ar_type\030\001 \001(\01620.POGOPr" +
      "otos.Data.Telemetry.ArPhotoSession.ArTyp" +
      "e\022O\n\027furthest_step_completed\030\002 \001(\0162..POG" +
      "OProtos.Data.Telemetry.ArPhotoSession.St" +
      "ep\022\030\n\020num_photos_taken\030\003 \001(\005\022\031\n\021num_phot" +
      "os_shared\030\004 \001(\005\022#\n\033num_photos_taken_occl" +
      "usions\030\005 \001(\005\022\036\n\026num_occlusions_enabled\030\006" +
      " \001(\005\022\037\n\027num_occlusions_disabled\030\007 \001(\005\022G\n" +
      "\nar_context\030\010 \001(\01623.POGOProtos.Data.Tele" +
      "metry.ArPhotoSession.ArContext\022\026\n\016sessio" +
      "n_length\030\t \001(\003\022!\n\031session_length_occlusi" +
      "ons\030\n \001(\003\022$\n\034num_photos_shared_occlusion" +
      "s\030\013 \001(\005\022\021\n\tmodel_url\030\014 \001(\t\022\024\n\014ardk_versi" +
      "on\030\r \001(\t\022\031\n\021average_framerate\030\016 \001(\005\022\037\n\027a" +
      "verage_battery_per_min\030\017 \001(\002\022\031\n\021average_" +
      "cpu_usage\030\020 \001(\002\022\031\n\021average_gpu_usage\030\021 \001" +
      "(\002\022T\n\021framerate_samples\030\022 \003(\01329.POGOProt" +
      "os.Data.Telemetry.ArPhotoSession.Framera" +
      "teSample\022P\n\017battery_samples\030\023 \003(\01327.POGO" +
      "Protos.Data.Telemetry.ArPhotoSession.Bat" +
      "terySample\022T\n\021processor_samples\030\024 \003(\01329." +
      "POGOProtos.Data.Telemetry.ArPhotoSession" +
      ".ProcessorSample\022+\n#session_start_to_pla" +
      "ne_detection_ms\030\025 \001(\005\022.\n&plane_detection" +
      "_to_user_interaction_ms\030\026 \001(\005\032\206\001\n\014ArCond" +
      "itions\022\021\n\ttimestamp\030\001 \001(\003\022\032\n\022occlusions_" +
      "enabled\030\002 \001(\010\022G\n\017current_ar_step\030\003 \001(\0162." +
      ".POGOProtos.Data.Telemetry.ArPhotoSessio" +
      "n.Step\032\273\001\n\rBatterySample\022J\n\nconditions\030\001" +
      " \001(\01326.POGOProtos.Data.Telemetry.ArPhoto" +
      "Session.ArConditions\022\025\n\rbattery_level\030\002 " +
      "\001(\002\022G\n\006status\030\003 \001(\01627.POGOProtos.Data.Te" +
      "lemetry.ArPhotoSession.BatteryStatus\032p\n\017" +
      "FramerateSample\022J\n\nconditions\030\001 \001(\01326.PO" +
      "GOProtos.Data.Telemetry.ArPhotoSession.A" +
      "rConditions\022\021\n\tframerate\030\002 \001(\005\032\203\001\n\017Proce" +
      "ssorSample\022J\n\nconditions\030\001 \001(\01326.POGOPro" +
      "tos.Data.Telemetry.ArPhotoSession.ArCond" +
      "itions\022\021\n\tcpu_usage\030\002 \001(\002\022\021\n\tgpu_usage\030\003" +
      " \001(\002\"\\\n\rBatteryStatus\022\020\n\014UNDETERMINED\020\000\022" +
      "\014\n\010CHARGING\020\001\022\017\n\013DISCHARGING\020\002\022\020\n\014NOT_CH" +
      "ARGING\020\003\022\010\n\004FULL\020\004\"g\n\tArContext\022\010\n\004NONE\020" +
      "\000\022\020\n\014AR_ENCOUNTER\020\001\022\017\n\013AR_SNAPSHOT\020\002\022\026\n\022" +
      "SINGLEPLAYER_BUDDY\020\003\022\025\n\021MULTIPLAYER_BUDD" +
      "Y\020\004\"*\n\006ArType\022\t\n\005UNSET\020\000\022\010\n\004PLUS\020\001\022\013\n\007CL" +
      "ASSIC\020\002\"\210\001\n\004Step\022\013\n\007UNKNOWN\020\000\022\035\n\031CAMERA_" +
      "PERMISSION_GRANTED\020\001\022\026\n\022ARPLUS_PLANE_FOU" +
      "ND\020\002\022\031\n\025ARPLUS_POKEMON_PLACED\020\003\022\017\n\013PHOTO" +
      "_TAKEN\020\004\022\020\n\014PHOTO_SHARED\020\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_descriptor,
        new java.lang.String[] { "ArType", "FurthestStepCompleted", "NumPhotosTaken", "NumPhotosShared", "NumPhotosTakenOcclusions", "NumOcclusionsEnabled", "NumOcclusionsDisabled", "ArContext", "SessionLength", "SessionLengthOcclusions", "NumPhotosSharedOcclusions", "ModelUrl", "ArdkVersion", "AverageFramerate", "AverageBatteryPerMin", "AverageCpuUsage", "AverageGpuUsage", "FramerateSamples", "BatterySamples", "ProcessorSamples", "SessionStartToPlaneDetectionMs", "PlaneDetectionToUserInteractionMs", });
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ArConditions_descriptor =
      internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ArConditions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ArConditions_descriptor,
        new java.lang.String[] { "Timestamp", "OcclusionsEnabled", "CurrentArStep", });
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_BatterySample_descriptor =
      internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_descriptor.getNestedTypes().get(1);
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_BatterySample_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_BatterySample_descriptor,
        new java.lang.String[] { "Conditions", "BatteryLevel", "Status", });
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_FramerateSample_descriptor =
      internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_descriptor.getNestedTypes().get(2);
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_FramerateSample_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_FramerateSample_descriptor,
        new java.lang.String[] { "Conditions", "Framerate", });
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ProcessorSample_descriptor =
      internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_descriptor.getNestedTypes().get(3);
    internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ProcessorSample_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_ArPhotoSession_ProcessorSample_descriptor,
        new java.lang.String[] { "Conditions", "CpuUsage", "GpuUsage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
