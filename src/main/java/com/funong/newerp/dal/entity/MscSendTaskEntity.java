package com.funong.newerp.dal.entity;

import com.funong.newerp.dal.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * 营销消息发送任务
 */
@Data
@Table(name = "msc_send_task")
public class MscSendTaskEntity extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private String status;  // 发送状态
    private Date planSendTime;// 计划发送时间
    @Column(name = "sender")
    private String sender; // 发送者
    private String senderName; // 发送者姓名
    private String receiver; // 接收者
    private String receiverName; // 接收者姓名/群名
    private String receiverPhone; // 接收者手机号
    private String receiverUserId; // 接收者用户ID
    private String receiverType; // 接收者类型，个人/群
    private String contentType; // 消息类型，短信/文字/模板/图文/url
    private Integer tryTimes; // 重试次数
    private String memo; // 备注
    private String content; // 消息内容
    private String userGroup; // 用户群体，如SELLER/BUYER
    private String module; // 功能模块
    private String referType; // 关联信息类型，如合同、订单、商品、报价等
    private String referNo; // 关联信息编号

    public MscSendTaskEntity() {

    }


}