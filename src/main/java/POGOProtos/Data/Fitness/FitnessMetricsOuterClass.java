// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Fitness/FitnessMetrics.proto

package POGOProtos.Data.Fitness;

public final class FitnessMetricsOuterClass {
  private FitnessMetricsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Fitness_FitnessMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Fitness_FitnessMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,POGOProtos/Data/Fitness/FitnessMetrics" +
      ".proto\022\027POGOProtos.Data.Fitness\"\304\001\n\016Fitn" +
      "essMetrics\022\036\n\026distance_walked_meters\030\001 \001" +
      "(\001\022\022\n\nstep_count\030\002 \001(\005\022\035\n\025calories_burne" +
      "d_kcals\030\003 \001(\001\022\034\n\024exercise_duration_mi\030\004 " +
      "\001(\003\022\"\n\032wheelchair_distance_meters\030\005 \001(\001\022" +
      "\035\n\025wheelchair_push_count\030\006 \001(\001B\002P\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Fitness_FitnessMetrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Fitness_FitnessMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Fitness_FitnessMetrics_descriptor,
        new java.lang.String[] { "DistanceWalkedMeters", "StepCount", "CaloriesBurnedKcals", "ExerciseDurationMi", "WheelchairDistanceMeters", "WheelchairPushCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}