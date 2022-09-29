package com.wenwen.tongdemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wenwen.common.utils.PageUtils;
import com.wenwen.tongdemall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 21:43:40
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

