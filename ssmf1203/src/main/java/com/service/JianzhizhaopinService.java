package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianzhizhaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianzhizhaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianzhizhaopinView;


/**
 * 兼职招聘
 *
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public interface JianzhizhaopinService extends IService<JianzhizhaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianzhizhaopinVO> selectListVO(Wrapper<JianzhizhaopinEntity> wrapper);
   	
   	JianzhizhaopinVO selectVO(@Param("ew") Wrapper<JianzhizhaopinEntity> wrapper);
   	
   	List<JianzhizhaopinView> selectListView(Wrapper<JianzhizhaopinEntity> wrapper);
   	
   	JianzhizhaopinView selectView(@Param("ew") Wrapper<JianzhizhaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianzhizhaopinEntity> wrapper);
   	
}

