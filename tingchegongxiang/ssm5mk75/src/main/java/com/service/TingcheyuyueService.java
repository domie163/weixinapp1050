package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingcheyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingcheyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingcheyuyueView;


/**
 * 停车预约
 *
 * @author 
 * @email 
 * @date 2021-03-31 18:14:55
 */
public interface TingcheyuyueService extends IService<TingcheyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingcheyuyueVO> selectListVO(Wrapper<TingcheyuyueEntity> wrapper);
   	
   	TingcheyuyueVO selectVO(@Param("ew") Wrapper<TingcheyuyueEntity> wrapper);
   	
   	List<TingcheyuyueView> selectListView(Wrapper<TingcheyuyueEntity> wrapper);
   	
   	TingcheyuyueView selectView(@Param("ew") Wrapper<TingcheyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingcheyuyueEntity> wrapper);
   	
}

