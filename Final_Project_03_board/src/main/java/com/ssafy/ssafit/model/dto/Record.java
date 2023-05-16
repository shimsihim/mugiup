package com.ssafy.ssafit.model.dto;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Record {
	
	private int record_num;
	private String user_id;
	private Timestamp record_created_at;
	private Timestamp record_modified_at;
	private Date record_recordDate;
	private Time record_recordTime;
	private String record_title;
	private String record_content;
	
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Record(int record_num, String user_id, Timestamp record_created_at, Timestamp record_modified_at,
			Date record_recordDate, Time record_recordTime, String record_title, String record_content) {
		super();
		this.record_num = record_num;
		this.user_id = user_id;
		this.record_created_at = record_created_at;
		this.record_modified_at = record_modified_at;
		this.record_recordDate = record_recordDate;
		this.record_recordTime = record_recordTime;
		this.record_title = record_title;
		this.record_content = record_content;
	}

	public int getRecord_num() {
		return record_num;
	}

	public void setRecord_num(int record_num) {
		this.record_num = record_num;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Timestamp getRecord_created_at() {
		return record_created_at;
	}

	public void setRecord_created_at(Timestamp record_created_at) {
		this.record_created_at = record_created_at;
	}

	public Timestamp getRecord_modified_at() {
		return record_modified_at;
	}

	public void setRecord_modified_at(Timestamp record_modified_at) {
		this.record_modified_at = record_modified_at;
	}

	public Date getRecord_recordDate() {
		return record_recordDate;
	}

	public void setRecord_recordDate(Date record_recordDate) {
		this.record_recordDate = record_recordDate;
	}

	public Time getRecord_recordTime() {
		return record_recordTime;
	}

	public void setRecord_recordTime(Time record_recordTime) {
		this.record_recordTime = record_recordTime;
	}

	public String getRecord_title() {
		return record_title;
	}

	public void setRecord_title(String record_title) {
		this.record_title = record_title;
	}

	public String getRecord_content() {
		return record_content;
	}

	public void setRecord_content(String record_content) {
		this.record_content = record_content;
	}

	@Override
	public String toString() {
		return "Record [record_num=" + record_num + ", user_id=" + user_id + ", record_created_at=" + record_created_at
				+ ", record_modified_at=" + record_modified_at + ", record_recordDate=" + record_recordDate
				+ ", record_recordTime=" + record_recordTime + ", record_title=" + record_title + ", record_content="
				+ record_content + "]";
	}
	
	
}
