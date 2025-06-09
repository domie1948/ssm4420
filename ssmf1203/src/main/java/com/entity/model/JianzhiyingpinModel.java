package com.entity.model;

import com.entity.JianzhiyingpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 兼职应聘
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public class JianzhiyingpinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 兼职岗位
	 */
	
	private String jianzhigangwei;
		
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
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 应聘时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yingpinshijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：应聘时间
	 */
	 
	public void setYingpinshijian(Date yingpinshijian) {
		this.yingpinshijian = yingpinshijian;
	}
	
	/**
	 * 获取：应聘时间
	 */
	public Date getYingpinshijian() {
		return yingpinshijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
