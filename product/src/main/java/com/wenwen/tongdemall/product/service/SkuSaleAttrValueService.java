package com.wenwen.tongdemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenwen.common.utils.PageUtils;
import com.wenwen.tongdemall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-27 18:27:04
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

