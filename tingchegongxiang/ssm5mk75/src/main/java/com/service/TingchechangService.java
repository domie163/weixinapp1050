package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchechangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingchechangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingchechangView;


/**
 * 停车场
 *
 * @author 
 * @email 
 * @date 2021-03-31 18:14:55
 */
public interface TingchechangService extends IService<TingchechangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingchechangVO> selectListVO(Wrapper<TingchechangEntity> wrapper);
   	
   	TingchechangVO selectVO(@Param("ew") Wrapper<TingchechangEntity> wrapper);
   	
   	List<TingchechangView> selectListView(Wrapper<TingchechangEntity> wrapper);
   	
   	TingchechangView selectView(@Param("ew") Wrapper<TingchechangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingchechangEntity> wrapper);
   	
}

