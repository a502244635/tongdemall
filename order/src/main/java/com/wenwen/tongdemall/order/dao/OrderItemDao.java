package com.wenwen.tongdemall.order.dao;

import com.wenwen.tongdemall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 22:03:51
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
