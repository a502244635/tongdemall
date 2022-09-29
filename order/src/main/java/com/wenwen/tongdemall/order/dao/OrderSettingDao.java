package com.wenwen.tongdemall.order.dao;

import com.wenwen.tongdemall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 22:03:51
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
