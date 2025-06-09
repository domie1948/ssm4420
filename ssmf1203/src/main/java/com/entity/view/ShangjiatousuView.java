package com.entity.view;

import com.entity.ShangjiatousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商家投诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
@TableName("shangjiatousu")
public class ShangjiatousuView  extends ShangjiatousuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangjiatousuView(){
	}
 
 	public ShangjiatousuView(ShangjiatousuEntity shangjiatousuEntity){
 	try {
			BeanUtils.copyProperties(this, shangjiatousuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
