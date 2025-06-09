package com.dao;

import com.entity.ShangjiatousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangjiatousuVO;
import com.entity.view.ShangjiatousuView;


/**
 * 商家投诉
 * 
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public interface ShangjiatousuDao extends BaseMapper<ShangjiatousuEntity> {
	
	List<ShangjiatousuVO> selectListVO(@Param("ew") Wrapper<ShangjiatousuEntity> wrapper);
	
	ShangjiatousuVO selectVO(@Param("ew") Wrapper<ShangjiatousuEntity> wrapper);
	
	List<ShangjiatousuView> selectListView(@Param("ew") Wrapper<ShangjiatousuEntity> wrapper);

	List<ShangjiatousuView> selectListView(Pagination page,@Param("ew") Wrapper<ShangjiatousuEntity> wrapper);
	
	ShangjiatousuView selectView(@Param("ew") Wrapper<ShangjiatousuEntity> wrapper);
	
}
