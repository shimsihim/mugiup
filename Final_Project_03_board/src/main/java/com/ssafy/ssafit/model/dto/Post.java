package com.ssafy.ssafit.model.dto;

import io.swagger.annotations.ApiModelProperty;

public class Post {
	
	private int post_num;
	private String post_board_id;
	private String post_writer_id;
	@ApiModelProperty(hidden = true)
	private String post_writer_nickname;//DB X, dto에만 있음
	private String post_title;
	private String post_content;
	private String post_img;
	@ApiModelProperty(hidden = true)
	private int post_view_cnt;
	@ApiModelProperty(hidden = true)
	private String post_created_at;
	@ApiModelProperty(hidden = true)
	private String post_modified_at;
	
	public Post() {
	}

	public Post(int post_num, String post_board_id, String post_writer_id, String post_title, String post_content,
			String post_img, int post_view_cnt, String post_created_at, String post_modified_at) {
		super();
		this.post_num = post_num;
		this.post_board_id = post_board_id;
		this.post_writer_id = post_writer_id;
		this.post_title = post_title;
		this.post_content = post_content;
		this.post_img = post_img;
		this.post_view_cnt = post_view_cnt;
		this.post_created_at = post_created_at;
		this.post_modified_at = post_modified_at;
	}

	public int getPost_num() {
		return post_num;
	}

	public void setPost_num(int post_num) {
		this.post_num = post_num;
	}

	public String getPost_board_id() {
		return post_board_id;
	}

	public void setPost_board_id(String post_board_id) {
		this.post_board_id = post_board_id;
	}

	public String getPost_writer_id() {
		return post_writer_id;
	}

	public void setPost_writer_id(String post_writer_id) {
		this.post_writer_id = post_writer_id;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_content() {
		return post_content;
	}

	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}

	public String getPost_img() {
		return post_img;
	}

	public void setPost_img(String post_img) {
		this.post_img = post_img;
	}

	public int getPost_view_cnt() {
		return post_view_cnt;
	}

	public void setPost_view_cnt(int post_view_cnt) {
		this.post_view_cnt = post_view_cnt;
	}

	public String getPost_created_at() {
		return post_created_at;
	}

	public void setPost_created_at(String post_created_at) {
		this.post_created_at = post_created_at;
	}

	public String getPost_modified_at() {
		return post_modified_at;
	}

	public void setPost_modified_at(String post_modified_at) {
		this.post_modified_at = post_modified_at;
	}

	@Override
	public String toString() {
		return "Post [post_num=" + post_num + ", post_board_id=" + post_board_id + ", post_writer_id=" + post_writer_id
				+ ", post_title=" + post_title + ", post_content=" + post_content + ", post_img=" + post_img
				+ ", post_view_cnt=" + post_view_cnt + ", post_created_at=" + post_created_at + ", post_modified_at="
				+ post_modified_at + "]";
	}

	
	
}
