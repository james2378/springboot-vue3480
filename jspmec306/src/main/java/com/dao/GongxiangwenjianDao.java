package com.dao;

import com.entity.GongxiangwenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongxiangwenjianVO;
import com.entity.view.GongxiangwenjianView;


/**
 * 共享文件
 * 
 * @author 
 * @email 
 * @date 2022-04-05 21:56:21
 */
public interface GongxiangwenjianDao extends BaseMapper<GongxiangwenjianEntity> {
	
	List<GongxiangwenjianVO> selectListVO(@Param("ew") Wrapper<GongxiangwenjianEntity> wrapper);
	
	GongxiangwenjianVO selectVO(@Param("ew") Wrapper<GongxiangwenjianEntity> wrapper);
	
	List<GongxiangwenjianView> selectListView(@Param("ew") Wrapper<GongxiangwenjianEntity> wrapper);

	List<GongxiangwenjianView> selectListView(Pagination page,@Param("ew") Wrapper<GongxiangwenjianEntity> wrapper);
	
	GongxiangwenjianView selectView(@Param("ew") Wrapper<GongxiangwenjianEntity> wrapper);
	

}
