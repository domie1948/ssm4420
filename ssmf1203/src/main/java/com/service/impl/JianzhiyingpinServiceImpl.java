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


import com.dao.JianzhiyingpinDao;
import com.entity.JianzhiyingpinEntity;
import com.service.JianzhiyingpinService;
import com.entity.vo.JianzhiyingpinVO;
import com.entity.view.JianzhiyingpinView;

@Service("jianzhiyingpinService")
public class JianzhiyingpinServiceImpl extends ServiceImpl<JianzhiyingpinDao, JianzhiyingpinEntity> implements JianzhiyingpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianzhiyingpinEntity> page = this.selectPage(
                new Query<JianzhiyingpinEntity>(params).getPage(),
                new EntityWrapper<JianzhiyingpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianzhiyingpinEntity> wrapper) {
		  Page<JianzhiyingpinView> page =new Query<JianzhiyingpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianzhiyingpinVO> selectListVO(Wrapper<JianzhiyingpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianzhiyingpinVO selectVO(Wrapper<JianzhiyingpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianzhiyingpinView> selectListView(Wrapper<JianzhiyingpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianzhiyingpinView selectView(Wrapper<JianzhiyingpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
