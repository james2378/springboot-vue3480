package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjianleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjianleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjianleixingView;


/**
 * 文件类型
 *
 * @author 
 * @email 
 * @date 2022-04-05 21:56:21
 */
public interface WenjianleixingService extends IService<WenjianleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjianleixingVO> selectListVO(Wrapper<WenjianleixingEntity> wrapper);
   	
   	WenjianleixingVO selectVO(@Param("ew") Wrapper<WenjianleixingEntity> wrapper);
   	
   	List<WenjianleixingView> selectListView(Wrapper<WenjianleixingEntity> wrapper);
   	
   	WenjianleixingView selectView(@Param("ew") Wrapper<WenjianleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjianleixingEntity> wrapper);
   	

}

