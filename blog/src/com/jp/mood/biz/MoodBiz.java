package com.jp.mood.biz;

import java.util.List;

import com.jp.mood.po.MoodPo;

public interface MoodBiz {
	
public int addMoodPo(MoodPo po);
	
	public int deleteMoodById(MoodPo po);
	
	public int updateMoodById(MoodPo po);
	
	public List<MoodPo> getList(MoodPo po);
	
	public int getCount(MoodPo po);

}
