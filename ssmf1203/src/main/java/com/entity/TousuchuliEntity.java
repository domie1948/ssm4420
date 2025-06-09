package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 投诉处理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
@TableName("tousuchuli")
public class TousuchuliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TousuchuliEntity() {
		
	}
	
	public TousuchuliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商家账号
	 */
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
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
