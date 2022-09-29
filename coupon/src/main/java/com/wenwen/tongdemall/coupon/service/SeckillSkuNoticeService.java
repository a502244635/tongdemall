package com.wenwen.tongdemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenwen.common.utils.PageUtils;
import com.wenwen.tongdemall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 21:25:18
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

