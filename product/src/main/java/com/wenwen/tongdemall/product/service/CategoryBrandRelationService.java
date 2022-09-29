package com.wenwen.tongdemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenwen.common.utils.PageUtils;
import com.wenwen.tongdemall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-27 18:27:04
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

