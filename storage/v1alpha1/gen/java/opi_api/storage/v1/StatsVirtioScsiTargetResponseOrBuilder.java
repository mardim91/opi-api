// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface StatsVirtioScsiTargetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.StatsVirtioScsiTargetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return The stats.
   */
  opi_api.storage.v1.VolumeStats getStats();
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   */
  opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder();
}
