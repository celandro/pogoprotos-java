// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/AppliedItems.proto

package POGOProtos.Inventory;

public final class AppliedItemsOuterClass {
  private AppliedItemsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Inventory_AppliedItems_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Inventory_AppliedItems_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'POGOProtos/Inventory/AppliedItems.prot" +
      "o\022\024POGOProtos.Inventory\032&POGOProtos/Inve" +
      "ntory/AppliedItem.proto\"?\n\014AppliedItems\022" +
      "/\n\004item\030\004 \003(\0132!.POGOProtos.Inventory.App" +
      "liedItemB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.AppliedItemOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Inventory_AppliedItems_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Inventory_AppliedItems_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Inventory_AppliedItems_descriptor,
        new java.lang.String[] { "Item", });
    POGOProtos.Inventory.AppliedItemOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
