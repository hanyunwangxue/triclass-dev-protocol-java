// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hardware/course_terminate.proto

package com.triclass.hardware;

public final class CourseTerminate {
  private CourseTerminate() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_triclass_hardware_Terminate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_triclass_hardware_Terminate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037hardware/course_terminate.proto\022\021tricl" +
      "ass.hardware\"\027\n\tTerminate\022\n\n\002id\030\001 \001(\tB.\n" +
      "\025com.triclass.hardwareP\001Z\023./hardware;har" +
      "dwareb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_triclass_hardware_Terminate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_triclass_hardware_Terminate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_triclass_hardware_Terminate_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
