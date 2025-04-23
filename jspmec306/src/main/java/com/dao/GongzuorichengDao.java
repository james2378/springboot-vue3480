package com.dao;

import com.entity.GongzuorichengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuorichengVO;
import com.entity.view.GongzuorichengView;


/**
 * 工作日程
 * 
 * @author 
 * @email 
 * @date 2022-04-05 21:56:21
 */
public interface GongzuorichengDao extends BaseMapper<GongzuorichengEntity> {
	
	List<GongzuorichengVO> selectListVO(@Param("ew") Wrapper<GongzuorichengEntity> wrapper);
	
	GongzuorichengVO selectVO(@Param("ew") Wrapper<GongzuorichengEntity> wrapper);
	
	List<GongzuorichengView> selectListView(@Param("ew") Wrapper<GongzuorichengEntity> wrapper);

	List<GongzuorichengView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuorichengEntity> wrapper);
	
	GongzuorichengView selectView(@Param("ew") Wrapper<GongzuorichengEntity> wrapper);
	

}
