package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongxiangwenjianDao;
import com.entity.GongxiangwenjianEntity;
import com.service.GongxiangwenjianService;
import com.entity.vo.GongxiangwenjianVO;
import com.entity.view.GongxiangwenjianView;

@Service("gongxiangwenjianService")
public class GongxiangwenjianServiceImpl extends ServiceImpl<GongxiangwenjianDao, GongxiangwenjianEntity> implements GongxiangwenjianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongxiangwenjianEntity> page = this.selectPage(
                new Query<GongxiangwenjianEntity>(params).getPage(),
                new EntityWrapper<GongxiangwenjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongxiangwenjianEntity> wrapper) {
		  Page<GongxiangwenjianView> page =new Query<GongxiangwenjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongxiangwenjianVO> selectListVO(Wrapper<GongxiangwenjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongxiangwenjianVO selectVO(Wrapper<GongxiangwenjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongxiangwenjianView> selectListView(Wrapper<GongxiangwenjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongxiangwenjianView selectView(Wrapper<GongxiangwenjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
