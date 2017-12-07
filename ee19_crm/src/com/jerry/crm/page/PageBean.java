package com.jerry.crm.page;

import java.util.List;

public class PageBean<T> {
	// ��ѡ��
	private int pageNum; // �ڼ�ҳ(��ǰҳ)
	private int pageSize; // ÿҳ��ʾ����(�̶�ֵ)
	private int totalRecord; // �ܼ�¼������ѯ���ݿ⣩--ע������

	// ������
	private int startIndex; // ��ʼ����(����)
	private int totalPage; // �ܷ�ҳ��(����)

	// ����
	private List<T> data; // ��ҳ����

	// ��̬��ʾ��
	private int start;
	private int end;

	public PageBean(int pageNum, int pageSize, int totalRecord) {
		super();
		this.pageNum=pageNum;
		this.pageSize=pageSize;
		this.totalPage=totalRecord;
		
		//����
		//1.��ʼ����
		this.startIndex=(this.pageNum-1)*pageSize;
		//2.�ܷ�ҳ��
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
