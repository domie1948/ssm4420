package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjianzhizhaopinDao;
import com.entity.DiscussjianzhizhaopinEntity;
import com.service.DiscussjianzhizhaopinService;
import com.entity.vo.DiscussjianzhizhaopinVO;
import com.entity.view.DiscussjianzhizhaopinView;

@Service("discussjianzhizhaopinService")
public class DiscussjianzhizhaopinServiceImpl extends ServiceImpl<DiscussjianzhizhaopinDao, DiscussjianzhizhaopinEntity> implements DiscussjianzhizhaopinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianzhizhaopinEntity> page = this.selectPage(
                new Query<DiscussjianzhizhaopinEntity>(params).getPage(),
                new EntityWrapper<DiscussjianzhizhaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianzhizhaopinEntity> wrapper) {
		  Page<DiscussjianzhizhaopinView> page =new Query<DiscussjianzhizhaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianzhizhaopinVO> selectListVO(Wrapper<DiscussjianzhizhaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianzhizhaopinVO selectVO(Wrapper<DiscussjianzhizhaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianzhizhaopinView> selectListView(Wrapper<DiscussjianzhizhaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianzhizhaopinView selectView(Wrapper<DiscussjianzhizhaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
