package com.dao;

import com.entity.WenjianleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjianleixingVO;
import com.entity.view.WenjianleixingView;


/**
 * 文件类型
 * 
 * @author 
 * @email 
 * @date 2022-04-05 21:56:21
 */
public interface WenjianleixingDao extends BaseMapper<WenjianleixingEntity> {
	
	List<WenjianleixingVO> selectListVO(@Param("ew") Wrapper<WenjianleixingEntity> wrapper);
	
	WenjianleixingVO selectVO(@Param("ew") Wrapper<WenjianleixingEntity> wrapper);
	
	List<WenjianleixingView> selectListView(@Param("ew") Wrapper<WenjianleixingEntity> wrapper);

	List<WenjianleixingView> selectListView(Pagination page,@Param("ew") Wrapper<WenjianleixingEntity> wrapper);
	
	WenjianleixingView selectView(@Param("ew") Wrapper<WenjianleixingEntity> wrapper);
	

}
