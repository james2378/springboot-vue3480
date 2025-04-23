package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongxiangwenjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongxiangwenjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongxiangwenjianView;


/**
 * 共享文件
 *
 * @author 
 * @email 
 * @date 2022-04-05 21:56:21
 */
public interface GongxiangwenjianService extends IService<GongxiangwenjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongxiangwenjianVO> selectListVO(Wrapper<GongxiangwenjianEntity> wrapper);
   	
   	GongxiangwenjianVO selectVO(@Param("ew") Wrapper<GongxiangwenjianEntity> wrapper);
   	
   	List<GongxiangwenjianView> selectListView(Wrapper<GongxiangwenjianEntity> wrapper);
   	
   	GongxiangwenjianView selectView(@Param("ew") Wrapper<GongxiangwenjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongxiangwenjianEntity> wrapper);
   	

}

