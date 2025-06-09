package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianzhizhaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianzhizhaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianzhizhaopinView;


/**
 * 兼职招聘评论表
 *
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public interface DiscussjianzhizhaopinService extends IService<DiscussjianzhizhaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianzhizhaopinVO> selectListVO(Wrapper<DiscussjianzhizhaopinEntity> wrapper);
   	
   	DiscussjianzhizhaopinVO selectVO(@Param("ew") Wrapper<DiscussjianzhizhaopinEntity> wrapper);
   	
   	List<DiscussjianzhizhaopinView> selectListView(Wrapper<DiscussjianzhizhaopinEntity> wrapper);
   	
   	DiscussjianzhizhaopinView selectView(@Param("ew") Wrapper<DiscussjianzhizhaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianzhizhaopinEntity> wrapper);
   	
}

