package com.dao;

import com.entity.HuiyixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyixinxiVO;
import com.entity.view.HuiyixinxiView;


/**
 * 会议信息
 * 
 * @author 
 * @email 
 * @date 2022-04-05 21:56:21
 */
public interface HuiyixinxiDao extends BaseMapper<HuiyixinxiEntity> {
	
	List<HuiyixinxiVO> selectListVO(@Param("ew") Wrapper<HuiyixinxiEntity> wrapper);
	
	HuiyixinxiVO selectVO(@Param("ew") Wrapper<HuiyixinxiEntity> wrapper);
	
	List<HuiyixinxiView> selectListView(@Param("ew") Wrapper<HuiyixinxiEntity> wrapper);

	List<HuiyixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyixinxiEntity> wrapper);
	
	HuiyixinxiView selectView(@Param("ew") Wrapper<HuiyixinxiEntity> wrapper);
	

}
