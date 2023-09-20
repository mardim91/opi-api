// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.TcpController}
 */
public final class TcpController extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.TcpController)
    TcpControllerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TcpController.newBuilder() to construct.
  private TcpController(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TcpController() {
    psk_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TcpController();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TcpController(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            hdgst_ = input.readBool();
            break;
          }
          case 16: {

            ddgst_ = input.readBool();
            break;
          }
          case 26: {

            psk_ = input.readBytes();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_TcpController_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_TcpController_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.TcpController.class, opi_api.storage.v1.TcpController.Builder.class);
  }

  public static final int HDGST_FIELD_NUMBER = 1;
  private boolean hdgst_;
  /**
   * <code>bool hdgst = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The hdgst.
   */
  @java.lang.Override
  public boolean getHdgst() {
    return hdgst_;
  }

  public static final int DDGST_FIELD_NUMBER = 2;
  private boolean ddgst_;
  /**
   * <code>bool ddgst = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The ddgst.
   */
  @java.lang.Override
  public boolean getDdgst() {
    return ddgst_;
  }

  public static final int PSK_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString psk_;
  /**
   * <pre>
   * Nvme/TCP published secure channel specification (TP 8011) based on TLS 1.3 and PSK.
   * Use PSK interchange format with base64 encoding as input.
   * Also use information about hash function in interchange
   * format for retained PSK generation. If no hash is selected,
   * use configured PSK as retained PSK.
   * Check the size of interchange PSK to determine cipher suite.
   * Calculate CRC-32 bytes to ensure validity of PSK.
   * Example: "NVMeTLSkey-1:01:VRLbtnN9AQb2WXW3c9+wEf/DRLz0QuLdbYvEhwtdWwNf9LrZ:"
   * if PSK field is empty, then unsecure connection Nvme/TCP without TLS will be made
   * </pre>
   *
   * <code>bytes psk = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The psk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPsk() {
    return psk_;
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
    if (hdgst_ != false) {
      output.writeBool(1, hdgst_);
    }
    if (ddgst_ != false) {
      output.writeBool(2, ddgst_);
    }
    if (!psk_.isEmpty()) {
      output.writeBytes(3, psk_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hdgst_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, hdgst_);
    }
    if (ddgst_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ddgst_);
    }
    if (!psk_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, psk_);
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
    if (!(obj instanceof opi_api.storage.v1.TcpController)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.TcpController other = (opi_api.storage.v1.TcpController) obj;

    if (getHdgst()
        != other.getHdgst()) return false;
    if (getDdgst()
        != other.getDdgst()) return false;
    if (!getPsk()
        .equals(other.getPsk())) return false;
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
    hash = (37 * hash) + HDGST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHdgst());
    hash = (37 * hash) + DDGST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDdgst());
    hash = (37 * hash) + PSK_FIELD_NUMBER;
    hash = (53 * hash) + getPsk().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.TcpController parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.TcpController parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.TcpController parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.TcpController parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.TcpController parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.TcpController parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.TcpController parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.TcpController parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.TcpController parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.TcpController parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.TcpController parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.TcpController parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.TcpController prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.TcpController}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.TcpController)
      opi_api.storage.v1.TcpControllerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_TcpController_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_TcpController_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.TcpController.class, opi_api.storage.v1.TcpController.Builder.class);
    }

    // Construct using opi_api.storage.v1.TcpController.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      hdgst_ = false;

      ddgst_ = false;

      psk_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_TcpController_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.TcpController getDefaultInstanceForType() {
      return opi_api.storage.v1.TcpController.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.TcpController build() {
      opi_api.storage.v1.TcpController result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.TcpController buildPartial() {
      opi_api.storage.v1.TcpController result = new opi_api.storage.v1.TcpController(this);
      result.hdgst_ = hdgst_;
      result.ddgst_ = ddgst_;
      result.psk_ = psk_;
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
      if (other instanceof opi_api.storage.v1.TcpController) {
        return mergeFrom((opi_api.storage.v1.TcpController)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.TcpController other) {
      if (other == opi_api.storage.v1.TcpController.getDefaultInstance()) return this;
      if (other.getHdgst() != false) {
        setHdgst(other.getHdgst());
      }
      if (other.getDdgst() != false) {
        setDdgst(other.getDdgst());
      }
      if (other.getPsk() != com.google.protobuf.ByteString.EMPTY) {
        setPsk(other.getPsk());
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
      opi_api.storage.v1.TcpController parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.TcpController) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean hdgst_ ;
    /**
     * <code>bool hdgst = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The hdgst.
     */
    @java.lang.Override
    public boolean getHdgst() {
      return hdgst_;
    }
    /**
     * <code>bool hdgst = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The hdgst to set.
     * @return This builder for chaining.
     */
    public Builder setHdgst(boolean value) {
      
      hdgst_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool hdgst = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearHdgst() {
      
      hdgst_ = false;
      onChanged();
      return this;
    }

    private boolean ddgst_ ;
    /**
     * <code>bool ddgst = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The ddgst.
     */
    @java.lang.Override
    public boolean getDdgst() {
      return ddgst_;
    }
    /**
     * <code>bool ddgst = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The ddgst to set.
     * @return This builder for chaining.
     */
    public Builder setDdgst(boolean value) {
      
      ddgst_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ddgst = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearDdgst() {
      
      ddgst_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString psk_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Nvme/TCP published secure channel specification (TP 8011) based on TLS 1.3 and PSK.
     * Use PSK interchange format with base64 encoding as input.
     * Also use information about hash function in interchange
     * format for retained PSK generation. If no hash is selected,
     * use configured PSK as retained PSK.
     * Check the size of interchange PSK to determine cipher suite.
     * Calculate CRC-32 bytes to ensure validity of PSK.
     * Example: "NVMeTLSkey-1:01:VRLbtnN9AQb2WXW3c9+wEf/DRLz0QuLdbYvEhwtdWwNf9LrZ:"
     * if PSK field is empty, then unsecure connection Nvme/TCP without TLS will be made
     * </pre>
     *
     * <code>bytes psk = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The psk.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPsk() {
      return psk_;
    }
    /**
     * <pre>
     * Nvme/TCP published secure channel specification (TP 8011) based on TLS 1.3 and PSK.
     * Use PSK interchange format with base64 encoding as input.
     * Also use information about hash function in interchange
     * format for retained PSK generation. If no hash is selected,
     * use configured PSK as retained PSK.
     * Check the size of interchange PSK to determine cipher suite.
     * Calculate CRC-32 bytes to ensure validity of PSK.
     * Example: "NVMeTLSkey-1:01:VRLbtnN9AQb2WXW3c9+wEf/DRLz0QuLdbYvEhwtdWwNf9LrZ:"
     * if PSK field is empty, then unsecure connection Nvme/TCP without TLS will be made
     * </pre>
     *
     * <code>bytes psk = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The psk to set.
     * @return This builder for chaining.
     */
    public Builder setPsk(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      psk_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Nvme/TCP published secure channel specification (TP 8011) based on TLS 1.3 and PSK.
     * Use PSK interchange format with base64 encoding as input.
     * Also use information about hash function in interchange
     * format for retained PSK generation. If no hash is selected,
     * use configured PSK as retained PSK.
     * Check the size of interchange PSK to determine cipher suite.
     * Calculate CRC-32 bytes to ensure validity of PSK.
     * Example: "NVMeTLSkey-1:01:VRLbtnN9AQb2WXW3c9+wEf/DRLz0QuLdbYvEhwtdWwNf9LrZ:"
     * if PSK field is empty, then unsecure connection Nvme/TCP without TLS will be made
     * </pre>
     *
     * <code>bytes psk = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearPsk() {
      
      psk_ = getDefaultInstance().getPsk();
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.TcpController)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.TcpController)
  private static final opi_api.storage.v1.TcpController DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.TcpController();
  }

  public static opi_api.storage.v1.TcpController getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TcpController>
      PARSER = new com.google.protobuf.AbstractParser<TcpController>() {
    @java.lang.Override
    public TcpController parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TcpController(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TcpController> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TcpController> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.TcpController getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

