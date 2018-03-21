package com.jp.notice.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jp.notice.biz.NoticeBiz;
import com.jp.notice.mapper.NoticeMapper;
import com.jp.notice.po.NoticePo;
@Component("noticeBiz")
public class NoticeBizImpl implements NoticeBiz{
	
	@Resource
	private NoticeMapper noticeMapper;
	
	public int addNoticePo(NoticePo po){
		return noticeMapper.addNoticePo(po);
	}
	
	public int deleteNoticeById(NoticePo po){
		return noticeMapper.deleteNoticeById(po);
	}
	
	public List<NoticePo> getNoticeList(NoticePo po){
		return noticeMapper.getNoticeList(po);
	}
	
	public int updateNoticePoById(NoticePo po){
		return noticeMapper.updateNoticePoById(po);
	}
	
	public int getCount(NoticePo po){
		return noticeMapper.getCount(po);
	}

}
