package com.wenwen.tongdemall.member.dao;

import com.wenwen.tongdemall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 21:43:39
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
