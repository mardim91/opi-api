// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a response to list all Nvme Remote Controllers.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.ListNvmeRemoteControllersResponse}
 */
public final class ListNvmeRemoteControllersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListNvmeRemoteControllersResponse)
    ListNvmeRemoteControllersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNvmeRemoteControllersResponse.newBuilder() to construct.
  private ListNvmeRemoteControllersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNvmeRemoteControllersResponse() {
    nvmeRemoteControllers_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNvmeRemoteControllersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNvmeRemoteControllersResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              nvmeRemoteControllers_ = new java.util.ArrayList<opi_api.storage.v1.NvmeRemoteController>();
              mutable_bitField0_ |= 0x00000001;
            }
            nvmeRemoteControllers_.add(
                input.readMessage(opi_api.storage.v1.NvmeRemoteController.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        nvmeRemoteControllers_ = java.util.Collections.unmodifiableList(nvmeRemoteControllers_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNvmeRemoteControllersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNvmeRemoteControllersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListNvmeRemoteControllersResponse.class, opi_api.storage.v1.ListNvmeRemoteControllersResponse.Builder.class);
  }

  public static final int NVME_REMOTE_CONTROLLERS_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.NvmeRemoteController> nvmeRemoteControllers_;
  /**
   * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.NvmeRemoteController> getNvmeRemoteControllersList() {
    return nvmeRemoteControllers_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.NvmeRemoteControllerOrBuilder> 
      getNvmeRemoteControllersOrBuilderList() {
    return nvmeRemoteControllers_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
   */
  @java.lang.Override
  public int getNvmeRemoteControllersCount() {
    return nvmeRemoteControllers_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeRemoteController getNvmeRemoteControllers(int index) {
    return nvmeRemoteControllers_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeRemoteControllerOrBuilder getNvmeRemoteControllersOrBuilder(
      int index) {
    return nvmeRemoteControllers_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < nvmeRemoteControllers_.size(); i++) {
      output.writeMessage(1, nvmeRemoteControllers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nvmeRemoteControllers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nvmeRemoteControllers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.ListNvmeRemoteControllersResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListNvmeRemoteControllersResponse other = (opi_api.storage.v1.ListNvmeRemoteControllersResponse) obj;

    if (!getNvmeRemoteControllersList()
        .equals(other.getNvmeRemoteControllersList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getNvmeRemoteControllersCount() > 0) {
      hash = (37 * hash) + NVME_REMOTE_CONTROLLERS_FIELD_NUMBER;
      hash = (53 * hash) + getNvmeRemoteControllersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.ListNvmeRemoteControllersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents a response to list all Nvme Remote Controllers.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.ListNvmeRemoteControllersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListNvmeRemoteControllersResponse)
      opi_api.storage.v1.ListNvmeRemoteControllersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNvmeRemoteControllersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNvmeRemoteControllersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListNvmeRemoteControllersResponse.class, opi_api.storage.v1.ListNvmeRemoteControllersResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListNvmeRemoteControllersResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getNvmeRemoteControllersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nvmeRemoteControllersBuilder_ == null) {
        nvmeRemoteControllers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nvmeRemoteControllersBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNvmeRemoteControllersResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNvmeRemoteControllersResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListNvmeRemoteControllersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNvmeRemoteControllersResponse build() {
      opi_api.storage.v1.ListNvmeRemoteControllersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNvmeRemoteControllersResponse buildPartial() {
      opi_api.storage.v1.ListNvmeRemoteControllersResponse result = new opi_api.storage.v1.ListNvmeRemoteControllersResponse(this);
      int from_bitField0_ = bitField0_;
      if (nvmeRemoteControllersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nvmeRemoteControllers_ = java.util.Collections.unmodifiableList(nvmeRemoteControllers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nvmeRemoteControllers_ = nvmeRemoteControllers_;
      } else {
        result.nvmeRemoteControllers_ = nvmeRemoteControllersBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.ListNvmeRemoteControllersResponse) {
        return mergeFrom((opi_api.storage.v1.ListNvmeRemoteControllersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListNvmeRemoteControllersResponse other) {
      if (other == opi_api.storage.v1.ListNvmeRemoteControllersResponse.getDefaultInstance()) return this;
      if (nvmeRemoteControllersBuilder_ == null) {
        if (!other.nvmeRemoteControllers_.isEmpty()) {
          if (nvmeRemoteControllers_.isEmpty()) {
            nvmeRemoteControllers_ = other.nvmeRemoteControllers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNvmeRemoteControllersIsMutable();
            nvmeRemoteControllers_.addAll(other.nvmeRemoteControllers_);
          }
          onChanged();
        }
      } else {
        if (!other.nvmeRemoteControllers_.isEmpty()) {
          if (nvmeRemoteControllersBuilder_.isEmpty()) {
            nvmeRemoteControllersBuilder_.dispose();
            nvmeRemoteControllersBuilder_ = null;
            nvmeRemoteControllers_ = other.nvmeRemoteControllers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nvmeRemoteControllersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNvmeRemoteControllersFieldBuilder() : null;
          } else {
            nvmeRemoteControllersBuilder_.addAllMessages(other.nvmeRemoteControllers_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.ListNvmeRemoteControllersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListNvmeRemoteControllersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.NvmeRemoteController> nvmeRemoteControllers_ =
      java.util.Collections.emptyList();
    private void ensureNvmeRemoteControllersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nvmeRemoteControllers_ = new java.util.ArrayList<opi_api.storage.v1.NvmeRemoteController>(nvmeRemoteControllers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NvmeRemoteController, opi_api.storage.v1.NvmeRemoteController.Builder, opi_api.storage.v1.NvmeRemoteControllerOrBuilder> nvmeRemoteControllersBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NvmeRemoteController> getNvmeRemoteControllersList() {
      if (nvmeRemoteControllersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nvmeRemoteControllers_);
      } else {
        return nvmeRemoteControllersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public int getNvmeRemoteControllersCount() {
      if (nvmeRemoteControllersBuilder_ == null) {
        return nvmeRemoteControllers_.size();
      } else {
        return nvmeRemoteControllersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public opi_api.storage.v1.NvmeRemoteController getNvmeRemoteControllers(int index) {
      if (nvmeRemoteControllersBuilder_ == null) {
        return nvmeRemoteControllers_.get(index);
      } else {
        return nvmeRemoteControllersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public Builder setNvmeRemoteControllers(
        int index, opi_api.storage.v1.NvmeRemoteController value) {
      if (nvmeRemoteControllersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvmeRemoteControllersIsMutable();
        nvmeRemoteControllers_.set(index, value);
        onChanged();
      } else {
        nvmeRemoteControllersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public Builder setNvmeRemoteControllers(
        int index, opi_api.storage.v1.NvmeRemoteController.Builder builderForValue) {
      if (nvmeRemoteControllersBuilder_ == null) {
        ensureNvmeRemoteControllersIsMutable();
        nvmeRemoteControllers_.set(index, builderForValue.build());
        onChanged();
      } else {
        nvmeRemoteControllersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public Builder addNvmeRemoteControllers(opi_api.storage.v1.NvmeRemoteController value) {
      if (nvmeRemoteControllersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvmeRemoteControllersIsMutable();
        nvmeRemoteControllers_.add(value);
        onChanged();
      } else {
        nvmeRemoteControllersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public Builder addNvmeRemoteControllers(
        int index, opi_api.storage.v1.NvmeRemoteController value) {
      if (nvmeRemoteControllersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvmeRemoteControllersIsMutable();
        nvmeRemoteControllers_.add(index, value);
        onChanged();
      } else {
        nvmeRemoteControllersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public Builder addNvmeRemoteControllers(
        opi_api.storage.v1.NvmeRemoteController.Builder builderForValue) {
      if (nvmeRemoteControllersBuilder_ == null) {
        ensureNvmeRemoteControllersIsMutable();
        nvmeRemoteControllers_.add(builderForValue.build());
        onChanged();
      } else {
        nvmeRemoteControllersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public Builder addNvmeRemoteControllers(
        int index, opi_api.storage.v1.NvmeRemoteController.Builder builderForValue) {
      if (nvmeRemoteControllersBuilder_ == null) {
        ensureNvmeRemoteControllersIsMutable();
        nvmeRemoteControllers_.add(index, builderForValue.build());
        onChanged();
      } else {
        nvmeRemoteControllersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public Builder addAllNvmeRemoteControllers(
        java.lang.Iterable<? extends opi_api.storage.v1.NvmeRemoteController> values) {
      if (nvmeRemoteControllersBuilder_ == null) {
        ensureNvmeRemoteControllersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nvmeRemoteControllers_);
        onChanged();
      } else {
        nvmeRemoteControllersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public Builder clearNvmeRemoteControllers() {
      if (nvmeRemoteControllersBuilder_ == null) {
        nvmeRemoteControllers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nvmeRemoteControllersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public Builder removeNvmeRemoteControllers(int index) {
      if (nvmeRemoteControllersBuilder_ == null) {
        ensureNvmeRemoteControllersIsMutable();
        nvmeRemoteControllers_.remove(index);
        onChanged();
      } else {
        nvmeRemoteControllersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public opi_api.storage.v1.NvmeRemoteController.Builder getNvmeRemoteControllersBuilder(
        int index) {
      return getNvmeRemoteControllersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public opi_api.storage.v1.NvmeRemoteControllerOrBuilder getNvmeRemoteControllersOrBuilder(
        int index) {
      if (nvmeRemoteControllersBuilder_ == null) {
        return nvmeRemoteControllers_.get(index);  } else {
        return nvmeRemoteControllersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.NvmeRemoteControllerOrBuilder> 
         getNvmeRemoteControllersOrBuilderList() {
      if (nvmeRemoteControllersBuilder_ != null) {
        return nvmeRemoteControllersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nvmeRemoteControllers_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public opi_api.storage.v1.NvmeRemoteController.Builder addNvmeRemoteControllersBuilder() {
      return getNvmeRemoteControllersFieldBuilder().addBuilder(
          opi_api.storage.v1.NvmeRemoteController.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public opi_api.storage.v1.NvmeRemoteController.Builder addNvmeRemoteControllersBuilder(
        int index) {
      return getNvmeRemoteControllersFieldBuilder().addBuilder(
          index, opi_api.storage.v1.NvmeRemoteController.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NvmeRemoteController nvme_remote_controllers = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NvmeRemoteController.Builder> 
         getNvmeRemoteControllersBuilderList() {
      return getNvmeRemoteControllersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NvmeRemoteController, opi_api.storage.v1.NvmeRemoteController.Builder, opi_api.storage.v1.NvmeRemoteControllerOrBuilder> 
        getNvmeRemoteControllersFieldBuilder() {
      if (nvmeRemoteControllersBuilder_ == null) {
        nvmeRemoteControllersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.NvmeRemoteController, opi_api.storage.v1.NvmeRemoteController.Builder, opi_api.storage.v1.NvmeRemoteControllerOrBuilder>(
                nvmeRemoteControllers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nvmeRemoteControllers_ = null;
      }
      return nvmeRemoteControllersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Next page token of list response
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListNvmeRemoteControllersResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNvmeRemoteControllersResponse)
  private static final opi_api.storage.v1.ListNvmeRemoteControllersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListNvmeRemoteControllersResponse();
  }

  public static opi_api.storage.v1.ListNvmeRemoteControllersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNvmeRemoteControllersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNvmeRemoteControllersResponse>() {
    @java.lang.Override
    public ListNvmeRemoteControllersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListNvmeRemoteControllersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNvmeRemoteControllersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNvmeRemoteControllersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListNvmeRemoteControllersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

