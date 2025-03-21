package com.entity.model;

import com.entity.TingcheyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 停车预约
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-31 18:14:55
 */
public class TingcheyuyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 停车场地址
	 */
	
	private String tingchechangdizhi;
		
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
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 停车时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tingcheshijian;
		
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
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：停车时间
	 */
	 
	public void setTingcheshijian(Date tingcheshijian) {
		this.tingcheshijian = tingcheshijian;
	}
	
	/**
	 * 获取：停车时间
	 */
	public Date getTingcheshijian() {
		return tingcheshijian;
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
