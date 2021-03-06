// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message/proto/base_message_desc.proto

package xx.love.cc.message.base;

/**
 * Protobuf type {@code BaseProtobufMessage}
 */
public final class BaseProtobufMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BaseProtobufMessage)
    BaseProtobufMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BaseProtobufMessage.newBuilder() to construct.
  private BaseProtobufMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BaseProtobufMessage() {
    content_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BaseProtobufMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BaseProtobufMessage(
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

            code_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            content_ = s;
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
    return xx.love.cc.message.base.BaseMessageDesc.internal_static_BaseProtobufMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xx.love.cc.message.base.BaseMessageDesc.internal_static_BaseProtobufMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xx.love.cc.message.base.BaseProtobufMessage.class, xx.love.cc.message.base.BaseProtobufMessage.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <pre>
   * 协议号
   * </pre>
   *
   * <code>int32 code = 1;</code>
   * @return The code.
   */
  @java.lang.Override
  public int getCode() {
    return code_;
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object content_;
  /**
   * <pre>
   * 业务protobuf转成的byte数据
   * </pre>
   *
   * <code>string content = 2;</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 业务protobuf转成的byte数据
   * </pre>
   *
   * <code>string content = 2;</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
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
    if (code_ != 0) {
      output.writeInt32(1, code_);
    }
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, code_);
    }
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, content_);
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
    if (!(obj instanceof xx.love.cc.message.base.BaseProtobufMessage)) {
      return super.equals(obj);
    }
    xx.love.cc.message.base.BaseProtobufMessage other = (xx.love.cc.message.base.BaseProtobufMessage) obj;

    if (getCode()
        != other.getCode()) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xx.love.cc.message.base.BaseProtobufMessage parseFrom(
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
  public static Builder newBuilder(xx.love.cc.message.base.BaseProtobufMessage prototype) {
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
   * Protobuf type {@code BaseProtobufMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BaseProtobufMessage)
      xx.love.cc.message.base.BaseProtobufMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xx.love.cc.message.base.BaseMessageDesc.internal_static_BaseProtobufMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xx.love.cc.message.base.BaseMessageDesc.internal_static_BaseProtobufMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xx.love.cc.message.base.BaseProtobufMessage.class, xx.love.cc.message.base.BaseProtobufMessage.Builder.class);
    }

    // Construct using xx.love.cc.message.base.BaseProtobufMessage.newBuilder()
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
      code_ = 0;

      content_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xx.love.cc.message.base.BaseMessageDesc.internal_static_BaseProtobufMessage_descriptor;
    }

    @java.lang.Override
    public xx.love.cc.message.base.BaseProtobufMessage getDefaultInstanceForType() {
      return xx.love.cc.message.base.BaseProtobufMessage.getDefaultInstance();
    }

    @java.lang.Override
    public xx.love.cc.message.base.BaseProtobufMessage build() {
      xx.love.cc.message.base.BaseProtobufMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xx.love.cc.message.base.BaseProtobufMessage buildPartial() {
      xx.love.cc.message.base.BaseProtobufMessage result = new xx.love.cc.message.base.BaseProtobufMessage(this);
      result.code_ = code_;
      result.content_ = content_;
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
      if (other instanceof xx.love.cc.message.base.BaseProtobufMessage) {
        return mergeFrom((xx.love.cc.message.base.BaseProtobufMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xx.love.cc.message.base.BaseProtobufMessage other) {
      if (other == xx.love.cc.message.base.BaseProtobufMessage.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
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
      xx.love.cc.message.base.BaseProtobufMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (xx.love.cc.message.base.BaseProtobufMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ ;
    /**
     * <pre>
     * 协议号
     * </pre>
     *
     * <code>int32 code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }
    /**
     * <pre>
     * 协议号
     * </pre>
     *
     * <code>int32 code = 1;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 协议号
     * </pre>
     *
     * <code>int32 code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <pre>
     * 业务protobuf转成的byte数据
     * </pre>
     *
     * <code>string content = 2;</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 业务protobuf转成的byte数据
     * </pre>
     *
     * <code>string content = 2;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 业务protobuf转成的byte数据
     * </pre>
     *
     * <code>string content = 2;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务protobuf转成的byte数据
     * </pre>
     *
     * <code>string content = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 业务protobuf转成的byte数据
     * </pre>
     *
     * <code>string content = 2;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value;
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


    // @@protoc_insertion_point(builder_scope:BaseProtobufMessage)
  }

  // @@protoc_insertion_point(class_scope:BaseProtobufMessage)
  private static final xx.love.cc.message.base.BaseProtobufMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xx.love.cc.message.base.BaseProtobufMessage();
  }

  public static xx.love.cc.message.base.BaseProtobufMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BaseProtobufMessage>
      PARSER = new com.google.protobuf.AbstractParser<BaseProtobufMessage>() {
    @java.lang.Override
    public BaseProtobufMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BaseProtobufMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BaseProtobufMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BaseProtobufMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xx.love.cc.message.base.BaseProtobufMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

