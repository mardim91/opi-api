// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

public interface LimitsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.Limits)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.QosLimit min = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the min field is set.
   */
  boolean hasMin();
  /**
   * <code>.opi_api.storage.v1.QosLimit min = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The min.
   */
  opi_api.storage.v1.QosLimit getMin();
  /**
   * <code>.opi_api.storage.v1.QosLimit min = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  opi_api.storage.v1.QosLimitOrBuilder getMinOrBuilder();

  /**
   * <code>.opi_api.storage.v1.QosLimit max = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the max field is set.
   */
  boolean hasMax();
  /**
   * <code>.opi_api.storage.v1.QosLimit max = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The max.
   */
  opi_api.storage.v1.QosLimit getMax();
  /**
   * <code>.opi_api.storage.v1.QosLimit max = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  opi_api.storage.v1.QosLimitOrBuilder getMaxOrBuilder();
}
