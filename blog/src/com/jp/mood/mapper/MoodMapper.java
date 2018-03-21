package com.jp.mood.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jp.mood.po.MoodPo;

@Component("moodMapper")
public interface MoodMapper {
	
	public int addMoodPo(MoodPo po);
	
	public int deleteMoodById(MoodPo po);
	
	public int updateMoodById(MoodPo po);
	
	public List<MoodPo> getList(MoodPo po);
	
	public int getCount(MoodPo po);

}
