package com.entity.model;

import com.entity.TousuchuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 投诉处理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public class TousuchuliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 投诉类型
	 */
	
	private String tousuleixing;
		
	/**
	 * 处罚结果
	 */
	
	private String chufajieguo;
		
	/**
	 * 罚款金额
	 */
	
	private Integer fakuanjine;
		
	/**
	 * 处理时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chulishijian;
		
	/**
	 * 详情说明
	 */
	
	private String xiangqingshuoming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：商家名称
	 */
	 
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
				
	
	/**
	 * 设置：投诉类型
	 */
	 
	public void setTousuleixing(String tousuleixing) {
		this.tousuleixing = tousuleixing;
	}
	
	/**
	 * 获取：投诉类型
	 */
	public String getTousuleixing() {
		return tousuleixing;
	}
				
	
	/**
	 * 设置：处罚结果
	 */
	 
	public void setChufajieguo(String chufajieguo) {
		this.chufajieguo = chufajieguo;
	}
	
	/**
	 * 获取：处罚结果
	 */
	public String getChufajieguo() {
		return chufajieguo;
	}
				
	
	/**
	 * 设置：罚款金额
	 */
	 
	public void setFakuanjine(Integer fakuanjine) {
		this.fakuanjine = fakuanjine;
	}
	
	/**
	 * 获取：罚款金额
	 */
	public Integer getFakuanjine() {
		return fakuanjine;
	}
				
	
	/**
	 * 设置：处理时间
	 */
	 
	public void setChulishijian(Date chulishijian) {
		this.chulishijian = chulishijian;
	}
	
	/**
	 * 获取：处理时间
	 */
	public Date getChulishijian() {
		return chulishijian;
	}
				
	
	/**
	 * 设置：详情说明
	 */
	 
	public void setXiangqingshuoming(String xiangqingshuoming) {
		this.xiangqingshuoming = xiangqingshuoming;
	}
	
	/**
	 * 获取：详情说明
	 */
	public String getXiangqingshuoming() {
		return xiangqingshuoming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
