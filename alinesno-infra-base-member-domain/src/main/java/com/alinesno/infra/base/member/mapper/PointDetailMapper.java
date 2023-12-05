package com.alinesno.infra.base.member.mapper;


import com.alinesno.infra.base.member.entity.PointDetailEntity;
import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 资产编目Mapper接口
 *
 * @author luoxiaodong
 * @since 1.0.0
 */
@Mapper
public interface PointDetailMapper extends IBaseMapper<PointDetailEntity> {
}
