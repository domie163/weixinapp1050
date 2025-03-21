package com.entity.vo;

import com.entity.TingchechangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 停车场
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-31 18:14:55
 */
public class TingchechangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 停车场地址
	 */
	
	private String tingchechangdizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 车位数量
	 */
	
	private Integer cheweishuliang;
		
	/**
	 * 停车费
	 */
	
	private Integer tingchefei;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 停车场介绍
	 */
	
	private String tingchechangjieshao;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：停车场地址
	 */
	 
	public void setTingchechangdizhi(String tingchechangdizhi) {
		this.tingchechangdizhi = tingchechangdizhi;
	}
	
	/**
	 * 获取：停车场地址
	 */
	public String getTingchechangdizhi() {
		return tingchechangdizhi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：车位数量
	 */
	 
	public void setCheweishuliang(Integer cheweishuliang) {
		this.cheweishuliang = cheweishuliang;
	}
	
	/**
	 * 获取：车位数量
	 */
	public Integer getCheweishuliang() {
		return cheweishuliang;
	}
				
	
	/**
	 * 设置：停车费
	 */
	 
	public void setTingchefei(Integer tingchefei) {
		this.tingchefei = tingchefei;
	}
	
	/**
	 * 获取：停车费
	 */
	public Integer getTingchefei() {
		return tingchefei;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：停车场介绍
	 */
	 
	public void setTingchechangjieshao(String tingchechangjieshao) {
		this.tingchechangjieshao = tingchechangjieshao;
	}
	
	/**
	 * 获取：停车场介绍
	 */
	public String getTingchechangjieshao() {
		return tingchechangjieshao;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
