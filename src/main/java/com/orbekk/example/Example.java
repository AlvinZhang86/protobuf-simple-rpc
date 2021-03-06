// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/orbekk/example/example.proto

package com.orbekk.example;

public final class Example {
  private Example() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EmptyOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  public static final class Empty extends
      com.google.protobuf.GeneratedMessage
      implements EmptyOrBuilder {
    // Use Empty.newBuilder() to construct.
    private Empty(Builder builder) {
      super(builder);
    }
    private Empty(boolean noInit) {}
    
    private static final Empty defaultInstance;
    public static Empty getDefaultInstance() {
      return defaultInstance;
    }
    
    public Empty getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.orbekk.example.Example.internal_static_com_orbekk_example_Empty_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.orbekk.example.Example.internal_static_com_orbekk_example_Empty_fieldAccessorTable;
    }
    
    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.orbekk.example.Example.Empty parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.orbekk.example.Example.Empty parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.orbekk.example.Example.Empty parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.orbekk.example.Example.Empty parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.orbekk.example.Example.Empty parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.orbekk.example.Example.Empty parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.orbekk.example.Example.Empty parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.orbekk.example.Example.Empty parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.orbekk.example.Example.Empty parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.orbekk.example.Example.Empty parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.orbekk.example.Example.Empty prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.orbekk.example.Example.EmptyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.orbekk.example.Example.internal_static_com_orbekk_example_Empty_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.orbekk.example.Example.internal_static_com_orbekk_example_Empty_fieldAccessorTable;
      }
      
      // Construct using com.orbekk.example.Example.Empty.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.orbekk.example.Example.Empty.getDescriptor();
      }
      
      public com.orbekk.example.Example.Empty getDefaultInstanceForType() {
        return com.orbekk.example.Example.Empty.getDefaultInstance();
      }
      
      public com.orbekk.example.Example.Empty build() {
        com.orbekk.example.Example.Empty result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.orbekk.example.Example.Empty buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.orbekk.example.Example.Empty result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.orbekk.example.Example.Empty buildPartial() {
        com.orbekk.example.Example.Empty result = new com.orbekk.example.Example.Empty(this);
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.orbekk.example.Example.Empty) {
          return mergeFrom((com.orbekk.example.Example.Empty)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.orbekk.example.Example.Empty other) {
        if (other == com.orbekk.example.Example.Empty.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
          }
        }
      }
      
      
      // @@protoc_insertion_point(builder_scope:com.orbekk.example.Empty)
    }
    
    static {
      defaultInstance = new Empty(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.orbekk.example.Empty)
  }
  
  public interface FortuneReplyOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string fortune = 1;
    boolean hasFortune();
    String getFortune();
  }
  public static final class FortuneReply extends
      com.google.protobuf.GeneratedMessage
      implements FortuneReplyOrBuilder {
    // Use FortuneReply.newBuilder() to construct.
    private FortuneReply(Builder builder) {
      super(builder);
    }
    private FortuneReply(boolean noInit) {}
    
    private static final FortuneReply defaultInstance;
    public static FortuneReply getDefaultInstance() {
      return defaultInstance;
    }
    
    public FortuneReply getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.orbekk.example.Example.internal_static_com_orbekk_example_FortuneReply_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.orbekk.example.Example.internal_static_com_orbekk_example_FortuneReply_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string fortune = 1;
    public static final int FORTUNE_FIELD_NUMBER = 1;
    private java.lang.Object fortune_;
    public boolean hasFortune() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getFortune() {
      java.lang.Object ref = fortune_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          fortune_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getFortuneBytes() {
      java.lang.Object ref = fortune_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        fortune_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      fortune_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasFortune()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getFortuneBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getFortuneBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.orbekk.example.Example.FortuneReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.orbekk.example.Example.FortuneReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.orbekk.example.Example.FortuneReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.orbekk.example.Example.FortuneReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.orbekk.example.Example.FortuneReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.orbekk.example.Example.FortuneReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.orbekk.example.Example.FortuneReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.orbekk.example.Example.FortuneReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.orbekk.example.Example.FortuneReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.orbekk.example.Example.FortuneReply parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.orbekk.example.Example.FortuneReply prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.orbekk.example.Example.FortuneReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.orbekk.example.Example.internal_static_com_orbekk_example_FortuneReply_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.orbekk.example.Example.internal_static_com_orbekk_example_FortuneReply_fieldAccessorTable;
      }
      
      // Construct using com.orbekk.example.Example.FortuneReply.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        fortune_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.orbekk.example.Example.FortuneReply.getDescriptor();
      }
      
      public com.orbekk.example.Example.FortuneReply getDefaultInstanceForType() {
        return com.orbekk.example.Example.FortuneReply.getDefaultInstance();
      }
      
      public com.orbekk.example.Example.FortuneReply build() {
        com.orbekk.example.Example.FortuneReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.orbekk.example.Example.FortuneReply buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.orbekk.example.Example.FortuneReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.orbekk.example.Example.FortuneReply buildPartial() {
        com.orbekk.example.Example.FortuneReply result = new com.orbekk.example.Example.FortuneReply(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fortune_ = fortune_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.orbekk.example.Example.FortuneReply) {
          return mergeFrom((com.orbekk.example.Example.FortuneReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.orbekk.example.Example.FortuneReply other) {
        if (other == com.orbekk.example.Example.FortuneReply.getDefaultInstance()) return this;
        if (other.hasFortune()) {
          setFortune(other.getFortune());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasFortune()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              fortune_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string fortune = 1;
      private java.lang.Object fortune_ = "";
      public boolean hasFortune() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getFortune() {
        java.lang.Object ref = fortune_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          fortune_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setFortune(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fortune_ = value;
        onChanged();
        return this;
      }
      public Builder clearFortune() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fortune_ = getDefaultInstance().getFortune();
        onChanged();
        return this;
      }
      void setFortune(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        fortune_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.orbekk.example.FortuneReply)
    }
    
    static {
      defaultInstance = new FortuneReply(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.orbekk.example.FortuneReply)
  }
  
  public static abstract class FortuneService
      implements com.google.protobuf.Service {
    protected FortuneService() {}
    
    public interface Interface {
      public abstract void getFortune(
          com.google.protobuf.RpcController controller,
          com.orbekk.example.Example.Empty request,
          com.google.protobuf.RpcCallback<com.orbekk.example.Example.FortuneReply> done);
      
    }
    
    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new FortuneService() {
        @java.lang.Override
        public  void getFortune(
            com.google.protobuf.RpcController controller,
            com.orbekk.example.Example.Empty request,
            com.google.protobuf.RpcCallback<com.orbekk.example.Example.FortuneReply> done) {
          impl.getFortune(controller, request, done);
        }
        
      };
    }
    
    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }
        
        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.getFortune(controller, (com.orbekk.example.Example.Empty)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.orbekk.example.Example.Empty.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.orbekk.example.Example.FortuneReply.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
      };
    }
    
    public abstract void getFortune(
        com.google.protobuf.RpcController controller,
        com.orbekk.example.Example.Empty request,
        com.google.protobuf.RpcCallback<com.orbekk.example.Example.FortuneReply> done);
    
    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return com.orbekk.example.Example.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    
    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.getFortune(controller, (com.orbekk.example.Example.Empty)request,
            com.google.protobuf.RpcUtil.<com.orbekk.example.Example.FortuneReply>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.orbekk.example.Example.Empty.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.orbekk.example.Example.FortuneReply.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }
    
    public static final class Stub extends com.orbekk.example.Example.FortuneService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }
      
      private final com.google.protobuf.RpcChannel channel;
      
      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }
      
      public  void getFortune(
          com.google.protobuf.RpcController controller,
          com.orbekk.example.Example.Empty request,
          com.google.protobuf.RpcCallback<com.orbekk.example.Example.FortuneReply> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.orbekk.example.Example.FortuneReply.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.orbekk.example.Example.FortuneReply.class,
            com.orbekk.example.Example.FortuneReply.getDefaultInstance()));
      }
    }
    
    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }
    
    public interface BlockingInterface {
      public com.orbekk.example.Example.FortuneReply getFortune(
          com.google.protobuf.RpcController controller,
          com.orbekk.example.Example.Empty request)
          throws com.google.protobuf.ServiceException;
    }
    
    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }
      
      private final com.google.protobuf.BlockingRpcChannel channel;
      
      public com.orbekk.example.Example.FortuneReply getFortune(
          com.google.protobuf.RpcController controller,
          com.orbekk.example.Example.Empty request)
          throws com.google.protobuf.ServiceException {
        return (com.orbekk.example.Example.FortuneReply) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.orbekk.example.Example.FortuneReply.getDefaultInstance());
      }
      
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_orbekk_example_Empty_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_orbekk_example_Empty_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_orbekk_example_FortuneReply_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_orbekk_example_FortuneReply_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.src/main/java/com/orbekk/example/examp" +
      "le.proto\022\022com.orbekk.example\"\007\n\005Empty\"\037\n" +
      "\014FortuneReply\022\017\n\007fortune\030\001 \002(\t2[\n\016Fortun" +
      "eService\022I\n\nGetFortune\022\031.com.orbekk.exam" +
      "ple.Empty\032 .com.orbekk.example.FortuneRe" +
      "plyB\003\210\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_orbekk_example_Empty_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_orbekk_example_Empty_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_orbekk_example_Empty_descriptor,
              new java.lang.String[] { },
              com.orbekk.example.Example.Empty.class,
              com.orbekk.example.Example.Empty.Builder.class);
          internal_static_com_orbekk_example_FortuneReply_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_com_orbekk_example_FortuneReply_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_orbekk_example_FortuneReply_descriptor,
              new java.lang.String[] { "Fortune", },
              com.orbekk.example.Example.FortuneReply.class,
              com.orbekk.example.Example.FortuneReply.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
