// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hardware/course_password.proto

package com.triclass.hardware;

public final class CoursePassword {
  private CoursePassword() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_triclass_hardware_Password_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_triclass_hardware_Password_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036hardware/course_password.proto\022\021tricla" +
      "ss.hardware\"1\n\010Password\022\020\n\010chairman\030\001 \001(" +
      "\t\022\023\n\013participant\030\002 \001(\tB.\n\025com.triclass.h" +
      "ardwareP\001Z\023./hardware;hardwareb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_triclass_hardware_Password_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_triclass_hardware_Password_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_triclass_hardware_Password_descriptor,
        new java.lang.String[] { "Chairman", "Participant", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
