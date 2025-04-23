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


import com.dao.WenjianleixingDao;
import com.entity.WenjianleixingEntity;
import com.service.WenjianleixingService;
import com.entity.vo.WenjianleixingVO;
import com.entity.view.WenjianleixingView;

@Service("wenjianleixingService")
public class WenjianleixingServiceImpl extends ServiceImpl<WenjianleixingDao, WenjianleixingEntity> implements WenjianleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjianleixingEntity> page = this.selectPage(
                new Query<WenjianleixingEntity>(params).getPage(),
                new EntityWrapper<WenjianleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjianleixingEntity> wrapper) {
		  Page<WenjianleixingView> page =new Query<WenjianleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjianleixingVO> selectListVO(Wrapper<WenjianleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjianleixingVO selectVO(Wrapper<WenjianleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjianleixingView> selectListView(Wrapper<WenjianleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjianleixingView selectView(Wrapper<WenjianleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
