// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/RegisterBackgroundDeviceResponse.proto

package POGOProtos.Networking.Responses;

public final class RegisterBackgroundDeviceResponseOuterClass {
  private RegisterBackgroundDeviceResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_BackgroundToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_BackgroundToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFPOGOProtos/Networking/Responses/Regist" +
      "erBackgroundDeviceResponse.proto\022\037POGOPr" +
      "otos.Networking.Responses\"\370\001\n RegisterBa" +
      "ckgroundDeviceResponse\022`\n\005token\030\001 \001(\0132Q." +
      "POGOProtos.Networking.Responses.Register" +
      "BackgroundDeviceResponse.BackgroundToken" +
      "\032E\n\017BackgroundToken\022\r\n\005token\030\001 \001(\014\022\027\n\017ex" +
      "piration_time\030\002 \001(\003\022\n\n\002iv\030\003 \001(\014\"+\n\006Statu" +
      "s\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\t\n\005ERROR\020\002B\002P\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_BackgroundToken_descriptor =
      internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_BackgroundToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_RegisterBackgroundDeviceResponse_BackgroundToken_descriptor,
        new java.lang.String[] { "Token", "ExpirationTime", "Iv", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}