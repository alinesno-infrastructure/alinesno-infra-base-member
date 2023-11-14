package com.alinesno.infra.base.member.service;

import com.alinesno.infra.base.member.entity.PointDetailEntity;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.alinesno.infra.common.facade.services.IBaseService;
import com.baomidou.mybatisplus.annotation.TableField;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

public interface IPointDetailService extends IBaseService<PointDetailEntity> {

}