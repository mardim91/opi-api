# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_nvme.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import opicommon_pb2 as opicommon__pb2
import uuid_pb2 as uuid__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x13\x66rontend_nvme.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\nuuid.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\x80\x02\n\rNvmeSubsystem\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08\x12\x38\n\x04spec\x18\x02 \x01(\x0b\x32%.opi_api.storage.v1.NvmeSubsystemSpecB\x03\xe0\x41\x02\x12<\n\x06status\x18\x03 \x01(\x0b\x32\'.opi_api.storage.v1.NvmeSubsystemStatusB\x03\xe0\x41\x03:d\xea\x41\x61\n$storage.opiproject.org/NvmeSubsystem\x12\x1anvmeSubsystems/{subsystem}*\x0envmeSubsystems2\rnvmeSubsystem\"\xa1\x01\n\x11NvmeSubsystemSpec\x12\x10\n\x03nqn\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\rserial_number\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x19\n\x0cmodel_number\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x1b\n\x0emax_namespaces\x18\x04 \x01(\x03\x42\x03\xe0\x41\x01\x12\x14\n\x07hostnqn\x18\x05 \x01(\tB\x03\xe0\x41\x01\x12\x10\n\x03psk\x18\x06 \x01(\x0c\x42\x03\xe0\x41\x01\"L\n\x13NvmeSubsystemStatus\x12\x1e\n\x11\x66irmware_revision\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x15\n\x08\x66ru_guid\x18\x02 \x01(\x0c\x42\x03\xe0\x41\x03\"\xa5\x02\n\x0eNvmeController\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08\x12\x39\n\x04spec\x18\x02 \x01(\x0b\x32&.opi_api.storage.v1.NvmeControllerSpecB\x03\xe0\x41\x02\x12=\n\x06status\x18\x03 \x01(\x0b\x32(.opi_api.storage.v1.NvmeControllerStatusB\x03\xe0\x41\x03:\x85\x01\xea\x41\x81\x01\n%storage.opiproject.org/NvmeController\x12\x37nvmeSubsystems/{subsystem}/nvmeControllers/{controller}*\x0fnvmeControllers2\x0envmeController\"\xed\x03\n\x12NvmeControllerSpec\x12$\n\x12nvme_controller_id\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01H\x01\x88\x01\x01\x12:\n\x06trtype\x18\x02 \x01(\x0e\x32%.opi_api.storage.v1.NvmeTransportTypeB\x03\xe0\x41\x02\x12\x37\n\x07pcie_id\x18\x03 \x01(\x0b\x32\x1f.opi_api.storage.v1.PciEndpointB\x03\xe0\x41\x01H\x00\x12>\n\nfabrics_id\x18\x04 \x01(\x0b\x32#.opi_api.storage.v1.FabricsEndpointB\x03\xe0\x41\x01H\x00\x12\x14\n\x07max_nsq\x18\x05 \x01(\x05\x42\x03\xe0\x41\x01\x12\x14\n\x07max_ncq\x18\x06 \x01(\x05\x42\x03\xe0\x41\x01\x12\x11\n\x04sqes\x18\x07 \x01(\x05\x42\x03\xe0\x41\x01\x12\x11\n\x04\x63qes\x18\x08 \x01(\x05\x42\x03\xe0\x41\x01\x12\x1b\n\x0emax_namespaces\x18\t \x01(\x05\x42\x03\xe0\x41\x01\x12\x34\n\tmin_limit\x18\n \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimitB\x03\xe0\x41\x01\x12\x34\n\tmax_limit\x18\x0b \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimitB\x03\xe0\x41\x01\x42\n\n\x08\x65ndpointB\x15\n\x13_nvme_controller_id\"+\n\x14NvmeControllerStatus\x12\x13\n\x06\x61\x63tive\x18\x01 \x01(\x08\x42\x03\xe0\x41\x03\"\x9b\x02\n\rNvmeNamespace\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08\x12\x38\n\x04spec\x18\x02 \x01(\x0b\x32%.opi_api.storage.v1.NvmeNamespaceSpecB\x03\xe0\x41\x02\x12<\n\x06status\x18\x03 \x01(\x0b\x32\'.opi_api.storage.v1.NvmeNamespaceStatusB\x03\xe0\x41\x03:\x7f\xea\x41|\n$storage.opiproject.org/NvmeNamespace\x12\x35nvmeSubsystems/{subsystem}/nvmeNamespaces/{namespace}*\x0envmeNamespaces2\rnvmeNamespace\"\x9d\x01\n\x11NvmeNamespaceSpec\x12\x16\n\thost_nsid\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x12\n\x05nguid\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x12\n\x05\x65ui64\x18\x04 \x01(\x03\x42\x03\xe0\x41\x01\x12*\n\x04uuid\x18\x05 \x01(\x0b\x32\x17.opi_api.common.v1.UuidB\x03\xe0\x41\x01\x12\x1c\n\x0fvolume_name_ref\x18\x06 \x01(\tB\x03\xe0\x41\x02\"\xd7\x02\n\x13NvmeNamespaceStatus\x12\x41\n\x05state\x18\x01 \x01(\x0e\x32-.opi_api.storage.v1.NvmeNamespaceStatus.StateB\x03\xe0\x41\x03\x12J\n\noper_state\x18\x02 \x01(\x0e\x32\x31.opi_api.storage.v1.NvmeNamespaceStatus.OperStateB\x03\xe0\x41\x03\"Y\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x12\n\x0eSTATE_DISABLED\x10\x01\x12\x11\n\rSTATE_ENABLED\x10\x02\x12\x12\n\x0eSTATE_DELETING\x10\x03\"V\n\tOperState\x12\x1a\n\x16OPER_STATE_UNSPECIFIED\x10\x00\x12\x15\n\x11OPER_STATE_ONLINE\x10\x01\x12\x16\n\x12OPER_STATE_OFFLINE\x10\x02\"|\n\x1a\x43reateNvmeSubsystemRequest\x12>\n\x0envme_subsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NvmeSubsystemB\x03\xe0\x41\x02\x12\x1e\n\x11nvme_subsystem_id\x18\x02 \x01(\tB\x03\xe0\x41\x01\"p\n\x1a\x44\x65leteNvmeSubsystemRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xae\x01\n\x1aUpdateNvmeSubsystemRequest\x12>\n\x0envme_subsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NvmeSubsystemB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"L\n\x19ListNvmeSubsystemsRequest\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"q\n\x1aListNvmeSubsystemsResponse\x12:\n\x0fnvme_subsystems\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NvmeSubsystem\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"Q\n\x17GetNvmeSubsystemRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\"S\n\x19StatsNvmeSubsystemRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\"L\n\x1aStatsNvmeSubsystemResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats\"\xba\x01\n\x1b\x43reateNvmeControllerRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\x12@\n\x0fnvme_controller\x18\x02 \x01(\x0b\x32\".opi_api.storage.v1.NvmeControllerB\x03\xe0\x41\x02\x12\x1f\n\x12nvme_controller_id\x18\x03 \x01(\tB\x03\xe0\x41\x01\"r\n\x1b\x44\x65leteNvmeControllerRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!opi_api.storage.v1/NvmeController\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xb1\x01\n\x1bUpdateNvmeControllerRequest\x12@\n\x0fnvme_controller\x18\x01 \x01(\x0b\x32\".opi_api.storage.v1.NvmeControllerB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\x88\x01\n\x1aListNvmeControllersRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!opi_api.storage.v1/NvmeController\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"t\n\x1bListNvmeControllersResponse\x12<\n\x10nvme_controllers\x18\x01 \x03(\x0b\x32\".opi_api.storage.v1.NvmeController\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"S\n\x18GetNvmeControllerRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!opi_api.storage.v1/NvmeController\"U\n\x1aStatsNvmeControllerRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!opi_api.storage.v1/NvmeController\"M\n\x1bStatsNvmeControllerResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats\"\xb6\x01\n\x1a\x43reateNvmeNamespaceRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\x12>\n\x0envme_namespace\x18\x02 \x01(\x0b\x32!.opi_api.storage.v1.NvmeNamespaceB\x03\xe0\x41\x02\x12\x1e\n\x11nvme_namespace_id\x18\x03 \x01(\tB\x03\xe0\x41\x01\"p\n\x1a\x44\x65leteNvmeNamespaceRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeNamespace\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xae\x01\n\x1aUpdateNvmeNamespaceRequest\x12>\n\x0envme_namespace\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NvmeNamespaceB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\x86\x01\n\x19ListNvmeNamespacesRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeNamespace\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"q\n\x1aListNvmeNamespacesResponse\x12:\n\x0fnvme_namespaces\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NvmeNamespace\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"Q\n\x17GetNvmeNamespaceRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeNamespace\"S\n\x19StatsNvmeNamespaceRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeNamespace\"L\n\x1aStatsNvmeNamespaceResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats2\xd9\x19\n\x13\x46rontendNvmeService\x12\xb7\x01\n\x13\x43reateNvmeSubsystem\x12..opi_api.storage.v1.CreateNvmeSubsystemRequest\x1a!.opi_api.storage.v1.NvmeSubsystem\"M\x82\xd3\xe4\x93\x02$\"\x12/v1/nvmeSubsystems:\x0envme_subsystem\xda\x41 nvme_subsystem,nvme_subsystem_id\x12\x89\x01\n\x13\x44\x65leteNvmeSubsystem\x12..opi_api.storage.v1.DeleteNvmeSubsystemRequest\x1a\x16.google.protobuf.Empty\"*\x82\xd3\xe4\x93\x02\x1d*\x1b/v1/{name=nvmeSubsystems/*}\xda\x41\x04name\x12\xc9\x01\n\x13UpdateNvmeSubsystem\x12..opi_api.storage.v1.UpdateNvmeSubsystemRequest\x1a!.opi_api.storage.v1.NvmeSubsystem\"_\x82\xd3\xe4\x93\x02<2*/v1/{nvme_subsystem.name=nvmeSubsystems/*}:\x0envme_subsystem\xda\x41\x1anvme_subsystem,update_mask\x12\x8f\x01\n\x12ListNvmeSubsystems\x12-.opi_api.storage.v1.ListNvmeSubsystemsRequest\x1a..opi_api.storage.v1.ListNvmeSubsystemsResponse\"\x1a\x82\xd3\xe4\x93\x02\x14\x12\x12/v1/nvmeSubsystems\x12\x8e\x01\n\x10GetNvmeSubsystem\x12+.opi_api.storage.v1.GetNvmeSubsystemRequest\x1a!.opi_api.storage.v1.NvmeSubsystem\"*\x82\xd3\xe4\x93\x02\x1d\x12\x1b/v1/{name=nvmeSubsystems/*}\xda\x41\x04name\x12\xa5\x01\n\x12StatsNvmeSubsystem\x12-.opi_api.storage.v1.StatsNvmeSubsystemRequest\x1a..opi_api.storage.v1.StatsNvmeSubsystemResponse\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=nvmeSubsystems/*}:stats\xda\x41\x04name\x12\xdf\x01\n\x14\x43reateNvmeController\x12/.opi_api.storage.v1.CreateNvmeControllerRequest\x1a\".opi_api.storage.v1.NvmeController\"r\x82\xd3\xe4\x93\x02@\"-/v1/{parent=nvmeSubsystems/*}/nvmeControllers:\x0fnvme_controller\xda\x41)parent,nvme_controller,nvme_controller_id\x12\x9d\x01\n\x14\x44\x65leteNvmeController\x12/.opi_api.storage.v1.DeleteNvmeControllerRequest\x1a\x16.google.protobuf.Empty\"<\x82\xd3\xe4\x93\x02/*-/v1/{name=nvmeSubsystems/*/nvmeControllers/*}\xda\x41\x04name\x12\xe1\x01\n\x14UpdateNvmeController\x12/.opi_api.storage.v1.UpdateNvmeControllerRequest\x1a\".opi_api.storage.v1.NvmeController\"t\x82\xd3\xe4\x93\x02P2=/v1/{nvme_controller.name=nvmeSubsystems/*/nvmeControllers/*}:\x0fnvme_controller\xda\x41\x1bnvme_controller,update_mask\x12\xb6\x01\n\x13ListNvmeControllers\x12..opi_api.storage.v1.ListNvmeControllersRequest\x1a/.opi_api.storage.v1.ListNvmeControllersResponse\">\x82\xd3\xe4\x93\x02/\x12-/v1/{parent=nvmeSubsystems/*}/nvmeControllers\xda\x41\x06parent\x12\xa3\x01\n\x11GetNvmeController\x12,.opi_api.storage.v1.GetNvmeControllerRequest\x1a\".opi_api.storage.v1.NvmeController\"<\x82\xd3\xe4\x93\x02/\x12-/v1/{name=nvmeSubsystems/*/nvmeControllers/*}\xda\x41\x04name\x12\xba\x01\n\x13StatsNvmeController\x12..opi_api.storage.v1.StatsNvmeControllerRequest\x1a/.opi_api.storage.v1.StatsNvmeControllerResponse\"B\x82\xd3\xe4\x93\x02\x35\x12\x33/v1/{name=nvmeSubsystems/*/nvmeControllers/*}:stats\xda\x41\x04name\x12\xd8\x01\n\x13\x43reateNvmeNamespace\x12..opi_api.storage.v1.CreateNvmeNamespaceRequest\x1a!.opi_api.storage.v1.NvmeNamespace\"n\x82\xd3\xe4\x93\x02>\",/v1/{parent=nvmeSubsystems/*}/nvmeNamespaces:\x0envme_namespace\xda\x41\'parent,nvme_namespace,nvme_namespace_id\x12\x9a\x01\n\x13\x44\x65leteNvmeNamespace\x12..opi_api.storage.v1.DeleteNvmeNamespaceRequest\x1a\x16.google.protobuf.Empty\";\x82\xd3\xe4\x93\x02.*,/v1/{name=nvmeSubsystems/*/nvmeNamespaces/*}\xda\x41\x04name\x12\xda\x01\n\x13UpdateNvmeNamespace\x12..opi_api.storage.v1.UpdateNvmeNamespaceRequest\x1a!.opi_api.storage.v1.NvmeNamespace\"p\x82\xd3\xe4\x93\x02M2;/v1/{nvme_namespace.name=nvmeSubsystems/*/nvmeNamespaces/*}:\x0envme_namespace\xda\x41\x1anvme_namespace,update_mask\x12\xb2\x01\n\x12ListNvmeNamespaces\x12-.opi_api.storage.v1.ListNvmeNamespacesRequest\x1a..opi_api.storage.v1.ListNvmeNamespacesResponse\"=\x82\xd3\xe4\x93\x02.\x12,/v1/{parent=nvmeSubsystems/*}/nvmeNamespaces\xda\x41\x06parent\x12\x9f\x01\n\x10GetNvmeNamespace\x12+.opi_api.storage.v1.GetNvmeNamespaceRequest\x1a!.opi_api.storage.v1.NvmeNamespace\";\x82\xd3\xe4\x93\x02.\x12,/v1/{name=nvmeSubsystems/*/nvmeNamespaces/*}\xda\x41\x04name\x12\xb6\x01\n\x12StatsNvmeNamespace\x12-.opi_api.storage.v1.StatsNvmeNamespaceRequest\x1a..opi_api.storage.v1.StatsNvmeNamespaceResponse\"A\x82\xd3\xe4\x93\x02\x34\x12\x32/v1/{name=nvmeSubsystems/*/nvmeNamespaces/*}:stats\xda\x41\x04nameB`\n\x12opi_api.storage.v1B\x11\x46rontendNvmeProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'frontend_nvme_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\021FrontendNvmeProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _NVMESUBSYSTEM.fields_by_name['name']._options = None
  _NVMESUBSYSTEM.fields_by_name['name']._serialized_options = b'\340A\010'
  _NVMESUBSYSTEM.fields_by_name['spec']._options = None
  _NVMESUBSYSTEM.fields_by_name['spec']._serialized_options = b'\340A\002'
  _NVMESUBSYSTEM.fields_by_name['status']._options = None
  _NVMESUBSYSTEM.fields_by_name['status']._serialized_options = b'\340A\003'
  _NVMESUBSYSTEM._options = None
  _NVMESUBSYSTEM._serialized_options = b'\352Aa\n$storage.opiproject.org/NvmeSubsystem\022\032nvmeSubsystems/{subsystem}*\016nvmeSubsystems2\rnvmeSubsystem'
  _NVMESUBSYSTEMSPEC.fields_by_name['nqn']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['nqn']._serialized_options = b'\340A\002'
  _NVMESUBSYSTEMSPEC.fields_by_name['serial_number']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['serial_number']._serialized_options = b'\340A\001'
  _NVMESUBSYSTEMSPEC.fields_by_name['model_number']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['model_number']._serialized_options = b'\340A\001'
  _NVMESUBSYSTEMSPEC.fields_by_name['max_namespaces']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['max_namespaces']._serialized_options = b'\340A\001'
  _NVMESUBSYSTEMSPEC.fields_by_name['hostnqn']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['hostnqn']._serialized_options = b'\340A\001'
  _NVMESUBSYSTEMSPEC.fields_by_name['psk']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['psk']._serialized_options = b'\340A\001'
  _NVMESUBSYSTEMSTATUS.fields_by_name['firmware_revision']._options = None
  _NVMESUBSYSTEMSTATUS.fields_by_name['firmware_revision']._serialized_options = b'\340A\003'
  _NVMESUBSYSTEMSTATUS.fields_by_name['fru_guid']._options = None
  _NVMESUBSYSTEMSTATUS.fields_by_name['fru_guid']._serialized_options = b'\340A\003'
  _NVMECONTROLLER.fields_by_name['name']._options = None
  _NVMECONTROLLER.fields_by_name['name']._serialized_options = b'\340A\010'
  _NVMECONTROLLER.fields_by_name['spec']._options = None
  _NVMECONTROLLER.fields_by_name['spec']._serialized_options = b'\340A\002'
  _NVMECONTROLLER.fields_by_name['status']._options = None
  _NVMECONTROLLER.fields_by_name['status']._serialized_options = b'\340A\003'
  _NVMECONTROLLER._options = None
  _NVMECONTROLLER._serialized_options = b'\352A\201\001\n%storage.opiproject.org/NvmeController\0227nvmeSubsystems/{subsystem}/nvmeControllers/{controller}*\017nvmeControllers2\016nvmeController'
  _NVMECONTROLLERSPEC.fields_by_name['nvme_controller_id']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['nvme_controller_id']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['trtype']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['trtype']._serialized_options = b'\340A\002'
  _NVMECONTROLLERSPEC.fields_by_name['pcie_id']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['pcie_id']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['fabrics_id']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['fabrics_id']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['max_nsq']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['max_nsq']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['max_ncq']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['max_ncq']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['sqes']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['sqes']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['cqes']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['cqes']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['max_namespaces']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['max_namespaces']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['min_limit']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['min_limit']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['max_limit']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['max_limit']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSTATUS.fields_by_name['active']._options = None
  _NVMECONTROLLERSTATUS.fields_by_name['active']._serialized_options = b'\340A\003'
  _NVMENAMESPACE.fields_by_name['name']._options = None
  _NVMENAMESPACE.fields_by_name['name']._serialized_options = b'\340A\010'
  _NVMENAMESPACE.fields_by_name['spec']._options = None
  _NVMENAMESPACE.fields_by_name['spec']._serialized_options = b'\340A\002'
  _NVMENAMESPACE.fields_by_name['status']._options = None
  _NVMENAMESPACE.fields_by_name['status']._serialized_options = b'\340A\003'
  _NVMENAMESPACE._options = None
  _NVMENAMESPACE._serialized_options = b'\352A|\n$storage.opiproject.org/NvmeNamespace\0225nvmeSubsystems/{subsystem}/nvmeNamespaces/{namespace}*\016nvmeNamespaces2\rnvmeNamespace'
  _NVMENAMESPACESPEC.fields_by_name['host_nsid']._options = None
  _NVMENAMESPACESPEC.fields_by_name['host_nsid']._serialized_options = b'\340A\001'
  _NVMENAMESPACESPEC.fields_by_name['nguid']._options = None
  _NVMENAMESPACESPEC.fields_by_name['nguid']._serialized_options = b'\340A\001'
  _NVMENAMESPACESPEC.fields_by_name['eui64']._options = None
  _NVMENAMESPACESPEC.fields_by_name['eui64']._serialized_options = b'\340A\001'
  _NVMENAMESPACESPEC.fields_by_name['uuid']._options = None
  _NVMENAMESPACESPEC.fields_by_name['uuid']._serialized_options = b'\340A\001'
  _NVMENAMESPACESPEC.fields_by_name['volume_name_ref']._options = None
  _NVMENAMESPACESPEC.fields_by_name['volume_name_ref']._serialized_options = b'\340A\002'
  _NVMENAMESPACESTATUS.fields_by_name['state']._options = None
  _NVMENAMESPACESTATUS.fields_by_name['state']._serialized_options = b'\340A\003'
  _NVMENAMESPACESTATUS.fields_by_name['oper_state']._options = None
  _NVMENAMESPACESTATUS.fields_by_name['oper_state']._serialized_options = b'\340A\003'
  _CREATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem']._options = None
  _CREATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem']._serialized_options = b'\340A\002'
  _CREATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem_id']._options = None
  _CREATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem_id']._serialized_options = b'\340A\001'
  _DELETENVMESUBSYSTEMREQUEST.fields_by_name['name']._options = None
  _DELETENVMESUBSYSTEMREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _DELETENVMESUBSYSTEMREQUEST.fields_by_name['allow_missing']._options = None
  _DELETENVMESUBSYSTEMREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem']._options = None
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem']._serialized_options = b'\340A\002'
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['update_mask']._options = None
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['page_size']._options = None
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['page_token']._options = None
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETNVMESUBSYSTEMREQUEST.fields_by_name['name']._options = None
  _GETNVMESUBSYSTEMREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _STATSNVMESUBSYSTEMREQUEST.fields_by_name['name']._options = None
  _STATSNVMESUBSYSTEMREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _CREATENVMECONTROLLERREQUEST.fields_by_name['parent']._options = None
  _CREATENVMECONTROLLERREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _CREATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller']._options = None
  _CREATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller']._serialized_options = b'\340A\002'
  _CREATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller_id']._options = None
  _CREATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller_id']._serialized_options = b'\340A\001'
  _DELETENVMECONTROLLERREQUEST.fields_by_name['name']._options = None
  _DELETENVMECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!opi_api.storage.v1/NvmeController'
  _DELETENVMECONTROLLERREQUEST.fields_by_name['allow_missing']._options = None
  _DELETENVMECONTROLLERREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller']._options = None
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller']._serialized_options = b'\340A\002'
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['update_mask']._options = None
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['parent']._options = None
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!opi_api.storage.v1/NvmeController'
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['page_size']._options = None
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['page_token']._options = None
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETNVMECONTROLLERREQUEST.fields_by_name['name']._options = None
  _GETNVMECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!opi_api.storage.v1/NvmeController'
  _STATSNVMECONTROLLERREQUEST.fields_by_name['name']._options = None
  _STATSNVMECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!opi_api.storage.v1/NvmeController'
  _CREATENVMENAMESPACEREQUEST.fields_by_name['parent']._options = None
  _CREATENVMENAMESPACEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _CREATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace']._options = None
  _CREATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace']._serialized_options = b'\340A\002'
  _CREATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace_id']._options = None
  _CREATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace_id']._serialized_options = b'\340A\001'
  _DELETENVMENAMESPACEREQUEST.fields_by_name['name']._options = None
  _DELETENVMENAMESPACEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeNamespace'
  _DELETENVMENAMESPACEREQUEST.fields_by_name['allow_missing']._options = None
  _DELETENVMENAMESPACEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace']._options = None
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace']._serialized_options = b'\340A\002'
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _LISTNVMENAMESPACESREQUEST.fields_by_name['parent']._options = None
  _LISTNVMENAMESPACESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeNamespace'
  _LISTNVMENAMESPACESREQUEST.fields_by_name['page_size']._options = None
  _LISTNVMENAMESPACESREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTNVMENAMESPACESREQUEST.fields_by_name['page_token']._options = None
  _LISTNVMENAMESPACESREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETNVMENAMESPACEREQUEST.fields_by_name['name']._options = None
  _GETNVMENAMESPACEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeNamespace'
  _STATSNVMENAMESPACEREQUEST.fields_by_name['name']._options = None
  _STATSNVMENAMESPACEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeNamespace'
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeSubsystem']._serialized_options = b'\202\323\344\223\002$\"\022/v1/nvmeSubsystems:\016nvme_subsystem\332A nvme_subsystem,nvme_subsystem_id'
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeSubsystem']._serialized_options = b'\202\323\344\223\002\035*\033/v1/{name=nvmeSubsystems/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeSubsystem']._serialized_options = b'\202\323\344\223\002<2*/v1/{nvme_subsystem.name=nvmeSubsystems/*}:\016nvme_subsystem\332A\032nvme_subsystem,update_mask'
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeSubsystems']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeSubsystems']._serialized_options = b'\202\323\344\223\002\024\022\022/v1/nvmeSubsystems'
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeSubsystem']._serialized_options = b'\202\323\344\223\002\035\022\033/v1/{name=nvmeSubsystems/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeSubsystem']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=nvmeSubsystems/*}:stats\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeController']._serialized_options = b'\202\323\344\223\002@\"-/v1/{parent=nvmeSubsystems/*}/nvmeControllers:\017nvme_controller\332A)parent,nvme_controller,nvme_controller_id'
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeController']._serialized_options = b'\202\323\344\223\002/*-/v1/{name=nvmeSubsystems/*/nvmeControllers/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeController']._serialized_options = b'\202\323\344\223\002P2=/v1/{nvme_controller.name=nvmeSubsystems/*/nvmeControllers/*}:\017nvme_controller\332A\033nvme_controller,update_mask'
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeControllers']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeControllers']._serialized_options = b'\202\323\344\223\002/\022-/v1/{parent=nvmeSubsystems/*}/nvmeControllers\332A\006parent'
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeController']._serialized_options = b'\202\323\344\223\002/\022-/v1/{name=nvmeSubsystems/*/nvmeControllers/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeController']._serialized_options = b'\202\323\344\223\0025\0223/v1/{name=nvmeSubsystems/*/nvmeControllers/*}:stats\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeNamespace']._serialized_options = b'\202\323\344\223\002>\",/v1/{parent=nvmeSubsystems/*}/nvmeNamespaces:\016nvme_namespace\332A\'parent,nvme_namespace,nvme_namespace_id'
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeNamespace']._serialized_options = b'\202\323\344\223\002.*,/v1/{name=nvmeSubsystems/*/nvmeNamespaces/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeNamespace']._serialized_options = b'\202\323\344\223\002M2;/v1/{nvme_namespace.name=nvmeSubsystems/*/nvmeNamespaces/*}:\016nvme_namespace\332A\032nvme_namespace,update_mask'
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeNamespaces']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeNamespaces']._serialized_options = b'\202\323\344\223\002.\022,/v1/{parent=nvmeSubsystems/*}/nvmeNamespaces\332A\006parent'
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeNamespace']._serialized_options = b'\202\323\344\223\002.\022,/v1/{name=nvmeSubsystems/*/nvmeNamespaces/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeNamespace']._serialized_options = b'\202\323\344\223\0024\0222/v1/{name=nvmeSubsystems/*/nvmeNamespaces/*}:stats\332A\004name'
  _NVMESUBSYSTEM._serialized_start=251
  _NVMESUBSYSTEM._serialized_end=507
  _NVMESUBSYSTEMSPEC._serialized_start=510
  _NVMESUBSYSTEMSPEC._serialized_end=671
  _NVMESUBSYSTEMSTATUS._serialized_start=673
  _NVMESUBSYSTEMSTATUS._serialized_end=749
  _NVMECONTROLLER._serialized_start=752
  _NVMECONTROLLER._serialized_end=1045
  _NVMECONTROLLERSPEC._serialized_start=1048
  _NVMECONTROLLERSPEC._serialized_end=1541
  _NVMECONTROLLERSTATUS._serialized_start=1543
  _NVMECONTROLLERSTATUS._serialized_end=1586
  _NVMENAMESPACE._serialized_start=1589
  _NVMENAMESPACE._serialized_end=1872
  _NVMENAMESPACESPEC._serialized_start=1875
  _NVMENAMESPACESPEC._serialized_end=2032
  _NVMENAMESPACESTATUS._serialized_start=2035
  _NVMENAMESPACESTATUS._serialized_end=2378
  _NVMENAMESPACESTATUS_STATE._serialized_start=2201
  _NVMENAMESPACESTATUS_STATE._serialized_end=2290
  _NVMENAMESPACESTATUS_OPERSTATE._serialized_start=2292
  _NVMENAMESPACESTATUS_OPERSTATE._serialized_end=2378
  _CREATENVMESUBSYSTEMREQUEST._serialized_start=2380
  _CREATENVMESUBSYSTEMREQUEST._serialized_end=2504
  _DELETENVMESUBSYSTEMREQUEST._serialized_start=2506
  _DELETENVMESUBSYSTEMREQUEST._serialized_end=2618
  _UPDATENVMESUBSYSTEMREQUEST._serialized_start=2621
  _UPDATENVMESUBSYSTEMREQUEST._serialized_end=2795
  _LISTNVMESUBSYSTEMSREQUEST._serialized_start=2797
  _LISTNVMESUBSYSTEMSREQUEST._serialized_end=2873
  _LISTNVMESUBSYSTEMSRESPONSE._serialized_start=2875
  _LISTNVMESUBSYSTEMSRESPONSE._serialized_end=2988
  _GETNVMESUBSYSTEMREQUEST._serialized_start=2990
  _GETNVMESUBSYSTEMREQUEST._serialized_end=3071
  _STATSNVMESUBSYSTEMREQUEST._serialized_start=3073
  _STATSNVMESUBSYSTEMREQUEST._serialized_end=3156
  _STATSNVMESUBSYSTEMRESPONSE._serialized_start=3158
  _STATSNVMESUBSYSTEMRESPONSE._serialized_end=3234
  _CREATENVMECONTROLLERREQUEST._serialized_start=3237
  _CREATENVMECONTROLLERREQUEST._serialized_end=3423
  _DELETENVMECONTROLLERREQUEST._serialized_start=3425
  _DELETENVMECONTROLLERREQUEST._serialized_end=3539
  _UPDATENVMECONTROLLERREQUEST._serialized_start=3542
  _UPDATENVMECONTROLLERREQUEST._serialized_end=3719
  _LISTNVMECONTROLLERSREQUEST._serialized_start=3722
  _LISTNVMECONTROLLERSREQUEST._serialized_end=3858
  _LISTNVMECONTROLLERSRESPONSE._serialized_start=3860
  _LISTNVMECONTROLLERSRESPONSE._serialized_end=3976
  _GETNVMECONTROLLERREQUEST._serialized_start=3978
  _GETNVMECONTROLLERREQUEST._serialized_end=4061
  _STATSNVMECONTROLLERREQUEST._serialized_start=4063
  _STATSNVMECONTROLLERREQUEST._serialized_end=4148
  _STATSNVMECONTROLLERRESPONSE._serialized_start=4150
  _STATSNVMECONTROLLERRESPONSE._serialized_end=4227
  _CREATENVMENAMESPACEREQUEST._serialized_start=4230
  _CREATENVMENAMESPACEREQUEST._serialized_end=4412
  _DELETENVMENAMESPACEREQUEST._serialized_start=4414
  _DELETENVMENAMESPACEREQUEST._serialized_end=4526
  _UPDATENVMENAMESPACEREQUEST._serialized_start=4529
  _UPDATENVMENAMESPACEREQUEST._serialized_end=4703
  _LISTNVMENAMESPACESREQUEST._serialized_start=4706
  _LISTNVMENAMESPACESREQUEST._serialized_end=4840
  _LISTNVMENAMESPACESRESPONSE._serialized_start=4842
  _LISTNVMENAMESPACESRESPONSE._serialized_end=4955
  _GETNVMENAMESPACEREQUEST._serialized_start=4957
  _GETNVMENAMESPACEREQUEST._serialized_end=5038
  _STATSNVMENAMESPACEREQUEST._serialized_start=5040
  _STATSNVMENAMESPACEREQUEST._serialized_end=5123
  _STATSNVMENAMESPACERESPONSE._serialized_start=5125
  _STATSNVMENAMESPACERESPONSE._serialized_end=5201
  _FRONTENDNVMESERVICE._serialized_start=5204
  _FRONTENDNVMESERVICE._serialized_end=8493
# @@protoc_insertion_point(module_scope)
