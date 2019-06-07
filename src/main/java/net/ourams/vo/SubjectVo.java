package net.ourams.vo;

import java.util.List;

public class SubjectVo {

	private int subjectNo;
	private String subjectTitle;
	private int courseNo;
	private int scheduleNo;
	private String startDate;
	private String endDate;
	private List<AssignmentVo> assignmentListBySub;

	public SubjectVo() {
	}

	public SubjectVo(int subjectNo, String subjectTitle, int courseNo, int scheduleNo) {
		this.subjectNo = subjectNo;
		this.subjectTitle = subjectTitle;
		this.courseNo = courseNo;
		this.scheduleNo = scheduleNo;
	}

	public SubjectVo(int subjectNo, String subjectTitle, int courseNo, int scheduleNo, String startDate,
			String endDate) {
		this.subjectNo = subjectNo;
		this.subjectTitle = subjectTitle;
		this.courseNo = courseNo;
		this.scheduleNo = scheduleNo;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(int subjectNo) {
		this.subjectNo = subjectNo;
	}

	public String getSubjectTitle() {
		return subjectTitle;
	}

	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}

	public int getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}

	public int getScheduleNo() {
		return scheduleNo;
	}

	public void setScheduleNo(int scheduleNo) {
		this.scheduleNo = scheduleNo;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<AssignmentVo> getAssignmentListBySub() {
		return assignmentListBySub;
	}

	public void setAssignmentListBySub(List<AssignmentVo> assignmentListBySub) {
		this.assignmentListBySub = assignmentListBySub;
	}

	@Override
	public String toString() {
		return "SubjectVo [subjectNo=" + subjectNo + ", subjectTitle=" + subjectTitle + ", courseNo=" + courseNo
				+ ", scheduleNo=" + scheduleNo + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", assignmentListBySub=" + assignmentListBySub + "]";
	}

}
