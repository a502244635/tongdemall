package com.wenwen.tongdemall.member.dao;

import com.wenwen.tongdemall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chan
 * @email sunlightcs@gmail.com
 * @date 2022-09-29 21:43:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
