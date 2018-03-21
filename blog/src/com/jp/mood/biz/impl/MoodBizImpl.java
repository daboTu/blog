package com.jp.mood.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.mood.biz.MoodBiz;
import com.jp.mood.mapper.MoodMapper;
import com.jp.mood.po.MoodPo;
@Component("moodBiz")
public class MoodBizImpl implements MoodBiz{
	
	@Resource
	private MoodMapper mapper;
	
	public int addMoodPo(MoodPo po){
		return mapper.addMoodPo(po);
	}
	
	public int deleteMoodById(MoodPo po){
		return mapper.deleteMoodById(po);
	}
	
	public int updateMoodById(MoodPo po){
		return mapper.updateMoodById(po);
	}
	
	public List<MoodPo> getList(MoodPo po){
		return mapper.getList(po);
	}
	
	public int getCount(MoodPo po){
		return mapper.getCount(po);
	}

}
