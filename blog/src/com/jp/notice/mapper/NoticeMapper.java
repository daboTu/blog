package com.jp.notice.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jp.notice.po.NoticePo;

@Component("noticeMapper")
public interface NoticeMapper {

	public int addNoticePo(NoticePo po);
	
	public int deleteNoticeById(NoticePo po);
	
	public List<NoticePo> getNoticeList(NoticePo po);
	
	public int updateNoticePoById(NoticePo po);
	
	public int getCount(NoticePo po);
		
		
}
