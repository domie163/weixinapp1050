package com.entity.view;

import com.entity.TingcheyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 停车预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 18:14:55
 */
@TableName("tingcheyuyue")
public class TingcheyuyueView  extends TingcheyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TingcheyuyueView(){
	}
 
 	public TingcheyuyueView(TingcheyuyueEntity tingcheyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, tingcheyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
