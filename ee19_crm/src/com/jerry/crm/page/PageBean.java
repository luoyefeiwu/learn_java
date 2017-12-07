package com.jerry.crm.page;

import java.util.List;

public class PageBean<T> {
	// 必选项
	private int pageNum; // 第几页(当前页)
	private int pageSize; // 每页显示个数(固定值)
	private int totalRecord; // 总记录数（查询数据库）--注意条件

	// 计算项
	private int startIndex; // 开始索引(计算)
	private int totalPage; // 总分页数(计算)

	// 数据
	private List<T> data; // 分页数据

	// 动态显示条
	private int start;
	private int end;

	public PageBean(int pageNum, int pageSize, int totalRecord) {
		super();
		this.pageNum=pageNum;
		this.pageSize=pageSize;
		this.totalPage=totalRecord;
		
		//计算
		//1.开始索引
		this.startIndex=(this.pageNum-1)*pageSize;
		//2.总分页数
		this.totalPage=(this.totalPage+this.pageSize-1)/pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

}
