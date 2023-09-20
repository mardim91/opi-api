// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface VirtioScsiTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.VirtioScsiTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * maximum LUNs within a target
   * </pre>
   *
   * <code>int32 max_luns = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The maxLuns.
   */
  int getMaxLuns();
}
