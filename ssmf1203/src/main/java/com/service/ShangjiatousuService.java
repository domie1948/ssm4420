package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangjiatousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangjiatousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiatousuView;


/**
 * 商家投诉
 *
 * @author 
 * @email 
 * @date 2020-12-02 15:06:32
 */
public interface ShangjiatousuService extends IService<ShangjiatousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjiatousuVO> selectListVO(Wrapper<ShangjiatousuEntity> wrapper);
   	
   	ShangjiatousuVO selectVO(@Param("ew") Wrapper<ShangjiatousuEntity> wrapper);
   	
   	List<ShangjiatousuView> selectListView(Wrapper<ShangjiatousuEntity> wrapper);
   	
   	ShangjiatousuView selectView(@Param("ew") Wrapper<ShangjiatousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjiatousuEntity> wrapper);
   	
}

