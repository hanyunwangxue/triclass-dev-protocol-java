// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dm/action.proto

package com.triclass.dm;

public interface ActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:triclass.dm.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 心跳消息
   * </pre>
   *
   * <code>.triclass.dm.Heartbeat heartbeat = 1;</code>
   * @return Whether the heartbeat field is set.
   */
  boolean hasHeartbeat();
  /**
   * <pre>
   * 心跳消息
   * </pre>
   *
   * <code>.triclass.dm.Heartbeat heartbeat = 1;</code>
   * @return The heartbeat.
   */
  com.triclass.dm.Heartbeat getHeartbeat();
  /**
   * <pre>
   * 心跳消息
   * </pre>
   *
   * <code>.triclass.dm.Heartbeat heartbeat = 1;</code>
   */
  com.triclass.dm.HeartbeatOrBuilder getHeartbeatOrBuilder();

  /**
   * <pre>
   * 修改云视讯账号
   * </pre>
   *
   * <code>.triclass.dm.ChangeAccount changeAccount = 2;</code>
   * @return Whether the changeAccount field is set.
   */
  boolean hasChangeAccount();
  /**
   * <pre>
   * 修改云视讯账号
   * </pre>
   *
   * <code>.triclass.dm.ChangeAccount changeAccount = 2;</code>
   * @return The changeAccount.
   */
  com.triclass.dm.ChangeAccount getChangeAccount();
  /**
   * <pre>
   * 修改云视讯账号
   * </pre>
   *
   * <code>.triclass.dm.ChangeAccount changeAccount = 2;</code>
   */
  com.triclass.dm.ChangeAccountOrBuilder getChangeAccountOrBuilder();

  public com.triclass.dm.Action.ActionCase getActionCase();
}