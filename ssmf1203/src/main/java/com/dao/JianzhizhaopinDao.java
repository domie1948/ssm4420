package com.dao;

import com.entity.JianzhizhaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianzhizhaopinVO;
import com.entity.view.JianzhizhaopinView;


/**
 * 兼职招聘
 * 
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public interface JianzhizhaopinDao extends BaseMapper<JianzhizhaopinEntity> {
	
	List<JianzhizhaopinVO> selectListVO(@Param("ew") Wrapper<JianzhizhaopinEntity> wrapper);
	
	JianzhizhaopinVO selectVO(@Param("ew") Wrapper<JianzhizhaopinEntity> wrapper);
	
	List<JianzhizhaopinView> selectListView(@Param("ew") Wrapper<JianzhizhaopinEntity> wrapper);

	List<JianzhizhaopinView> selectListView(Pagination page,@Param("ew") Wrapper<JianzhizhaopinEntity> wrapper);
	
	JianzhizhaopinView selectView(@Param("ew") Wrapper<JianzhizhaopinEntity> wrapper);
	
}
