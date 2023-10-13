// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

public final class FrontendVirtioBlkProto {
  private FrontendVirtioBlkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListVirtioBlksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListVirtioBlksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListVirtioBlksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListVirtioBlksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_StatsVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_StatsVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_StatsVirtioBlkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_StatsVirtioBlkResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031frontend_virtio_blk.proto\022\022opi_api.sto" +
      "rage.v1\032\017opicommon.proto\032\027google/api/cli" +
      "ent.proto\032\031google/api/resource.proto\032\033go" +
      "ogle/protobuf/empty.proto\032\034google/api/an" +
      "notations.proto\032\037google/api/field_behavi" +
      "or.proto\032 google/protobuf/field_mask.pro" +
      "to\"\313\002\n\tVirtioBlk\022\021\n\004name\030\001 \001(\tB\003\340A\010\0225\n\007p" +
      "cie_id\030\002 \001(\0132\037.opi_api.storage.v1.PciEnd" +
      "pointB\003\340A\002\022\034\n\017volume_name_ref\030\003 \001(\tB\003\340A\002" +
      "\022\027\n\nmax_io_qps\030\004 \001(\003B\003\340A\001\0224\n\tmin_limit\030\005" +
      " \001(\0132\034.opi_api.storage.v1.QosLimitB\003\340A\001\022" +
      "4\n\tmax_limit\030\006 \001(\0132\034.opi_api.storage.v1." +
      "QosLimitB\003\340A\001:Q\352AN\n storage.opiproject.o" +
      "rg/VirtioBlk\022\023virtioBlks/{volume}*\nvirti" +
      "oBlks2\tvirtioBlk\"l\n\026CreateVirtioBlkReque" +
      "st\0226\n\nvirtio_blk\030\001 \001(\0132\035.opi_api.storage" +
      ".v1.VirtioBlkB\003\340A\002\022\032\n\rvirtio_blk_id\030\002 \001(" +
      "\tB\003\340A\001\"h\n\026DeleteVirtioBlkRequest\0222\n\004name" +
      "\030\001 \001(\tB$\340A\002\372A\036\n\034opi_api.storage.v1/Virti" +
      "oBlk\022\032\n\rallow_missing\030\002 \001(\010B\003\340A\001\"\242\001\n\026Upd" +
      "ateVirtioBlkRequest\0226\n\nvirtio_blk\030\001 \001(\0132" +
      "\035.opi_api.storage.v1.VirtioBlkB\003\340A\002\0224\n\013u" +
      "pdate_mask\030\002 \001(\0132\032.google.protobuf.Field" +
      "MaskB\003\340A\001\022\032\n\rallow_missing\030\003 \001(\010B\003\340A\001\"~\n" +
      "\025ListVirtioBlksRequest\0224\n\006parent\030\001 \001(\tB$" +
      "\340A\002\372A\036\n\034opi_api.storage.v1/VirtioBlk\022\026\n\t" +
      "page_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\t" +
      "B\003\340A\001\"e\n\026ListVirtioBlksResponse\0222\n\013virti" +
      "o_blks\030\001 \003(\0132\035.opi_api.storage.v1.Virtio" +
      "Blk\022\027\n\017next_page_token\030\002 \001(\t\"I\n\023GetVirti" +
      "oBlkRequest\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034opi_a" +
      "pi.storage.v1/VirtioBlk\"K\n\025StatsVirtioBl" +
      "kRequest\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034opi_api." +
      "storage.v1/VirtioBlk\"H\n\026StatsVirtioBlkRe" +
      "sponse\022.\n\005stats\030\001 \001(\0132\037.opi_api.storage." +
      "v1.VolumeStats2\223\007\n\030FrontendVirtioBlkServ" +
      "ice\022\233\001\n\017CreateVirtioBlk\022*.opi_api.storag" +
      "e.v1.CreateVirtioBlkRequest\032\035.opi_api.st" +
      "orage.v1.VirtioBlk\"=\202\323\344\223\002\034\"\016/v1/virtioBl" +
      "ks:\nvirtio_blk\332A\030virtio_blk,virtio_blk_i" +
      "d\022}\n\017DeleteVirtioBlk\022*.opi_api.storage.v" +
      "1.DeleteVirtioBlkRequest\032\026.google.protob" +
      "uf.Empty\"&\202\323\344\223\002\031*\027/v1/{name=virtioBlks/*" +
      "}\332A\004name\022\255\001\n\017UpdateVirtioBlk\022*.opi_api.s" +
      "torage.v1.UpdateVirtioBlkRequest\032\035.opi_a" +
      "pi.storage.v1.VirtioBlk\"O\202\323\344\223\00202\"/v1/{vi" +
      "rtio_blk.name=virtioBlks/*}:\nvirtio_blk\332" +
      "A\026virtio_blk,update_mask\022\221\001\n\016ListVirtioB" +
      "lks\022).opi_api.storage.v1.ListVirtioBlksR" +
      "equest\032*.opi_api.storage.v1.ListVirtioBl" +
      "ksResponse\"(\202\323\344\223\002\031\022\027/v1/{parent=subsyste" +
      "ms}\332A\006parent\022~\n\014GetVirtioBlk\022\'.opi_api.s" +
      "torage.v1.GetVirtioBlkRequest\032\035.opi_api." +
      "storage.v1.VirtioBlk\"&\202\323\344\223\002\031\022\027/v1/{name=" +
      "virtioBlks/*}\332A\004name\022\225\001\n\016StatsVirtioBlk\022" +
      ").opi_api.storage.v1.StatsVirtioBlkReque" +
      "st\032*.opi_api.storage.v1.StatsVirtioBlkRe" +
      "sponse\",\202\323\344\223\002\037\022\035/v1/{name=virtioBlks/*}:" +
      "stats\332A\004nameBe\n\022opi_api.storage.v1B\026Fron" +
      "tendVirtioBlkProtoP\001Z5github.com/opiproj" +
      "ect/opi-api/storage/v1alpha1/gen/gob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_VirtioBlk_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_VirtioBlk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlk_descriptor,
        new java.lang.String[] { "Name", "PcieId", "VolumeNameRef", "MaxIoQps", "MinLimit", "MaxLimit", });
    internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor,
        new java.lang.String[] { "VirtioBlk", "VirtioBlkId", });
    internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_descriptor,
        new java.lang.String[] { "VirtioBlk", "UpdateMask", "AllowMissing", });
    internal_static_opi_api_storage_v1_ListVirtioBlksRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListVirtioBlksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListVirtioBlksRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListVirtioBlksResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListVirtioBlksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListVirtioBlksResponse_descriptor,
        new java.lang.String[] { "VirtioBlks", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetVirtioBlkRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_StatsVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_StatsVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_StatsVirtioBlkRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_StatsVirtioBlkResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_StatsVirtioBlkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_StatsVirtioBlkResponse_descriptor,
        new java.lang.String[] { "Stats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
