// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Platform/Requests/AcknowledgeWarningsMessage.proto

package POGOProtos.Networking.Requests.Platform.Requests;

public final class AcknowledgeWarningsMessageOuterClass {
  private AcknowledgeWarningsMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Platform_Requests_AcknowledgeWarningsMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Platform_Requests_AcknowledgeWarningsMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nQPOGOProtos/Networking/Requests/Platfor" +
      "m/Requests/AcknowledgeWarningsMessage.pr" +
      "oto\0220POGOProtos.Networking.Requests.Plat" +
      "form.Requests\032*POGOProtos/Enums/Platform" +
      "WarningType.proto\"T\n\032AcknowledgeWarnings" +
      "Message\0226\n\007warning\030\001 \003(\0162%.POGOProtos.En" +
      "ums.PlatformWarningTypeB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.PlatformWarningTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Platform_Requests_AcknowledgeWarningsMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Platform_Requests_AcknowledgeWarningsMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Platform_Requests_AcknowledgeWarningsMessage_descriptor,
        new java.lang.String[] { "Warning", });
    POGOProtos.Enums.PlatformWarningTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}