package com.alinesno.infra.base.member.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@TableName("point_detail")
@Data
public class PointDetailEntity extends InfraBaseEntity {

    @Column(type = MySqlTypeConstant.BIGINT, length = 32, comment = "用户ID")
    @TableField
    private Long userId;

    @Column(type = MySqlTypeConstant.VARCHAR, length = 32 , comment = "订单编号")
    @TableField
    private String orderSn;

    @Column(type = MySqlTypeConstant.INT, length = 11, comment = "金额")
    @TableField
    private int amount;

    @Column(type = MySqlTypeConstant.VARCHAR, length = 256, comment = "描述")
    @TableField
    private String description;

    @Column(type = MySqlTypeConstant.CHAR, length = 1, comment = "状态")
    @TableField
    private char status;

}