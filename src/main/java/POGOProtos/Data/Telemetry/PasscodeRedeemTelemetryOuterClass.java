// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/PasscodeRedeemTelemetry.proto

package POGOProtos.Data.Telemetry;

public final class PasscodeRedeemTelemetryOuterClass {
  private PasscodeRedeemTelemetryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_PasscodeRedeemTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_PasscodeRedeemTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Data/Telemetry/PasscodeRede" +
      "emTelemetry.proto\022\031POGOProtos.Data.Telem" +
      "etry\"\200\001\n\027PasscodeRedeemTelemetry\022\016\n\006resu" +
      "lt\030\001 \001(\t\022\020\n\010passcode\030\002 \001(\t\022\024\n\014country_co" +
      "de\030\003 \001(\t\022\025\n\rlanguage_code\030\004 \001(\t\022\026\n\016bundl" +
      "e_version\030\005 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Telemetry_PasscodeRedeemTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_PasscodeRedeemTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_PasscodeRedeemTelemetry_descriptor,
        new java.lang.String[] { "Result", "Passcode", "CountryCode", "LanguageCode", "BundleVersion", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
