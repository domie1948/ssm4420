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


import com.dao.ShangjiatousuDao;
import com.entity.ShangjiatousuEntity;
import com.service.ShangjiatousuService;
import com.entity.vo.ShangjiatousuVO;
import com.entity.view.ShangjiatousuView;

@Service("shangjiatousuService")
public class ShangjiatousuServiceImpl extends ServiceImpl<ShangjiatousuDao, ShangjiatousuEntity> implements ShangjiatousuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangjiatousuEntity> page = this.selectPage(
                new Query<ShangjiatousuEntity>(params).getPage(),
                new EntityWrapper<ShangjiatousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangjiatousuEntity> wrapper) {
		  Page<ShangjiatousuView> page =new Query<ShangjiatousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangjiatousuVO> selectListVO(Wrapper<ShangjiatousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangjiatousuVO selectVO(Wrapper<ShangjiatousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangjiatousuView> selectListView(Wrapper<ShangjiatousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangjiatousuView selectView(Wrapper<ShangjiatousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
