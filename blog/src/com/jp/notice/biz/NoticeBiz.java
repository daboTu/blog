package com.jp.notice.biz;

import java.util.List;

import com.jp.notice.po.NoticePo;

public interface NoticeBiz {
	
	public int addNoticePo(NoticePo po);
	
	public int deleteNoticeById(NoticePo po);
	
	public List<NoticePo> getNoticeList(NoticePo po);
	
	public int updateNoticePoById(NoticePo po);
	
	public int getCount(NoticePo po);

}
