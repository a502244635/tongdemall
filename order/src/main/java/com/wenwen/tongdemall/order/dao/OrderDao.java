package com.wenwen.tongdemall.order.dao;

import com.wenwen.tongdemall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 22:03:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
