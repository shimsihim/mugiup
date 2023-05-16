package com.ssafy.ssafit.model.dto;

import java.sql.Timestamp;

public class Comment {
	private int comment_num;
	private int post_num;
	private String comment_writer_id;
	private String comment_content;
	private String user_nickname;
	private Timestamp comment_created_at;
	private Timestamp comment_modified_at;

	public Comment() {
	}

	public Comment(int comment_num, int post_num, String comment_writer_id, String comment_content,
			Timestamp comment_created_at, Timestamp comment_modified_at,String user_nickname) {
		super();
		this.comment_num = comment_num;
		this.post_num = post_num;
		this.comment_writer_id = comment_writer_id;
		this.comment_content = comment_content;
		this.comment_created_at = comment_created_at;
		this.comment_modified_at = comment_modified_at;
		this.user_nickname = user_nickname;
	}

	public String getUser_nickname() {
		return user_nickname;
	}
	
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public int getComment_num() {
		return comment_num;
	}

	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
	}

	public int getPost_num() {
		return post_num;
	}

	public void setPost_num(int post_num) {
		this.post_num = post_num;
	}

	public String getComment_writer_id() {
		return comment_writer_id;
	}

	public void setComment_writer_id(String comment_writer_id) {
		this.comment_writer_id = comment_writer_id;
	}

	public String getComment_content() {
		return comment_content;
	}

	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}

	public Timestamp getComment_created_at() {
		return comment_created_at;
	}

	public void setComment_created_at(Timestamp comment_created_at) {
		this.comment_created_at = comment_created_at;
	}
	
	

	public Timestamp getComment_modified_at() {
		return comment_modified_at;
	}

	public void setComment_modified_at(Timestamp comment_modified_at) {
		this.comment_modified_at = comment_modified_at;
	}

	@Override
	public String toString() {
		return "Comment [comment_num=" + comment_num + ", post_num=" + post_num + ", comment_writer_id="
				+ comment_writer_id + ", comment_content=" + comment_content + ", user_nickname=" + user_nickname
				+ ", comment_created_at=" + comment_created_at + ", comment_modified_at=" + comment_modified_at + "]";
	}

	


}
