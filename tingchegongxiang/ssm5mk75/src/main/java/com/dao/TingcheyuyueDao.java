package com.dao;

import com.entity.TingcheyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingcheyuyueVO;
import com.entity.view.TingcheyuyueView;


/**
 * 停车预约
 * 
 * @author 
 * @email 
 * @date 2021-03-31 18:14:55
 */
public interface TingcheyuyueDao extends BaseMapper<TingcheyuyueEntity> {
	
	List<TingcheyuyueVO> selectListVO(@Param("ew") Wrapper<TingcheyuyueEntity> wrapper);
	
	TingcheyuyueVO selectVO(@Param("ew") Wrapper<TingcheyuyueEntity> wrapper);
	
	List<TingcheyuyueView> selectListView(@Param("ew") Wrapper<TingcheyuyueEntity> wrapper);

	List<TingcheyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<TingcheyuyueEntity> wrapper);
	
	TingcheyuyueView selectView(@Param("ew") Wrapper<TingcheyuyueEntity> wrapper);
	
}
