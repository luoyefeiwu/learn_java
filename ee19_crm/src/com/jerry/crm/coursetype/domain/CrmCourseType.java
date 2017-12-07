package com.jerry.crm.coursetype.domain;

import java.util.HashSet;
import java.util.Set;

import com.jerry.crm.classes.domain.CrmClasses;

public class CrmCourseType {
	private String courseTypeId;
	// ����
	private Double courseCost;
	// ��ѧʱ
	private Integer total;
	// �γ��������
	private String courseName;
	// ����
	private String remark;
	// һ�Զࣺһ���γ���� ���� �� ������༶��
	private Set<CrmClasses> classesSet = new HashSet<CrmClasses>();

	// ��ѯ���� -- һ���ѯ���������ַ���
	// 1 ��ѧʱ
	private String totalStart;
	private String totalEnd;
	// 2�γ̷���
	private String courseCostStart;
	private String courseCostEnd;

	public String getTotalStart() {
		return totalStart;
	}

	public void setTotalStart(String totalStart) {
		this.totalStart = totalStart;
	}

	public String getTotalEnd() {
		return totalEnd;
	}

	public void setTotalEnd(String totalEnd) {
		this.totalEnd = totalEnd;
	}

	public String getCourseCostStart() {
		return courseCostStart;
	}

	public void setCourseCostStart(String courseCostStart) {
		this.courseCostStart = courseCostStart;
	}

	public String getCourseCostEnd() {
		return courseCostEnd;
	}

	public void setCourseCostEnd(String courseCostEnd) {
		this.courseCostEnd = courseCostEnd;
	}

	public String getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(String courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public Double getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(Double courseCost) {
		this.courseCost = courseCost;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<CrmClasses> getClassesSet() {
		return classesSet;
	}

	public void setClassesSet(Set<CrmClasses> classesSet) {
		this.classesSet = classesSet;
	}
}
