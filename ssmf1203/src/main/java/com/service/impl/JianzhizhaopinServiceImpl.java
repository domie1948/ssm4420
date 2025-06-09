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


import com.dao.JianzhizhaopinDao;
import com.entity.JianzhizhaopinEntity;
import com.service.JianzhizhaopinService;
import com.entity.vo.JianzhizhaopinVO;
import com.entity.view.JianzhizhaopinView;

@Service("jianzhizhaopinService")
public class JianzhizhaopinServiceImpl extends ServiceImpl<JianzhizhaopinDao, JianzhizhaopinEntity> implements JianzhizhaopinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianzhizhaopinEntity> page = this.selectPage(
                new Query<JianzhizhaopinEntity>(params).getPage(),
                new EntityWrapper<JianzhizhaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianzhizhaopinEntity> wrapper) {
		  Page<JianzhizhaopinView> page =new Query<JianzhizhaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianzhizhaopinVO> selectListVO(Wrapper<JianzhizhaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianzhizhaopinVO selectVO(Wrapper<JianzhizhaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianzhizhaopinView> selectListView(Wrapper<JianzhizhaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianzhizhaopinView selectView(Wrapper<JianzhizhaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
