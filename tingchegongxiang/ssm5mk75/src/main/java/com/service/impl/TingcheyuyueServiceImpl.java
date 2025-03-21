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


import com.dao.TingcheyuyueDao;
import com.entity.TingcheyuyueEntity;
import com.service.TingcheyuyueService;
import com.entity.vo.TingcheyuyueVO;
import com.entity.view.TingcheyuyueView;

@Service("tingcheyuyueService")
public class TingcheyuyueServiceImpl extends ServiceImpl<TingcheyuyueDao, TingcheyuyueEntity> implements TingcheyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingcheyuyueEntity> page = this.selectPage(
                new Query<TingcheyuyueEntity>(params).getPage(),
                new EntityWrapper<TingcheyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingcheyuyueEntity> wrapper) {
		  Page<TingcheyuyueView> page =new Query<TingcheyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingcheyuyueVO> selectListVO(Wrapper<TingcheyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingcheyuyueVO selectVO(Wrapper<TingcheyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingcheyuyueView> selectListView(Wrapper<TingcheyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingcheyuyueView selectView(Wrapper<TingcheyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
