// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NvmeNamespaceStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeNamespaceStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * config state of the namespace object, (enabled, disable, deleting)
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespacePciState pci_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for pciState.
   */
  int getPciStateValue();
  /**
   * <pre>
   * config state of the namespace object, (enabled, disable, deleting)
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespacePciState pci_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pciState.
   */
  opi_api.storage.v1.NvmeNamespacePciState getPciState();

  /**
   * <pre>
   * Operational state of the namespace object, (connected, disconnected)
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespacePciOperState pci_oper_state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for pciOperState.
   */
  int getPciOperStateValue();
  /**
   * <pre>
   * Operational state of the namespace object, (connected, disconnected)
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespacePciOperState pci_oper_state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pciOperState.
   */
  opi_api.storage.v1.NvmeNamespacePciOperState getPciOperState();
}
