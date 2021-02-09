// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message/proto/message_code_desc.proto

package xx.love.cc.message;

/**
 * Protobuf enum {@code MessageCode}
 */
public enum MessageCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * === 系统消息,范围0~100 === 
   * </pre>
   *
   * <code>SYS_HEART_BEAT = 0;</code>
   */
  SYS_HEART_BEAT(0),
  /**
   * <pre>
   *测试协议1
   * </pre>
   *
   * <code>CG_TEST_1 = 1001;</code>
   */
  CG_TEST_1(1001),
  /**
   * <code>GC_TEST_1 = 1002;</code>
   */
  GC_TEST_1(1002),
  /**
   * <pre>
   *测试协议2
   * </pre>
   *
   * <code>CG_TEST_2 = 1101;</code>
   */
  CG_TEST_2(1101),
  /**
   * <code>GC_TEST_2 = 1102;</code>
   */
  GC_TEST_2(1102),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * === 系统消息,范围0~100 === 
   * </pre>
   *
   * <code>SYS_HEART_BEAT = 0;</code>
   */
  public static final int SYS_HEART_BEAT_VALUE = 0;
  /**
   * <pre>
   *测试协议1
   * </pre>
   *
   * <code>CG_TEST_1 = 1001;</code>
   */
  public static final int CG_TEST_1_VALUE = 1001;
  /**
   * <code>GC_TEST_1 = 1002;</code>
   */
  public static final int GC_TEST_1_VALUE = 1002;
  /**
   * <pre>
   *测试协议2
   * </pre>
   *
   * <code>CG_TEST_2 = 1101;</code>
   */
  public static final int CG_TEST_2_VALUE = 1101;
  /**
   * <code>GC_TEST_2 = 1102;</code>
   */
  public static final int GC_TEST_2_VALUE = 1102;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MessageCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MessageCode forNumber(int value) {
    switch (value) {
      case 0: return SYS_HEART_BEAT;
      case 1001: return CG_TEST_1;
      case 1002: return GC_TEST_1;
      case 1101: return CG_TEST_2;
      case 1102: return GC_TEST_2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessageCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessageCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageCode>() {
          public MessageCode findValueByNumber(int number) {
            return MessageCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return xx.love.cc.message.MessageCodeDesc.getDescriptor().getEnumTypes().get(0);
  }

  private static final MessageCode[] VALUES = values();

  public static MessageCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MessageCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:MessageCode)
}
