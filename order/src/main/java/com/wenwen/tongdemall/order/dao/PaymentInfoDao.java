package com.wenwen.tongdemall.order.dao;

import com.wenwen.tongdemall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 22:03:50
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
