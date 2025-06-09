package com.dao;

import com.entity.DiscussjianzhizhaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianzhizhaopinVO;
import com.entity.view.DiscussjianzhizhaopinView;


/**
 * 兼职招聘评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public interface DiscussjianzhizhaopinDao extends BaseMapper<DiscussjianzhizhaopinEntity> {
	
	List<DiscussjianzhizhaopinVO> selectListVO(@Param("ew") Wrapper<DiscussjianzhizhaopinEntity> wrapper);
	
	DiscussjianzhizhaopinVO selectVO(@Param("ew") Wrapper<DiscussjianzhizhaopinEntity> wrapper);
	
	List<DiscussjianzhizhaopinView> selectListView(@Param("ew") Wrapper<DiscussjianzhizhaopinEntity> wrapper);

	List<DiscussjianzhizhaopinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianzhizhaopinEntity> wrapper);
	
	DiscussjianzhizhaopinView selectView(@Param("ew") Wrapper<DiscussjianzhizhaopinEntity> wrapper);
	
}
