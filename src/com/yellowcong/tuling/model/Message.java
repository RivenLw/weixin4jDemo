package com.yellowcong.tuling.model;

import java.util.Date;
import java.util.List;

/**
 * 创建日期:2018年1月14日<br/>
 * 创建时间:上午11:32:52<br/>
 * 创建者 :yellowcong<br/>
 * 机能概要:发送的消息
 */
public class Message {

	private String code;
	
	// 文字,100000
	private String text;
	
	// 图片,200000 ,
	private String url;
	
	// 菜谱，新闻308000
	private List<Date> list;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Date> getList() {
		return list;
	}

	public void setList(List<Date> list) {
		this.list = list;
	}
}
