package com.entity.model;

import com.entity.JianzhizhaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 兼职招聘
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public class JianzhizhaopinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 招聘标题
	 */
	
	private String zhaopinbiaoti;
		
	/**
	 * 兼职岗位
	 */
	
	private String jianzhigangwei;
		
	/**
	 * 招聘人数
	 */
	
	private Integer zhaopinrenshu;
		
	/**
	 * 岗位薪酬
	 */
	
	private String gangweixinchou;
		
	/**
	 * 工作天数
	 */
	
	private String gongzuotianshu;
		
	/**
	 * 工作时长
	 */
	
	private String gongzuoshizhang;
		
	/**
	 * 商家规模
	 */
	
	private String shangjiaguimo;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 商家地址
	 */
	
	private String shangjiadizhi;
		
	/**
	 * 招聘封面
	 */
	
	private String zhaopinfengmian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 招聘详情
	 */
	
	private String zhaopinxiangqing;
				
	
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
	 * 设置：招聘标题
	 */
	 
	public void setZhaopinbiaoti(String zhaopinbiaoti) {
		this.zhaopinbiaoti = zhaopinbiaoti;
	}
	
	/**
	 * 获取：招聘标题
	 */
	public String getZhaopinbiaoti() {
		return zhaopinbiaoti;
	}
				
	
	/**
	 * 设置：兼职岗位
	 */
	 
	public void setJianzhigangwei(String jianzhigangwei) {
		this.jianzhigangwei = jianzhigangwei;
	}
	
	/**
	 * 获取：兼职岗位
	 */
	public String getJianzhigangwei() {
		return jianzhigangwei;
	}
				
	
	/**
	 * 设置：招聘人数
	 */
	 
	public void setZhaopinrenshu(Integer zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	
	/**
	 * 获取：招聘人数
	 */
	public Integer getZhaopinrenshu() {
		return zhaopinrenshu;
	}
				
	
	/**
	 * 设置：岗位薪酬
	 */
	 
	public void setGangweixinchou(String gangweixinchou) {
		this.gangweixinchou = gangweixinchou;
	}
	
	/**
	 * 获取：岗位薪酬
	 */
	public String getGangweixinchou() {
		return gangweixinchou;
	}
				
	
	/**
	 * 设置：工作天数
	 */
	 
	public void setGongzuotianshu(String gongzuotianshu) {
		this.gongzuotianshu = gongzuotianshu;
	}
	
	/**
	 * 获取：工作天数
	 */
	public String getGongzuotianshu() {
		return gongzuotianshu;
	}
				
	
	/**
	 * 设置：工作时长
	 */
	 
	public void setGongzuoshizhang(String gongzuoshizhang) {
		this.gongzuoshizhang = gongzuoshizhang;
	}
	
	/**
	 * 获取：工作时长
	 */
	public String getGongzuoshizhang() {
		return gongzuoshizhang;
	}
				
	
	/**
	 * 设置：商家规模
	 */
	 
	public void setShangjiaguimo(String shangjiaguimo) {
		this.shangjiaguimo = shangjiaguimo;
	}
	
	/**
	 * 获取：商家规模
	 */
	public String getShangjiaguimo() {
		return shangjiaguimo;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：商家地址
	 */
	 
	public void setShangjiadizhi(String shangjiadizhi) {
		this.shangjiadizhi = shangjiadizhi;
	}
	
	/**
	 * 获取：商家地址
	 */
	public String getShangjiadizhi() {
		return shangjiadizhi;
	}
				
	
	/**
	 * 设置：招聘封面
	 */
	 
	public void setZhaopinfengmian(String zhaopinfengmian) {
		this.zhaopinfengmian = zhaopinfengmian;
	}
	
	/**
	 * 获取：招聘封面
	 */
	public String getZhaopinfengmian() {
		return zhaopinfengmian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：招聘详情
	 */
	 
	public void setZhaopinxiangqing(String zhaopinxiangqing) {
		this.zhaopinxiangqing = zhaopinxiangqing;
	}
	
	/**
	 * 获取：招聘详情
	 */
	public String getZhaopinxiangqing() {
		return zhaopinxiangqing;
	}
			
}
