package com.wenwen.tongdemall.coupon.dao;

import com.wenwen.tongdemall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 21:25:18
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
