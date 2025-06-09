package com.dao;

import com.entity.TousuchuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousuchuliVO;
import com.entity.view.TousuchuliView;


/**
 * 投诉处理
 * 
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public interface TousuchuliDao extends BaseMapper<TousuchuliEntity> {
	
	List<TousuchuliVO> selectListVO(@Param("ew") Wrapper<TousuchuliEntity> wrapper);
	
	TousuchuliVO selectVO(@Param("ew") Wrapper<TousuchuliEntity> wrapper);
	
	List<TousuchuliView> selectListView(@Param("ew") Wrapper<TousuchuliEntity> wrapper);

	List<TousuchuliView> selectListView(Pagination page,@Param("ew") Wrapper<TousuchuliEntity> wrapper);
	
	TousuchuliView selectView(@Param("ew") Wrapper<TousuchuliEntity> wrapper);
	
}
