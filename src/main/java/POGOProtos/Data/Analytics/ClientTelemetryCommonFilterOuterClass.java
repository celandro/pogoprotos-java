// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Analytics/ClientTelemetryCommonFilter.proto

package POGOProtos.Data.Analytics;

public final class ClientTelemetryCommonFilterOuterClass {
  private ClientTelemetryCommonFilterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;POGOProtos/Data/Analytics/ClientTeleme" +
      "tryCommonFilter.proto\022\031POGOProtos.Data.A" +
      "nalytics\"\313\001\n\033ClientTelemetryCommonFilter" +
      "\022\036\n\026application_identifier\030\001 \001(\t\022\035\n\025oper" +
      "ating_system_name\030\002 \001(\t\022\024\n\014device_model\030" +
      "\003 \001(\t\022\033\n\023locale_country_code\030\004 \001(\t\022\034\n\024lo" +
      "cale_language_code\030\005 \001(\t\022\034\n\024sampling_pro" +
      "bability\030\006 \001(\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Analytics_ClientTelemetryCommonFilter_descriptor,
        new java.lang.String[] { "ApplicationIdentifier", "OperatingSystemName", "DeviceModel", "LocaleCountryCode", "LocaleLanguageCode", "SamplingProbability", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
