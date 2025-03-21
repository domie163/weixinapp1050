package com.dao;

import com.entity.TingchejiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingchejiaofeiVO;
import com.entity.view.TingchejiaofeiView;


/**
 * 停车缴费
 * 
 * @author 
 * @email 
 * @date 2021-03-31 18:14:55
 */
public interface TingchejiaofeiDao extends BaseMapper<TingchejiaofeiEntity> {
	
	List<TingchejiaofeiVO> selectListVO(@Param("ew") Wrapper<TingchejiaofeiEntity> wrapper);
	
	TingchejiaofeiVO selectVO(@Param("ew") Wrapper<TingchejiaofeiEntity> wrapper);
	
	List<TingchejiaofeiView> selectListView(@Param("ew") Wrapper<TingchejiaofeiEntity> wrapper);

	List<TingchejiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<TingchejiaofeiEntity> wrapper);
	
	TingchejiaofeiView selectView(@Param("ew") Wrapper<TingchejiaofeiEntity> wrapper);
	
}
