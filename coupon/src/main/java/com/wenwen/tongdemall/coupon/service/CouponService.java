package com.wenwen.tongdemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenwen.common.utils.PageUtils;
import com.wenwen.tongdemall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 21:25:18
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

