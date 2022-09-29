package com.wenwen.tongdemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenwen.common.utils.PageUtils;
import com.wenwen.tongdemall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 22:03:50
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

